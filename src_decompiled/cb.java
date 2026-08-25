/*
 * Decompiled with CFR 0.152.
 */
public final class cb
extends ay
implements bu {
    private /* synthetic */ String[] f;
    public /* synthetic */ ex d;
    public /* synthetic */ ex e;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private /* synthetic */ int j;
    private static final /* synthetic */ int[] lIIlIII;

    public cb() {
        new au("", lIIlIII[0], null);
        this.d = new ex();
        this.e = new ex();
    }

    /*
     * WARNING - void declaration
     */
    public final void a(String string, String string2) {
        void llllIIIllIIlIll;
        this.j = fg.o.a(string) > fg.o.a(string2) ? fg.o.a(string) : fg.o.a((String)llllIIIllIIlIll);
        llllIIIllIIllIl.g = lIIlIII[1];
        llllIIIllIIllIl.h = lIIlIII[2];
        if (bq.A <= lIIlIII[3]) {
            llllIIIllIIllIl.g = lIIlIII[4];
        }
        this.d.a = this.g + this.j + lIIlIII[4];
        this.d.b = bq.B - lIIlIII[5] * fj.cs - lIIlIII[6];
        this.d.c = bq.A - lIIlIII[5] * this.g - this.j - lIIlIII[7];
        this.d.d = fj.cs + lIIlIII[5];
        this.d.e = lIIlIII[8];
        this.d.f = string;
        this.e.a = this.g + this.j + lIIlIII[4];
        this.e.b = bq.B - fj.cs - lIIlIII[9];
        this.e.c = bq.A - lIIlIII[5] * this.g - this.j - lIIlIII[7];
        this.e.d = fj.cs + lIIlIII[5];
        this.e.f = string2;
        this.c = this.d.m;
    }

    public final void a(String string, au au2, au au3, int n2, int n3) {
        this.d.a("");
        this.d.c(n2);
        this.e.a("");
        this.e.c(n3);
        this.f = fg.o.b(string, bq.A - this.g * lIIlIII[10]);
        dh dh2 = fg.o.a(string, bq.A - this.g * lIIlIII[10]);
        this.i = dh2.size();
        this.a = au2;
        this.b = au3;
        bq.J = this;
    }

    @Override
    public final void a(fh fh2) {
        bq.N.a(fh2, this.g, bq.B - lIIlIII[11] - fj.cu - this.i * lIIlIII[12], bq.A - (this.g << lIIlIII[8]), lIIlIII[13] + this.i * lIIlIII[12], this.f, null);
        byte[] byArray = new byte[lIIlIII[14]];
        byArray[cb.lIIlIII[2]] = lIIlIII[2];
        byArray[cb.lIIlIII[8]] = lIIlIII[15];
        byArray[cb.lIIlIII[5]] = lIIlIII[2];
        byArray[cb.lIIlIII[10]] = lIIlIII[16];
        fg.o.a(fh2, String.valueOf(this.d.f) + ec.a(byArray), this.d.a - this.j - lIIlIII[17], this.d.b + lIIlIII[17], lIIlIII[2]);
        this.d.a(fh2);
        fh2.d(lIIlIII[2], lIIlIII[2], bq.A, bq.B);
        byte[] byArray2 = new byte[lIIlIII[14]];
        byArray2[cb.lIIlIII[2]] = lIIlIII[2];
        byArray2[cb.lIIlIII[8]] = lIIlIII[15];
        byArray2[cb.lIIlIII[5]] = lIIlIII[2];
        byArray2[cb.lIIlIII[10]] = lIIlIII[16];
        fg.o.a(fh2, String.valueOf(this.e.f) + ec.a(byArray2), this.e.a - this.j - lIIlIII[17], this.e.b + lIIlIII[17], lIIlIII[2]);
        this.e.a(fh2);
        super.a(fh2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(int n2) {
        if (this.h == 0) {
            this.d.a(n2);
        } else {
            void llllIIIllIIIlll;
            cb llllIIIllIIlIII;
            llllIIIllIIlIII.e.a((int)llllIIIllIIIlll);
        }
        super.a(n2);
    }

    @Override
    public final void a() {
        cb llllIIIllIIIlIl;
        if (bq.n[lIIlIII[5]]) {
            this.h = lIIlIII[2];
        }
        if (bq.n[lIIlIII[18]]) {
            llllIIIllIIIlIl.h = lIIlIII[8];
        }
        if (llllIIIllIIIlIl.h == 0) {
            llllIIIllIIIlIl.d.e = lIIlIII[8];
            llllIIIllIIIlIl.e.e = lIIlIII[2];
            llllIIIllIIIlIl.c = llllIIIllIIIlIl.d.m;
            llllIIIllIIIlIl.d.c();
        } else {
            llllIIIllIIIlIl.d.e = lIIlIII[2];
            llllIIIllIIIlIl.e.e = lIIlIII[8];
            llllIIIllIIIlIl.c = llllIIIllIIIlIl.e.m;
            llllIIIllIIIlIl.e.c();
        }
        if (bq.g && bq.r && bq.q) {
            if (bq.b(llllIIIllIIIlIl.d.a, llllIIIllIIIlIl.d.b, llllIIIllIIIlIl.d.c, llllIIIllIIIlIl.d.d)) {
                llllIIIllIIIlIl.h = lIIlIII[2];
            }
            if (bq.b(llllIIIllIIIlIl.e.a, llllIIIllIIIlIl.e.b, llllIIIllIIIlIl.e.c, llllIIIllIIIlIl.e.d)) {
                llllIIIllIIIlIl.h = lIIlIII[8];
            }
        }
        if (llllIIIllIIIlIl.a != null) {
            llllIIIllIIIlIl.a.f = bq.A / lIIlIII[5] - lIIlIII[19];
            llllIIIllIIIlIl.a.g = bq.B - lIIlIII[20];
        }
        if (llllIIIllIIIlIl.b != null) {
            llllIIIllIIIlIl.b.f = bq.A / lIIlIII[5] - lIIlIII[21];
            llllIIIllIIIlIl.b.g = bq.B - lIIlIII[20];
        }
        if (llllIIIllIIIlIl.c != null) {
            llllIIIllIIIlIl.c.f = bq.A / lIIlIII[5] + lIIlIII[22];
            llllIIIllIIIlIl.c.g = bq.B - lIIlIII[20];
        }
        super.a();
    }

    @Override
    public final void a(int n2, Object object) {
    }

    static {
        cb.llIllI();
    }

    private static void llIllI() {
        lIIlIII = new int[23];
        cb.lIIlIII[0] = (0xFB ^ 0x86) << "   ".length();
        cb.lIIlIII[1] = (0xAF ^ 0xAA) << "   ".length();
        cb.lIIlIII[2] = (0x67 ^ 0x56) & ~(0x19 ^ 0x28);
        cb.lIIlIII[3] = (0x7D ^ 0x76) << (" ".length() << (" ".length() << " ".length()));
        cb.lIIlIII[4] = (0x7F ^ 0x7A) << " ".length();
        cb.lIIlIII[5] = " ".length() << " ".length();
        cb.lIIlIII[6] = (0x13 ^ 0xA) << " ".length();
        cb.lIIlIII[7] = (0x2F ^ 0x2A) << (" ".length() << " ".length());
        cb.lIIlIII[8] = " ".length();
        cb.lIIlIII[9] = 0x6C ^ 0x47;
        cb.lIIlIII[10] = "   ".length();
        cb.lIIlIII[11] = 0x79 ^ 0x2C;
        cb.lIIlIII[12] = 0x24 ^ 0x29;
        cb.lIIlIII[13] = (0xC4 ^ 0xC1) << (" ".length() << (" ".length() << " ".length()));
        cb.lIIlIII[14] = " ".length() << (" ".length() << " ".length());
        cb.lIIlIII[15] = (0x85 ^ 0x98) << " ".length();
        cb.lIIlIII[16] = " ".length() << (0x6D ^ 0x68);
        cb.lIIlIII[17] = 0x90 ^ 0x95;
        cb.lIIlIII[18] = " ".length() << "   ".length();
        cb.lIIlIII[19] = (0x77 ^ 0x72) << (0x10 ^ 0x15);
        cb.lIIlIII[20] = (0xAD ^ 0xA0) << " ".length();
        cb.lIIlIII[21] = 0xBE ^ 0x9D;
        cb.lIIlIII[22] = (0x52 ^ 0x59) << "   ".length();
    }
}

