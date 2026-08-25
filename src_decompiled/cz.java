/*
 * Decompiled with CFR 0.152.
 */
public final class cz {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private /* synthetic */ int f;
    private /* synthetic */ int g;
    private /* synthetic */ v h;
    private /* synthetic */ int[] i;
    private /* synthetic */ int[] j;
    private /* synthetic */ int[] k;
    private static final /* synthetic */ int[] llllIIl;

    public cz(int n2, int n3, v v2) {
        this.a = n2;
        this.b = n3;
        this.c = n2;
        this.d = n3 - (eb.d(llllIIl[0]) + llllIIl[1]);
        this.e = llllIIl[2];
        this.g = llllIIl[2];
        this.h = v2;
    }

    /*
     * WARNING - void declaration
     */
    public cz(int n2, int n3) {
        this.e = llllIIl[2];
        this.g = llllIIl[3];
        this.c = n2;
        this.d = n3;
        this.i = new int[llllIIl[4]];
        this.j = new int[llllIIl[4]];
        this.k = new int[llllIIl[4]];
        this.f = llllIIl[5];
        int n4 = llllIIl[6];
        while (n4 < this.i.length) {
            void lllIIIIIIIIIllI;
            void lllIIIIIIIIIlll;
            void lllIIIIIIIIlIII;
            lllIIIIIIIIlIIl.i[lllIIIIIIIIIllI] = eb.d((int)(lllIIIIIIIIlIII - llllIIl[1]), (int)(lllIIIIIIIIlIII + llllIIl[1]));
            lllIIIIIIIIlIIl.j[lllIIIIIIIIIllI] = lllIIIIIIIIIlll - llllIIl[7];
            lllIIIIIIIIlIIl.k[lllIIIIIIIIIllI] = lllIIIIIIIIIllI % llllIIl[3] == false ? llllIIl[2] : llllIIl[8];
            ++lllIIIIIIIIIllI;
        }
    }

    public final void a() {
        cz lllIIIIIIIIIIIl;
        if (this.g == llllIIl[2]) {
            if (this.h == null) {
                bt.x.removeElement(this);
                return;
            }
            if (lllIIIIIIIIIIIl.e == llllIIl[2]) {
                if (lllIIIIIIIIIIIl.b > lllIIIIIIIIIIIl.d) {
                    lllIIIIIIIIIIIl.b -= llllIIl[3];
                    lllIIIIIIIIIIIl.a += llllIIl[2] - bq.w % llllIIl[9];
                } else {
                    lllIIIIIIIIIIIl.e = llllIIl[3];
                }
                lllIIIIIIIIIIIl.f = llllIIl[10];
                return;
            }
            lllIIIIIIIIIIIl.f -= llllIIl[2];
            if (eb.e(lllIIIIIIIIIIIl.h.j - lllIIIIIIIIIIIl.a) >= llllIIl[11] && eb.e(lllIIIIIIIIIIIl.h.k - lllIIIIIIIIIIIl.b) >= llllIIl[11]) {
                lllIIIIIIIIIIIl.a += (lllIIIIIIIIIIIl.h.j - lllIIIIIIIIIIIl.a) / llllIIl[7];
                lllIIIIIIIIIIIl.b += (lllIIIIIIIIIIIl.h.k - lllIIIIIIIIIIIl.b) / llllIIl[7];
            } else {
                lllIIIIIIIIIIIl.a += (lllIIIIIIIIIIIl.h.j - lllIIIIIIIIIIIl.a) / llllIIl[12];
                lllIIIIIIIIIIIl.b += (lllIIIIIIIIIIIl.h.k - lllIIIIIIIIIIIl.b) / llllIIl[12];
            }
            if (lllIIIIIIIIIIIl.f < 0) {
                lllIIIIIIIIIIIl.a = lllIIIIIIIIIIIl.h.j;
                lllIIIIIIIIIIIl.b = lllIIIIIIIIIIIl.h.k - lllIIIIIIIIIIIl.h.ah / llllIIl[3];
                if (lllIIIIIIIIIIIl.f < llllIIl[13]) {
                    bt.x.removeElement(lllIIIIIIIIIIIl);
                    return;
                }
            } else if (eb.e(lllIIIIIIIIIIIl.h.j - lllIIIIIIIIIIIl.a) < llllIIl[7] && eb.e(lllIIIIIIIIIIIl.h.k - lllIIIIIIIIIIIl.b) < llllIIl[7]) {
                bt.x.removeElement(lllIIIIIIIIIIIl);
                return;
            }
        } else if (lllIIIIIIIIIIIl.g == llllIIl[3]) {
            int lllIIIIIIIIIIII = llllIIl[6];
            while (lllIIIIIIIIIIII < lllIIIIIIIIIIIl.i.length) {
                int[] llIllllllllllll = lllIIIIIIIIIIIl.j;
                int n2 = lllIIIIIIIIIIII;
                llIllllllllllll[n2] = llIllllllllllll[n2] - bq.w % llllIIl[4];
                if (lllIIIIIIIIIIIl.k[lllIIIIIIIIIIII] == llllIIl[8]) {
                    int n3 = lllIIIIIIIIIIII;
                    lllIIIIIIIIIIIl.i[n3] = lllIIIIIIIIIIIl.i[n3] - llllIIl[2];
                } else {
                    int n4 = lllIIIIIIIIIIII;
                    lllIIIIIIIIIIIl.i[n4] = lllIIIIIIIIIIIl.i[n4] + llllIIl[2];
                }
                if (lllIIIIIIIIIIIl.i[lllIIIIIIIIIIII] <= lllIIIIIIIIIIIl.c - llllIIl[1] || lllIIIIIIIIIIIl.i[lllIIIIIIIIIIII] >= lllIIIIIIIIIIIl.c + llllIIl[1]) {
                    lllIIIIIIIIIIIl.k[lllIIIIIIIIIIII] = -lllIIIIIIIIIIIl.k[lllIIIIIIIIIIII];
                }
                if (lllIIIIIIIIIIIl.j[lllIIIIIIIIIIII] < 0) {
                    bt.x.removeElement(lllIIIIIIIIIIIl);
                }
                ++lllIIIIIIIIIIII;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(fh fh2) {
        cz llIlllllllllIlI;
        void llIlllllllllIIl;
        if (this.g == llllIIl[2]) {
            if (bq.w % llllIIl[4] > llllIIl[3]) {
                ev.a(fh2, llllIIl[14], this.a, this.b, llllIIl[6], llllIIl[9]);
            } else {
                ev.a((fh)llIlllllllllIIl, llllIIl[15], llIlllllllllIlI.a, llIlllllllllIlI.b, llllIIl[6], llllIIl[9]);
            }
        } else {
            int llIlllllllllIII = llllIIl[6];
            while (llIlllllllllIII < llIlllllllllIlI.i.length) {
                if (bq.w % llllIIl[4] > llllIIl[3]) {
                    ev.a((fh)llIlllllllllIIl, llllIIl[14], llIlllllllllIlI.i[llIlllllllllIII], llIlllllllllIlI.j[llIlllllllllIII], llllIIl[6], llllIIl[9]);
                } else {
                    ev.a((fh)llIlllllllllIIl, llllIIl[15], llIlllllllllIlI.i[llIlllllllllIII], llIlllllllllIlI.j[llIlllllllllIII], llllIIl[6], llllIIl[9]);
                }
                ++llIlllllllllIII;
            }
        }
    }

    static {
        cz.lIlllII();
    }

    private static void lIlllII() {
        llllIIl = new int[16];
        cz.llllIIl[0] = (0x32 ^ 0x37) << "   ".length();
        cz.llllIIl[1] = (0x57 ^ 0x52) << (" ".length() << " ".length());
        cz.llllIIl[2] = " ".length();
        cz.llllIIl[3] = " ".length() << " ".length();
        cz.llllIIl[4] = 0x14 ^ 0x11;
        cz.llllIIl[5] = (5 ^ 0x4E) << (" ".length() << " ".length());
        cz.llllIIl[6] = (4 ^ 0x59) & ~(0x50 ^ 0xD);
        cz.llllIIl[7] = (0x5D ^ 0x58) << " ".length();
        cz.llllIIl[8] = -" ".length();
        cz.llllIIl[9] = "   ".length();
        cz.llllIIl[10] = (0x4B ^ 0x52) << (" ".length() << " ".length());
        cz.llllIIl[11] = (0x9D ^ 0x84) << " ".length();
        cz.llllIIl[12] = " ".length() << (" ".length() << " ".length());
        cz.llllIIl[13] = -(0x73 ^ 0x76);
        cz.llllIIl[14] = 791 + 143 - -37 + 462;
        cz.llllIIl[15] = 354 + 380 - 463 + 446 << " ".length();
    }
}

