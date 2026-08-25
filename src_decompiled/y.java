/*
 * Decompiled with CFR 0.152.
 */
public final class y
extends be
implements bu {
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private /* synthetic */ String[] j;
    private /* synthetic */ int k;
    private /* synthetic */ int l;
    private /* synthetic */ int m;
    private /* synthetic */ v n;
    private /* synthetic */ boolean o;
    private /* synthetic */ int p;
    private /* synthetic */ String[] q;
    public /* synthetic */ au a;
    public static /* synthetic */ y b;
    private static final /* synthetic */ int[] lIIlIl;

    public y() {
        this.g = lIIlIl[0];
        this.o = lIIlIl[1];
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, int n2, v v2) {
        byte[] byArray = new byte[lIIlIl[2]];
        byArray[y.lIIlIl[1]] = lIIlIl[1];
        byArray[y.lIIlIl[3]] = lIIlIl[4];
        String[] stringArray = eb.a(string, ec.a(byArray), lIIlIl[1]);
        if (stringArray.length == lIIlIl[3]) {
            y.b(stringArray[lIIlIl[1]], lIIlIl[5], v2);
        } else {
            void lllllIlllllllII;
            void lllllIllllllIll;
            b = y.b((String)lllllIllllllIll[lIIlIl[1]], lIIlIl[5], (v)lllllIlllllllII);
            y.b((String)lllllIllllllIll[lIIlIl[1]], lIIlIl[5], (v)lllllIlllllllII).p = lIIlIl[1];
            y.b.q = lllllIllllllIll;
            y.b.a = new au(fa.ab, b, lIIlIl[6], null);
        }
    }

    public static y b(String string, int n2, v v2) {
        y y2 = new y();
        if (string.length() < lIIlIl[4]) {
            y2.g = lIIlIl[7];
        }
        if (bq.A == lIIlIl[8]) {
            lllllIlllllIIll.g = lIIlIl[8];
        }
        y2.j = fg.l.b(string, y2.g - lIIlIl[4]);
        y2.h = n2;
        y2.n = v2;
        y2.k = v2.j;
        y2.l = v2.k;
        v2.g = y2;
        y2.i = lIIlIl[9];
        be.c.addElement(y2);
        return y2;
    }

    @Override
    public final void a() {
        y lllllIlllllIIIl;
        if (this.n != null) {
            this.k = this.n.j;
            this.l = this.n.k;
            this.m = this.n.ah + lIIlIl[4];
        }
        if (lllllIlllllIIIl.h > 0) {
            lllllIlllllIIIl.h -= lIIlIl[3];
        }
        if (lllllIlllllIIIl.i > lIIlIl[3]) {
            lllllIlllllIIIl.i -= lIIlIl[3];
        }
        if (lllllIlllllIIIl.n != null && lllllIlllllIIIl.n.g != null && lllllIlllllIIIl.n.g != lllllIlllllIIIl || lllllIlllllIIIl.n != null && lllllIlllllIIIl.n.g == null || lllllIlllllIIIl.h == 0) {
            be.e.removeElement(lllllIlllllIIIl);
            be.c.removeElement(lllllIlllllIIIl);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        int n2 = this.k;
        int n3 = this.l;
        fh2.a(lIIlIl[10]);
        fh2.b(n2 - this.g / lIIlIl[2] - lIIlIl[3], n3 - this.m - lIIlIl[11] + this.i - this.j.length * lIIlIl[12] - lIIlIl[4], this.g + lIIlIl[2], (this.j.length + lIIlIl[3]) * lIIlIl[12] + lIIlIl[3], lIIlIl[12], lIIlIl[12]);
        fh2.a(lIIlIl[1]);
        fh2.a(n2 - this.g / lIIlIl[2] - lIIlIl[3], n3 - this.m - lIIlIl[11] + this.i - this.j.length * lIIlIl[12] - lIIlIl[4], this.g + lIIlIl[3], (this.j.length + lIIlIl[3]) * lIIlIl[12], lIIlIl[12], lIIlIl[12]);
        ev.a(fh2, lIIlIl[13], n2 - lIIlIl[14], n3 - this.m - lIIlIl[11] + this.i + lIIlIl[2], lIIlIl[1], lIIlIl[15]);
        int n4 = lIIlIl[1];
        while (n4 < this.j.length) {
            void lllllIllllIlIII;
            void lllllIllllIlIIl;
            void lllllIllllIIlll;
            y lllllIllllIlIll;
            void lllllIllllIlIlI;
            fg.g.a((fh)lllllIllllIlIlI, lllllIllllIlIll.j[lllllIllllIIlll], (int)lllllIllllIlIIl, (int)(lllllIllllIlIII - lllllIllllIlIll.m - lIIlIl[11] + lllllIllllIlIll.i + lllllIllllIIlll * lIIlIl[12] - lllllIllllIlIll.j.length * lIIlIl[12] - lIIlIl[16]), lIIlIl[2]);
            ++lllllIllllIIlll;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(int n2, Object object) {
        if (n2 == lIIlIl[6]) {
            void lllllIllllIIIlI;
            int n3 = y.b.p;
            if (++n3 >= y.b.q.length) {
                y.b.n.g = null;
                b = null;
                return;
            }
            y lllllIllllIIIIl = y.b(y.b.q[lllllIllllIIIlI], y.b.h, y.b.n);
            y.b(y.b.q[lllllIllllIIIlI], y.b.h, y.b.n).p = lllllIllllIIIlI;
            lllllIllllIIIIl.q = y.b.q;
            lllllIllllIIIIl.a = y.b.a;
            b = lllllIllllIIIIl;
        }
    }

    static {
        y.llIII();
    }

    private static void llIII() {
        lIIlIl = new int[17];
        y.lIIlIl[0] = (0xB8 ^ 0xA1) << (" ".length() << " ".length());
        y.lIIlIl[1] = (0x73 ^ 0x76) << "   ".length() & ~((0xA8 ^ 0xAD) << "   ".length());
        y.lIIlIl[2] = " ".length() << " ".length();
        y.lIIlIl[3] = " ".length();
        y.lIIlIl[4] = (0x68 ^ 0x6D) << " ".length();
        y.lIIlIl[5] = (0x7C ^ 1) << "   ".length();
        y.lIIlIl[6] = (0xE2 ^ 0x9F) << ("   ".length() << " ".length());
        y.lIIlIl[7] = " ".length() << ("   ".length() << " ".length());
        y.lIIlIl[8] = " ".length() << (0xC4 ^ 0xC3);
        y.lIIlIl[9] = 0x34 ^ 0x33;
        y.lIIlIl[10] = 13318692 + 13443437 - 26353367 + 16368453;
        y.lIIlIl[11] = 0x25 ^ 0x2A;
        y.lIIlIl[12] = "   ".length() << (" ".length() << " ".length());
        y.lIIlIl[13] = 348 + 247 - 309 + 655;
        y.lIIlIl[14] = "   ".length();
        y.lIIlIl[15] = 0x58 ^ 0x49;
        y.lIIlIl[16] = " ".length() << (" ".length() << " ".length());
    }
}

