/*
 * Decompiled with CFR 0.152.
 */
public final class eh
extends be {
    private /* synthetic */ bg a;
    private /* synthetic */ int b;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private /* synthetic */ v j;
    private /* synthetic */ short k;
    private /* synthetic */ long l;
    private static final /* synthetic */ int[] lIlIIIIl;

    public eh() {
        this.i = lIlIIIIl[0];
        this.k = (short)lIlIIIIl[1];
        this.l = 0L;
    }

    public static void a(int n2, int n3, int n4, int n5) {
        eh eh2 = new eh();
        new eh().a = bt.w[n2];
        eh2.g = n3;
        eh2.h = n4;
        eh2.k = (short)n5;
        be.c.addElement(eh2);
    }

    public static void a(int n2, int n3, int n4, int n5, byte by2) {
        eh eh2 = new eh();
        new eh().a = bt.w[n2];
        eh2.g = n3;
        eh2.h = n4;
        eh2.k = (short)n5;
        eh2.i = by2;
        be.c.addElement(eh2);
    }

    public static void a(int n2, v v2, int n3) {
        eh eh2 = new eh();
        new eh().a = bt.w[n2];
        eh2.j = v2;
        eh2.k = (short)n3;
        be.c.addElement(eh2);
    }

    public static void b(int n2, v v2, int n3) {
        eh eh2 = new eh();
        new eh().a = bt.w[n2];
        eh2.j = v2;
        eh2.l = System.currentTimeMillis() + (long)(n3 * lIlIIIIl[2]);
        be.c.addElement(eh2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        int llIIlllIllIIIIl;
        eh llIIlllIllIIlII;
        int llIIlllIllIIIlI;
        if (this.j != null) {
            this.g = this.j.j;
            this.h = this.j.k;
        }
        if (bq.e(llIIlllIllIIIlI = llIIlllIllIIlII.g + llIIlllIllIIlII.a.b[llIIlllIllIIlII.b].a * llIIlllIllIIlII.i, llIIlllIllIIIIl = llIIlllIllIIlII.h + llIIlllIllIIlII.a.b[llIIlllIllIIlII.b].b)) {
            void llIIlllIllIIIll;
            ev.a((fh)llIIlllIllIIIll, llIIlllIllIIlII.a.b[llIIlllIllIIlII.b].c, llIIlllIllIIIlI, llIIlllIllIIIIl, llIIlllIllIIlII.i == lIlIIIIl[0] ? lIlIIIIl[1] : lIlIIIIl[3], lIlIIIIl[4]);
        }
    }

    @Override
    public final void a() {
        eh llIIlllIlIlllll;
        if (this.l != 0L) {
            this.b += lIlIIIIl[0];
            if (this.b >= this.a.b.length) {
                this.b = lIlIIIIl[1];
            }
            if (System.currentTimeMillis() - llIIlllIlIlllll.l > 0L) {
                if (llIIlllIlIlllll.a.a == lIlIIIIl[5]) {
                    bq.e = lIlIIIIl[1];
                }
                be.c.removeElement(llIIlllIlIlllll);
            }
        } else {
            llIIlllIlIlllll.b += lIlIIIIl[0];
            if (llIIlllIlIlllll.b >= llIIlllIlIlllll.a.b.length) {
                llIIlllIlIlllll.k = (short)(llIIlllIlIlllll.k - lIlIIIIl[0]);
                if (llIIlllIlIlllll.k <= 0) {
                    if (llIIlllIlIlllll.a.a == lIlIIIIl[5]) {
                        bq.e = lIlIIIIl[1];
                    }
                    be.c.removeElement(llIIlllIlIlllll);
                } else {
                    llIIlllIlIlllll.b = lIlIIIIl[1];
                }
            }
        }
        if (bq.w % lIlIIIIl[6] == 0 && llIIlllIlIlllll.j != null && llIIlllIlIlllll.j != v.f() && !bt.F.contains(llIIlllIlIlllll.j)) {
            be.c.removeElement(llIIlllIlIlllll);
        }
    }

    static {
        eh.llllIII();
    }

    private static void llllIII() {
        lIlIIIIl = new int[7];
        eh.lIlIIIIl[0] = " ".length();
        eh.lIlIIIIl[1] = (0xE ^ 7) << " ".length() & ~((0x3E ^ 0x37) << " ".length());
        eh.lIlIIIIl[2] = (0xF0 ^ 0x8D) << "   ".length();
        eh.lIlIIIIl[3] = " ".length() << " ".length();
        eh.lIlIIIIl[4] = "   ".length();
        eh.lIlIIIIl[5] = (0x5A ^ 0x55) << "   ".length();
        eh.lIlIIIIl[6] = 0xAE ^ 0xA5;
    }
}

