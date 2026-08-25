/*
 * Decompiled with CFR 0.152.
 */
public class fj {
    public /* synthetic */ au cp;
    public /* synthetic */ au cq;
    public /* synthetic */ au cr;
    public static /* synthetic */ int cs;
    public static /* synthetic */ int ct;
    public static /* synthetic */ int cu;
    public static /* synthetic */ int cv;
    public static /* synthetic */ int cw;
    private static final /* synthetic */ int[] lIlIllII;

    static {
        fj.lIIIIIll();
        cw = lIlIllII[0];
        cs = fg.o.c() + lIlIllII[1];
        ct = lIlIllII[2] * fh.b;
        cu = lIlIllII[3];
        cv = lIlIllII[4];
    }

    public void c() {
        bq.i();
        bq.j();
        if (bq.E != null) {
            bq.E.a_();
        }
        bq.E = this;
        int n2 = lIlIllII[5];
        dc.a.setFullScreenMode(lIlIllII[5]);
    }

    public void a_() {
    }

    public static void Q() {
        cu = bq.g ? lIlIllII[6] : lIlIllII[7];
    }

    public void a(int n2) {
    }

    public void a() {
    }

    public void d() {
        fj llIIIllIllIlIlI;
        if (bq.n[lIlIllII[8]] || fj.a(bq.E.cq)) {
            bq.n[fj.lIlIllII[8]] = lIlIllII[0];
            cv = lIlIllII[4];
            bq.r = lIlIllII[0];
            if (llIIIllIllIlIlI.cq != null) {
                llIIIllIllIlIlI.cq.a();
            }
        }
        if (bq.n[lIlIllII[9]] || fj.a(bq.E.cp)) {
            bq.n[fj.lIlIllII[9]] = lIlIllII[0];
            cv = lIlIllII[4];
            bq.r = lIlIllII[0];
            if (aa.a().b) {
                if (aa.a().d != null) {
                    aa.a().d.a();
                }
            } else if (llIIIllIllIlIlI.cp != null) {
                llIIIllIllIlIlI.cp.a();
            }
        }
        if (bq.n[lIlIllII[10]] || fj.a(bq.E.cr)) {
            bq.n[fj.lIlIllII[10]] = lIlIllII[0];
            cv = lIlIllII[4];
            bq.r = lIlIllII[0];
            if (aa.a().b) {
                if (aa.a().e != null) {
                    aa.a().e.a();
                    return;
                }
            } else if (llIIIllIllIlIlI.cr != null) {
                llIIIllIllIlIlI.cr.a();
            }
        }
    }

    public static boolean a(au au2) {
        au llIIIllIllIIllI;
        if (au2 == null) {
            return lIlIllII[0];
        }
        if (llIIIllIllIIllI.f != 0 && llIIIllIllIIllI.g != 0) {
            return llIIIllIllIIllI.b();
        }
        if (bq.J != null) {
            if (bq.J.b != null && bq.b(bq.A - ct >> lIlIllII[5], bq.B - cu - lIlIllII[8], ct, cu + lIlIllII[11])) {
                cv = lIlIllII[5];
                if (llIIIllIllIIllI == bq.J.b && bq.q && bq.r) {
                    return lIlIllII[5];
                }
            }
            if (bq.J.a != null && bq.b(lIlIllII[0], bq.B - cu - lIlIllII[8], ct, cu + lIlIllII[11])) {
                cv = lIlIllII[0];
                if (llIIIllIllIIllI == bq.J.a && bq.q && bq.r) {
                    return lIlIllII[5];
                }
            }
            if (bq.J.c != null && bq.b(bq.A - ct, bq.B - cu - lIlIllII[8], ct, cu + lIlIllII[11])) {
                cv = lIlIllII[12];
                if ((llIIIllIllIIllI == bq.J.c || llIIIllIllIIllI == aa.a().e) && bq.q && bq.r) {
                    return lIlIllII[5];
                }
            }
        } else {
            if (llIIIllIllIIllI == bq.E.cp && bq.b(lIlIllII[0], bq.B - cu - lIlIllII[8], ct, cu + lIlIllII[11])) {
                cv = lIlIllII[0];
                if (bq.q && bq.r) {
                    return lIlIllII[5];
                }
            }
            if (llIIIllIllIIllI == bq.E.cr && bq.b(bq.A - ct, bq.B - cu - lIlIllII[8], ct, cu + lIlIllII[11])) {
                cv = lIlIllII[12];
                if (bq.q && bq.r) {
                    return lIlIllII[5];
                }
            }
            if ((llIIIllIllIIllI == bq.E.cq || y.b != null) && bq.b(bq.A - ct >> lIlIllII[5], bq.B - cu - lIlIllII[8], ct, cu + lIlIllII[11])) {
                cv = lIlIllII[5];
                if (bq.q && bq.r) {
                    return lIlIllII[5];
                }
            }
        }
        return lIlIllII[0];
    }

    private static fg b(int n2) {
        int llIIIllIllIIIll;
        if (n2 >= 0 && n2 < lIlIllII[11]) {
            return fg.a;
        }
        if (llIIIllIllIIIll >= lIlIllII[11] && llIIIllIllIIIll < lIlIllII[13]) {
            return fg.b;
        }
        if (llIIIllIllIIIll >= lIlIllII[13] && llIIIllIllIIIll < lIlIllII[14]) {
            return fg.c;
        }
        if (llIIIllIllIIIll >= lIlIllII[14] && llIIIllIllIIIll < lIlIllII[15]) {
            return fg.d;
        }
        if (llIIIllIllIIIll >= lIlIllII[15] && llIIIllIllIIIll < lIlIllII[16]) {
            return fg.e;
        }
        if (llIIIllIllIIIll >= lIlIllII[16] && llIIIllIllIIIll < lIlIllII[17]) {
            return fg.f;
        }
        return fg.f;
    }

    /*
     * WARNING - void declaration
     */
    public void a(fh fh2) {
        void llIIIllIlIlIIII;
        fh2.a(-fh2.a(), -fh2.b());
        fh2.d(lIlIllII[0], lIlIllII[0], bq.A, bq.B + lIlIllII[5]);
        dp.a(fh2);
        if (y.b != null) {
            dp.a(fh2, null, y.b.a, null);
        } else if (aa.a().b) {
            dp.a((fh)llIIIllIlIlIIII, aa.a().d, aa.a().f, aa.a().e);
        } else if (bq.J == null && !bq.F.a) {
            fj llIIIllIlIlIIIl;
            dp.a((fh)llIIIllIlIlIIII, llIIIllIlIlIIIl.cp, llIIIllIlIlIIIl.cq, llIIIllIlIlIIIl.cr);
        }
        if (!(bq.E instanceof ct)) {
            int llIIIllIlIIllll = cw / lIlIllII[5];
            byte[] byArray = new byte[lIlIllII[3]];
            byArray[fj.lIlIllII[0]] = lIlIllII[0];
            byArray[fj.lIlIllII[5]] = lIlIllII[18];
            byArray[fj.lIlIllII[12]] = lIlIllII[0];
            byArray[fj.lIlIllII[19]] = lIlIllII[20];
            byArray[fj.lIlIllII[21]] = lIlIllII[0];
            byArray[fj.lIlIllII[8]] = lIlIllII[22];
            byArray[fj.lIlIllII[23]] = lIlIllII[0];
            byArray[fj.lIlIllII[24]] = lIlIllII[25];
            byArray[fj.lIlIllII[1]] = lIlIllII[0];
            byArray[fj.lIlIllII[26]] = lIlIllII[18];
            byArray[fj.lIlIllII[11]] = lIlIllII[0];
            byArray[fj.lIlIllII[27]] = lIlIllII[28];
            byArray[fj.lIlIllII[9]] = lIlIllII[0];
            byArray[fj.lIlIllII[10]] = lIlIllII[29];
            byArray[fj.lIlIllII[30]] = lIlIllII[0];
            byArray[fj.lIlIllII[31]] = lIlIllII[32];
            byArray[fj.lIlIllII[33]] = lIlIllII[0];
            byArray[fj.lIlIllII[34]] = lIlIllII[18];
            byArray[fj.lIlIllII[35]] = lIlIllII[0];
            byArray[fj.lIlIllII[36]] = lIlIllII[37];
            byArray[fj.lIlIllII[13]] = lIlIllII[0];
            byArray[fj.lIlIllII[38]] = lIlIllII[39];
            fj.b(llIIIllIlIIllll).a((fh)llIIIllIlIlIIII, ec.a(byArray), bq.C - lIlIllII[15], bx.a == null ? lIlIllII[8] : lIlIllII[40], lIlIllII[0], fg.k);
        }
        if (bq.E instanceof bt) {
            byte[] byArray = new byte[lIlIllII[11]];
            byArray[fj.lIlIllII[0]] = lIlIllII[0];
            byArray[fj.lIlIllII[5]] = lIlIllII[41];
            byArray[fj.lIlIllII[12]] = lIlIllII[0];
            byArray[fj.lIlIllII[19]] = lIlIllII[42];
            byArray[fj.lIlIllII[21]] = lIlIllII[0];
            byArray[fj.lIlIllII[8]] = lIlIllII[43];
            byArray[fj.lIlIllII[23]] = lIlIllII[0];
            byArray[fj.lIlIllII[24]] = lIlIllII[44];
            byArray[fj.lIlIllII[1]] = lIlIllII[0];
            byArray[fj.lIlIllII[26]] = lIlIllII[45];
            fg.j.a((fh)llIIIllIlIlIIII, ec.a(byArray) + fb.o, fb.s + lIlIllII[8], fb.t + lIlIllII[8], lIlIllII[0], fg.k);
            byte[] byArray2 = new byte[lIlIllII[11]];
            byArray2[fj.lIlIllII[0]] = lIlIllII[0];
            byArray2[fj.lIlIllII[5]] = lIlIllII[25];
            byArray2[fj.lIlIllII[12]] = lIlIllII[0];
            byArray2[fj.lIlIllII[19]] = lIlIllII[46];
            byArray2[fj.lIlIllII[21]] = lIlIllII[0];
            byArray2[fj.lIlIllII[8]] = lIlIllII[47];
            byArray2[fj.lIlIllII[23]] = lIlIllII[0];
            byArray2[fj.lIlIllII[24]] = lIlIllII[44];
            byArray2[fj.lIlIllII[1]] = lIlIllII[0];
            byArray2[fj.lIlIllII[26]] = lIlIllII[45];
            fg.j.a((fh)llIIIllIlIlIIII, ec.a(byArray2) + fb.l, fb.s + lIlIllII[8], fb.t + lIlIllII[31], lIlIllII[0], fg.k);
            byte[] byArray3 = new byte[lIlIllII[1]];
            byArray3[fj.lIlIllII[0]] = lIlIllII[0];
            byArray3[fj.lIlIllII[5]] = lIlIllII[48];
            byArray3[fj.lIlIllII[12]] = lIlIllII[0];
            byArray3[fj.lIlIllII[19]] = lIlIllII[49];
            byArray3[fj.lIlIllII[21]] = lIlIllII[0];
            byArray3[fj.lIlIllII[8]] = lIlIllII[44];
            byArray3[fj.lIlIllII[23]] = lIlIllII[0];
            byArray3[fj.lIlIllII[24]] = lIlIllII[45];
            byte[] byArray4 = new byte[lIlIllII[12]];
            byArray4[fj.lIlIllII[0]] = lIlIllII[0];
            byArray4[fj.lIlIllII[5]] = lIlIllII[50];
            fg.j.a((fh)llIIIllIlIlIIII, ec.a(byArray3) + v.f().j + ec.a(byArray4) + v.f().k, fb.s + lIlIllII[8], fb.t + lIlIllII[40], lIlIllII[0], fg.k);
        }
    }

    private static void lIIIIIll() {
        lIlIllII = new int[51];
        fj.lIlIllII[0] = (0xC ^ 0x21) & ~(0x74 ^ 0x59);
        fj.lIlIllII[1] = " ".length() << "   ".length();
        fj.lIlIllII[2] = (0x7C ^ 0x5F) << " ".length();
        fj.lIlIllII[3] = (0x85 ^ 0x8E) << " ".length();
        fj.lIlIllII[4] = -" ".length();
        fj.lIlIllII[5] = " ".length();
        fj.lIlIllII[6] = (8 ^ 5) << " ".length();
        fj.lIlIllII[7] = "   ".length() << "   ".length();
        fj.lIlIllII[8] = 0xB2 ^ 0xB7;
        fj.lIlIllII[9] = "   ".length() << (" ".length() << " ".length());
        fj.lIlIllII[10] = 0x27 ^ 0x2A;
        fj.lIlIllII[11] = (0x1A ^ 0x1F) << " ".length();
        fj.lIlIllII[12] = " ".length() << " ".length();
        fj.lIlIllII[13] = (0x74 ^ 0x71) << (" ".length() << " ".length());
        fj.lIlIllII[14] = (0xAB ^ 0xA4) << " ".length();
        fj.lIlIllII[15] = (0x44 ^ 0x41) << "   ".length();
        fj.lIlIllII[16] = (0x99 ^ 0x80) << " ".length();
        fj.lIlIllII[17] = (0xD ^ 2) << (" ".length() << " ".length());
        fj.lIlIllII[18] = (0x12 ^ 0x35) << " ".length();
        fj.lIlIllII[19] = "   ".length();
        fj.lIlIllII[20] = 0x4F ^ 6;
        fj.lIlIllII[21] = " ".length() << (" ".length() << " ".length());
        fj.lIlIllII[22] = 0x4F ^ 0xC;
        fj.lIlIllII[23] = "   ".length() << " ".length();
        fj.lIlIllII[24] = 0xAF ^ 0xA8;
        fj.lIlIllII[25] = 0x10 ^ 0x5B;
        fj.lIlIllII[26] = 0xCF ^ 0xC6;
        fj.lIlIllII[27] = 0x33 ^ 0x38;
        fj.lIlIllII[28] = 0x68 ^ 0x3B;
        fj.lIlIllII[29] = 0xD2 ^ 0x9D;
        fj.lIlIllII[30] = (0 ^ 7) << " ".length();
        fj.lIlIllII[31] = 0x3C ^ 0x33;
        fj.lIlIllII[32] = (0x64 ^ 0x73) << " ".length();
        fj.lIlIllII[33] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        fj.lIlIllII[34] = 0xD3 ^ 0xC2;
        fj.lIlIllII[35] = (0x9E ^ 0x97) << " ".length();
        fj.lIlIllII[36] = 0x2F ^ 0x3C;
        fj.lIlIllII[37] = 0x38 ^ 0x7D;
        fj.lIlIllII[38] = 0x8A ^ 0x9F;
        fj.lIlIllII[39] = (0x23 ^ 0x36) << (" ".length() << " ".length());
        fj.lIlIllII[40] = 0x44 ^ 0x5D;
        fj.lIlIllII[41] = 0xCB ^ 0x86;
        fj.lIlIllII[42] = 0x54 ^ 0x35;
        fj.lIlIllII[43] = (0x3E ^ 0x39) << (" ".length() << (" ".length() << " ".length()));
        fj.lIlIllII[44] = (0x57 ^ 0x4A) << " ".length();
        fj.lIlIllII[45] = " ".length() << (0x2B ^ 0x2E);
        fj.lIlIllII[46] = (0x50 ^ 0x5D) << "   ".length();
        fj.lIlIllII[47] = 0x2A ^ 0x5F;
        fj.lIlIllII[48] = (0x50 ^ 0x5B) << "   ".length();
        fj.lIlIllII[49] = 0x6D ^ 0x34;
        fj.lIlIllII[50] = 0x8D ^ 0xA2;
    }
}

