/*
 * Decompiled with CFR 0.152.
 */
public final class ca {
    private static /* synthetic */ dh a;
    private static /* synthetic */ bz b;
    private static /* synthetic */ int c;
    private static /* synthetic */ int d;
    private static /* synthetic */ int e;
    private static /* synthetic */ int f;
    private static /* synthetic */ int g;
    private static /* synthetic */ int h;
    private static final /* synthetic */ int[] llIlIll;

    static {
        ca.lIIlllI();
        a = new dh();
        c = llIlIll[0];
        g = llIlIll[1];
        h = llIlIll[2];
    }

    public static void a(fh fh2) {
        int lllIlIIIllllIII;
        int lllIlIIIlllIlll;
        int lllIlIIIllllIIl;
        int n2 = g;
        int n3 = bq.B - llIlIll[3];
        int n4 = bq.A;
        if (bq.g) {
            if (bq.A >= llIlIll[4]) {
                n2 = llIlIll[5];
                n4 = bq.A - llIlIll[6];
            } else {
                lllIlIIIllllIIl = llIlIll[7];
                lllIlIIIlllIlll = bq.A - llIlIll[8] - llIlIll[9];
            }
            lllIlIIIllllIII = bq.B - llIlIll[10];
            g = lllIlIIIllllIIl + llIlIll[1];
        }
        if (b != null && (bq.J == null || bq.J.b == null)) {
            fh lllIlIIIllllIlI;
            lllIlIIIllllIlI.d(llIlIll[11], llIlIll[11], bq.A, bq.B);
            if (bq.g) {
                dp.a(lllIlIIIllllIIl, (int)(lllIlIIIllllIII - llIlIll[12]), lllIlIIIlllIlll + llIlIll[9], h + llIlIll[13], lllIlIIIllllIlI);
            } else {
                lllIlIIIllllIlI.a(llIlIll[11]);
                lllIlIIIllllIlI.c(lllIlIIIllllIIl - llIlIll[1], lllIlIIIllllIII, lllIlIIIlllIlll + llIlIll[1], h);
            }
            lllIlIIIllllIlI.d(lllIlIIIllllIIl, lllIlIIIllllIII, lllIlIIIlllIlll, h);
            ca.b.b.a(lllIlIIIllllIlI, ca.b.a, e, lllIlIIIllllIII + llIlIll[14], llIlIll[11]);
        }
    }

    public static void a() {
        if (c == 0) {
            if ((e += (g - e) / llIlIll[14]) - g < llIlIll[14]) {
                e = g + llIlIll[1];
                c = llIlIll[1];
                d = llIlIll[11];
                return;
            }
        } else if (c == llIlIll[1]) {
            if ((d += llIlIll[15]) > ca.b.c) {
                c = llIlIll[14];
                d = llIlIll[11];
                return;
            }
        } else if (c == llIlIll[14]) {
            e = e + f < g + bq.A - llIlIll[2] ? (e -= llIlIll[16]) : (e -= llIlIll[1]);
            if (e + f < g) {
                c = llIlIll[12];
                d = llIlIll[11];
                return;
            }
        } else if (c == llIlIll[12]) {
            if ((d += llIlIll[15]) > llIlIll[9]) {
                c = llIlIll[0];
                d = llIlIll[11];
                return;
            }
        } else if (c == llIlIll[0]) {
            if (a.size() > 0) {
                bz lllIlIIIlllIlIl = (bz)a.firstElement();
                a.removeElementAt(llIlIll[11]);
                if (b != null && lllIlIIIlllIlIl.a.equals(ca.b.a)) {
                    return;
                }
                b = lllIlIIIlllIlIl;
                f = lllIlIIIlllIlIl.b.a(ca.b.a);
                d = llIlIll[11];
                c = llIlIll[11];
                e = bq.A;
                return;
            }
            b = null;
        }
    }

    public static void a(String string) {
        if (!ca.b(string)) {
            String lllIlIIIlllIIll;
            if (bq.A == llIlIll[17]) {
                g = llIlIll[15];
            }
            if (a.size() > llIlIll[9]) {
                a.removeElementAt(llIlIll[11]);
            }
            a.addElement(new bz(lllIlIIIlllIIll));
        }
    }

    private static boolean b(String string) {
        String lllIlIIIllIlIlI2;
        String lllIlIIIllIlIll;
        String lllIlIIIllIllII;
        String lllIlIIIllIllIl;
        if (b != null && ca.b.a != null && string.equals(ca.b.a)) {
            return llIlIll[15];
        }
        if (a.size() > 0 && lllIlIIIllIllIl.equals(((bz)ca.a.lastElement()).a)) {
            return llIlIll[15];
        }
        if (lllIlIIIllIllIl.length() < llIlIll[13]) {
            return llIlIll[11];
        }
        if (b != null && ca.b.a != null && c < llIlIll[14] && ca.b.a.length() >= llIlIll[13] && (lllIlIIIllIllII = lllIlIIIllIllIl.substring(llIlIll[11], llIlIll[13])).equals(lllIlIIIllIlIll = ca.b.a.substring(llIlIll[11], llIlIll[13]))) {
            int lllIlIIIllIlIlI2 = llIlIll[18];
            while (lllIlIIIllIlIlI2 < lllIlIIIllIllIl.length() && lllIlIIIllIlIlI2 < ca.b.a.length() && (lllIlIIIllIllIl.charAt(lllIlIIIllIlIlI2) < llIlIll[19] || lllIlIIIllIllIl.charAt(lllIlIIIllIlIlI2) > llIlIll[20]) && lllIlIIIllIllIl.charAt(lllIlIIIllIlIlI2) == ca.b.a.charAt(lllIlIIIllIlIlI2)) {
                ++lllIlIIIllIlIlI2;
            }
            lllIlIIIllIlIll = lllIlIIIllIllIl.substring(lllIlIIIllIlIlI2, lllIlIIIllIllIl.length());
            bz lllIlIIIllIlIIl = b;
            byte[] byArray = new byte[llIlIll[12]];
            byArray[ca.llIlIll[11]] = llIlIll[11];
            byArray[ca.llIlIll[15]] = llIlIll[21];
            byArray[ca.llIlIll[1]] = llIlIll[11];
            byArray[ca.llIlIll[14]] = llIlIll[22];
            lllIlIIIllIlIIl.a = String.valueOf(lllIlIIIllIlIIl.a) + ec.a(byArray) + lllIlIIIllIlIll;
            c = llIlIll[1];
            d = llIlIll[11];
            return llIlIll[15];
        }
        if (a.size() > 0 && (lllIlIIIllIllII = ((bz)ca.a.lastElement()).a).length() >= llIlIll[13] && (lllIlIIIllIlIll = lllIlIIIllIllIl.substring(llIlIll[11], llIlIll[13])).equals(lllIlIIIllIlIlI2 = lllIlIIIllIllII.substring(llIlIll[11], llIlIll[13]))) {
            int lllIlIIIllIlIIl = llIlIll[18];
            while (lllIlIIIllIlIIl < lllIlIIIllIllIl.length() && lllIlIIIllIlIIl < lllIlIIIllIllII.length() && (lllIlIIIllIllIl.charAt(lllIlIIIllIlIIl) < llIlIll[19] || lllIlIIIllIllIl.charAt(lllIlIIIllIlIIl) > llIlIll[20]) && lllIlIIIllIllIl.charAt(lllIlIIIllIlIIl) == lllIlIIIllIllII.charAt(lllIlIIIllIlIIl)) {
                ++lllIlIIIllIlIIl;
            }
            lllIlIIIllIllIl = lllIlIIIllIllIl.substring(lllIlIIIllIlIIl, lllIlIIIllIllIl.length());
            byte[] byArray = new byte[llIlIll[12]];
            byArray[ca.llIlIll[11]] = llIlIll[11];
            byArray[ca.llIlIll[15]] = llIlIll[21];
            byArray[ca.llIlIll[1]] = llIlIll[11];
            byArray[ca.llIlIll[14]] = llIlIll[22];
            new StringBuffer(String.valueOf(lllIlIIIllIllII)).append(ec.a(byArray)).append(lllIlIIIllIllIl).toString();
            return llIlIll[15];
        }
        return llIlIll[11];
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, int n2, fg fg2) {
        if (!ca.b(string)) {
            void lllIlIIIllIIIll;
            void lllIlIIIllIIIlI;
            String lllIlIIIllIIlII;
            if (bq.A == llIlIll[17]) {
                g = llIlIll[15];
            }
            if (a.size() > llIlIll[9]) {
                a.removeElementAt(llIlIll[11]);
            }
            a.addElement(new bz(lllIlIIIllIIlII, (fg)lllIlIIIllIIIlI, (int)lllIlIIIllIIIll));
        }
    }

    public static boolean b() {
        if (c == llIlIll[0] && a.size() == 0) {
            return llIlIll[15];
        }
        return llIlIll[11];
    }

    private static void lIIlllI() {
        llIlIll = new int[23];
        ca.llIlIll[0] = 0x30 ^ 0x35;
        ca.llIlIll[1] = " ".length() << " ".length();
        ca.llIlIll[2] = (0x7F ^ 0x7A) << (" ".length() << " ".length());
        ca.llIlIll[3] = 0x27 ^ 0x30;
        ca.llIlIll[4] = 83 + 196 - 161 + 107 << " ".length();
        ca.llIlIll[5] = (0x43 ^ 2) << " ".length();
        ca.llIlIll[6] = (0x68 ^ 0x29) << (" ".length() << " ".length());
        ca.llIlIll[7] = (0x38 ^ 0x3D) << (" ".length() << (" ".length() << " ".length()));
        ca.llIlIll[8] = (0x45 ^ 0x40) << (0x4D ^ 0x48);
        ca.llIlIll[9] = (0x3B ^ 0x3E) << " ".length();
        ca.llIlIll[10] = (0x91 ^ 0x9E) << (" ".length() << " ".length());
        ca.llIlIll[11] = "   ".length() << (0x99 ^ 0x9C) & ~("   ".length() << (0x65 ^ 0x60));
        ca.llIlIll[12] = " ".length() << (" ".length() << " ".length());
        ca.llIlIll[13] = " ".length() << "   ".length();
        ca.llIlIll[14] = "   ".length();
        ca.llIlIll[15] = " ".length();
        ca.llIlIll[16] = "   ".length() << " ".length();
        ca.llIlIll[17] = " ".length() << (2 ^ 5);
        ca.llIlIll[18] = 0x2C ^ 0x2B;
        ca.llIlIll[19] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        ca.llIlIll[20] = 0x70 ^ 0x49;
        ca.llIlIll[21] = (0x57 ^ 0x5C) << (" ".length() << " ".length());
        ca.llIlIll[22] = " ".length() << (0xC2 ^ 0xC7);
    }
}

