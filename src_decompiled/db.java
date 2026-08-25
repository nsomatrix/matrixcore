/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class db
extends be {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int g;
    private /* synthetic */ short h;
    private /* synthetic */ int i;
    private /* synthetic */ int j;
    private /* synthetic */ int k;
    private /* synthetic */ boolean l;
    private /* synthetic */ int m;
    private /* synthetic */ int n;
    private /* synthetic */ int o;
    private /* synthetic */ v p;
    private /* synthetic */ u q;
    private /* synthetic */ boolean r;
    private /* synthetic */ int s;
    private /* synthetic */ int t;
    private static /* synthetic */ int u;
    private static /* synthetic */ Vector v;
    private static /* synthetic */ int w;
    private /* synthetic */ int x;
    private /* synthetic */ int y;
    private static /* synthetic */ byte[] z;
    private static /* synthetic */ int[] A;
    private static /* synthetic */ int[] B;
    private static final /* synthetic */ int[] lIIlII;

    static {
        db.llIIl();
        v = new Vector();
        w = lIIlII[0];
        byte[] byArray = new byte[lIIlII[1]];
        byArray[db.lIIlII[2]] = lIIlII[2];
        byArray[db.lIIlII[3]] = lIIlII[3];
        byArray[db.lIIlII[4]] = lIIlII[2];
        byArray[db.lIIlII[5]] = lIIlII[2];
        byArray[db.lIIlII[6]] = lIIlII[3];
        byArray[db.lIIlII[7]] = lIIlII[2];
        byArray[db.lIIlII[8]] = lIIlII[2];
        byArray[db.lIIlII[9]] = lIIlII[3];
        byArray[db.lIIlII[10]] = lIIlII[2];
        byArray[db.lIIlII[11]] = lIIlII[2];
        byArray[db.lIIlII[12]] = lIIlII[3];
        byArray[db.lIIlII[13]] = lIIlII[2];
        byArray[db.lIIlII[14]] = lIIlII[2];
        byArray[db.lIIlII[15]] = lIIlII[3];
        byArray[db.lIIlII[16]] = lIIlII[2];
        byArray[db.lIIlII[17]] = lIIlII[2];
        byArray[db.lIIlII[18]] = lIIlII[3];
        byArray[db.lIIlII[19]] = lIIlII[2];
        z = byArray;
        int[] nArray = new int[lIIlII[20]];
        nArray[db.lIIlII[4]] = lIIlII[7];
        nArray[db.lIIlII[21]] = lIIlII[6];
        nArray[db.lIIlII[5]] = lIIlII[6];
        nArray[db.lIIlII[6]] = lIIlII[6];
        nArray[db.lIIlII[7]] = lIIlII[3];
        nArray[db.lIIlII[22]] = lIIlII[3];
        nArray[db.lIIlII[8]] = lIIlII[4];
        nArray[db.lIIlII[9]] = lIIlII[4];
        nArray[db.lIIlII[10]] = lIIlII[21];
        nArray[db.lIIlII[23]] = lIIlII[5];
        nArray[db.lIIlII[11]] = lIIlII[5];
        nArray[db.lIIlII[12]] = lIIlII[5];
        nArray[db.lIIlII[13]] = lIIlII[2];
        A = nArray;
        int[] nArray2 = new int[lIIlII[15]];
        nArray2[db.lIIlII[2]] = lIIlII[13];
        nArray2[db.lIIlII[3]] = lIIlII[24];
        nArray2[db.lIIlII[4]] = lIIlII[25];
        nArray2[db.lIIlII[21]] = lIIlII[26];
        nArray2[db.lIIlII[5]] = lIIlII[27];
        nArray2[db.lIIlII[6]] = lIIlII[28];
        nArray2[db.lIIlII[7]] = lIIlII[29];
        nArray2[db.lIIlII[22]] = lIIlII[30];
        nArray2[db.lIIlII[8]] = lIIlII[31];
        nArray2[db.lIIlII[9]] = lIIlII[32];
        nArray2[db.lIIlII[10]] = lIIlII[33];
        nArray2[db.lIIlII[23]] = lIIlII[34];
        nArray2[db.lIIlII[11]] = lIIlII[35];
        nArray2[db.lIIlII[12]] = lIIlII[36];
        nArray2[db.lIIlII[13]] = lIIlII[37];
        nArray2[db.lIIlII[20]] = lIIlII[38];
        nArray2[db.lIIlII[14]] = lIIlII[39];
        B = nArray2;
    }

    private void a(int n2) {
        this.a = n2;
        this.b = this.h * eb.b(n2) >> lIIlII[9];
        this.g = this.h * eb.a(n2) >> lIIlII[9];
    }

    public static void a(int n2, int n3, boolean bl2, short s2, int n4, int n5, int n6, v v2) {
        u = s2;
        be.c.addElement(new db(n2, n3, bl2, s2, n4, n5, n6, v2));
    }

    public static void a(int n2, int n3, u u2) {
        be.c.addElement(new db(n2, n3, u2));
    }

    /*
     * WARNING - void declaration
     */
    private db(int n2, int n3, boolean bl2, short s2, int n4, int n5, int n6, v v2) {
        this.h = (short)lIIlII[40];
        this.l = lIIlII[0];
        this.t = lIIlII[2];
        this.x = lIIlII[0];
        this.o = lIIlII[0];
        this.i = n2;
        this.j = n3;
        this.r = bl2;
        this.s = n4;
        this.m = n5;
        this.n = n6;
        this.p = v2;
        if (bl2) {
            this.a(this.t * lIIlII[41]);
            this.t += lIIlII[2];
            if (this.t > lIIlII[4]) {
                this.t = lIIlII[2];
                return;
            }
        } else {
            db lllllIlllIllIII;
            void lllllIlllIlIIIl;
            void lllllIlllIlIlll;
            if (lllllIlllIlIlll > lllllIlllIlIIIl.j) {
                lllllIlllIllIII.a(lIIlII[42]);
                return;
            }
            lllllIlllIllIII.a(lIIlII[43]);
        }
    }

    private db(int n2, int n3, u u2) {
        this.h = (short)lIIlII[40];
        this.l = lIIlII[0];
        this.t = lIIlII[2];
        this.x = lIIlII[0];
        this.o = lIIlII[2];
        this.i = n2;
        this.j = n3;
        this.q = u2;
        if (n2 > u2.a) {
            this.a(lIIlII[42]);
        } else {
            db lllllIlllIIlIll;
            lllllIlllIIlIll.a(lIIlII[43]);
        }
        this.h = (short)lIIlII[40];
        this.a = lIIlII[44];
        this.b = this.h * eb.b(this.a) >> lIIlII[9];
        this.g = this.h * eb.a(this.a) >> lIIlII[9];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a() {
        void var5_5;
        int lllllIllIllIlIl;
        int lllllIllIllIllI;
        int lllllIllIllIlll;
        int lllllIllIlllIII;
        az lllllIllIlllIIl;
        db lllllIllIlllIlI;
        if (u > lIIlII[45]) {
            az az2 = new az(this.i, this.j, lIIlII[3]);
            v.addElement(az2);
        } else if (u > lIIlII[46] && u <= lIIlII[45]) {
            lllllIllIlllIIl = new az(lllllIllIlllIlI.i, lllllIllIlllIlI.j, lIIlII[5]);
            v.addElement(lllllIllIlllIIl);
        } else if (u > lIIlII[47] && u <= lIIlII[46]) {
            lllllIllIlllIIl = new az(lllllIllIlllIlI.i, lllllIllIlllIlI.j, lIIlII[21]);
            v.addElement(lllllIllIlllIIl);
        } else if (u > 0 && u <= lIIlII[47]) {
            lllllIllIlllIIl = new az(lllllIllIlllIlI.i, lllllIllIlllIlI.j, lIIlII[4]);
            v.addElement(lllllIllIlllIIl);
        }
        if (lllllIllIlllIlI.p != null) {
            lllllIllIlllIII = lllllIllIlllIlI.p.j - lllllIllIlllIlI.i;
            lllllIllIllIlll = lllllIllIlllIlI.p.k - (lllllIllIlllIlI.p.ah >> lIIlII[2]) - lllllIllIlllIlI.j;
            lllllIllIlllIlI.k += lIIlII[2];
            if ((eb.e(lllllIllIlllIII) >= lIIlII[20] || eb.e(lllllIllIllIlll) >= lIIlII[20]) && lllllIllIlllIlI.k <= lIIlII[48]) {
                lllllIllIllIllI = eb.a(lllllIllIlllIII, lllllIllIllIlll);
                if (Math.abs(lllllIllIllIllI - lllllIllIlllIlI.a) < lIIlII[41] || lllllIllIlllIII * lllllIllIlllIII + lllllIllIllIlll * lllllIllIllIlll > lIIlII[49]) {
                    lllllIllIlllIlI.a = Math.abs(lllllIllIllIllI - lllllIllIlllIlI.a) < lIIlII[13] ? lllllIllIllIllI : ((lllllIllIllIllI - lllllIllIlllIlI.a < 0 || lllllIllIllIllI - lllllIllIlllIlI.a >= lIIlII[44]) && lllllIllIllIllI - lllllIllIlllIlI.a >= lIIlII[50] ? eb.c(lllllIllIlllIlI.a - lIIlII[13]) : eb.c(lllllIllIlllIlI.a + lIIlII[13]));
                }
                if (lllllIllIlllIlI.h < lIIlII[51]) {
                    lllllIllIlllIlI.h = (short)(lllllIllIlllIlI.h + lIIlII[52]);
                }
                lllllIllIlllIlI.b = lllllIllIlllIlI.h * eb.b(lllllIllIlllIlI.a) >> lIIlII[9];
                lllllIllIlllIlI.g = lllllIllIlllIlI.h * eb.a(lllllIllIlllIlI.a) >> lIIlII[9];
                lllllIllIlllIII = lllllIllIlllIII + lllllIllIlllIlI.b >> lIIlII[9];
                lllllIllIlllIlI.i += lllllIllIlllIII;
                lllllIllIllIlll = lllllIllIllIlll + lllllIllIlllIlI.g >> lIIlII[9];
                lllllIllIlllIlI.j += lllllIllIllIlll;
                lllllIllIlllIII = eb.a(lllllIllIlllIII, -lllllIllIllIlll);
                lllllIllIllIlll = lIIlII[0];
                while (true) {
                    if (lllllIllIllIlll >= B.length - lIIlII[2]) {
                        lllllIllIllIlIl = lIIlII[0];
                        break;
                    }
                    if (lllllIllIlllIII >= B[lllllIllIllIlll] && lllllIllIlllIII <= B[lllllIllIllIlll + lIIlII[2]]) {
                        lllllIllIllIlIl = lllllIllIllIlll >= lIIlII[20] ? lIIlII[0] : lllllIllIllIlll;
                        break;
                    }
                    ++lllllIllIllIlll;
                }
                lllllIllIlllIlI.y = lllllIllIllIlIl;
                lllllIllIlllIlI.x = z[lllllIllIlllIlI.y];
                w = A[lllllIllIlllIlI.y];
            }
        }
        lllllIllIllIllI = lIIlII[0];
        lllllIllIlllIII = lIIlII[0];
        if (lllllIllIlllIlI.o != 0) {
            if (lllllIllIlllIlI.o == lIIlII[2]) {
                lllllIllIllIllI = lllllIllIlllIlI.q.a - lllllIllIlllIlI.i;
                lllllIllIlllIII = lllllIllIlllIlI.q.b - lIIlII[9] - lllllIllIlllIlI.j;
                lllllIllIlllIlI.k += lIIlII[2];
                if (eb.e(lllllIllIllIllI) < lIIlII[20] && eb.e(lllllIllIlllIII) < lIIlII[20] || lllllIllIlllIlI.k > lIIlII[48]) {
                    lllllIllIlllIlI.q.d = lIIlII[2];
                    be.c.removeElement(lllllIllIlllIlI);
                    return;
                }
            }
        } else {
            lllllIllIllIllI = lllllIllIlllIlI.p.j - lllllIllIlllIlI.i;
            lllllIllIlllIII = lllllIllIlllIlI.p.k - lIIlII[9] - lllllIllIlllIlI.j;
            lllllIllIlllIlI.k += lIIlII[2];
            if (lllllIllIlllIlI.p.o == lIIlII[5] || lllllIllIlllIlI.p.o == lIIlII[12]) {
                lllllIllIlllIlI.i += (lllllIllIlllIlI.p.j - lllllIllIlllIlI.i) / lIIlII[3];
                lllllIllIlllIlI.j += (lllllIllIlllIlI.p.k - lllllIllIlllIlI.j) / lIIlII[3];
            }
            if (eb.e(lllllIllIllIllI) < lIIlII[20] && eb.e(lllllIllIlllIII) < lIIlII[20] || lllllIllIlllIlI.k > lIIlII[48]) {
                lllllIllIlllIlI.p.a(lllllIllIlllIlI.m, lllllIllIlllIlI.n, lllllIllIlllIlI.r, lllllIllIlllIlI.s);
                be.c.removeElement(lllllIllIlllIlI);
                return;
            }
        }
        if (Math.abs((lllllIllIllIlll = eb.a(lllllIllIllIllI, lllllIllIlllIII)) - lllllIllIlllIlI.a) < lIIlII[41] || lllllIllIllIllI * lllllIllIllIllI + lllllIllIlllIII * lllllIllIlllIII > lIIlII[49]) {
            lllllIllIlllIlI.a = Math.abs(lllllIllIllIlll - lllllIllIlllIlI.a) < lIIlII[13] ? lllllIllIllIlll : ((lllllIllIllIlll - lllllIllIlllIlI.a < 0 || lllllIllIllIlll - lllllIllIlllIlI.a >= lIIlII[44]) && lllllIllIllIlll - lllllIllIlllIlI.a >= lIIlII[50] ? eb.c(lllllIllIlllIlI.a - lIIlII[13]) : eb.c(lllllIllIlllIlI.a + lIIlII[13]));
        }
        lllllIllIllIllI = lllllIllIllIllI + lllllIllIlllIlI.b >> lIIlII[9];
        lllllIllIlllIlI.i += lllllIllIllIllI;
        lllllIllIllIllI = lllllIllIlllIII + lllllIllIlllIlI.g >> lIIlII[9];
        lllllIllIlllIlI.j += lllllIllIllIllI;
        lllllIllIllIlIl = lIIlII[0];
        while (var5_5 < v.size()) {
            lllllIllIlllIIl = (az)v.elementAt(lllllIllIllIlIl);
            lllllIllIlllIIl.a();
            if (lllllIllIlllIIl.a > lIIlII[4]) {
                v.removeElementAt(lllllIllIllIlIl);
            }
            ++lllllIllIllIlIl;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        block29: {
            db lllllIllIllIIII;
            void lllllIllIlIllll;
            block27: {
                int lllllIllIlIlllI;
                block31: {
                    block30: {
                        block28: {
                            if (!this.r) break block27;
                            int n2 = lIIlII[7];
                            n2 = bq.w % n2;
                            if (this.s == lIIlII[53]) {
                                if (n2 < lIIlII[21]) {
                                    ev.a(fh2, lIIlII[54], this.i, this.j, lIIlII[0], lIIlII[4]);
                                    return;
                                }
                                ev.a((fh)lllllIllIlIllll, lIIlII[55], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                                return;
                            }
                            if (lllllIllIllIIII.s != lIIlII[56]) break block28;
                            int lllllIllIlIllIl = lIIlII[57];
                            lllllIllIlIlllI = bq.w % lllllIllIlIllIl;
                            if (lllllIllIlIlllI < lIIlII[21]) {
                                ev.a((fh)lllllIllIlIllll, lIIlII[58], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                                return;
                            }
                            if (lllllIllIlIlllI < lIIlII[22]) {
                                ev.a((fh)lllllIllIlIllll, lIIlII[59], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                                return;
                            }
                            if (lllllIllIlIlllI < lIIlII[23]) {
                                ev.a((fh)lllllIllIlIllll, lIIlII[58], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                                return;
                            }
                            if (lllllIllIlIlllI < lIIlII[20]) {
                                ev.a((fh)lllllIllIlIllll, lIIlII[60], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                                return;
                            }
                            break block29;
                        }
                        if (lllllIllIllIIII.s != lIIlII[61]) break block30;
                        int lllllIllIlIllIl = lIIlII[14];
                        lllllIllIlIlllI = bq.w % lllllIllIlIllIl;
                        if (lllllIllIlIlllI < lIIlII[21]) {
                            ev.a((fh)lllllIllIlIllll, lIIlII[62], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                            return;
                        }
                        if (lllllIllIlIlllI < lIIlII[22]) {
                            ev.a((fh)lllllIllIlIllll, lIIlII[63], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                            return;
                        }
                        if (lllllIllIlIlllI < lIIlII[23]) {
                            ev.a((fh)lllllIllIlIllll, lIIlII[64], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                            return;
                        }
                        if (lllllIllIlIlllI < lIIlII[20]) {
                            ev.a((fh)lllllIllIlIllll, lIIlII[65], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                            return;
                        }
                        break block29;
                    }
                    if (lllllIllIllIIII.s != lIIlII[66]) break block31;
                    int lllllIllIlIllIl = lIIlII[57];
                    lllllIllIlIlllI = bq.w % lllllIllIlIllIl;
                    if (lllllIllIlIlllI < lIIlII[21]) {
                        ev.a((fh)lllllIllIlIllll, lIIlII[67], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                        return;
                    }
                    if (lllllIllIlIlllI < lIIlII[22]) {
                        ev.a((fh)lllllIllIlIllll, lIIlII[59], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                        return;
                    }
                    if (lllllIllIlIlllI < lIIlII[23]) {
                        ev.a((fh)lllllIllIlIllll, lIIlII[68], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                        return;
                    }
                    if (lllllIllIlIlllI < lIIlII[20]) {
                        ev.a((fh)lllllIllIlIllll, lIIlII[60], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                        return;
                    }
                    break block29;
                }
                if (lllllIllIllIIII.s != lIIlII[69] && lllllIllIllIIII.s != lIIlII[70]) break block29;
                int lllllIllIlIllIl = lIIlII[57];
                lllllIllIlIlllI = bq.w % lllllIllIlIllIl;
                if (lllllIllIlIlllI < lIIlII[21]) {
                    ev.a((fh)lllllIllIlIllll, lIIlII[67], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                    return;
                }
                if (lllllIllIlIlllI < lIIlII[22]) {
                    ev.a((fh)lllllIllIlIllll, lIIlII[59], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                    return;
                }
                if (lllllIllIlIlllI < lIIlII[23]) {
                    ev.a((fh)lllllIllIlIllll, lIIlII[68], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                    return;
                }
                if (lllllIllIlIlllI < lIIlII[20]) {
                    ev.a((fh)lllllIllIlIllll, lIIlII[60], lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0], lIIlII[4]);
                    return;
                }
                break block29;
            }
            if (u > lIIlII[45]) {
                lllllIllIlIllll.a(bt.bM, lIIlII[0], lllllIllIllIIII.x * lIIlII[19], lIIlII[71], lIIlII[19], w, lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0]);
            } else if (u > lIIlII[46] && u <= lIIlII[45]) {
                lllllIllIlIllll.a(bt.bM, lIIlII[0], lIIlII[0], lIIlII[12], lIIlII[12], w, lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0]);
            } else if (u > lIIlII[47] && u <= lIIlII[46]) {
                lllllIllIlIllll.a(bt.bM, lIIlII[0], lIIlII[0], lIIlII[22], lIIlII[22], w, lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0]);
            } else if (u > 0 && u <= lIIlII[47]) {
                lllllIllIlIllll.a(bt.bM, lIIlII[0], lIIlII[0], lIIlII[22], lIIlII[22], w, lllllIllIllIIII.i, lllllIllIllIIII.j, lIIlII[0]);
            }
            int lllllIllIlIlllI = lIIlII[0];
            while (lllllIllIlIlllI < v.size()) {
                az lllllIllIlIllIl = (az)v.elementAt(lllllIllIlIlllI);
                if (lllllIllIlIllIl != null) {
                    lllllIllIlIllIl.a((fh)lllllIllIlIllll);
                }
                ++lllllIllIlIlllI;
            }
        }
    }

    private static void llIIl() {
        lIIlII = new int[72];
        db.lIIlII[0] = (0xB ^ 0x14) << " ".length() & ~((0xA5 ^ 0xBA) << " ".length());
        db.lIIlII[1] = 0x6E ^ 0x77;
        db.lIIlII[2] = " ".length();
        db.lIIlII[3] = " ".length() << " ".length();
        db.lIIlII[4] = "   ".length();
        db.lIIlII[5] = 0x49 ^ 0x4C;
        db.lIIlII[6] = "   ".length() << " ".length();
        db.lIIlII[7] = 0x9C ^ 0x9B;
        db.lIIlII[8] = 0x64 ^ 0x6D;
        db.lIIlII[9] = (0x77 ^ 0x72) << " ".length();
        db.lIIlII[10] = 0xB1 ^ 0xBA;
        db.lIIlII[11] = 0x67 ^ 0x6A;
        db.lIIlII[12] = (0x59 ^ 0x5E) << " ".length();
        db.lIIlII[13] = 0xB4 ^ 0xBB;
        db.lIIlII[14] = 0x9A ^ 0x8B;
        db.lIIlII[15] = (0x49 ^ 0x40) << " ".length();
        db.lIIlII[16] = 0x93 ^ 0x80;
        db.lIIlII[17] = 0x48 ^ 0x5D;
        db.lIIlII[18] = (0xA ^ 1) << " ".length();
        db.lIIlII[19] = 0x7D ^ 0x6A;
        db.lIIlII[20] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        db.lIIlII[21] = " ".length() << (" ".length() << " ".length());
        db.lIIlII[22] = " ".length() << "   ".length();
        db.lIIlII[23] = "   ".length() << (" ".length() << " ".length());
        db.lIIlII[24] = 8 ^ 0x2D;
        db.lIIlII[25] = (0xA8 ^ 0xA5) << (" ".length() << " ".length());
        db.lIIlII[26] = 0x2A ^ 0x61;
        db.lIIlII[27] = 0xEB ^ 0x82;
        db.lIIlII[28] = 7 + 7 - -15 + 98;
        db.lIIlII[29] = (0xC2 ^ 0x85) << " ".length();
        db.lIIlII[30] = 18 + 147 - 102 + 102;
        db.lIIlII[31] = 193 + 130 - 309 + 181;
        db.lIIlII[32] = 28 + 163 - 90 + 116;
        db.lIIlII[33] = (0x74 ^ 0x69) << "   ".length();
        db.lIIlII[34] = 231 + 119 - 127 + 32;
        db.lIIlII[35] = 276 + 82 - 125 + 52;
        db.lIIlII[36] = 101 + 212 - 151 + 145;
        db.lIIlII[37] = 62 + 12 - -72 + 15 << " ".length();
        db.lIIlII[38] = 97 + 58 - 124 + 314;
        db.lIIlII[39] = 11 + 52 - 29 + 151 << " ".length();
        db.lIIlII[40] = " ".length() << (" ".length() << "   ".length());
        db.lIIlII[41] = (4 ^ 0x29) << " ".length();
        db.lIIlII[42] = (0xA5 ^ 0xAA) << (" ".length() << (" ".length() << " ".length()));
        db.lIIlII[43] = (0x31 ^ 0x7A) << (" ".length() << " ".length());
        db.lIIlII[44] = (0x9E ^ 0xB3) << (" ".length() << " ".length());
        db.lIIlII[45] = (0x7E ^ 0x67) << (" ".length() << " ".length());
        db.lIIlII[46] = (0x6C ^ 0x75) << " ".length();
        db.lIIlII[47] = (0x76 ^ 0x79) << " ".length();
        db.lIIlII[48] = (0x84 ^ 0x8B) << (" ".length() << " ".length());
        db.lIIlII[49] = " ".length() << ("   ".length() << (" ".length() << " ".length()));
        db.lIIlII[50] = -(93 + 115 - 168 + 140);
        db.lIIlII[51] = " ".length() << (0x24 ^ 0x29);
        db.lIIlII[52] = " ".length() << ((0x6C ^ 0x69) << " ".length());
        db.lIIlII[53] = (0xF ^ 0x36) << " ".length();
        db.lIIlII[54] = 1174 + 293 - 665 + 497;
        db.lIIlII[55] = 489 + 99 - 91 + 810;
        db.lIIlII[56] = 0xB6 ^ 0xC5;
        db.lIIlII[57] = (0x5D ^ 0x58) << (" ".length() << " ".length());
        db.lIIlII[58] = 62 + 581 - -452 + 284;
        db.lIIlII[59] = 223 + 236 - 213 + 99 << (" ".length() << " ".length());
        db.lIIlII[60] = 568 + 43 - 363 + 443 << " ".length();
        db.lIIlII[61] = (0x7E ^ 0x63) << (" ".length() << " ".length());
        db.lIIlII[62] = 239 + 886 - 465 + 739;
        db.lIIlII[63] = 56 + 124 - 8 + 3 << "   ".length();
        db.lIIlII[64] = 416 + 1281 - 1223 + 927;
        db.lIIlII[65] = 651 + 650 - 931 + 331 << " ".length();
        db.lIIlII[66] = 38 + 44 - 33 + 90;
        db.lIIlII[67] = 1091 + 286 - 1243 + 1325;
        db.lIIlII[68] = 715 + 106 - 125 + 765;
        db.lIIlII[69] = (0x22 ^ 0x2B) << (" ".length() << (" ".length() << " ".length()));
        db.lIIlII[70] = 28 + 79 - 99 + 155;
        db.lIIlII[71] = 0x67 ^ 0x78;
    }
}

