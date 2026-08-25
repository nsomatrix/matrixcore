/*
 * Decompiled with CFR 0.152.
 */
public final class ef
extends fj
implements bu {
    private static /* synthetic */ ef l;
    private /* synthetic */ int m;
    private /* synthetic */ int n;
    private /* synthetic */ int o;
    private /* synthetic */ int p;
    private /* synthetic */ int q;
    public /* synthetic */ int a;
    public /* synthetic */ int[] b;
    public /* synthetic */ int[] c;
    public /* synthetic */ int[] d;
    public /* synthetic */ int[] e;
    public /* synthetic */ int[] f;
    public /* synthetic */ String[] g;
    public /* synthetic */ String[] h;
    public /* synthetic */ byte[] i;
    private /* synthetic */ au r;
    private /* synthetic */ int s;
    public /* synthetic */ boolean j;
    private /* synthetic */ int t;
    private /* synthetic */ int u;
    public static /* synthetic */ String k;
    private static final /* synthetic */ int[] lllIIl;

    static {
        ef.lIlIlI();
        k = "";
    }

    public static ef b() {
        if (l == null) {
            l = new ef();
        }
        return l;
    }

    public ef() {
        ef llllIlIlllllIIl;
        this.j = lllIIl[0];
        this.t = bq.B / lllIIl[1] - lllIIl[1];
        this.u = bq.B / lllIIl[1] + lllIIl[1];
        this.m = lllIIl[2];
        this.n = lllIIl[3];
        if (bq.A < lllIIl[4]) {
            this.m = lllIIl[5];
        }
        llllIlIlllllIIl.o = lllIIl[6];
        llllIlIlllllIIl.p = (bq.A - lllIIl[7] * llllIlIlllllIIl.m >> lllIIl[0]) - lllIIl[8];
        llllIlIlllllIIl.q = bq.D - (llllIlIlllllIIl.n >> lllIIl[0]) + lllIIl[9];
        if (bq.g && bq.A > lllIIl[10]) {
            llllIlIlllllIIl.m = lllIIl[11];
            llllIlIlllllIIl.o = lllIIl[12];
            llllIlIlllllIIl.n = lllIIl[13];
            llllIlIlllllIIl.p = (bq.A - lllIIl[7] * llllIlIlllllIIl.m >> lllIIl[0]) - lllIIl[14];
            llllIlIlllllIIl.q = bq.D - (llllIlIlllllIIl.n >> lllIIl[0]);
            if (bq.A < lllIIl[15]) {
                llllIlIlllllIIl.o = lllIIl[16];
                llllIlIlllllIIl.p = (bq.A - lllIIl[7] * llllIlIlllllIIl.m >> lllIIl[0]) - lllIIl[16];
            }
        }
        llllIlIlllllIIl.cp = null;
        llllIlIlllllIIl.r = new au(fa.bo, llllIlIlllllIIl, lllIIl[17], null);
        llllIlIlllllIIl.cq = new au("", llllIlIlllllIIl, lllIIl[17], null);
        llllIlIlllllIIl.cr = new au(fa.av, llllIlIlllllIIl, lllIIl[18], null);
        llllIlIlllllIIl.cp = llllIlIlllllIIl.r;
        if (bq.g) {
            llllIlIlllllIIl.cq = null;
            llllIlIlllllIIl.cp = null;
        }
        if (bq.g && bq.A >= lllIIl[15]) {
            llllIlIlllllIIl.cr.f = bq.A / lllIIl[1] + lllIIl[19];
            llllIlIlllllIIl.cr.g = bq.B - lllIIl[20];
        }
    }

    private void f() {
        if (this.g[this.a] != null) {
            k = this.g[this.a];
            ei.a().b(this.g[this.a]);
            bq.c(fa.y);
            bq.f = lllIIl[0];
        } else {
            aw.b().c();
        }
    }

    @Override
    public final void d() {
        ef llllIlIlllIllII;
        super.d();
        if (bq.n[lllIIl[16]]) {
            this.a += lllIIl[0];
            if (this.a >= lllIIl[7]) {
                this.a = lllIIl[21];
            }
        }
        if (bq.n[lllIIl[22]]) {
            llllIlIlllIllII.a -= lllIIl[0];
            if (llllIlIlllIllII.a < 0) {
                llllIlIlllIllII.a = lllIIl[1];
            }
        }
        if (bq.p && bq.b(llllIlIlllIllII.p, llllIlIlllIllII.q, lllIIl[7] * (llllIlIlllIllII.m + llllIlIlllIllII.o), llllIlIlllIllII.n)) {
            int llllIlIlllIlIlI = (bq.s - llllIlIlllIllII.p) / (llllIlIlllIllII.m + llllIlIlllIllII.o);
            if (llllIlIlllIlIlI > lllIIl[1]) {
                llllIlIlllIlIlI = lllIIl[1];
            }
            if (llllIlIlllIlIlI < 0) {
                llllIlIlllIlIlI = lllIIl[21];
            }
            llllIlIlllIllII.a = llllIlIlllIlIlI;
        }
        if (bq.r) {
            if (bq.b(llllIlIlllIllII.p, llllIlIlllIllII.q, lllIIl[7] * (llllIlIlllIllII.m + llllIlIlllIllII.o), llllIlIlllIllII.n)) {
                llllIlIlllIllII.s = lllIIl[8];
            } else {
                llllIlIlllIllII.a = lllIIl[23];
            }
        }
        bq.j();
        bq.i();
    }

    @Override
    public final void a() {
        ef llllIlIlllIIlIl;
        if ((bt.i += lllIIl[0]) > bq.A * lllIIl[7] + lllIIl[24]) {
            bt.i = lllIIl[24];
        }
        if (llllIlIlllIIlIl.s > 0) {
            llllIlIlllIIlIl.s -= lllIIl[0];
            if (llllIlIlllIIlIl.s == 0 && llllIlIlllIIlIl.a >= 0) {
                llllIlIlllIIlIl.f();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void c() {
        ef llllIlIlllIIIlI;
        void llllIlIlllIIIIl;
        fb.c();
        System.gc();
        super.c();
        int n2 = lllIIl[21];
        while (llllIlIlllIIIIl < llllIlIlllIIIlI.g.length) {
            if (llllIlIlllIIIlI.g[llllIlIlllIIIIl] != null) {
                llllIlIlllIIIlI.j = lllIIl[21];
                break;
            }
            ++llllIlIlllIIIIl;
        }
        if (llllIlIlllIIIlI.j) {
            aw.b().c();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        void llllIlIllIlIlIl;
        ef llllIlIllIlIllI;
        int llllIlIllIlIlII;
        bq.a(fh2);
        int n2 = lllIIl[21];
        while (llllIlIllIlIlII < lllIIl[7]) {
            if (llllIlIllIlIllI.a == llllIlIllIlIlII) {
                dp.d(llllIlIllIlIllI.p + llllIlIllIlIlII * (llllIlIllIlIllI.m + llllIlIllIlIllI.o), llllIlIllIlIllI.q, llllIlIllIlIllI.m, llllIlIllIlIllI.n, (fh)llllIlIllIlIlIl);
            } else {
                dp.c(llllIlIllIlIllI.p + llllIlIllIlIlII * (llllIlIllIlIllI.m + llllIlIllIlIllI.o), llllIlIllIlIllI.q, llllIlIllIlIllI.m, llllIlIllIlIllI.n, (fh)llllIlIllIlIlIl);
            }
            dp.b(llllIlIllIlIllI.p + llllIlIllIlIlII * (llllIlIllIlIllI.m + llllIlIllIlIllI.o), llllIlIllIlIllI.q, llllIlIllIlIllI.m, llllIlIllIlIllI.n, (fh)llllIlIllIlIlIl);
            ++llllIlIllIlIlII;
        }
        llllIlIllIlIlII = lllIIl[21];
        while (n2 < lllIIl[7]) {
            if (llllIlIllIlIllI.g[llllIlIllIlIlII] != null) {
                int llllIlIllIIllIl;
                int llllIlIllIIllll;
                dq llllIlIllIlIIll = bt.v[llllIlIllIlIllI.b[llllIlIllIlIlII]];
                dq llllIlIllIlIIlI = bt.v[llllIlIllIlIllI.c[llllIlIllIlIlII]];
                dq llllIlIllIlIIIl = bt.v[llllIlIllIlIllI.d[llllIlIllIlIlII]];
                dq llllIlIllIlIIII = bt.v[llllIlIllIlIllI.e[llllIlIllIlIlII]];
                if (llllIlIllIlIIll.a != null && llllIlIllIlIIll.a.length >= lllIIl[25]) {
                    llllIlIllIIllll = lllIIl[21];
                    while (llllIlIllIIllll < llllIlIllIlIIll.a.length) {
                        if (llllIlIllIlIIll.a[llllIlIllIIllll] == null || !ev.a(llllIlIllIlIIll.a[llllIlIllIIllll].a)) {
                            v.f();
                            llllIlIllIlIIll = v.b(llllIlIllIlIllI.i[llllIlIllIlIlII]);
                            break;
                        }
                        ++llllIlIllIIllll;
                    }
                } else {
                    v.f();
                    llllIlIllIlIIll = v.b(llllIlIllIlIllI.i[llllIlIllIlIlII]);
                }
                llllIlIllIIllll = llllIlIllIlIllI.p + llllIlIllIlIlII * (llllIlIllIlIllI.m + llllIlIllIlIllI.o) + llllIlIllIlIllI.m / lllIIl[1];
                int llllIlIllIIlllI = lllIIl[21];
                if (!bq.g) {
                    llllIlIllIIllIl = llllIlIllIlIllI.q + llllIlIllIlIllI.n / lllIIl[1] + lllIIl[26];
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIII.a[v.bC[ef.lllIIl[21]][ef.lllIIl[7]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[7]][lllIIl[0]] + llllIlIllIlIIII.a[v.bC[ef.lllIIl[21]][ef.lllIIl[7]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[7]][lllIIl[1]] + llllIlIllIlIIII.a[v.bC[ef.lllIIl[21]][ef.lllIIl[7]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIlI.a[v.bC[ef.lllIIl[21]][ef.lllIIl[0]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[0]][lllIIl[0]] + llllIlIllIlIIlI.a[v.bC[ef.lllIIl[21]][ef.lllIIl[0]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[0]][lllIIl[1]] + llllIlIllIlIIlI.a[v.bC[ef.lllIIl[21]][ef.lllIIl[0]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIIl.a[v.bC[ef.lllIIl[21]][ef.lllIIl[1]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[1]][lllIIl[0]] + llllIlIllIlIIIl.a[v.bC[ef.lllIIl[21]][ef.lllIIl[1]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[1]][lllIIl[1]] + llllIlIllIlIIIl.a[v.bC[ef.lllIIl[21]][ef.lllIIl[1]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIll.a[v.bC[ef.lllIIl[21]][ef.lllIIl[21]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[21]][lllIIl[0]] + llllIlIllIlIIll.a[v.bC[ef.lllIIl[21]][ef.lllIIl[21]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[21]][lllIIl[1]] + llllIlIllIlIIll.a[v.bC[ef.lllIIl[21]][ef.lllIIl[21]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    if (llllIlIllIlIllI.a == llllIlIllIlIlII) {
                        byte[] byArray = new byte[lllIIl[22]];
                        byArray[ef.lllIIl[21]] = lllIIl[21];
                        byArray[ef.lllIIl[0]] = lllIIl[27];
                        byArray[ef.lllIIl[1]] = lllIIl[21];
                        byArray[ef.lllIIl[7]] = lllIIl[5];
                        fg.o.a((fh)llllIlIllIlIlIl, String.valueOf(fa.fQ[lllIIl[21]]) + ec.a(byArray) + llllIlIllIlIllI.g[llllIlIllIlIlII], bq.C, llllIlIllIlIllI.q - lllIIl[28], lllIIl[1]);
                        byte[] byArray2 = new byte[lllIIl[22]];
                        byArray2[ef.lllIIl[21]] = lllIIl[21];
                        byArray2[ef.lllIIl[0]] = lllIIl[27];
                        byArray2[ef.lllIIl[1]] = lllIIl[21];
                        byArray2[ef.lllIIl[7]] = lllIIl[5];
                        fg.e.a((fh)llllIlIllIlIlIl, String.valueOf(fa.fQ[lllIIl[0]]) + ec.a(byArray2) + llllIlIllIlIllI.f[llllIlIllIlIlII], bq.C, llllIlIllIlIllI.q - lllIIl[29], lllIIl[1], fg.b);
                        fg.e.a((fh)llllIlIllIlIlIl, llllIlIllIlIllI.h[llllIlIllIlIlII], bq.C, llllIlIllIlIllI.q - lllIIl[26], lllIIl[1], fg.b);
                    }
                } else {
                    llllIlIllIIllIl = llllIlIllIlIllI.q + llllIlIllIlIllI.n / lllIIl[1] - lllIIl[8];
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIII.a[v.bC[ef.lllIIl[21]][ef.lllIIl[7]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[7]][lllIIl[0]] + llllIlIllIlIIII.a[v.bC[ef.lllIIl[21]][ef.lllIIl[7]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[7]][lllIIl[1]] + llllIlIllIlIIII.a[v.bC[ef.lllIIl[21]][ef.lllIIl[7]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIlI.a[v.bC[ef.lllIIl[21]][ef.lllIIl[0]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[0]][lllIIl[0]] + llllIlIllIlIIlI.a[v.bC[ef.lllIIl[21]][ef.lllIIl[0]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[0]][lllIIl[1]] + llllIlIllIlIIlI.a[v.bC[ef.lllIIl[21]][ef.lllIIl[0]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIIl.a[v.bC[ef.lllIIl[21]][ef.lllIIl[1]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[1]][lllIIl[0]] + llllIlIllIlIIIl.a[v.bC[ef.lllIIl[21]][ef.lllIIl[1]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[1]][lllIIl[1]] + llllIlIllIlIIIl.a[v.bC[ef.lllIIl[21]][ef.lllIIl[1]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    ev.a((fh)llllIlIllIlIlIl, llllIlIllIlIIll.a[v.bC[ef.lllIIl[21]][ef.lllIIl[21]][ef.lllIIl[21]]].a, llllIlIllIIllll + v.bC[lllIIl[21]][lllIIl[21]][lllIIl[0]] + llllIlIllIlIIll.a[v.bC[ef.lllIIl[21]][ef.lllIIl[21]][ef.lllIIl[21]]].b, llllIlIllIIllIl - v.bC[lllIIl[21]][lllIIl[21]][lllIIl[1]] + llllIlIllIlIIll.a[v.bC[ef.lllIIl[21]][ef.lllIIl[21]][ef.lllIIl[21]]].c, lllIIl[21], lllIIl[21]);
                    fg.o.a((fh)llllIlIllIlIlIl, llllIlIllIlIllI.g[llllIlIllIlIlII], llllIlIllIIllll, llllIlIllIlIllI.q + llllIlIllIlIllI.n / lllIIl[1] + lllIIl[8], lllIIl[1]);
                    byte[] byArray = new byte[lllIIl[22]];
                    byArray[ef.lllIIl[21]] = lllIIl[21];
                    byArray[ef.lllIIl[0]] = lllIIl[27];
                    byArray[ef.lllIIl[1]] = lllIIl[21];
                    byArray[ef.lllIIl[7]] = lllIIl[5];
                    fg.e.a((fh)llllIlIllIlIlIl, String.valueOf(fa.fQ[lllIIl[0]]) + ec.a(byArray) + llllIlIllIlIllI.f[llllIlIllIlIlII], llllIlIllIIllll, llllIlIllIlIllI.q + llllIlIllIlIllI.n / lllIIl[1] + lllIIl[30], lllIIl[1]);
                    if (bq.A > lllIIl[10]) {
                        fg.e.a((fh)llllIlIllIlIlIl, llllIlIllIlIllI.h[llllIlIllIlIlII], llllIlIllIIllll, llllIlIllIlIllI.q + llllIlIllIlIllI.n / lllIIl[1] + lllIIl[31], lllIIl[1]);
                    }
                }
            }
            ++llllIlIllIlIlII;
        }
        super.a(fh2);
    }

    @Override
    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                ef llllIlIllIIlIlI;
                llllIlIllIIlIlI.f();
                return;
            }
            case 1001: {
                ej.a().c();
                bq.k.o();
            }
        }
    }

    private static void lIlIlI() {
        lllIIl = new int[32];
        ef.lllIIl[0] = " ".length();
        ef.lllIIl[1] = " ".length() << " ".length();
        ef.lllIIl[2] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        ef.lllIIl[3] = 0x47 ^ 0x12;
        ef.lllIIl[4] = (0x7E ^ 0x7B) << (0x35 ^ 0x30);
        ef.lllIIl[5] = " ".length() << (0x47 ^ 0x42);
        ef.lllIIl[6] = 0x63 ^ 0x64;
        ef.lllIIl[7] = "   ".length();
        ef.lllIIl[8] = 0xB7 ^ 0xB2;
        ef.lllIIl[9] = (0x63 ^ 0x66) << " ".length();
        ef.lllIIl[10] = (5 ^ 0x1C) << "   ".length();
        ef.lllIIl[11] = (0x24 ^ 1) << " ".length();
        ef.lllIIl[12] = 0x10 ^ 9;
        ef.lllIIl[13] = (0x6A ^ 0x5D) << " ".length();
        ef.lllIIl[14] = (0xC3 ^ 0xC6) << (" ".length() << " ".length());
        ef.lllIIl[15] = (0x59 ^ 0x5C) << ("   ".length() << " ".length());
        ef.lllIIl[16] = "   ".length() << " ".length();
        ef.lllIIl[17] = (0x47 ^ 0x3A) << "   ".length();
        ef.lllIIl[18] = 215 + 680 - 764 + 870;
        ef.lllIIl[19] = (0x15 ^ 0x1E) << "   ".length();
        ef.lllIIl[20] = (0x3D ^ 0x30) << " ".length();
        ef.lllIIl[21] = (0x5F ^ 0x58) << " ".length() & ~((0x83 ^ 0x84) << " ".length());
        ef.lllIIl[22] = " ".length() << (" ".length() << " ".length());
        ef.lllIIl[23] = -" ".length();
        ef.lllIIl[24] = (0x61 ^ 0x78) << (" ".length() << " ".length());
        ef.lllIIl[25] = " ".length() << "   ".length();
        ef.lllIIl[26] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        ef.lllIIl[27] = (0x5B ^ 0x46) << " ".length();
        ef.lllIIl[28] = 0xA7 ^ 0x8A;
        ef.lllIIl[29] = (0x22 ^ 0x25) << (" ".length() << " ".length());
        ef.lllIIl[30] = (0xAA ^ 0xA1) << " ".length();
        ef.lllIIl[31] = (0x1E ^ 0xF) << " ".length();
    }
}

