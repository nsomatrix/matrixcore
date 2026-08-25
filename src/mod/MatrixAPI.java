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
     * Hook called when a notice or modal dialog text is shown.
     *
     * @param noticeText The string message
     * @return true if intercepted
     */
    public static boolean handleNoticeDialog(String noticeText) {
        MatrixLogger.info("[GAME NOTICE] " + noticeText);
        return false;
    }
}
