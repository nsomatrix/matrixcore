/*
 * Decompiled with CFR 0.152.
 */
public final class cf {
    public /* synthetic */ int a;
    public /* synthetic */ byte b;
    public /* synthetic */ cg c;
    private static final /* synthetic */ int[] lIIlIIlI;

    public cf() {
    }

    public cf(int n2, int n3) {
        this.a = n3;
        this.c = bt.R[n2];
    }

    public final String a() {
        if (this.c.c == lIIlIIlI[0]) {
            String string = cf.a(this.a);
            byte[] byArray = new byte[lIIlIIlI[1]];
            byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
            byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
            return dl.a(this.c.b, ec.a(byArray), string);
        }
        byte[] byArray = new byte[lIIlIIlI[1]];
        byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
        byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
        return dl.a(this.c.b, ec.a(byArray), String.valueOf(this.a));
    }

    private static String a(int n2) {
        String string;
        int llIlIIIIllIIIIl;
        if (n2 % lIIlIIlI[5] == 0) {
            return String.valueOf(n2 / lIIlIIlI[5]);
        }
        if (llIlIIIIllIIIIl % lIIlIIlI[6] == 0) {
            byte[] byArray = new byte[lIIlIIlI[1]];
            byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
            byArray[cf.lIIlIIlI[3]] = lIIlIIlI[7];
            string = String.valueOf(llIlIIIIllIIIIl / lIIlIIlI[5]) + ec.a(byArray) + llIlIIIIllIIIIl % lIIlIIlI[5] / lIIlIIlI[6];
        } else {
            byte[] byArray = new byte[lIIlIIlI[1]];
            byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
            byArray[cf.lIIlIIlI[3]] = lIIlIIlI[7];
            string = String.valueOf(llIlIIIIllIIIIl / lIIlIIlI[5]) + ec.a(byArray) + llIlIIIIllIIIIl % lIIlIIlI[5] / lIIlIIlI[6] + llIlIIIIllIIIIl % lIIlIIlI[6];
        }
        return string;
    }

    public final String b() {
        cf llIlIIIIlIlllII;
        String string = null;
        int n2 = lIIlIIlI[2];
        if (this.c.a != 0 && this.c.a != lIIlIIlI[3] && this.c.a != lIIlIIlI[8] && this.c.a != lIIlIIlI[9] && this.c.a != lIIlIIlI[10] && this.c.a != lIIlIIlI[11] && this.c.a != lIIlIIlI[12] && this.c.a != lIIlIIlI[13]) {
            String llIlIIIIlIllIll;
            if (this.c.a != lIIlIIlI[14] && this.c.a != lIIlIIlI[15] && this.c.a != lIIlIIlI[16] && this.c.a != lIIlIIlI[0] && this.c.a != lIIlIIlI[17]) {
                if (this.c.a != lIIlIIlI[1] && this.c.a != lIIlIIlI[18] && this.c.a != lIIlIIlI[19] && this.c.a != lIIlIIlI[20] && this.c.a != lIIlIIlI[6] && this.c.a != lIIlIIlI[21] && this.c.a != lIIlIIlI[22] && this.c.a != lIIlIIlI[23] && this.c.a != lIIlIIlI[24] && this.c.a != lIIlIIlI[25] && this.c.a != lIIlIIlI[26] && this.c.a != lIIlIIlI[27] && this.c.a != lIIlIIlI[28]) {
                    if (this.c.a == lIIlIIlI[29]) {
                        int n3 = this.a - lIIlIIlI[18] + lIIlIIlI[3];
                        byte[] byArray = new byte[lIIlIIlI[1]];
                        byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                        byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
                        byte[] byArray2 = new byte[lIIlIIlI[19]];
                        byArray2[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                        byArray2[cf.lIIlIIlI[3]] = lIIlIIlI[30];
                        byArray2[cf.lIIlIIlI[1]] = lIIlIIlI[2];
                        byArray2[cf.lIIlIIlI[18]] = lIIlIIlI[31];
                        byte[] byArray3 = new byte[lIIlIIlI[1]];
                        byArray3[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                        byArray3[cf.lIIlIIlI[3]] = lIIlIIlI[32];
                        byte[] byArray4 = new byte[lIIlIIlI[1]];
                        byArray4[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                        byArray4[cf.lIIlIIlI[3]] = lIIlIIlI[33];
                        string = String.valueOf(dl.a(this.c.b, ec.a(byArray), String.valueOf(this.a))) + ec.a(byArray2) + n3 + ec.a(byArray3) + this.a + ec.a(byArray4);
                    } else if (llIlIIIIlIlllII.c.c == lIIlIIlI[0]) {
                        llIlIIIIlIllIll = cf.a(llIlIIIIlIlllII.a);
                        byte[] byArray = new byte[lIIlIIlI[1]];
                        byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                        byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
                        llIlIIIIlIllIll = dl.a(llIlIIIIlIlllII.c.b, ec.a(byArray), llIlIIIIlIllIll);
                    } else {
                        byte[] byArray = new byte[lIIlIIlI[1]];
                        byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                        byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
                        llIlIIIIlIllIll = dl.a(llIlIIIIlIlllII.c.b, ec.a(byArray), String.valueOf(llIlIIIIlIlllII.a));
                    }
                } else {
                    int llIlIIIIlIllIIl = llIlIIIIlIlllII.a - lIIlIIlI[20] + lIIlIIlI[3];
                    byte[] byArray = new byte[lIIlIIlI[1]];
                    byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                    byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
                    byte[] byArray5 = new byte[lIIlIIlI[19]];
                    byArray5[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                    byArray5[cf.lIIlIIlI[3]] = lIIlIIlI[30];
                    byArray5[cf.lIIlIIlI[1]] = lIIlIIlI[2];
                    byArray5[cf.lIIlIIlI[18]] = lIIlIIlI[31];
                    byte[] byArray6 = new byte[lIIlIIlI[1]];
                    byArray6[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                    byArray6[cf.lIIlIIlI[3]] = lIIlIIlI[32];
                    byte[] byArray7 = new byte[lIIlIIlI[1]];
                    byArray7[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                    byArray7[cf.lIIlIIlI[3]] = lIIlIIlI[33];
                    llIlIIIIlIllIll = String.valueOf(dl.a(llIlIIIIlIlllII.c.b, ec.a(byArray), String.valueOf(llIlIIIIlIlllII.a))) + ec.a(byArray5) + llIlIIIIlIllIIl + ec.a(byArray6) + llIlIIIIlIlllII.a + ec.a(byArray7);
                }
            } else {
                int llIlIIIIlIllIIl = llIlIIIIlIlllII.a - lIIlIIlI[6] + lIIlIIlI[3];
                byte[] byArray = new byte[lIIlIIlI[1]];
                byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
                byte[] byArray8 = new byte[lIIlIIlI[19]];
                byArray8[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                byArray8[cf.lIIlIIlI[3]] = lIIlIIlI[30];
                byArray8[cf.lIIlIIlI[1]] = lIIlIIlI[2];
                byArray8[cf.lIIlIIlI[18]] = lIIlIIlI[31];
                byte[] byArray9 = new byte[lIIlIIlI[1]];
                byArray9[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                byArray9[cf.lIIlIIlI[3]] = lIIlIIlI[32];
                byte[] byArray10 = new byte[lIIlIIlI[1]];
                byArray10[cf.lIIlIIlI[2]] = lIIlIIlI[2];
                byArray10[cf.lIIlIIlI[3]] = lIIlIIlI[33];
                llIlIIIIlIllIll = String.valueOf(dl.a(llIlIIIIlIlllII.c.b, ec.a(byArray), String.valueOf(llIlIIIIlIlllII.a))) + ec.a(byArray8) + llIlIIIIlIllIIl + ec.a(byArray9) + llIlIIIIlIlllII.a + ec.a(byArray10);
            }
        } else {
            int llIlIIIIlIllIIl = llIlIIIIlIlllII.a - lIIlIIlI[34] + lIIlIIlI[3];
            byte[] byArray = new byte[lIIlIIlI[1]];
            byArray[cf.lIIlIIlI[2]] = lIIlIIlI[2];
            byArray[cf.lIIlIIlI[3]] = lIIlIIlI[4];
            byte[] byArray11 = new byte[lIIlIIlI[19]];
            byArray11[cf.lIIlIIlI[2]] = lIIlIIlI[2];
            byArray11[cf.lIIlIIlI[3]] = lIIlIIlI[30];
            byArray11[cf.lIIlIIlI[1]] = lIIlIIlI[2];
            byArray11[cf.lIIlIIlI[18]] = lIIlIIlI[31];
            byte[] byArray12 = new byte[lIIlIIlI[1]];
            byArray12[cf.lIIlIIlI[2]] = lIIlIIlI[2];
            byArray12[cf.lIIlIIlI[3]] = lIIlIIlI[32];
            byte[] byArray13 = new byte[lIIlIIlI[1]];
            byArray13[cf.lIIlIIlI[2]] = lIIlIIlI[2];
            byArray13[cf.lIIlIIlI[3]] = lIIlIIlI[33];
            string = String.valueOf(dl.a(llIlIIIIlIlllII.c.b, ec.a(byArray), String.valueOf(llIlIIIIlIlllII.a))) + ec.a(byArray11) + llIlIIIIlIllIIl + ec.a(byArray12) + llIlIIIIlIlllII.a + ec.a(byArray13);
        }
        return string;
    }

    static {
        cf.llIlllI();
    }

    private static void llIlllI() {
        lIIlIIlI = new int[35];
        cf.lIIlIIlI[0] = 0x99 ^ 0x90;
        cf.lIIlIIlI[1] = " ".length() << " ".length();
        cf.lIIlIIlI[2] = (0x6E ^ 0x59) & ~(0x42 ^ 0x75);
        cf.lIIlIIlI[3] = " ".length();
        cf.lIIlIIlI[4] = 0x76 ^ 0x55;
        cf.lIIlIIlI[5] = (0x21 ^ 0x38) << (" ".length() << " ".length());
        cf.lIIlIIlI[6] = (0x53 ^ 0x56) << " ".length();
        cf.lIIlIIlI[7] = (0x7E ^ 0x69) << " ".length();
        cf.lIIlIIlI[8] = 0x1F ^ 0xA;
        cf.lIIlIIlI[9] = (0x7F ^ 0x74) << " ".length();
        cf.lIIlIIlI[10] = 0x31 ^ 0x26;
        cf.lIIlIIlI[11] = "   ".length() << "   ".length();
        cf.lIIlIIlI[12] = 0x36 ^ 0x2F;
        cf.lIIlIIlI[13] = (0x6D ^ 0x60) << " ".length();
        cf.lIIlIIlI[14] = "   ".length() << " ".length();
        cf.lIIlIIlI[15] = 0x3B ^ 0x3C;
        cf.lIIlIIlI[16] = " ".length() << "   ".length();
        cf.lIIlIIlI[17] = 0x98 ^ 0x8B;
        cf.lIIlIIlI[18] = "   ".length();
        cf.lIIlIIlI[19] = " ".length() << (" ".length() << " ".length());
        cf.lIIlIIlI[20] = 0xB4 ^ 0xB1;
        cf.lIIlIIlI[21] = 0x7D ^ 0x76;
        cf.lIIlIIlI[22] = "   ".length() << (" ".length() << " ".length());
        cf.lIIlIIlI[23] = 0x3F ^ 0x32;
        cf.lIIlIIlI[24] = (0x9E ^ 0x99) << " ".length();
        cf.lIIlIIlI[25] = 0x21 ^ 0x2E;
        cf.lIIlIIlI[26] = 0xBA ^ 0xAB;
        cf.lIIlIIlI[27] = (0xB ^ 2) << " ".length();
        cf.lIIlIIlI[28] = (0x9B ^ 0x9E) << (" ".length() << " ".length());
        cf.lIIlIIlI[29] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        cf.lIIlIIlI[30] = " ".length() << (0xB ^ 0xE);
        cf.lIIlIIlI[31] = (0x3A ^ 0x3F) << "   ".length();
        cf.lIIlIIlI[32] = 0x42 ^ 0x6F;
        cf.lIIlIIlI[33] = 0x6E ^ 0x47;
        cf.lIIlIIlI[34] = (0x22 ^ 0x3B) << " ".length();
    }
}

