/*
 * Decompiled with CFR 0.152.
 */
public class i
extends d {
    private /* synthetic */ String w;
    private /* synthetic */ int x;
    private /* synthetic */ long y;
    private static final /* synthetic */ int[] lIIlI;

    public i(String string, int n2) {
        this.w = string;
        this.x = n2;
    }

    /*
     * WARNING - void declaration
     */
    public cd[] c(int n2, int n3) {
        cd[] cdArray = v.f().aC;
        cd[] cdArray2 = new cd[lIIlI[0]];
        int n4 = lIIlI[1];
        int n5 = lIIlI[1];
        while (n5 < cdArray.length) {
            void lllllllIIlIIIII;
            void lllllllIIIlllll;
            void lllllllIIIllIIl;
            void lllllllIIIlllIl;
            if (lllllllIIIlllIl[lllllllIIIllIIl] != null && lllllllIIIlllIl[lllllllIIIllIIl].b.a == lllllllIIIlllll && !lllllllIIIlllIl[lllllllIIIllIIl].h && lllllllIIlIIIII > 0) {
                lllllllIIIllIll[++lllllllIIIllIlI] = lllllllIIIlllIl[lllllllIIIllIIl];
                --lllllllIIlIIIII;
            }
            ++lllllllIIIllIIl;
        }
        return cdArray2;
    }

    /*
     * WARNING - void declaration
     */
    public cd[] e(int n2) {
        cd[] cdArray = v.f().aC;
        cd[] cdArray2 = new cd[lIIlI[0]];
        int n3 = lIIlI[1];
        int n4 = lIIlI[1];
        while (n4 < cdArray.length) {
            void lllllllIIIIllIl;
            void lllllllIIIIlIIl;
            void lllllllIIIIllII;
            if (lllllllIIIIllII[lllllllIIIIlIIl] != null && !lllllllIIIIllII[lllllllIIIIlIIl].h && lllllllIIIIllIl > 0) {
                lllllllIIIIlIll[++lllllllIIIIlIlI] = lllllllIIIIllII[lllllllIIIIlIIl];
                --lllllllIIIIllIl;
            }
            ++lllllllIIIIlIIl;
        }
        return cdArray2;
    }

    @Override
    protected void p() {
        if (i.b(v.f())) {
            i.a(lIIlI[1]);
        } else {
            i llllllIlllllIlI;
            cd[] llllllIlllllIII = new cd[lIIlI[0]];
            if (llllllIlllllIlI.x != lIIlI[2]) {
                if (at.e(llllllIlllllIlI.x)) {
                    v llllllIlllllIIl = fn.a(llllllIlllllIlI.w);
                    if (llllllIlllllIIl != null) {
                        if (Math.abs(llllllIlllllIIl.j - v.f().j) > lIIlI[3] || Math.abs(llllllIlllllIIl.k - v.f().k) > lIIlI[3]) {
                            v.b(llllllIlllllIIl.j, llllllIlllllIIl.k);
                        } else if (System.currentTimeMillis() - llllllIlllllIlI.y >= 5000L) {
                            ei.a().s(llllllIlllllIIl.q);
                            llllllIlllllIlI.y = System.currentTimeMillis();
                        }
                    }
                    if (bt.aL) {
                        int llllllIllllIlll = at.h(llllllIlllllIlI.x) >= lIIlI[0] ? lIIlI[0] : at.h(llllllIlllllIlI.x);
                        llllllIlllllIII = llllllIlllllIlI.c(llllllIllllIlll, llllllIlllllIlI.x);
                        bt.m().bd = lIIlI[1];
                        bt.av = llllllIlllllIII;
                        ei.a().a(lIIlI[1], bt.av);
                        bt.m().bb = lIIlI[4];
                        long llllllIllllIlIl = System.currentTimeMillis();
                        while (System.currentTimeMillis() - llllllIllllIlIl < 5000L) {
                            fn.a(100L);
                            if (bt.aL) continue;
                            return;
                        }
                        ei.a().j();
                        bt.m().bb = lIIlI[4];
                        llllllIllllIlIl = System.currentTimeMillis();
                        int llllllIllllIIll = lIIlI[1];
                        while (llllllIllllIIll < lIIlI[0]) {
                            if (llllllIlllllIII[llllllIllllIIll] != null) {
                                v.f().aC[llllllIlllllIII[llllllIllllIIll].e] = null;
                            }
                            ++llllllIllllIIll;
                        }
                        while (bt.aL) {
                            fn.a(200L);
                        }
                    }
                } else {
                    byte[] byArray = new byte[lIIlI[5]];
                    byArray[i.lIIlI[1]] = lIIlI[4];
                    byArray[i.lIIlI[4]] = lIIlI[6];
                    byArray[i.lIIlI[7]] = lIIlI[1];
                    byArray[i.lIIlI[8]] = lIIlI[9];
                    byArray[i.lIIlI[10]] = lIIlI[1];
                    byArray[i.lIIlI[11]] = lIIlI[12];
                    byArray[i.lIIlI[13]] = lIIlI[1];
                    byArray[i.lIIlI[14]] = lIIlI[15];
                    byArray[i.lIIlI[16]] = lIIlI[1];
                    byArray[i.lIIlI[17]] = lIIlI[18];
                    byArray[i.lIIlI[19]] = lIIlI[1];
                    byArray[i.lIIlI[20]] = lIIlI[21];
                    byArray[i.lIIlI[0]] = lIIlI[1];
                    byArray[i.lIIlI[22]] = lIIlI[23];
                    byArray[i.lIIlI[24]] = lIIlI[1];
                    byArray[i.lIIlI[25]] = lIIlI[12];
                    byArray[i.lIIlI[6]] = lIIlI[1];
                    byArray[i.lIIlI[26]] = lIIlI[27];
                    byArray[i.lIIlI[28]] = lIIlI[29];
                    byArray[i.lIIlI[30]] = lIIlI[31];
                    byArray[i.lIIlI[32]] = lIIlI[1];
                    byArray[i.lIIlI[33]] = lIIlI[34];
                    byArray[i.lIIlI[35]] = lIIlI[1];
                    byArray[i.lIIlI[36]] = lIIlI[37];
                    byArray[i.lIIlI[38]] = lIIlI[1];
                    byArray[i.lIIlI[39]] = lIIlI[12];
                    byArray[i.lIIlI[40]] = lIIlI[1];
                    byArray[i.lIIlI[41]] = lIIlI[37];
                    byArray[i.lIIlI[42]] = lIIlI[29];
                    byArray[i.lIIlI[43]] = lIIlI[44];
                    byArray[i.lIIlI[29]] = lIIlI[1];
                    byArray[i.lIIlI[45]] = lIIlI[46];
                    byArray[i.lIIlI[12]] = lIIlI[1];
                    byArray[i.lIIlI[47]] = lIIlI[12];
                    byArray[i.lIIlI[48]] = lIIlI[1];
                    byArray[i.lIIlI[49]] = lIIlI[50];
                    byArray[i.lIIlI[51]] = lIIlI[1];
                    byArray[i.lIIlI[52]] = lIIlI[53];
                    at.a(ec.a(byArray));
                    at.c = null;
                }
            } else if (at.o() > 0) {
                v llllllIlllllIIl = fn.a(llllllIlllllIlI.w);
                if (llllllIlllllIIl != null) {
                    if (Math.abs(llllllIlllllIIl.j - v.f().j) > lIIlI[3] || Math.abs(llllllIlllllIIl.k - v.f().k) > lIIlI[3]) {
                        v.b(llllllIlllllIIl.j, llllllIlllllIIl.k);
                    } else if (System.currentTimeMillis() - llllllIlllllIlI.y >= 5000L) {
                        ei.a().s(llllllIlllllIIl.q);
                        llllllIlllllIlI.y = System.currentTimeMillis();
                    }
                }
                if (bt.aL) {
                    int llllllIllllIlll = at.o() >= lIIlI[0] ? lIIlI[0] : at.o();
                    llllllIlllllIII = llllllIlllllIlI.e(llllllIllllIlll);
                    bt.m().bd = lIIlI[1];
                    bt.av = llllllIlllllIII;
                    ei.a().a(lIIlI[1], bt.av);
                    bt.m().bb = lIIlI[4];
                    long llllllIllllIlIl = System.currentTimeMillis();
                    while (System.currentTimeMillis() - llllllIllllIlIl < 5000L) {
                        fn.a(100L);
                        if (bt.aL) continue;
                        return;
                    }
                    ei.a().j();
                    bt.m().bb = lIIlI[4];
                    llllllIllllIlIl = System.currentTimeMillis();
                    int llllllIllllIIll = lIIlI[1];
                    while (llllllIllllIIll < lIIlI[0]) {
                        if (llllllIlllllIII[llllllIllllIIll] != null) {
                            v.f().aC[llllllIlllllIII[llllllIllllIIll].e] = null;
                        }
                        ++llllllIllllIIll;
                    }
                    while (bt.aL) {
                        fn.a(200L);
                    }
                }
            } else {
                byte[] byArray = new byte[lIIlI[54]];
                byArray[i.lIIlI[1]] = lIIlI[4];
                byArray[i.lIIlI[4]] = lIIlI[6];
                byArray[i.lIIlI[7]] = lIIlI[1];
                byArray[i.lIIlI[8]] = lIIlI[9];
                byArray[i.lIIlI[10]] = lIIlI[1];
                byArray[i.lIIlI[11]] = lIIlI[12];
                byArray[i.lIIlI[13]] = lIIlI[1];
                byArray[i.lIIlI[14]] = lIIlI[15];
                byArray[i.lIIlI[16]] = lIIlI[1];
                byArray[i.lIIlI[17]] = lIIlI[18];
                byArray[i.lIIlI[19]] = lIIlI[1];
                byArray[i.lIIlI[20]] = lIIlI[21];
                byArray[i.lIIlI[0]] = lIIlI[1];
                byArray[i.lIIlI[22]] = lIIlI[23];
                byArray[i.lIIlI[24]] = lIIlI[1];
                byArray[i.lIIlI[25]] = lIIlI[12];
                byArray[i.lIIlI[6]] = lIIlI[1];
                byArray[i.lIIlI[26]] = lIIlI[27];
                byArray[i.lIIlI[28]] = lIIlI[29];
                byArray[i.lIIlI[30]] = lIIlI[31];
                byArray[i.lIIlI[32]] = lIIlI[1];
                byArray[i.lIIlI[33]] = lIIlI[34];
                byArray[i.lIIlI[35]] = lIIlI[1];
                byArray[i.lIIlI[36]] = lIIlI[37];
                byArray[i.lIIlI[38]] = lIIlI[1];
                byArray[i.lIIlI[39]] = lIIlI[12];
                byArray[i.lIIlI[40]] = lIIlI[1];
                byArray[i.lIIlI[41]] = lIIlI[37];
                byArray[i.lIIlI[42]] = lIIlI[29];
                byArray[i.lIIlI[43]] = lIIlI[44];
                byArray[i.lIIlI[29]] = lIIlI[1];
                byArray[i.lIIlI[45]] = lIIlI[46];
                byArray[i.lIIlI[12]] = lIIlI[1];
                byArray[i.lIIlI[47]] = lIIlI[12];
                byArray[i.lIIlI[48]] = lIIlI[1];
                byArray[i.lIIlI[49]] = lIIlI[50];
                byArray[i.lIIlI[51]] = lIIlI[1];
                byArray[i.lIIlI[52]] = lIIlI[53];
                byArray[i.lIIlI[5]] = lIIlI[1];
                byArray[i.lIIlI[55]] = lIIlI[12];
                byArray[i.lIIlI[56]] = lIIlI[1];
                byArray[i.lIIlI[57]] = lIIlI[58];
                byArray[i.lIIlI[59]] = lIIlI[1];
                byArray[i.lIIlI[60]] = lIIlI[37];
                byArray[i.lIIlI[61]] = lIIlI[1];
                byArray[i.lIIlI[62]] = lIIlI[63];
                byArray[i.lIIlI[64]] = lIIlI[1];
                byArray[i.lIIlI[65]] = lIIlI[66];
                byArray[i.lIIlI[67]] = lIIlI[1];
                byArray[i.lIIlI[68]] = lIIlI[15];
                byArray[i.lIIlI[3]] = lIIlI[1];
                byArray[i.lIIlI[69]] = lIIlI[12];
                byArray[i.lIIlI[70]] = lIIlI[1];
                byArray[i.lIIlI[71]] = lIIlI[58];
                byArray[i.lIIlI[72]] = lIIlI[1];
                byArray[i.lIIlI[73]] = lIIlI[37];
                byArray[i.lIIlI[74]] = lIIlI[1];
                byArray[i.lIIlI[75]] = lIIlI[23];
                byArray[i.lIIlI[76]] = lIIlI[1];
                byArray[i.lIIlI[77]] = lIIlI[78];
                at.a(ec.a(byArray));
                at.c = null;
            }
        }
    }

    @Override
    public String toString() {
        byte[] byArray = new byte[lIIlI[42]];
        byArray[i.lIIlI[1]] = lIIlI[1];
        byArray[i.lIIlI[4]] = lIIlI[79];
        byArray[i.lIIlI[7]] = lIIlI[1];
        byArray[i.lIIlI[8]] = lIIlI[80];
        byArray[i.lIIlI[10]] = lIIlI[1];
        byArray[i.lIIlI[11]] = lIIlI[46];
        byArray[i.lIIlI[13]] = lIIlI[1];
        byArray[i.lIIlI[14]] = lIIlI[23];
        byArray[i.lIIlI[16]] = lIIlI[1];
        byArray[i.lIIlI[17]] = lIIlI[12];
        byArray[i.lIIlI[19]] = lIIlI[1];
        byArray[i.lIIlI[20]] = lIIlI[15];
        byArray[i.lIIlI[0]] = lIIlI[1];
        byArray[i.lIIlI[22]] = lIIlI[18];
        byArray[i.lIIlI[24]] = lIIlI[1];
        byArray[i.lIIlI[25]] = lIIlI[21];
        byArray[i.lIIlI[6]] = lIIlI[1];
        byArray[i.lIIlI[26]] = lIIlI[23];
        byArray[i.lIIlI[28]] = lIIlI[1];
        byArray[i.lIIlI[30]] = lIIlI[12];
        byArray[i.lIIlI[32]] = lIIlI[1];
        byArray[i.lIIlI[33]] = lIIlI[27];
        byArray[i.lIIlI[35]] = lIIlI[29];
        byArray[i.lIIlI[36]] = lIIlI[31];
        byArray[i.lIIlI[38]] = lIIlI[1];
        byArray[i.lIIlI[39]] = lIIlI[34];
        byArray[i.lIIlI[40]] = lIIlI[1];
        byArray[i.lIIlI[41]] = lIIlI[37];
        return ec.a(byArray);
    }

    static {
        i.llII();
    }

    private static void llII() {
        lIIlI = new int[81];
        i.lIIlI[0] = "   ".length() << (" ".length() << " ".length());
        i.lIIlI[1] = (0x74 ^ 0x7F) << "   ".length() & ~((0x9F ^ 0x94) << "   ".length());
        i.lIIlI[2] = -" ".length();
        i.lIIlI[3] = (0x79 ^ 0x60) << " ".length();
        i.lIIlI[4] = " ".length();
        i.lIIlI[5] = (0x62 ^ 0x71) << " ".length();
        i.lIIlI[6] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        i.lIIlI[7] = " ".length() << " ".length();
        i.lIIlI[8] = "   ".length();
        i.lIIlI[9] = -(0x88 ^ 0x95);
        i.lIIlI[10] = " ".length() << (" ".length() << " ".length());
        i.lIIlI[11] = 0x99 ^ 0x9C;
        i.lIIlI[12] = " ".length() << (0x66 ^ 0x63);
        i.lIIlI[13] = "   ".length() << " ".length();
        i.lIIlI[14] = 0x6E ^ 0x69;
        i.lIIlI[15] = 0xF6 ^ 0x91;
        i.lIIlI[16] = " ".length() << "   ".length();
        i.lIIlI[17] = 0x29 ^ 0x20;
        i.lIIlI[18] = 0x4B ^ 0x22;
        i.lIIlI[19] = (6 ^ 3) << " ".length();
        i.lIIlI[20] = 0xAA ^ 0xA1;
        i.lIIlI[21] = 0x3A ^ 0x5B;
        i.lIIlI[22] = 0x6A ^ 0x67;
        i.lIIlI[23] = 0x19 ^ 0x76;
        i.lIIlI[24] = (0x5F ^ 0x58) << " ".length();
        i.lIIlI[25] = 2 ^ 0xD;
        i.lIIlI[26] = 0x48 ^ 0x59;
        i.lIIlI[27] = (0x3E ^ 0x27) << (" ".length() << " ".length());
        i.lIIlI[28] = (0x7E ^ 0x77) << " ".length();
        i.lIIlI[29] = (0x8E ^ 0x81) << " ".length();
        i.lIIlI[30] = 0xA6 ^ 0xB5;
        i.lIIlI[31] = -(0x8E ^ 0xBB);
        i.lIIlI[32] = (0x83 ^ 0x86) << (" ".length() << " ".length());
        i.lIIlI[33] = 0x30 ^ 0x25;
        i.lIIlI[34] = 0x72 ^ 0x11;
        i.lIIlI[35] = (0x85 ^ 0x8E) << " ".length();
        i.lIIlI[36] = 0x56 ^ 0x41;
        i.lIIlI[37] = (0x8E ^ 0x83) << "   ".length();
        i.lIIlI[38] = "   ".length() << "   ".length();
        i.lIIlI[39] = 0xC ^ 0x15;
        i.lIIlI[40] = (0x17 ^ 0x1A) << " ".length();
        i.lIIlI[41] = 0x59 ^ 0x42;
        i.lIIlI[42] = (0x32 ^ 0x35) << (" ".length() << " ".length());
        i.lIIlI[43] = 0xBB ^ 0xA6;
        i.lIIlI[44] = -(0x51 ^ 0x10);
        i.lIIlI[45] = 0xDC ^ 0xC3;
        i.lIIlI[46] = (0x2B ^ 0x36) << (" ".length() << " ".length());
        i.lIIlI[47] = 0x4B ^ 0x6A;
        i.lIIlI[48] = (0x76 ^ 0x67) << " ".length();
        i.lIIlI[49] = 0x7A ^ 0x59;
        i.lIIlI[50] = (0xC ^ 0x37) << " ".length();
        i.lIIlI[51] = (0xA6 ^ 0xAF) << (" ".length() << " ".length());
        i.lIIlI[52] = 0x97 ^ 0xB2;
        i.lIIlI[53] = (0x50 ^ 0x57) << (" ".length() << (" ".length() << " ".length()));
        i.lIIlI[54] = (0x82 ^ 0x8D) << (" ".length() << " ".length());
        i.lIIlI[55] = 0x7F ^ 0x58;
        i.lIIlI[56] = (0xD ^ 8) << "   ".length();
        i.lIIlI[57] = 0x53 ^ 0x7A;
        i.lIIlI[58] = 0x15 ^ 0x7E;
        i.lIIlI[59] = (0x2D ^ 0x38) << " ".length();
        i.lIIlI[60] = 0x25 ^ 0xE;
        i.lIIlI[61] = (0xA8 ^ 0xA3) << (" ".length() << " ".length());
        i.lIIlI[62] = 0xB2 ^ 0x9F;
        i.lIIlI[63] = -(0x97 ^ 0x9B);
        i.lIIlI[64] = (0xA5 ^ 0xB2) << " ".length();
        i.lIIlI[65] = 0x84 ^ 0xAB;
        i.lIIlI[66] = (0x85 ^ 0xB2) << " ".length();
        i.lIIlI[67] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        i.lIIlI[68] = 0x3A ^ 0xB;
        i.lIIlI[69] = 0x21 ^ 0x12;
        i.lIIlI[70] = (0x17 ^ 0x1A) << (" ".length() << " ".length());
        i.lIIlI[71] = 0x4B ^ 0x7E;
        i.lIIlI[72] = (0x65 ^ 0x7E) << " ".length();
        i.lIIlI[73] = 0x56 ^ 0x61;
        i.lIIlI[74] = (0x6D ^ 0x6A) << "   ".length();
        i.lIIlI[75] = 0x75 ^ 0x4C;
        i.lIIlI[76] = (0x47 ^ 0x5A) << " ".length();
        i.lIIlI[77] = 0x8A ^ 0xB1;
        i.lIIlI[78] = -(0 ^ 0x1F);
        i.lIIlI[79] = 0x79 ^ 0x38;
        i.lIIlI[80] = 0xD9 ^ 0xAC;
    }
}

