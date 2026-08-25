/*
 * Decompiled with CFR 0.152.
 */
public final class bx {
    private static /* synthetic */ dh c;
    public static /* synthetic */ bz a;
    private static /* synthetic */ int d;
    private static /* synthetic */ int e;
    private static /* synthetic */ int f;
    private static /* synthetic */ int g;
    private static /* synthetic */ int h;
    public static /* synthetic */ int b;
    private static final /* synthetic */ int[] llIllIl;

    static {
        bx.lIlIIII();
        c = new dh();
        d = llIllIl[0];
        h = llIllIl[1];
        b = llIllIl[2];
    }

    public static void a(fh fh2) {
        int lllIIllIlIlIlII = bq.V ? llIllIl[3] : llIllIl[4];
        int lllIIllIlIlIIll = bq.A;
        if (a != null) {
            fh lllIIllIlIlIlIl;
            lllIIllIlIlIlIl.d(llIllIl[4], llIllIl[4], bq.A, bq.B);
            if (!bq.g) {
                dp.a(llIllIl[5], lllIIllIlIlIlII - llIllIl[6], lllIIllIlIlIIll + llIllIl[7], b + llIllIl[8], lllIIllIlIlIlIl);
            } else {
                lllIIllIlIlIlIl.a(llIllIl[4]);
                lllIIllIlIlIlIl.c(llIllIl[4], lllIIllIlIlIlII, lllIIllIlIlIIll, b);
            }
            lllIIllIlIlIlIl.d(llIllIl[4], lllIIllIlIlIlII, lllIIllIlIlIIll, b + llIllIl[0]);
            bx.a.b.a(lllIIllIlIlIlIl, bx.a.a, f, lllIIllIlIlIlII + llIllIl[0], llIllIl[4]);
        }
    }

    public static void a() {
        if (bq.g) {
            b = llIllIl[9];
        }
        if (d == 0) {
            if ((f += (h - f) / llIllIl[10]) - h < llIllIl[10]) {
                f = h + llIllIl[1];
                d = llIllIl[1];
                e = llIllIl[4];
                return;
            }
        } else if (d == llIllIl[1]) {
            if ((e += llIllIl[11]) > bx.a.c) {
                d = llIllIl[10];
                e = llIllIl[4];
                return;
            }
        } else if (d == llIllIl[10]) {
            f = f + g < h + bq.A - llIllIl[12] ? (f -= llIllIl[13]) : (f -= llIllIl[1]);
            if (f + g < h) {
                d = llIllIl[6];
                e = llIllIl[4];
                return;
            }
        } else if (d == llIllIl[6]) {
            if ((e += llIllIl[11]) > llIllIl[7]) {
                d = llIllIl[0];
                e = llIllIl[4];
                return;
            }
        } else if (d == llIllIl[0]) {
            if (c.size() > 0) {
                bz lllIIllIlIlIIIl = (bz)c.firstElement();
                c.removeElementAt(llIllIl[4]);
                if (a != null && lllIIllIlIlIIIl.a.equals(bx.a.a)) {
                    return;
                }
                a = lllIIllIlIlIIIl;
                g = lllIIllIlIlIIIl.b.a(bx.a.a);
                e = llIllIl[4];
                d = llIllIl[4];
                f = bq.A;
                return;
            }
            a = null;
            if (bq.g) {
                b = llIllIl[4];
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void a(String var0, int var1_1, fg var2_2) {
        block10: {
            block11: {
                block9: {
                    var3_3 = var0;
                    if (bx.a == null || bx.a.a == null || !var0.equals(bx.a.a)) break block9;
                    var4_4 = bx.llIllIl[11];
                    break block10;
                }
                if (bx.c.size() <= 0 || !lllIIllIIllIlIl.equals(((bz)bx.c.lastElement()).a)) break block11;
                lllIIllIIllIIIl = bx.llIllIl[11];
                break block10;
            }
            if (lllIIllIIllIlIl.length() < bx.llIllIl[8]) ** GOTO lbl-1000
            if (bx.a != null && bx.a.a != null && bx.d < bx.llIllIl[10] && bx.a.a.length() >= bx.llIllIl[8] && (lllIIllIIllIIII = lllIIllIIllIlIl.substring(bx.llIllIl[4], bx.llIllIl[8])).equals(lllIIllIIlIllll = bx.a.a.substring(bx.llIllIl[4], bx.llIllIl[8]))) {
                lllIIllIIlIlllI = bx.llIllIl[14];
                while (lllIIllIIlIlllI < lllIIllIIllIIlI.length() && lllIIllIIlIlllI < bx.a.a.length() && lllIIllIIllIIlI.charAt(lllIIllIIlIlllI) == bx.a.a.charAt(lllIIllIIlIlllI)) {
                    ++lllIIllIIlIlllI;
                }
                lllIIllIIlIllll = lllIIllIIllIIlI.substring(lllIIllIIlIlllI, lllIIllIIllIIlI.length());
                lllIIllIIlIllIl = bx.a;
                v0 = new byte[bx.llIllIl[6]];
                v0[bx.llIllIl[4]] = bx.llIllIl[4];
                v0[bx.llIllIl[11]] = bx.llIllIl[15];
                v0[bx.llIllIl[1]] = bx.llIllIl[4];
                v0[bx.llIllIl[10]] = bx.llIllIl[16];
                lllIIllIIlIllIl.a = String.valueOf(lllIIllIIlIllIl.a) + ec.a(v0) + lllIIllIIlIllll;
                bx.d = bx.llIllIl[1];
                bx.e = bx.llIllIl[4];
                lllIIllIIllIIIl = bx.llIllIl[11];
            } else if (bx.c.size() > 0 && (lllIIllIIllIIII = ((bz)bx.c.lastElement()).a).length() >= bx.llIllIl[8] && (lllIIllIIlIllll = lllIIllIIllIlIl.substring(bx.llIllIl[4], bx.llIllIl[8])).equals(lllIIllIIlIlllI = lllIIllIIllIIII.substring(bx.llIllIl[4], bx.llIllIl[8]))) {
                lllIIllIIlIllIl = bx.llIllIl[14];
                while (lllIIllIIlIllIl < lllIIllIIllIIlI.length() && lllIIllIIlIllIl < lllIIllIIllIIII.length() && lllIIllIIllIIlI.charAt(lllIIllIIlIllIl) == lllIIllIIllIIII.charAt(lllIIllIIlIllIl)) {
                    ++lllIIllIIlIllIl;
                }
                lllIIllIIllIIlI = lllIIllIIllIIlI.substring(lllIIllIIlIllIl, lllIIllIIllIIlI.length());
                v1 = new byte[bx.llIllIl[6]];
                v1[bx.llIllIl[4]] = bx.llIllIl[4];
                v1[bx.llIllIl[11]] = bx.llIllIl[15];
                v1[bx.llIllIl[1]] = bx.llIllIl[4];
                v1[bx.llIllIl[10]] = bx.llIllIl[16];
                new StringBuffer(String.valueOf(lllIIllIIllIIII)).append(ec.a(v1)).append(lllIIllIIllIIlI).toString();
                lllIIllIIllIIIl = bx.llIllIl[11];
            } else lbl-1000:
            // 2 sources

            {
                lllIIllIIllIIIl = bx.llIllIl[4];
            }
        }
        if (lllIIllIIllIIIl == 0) {
            if (bq.A == bx.llIllIl[17]) {
                bx.h = bx.llIllIl[11];
            }
            if (bx.c.size() > bx.llIllIl[7]) {
                bx.c.removeElementAt(bx.llIllIl[4]);
            }
            bx.c.addElement(new bz(lllIIllIIllIlIl, (fg)lllIIllIIllIIll, (int)lllIIllIIllIlII));
        }
    }

    private static void lIlIIII() {
        llIllIl = new int[18];
        bx.llIllIl[0] = 0x96 ^ 0x93;
        bx.llIllIl[1] = " ".length() << " ".length();
        bx.llIllIl[2] = 0x8F ^ 0x80;
        bx.llIllIl[3] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        bx.llIllIl[4] = (0x12 ^ 0x39) & ~(0xB5 ^ 0x9E);
        bx.llIllIl[5] = -(0x65 ^ 0x63);
        bx.llIllIl[6] = " ".length() << (" ".length() << " ".length());
        bx.llIllIl[7] = (0xBA ^ 0xBF) << " ".length();
        bx.llIllIl[8] = " ".length() << "   ".length();
        bx.llIllIl[9] = (0x22 ^ 0x27) << (" ".length() << " ".length());
        bx.llIllIl[10] = "   ".length();
        bx.llIllIl[11] = " ".length();
        bx.llIllIl[12] = (0x20 ^ 0x25) << (7 ^ 2);
        bx.llIllIl[13] = "   ".length() << " ".length();
        bx.llIllIl[14] = 0x1A ^ 0x1D;
        bx.llIllIl[15] = (0x6D ^ 0x66) << (" ".length() << " ".length());
        bx.llIllIl[16] = " ".length() << (0x83 ^ 0x86);
        bx.llIllIl[17] = " ".length() << (0xA5 ^ 0xA2);
    }
}

