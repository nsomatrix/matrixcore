/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Random;

public final class dl {
    private static /* synthetic */ Random a;
    private static final /* synthetic */ int[] lllIIll;

    static {
        dl.lIlIllI();
        a = new Random();
    }

    public static int a(int n2) {
        return a.nextInt(n2);
    }

    public static int a(int n2, int n3) {
        return lllIIll[0] + a.nextInt(lllIIll[1]);
    }

    public static byte[] a(aj lllIIIllIIlIlll) {
        try {
            byte[] lllIIIllIIlIllI = new byte[lllIIIllIIlIlll.b().readInt()];
            lllIIIllIIlIlll.b().read(lllIIIllIIlIllI);
            return lllIIIllIIlIllI;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static byte[] b(aj lllIIIllIIlIIll) {
        try {
            byte[] lllIIIllIIlIIlI = new byte[lllIIIllIIlIIll.b().readInt()];
            lllIIIllIIlIIll.b().read(lllIIIllIIlIIlI);
            return lllIIIllIIlIIlI;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static byte[] a(DataInputStream lllIIIllIIIllll) {
        try {
            byte[] lllIIIllIIIlllI = new byte[lllIIIllIIIllll.readInt()];
            lllIIIllIIIllll.read(lllIIIllIIIlllI);
            return lllIIIllIIIlllI;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String a(String string, String string2, String string3) {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = lllIIll[2];
        while ((n2 = string.indexOf(string2)) != lllIIll[3]) {
            void lllIIIllIIIIllI;
            void lllIIIllIIIIlIl;
            void lllIIIllIIIIIll;
            String lllIIIllIIIIlll;
            void lllIIIllIIIIlII;
            lllIIIllIIIIlII.append(String.valueOf(lllIIIllIIIIlll.substring(lllIIll[2], (int)lllIIIllIIIIIll)) + (String)lllIIIllIIIIlIl);
            string = lllIIIllIIIIlll.substring((int)(lllIIIllIIIIIll + lllIIIllIIIIllI.length()));
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static String a(String string) {
        void var3_3;
        String lllIIIlIlllllIl;
        String lllIIIlIlllllII;
        String string2 = "";
        String string3 = "";
        if (string.equals("")) {
            return lllIIIlIlllllII;
        }
        if (lllIIIlIlllllIl.charAt(lllIIll[2]) == lllIIll[4]) {
            byte[] byArray = new byte[lllIIll[5]];
            byArray[dl.lllIIll[2]] = lllIIll[2];
            byArray[dl.lllIIll[6]] = lllIIll[4];
            String lllIIIlIllllIll = ec.a(byArray);
            lllIIIlIlllllIl = lllIIIlIlllllIl.substring(lllIIll[6]);
        }
        int lllIIIlIllllIlI = lllIIIlIlllllIl.length() - lllIIll[6];
        while (var3_3 >= 0) {
            if ((lllIIIlIlllllIl.length() - lllIIll[6] - lllIIIlIllllIlI) % lllIIll[7] == 0 && lllIIIlIlllllIl.length() - lllIIll[6] - lllIIIlIllllIlI > 0) {
                byte[] byArray = new byte[lllIIll[5]];
                byArray[dl.lllIIll[2]] = lllIIll[2];
                byArray[dl.lllIIll[6]] = lllIIll[8];
                lllIIIlIlllllII = String.valueOf(lllIIIlIlllllIl.charAt(lllIIIlIllllIlI)) + ec.a(byArray) + lllIIIlIlllllII;
            } else {
                lllIIIlIlllllII = String.valueOf(lllIIIlIlllllIl.charAt(lllIIIlIllllIlI)) + lllIIIlIlllllII;
            }
            --lllIIIlIllllIlI;
        }
        return String.valueOf(string3) + string2;
    }

    public static void a(String string, short s2) {
        byte[] byArray = new byte[lllIIll[9]];
        byArray[dl.lllIIll[2]] = lllIIll[2];
        byArray[dl.lllIIll[6]] = lllIIll[10];
        byArray[dl.lllIIll[5]] = lllIIll[2];
        byArray[dl.lllIIll[7]] = lllIIll[11];
        byArray[dl.lllIIll[12]] = lllIIll[2];
        byArray[dl.lllIIll[13]] = lllIIll[10];
        byArray[dl.lllIIll[14]] = lllIIll[2];
        byArray[dl.lllIIll[15]] = lllIIll[16];
        byArray[dl.lllIIll[17]] = lllIIll[2];
        byArray[dl.lllIIll[18]] = lllIIll[19];
        byArray[dl.lllIIll[20]] = lllIIll[2];
        byArray[dl.lllIIll[21]] = lllIIll[19];
        ap.a(string, ec.a(byArray) + s2, new au("", bq.a(), lllIIll[22], null), new au("", bq.a(), lllIIll[23], null));
    }

    public static void b(String lllIIIlIllIlllI) {
        try {
            try {
                bs.d.platformRequest(lllIIIlIllIlllI);
            }
            catch (Exception lllIIIlIllIllII) {
                lllIIIlIllIllII.printStackTrace();
                bs.d.notifyDestroyed();
            }
        }
        finally {
            bs.d.notifyDestroyed();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String b(int n2) {
        void var4_4;
        void lllIIIlIlIlIIII;
        int lllIIIlIlIlIIlI;
        int n3 = lllIIll[2];
        if (n2 > lllIIll[24]) {
            n3 = n2 / lllIIll[24];
            lllIIIlIlIlIIlI = n2 % lllIIll[24];
        }
        int lllIIIlIlIIllll = lllIIll[2];
        if (lllIIIlIlIlIIII > lllIIll[24]) {
            lllIIIlIlIIllll = lllIIIlIlIlIIII / lllIIll[24];
            lllIIIlIlIlIIII %= lllIIll[24];
        }
        int lllIIIlIlIIlllI = lllIIll[2];
        if (lllIIIlIlIIllll > lllIIll[25]) {
            lllIIIlIlIIlllI = lllIIIlIlIIllll / lllIIll[25];
            lllIIIlIlIIllll %= lllIIll[25];
        }
        String lllIIIlIlIIllII = "";
        if (lllIIIlIlIIlllI > 0) {
            lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + lllIIIlIlIIlllI;
            byte[] byArray = new byte[lllIIll[5]];
            byArray[dl.lllIIll[2]] = lllIIll[2];
            byArray[dl.lllIIll[6]] = lllIIll[26];
            lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + ec.a(byArray);
            byte[] byArray2 = new byte[lllIIll[5]];
            byArray2[dl.lllIIll[2]] = lllIIll[2];
            byArray2[dl.lllIIll[6]] = lllIIll[27];
            lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + lllIIIlIlIIllll + ec.a(byArray2);
        } else if (lllIIIlIlIIllll > 0) {
            lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + lllIIIlIlIIllll;
            byte[] byArray = new byte[lllIIll[5]];
            byArray[dl.lllIIll[2]] = lllIIll[2];
            byArray[dl.lllIIll[6]] = lllIIll[27];
            lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + ec.a(byArray);
            byte[] byArray3 = new byte[lllIIll[5]];
            byArray3[dl.lllIIll[2]] = lllIIll[2];
            byArray3[dl.lllIIll[6]] = lllIIll[28];
            lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + (int)lllIIIlIlIlIIII + ec.a(byArray3);
        } else {
            if (lllIIIlIlIlIIII > lllIIll[18]) {
                lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + (int)lllIIIlIlIlIIII;
            } else {
                byte[] byArray = new byte[lllIIll[5]];
                byArray[dl.lllIIll[2]] = lllIIll[2];
                byArray[dl.lllIIll[6]] = lllIIll[29];
                lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + ec.a(byArray) + (int)lllIIIlIlIlIIII;
            }
            byte[] byArray = new byte[lllIIll[5]];
            byArray[dl.lllIIll[2]] = lllIIll[2];
            byArray[dl.lllIIll[6]] = lllIIll[16];
            lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + ec.a(byArray);
            if (lllIIIlIlIlIIlI > lllIIll[18]) {
                lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + lllIIIlIlIlIIlI;
            } else {
                byte[] byArray4 = new byte[lllIIll[5]];
                byArray4[dl.lllIIll[2]] = lllIIll[2];
                byArray4[dl.lllIIll[6]] = lllIIll[29];
                lllIIIlIlIIllII = String.valueOf(lllIIIlIlIIllII) + ec.a(byArray4) + lllIIIlIlIlIIlI;
            }
        }
        return var4_4;
    }

    /*
     * WARNING - void declaration
     */
    public static String[] a(String string, String string2) {
        void var3_4;
        String lllIIIlIlIIIlII;
        void lllIIIlIlIIIIlI;
        int lllIIIlIlIIIIIl22;
        dh dh2 = new dh();
        int n2 = string.indexOf(string2);
        while (lllIIIlIlIIIIIl22 >= 0) {
            void lllIIIlIlIIIIll;
            lllIIIlIlIIIIlI.addElement(lllIIIlIlIIIlII.substring(lllIIll[2], lllIIIlIlIIIIIl22));
            lllIIIlIlIIIlII = lllIIIlIlIIIlII.substring((int)(lllIIIlIlIIIIIl22 + lllIIIlIlIIIIll.length()));
            lllIIIlIlIIIIIl22 = lllIIIlIlIIIlII.indexOf((String)lllIIIlIlIIIIll);
        }
        lllIIIlIlIIIIlI.addElement(lllIIIlIlIIIlII);
        String[] lllIIIlIlIIIIIl22 = new String[lllIIIlIlIIIIlI.size()];
        if (lllIIIlIlIIIIlI.size() > 0) {
            int lllIIIlIlIIIIII = lllIIll[2];
            while (lllIIIlIlIIIIII < lllIIIlIlIIIIlI.size()) {
                lllIIIlIlIIIIIl22[lllIIIlIlIIIIII] = (String)lllIIIlIlIIIIlI.elementAt(lllIIIlIlIIIIII);
                ++lllIIIlIlIIIIII;
            }
        }
        return var3_4;
    }

    private static void lIlIllI() {
        lllIIll = new int[30];
        dl.lllIIll[0] = -(0x97 ^ 0x90);
        dl.lllIIll[1] = (0x3D ^ 0x3A) << " ".length();
        dl.lllIIll[2] = (0x3B ^ 0x14) & ~(0x80 ^ 0xAF);
        dl.lllIIll[3] = -" ".length();
        dl.lllIIll[4] = 0xED ^ 0xC0;
        dl.lllIIll[5] = " ".length() << " ".length();
        dl.lllIIll[6] = " ".length();
        dl.lllIIll[7] = "   ".length();
        dl.lllIIll[8] = (0x4A ^ 0x5D) << " ".length();
        dl.lllIIll[9] = "   ".length() << (" ".length() << " ".length());
        dl.lllIIll[10] = 0xD7 ^ 0xA4;
        dl.lllIIll[11] = 0x1F ^ 0x72;
        dl.lllIIll[12] = " ".length() << (" ".length() << " ".length());
        dl.lllIIll[13] = 9 ^ 0xC;
        dl.lllIIll[14] = "   ".length() << " ".length();
        dl.lllIIll[15] = 0xB ^ 0xC;
        dl.lllIIll[16] = (0x5F ^ 0x42) << " ".length();
        dl.lllIIll[17] = " ".length() << "   ".length();
        dl.lllIIll[18] = 0xA1 ^ 0xA8;
        dl.lllIIll[19] = 0xBD ^ 0x92;
        dl.lllIIll[20] = (0xAB ^ 0xAE) << " ".length();
        dl.lllIIll[21] = 0x98 ^ 0x93;
        dl.lllIIll[22] = 67088 + 33686 - 28475 + 16528;
        dl.lllIIll[23] = 15098 + 17109 - 20179 + 10179 << (" ".length() << " ".length());
        dl.lllIIll[24] = (0x11 ^ 0x1E) << (" ".length() << " ".length());
        dl.lllIIll[25] = "   ".length() << "   ".length();
        dl.lllIIll[26] = (0x44 ^ 0x5D) << (" ".length() << " ".length());
        dl.lllIIll[27] = (0x20 ^ 0x2D) << "   ".length();
        dl.lllIIll[28] = 0x39 ^ 0x1E;
        dl.lllIIll[29] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
    }
}

