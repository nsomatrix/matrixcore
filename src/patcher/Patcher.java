package patcher;

import javassist.*;
import java.io.File;

/**
 * Javassist Bytecode Instrumentation Patcher for MatrixCore.
 *
 * Customize this class to inject mod hooks into your target J2ME JAR application.
 */
public class Patcher {

    public static void main(String[] args) {
        String inputJarPath = args.length > 0 ? args[0] : "input/target_game.jar";
        String modBuildPath = args.length > 1 ? args[1] : "build_output/mod_classes";
        String outputPath   = args.length > 2 ? args[2] : "build_output/patched_classes";

        File jarFile = new File(inputJarPath);
        if (!jarFile.exists()) {
            System.err.println("[MatrixCore Patcher] Target JAR file not found at: " + inputJarPath);
            System.err.println("[MatrixCore Patcher] Place your target .jar file into input/ and pass its name to build.sh");
            System.exit(1);
        }

        try {
            System.out.println("[MatrixCore Patcher] Loading bytecode workspace for: " + jarFile.getName());
            ClassPool pool = ClassPool.getDefault();
            pool.insertClassPath(inputJarPath);
            pool.insertClassPath("lib/midpapi20.jar");
            pool.insertClassPath("lib/cldcapi11.jar");
            pool.insertClassPath(modBuildPath);

            System.out.println("[MatrixCore Patcher] Instrumenting bytecode (Target dir: " + outputPath + ")...");

            // Hook game startup in MIDlet (bs.class)
            CtClass midletClass = pool.get("bs");
            CtMethod startAppMethod = midletClass.getDeclaredMethod("startApp");
            startAppMethod.insertBefore("{ mod.MatrixAPI.init(); }");
            midletClass.writeFile(outputPath);
            System.out.println("[MatrixCore Patcher] Successfully hooked bs.startApp() -> mod.MatrixAPI.init()");

            // Hook Font Renderer (fg.class) to sanitize all rendered text on screen
            try {
                CtClass fontClass = pool.get("fg");
                CtMethod[] methods = fontClass.getDeclaredMethods();
                int hookedCount = 0;
                for (int i = 0; i < methods.length; i++) {
                    CtMethod m = methods[i];
                    if ("a".equals(m.getName())) {
                        CtClass[] params = m.getParameterTypes();
                        if (params.length >= 2 && "java.lang.String".equals(params[1].getName())) {
                            m.insertBefore("{ $2 = mod.MatrixAPI.sanitizeText($2); }");
                            hookedCount++;
                        }
                    }
                }
                fontClass.writeFile(outputPath);
                System.out.println("[MatrixCore Patcher] Successfully hooked " + hookedCount + " text drawing methods in fg.class -> mod.MatrixAPI.sanitizeText()");
            } catch (Exception fontEx) {
                System.err.println("[MatrixCore Patcher] Warning: Could not hook fg.class: " + fontEx.getMessage());
            }

            // Hook Popup Notice Dialog (bq.class)
            try {
                CtClass bqClass = pool.get("bq");
                CtMethod noticeMethod = bqClass.getDeclaredMethod("a", new CtClass[]{ pool.get("java.lang.String") });
                noticeMethod.insertBefore("{ $1 = mod.MatrixAPI.transformNoticeText($1); }");
                bqClass.writeFile(outputPath);
                System.out.println("[MatrixCore Patcher] Successfully hooked bq.a(String) -> mod.MatrixAPI.transformNoticeText()");
            } catch (Exception bqEx) {
                System.err.println("[MatrixCore Patcher] Warning: Could not hook bq.a: " + bqEx.getMessage());
            }

            // Hook Top Ticker Banner (bx.class)
            try {
                CtClass bxClass = pool.get("bx");
                CtMethod tickerMethod = bxClass.getDeclaredMethod("a", new CtClass[]{ pool.get("java.lang.String"), pool.get("int"), pool.get("fg") });
                tickerMethod.insertBefore("{ $1 = mod.MatrixAPI.transformNoticeText($1); }");
                bxClass.writeFile(outputPath);
                System.out.println("[MatrixCore Patcher] Successfully hooked bx.a(String, int, fg) -> mod.MatrixAPI.transformNoticeText()");
            } catch (Exception bxEx) {
                System.err.println("[MatrixCore Patcher] Warning: Could not hook bx.a: " + bxEx.getMessage());
            }

            // Bypass Initial Bootscreen & Logo PNG Animation (dj.class) -> Instant transition to Login Window
            try {
                CtClass djClass = pool.get("dj");
                CtMethod djMethod = djClass.getDeclaredMethod("a", new CtClass[0]);
                djMethod.setBody("{ bq.J = null; bs.c(); dv.a(); bq.b(); mod.MatrixAPI.loadCustomLogo(); bq.G.c(); }");
                djClass.writeFile(outputPath);
                System.out.println("[MatrixCore Patcher] Successfully bypassed bootscreen (dj.class) -> Direct to Login Screen!");
            } catch (Exception djEx) {
                System.err.println("[MatrixCore Patcher] Warning: Could not bypass bootscreen: " + djEx.getMessage());
            }

            // Hook Login Screen (eg.class) to add dynamic Language Toggle Softkey
            try {
                CtClass egClass = pool.get("eg");
                CtMethod egInitMethod = egClass.getDeclaredMethod("c", new CtClass[0]);
                egInitMethod.insertAfter("{ this.cq = new au(fa.a == 0 ? \"English\" : \"Tiếng Việt\", this, 9998, null); }");

                CtMethod egActionMethod = egClass.getDeclaredMethod("a", new CtClass[]{ pool.get("int"), pool.get("java.lang.Object") });
                egActionMethod.insertBefore("if ($1 == 9998) { mod.MatrixAPI.toggleLanguage(); if (this.cq != null) { this.cq.a = (fa.a == 0 ? \"English\" : \"Tiếng Việt\"); } bq.G.c(); return; }");
                egClass.writeFile(outputPath);
                System.out.println("[MatrixCore Patcher] Successfully hooked Login Screen (eg.class) with dynamic Language Toggle!");
            } catch (Exception langEx) {
                System.err.println("[MatrixCore Patcher] Warning: Could not hook Language Toggle: " + langEx.getMessage());
            }

            // Hook Incoming PM Commands Handler (at.class -> c(String, String))
            try {
                CtClass atClass = pool.get("at");
                CtMethod cMethod = atClass.getDeclaredMethod("c", new CtClass[]{ pool.get("java.lang.String"), pool.get("java.lang.String") });
                cMethod.insertBefore("if (mod.MatrixAPI.handleChatCommand($1, $2)) { return; }");
                atClass.writeFile(outputPath);
                System.out.println("[MatrixCore Patcher] Successfully hooked Incoming PM Commands in at.c(String, String) -> mod.MatrixAPI.handleChatCommand()");
            } catch (Exception atEx) {
                System.err.println("[MatrixCore Patcher] Warning: Could not hook at.c: " + atEx.getMessage());
            }

            // Hook Local Chat Entry Handler (bt.class -> a(String, String))
            try {
                CtClass btClass = pool.get("bt");
                CtMethod chatMethod = btClass.getDeclaredMethod("a", new CtClass[]{ pool.get("java.lang.String"), pool.get("java.lang.String") });
                chatMethod.insertBefore("if (mod.MatrixAPI.handleChatCommand(null, $2)) { return; }");
                btClass.writeFile(outputPath);
                System.out.println("[MatrixCore Patcher] Successfully hooked Local Chat Commands in bt.a(String, String) -> mod.MatrixAPI.handleChatCommand()");
            } catch (Exception btEx) {
                System.err.println("[MatrixCore Patcher] Warning: Could not hook bt.a: " + btEx.getMessage());
            }

            System.out.println("[MatrixCore Patcher] Bytecode instrumentation completed successfully!");
        } catch (Exception e) {
            System.err.println("[MatrixCore Patcher] Patching failed with error:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
