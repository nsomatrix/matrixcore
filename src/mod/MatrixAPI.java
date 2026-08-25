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
