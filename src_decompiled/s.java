/*
 * Decompiled with CFR 0.152.
 */
public class s
extends d {
    private static final /* synthetic */ int[] lllIlIl;

    public final void q() {
        super.b();
        this.c = fb.o;
        this.d = fb.l;
        this.e = v.f().j;
        this.f = v.f().k;
    }

    @Override
    public final void p() {
        if (s.b(v.f())) {
            if (v.cH) {
                s.a(lllIlIl[0]);
                return;
            }
        } else {
            s lllIIIIIIlIlIII;
            if (lllIIIIIIlIlIII.c == fb.o && lllIIIIIIlIlIII.d == fb.l) {
                lllIIIIIIlIlIII.b(lllIlIl[1], lllIIIIIIlIlIII.a(v.cn, v.co, v.cp));
                lllIIIIIIlIlIII.c(lllIlIl[1]);
                return;
            }
            if (v.cH) {
                lllIIIIIIlIlIII.a(lllIIIIIIlIlIII.c, lllIIIIIIlIlIII.d, lllIIIIIIlIlIII.e, lllIIIIIIlIlIII.f);
            }
        }
    }

    @Override
    protected final cx a(v v2, int n2, int n3, v v3, boolean bl2) {
        if (at.i && at.k[fb.o].size() > 0) {
            this.a(n3, bl2);
            return d.a(v2.j, v2.k);
        }
        return d.a(v2.j, v2.k);
    }

    @Override
    public final String toString() {
        byte[] byArray = new byte[lllIlIl[2]];
        byArray[s.lllIlIl[3]] = lllIlIl[3];
        byArray[s.lllIlIl[0]] = lllIlIl[4];
        byArray[s.lllIlIl[5]] = lllIlIl[6];
        byArray[s.lllIlIl[7]] = lllIlIl[8];
        byArray[s.lllIlIl[9]] = lllIlIl[3];
        byArray[s.lllIlIl[10]] = lllIlIl[11];
        byArray[s.lllIlIl[12]] = lllIlIl[0];
        byArray[s.lllIlIl[13]] = lllIlIl[14];
        byArray[s.lllIlIl[15]] = lllIlIl[3];
        byArray[s.lllIlIl[16]] = lllIlIl[17];
        byArray[s.lllIlIl[18]] = lllIlIl[3];
        byArray[s.lllIlIl[19]] = lllIlIl[20];
        byArray[s.lllIlIl[21]] = lllIlIl[3];
        byArray[s.lllIlIl[22]] = lllIlIl[23];
        return ec.a(byArray);
    }

    static {
        s.lIllIIl();
    }

    private static void lIllIIl() {
        lllIlIl = new int[24];
        s.lllIlIl[0] = " ".length();
        s.lllIlIl[1] = -" ".length();
        s.lllIlIl[2] = (0x78 ^ 0x7F) << " ".length();
        s.lllIlIl[3] = "   ".length() << " ".length() & ~("   ".length() << " ".length());
        s.lllIlIl[4] = (0x75 ^ 0x60) << (" ".length() << " ".length());
        s.lllIlIl[5] = " ".length() << " ".length();
        s.lllIlIl[6] = (0x17 ^ 0x18) << " ".length();
        s.lllIlIl[7] = "   ".length();
        s.lllIlIl[8] = -(0xA8 ^ 0xA7);
        s.lllIlIl[9] = " ".length() << (" ".length() << " ".length());
        s.lllIlIl[10] = 0x4F ^ 0x4A;
        s.lllIlIl[11] = " ".length() << (0xB0 ^ 0xB5);
        s.lllIlIl[12] = "   ".length() << " ".length();
        s.lllIlIl[13] = 0x70 ^ 0x77;
        s.lllIlIl[14] = 0x75 ^ 0x64;
        s.lllIlIl[15] = " ".length() << "   ".length();
        s.lllIlIl[16] = 0xCE ^ 0xC7;
        s.lllIlIl[17] = -(0x34 ^ 0x2B);
        s.lllIlIl[18] = (0x45 ^ 0x40) << " ".length();
        s.lllIlIl[19] = 0x78 ^ 0x73;
        s.lllIlIl[20] = (0x3F ^ 8) << " ".length();
        s.lllIlIl[21] = "   ".length() << (" ".length() << " ".length());
        s.lllIlIl[22] = 0x85 ^ 0x88;
        s.lllIlIl[23] = (0x94 ^ 0x99) << "   ".length();
    }
}

