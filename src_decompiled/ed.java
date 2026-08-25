/*
 * Decompiled with CFR 0.152.
 */
public final class ed {
    private /* synthetic */ int i;
    private /* synthetic */ int j;
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    private /* synthetic */ int k;
    private /* synthetic */ int l;
    private /* synthetic */ int m;
    private /* synthetic */ int n;
    public /* synthetic */ int c;
    public /* synthetic */ int d;
    public /* synthetic */ int e;
    public /* synthetic */ int f;
    private /* synthetic */ int o;
    private /* synthetic */ int p;
    public static /* synthetic */ ed g;
    private /* synthetic */ int q;
    private /* synthetic */ int r;
    private /* synthetic */ int[] s;
    private /* synthetic */ boolean t;
    private /* synthetic */ boolean u;
    private /* synthetic */ int v;
    private /* synthetic */ int w;
    public /* synthetic */ int h;
    private /* synthetic */ int x;
    private /* synthetic */ boolean y;
    private static final /* synthetic */ int[] lIlIlIl;

    public ed() {
        this.s = new int[lIlIlIl[0]];
        this.y = lIlIlIl[1];
    }

    public final void a() {
        this.i = lIlIlIl[2];
        this.j = lIlIlIl[2];
        this.a = lIlIlIl[2];
        this.b = lIlIlIl[2];
        this.k = lIlIlIl[2];
        this.l = lIlIlIl[2];
        this.m = lIlIlIl[2];
        this.n = lIlIlIl[2];
        this.o = lIlIlIl[2];
        this.p = lIlIlIl[2];
        this.e = lIlIlIl[2];
        this.f = lIlIlIl[2];
    }

    public boolean b() {
        if (this.i == 0 && this.j == 0 && this.a == 0 && this.b == 0 && this.k == 0 && this.l == 0 && this.m == 0 && this.n == 0 && this.o == 0 && this.p == 0 && this.e == 0 && this.f == 0) {
            return lIlIlIl[1];
        }
        return lIlIlIl[2];
    }

    public final void a(fh fh2, int n2, int n3, int n4, int n5) {
        fh2.d(n2, n3, n4, n5 - lIlIlIl[1]);
        fh2.a(-fh2.a(), -fh2.b());
        fh2.a(-this.a, -this.b);
    }

    public final void a(fh fh2) {
        fh2.d(this.c, this.d, this.e, this.f - lIlIlIl[1]);
        fh2.a(-fh2.a(), -fh2.b());
        fh2.a(-this.a, -this.b);
    }

    /*
     * WARNING - void declaration
     */
    public final ee c() {
        void var7_12;
        void var5_2;
        ed lllIlllllIIIlIl;
        if (this.y) {
            int lllIlllllIIIIIl;
            int lllIlllllIIIlII;
            int lllIlllllIIIIll;
            void lllIlllllIIIIII;
            ed ed2 = this;
            int n2 = ed2.c;
            int n3 = ed2.d;
            int n4 = ed2.e;
            int n5 = ed2.f;
            if (bq.p) {
                int lllIlllllIIIIlI;
                if (!ed2.t && bq.c(n2, n3, n4, n5)) {
                    n4 = lIlIlIl[2];
                    while (lllIlllllIIIIlI < lllIlllllIIIIII.s.length) {
                        lllIlllllIIIIII.s[ed.lIlIlIl[2]] = bq.t;
                        ++lllIlllllIIIIlI;
                    }
                    lllIlllllIIIIII.r = bq.t;
                    lllIlllllIIIIII.t = lIlIlIl[1];
                    lllIlllllIIIIII.w = lIlIlIl[3];
                    lllIlllllIIIIII.u = lllIlllllIIIIII.v != 0 ? lIlIlIl[1] : lIlIlIl[2];
                    lllIlllllIIIIII.v = lIlIlIl[2];
                } else if (lllIlllllIIIIII.t) {
                    lllIlllllIIIIII.q += lIlIlIl[1];
                    if (lllIlllllIIIIII.q > lIlIlIl[4] && lllIlllllIIIIII.r == bq.t && !lllIlllllIIIIII.u) {
                        lllIlllllIIIIII.r = lIlIlIl[5];
                        if (lllIlllllIIIIII.x > lIlIlIl[1]) {
                            lllIlllllIIIIlI = (lllIlllllIIIIII.j + bq.t - lllIlllllIIIIll) / lllIlllllIIIIII.h;
                            lllIlllllIIIIIl = (lllIlllllIIIIII.i + bq.s - lllIlllllIIIlII) / lllIlllllIIIIII.h;
                            lllIlllllIIIIII.w = lllIlllllIIIIlI * lllIlllllIIIIII.x + lllIlllllIIIIIl;
                        } else {
                            lllIlllllIIIIII.w = (lllIlllllIIIIII.j + bq.t - lllIlllllIIIIll) / lllIlllllIIIIII.h;
                        }
                    }
                    if ((lllIlllllIIIIlI = bq.t - lllIlllllIIIIII.s[lIlIlIl[2]]) != 0 && lllIlllllIIIIII.w != lIlIlIl[3]) {
                        lllIlllllIIIIII.w = lIlIlIl[3];
                    }
                    lllIlllllIIIIIl = lllIlllllIIIIII.s.length - lIlIlIl[1];
                    while (lllIlllllIIIIIl > 0) {
                        lllIlllllIIIIII.s[lllIlllllIIIIIl] = lllIlllllIIIIII.s[lllIlllllIIIIIl - lIlIlIl[1]];
                        --lllIlllllIIIIIl;
                    }
                    lllIlllllIIIIII.s[ed.lIlIlIl[2]] = bq.t;
                    lllIlllllIIIIII.j -= lllIlllllIIIIlI;
                    if (lllIlllllIIIIII.j < 0) {
                        lllIlllllIIIIII.j = lIlIlIl[2];
                    }
                    if (lllIlllllIIIIII.j > lllIlllllIIIIII.p) {
                        lllIlllllIIIIII.j = lllIlllllIIIIII.p;
                    }
                    if (lllIlllllIIIIII.b < 0 || lllIlllllIIIIII.b > lllIlllllIIIIII.p) {
                        lllIlllllIIIIlI /= lIlIlIl[6];
                    }
                    lllIlllllIIIIII.b -= lllIlllllIIIIlI;
                }
            }
            int lllIllllIlllllI = lIlIlIl[2];
            if (bq.r && lllIlllllIIIIII.t) {
                lllIlllllIIIIIl = bq.t - lllIlllllIIIIII.s[lIlIlIl[2]];
                bq.r = lIlIlIl[2];
                if (eb.e(lllIlllllIIIIIl) < lIlIlIl[7] && eb.e(bq.t - lllIlllllIIIIII.r) < lIlIlIl[7] && !lllIlllllIIIIII.u) {
                    lllIlllllIIIIII.v = lIlIlIl[2];
                    lllIlllllIIIIII.j = lllIlllllIIIIII.b;
                    lllIlllllIIIIII.r = lIlIlIl[5];
                    if (lllIlllllIIIIII.x > lIlIlIl[1]) {
                        lllIlllllIIIIll = (lllIlllllIIIIII.j + bq.t - lllIlllllIIIIll) / lllIlllllIIIIII.h;
                        lllIlllllIIIlII = (lllIlllllIIIIII.i + bq.s - lllIlllllIIIlII) / lllIlllllIIIIII.h;
                        lllIlllllIIIIII.w = lllIlllllIIIIll * lllIlllllIIIIII.x + lllIlllllIIIlII;
                    } else {
                        lllIlllllIIIIII.w = (lllIlllllIIIIII.j + bq.t - lllIlllllIIIIll) / lllIlllllIIIIII.h;
                    }
                    lllIlllllIIIIII.q = lIlIlIl[2];
                    lllIllllIlllllI = lIlIlIl[1];
                } else if (lllIlllllIIIIII.w != lIlIlIl[3] && lllIlllllIIIIII.q > lIlIlIl[4]) {
                    lllIlllllIIIIII.q = lIlIlIl[2];
                    lllIllllIlllllI = lIlIlIl[1];
                } else if (lllIlllllIIIIII.w == lIlIlIl[3] && !lllIlllllIIIIII.u) {
                    if (lllIlllllIIIIII.b < 0) {
                        lllIlllllIIIIII.j = lIlIlIl[2];
                    } else if (lllIlllllIIIIII.b > lllIlllllIIIIII.p) {
                        lllIlllllIIIIII.j = lllIlllllIIIIII.p;
                    } else {
                        lllIlllllIIIIll = bq.t - lllIlllllIIIIII.s[lIlIlIl[2]] + (lllIlllllIIIIII.s[lIlIlIl[2]] - lllIlllllIIIIII.s[lIlIlIl[1]]) + (lllIlllllIIIIII.s[lIlIlIl[1]] - lllIlllllIIIIII.s[lIlIlIl[6]]);
                        int lllIllllIllllll = lllIlllllIIIIll > lIlIlIl[8] ? lIlIlIl[8] : (lllIlllllIIIIll < lIlIlIl[9] ? lIlIlIl[9] : lIlIlIl[2]);
                        lllIlllllIIIIII.v = -lllIllllIllllll * lIlIlIl[10];
                    }
                }
                lllIlllllIIIIII.t = lIlIlIl[2];
                lllIlllllIIIIII.q = lIlIlIl[2];
                bq.r = lIlIlIl[2];
            }
            ee lllIllllIllllIl = new ee();
            new ee().b = lllIlllllIIIIII.w;
            lllIllllIllllIl.c = lllIllllIlllllI;
            lllIllllIllllIl.a = lllIlllllIIIIII.t;
            return lllIllllIllllIl;
        }
        ed lllIlllllIIIIII = lllIlllllIIIlIl;
        int lllIlllllIIIlII = lllIlllllIIIIII.c;
        int lllIlllllIIIIll = lllIlllllIIIIII.d;
        int lllIlllllIIIIlI = lllIlllllIIIIII.e;
        int lllIlllllIIIIIl = lllIlllllIIIIII.f;
        if (bq.p) {
            if (!lllIlllllIIIIII.t && bq.c(lllIlllllIIIlII, lllIlllllIIIIll, lllIlllllIIIIlI, lllIlllllIIIIIl)) {
                lllIlllllIIIIlI = lIlIlIl[2];
                while (lllIlllllIIIIlI < lllIlllllIIIIII.s.length) {
                    lllIlllllIIIIII.s[ed.lIlIlIl[2]] = bq.s;
                    ++lllIlllllIIIIlI;
                }
                lllIlllllIIIIII.r = bq.s;
                lllIlllllIIIIII.t = lIlIlIl[1];
                lllIlllllIIIIII.w = lIlIlIl[3];
                lllIlllllIIIIII.u = lllIlllllIIIIII.v != 0 ? lIlIlIl[1] : lIlIlIl[2];
                lllIlllllIIIIII.v = lIlIlIl[2];
            } else if (lllIlllllIIIIII.t) {
                lllIlllllIIIIII.q += lIlIlIl[1];
                if (lllIlllllIIIIII.q > lIlIlIl[4] && lllIlllllIIIIII.r == bq.s && !lllIlllllIIIIII.u) {
                    lllIlllllIIIIII.r = lIlIlIl[5];
                    lllIlllllIIIIII.w = (lllIlllllIIIIII.i + bq.s - lllIlllllIIIlII) / lllIlllllIIIIII.h;
                }
                if ((lllIlllllIIIIlI = bq.s - lllIlllllIIIIII.s[lIlIlIl[2]]) != 0 && lllIlllllIIIIII.w != lIlIlIl[3]) {
                    lllIlllllIIIIII.w = lIlIlIl[3];
                }
                lllIlllllIIIIIl = lllIlllllIIIIII.s.length - lIlIlIl[1];
                while (lllIlllllIIIIIl > 0) {
                    lllIlllllIIIIII.s[lllIlllllIIIIIl] = lllIlllllIIIIII.s[lllIlllllIIIIIl - lIlIlIl[1]];
                    --lllIlllllIIIIIl;
                }
                lllIlllllIIIIII.s[ed.lIlIlIl[2]] = bq.s;
                lllIlllllIIIIII.i -= lllIlllllIIIIlI;
                if (lllIlllllIIIIII.i < 0) {
                    lllIlllllIIIIII.i = lIlIlIl[2];
                }
                if (lllIlllllIIIIII.i > lllIlllllIIIIII.o) {
                    lllIlllllIIIIII.i = lllIlllllIIIIII.o;
                }
                if (lllIlllllIIIIII.a < 0 || lllIlllllIIIIII.a > lllIlllllIIIIII.o) {
                    lllIlllllIIIIlI /= lIlIlIl[6];
                }
                lllIlllllIIIIII.a -= lllIlllllIIIIlI;
            }
        }
        int lllIllllIlllllI = lIlIlIl[2];
        if (bq.r && lllIlllllIIIIII.t) {
            lllIlllllIIIIIl = bq.s - lllIlllllIIIIII.s[lIlIlIl[2]];
            bq.r = lIlIlIl[2];
            if (eb.e(lllIlllllIIIIIl) < lIlIlIl[7] && eb.e(bq.s - lllIlllllIIIIII.r) < lIlIlIl[7] && !lllIlllllIIIIII.u) {
                lllIlllllIIIIII.v = lIlIlIl[2];
                lllIlllllIIIIII.i = lllIlllllIIIIII.a;
                lllIlllllIIIIII.r = lIlIlIl[5];
                lllIlllllIIIIII.w = (lllIlllllIIIIII.i + bq.s - lllIlllllIIIlII) / lllIlllllIIIIII.h;
                lllIlllllIIIIII.q = lIlIlIl[2];
                lllIllllIlllllI = lIlIlIl[1];
            } else if (lllIlllllIIIIII.w != lIlIlIl[3] && lllIlllllIIIIII.q > lIlIlIl[4]) {
                lllIlllllIIIIII.q = lIlIlIl[2];
                lllIllllIlllllI = lIlIlIl[1];
            } else if (lllIlllllIIIIII.w == lIlIlIl[3] && !lllIlllllIIIIII.u) {
                if (lllIlllllIIIIII.a < 0) {
                    lllIlllllIIIIII.i = lIlIlIl[2];
                } else if (lllIlllllIIIIII.a > lllIlllllIIIIII.o) {
                    lllIlllllIIIIII.i = lllIlllllIIIIII.o;
                } else {
                    lllIlllllIIIIll = bq.s - lllIlllllIIIIII.s[lIlIlIl[2]] + (lllIlllllIIIIII.s[lIlIlIl[2]] - lllIlllllIIIIII.s[lIlIlIl[1]]) + (lllIlllllIIIIII.s[lIlIlIl[1]] - lllIlllllIIIIII.s[lIlIlIl[6]]);
                    int lllIllllIllllll = lllIlllllIIIIll > lIlIlIl[8] ? lIlIlIl[8] : (lllIlllllIIIIll < lIlIlIl[9] ? lIlIlIl[9] : lIlIlIl[2]);
                    lllIlllllIIIIII.v = -lllIllllIllllll * lIlIlIl[10];
                }
            }
            lllIlllllIIIIII.t = lIlIlIl[2];
            lllIlllllIIIIII.q = lIlIlIl[2];
            bq.r = lIlIlIl[2];
        }
        ee ee2 = new ee();
        new ee().b = var5_2.w;
        ee2.c = var7_12;
        ee2.a = var5_2.t;
        return ee2;
    }

    public final void d() {
        ed lllIllllIlllIll;
        if (this.v != 0 && !this.t) {
            if (this.y) {
                this.j += this.v / lIlIlIl[10];
                if (this.j < 0) {
                    this.j = lIlIlIl[2];
                } else if (lllIllllIlllIll.j > lllIllllIlllIll.p) {
                    lllIllllIlllIll.j = lllIllllIlllIll.p;
                } else {
                    lllIllllIlllIll.b = lllIllllIlllIll.j;
                }
            } else {
                lllIllllIlllIll.i += lllIllllIlllIll.v / lIlIlIl[10];
                if (lllIllllIlllIll.i < 0) {
                    lllIllllIlllIll.i = lIlIlIl[2];
                } else if (lllIllllIlllIll.i > lllIllllIlllIll.o) {
                    lllIllllIlllIll.i = lllIllllIlllIll.o;
                } else {
                    lllIllllIlllIll.a = lllIllllIlllIll.i;
                }
            }
            lllIllllIlllIll.v = lllIllllIlllIll.v * lIlIlIl[11] / lIlIlIl[8];
            if (lllIllllIlllIll.v < lIlIlIl[10] && lllIllllIlllIll.v > lIlIlIl[12]) {
                lllIllllIlllIll.v = lIlIlIl[2];
            }
        }
        if (lllIllllIlllIll.a != lllIllllIlllIll.i && !lllIllllIlllIll.t) {
            lllIllllIlllIll.k = lllIllllIlllIll.i - lllIllllIlllIll.a << lIlIlIl[6];
            lllIllllIlllIll.m += lllIllllIlllIll.k;
            lllIllllIlllIll.a += lllIllllIlllIll.m >> lIlIlIl[13];
            lllIllllIlllIll.m &= lIlIlIl[14];
        }
        if (lllIllllIlllIll.b != lllIllllIlllIll.j && !lllIllllIlllIll.t) {
            lllIllllIlllIll.l = lllIllllIlllIll.j - lllIllllIlllIll.b << lIlIlIl[6];
            lllIllllIlllIll.n += lllIllllIlllIll.l;
            lllIllllIlllIll.b += lllIllllIlllIll.n >> lIlIlIl[13];
            lllIllllIlllIll.n &= lIlIlIl[14];
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, int n8) {
        ed lllIllllIllIIIl;
        this.c = n4;
        this.d = n5;
        this.h = n3;
        this.e = n6;
        this.f = n7;
        this.y = bl2;
        this.x = n8;
        if (bl2) {
            this.p = n2 * n3 - n7;
        } else {
            void lllIllllIlIllII;
            void lllIllllIlIllll;
            void lllIllllIllIIII;
            lllIllllIllIIIl.o = lllIllllIllIIII * lllIllllIlIllll - lllIllllIlIllII;
        }
        if (lllIllllIllIIIl.p < 0) {
            lllIllllIllIIIl.p = lIlIlIl[2];
        }
        if (lllIllllIllIIIl.o < 0) {
            lllIllllIllIIIl.o = lIlIlIl[2];
        }
    }

    public final void a(int n2) {
        ed lllIllllIlIIllI;
        if (this.y) {
            this.j = n2 -= (this.f - this.h) / lIlIlIl[6];
            if (this.j < 0) {
                this.j = lIlIlIl[2];
            }
            if (lllIllllIlIIllI.j > lllIllllIlIIllI.p) {
                lllIllllIlIIllI.j = lllIllllIlIIllI.p;
                return;
            }
        } else {
            lllIllllIlIIllI.i = lllIllllIlIIlIl -= (lllIllllIlIIllI.e - lllIllllIlIIllI.h) / lIlIlIl[6];
            if (lllIllllIlIIllI.i < 0) {
                lllIllllIlIIllI.i = lIlIlIl[2];
            }
            if (lllIllllIlIIllI.i > lllIllllIlIIllI.o) {
                lllIllllIlIIllI.i = lllIllllIlIIllI.o;
            }
        }
    }

    static {
        ed.llllll();
    }

    private static void llllll() {
        lIlIlIl = new int[15];
        ed.lIlIlIl[0] = "   ".length();
        ed.lIlIlIl[1] = " ".length();
        ed.lIlIlIl[2] = (0x8C ^ 0xB9) & ~(0x47 ^ 0x72);
        ed.lIlIlIl[3] = -" ".length();
        ed.lIlIlIl[4] = 0xA ^ 0xF;
        ed.lIlIlIl[5] = -(436 + 958 - 816 + 422);
        ed.lIlIlIl[6] = " ".length() << " ".length();
        ed.lIlIlIl[7] = (0x84 ^ 0x81) << (" ".length() << " ".length());
        ed.lIlIlIl[8] = (0x8C ^ 0x89) << " ".length();
        ed.lIlIlIl[9] = -(0x4C ^ 0x46);
        ed.lIlIlIl[10] = (0x2B ^ 0x32) << (" ".length() << " ".length());
        ed.lIlIlIl[11] = 0xAE ^ 0xA7;
        ed.lIlIlIl[12] = -(0x27 ^ 0x43);
        ed.lIlIlIl[13] = " ".length() << (" ".length() << " ".length());
        ed.lIlIlIl[14] = 0x1F ^ 0x10;
    }
}

