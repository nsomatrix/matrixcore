/*
 * Decompiled with CFR 0.152.
 */
public final class f
extends d {
    private /* synthetic */ boolean w;
    private /* synthetic */ boolean x;
    private /* synthetic */ long y;
    private static final /* synthetic */ int[] llIl;

    public f() {
        this.y = 0L;
    }

    public final void a(int n2, int n3, boolean bl2, boolean bl3) {
        super.b();
        this.c = n2;
        this.d = n3;
        this.b = fb.g(n2);
        this.w = bl2;
        this.x = bl3;
        this.a = llIl[0];
    }

    @Override
    public final void p() {
        f lllllllIllllIIl;
        if (d.b(v.f())) {
            d.a(llIl[0]);
        } else if (lllllllIllllIIl.c == fb.o && (lllllllIllllIIl.b || lllllllIllllIIl.d == fb.l)) {
            v lllllllIlllIIIl;
            eo lllllllIllIllll;
            int lllllllIlllIIII;
            at.p();
            v lllllllIlllIlll = v.f();
            if (lllllllIllllIIl.x && bt.z.size() > llIl[0] && lllllllIlllIlll.aw.a == llIl[1]) {
                lllllllIlllIIII = llIl[2];
                while (lllllllIlllIIII < lllllllIlllIlll.ax.size()) {
                    lllllllIllIllll = (eo)lllllllIlllIlll.ax.elementAt(lllllllIlllIIII);
                    if (lllllllIllIllll != null && lllllllIllIllll.a.d == llIl[3]) {
                        if (System.currentTimeMillis() - lllllllIllllIIl.y <= 3000L) break;
                        int lllllllIlllIlIl = llIl[2];
                        while (lllllllIlllIlIl < bt.z.size()) {
                            dt lllllllIllIlllI = (dt)bt.z.elementAt(lllllllIlllIlIl);
                            if (lllllllIllIlllI.a != lllllllIlllIlll.q && lllllllIllIlllI.f != null && lllllllIllIlllI.f.A <= 0) {
                                int lllllllIlllIIll = lllllllIlllIlll.j;
                                int lllllllIlllIIlI = lllllllIlllIlll.k;
                                v lllllllIllIllIl = lllllllIllIlllI.f;
                                v.b(lllllllIllIllIl.j, lllllllIllIllIl.k);
                                fn.a(500L);
                                if (d.b(lllllllIllIllIl)) {
                                    lllllllIllllIIl.y = System.currentTimeMillis();
                                    ei.a().x(lllllllIllIlllI.a);
                                    lllllllIllIllll.f = System.currentTimeMillis();
                                    lllllllIllIllll.l = llIl[0];
                                    lllllllIlllIlll.b(bt.t[lllllllIllIllll.a.a], llIl[2]);
                                    fn.a(1000L);
                                }
                                v.b(lllllllIlllIIll, lllllllIlllIIlI);
                                return;
                            }
                            ++lllllllIlllIlIl;
                        }
                        break;
                    }
                    ++lllllllIlllIIII;
                }
            }
            v v2 = lllllllIlllIIIl = bt.z.size() > 0 ? ((dt)bt.z.firstElement()).f : null;
            if (lllllllIllllIIl.w && lllllllIllllIIl.h() && lllllllIlllIIIl != null && lllllllIlllIlll.aw.a == llIl[1]) {
                lllllllIlllIIII = llIl[2];
                while (lllllllIlllIIII < lllllllIlllIlll.ax.size()) {
                    lllllllIllIllll = (eo)lllllllIlllIlll.ax.elementAt(lllllllIlllIIII);
                    if (!(lllllllIllIllll == null || lllllllIllIllll.a() || lllllllIllIllll.a.d != llIl[4] || lllllllIllIllll.a.a >= llIl[5] && lllllllIllIllll.a.a <= llIl[6])) {
                        System.currentTimeMillis();
                        int lllllllIlllIIll = llIl[2];
                        while (lllllllIlllIIll < lllllllIlllIIIl.ax.size()) {
                            lllllllIlllIIIl.ax.elementAt(lllllllIlllIIll);
                            ++lllllllIlllIIll;
                        }
                        lllllllIlllIIll = lllllllIlllIlll.j;
                        int lllllllIlllIIlI = lllllllIlllIlll.k;
                        v.b(lllllllIlllIIIl.j, lllllllIlllIIIl.k);
                        fn.a(200L);
                        v.b(lllllllIlllIIIl.j, lllllllIlllIIIl.k);
                        ei.a().g(lllllllIllIllll.a.a);
                        ei.a().r();
                        lllllllIllIllll.f = System.currentTimeMillis();
                        lllllllIllIllll.l = llIl[0];
                        lllllllIlllIlll.b(bt.t[lllllllIllIllll.a.a], llIl[2]);
                        fn.a(1000L);
                        v.b(lllllllIlllIIll, lllllllIlllIIlI);
                        return;
                    }
                    ++lllllllIlllIIII;
                }
            }
        } else {
            lllllllIllllIIl.a(lllllllIllllIIl.c, lllllllIllllIIl.d, llIl[7], llIl[7]);
        }
    }

    @Override
    public final String toString() {
        String string;
        f lllllllIllIlIII;
        if (this.w && this.x) {
            byte[] byArray = new byte[llIl[8]];
            byArray[f.llIl[2]] = llIl[2];
            byArray[f.llIl[0]] = llIl[9];
            byArray[f.llIl[4]] = llIl[2];
            byArray[f.llIl[10]] = llIl[11];
            byArray[f.llIl[3]] = llIl[2];
            byArray[f.llIl[12]] = llIl[13];
            byArray[f.llIl[1]] = llIl[2];
            byArray[f.llIl[14]] = llIl[13];
            byArray[f.llIl[15]] = llIl[2];
            byArray[f.llIl[16]] = llIl[17];
            byArray[f.llIl[18]] = llIl[2];
            byArray[f.llIl[19]] = llIl[6];
            byArray[f.llIl[20]] = llIl[2];
            byArray[f.llIl[21]] = llIl[22];
            byArray[f.llIl[23]] = llIl[2];
            byArray[f.llIl[24]] = llIl[17];
            byArray[f.llIl[25]] = llIl[2];
            byArray[f.llIl[26]] = llIl[27];
            byArray[f.llIl[28]] = llIl[2];
            byArray[f.llIl[29]] = llIl[30];
            return ec.a(byArray);
        }
        if (lllllllIllIlIII.x) {
            byte[] byArray = new byte[llIl[25]];
            byArray[f.llIl[2]] = llIl[2];
            byArray[f.llIl[0]] = llIl[6];
            byArray[f.llIl[4]] = llIl[2];
            byArray[f.llIl[10]] = llIl[22];
            byArray[f.llIl[3]] = llIl[2];
            byArray[f.llIl[12]] = llIl[31];
            byArray[f.llIl[1]] = llIl[2];
            byArray[f.llIl[14]] = llIl[32];
            byArray[f.llIl[15]] = llIl[2];
            byArray[f.llIl[16]] = llIl[33];
            byArray[f.llIl[18]] = llIl[2];
            byArray[f.llIl[19]] = llIl[17];
            byArray[f.llIl[20]] = llIl[2];
            byArray[f.llIl[21]] = llIl[27];
            byArray[f.llIl[23]] = llIl[2];
            byArray[f.llIl[24]] = llIl[30];
            string = ec.a(byArray);
        } else {
            byte[] byArray = new byte[llIl[23]];
            byArray[f.llIl[2]] = llIl[2];
            byArray[f.llIl[0]] = llIl[9];
            byArray[f.llIl[4]] = llIl[2];
            byArray[f.llIl[10]] = llIl[11];
            byArray[f.llIl[3]] = llIl[2];
            byArray[f.llIl[12]] = llIl[13];
            byArray[f.llIl[1]] = llIl[2];
            byArray[f.llIl[14]] = llIl[13];
            byArray[f.llIl[15]] = llIl[2];
            byArray[f.llIl[16]] = llIl[17];
            byArray[f.llIl[18]] = llIl[2];
            byArray[f.llIl[19]] = llIl[27];
            byArray[f.llIl[20]] = llIl[2];
            byArray[f.llIl[21]] = llIl[30];
            string = ec.a(byArray);
        }
        return string;
    }

    static {
        f.lIIl();
    }

    private static void lIIl() {
        llIl = new int[34];
        f.llIl[0] = " ".length();
        f.llIl[1] = "   ".length() << " ".length();
        f.llIl[2] = (0x97 ^ 0xBC) & ~(0x1C ^ 0x37);
        f.llIl[3] = " ".length() << (" ".length() << " ".length());
        f.llIl[4] = " ".length() << " ".length();
        f.llIl[5] = 0x3D ^ 0x7E;
        f.llIl[6] = (0xA1 ^ 0xA8) << "   ".length();
        f.llIl[7] = -" ".length();
        f.llIl[8] = (0x8A ^ 0x8F) << (" ".length() << " ".length());
        f.llIl[9] = (0x75 ^ 0x54) << " ".length();
        f.llIl[10] = "   ".length();
        f.llIl[11] = 0x19 ^ 0x6C;
        f.llIl[12] = 0xA1 ^ 0xA4;
        f.llIl[13] = (0x8F ^ 0xBC) << " ".length();
        f.llIl[14] = 0xBB ^ 0xBC;
        f.llIl[15] = " ".length() << "   ".length();
        f.llIl[16] = 0x86 ^ 0x8F;
        f.llIl[17] = " ".length() << (0x6A ^ 0x6F);
        f.llIl[18] = (0xA4 ^ 0xA1) << " ".length();
        f.llIl[19] = 0x5D ^ 0x56;
        f.llIl[20] = "   ".length() << (" ".length() << " ".length());
        f.llIl[21] = 0x8A ^ 0x87;
        f.llIl[22] = 0xE4 ^ 0xB7;
        f.llIl[23] = (0xB8 ^ 0xBF) << " ".length();
        f.llIl[24] = 0x42 ^ 0x4D;
        f.llIl[25] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        f.llIl[26] = 0x3C ^ 0x2D;
        f.llIl[27] = (0x7E ^ 0x75) << "   ".length();
        f.llIl[28] = (0x93 ^ 0x9A) << " ".length();
        f.llIl[29] = 0x26 ^ 0x35;
        f.llIl[30] = 0x62 ^ 3;
        f.llIl[31] = 0x54 ^ 0x3D;
        f.llIl[32] = (0x59 ^ 0x6E) << " ".length();
        f.llIl[33] = (0x8D ^ 0x80) << "   ".length();
    }
}

