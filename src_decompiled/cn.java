/*
 * Decompiled with CFR 0.152.
 */
public final class cn
extends be {
    private /* synthetic */ int[] a;
    private /* synthetic */ dh b;
    private /* synthetic */ dh[] g;
    private /* synthetic */ bb h;
    private /* synthetic */ long i;
    private /* synthetic */ boolean j;
    private /* synthetic */ boolean k;
    private /* synthetic */ int l;
    private /* synthetic */ int m;
    private /* synthetic */ int n;
    private /* synthetic */ int o;
    private static final /* synthetic */ int[] lllI;

    public cn() {
        int[] nArray = new int[lllI[0]];
        nArray[cn.lllI[1]] = lllI[2];
        nArray[cn.lllI[3]] = lllI[4];
        this.a = nArray;
        this.b = new dh();
        this.i = 0L;
        this.j = lllI[1];
        this.k = lllI[3];
        this.l = lllI[1];
        this.m = lllI[1];
        this.n = lllI[1];
        this.o = lllI[5];
    }

    /*
     * WARNING - void declaration
     */
    public static void a(dh dh2, bb bb2, boolean bl2, int n2) {
        cn cn2 = new cn();
        cn2.a[cn.lllI[3]] = n2;
        n2 = lllI[1];
        while (n2 < dh2.size()) {
            void llllllllIllIllI;
            void llllllllIllIlIl;
            dh llllllllIllIlll;
            bb llllllllIllIIll = (bb)llllllllIllIlll.elementAt((int)llllllllIllIlIl);
            if (llllllllIllIIll != null && (eb.e(llllllllIllIIll.a - llllllllIllIllI.a) >= lllI[6] || eb.e(llllllllIllIIll.b - llllllllIllIllI.b) >= lllI[7])) {
                llllllllIllIlll.removeElementAt((int)llllllllIllIlIl);
            }
            ++llllllllIllIlIl;
        }
        cn2.a(dh2, bb2, lllI[3]);
        be.c.addElement(cn2);
    }

    /*
     * WARNING - void declaration
     */
    private void a(dh dh2, bb bb2, boolean bl2) {
        if (dh2.size() != 0) {
            int llllllllIIIlllI;
            int llllllllIIIllll;
            int llllllllIIIllII;
            int llllllllIIlIIII;
            bb llllllllIIIllIl;
            int llllllllIIlIIIl;
            int llllllllIIlIIlI;
            cn llllllllIIlllII;
            bb llllllllIIllIlI;
            void llllllllIIllIll;
            int llllllllIIlIlII;
            bb llllllllIIlIlIl;
            void llllllllIIllIII;
            int llllllllIIlIlll;
            int llllllllIIlIllI;
            this.j = bl2;
            if (!bl2) {
                dh dh3 = dh2;
                int n2 = dh2.size();
                int n3 = lllI[1];
                while (llllllllIIlIllI < llllllllIIlIlll - lllI[3]) {
                    llllllllIIlIlIl = (bb)llllllllIIllIII.elementAt(llllllllIIlIllI);
                    llllllllIIlIlII = llllllllIIlIllI + lllI[3];
                    while (llllllllIIlIlII < llllllllIIlIlll) {
                        bb llllllllIIlIIll = (bb)llllllllIIllIII.elementAt(llllllllIIlIlII);
                        if (llllllllIIlIlIl.a > llllllllIIlIIll.a) {
                            llllllllIIllIII.setElementAt(llllllllIIlIlIl, llllllllIIlIlII);
                            llllllllIIllIII.setElementAt(llllllllIIlIIll, llllllllIIlIllI);
                            llllllllIIlIlIl = llllllllIIlIIll;
                        }
                        ++llllllllIIlIlII;
                    }
                    ++llllllllIIlIllI;
                }
            }
            llllllllIIlllII.b = llllllllIIllIll;
            llllllllIIlllII.h = llllllllIIllIlI;
            llllllllIIlllII.g = new dh[llllllllIIllIll.size()];
            int llllllllIIlIIll = lllI[1];
            while (llllllllIIlIIll < llllllllIIlllII.g.length) {
                llllllllIIlllII.g[llllllllIIlIIll] = new dh();
                ++llllllllIIlIIll;
            }
            llllllllIIllIlI.c = (byte)lllI[8];
            llllllllIIlllII.g[lllI[1]].addElement(llllllllIIllIlI);
            llllllllIIlIIll = lllI[8];
            block3: for (llllllllIIlIIlI = lllI[1]; llllllllIIlIIlI < llllllllIIllIll.size(); ++llllllllIIlIIlI) {
                int llllllllIIIlIlI;
                void llllllllIIllIIl;
                llllllllIIlIIIl = llllllllIIllIlI.a;
                int llllllllIIIlIll = llllllllIIllIlI.b;
                if (llllllllIIllIIl != false && llllllllIIlIIll != lllI[8]) {
                    llllllllIIIllIl = (bb)llllllllIIllIll.elementAt(llllllllIIlIIll);
                    llllllllIIlIIIl = llllllllIIIllIl.a;
                    llllllllIIIlIll = llllllllIIIllIl.b;
                }
                if (llllllllIIllIIl == false) {
                    int llllllllIIIlIIl;
                    block23: {
                        llllllllIIllIII = llllllllIIllIll;
                        llllllllIIlIlll = lllI[1];
                        llllllllIIlIllI = lllI[1];
                        while (llllllllIIlIllI < llllllllIIllIII.size()) {
                            if (((bb)llllllllIIllIII.elementAt((int)llllllllIIlIllI)).e == lllI[8]) {
                                ++llllllllIIlIlll;
                            }
                            ++llllllllIIlIllI;
                        }
                        if (llllllllIIlIlll != 0) {
                            llllllllIIlIlll = eb.d(llllllllIIlIlll);
                            llllllllIIlIllI = lllI[1];
                            llllllllIIIlIlI = lllI[1];
                            while (true) {
                                if (llllllllIIIlIlI >= llllllllIIllIII.size()) {
                                    llllllllIIIlIIl = lllI[8];
                                    break block23;
                                }
                                bb llllllllIIIlIII = (bb)llllllllIIllIII.elementAt(llllllllIIIlIlI);
                                if (llllllllIIIlIII.e == lllI[8]) {
                                    if (llllllllIIlIlll == llllllllIIlIllI) {
                                        llllllllIIIlIII.e = (short)lllI[1];
                                        llllllllIIIlIIl = llllllllIIIlIlI;
                                        break block23;
                                    }
                                    ++llllllllIIlIllI;
                                }
                                ++llllllllIIIlIlI;
                            }
                        }
                        llllllllIIIlIIl = lllI[8];
                    }
                    llllllllIIlIIll = llllllllIIIlIIl;
                } else {
                    ++llllllllIIlIIll;
                }
                llllllllIIlIlll = llllllllIIlllII.g[llllllllIIlIIll].size() - lllI[3];
                bb llllllllIIIlIIl = (bb)llllllllIIllIll.elementAt(llllllllIIlIIll);
                llllllllIIIlIlI = eb.a(llllllllIIIlIIl.a - llllllllIIlIIIl, -(llllllllIIIlIIl.b - llllllllIIIlIll));
                llllllllIIlIlII = eb.d(lllI[9]) + lllI[10];
                llllllllIIlIIII = lllI[1];
                int llllllllIIIlIII = lllI[1];
                while (true) {
                    llllllllIIIllII = lllI[1];
                    if (llllllllIIlIIII != 0) {
                        llllllllIIIllII = llllllllIIIlIlI - lllI[11] + eb.d(lllI[10]);
                    }
                    llllllllIIIllII = eb.c(llllllllIIIllII);
                    llllllllIIIllll = llllllllIIlIlII * llllllllIIlIIII * eb.b(llllllllIIIllII) >> lllI[10];
                    llllllllIIIlllI = -(llllllllIIlIlII * llllllllIIlIIII * eb.a(llllllllIIIllII)) >> lllI[10];
                    bb llllllllIIIIlll = new bb(llllllllIIlIIIl + llllllllIIIllll, llllllllIIIlIll + llllllllIIIlllI, llllllllIIlIlll++);
                    llllllllIIlllII.g[llllllllIIlIIll].addElement(llllllllIIIIlll);
                    if (eb.a(llllllllIIlIIIl, llllllllIIIlIll, llllllllIIlIIIl + llllllllIIIllll, llllllllIIIlIll + llllllllIIIlllI) >= eb.a(llllllllIIlIIIl, llllllllIIIlIll, llllllllIIIlIIl.a, llllllllIIIlIIl.b) - lllI[12]) {
                        continue block3;
                    }
                    ++llllllllIIlIIII;
                }
            }
            llllllllIIlIIlI = lllI[1];
            while (llllllllIIlIIlI < llllllllIIlllII.g.length) {
                llllllllIIlIIIl = llllllllIIlllII.g[llllllllIIlIIlI].size();
                bb llllllllIIIlIll = (bb)llllllllIIllIll.elementAt(llllllllIIlIIlI);
                ((bb)llllllllIIllIll.elementAt(llllllllIIlIIlI)).c = (byte)(llllllllIIlllII.g[llllllllIIlIIlI].size() - lllI[3]);
                llllllllIIIlIll.e = (short)lllI[8];
                llllllllIIIllIl = new bb(llllllllIIIlIll.a, llllllllIIIlIll.b, llllllllIIIlIll.c);
                new bb(llllllllIIIlIll.a, llllllllIIIlIll.b, llllllllIIIlIll.c).e = (short)lllI[8];
                llllllllIIlllII.g[llllllllIIlIIlI].addElement(llllllllIIIllIl);
                llllllllIIlIllI = lllI[3];
                while (llllllllIIlIllI < llllllllIIlIIIl) {
                    llllllllIIlIlIl = (bb)llllllllIIlllII.g[llllllllIIlIIlI].elementAt(llllllllIIlIllI);
                    llllllllIIlIlII = eb.d(lllI[0]);
                    llllllllIIlIIII = lllI[1];
                    while (llllllllIIlIIII < llllllllIIlIlII) {
                        llllllllIIIllII = lllI[13] + eb.d(lllI[13]);
                        llllllllIIIllll = lllI[11] + eb.d(lllI[10]);
                        llllllllIIIlllI = llllllllIIIllll * eb.b(eb.c(llllllllIIIllII)) >> lllI[10];
                        llllllllIIIllII = -(llllllllIIIllll * eb.a(eb.c(llllllllIIIllII))) >> lllI[10];
                        llllllllIIllIlI = new bb(llllllllIIlIlIl.a + llllllllIIIlllI, llllllllIIlIlIl.b + llllllllIIIllII, llllllllIIlIllI);
                        new bb(llllllllIIlIlIl.a + llllllllIIIlllI, llllllllIIlIlIl.b + llllllllIIIllII, llllllllIIlIllI).e = (short)lllI[1];
                        llllllllIIlllII.g[llllllllIIlIIlI].addElement(llllllllIIllIlI);
                        ++llllllllIIlIIII;
                    }
                    ++llllllllIIlIllI;
                }
                ++llllllllIIlIIlI;
            }
        }
    }

    @Override
    public final void a() {
        if (this.h == null) {
            be.d.addElement(this);
        } else {
            try {
                if (bq.w % lllI[0] == lllI[3]) {
                    cn lllllllIllllIII;
                    lllllllIllllIII.h.c = (byte)lllI[8];
                    lllllllIllllIII.h.e = (short)lllI[8];
                    int lllllllIlllIllI = lllI[1];
                    while (lllllllIlllIllI < lllllllIllllIII.b.size()) {
                        bb lllllllIlllIlII = (bb)lllllllIllllIII.b.elementAt(lllllllIlllIllI);
                        ((bb)lllllllIllllIII.b.elementAt(lllllllIlllIllI)).e = (short)lllI[8];
                        lllllllIlllIlII.c = (byte)lllI[8];
                        ++lllllllIlllIllI;
                    }
                    if (lllllllIllllIII.j && lllllllIllllIII.k && lllllllIllllIII.b.size() > lllI[3] && System.currentTimeMillis() / 10L - lllllllIllllIII.i > 30L) {
                        lllllllIllllIII.i = System.currentTimeMillis() / 10L;
                        lllllllIllllIII.h = (bb)lllllllIllllIII.b.elementAt(lllI[1]);
                        lllllllIllllIII.b.removeElementAt(lllI[1]);
                    }
                    lllllllIllllIII.a(lllllllIllllIII.b, lllllllIllllIII.h, lllllllIllllIII.j);
                    if (lllllllIllllIII.l > lllI[14]) {
                        lllllllIllllIII.o = lllI[5];
                        be.c.removeElement(lllllllIllllIII);
                    }
                    lllllllIllllIII.l += lllI[3];
                    return;
                }
            }
            catch (Exception lllllllIlllIllI) {
                lllllllIlllIllI.printStackTrace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        cn lllllllIllIIlII;
        this.n = lllI[1];
        this.m += lllI[3];
        if (this.m >= lllI[15]) {
            this.m = lllI[1];
        }
        if (lllllllIllIIlII.g != null) {
            int lllllllIllIIIlI = lllI[1];
            while (lllllllIllIIIlI < lllllllIllIIlII.g.length) {
                int lllllllIllIIIIl22 = lllI[1];
                while (lllllllIllIIIIl22 < lllllllIllIIlII.g[lllllllIllIIIlI].size()) {
                    bb lllllllIllIIIII = (bb)lllllllIllIIlII.g[lllllllIllIIIlI].elementAt(lllllllIllIIIIl22);
                    if (lllllllIllIIIII.c >= 0 && lllllllIllIIIII.c < lllllllIllIIlII.g[lllllllIllIIIlI].size()) {
                        bb lllllllIlIlllll = (bb)lllllllIllIIlII.g[lllllllIllIIIlI].elementAt(lllllllIllIIIII.c);
                        if (bq.e(lllllllIllIIIII.a, lllllllIllIIIII.b) && bq.e(lllllllIlIlllll.a, lllllllIlIlllll.b)) {
                            void lllllllIllIIIll;
                            lllllllIllIIIll.a(lllllllIllIIlII.a[lllI[1]]);
                            lllllllIllIIIll.a(lllllllIllIIIII.a, lllllllIllIIIII.b, lllllllIlIlllll.a, lllllllIlIlllll.b);
                            if (lllllllIllIIIII.e == lllI[8]) {
                                lllllllIllIIIll.a(lllllllIllIIlII.a[lllI[3]]);
                                lllllllIllIIIll.a(lllllllIllIIIII.a - lllI[3], lllllllIllIIIII.b, lllllllIlIlllll.a - lllI[3], lllllllIlIlllll.b);
                                if (lllllllIllIIlII.j && lllllllIllIIlII.k) {
                                    lllllllIllIIIll.a(lllllllIllIIIII.a + lllI[3], lllllllIllIIIII.b, lllllllIlIlllll.a + lllI[3], lllllllIlIlllll.b);
                                }
                            }
                        }
                        if (lllllllIllIIlII.j && lllllllIllIIlII.k) {
                            lllllllIllIIlII.n += lllI[3];
                            if (lllllllIllIIlII.n >= lllllllIllIIlII.o) {
                                lllllllIllIIlII.o += lllI[5];
                                return;
                            }
                        }
                    }
                    ++lllllllIllIIIIl22;
                }
                bb lllllllIllIIIIl22 = (bb)lllllllIllIIlII.b.elementAt(lllllllIllIIIlI);
                lllllllIllIIIIl22.d = (byte)(lllllllIllIIIIl22.d + lllI[3]);
                if (lllllllIllIIIIl22.d >= lllI[15]) {
                    lllllllIllIIIIl22.d = (byte)lllI[1];
                }
                ++lllllllIllIIIlI;
            }
        }
    }

    static {
        cn.lIII();
    }

    private static void lIII() {
        lllI = new int[16];
        cn.lllI[0] = " ".length() << " ".length();
        cn.lllI[1] = (0x78 ^ 0x35) & ~(0x78 ^ 0x35);
        cn.lllI[2] = 10995473 + 6618374 - 7546522 + 6512512;
        cn.lllI[3] = " ".length();
        cn.lllI[4] = 974046 + 222041 - -1422013 + 178955 << (" ".length() << " ".length());
        cn.lllI[5] = 0x95 ^ 0x92;
        cn.lllI[6] = (0xBB ^ 0xA2) << (" ".length() << " ".length());
        cn.lllI[7] = (0x33 ^ 0x2A) << " ".length();
        cn.lllI[8] = -" ".length();
        cn.lllI[9] = 0xB0 ^ 0xBF;
        cn.lllI[10] = (0x3B ^ 0x3E) << " ".length();
        cn.lllI[11] = 0xA0 ^ 0xA5;
        cn.lllI[12] = (0x5C ^ 0x59) << (" ".length() << " ".length());
        cn.lllI[13] = (0x1D ^ 0x30) << (" ".length() << " ".length());
        cn.lllI[14] = "   ".length();
        cn.lllI[15] = "   ".length() << (" ".length() << " ".length());
    }
}

