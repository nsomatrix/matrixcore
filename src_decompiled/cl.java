/*
 * Decompiled with CFR 0.152.
 */
public final class cl
extends fj
implements bu {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private static final /* synthetic */ int[] lIIllllI;

    public cl() {
        this.e = lIIllllI[0];
    }

    @Override
    public final void c() {
        cl llIIllllIIlIIlI;
        bt.c = bq.B;
        if (bq.T == lIIllllI[1]) {
            bq.d(lIIllllI[2]);
        } else {
            bq.d(fb.m);
        }
        super.c();
        if (bt.a != null) {
            bt.a = null;
        }
        if ((fb.m = (byte)(System.currentTimeMillis() % 9L)) == lIIllllI[3] || fb.m == lIIllllI[4]) {
            fb.m = (byte)lIIllllI[5];
        }
        bt.a(lIIllllI[6]);
        bt.i = lIIllllI[7];
        llIIllllIIlIIlI.a = lIIllllI[8];
        llIIllllIIlIIlI.b = lIIllllI[9];
        if (bq.A == lIIllllI[10] || bq.B <= lIIllllI[11]) {
            llIIllllIIlIIlI.a = lIIllllI[12];
            llIIllllIIlIIlI.b = lIIllllI[13];
        }
        llIIllllIIlIIlI.c = bq.A / lIIllllI[1] - llIIllllIIlIIlI.a / lIIllllI[1];
        llIIllllIIlIIlI.d = bq.B / lIIllllI[1] - llIIllllIIlIIlI.b / lIIllllI[1];
        if (bq.B <= lIIllllI[14]) {
            llIIllllIIlIIlI.d -= lIIllllI[15];
        }
        llIIllllIIlIIlI.cq = new au(bq.g ? "" : fa.ax, llIIllllIIlIIlI, lIIllllI[16], null);
        llIIllllIIlIIlI.cr = new au(fa.av, bq.k, lIIllllI[17], null);
        llIIllllIIlIIlI.e = lIIllllI[0];
        if (!bq.g) {
            llIIllllIIlIIlI.e = lIIllllI[2];
        }
        if (bq.g && bq.A >= lIIllllI[18]) {
            llIIllllIIlIIlI.cq.f = bq.A / lIIllllI[1] - lIIllllI[19];
            llIIllllIIlIIlI.cr.f = bq.A / lIIllllI[1] + lIIllllI[20];
            llIIllllIIlIIlI.cq.g = llIIllllIIlIIlI.cr.g = bq.B - lIIllllI[21];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        fh2.a(lIIllllI[2]);
        fh2.c(lIIllllI[2], lIIllllI[2], bq.A, bq.B);
        bq.a(fh2);
        dp.a(this.c, this.d, this.a, this.b, fh2);
        fh2.a(dp.c);
        fh2.b(bq.C - fg.o.a(fa.D) / lIIllllI[1] - lIIllllI[22], this.d + lIIllllI[23], fg.o.a(fa.D) + lIIllllI[24], lIIllllI[25], lIIllllI[4], lIIllllI[4]);
        fh2.a(dp.b);
        fh2.a(bq.C - fg.o.a(fa.D) / lIIllllI[1] - lIIllllI[22], this.d + lIIllllI[23], fg.o.a(fa.D) + lIIllllI[24], lIIllllI[25], lIIllllI[4], lIIllllI[4]);
        fg.o.a(fh2, fa.D, bq.C, this.d + lIIllllI[22], lIIllllI[1]);
        String[] stringArray = fa.F;
        int n2 = this.d + lIIllllI[26];
        int n3 = lIIllllI[2];
        while (n3 < stringArray.length) {
            void llIIllllIIIlIIl;
            void llIIllllIIIIlll;
            void llIIllllIIIlIII;
            cl llIIllllIIIlIll;
            void llIIllllIIIlIlI;
            llIIllllIIIlIlI.a(dp.c);
            llIIllllIIIlIlI.c(llIIllllIIIlIll.c + lIIllllI[15], (int)(llIIllllIIIlIII + llIIllllIIIIlll * lIIllllI[19]), llIIllllIIIlIll.a - lIIllllI[27], lIIllllI[28]);
            llIIllllIIIlIlI.a(lIIllllI[29]);
            llIIllllIIIlIlI.b(llIIllllIIIlIll.c + lIIllllI[15], (int)(llIIllllIIIlIII + llIIllllIIIIlll * lIIllllI[19]), llIIllllIIIlIll.a - lIIllllI[27], lIIllllI[28]);
            if (llIIllllIIIIlll == llIIllllIIIlIll.e) {
                llIIllllIIIlIlI.a(dp.b);
                llIIllllIIIlIlI.c(llIIllllIIIlIll.c + lIIllllI[15], (int)(llIIllllIIIlIII + llIIllllIIIIlll * lIIllllI[19]), llIIllllIIIlIll.a - lIIllllI[27], lIIllllI[28]);
                llIIllllIIIlIlI.a(lIIllllI[30]);
                llIIllllIIIlIlI.b(llIIllllIIIlIll.c + lIIllllI[15], (int)(llIIllllIIIlIII + llIIllllIIIIlll * lIIllllI[19]), llIIllllIIIlIll.a - lIIllllI[27], lIIllllI[28]);
            }
            fg.e.a((fh)llIIllllIIIlIlI, (String)llIIllllIIIlIIl[llIIllllIIIIlll], llIIllllIIIlIll.c + llIIllllIIIlIll.a / lIIllllI[1], (int)(llIIllllIIIlIII + llIIllllIIIIlll * lIIllllI[19] + lIIllllI[31]), lIIllllI[1]);
            ++llIIllllIIIIlll;
        }
        super.a(fh2);
        dp.a(fh2, this.cp, this.cq, this.cr);
    }

    public static void b(int n2) {
        byte[] byArray = new byte[lIIllllI[24]];
        byArray[cl.lIIllllI[2]] = lIIllllI[2];
        byArray[cl.lIIllllI[6]] = lIIllllI[32];
        byArray[cl.lIIllllI[1]] = lIIllllI[2];
        byArray[cl.lIIllllI[33]] = lIIllllI[34];
        byArray[cl.lIIllllI[5]] = lIIllllI[2];
        byArray[cl.lIIllllI[3]] = lIIllllI[7];
        byArray[cl.lIIllllI[4]] = lIIllllI[2];
        byArray[cl.lIIllllI[23]] = lIIllllI[35];
        byArray[cl.lIIllllI[31]] = lIIllllI[2];
        byArray[cl.lIIllllI[36]] = lIIllllI[37];
        byArray[cl.lIIllllI[15]] = lIIllllI[2];
        byArray[cl.lIIllllI[38]] = lIIllllI[34];
        byArray[cl.lIIllllI[22]] = lIIllllI[2];
        byArray[cl.lIIllllI[39]] = lIIllllI[40];
        byArray[cl.lIIllllI[41]] = lIIllllI[2];
        byArray[cl.lIIllllI[42]] = lIIllllI[43];
        byArray[cl.lIIllllI[44]] = lIIllllI[2];
        byArray[cl.lIIllllI[45]] = lIIllllI[37];
        byArray[cl.lIIllllI[46]] = lIIllllI[2];
        byArray[cl.lIIllllI[47]] = lIIllllI[40];
        byArray[cl.lIIllllI[27]] = lIIllllI[2];
        byArray[cl.lIIllllI[48]] = lIIllllI[49];
        dv.a(ec.a(byArray), n2);
    }

    public static int b() {
        int n2 = lIIllllI[2];
        byte[] byArray = new byte[lIIllllI[24]];
        byArray[cl.lIIllllI[2]] = lIIllllI[2];
        byArray[cl.lIIllllI[6]] = lIIllllI[32];
        byArray[cl.lIIllllI[1]] = lIIllllI[2];
        byArray[cl.lIIllllI[33]] = lIIllllI[34];
        byArray[cl.lIIllllI[5]] = lIIllllI[2];
        byArray[cl.lIIllllI[3]] = lIIllllI[7];
        byArray[cl.lIIllllI[4]] = lIIllllI[2];
        byArray[cl.lIIllllI[23]] = lIIllllI[35];
        byArray[cl.lIIllllI[31]] = lIIllllI[2];
        byArray[cl.lIIllllI[36]] = lIIllllI[37];
        byArray[cl.lIIllllI[15]] = lIIllllI[2];
        byArray[cl.lIIllllI[38]] = lIIllllI[34];
        byArray[cl.lIIllllI[22]] = lIIllllI[2];
        byArray[cl.lIIllllI[39]] = lIIllllI[40];
        byArray[cl.lIIllllI[41]] = lIIllllI[2];
        byArray[cl.lIIllllI[42]] = lIIllllI[43];
        byArray[cl.lIIllllI[44]] = lIIllllI[2];
        byArray[cl.lIIllllI[45]] = lIIllllI[37];
        byArray[cl.lIIllllI[46]] = lIIllllI[2];
        byArray[cl.lIIllllI[47]] = lIIllllI[40];
        byArray[cl.lIIllllI[27]] = lIIllllI[2];
        byArray[cl.lIIllllI[48]] = lIIllllI[49];
        return dv.c(ec.a(byArray));
    }

    @Override
    public final void a() {
        if ((bt.i += lIIllllI[6]) > bq.A * lIIllllI[33] + lIIllllI[7]) {
            bt.i = lIIllllI[7];
        }
        super.a();
    }

    @Override
    public final void d() {
        cl llIIllllIIIIIll;
        if (bq.n[lIIllllI[1]] || bq.n[lIIllllI[5]] || bq.n[lIIllllI[4]] || bq.n[lIIllllI[31]]) {
            int n2 = llIIllllIIIIIll.e = llIIllllIIIIIll.e == 0 ? lIIllllI[6] : lIIllllI[2];
        }
        if (bq.r && bq.b(llIIllllIIIIIll.c + lIIllllI[15], llIIllllIIIIIll.d + lIIllllI[50], llIIllllIIIIIll.a - lIIllllI[15], lIIllllI[51])) {
            if (bq.q) {
                llIIllllIIIIIll.e = (bq.t - (llIIllllIIIIIll.d + lIIllllI[50])) / lIIllllI[19];
            }
            llIIllllIIIIIll.a(lIIllllI[16], null);
        }
        super.d();
        bq.i();
    }

    @Override
    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                bq.J = null;
                dv.a();
                bq.b();
                eg.b(lIIllllI[2]);
                bq.G.c();
            }
        }
    }

    static {
        cl.lllIllI();
    }

    private static void lllIllI() {
        lIIllllI = new int[52];
        cl.lIIllllI[0] = -" ".length();
        cl.lIIllllI[1] = " ".length() << " ".length();
        cl.lIIllllI[2] = (0x5E ^ 0x59) & ~(0x30 ^ 0x37);
        cl.lIIllllI[3] = 0x57 ^ 0x52;
        cl.lIIllllI[4] = "   ".length() << " ".length();
        cl.lIIllllI[5] = " ".length() << (" ".length() << " ".length());
        cl.lIIllllI[6] = " ".length();
        cl.lIIllllI[7] = (0x96 ^ 0x8F) << (" ".length() << " ".length());
        cl.lIIllllI[8] = (0xDB ^ 0x8E) << " ".length();
        cl.lIIllllI[9] = 39 + 132 - 97 + 101;
        cl.lIIllllI[10] = " ".length() << (0x34 ^ 0x33);
        cl.lIIllllI[11] = (0xCB ^ 0xC6) << (" ".length() << (" ".length() << " ".length()));
        cl.lIIllllI[12] = (0x7E ^ 0x41) << " ".length();
        cl.lIIllllI[13] = (0x18 ^ 0x1D) << (0x97 ^ 0x92);
        cl.lIIllllI[14] = (0x1B ^ 0x66) << " ".length();
        cl.lIIllllI[15] = (0xA3 ^ 0xA6) << " ".length();
        cl.lIIllllI[16] = (0xC7 ^ 0xBA) << "   ".length();
        cl.lIIllllI[17] = 7010 + 1014 - 3175 + 4036;
        cl.lIIllllI[18] = (0x90 ^ 0x95) << ("   ".length() << " ".length());
        cl.lIIllllI[19] = 0x1E ^ 0x3D;
        cl.lIIllllI[20] = (0x9F ^ 0x94) << "   ".length();
        cl.lIIllllI[21] = (1 ^ 0xC) << " ".length();
        cl.lIIllllI[22] = "   ".length() << (" ".length() << " ".length());
        cl.lIIllllI[23] = 0x60 ^ 0x67;
        cl.lIIllllI[24] = (0x50 ^ 0x5B) << " ".length();
        cl.lIIllllI[25] = "   ".length() << "   ".length();
        cl.lIIllllI[26] = (0x38 ^ 0x21) << " ".length();
        cl.lIIllllI[27] = (0x4B ^ 0x4E) << (" ".length() << " ".length());
        cl.lIIllllI[28] = (0x9B ^ 0x9C) << (" ".length() << " ".length());
        cl.lIIllllI[29] = 729287 + 1544127 - 1197883 + 4644862;
        cl.lIIllllI[30] = 512433 + 594769 - 126935 + 401386 << "   ".length();
        cl.lIIllllI[31] = " ".length() << "   ".length();
        cl.lIIllllI[32] = 0xCB ^ 0xA2;
        cl.lIIllllI[33] = "   ".length();
        cl.lIIllllI[34] = (0x69 ^ 0x5E) << " ".length();
        cl.lIIllllI[35] = (0x49 ^ 0x5A) << (" ".length() << " ".length());
        cl.lIIllllI[36] = 0xB1 ^ 0xB8;
        cl.lIIllllI[37] = 7 ^ 0x66;
        cl.lIIllllI[38] = 0x35 ^ 0x3E;
        cl.lIIllllI[39] = 0xA9 ^ 0xA4;
        cl.lIIllllI[40] = 0x26 ^ 0x41;
        cl.lIIllllI[41] = (0xAF ^ 0xA8) << " ".length();
        cl.lIIllllI[42] = 0xBC ^ 0xB3;
        cl.lIIllllI[43] = 0xDE ^ 0xAB;
        cl.lIIllllI[44] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        cl.lIIllllI[45] = 0x3B ^ 0x2A;
        cl.lIIllllI[46] = (0x9F ^ 0x96) << " ".length();
        cl.lIIllllI[47] = 0x4E ^ 0x5D;
        cl.lIIllllI[48] = 0xA7 ^ 0xB2;
        cl.lIIllllI[49] = 0x29 ^ 0x4C;
        cl.lIIllllI[50] = 0xEC ^ 0xC1;
        cl.lIIllllI[51] = (0x2A ^ 9) << " ".length();
    }
}

