/*
 * Decompiled with CFR 0.152.
 */
public final class bl {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public /* synthetic */ byte d;
    public /* synthetic */ int e;
    public static /* synthetic */ cx f;
    private static final /* synthetic */ int[] lllIllI;

    public final boolean a() {
        bl lllIIIIIIIllllI;
        if (this.a < bt.i) {
            return lllIllI[0];
        }
        if (lllIIIIIIIllllI.a > bt.i + bt.b) {
            return lllIllI[0];
        }
        if (lllIIIIIIIllllI.b < bt.j) {
            return lllIllI[0];
        }
        if (lllIIIIIIIllllI.b > bt.j + bt.c + lllIllI[1]) {
            return lllIllI[0];
        }
        if (f != null && bl.f.g == lllIllI[2]) {
            return lllIllI[0];
        }
        return lllIllI[3];
    }

    /*
     * WARNING - void declaration
     */
    public bl(int n2, int n3) {
        this.c = lllIllI[0];
        this.d = (byte)lllIllI[0];
        this.a = n2;
        this.b = n3;
        int n4 = lllIllI[0];
        while (n4 < bt.J.size()) {
            void lllIIIIIIIlIlIl;
            cx lllIIIIIIIlIlII = (cx)bt.J.elementAt((int)lllIIIIIIIlIlIl);
            if (lllIIIIIIIlIlII.r == lllIllI[4]) {
                f = lllIIIIIIIlIlII;
            }
            ++lllIIIIIIIlIlIl;
        }
    }

    static {
        bl.lIllIlI();
    }

    private static void lIllIlI() {
        lllIllI = new int[5];
        bl.lllIllI[0] = (0x34 ^ 0xD) & ~(0x25 ^ 0x1C);
        bl.lllIllI[1] = (0x22 ^ 0x2D) << " ".length();
        bl.lllIllI[2] = " ".length() << "   ".length();
        bl.lllIllI[3] = " ".length();
        bl.lllIllI[4] = (0x3A ^ 0x5F) << " ".length();
    }
}

