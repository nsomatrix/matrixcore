/*
 * Decompiled with CFR 0.152.
 */
public final class eo {
    public /* synthetic */ et a;
    public /* synthetic */ short b;
    public /* synthetic */ int c;
    public /* synthetic */ int d;
    public /* synthetic */ int e;
    public /* synthetic */ long f;
    public /* synthetic */ int g;
    public /* synthetic */ int h;
    public /* synthetic */ int i;
    public /* synthetic */ int j;
    public /* synthetic */ eq[] k;
    public /* synthetic */ boolean l;
    private static final /* synthetic */ int[] lIlIlIlI;

    public eo() {
        this.l = lIlIlIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    public final void a(int n2, int n3, fh fh2) {
        ev.a(fh2, this.a.e, n2, n3, lIlIlIlI[0], ew.g);
        long l2 = System.currentTimeMillis() - this.f;
        if (l2 < (long)this.e) {
            void llIIIllIllllIlI;
            void llIIIllIllllIll;
            void llIIIllIllllIIl;
            eo llIIIllIlllllII;
            void llIIIllIllllIII;
            fh2.a(lIlIlIlI[1]);
            if (this.l && bq.w % lIlIlIlI[2] > lIlIlIlI[3]) {
                fh2.a(lIlIlIlI[4]);
            }
            int llIIIllIlllIlll = (int)(llIIIllIllllIII * 18L / (long)llIIIllIlllllII.e);
            llIIIllIllllIIl.c((int)(llIIIllIllllIll - lIlIlIlI[5]), (int)(llIIIllIllllIlI - lIlIlIlI[5] + llIIIllIlllIlll), lIlIlIlI[6], lIlIlIlI[6] - llIIIllIlllIlll);
        } else {
            llIIIllIlllllII.l = lIlIlIlI[0];
        }
    }

    public final boolean a() {
        if (System.currentTimeMillis() - this.f < (long)this.e) {
            return lIlIlIlI[7];
        }
        return lIlIlIlI[0];
    }

    public final int b() {
        eo llIIIllIlllIIll;
        return at.t ? at.v : llIIIllIlllIIll.g;
    }

    public final int c() {
        eo llIIIllIlllIIIl;
        return at.s ? at.u : llIIIllIlllIIIl.h;
    }

    static {
        eo.lIIIIIIl();
    }

    private static void lIIIIIIl() {
        lIlIlIlI = new int[8];
        eo.lIlIlIlI[0] = (0xAD ^ 0xA0) & ~(0xB1 ^ 0xBC);
        eo.lIlIlIlI[1] = 2561561 + 2124375 - 4190673 + 2860180;
        eo.lIlIlIlI[2] = "   ".length() << " ".length();
        eo.lIlIlIlI[3] = " ".length() << " ".length();
        eo.lIlIlIlI[4] = 872262 + 423787 - 989151 + 811583 << (" ".length() << " ".length());
        eo.lIlIlIlI[5] = 0x97 ^ 0x9E;
        eo.lIlIlIlI[6] = (0x36 ^ 0x3F) << " ".length();
        eo.lIlIlIlI[7] = " ".length();
    }
}

