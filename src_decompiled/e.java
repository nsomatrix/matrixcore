/*
 * Decompiled with CFR 0.152.
 */
public class e
extends d {
    private /* synthetic */ int w;
    private static final /* synthetic */ int[] llIlII;

    public e(int n2) {
        this.b();
        this.w = n2;
        this.c = fm.a;
        if (this.w == 0) {
            this.d = fm.c;
        } else {
            llllIllIlIlIllI.d = fm.b;
        }
    }

    @Override
    protected void p() {
        if (e.b(v.f())) {
            e.a(llIlII[0]);
        } else {
            e llllIllIlIIllll;
            at.p();
            if (fb.o == llllIllIlIIllll.c && llllIllIlIIllll.d == fb.l) {
                v.b(fm.d, fm.e);
                if (llllIllIlIIllll.w == llIlII[1]) {
                    dh llllIllIlIIlllI = new dh();
                    if (d.d() != null) {
                        eo llllIllIlIIllIl = e.d();
                        int llllIllIlIIllII = llIlII[0];
                        while (llllIllIlIIllII < bt.F.size() && llllIllIlIIlllI.size() < llllIllIlIIllIl.i) {
                            v llllIllIlIIlIll = (v)bt.F.elementAt(llllIllIlIIllII);
                            if (llllIllIlIIlIll != null && llllIllIlIIlIll.A > 0 && llllIllIlIIlIll.o != llIlII[2] && llllIllIlIIlIll.o != llIlII[3] && llllIllIlIIlIll.o != llIlII[4] && llllIllIlIIlIll.aO == llIlII[5]) {
                                llllIllIlIIlllI.addElement(llllIllIlIIlIll);
                            }
                            ++llllIllIlIIllII;
                        }
                        if (llllIllIlIIlllI.size() > 0 && System.currentTimeMillis() - llllIllIlIIllIl.f >= (long)llllIllIlIIllIl.e) {
                            ei.a().g(llllIllIlIIllIl.a.a);
                            ei.a().a(new dh(), llllIllIlIIlllI, llIlII[6]);
                            llllIllIlIIllIl.f = System.currentTimeMillis();
                            llllIllIlIIllIl.l = llIlII[1];
                            if (!at.q) {
                                v.f().b(bt.t[llllIllIlIIllIl.a.a], llIlII[0]);
                            }
                        }
                    }
                }
            } else {
                llllIllIlIIllll.a(llllIllIlIIllll.c, llllIllIlIIllll.d, llIlII[7], llIlII[7]);
            }
        }
    }

    @Override
    public String toString() {
        e llllIllIlIIlIIl;
        if (this.w == 0) {
            byte[] byArray = new byte[llIlII[8]];
            byArray[e.llIlII[0]] = llIlII[0];
            byArray[e.llIlII[1]] = llIlII[9];
            byArray[e.llIlII[6]] = llIlII[0];
            byArray[e.llIlII[5]] = llIlII[10];
            byArray[e.llIlII[11]] = llIlII[12];
            byArray[e.llIlII[3]] = llIlII[13];
            byArray[e.llIlII[14]] = llIlII[0];
            byArray[e.llIlII[15]] = llIlII[16];
            byArray[e.llIlII[17]] = llIlII[0];
            byArray[e.llIlII[18]] = llIlII[19];
            byArray[e.llIlII[20]] = llIlII[0];
            byArray[e.llIlII[21]] = llIlII[22];
            return ec.a(byArray);
        }
        if (llllIllIlIIlIIl.w == llIlII[1]) {
            byte[] byArray = new byte[llIlII[2]];
            byArray[e.llIlII[0]] = llIlII[1];
            byArray[e.llIlII[1]] = llIlII[23];
            byArray[e.llIlII[6]] = llIlII[0];
            byArray[e.llIlII[5]] = llIlII[24];
            byArray[e.llIlII[11]] = llIlII[0];
            byArray[e.llIlII[3]] = llIlII[25];
            byArray[e.llIlII[14]] = llIlII[0];
            byArray[e.llIlII[15]] = llIlII[10];
            byArray[e.llIlII[17]] = llIlII[0];
            byArray[e.llIlII[18]] = llIlII[16];
            byArray[e.llIlII[20]] = llIlII[0];
            byArray[e.llIlII[21]] = llIlII[19];
            byArray[e.llIlII[8]] = llIlII[0];
            byArray[e.llIlII[26]] = llIlII[22];
            return ec.a(byArray);
        }
        return "";
    }

    static {
        e.lIIlIl();
    }

    private static void lIIlIl() {
        llIlII = new int[27];
        e.llIlII[0] = " ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()));
        e.llIlII[1] = " ".length();
        e.llIlII[2] = (0x36 ^ 0x31) << " ".length();
        e.llIlII[3] = 0xB4 ^ 0xB1;
        e.llIlII[4] = 0x9B ^ 0x94;
        e.llIlII[5] = "   ".length();
        e.llIlII[6] = " ".length() << " ".length();
        e.llIlII[7] = -" ".length();
        e.llIlII[8] = "   ".length() << (" ".length() << " ".length());
        e.llIlII[9] = 0x49 ^ 0xA;
        e.llIlII[10] = (0x87 ^ 0x8A) << "   ".length();
        e.llIlII[11] = " ".length() << (" ".length() << " ".length());
        e.llIlII[12] = (0x8E ^ 0x81) << " ".length();
        e.llIlII[13] = -(0x2C ^ 0xF);
        e.llIlII[14] = "   ".length() << " ".length();
        e.llIlII[15] = 0x35 ^ 0x32;
        e.llIlII[16] = " ".length() << (0x44 ^ 0x41);
        e.llIlII[17] = " ".length() << "   ".length();
        e.llIlII[18] = 0xA0 ^ 0xA9;
        e.llIlII[19] = (0x86 ^ 0x81) << (" ".length() << (" ".length() << " ".length()));
        e.llIlII[20] = (0xA9 ^ 0xAC) << " ".length();
        e.llIlII[21] = 0x62 ^ 0x69;
        e.llIlII[22] = 0x16 ^ 0x7D;
        e.llIlII[23] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        e.llIlII[24] = -(0x9C ^ 0x83);
        e.llIlII[25] = (0xF4 ^ 0xC3) << " ".length();
        e.llIlII[26] = 0x78 ^ 0x75;
    }
}

