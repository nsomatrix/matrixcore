/*
 * Decompiled with CFR 0.152.
 */
public final class de
extends ay {
    private /* synthetic */ String[] f;
    public /* synthetic */ boolean d;
    public /* synthetic */ int e;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private static final /* synthetic */ int[] lIlII;

    public de() {
        this.h = lIlII[0];
        if (bq.A <= lIlII[1]) {
            this.h = lIlII[2];
        }
    }

    public final void b() {
        this.a(fa.y, null, null, null);
        bq.J = this;
    }

    /*
     * WARNING - void declaration
     */
    public final void a(String string, au au2, au au3, au au4) {
        de lllllllIlIlIlll;
        void lllllllIlIlIIll;
        this.f = fg.o.b(string, bq.A - ((this.h << lIlII[3]) + lIlII[4]));
        this.a = au2;
        this.b = au3;
        this.c = au4;
        if (au3 != null) {
            this.b.f = bq.A / lIlII[5] - lIlII[6];
            this.b.g = bq.B - lIlII[7];
            if (au2 != null) {
                this.a.f = bq.A / lIlII[5] - lIlII[8];
                this.a.g = bq.B - lIlII[7];
            }
            if (lllllllIlIlIIll != null) {
                lllllllIlIlIlll.c.f = bq.A / lIlII[5] + lIlII[9];
                lllllllIlIlIlll.c.g = bq.B - lIlII[7];
            }
        } else {
            void lllllllIlIlIlIl;
            if (lllllllIlIlIlIl != null) {
                lllllllIlIlIlll.a.f = bq.A / lIlII[5] - lIlII[10];
                lllllllIlIlIlll.a.g = bq.B - lIlII[7];
            }
            if (lllllllIlIlIIll != null) {
                lllllllIlIlIlll.c.f = bq.A / lIlII[5] + lIlII[2];
                lllllllIlIlIlll.c.g = bq.B - lIlII[7];
            }
        }
        lllllllIlIlIlll.d = lIlII[11];
        lllllllIlIlIlll.g = lIlII[10];
        if (lllllllIlIlIlll.f.length >= lIlII[12]) {
            lllllllIlIlIlll.g = lllllllIlIlIlll.f.length * fg.o.c() + lIlII[13];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        void var3_3;
        int n2 = bq.B - this.g - lIlII[14];
        dp.a(this.h, n2, bq.A - (this.h << lIlII[3]), this.g, fh2);
        n2 = n2 + (this.g - this.f.length * fg.o.c()) / lIlII[5] - lIlII[5];
        if (this.d) {
            bq.a(bq.C, (n2 += 8) - lIlII[15], fh2, lIlII[11]);
        }
        int lllllllIlIIlIll = lIlII[11];
        while (var3_3 < this.f.length) {
            void lllllllIlIIllII;
            de lllllllIlIIlllI;
            void lllllllIlIIllIl;
            fg.o.a((fh)lllllllIlIIllIl, lllllllIlIIlllI.f[lllllllIlIIlIll], bq.C, (int)lllllllIlIIllII, lIlII[5]);
            ++lllllllIlIIlIll;
            n2 = lllllllIlIIllII + fg.o.c();
        }
        super.a(fh2);
    }

    @Override
    public final void a() {
        if (this.e > 0) {
            this.e -= lIlII[3];
            if (this.e == lIlII[3]) {
                bq.k();
                this.e = lIlII[11];
            }
        }
        super.a();
    }

    static {
        de.lIlI();
    }

    private static void lIlI() {
        lIlII = new int[16];
        de.lIlII[0] = (0x89 ^ 0x86) << " ".length();
        de.lIlII[1] = (0x17 ^ 0x1C) << (" ".length() << (" ".length() << " ".length()));
        de.lIlII[2] = (0x4B ^ 0x4E) << " ".length();
        de.lIlII[3] = " ".length();
        de.lIlII[4] = (0x87 ^ 0x82) << "   ".length();
        de.lIlII[5] = " ".length() << " ".length();
        de.lIlII[6] = 0x81 ^ 0xA2;
        de.lIlII[7] = (0xB9 ^ 0xB4) << " ".length();
        de.lIlII[8] = 0x42 ^ 0x31;
        de.lIlII[9] = 0x64 ^ 0x49;
        de.lIlII[10] = (0x35 ^ 0x30) << (" ".length() << (" ".length() << " ".length()));
        de.lIlII[11] = (0x6C ^ 0x35) & ~(0x1B ^ 0x42);
        de.lIlII[12] = 0xA9 ^ 0xAC;
        de.lIlII[13] = (0x6C ^ 0x69) << (" ".length() << " ".length());
        de.lIlII[14] = (0xB3 ^ 0xA0) << " ".length();
        de.lIlII[15] = "   ".length() << (" ".length() << " ".length());
    }
}

