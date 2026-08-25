/*
 * Decompiled with CFR 0.152.
 */
public final class aw
extends fj
implements bu {
    private static /* synthetic */ aw a;
    private static /* synthetic */ ex b;
    private static /* synthetic */ int c;
    private static /* synthetic */ int d;
    private static /* synthetic */ int e;
    private static /* synthetic */ int[][] f;
    private static /* synthetic */ int[] g;
    private static /* synthetic */ int[] h;
    private /* synthetic */ au i;
    private /* synthetic */ au j;
    private /* synthetic */ int k;
    private static final /* synthetic */ int[] lIIIIIlI;

    static {
        aw.llIIlIl();
        int[][] nArrayArray = new int[lIIIIIlI[0]][];
        int[] nArray = new int[lIIIIIlI[2]];
        nArray[aw.lIIIIIlI[1]] = lIIIIIlI[3];
        nArray[aw.lIIIIIlI[4]] = lIIIIIlI[5];
        nArray[aw.lIIIIIlI[0]] = lIIIIIlI[6];
        nArray[aw.lIIIIIlI[7]] = lIIIIIlI[8];
        nArrayArray[aw.lIIIIIlI[1]] = nArray;
        int[] nArray2 = new int[lIIIIIlI[2]];
        nArray2[aw.lIIIIIlI[1]] = lIIIIIlI[0];
        nArray2[aw.lIIIIIlI[4]] = lIIIIIlI[9];
        nArray2[aw.lIIIIIlI[0]] = lIIIIIlI[10];
        nArray2[aw.lIIIIIlI[7]] = lIIIIIlI[11];
        nArrayArray[aw.lIIIIIlI[4]] = nArray2;
        f = nArrayArray;
        int[] nArray3 = new int[lIIIIIlI[0]];
        nArray3[aw.lIIIIIlI[1]] = lIIIIIlI[12];
        g = nArray3;
        int[] nArray4 = new int[lIIIIIlI[0]];
        nArray4[aw.lIIIIIlI[1]] = lIIIIIlI[13];
        nArray4[aw.lIIIIIlI[4]] = lIIIIIlI[4];
        h = nArray4;
    }

    public static aw b() {
        if (a == null) {
            a = new aw();
        }
        return a;
    }

    public aw() {
        this.k = lIIIIIlI[1];
        if (bq.A == lIIIIIlI[14]) {
            bt.b(lIIIIIlI[14], lIIIIIlI[15]);
            bt.ca = (bq.A - lIIIIIlI[14]) / lIIIIIlI[0];
            bt.bZ = lIIIIIlI[1];
        } else {
            bt.b(lIIIIIlI[16], lIIIIIlI[17]);
            bt.ca = (bq.A - lIIIIIlI[16]) / lIIIIIlI[0];
            bt.bZ = (bq.B - lIIIIIlI[18]) / lIIIIIlI[0];
        }
        c = lIIIIIlI[4];
        b = new ex();
        new ex().l = fa.bA;
        aw.b.c = lIIIIIlI[19];
        aw.b.a = bt.ca + lIIIIIlI[20];
        aw.b.a = bt.ca + bt.cc / lIIIIIlI[0] - aw.b.c / lIIIIIlI[0];
        aw.b.b = bt.bZ + lIIIIIlI[21];
        if (bq.A == lIIIIIlI[14]) {
            aw.b.c = lIIIIIlI[22];
        }
        aw.b.d = lIIIIIlI[5];
        aw.b.e = lIIIIIlI[4];
        b.c(lIIIIIlI[1]);
        c = lIIIIIlI[4];
        d = lIIIIIlI[1];
        this.cq = new au(fa.bz, this, lIIIIIlI[23], null);
        this.cp = new au(fa.bE, this, lIIIIIlI[24], null);
        this.i = new au("", this, lIIIIIlI[25], null, bt.ca + bt.cc / lIIIIIlI[0] - fj.ct / lIIIIIlI[0], bt.bZ + lIIIIIlI[26] + lIIIIIlI[27]);
        this.j = new au("", this, lIIIIIlI[28], null, bt.ca + bt.cc / lIIIIIlI[0] - fj.ct / lIIIIIlI[0], bt.bZ + lIIIIIlI[26] + lIIIIIlI[26]);
        this.cr = aw.b.m;
    }

    @Override
    public final void c() {
        c = bq.w % lIIIIIlI[0];
        d = bq.w % lIIIIIlI[2];
        super.c();
    }

    @Override
    public final void a(int n2) {
        b.a(n2);
    }

    @Override
    public final void a() {
        aw llIllllIIIllllI;
        if ((bt.i += lIIIIIlI[4]) > bq.A * lIIIIIlI[7] + lIIIIIlI[19]) {
            bt.i = lIIIIIlI[19];
        }
        if (bq.g && bq.A >= lIIIIIlI[29]) {
            if (llIllllIIIllllI.cp != null) {
                llIllllIIIllllI.cp.f = bq.A / lIIIIIlI[0] - lIIIIIlI[30];
                llIllllIIIllllI.cp.g = bq.B - lIIIIIlI[5];
            }
            if (llIllllIIIllllI.cq != null) {
                llIllllIIIllllI.cq.f = bq.A / lIIIIIlI[0] - lIIIIIlI[31];
                llIllllIIIllllI.cq.g = bq.B - lIIIIIlI[5];
            }
            if (llIllllIIIllllI.cr != null) {
                llIllllIIIllllI.cr.f = bq.A / lIIIIIlI[0] + lIIIIIlI[32];
                llIllllIIIllllI.cr.g = bq.B - lIIIIIlI[5];
            }
        }
        if (llIllllIIIllllI.j != null) {
            llIllllIIIllllI.j.c();
        }
        if (llIllllIIIllllI.i != null) {
            llIllllIIIllllI.i.c();
        }
    }

    @Override
    public final void d() {
        if (bq.n[lIIIIIlI[0]] && (e -= lIIIIIlI[4]) < 0) {
            e = fa.dT.length - lIIIIIlI[4];
        }
        if (bq.n[lIIIIIlI[33]] && (e += lIIIIIlI[4]) >= fa.dT.length) {
            e = lIIIIIlI[1];
        }
        if (e == 0) {
            llIllllIIIlllII.cr = aw.b.m;
            b.c();
        }
        if (e == lIIIIIlI[4]) {
            if (bq.n[lIIIIIlI[2]] && (c -= lIIIIIlI[4]) < 0) {
                c = fa.dU.length - lIIIIIlI[4];
            }
            if (bq.n[lIIIIIlI[34]] && (c += lIIIIIlI[4]) > fa.dU.length - lIIIIIlI[4]) {
                c = lIIIIIlI[1];
            }
            llIllllIIIlllII.cr = null;
        }
        if (e == lIIIIIlI[0]) {
            if (bq.n[lIIIIIlI[2]] && (d -= lIIIIIlI[4]) < 0) {
                d = fa.cf[lIIIIIlI[1]].length - lIIIIIlI[4];
            }
            if (bq.n[lIIIIIlI[34]] && (d += lIIIIIlI[4]) > fa.cf[lIIIIIlI[1]].length - lIIIIIlI[4]) {
                d = lIIIIIlI[1];
            }
        }
        if (bq.r && bq.b(bt.ca + lIIIIIlI[35], bt.bZ + lIIIIIlI[36], bt.cc - lIIIIIlI[35], fj.cs)) {
            e = lIIIIIlI[1];
        }
        super.d();
        bq.j();
        bq.i();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        int llIllllIIIIllII = lIIIIIlI[1];
        try {
            aw llIllllIIIIlllI;
            void llIllllIIIIllIl;
            bq.a((fh)llIllllIIIIllIl);
            int llIllllIIIIlIll = lIIIIIlI[4];
            dp.a(bt.ca, bt.bZ, bt.cc, bt.cd, (fh)llIllllIIIIllIl);
            int llIllllIIIIlIlI = lIIIIIlI[37];
            if (bq.A == lIIIIIlI[14]) {
                llIllllIIIIlIlI = lIIIIIlI[38];
            }
            llIllllIIIIlIll = lIIIIIlI[4];
            int llIllllIIIIlIIl = f[c][d];
            int llIllllIIIIlIII = g[c];
            int llIllllIIIIIlll = h[c];
            llIllllIIIIlIll = lIIIIIlI[4];
            dq llIllllIIIIIllI = bt.v[llIllllIIIIlIIl];
            dq llIllllIIIIIlIl = bt.v[llIllllIIIIlIII];
            dq llIllllIIIIIlII = bt.v[llIllllIIIIIlll];
            int llIllllIIIIIIll = bq.A / lIIIIIlI[0];
            int llIllllIIIIIIlI = bt.bZ + lIIIIIlI[39];
            llIllllIIIIlIll = lIIIIIlI[4];
            ev.a((fh)llIllllIIIIllIl, llIllllIIIIIlIl.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[4]][aw.lIIIIIlI[1]]].a, llIllllIIIIIIll + v.bC[lIIIIIlI[1]][lIIIIIlI[4]][lIIIIIlI[4]] + llIllllIIIIIlIl.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[4]][aw.lIIIIIlI[1]]].b, llIllllIIIIIIlI - v.bC[lIIIIIlI[1]][lIIIIIlI[4]][lIIIIIlI[0]] + llIllllIIIIIlIl.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[4]][aw.lIIIIIlI[1]]].c, lIIIIIlI[1], lIIIIIlI[1]);
            ev.a((fh)llIllllIIIIllIl, llIllllIIIIIlII.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[0]][aw.lIIIIIlI[1]]].a, llIllllIIIIIIll + v.bC[lIIIIIlI[1]][lIIIIIlI[0]][lIIIIIlI[4]] + llIllllIIIIIlII.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[0]][aw.lIIIIIlI[1]]].b, llIllllIIIIIIlI - v.bC[lIIIIIlI[1]][lIIIIIlI[0]][lIIIIIlI[0]] + llIllllIIIIIlII.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[0]][aw.lIIIIIlI[1]]].c, lIIIIIlI[1], lIIIIIlI[1]);
            ev.a((fh)llIllllIIIIllIl, llIllllIIIIIllI.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[1]][aw.lIIIIIlI[1]]].a, llIllllIIIIIIll + v.bC[lIIIIIlI[1]][lIIIIIlI[1]][lIIIIIlI[4]] + llIllllIIIIIllI.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[1]][aw.lIIIIIlI[1]]].b, llIllllIIIIIIlI - v.bC[lIIIIIlI[1]][lIIIIIlI[1]][lIIIIIlI[0]] + llIllllIIIIIllI.a[v.bC[aw.lIIIIIlI[1]][aw.lIIIIIlI[1]][aw.lIIIIIlI[1]]].c, lIIIIIlI[1], lIIIIIlI[1]);
            llIllllIIIIlIll = lIIIIIlI[4];
            if (!bq.g) {
                llIllllIIIIlIIl = lIIIIIlI[1];
                while (llIllllIIIIlIIl < fa.dT.length) {
                    if (e == llIllllIIIIlIIl) {
                        llIllllIIIIlIII = llIllllIIIIlIIl > 0 ? lIIIIIlI[40] : lIIIIIlI[1];
                        ev.a((fh)llIllllIIIIllIl, lIIIIIlI[41], bt.ca + lIIIIIlI[13] + (bq.w % lIIIIIlI[42] > lIIIIIlI[7] ? lIIIIIlI[4] : lIIIIIlI[1]), bt.bZ + lIIIIIlI[43] + llIllllIIIIlIIl * llIllllIIIIlIlI + llIllllIIIIlIII, lIIIIIlI[0], ew.g);
                        ev.a((fh)llIllllIIIIllIl, lIIIIIlI[41], bt.ca + bt.cc - lIIIIIlI[44] - (bq.w % lIIIIIlI[42] > lIIIIIlI[7] ? lIIIIIlI[4] : lIIIIIlI[1]), bt.bZ + lIIIIIlI[43] + llIllllIIIIlIIl * llIllllIIIIlIlI + llIllllIIIIlIII, lIIIIIlI[1], ew.g);
                    }
                    ++llIllllIIIIlIIl;
                }
            }
            llIllllIIIIlIll = lIIIIIlI[4];
            if (bq.g) {
                llIllllIIIIlllI.i.a = fa.dU[c];
                llIllllIIIIlllI.i.a((fh)llIllllIIIIllIl);
                llIllllIIIIlllI.j.a = fa.cf[c][d];
                llIllllIIIIlllI.j.a((fh)llIllllIIIIllIl);
            } else {
                dp.b(llIllllIIIIlllI.i.f, llIllllIIIIlllI.i.g, llIllllIIIIlllI.i.h, llIllllIIIIlllI.i.i, (fh)llIllllIIIIllIl);
                if (e == lIIIIIlI[4]) {
                    llIllllIIIIllIl.a(dp.b);
                    llIllllIIIIllIl.c(llIllllIIIIlllI.i.f, llIllllIIIIlllI.i.g, llIllllIIIIlllI.i.h, llIllllIIIIlllI.i.i);
                    dp.b(llIllllIIIIlllI.i.f, llIllllIIIIlllI.i.g, llIllllIIIIlllI.i.h, llIllllIIIIlllI.i.i, (fh)llIllllIIIIllIl);
                }
                dp.b(llIllllIIIIlllI.j.f, llIllllIIIIlllI.j.g, llIllllIIIIlllI.j.h, llIllllIIIIlllI.j.i, (fh)llIllllIIIIllIl);
                if (e == lIIIIIlI[0]) {
                    llIllllIIIIllIl.a(dp.b);
                    llIllllIIIIllIl.c(llIllllIIIIlllI.j.f, llIllllIIIIlllI.j.g, llIllllIIIIlllI.j.h, llIllllIIIIlllI.j.i);
                    dp.b(llIllllIIIIlllI.j.f, llIllllIIIIlllI.j.g, llIllllIIIIlllI.j.h, llIllllIIIIlllI.j.i, (fh)llIllllIIIIllIl);
                }
                fg.e.a((fh)llIllllIIIIllIl, fa.dU[c], bt.ca + lIIIIIlI[45], bt.bZ + lIIIIIlI[46] + llIllllIIIIlIlI * lIIIIIlI[4], lIIIIIlI[0]);
                fg.e.a((fh)llIllllIIIIllIl, fa.cf[c][d], bt.ca + lIIIIIlI[45], bt.bZ + lIIIIIlI[46] + llIllllIIIIlIlI * lIIIIIlI[0], lIIIIIlI[0]);
            }
            aw.b.a = bt.ca + bt.cc / lIIIIIlI[0] - aw.b.c / lIIIIIlI[0];
            aw.b.b = bt.bZ + lIIIIIlI[21];
            aw.b.g = fa.bA;
            b.a((fh)llIllllIIIIllIl);
            super.a((fh)llIllllIIIIllIl);
            llIllllIIIIllIl.a(lIIIIIlI[1]);
        }
        catch (Exception llIllllIIIIlIll) {
            byte[] byArray = new byte[lIIIIIlI[47]];
            byArray[aw.lIIIIIlI[1]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[4]] = lIIIIIlI[48];
            byArray[aw.lIIIIIlI[0]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[7]] = lIIIIIlI[49];
            byArray[aw.lIIIIIlI[2]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[35]] = lIIIIIlI[50];
            byArray[aw.lIIIIIlI[34]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[42]] = lIIIIIlI[51];
            byArray[aw.lIIIIIlI[33]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[12]] = lIIIIIlI[52];
            byArray[aw.lIIIIIlI[13]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[3]] = lIIIIIlI[50];
            byArray[aw.lIIIIIlI[53]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[54]] = lIIIIIlI[48];
            byArray[aw.lIIIIIlI[55]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[44]] = lIIIIIlI[56];
            byArray[aw.lIIIIIlI[57]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[58]] = lIIIIIlI[51];
            byArray[aw.lIIIIIlI[59]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[60]] = lIIIIIlI[49];
            byArray[aw.lIIIIIlI[38]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[61]] = lIIIIIlI[62];
            byArray[aw.lIIIIIlI[63]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[9]] = lIIIIIlI[64];
            byArray[aw.lIIIIIlI[10]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[11]] = lIIIIIlI[49];
            byArray[aw.lIIIIIlI[5]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[6]] = lIIIIIlI[47];
            byArray[aw.lIIIIIlI[8]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[65]] = lIIIIIlI[66];
            byArray[aw.lIIIIIlI[27]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[67]] = lIIIIIlI[51];
            byArray[aw.lIIIIIlI[68]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[69]] = lIIIIIlI[70];
            byArray[aw.lIIIIIlI[71]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[31]] = lIIIIIlI[72];
            byArray[aw.lIIIIIlI[73]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[74]] = lIIIIIlI[52];
            byArray[aw.lIIIIIlI[75]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[76]] = lIIIIIlI[37];
            byArray[aw.lIIIIIlI[37]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[77]] = lIIIIIlI[77];
            byArray[aw.lIIIIIlI[78]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[79]] = lIIIIIlI[80];
            byArray[aw.lIIIIIlI[81]] = lIIIIIlI[1];
            byArray[aw.lIIIIIlI[20]] = lIIIIIlI[68];
            System.out.println(ec.a(byArray) + llIllllIIIIllII);
            llIllllIIIIlIll.printStackTrace();
        }
    }

    @Override
    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                ei.a().a(b.d(), c, f[c][d]);
                return;
            }
            case 8001: {
                if (ef.b().j) {
                    bq.G.c();
                    return;
                }
                ef.b().c();
                return;
            }
            case 8002: {
                aw llIlllIllllllll;
                llIlllIllllllll.k = lIIIIIlI[4];
                e = lIIIIIlI[4];
                if (llIlllIllllllll.k != e || (c -= lIIIIIlI[4]) >= 0) break;
                c = fa.dU.length - lIIIIIlI[4];
                return;
            }
            case 8003: {
                aw llIlllIllllllll;
                llIlllIllllllll.k = lIIIIIlI[0];
                e = lIIIIIlI[0];
                if (llIlllIllllllll.k != e || (d += lIIIIIlI[4]) <= fa.cf[lIIIIIlI[1]].length - lIIIIIlI[4]) break;
                d = lIIIIIlI[1];
            }
        }
    }

    private static void llIIlIl() {
        lIIIIIlI = new int[82];
        aw.lIIIIIlI[0] = " ".length() << " ".length();
        aw.lIIIIIlI[1] = (0xAD ^ 0xA4) << (" ".length() << " ".length()) & ~((0x5C ^ 0x55) << (" ".length() << " ".length()));
        aw.lIIIIIlI[2] = " ".length() << (" ".length() << " ".length());
        aw.lIIIIIlI[3] = 0x1A ^ 0x11;
        aw.lIIIIIlI[4] = " ".length();
        aw.lIIIIIlI[5] = (0x86 ^ 0x8B) << " ".length();
        aw.lIIIIIlI[6] = 0x7E ^ 0x65;
        aw.lIIIIIlI[7] = "   ".length();
        aw.lIIIIIlI[8] = (0x8A ^ 0x8D) << (" ".length() << " ".length());
        aw.lIIIIIlI[9] = 0xAC ^ 0xBB;
        aw.lIIIIIlI[10] = "   ".length() << "   ".length();
        aw.lIIIIIlI[11] = 0x95 ^ 0x8C;
        aw.lIIIIIlI[12] = 0x15 ^ 0x1C;
        aw.lIIIIIlI[13] = (0x31 ^ 0x34) << " ".length();
        aw.lIIIIIlI[14] = " ".length() << (0x8F ^ 0x88);
        aw.lIIIIIlI[15] = (0x3F ^ 0x30) << "   ".length();
        aw.lIIIIIlI[16] = (0xEB ^ 0xBE) << " ".length();
        aw.lIIIIIlI[17] = (0x28 ^ 0x77) << " ".length();
        aw.lIIIIIlI[18] = (0x87 ^ 0xB0) << (" ".length() << " ".length());
        aw.lIIIIIlI[19] = (0x70 ^ 0x69) << (" ".length() << " ".length());
        aw.lIIIIIlI[20] = 0xA ^ 0x27;
        aw.lIIIIIlI[21] = (0x21 ^ 0x3E) << " ".length();
        aw.lIIIIIlI[22] = (0x2F ^ 0x20) << (" ".length() << " ".length());
        aw.lIIIIIlI[23] = (0x47 ^ 0x3A) << ("   ".length() << " ".length());
        aw.lIIIIIlI[24] = 3325 + 775 - 116 + 4017;
        aw.lIIIIIlI[25] = 3636 + 1784 - 4077 + 2658 << " ".length();
        aw.lIIIIIlI[26] = (0x2E ^ 0xD) << " ".length();
        aw.lIIIIIlI[27] = (0x90 ^ 0x9F) << " ".length();
        aw.lIIIIIlI[28] = 7139 + 3528 - 3148 + 484;
        aw.lIIIIIlI[29] = (0x7D ^ 0x78) << ("   ".length() << " ".length());
        aw.lIIIIIlI[30] = (0x19 ^ 0x1C) << (0x96 ^ 0x93);
        aw.lIIIIIlI[31] = 0x2A ^ 9;
        aw.lIIIIIlI[32] = (0x3D ^ 0x36) << "   ".length();
        aw.lIIIIIlI[33] = " ".length() << "   ".length();
        aw.lIIIIIlI[34] = "   ".length() << " ".length();
        aw.lIIIIIlI[35] = 0x49 ^ 0x4C;
        aw.lIIIIIlI[36] = 0x81 ^ 0xC0;
        aw.lIIIIIlI[37] = (0xB2 ^ 0xB7) << "   ".length();
        aw.lIIIIIlI[38] = (0x2E ^ 0x2B) << (" ".length() << " ".length());
        aw.lIIIIIlI[39] = (0x65 ^ 0x7C) << " ".length();
        aw.lIIIIIlI[40] = -(0x97 ^ 0x92);
        aw.lIIIIIlI[41] = 538 + 946 - 541 + 46;
        aw.lIIIIIlI[42] = 0xD ^ 0xA;
        aw.lIIIIIlI[43] = (0x67 ^ 0x74) << (" ".length() << " ".length());
        aw.lIIIIIlI[44] = 0x22 ^ 0x2D;
        aw.lIIIIIlI[45] = 0x5A ^ 0xF;
        aw.lIIIIIlI[46] = (0x10 ^ 0x31) << " ".length();
        aw.lIIIIIlI[47] = (0x83 ^ 0x94) << " ".length();
        aw.lIIIIIlI[48] = 0xDD ^ 0x9E;
        aw.lIIIIIlI[49] = (0x52 ^ 0x6B) << " ".length();
        aw.lIIIIIlI[50] = 0x26 ^ 0x43;
        aw.lIIIIIlI[51] = 0x38 ^ 0x59;
        aw.lIIIIIlI[52] = (5 ^ 0x18) << (" ".length() << " ".length());
        aw.lIIIIIlI[53] = "   ".length() << (" ".length() << " ".length());
        aw.lIIIIIlI[54] = 0xB ^ 6;
        aw.lIIIIIlI[55] = (0xC0 ^ 0xC7) << " ".length();
        aw.lIIIIIlI[56] = (0x55 ^ 0x58) << "   ".length();
        aw.lIIIIIlI[57] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        aw.lIIIIIlI[58] = 0x1A ^ 0xB;
        aw.lIIIIIlI[59] = (0xA7 ^ 0xAE) << " ".length();
        aw.lIIIIIlI[60] = 0x91 ^ 0x82;
        aw.lIIIIIlI[61] = 0xB5 ^ 0xA0;
        aw.lIIIIIlI[62] = 0x2C ^ 0x7F;
        aw.lIIIIIlI[63] = (0xA4 ^ 0xAF) << " ".length();
        aw.lIIIIIlI[64] = 0xFC ^ 0x9F;
        aw.lIIIIIlI[65] = 0x95 ^ 0x88;
        aw.lIIIIIlI[66] = (0xA0 ^ 0xA7) << (" ".length() << (" ".length() << " ".length()));
        aw.lIIIIIlI[67] = 0x9F ^ 0x80;
        aw.lIIIIIlI[68] = " ".length() << (0x75 ^ 0x70);
        aw.lIIIIIlI[69] = 0xAB ^ 0x8A;
        aw.lIIIIIlI[70] = 0x79 ^ 0x10;
        aw.lIIIIIlI[71] = (0xB7 ^ 0xA6) << " ".length();
        aw.lIIIIIlI[72] = (0x51 ^ 0x66) << " ".length();
        aw.lIIIIIlI[73] = (0x56 ^ 0x5F) << (" ".length() << " ".length());
        aw.lIIIIIlI[74] = 0x97 ^ 0xB2;
        aw.lIIIIIlI[75] = (0x73 ^ 0x60) << " ".length();
        aw.lIIIIIlI[76] = 0x81 ^ 0xA6;
        aw.lIIIIIlI[77] = 0xBD ^ 0x94;
        aw.lIIIIIlI[78] = (0x40 ^ 0x55) << " ".length();
        aw.lIIIIIlI[79] = 0x91 ^ 0xBA;
        aw.lIIIIIlI[80] = (0x7A ^ 0x67) << " ".length();
        aw.lIIIIIlI[81] = (0x6A ^ 0x61) << (" ".length() << " ".length());
    }
}

