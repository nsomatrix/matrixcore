/*
 * Decompiled with CFR 0.152.
 */
public final class by {
    static /* synthetic */ boolean a;
    private static /* synthetic */ String d;
    private static /* synthetic */ String e;
    public static /* synthetic */ int b;
    public static /* synthetic */ boolean c;
    private static final /* synthetic */ int[] lll;

    public static void a(String string, String string2, int n2) {
        if (string != null) {
            a = lll[0];
            d = string;
            e = string2;
            b = n2;
        }
    }

    public static void a() {
        by.a(fa.y, null, lll[1]);
        c = lll[0];
    }

    public static void a(String string) {
        by.a(string, null, lll[1]);
        c = lll[0];
    }

    public static void a(fh fh2) {
        String llllllllllIlIll;
        String string = d;
        if (fb.j != null) {
            llllllllllIlIll = fb.j;
        }
        if (!(!a || c && b > lll[2] || bt.aH)) {
            fh llllllllllIllII;
            dp.a(bq.C - lll[3], lll[4], lll[5], lll[6], llllllllllIllII);
            if (c) {
                bq.a(bq.C - fg.o.a(llllllllllIlIll) / lll[7] - lll[4], lll[8], llllllllllIllII, lll[9]);
                fg.o.a(llllllllllIllII, llllllllllIlIll, bq.C + lll[10], lll[11], lll[7]);
            } else if (e != null) {
                fg.o.a(llllllllllIllII, llllllllllIlIll, bq.C, lll[12], lll[7]);
                fg.i.a(llllllllllIllII, e, bq.C, lll[13], lll[7]);
            } else {
                fg.o.a(llllllllllIllII, llllllllllIlIll, bq.C, lll[11], lll[7]);
            }
        }
    }

    public static void b() {
        d = "";
        e = null;
        c = lll[9];
        b = lll[9];
        a = lll[9];
    }

    static {
        by.lII();
    }

    private static void lII() {
        lll = new int[14];
        by.lll[0] = " ".length();
        by.lll[1] = 214 + 583 - 577 + 405 << "   ".length();
        by.lll[2] = 1842 + 1795 - 2783 + 1641 << " ".length();
        by.lll[3] = " ".length() << ("   ".length() << " ".length());
        by.lll[4] = (0x8F ^ 0x8A) << " ".length();
        by.lll[5] = " ".length() << (0xA8 ^ 0xAF);
        by.lll[6] = (0xE ^ 0xB) << "   ".length();
        by.lll[7] = " ".length() << " ".length();
        by.lll[8] = (0xB5 ^ 0xBA) << " ".length();
        by.lll[9] = (0x53 ^ 0x68) & ~(0x8E ^ 0xB5);
        by.lll[10] = 0xB4 ^ 0xB1;
        by.lll[11] = 0x24 ^ 0x33;
        by.lll[12] = (0x28 ^ 0x21) << " ".length();
        by.lll[13] = " ".length() << (0x12 ^ 0x17);
    }
}

