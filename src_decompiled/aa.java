/*
 * Decompiled with CFR 0.152.
 */
public final class aa
implements bu {
    private static /* synthetic */ aa h;
    public /* synthetic */ ex a;
    public /* synthetic */ boolean b;
    /* synthetic */ bt c;
    private /* synthetic */ long i;
    public /* synthetic */ au d;
    public /* synthetic */ au e;
    public /* synthetic */ au f;
    public /* synthetic */ String g;
    private static final /* synthetic */ int[] llIIlIl;

    public static aa a() {
        return h == null ? (h = new aa()) : h;
    }

    protected aa() {
        this.b = llIIlIl[0];
        this.i = 0L;
        this.d = new au(fa.aw, this, llIIlIl[1], null, llIIlIl[2], bq.B - fj.cu + llIIlIl[2]);
        this.e = new au(fa.W, this, llIIlIl[3], null, bq.A - llIIlIl[4], bq.B - fj.cu + llIIlIl[2]);
        this.f = null;
        this.a = new ex();
        byte[] byArray = new byte[llIIlIl[5]];
        byArray[aa.llIIlIl[0]] = llIIlIl[0];
        byArray[aa.llIIlIl[2]] = llIIlIl[6];
        byArray[aa.llIIlIl[7]] = llIIlIl[0];
        byArray[aa.llIIlIl[8]] = llIIlIl[9];
        byArray[aa.llIIlIl[10]] = llIIlIl[0];
        byArray[aa.llIIlIl[11]] = llIIlIl[12];
        byArray[aa.llIIlIl[13]] = llIIlIl[0];
        byArray[aa.llIIlIl[14]] = llIIlIl[15];
        this.a.l = ec.a(byArray);
        this.a.a = llIIlIl[16];
        this.a.c = dc.a.b() - llIIlIl[17];
        this.a.d = fj.cs + llIIlIl[7];
        this.a.e = llIIlIl[2];
        this.a.b(llIIlIl[18]);
    }

    public final void a(int n2, bt bt2, String string) {
        this.e.a = fa.H;
        this.g = string;
        this.a.a(n2);
        if (!this.a.d().equals("") && bq.J == null) {
            this.c = bt2;
            this.b = llIIlIl[2];
        }
        this.a.g = string;
    }

    public final void a(String string) {
        this.e.a = fa.H;
        this.g = string;
        if (bq.J == null) {
            this.b = llIIlIl[2];
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
                aa lllIllIllllIlll;
                if (lllIllIllllIlll.c == null) break;
                long lllIllIllllIlIl = System.currentTimeMillis();
                if (lllIllIllllIlIl - lllIllIllllIlll.i < 1000L) {
                    return;
                }
                lllIllIllllIlll.i = lllIllIllllIlIl;
                lllIllIllllIlll.c.a(lllIllIllllIlll.a.d(), lllIllIllllIlll.g);
                lllIllIllllIlll.a.a("");
                lllIllIllllIlll.e.a = fa.H;
                return;
            }
            case 8001: {
                aa lllIllIllllIlll;
                lllIllIllllIlll.a.b();
                if (!lllIllIllllIlll.a.d().equals("")) break;
                lllIllIllllIlll.b = llIIlIl[0];
                lllIllIllllIlll.c.K();
            }
        }
    }

    static {
        aa.lIIlIll();
    }

    private static void lIIlIll() {
        llIIlIl = new int[19];
        aa.llIIlIl[0] = " ".length() << " ".length() & ~(" ".length() << " ".length());
        aa.llIIlIl[1] = (0xF6 ^ 0x8B) << ("   ".length() << " ".length());
        aa.llIIlIl[2] = " ".length();
        aa.llIIlIl[3] = 7223 + 1146 - 3701 + 3333;
        aa.llIIlIl[4] = 0x6D ^ 0x58;
        aa.llIIlIl[5] = " ".length() << "   ".length();
        aa.llIIlIl[6] = 0x42 ^ 0x21;
        aa.llIIlIl[7] = " ".length() << " ".length();
        aa.llIIlIl[8] = "   ".length();
        aa.llIIlIl[9] = (0xA9 ^ 0xA4) << "   ".length();
        aa.llIIlIl[10] = " ".length() << (" ".length() << " ".length());
        aa.llIIlIl[11] = 0x1B ^ 0x1E;
        aa.llIIlIl[12] = 0x57 ^ 0x36;
        aa.llIIlIl[13] = "   ".length() << " ".length();
        aa.llIIlIl[14] = 0x1A ^ 0x1D;
        aa.llIIlIl[15] = (0x87 ^ 0x9A) << (" ".length() << " ".length());
        aa.llIIlIl[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        aa.llIIlIl[17] = " ".length() << (0x7B ^ 0x7E);
        aa.llIIlIl[18] = (0xA4 ^ 0xA1) << "   ".length();
    }
}

