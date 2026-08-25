package patcher;

import javassist.*;
import javassist.expr.*;
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

            System.out.println("[MatrixCore Patcher] Bytecode instrumentation completed successfully!");
        } catch (Exception e) {
            System.err.println("[MatrixCore Patcher] Patching failed with error:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
