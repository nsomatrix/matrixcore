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
     * Checks whether a notice dialog or server broadcast should be completely suppressed.
     *
     * @param noticeText The raw notice message string
     * @return true if notice should be silently dropped, false otherwise
     */
    public static boolean shouldSuppressNotice(String noticeText) {
        if (noticeText == null || noticeText.trim().length() == 0) {
            return true;
        }
        String lower = noticeText.toLowerCase();
        return lower.indexOf("nick") >= 0 
            || lower.indexOf("havan") >= 0 
            || lower.indexOf("hanhap") >= 0
            || lower.indexOf("chào mừng") >= 0 
            || lower.indexOf("welcome") >= 0
            || lower.indexOf("phần mềm") >= 0 
            || lower.indexOf("nso.net") >= 0
            || lower.indexOf("havx") >= 0 
            || lower.indexOf("vxmm") >= 0
            || lower.indexOf("zalo") >= 0
            || lower.indexOf("bot ae") >= 0
            || lower.indexOf("tone 28") >= 0
            || lower.indexOf("0377") >= 0
            || lower.indexOf("top ngày") >= 0
            || lower.indexOf("đặt vxmm") >= 0;
    }

    /**
     * Intercepts server notice popups and top banner tickers.
     * Returns empty string for suppressed ads, or sanitized string for legitimate game alerts.
     *
     * @param noticeText The raw notice message string
     * @return Transformed or sanitized notice string
     */
    public static String transformNoticeText(String noticeText) {
        if (shouldSuppressNotice(noticeText)) {
            return "";
        }
        
        // Preserve standard game global messages (events, boss spawns, item upgrades)
        return sanitizeText(noticeText);
    }

    public static boolean handleNoticeDialog(String noticeText) {
        MatrixLogger.info("[GAME NOTICE] " + noticeText);
        return false;
    }


    /**
     * Intercepts and processes chat commands sent via private message or local chat bar.
     *
     * @param sender Sender username (null or empty if self/local chat)
     * @param text Message or command string
     * @return true if command was handled by MatrixCore, false otherwise
     */
    public static boolean handleChatCommand(String sender, String text) {
        if (text == null) return false;
        String cmd = text.trim().toLowerCase();

        // Suppress native "xemxu" command completely (returns no info and prevents native handler)
        if (cmd.equals("xemxu") || cmd.equals("/xemxu")) {
            return true;
        }

        // Command "yen" (shows telemetry UP 0 - 00:23 - Per/h : 0)
        if (cmd.equals("yen") || cmd.equals("/yen")) {
            String resp = getYenInfo();
            respond(sender, resp);
            return true;
        }

        // Command "level" (shows current level and EXP percentile)
        if (cmd.equals("level") || cmd.equals("/level") || cmd.equals("lvl") || cmd.equals("/lvl")) {
            String resp = getLevelInfo();
            respond(sender, resp);
            return true;
        }

        return false;
    }

    /**
     * Retrieves player's Yen telemetry using exact native at.c struct (v.f().au - at.c.o, at.c.p, dl.b(time)).
     * Formats output as requested: UP 0 - 00:23 - Per/h : 0
     */
    public static String getYenInfo() {
        try {
            Class vClass = Class.forName("v");
            java.lang.reflect.Method fMethod = vClass.getMethod("f", new Class[0]);
            Object myPlayer = fMethod.invoke(null, new Object[0]);
            if (myPlayer == null) return "UP 0 - 00:00 - Per/h : 0";

            // Native Yen balance is stored in field 'au' of v.class (used by native xemxu at.c.o)
            int currentYen = vClass.getField("au").getInt(myPlayer);

            int gainedYen = 0;
            int elapsedSec = 0;

            // Access exact native at.c auto-farm struct
            try {
                Class atClass = Class.forName("at");
                Object cObj = atClass.getField("c").get(null);
                if (cObj != null) {
                    int startYen = cObj.getClass().getField("o").getInt(cObj);
                    long startTime = cObj.getClass().getField("p").getLong(cObj);
                    gainedYen = currentYen - startYen;
                    if (startTime > 0L) {
                        elapsedSec = (int) ((System.currentTimeMillis() - startTime) / 1000L);
                    }
                }
            } catch (Throwable ignore) {}

            if (elapsedSec < 1) elapsedSec = 1;

            long yenPerHour = ((long) gainedYen * 3600L) / elapsedSec;

            String formattedTime = "00:00";
            try {
                Class dlClass = Class.forName("dl");
                java.lang.reflect.Method bMethod = dlClass.getMethod("b", new Class[]{ int.class });
                formattedTime = (String) bMethod.invoke(null, new Object[]{ Integer.valueOf(elapsedSec) });
            } catch (Throwable ignore) {}

            // Exact format requested: UP 0 - 00:23 - Per/h : 0
            return "UP " + formatNumber(gainedYen) 
                 + " - " + formattedTime 
                 + " - Per/h : " + formatNumber(yenPerHour);
        } catch (Throwable t) {
            MatrixLogger.error("Failed to get Yen info", t);
            return "UP 0 - 00:00 - Per/h : 0";
        }
    }

    /**
     * Retrieves player's level and EXP percentile.
     */
    public static String getLevelInfo() {
        try {
            Class vClass = Class.forName("v");
            java.lang.reflect.Method fMethod = vClass.getMethod("f", new Class[0]);
            Object myPlayer = fMethod.invoke(null, new Object[0]);
            if (myPlayer == null) return "Level: N/A";

            // Character Level field is 'x' in v.class
            int level = vClass.getField("x").getInt(myPlayer);
            int expIndex = level;

            long curExpF = vClass.getField("F").getLong(myPlayer);
            long curExpI = vClass.getField("i").getLong(myPlayer);
            long curExpH = vClass.getField("h").getLong(myPlayer);
            long currentExp = (curExpI > 0L) ? curExpI : (curExpF > 0L ? curExpF : curExpH);

            Class btClass = Class.forName("bt");
            long[] maxExpTable = (long[]) btClass.getField("aP").get(null);

            double percentage = 0.0;
            if (maxExpTable != null && expIndex >= 0 && expIndex < maxExpTable.length && maxExpTable[expIndex] > 0) {
                percentage = (currentExp * 100.0) / (double) maxExpTable[expIndex];
            }

            long integerPart = (long) percentage;
            long decimalPart = Math.abs((long) Math.round((percentage - integerPart) * 100));
            String formattedPct = (integerPart < 10 ? "0" : "") + integerPart + "." + (decimalPart < 10 ? "0" : "") + decimalPart;

            // Format requested by user: Level 60 - 00.00%
            return "Level " + level + " - " + formattedPct + "%";
        } catch (Throwable t) {
            MatrixLogger.error("Failed to get level info", t);
            return "Level: Error";
        }
    }

    private static String formatNumber(long num) {
        return java.text.NumberFormat.getInstance(java.util.Locale.US).format(num);
    }

    private static void respond(String sender, String responseText) {
        MatrixLogger.info("⚡ [MatrixCore Command] -> " + (sender != null ? sender : "Local") + ": " + responseText);

        if (sender != null && sender.trim().length() > 0) {
            // Remotely triggered via Private Message -> Send PM reply back SILENTLY, no local popup!
            try {
                Class atClass = Class.forName("at");
                java.lang.reflect.Method pmMethod = atClass.getMethod("b", new Class[]{ String.class, String.class });
                pmMethod.invoke(null, new Object[]{ sender, responseText });
            } catch (Throwable t) {
                MatrixLogger.error("Failed to send remote PM response to " + sender, t);
            }
        } else {
            // Locally typed in client by user -> Display notice popup on local screen
            try {
                Class bqClass = Class.forName("bq");
                java.lang.reflect.Method noticeMethod = bqClass.getMethod("a", new Class[]{ String.class });
                noticeMethod.invoke(null, new Object[]{ responseText });
            } catch (Throwable t) {
                MatrixLogger.error("Failed to display local notice", t);
            }
        }
    }

    /**
     * Inspects game menu vectors and inserts the "MTXCore" option between "MenuAuto" and "MenuPK".
     *
     * @param dhObj The dh (Vector) instance of menu items being opened
     */
    public static void injectMTXCoreMenu(Object dhObj) {
        if (dhObj == null) return;
        try {
            java.util.Vector vector = (java.util.Vector) dhObj;
            if (vector.isEmpty()) return;

            int autoIdx = -1;
            boolean hasMTX = false;

            for (int i = 0; i < vector.size(); i++) {
                Object item = vector.elementAt(i);
                if (item == null) continue;

                Class itemClass = item.getClass();
                if ("au".equals(itemClass.getName())) {
                    java.lang.reflect.Field labelField = itemClass.getField("a");
                    String label = (String) labelField.get(item);

                    if ("MTXCore".equals(label)) {
                        hasMTX = true;
                        break;
                    }

                    java.lang.reflect.Field idField = itemClass.getField("d");
                    int actionId = idField.getInt(item);

                    // Action ID 86 corresponds to MenuAuto
                    if (actionId == 86 || (label != null && label.toLowerCase().indexOf("auto") >= 0)) {
                        autoIdx = i;
                    }
                }
            }

            if (!hasMTX && autoIdx >= 0) {
                // Get bq.k (bu listener) and au constructor au(String, bu, int, Object)
                Class bqClass = Class.forName("bq");
                Object bqK = bqClass.getField("k").get(null);

                Class auClass = Class.forName("au");
                Class buClass = Class.forName("bu");

                java.lang.reflect.Constructor auConstr = auClass.getConstructor(new Class[]{
                    String.class, buClass, int.class, Object.class
                });

                Object mtxItem = auConstr.newInstance(new Object[]{
                    "MTXCore", bqK, Integer.valueOf(9999), null
                });

                vector.insertElementAt(mtxItem, autoIdx + 1);
                MatrixLogger.info("⚡ [MatrixCore] Inserted MTXCore menu option at index " + (autoIdx + 1));
            }
        } catch (Throwable t) {
            MatrixLogger.error("Failed to inject MTXCore menu option", t);
        }
    }

    /**
     * Callback handler when the user selects "MTXCore" in the game menu.
     */
    public static void handleMTXCoreMenu() {
        MatrixLogger.info("⚡ [MatrixCore Menu Clicked]");
        respond(null, "MTXCore Console v1.0");
    }
}
