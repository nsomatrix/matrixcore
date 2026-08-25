/*
 * Decompiled with CFR 0.152.
 */
public final class as {
    /* synthetic */ long a;
    public /* synthetic */ String b;
    public /* synthetic */ boolean c;
    public /* synthetic */ short d;
    public /* synthetic */ short e;
    private /* synthetic */ byte f;
    private static final /* synthetic */ int[] lllIlI;

    public as(short s2, short s3, long l2, String string, byte by2) {
        this.a = System.currentTimeMillis() + l2 * 1000L;
        this.b = string;
        this.d = s2;
        this.e = s3;
        this.f = by2;
        if (this.f == 0) {
            this.a = l2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(fh fh2, int n2, int n3) {
        void llllIlIlIllIIlI;
        void llllIlIlIllIIll;
        void llllIlIlIllIlII;
        as llllIlIlIllIlIl;
        if (this.e == lllIlI[0]) {
            if (this.f != lllIlI[1]) {
                fg.g.a(fh2, this.b, n2 + lllIlI[1], n3 + lllIlI[1], lllIlI[1]);
                fg.i.a(fh2, this.b, n2, n3, lllIlI[1]);
                return;
            }
            int llllIlIlIllIIIl = (int)((llllIlIlIllIlIl.a - System.currentTimeMillis()) / 1000L);
            if (llllIlIlIllIIIl > 0) {
                byte[] byArray = new byte[lllIlI[2]];
                byArray[as.lllIlI[3]] = lllIlI[3];
                byArray[as.lllIlI[1]] = lllIlI[4];
                byArray[as.lllIlI[5]] = lllIlI[3];
                byArray[as.lllIlI[6]] = lllIlI[7];
                byArray[as.lllIlI[8]] = lllIlI[3];
                byArray[as.lllIlI[9]] = lllIlI[4];
                fg.g.a((fh)llllIlIlIllIlII, String.valueOf(llllIlIlIllIlIl.b) + ec.a(byArray) + as.a(llllIlIlIllIIIl), (int)(llllIlIlIllIIll - lllIlI[9]), (int)(llllIlIlIllIIlI + lllIlI[1]), lllIlI[1]);
                byte[] byArray2 = new byte[lllIlI[2]];
                byArray2[as.lllIlI[3]] = lllIlI[3];
                byArray2[as.lllIlI[1]] = lllIlI[4];
                byArray2[as.lllIlI[5]] = lllIlI[3];
                byArray2[as.lllIlI[6]] = lllIlI[7];
                byArray2[as.lllIlI[8]] = lllIlI[3];
                byArray2[as.lllIlI[9]] = lllIlI[4];
                fg.i.a((fh)llllIlIlIllIlII, String.valueOf(llllIlIlIllIlIl.b) + ec.a(byArray2) + as.a(llllIlIlIllIIIl), (int)(llllIlIlIllIIll - lllIlI[8]), (int)llllIlIlIllIIlI, lllIlI[1]);
                return;
            }
        } else {
            dg llllIlIlIllIIIl = (dg)ev.b.get(String.valueOf(llllIlIlIllIlIl.d));
            if (llllIlIlIllIIIl == null) {
                llllIlIlIllIIIl = new dg();
                ev.b.put(String.valueOf(llllIlIlIllIlIl.d), llllIlIlIllIIIl);
                llllIlIlIllIIIl.a = av.a(dv.a(String.valueOf(llllIlIlIllIlIl.d)));
                if (llllIlIlIllIIIl.a == null) {
                    llllIlIlIllIIIl.b = System.currentTimeMillis();
                    ei.a().E(llllIlIlIllIlIl.d);
                }
            } else if (llllIlIlIllIIIl.a == null && System.currentTimeMillis() - llllIlIlIllIIIl.b > 60000L) {
                llllIlIlIllIIIl.b = System.currentTimeMillis();
                ei.a().E(llllIlIlIllIlIl.d);
            }
            if (llllIlIlIllIIIl != null && llllIlIlIllIIIl.a != null) {
                if (llllIlIlIllIlIl.f == 0) {
                    byte[] byArray = new byte[lllIlI[2]];
                    byArray[as.lllIlI[3]] = lllIlI[3];
                    byArray[as.lllIlI[1]] = lllIlI[4];
                    byArray[as.lllIlI[5]] = lllIlI[3];
                    byArray[as.lllIlI[6]] = lllIlI[7];
                    byArray[as.lllIlI[8]] = lllIlI[3];
                    byArray[as.lllIlI[9]] = lllIlI[4];
                    int llllIlIlIllIIII = fg.g.a(String.valueOf(llllIlIlIllIlIl.b) + ec.a(byArray));
                    llllIlIlIllIlII.a(llllIlIlIllIIIl.a, (int)(llllIlIlIllIIll - llllIlIlIllIIII - (llllIlIlIllIIIl.a.getWidth() << lllIlI[1])), (int)(llllIlIlIllIIlI + fh.b(llllIlIlIllIIIl.a) / lllIlI[8]), lllIlI[3]);
                    fg.g.a((fh)llllIlIlIllIlII, llllIlIlIllIlIl.b, (int)(llllIlIlIllIIll - llllIlIlIllIIII - (llllIlIlIllIIIl.a.getWidth() << lllIlI[1]) + lllIlI[1] + fh.a(llllIlIlIllIIIl.a)), (int)(llllIlIlIllIIlI + lllIlI[1] + fh.b(llllIlIlIllIIIl.a) / lllIlI[8]), lllIlI[3]);
                    fg.i.a((fh)llllIlIlIllIlII, llllIlIlIllIlIl.b, (int)(llllIlIlIllIIll - llllIlIlIllIIII - (llllIlIlIllIIIl.a.getWidth() << lllIlI[1]) + fh.a(llllIlIlIllIIIl.a)), (int)(llllIlIlIllIIlI + fh.b(llllIlIlIllIIIl.a) / lllIlI[8]), lllIlI[3]);
                    return;
                }
                if (llllIlIlIllIlIl.f == lllIlI[1]) {
                    int llllIlIlIllIIII = (int)((llllIlIlIllIlIl.a - System.currentTimeMillis()) / 1000L);
                    byte[] byArray = new byte[lllIlI[5]];
                    byArray[as.lllIlI[3]] = lllIlI[3];
                    byArray[as.lllIlI[1]] = lllIlI[7];
                    int llllIlIlIlIllll = fg.g.a(String.valueOf(as.a(llllIlIlIllIIII)) + ec.a(byArray));
                    llllIlIlIllIlII.a(llllIlIlIllIIIl.a, (int)(llllIlIlIllIIll - llllIlIlIlIllll - (llllIlIlIllIIIl.a.getWidth() << lllIlI[1])), (int)(llllIlIlIllIIlI + fh.b(llllIlIlIllIIIl.a) / lllIlI[8]), lllIlI[3]);
                    byte[] byArray3 = new byte[lllIlI[2]];
                    byArray3[as.lllIlI[3]] = lllIlI[3];
                    byArray3[as.lllIlI[1]] = lllIlI[4];
                    byArray3[as.lllIlI[5]] = lllIlI[3];
                    byArray3[as.lllIlI[6]] = lllIlI[7];
                    byArray3[as.lllIlI[8]] = lllIlI[3];
                    byArray3[as.lllIlI[9]] = lllIlI[4];
                    fg.g.a((fh)llllIlIlIllIlII, ec.a(byArray3) + as.a(llllIlIlIllIIII), (int)(llllIlIlIllIIll - llllIlIlIlIllll - (llllIlIlIllIIIl.a.getWidth() << lllIlI[1]) + lllIlI[1] + fh.a(llllIlIlIllIIIl.a)), (int)(llllIlIlIllIIlI + lllIlI[1] + fh.b(llllIlIlIllIIIl.a) / lllIlI[8]), lllIlI[3]);
                    byte[] byArray4 = new byte[lllIlI[2]];
                    byArray4[as.lllIlI[3]] = lllIlI[3];
                    byArray4[as.lllIlI[1]] = lllIlI[4];
                    byArray4[as.lllIlI[5]] = lllIlI[3];
                    byArray4[as.lllIlI[6]] = lllIlI[7];
                    byArray4[as.lllIlI[8]] = lllIlI[3];
                    byArray4[as.lllIlI[9]] = lllIlI[4];
                    fg.i.a((fh)llllIlIlIllIlII, ec.a(byArray4) + as.a(llllIlIlIllIIII), (int)(llllIlIlIllIIll - llllIlIlIlIllll - (llllIlIlIllIIIl.a.getWidth() << lllIlI[1]) + fh.a(llllIlIlIllIIIl.a)), (int)(llllIlIlIllIIlI + fh.b(llllIlIlIllIIIl.a) / lllIlI[8]), lllIlI[3]);
                }
            }
        }
    }

    public final void a() {
        if (this.f == lllIlI[1] && System.currentTimeMillis() - this.a >= 0L) {
            this.c = lllIlI[1];
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String a(int n2) {
        String string;
        void llllIlIlIlIlIII;
        void llllIlIlIlIIlll;
        int n3 = n2 % lllIlI[10];
        int n4 = (n2 /= lllIlI[10]) % lllIlI[10];
        if ((n2 /= lllIlI[10]) > 0) {
            byte[] byArray = new byte[lllIlI[5]];
            byArray[as.lllIlI[3]] = lllIlI[3];
            byArray[as.lllIlI[1]] = lllIlI[7];
            return String.valueOf(n2) + ec.a(byArray) + n4;
        }
        if (llllIlIlIlIIlll > 0) {
            byte[] byArray = new byte[lllIlI[5]];
            byArray[as.lllIlI[3]] = lllIlI[3];
            byArray[as.lllIlI[1]] = lllIlI[7];
            return String.valueOf((int)llllIlIlIlIIlll) + ec.a(byArray) + (int)llllIlIlIlIlIII;
        }
        if (llllIlIlIlIlIII < 0) {
            byte[] byArray = new byte[lllIlI[8]];
            byArray[as.lllIlI[3]] = lllIlI[3];
            byArray[as.lllIlI[1]] = lllIlI[11];
            byArray[as.lllIlI[5]] = lllIlI[3];
            byArray[as.lllIlI[6]] = lllIlI[7];
            string = ec.a(byArray) + (int)llllIlIlIlIlIII;
        } else {
            string = String.valueOf((int)llllIlIlIlIlIII);
        }
        return string;
    }

    static {
        as.lIlIll();
    }

    private static void lIlIll() {
        lllIlI = new int[12];
        as.lllIlI[0] = -" ".length();
        as.lllIlI[1] = " ".length();
        as.lllIlI[2] = "   ".length() << " ".length();
        as.lllIlI[3] = (0x50 ^ 0x47) & ~(0xBC ^ 0xAB);
        as.lllIlI[4] = " ".length() << (0x71 ^ 0x74);
        as.lllIlI[5] = " ".length() << " ".length();
        as.lllIlI[6] = "   ".length();
        as.lllIlI[7] = (0x26 ^ 0x3B) << " ".length();
        as.lllIlI[8] = " ".length() << (" ".length() << " ".length());
        as.lllIlI[9] = 0x66 ^ 0x63;
        as.lllIlI[10] = (0xCF ^ 0xC0) << (" ".length() << " ".length());
        as.lllIlI[11] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
    }
}

