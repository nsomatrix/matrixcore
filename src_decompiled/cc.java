/*
 * Decompiled with CFR 0.152.
 */
public final class cc
extends ay {
    private /* synthetic */ String[] e;
    public /* synthetic */ ex d;
    private /* synthetic */ int f;
    private static final /* synthetic */ int[] llIlI;

    public cc() {
        this.f = llIlI[0];
        if (bq.A <= llIlI[1]) {
            this.f = llIlI[2];
        }
        this.d = new ex();
        this.d.a = this.f + llIlI[2];
        this.d.b = bq.B - fj.cs - llIlI[3];
        this.d.c = bq.A - llIlI[4] * (this.f + llIlI[2]);
        this.d.d = fj.cs + llIlI[4];
        this.d.e = llIlI[5];
        this.c = this.d.m;
    }

    public final void a(String llllllIlIIIlIlI, au llllllIlIIIlIIl, int llllllIlIIIlIII) {
        try {
            cc llllllIlIIIlIll;
            llllllIlIIIlIll.d.a("");
            llllllIlIIIlIll.d.c(llllllIlIIIlIII);
            llllllIlIIIlIll.e = fg.o.b(llllllIlIIIlIlI, bq.A - (llllllIlIIIlIll.f << llIlI[5]));
            llllllIlIIIlIll.a = new au(fa.H, bq.a(), llIlI[6], null);
            llllllIlIIIlIll.b = llllllIlIIIlIIl;
            if (llllllIlIIIlIll.a != null) {
                llllllIlIIIlIll.a.f = bq.A / llIlI[4] - llIlI[7];
                llllllIlIIIlIll.a.g = bq.B - llIlI[8];
            }
            if (llllllIlIIIlIll.b != null) {
                llllllIlIIIlIll.b.f = bq.A / llIlI[4] - llIlI[9];
                llllllIlIIIlIll.b.g = bq.B - llIlI[8];
            }
            if (llllllIlIIIlIll.c != null) {
                llllllIlIIIlIll.c.f = bq.A / llIlI[4] + llIlI[10];
                llllllIlIIIlIll.c.g = bq.B - llIlI[8];
            }
            bq.J = llllllIlIIIlIll;
        }
        catch (Exception llllllIlIIIIlll) {
            llllllIlIIIIlll.printStackTrace();
        }
    }

    public final void b(String llllllIlIIIIIII, au llllllIIlllllll, int llllllIIllllllI) {
        try {
            cc llllllIlIIIIIIl;
            llllllIlIIIIIIl.d.a("");
            llllllIlIIIIIIl.d.c(llllllIIllllllI);
            llllllIlIIIIIIl.e = fg.o.b(llllllIlIIIIIII, bq.A - (llllllIlIIIIIIl.f << llIlI[5]));
            llllllIlIIIIIIl.b = llllllIIlllllll;
            llllllIlIIIIIIl.c = null;
            if (llllllIlIIIIIIl.b != null) {
                llllllIlIIIIIIl.b.f = bq.A / llIlI[4] - llIlI[9];
                llllllIlIIIIIIl.b.g = bq.B - llIlI[8];
            }
            bq.J = llllllIlIIIIIIl;
        }
        catch (Exception llllllIIlllllIl) {
            llllllIIlllllIl.printStackTrace();
        }
    }

    @Override
    public final void a(fh fh2) {
        bq.N.a(fh2, this.f, bq.B - llIlI[11] - fj.cu, bq.A - (this.f << llIlI[5]), llIlI[12], this.e, null);
        this.d.a(fh2);
        super.a(fh2);
    }

    @Override
    public final void a(int n2) {
        this.d.a(n2);
        super.a(n2);
    }

    @Override
    public final void a() {
        this.d.c();
        super.a();
    }

    static {
        cc.lIIlI();
    }

    private static void lIIlI() {
        llIlI = new int[13];
        cc.llIlI[0] = (0xE ^ 0xB) << "   ".length();
        cc.llIlI[1] = (0xB6 ^ 0xBD) << (" ".length() << (" ".length() << " ".length()));
        cc.llIlI[2] = (0x85 ^ 0x80) << " ".length();
        cc.llIlI[3] = 0x4C ^ 0x67;
        cc.llIlI[4] = " ".length() << " ".length();
        cc.llIlI[5] = " ".length();
        cc.llIlI[6] = 480 + 4306 - 1088 + 743 << " ".length();
        cc.llIlI[7] = (0x75 ^ 0x70) << (0x1B ^ 0x1E);
        cc.llIlI[8] = (0x91 ^ 0x9C) << " ".length();
        cc.llIlI[9] = 0xA9 ^ 0x8A;
        cc.llIlI[10] = (0x28 ^ 0x23) << "   ".length();
        cc.llIlI[11] = 0x6B ^ 0x26;
        cc.llIlI[12] = 0xF1 ^ 0xB4;
    }
}

