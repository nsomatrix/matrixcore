/*
 * Decompiled with CFR 0.152.
 */
public class k
extends d {
    private static final /* synthetic */ int[] lIIIIIl;

    public k() {
        this.b();
    }

    @Override
    protected void p() {
        if (k.b(v.f())) {
            k.a(lIIIIIl[0]);
        } else {
            if (bt.j(lIIIIIl[1]) != null && (Math.abs(bt.j((int)k.lIIIIIl[1]).j - v.f().j) > lIIIIIl[2] || Math.abs(bt.j((int)k.lIIIIIl[1]).k - v.f().k) > lIIIIIl[2])) {
                v.b(bt.j((int)k.lIIIIIl[1]).j, bt.j((int)k.lIIIIIl[1]).k);
                fn.a(1000L);
            }
            bt.m().e(lIIIIIl[3]);
            fn.a(1000L);
            if (at.e() > 0) {
                int llllIIIlllllIlI = lIIIIIl[0];
                while (llllIIIlllllIlI < v.f().aD.length) {
                    cd llllIIIlllllIIl = v.f().aD[llllIIIlllllIlI];
                    if (llllIIIlllllIIl != null) {
                        ei.a().d(llllIIIlllllIIl.e);
                        fn.a(100L);
                    }
                    ++llllIIIlllllIlI;
                }
            }
            fn.a(2000L);
            at.c = null;
        }
    }

    @Override
    public String toString() {
        byte[] byArray = new byte[lIIIIIl[4]];
        byArray[k.lIIIIIl[0]] = lIIIIIl[0];
        byArray[k.lIIIIIl[5]] = lIIIIIl[6];
        byArray[k.lIIIIIl[7]] = lIIIIIl[8];
        byArray[k.lIIIIIl[9]] = lIIIIIl[10];
        byArray[k.lIIIIIl[3]] = lIIIIIl[0];
        byArray[k.lIIIIIl[1]] = lIIIIIl[11];
        byArray[k.lIIIIIl[12]] = lIIIIIl[0];
        byArray[k.lIIIIIl[13]] = lIIIIIl[14];
        byArray[k.lIIIIIl[15]] = lIIIIIl[5];
        byArray[k.lIIIIIl[16]] = lIIIIIl[17];
        byArray[k.lIIIIIl[18]] = lIIIIIl[8];
        byArray[k.lIIIIIl[19]] = lIIIIIl[20];
        return ec.a(byArray);
    }

    static {
        k.llIIIl();
    }

    private static void llIIIl() {
        lIIIIIl = new int[21];
        k.lIIIIIl[0] = (0x79 ^ 0x40) & ~(0x6E ^ 0x57);
        k.lIIIIIl[1] = 0x8C ^ 0x89;
        k.lIIIIIl[2] = (0xAE ^ 0xA5) << " ".length();
        k.lIIIIIl[3] = " ".length() << (" ".length() << " ".length());
        k.lIIIIIl[4] = "   ".length() << (" ".length() << " ".length());
        k.lIIIIIl[5] = " ".length();
        k.lIIIIIl[6] = (0x22 ^ 0x31) << (" ".length() << " ".length());
        k.lIIIIIl[7] = " ".length() << " ".length();
        k.lIIIIIl[8] = (0x98 ^ 0x97) << " ".length();
        k.lIIIIIl[9] = "   ".length();
        k.lIIIIIl[10] = -(0x60 ^ 0x3B);
        k.lIIIIIl[11] = 0x3B ^ 0x42;
        k.lIIIIIl[12] = "   ".length() << " ".length();
        k.lIIIIIl[13] = 0x28 ^ 0x2F;
        k.lIIIIIl[14] = " ".length() << (0xC6 ^ 0xC3);
        k.lIIIIIl[15] = " ".length() << "   ".length();
        k.lIIIIIl[16] = 0x30 ^ 0x39;
        k.lIIIIIl[17] = 0x6C ^ 0x7D;
        k.lIIIIIl[18] = (0x4A ^ 0x4F) << " ".length();
        k.lIIIIIl[19] = 0x4C ^ 0x47;
        k.lIIIIIl[20] = -(0x61 ^ 0x4C);
    }
}

