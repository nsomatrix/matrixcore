/*
 * Decompiled with CFR 0.152.
 */
public abstract class ay {
    /* synthetic */ au a;
    /* synthetic */ au b;
    /* synthetic */ au c;
    private static final /* synthetic */ int[] I;

    public void a(fh fh2) {
        fh2.a(-fh2.a(), -fh2.b());
        fh2.d(I[0], I[0], bq.A, bq.B);
        dp.a(fh2);
        dp.a(fh2, this.a, this.b, this.c);
    }

    public void a(int n2) {
        switch (n2) {
            case -39: 
            case -2: {
                bq.o[ay.I[1]] = I[2];
                bq.n[ay.I[1]] = I[2];
                return;
            }
            case -38: 
            case -1: {
                bq.o[ay.I[3]] = I[2];
                bq.n[ay.I[3]] = I[2];
                return;
            }
            case -22: 
            case -7: {
                bq.o[ay.I[4]] = I[2];
                bq.n[ay.I[4]] = I[2];
                return;
            }
            case -21: 
            case -6: {
                bq.o[ay.I[5]] = I[2];
                bq.n[ay.I[5]] = I[2];
                return;
            }
            case -5: 
            case 10: {
                bq.o[ay.I[6]] = I[2];
                bq.n[ay.I[6]] = I[2];
                return;
            }
        }
    }

    public void a() {
        ay llllllllllIIlll;
        if (this.b != null && (bq.n[I[6]] || fj.a(this.b))) {
            bq.n[ay.I[6]] = I[0];
            bq.q = I[0];
            fj.cv = I[7];
            bq.r = I[0];
            if (llllllllllIIlll.b != null) {
                llllllllllIIlll.b.a();
            }
            fj.cv = I[7];
        }
        if (llllllllllIIlll.a != null && (bq.n[I[5]] || fj.a(llllllllllIIlll.a))) {
            bq.n[ay.I[5]] = I[0];
            bq.q = I[0];
            fj.cv = I[7];
            bq.r = I[0];
            if (llllllllllIIlll.a != null) {
                llllllllllIIlll.a.a();
            }
            fj.cv = I[7];
        }
        if (llllllllllIIlll.c != null && (bq.n[I[4]] || fj.a(llllllllllIIlll.c))) {
            bq.n[ay.I[4]] = I[0];
            bq.q = I[0];
            bq.r = I[0];
            fj.cv = I[7];
            if (llllllllllIIlll.c != null) {
                llllllllllIIlll.c.a();
            }
            fj.cv = I[7];
        }
        bq.i();
        bq.j();
    }

    static {
        ay.lI();
    }

    private static void lI() {
        I = new int[8];
        ay.I[0] = (0xE5 ^ 0xAA) & ~(0x25 ^ 0x6A);
        ay.I[1] = " ".length() << "   ".length();
        ay.I[2] = " ".length();
        ay.I[3] = " ".length() << " ".length();
        ay.I[4] = 0x5B ^ 0x56;
        ay.I[5] = "   ".length() << (" ".length() << " ".length());
        ay.I[6] = 0x5E ^ 0x5B;
        ay.I[7] = -" ".length();
    }
}

