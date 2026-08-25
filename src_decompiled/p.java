/*
 * Decompiled with CFR 0.152.
 */
public class p
extends d {
    private static /* synthetic */ long x;
    private /* synthetic */ boolean y;
    public static /* synthetic */ d w;
    private static final /* synthetic */ int[] lllIIIl;

    static {
        p.lIlIlII();
        x = 0L;
    }

    public p() {
        this.y = lllIIIl[0];
    }

    public void q() {
        super.b();
        this.d = fm.b;
        this.c = fm.a;
    }

    @Override
    protected void p() {
        if (fb.g(fb.o)) {
            fn.b();
            return;
        }
        long lllIIlIlllIllll = (v.f().i > 0L ? v.f().i : v.f().F) * 100L / bt.aP[v.f().x];
        if (!(v.f().i > 0L && Math.abs(lllIIlIlllIllll) <= 15L || v.f().i <= 0L && Math.abs(lllIIlIlllIllll) >= 0L)) {
            ei.a().z(lllIIIl[0]);
            byte[] byArray = new byte[lllIIIl[1]];
            byArray[p.lllIIIl[0]] = lllIIIl[2];
            byArray[p.lllIIIl[2]] = lllIIIl[3];
            byArray[p.lllIIIl[4]] = lllIIIl[0];
            byArray[p.lllIIIl[5]] = lllIIIl[6];
            byArray[p.lllIIIl[7]] = lllIIIl[0];
            byArray[p.lllIIIl[8]] = lllIIIl[9];
            byArray[p.lllIIIl[10]] = lllIIIl[0];
            byArray[p.lllIIIl[11]] = lllIIIl[12];
            byArray[p.lllIIIl[13]] = lllIIIl[0];
            byArray[p.lllIIIl[14]] = lllIIIl[15];
            byArray[p.lllIIIl[16]] = lllIIIl[0];
            byArray[p.lllIIIl[17]] = lllIIIl[9];
            byArray[p.lllIIIl[18]] = lllIIIl[0];
            byArray[p.lllIIIl[19]] = lllIIIl[20];
            byArray[p.lllIIIl[21]] = lllIIIl[0];
            byArray[p.lllIIIl[22]] = lllIIIl[23];
            byArray[p.lllIIIl[3]] = lllIIIl[0];
            byArray[p.lllIIIl[24]] = lllIIIl[25];
            byArray[p.lllIIIl[26]] = lllIIIl[0];
            byArray[p.lllIIIl[27]] = lllIIIl[28];
            byArray[p.lllIIIl[29]] = lllIIIl[0];
            byArray[p.lllIIIl[30]] = lllIIIl[31];
            byArray[p.lllIIIl[32]] = lllIIIl[0];
            byArray[p.lllIIIl[33]] = lllIIIl[31];
            at.a(ec.a(byArray));
            if (w != null) {
                at.c = w;
                w = null;
                return;
            }
            at.c();
        } else {
            p lllIIlIllllIIII;
            if (v.f().aN <= lllIIIl[16] && !lllIIlIllllIIII.y) {
                if (p.b(v.f())) {
                    p.a(lllIIIl[2]);
                    return;
                }
                if (fb.o == fm.a && fb.l == fm.c) {
                    if (v.f().j == fm.d && v.f().k == fm.e) {
                        if (System.currentTimeMillis() - x >= 300L) {
                            dh lllIIlIlllIlllI = new dh();
                            int lllIIlIlllIllIl = lllIIIl[0];
                            while (lllIIlIlllIllIl < bt.F.size()) {
                                v lllIIlIlllIllII = (v)bt.F.elementAt(lllIIlIlllIllIl);
                                if (lllIIlIlllIllII.A > 0 && Math.abs(v.f().j - lllIIlIlllIllII.j) <= lllIIIl[34] && Math.abs(v.f().k - lllIIlIlllIllII.k) <= lllIIIl[34] && lllIIlIlllIlllI.size() <= p.d().i) {
                                    lllIIlIlllIlllI.addElement(lllIIlIlllIllII);
                                    if (lllIIlIlllIllII.A > 0 && Math.abs(v.f().j - lllIIlIlllIllII.j) <= lllIIIl[34] && Math.abs(v.f().k - lllIIlIlllIllII.k) <= lllIIIl[34]) {
                                        ei.a().a(new dh(), lllIIlIlllIlllI, lllIIIl[4]);
                                        x = System.currentTimeMillis();
                                    }
                                }
                                ++lllIIlIlllIllIl;
                            }
                        }
                        fn.a(100L);
                        return;
                    }
                    ei.a().z(lllIIIl[5]);
                    if (fm.d != lllIIIl[35] && fm.e != lllIIIl[35]) {
                        v.b(fm.d, fm.e);
                    } else {
                        fm.d = v.f().j;
                        fm.e = v.f().k;
                    }
                    fn.a(500L);
                    return;
                }
                lllIIlIllllIIII.a(fm.a, fm.c, lllIIIl[35], lllIIIl[35]);
                return;
            }
            lllIIlIllllIIII.y = v.f().aN > lllIIIl[10] ? lllIIIl[2] : lllIIIl[0];
            int n2 = lllIIlIllllIIII.y ? 1 : 0;
            if (p.b(v.f())) {
                p.a(lllIIIl[2]);
                return;
            }
            if (fb.o != fm.a || fb.l != fm.b) {
                lllIIlIllllIIII.a(fm.a, fm.b, lllIIIl[35], lllIIIl[35]);
                return;
            }
            if (v.f().j != fm.d || v.f().k != fm.e) {
                ei.a().z(lllIIIl[5]);
                if (fm.d != lllIIIl[35] && fm.e != lllIIIl[35]) {
                    v.b(fm.d, fm.e);
                } else {
                    fm.d = v.f().j;
                    fm.e = v.f().k;
                }
                fn.a(500L);
                return;
            }
            at.p();
        }
    }

    @Override
    public String toString() {
        byte[] byArray = new byte[lllIIIl[29]];
        byArray[p.lllIIIl[0]] = lllIIIl[0];
        byArray[p.lllIIIl[2]] = lllIIIl[36];
        byArray[p.lllIIIl[4]] = lllIIIl[0];
        byArray[p.lllIIIl[5]] = lllIIIl[37];
        byArray[p.lllIIIl[7]] = lllIIIl[0];
        byArray[p.lllIIIl[8]] = lllIIIl[38];
        byArray[p.lllIIIl[10]] = lllIIIl[0];
        byArray[p.lllIIIl[11]] = lllIIIl[23];
        byArray[p.lllIIIl[13]] = lllIIIl[0];
        byArray[p.lllIIIl[14]] = lllIIIl[9];
        byArray[p.lllIIIl[16]] = lllIIIl[0];
        byArray[p.lllIIIl[17]] = lllIIIl[12];
        byArray[p.lllIIIl[18]] = lllIIIl[0];
        byArray[p.lllIIIl[19]] = lllIIIl[15];
        byArray[p.lllIIIl[21]] = lllIIIl[0];
        byArray[p.lllIIIl[22]] = lllIIIl[9];
        byArray[p.lllIIIl[3]] = lllIIIl[0];
        byArray[p.lllIIIl[24]] = lllIIIl[39];
        byArray[p.lllIIIl[26]] = lllIIIl[0];
        byArray[p.lllIIIl[27]] = lllIIIl[40];
        return ec.a(byArray);
    }

    private static void lIlIlII() {
        lllIIIl = new int[41];
        p.lllIIIl[0] = (0x57 ^ 0x58) << (" ".length() << " ".length()) & ~((0x9F ^ 0x90) << (" ".length() << " ".length()));
        p.lllIIIl[1] = "   ".length() << "   ".length();
        p.lllIIIl[2] = " ".length();
        p.lllIIIl[3] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        p.lllIIIl[4] = " ".length() << " ".length();
        p.lllIIIl[5] = "   ".length();
        p.lllIIIl[6] = -(0x8D ^ 0x90);
        p.lllIIIl[7] = " ".length() << (" ".length() << " ".length());
        p.lllIIIl[8] = 0x23 ^ 0x26;
        p.lllIIIl[9] = " ".length() << (0xAF ^ 0xAA);
        p.lllIIIl[10] = "   ".length() << " ".length();
        p.lllIIIl[11] = 0xA4 ^ 0xA3;
        p.lllIIIl[12] = (0x9E ^ 0x99) << (" ".length() << (" ".length() << " ".length()));
        p.lllIIIl[13] = " ".length() << "   ".length();
        p.lllIIIl[14] = 0x5D ^ 0x54;
        p.lllIIIl[15] = 0xAC ^ 0xC7;
        p.lllIIIl[16] = (0xC7 ^ 0xC2) << " ".length();
        p.lllIIIl[17] = 0x80 ^ 0x8B;
        p.lllIIIl[18] = "   ".length() << (" ".length() << " ".length());
        p.lllIIIl[19] = 0x7A ^ 0x77;
        p.lllIIIl[20] = (0xD ^ 2) << "   ".length();
        p.lllIIIl[21] = (0x34 ^ 0x33) << " ".length();
        p.lllIIIl[22] = 3 ^ 0xC;
        p.lllIIIl[23] = 0x2C ^ 0x43;
        p.lllIIIl[24] = 0x90 ^ 0x81;
        p.lllIIIl[25] = (0xA4 ^ 0x93) << " ".length();
        p.lllIIIl[26] = (0x29 ^ 0x20) << " ".length();
        p.lllIIIl[27] = 0xD2 ^ 0xC1;
        p.lllIIIl[28] = 0xC8 ^ 0xAF;
        p.lllIIIl[29] = (0x30 ^ 0x35) << (" ".length() << " ".length());
        p.lllIIIl[30] = 0x11 ^ 4;
        p.lllIIIl[31] = 0xBB ^ 0x9A;
        p.lllIIIl[32] = (0x9A ^ 0x91) << " ".length();
        p.lllIIIl[33] = 0x29 ^ 0x3E;
        p.lllIIIl[34] = (0x7F ^ 0x66) << " ".length();
        p.lllIIIl[35] = -" ".length();
        p.lllIIIl[36] = 0xF1 ^ 0xB0;
        p.lllIIIl[37] = 0xB ^ 0x7E;
        p.lllIIIl[38] = (0xB6 ^ 0xAB) << (" ".length() << " ".length());
        p.lllIIIl[39] = -(7 ^ 0x19);
        p.lllIIIl[40] = 0x2A ^ 0x47;
    }
}

