package mod;

import mod.ui.MatrixUI;
import mod.net.MatrixNet;
import mod.log.MatrixLogger;

/**
 * Central Facade & Entrypoint for Bytecode Hooks in MatrixCore Modding Framework.
 */
public class MatrixAPI {

    public static final String MOD_VERSION = "MatrixCore v1.0";
    private static boolean initialized = false;

    /**
     * Initializes the mod framework when the game launches.
     */
    public static void init() {
        if (!initialized) {
            initialized = true;
            MatrixLogger.info("⚡ [MatrixCore] Mod Framework Initialized (" + MOD_VERSION + ")");
            cleanServerNames();
            loadCustomLogo();
        }
    }

    /**
     * Loads the custom MatrixCore logo PNG from /matrix_logo.png into cr.a via reflection
     */
    public static void loadCustomLogo() {
        try {
            java.io.InputStream is = "".getClass().getResourceAsStream("/matrix_logo.png");
            if (is != null) {
                javax.microedition.lcdui.Image logo = javax.microedition.lcdui.Image.createImage(is);
                if (logo != null) {
                    try {
                        Class crClass = Class.forName("cr");
                        java.lang.reflect.Field field = crClass.getField("a");
                        field.set(null, logo);
                        MatrixLogger.info("⚡ [MatrixCore] Custom logo loaded (" + logo.getWidth() + "x" + logo.getHeight() + ")");
                    } catch (Throwable refErr) {
                        MatrixLogger.error("Failed reflection set cr.a", refErr);
                    }
                }
                is.close();
            }
        } catch (Throwable t) {
            MatrixLogger.error("Failed to load /matrix_logo.png", t);
        }
    }

    /**
     * Dynamically toggles game language via reflection between Vietnamese (0) and English (1).
     */
    public static void toggleLanguage() {
        try {
            Class faClass = Class.forName("fa");
            java.lang.reflect.Field field = faClass.getField("a");
            int currentLang = field.getInt(null);
            int newLang = (currentLang == 0) ? 1 : 0;
            
            java.lang.reflect.Method m = faClass.getMethod("a", new Class[]{ int.class });
            m.invoke(null, new Object[]{ Integer.valueOf(newLang) });
            MatrixLogger.info("⚡ [MatrixCore] Language toggled to: " + (newLang == 1 ? "English" : "Tiếng Việt"));
        } catch (Throwable t) {
            MatrixLogger.error("Failed to toggle language", t);
        }
    }

    /**
     * Dynamically switches game language via reflection:
     * 0 = Vietnamese (Tiếng Việt) - Default
     * 1 = English
     */
    public static void setLanguage(int lang) {
        try {
            Class faClass = Class.forName("fa");
            java.lang.reflect.Method m = faClass.getMethod("a", new Class[]{ int.class });
            m.invoke(null, new Object[]{ Integer.valueOf(lang) });
            MatrixLogger.info("⚡ [MatrixCore] Language switched to: " + (lang == 1 ? "English" : "Tiếng Việt"));
        } catch (Throwable t) {
            MatrixLogger.error("Failed to switch language to " + lang, t);
        }
    }

    /**
     * Sanitizes strings rendered by the game font engine or UI components,
     * replacing legacy branding (e.g. Nicknso, Nicknsonet, Havan) with MatrixCore.
     */
    public static String sanitizeText(String text) {
        if (text == null || text.length() == 0) {
            return text;
        }
        
        String lower = text.toLowerCase();
        if (lower.indexOf("nick") >= 0 || lower.indexOf("havan") >= 0) {
            text = replaceIgnoreCase(text, "nicknsonet", "MatrixCore");
            text = replaceIgnoreCase(text, "nicknso.net", "MatrixCore");
            text = replaceIgnoreCase(text, "nicknso", "MatrixCore");
            text = replaceIgnoreCase(text, "havan", "MatrixCore");
        }
        return text;
    }

    private static String replaceIgnoreCase(String src, String target, String replacement) {
        if (src == null || target == null || replacement == null) return src;
        int idx = src.toLowerCase().indexOf(target.toLowerCase());
        if (idx >= 0) {
            return src.substring(0, idx) + replacement + src.substring(idx + target.length());
        }
        return src;
    }

    public static void cleanServerNames() {
        try {
            Class bsClass = Class.forName("bs");
            java.lang.reflect.Field fField = bsClass.getDeclaredField("f");
            fField.setAccessible(true);
            String[] f = (String[]) fField.get(null);
            if (f != null && f.length > 0) {
                for (int i = 0; i < f.length; i++) {
                    if (f[i] != null && f[i].toLowerCase().indexOf("nick") >= 0) {
                        f[i] = "MatrixCore";
                    }
                }
            }
        } catch (Throwable t) {
            // Ignore
        }
    }

    /**
     * Hook called when a menu is built.
     * Can be invoked from bytecode to append custom menu items.
     *
     * @param menuVector The game's menu item vector object
     */
    public static void addMatrixMenuItem(Object menuVector) {
        MatrixUI.addMenuItem(menuVector, "⚡ MatrixCore API", 999100);
    }

    /**
     * Hook called when a command is executed in game.
     *
     * @param commandId The integer ID of the executed command
     * @param obj Additional parameter context object
     * @return true if command was handled by MatrixCore and should suppress native execution
     */
    public static boolean handleMatrixCommand(int commandId, Object obj) {
        if (commandId == 999100) {
            MatrixUI.showMatrixMenu();
            return true;
        }
        return MatrixUI.handleCommand(commandId, obj);
    }

    /**
     * Hook called when an inbound network packet is received.
     *
     * @param packet The received packet object
     */
    public static void onPacketReceived(Object packet) {
        MatrixNet.handleInboundPacket(packet);
    }

    /**
     * Hook called when an outbound network packet is sent.
     *
     * @param command The packet command ID
     * @param length The byte array length
     */
    public static void logPacketSend(int command, int length) {
        MatrixNet.logOutboundPacket(command, length);
    }

    /**
     * Hook called on key press events.
     *
     * @param keyCode Key code integer
     */
    public static void logKey(int keyCode) {
        MatrixLogger.debug("Key pressed: " + keyCode);
    }

    /**
     * Intercepts server notice popups and top banner tickers.
     * Replaces initial login welcome/advertisement notices with "Time to Hustle!",
     * while preserving all legitimate in-game global messages (boss spawns, item upgrades, events).
     *
     * @param noticeText The raw notice message string
     * @return Transformed or sanitized notice string
     */
    public static String transformNoticeText(String noticeText) {
        if (noticeText == null || noticeText.length() == 0) {
            return noticeText;
        }
        
        String lower = noticeText.toLowerCase();
        // Target login welcome messages or legacy mod branding
        if (lower.indexOf("nick") >= 0 || lower.indexOf("havan") >= 0 
            || lower.indexOf("chào mừng") >= 0 || lower.indexOf("welcome") >= 0
            || lower.indexOf("phần mềm") >= 0 || lower.indexOf("nso.net") >= 0) {
            MatrixLogger.info("⚡ [MatrixCore Login Notice Intercepted]: " + noticeText);
            return "Time to Hustle!";
        }
        
        // Preserve standard game global messages (events, boss spawns, item upgrades)
        return sanitizeText(noticeText);
    }

    public static boolean handleNoticeDialog(String noticeText) {
        MatrixLogger.info("[GAME NOTICE] " + noticeText);
        return false;
    }
}
