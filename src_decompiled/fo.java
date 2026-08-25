/*
 * Decompiled with CFR 0.152.
 */
public final class fo {
    private static /* synthetic */ boolean c;
    public static /* synthetic */ boolean a;
    public static /* synthetic */ boolean b;
    private static /* synthetic */ boolean d;
    private static /* synthetic */ boolean e;
    private static /* synthetic */ boolean f;
    private static /* synthetic */ boolean g;
    private static /* synthetic */ boolean h;
    private static /* synthetic */ boolean i;
    private static /* synthetic */ boolean j;
    private static /* synthetic */ boolean k;
    private static /* synthetic */ boolean l;
    private static /* synthetic */ boolean m;
    private static /* synthetic */ boolean n;
    private static /* synthetic */ boolean o;
    private static /* synthetic */ boolean p;
    private static /* synthetic */ boolean q;
    private static /* synthetic */ boolean r;
    private static /* synthetic */ Object s;
    private static /* synthetic */ int t;
    private static final /* synthetic */ int[] llIllll;

    static {
        fo.lIlIIll();
        c = llIllll[0];
        a = llIllll[0];
        b = llIllll[0];
        d = llIllll[0];
        e = llIllll[0];
        f = llIllll[0];
        g = llIllll[0];
        h = llIllll[0];
        i = llIllll[0];
        j = llIllll[0];
        k = llIllll[0];
        l = llIllll[0];
        m = llIllll[0];
        n = llIllll[0];
        o = llIllll[0];
        p = llIllll[0];
        q = llIllll[0];
        r = llIllll[0];
        s = new Object();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a() {
        c = llIllll[1];
        Object llIIlllIlIlllII = s;
        synchronized (llIIlllIlIlllII) {
            try {
                s.wait(2000L);
            }
            catch (InterruptedException llIIlllIlIllIll) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(long l2) {
        Object llIIlllIlIlIllI = s;
        synchronized (llIIlllIlIlIllI) {
            try {
                long llIIlllIlIlIlll;
                s.wait(llIIlllIlIlIlll);
            }
            catch (InterruptedException llIIlllIlIlIlIl) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b() {
        if (c) {
            Object llIIlllIlIlIIll = s;
            synchronized (llIIlllIlIlIIll) {
                s.notifyAll();
            }
            c = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static boolean c() {
        void llIIlllIlIIllll;
        b = llIllll[1];
        long l2 = System.currentTimeMillis();
        Object llIIlllIlIIlllI = s;
        synchronized (llIIlllIlIIlllI) {
            try {
                s.wait(500L);
            }
            catch (InterruptedException llIIlllIlIIllIl) {
                // empty catch block
            }
        }
        if (System.currentTimeMillis() - llIIlllIlIIllll < 500L) {
            return llIllll[1];
        }
        return llIllll[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void d() {
        if (b) {
            Object llIIlllIlIIlIIl = s;
            synchronized (llIIlllIlIIlIIl) {
                s.notifyAll();
            }
            b = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void e() {
        d = llIllll[1];
        Object llIIlllIIlllIIl = s;
        synchronized (llIIlllIIlllIIl) {
            try {
                s.wait(2000L);
            }
            catch (InterruptedException llIIlllIIlllIII) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void f() {
        if (d) {
            Object llIIlllIIllIIIl = s;
            synchronized (llIIlllIIllIIIl) {
                s.notifyAll();
            }
            d = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void g() {
        e = llIllll[1];
        Object llIIlllIIlIlIIl = s;
        synchronized (llIIlllIIlIlIIl) {
            try {
                s.wait(2000L);
            }
            catch (InterruptedException llIIlllIIlIlIII) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void h() {
        if (e) {
            Object llIIlllIIlIIIlI = s;
            synchronized (llIIlllIIlIIIlI) {
                s.notifyAll();
            }
            e = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void i() {
        j = llIllll[1];
        Object llIIlllIIIlllIl = s;
        synchronized (llIIlllIIIlllIl) {
            try {
                s.wait();
            }
            catch (InterruptedException llIIlllIIIlllII) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void j() {
        if (j) {
            Object llIIlllIIIllIlI = s;
            synchronized (llIIlllIIIllIlI) {
                s.notifyAll();
            }
            j = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void k() {
        f = llIllll[1];
        Object llIIlllIIIlIlll = s;
        synchronized (llIIlllIIIlIlll) {
            try {
                s.wait(2000L);
            }
            catch (InterruptedException llIIlllIIIlIllI) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void l() {
        if (f) {
            Object llIIlllIIIlIlII = s;
            synchronized (llIIlllIIIlIlII) {
                s.notifyAll();
            }
            f = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void m() {
        g = llIllll[1];
        Object llIIlllIIIIlllI = s;
        synchronized (llIIlllIIIIlllI) {
            try {
                s.wait(2000L);
            }
            catch (InterruptedException llIIlllIIIIllII) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void n() {
        if (g) {
            Object llIIlllIIIIIIlI = s;
            synchronized (llIIlllIIIIIIlI) {
                s.notifyAll();
            }
            g = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void o() {
        h = llIllll[1];
        Object llIIllIllllllll = s;
        synchronized (llIIllIllllllll) {
            try {
                s.wait(2000L);
            }
            catch (InterruptedException llIIllIlllllllI) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void p() {
        if (h) {
            Object llIIllIlllllIII = s;
            synchronized (llIIllIlllllIII) {
                s.notifyAll();
            }
            h = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static boolean q() {
        void llIIllIllllIIII;
        i = llIllll[1];
        long l2 = System.currentTimeMillis();
        Object llIIllIlllIllll = s;
        synchronized (llIIllIlllIllll) {
            try {
                s.wait(2000L);
            }
            catch (InterruptedException llIIllIlllIlllI) {
                // empty catch block
            }
        }
        if (System.currentTimeMillis() - llIIllIllllIIII < 2000L) {
            return llIllll[1];
        }
        return llIllll[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void r() {
        if (i) {
            Object llIIllIlllIllII = s;
            synchronized (llIIllIlllIllII) {
                s.notifyAll();
            }
            i = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static boolean s() {
        void llIIllIlllIlIII;
        k = llIllll[1];
        long l2 = System.currentTimeMillis();
        Object llIIllIlllIIlll = s;
        synchronized (llIIllIlllIIlll) {
            try {
                s.wait(7000L);
            }
            catch (InterruptedException llIIllIlllIIllI) {
                // empty catch block
            }
        }
        if (System.currentTimeMillis() - llIIllIlllIlIII < 7000L) {
            return llIllll[1];
        }
        return llIllll[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void t() {
        if (k) {
            Object llIIllIlllIIlII = s;
            synchronized (llIIllIlllIIlII) {
                s.notifyAll();
            }
            k = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean u() {
        t = d.d() != null ? d.d().c : llIllll[0];
        l = llIllll[1];
        Object llIIllIlllIIIIl = s;
        synchronized (llIIllIlllIIIIl) {
            try {
                s.wait(3000L);
            }
            catch (InterruptedException llIIllIlllIIIII) {
                // empty catch block
            }
        }
        if (d.d() != null && d.d().c <= t) {
            return llIllll[0];
        }
        return llIllll[1];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void v() {
        if (l) {
            Object llIIllIllIllllI = s;
            synchronized (llIIllIllIllllI) {
                s.notifyAll();
            }
            l = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void w() {
        m = llIllll[1];
        Object llIIllIllIllIll = s;
        synchronized (llIIllIllIllIll) {
            try {
                s.wait(3000L);
            }
            catch (InterruptedException llIIllIllIllIlI) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void x() {
        if (m) {
            Object llIIllIllIllIII = s;
            synchronized (llIIllIllIllIII) {
                s.notifyAll();
            }
            m = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static boolean y() {
        void llIIllIllIlIlII;
        n = llIllll[1];
        long l2 = System.currentTimeMillis();
        Object llIIllIllIlIIll = s;
        synchronized (llIIllIllIlIIll) {
            try {
                s.wait(5000L);
            }
            catch (InterruptedException llIIllIllIlIIlI) {
                // empty catch block
            }
        }
        if (System.currentTimeMillis() - llIIllIllIlIlII < 5000L) {
            return llIllll[1];
        }
        return llIllll[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void z() {
        if (n) {
            Object llIIllIllIlIIII = s;
            synchronized (llIIllIllIlIIII) {
                s.notifyAll();
            }
            n = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void A() {
        if (o) {
            Object llIIllIllIIlllI = s;
            synchronized (llIIllIllIIlllI) {
                s.notifyAll();
            }
            o = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void B() {
        p = llIllll[1];
        Object llIIllIllIIlIll = s;
        synchronized (llIIllIllIIlIll) {
            try {
                s.wait(500L);
            }
            catch (InterruptedException llIIllIllIIlIlI) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void C() {
        if (p) {
            Object llIIllIllIIlIII = s;
            synchronized (llIIllIllIIlIII) {
                s.notifyAll();
            }
            p = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static boolean D() {
        void llIIllIllIIIIII;
        byte[] byArray = new byte[llIllll[2]];
        byArray[fo.llIllll[0]] = llIllll[0];
        byArray[fo.llIllll[1]] = llIllll[3];
        byArray[fo.llIllll[4]] = llIllll[0];
        byArray[fo.llIllll[5]] = llIllll[6];
        byArray[fo.llIllll[7]] = llIllll[0];
        byArray[fo.llIllll[8]] = llIllll[9];
        byArray[fo.llIllll[10]] = llIllll[0];
        byArray[fo.llIllll[11]] = llIllll[12];
        byArray[fo.llIllll[13]] = llIllll[0];
        byArray[fo.llIllll[14]] = llIllll[15];
        byArray[fo.llIllll[16]] = llIllll[0];
        byArray[fo.llIllll[17]] = llIllll[18];
        System.out.println(ec.a(byArray));
        q = llIllll[1];
        long l2 = System.currentTimeMillis();
        Object llIIllIlIllllll = s;
        synchronized (llIIllIlIllllll) {
            try {
                s.wait(10000L);
            }
            catch (InterruptedException llIIllIlIlllllI) {
                // empty catch block
            }
        }
        if (System.currentTimeMillis() - llIIllIllIIIIII < 10000L) {
            return llIllll[1];
        }
        return llIllll[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void E() {
        byte[] byArray = new byte[llIllll[19]];
        byArray[fo.llIllll[0]] = llIllll[0];
        byArray[fo.llIllll[1]] = llIllll[20];
        byArray[fo.llIllll[4]] = llIllll[0];
        byArray[fo.llIllll[5]] = llIllll[21];
        byArray[fo.llIllll[7]] = llIllll[0];
        byArray[fo.llIllll[8]] = llIllll[12];
        byArray[fo.llIllll[10]] = llIllll[0];
        byArray[fo.llIllll[11]] = llIllll[9];
        byArray[fo.llIllll[13]] = llIllll[0];
        byArray[fo.llIllll[14]] = llIllll[22];
        byArray[fo.llIllll[16]] = llIllll[0];
        byArray[fo.llIllll[17]] = llIllll[23];
        byArray[fo.llIllll[2]] = llIllll[0];
        byArray[fo.llIllll[24]] = llIllll[15];
        byArray[fo.llIllll[25]] = llIllll[0];
        byArray[fo.llIllll[26]] = llIllll[18];
        System.out.println(ec.a(byArray));
        if (q) {
            Object llIIllIlIllllII = s;
            synchronized (llIIllIlIllllII) {
                s.notifyAll();
            }
            q = llIllll[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean F() {
        int n2 = llIllll[0];
        block0: while (n2 < at.h.size()) {
            void llIIllIlIllIlIl;
            String llIIllIlIllIlII = (String)at.h.elementAt((int)llIIllIlIllIlIl);
            int llIIllIlIllIIll = llIllll[0];
            while (llIIllIlIllIIll < bt.z.size()) {
                dt llIIllIlIllIIlI = (dt)bt.z.elementAt(llIIllIlIllIIll);
                if (llIIllIlIllIIlI.d.equals(llIIllIlIllIlII)) {
                    if (llIIllIlIllIIlI.f == null || eb.a(v.f().j, v.f().k, llIIllIlIllIIlI.f.j, llIIllIlIllIIlI.f.k) > llIllll[27]) {
                        return llIllll[0];
                    }
                    ++llIIllIlIllIlIl;
                    continue block0;
                }
                ++llIIllIlIllIIll;
            }
            return llIllll[0];
        }
        return llIllll[1];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean G() {
        int n2 = llIllll[0];
        while (n2 < at.h.size()) {
            void llIIllIlIlIlllI;
            block3: {
                String llIIllIlIlIllIl = (String)at.h.elementAt((int)llIIllIlIlIlllI);
                int llIIllIlIlIllII = llIllll[0];
                while (llIIllIlIlIllII < bt.z.size()) {
                    if (!((dt)bt.z.elementAt((int)llIIllIlIlIllII)).d.equals(llIIllIlIlIllIl)) {
                        ++llIIllIlIlIllII;
                        continue;
                    }
                    break block3;
                }
                return llIllll[0];
            }
            ++llIIllIlIlIlllI;
        }
        return llIllll[1];
    }

    /*
     * WARNING - void declaration
     */
    public static void b(long l2) {
        if (at.g != null) {
            long llIIllIlIlIIlll;
            void llIIllIlIlIIllI;
            long l3 = System.currentTimeMillis();
            while (!fo.F() && System.currentTimeMillis() - llIIllIlIlIIllI < llIIllIlIlIIlll) {
                fn.a(2000L);
            }
        }
    }

    public static void H() {
        if (at.g != null) {
            long llIIllIlIIlIllI = System.currentTimeMillis();
            while (true) {
                int llIIllIlIIlIIll;
                block8: {
                    int llIIllIlIIlIlII = llIllll[0];
                    block1: while (true) {
                        if (llIIllIlIIlIlII >= at.h.size()) {
                            llIIllIlIIlIIll = llIllll[1];
                            break block8;
                        }
                        String llIIllIlIIlIIIl = (String)at.h.elementAt(llIIllIlIIlIlII);
                        int llIIllIlIIIllll = llIllll[0];
                        while (llIIllIlIIIllll < bt.z.size()) {
                            dt llIIllIlIIIllIl = (dt)bt.z.elementAt(llIIllIlIIIllll);
                            if (llIIllIlIIIllIl.d.equals(llIIllIlIIlIIIl)) {
                                if (llIIllIlIIIllIl.f == null) {
                                    llIIllIlIIlIIll = llIllll[0];
                                    break block8;
                                }
                                ++llIIllIlIIlIlII;
                                continue block1;
                            }
                            ++llIIllIlIIIllll;
                        }
                        break;
                    }
                    llIIllIlIIlIIll = llIllll[0];
                }
                if (llIIllIlIIlIIll != 0 || System.currentTimeMillis() - llIIllIlIIlIllI >= 300000L) {
                    return;
                }
                fn.a(2000L);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void I() {
        if (at.g != null) {
            void llIIllIlIIIlIII;
            long l2 = System.currentTimeMillis();
            while (!fo.G() && System.currentTimeMillis() - llIIllIlIIIlIII < 60000L) {
                fn.a(2000L);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static boolean J() {
        void llIIllIIlllIllI;
        r = llIllll[1];
        long l2 = System.currentTimeMillis();
        Object llIIllIIlllIlIl = s;
        synchronized (llIIllIIlllIlIl) {
            try {
                s.wait(5000L);
            }
            catch (InterruptedException llIIllIIlllIlII) {
                // empty catch block
            }
        }
        if (System.currentTimeMillis() - llIIllIIlllIllI < 5000L) {
            return llIllll[1];
        }
        return llIllll[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void K() {
        if (r) {
            Object llIIllIIllIlIlI = s;
            synchronized (llIIllIIllIlIlI) {
                s.notifyAll();
            }
            r = llIllll[0];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void L() {
        Object llIIllIIllIIlII = s;
        synchronized (llIIllIIllIIlII) {
            s.notifyAll();
        }
        b = llIllll[0];
        d = llIllll[0];
        e = llIllll[0];
        f = llIllll[0];
        g = llIllll[0];
        h = llIllll[0];
        j = llIllll[0];
        c = llIllll[0];
        i = llIllll[0];
        a = llIllll[0];
        k = llIllll[0];
        l = llIllll[0];
        m = llIllll[0];
        n = llIllll[0];
        o = llIllll[0];
        p = llIllll[0];
        r = llIllll[0];
        fb.G = llIllll[0];
        fb.k();
    }

    private static void lIlIIll() {
        llIllll = new int[28];
        fo.llIllll[0] = (0x4E ^ 3) & ~(0x64 ^ 0x29);
        fo.llIllll[1] = " ".length();
        fo.llIllll[2] = "   ".length() << (" ".length() << " ".length());
        fo.llIllll[3] = 0xE0 ^ 0xB7;
        fo.llIllll[4] = " ".length() << " ".length();
        fo.llIllll[5] = "   ".length();
        fo.llIllll[6] = 0x2D ^ 0x4C;
        fo.llIllll[7] = " ".length() << (" ".length() << " ".length());
        fo.llIllll[8] = 0x9F ^ 0x9A;
        fo.llIllll[9] = 0x7E ^ 0x17;
        fo.llIllll[10] = "   ".length() << " ".length();
        fo.llIllll[11] = 0x95 ^ 0x92;
        fo.llIllll[12] = (0xD ^ 0x10) << (" ".length() << " ".length());
        fo.llIllll[13] = " ".length() << "   ".length();
        fo.llIllll[14] = 0xA3 ^ 0xAA;
        fo.llIllll[15] = (0x43 ^ 0x52) << (" ".length() << " ".length());
        fo.llIllll[16] = (0x7C ^ 0x79) << " ".length();
        fo.llIllll[17] = 0xBF ^ 0xB4;
        fo.llIllll[18] = (0x23 ^ 8) << " ".length();
        fo.llIllll[19] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        fo.llIllll[20] = (0xAF ^ 0x88) << " ".length();
        fo.llIllll[21] = 0xF0 ^ 0x9F;
        fo.llIllll[22] = (0x1B ^ 0x28) << " ".length();
        fo.llIllll[23] = 0x59 ^ 0x20;
        fo.llIllll[24] = 0xA3 ^ 0xAE;
        fo.llIllll[25] = (0xB4 ^ 0xB3) << " ".length();
        fo.llIllll[26] = 0x47 ^ 0x48;
        fo.llIllll[27] = (0xA6 ^ 0xBF) << (" ".length() << " ".length());
    }
}

