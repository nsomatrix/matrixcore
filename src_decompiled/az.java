/*
 * Decompiled with CFR 0.152.
 */
public final class az {
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    public /* synthetic */ int a;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private static final /* synthetic */ int[] lllIlll;

    public az(int n2, int n3, int n4) {
        this.a = lllIlll[0];
        this.e = lllIlll[0];
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final void a() {
        if (this.d == lllIlll[1]) {
            this.e += lllIlll[1];
            if (this.e % lllIlll[2] == 0) {
                this.a += lllIlll[1];
                return;
            }
        } else {
            az lllIIIIIIIlIIlI;
            if (lllIIIIIIIlIIlI.d == 0) {
                lllIIIIIIIlIIlI.a += lllIlll[1];
                return;
            }
            if (lllIIIIIIIlIIlI.d == lllIlll[2] || lllIIIIIIIlIIlI.d == lllIlll[3] || lllIIIIIIIlIIlI.d == lllIlll[4] || lllIIIIIIIlIIlI.d == lllIlll[5]) {
                lllIIIIIIIlIIlI.e += lllIlll[1];
                if (lllIIIIIIIlIIlI.e % lllIlll[2] == 0) {
                    lllIIIIIIIlIIlI.a += lllIlll[1];
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(fh fh2) {
        void lllIIIIIIIIlllI;
        az lllIIIIIIIIllll;
        if (this.d == 0) {
            fh2.a(bt.bw, lllIlll[0], this.a * lllIlll[3], lllIlll[3], lllIlll[3], lllIlll[0], this.b, this.c, lllIlll[0]);
        } else if (lllIIIIIIIIllll.d == lllIlll[1]) {
            lllIIIIIIIIlllI.a(bt.bx, lllIlll[0], lllIIIIIIIIllll.a * lllIlll[6], lllIlll[6], lllIlll[6], lllIlll[0], lllIIIIIIIIllll.b, lllIIIIIIIIllll.c, lllIlll[7]);
        } else if (lllIIIIIIIIllll.d == lllIlll[2]) {
            lllIIIIIIIIlllI.a(bt.bQ, lllIlll[0], lllIIIIIIIIllll.a * lllIlll[8], lllIlll[9], lllIlll[8], lllIlll[0], lllIIIIIIIIllll.b + lllIlll[6], lllIIIIIIIIllll.c + lllIlll[4], lllIlll[6]);
        } else if (lllIIIIIIIIllll.d == lllIlll[3]) {
            lllIIIIIIIIlllI.a(bt.bN, lllIlll[0], lllIIIIIIIIllll.a << lllIlll[3], lllIlll[10], lllIlll[10], lllIlll[0], lllIIIIIIIIllll.b + lllIlll[6], lllIIIIIIIIllll.c + lllIlll[4], lllIlll[6]);
        } else if (lllIIIIIIIIllll.d == lllIlll[4]) {
            lllIIIIIIIIlllI.a(bt.bO, lllIlll[0], lllIIIIIIIIllll.a << lllIlll[3], lllIlll[10], lllIlll[10], lllIlll[0], lllIIIIIIIIllll.b + lllIlll[6], lllIIIIIIIIllll.c + lllIlll[4], lllIlll[6]);
        } else if (lllIIIIIIIIllll.d == lllIlll[5]) {
            lllIIIIIIIIlllI.a(bt.bP, lllIlll[0], lllIIIIIIIIllll.a * lllIlll[9], lllIlll[9], lllIlll[9], lllIlll[0], lllIIIIIIIIllll.b + lllIlll[6], lllIIIIIIIIllll.c + lllIlll[4], lllIlll[6]);
        }
    }

    static {
        az.lIllIll();
    }

    private static void lIllIll() {
        lllIlll = new int[11];
        az.lllIlll[0] = " ".length() << "   ".length() & ~(" ".length() << "   ".length());
        az.lllIlll[1] = " ".length();
        az.lllIlll[2] = " ".length() << " ".length();
        az.lllIlll[3] = "   ".length();
        az.lllIlll[4] = " ".length() << (" ".length() << " ".length());
        az.lllIlll[5] = 0x82 ^ 0x87;
        az.lllIlll[6] = (0x57 ^ 0x52) << (" ".length() << " ".length());
        az.lllIlll[7] = 0xAF ^ 0x8E;
        az.lllIlll[8] = 0xBB ^ 0xB4;
        az.lllIlll[9] = (0x82 ^ 0x85) << " ".length();
        az.lllIlll[10] = " ".length() << "   ".length();
    }
}

