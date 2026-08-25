/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bq
extends ar
implements bu,
Runnable {
    public static /* synthetic */ boolean a;
    public static /* synthetic */ Image b;
    public static /* synthetic */ boolean c;
    public static /* synthetic */ boolean d;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ boolean f;
    public static /* synthetic */ boolean g;
    public static /* synthetic */ boolean h;
    public static /* synthetic */ boolean i;
    public static /* synthetic */ boolean j;
    public static /* synthetic */ bq k;
    public static /* synthetic */ dy l;
    static /* synthetic */ boolean m;
    public static /* synthetic */ boolean[] n;
    private static /* synthetic */ boolean[] ag;
    public static /* synthetic */ boolean[] o;
    public static /* synthetic */ boolean p;
    public static /* synthetic */ boolean q;
    public static /* synthetic */ boolean r;
    public static /* synthetic */ int s;
    public static /* synthetic */ int t;
    public static /* synthetic */ int u;
    public static /* synthetic */ int v;
    private static /* synthetic */ du[] ah;
    public static /* synthetic */ int w;
    public static /* synthetic */ int x;
    public static /* synthetic */ boolean y;
    public static /* synthetic */ boolean z;
    private static /* synthetic */ long ai;
    private static /* synthetic */ long aj;
    private static /* synthetic */ boolean ak;
    public static /* synthetic */ int A;
    public static /* synthetic */ int B;
    public static /* synthetic */ int C;
    public static /* synthetic */ int D;
    public static /* synthetic */ fj E;
    public static /* synthetic */ cv F;
    public static /* synthetic */ eg G;
    public static /* synthetic */ cr H;
    public static /* synthetic */ cl I;
    public static /* synthetic */ ay J;
    public static /* synthetic */ de K;
    public static /* synthetic */ cc L;
    public static /* synthetic */ cb M;
    public static /* synthetic */ dp N;
    public static /* synthetic */ dz O;
    private static /* synthetic */ Image[] al;
    private static /* synthetic */ int am;
    private static /* synthetic */ int an;
    public static /* synthetic */ int P;
    private static /* synthetic */ int[] ao;
    private /* synthetic */ fh ap;
    private static /* synthetic */ boolean aq;
    private static /* synthetic */ int ar;
    private static /* synthetic */ int as;
    private static /* synthetic */ int at;
    private static /* synthetic */ int au;
    private static /* synthetic */ int av;
    private static /* synthetic */ int aw;
    private static /* synthetic */ int ax;
    private static /* synthetic */ Image ay;
    private static /* synthetic */ Image az;
    public static /* synthetic */ Image[] Q;
    public static /* synthetic */ int R;
    public static /* synthetic */ int S;
    private static /* synthetic */ int[] aA;
    private static /* synthetic */ int[] aB;
    private static /* synthetic */ int aC;
    private static /* synthetic */ int aD;
    public static /* synthetic */ int T;
    private static /* synthetic */ long aE;
    public static /* synthetic */ int U;
    private static /* synthetic */ int[] aF;
    private /* synthetic */ int[] aG;
    private /* synthetic */ int[] aH;
    private /* synthetic */ int[] aI;
    private static /* synthetic */ int[] aJ;
    private static /* synthetic */ int[] aK;
    private static /* synthetic */ int[] aL;
    private static /* synthetic */ Image[] aM;
    private static /* synthetic */ Image aN;
    private static /* synthetic */ Image[][] aO;
    private /* synthetic */ boolean aP;
    public static /* synthetic */ boolean V;
    public static /* synthetic */ boolean W;
    public static /* synthetic */ Image X;
    public static /* synthetic */ Image Y;
    public static /* synthetic */ Image[] Z;
    private static /* synthetic */ int aQ;
    private static /* synthetic */ int aR;
    private static /* synthetic */ int aS;
    public static /* synthetic */ int aa;
    public static /* synthetic */ long ab;
    public static /* synthetic */ long ac;
    public static /* synthetic */ String ad;
    public static /* synthetic */ String ae;
    public static /* synthetic */ boolean af;
    private static final /* synthetic */ int[] lIlIIIII;

    static {
        bq.llllIlI();
        a = lIlIIIII[0];
        b = null;
        c = lIlIIIII[1];
        d = lIlIIIII[1];
        e = lIlIIIII[0];
        g = lIlIIIII[0];
        n = new boolean[lIlIIIII[2]];
        ag = new boolean[lIlIIIII[2]];
        o = new boolean[lIlIIIII[2]];
        ah = new du[lIlIIIII[3]];
        F = new cv();
        af = lIlIIIII[0];
        new dh();
        an = lIlIIIII[0];
        Q = new Image[lIlIIIII[4]];
        T = lIlIIIII[5];
        aE = 0L;
        new dh();
        V = lIlIIIII[0];
        W = lIlIIIII[0];
        aQ = A;
        aR = lIlIIIII[0];
    }

    public bq() {
        int llIIlllIIllllII;
        bq llIIlllIIllllll;
        this.ap = new fh();
        int n2 = lIlIIIII[1];
        dc.a.setFullScreenMode(lIlIIIII[1]);
        dc.a.a(this);
        A = dc.a.b();
        B = dc.a.a();
        C = A / lIlIIIII[4];
        D = B / lIlIIIII[4];
        ak = System.getProperty(ec.a(ec.a("}UfVTFi7_P`n&x`]AM3{?M].b>vr{yB<wDq'et@gEd", "McVgd\u0005X\u0002o\u0015PW\u0016MQ\u0019q{\u0003C\u000f|m\u0018V\u000bGJKJr\nFqAfU1pQt\""))).indexOf(ec.a(ec.a("6?rO9.", "\u0005\u0006@~\u000b\u001c"))) == 0 ? lIlIIIII[1] : lIlIIIII[0];
        int n3 = ak ? 1 : 0;
        if (dc.a.hasPointerEvents()) {
            g = lIlIIIII[1];
            if (A >= lIlIIIII[6]) {
                h = lIlIIIII[1];
            }
            if (A < lIlIIIII[7]) {
                i = lIlIIIII[1];
            }
            if (A >= lIlIIIII[7]) {
                j = lIlIIIII[1];
            }
        }
        K = new de();
        if (B <= lIlIIIII[8]) {
            dp.f = lIlIIIII[9];
            fj.cu = lIlIIIII[10];
        }
        l = new dy();
        k = llIIlllIIllllll;
        System.gc();
        N = new dp();
        if (!a) {
            if (aO == null) {
                aO = new Image[lIlIIIII[4]][lIlIIIII[11]];
                llIIlllIIllllII = lIlIIIII[0];
                while (llIIlllIIllllII < lIlIIIII[4]) {
                    int llIIlllIIlllIll = lIlIIIII[0];
                    while (llIIlllIIlllIll < lIlIIIII[11]) {
                        bq.aO[llIIlllIIllllII][llIIlllIIlllIll] = bq.e(ec.a(ec.a(":~)^$?X]", "\u000eJ\u0019\u001a\u0010\u000fhn")) + llIIlllIIllllII + llIIlllIIlllIll + ec.a(ec.a("=,.l+}#n", "\t\u0019\u001fT\u001bL\u0013^")));
                        ++llIIlllIIlllIll;
                    }
                    ++llIIlllIIllllII;
                }
            }
            llIIlllIIllllll.aG = new int[lIlIIIII[4]];
            llIIlllIIllllll.aH = new int[lIlIIIII[4]];
            llIIlllIIllllll.aI = new int[lIlIIIII[4]];
            int n4 = lIlIIIII[5];
            llIIlllIIllllll.aI[bq.lIlIIIII[1]] = n4;
            llIIlllIIllllll.aI[bq.lIlIIIII[0]] = n4;
        }
        bq.p();
        bs.c();
        fb.h();
        aN = bq.e(ec.a(ec.a("_X8Jr:(\\k-idvy]%", "kl\t\u000eF\n\u0018m_kX'F?l\u0016")));
        if (g) {
            llIIlllIIllllII = lIlIIIII[0];
            while (llIIlllIIllllII < lIlIIIII[4]) {
                bq.Q[llIIlllIIllllII] = bq.e(ec.a(ec.a("LJ?HTM7j!z<0", "x~\u000fxd\u000f\u0003R\u0011I\f\b")) + llIIlllIIllllII + ec.a(ec.a("/rajU^eQ", "\u001bGPReoUa")));
                ++llIIlllIIllllII;
            }
            R = fh.a(Q[lIlIIIII[0]]);
            S = fh.b(Q[lIlIIIII[0]]);
            fh.a(Q[lIlIIIII[1]]);
            fh.b(Q[lIlIIIII[1]]);
        } else if (dv.c(ec.a(ec.a("!ml8`hnhpf/>rz*YZ({L", "\u0011Z\\\u000fQP\\XAU\u001fzCK\u001b\u001akjK~"))) == lIlIIIII[1]) {
            a = lIlIIIII[1];
        }
        ev.c();
        if (dc.a.hasPointerEvents()) {
            new dh();
        }
        fj.Q();
        I = new cl();
    }

    public static bq a() {
        if (k == null) {
            k = new bq();
        }
        return k;
    }

    /*
     * WARNING - void declaration
     */
    public static void c(int n2) {
        String string = ec.a(ec.a("J@;b1sZ.^jKO&ZKdq ", "{x\u000bU\u00010jmn^zw\u0013\u0018~&Dd")) + bs.c + ec.a(ec.a("\\J", "i{")) + bs.b;
        if (ak) {
            void llIIlllIIlIllII;
            string = !d ? String.valueOf(string) + ec.a(ec.a("Wc(vrh9khe; fsrJ4@wXpvBi#4@K@a", "bS\u0018GBY\bXXQ\neVDC\u007f\u0005qGlEEs/\u0013\u0006p\u000epW")) : String.valueOf(llIIlllIIlIllII) + ec.a(ec.a("Zf<R=^`mvtn&Q7UdXU5TWaP4mfy6d>K{", "oV\f\u0011\r\u001fQ\\FL^`a\u0003eSi\u0017\u0005ag#e\u0001\\ HwU\u007f{I"));
        }
        ej.a().a(string);
    }

    public static void b() {
        A = dc.a.b();
        B = dc.a.a();
        C = A / lIlIIIII[4];
        D = B / lIlIIIII[4];
        H = new cr();
        G = new eg();
        O = new dz();
        L = new cc();
        M = new cb();
    }

    public final void c() {
        new Thread(this).start();
    }

    @Override
    public final void run() {
        try {
            Thread.sleep(10L);
        }
        catch (InterruptedException llIIlllIIIIlIII) {
            // empty catch block
        }
        m = lIlIIIII[1];
        while (m) {
            try {
                bq llIIlllIIIIlIIl;
                if (aa > 0 && (ab = System.currentTimeMillis()) - ac >= 1000L) {
                    if ((aa -= lIlIIIII[1]) == 0) {
                        fn.a();
                    }
                    ac = ab;
                }
                if ((llIIlllIIIIlIII = System.currentTimeMillis()) - ai >= 780L && !y) {
                    ai = llIIlllIIIIlIII;
                    y = lIlIIIII[1];
                } else {
                    y = lIlIIIII[0];
                }
                if (llIIlllIIIIlIII - aj >= 7800L && !z) {
                    aj = llIIlllIIIIlIII;
                    z = lIlIIIII[1];
                } else {
                    z = lIlIIIII[0];
                }
                if (x > 0) {
                    x -= lIlIIIII[1];
                }
                if ((fj.cw += lIlIIIII[1]) >= lIlIIIII[12]) {
                    fj.cw = lIlIIIII[0];
                }
                if ((w += lIlIIIII[1]) > lIlIIIII[13]) {
                    if (System.currentTimeMillis() - aE > 20000L && E == H) {
                        bs.d.notifyDestroyed();
                    }
                    w = lIlIIIII[0];
                }
                if (E != null) {
                    if (J != null) {
                        J.a();
                    } else if (bq.F.a) {
                        F.b();
                        F.a();
                    }
                    if (!f) {
                        E.a();
                    }
                    E.d();
                }
                long llIIlllIIIIIlIl = System.currentTimeMillis();
                if (fc.c && llIIlllIIIIIlIl > fc.b) {
                    fc.c = lIlIIIII[0];
                    try {
                        if (fc.a > 0) {
                            bt.m().a(fc.a, (Object)null);
                        }
                    }
                    catch (Exception llIIlllIIIIIlII) {
                        llIIlllIIIIIlII.printStackTrace();
                    }
                }
                if (by.b > 0 && (by.b -= lIlIIIII[1]) == 0) {
                    by.b();
                }
                if (llIIlllIIIIlIIl.aP) {
                    llIIlllIIIIlIIl.d();
                }
                dc.a.repaint();
                dc.a.serviceRepaints();
                long llIIlllIIIIIlII = System.currentTimeMillis() - llIIlllIIIIlIII;
                try {
                    if (llIIlllIIIIIlII < fp.d) {
                        Thread.sleep(1L * (fp.d - llIIlllIIIIIlII));
                        continue;
                    }
                    Thread.sleep(1L);
                }
                catch (InterruptedException llIIlllIIIIIIll) {}
            }
            catch (Exception llIIlllIIIIlIII) {
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException llIIlllIIIIIlll) {
                    llIIlllIIIIIlll.printStackTrace();
                }
                llIIlllIIIIlIII.printStackTrace();
            }
        }
    }

    public void d() {
        this.aP = lIlIIIII[0];
        G.c();
        try {
            v.g();
            bt.n();
            bt.b();
            bq.k();
            by.b();
            bt.a(lIlIIIII[1]);
            bt.i = lIlIIIII[14];
            bq.d(fb.m);
            bt.z.removeAllElements();
            bt.y.removeAllElements();
            bt.B.removeAllElements();
            bt.E.removeAllElements();
            v.af = null;
        }
        catch (Exception llIIllIlllllIIl) {
            llIIllIlllllIIl.printStackTrace();
        }
    }

    public static void e() {
        if (e && (P -= lIlIIIII[1]) < 0) {
            e = lIlIIIII[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void f() {
        if (!a && ay != null) {
            void llIIllIllllIlIl;
            int n2 = lIlIIIII[0];
            while (llIIllIllllIlIl < aA.length) {
                if (w % (llIIllIllllIlIl + lIlIIIII[4] << lIlIIIII[15]) == 0) {
                    void v0 = llIIllIllllIlIl;
                    aA[v0] = aA[v0] + lIlIIIII[1];
                    if (aA[llIIllIllllIlIl] > bt.b + (fh.a(ay) >> lIlIIIII[1])) {
                        bq.aA[llIIllIllllIlIl] = -(fh.a(ay) >> lIlIIIII[1]);
                    }
                }
                ++llIIllIllllIlIl;
            }
        }
    }

    public static void a(fh fh2) {
        fh llIIllIllIIIlIl;
        if (e) {
            if (w % lIlIIIII[16] > lIlIIIII[17]) {
                fh2.a(lIlIIIII[18]);
            } else {
                llIIllIllIIIlIl.a(lIlIIIII[0]);
            }
            llIIllIllIIIlIl.c(lIlIIIII[0], lIlIIIII[0], bt.b, bt.c);
        } else if (aq && !a && al != null) {
            llIIllIllIIIlIl.a(am);
            llIIllIllIIIlIl.c(lIlIIIII[0], lIlIIIII[0], bt.b, ar);
            if (T >= 0 && T <= lIlIIIII[1]) {
                int llIIllIllIIIlII;
                if (al[lIlIIIII[0]] != null) {
                    llIIllIllIIIlII = -((bt.i >> lIlIIIII[1]) % lIlIIIII[19]);
                    while (llIIllIllIIIlII < bt.b) {
                        llIIllIllIIIlIl.a(al[lIlIIIII[0]], llIIllIllIIIlII, as, lIlIIIII[0]);
                        llIIllIllIIIlII += 24;
                    }
                }
                if (al[lIlIIIII[1]] != null) {
                    llIIllIllIIIlII = -((bt.i >> lIlIIIII[4]) % lIlIIIII[19]);
                    while (llIIllIllIIIlII < bt.b) {
                        llIIllIllIIIlIl.a(al[lIlIIIII[1]], llIIllIllIIIlII, at, lIlIIIII[0]);
                        llIIllIllIIIlII += 24;
                    }
                }
                if (al[lIlIIIII[15]] != null) {
                    llIIllIllIIIlII = -((bt.i >> lIlIIIII[3]) % lIlIIIII[20]);
                    while (llIIllIllIIIlII < bt.b) {
                        llIIllIllIIIlIl.a(al[lIlIIIII[15]], llIIllIllIIIlII, av, lIlIIIII[0]);
                        llIIllIllIIIlII += 64;
                    }
                }
                if (az != null) {
                    llIIllIllIIIlIl.a(az, aC, aD, lIlIIIII[15]);
                }
                if (ay != null) {
                    llIIllIllIIIlII = lIlIIIII[0];
                    while (llIIllIllIIIlII < lIlIIIII[4]) {
                        llIIllIllIIIlIl.a(ay, aA[llIIllIllIIIlII], aB[llIIllIllIIIlII], lIlIIIII[15]);
                        ++llIIllIllIIIlII;
                    }
                }
                if (al[lIlIIIII[4]] != null) {
                    llIIllIllIIIlII = -((bt.i >> lIlIIIII[15]) % lIlIIIII[21]);
                    while (llIIllIllIIIlII < bt.b) {
                        llIIllIllIIIlIl.a(al[lIlIIIII[4]], llIIllIllIIIlII, au, lIlIIIII[0]);
                        llIIllIllIIIlII += 192;
                    }
                    return;
                }
            } else if (T >= lIlIIIII[4] && T <= lIlIIIII[22]) {
                int llIIllIllIIIlII;
                if (az != null) {
                    llIIllIllIIIlIl.a(az, aC, aD, lIlIIIII[15]);
                }
                if (ay != null) {
                    llIIllIllIIIlII = lIlIIIII[0];
                    while (llIIllIllIIIlII < aA.length) {
                        llIIllIllIIIlIl.a(ay, aA[llIIllIllIIIlII], aB[llIIllIllIIIlII], lIlIIIII[15]);
                        ++llIIllIllIIIlII;
                    }
                }
                if (T != lIlIIIII[4]) {
                    if (al[lIlIIIII[15]] != null) {
                        llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[15]]) % ao[lIlIIIII[15]]);
                        while (llIIllIllIIIlII < bt.b) {
                            llIIllIllIIIlIl.a(al[lIlIIIII[15]], llIIllIllIIIlII, av, lIlIIIII[0]);
                            llIIllIllIIIlII += ao[lIlIIIII[15]];
                        }
                    }
                    if (al[lIlIIIII[4]] != null) {
                        llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[4]]) % ao[lIlIIIII[4]]);
                        while (llIIllIllIIIlII < bt.b) {
                            llIIllIllIIIlIl.a(al[lIlIIIII[4]], llIIllIllIIIlII, au, lIlIIIII[0]);
                            llIIllIllIIIlII += ao[lIlIIIII[4]];
                        }
                    }
                    if (al[lIlIIIII[1]] != null) {
                        llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[1]]) % ao[lIlIIIII[1]]);
                        while (llIIllIllIIIlII < bt.b) {
                            llIIllIllIIIlIl.a(al[lIlIIIII[1]], llIIllIllIIIlII, ax, lIlIIIII[0]);
                            llIIllIllIIIlII += ao[lIlIIIII[1]];
                        }
                    }
                    if (al[lIlIIIII[0]] != null) {
                        llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[0]]) % ao[lIlIIIII[0]]);
                        while (llIIllIllIIIlII < bt.b) {
                            llIIllIllIIIlIl.a(al[lIlIIIII[0]], llIIllIllIIIlII, aw, lIlIIIII[0]);
                            llIIllIllIIIlII += ao[lIlIIIII[0]];
                        }
                        return;
                    }
                }
            } else if (T >= lIlIIIII[17] && T <= lIlIIIII[23]) {
                int llIIllIllIIIlII;
                llIIllIllIIIlIl.a(am);
                llIIllIllIIIlIl.c(lIlIIIII[0], lIlIIIII[0], bt.b, bt.c);
                if (T != lIlIIIII[24] && al[lIlIIIII[15]] != null) {
                    llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[15]]) % ao[lIlIIIII[15]]);
                    while (llIIllIllIIIlII < bt.b) {
                        if (T != lIlIIIII[25] && T != lIlIIIII[26]) {
                            llIIllIllIIIlIl.a(al[lIlIIIII[15]], llIIllIllIIIlII, av, lIlIIIII[0]);
                        } else {
                            llIIllIllIIIlIl.a(al[lIlIIIII[15]], llIIllIllIIIlII, bt.c - fh.b(al[lIlIIIII[15]]), lIlIIIII[0]);
                        }
                        llIIllIllIIIlII += ao[lIlIIIII[15]];
                    }
                }
                if (T != lIlIIIII[24] && T != lIlIIIII[25] && T != lIlIIIII[26] && al[lIlIIIII[4]] != null) {
                    if (fb.o == lIlIIIII[27]) {
                        llIIllIllIIIlIl.a(al[lIlIIIII[4]], bt.b, au, lIlIIIII[0]);
                    } else {
                        llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[4]]) % ao[lIlIIIII[4]]);
                        while (llIIllIllIIIlII < bt.b) {
                            if (T == lIlIIIII[2]) {
                                llIIllIllIIIlIl.a(al[lIlIIIII[4]], llIIllIllIIIlII, au + lIlIIIII[26], lIlIIIII[0]);
                            } else {
                                llIIllIllIIIlIl.a(al[lIlIIIII[4]], llIIllIllIIIlII, au, lIlIIIII[0]);
                            }
                            llIIllIllIIIlII += ao[lIlIIIII[4]];
                        }
                    }
                }
                if (T != lIlIIIII[25] && T != lIlIIIII[26] && al[lIlIIIII[1]] != null && fb.o != lIlIIIII[28]) {
                    llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[1]]) % ao[lIlIIIII[1]]);
                    while (llIIllIllIIIlII < bt.b) {
                        llIIllIllIIIlIl.a(al[lIlIIIII[1]], llIIllIllIIIlII, ax, lIlIIIII[0]);
                        llIIllIllIIIlII += ao[lIlIIIII[1]];
                    }
                }
                if (fb.o == lIlIIIII[27] || fb.o == lIlIIIII[29]) {
                    llIIllIllIIIlIl.a(lIlIIIII[30]);
                    llIIllIllIIIlIl.c(lIlIIIII[0], aw + lIlIIIII[31], bt.b, bt.c);
                }
                if (al[lIlIIIII[0]] != null) {
                    llIIllIllIIIlII = -((bt.i >> aF[lIlIIIII[0]]) % ao[lIlIIIII[0]]);
                    while (llIIllIllIIIlII < bt.b) {
                        llIIllIllIIIlIl.a(al[lIlIIIII[0]], llIIllIllIIIlII, aw, lIlIIIII[0]);
                        llIIllIllIIIlII += ao[lIlIIIII[0]];
                    }
                }
                if (ay != null) {
                    if (T != lIlIIIII[32] && T != lIlIIIII[9]) {
                        llIIllIllIIIlII = lIlIIIII[0];
                        while (llIIllIllIIIlII < lIlIIIII[4]) {
                            llIIllIllIIIlIl.a(ay, aA[llIIllIllIIIlII], aB[llIIllIllIIIlII], lIlIIIII[15]);
                            ++llIIllIllIIIlII;
                        }
                        return;
                    }
                    llIIllIllIIIlII = lIlIIIII[0];
                    while (llIIllIllIIIlII < lIlIIIII[4]) {
                        llIIllIllIIIlIl.a(ay, aA[llIIllIllIIIlII], aB[llIIllIllIIIlII] - lIlIIIII[33], lIlIIIII[15]);
                        ++llIIllIllIIIlII;
                    }
                    return;
                }
            }
        } else {
            llIIllIllIIIlIl.a(am);
            llIIllIllIIIlIl.c(lIlIIIII[0], lIlIIIII[0], bt.b, bt.c);
        }
    }

    public static void g() {
        al = null;
        ay = null;
        az = null;
    }

    public static void d(int n2) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected final void a(int n2) {
        void llIIllIlIlllIlI;
        aE = System.currentTimeMillis();
        if (n2 >= lIlIIIII[34] && n2 <= lIlIIIII[35] || llIIllIlIlllIlI >= lIlIIIII[36] && llIIllIlIlllIlI <= lIlIIIII[37] || llIIllIlIlllIlI == lIlIIIII[16] || llIIllIlIlllIlI == lIlIIIII[24] || llIIllIlIlllIlI == lIlIIIII[32] || llIIllIlIlllIlI == lIlIIIII[38]) {
            U = llIIllIlIlllIlI;
        }
        if (J != null) {
            J.a((int)llIIllIlIlllIlI);
            U = lIlIIIII[0];
        } else {
            E.a((int)llIIllIlIlllIlI);
            switch (llIIllIlIlllIlI) {
                case -39: 
                case -2: {
                    if (E instanceof bt) {
                        v.f();
                    }
                    bq.o[bq.lIlIIIII[24]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[24]] = lIlIIIII[1];
                    return;
                }
                case -38: 
                case -1: {
                    if (E instanceof bt) {
                        v.f();
                    }
                    bq.o[bq.lIlIIIII[4]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[4]] = lIlIIIII[1];
                    return;
                }
                case -22: 
                case -7: {
                    bq.o[bq.lIlIIIII[32]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[32]] = lIlIIIII[1];
                    return;
                }
                case -21: 
                case -6: {
                    bq.o[bq.lIlIIIII[26]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[26]] = lIlIIIII[1];
                    return;
                }
                case -5: 
                case 10: {
                    if (!(bt.z() || bq.F.a || aa.a().b)) {
                        if (v.f().aW != null) {
                            if (Math.abs(v.f().aW.j - v.f().j) > lIlIIIII[39] || Math.abs(v.f().aW.k - v.f().k) > lIlIIIII[39]) {
                                v.b(v.f().aW.j, v.f().aW.k);
                            }
                        } else if (v.f().aV != null) {
                            v.b(v.f().aV.j, v.f().aV.k);
                        } else if (v.f().aS != null) {
                            v.b(v.f().aS.h, v.f().aS.i);
                        } else if (v.f().aX != null) {
                            v.b(v.f().aX.a, v.f().aX.b);
                        }
                    }
                    if (E instanceof bt) {
                        v.f();
                    }
                    bq.o[bq.lIlIIIII[11]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[11]] = lIlIIIII[1];
                    return;
                }
                case -4: {
                    if (E instanceof bt) {
                        v.f();
                    }
                    bq.o[bq.lIlIIIII[22]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[22]] = lIlIIIII[1];
                    return;
                }
                case -3: {
                    if (E instanceof bt) {
                        v.f();
                    }
                    bq.o[bq.lIlIIIII[3]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[3]] = lIlIIIII[1];
                    return;
                }
                case 35: {
                    bq.o[bq.lIlIIIII[25]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[25]] = lIlIIIII[1];
                    return;
                }
                case 42: {
                    bq.o[bq.lIlIIIII[16]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[16]] = lIlIIIII[1];
                    return;
                }
                case 48: {
                    bq.o[bq.lIlIIIII[0]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[0]] = lIlIIIII[1];
                    return;
                }
                case 49: {
                    if (E == bt.a && c && !aa.a().b) {
                        bq.o[bq.lIlIIIII[1]] = lIlIIIII[1];
                        bq.n[bq.lIlIIIII[1]] = lIlIIIII[1];
                    }
                    return;
                }
                case 50: {
                    if (E == bt.a && c && !aa.a().b && !bt.aG) {
                        bq.o[bq.lIlIIIII[4]] = lIlIIIII[1];
                        bq.n[bq.lIlIIIII[4]] = lIlIIIII[1];
                    }
                    return;
                }
                case 51: {
                    if (E == bt.a && c && !aa.a().b) {
                        bq.o[bq.lIlIIIII[15]] = lIlIIIII[1];
                        bq.n[bq.lIlIIIII[15]] = lIlIIIII[1];
                    }
                    return;
                }
                case 52: {
                    if (E == bt.a && c && !aa.a().b && !bt.aG) {
                        bq.o[bq.lIlIIIII[3]] = lIlIIIII[1];
                        bq.n[bq.lIlIIIII[3]] = lIlIIIII[1];
                    }
                    return;
                }
                case 53: {
                    if (E == bt.a && c && !aa.a().b && !bt.aG) {
                        bq.o[bq.lIlIIIII[11]] = lIlIIIII[1];
                        bq.n[bq.lIlIIIII[11]] = lIlIIIII[1];
                    }
                }
                default: {
                    return;
                }
                case 54: {
                    if (E == bt.a && c && !aa.a().b && !bt.aG) {
                        bq.o[bq.lIlIIIII[22]] = lIlIIIII[1];
                        bq.n[bq.lIlIIIII[22]] = lIlIIIII[1];
                    }
                    return;
                }
                case 55: {
                    bq.o[bq.lIlIIIII[17]] = lIlIIIII[1];
                    bq.n[bq.lIlIIIII[17]] = lIlIIIII[1];
                    return;
                }
                case 56: {
                    if (E == bt.a && c && !aa.a().b && !bt.aG) {
                        bq.o[bq.lIlIIIII[24]] = lIlIIIII[1];
                        bq.n[bq.lIlIIIII[24]] = lIlIIIII[1];
                    }
                    return;
                }
                case 57: 
            }
            bq.o[bq.lIlIIIII[40]] = lIlIIIII[1];
            bq.n[bq.lIlIIIII[40]] = lIlIIIII[1];
        }
    }

    @Override
    protected final void b(int n2) {
        U = lIlIIIII[0];
        switch (n2) {
            case -39: 
            case -2: {
                bq.o[bq.lIlIIIII[24]] = lIlIIIII[0];
                return;
            }
            case -38: 
            case -1: {
                bq.o[bq.lIlIIIII[4]] = lIlIIIII[0];
                return;
            }
            case -22: 
            case -7: {
                bq.o[bq.lIlIIIII[32]] = lIlIIIII[0];
                bq.ag[bq.lIlIIIII[32]] = lIlIIIII[1];
                return;
            }
            case -21: 
            case -6: {
                bq.o[bq.lIlIIIII[26]] = lIlIIIII[0];
                bq.ag[bq.lIlIIIII[26]] = lIlIIIII[1];
                return;
            }
            case -5: 
            case 10: {
                bq.o[bq.lIlIIIII[11]] = lIlIIIII[0];
                bq.ag[bq.lIlIIIII[11]] = lIlIIIII[1];
                return;
            }
            case -4: {
                bq.o[bq.lIlIIIII[22]] = lIlIIIII[0];
                return;
            }
            case -3: {
                bq.o[bq.lIlIIIII[3]] = lIlIIIII[0];
                return;
            }
            case 35: {
                bq.o[bq.lIlIIIII[25]] = lIlIIIII[0];
                bq.ag[bq.lIlIIIII[25]] = lIlIIIII[1];
                return;
            }
            case 42: {
                bq.o[bq.lIlIIIII[16]] = lIlIIIII[0];
                bq.ag[bq.lIlIIIII[16]] = lIlIIIII[1];
                return;
            }
            case 48: {
                bq.o[bq.lIlIIIII[0]] = lIlIIIII[0];
                bq.ag[bq.lIlIIIII[0]] = lIlIIIII[1];
                return;
            }
            case 49: {
                if (E == bt.a && c && !aa.a().b) {
                    bq.o[bq.lIlIIIII[1]] = lIlIIIII[0];
                    bq.ag[bq.lIlIIIII[1]] = lIlIIIII[1];
                }
                return;
            }
            case 50: {
                if (E == bt.a && c && !aa.a().b) {
                    bq.o[bq.lIlIIIII[4]] = lIlIIIII[0];
                    bq.ag[bq.lIlIIIII[4]] = lIlIIIII[1];
                }
                return;
            }
            case 51: {
                if (E == bt.a && c && !aa.a().b) {
                    bq.o[bq.lIlIIIII[15]] = lIlIIIII[0];
                    bq.ag[bq.lIlIIIII[15]] = lIlIIIII[1];
                }
                return;
            }
            case 52: {
                if (E == bt.a && c && !aa.a().b) {
                    bq.o[bq.lIlIIIII[3]] = lIlIIIII[0];
                    bq.ag[bq.lIlIIIII[3]] = lIlIIIII[1];
                }
                return;
            }
            case 53: {
                if (E == bt.a && c && !aa.a().b) {
                    bq.o[bq.lIlIIIII[11]] = lIlIIIII[0];
                    bq.ag[bq.lIlIIIII[11]] = lIlIIIII[1];
                }
            }
            default: {
                return;
            }
            case 54: {
                if (E == bt.a && c && !aa.a().b) {
                    bq.o[bq.lIlIIIII[22]] = lIlIIIII[0];
                    bq.ag[bq.lIlIIIII[22]] = lIlIIIII[1];
                }
                return;
            }
            case 55: {
                bq.o[bq.lIlIIIII[17]] = lIlIIIII[0];
                bq.ag[bq.lIlIIIII[17]] = lIlIIIII[1];
                return;
            }
            case 56: {
                if (E == bt.a && c && !aa.a().b) {
                    bq.o[bq.lIlIIIII[24]] = lIlIIIII[0];
                    bq.ag[bq.lIlIIIII[24]] = lIlIIIII[1];
                }
                return;
            }
            case 57: 
        }
        bq.o[bq.lIlIIIII[40]] = lIlIIIII[0];
        bq.ag[bq.lIlIIIII[40]] = lIlIIIII[1];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected final void a(int n2, int n3) {
        void llIIllIlIlIIIlI;
        void llIIllIlIlIIIll;
        if (eb.e(n2 - u) >= lIlIIIII[16] || eb.e(n3 - v) >= lIlIIIII[16]) {
            q = lIlIIIII[0];
        }
        s = llIIllIlIlIIIll;
        t = llIIllIlIlIIIlI;
        if ((an += lIlIIIII[1]) > lIlIIIII[15]) {
            an = lIlIIIII[0];
        }
        bq.ah[bq.an] = new du(n2, n3);
    }

    public static boolean h() {
        if (System.currentTimeMillis() - aE >= 800L) {
            return lIlIIIII[1];
        }
        return lIlIIIII[0];
    }

    @Override
    protected final void b(int n2, int n3) {
        p = lIlIIIII[1];
        q = lIlIIIII[1];
        aE = System.currentTimeMillis();
        u = n2;
        v = n3;
        s = n2;
        t = n3;
    }

    @Override
    protected final void c(int n2, int n3) {
        p = lIlIIIII[0];
        r = lIlIIIII[1];
        fj.cv = lIlIIIII[5];
        s = n2;
        t = n3;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(int n2, int n3, int n4, int n5) {
        void llIIllIlIIIllII;
        void llIIllIlIIlIIII;
        void llIIllIlIIIlIlI;
        void llIIllIlIIIlllI;
        int llIIllIlIIlIIlI;
        void llIIllIlIIIlIll;
        int n6 = s + bt.i;
        int n7 = bt.j + t;
        if (!p && !r) {
            return lIlIIIII[0];
        }
        if (llIIllIlIIIlIll >= llIIllIlIIlIIlI && llIIllIlIIIlIll <= llIIllIlIIlIIlI + llIIllIlIIIlllI && llIIllIlIIIlIlI >= llIIllIlIIlIIII && llIIllIlIIIlIlI <= llIIllIlIIlIIII + llIIllIlIIIllII) {
            return lIlIIIII[1];
        }
        return lIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(int n2, int n3, int n4, int n5, ed ed2) {
        void llIIllIIllllIll;
        void llIIllIIlllllIl;
        void llIIllIIllllIII;
        void llIIllIIlllllII;
        int llIIllIIlllllll;
        void llIIllIIllllIIl;
        int n6 = s + ed2.a;
        int n7 = ed2.b + t;
        if (!p && !r) {
            return lIlIIIII[0];
        }
        if (llIIllIIllllIIl >= llIIllIIlllllll && llIIllIIllllIIl <= llIIllIIlllllll + llIIllIIlllllII && llIIllIIllllIII >= llIIllIIlllllIl && llIIllIIllllIII <= llIIllIIlllllIl + llIIllIIllllIll) {
            return lIlIIIII[1];
        }
        return lIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean b(int n2, int n3, int n4, int n5) {
        void llIIllIIllIlIll;
        void llIIllIIllIlllI;
        void llIIllIIllIllIl;
        int llIIllIIllIllll;
        if (!p && !r) {
            return lIlIIIII[0];
        }
        if (s >= llIIllIIllIllll && s <= llIIllIIllIllll + llIIllIIllIllIl && t >= llIIllIIllIlllI && t <= llIIllIIllIlllI + llIIllIIllIlIll) {
            return lIlIIIII[1];
        }
        return lIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public static void i() {
        int n2 = lIlIIIII[0];
        while (n2 < lIlIIIII[2]) {
            void llIIllIIllIlIII;
            bq.n[llIIllIIllIlIII] = lIlIIIII[0];
            ++llIIllIIllIlIII;
        }
        r = lIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public static void j() {
        int n2 = lIlIIIII[0];
        while (n2 < lIlIIIII[2]) {
            void llIIllIIllIIllI;
            bq.o[llIIllIIllIIllI] = lIlIIIII[0];
            ++llIIllIIllIIllI;
        }
    }

    @Override
    protected final void a(Graphics graphics) {
        this.ap.a = graphics;
        try {
            bq llIIllIIllIIIII;
            if (E != null && !f) {
                E.a(llIIllIIllIIIII.ap);
                llIIllIIllIIIII.ap.d(lIlIIIII[0], lIlIIIII[0], A, B);
            }
            llIIllIIllIIIII.ap.a(-llIIllIIllIIIII.ap.a(), -llIIllIIllIIIII.ap.b());
            llIIllIIllIIIII.ap.d(lIlIIIII[0], lIlIIIII[0], A, B);
            by.a(llIIllIIllIIIII.ap);
            if (J != null) {
                J.a(llIIllIIllIIIII.ap);
            } else if (bq.F.a) {
                F.a(llIIllIIllIIIII.ap);
            }
            bt.b(llIIllIIllIIIII.ap);
            if (aa > 0) {
                bq.d(ec.a(ec.a("QYAP'oc:Gg-@JHI'//e#4dW]j_D3T[&.sVr,5s5:bCg X~FW", "\u0010\u001f\u0007hf-&\u000ew!\u001d\u0002~yxf\u001en]\u0013pP\u0014h[\u001dp\u000bdh\u001e\u00187\u00141h\u0005K\u0000\u000eRrW\u0010i<ro")) + aa + ec.a(ec.a("^5", "o\r")));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void k() {
        if (L != null) {
            bq.L.d.b(lIlIIIII[41]);
        }
        if (M != null) {
            bq.M.d.b(lIlIIIII[41]);
            bq.M.e.b(lIlIIIII[41]);
        }
        J = null;
    }

    public static void a(String string) {
        K.a(string, null, new au(fa.ax, k, lIlIIIII[42], null), null);
        J = K;
    }

    public static void b(String string) {
        K.a(string, null, new au(fa.ax, k, lIlIIIII[43], null), null);
        J = K;
    }

    public static void c(String string) {
        K.a(string, null, new au(fa.bd, k, lIlIIIII[42], null), null);
        J = K;
        bq.K.d = lIlIIIII[1];
    }

    public static void l() {
        bq.c(fa.y);
    }

    public static void m() {
        bq.K.e = lIlIIIII[41];
        K.a(fa.y, null, null, null);
        J = K;
        bq.K.d = lIlIIIII[1];
    }

    public static void d(String string) {
        bq.K.e = lIlIIIII[41];
        K.a(string, null, null, null);
        J = K;
        bq.K.d = lIlIIIII[1];
    }

    public final void a(String string, String string2, String string3, String string4) {
        K.a(string4, new au(string, this, lIlIIIII[44], string3), null, new au(string2, this, lIlIIIII[42], null));
        J = K;
    }

    public final void a(String string, String string2, short s2, String string3, String string4) {
        dh dh2 = new dh();
        dh2.addElement(new Short(s2));
        dh2.addElement(string3);
        K.a(string4, new au(string, this, lIlIIIII[45], dh2), null, new au(string2, this, lIlIIIII[42], null));
        J = K;
    }

    public static void a(String string, int n2, Object object) {
        K.a(string, null, new au(fa.ax, k, n2, null, A / lIlIIIII[4] - lIlIIIII[46], B - lIlIIIII[39]), null);
        J = K;
    }

    public static void a(String string, int n2, Object object, int n3, Object object2) {
        new StringBuffer(ec.a(ec.a("I,rqnM<gK}hW!/c%\"CyZ'Ev5.xEo", "x\u001eB5_\u000e\f_\u007fLXe\u0011jV\u0011\u0013uIb\u0017wF\u0002\u001e;qW"))).append(n3).toString();
        K.a(string, new au(fa.ah, k, n2, object), new au("", k, n2, object), new au(fa.au, k, n3, object2));
        J = K;
    }

    public static void a(String string, au au2, au au3) {
        K.a(string, au2, null, au3);
        J = K;
    }

    public static void a(String string, au au2) {
        K.a(string, null, au2, null);
        J = K;
    }

    /*
     * WARNING - void declaration
     */
    public static Image e(String string) {
        void var1_1;
        string = ec.a(ec.a("H@Od", "|t~T")) + fh.b + string;
        Image llIIllIIlIllIIl = null;
        try {
            String llIIllIIlIllIlI;
            llIIllIIlIllIIl = Image.createImage((String)llIIllIIlIllIlI);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return var1_1;
    }

    public final boolean a(int n2, int n3, int n4) {
        bq llIIllIIlIlIIll;
        int llIIllIIlIlIIlI;
        if (a) {
            return lIlIIIII[0];
        }
        int n5 = llIIllIIlIlIIlI = llIIllIIlIlIIlI == lIlIIIII[1] ? lIlIIIII[0] : lIlIIIII[1];
        if (llIIllIIlIlIIll.aI[llIIllIIlIlIIlI] != lIlIIIII[5]) {
            return lIlIIIII[0];
        }
        this.aI[n2] = lIlIIIII[0];
        this.aG[n2] = n3;
        this.aH[n2] = n4;
        return lIlIIIII[1];
    }

    /*
     * WARNING - void declaration
     */
    private static void p() {
        if (!a) {
            void llIIllIIlIIlllI;
            aM = new Image[lIlIIIII[15]];
            int n2 = lIlIIIII[0];
            while (llIIllIIlIIlllI < lIlIIIII[15]) {
                bq.aM[llIIllIIlIIlllI] = bq.e(ec.a(ec.a("K]b&[IW`", "\u007fiRboyfP")) + (int)llIIllIIlIIlllI + ec.a(ec.a("p{X;REUJ", "DNi\u0003btez")));
                ++llIIllIIlIIlllI;
            }
            aJ = new int[lIlIIIII[4]];
            aK = new int[lIlIIIII[4]];
            int[] nArray = new int[lIlIIIII[4]];
            aL = nArray;
            int n3 = lIlIIIII[5];
            bq.aL[bq.lIlIIIII[1]] = n3;
            nArray[bq.lIlIIIII[0]] = n3;
        }
    }

    public static boolean d(int n2, int n3) {
        int llIIllIIlIIlIII;
        if (a) {
            return lIlIIIII[0];
        }
        int n4 = llIIllIIlIIlIII = aL[lIlIIIII[0]] == lIlIIIII[5] ? lIlIIIII[0] : lIlIIIII[1];
        if (aL[llIIllIIlIIlIII] != lIlIIIII[5]) {
            return lIlIIIII[0];
        }
        bq.aL[var2_2] = lIlIIIII[0];
        bq.aJ[var2_2] = n2;
        bq.aK[var2_2] = n3;
        return lIlIIIII[1];
    }

    /*
     * WARNING - void declaration
     */
    public final void n() {
        if (!a) {
            void llIIllIIlIIIIll;
            int n2 = lIlIIIII[0];
            while (llIIllIIlIIIIll < lIlIIIII[4]) {
                bq llIIllIIlIIIlII;
                if (llIIllIIlIIIlII.aI[llIIllIIlIIIIll] != lIlIIIII[5]) {
                    void v0 = llIIllIIlIIIIll;
                    int n3 = llIIllIIlIIIlII.aI[v0];
                    llIIllIIlIIIlII.aI[v0] = n3 + lIlIIIII[1];
                    int llIIllIIlIIIIlI = n3;
                    if (llIIllIIlIIIlII.aI[llIIllIIlIIIIll] >= lIlIIIII[11]) {
                        llIIllIIlIIIlII.aI[llIIllIIlIIIIll] = lIlIIIII[5];
                    }
                    if (llIIllIIlIIIIll == false) {
                        void v2 = llIIllIIlIIIIll;
                        int n4 = llIIllIIlIIIlII.aG[v2];
                        llIIllIIlIIIlII.aG[v2] = n4 - lIlIIIII[1];
                        llIIllIIlIIIIlI = n4;
                    } else {
                        void v4 = llIIllIIlIIIIll;
                        int n5 = llIIllIIlIIIlII.aG[v4];
                        llIIllIIlIIIlII.aG[v4] = n5 + lIlIIIII[1];
                        llIIllIIlIIIIlI = n5;
                    }
                    void v6 = llIIllIIlIIIIll;
                    int n6 = llIIllIIlIIIlII.aH[v6];
                    llIIllIIlIIIlII.aH[v6] = n6 - lIlIIIII[1];
                    llIIllIIlIIIIlI = n6;
                }
                ++llIIllIIlIIIIll;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean e(int n2, int n3) {
        void llIIllIIIlllllI;
        int llIIllIIIllllll;
        if (n2 < bt.i) {
            return lIlIIIII[0];
        }
        if (llIIllIIIllllll > bt.i + bt.b) {
            return lIlIIIII[0];
        }
        if (llIIllIIIlllllI < bt.j) {
            return lIlIIIII[0];
        }
        if (llIIllIIIlllllI <= bt.j + bt.c + lIlIIIII[47]) {
            return lIlIIIII[1];
        }
        return lIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public final void b(fh fh2) {
        if (!a) {
            void llIIllIIIlllIII;
            int n2 = lIlIIIII[0];
            while (llIIllIIIlllIII < lIlIIIII[4]) {
                bq llIIllIIIlllIlI;
                if (llIIllIIIlllIlI.aI[llIIllIIIlllIII] != lIlIIIII[5] && bq.e(llIIllIIIlllIlI.aG[llIIllIIIlllIII], llIIllIIIlllIlI.aH[llIIllIIIlllIII])) {
                    void llIIllIIIlllIIl;
                    llIIllIIIlllIIl.a(aO[llIIllIIIlllIII][llIIllIIIlllIlI.aI[llIIllIIIlllIII]], llIIllIIIlllIlI.aG[llIIllIIIlllIII], llIIllIIIlllIlI.aH[llIIllIIIlllIII], lIlIIIII[15]);
                }
                ++llIIllIIIlllIII;
            }
        }
    }

    public static void a(int n2, int n3, fh fh2, boolean bl2) {
        int n4 = w % lIlIIIII[15];
        fh2.a(aN, lIlIIIII[0], n4 << lIlIIIII[3], lIlIIIII[23], lIlIIIII[23], lIlIIIII[0], n2, n3, lIlIIIII[15]);
    }

    public final void o() {
        f = lIlIIIII[0];
        this.aP = lIlIIIII[1];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean c(int n2, int n3, int n4, int n5) {
        void llIIllIIIllIIII;
        void llIIllIIIllIIlI;
        void llIIllIIIllIIIl;
        int llIIllIIIllIIll;
        if (!p && !r) {
            return lIlIIIII[0];
        }
        if (s >= llIIllIIIllIIll && s <= llIIllIIIllIIll + llIIllIIIllIIIl && t >= llIIllIIIllIIlI && t <= llIIllIIIllIIlI + llIIllIIIllIIII) {
            return lIlIIIII[1];
        }
        return lIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(int n2, Object object) {
        switch (n2) {
            case 1608: {
                ei.a().a(bq.M.d.d(), bq.M.e.d(), lIlIIIII[0]);
                bq.k();
                return;
            }
            case 1700: {
                ei.a().a(lIlIIIII[14], bq.L.d.d(), bt.cm);
                bq.k();
                break;
            }
            case 8880: {
                bq.k();
                I.c();
                return;
            }
            case 8881: {
                void llIIllIIIlIIIII;
                String llIIllIIIIlllll = (String)llIIllIIIlIIIII;
                dl.b(llIIllIIIIlllll);
                J = null;
                return;
            }
            case 8882: {
                J = null;
                return;
            }
            case 8883: {
                void llIIllIIIlIIIII;
                short llIIllIIIIllIll = (Short)((dh)llIIllIIIlIIIII).elementAt(lIlIIIII[0]);
                dl.a((String)((dh)llIIllIIIlIIIII).elementAt(lIlIIIII[0]), llIIllIIIIllIll);
                J = null;
                return;
            }
            case 8884: {
                bq.k();
                G.c();
                return;
            }
            case 8885: {
                bs.d.notifyDestroyed();
                return;
            }
            case 8886: {
                bq.a(fa.iB, new au(fa.iG, k, lIlIIIII[48], null), new au(fa.au, k, lIlIIIII[42], null));
                return;
            }
            case 8887: {
                void llIIllIIIlIIIII;
                bq.k();
                int llIIllIIIIllllI = (Integer)llIIllIIIlIIIII;
                ei.a().t(llIIllIIIIllllI);
                return;
            }
            case 8888: {
                void llIIllIIIlIIIII;
                int llIIllIIIIllllI = (Integer)llIIllIIIlIIIII;
                ei.a().u(llIIllIIIIllllI);
                bq.k();
                return;
            }
            case 8889: {
                void llIIllIIIlIIIII;
                String llIIllIIIIlllll = (String)llIIllIIIlIIIII;
                bq.k();
                ei.a().i(llIIllIIIIlllll);
                return;
            }
            case 8890: {
                void llIIllIIIlIIIII;
                bq.k();
                ei.a().o((Integer)llIIllIIIlIIIII);
                return;
            }
            case 8891: {
                ei.a().o(lIlIIIII[0]);
                J = null;
                return;
            }
            case 16081: {
                ei.a().a(bq.M.d.d(), bq.M.e.d(), lIlIIIII[1]);
                bq.k();
                return;
            }
            case 88810: {
                void llIIllIIIlIIIII;
                int llIIllIIIIllllI = (Integer)llIIllIIIlIIIII;
                bq.k();
                ei.a().l(llIIllIIIIllllI);
                return;
            }
            case 88811: {
                bq.k();
                ei.a().h();
                return;
            }
            case 88812: {
                void llIIllIIIlIIIII;
                v llIIllIIIIlllIl = (v)llIIllIIIlIIIII;
                bq.k();
                ei.a().p(llIIllIIIIlllIl.q);
                return;
            }
            case 88813: {
                void llIIllIIIlIIIII;
                bq.k();
                cd[] llIIllIIIIllIlI = (cd[])llIIllIIIlIIIII;
                ei.a().a(llIIllIIIIllIlI);
                return;
            }
            case 88814: {
                void llIIllIIIlIIIII;
                cd[] llIIllIIIIllIlI = (cd[])llIIllIIIlIIIII;
                bq.k();
                ei.a().b(llIIllIIIIllIlI);
                return;
            }
            case 88815: {
                bt.m();
                bt.G();
                return;
            }
            case 88816: {
                ei.a().b(bq.M.d.d(), bq.M.e.d());
                bq.k();
                return;
            }
            case 88817: {
                if (v.f().aV != null) {
                    ei.a().a(lIlIIIII[0], v.f().aV.cT.a, bq.F.b, lIlIIIII[0]);
                    return;
                }
                ei.a().a(lIlIIIII[0], lIlIIIII[0], bq.F.b, lIlIIIII[0]);
                return;
            }
            case 88818: {
                void llIIllIIIlIIIII;
                short llIIllIIIIllIll = (Short)llIIllIIIlIIIII;
                ei.a().a(llIIllIIIIllIll, bq.L.d.d());
                bq.k();
                return;
            }
            case 88819: {
                void llIIllIIIlIIIII;
                short llIIllIIIIllIll = (Short)llIIllIIIlIIIII;
                ei.a().a(llIIllIIIIllIll);
                bt.m().H();
                return;
            }
            case 88820: {
                void llIIllIIIlIIIII;
                String[] llIIllIIIIllIIl = (String[])llIIllIIIlIIIII;
                if (v.f().aV == null) {
                    return;
                }
                Integer llIIllIIIIllIII = new Integer(bq.F.b);
                if (llIIllIIIIllIIl.length <= lIlIIIII[1]) {
                    y.b("", lIlIIIII[1], v.f().aV);
                    ei.a().a(lIlIIIII[0], v.f().aV.cT.a, llIIllIIIIllIII, lIlIIIII[0]);
                    return;
                }
                dh llIIllIIIIlIlll = new dh();
                int llIIllIIIIlIllI = lIlIIIII[0];
                while (llIIllIIIIlIllI < llIIllIIIIllIIl.length - lIlIIIII[1]) {
                    llIIllIIIIlIlll.addElement(new au(llIIllIIIIllIIl[llIIllIIIIlIllI + lIlIIIII[1]], k, lIlIIIII[49], llIIllIIIIllIII));
                    ++llIIllIIIIlIllI;
                }
                F.a(llIIllIIIIlIlll);
                return;
            }
            case 88821: {
                void llIIllIIIlIIIII;
                int llIIllIIIIlIllI = (Integer)llIIllIIIlIIIII;
                y.b("", lIlIIIII[1], v.f().aV);
                ei.a().a(lIlIIIII[0], v.f().aV.cT.a, llIIllIIIIlIllI, bq.F.b);
                return;
            }
            case 88822: {
                y.b("", lIlIIIII[1], v.f().aV);
                ei.a().a(lIlIIIII[0], v.f().aV.cT.a, bq.F.b, lIlIIIII[0]);
                return;
            }
            case 88823: {
                bq.a(fa.bS);
                return;
            }
            case 88824: {
                bq.a(fa.bT);
                return;
            }
            case 88825: {
                bq.a(fa.ht);
                return;
            }
            case 88826: {
                bq.a(fa.hv);
                return;
            }
            case 88827: {
                bq.a(fa.hu);
                return;
            }
            case 88828: {
                bq.a(fa.hw);
                return;
            }
            case 88829: {
                void llIIllIIIlIIIII;
                String llIIllIIIIlIlIl = bq.L.d.d();
                if (llIIllIIIIlIlIl.equals("")) {
                    return;
                }
                ei.a().b(llIIllIIIIlIlIl, (int)((Integer)llIIllIIIlIIIII));
                bq.c(fa.y);
                return;
            }
            case 88830: {
                void llIIllIIIlIIIII;
                int llIIllIIIIllllI = (Integer)llIIllIIIlIIIII;
                bq.k();
                ei.a().H(llIIllIIIIllllI);
                return;
            }
            case 88831: {
                void llIIllIIIlIIIII;
                int llIIllIIIIllllI = (Integer)llIIllIIIlIIIII;
                bq.k();
                ei.a().I(llIIllIIIIllllI);
                return;
            }
            case 88832: {
                String llIIllIIIIlllll = bq.L.d.d();
                bq.k();
                if (llIIllIIIIlllll.equals("")) break;
                ei.a().n(llIIllIIIIlllll);
                return;
            }
            case 88833: {
                String llIIllIIIIlllll = bq.L.d.d();
                bq.k();
                if (llIIllIIIIlllll.equals("")) break;
                try {
                    int llIIllIIIIllllI = Integer.parseInt(llIIllIIIIlllll);
                    if (v.f().as >= llIIllIIIIllllI && llIIllIIIIllllI >= 0) {
                        ei.a().J(llIIllIIIIllllI);
                        return;
                    }
                    ca.a(fa.hx, lIlIIIII[31], fg.j);
                    return;
                }
                catch (Exception llIIllIIIIlIlII) {
                    return;
                }
            }
            case 88834: {
                String llIIllIIIIlllll = bq.L.d.d();
                bq.k();
                if (llIIllIIIIlllll.equals("")) break;
                try {
                    int llIIllIIIIllllI = Integer.parseInt(llIIllIIIIlllll);
                    if (llIIllIIIIllllI <= 0) {
                        return;
                    }
                    ei.a().K(llIIllIIIIllllI);
                    return;
                }
                catch (Exception llIIllIIIIlIlII) {
                    return;
                }
            }
            case 88835: {
                void llIIllIIIlIIIII;
                int llIIllIIIIllllI = Integer.parseInt((String)llIIllIIIlIIIII);
                int llIIllIIIlIIIIl = Integer.parseInt(bq.L.d.d());
                J = null;
                if (llIIllIIIlIIIIl >= lIlIIIII[1] && llIIllIIIlIIIIl < v.f().aC[llIIllIIIIllllI].f) {
                    ei.a().i(llIIllIIIIllllI, llIIllIIIlIIIIl);
                    return;
                }
                bq.a(fa.hy);
                return;
            }
            case 88836: {
                bq.L.d.b(lIlIIIII[22]);
                L.a(fa.gX, new au(fa.bc, k, lIlIIIII[50], null), lIlIIIII[1]);
                return;
            }
            case 88837: {
                String llIIllIIIIlllll = bq.L.d.d();
                bq.k();
                try {
                    ei.a().N(Integer.parseInt(llIIllIIIIlllll.trim()));
                    return;
                }
                catch (Exception llIIllIIIIlIlII) {
                    return;
                }
            }
            case 88838: {
                int llIIllIIIlIIIIl;
                String llIIllIIIIlllll = bq.M.d.d().trim();
                String llIIllIIIIlllII = bq.M.e.d().trim();
                bq.k();
                if (llIIllIIIIlllll.length() >= lIlIIIII[22] && llIIllIIIIlllII.length() >= lIlIIIII[22]) {
                    try {
                        int llIIllIIIIllllI = Integer.parseInt(llIIllIIIIlllll);
                        llIIllIIIlIIIIl = Integer.parseInt(llIIllIIIIlllII);
                        if (llIIllIIIIllllI >= lIlIIIII[51] && llIIllIIIlIIIIl >= lIlIIIII[51]) {
                            ei.a().j(llIIllIIIIllllI, llIIllIIIlIIIIl);
                            return;
                        }
                        bq.a(fa.gT);
                        return;
                    }
                    catch (Exception llIIllIIIIlIlII) {
                        bq.a(fa.gS);
                        return;
                    }
                }
                bq.a(fa.gR);
                return;
            }
            case 88839: {
                String llIIllIIIIlllll = bq.L.d.d();
                bq.k();
                try {
                    Integer.parseInt(llIIllIIIIlllll);
                    bq.a(fa.hA, lIlIIIII[52], llIIllIIIIlllll, lIlIIIII[42], null);
                    return;
                }
                catch (Exception llIIllIIIIlIlII) {
                    ca.a(fa.gU, lIlIIIII[31], fg.j);
                    return;
                }
            }
            case 88840: {
                void llIIllIIIlIIIII;
                v llIIllIIIIlllIl = (v)llIIllIIIlIIIII;
                bq.k();
                ei.a().m(llIIllIIIIlllIl.q);
                return;
            }
            case 88841: {
                void llIIllIIIlIIIII;
                v llIIllIIIIlllIl = (v)llIIllIIIlIIIII;
                bq.k();
                ei.a().n(llIIllIIIIlllIl.q);
                return;
            }
            case 88842: {
                ei.a().C();
                return;
            }
            case 88843: {
                String llIIllIIIIlllII = bq.L.d.d();
                bq.k();
                if (llIIllIIIIlllII.equals("")) {
                    bq.a(fa.hz);
                    return;
                }
                ei.a().r(llIIllIIIIlllII);
                return;
            }
            case 888181: {
                void llIIllIIIlIIIII;
                short llIIllIIIIllllI = (Short)llIIllIIIlIIIII;
                ei.a().b(llIIllIIIIllllI, bq.L.d.d());
                b = null;
                bq.k();
                return;
            }
            case 888361: {
                String llIIllIIIIlllll = bq.L.d.d();
                bq.k();
                if (llIIllIIIIlllll.length() >= lIlIIIII[22] && !llIIllIIIIlllll.equals("")) {
                    try {
                        ei.a().L(Integer.parseInt(llIIllIIIIlllll));
                        return;
                    }
                    catch (Exception llIIllIIIIlIlII) {
                        bq.a(fa.gS);
                        return;
                    }
                }
                bq.a(fa.gR);
                return;
            }
            case 888391: {
                int llIIllIIIlIIIIl;
                void llIIllIIIlIIIII;
                try {
                    bq.k();
                    llIIllIIIlIIIIl = Integer.parseInt((String)llIIllIIIlIIIII);
                    ei.a().M(llIIllIIIlIIIIl);
                    return;
                }
                catch (Exception llIIllIIIIlIlII) {
                    return;
                }
            }
            case 9989: {
                bs.d.notifyDestroyed();
                return;
            }
        }
    }

    private static void llllIlI() {
        lIlIIIII = new int[53];
        bq.lIlIIIII[0] = (0x4B ^ 0x44) << " ".length() & ~((0x55 ^ 0x5A) << " ".length());
        bq.lIlIIIII[1] = " ".length();
        bq.lIlIIIII[2] = (0x3E ^ 0x39) << " ".length();
        bq.lIlIIIII[3] = " ".length() << (" ".length() << " ".length());
        bq.lIlIIIII[4] = " ".length() << " ".length();
        bq.lIlIIIII[5] = -" ".length();
        bq.lIlIIIII[6] = (0x4C ^ 0x43) << (" ".length() << (" ".length() << " ".length()));
        bq.lIlIIIII[7] = (0xAE ^ 0xAB) << ("   ".length() << " ".length());
        bq.lIlIIIII[8] = (0xBA ^ 0xBF) << (0x46 ^ 0x43);
        bq.lIlIIIII[9] = 0x4A ^ 0x45;
        bq.lIlIIIII[10] = 0x36 ^ 0x27;
        bq.lIlIIIII[11] = 0x37 ^ 0x32;
        bq.lIlIIIII[12] = (0x3B ^ 0x34) << (" ".length() << " ".length());
        bq.lIlIIIII[13] = 237 + 509 - 439 + 318 << (" ".length() << (" ".length() << " ".length()));
        bq.lIlIIIII[14] = (0x71 ^ 0x68) << (" ".length() << " ".length());
        bq.lIlIIIII[15] = "   ".length();
        bq.lIlIIIII[16] = (0x69 ^ 0x6C) << " ".length();
        bq.lIlIIIII[17] = 0x1F ^ 0x18;
        bq.lIlIIIII[18] = 760119 + 4621313 - -2499429 + 8896354;
        bq.lIlIIIII[19] = "   ".length() << "   ".length();
        bq.lIlIIIII[20] = " ".length() << ("   ".length() << " ".length());
        bq.lIlIIIII[21] = "   ".length() << ("   ".length() << " ".length());
        bq.lIlIIIII[22] = "   ".length() << " ".length();
        bq.lIlIIIII[23] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        bq.lIlIIIII[24] = " ".length() << "   ".length();
        bq.lIlIIIII[25] = 0xA7 ^ 0xAC;
        bq.lIlIIIII[26] = "   ".length() << (" ".length() << " ".length());
        bq.lIlIIIII[27] = 0x4C ^ 0x61;
        bq.lIlIIIII[28] = (0x42 ^ 0x4F) << (" ".length() << " ".length());
        bq.lIlIIIII[29] = 0xF3 ^ 0xC4;
        bq.lIlIIIII[30] = (0x12 ^ 3) << (" ".length() << (" ".length() << (" ".length() << " ".length())));
        bq.lIlIIIII[31] = (0xAE ^ 0xAB) << (" ".length() << " ".length());
        bq.lIlIIIII[32] = 0x8C ^ 0x81;
        bq.lIlIIIII[33] = (0x3A ^ 0x7B) << " ".length();
        bq.lIlIIIII[34] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        bq.lIlIIIII[35] = 0x10 ^ 0x29;
        bq.lIlIIIII[36] = 0xFB ^ 0xBA;
        bq.lIlIIIII[37] = (0x99 ^ 0xA4) << " ".length();
        bq.lIlIIIII[38] = " ".length() << (0x89 ^ 0x8C);
        bq.lIlIIIII[39] = (0x6C ^ 0x75) << " ".length();
        bq.lIlIIIII[40] = 0x26 ^ 0x2F;
        bq.lIlIIIII[41] = (0x40 ^ 0x3D) << (" ".length() << " ".length());
        bq.lIlIIIII[42] = 3554 + 1892 - 5288 + 4283 << " ".length();
        bq.lIlIIIII[43] = 9140 + 6953 - 16038 + 9934;
        bq.lIlIIIII[44] = 6029 + 806 - 6317 + 8363;
        bq.lIlIIIII[45] = 6464 + 2791 - 2888 + 2516;
        bq.lIlIIIII[46] = 0x8B ^ 0xA8;
        bq.lIlIIIII[47] = (0xB2 ^ 0xBD) << " ".length();
        bq.lIlIIIII[48] = 29 + 473 - 385 + 438 << (" ".length() << (" ".length() << " ".length()));
        bq.lIlIIIII[49] = 36857 + 19636 - 49554 + 81882;
        bq.lIlIIIII[50] = 44765 + 884849 - 677530 + 636277;
        bq.lIlIIIII[51] = 37833 + 37130 - -7252 + 17784;
        bq.lIlIIIII[52] = 270536 + 324968 - -89562 + 203325;
    }
}

