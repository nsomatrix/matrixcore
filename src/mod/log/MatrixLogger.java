package mod.log;

/**
 * Standardized logging engine for J2ME MatrixCore.
 */
public class MatrixLogger {

    private static final String PREFIX = "[MatrixCore] ";

    public static void info(String message) {
        System.out.println(PREFIX + "[INFO] " + message);
    }

    public static void debug(String message) {
        System.out.println(PREFIX + "[DEBUG] " + message);
    }

    public static void error(String message, Throwable t) {
        System.err.println(PREFIX + "[ERROR] " + message);
        if (t != null) {
            t.printStackTrace();
        }
    }
}
