/*
 * Decompiled with CFR 0.152.
 */
public final class ab
implements bu {
    private static /* synthetic */ ab h;
    public /* synthetic */ ex a;
    public /* synthetic */ boolean b;
    /* synthetic */ bt c;
    private /* synthetic */ long i;
    public /* synthetic */ au d;
    public /* synthetic */ au e;
    public /* synthetic */ au f;
    public /* synthetic */ String g;
    private static final /* synthetic */ int[] lIlIIIlI;

    public static ab a() {
        return h == null ? (h = new ab()) : h;
    }

    protected ab() {
        this.b = lIlIIIlI[0];
        this.i = 0L;
        this.d = new au(fa.aw, this, lIlIIIlI[1], null, fb.s - lIlIIIlI[2], fb.t + lIlIIIlI[3]);
        this.e = new au(fa.W, this, lIlIIIlI[4], null, bq.A - lIlIIIlI[5], bq.B - fj.cu + lIlIIIlI[6]);
        this.f = null;
        this.a = new ex();
        byte[] byArray = new byte[lIlIIIlI[7]];
        byArray[ab.lIlIIIlI[0]] = lIlIIIlI[0];
        byArray[ab.lIlIIIlI[6]] = lIlIIIlI[8];
        byArray[ab.lIlIIIlI[9]] = lIlIIIlI[0];
        byArray[ab.lIlIIIlI[10]] = lIlIIIlI[11];
        byArray[ab.lIlIIIlI[12]] = lIlIIIlI[0];
        byArray[ab.lIlIIIlI[2]] = lIlIIIlI[13];
        byArray[ab.lIlIIIlI[14]] = lIlIIIlI[0];
        byArray[ab.lIlIIIlI[15]] = lIlIIIlI[16];
        this.a.l = ec.a(byArray);
        this.a.a = lIlIIIlI[17];
        this.a.c = lIlIIIlI[18];
        this.a.d = fj.cs + lIlIIIlI[9];
        this.a.e = lIlIIIlI[6];
        this.a.b(lIlIIIlI[19]);
    }

    public final void a(int n2, bt bt2, String string) {
        this.e.a = fa.H;
        this.g = string;
        this.a.a(n2);
        if (!this.a.d().equals("") && bq.J == null) {
            this.c = bt2;
            this.b = lIlIIIlI[6];
        }
        this.a.g = string;
    }

    public final void a(String string) {
        this.e.a = fa.H;
        this.g = string;
        if (bq.J == null) {
            this.b = lIlIIIlI[6];
            if (bq.g) {
                this.a.a();
            }
        }
        this.a.g = string;
    }

    public final void a(fh fh2) {
        if (this.b) {
            this.a.a(fh2);
        }
    }

    @Override
    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                ab llIIlllIIlIIIll;
                if (llIIlllIIlIIIll.c == null) break;
                long llIIlllIIlIIIII = System.currentTimeMillis();
                if (llIIlllIIlIIIII - llIIlllIIlIIIll.i < 1000L) {
                    return;
                }
                llIIlllIIlIIIll.i = llIIlllIIlIIIII;
                llIIlllIIlIIIll.c.a(llIIlllIIlIIIll.a.d(), llIIlllIIlIIIll.g);
                llIIlllIIlIIIll.a.a("");
                llIIlllIIlIIIll.e.a = fa.H;
                return;
            }
            case 8001: {
                ab llIIlllIIlIIIll;
                llIIlllIIlIIIll.a.b();
                if (!llIIlllIIlIIIll.a.d().equals("")) break;
                llIIlllIIlIIIll.b = lIlIIIlI[0];
                llIIlllIIlIIIll.c.K();
            }
        }
    }

    static {
        ab.llllIIl();
    }

    private static void llllIIl() {
        lIlIIIlI = new int[20];
        ab.lIlIIIlI[0] = (5 ^ 0x3C) & ~(0xAF ^ 0x96);
        ab.lIlIIIlI[1] = (0xC0 ^ 0xBD) << ("   ".length() << " ".length());
        ab.lIlIIIlI[2] = 0x8D ^ 0x88;
        ab.lIlIIIlI[3] = 0xA7 ^ 0x84;
        ab.lIlIIIlI[4] = 2204 + 5449 - 3096 + 3444;
        ab.lIlIIIlI[5] = 0x9A ^ 0xAF;
        ab.lIlIIIlI[6] = " ".length();
        ab.lIlIIIlI[7] = " ".length() << "   ".length();
        ab.lIlIIIlI[8] = 0x5C ^ 0x3F;
        ab.lIlIIIlI[9] = " ".length() << " ".length();
        ab.lIlIIIlI[10] = "   ".length();
        ab.lIlIIIlI[11] = (0x3E ^ 0x33) << "   ".length();
        ab.lIlIIIlI[12] = " ".length() << (" ".length() << " ".length());
        ab.lIlIIIlI[13] = 0xA3 ^ 0xC2;
        ab.lIlIIIlI[14] = "   ".length() << " ".length();
        ab.lIlIIIlI[15] = 0xA9 ^ 0xAE;
        ab.lIlIIIlI[16] = (0x5F ^ 0x42) << (" ".length() << " ".length());
        ab.lIlIIIlI[17] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        ab.lIlIIIlI[18] = (0x9C ^ 0x85) << " ".length();
        ab.lIlIIIlI[19] = (0xBE ^ 0xBB) << "   ".length();
    }
}

