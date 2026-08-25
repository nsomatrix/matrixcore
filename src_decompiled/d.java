/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public abstract class d {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ int c;
    public /* synthetic */ int d;
    public /* synthetic */ int e;
    public /* synthetic */ int f;
    private /* synthetic */ int w;
    private /* synthetic */ int x;
    public /* synthetic */ d g;
    public static /* synthetic */ dh h;
    public static /* synthetic */ dh i;
    public static /* synthetic */ dh j;
    private static /* synthetic */ boolean y;
    private static /* synthetic */ long z;
    public static /* synthetic */ dh k;
    public static /* synthetic */ dh l;
    protected /* synthetic */ long m;
    public static /* synthetic */ boolean n;
    private static /* synthetic */ long A;
    public /* synthetic */ int o;
    public /* synthetic */ long p;
    private /* synthetic */ long B;
    private /* synthetic */ long C;
    static /* synthetic */ long q;
    public static /* synthetic */ boolean r;
    public static /* synthetic */ boolean s;
    private /* synthetic */ byte D;
    private /* synthetic */ ByteArrayInputStream E;
    private /* synthetic */ DataInputStream F;
    public /* synthetic */ long t;
    public static /* synthetic */ long u;
    public static /* synthetic */ int v;
    private static final /* synthetic */ int[] lllIIII;

    static {
        d.lIlIlIl();
        h = new dh();
        i = new dh();
        j = new dh();
        y = lllIIII[0];
        z = 0L;
        k = new dh();
        l = new dh();
        n = lllIIII[0];
        A = 0L;
        q = 0L;
    }

    public d() {
        this.m = 0L;
    }

    public final void a(byte by2) {
        this.D = by2;
    }

    public final void a(byte[] byArray) {
        this.E = new ByteArrayInputStream(byArray);
        this.F = new DataInputStream(this.E);
    }

    protected final void a() {
        try {
            d lllIIlIlllIIlIl;
            switch (lllIIlIlllIIlIl.D) {
                case 15: {
                    if (at.T) {
                        lllIIlIlllIIlIl.F.readByte();
                        lllIIlIlllIIlIl.F.readInt();
                        lllIIlIlllIIlIl.F.readInt();
                        lllIIlIlllIIlIl.F.readShort();
                        lllIIlIlllIIlIl.F.readShort();
                        lllIIlIlllIIlIl.F.readUnsignedByte();
                        at.V = lllIIlIlllIIlIl.F.readUnsignedByte();
                        lllIIlIlllIIlIl.F.readShort();
                        return;
                    }
                    break;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void b() {
        this.c = lllIIII[1];
        this.d = lllIIII[1];
        this.g = null;
        at.j = lllIIII[1];
        at.f = lllIIII[0];
        this.o = v.f().au;
        this.p = System.currentTimeMillis();
        n = lllIIII[0];
        this.a = lllIIII[0];
        r = v.f().c;
        this.t = v.f().h;
        v = v.f().aA.a.a;
        System.out.println(v);
        this.c();
    }

    protected void c() {
    }

    /*
     * WARNING - void declaration
     */
    public static eo d() {
        int n2 = lllIIII[0];
        while (n2 < v.f().ax.size()) {
            void lllIIlIlllIIIIl;
            eo lllIIlIlllIIIII = (eo)v.f().ax.elementAt((int)lllIIlIlllIIIIl);
            if (lllIIlIlllIIIII != null && lllIIlIlllIIIII.a.a == v) {
                return lllIIlIlllIIIII;
            }
            ++lllIIlIlllIIIIl;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final int a(boolean bl2, boolean bl3, boolean bl4) {
        void var4_4;
        void lllIIlIllIlIlll;
        void lllIIlIllIllIII;
        void lllIIlIllIllIIl;
        if (this.b) {
            return lllIIII[1];
        }
        int lllIIlIllIlIllI = lllIIII[0];
        if (lllIIlIllIllIIl != false) {
            lllIIlIllIlIllI = lllIIII[2];
        }
        if (lllIIlIllIllIII != false) {
            lllIIlIllIlIllI |= lllIIII[3];
        }
        if (lllIIlIllIlIlll != false) {
            lllIIlIllIlIllI |= lllIIII[4];
        }
        return (int)var4_4;
    }

    public static void a(cx cx2) {
        if (cx2.x || cx2.g != 0 && cx2.v != lllIIII[5] && cx2.c != cx2.c().f) {
            cx lllIIlIllIlIlII;
            if (!lllIIlIllIlIlII.x && lllIIlIllIlIlII.v == 0) {
                if (lllIIlIllIlIlII.c == lllIIII[6] * lllIIlIllIlIlII.c().f) {
                    lllIIlIllIlIlII.v = (short)lllIIII[2];
                } else {
                    if (lllIIlIllIlIlII.c != lllIIII[7] * lllIIlIllIlIlII.c().f && lllIIlIllIlIlII.r != lllIIII[8]) {
                        return;
                    }
                    lllIIlIllIlIlII.v = (short)lllIIII[3];
                }
            }
            if (!k.contains(lllIIlIllIlIlII)) {
                k.addElement(lllIIlIllIlIlII);
            }
        }
    }

    public static void b(cx cx2) {
        k.removeElement(cx2);
    }

    public static void e() {
        k.removeAllElements();
    }

    public static void a(v v2) {
        if (v2 != v.f()) {
            v lllIIlIllIlIIlI;
            if (l.contains(v2)) {
                if (v2.aO != lllIIII[5] && v2.bd != v.f().q) {
                    l.removeElement(v2);
                    return;
                }
            } else if (lllIIlIllIlIIlI.aO == lllIIII[5] || lllIIlIllIlIIlI.bd == v.f().q) {
                l.addElement(lllIIlIllIlIIlI);
            }
        }
    }

    public static void f() {
        l.removeAllElements();
    }

    public static boolean b(v v2) {
        if (v2.A > 0 && v2.o != lllIIII[9] && v2.o != lllIIII[10] && v2.o != lllIIII[11]) {
            return lllIIII[0];
        }
        return lllIIII[2];
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, int n3, int n4, int n5) {
        void lllIIlIllIIlIII;
        if ((n2 < lllIIII[12] || n2 > lllIIII[13]) && fb.o >= lllIIII[12] && fb.o <= lllIIII[13]) {
            d.g();
        } else if (fb.o != lllIIlIllIIlIII) {
            u = 0L;
            if (!fb.k((int)lllIIlIllIIlIII)) {
                return;
            }
            fn.a(100L);
        } else {
            void lllIIlIllIIIlIl;
            void lllIIlIllIIIllI;
            void lllIIlIllIIIlll;
            d lllIIlIllIIlIIl;
            if (u <= 0L) {
                u = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - u <= 5000L && ek.b == lllIIII[10]) {
                if (at.c instanceof h) {
                    lllIIlIllIIlIIl.n();
                }
                return;
            }
            if (fb.l != lllIIlIllIIIlll) {
                if (lllIIlIllIIIlll == lllIIII[1]) {
                    if (at.d) {
                        int[] lllIIlIllIIIlII = at.e;
                        at.f = lllIIII[0];
                        lllIIlIllIIlIIl.d = lllIIlIllIIIlII[lllIIII[0]];
                        lllIIlIllIIlIIl.a(lllIIlIllIIlIIl.d);
                    } else {
                        lllIIlIllIIlIIl.b((int)lllIIlIllIIIlll);
                    }
                } else if (lllIIlIllIIIlll >= 0) {
                    lllIIlIllIIlIIl.a((int)lllIIlIllIIIlll);
                }
            } else if (lllIIlIllIIIllI > 0 && lllIIlIllIIIlIl > 0) {
                if (lllIIlIllIIlIIl instanceof s || ek.b == lllIIII[2] && lllIIlIllIIlIIl instanceof h) {
                    v.b((int)lllIIlIllIIIllI, (int)lllIIlIllIIIlIl);
                    return;
                }
                lllIIlIllIIlIIl.c(d.a((int)lllIIlIllIIIllI, (int)lllIIlIllIIIlIl));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    protected static void g() {
        void lllIIlIllIIIIIl;
        v v2 = v.f();
        if (!at.e(lllIIII[14]) && !at.e(lllIIII[15])) {
            dm dm2 = bt.j(lllIIII[16]);
            if (dm2 != null && Math.abs(dm2.j - v2.j) <= lllIIII[17] && Math.abs(dm2.k - v2.k) <= lllIIII[17]) {
                void lllIIlIllIIIIII;
                v.b(dm2.j > lllIIII[17] ? dm2.j - lllIIII[17] : lllIIlIllIIIIII.j + lllIIII[17], lllIIlIllIIIIII.k);
            }
            ei.a().e();
        } else {
            v.b(lllIIlIllIIIIIl.j, fb.d);
        }
        long lllIIlIllIIIIII = System.currentTimeMillis();
        while (lllIIlIllIIIIIl.A > 0 && System.currentTimeMillis() - lllIIlIllIIIIII < 5000L) {
            fn.a(100L);
        }
    }

    /*
     * WARNING - void declaration
     */
    protected static void a(boolean bl2) {
        v v2 = v.f();
        if (ek.g && v.f().av > 0) {
            k.removeAllElements();
            n = lllIIII[0];
            fo.a = lllIIII[2];
            ei.a().l();
            fo.a = lllIIII[0];
        } else {
            boolean lllIIlIlIlllIll;
            if (lllIIlIlIlllIll) {
                if (y) {
                    if (System.currentTimeMillis() - z < 1000L) {
                        return;
                    }
                    y = lllIIII[0];
                } else if (v.cs && bt.z.size() > 0) {
                    int lllIIlIlIlllIIl = lllIIII[0];
                    while (lllIIlIlIlllIIl < bt.z.size()) {
                        void lllIIlIlIlllIlI;
                        dt lllIIlIlIlllIII = (dt)bt.z.elementAt(lllIIlIlIlllIIl);
                        if (lllIIlIlIlllIII.a != lllIIlIlIlllIlI.q && lllIIlIlIlllIII.f != null && lllIIlIlIlllIII.f.A > 0 && lllIIlIlIlllIII.f.aw.a == lllIIII[18]) {
                            at.a(ec.a(ec.a("+gohsmlll|~ExU$\\nXM?:V@*{9<\"wu8l", "\u0019__XK((/*?J\u0006Hl\u001di-a\u000b\r\nat\u0012J\u0001\f\u0013GD\b*")));
                            z = System.currentTimeMillis();
                            y = lllIIII[2];
                            return;
                        }
                        ++lllIIlIlIlllIIl;
                    }
                }
            }
            k.removeAllElements();
            n = lllIIII[0];
            fo.a = lllIIII[2];
            ei.a().k();
            fb.j();
            fo.a = lllIIII[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void a(int n2) {
        if (fb.l != n2) {
            void lllIIlIlIllIIIl;
            int lllIIlIlIllIIII;
            int n3 = lllIIII[1];
            n3 = at.g(lllIIII[14]);
            if (n3 == lllIIII[1]) {
                lllIIlIlIllIIII = at.g(lllIIII[15]);
            }
            long lllIIlIlIlIllll = lllIIlIlIllIIII != lllIIII[1] ? 5100L : 10000L;
            if (System.currentTimeMillis() - q <= lllIIlIlIlIllll) {
                fn.a(100L);
                return;
            }
            dm lllIIlIlIlIlllI = bt.j(lllIIII[16]);
            if (lllIIlIlIlIlllI != null && lllIIlIlIlIlllI.o != lllIIII[11]) {
                if (lllIIlIlIllIIII == lllIIII[1] && (Math.abs(lllIIlIlIlIlllI.j - v.f().j) > lllIIII[19] || Math.abs(lllIIlIlIlIlllI.k - v.f().k) > lllIIII[19])) {
                    v.b(lllIIlIlIlIlllI.j, lllIIlIlIlIlllI.k);
                    fn.a(100L);
                }
            } else {
                if (fb.o != lllIIII[20] && fb.o != lllIIII[21] && fb.o != lllIIII[22] && fb.o != lllIIII[23] && fb.o != lllIIII[24] && fb.o != lllIIII[25]) {
                    lllIIlIlIllIIlI.d = fb.l;
                    return;
                }
                if (lllIIlIlIllIIII < 0) {
                    return;
                }
            }
            ei.a().a((int)lllIIlIlIllIIIl, lllIIlIlIllIIII);
            fb.a(5000L);
            q = System.currentTimeMillis();
        }
    }

    protected final void b(int n2) {
        if (!this.a || at.g == null || v.f().ac.equals(at.g)) {
            d lllIIlIlIlIIlII;
            int lllIIlIlIlIIIll;
            int lllIIlIlIlIIIlI = at.g(lllIIII[14]);
            if (lllIIlIlIlIIIlI == lllIIII[1]) {
                lllIIlIlIlIIIlI = at.g(lllIIII[15]);
            }
            long lllIIlIlIlIIIIl = lllIIlIlIlIIIlI != lllIIII[1] ? 5100L : 10000L;
            if (System.currentTimeMillis() - A <= lllIIlIlIlIIIIl) {
                lllIIlIlIlIIlII.d = fb.l;
                return;
            }
            bt lllIIlIlIlIIIII = bt.m();
            dm lllIIlIlIIlllll = bt.j(lllIIII[16]);
            if (lllIIlIlIIlllll != null && lllIIlIlIIlllll.o != lllIIII[11]) {
                if (lllIIlIlIlIIIlI == lllIIII[1] && (Math.abs(lllIIlIlIIlllll.j - v.f().j) > lllIIII[19] || Math.abs(lllIIlIlIIlllll.k - v.f().k) > lllIIII[19])) {
                    v.b(lllIIlIlIIlllll.j, lllIIlIlIIlllll.k);
                    fn.a(100L);
                }
            } else if (fb.o != lllIIII[20] && fb.o != lllIIII[21] && fb.o != lllIIII[22] && fb.o != lllIIII[23] && fb.o != lllIIII[24] && fb.o != lllIIII[25]) {
                lllIIlIlIlIIlII.d = fb.l;
                return;
            }
            if (lllIIlIlIlIIIlI != lllIIII[1]) {
                bt.m().L();
            } else {
                lllIIlIlIlIIIlI = lllIIII[1];
                ei.a().e();
            }
            int lllIIlIlIIllllI = lllIIII[0];
            while (lllIIlIlIIllllI < lllIIII[26]) {
                fn.a(100L);
                if (bt.m().ba != null) break;
                ++lllIIlIlIIllllI;
            }
            if (bt.m().ba == null) {
                lllIIlIlIlIIlII.d = fb.l;
                return;
            }
            lllIIlIlIIllllI = lllIIII[1];
            if (lllIIlIlIlIIIll < 0) {
                lllIIlIlIlIIIll = lllIIlIlIlIIIII.ba.length - lllIIII[2];
            } else if (lllIIlIlIlIIIll >= lllIIlIlIlIIIII.ba.length) {
                lllIIlIlIlIIIll = lllIIII[0];
            }
            int lllIIlIlIIlllIl = lllIIII[1];
            int lllIIlIlIIlllII = (lllIIlIlIlIIIll + lllIIII[2]) % lllIIlIlIlIIIII.ba.length;
            while (lllIIlIlIIlllII != lllIIlIlIlIIIll) {
                if (lllIIlIlIIlllIl == lllIIII[1] || lllIIlIlIlIIIII.ba[lllIIlIlIIlllII] < lllIIlIlIIlllIl) {
                    lllIIlIlIIllllI = lllIIlIlIIlllII;
                    lllIIlIlIIlllIl = lllIIlIlIlIIIII.ba[lllIIlIlIIlllII];
                }
                lllIIlIlIIlllII = (lllIIlIlIIlllII + lllIIII[2]) % lllIIlIlIlIIIII.ba.length;
            }
            ei.a().a(lllIIlIlIIllllI, lllIIlIlIlIIIlI);
            fb.a(5000L);
            lllIIlIlIlIIlII.d = lllIIlIlIIllllI;
            if (lllIIlIlIlIIlII.q()) {
                ei.a().j(ec.a(ec.a("LCrZ5a()", "|sBj\u0004 \u001c\u001e")) + lllIIlIlIIllllI);
            }
            A = System.currentTimeMillis();
        }
    }

    private boolean q() {
        if (this.a && bt.z.size() > 0 && ((dt)bt.z.firstElement()).a == v.f().q) {
            return lllIIII[2];
        }
        return lllIIII[0];
    }

    public boolean h() {
        if (this.a && bt.z.size() > 0 && ((dt)bt.z.firstElement()).a != v.f().q) {
            return lllIIII[2];
        }
        return lllIIII[0];
    }

    public static boolean i() {
        if (bt.z.size() > 0 && ((dt)bt.z.firstElement()).a == v.f().q) {
            return lllIIII[2];
        }
        return lllIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    protected final void c(cx cx2) {
        if (cx2 != null) {
            int lllIIlIlIIIllll;
            int lllIIlIlIIlIIII;
            void lllIIlIlIIlIIIl;
            int n2 = cx2.h;
            int n3 = cx2.i;
            v v2 = v.f();
            if (fb.o == lllIIII[15]) {
                if (cx2.h == lllIIII[27] && cx2.i == lllIIII[28]) {
                    n2 = lllIIII[29];
                    n3 = lllIIII[30];
                } else if (lllIIlIlIIlIIIl.h == lllIIII[31] && lllIIlIlIIlIIIl.i == lllIIII[28]) {
                    lllIIlIlIIlIIII = lllIIII[32];
                    lllIIlIlIIIllll = lllIIII[30];
                } else if (lllIIlIlIIlIIIl.h == lllIIII[33] && lllIIlIlIIlIIIl.i == lllIIII[34]) {
                    lllIIlIlIIlIIII = lllIIII[35];
                    lllIIlIlIIIllll = lllIIII[36];
                }
            } else if (fb.o == lllIIII[14]) {
                if ((lllIIlIlIIlIIIl.h == lllIIII[37] || lllIIlIlIIlIIIl.h == lllIIII[38]) && lllIIlIlIIlIIIl.i == lllIIII[39]) {
                    lllIIlIlIIlIIII = lllIIII[38];
                    lllIIlIlIIIllll = lllIIII[40];
                } else if ((lllIIlIlIIlIIIl.h == lllIIII[41] || lllIIlIlIIlIIIl.h == lllIIII[42]) && lllIIlIlIIlIIIl.i == lllIIII[43]) {
                    lllIIlIlIIlIIII = lllIIII[42];
                    lllIIlIlIIIllll = lllIIII[44];
                } else if ((lllIIlIlIIlIIIl.h == lllIIII[45] || lllIIlIlIIlIIIl.h == lllIIII[37]) && lllIIlIlIIlIIIl.i == lllIIII[46]) {
                    lllIIlIlIIlIIII = lllIIII[45];
                    lllIIlIlIIIllll = lllIIII[34];
                } else if (lllIIlIlIIlIIIl.h == lllIIII[47] && lllIIlIlIIlIIIl.i == lllIIII[48] || lllIIlIlIIlIIIl.h == lllIIII[49] && lllIIlIlIIlIIIl.i == lllIIII[50]) {
                    lllIIlIlIIlIIII = lllIIII[49];
                    lllIIlIlIIIllll = lllIIII[48];
                }
            }
            if (v.c(lllIIlIlIIlIIII, lllIIlIlIIIllll)) {
                void lllIIlIlIIIlllI;
                d lllIIlIlIIlIIlI;
                lllIIlIlIIlIIlI.w = lllIIlIlIIlIIlI.e;
                lllIIlIlIIlIIlI.x = lllIIlIlIIlIIlI.f;
                lllIIlIlIIlIIlI.e = lllIIlIlIIIlllI.j;
                lllIIlIlIIlIIlI.f = lllIIlIlIIIlllI.k;
                lllIIlIlIIIlllI.aS = lllIIlIlIIlIIIl;
                fn.a(10L);
                return;
            }
            lllIIlIlIIIlllI.aS = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, int n4) {
        void var4_4;
        if (n2 >= lllIIII[4]) {
            return lllIIII[0];
        }
        int lllIIlIlIIIIlII = lllIIII[0];
        while (var4_4 < k.size()) {
            cx lllIIlIlIIIIIll = (cx)k.elementAt(lllIIlIlIIIIlII);
            if (lllIIlIlIIIIIll.v != 0 && lllIIlIlIIIIIll.b > 0 && lllIIlIlIIIIIll.g != 0) {
                void lllIIlIlIIIIlIl;
                void lllIIlIlIIIIllI;
                void lllIIlIlIIIIlll;
                int lllIIlIlIIIIIlI = lllIIlIlIIIIIll.v == lllIIII[5] ? lllIIII[0] : (!(lllIIlIlIIIIIll.x && (lllIIlIlIIIIlll & lllIIII[18]) != lllIIII[18] || lllIIlIlIIIIIll.v == lllIIII[2] && (lllIIlIlIIIIlll & lllIIII[3]) == 0 || lllIIlIlIIIIIll.v == lllIIII[3] && (lllIIlIlIIIIlll & lllIIII[4]) == 0) ? lllIIII[0] : lllIIII[2]);
                if (lllIIlIlIIIIIlI != 0 && eb.e((int)(lllIIlIlIIIIllI - lllIIlIlIIIIIll.h)) <= lllIIII[51] && eb.e((int)(lllIIlIlIIIIlIl - lllIIlIlIIIIIll.i)) <= lllIIII[7]) {
                    return lllIIII[2];
                }
            } else {
                k.removeElement(lllIIlIlIIIIIll);
                --lllIIlIlIIIIlII;
            }
            ++lllIIlIlIIIIlII;
        }
        return lllIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(int n2, int n3) {
        if (v.cq) {
            void lllIIlIIllllIll;
            int n4 = lllIIII[0];
            while (lllIIlIIllllIll < l.size()) {
                void lllIIlIIlllllII;
                void lllIIlIIlllllIl;
                v lllIIlIIllllIlI = (v)l.elementAt((int)lllIIlIIllllIll);
                if (!d.b(lllIIlIIllllIlI) && eb.e((int)(lllIIlIIlllllIl - lllIIlIIllllIlI.j)) <= lllIIII[52] && eb.e((int)(lllIIlIIlllllII - lllIIlIIllllIlI.k)) <= lllIIII[52]) {
                    return lllIIII[2];
                }
                ++lllIIlIIllllIll;
            }
            return lllIIII[0];
        }
        return lllIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    protected final void a(int n2, boolean bl2) {
        if (at.j < 0 || at.j >= at.k[fb.o].size()) {
            at.j = lllIIII[0];
        }
        while (true) {
            void lllIIlIIlllIIlI;
            d lllIIlIIlllIIll;
            int lllIIlIIlllIIII = (Integer)at.k[fb.o].elementAt(at.j);
            int lllIIlIIllIllll = (Integer)at.l[fb.o].elementAt(at.j);
            cx lllIIlIIllIlllI = d.a(lllIIlIIlllIIII, lllIIlIIllIllll);
            if (!(lllIIlIIlllIIll.a((int)lllIIlIIlllIIlI, lllIIlIIlllIIII, lllIIlIIllIllll) || lllIIlIIlllIIll.c(lllIIlIIlllIIII, lllIIlIIllIllll) || lllIIlIIllIlllI == null || lllIIlIIlllIIll.a((int)lllIIlIIlllIIlI, lllIIlIIllIlllI.d, lllIIlIIllIlllI.e))) {
                lllIIlIIlllIIll.w = v.f().j;
                lllIIlIIlllIIll.x = v.f().k;
                v.b(lllIIlIIlllIIII, lllIIlIIllIllll);
                v.f().aS = lllIIlIIllIlllI;
                fn.a(100L);
                return;
            }
            fn.a(100L);
            if ((at.j += lllIIII[2]) != at.k[fb.o].size()) continue;
            at.j = lllIIII[0];
            if (!v.cr || !bl2) continue;
            this.r();
        }
    }

    private void r() {
        if (at.d) {
            at.f = (at.f + lllIIII[2]) % at.e.length;
            this.d = at.e[at.f];
            this.a(this.d);
            if (this.q()) {
                ei.a().j(ec.a(ec.a("GZd6&n-.", "wjT\u0006\u0017/\u0019\u0019")) + this.d);
            }
        } else {
            d lllIIlIIllIllII;
            lllIIlIIllIllII.b(fb.l);
        }
    }

    /*
     * WARNING - void declaration
     */
    protected static cx a(int n2, int n3) {
        void var9_9;
        void lllIIlIIlIllIll;
        void lllIIlIIlIlllIl;
        cx cx2 = null;
        v v2 = v.f();
        int n4 = n2 - v2.a() - lllIIII[6];
        int n5 = n2 + v2.a() + lllIIII[6];
        int lllIIlIIlIllIII = n3 - v2.b() - (v2.aw.a != 0 && v2.aw.a != lllIIII[2] && v2.aw.a != lllIIII[5] && v2.aw.a != lllIIII[10] ? lllIIII[0] : lllIIII[53]);
        void lllIIlIIlIlIlll = lllIIlIIlIlllIl + lllIIlIIlIllIll.b();
        if (lllIIlIIlIlIlll > lllIIlIIlIlllIl + lllIIII[54]) {
            lllIIlIIlIlIlll = lllIIlIIlIlllIl + lllIIII[54];
        }
        int lllIIlIIlIlIllI = lllIIII[1];
        int lllIIlIIlIlIlIl = lllIIII[0];
        while (var9_9 < bt.J.size()) {
            void lllIIlIIlIllIIl;
            void lllIIlIIlIllIlI;
            int lllIIlIIlIlIIlI;
            int lllIIlIIlIllllI;
            cx lllIIlIIlIlIlII = (cx)bt.J.elementAt(lllIIlIIlIlIlIl);
            int lllIIlIIlIlIIll = Math.abs(lllIIlIIlIllllI - lllIIlIIlIlIlII.d);
            int n6 = lllIIlIIlIlIIll = lllIIlIIlIlIIll > (lllIIlIIlIlIIlI = Math.abs((int)(lllIIlIIlIlllIl - lllIIlIIlIlIlII.e))) ? lllIIlIIlIlIIll : lllIIlIIlIlIIlI;
            if (lllIIlIIlIllIlI <= lllIIlIIlIlIlII.d && lllIIlIIlIlIlII.d <= lllIIlIIlIllIIl && lllIIlIIlIllIII <= lllIIlIIlIlIlII.e && lllIIlIIlIlIlII.e <= lllIIlIIlIlIlll && lllIIlIIlIlIlII.g != 0 && lllIIlIIlIlIlII.g != lllIIII[2] && (lllIIlIIlIlIllI == lllIIII[1] || lllIIlIIlIlIIll < lllIIlIIlIlIllI)) {
                cx lllIIlIIlIlllII = lllIIlIIlIlIlII;
                lllIIlIIlIlIllI = lllIIlIIlIlIIll;
            }
            ++lllIIlIIlIlIlIl;
        }
        return cx2;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(cx cx2, int n2) {
        void lllIIlIIlIIlllI;
        cx lllIIlIIlIIllll;
        if (cx2.r == lllIIII[55] && cx2.g == lllIIII[56] || lllIIlIIlIIllll.r == lllIIII[57]) {
            return lllIIII[0];
        }
        if (en.d.size() > 0) {
            return en.d.contains(lllIIlIIlIIllll.r);
        }
        if (lllIIlIIlIIlllI >= 0 && lllIIlIIlIIllll.r != lllIIlIIlIIlllI) {
            return lllIIII[0];
        }
        return lllIIII[2];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean d(int n2, int n3) {
        void lllIIlIIlIIlIlI;
        int lllIIlIIlIIlIll;
        if (!(n3 < 0 || n2 == 0 && (n3 & lllIIII[2]) > 0 || lllIIlIIlIIlIll == lllIIII[2] && (lllIIlIIlIIlIlI & lllIIII[3]) > 0 || lllIIlIIlIIlIll == lllIIII[3] && (lllIIlIIlIIlIlI & lllIIII[4]) > 0 || lllIIlIIlIIlIll == lllIIII[5] && (lllIIlIIlIIlIlI & lllIIII[56]) > 0)) {
            return lllIIII[0];
        }
        return lllIIII[2];
    }

    /*
     * WARNING - void declaration
     */
    protected cx a(v v2, int n2, int n3, v v3, boolean bl2) {
        cx lllIIlIIIlIIIII;
        d lllIIlIIIllIIII;
        void lllIIlIIIlIllll;
        int lllIIlIIIlIlllI;
        int lllIIlIIIlIllIl;
        void lllIIlIIIlIllII;
        if (at.i && at.k[fb.o].size() > 0) {
            this.a(n3, bl2);
            return d.a(v2.j, v2.k);
        }
        void lllIIlIIIlIlIlI = lllIIlIIIlIllII;
        void lllIIlIIIlIlIIl = lllIIlIIIlIllIl;
        void lllIIlIIIlIlIII = lllIIlIIIlIlllI;
        lllIIlIIIlIllIl = lllIIlIIIlIllll.k;
        lllIIlIIIlIlllI = lllIIlIIIlIllll.j;
        d lllIIlIIIlIIlll = lllIIlIIIllIIII;
        int lllIIlIIIlIIllI = lllIIII[1];
        int lllIIlIIIlIIlIl = lllIIII[1];
        int lllIIlIIIlIIlII = lllIIII[1];
        cx lllIIlIIIlIIIll = null;
        dh lllIIlIIIlIIIlI = bt.J;
        int lllIIlIIIlIIIIl = lllIIII[0];
        while (true) {
            if (lllIIlIIIlIIIIl >= lllIIlIIIlIIIlI.size()) {
                lllIIlIIIlIIIII = lllIIlIIIlIIIll;
                break;
            }
            cx lllIIlIIIIllllI = (cx)lllIIlIIIlIIIlI.elementAt(lllIIlIIIlIIIIl);
            if (!(lllIIlIIIIllllI == null || lllIIlIIIIllllI.b <= 0 || lllIIlIIIIllllI.g == 0 || lllIIlIIIIllllI.g == lllIIII[2] || !d.a(lllIIlIIIIllllI, (int)lllIIlIIIlIlIII) || !d.d(lllIIlIIIIllllI.v, (int)lllIIlIIIlIlIIl) || fl.a(lllIIlIIIIllllI) || lllIIlIIIlIlIlI != null && lllIIlIIIlIlIlI.q != v.f().q && eb.a(lllIIlIIIIllllI.h, lllIIlIIIIllllI.i, lllIIlIIIlIlIlI.j, lllIIlIIIlIlIlI.k) > lllIIII[58] || lllIIlIIIlIIlll.a((int)lllIIlIIIlIlIIl, lllIIlIIIIllllI.d, lllIIlIIIIllllI.e) || lllIIlIIIlIIlll.c(lllIIlIIIIllllI.d, lllIIlIIIIllllI.e))) {
                if (lllIIlIIIlIIlll.b) {
                    if (lllIIlIIIlIIlll.c != lllIIII[59] && lllIIlIIIlIIlll.c != lllIIII[60] && lllIIlIIIlIIlll.c != lllIIII[61]) {
                        if (lllIIlIIIlIIllI == lllIIII[1] || lllIIlIIIIllllI.v < lllIIlIIIlIIlII || lllIIlIIIIllllI.i < lllIIlIIIlIIllI || lllIIlIIIIllllI.i == lllIIlIIIlIIllI && lllIIlIIIIllllI.h < lllIIlIIIlIIlIl) {
                            lllIIlIIIlIIlII = lllIIlIIIIllllI.v;
                            lllIIlIIIlIIllI = lllIIlIIIIllllI.i;
                            lllIIlIIIlIIlIl = lllIIlIIIIllllI.h;
                            lllIIlIIIlIIIll = lllIIlIIIIllllI;
                        }
                    } else if (lllIIlIIIIllllI.x) {
                        lllIIlIIIlIIIII = lllIIlIIIIllllI;
                        break;
                    }
                } else if (at.o == lllIIII[1] || eb.a(at.m, at.n, lllIIlIIIIllllI.h, lllIIlIIIIllllI.i) <= at.o) {
                    void lllIIlIIIIlllll = lllIIlIIIlIlIIl;
                    void lllIIlIIIIlllIl = lllIIlIIIlIlIII;
                    dh lllIIlIIIIlllII = lllIIlIIIlIIIlI;
                    cx lllIIlIIIIllIll = lllIIlIIIIllllI;
                    int lllIIlIIIIllIlI = lllIIII[0];
                    int lllIIlIIIIllIIl = lllIIII[0];
                    while (lllIIlIIIIllIIl < lllIIlIIIIlllII.size()) {
                        cx lllIIlIIIIllIII = (cx)lllIIlIIIIlllII.elementAt(lllIIlIIIIllIIl);
                        if (lllIIlIIIIllIII != null && lllIIlIIIIllIII.b > 0 && lllIIlIIIIllIII.g != 0 && lllIIlIIIIllIII.g != lllIIII[2] && d.a(lllIIlIIIIllIll, (int)lllIIlIIIIlllIl) && d.d(lllIIlIIIIllIll.v, (int)lllIIlIIIIlllll) && !fl.a(lllIIlIIIIllIII) && eb.e(lllIIlIIIIllIII.d - lllIIlIIIIllIll.d) <= lllIIII[7] && eb.e(lllIIlIIIIllIII.e - lllIIlIIIIllIll.e) <= lllIIII[26]) {
                            ++lllIIlIIIIllIlI;
                        }
                        ++lllIIlIIIIllIIl;
                    }
                    if (lllIIlIIIIllIlI > d.d().i) {
                        lllIIlIIIIllIlI = d.d().i;
                    }
                    lllIIlIIIIllIlI = lllIIlIIIIllIll.v << lllIIII[4] | lllIIlIIIIllIlI & lllIIII[11];
                    int n4 = lllIIlIIIIllIIl = lllIIlIIIlIlIlI != null && lllIIlIIIlIlIlI.q != v.f().q ? eb.a(lllIIlIIIlIlIlI.j, lllIIlIIIlIlIlI.k, lllIIlIIIIllllI.h, lllIIlIIIIllllI.i) : eb.a(lllIIlIIIlIlllI, lllIIlIIIlIllIl, lllIIlIIIIllllI.h, lllIIlIIIIllllI.i);
                    if (lllIIlIIIIllIlI > lllIIlIIIlIIlII || lllIIlIIIIllIlI == lllIIlIIIlIIlII && lllIIlIIIIllIIl < lllIIlIIIlIIllI) {
                        lllIIlIIIlIIlII = lllIIlIIIIllIlI;
                        lllIIlIIIlIIllI = lllIIlIIIIllIIl;
                        lllIIlIIIlIIIll = lllIIlIIIIllllI;
                    }
                }
            }
            ++lllIIlIIIlIIIIl;
        }
        if (lllIIlIIIlIIIII != null) {
            lllIIlIIIllIIII.c(lllIIlIIIlIIIII);
            return lllIIlIIIlIIIII;
        }
        if (System.currentTimeMillis() - lllIIlIIIllIIII.m >= 1000L && !lllIIlIIIllIIII.j()) {
            void lllIIlIIIlIlIll;
            if (lllIIlIIIllIIII.b) {
                int lllIIlIIIIllllI = fb.h(fb.o);
                if (lllIIlIIIIllllI >= 0) {
                    lllIIlIIIllIIII.c = lllIIlIIIIllllI;
                }
                lllIIlIIIllIIII.e = lllIIlIIIllIIII.f = lllIIII[1];
            } else if (lllIIlIIIlIlIll != false && v.cr) {
                lllIIlIIIllIIII.r();
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean c(v v2) {
        int lllIIlIIIIIIlII;
        void lllIIlIIIIIIlIl;
        void lllIIlIIIIIIllI;
        void lllIIlIIIIIIlll;
        void lllIIlIIIIIlIII;
        v lllIIlIIIIIllII;
        void lllIIlIIIIIIIlI;
        int n2;
        int lllIIlIIIIIIIll;
        v v3 = v.f();
        int n3 = v3.j;
        int n4 = v3.k;
        int n5 = n3 - v3.a();
        int n6 = n3 + v3.a();
        int n7 = n4 - v3.b();
        int n8 = n4 + v3.b();
        int n9 = lllIIII[1];
        int n10 = Math.abs(n3 - v2.j);
        int n11 = lllIIlIIIIIIIll = n10 > (n2 = Math.abs(n4 - v2.k)) ? n10 : lllIIlIIIIIIIlI;
        if (lllIIlIIIIIllII != null && lllIIlIIIIIlIII <= lllIIlIIIIIllII.j && lllIIlIIIIIllII.j <= lllIIlIIIIIIlll && lllIIlIIIIIIllI <= lllIIlIIIIIllII.k && lllIIlIIIIIllII.k <= lllIIlIIIIIIlIl && (lllIIlIIIIIIlII == lllIIII[1] || lllIIlIIIIIIIll < lllIIlIIIIIIlII)) {
            lllIIlIIIIIIlII = lllIIlIIIIIIIll;
            return lllIIII[2];
        }
        return lllIIII[0];
    }

    private static boolean a(v v2, v v3) {
        if (Math.abs(v2.j - v3.j) <= lllIIII[26] && Math.abs(v2.k - v3.k) <= lllIIII[26]) {
            return lllIIII[2];
        }
        return lllIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    protected boolean j() {
        void var3_3;
        v v2 = v.f();
        int lllIIIlllllIllI = at.z < 0 ? lllIIII[1] : at.z;
        int lllIIIlllllIlIl = lllIIII[0];
        while (var3_3 < bt.G.size()) {
            d lllIIIllllllIII;
            void lllIIIlllllIlll;
            ce lllIIIlllllIlII = (ce)bt.G.elementAt(lllIIIlllllIlIl);
            if (!lllIIIlllllIlII.k && (lllIIIlllllIlll.aw.a == lllIIII[2] && lllIIIlllllIlII.h.a == lllIIII[62] || lllIIIlllllIlII.h.b == lllIIII[63] || at.a(lllIIIlllllIlII.h) && (at.e() > lllIIII[3] || lllIIIlllllIlII.h.i && at.e(lllIIIlllllIlII.h.a))) && (lllIIIlllllIllI < 0 || eb.a(lllIIIlllllIlll.j, lllIIIlllllIlll.k, lllIIIlllllIlII.c, lllIIIlllllIlII.d) < lllIIIlllllIllI) && !lllIIIllllllIII.c(lllIIIlllllIlII.c, lllIIIlllllIlII.d)) {
                return lllIIII[2];
            }
            ++lllIIIlllllIlIl;
        }
        return lllIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    protected final void b(int n2, int n3) {
        Object lllIIIlllIllIll;
        void lllIIIllllIIlII;
        void lllIIIllllIIIll;
        void lllIIIllllIIIlI;
        d lllIIIllllIIlIl;
        v v2 = v.f();
        v lllIIIllllIIIIl = this.a && bt.z.size() > 0 ? ((dt)bt.z.firstElement()).f : null;
        int lllIIIllllIIIII = lllIIIllllIIlIl.a && at.g != null && (!lllIIIllllIIIlI.ac.equals(at.g) || !fo.G()) ? lllIIII[0] : lllIIII[2];
        Object lllIIIlllIlllll = lllIIIllllIIIlI.aS;
        if (at.i && at.k[fb.o].size() > 0 && at.j < 0) {
            lllIIIllllIIlIl.a((int)lllIIIllllIIIll, lllIIIllllIIIII != 0);
            return;
        }
        int lllIIIlllIllllI = lllIIII[0];
        if (lllIIIllllIIlIl.a((int)lllIIIllllIIIll, lllIIIllllIIIlI.j, lllIIIllllIIIlI.k) || lllIIIllllIIlIl.c(lllIIIllllIIIlI.j, lllIIIllllIIIlI.k) || lllIIIlllIlllll != null && lllIIIllllIIlIl.a((int)lllIIIllllIIIll, ((cx)lllIIIlllIlllll).d, ((cx)lllIIIlllIlllll).e)) {
            at.a(ec.a(ec.a("#GXwZ4", "\u0011r\u00195\u0019\u0002")));
            if (v.cr && lllIIIllllIIIII != 0) {
                lllIIIllllIIlIl.r();
                lllIIIlllIllllI = lllIIII[2];
            } else {
                lllIIIlllIllllI = lllIIII[0];
            }
            if (lllIIIlllIllllI != 0) {
                return;
            }
            lllIIIlllIllllI = lllIIII[2];
            lllIIIlllIlllll = null;
        }
        if (lllIIIlllIlllll == null || ((cx)lllIIIlllIlllll).g == 0 || ((cx)lllIIIlllIlllll).b <= 0 || !d.a((cx)lllIIIlllIlllll, (int)lllIIIllllIIlII) || !d.d(((cx)lllIIIlllIlllll).v, (int)lllIIIllllIIIll) || fl.a((cx)lllIIIlllIlllll) || System.currentTimeMillis() - lllIIIllllIIlIl.m > 5000L) {
            lllIIIlllIlllll = lllIIIllllIIlIl.a((v)lllIIIllllIIIlI, (int)lllIIIllllIIlII, (int)lllIIIllllIIIll, lllIIIllllIIIIl, lllIIIllllIIIII != 0);
        }
        if (lllIIIlllIlllll == null && lllIIIlllIllllI != 0 && lllIIIllllIIlIl.w > 0 && lllIIIllllIIlIl.x > 0) {
            v.b(lllIIIllllIIlIl.w, lllIIIllllIIlIl.x);
        }
        if (v.ct && !lllIIIllllIIlIl.b && (lllIIIlllIlllll == null || ((cx)lllIIIlllIlllll).v == 0 && (lllIIIllllIIIll & lllIIII[18]) != 0)) {
            int lllIIIlllIlllII = (lllIIIllllIIIll & lllIIII[3]) != 0 ? lllIIII[2] : lllIIII[0];
            lllIIIllllIIIII = (lllIIIllllIIIll & lllIIII[4]) != 0 ? lllIIII[2] : lllIIII[0];
            int lllIIIlllIlllIl = lllIIII[0];
            while (lllIIIlllIlllIl < k.size()) {
                lllIIIlllIllIll = (cx)k.elementAt(lllIIIlllIlllIl);
                if (((cx)lllIIIlllIllIll).b > 0 && ((cx)lllIIIlllIllIll).g != 0 && ((cx)lllIIIlllIllIll).g != lllIIII[2] && !lllIIIllllIIlIl.a((int)lllIIIllllIIIll, ((cx)lllIIIlllIllIll).d, ((cx)lllIIIlllIllIll).e) && !lllIIIllllIIlIl.c(((cx)lllIIIlllIllIll).d, ((cx)lllIIIlllIllIll).e) && d.a((cx)lllIIIlllIllIll, (int)lllIIIllllIIlII) && (lllIIIlllIlllII != 0 && ((cx)lllIIIlllIllIll).v == lllIIII[2] || lllIIIllllIIIII != 0 && ((cx)lllIIIlllIllIll).v == lllIIII[3]) && !fl.a((cx)lllIIIlllIllIll)) {
                    lllIIIlllIlllll = lllIIIlllIllIll;
                    lllIIIllllIIlIl.c((cx)lllIIIlllIllIll);
                    break;
                }
                ++lllIIIlllIlllIl;
            }
        }
        if (d.d() != null) {
            Object lllIIIlllIllIlI = d.d();
            if (((eo)lllIIIlllIllIlI).a()) {
                int lllIIIlllIllIII;
                if (at.e(lllIIII[64]) && v.cJ && v.f().b == null) {
                    lllIIIlllIllIII = lllIIII[0];
                    while (lllIIIlllIllIII < lllIIIllllIIIlI.ax.size()) {
                        lllIIIlllIllIll = (eo)lllIIIllllIIIlI.ax.elementAt(lllIIIlllIllIII);
                        if (lllIIIlllIllIll != null && ((eo)lllIIIlllIllIll).a.a >= lllIIII[65] && ((eo)lllIIIlllIllIll).a.a <= lllIIII[66] && System.currentTimeMillis() - ((eo)lllIIIlllIllIll).f >= (long)((eo)lllIIIlllIllIll).e - 300L) {
                            lllIIIlllIllIlI = lllIIIlllIllIll;
                            fn.a(500L);
                        }
                        ++lllIIIlllIllIII;
                    }
                }
                if (v.bm) {
                    if (lllIIIllllIIIlI.aw.a == lllIIII[18]) {
                        lllIIIlllIllIII = lllIIII[0];
                        while (lllIIIlllIllIII < lllIIIllllIIIlI.ax.size()) {
                            lllIIIlllIllIll = (eo)lllIIIllllIIIlI.ax.elementAt(lllIIIlllIllIII);
                            if (lllIIIlllIllIll != null && ((eo)lllIIIlllIllIll).a.d == lllIIII[3] && (((eo)lllIIIlllIllIll).a.a < lllIIII[65] || ((eo)lllIIIlllIllIll).a.a > lllIIII[66]) && System.currentTimeMillis() - ((eo)lllIIIlllIllIll).f >= (long)((eo)lllIIIlllIllIll).e - 300L) {
                                lllIIIlllIllIlI = lllIIIlllIllIll;
                                fn.a(500L);
                            }
                            ++lllIIIlllIllIII;
                        }
                    }
                    if (lllIIIllllIIIlI.aw.a == lllIIII[4]) {
                        lllIIIlllIllIII = lllIIII[0];
                        while (lllIIIlllIllIII < lllIIIllllIIIlI.ax.size()) {
                            lllIIIlllIllIll = (eo)lllIIIllllIIIlI.ax.elementAt(lllIIIlllIllIII);
                            if (lllIIIlllIllIll != null && ((eo)lllIIIlllIllIll).a.d == lllIIII[3] && ((eo)lllIIIlllIllIll).a.d != lllIIII[67] && System.currentTimeMillis() - ((eo)lllIIIlllIllIll).f >= (long)((eo)lllIIIlllIllIll).e - 300L) {
                                lllIIIlllIllIlI = lllIIIlllIllIll;
                                fn.a(500L);
                            }
                            ++lllIIIlllIllIII;
                        }
                    }
                    if (lllIIIllllIIIlI.aw.a == lllIIII[5]) {
                        lllIIIlllIllIII = lllIIII[0];
                        while (lllIIIlllIllIII < lllIIIllllIIIlI.ax.size()) {
                            lllIIIlllIllIll = (eo)lllIIIllllIIIlI.ax.elementAt(lllIIIlllIllIII);
                            if (lllIIIlllIllIll != null && ((eo)lllIIIlllIllIll).a.a == lllIIII[68] && System.currentTimeMillis() - ((eo)lllIIIlllIllIll).f >= (long)((eo)lllIIIlllIllIll).e - 300L) {
                                lllIIIlllIllIlI = lllIIIlllIllIll;
                                fn.a(500L);
                            }
                            ++lllIIIlllIllIII;
                        }
                    }
                    if (lllIIIllllIIIlI.aw.a == lllIIII[3]) {
                        lllIIIlllIllIII = lllIIII[0];
                        while (lllIIIlllIllIII < lllIIIllllIIIlI.ax.size()) {
                            lllIIIlllIllIll = (eo)lllIIIllllIIIlI.ax.elementAt(lllIIIlllIllIII);
                            if (lllIIIlllIllIll != null && (((eo)lllIIIlllIllIll).a.a == lllIIII[16] && !d.d(lllIIII[69]) || ((eo)lllIIIlllIllIll).a.a == lllIIII[70] || ((eo)lllIIIlllIllIll).a.a == lllIIII[11]) && System.currentTimeMillis() - ((eo)lllIIIlllIllIll).f >= (long)((eo)lllIIIlllIllIll).e - 300L) {
                                lllIIIlllIllIlI = lllIIIlllIllIll;
                                fn.a(500L);
                            }
                            ++lllIIIlllIllIII;
                        }
                    }
                    if (lllIIIllllIIIlI.aw.a == lllIIII[2]) {
                        lllIIIlllIllIII = lllIIII[0];
                        while (lllIIIlllIllIII < lllIIIllllIIIlI.ax.size()) {
                            lllIIIlllIllIll = (eo)lllIIIllllIIIlI.ax.elementAt(lllIIIlllIllIII);
                            if (lllIIIlllIllIll != null && (((eo)lllIIIlllIllIll).a.a == lllIIII[71] || ((eo)lllIIIlllIllIll).a.a == lllIIII[18]) && System.currentTimeMillis() - ((eo)lllIIIlllIllIll).f >= (long)((eo)lllIIIlllIllIll).e - 300L) {
                                lllIIIlllIllIlI = lllIIIlllIllIll;
                                fn.a(500L);
                            }
                            ++lllIIIlllIllIII;
                        }
                    }
                    if (lllIIIllllIIIlI.aw.a == lllIIII[10]) {
                        lllIIIlllIllIII = lllIIII[0];
                        while (lllIIIlllIllIII < lllIIIllllIIIlI.ax.size()) {
                            lllIIIlllIllIll = (eo)lllIIIllllIIIlI.ax.elementAt(lllIIIlllIllIII);
                            if (lllIIIlllIllIll != null && (((eo)lllIIIlllIllIll).a.a == lllIIII[72] || ((eo)lllIIIlllIllIll).a.a == lllIIII[73]) && System.currentTimeMillis() - ((eo)lllIIIlllIllIll).f >= (long)((eo)lllIIIlllIllIll).e - 300L) {
                                lllIIIlllIllIlI = lllIIIlllIllIll;
                                fn.a(500L);
                            }
                            ++lllIIIlllIllIII;
                        }
                    }
                }
            }
            if (((eo)lllIIIlllIllIlI).a.d != lllIIII[3]) {
                if (lllIIIlllIlllll == null || ((cx)lllIIIlllIlllll).b <= 0 || lllIIIllllIIlII != lllIIII[1] && ((cx)lllIIIlllIlllll).r != lllIIIllllIIlII || !d.d(((cx)lllIIIlllIlllll).v, (int)lllIIIllllIIIll) || fl.a((cx)lllIIIlllIlllll)) {
                    return;
                }
                if (!(((eo)lllIIIlllIllIlI).a.d != lllIIII[2] && ((eo)lllIIIlllIllIlI).a.d != lllIIII[5] || eb.e(lllIIIllllIIIlI.j - ((cx)lllIIIlllIlllll).h) <= ((eo)lllIIIlllIllIlI).g + lllIIII[54] && eb.e(lllIIIllllIIIlI.k - ((cx)lllIIIlllIlllll).i) <= ((eo)lllIIIlllIllIlI).h + lllIIII[54])) {
                    lllIIIllllIIIlI.aS = null;
                    return;
                }
                h.removeAllElements();
                i.removeAllElements();
                h.addElement(lllIIIlllIlllll);
                int lllIIIlllIllIIl = lllIIII[0];
                while (lllIIIlllIllIIl < bt.J.size() && h.size() + i.size() < ((eo)lllIIIlllIllIlI).i) {
                    cx lllIIIlllIlllII = (cx)bt.J.elementAt(lllIIIlllIllIIl);
                    if (!(lllIIIlllIlllII.g == 0 || lllIIIlllIlllII.g == lllIIII[2] || lllIIIlllIlllII.b <= 0 || lllIIIlllIlllII.equals(lllIIIlllIlllll) || ((cx)lllIIIlllIlllll).h - lllIIII[7] > lllIIIlllIlllII.h || lllIIIlllIlllII.h > ((cx)lllIIIlllIlllll).h + lllIIII[7] || ((cx)lllIIIlllIlllll).i - lllIIII[26] > lllIIIlllIlllII.i || lllIIIlllIlllII.i > ((cx)lllIIIlllIlllll).i + lllIIII[26] || !d.d(lllIIIlllIlllII.v, (int)lllIIIllllIIIll) || fl.a(lllIIIlllIlllII) || lllIIIllllIIlII != lllIIII[1] && lllIIIlllIlllII.r != lllIIIllllIIlII)) {
                        h.addElement(lllIIIlllIlllII);
                    }
                    ++lllIIIlllIllIIl;
                }
                if (h.size() > 0 && System.currentTimeMillis() - ((eo)lllIIIlllIllIlI).f >= (long)((eo)lllIIIlllIllIlI).e) {
                    ei.a().g(((eo)lllIIIlllIllIlI).a.a);
                    ei.a().a(h, new dh(), lllIIII[2]);
                    ((eo)lllIIIlllIllIlI).f = System.currentTimeMillis();
                    ((eo)lllIIIlllIllIlI).l = lllIIII[2];
                    if (!at.q) {
                        lllIIIllllIIIlI.b(bt.t[((eo)lllIIIlllIllIlI).a.a], lllIIII[0]);
                    }
                }
            } else {
                ei.a().g(((eo)lllIIIlllIllIlI).a.a);
                ei.a().r();
                ((eo)lllIIIlllIllIlI).f = System.currentTimeMillis();
                ((eo)lllIIIlllIllIlI).l = lllIIII[2];
                fn.a(500L);
                return;
            }
            lllIIIllllIIlIl.m = System.currentTimeMillis();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void c(int n2) {
        int lllIIIlllIIlIll;
        d lllIIIlllIIlllI;
        void lllIIIlllIIllII;
        int lllIIIlllIIlIlI;
        v v2 = v.f();
        j.removeAllElements();
        int n3 = this.a(v.cn, v.co, v.cp);
        int n4 = lllIIII[0];
        while (lllIIIlllIIlIlI < bt.G.size()) {
            void lllIIIlllIIllIl;
            ce lllIIIlllIIlIIl = (ce)bt.G.elementAt(lllIIIlllIIlIlI);
            if (!lllIIIlllIIlIIl.k && (lllIIIlllIIllII.aw.a == lllIIII[2] && lllIIIlllIIlIIl.h.a == lllIIII[62] || (at.a(lllIIIlllIIlIIl.h) || lllIIIlllIIlIIl.h.a == lllIIIlllIIllIl) && (at.e() > lllIIII[3] || lllIIIlllIIlIIl.h.b == lllIIII[63] || lllIIIlllIIlIIl.h.i && at.e(lllIIIlllIIlIIl.h.a))) && !lllIIIlllIIlllI.a(lllIIIlllIIlIll, lllIIIlllIIlIIl.c, lllIIIlllIIlIIl.d) && !lllIIIlllIIlllI.c(lllIIIlllIIlIIl.c, lllIIIlllIIlIIl.d) && (at.z < 0 || eb.a(lllIIIlllIIllII.j, lllIIIlllIIllII.k, lllIIIlllIIlIIl.c, lllIIIlllIIlIIl.d) < at.z)) {
                j.addElement(lllIIIlllIIlIIl);
            }
            ++lllIIIlllIIlIlI;
        }
        if (j.size() > 0) {
            lllIIIlllIIlIlI = lllIIIlllIIllII.j;
            int lllIIIlllIIlIIl = lllIIIlllIIllII.k;
            cx lllIIIlllIIlIII = lllIIIlllIIllII.aS;
            lllIIIlllIIlIll = lllIIII[0];
            block1: while (lllIIIlllIIlIll < j.size()) {
                ce lllIIIlllIIIlll = (ce)j.elementAt(lllIIIlllIIlIll);
                v.b(lllIIIlllIIIlll.c, fb.b(lllIIIlllIIIlll.c, lllIIIlllIIIlll.d));
                fn.a(100L);
                lllIIIlllIIllII.aX = lllIIIlllIIIlll;
                int lllIIIlllIIIllI = lllIIII[0];
                while (lllIIIlllIIIllI < lllIIII[4] && lllIIIlllIIIlll.i != lllIIII[3] && !lllIIIlllIIIlll.k) {
                    ei.a().q(lllIIIlllIIIlll.g);
                    if (fo.c()) break;
                    if (lllIIIlllIIlllI.c(lllIIIlllIIllII.j, lllIIIlllIIllII.k) || lllIIIlllIIllII.A <= 0) break block1;
                    ++lllIIIlllIIIllI;
                }
                lllIIIlllIIIlll.k = lllIIII[2];
                lllIIIlllIIIlll.l = System.currentTimeMillis();
                ++lllIIIlllIIlIll;
            }
            fn.a(100L);
            v.b(lllIIIlllIIlIlI, lllIIIlllIIlIIl);
            lllIIIlllIIllII.aS = lllIIIlllIIlIII;
        }
    }

    /*
     * WARNING - void declaration
     */
    protected static boolean k() {
        v v2 = v.f();
        if (v2.c) {
            void lllIIIlllIIIIlI;
            void lllIIIlllIIIIIl;
            int n2 = lllIIII[0];
            while (lllIIIlllIIIIIl < lllIIIlllIIIIlI.az.size()) {
                bd lllIIIlllIIIIII = (bd)lllIIIlllIIIIlI.az.elementAt((int)lllIIIlllIIIIIl);
                if (lllIIIlllIIIIII != null && lllIIIlllIIIIII.e.b == lllIIII[6] && lllIIIlllIIIIII.e.a == lllIIII[9]) {
                    return lllIIII[2];
                }
                ++lllIIIlllIIIIIl;
            }
        }
        return lllIIII[0];
    }

    public static void a(es es2) {
        if (h.size() > 0 || i.size() > 0) {
            es lllIIIllIlllIIl;
            bj[] lllIIIllIlllIII = new bj[h.size() + i.size()];
            int lllIIIllIllIlll = lllIIII[0];
            while (lllIIIllIllIlll < h.size()) {
                lllIIIllIlllIII[lllIIIllIllIlll] = new bj();
                lllIIIllIlllIII[lllIIIllIllIlll].d = bt.w[lllIIIllIlllIIl.a - lllIIII[2]];
                lllIIIllIlllIII[lllIIIllIllIlll].b = (cx)h.elementAt(lllIIIllIllIlll);
                ++lllIIIllIllIlll;
            }
            lllIIIllIllIlll = lllIIII[0];
            while (lllIIIllIllIlll < i.size()) {
                lllIIIllIlllIII[lllIIIllIllIlll + d.h.size()] = new bj();
                lllIIIllIlllIII[lllIIIllIllIlll + d.h.size()].d = bt.w[lllIIIllIlllIIl.a - lllIIII[2]];
                lllIIIllIlllIII[lllIIIllIllIlll + d.h.size()].c = (v)i.elementAt(lllIIIllIllIlll);
                ++lllIIIllIllIlll;
            }
            if (lllIIIllIlllIII.length > lllIIII[2]) {
                bb lllIIIllIllIllI = new bb();
                if (lllIIIllIlllIII[d.lllIIII[0]].b != null) {
                    lllIIIllIllIllI = new bb(lllIIIllIlllIII[d.lllIIII[0]].b.d, lllIIIllIlllIII[d.lllIIII[0]].b.e);
                } else if (lllIIIllIlllIII[d.lllIIII[0]].c != null) {
                    lllIIIllIllIllI = new bb(lllIIIllIlllIII[d.lllIIII[0]].c.j, lllIIIllIlllIII[d.lllIIII[0]].c.k);
                }
                dh lllIIIllIllIlIl = new dh();
                int lllIIIllIllIlII = lllIIII[2];
                while (lllIIIllIllIlII < lllIIIllIlllIII.length) {
                    if (lllIIIllIlllIII[lllIIIllIllIlII].b != null) {
                        lllIIIllIllIlIl.addElement(new bb(lllIIIllIlllIII[lllIIIllIllIlII].b.d, lllIIIllIlllIII[lllIIIllIllIlII].b.e));
                    } else if (lllIIIllIlllIII[lllIIIllIllIlII].c != null) {
                        lllIIIllIllIlIl.addElement(new bb(lllIIIllIlllIII[lllIIIllIllIlII].c.j, lllIIIllIlllIII[lllIIIllIllIlII].c.k));
                    }
                    if (lllIIIllIllIlII > lllIIII[10]) break;
                    ++lllIIIllIllIlII;
                }
                cn.a(lllIIIllIllIlIl, lllIIIllIllIllI, lllIIII[2], v.f().w());
            }
            v.f().cb = lllIIIllIlllIII;
        }
    }

    protected final void l() {
        if (fb.o != lllIIII[19]) {
            this.a(lllIIII[19], lllIIII[74], lllIIII[1], lllIIII[1]);
        } else {
            v lllIIIllIlIlllI = v.f();
            if (lllIIIllIlIlllI.b != null) {
                bt.b(lllIIII[75], lllIIII[5], lllIIII[0]);
                fo.a(500L);
            } else {
                int lllIIIllIlIllIl = lllIIII[0];
                while (lllIIIllIlIllIl < lllIIIllIlIlllI.ax.size()) {
                    eo lllIIIllIlIllII = (eo)lllIIIllIlIlllI.ax.elementAt(lllIIIllIlIllIl);
                    if (lllIIIllIlIllII != null && !lllIIIllIlIllII.a() && lllIIIllIlIllII.a.a >= lllIIII[65] && lllIIIllIlIllII.a.a <= lllIIII[66]) {
                        ei.a().g(lllIIIllIlIllII.a.a);
                        ei.a().r();
                        fo.a(500L);
                        break;
                    }
                    ++lllIIIllIlIllIl;
                }
                fn.a(200L);
            }
        }
    }

    private static void a(v v2, long l2) {
        if (v2 != null) {
            v v3 = v.f();
            v.b(v2.j, fb.b(v2.j, v2.k));
            v3.aW = v2;
            fn.a(l2);
        }
    }

    /*
     * WARNING - void declaration
     */
    static boolean m() {
        int n2 = lllIIII[0];
        while (n2 < bt.F.size()) {
            void lllIIIllIlIIIll;
            v lllIIIllIlIIIlI = (v)bt.F.elementAt((int)lllIIIllIlIIIll);
            if (cp.a(lllIIIllIlIIIlI.ac)) {
                return lllIIII[2];
            }
            ++lllIIIllIlIIIll;
        }
        return lllIIII[0];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static v s() {
        Object var0 = null;
        v v2 = v.f();
        int n2 = lllIIII[0];
        while (n2 < bt.F.size()) {
            void lllIIIllIIllIll;
            block21: {
                v lllIIIllIIlllIl;
                v lllIIIllIIllIlI;
                block23: {
                    block22: {
                        void lllIIIllIIlllII;
                        lllIIIllIIllIlI = (v)bt.F.elementAt((int)lllIIIllIIllIll);
                        if (lllIIIllIIllIlI == null || d.b(lllIIIllIIllIlI) || lllIIIllIIllIlI == v.f()) break block21;
                        if (!fb.f()) break block22;
                        if (!lllIIIllIIllIlI.F() && !co.a(lllIIIllIIllIlI.ac) && (lllIIIllIIlllII.aO == lllIIII[4] && lllIIIllIIllIlI.aO == lllIIII[10] || lllIIIllIIlllII.aO == lllIIII[10] && lllIIIllIIllIlI.aO == lllIIII[4])) {
                            if (!d.m()) {
                                v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                                return lllIIIllIIlllIl;
                            }
                            if (cp.a(lllIIIllIIllIlI.ac)) {
                                v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                                return lllIIIllIIlllIl;
                            }
                        }
                        break block21;
                    }
                    if (at.d(lllIIIllIIllIlI.ac) || co.a(lllIIIllIIllIlI.ac)) break block21;
                    if (ek.a != lllIIII[3]) break block23;
                    if (lllIIIllIIllIlI.aO == lllIIII[5] || v.f().q == lllIIIllIIllIlI.bd || lllIIIllIIllIlI.aO == lllIIII[2]) {
                        if (ek.c == lllIIII[2]) {
                            if (ek.b == lllIIII[2] || ek.b == lllIIII[3]) {
                                if (cp.a(lllIIIllIIllIlI.ac) && d.c(lllIIIllIIllIlI)) {
                                    v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                                    return lllIIIllIIlllIl;
                                }
                                break block21;
                            } else if (cp.a(lllIIIllIIllIlI.ac)) {
                                v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                                return lllIIIllIIlllIl;
                            }
                            break block21;
                        } else {
                            if (ek.b != lllIIII[2] && ek.b != lllIIII[3]) {
                                v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                                return lllIIIllIIlllIl;
                            }
                            if (d.c(lllIIIllIIllIlI)) {
                                v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                                return lllIIIllIIlllIl;
                            }
                        }
                    }
                    break block21;
                }
                if (ek.c == lllIIII[2]) {
                    if (ek.b == lllIIII[2] || ek.b == lllIIII[3]) {
                        if (cp.a(lllIIIllIIllIlI.ac) && d.c(lllIIIllIIllIlI)) {
                            v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                            return lllIIIllIIlllIl;
                        }
                    } else if (cp.a(lllIIIllIIllIlI.ac)) {
                        v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                        return lllIIIllIIlllIl;
                    }
                } else {
                    if (ek.b != lllIIII[2] && ek.b != lllIIII[3]) {
                        v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                        return lllIIIllIIlllIl;
                    }
                    if (d.c(lllIIIllIIllIlI)) {
                        v.f().aW = lllIIIllIIlllIl = lllIIIllIIllIlI;
                        return lllIIIllIIlllIl;
                    }
                }
            }
            ++lllIIIllIIllIll;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    protected final void n() {
        d lllIIIlIllIlIlI;
        void lllIIIlIllIlIIl;
        v v2 = v.f();
        if (v2.aN >= ek.e && ek.f && System.currentTimeMillis() - this.B >= 1500L && at.f(lllIIII[76]) != null) {
            this.B = System.currentTimeMillis();
            ei.a().f(at.f((int)d.lllIIII[76]).e);
        }
        v lllIIIlIllIlIII = lllIIIlIllIlIIl.aW;
        i.removeAllElements();
        h.removeAllElements();
        if (lllIIIlIllIlIII == null) {
            if (v.f().aO == lllIIII[5] && ek.a != lllIIII[5]) {
                ei.a().z(lllIIII[0]);
            }
            if ((lllIIIlIllIlIII = d.s()) == null && ek.d == 0) {
                lllIIIlIllIlIlI.b(lllIIII[1], lllIIIlIllIlIlI.a(v.cn, v.co, v.cp));
                return;
            }
            fn.a(lllIIIlIllIlIII);
            if (ek.b == 0) {
                d.a(lllIIIlIllIlIII, 10L);
            }
            return;
        }
        d.o();
        if (!(ek.b != lllIIII[2] && ek.b != lllIIII[3] || d.c(lllIIIlIllIlIII))) {
            lllIIIlIllIlIIl.aW = null;
            return;
        }
        if (co.a(lllIIIlIllIlIII.ac)) {
            lllIIIlIllIlIIl.aW = null;
            return;
        }
        if (ek.c == lllIIII[2] && !cp.a(lllIIIlIllIlIII.ac)) {
            lllIIIlIllIlIIl.aW = null;
            return;
        }
        if (System.currentTimeMillis() - lllIIIlIllIlIlI.C >= at.N && ek.b == 0) {
            d.a(lllIIIlIllIlIII, at.M);
            lllIIIlIllIlIlI.C = System.currentTimeMillis();
        }
        eo lllIIIlIllIIlll = null;
        lllIIIlIllIIlll = d.d();
        if (lllIIIlIllIIlll != null) {
            int lllIIIlIllIIlIl;
            if (lllIIIlIllIIlll.a()) {
                eo lllIIIlIllIIllI;
                if (at.e(lllIIII[64]) && v.cJ && v.f().b == null) {
                    lllIIIlIllIIlIl = lllIIII[0];
                    while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                        lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                        if (lllIIIlIllIIllI != null && lllIIIlIllIIllI.a.a >= lllIIII[65] && lllIIIlIllIIllI.a.a <= lllIIII[66] && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                            lllIIIlIllIIlll = lllIIIlIllIIllI;
                            fn.a(500L);
                        }
                        ++lllIIIlIllIIlIl;
                    }
                }
                if (v.bm) {
                    if (lllIIIlIllIlIIl.aw.a == lllIIII[5]) {
                        lllIIIlIllIIlIl = lllIIII[0];
                        while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                            lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                            if (lllIIIlIllIIllI != null && lllIIIlIllIIllI.a.a == lllIIII[77] && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e) {
                                i.removeAllElements();
                                i.addElement(lllIIIlIllIlIII);
                                lllIIIlIllIIlll = lllIIIlIllIIllI;
                                ei.a().g(lllIIIlIllIIlll.a.a);
                                ei.a().a(new dh(), i, lllIIII[3]);
                                lllIIIlIllIIlll.f = System.currentTimeMillis();
                                lllIIIlIllIIlll.l = lllIIII[2];
                                if (!at.q) {
                                    lllIIIlIllIlIIl.b(bt.t[lllIIIlIllIIlll.a.a], lllIIII[0]);
                                }
                            }
                            ++lllIIIlIllIIlIl;
                        }
                    }
                    if (lllIIIlIllIlIIl.aw.a == lllIIII[18]) {
                        lllIIIlIllIIlIl = lllIIII[0];
                        while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                            lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                            if (lllIIIlIllIIllI != null && lllIIIlIllIIllI.a.d == lllIIII[3] && (lllIIIlIllIIllI.a.a < lllIIII[65] || lllIIIlIllIIllI.a.a > lllIIII[66]) && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                                lllIIIlIllIIlll = lllIIIlIllIIllI;
                                fn.a(500L);
                            }
                            ++lllIIIlIllIIlIl;
                        }
                    }
                    if (lllIIIlIllIlIIl.aw.a == lllIIII[4]) {
                        lllIIIlIllIIlIl = lllIIII[0];
                        while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                            lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                            if (lllIIIlIllIIllI != null && lllIIIlIllIIllI.a.d == lllIIII[3] && lllIIIlIllIIllI.a.d != lllIIII[67] && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                                lllIIIlIllIIlll = lllIIIlIllIIllI;
                                fn.a(500L);
                            }
                            ++lllIIIlIllIIlIl;
                        }
                    }
                    if (lllIIIlIllIlIIl.aw.a == lllIIII[5]) {
                        lllIIIlIllIIlIl = lllIIII[0];
                        while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                            lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                            if (lllIIIlIllIIllI != null && lllIIIlIllIIllI.a.a == lllIIII[68] && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                                lllIIIlIllIIlll = lllIIIlIllIIllI;
                                fn.a(500L);
                            }
                            ++lllIIIlIllIIlIl;
                        }
                    }
                    if (lllIIIlIllIlIIl.aw.a == lllIIII[3]) {
                        lllIIIlIllIIlIl = lllIIII[0];
                        while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                            lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                            if (lllIIIlIllIIllI != null && (lllIIIlIllIIllI.a.a == lllIIII[16] && !d.d(lllIIII[69]) || lllIIIlIllIIllI.a.a == lllIIII[70] || lllIIIlIllIIllI.a.a == lllIIII[11]) && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                                lllIIIlIllIIlll = lllIIIlIllIIllI;
                                fn.a(500L);
                            }
                            ++lllIIIlIllIIlIl;
                        }
                    }
                    if (lllIIIlIllIlIIl.aw.a == lllIIII[2]) {
                        lllIIIlIllIIlIl = lllIIII[0];
                        while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                            lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                            if (lllIIIlIllIIllI != null && (lllIIIlIllIIllI.a.a == lllIIII[71] || lllIIIlIllIIllI.a.a == lllIIII[18]) && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                                lllIIIlIllIIlll = lllIIIlIllIIllI;
                                fn.a(500L);
                            }
                            ++lllIIIlIllIIlIl;
                        }
                    }
                    if (lllIIIlIllIlIIl.aw.a == lllIIII[10]) {
                        lllIIIlIllIIlIl = lllIIII[0];
                        while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                            lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                            if (lllIIIlIllIIllI != null && (lllIIIlIllIIllI.a.a == lllIIII[72] || lllIIIlIllIIllI.a.a == lllIIII[73]) && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                                lllIIIlIllIIlll = lllIIIlIllIIllI;
                                fn.a(500L);
                            }
                            ++lllIIIlIllIIlIl;
                        }
                    }
                } else if (lllIIIlIllIlIIl.aw.a == lllIIII[18]) {
                    lllIIIlIllIIlIl = lllIIII[0];
                    while (lllIIIlIllIIlIl < lllIIIlIllIlIIl.ax.size()) {
                        lllIIIlIllIIllI = (eo)lllIIIlIllIlIIl.ax.elementAt(lllIIIlIllIIlIl);
                        if (lllIIIlIllIIllI != null && (lllIIIlIllIIllI.a.a == lllIIII[78] || lllIIIlIllIIllI.a.a == lllIIII[79]) && System.currentTimeMillis() - lllIIIlIllIIllI.f >= (long)lllIIIlIllIIllI.e - 300L) {
                            lllIIIlIllIIlll = lllIIIlIllIIllI;
                            fn.a(500L);
                        }
                        ++lllIIIlIllIIlIl;
                    }
                }
            }
            lllIIIlIllIIlIl = lllIIIlIllIIlll.g;
            int lllIIIlIllIIlII = lllIIIlIllIIlll.h;
            if (lllIIIlIllIIlll.a.d != lllIIII[3]) {
                if (!fb.f()) {
                    switch (ek.a) {
                        case 0: {
                            if (v.f().bd != lllIIIlIllIlIII.q || v.f().q != lllIIIlIllIlIII.bd) {
                                ei.a().w(lllIIIlIllIlIII.q);
                                break;
                            }
                        }
                        case 1: {
                            if (v.f().aO != lllIIII[5] || lllIIIlIllIlIII.aO != lllIIII[5]) {
                                ei.a().z(lllIIII[5]);
                                break;
                            }
                        }
                        case 3: {
                            if (v.f().aO == lllIIII[5]) break;
                            ei.a().z(lllIIII[5]);
                        }
                    }
                }
                i.removeAllElements();
                i.addElement(lllIIIlIllIlIII);
                if (ek.c == lllIIII[2]) {
                    if (ek.b != lllIIII[2] && ek.b != lllIIII[3]) {
                        int lllIIIlIllIIIll = lllIIII[0];
                        while (lllIIIlIllIIIll < bt.F.size() && i.size() < lllIIIlIllIIlll.i) {
                            v lllIIIlIllIIIlI = (v)bt.F.elementAt(lllIIIlIllIIIll);
                            if (lllIIIlIllIIIlI.A > 0 && lllIIIlIllIIIlI.o != lllIIII[9] && lllIIIlIllIIIlI.o != lllIIII[10] && lllIIIlIllIIIlI.o != lllIIII[11] && !lllIIIlIllIIIlI.equals(lllIIIlIllIlIII) && (lllIIIlIllIIIlI.aO == lllIIII[5] || lllIIIlIllIlIIl.aO == lllIIII[5] || lllIIIlIllIIIlI.aO == lllIIII[2] && lllIIIlIllIlIIl.aO == lllIIII[2] || lllIIIlIllIlIIl.bd >= 0 && lllIIIlIllIlIIl.bd == lllIIIlIllIIIlI.q || lllIIIlIllIlIIl.bc >= 0 && lllIIIlIllIlIIl.bc == lllIIIlIllIIIlI.q) && !at.d(lllIIIlIllIIIlI.ac) && !co.a(lllIIIlIllIIIlI.ac) && cp.a(lllIIIlIllIIIlI.ac)) {
                                i.addElement(lllIIIlIllIIIlI);
                            }
                            ++lllIIIlIllIIIll;
                        }
                    } else {
                        int lllIIIlIllIIIll = lllIIII[0];
                        while (lllIIIlIllIIIll < bt.F.size() && i.size() < lllIIIlIllIIlll.i) {
                            v lllIIIlIllIIIlI = (v)bt.F.elementAt(lllIIIlIllIIIll);
                            if (lllIIIlIllIIIlI.A > 0 && lllIIIlIllIIIlI.o != lllIIII[9] && lllIIIlIllIIIlI.o != lllIIII[10] && lllIIIlIllIIIlI.o != lllIIII[11] && !lllIIIlIllIIIlI.equals(lllIIIlIllIlIIl) && (lllIIIlIllIIIlI.aO == lllIIII[5] || lllIIIlIllIlIIl.aO == lllIIII[5] || lllIIIlIllIIIlI.aO == lllIIII[2] && lllIIIlIllIlIIl.aO == lllIIII[2] || lllIIIlIllIlIIl.bd >= 0 && lllIIIlIllIlIIl.bd == lllIIIlIllIIIlI.q || lllIIIlIllIlIIl.bc >= 0 && lllIIIlIllIlIIl.bc == lllIIIlIllIIIlI.q) && !at.d(lllIIIlIllIIIlI.ac) && !co.a(lllIIIlIllIIIlI.ac) && d.c(lllIIIlIllIIIlI) && cp.a(lllIIIlIllIIIlI.ac)) {
                                i.addElement(lllIIIlIllIIIlI);
                            }
                            ++lllIIIlIllIIIll;
                        }
                    }
                } else if (ek.b != lllIIII[2] && ek.b != lllIIII[3]) {
                    v lllIIIlIllIIIlI;
                    int lllIIIlIllIIIll = lllIIII[0];
                    while (lllIIIlIllIIIll < bt.F.size() && i.size() < lllIIIlIllIIlll.i) {
                        lllIIIlIllIIIlI = (v)bt.F.elementAt(lllIIIlIllIIIll);
                        if (lllIIIlIllIIIlI.A > 0 && lllIIIlIllIIIlI.o != lllIIII[9] && lllIIIlIllIIIlI.o != lllIIII[10] && lllIIIlIllIIIlI.o != lllIIII[11] && !lllIIIlIllIIIlI.equals(lllIIIlIllIlIII) && (lllIIIlIllIIIlI.aO == lllIIII[5] || lllIIIlIllIlIIl.aO == lllIIII[5] || lllIIIlIllIIIlI.aO == lllIIII[2] && lllIIIlIllIlIIl.aO == lllIIII[2] || lllIIIlIllIlIIl.bd >= 0 && lllIIIlIllIlIIl.bd == lllIIIlIllIIIlI.q || lllIIIlIllIlIIl.bc >= 0 && lllIIIlIllIlIIl.bc == lllIIIlIllIIIlI.q) && !at.d(lllIIIlIllIIIlI.ac) && !co.a(lllIIIlIllIIIlI.ac) && lllIIIlIllIlIII.j - lllIIIlIllIIlIl <= lllIIIlIllIIIlI.j && lllIIIlIllIIIlI.j <= lllIIIlIllIlIII.j + lllIIIlIllIIlIl && lllIIIlIllIlIII.k - lllIIIlIllIIlII <= lllIIIlIllIIIlI.k && lllIIIlIllIIIlI.k <= lllIIIlIllIlIII.k + lllIIIlIllIIlII) {
                            i.addElement(lllIIIlIllIIIlI);
                        }
                        ++lllIIIlIllIIIll;
                    }
                    lllIIIlIllIIIll = lllIIII[0];
                    while (lllIIIlIllIIIll < bt.F.size() && i.size() < lllIIIlIllIIlll.i) {
                        lllIIIlIllIIIlI = (v)bt.F.elementAt(lllIIIlIllIIIll);
                        if (lllIIIlIllIIIlI.A > 0 && lllIIIlIllIIIlI.o != lllIIII[9] && lllIIIlIllIIIlI.o != lllIIII[10] && lllIIIlIllIIIlI.o != lllIIII[11] && !lllIIIlIllIIIlI.equals(lllIIIlIllIlIII) && !at.d(lllIIIlIllIIIlI.ac) && !co.a(lllIIIlIllIIIlI.ac) && d.a(lllIIIlIllIIIlI, lllIIIlIllIlIII)) {
                            i.addElement(lllIIIlIllIIIlI);
                        }
                        ++lllIIIlIllIIIll;
                    }
                } else {
                    v lllIIIlIllIIIlI;
                    int lllIIIlIllIIIll = lllIIII[0];
                    while (lllIIIlIllIIIll < bt.F.size() && i.size() < lllIIIlIllIIlll.i) {
                        lllIIIlIllIIIlI = (v)bt.F.elementAt(lllIIIlIllIIIll);
                        if (lllIIIlIllIIIlI.A > 0 && lllIIIlIllIIIlI.o != lllIIII[9] && lllIIIlIllIIIlI.o != lllIIII[10] && lllIIIlIllIIIlI.o != lllIIII[11] && !lllIIIlIllIIIlI.equals(lllIIIlIllIlIIl) && (lllIIIlIllIIIlI.aO == lllIIII[5] || lllIIIlIllIlIIl.aO == lllIIII[5] || lllIIIlIllIIIlI.aO == lllIIII[2] && lllIIIlIllIlIIl.aO == lllIIII[2] || lllIIIlIllIlIIl.bd >= 0 && lllIIIlIllIlIIl.bd == lllIIIlIllIIIlI.q || lllIIIlIllIlIIl.bc >= 0 && lllIIIlIllIlIIl.bc == lllIIIlIllIIIlI.q) && !at.d(lllIIIlIllIIIlI.ac) && !co.a(lllIIIlIllIIIlI.ac) && d.c(lllIIIlIllIIIlI)) {
                            i.addElement(lllIIIlIllIIIlI);
                        }
                        ++lllIIIlIllIIIll;
                    }
                    lllIIIlIllIIIll = lllIIII[0];
                    while (lllIIIlIllIIIll < bt.F.size() && i.size() < lllIIIlIllIIlll.i) {
                        lllIIIlIllIIIlI = (v)bt.F.elementAt(lllIIIlIllIIIll);
                        if (lllIIIlIllIIIlI.A > 0 && lllIIIlIllIIIlI.o != lllIIII[9] && lllIIIlIllIIIlI.o != lllIIII[10] && lllIIIlIllIIIlI.o != lllIIII[11] && !lllIIIlIllIIIlI.equals(lllIIIlIllIlIII) && !at.d(lllIIIlIllIIIlI.ac) && !co.a(lllIIIlIllIIIlI.ac) && d.a(lllIIIlIllIIIlI, lllIIIlIllIlIII)) {
                            i.addElement(lllIIIlIllIIIlI);
                        }
                        ++lllIIIlIllIIIll;
                    }
                }
                if (i.size() > 0 && System.currentTimeMillis() - lllIIIlIllIIlll.f >= (long)lllIIIlIllIIlll.e) {
                    ei.a().g(lllIIIlIllIIlll.a.a);
                    ei.a().a(new dh(), i, lllIIII[3]);
                    lllIIIlIllIIlll.f = System.currentTimeMillis();
                    lllIIIlIllIIlll.l = lllIIII[2];
                    if (!at.q) {
                        lllIIIlIllIlIIl.b(bt.t[lllIIIlIllIIlll.a.a], lllIIII[0]);
                    }
                }
            } else {
                ei.a().g(lllIIIlIllIIlll.a.a);
                ei.a().r();
                lllIIIlIllIIlll.f = System.currentTimeMillis();
                lllIIIlIllIIlll.l = lllIIII[2];
                if (!at.q) {
                    lllIIIlIllIlIIl.b(bt.t[lllIIIlIllIIlll.a.a], lllIIII[0]);
                }
                fn.a(500L);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    protected static boolean a(ci ci2) {
        v v2 = v.f();
        int n2 = lllIIII[0];
        while (n2 < v2.az.size()) {
            ci lllIIIlIlIlllIl;
            void lllIIIlIlIllIll;
            void lllIIIlIlIlllII;
            bd lllIIIlIlIllIlI = (bd)lllIIIlIlIlllII.az.elementAt((int)lllIIIlIlIllIll);
            if (lllIIIlIlIllIlI != null && lllIIIlIlIllIlI.e.c == lllIIIlIlIlllIl.g) {
                return lllIIII[2];
            }
            ++lllIIIlIlIllIll;
        }
        return lllIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    protected static boolean d(int n2) {
        v v2 = v.f();
        int n3 = lllIIII[0];
        while (n3 < v2.az.size()) {
            int lllIIIlIlIIlllI;
            void lllIIIlIlIIlIll;
            void lllIIIlIlIIllIl;
            bd lllIIIlIlIIlIlI = (bd)lllIIIlIlIIllIl.az.elementAt((int)lllIIIlIlIIlIll);
            if (lllIIIlIlIIlIlI != null && lllIIIlIlIIlIlI.e.a == lllIIIlIlIIlllI) {
                return lllIIII[2];
            }
            ++lllIIIlIlIIlIll;
        }
        return lllIIII[0];
    }

    public static void o() {
        if (!at.R) {
            return;
        }
        if (!d.a(cj.a(lllIIII[80])) && at.f(lllIIII[80]) != null) {
            ei.a().f(at.f((int)d.lllIIII[80]).e);
            fn.a(200L);
            d.a(cj.a(lllIIII[80]));
            return;
        }
        if (!d.a(cj.a(lllIIII[81])) && at.f(lllIIII[81]) != null) {
            ei.a().f(at.f((int)d.lllIIII[81]).e);
            fn.a(200L);
            d.a(cj.a(lllIIII[81]));
            return;
        }
        if (!d.a(cj.a(lllIIII[82])) && at.f(lllIIII[82]) != null) {
            ei.a().f(at.f((int)d.lllIIII[82]).e);
            fn.a(200L);
            d.a(cj.a(lllIIII[82]));
            return;
        }
        if (!d.a(cj.a(lllIIII[83])) && at.f(lllIIII[83]) != null) {
            ei.a().f(at.f((int)d.lllIIII[83]).e);
            fn.a(200L);
            d.a(cj.a(lllIIII[83]));
            return;
        }
    }

    protected abstract void p();

    public abstract String toString();

    private static void lIlIlIl() {
        lllIIII = new int[84];
        d.lllIIII[0] = (0x17 ^ 0x10) << (" ".length() << " ".length()) & ~((0x59 ^ 0x5E) << (" ".length() << " ".length()));
        d.lllIIII[1] = -" ".length();
        d.lllIIII[2] = " ".length();
        d.lllIIII[3] = " ".length() << " ".length();
        d.lllIIII[4] = " ".length() << (" ".length() << " ".length());
        d.lllIIII[5] = "   ".length();
        d.lllIIII[6] = (0x50 ^ 0x55) << " ".length();
        d.lllIIII[7] = (0xBB ^ 0xA2) << (" ".length() << " ".length());
        d.lllIIII[8] = 0x77 ^ 0x2E;
        d.lllIIII[9] = (0x13 ^ 0x14) << " ".length();
        d.lllIIII[10] = 0xC3 ^ 0xC6;
        d.lllIIII[11] = 0x61 ^ 0x6E;
        d.lllIIII[12] = 68 + 129 - 191 + 133;
        d.lllIIII[13] = (0x5E ^ 0x7B) << (" ".length() << " ".length());
        d.lllIIII[14] = 0x6C ^ 0x49;
        d.lllIIII[15] = 0x1E ^ 0x3D;
        d.lllIIII[16] = 0x92 ^ 0x9F;
        d.lllIIII[17] = (0x3D ^ 0x24) << (" ".length() << (" ".length() << " ".length()));
        d.lllIIII[18] = "   ".length() << " ".length();
        d.lllIIII[19] = (0x44 ^ 0x4F) << " ".length();
        d.lllIIII[20] = 0x78 ^ 0x1B;
        d.lllIIII[21] = 0xEC ^ 0x8B;
        d.lllIIII[22] = (0xDE ^ 0x9D) << " ".length();
        d.lllIIII[23] = 22 + 115 - 7 + 5;
        d.lllIIII[24] = (0x63 ^ 0x72) << "   ".length();
        d.lllIIII[25] = 67 + 58 - 13 + 25;
        d.lllIIII[26] = (0xF ^ 0x16) << " ".length();
        d.lllIIII[27] = 130 + 68 - 154 + 313 << (" ".length() << " ".length());
        d.lllIIII[28] = (3 ^ 0x22) << (" ".length() << (" ".length() << " ".length()));
        d.lllIIII[29] = 335 + 84 - 241 + 185 << (" ".length() << " ".length());
        d.lllIIII[30] = (0xF8 ^ 0xBD) << "   ".length();
        d.lllIIII[31] = 1 + 128 - -145 + 47 << (" ".length() << " ".length());
        d.lllIIII[32] = 75 + 160 - 176 + 268 << (" ".length() << " ".length());
        d.lllIIII[33] = 442 + 20 - 368 + 365 << (" ".length() << " ".length());
        d.lllIIII[34] = (0xD1 ^ 0x80) << "   ".length();
        d.lllIIII[35] = 393 + 123 - 385 + 322 << (" ".length() << " ".length());
        d.lllIIII[36] = (0x18 ^ 0xD) << (0x4B ^ 0x4E);
        d.lllIIII[37] = 211 + 70 - 80 + 18 << (" ".length() << " ".length());
        d.lllIIII[38] = 72 + 36 - 40 + 157 << (" ".length() << " ".length());
        d.lllIIII[39] = (0x9C ^ 0xAF) << "   ".length();
        d.lllIIII[40] = (0x7C ^ 0x67) << (" ".length() << (" ".length() << " ".length()));
        d.lllIIII[41] = 118 + 26 - 45 + 108 << (" ".length() << " ".length());
        d.lllIIII[42] = 93 + 171 - 124 + 73 << (" ".length() << " ".length());
        d.lllIIII[43] = (0x41 ^ 0x6C) << "   ".length();
        d.lllIIII[44] = "   ".length() << (0x91 ^ 0x96);
        d.lllIIII[45] = 157 + 178 - 151 + 47 << (" ".length() << " ".length());
        d.lllIIII[46] = (0xB0 ^ 0x97) << (" ".length() << (" ".length() << " ".length()));
        d.lllIIII[47] = 64 + 122 - 58 + 55 << (" ".length() << " ".length());
        d.lllIIII[48] = (2 ^ 0x49) << "   ".length();
        d.lllIIII[49] = 124 + 23 - 27 + 69 << (" ".length() << " ".length());
        d.lllIIII[50] = (0xBE ^ 0xB7) << ("   ".length() << " ".length());
        d.lllIIII[51] = (0x22 ^ 0x3B) << "   ".length();
        d.lllIIII[52] = (0x34 ^ 0x7F) << (" ".length() << " ".length());
        d.lllIIII[53] = (0x7D ^ 0x78) << "   ".length();
        d.lllIIII[54] = (0x99 ^ 0x96) << " ".length();
        d.lllIIII[55] = (0x73 ^ 0x16) << " ".length();
        d.lllIIII[56] = " ".length() << "   ".length();
        d.lllIIII[57] = 176 + 129 - 146 + 66;
        d.lllIIII[58] = (0x2E ^ 0x53) << "   ".length();
        d.lllIIII[59] = 124 + 32 - 124 + 125;
        d.lllIIII[60] = (0x53 ^ 0x1C) << " ".length();
        d.lllIIII[61] = 110 + 77 - 142 + 114;
        d.lllIIII[62] = (2 ^ 0x6F) << " ".length();
        d.lllIIII[63] = 0x88 ^ 0x9B;
        d.lllIIII[64] = 128 + 48 - -63 + 306;
        d.lllIIII[65] = 0x3F ^ 0x7C;
        d.lllIIII[66] = (0x98 ^ 0x91) << "   ".length();
        d.lllIIII[67] = 0x4F ^ 0x50;
        d.lllIIII[68] = 0x48 ^ 0x51;
        d.lllIIII[69] = 0x8D ^ 0x84;
        d.lllIIII[70] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        d.lllIIII[71] = 0x41 ^ 0x46;
        d.lllIIII[72] = (0x72 ^ 0x67) << " ".length();
        d.lllIIII[73] = 0xBC ^ 0x97;
        d.lllIIII[74] = -"  ".length();
        d.lllIIII[75] = "   ".length() << (" ".length() << " ".length());
        d.lllIIII[76] = 71 + 2 - -123 + 61;
        d.lllIIII[77] = "   ".length() << "   ".length();
        d.lllIIII[78] = 0x32 ^ 1;
        d.lllIIII[79] = (0xD ^ 0) << (" ".length() << " ".length());
        d.lllIIII[80] = 193 + 271 - 439 + 250;
        d.lllIIII[81] = (0xC ^ 0x49) << (" ".length() << " ".length());
        d.lllIIII[82] = 64 + 236 - 154 + 131;
        d.lllIIII[83] = 12 + 6 - -33 + 88 << " ".length();
    }
}

