/*
 * Decompiled with CFR 0.152.
 */
public final class dt {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ short c;
    public /* synthetic */ String d;
    public /* synthetic */ boolean e;
    public /* synthetic */ v f;
    public /* synthetic */ int g;
    private static final /* synthetic */ int[] lIlIIllI;

    public dt(byte by2, int n2, String string, int n3) {
        switch (by2) {
            case 0: {
                llIIlIllIlIlIIl.c = (short)lIlIIllI[0];
                break;
            }
            case 1: {
                llIIlIllIlIlIIl.c = (short)lIlIIllI[1];
                break;
            }
            case 2: {
                llIIlIllIlIlIIl.c = (short)lIlIIllI[2];
                break;
            }
            case 3: {
                llIIlIllIlIlIIl.c = (short)lIlIIllI[3];
                break;
            }
            case 4: {
                llIIlIllIlIlIIl.c = (short)lIlIIllI[4];
                break;
            }
            case 5: {
                llIIlIllIlIlIIl.c = (short)lIlIIllI[5];
                break;
            }
            case 6: {
                llIIlIllIlIlIIl.c = (short)lIlIIllI[6];
            }
        }
        this.d = string;
        this.b = n2;
        this.g = n3;
    }

    /*
     * WARNING - void declaration
     */
    public dt(int n2, byte by2, String string, boolean bl2) {
        void llIIlIlIlllllIl;
        void llIIlIlIllllIII;
        this.a = n2;
        this.e = bl2;
        switch (by2) {
            case 0: {
                llIIlIllIIIIIII.c = (short)lIlIIllI[0];
                break;
            }
            case 1: {
                llIIlIllIIIIIII.c = (short)lIlIIllI[1];
                break;
            }
            case 2: {
                llIIlIllIIIIIII.c = (short)lIlIIllI[2];
                break;
            }
            case 3: {
                llIIlIllIIIIIII.c = (short)lIlIIllI[3];
                break;
            }
            case 4: {
                llIIlIllIIIIIII.c = (short)lIlIIllI[4];
                break;
            }
            case 5: {
                llIIlIllIIIIIII.c = (short)lIlIIllI[5];
                break;
            }
            case 6: {
                llIIlIllIIIIIII.c = (short)lIlIIllI[6];
            }
        }
        llIIlIllIIIIIII.d = llIIlIlIllllIII;
        llIIlIllIIIIIII.f = llIIlIlIlllllIl == v.f().q ? v.f() : bt.f((int)llIIlIlIlllllIl);
    }

    /*
     * WARNING - void declaration
     */
    public static void a() {
        int n2 = lIlIIllI[7];
        while (n2 < bt.z.size()) {
            void llIIlIlIllIIIII;
            dt llIIlIlIlIllllI = (dt)bt.z.elementAt((int)llIIlIlIllIIIII);
            if (llIIlIlIlIllllI.a != v.f().q) {
                llIIlIlIlIllllI.f = bt.f(llIIlIlIlIllllI.a);
            }
            ++llIIlIlIllIIIII;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2) {
        int n3 = lIlIIllI[7];
        while (n3 < bt.z.size()) {
            int llIIlIlIIllllIl;
            void llIIlIlIIlllIll;
            dt llIIlIlIIlllIIl = (dt)bt.z.elementAt((int)llIIlIlIIlllIll);
            if (llIIlIlIIlllIIl.a == llIIlIlIIllllIl) {
                llIIlIlIIlllIIl.f = null;
                return;
            }
            ++llIIlIlIIlllIll;
        }
    }

    static {
        dt.llllllI();
    }

    private static void llllllI() {
        lIlIIllI = new int[8];
        dt.lIlIIllI[0] = 371 + 507 - 450 + 219;
        dt.lIlIIllI[1] = 248 + 279 - 43 + 107 << " ".length();
        dt.lIlIIllI[2] = 1105 + 797 - 1056 + 335;
        dt.lIlIIllI[3] = 53 + 526 - 357 + 421;
        dt.lIlIIllI[4] = 638 + 221 - 854 + 640;
        dt.lIlIIllI[5] = 149 + 60 - 180 + 140 << (" ".length() << " ".length());
        dt.lIlIIllI[6] = 419 + 127 - -421 + 152;
        dt.lIlIIllI[7] = (0x42 ^ 0x73) << " ".length() & ~((0xA7 ^ 0x96) << " ".length());
    }
}

