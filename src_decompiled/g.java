/*
 * Decompiled with CFR 0.152.
 */
public class g
extends d {
    private static final /* synthetic */ int[] lIlIIlll;

    public g() {
        this.b();
    }

    @Override
    protected void p() {
        if (g.b(v.f())) {
            g.a(lIlIIlll[0]);
        } else {
            if (bt.j(lIlIIlll[1]) != null && (Math.abs(bt.j((int)g.lIlIIlll[1]).j - v.f().j) > lIlIIlll[2] || Math.abs(bt.j((int)g.lIlIIlll[1]).k - v.f().k) > lIlIIlll[2])) {
                v.b(bt.j((int)g.lIlIIlll[1]).j, bt.j((int)g.lIlIIlll[1]).k);
                fn.a(1000L);
            }
            bt.m().e(lIlIIlll[3]);
            fn.a(1000L);
            if (at.f() > 0) {
                int llIIlIlllIIIIII = lIlIIlll[0];
                while (llIIlIlllIIIIII < v.f().aC.length) {
                    cd llIIlIllIllllll = v.f().aC[llIIlIlllIIIIII];
                    if (llIIlIllIllllll != null) {
                        ei.a().e(llIIlIllIllllll.e);
                        fn.a(100L);
                    }
                    ++llIIlIlllIIIIII;
                }
            }
            fn.a(2000L);
            at.c = null;
        }
    }

    @Override
    public String toString() {
        byte[] byArray = new byte[lIlIIlll[4]];
        byArray[g.lIlIIlll[0]] = lIlIIlll[0];
        byArray[g.lIlIIlll[5]] = lIlIIlll[6];
        byArray[g.lIlIIlll[7]] = lIlIIlll[8];
        byArray[g.lIlIIlll[9]] = lIlIIlll[10];
        byArray[g.lIlIIlll[3]] = lIlIIlll[0];
        byArray[g.lIlIIlll[1]] = lIlIIlll[11];
        byArray[g.lIlIIlll[12]] = lIlIIlll[0];
        byArray[g.lIlIIlll[13]] = lIlIIlll[14];
        byArray[g.lIlIIlll[15]] = lIlIIlll[5];
        byArray[g.lIlIIlll[16]] = lIlIIlll[17];
        byArray[g.lIlIIlll[18]] = lIlIIlll[8];
        byArray[g.lIlIIlll[19]] = lIlIIlll[20];
        return ec.a(byArray);
    }

    static {
        g.lllllIl();
    }

    private static void lllllIl() {
        lIlIIlll = new int[21];
        g.lIlIIlll[0] = (0x96 ^ 0xBD) & ~(0x47 ^ 0x6C);
        g.lIlIIlll[1] = 0xC6 ^ 0xC3;
        g.lIlIIlll[2] = (9 ^ 2) << " ".length();
        g.lIlIIlll[3] = " ".length() << (" ".length() << " ".length());
        g.lIlIIlll[4] = "   ".length() << (" ".length() << " ".length());
        g.lIlIIlll[5] = " ".length();
        g.lIlIIlll[6] = 0x66 ^ 0x25;
        g.lIlIIlll[7] = " ".length() << " ".length();
        g.lIlIIlll[8] = (0x9A ^ 0x95) << " ".length();
        g.lIlIIlll[9] = "   ".length();
        g.lIlIIlll[10] = -(0xEF ^ 0xB4);
        g.lIlIIlll[11] = (0x3C ^ 0x21) << (" ".length() << " ".length());
        g.lIlIIlll[12] = "   ".length() << " ".length();
        g.lIlIIlll[13] = 0x79 ^ 0x7E;
        g.lIlIIlll[14] = " ".length() << (0x81 ^ 0x84);
        g.lIlIIlll[15] = " ".length() << "   ".length();
        g.lIlIIlll[16] = 0x1D ^ 0x14;
        g.lIlIIlll[17] = 0x26 ^ 0x37;
        g.lIlIIlll[18] = (0x75 ^ 0x70) << " ".length();
        g.lIlIIlll[19] = 0xB7 ^ 0xBC;
        g.lIlIIlll[20] = -(0x8C ^ 0xA1);
    }
}

