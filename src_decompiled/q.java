/*
 * Decompiled with CFR 0.152.
 */
public final class q
extends d {
    private /* synthetic */ ez z;
    public /* synthetic */ int w;
    public static /* synthetic */ boolean x;
    public static /* synthetic */ long y;
    private static final /* synthetic */ int[] lIlIIll;

    public final void q() {
        super.b();
        this.z = v.f(lIlIIll[0]);
        if (this.z != null) {
            this.w = this.z.f;
            this.c = this.z.g;
            if (fb.o == this.z.g && fb.l % lIlIIll[1] == 0) {
                this.d = fb.l;
                return;
            }
        }
        this.d = lIlIIll[1];
    }

    @Override
    public void c() {
        this.z = v.f(lIlIIll[0]);
        super.c();
    }

    @Override
    public final void p() {
        q lllIllllllllIll;
        if (this.z == null) {
            if (fb.f(fb.o)) {
                bt.b(lIlIIll[2], lIlIIll[3], lIlIIll[4]);
                fn.b(2000L);
                this.z = v.f(lIlIIll[0]);
                this.w = this.z.f;
                this.c = this.z.g;
                if (fb.o == this.z.g && fb.l % lIlIIll[1] == 0) {
                    this.d = fb.l;
                    return;
                }
                return;
            }
            lllIllllllllIll.a(lIlIIll[0], lIlIIll[5], lIlIIll[6], lIlIIll[6]);
        }
        if (lllIllllllllIll.c >= 0) {
            if (d.b(v.f())) {
                if (v.cH) {
                    d.a(lIlIIll[0]);
                    return;
                }
            } else if (fb.o == lllIllllllllIll.c && fb.l == lllIllllllllIll.d) {
                if (lllIllllllllIll.z != null && lllIllllllllIll.z.b >= lllIllllllllIll.z.c) {
                    byte[] byArray = new byte[lIlIIll[7]];
                    byArray[q.lIlIIll[4]] = lIlIIll[4];
                    byArray[q.lIlIIll[0]] = lIlIIll[8];
                    byArray[q.lIlIIll[3]] = lIlIIll[4];
                    byArray[q.lIlIIll[9]] = lIlIIll[10];
                    byArray[q.lIlIIll[11]] = lIlIIll[4];
                    byArray[q.lIlIIll[1]] = lIlIIll[12];
                    byArray[q.lIlIIll[13]] = lIlIIll[4];
                    byArray[q.lIlIIll[14]] = lIlIIll[15];
                    byArray[q.lIlIIll[16]] = lIlIIll[4];
                    byArray[q.lIlIIll[17]] = lIlIIll[18];
                    byArray[q.lIlIIll[19]] = lIlIIll[4];
                    byArray[q.lIlIIll[20]] = lIlIIll[21];
                    byArray[q.lIlIIll[22]] = lIlIIll[4];
                    byArray[q.lIlIIll[23]] = lIlIIll[24];
                    byArray[q.lIlIIll[25]] = lIlIIll[4];
                    byArray[q.lIlIIll[26]] = lIlIIll[18];
                    byArray[q.lIlIIll[27]] = lIlIIll[4];
                    byArray[q.lIlIIll[28]] = lIlIIll[21];
                    byArray[q.lIlIIll[29]] = lIlIIll[4];
                    byArray[q.lIlIIll[30]] = lIlIIll[31];
                    byArray[q.lIlIIll[32]] = lIlIIll[4];
                    byArray[q.lIlIIll[33]] = lIlIIll[34];
                    at.a(ec.a(byArray));
                    at.c();
                    return;
                }
                lllIllllllllIll.b(lllIllllllllIll.w, lIlIIll[16]);
                if (v.f().y < v.f().z * v.bu / lIlIIll[35]) {
                    v.f().e(lIlIIll[28]);
                }
                if (v.f().A < v.f().C * v.bt / lIlIIll[35]) {
                    int lllIllllllllIIl = (int)(System.currentTimeMillis() / 1000L);
                    int lllIllllllllIII = lIlIIll[4];
                    while (lllIllllllllIII < v.f().az.size()) {
                        bd lllIlllllllIlll = (bd)v.f().az.elementAt(lllIllllllllIII);
                        if (lllIlllllllIlll.e.a == lIlIIll[33] && lllIlllllllIlll.c - (lllIllllllllIIl - lllIlllllllIlll.b) >= lIlIIll[3]) {
                            return;
                        }
                        ++lllIllllllllIII;
                    }
                    v.f().e(lIlIIll[27]);
                    return;
                }
            } else {
                lllIllllllllIll.a(lllIllllllllIll.c, lllIllllllllIll.d, lllIllllllllIll.e, lllIllllllllIll.f);
            }
        } else {
            at.c();
        }
    }

    @Override
    public final String toString() {
        byte[] byArray = new byte[lIlIIll[7]];
        byArray[q.lIlIIll[4]] = lIlIIll[4];
        byArray[q.lIlIIll[0]] = lIlIIll[36];
        byArray[q.lIlIIll[3]] = lIlIIll[4];
        byArray[q.lIlIIll[9]] = lIlIIll[37];
        byArray[q.lIlIIll[11]] = lIlIIll[4];
        byArray[q.lIlIIll[1]] = lIlIIll[38];
        byArray[q.lIlIIll[13]] = lIlIIll[4];
        byArray[q.lIlIIll[14]] = lIlIIll[10];
        byArray[q.lIlIIll[16]] = lIlIIll[4];
        byArray[q.lIlIIll[17]] = lIlIIll[18];
        byArray[q.lIlIIll[19]] = lIlIIll[4];
        byArray[q.lIlIIll[20]] = lIlIIll[21];
        byArray[q.lIlIIll[22]] = lIlIIll[4];
        byArray[q.lIlIIll[23]] = lIlIIll[24];
        byArray[q.lIlIIll[25]] = lIlIIll[4];
        byArray[q.lIlIIll[26]] = lIlIIll[18];
        byArray[q.lIlIIll[27]] = lIlIIll[4];
        byArray[q.lIlIIll[28]] = lIlIIll[21];
        byArray[q.lIlIIll[29]] = lIlIIll[4];
        byArray[q.lIlIIll[30]] = lIlIIll[31];
        byArray[q.lIlIIll[32]] = lIlIIll[4];
        byArray[q.lIlIIll[33]] = lIlIIll[34];
        return ec.a(byArray);
    }

    static {
        q.llllIl();
    }

    private static void llllIl() {
        lIlIIll = new int[39];
        q.lIlIIll[0] = " ".length();
        q.lIlIIll[1] = 2 ^ 7;
        q.lIlIIll[2] = 0x70 ^ 0x69;
        q.lIlIIll[3] = " ".length() << " ".length();
        q.lIlIIll[4] = (0xE3 ^ 0xA4) & ~(0x18 ^ 0x5F);
        q.lIlIIll[5] = -"  ".length();
        q.lIlIIll[6] = -" ".length();
        q.lIlIIll[7] = (0xBC ^ 0xB7) << " ".length();
        q.lIlIIll[8] = (0x27 ^ 0x2C) << "   ".length();
        q.lIlIIll[9] = "   ".length();
        q.lIlIIll[10] = 0x28 ^ 0x47;
        q.lIlIIll[11] = " ".length() << (" ".length() << " ".length());
        q.lIlIIll[12] = (0xB6 ^ 0x81) << " ".length();
        q.lIlIIll[13] = "   ".length() << " ".length();
        q.lIlIIll[14] = 0xC3 ^ 0xC4;
        q.lIlIIll[15] = 0xFD ^ 0x9A;
        q.lIlIIll[16] = " ".length() << "   ".length();
        q.lIlIIll[17] = 0xA1 ^ 0xA8;
        q.lIlIIll[18] = " ".length() << (0x1E ^ 0x1B);
        q.lIlIIll[19] = (0xAB ^ 0xAE) << " ".length();
        q.lIlIIll[20] = 4 ^ 0xF;
        q.lIlIIll[21] = (0xB2 ^ 0xA7) << (" ".length() << " ".length());
        q.lIlIIll[22] = "   ".length() << (" ".length() << " ".length());
        q.lIlIIll[23] = 0x82 ^ 0x8F;
        q.lIlIIll[24] = -(0x40 ^ 0x60);
        q.lIlIIll[25] = (0x1E ^ 0x19) << " ".length();
        q.lIlIIll[26] = 0x3F ^ 0x30;
        q.lIlIIll[27] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        q.lIlIIll[28] = 0x28 ^ 0x39;
        q.lIlIIll[29] = (0x6C ^ 0x65) << " ".length();
        q.lIlIIll[30] = 0x6E ^ 0x7D;
        q.lIlIIll[31] = (0x7C ^ 0x71) << "   ".length();
        q.lIlIIll[32] = (0x45 ^ 0x40) << (" ".length() << " ".length());
        q.lIlIIll[33] = 0x51 ^ 0x44;
        q.lIlIIll[34] = -(0xC5 ^ 0xC3);
        q.lIlIIll[35] = (0x7F ^ 0x66) << (" ".length() << " ".length());
        q.lIlIIll[36] = 0xDC ^ 0x9D;
        q.lIlIIll[37] = 1 ^ 0x74;
        q.lIlIIll[38] = (0x41 ^ 0x5C) << (" ".length() << " ".length());
    }
}

