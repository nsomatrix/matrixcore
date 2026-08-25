package mod.net;

import mod.log.MatrixLogger;

/**
 * Network packet telemetry and packet injection handler for MatrixCore.
 */
public class MatrixNet {

    /**
     * Inspects inbound packets.
     */
    public static void handleInboundPacket(Object packet) {
        if (packet != null) {
            MatrixLogger.debug("[NET-IN] Packet received");
        }
    }

    /**
     * Logs outbound packets.
     */
    public static void logOutboundPacket(int command, int length) {
        MatrixLogger.debug("[NET-OUT] Command: " + command + " (" + length + " bytes)");
    }
}
