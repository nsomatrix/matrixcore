/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fn {
    private static /* synthetic */ Object b;
    public static /* synthetic */ boolean a;
    private static final /* synthetic */ int[] llll;

    static {
        fn.lIll();
        b = new Object();
        a = llll[0];
    }

    public static void a(v v2) {
        v.f().aS = null;
        v.f().y();
        v.f().aX = null;
        v.f();
        v.cl = llll[1];
        v.f().aW = v2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(int n2) {
        int n3 = llll[0];
        while (n3 < bt.G.size()) {
            int lllllllIlIIIlIl;
            void lllllllIlIIIlII;
            ce lllllllIlIIIIll = (ce)bt.G.elementAt((int)lllllllIlIIIlII);
            if (lllllllIlIIIIll != null && lllllllIlIIIIll.h.a == lllllllIlIIIlIl) {
                return llll[1];
            }
            ++lllllllIlIIIlII;
        }
        return llll[0];
    }

    /*
     * WARNING - void declaration
     */
    public static v a(String string) {
        int n2 = llll[0];
        while (n2 < bt.F.size()) {
            String lllllllIIllllll;
            void lllllllIIlllllI;
            v lllllllIIllllIl = (v)bt.F.elementAt((int)lllllllIIlllllI);
            if (lllllllIIllllIl.ac.equals(lllllllIIllllll)) {
                return lllllllIIllllIl;
            }
            ++lllllllIIlllllI;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static v b(int n2) {
        int n3 = llll[0];
        while (n3 < bt.F.size()) {
            int lllllllIIlllIIl;
            void lllllllIIlllIII;
            v lllllllIIllIlll = (v)bt.F.elementAt((int)lllllllIIlllIII);
            if (lllllllIIllIlll.q == lllllllIIlllIIl) {
                return lllllllIIllIlll;
            }
            ++lllllllIIlllIII;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(boolean bl2, String string, String string2) {
        void lllllllIIlIllll;
        boolean bl3 = bl2;
        if (bl2) {
            dv.a(string2, llll[2]);
            byte[] byArray = new byte[llll[3]];
            byArray[fn.llll[0]] = llll[0];
            byArray[fn.llll[1]] = llll[4];
            byArray[fn.llll[5]] = llll[6];
            byArray[fn.llll[7]] = llll[8];
            byArray[fn.llll[9]] = llll[0];
            byArray[fn.llll[10]] = llll[11];
            byArray[fn.llll[12]] = llll[0];
            byArray[fn.llll[13]] = llll[14];
            at.a(ec.a(byArray) + string);
        } else {
            void lllllllIIllIIIl;
            void lllllllIIllIIII;
            dv.a((String)lllllllIIllIIII, llll[1]);
            byte[] byArray = new byte[llll[3]];
            byArray[fn.llll[0]] = llll[0];
            byArray[fn.llll[1]] = llll[15];
            byArray[fn.llll[5]] = llll[6];
            byArray[fn.llll[7]] = llll[16];
            byArray[fn.llll[9]] = llll[0];
            byArray[fn.llll[10]] = llll[11];
            byArray[fn.llll[12]] = llll[0];
            byArray[fn.llll[13]] = llll[14];
            at.a(ec.a(byArray) + (String)lllllllIIllIIIl);
        }
        return lllllllIIlIllll != false ? llll[0] : llll[1];
    }

    static void a() {
        if (bq.E != bq.G) {
            bq.k.d();
        }
        if (!a) {
            a = llll[1];
            new Thread(new ea()).start();
        }
    }

    public static void b() {
        if (at.c != null && v.cI) {
            fn.a();
        } else {
            bq.k.o();
        }
    }

    public static void a(long lllllllIIlIllII) {
        try {
            Thread.sleep(lllllllIIlIllII);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static int b(String lllllllIIlIlIII) {
        try {
            return Integer.parseInt(lllllllIIlIlIII);
        }
        catch (Exception exception) {
            return llll[2];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c() {
        Object lllllllIIIlllII = b;
        synchronized (lllllllIIIlllII) {
            b.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void b(long l2) {
        Object lllllllIIIlIIlI = b;
        synchronized (lllllllIIIlIIlI) {
            try {
                long lllllllIIIlIlII;
                b.wait(lllllllIIIlIlII);
            }
            catch (Exception lllllllIIIlIIII) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void d() {
        byte[] byArray = new byte[llll[17]];
        byArray[fn.llll[0]] = llll[0];
        byArray[fn.llll[1]] = llll[18];
        byArray[fn.llll[5]] = llll[0];
        byArray[fn.llll[7]] = llll[19];
        byArray[fn.llll[9]] = llll[0];
        byArray[fn.llll[10]] = llll[20];
        byArray[fn.llll[12]] = llll[0];
        byArray[fn.llll[13]] = llll[21];
        byArray[fn.llll[3]] = llll[0];
        byArray[fn.llll[22]] = llll[14];
        byArray[fn.llll[23]] = llll[0];
        byArray[fn.llll[24]] = llll[25];
        byArray[fn.llll[26]] = llll[0];
        byArray[fn.llll[27]] = llll[28];
        byArray[fn.llll[29]] = llll[0];
        byArray[fn.llll[30]] = llll[11];
        byArray[fn.llll[31]] = llll[0];
        byArray[fn.llll[32]] = llll[33];
        System.out.println(ec.a(byArray));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream lllllllIIIIIIll = new DataOutputStream(byteArrayOutputStream);
        try {
            void lllllllIIIIIlII;
            lllllllIIIIIIll.writeBoolean(v.bj);
            lllllllIIIIIIll.writeInt(v.bt);
            lllllllIIIIIIll.writeBoolean(v.bk);
            lllllllIIIIIIll.writeInt(v.bu);
            lllllllIIIIIIll.writeBoolean(v.bl);
            lllllllIIIIIIll.writeInt(v.bv);
            lllllllIIIIIIll.writeBoolean(v.bm);
            lllllllIIIIIIll.writeBoolean(v.cA);
            lllllllIIIIIIll.writeBoolean(v.cw);
            lllllllIIIIIIll.writeInt(v.cy);
            lllllllIIIIIIll.writeBoolean(v.cx);
            lllllllIIIIIIll.writeInt(v.cz);
            lllllllIIIIIIll.writeBoolean(v.cC);
            lllllllIIIIIIll.writeInt(v.cB);
            lllllllIIIIIIll.writeBoolean(v.cE);
            lllllllIIIIIIll.writeInt(v.cD);
            lllllllIIIIIIll.writeBoolean(v.cF);
            lllllllIIIIIIll.writeBoolean(v.cG);
            lllllllIIIIIIll.writeBoolean(v.cH);
            lllllllIIIIIIll.writeBoolean(v.cv);
            lllllllIIIIIIll.writeBoolean(v.cu);
            lllllllIIIIIIll.writeBoolean(v.cI);
            lllllllIIIIIIll.writeBoolean(v.cr);
            lllllllIIIIIIll.writeBoolean(v.ct);
            lllllllIIIIIIll.writeBoolean(v.cn);
            lllllllIIIIIIll.writeBoolean(v.co);
            lllllllIIIIIIll.writeBoolean(v.cp);
            lllllllIIIIIIll.writeBoolean(v.cq);
            lllllllIIIIIIll.writeBoolean(v.cs);
            int lllllllIIIIIIlI = llll[0];
            int lllllllIIIIIIIl = llll[0];
            while (lllllllIIIIIIIl < at.x.length) {
                if (at.x[lllllllIIIIIIIl] >= 0) {
                    ++lllllllIIIIIIlI;
                }
                ++lllllllIIIIIIIl;
            }
            byte[] byArray2 = new byte[llll[17]];
            byArray2[fn.llll[0]] = llll[0];
            byArray2[fn.llll[1]] = llll[34];
            byArray2[fn.llll[5]] = llll[0];
            byArray2[fn.llll[7]] = llll[11];
            byArray2[fn.llll[9]] = llll[0];
            byArray2[fn.llll[10]] = llll[21];
            byArray2[fn.llll[12]] = llll[0];
            byArray2[fn.llll[13]] = llll[35];
            byArray2[fn.llll[3]] = llll[0];
            byArray2[fn.llll[22]] = llll[36];
            byArray2[fn.llll[23]] = llll[0];
            byArray2[fn.llll[24]] = llll[21];
            byArray2[fn.llll[26]] = llll[0];
            byArray2[fn.llll[27]] = llll[37];
            byArray2[fn.llll[29]] = llll[0];
            byArray2[fn.llll[30]] = llll[38];
            byArray2[fn.llll[31]] = llll[0];
            byArray2[fn.llll[32]] = llll[14];
            System.out.println(ec.a(byArray2) + lllllllIIIIIIlI);
            lllllllIIIIIIll.writeInt(lllllllIIIIIIlI);
            lllllllIIIIIIIl = llll[0];
            while (lllllllIIIIIIIl < at.x.length) {
                if (at.x[lllllllIIIIIIIl] >= 0) {
                    lllllllIIIIIIll.writeShort(at.x[lllllllIIIIIIIl]);
                }
                ++lllllllIIIIIIIl;
            }
            lllllllIIIIIIlI = llll[0];
            lllllllIIIIIIIl = llll[0];
            while (lllllllIIIIIIIl < at.y.length) {
                if (at.y[lllllllIIIIIIIl] >= 0) {
                    ++lllllllIIIIIIlI;
                }
                ++lllllllIIIIIIIl;
            }
            byte[] byArray3 = new byte[llll[39]];
            byArray3[fn.llll[0]] = llll[0];
            byArray3[fn.llll[1]] = llll[34];
            byArray3[fn.llll[5]] = llll[0];
            byArray3[fn.llll[7]] = llll[11];
            byArray3[fn.llll[9]] = llll[0];
            byArray3[fn.llll[10]] = llll[21];
            byArray3[fn.llll[12]] = llll[0];
            byArray3[fn.llll[13]] = llll[35];
            byArray3[fn.llll[3]] = llll[0];
            byArray3[fn.llll[22]] = llll[40];
            byArray3[fn.llll[23]] = llll[0];
            byArray3[fn.llll[24]] = llll[41];
            byArray3[fn.llll[26]] = llll[0];
            byArray3[fn.llll[27]] = llll[42];
            byArray3[fn.llll[29]] = llll[0];
            byArray3[fn.llll[30]] = llll[43];
            byArray3[fn.llll[31]] = llll[0];
            byArray3[fn.llll[32]] = llll[38];
            byArray3[fn.llll[17]] = llll[0];
            byArray3[fn.llll[44]] = llll[14];
            System.out.println(ec.a(byArray3) + lllllllIIIIIIlI);
            lllllllIIIIIIll.writeInt(lllllllIIIIIIlI);
            lllllllIIIIIIIl = llll[0];
            while (lllllllIIIIIIIl < at.y.length) {
                if (at.y[lllllllIIIIIIIl] >= 0) {
                    lllllllIIIIIIll.writeShort(at.y[lllllllIIIIIIIl]);
                }
                ++lllllllIIIIIIIl;
            }
            lllllllIIIIIIll.writeBoolean(v.cJ);
            lllllllIIIIIIll.writeBoolean(v.cK);
            lllllllIIIIIIll.writeBoolean(v.cL);
            lllllllIIIIIIll.writeBoolean(v.cM);
            lllllllIIIIIIll.flush();
            lllllllIIIIIlII.flush();
            byte[] byArray4 = new byte[llll[45]];
            byArray4[fn.llll[0]] = llll[0];
            byArray4[fn.llll[1]] = llll[40];
            byArray4[fn.llll[5]] = llll[0];
            byArray4[fn.llll[7]] = llll[46];
            byArray4[fn.llll[9]] = llll[0];
            byArray4[fn.llll[10]] = llll[33];
            byArray4[fn.llll[12]] = llll[0];
            byArray4[fn.llll[13]] = llll[47];
            byArray4[fn.llll[3]] = llll[0];
            byArray4[fn.llll[22]] = llll[48];
            byArray4[fn.llll[23]] = llll[0];
            byArray4[fn.llll[24]] = llll[18];
            byArray4[fn.llll[26]] = llll[0];
            byArray4[fn.llll[27]] = llll[21];
            byArray4[fn.llll[29]] = llll[0];
            byArray4[fn.llll[30]] = llll[11];
            byArray4[fn.llll[31]] = llll[0];
            byArray4[fn.llll[32]] = llll[11];
            byArray4[fn.llll[17]] = llll[0];
            byArray4[fn.llll[44]] = llll[41];
            byArray4[fn.llll[39]] = llll[0];
            byArray4[fn.llll[49]] = llll[47];
            byArray4[fn.llll[50]] = llll[0];
            byArray4[fn.llll[51]] = llll[48];
            dv.a(ec.a(byArray4), lllllllIIIIIlII.toByteArray());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void e() {
        byte[] byArray = new byte[llll[45]];
        byArray[fn.llll[0]] = llll[0];
        byArray[fn.llll[1]] = llll[40];
        byArray[fn.llll[5]] = llll[0];
        byArray[fn.llll[7]] = llll[46];
        byArray[fn.llll[9]] = llll[0];
        byArray[fn.llll[10]] = llll[33];
        byArray[fn.llll[12]] = llll[0];
        byArray[fn.llll[13]] = llll[47];
        byArray[fn.llll[3]] = llll[0];
        byArray[fn.llll[22]] = llll[48];
        byArray[fn.llll[23]] = llll[0];
        byArray[fn.llll[24]] = llll[18];
        byArray[fn.llll[26]] = llll[0];
        byArray[fn.llll[27]] = llll[21];
        byArray[fn.llll[29]] = llll[0];
        byArray[fn.llll[30]] = llll[11];
        byArray[fn.llll[31]] = llll[0];
        byArray[fn.llll[32]] = llll[11];
        byArray[fn.llll[17]] = llll[0];
        byArray[fn.llll[44]] = llll[41];
        byArray[fn.llll[39]] = llll[0];
        byArray[fn.llll[49]] = llll[47];
        byArray[fn.llll[50]] = llll[0];
        byArray[fn.llll[51]] = llll[48];
        if (dv.a(ec.a(byArray)) == null) {
            return;
        }
        byte[] byArray2 = new byte[llll[17]];
        byArray2[fn.llll[0]] = llll[0];
        byArray2[fn.llll[1]] = llll[52];
        byArray2[fn.llll[5]] = llll[0];
        byArray2[fn.llll[7]] = llll[33];
        byArray2[fn.llll[9]] = llll[0];
        byArray2[fn.llll[10]] = llll[19];
        byArray2[fn.llll[12]] = llll[0];
        byArray2[fn.llll[13]] = llll[53];
        byArray2[fn.llll[3]] = llll[0];
        byArray2[fn.llll[22]] = llll[14];
        byArray2[fn.llll[23]] = llll[0];
        byArray2[fn.llll[24]] = llll[25];
        byArray2[fn.llll[26]] = llll[0];
        byArray2[fn.llll[27]] = llll[28];
        byArray2[fn.llll[29]] = llll[0];
        byArray2[fn.llll[30]] = llll[11];
        byArray2[fn.llll[31]] = llll[0];
        byArray2[fn.llll[32]] = llll[33];
        System.out.println(ec.a(byArray2));
        byte[] byArray3 = new byte[llll[45]];
        byArray3[fn.llll[0]] = llll[0];
        byArray3[fn.llll[1]] = llll[40];
        byArray3[fn.llll[5]] = llll[0];
        byArray3[fn.llll[7]] = llll[46];
        byArray3[fn.llll[9]] = llll[0];
        byArray3[fn.llll[10]] = llll[33];
        byArray3[fn.llll[12]] = llll[0];
        byArray3[fn.llll[13]] = llll[47];
        byArray3[fn.llll[3]] = llll[0];
        byArray3[fn.llll[22]] = llll[48];
        byArray3[fn.llll[23]] = llll[0];
        byArray3[fn.llll[24]] = llll[18];
        byArray3[fn.llll[26]] = llll[0];
        byArray3[fn.llll[27]] = llll[21];
        byArray3[fn.llll[29]] = llll[0];
        byArray3[fn.llll[30]] = llll[11];
        byArray3[fn.llll[31]] = llll[0];
        byArray3[fn.llll[32]] = llll[11];
        byArray3[fn.llll[17]] = llll[0];
        byArray3[fn.llll[44]] = llll[41];
        byArray3[fn.llll[39]] = llll[0];
        byArray3[fn.llll[49]] = llll[47];
        byArray3[fn.llll[50]] = llll[0];
        byArray3[fn.llll[51]] = llll[48];
        ByteArrayInputStream llllllIllllIIII = new ByteArrayInputStream(dv.a(ec.a(byArray3)));
        DataInputStream llllllIlllIllll = new DataInputStream(llllllIllllIIII);
        try {
            v.bj = llllllIlllIllll.readBoolean();
            v.bt = llllllIlllIllll.readInt();
            v.bk = llllllIlllIllll.readBoolean();
            v.bu = llllllIlllIllll.readInt();
            v.bl = llllllIlllIllll.readBoolean();
            v.bv = llllllIlllIllll.readInt();
            v.bm = llllllIlllIllll.readBoolean();
            v.cA = llllllIlllIllll.readBoolean();
            v.cw = llllllIlllIllll.readBoolean();
            v.cy = llllllIlllIllll.readInt();
            v.cx = llllllIlllIllll.readBoolean();
            v.cz = llllllIlllIllll.readInt();
            v.cC = llllllIlllIllll.readBoolean();
            v.cB = llllllIlllIllll.readInt();
            v.cE = llllllIlllIllll.readBoolean();
            v.cD = llllllIlllIllll.readInt();
            v.cF = llllllIlllIllll.readBoolean();
            v.cG = llllllIlllIllll.readBoolean();
            v.cH = llllllIlllIllll.readBoolean();
            v.cv = llllllIlllIllll.readBoolean();
            v.cu = llllllIlllIllll.readBoolean();
            v.cI = llllllIlllIllll.readBoolean();
            v.cr = llllllIlllIllll.readBoolean();
            v.ct = llllllIlllIllll.readBoolean();
            v.cn = llllllIlllIllll.readBoolean();
            v.co = llllllIlllIllll.readBoolean();
            v.cp = llllllIlllIllll.readBoolean();
            v.cq = llllllIlllIllll.readBoolean();
            v.cs = llllllIlllIllll.readBoolean();
            int llllllIlllIlllI = llllllIlllIllll.readInt();
            byte[] byArray4 = new byte[llll[17]];
            byArray4[fn.llll[0]] = llll[0];
            byArray4[fn.llll[1]] = llll[34];
            byArray4[fn.llll[5]] = llll[0];
            byArray4[fn.llll[7]] = llll[11];
            byArray4[fn.llll[9]] = llll[0];
            byArray4[fn.llll[10]] = llll[21];
            byArray4[fn.llll[12]] = llll[0];
            byArray4[fn.llll[13]] = llll[35];
            byArray4[fn.llll[3]] = llll[0];
            byArray4[fn.llll[22]] = llll[36];
            byArray4[fn.llll[23]] = llll[0];
            byArray4[fn.llll[24]] = llll[21];
            byArray4[fn.llll[26]] = llll[0];
            byArray4[fn.llll[27]] = llll[37];
            byArray4[fn.llll[29]] = llll[0];
            byArray4[fn.llll[30]] = llll[38];
            byArray4[fn.llll[31]] = llll[0];
            byArray4[fn.llll[32]] = llll[14];
            System.out.println(ec.a(byArray4) + llllllIlllIlllI);
            if (at.x.length < llllllIlllIlllI) {
                at.x = new short[llll[23] * (llllllIlllIlllI / llll[23] + llll[1])];
            }
            int llllllIlllIllIl = llll[0];
            while (llllllIlllIllIl < llllllIlllIlllI) {
                at.x[llllllIlllIllIl] = llllllIlllIllll.readShort();
                ++llllllIlllIllIl;
            }
            llllllIlllIlllI = llllllIlllIllll.readInt();
            byte[] byArray5 = new byte[llll[39]];
            byArray5[fn.llll[0]] = llll[0];
            byArray5[fn.llll[1]] = llll[34];
            byArray5[fn.llll[5]] = llll[0];
            byArray5[fn.llll[7]] = llll[11];
            byArray5[fn.llll[9]] = llll[0];
            byArray5[fn.llll[10]] = llll[21];
            byArray5[fn.llll[12]] = llll[0];
            byArray5[fn.llll[13]] = llll[35];
            byArray5[fn.llll[3]] = llll[0];
            byArray5[fn.llll[22]] = llll[40];
            byArray5[fn.llll[23]] = llll[0];
            byArray5[fn.llll[24]] = llll[41];
            byArray5[fn.llll[26]] = llll[0];
            byArray5[fn.llll[27]] = llll[42];
            byArray5[fn.llll[29]] = llll[0];
            byArray5[fn.llll[30]] = llll[43];
            byArray5[fn.llll[31]] = llll[0];
            byArray5[fn.llll[32]] = llll[38];
            byArray5[fn.llll[17]] = llll[0];
            byArray5[fn.llll[44]] = llll[14];
            System.out.println(ec.a(byArray5) + llllllIlllIlllI);
            if (at.y.length < llllllIlllIlllI) {
                at.y = new short[llll[23] * (llllllIlllIlllI / llll[23] + llll[1])];
            }
            llllllIlllIllIl = llll[0];
            while (llllllIlllIllIl < llllllIlllIlllI) {
                at.y[llllllIlllIllIl] = llllllIlllIllll.readShort();
                ++llllllIlllIllIl;
            }
            v.cJ = llllllIlllIllll.readBoolean();
            v.cK = llllllIlllIllll.readBoolean();
            v.cL = llllllIlllIllll.readBoolean();
            v.cM = llllllIlllIllll.readBoolean();
            llllllIllllIIII.close();
            llllllIlllIllll.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void lIll() {
        llll = new int[54];
        fn.llll[0] = (0xB5 ^ 0xBE) << (" ".length() << " ".length()) & ~((0xC8 ^ 0xC3) << (" ".length() << " ".length()));
        fn.llll[1] = " ".length();
        fn.llll[2] = -" ".length();
        fn.llll[3] = " ".length() << "   ".length();
        fn.llll[4] = (0x4C ^ 0x59) << (" ".length() << " ".length());
        fn.llll[5] = " ".length() << " ".length();
        fn.llll[6] = (0xA9 ^ 0xA6) << " ".length();
        fn.llll[7] = "   ".length();
        fn.llll[8] = -(0x4B ^ 0x1A);
        fn.llll[9] = " ".length() << (" ".length() << " ".length());
        fn.llll[10] = 0x2F ^ 0x2A;
        fn.llll[11] = (0x2A ^ 0x37) << (" ".length() << " ".length());
        fn.llll[12] = "   ".length() << " ".length();
        fn.llll[13] = 0x47 ^ 0x40;
        fn.llll[14] = " ".length() << (0xA9 ^ 0xAC);
        fn.llll[15] = (0x7B ^ 0x5A) << " ".length();
        fn.llll[16] = -(0x60 ^ 0x33);
        fn.llll[17] = (0x73 ^ 0x7A) << " ".length();
        fn.llll[18] = 0x34 ^ 0x67;
        fn.llll[19] = 0x7D ^ 0x1C;
        fn.llll[20] = (0xB1 ^ 0x8A) << " ".length();
        fn.llll[21] = 0xF3 ^ 0x96;
        fn.llll[22] = 0x7C ^ 0x75;
        fn.llll[23] = (0xC1 ^ 0xC4) << " ".length();
        fn.llll[24] = 0x5A ^ 0x51;
        fn.llll[25] = 0x67 ^ 0x26;
        fn.llll[26] = "   ".length() << (" ".length() << " ".length());
        fn.llll[27] = 0x49 ^ 0x44;
        fn.llll[28] = 0xE4 ^ 0x91;
        fn.llll[29] = (0x7F ^ 0x78) << " ".length();
        fn.llll[30] = 0x75 ^ 0x7A;
        fn.llll[31] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        fn.llll[32] = 0x7E ^ 0x6F;
        fn.llll[33] = 0x6A ^ 5;
        fn.llll[34] = 0x40 ^ 9;
        fn.llll[35] = 0x7E ^ 0x13;
        fn.llll[36] = (0x8F ^ 0x9E) << (" ".length() << " ".length());
        fn.llll[37] = (0x1C ^ 7) << (" ".length() << " ".length());
        fn.llll[38] = (0x5B ^ 0x46) << " ".length();
        fn.llll[39] = (0x11 ^ 0x14) << (" ".length() << " ".length());
        fn.llll[40] = (0x5E ^ 0x5B) << (" ".length() << (" ".length() << " ".length()));
        fn.llll[41] = 0x3F ^ 0x56;
        fn.llll[42] = 0x36 ^ 0x55;
        fn.llll[43] = 0xF0 ^ 0x9B;
        fn.llll[44] = 0x85 ^ 0x96;
        fn.llll[45] = "   ".length() << "   ".length();
        fn.llll[46] = (0xBA ^ 0xB7) << "   ".length();
        fn.llll[47] = (4 ^ 0x33) << " ".length();
        fn.llll[48] = 0xD7 ^ 0xB0;
        fn.llll[49] = 0x23 ^ 0x36;
        fn.llll[50] = (0x70 ^ 0x7B) << " ".length();
        fn.llll[51] = 0x72 ^ 0x65;
        fn.llll[52] = (0x4E ^ 0x5D) << (" ".length() << " ".length());
        fn.llll[53] = (0xE ^ 0x17) << (" ".length() << " ".length());
    }
}

