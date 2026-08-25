/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class ev {
    public static /* synthetic */ int[][] a;
    private static /* synthetic */ Image[] g;
    public static /* synthetic */ Hashtable b;
    public /* synthetic */ short c;
    public /* synthetic */ short d;
    public /* synthetic */ short e;
    public /* synthetic */ short f;
    private static final /* synthetic */ int[] lIIlIlll;

    static {
        ev.lllIlII();
        b = new Hashtable();
    }

    public ev(int n2, int n3, int n4, int n5, int n6) {
        this.c = (short)n3;
        this.d = (short)n4;
        this.e = (short)n5;
        this.f = (short)n6;
    }

    public static void a() {
        try {
            Enumeration llIIlllllIIIIll = b.keys();
            while (llIIlllllIIIIll.hasMoreElements()) {
                String llIIlllllIIIIlI = (String)llIIlllllIIIIll.nextElement();
                dg llIIlllllIIIIIl = (dg)b.get(llIIlllllIIIIlI);
                if (System.currentTimeMillis() - llIIlllllIIIIIl.c <= 180000L) continue;
                b.remove(llIIlllllIIIIlI);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void b() {
        g = null;
        System.gc();
    }

    public static void c() {
        g = null;
        System.gc();
        Image[] imageArray = new Image[lIIlIlll[0]];
        byte[] byArray = new byte[lIIlIlll[2]];
        byArray[ev.lIIlIlll[1]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[3]] = lIIlIlll[4];
        byArray[ev.lIIlIlll[5]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[6]] = lIIlIlll[7];
        byArray[ev.lIIlIlll[8]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[0]] = lIIlIlll[9];
        byArray[ev.lIIlIlll[10]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[11]] = lIIlIlll[12];
        byArray[ev.lIIlIlll[13]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[14]] = lIIlIlll[4];
        byArray[ev.lIIlIlll[15]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[16]] = lIIlIlll[17];
        byArray[ev.lIIlIlll[18]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[19]] = lIIlIlll[7];
        byArray[ev.lIIlIlll[20]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[21]] = lIIlIlll[12];
        byArray[ev.lIIlIlll[22]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[23]] = lIIlIlll[24];
        byArray[ev.lIIlIlll[25]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[26]] = lIIlIlll[27];
        byArray[ev.lIIlIlll[28]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[29]] = lIIlIlll[30];
        byArray[ev.lIIlIlll[31]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[32]] = lIIlIlll[33];
        byArray[ev.lIIlIlll[34]] = lIIlIlll[1];
        byArray[ev.lIIlIlll[35]] = lIIlIlll[12];
        imageArray[ev.lIIlIlll[1]] = bq.e(ec.a(byArray));
        byte[] byArray2 = new byte[lIIlIlll[2]];
        byArray2[ev.lIIlIlll[1]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[3]] = lIIlIlll[4];
        byArray2[ev.lIIlIlll[5]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[6]] = lIIlIlll[7];
        byArray2[ev.lIIlIlll[8]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[0]] = lIIlIlll[9];
        byArray2[ev.lIIlIlll[10]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[11]] = lIIlIlll[12];
        byArray2[ev.lIIlIlll[13]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[14]] = lIIlIlll[4];
        byArray2[ev.lIIlIlll[15]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[16]] = lIIlIlll[17];
        byArray2[ev.lIIlIlll[18]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[19]] = lIIlIlll[7];
        byArray2[ev.lIIlIlll[20]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[21]] = lIIlIlll[12];
        byArray2[ev.lIIlIlll[22]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[23]] = lIIlIlll[36];
        byArray2[ev.lIIlIlll[25]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[26]] = lIIlIlll[27];
        byArray2[ev.lIIlIlll[28]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[29]] = lIIlIlll[30];
        byArray2[ev.lIIlIlll[31]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[32]] = lIIlIlll[33];
        byArray2[ev.lIIlIlll[34]] = lIIlIlll[1];
        byArray2[ev.lIIlIlll[35]] = lIIlIlll[12];
        imageArray[ev.lIIlIlll[3]] = bq.e(ec.a(byArray2));
        byte[] byArray3 = new byte[lIIlIlll[2]];
        byArray3[ev.lIIlIlll[1]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[3]] = lIIlIlll[4];
        byArray3[ev.lIIlIlll[5]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[6]] = lIIlIlll[7];
        byArray3[ev.lIIlIlll[8]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[0]] = lIIlIlll[9];
        byArray3[ev.lIIlIlll[10]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[11]] = lIIlIlll[12];
        byArray3[ev.lIIlIlll[13]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[14]] = lIIlIlll[4];
        byArray3[ev.lIIlIlll[15]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[16]] = lIIlIlll[17];
        byArray3[ev.lIIlIlll[18]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[19]] = lIIlIlll[7];
        byArray3[ev.lIIlIlll[20]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[21]] = lIIlIlll[12];
        byArray3[ev.lIIlIlll[22]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[23]] = lIIlIlll[37];
        byArray3[ev.lIIlIlll[25]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[26]] = lIIlIlll[27];
        byArray3[ev.lIIlIlll[28]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[29]] = lIIlIlll[30];
        byArray3[ev.lIIlIlll[31]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[32]] = lIIlIlll[33];
        byArray3[ev.lIIlIlll[34]] = lIIlIlll[1];
        byArray3[ev.lIIlIlll[35]] = lIIlIlll[12];
        imageArray[ev.lIIlIlll[5]] = bq.e(ec.a(byArray3));
        byte[] byArray4 = new byte[lIIlIlll[2]];
        byArray4[ev.lIIlIlll[1]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[3]] = lIIlIlll[4];
        byArray4[ev.lIIlIlll[5]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[6]] = lIIlIlll[7];
        byArray4[ev.lIIlIlll[8]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[0]] = lIIlIlll[9];
        byArray4[ev.lIIlIlll[10]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[11]] = lIIlIlll[12];
        byArray4[ev.lIIlIlll[13]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[14]] = lIIlIlll[4];
        byArray4[ev.lIIlIlll[15]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[16]] = lIIlIlll[17];
        byArray4[ev.lIIlIlll[18]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[19]] = lIIlIlll[7];
        byArray4[ev.lIIlIlll[20]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[21]] = lIIlIlll[12];
        byArray4[ev.lIIlIlll[22]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[23]] = lIIlIlll[38];
        byArray4[ev.lIIlIlll[25]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[26]] = lIIlIlll[27];
        byArray4[ev.lIIlIlll[28]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[29]] = lIIlIlll[30];
        byArray4[ev.lIIlIlll[31]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[32]] = lIIlIlll[33];
        byArray4[ev.lIIlIlll[34]] = lIIlIlll[1];
        byArray4[ev.lIIlIlll[35]] = lIIlIlll[12];
        imageArray[ev.lIIlIlll[6]] = bq.e(ec.a(byArray4));
        byte[] byArray5 = new byte[lIIlIlll[2]];
        byArray5[ev.lIIlIlll[1]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[3]] = lIIlIlll[4];
        byArray5[ev.lIIlIlll[5]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[6]] = lIIlIlll[7];
        byArray5[ev.lIIlIlll[8]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[0]] = lIIlIlll[9];
        byArray5[ev.lIIlIlll[10]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[11]] = lIIlIlll[12];
        byArray5[ev.lIIlIlll[13]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[14]] = lIIlIlll[4];
        byArray5[ev.lIIlIlll[15]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[16]] = lIIlIlll[17];
        byArray5[ev.lIIlIlll[18]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[19]] = lIIlIlll[7];
        byArray5[ev.lIIlIlll[20]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[21]] = lIIlIlll[12];
        byArray5[ev.lIIlIlll[22]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[23]] = lIIlIlll[39];
        byArray5[ev.lIIlIlll[25]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[26]] = lIIlIlll[27];
        byArray5[ev.lIIlIlll[28]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[29]] = lIIlIlll[30];
        byArray5[ev.lIIlIlll[31]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[32]] = lIIlIlll[33];
        byArray5[ev.lIIlIlll[34]] = lIIlIlll[1];
        byArray5[ev.lIIlIlll[35]] = lIIlIlll[12];
        imageArray[ev.lIIlIlll[8]] = bq.e(ec.a(byArray5));
        g = imageArray;
        int[] nArray = new int[lIIlIlll[3]];
        nArray[ev.lIIlIlll[1]] = lIIlIlll[40];
        Image.createRGBImage((int[])nArray, (int)lIIlIlll[3], (int)lIIlIlll[3], (boolean)lIIlIlll[3]);
    }

    public ev() {
        ev.e();
    }

    public static void d() {
        new ev();
    }

    private static void e() {
        try {
            byte[] byArray = new byte[lIIlIlll[22]];
            byArray[ev.lIIlIlll[1]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[3]] = lIIlIlll[33];
            byArray[ev.lIIlIlll[5]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[6]] = lIIlIlll[41];
            byArray[ev.lIIlIlll[8]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[0]] = lIIlIlll[42];
            byArray[ev.lIIlIlll[10]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[11]] = lIIlIlll[7];
            byArray[ev.lIIlIlll[13]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[14]] = lIIlIlll[9];
            byArray[ev.lIIlIlll[15]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[16]] = lIIlIlll[43];
            byArray[ev.lIIlIlll[18]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[19]] = lIIlIlll[12];
            byArray[ev.lIIlIlll[20]] = lIIlIlll[1];
            byArray[ev.lIIlIlll[21]] = lIIlIlll[44];
            DataInputStream llIIllllIllllIl = new DataInputStream(new ByteArrayInputStream(dv.a(ec.a(byArray))));
            short llIIllllIllllII = llIIllllIllllIl.readShort();
            a = new int[llIIllllIllllII][lIIlIlll[0]];
            int llIIllllIlllIll = lIIlIlll[1];
            while (llIIllllIlllIll < llIIllllIllllII) {
                ev.a[llIIllllIlllIll][ev.lIIlIlll[1]] = llIIllllIllllIl.readUnsignedByte();
                ev.a[llIIllllIlllIll][ev.lIIlIlll[3]] = llIIllllIllllIl.readShort();
                ev.a[llIIllllIlllIll][ev.lIIlIlll[5]] = llIIllllIllllIl.readShort();
                ev.a[llIIllllIlllIll][ev.lIIlIlll[6]] = llIIllllIllllIl.readShort();
                ev.a[llIIllllIlllIll][ev.lIIlIlll[8]] = llIIllllIllllIl.readShort();
                ++llIIllllIlllIll;
            }
        }
        catch (Exception llIIllllIllllIl) {
            llIIllllIllllIl.printStackTrace();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, byte[] byArray) {
        void llIIllllIllIllI;
        dg dg2 = (dg)b.get(String.valueOf(n2));
        if (dg2 == null) {
            dg2 = new dg();
            b.put(String.valueOf(n2), dg2);
        }
        llIIllllIllIlIl.a = av.a((byte[])llIIllllIllIllI);
        if (bs.a != lIIlIlll[3]) {
            int llIIllllIllIlll;
            dv.b(String.valueOf(llIIllllIllIlll), (byte[])llIIllllIllIllI);
        }
    }

    public static boolean a(int n2) {
        if (n2 >= a.length || a[n2][lIIlIlll[3]] >= g[a[n2][lIIlIlll[1]]].getWidth() || a[n2][lIIlIlll[6]] >= g[a[n2][lIIlIlll[1]]].getWidth() || a[n2][lIIlIlll[5]] >= g[a[n2][lIIlIlll[1]]].getHeight() || a[n2][lIIlIlll[8]] >= g[a[n2][lIIlIlll[1]]].getHeight()) {
            int llIIllllIllIIlI;
            dg llIIllllIllIIIl = (dg)b.get(String.valueOf(llIIllllIllIIlI));
            if (llIIllllIllIIIl == null) {
                llIIllllIllIIIl = new dg();
                b.put(String.valueOf(llIIllllIllIIlI), llIIllllIllIIIl);
                llIIllllIllIIIl.a = av.a(dv.a(String.valueOf(llIIllllIllIIlI)));
                if (llIIllllIllIIIl.a == null) {
                    llIIllllIllIIIl.b = System.currentTimeMillis();
                    ei.a().E(llIIllllIllIIlI);
                }
                return lIIlIlll[1];
            }
            if (llIIllllIllIIIl.a != null) {
                return lIIlIlll[3];
            }
            if (llIIllllIllIIIl.a == null && System.currentTimeMillis() - llIIllllIllIIIl.b > 60000L) {
                llIIllllIllIIIl.b = System.currentTimeMillis();
                ei.a().E(llIIllllIllIIlI);
                return lIIlIlll[1];
            }
        }
        return lIIlIlll[3];
    }

    public static int b(int n2) {
        return a[n2][lIIlIlll[8]];
    }

    /*
     * WARNING - void declaration
     */
    public static void a(fh fh2, int n2, int n3, int n4, int n5, int n6) {
        if (n2 < a.length && a[n2][lIIlIlll[3]] < g[a[n2][lIIlIlll[1]]].getWidth() && a[n2][lIIlIlll[6]] < g[a[n2][lIIlIlll[1]]].getWidth() && a[n2][lIIlIlll[5]] < g[a[n2][lIIlIlll[1]]].getHeight() && a[n2][lIIlIlll[8]] < g[a[n2][lIIlIlll[1]]].getHeight()) {
            fh2.a(g[a[n2][lIIlIlll[1]]], a[n2][lIIlIlll[3]], a[n2][lIIlIlll[5]], a[n2][lIIlIlll[6]], a[n2][lIIlIlll[8]], n5, n3, n4, n6);
        } else {
            void llIIllllIlIlIII;
            dg llIIllllIlIIIll = (dg)b.get(String.valueOf((int)llIIllllIlIlIII));
            if (llIIllllIlIIIll == null) {
                llIIllllIlIIIll = new dg();
                b.put(String.valueOf((int)llIIllllIlIlIII), llIIllllIlIIIll);
                llIIllllIlIIIll.a = av.a(dv.a(String.valueOf((int)llIIllllIlIlIII)));
                if (llIIllllIlIIIll.a == null) {
                    llIIllllIlIIIll.b = System.currentTimeMillis();
                    ei.a().E((int)llIIllllIlIlIII);
                }
            } else if (llIIllllIlIIIll.a == null && System.currentTimeMillis() - llIIllllIlIIIll.b > 60000L) {
                llIIllllIlIIIll.b = System.currentTimeMillis();
                ei.a().E((int)llIIllllIlIlIII);
            }
            if (llIIllllIlIIIll != null) {
                if (llIIllllIlIIIll.a != null) {
                    void llIIllllIlIIlII;
                    void llIIllllIlIIllI;
                    void llIIllllIlIIlll;
                    void llIIllllIlIIlIl;
                    fh llIIllllIlIlIIl;
                    llIIllllIlIlIIl.a(llIIllllIlIIIll.a, lIIlIlll[1], lIIlIlll[1], llIIllllIlIIIll.a.getWidth(), llIIllllIlIIIll.a.getHeight(), (int)llIIllllIlIIlIl, (int)llIIllllIlIIlll, (int)llIIllllIlIIllI, (int)llIIllllIlIIlII);
                }
                llIIllllIlIIIll.c = System.currentTimeMillis();
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(fh fh2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 < a.length && a[n2][lIIlIlll[3]] < g[a[n2][lIIlIlll[1]]].getWidth() && a[n2][lIIlIlll[6]] < g[a[n2][lIIlIlll[1]]].getWidth() && a[n2][lIIlIlll[5]] < g[a[n2][lIIlIlll[1]]].getHeight() && a[n2][lIIlIlll[8]] < g[a[n2][lIIlIlll[1]]].getHeight()) {
            fh2.a(g[a[n2][lIIlIlll[1]]], a[n2][lIIlIlll[3]], a[n2][lIIlIlll[5]], a[n2][lIIlIlll[6]], a[n2][lIIlIlll[8]], lIIlIlll[1], n3, n4, lIIlIlll[6]);
        } else {
            int llIIllllIIllIlI;
            dg llIIllllIIlIlIl = (dg)b.get(String.valueOf(llIIllllIIllIlI));
            if (llIIllllIIlIlIl == null) {
                llIIllllIIlIlIl = new dg();
                b.put(String.valueOf(llIIllllIIllIlI), llIIllllIIlIlIl);
                llIIllllIIlIlIl.a = av.a(dv.a(String.valueOf(llIIllllIIllIlI)));
                if (llIIllllIIlIlIl.a == null) {
                    llIIllllIIlIlIl.b = System.currentTimeMillis();
                    ei.a().E(llIIllllIIllIlI);
                }
            } else if (llIIllllIIlIlIl.a == null && System.currentTimeMillis() - llIIllllIIlIlIl.b > 60000L) {
                llIIllllIIlIlIl.b = System.currentTimeMillis();
                ei.a().E(llIIllllIIllIlI);
            }
            if (llIIllllIIlIlIl != null) {
                if (llIIllllIIlIlIl.a != null) {
                    void llIIllllIIllIII;
                    void llIIllllIIllIIl;
                    fh llIIllllIIllIll;
                    if (llIIllllIIlIlIl.a.getHeight() > lIIlIlll[45]) {
                        void llIIllllIIlIllI;
                        llIIllllIIllIlI = llIIllllIIlIlIl.a.getWidth();
                        int llIIllllIIlIlll = llIIllllIIlIlIl.a.getHeight() / lIIlIlll[6];
                        llIIllllIIllIll.a(llIIllllIIlIlIl.a, lIIlIlll[1], (int)(llIIllllIIlIllI * llIIllllIIlIlll), llIIllllIIllIlI, llIIllllIIlIlll, lIIlIlll[1], (int)llIIllllIIllIIl, (int)llIIllllIIllIII, lIIlIlll[6]);
                    } else {
                        llIIllllIIllIll.a(llIIllllIIlIlIl.a, lIIlIlll[1], lIIlIlll[1], llIIllllIIlIlIl.a.getWidth(), llIIllllIIlIlIl.a.getHeight(), lIIlIlll[1], (int)llIIllllIIllIIl, (int)llIIllllIIllIII, lIIlIlll[6]);
                    }
                }
                llIIllllIIlIlIl.c = System.currentTimeMillis();
                return;
            }
        }
    }

    private static void lllIlII() {
        lIIlIlll = new int[46];
        ev.lIIlIlll[0] = 0x1E ^ 0x1B;
        ev.lIIlIlll[1] = " ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()));
        ev.lIIlIlll[2] = (0x5D ^ 0x50) << " ".length();
        ev.lIIlIlll[3] = " ".length();
        ev.lIIlIlll[4] = 0xAB ^ 0x84;
        ev.lIIlIlll[5] = " ".length() << " ".length();
        ev.lIIlIlll[6] = "   ".length();
        ev.lIIlIlll[7] = 0x6E ^ 7;
        ev.lIIlIlll[8] = " ".length() << (" ".length() << " ".length());
        ev.lIIlIlll[9] = 0xAC ^ 0xC1;
        ev.lIIlIlll[10] = "   ".length() << " ".length();
        ev.lIIlIlll[11] = 0x7B ^ 0x7C;
        ev.lIIlIlll[12] = 0x5C ^ 0x3B;
        ev.lIIlIlll[13] = " ".length() << "   ".length();
        ev.lIIlIlll[14] = 0x78 ^ 0x71;
        ev.lIIlIlll[15] = (0x5D ^ 0x58) << " ".length();
        ev.lIIlIlll[16] = 0x40 ^ 0x4B;
        ev.lIIlIlll[17] = (0x38 ^ 0x19) << " ".length();
        ev.lIIlIlll[18] = "   ".length() << (" ".length() << " ".length());
        ev.lIIlIlll[19] = 0x9F ^ 0x92;
        ev.lIIlIlll[20] = (0x9C ^ 0x9B) << " ".length();
        ev.lIIlIlll[21] = 0x64 ^ 0x6B;
        ev.lIIlIlll[22] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        ev.lIIlIlll[23] = 0xBD ^ 0xAC;
        ev.lIIlIlll[24] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        ev.lIIlIlll[25] = (0xAC ^ 0xA5) << " ".length();
        ev.lIIlIlll[26] = 0x9C ^ 0x8F;
        ev.lIIlIlll[27] = (4 ^ 0x13) << " ".length();
        ev.lIIlIlll[28] = (0x82 ^ 0x87) << (" ".length() << " ".length());
        ev.lIIlIlll[29] = 0x17 ^ 2;
        ev.lIIlIlll[30] = (0x55 ^ 0x52) << (" ".length() << (" ".length() << " ".length()));
        ev.lIIlIlll[31] = (0x19 ^ 0x12) << " ".length();
        ev.lIIlIlll[32] = 0x43 ^ 0x54;
        ev.lIIlIlll[33] = (0x70 ^ 0x47) << " ".length();
        ev.lIIlIlll[34] = "   ".length() << "   ".length();
        ev.lIIlIlll[35] = 0x3F ^ 0x26;
        ev.lIIlIlll[36] = 0xA7 ^ 0x96;
        ev.lIIlIlll[37] = (0xB8 ^ 0xA1) << " ".length();
        ev.lIIlIlll[38] = 0xBD ^ 0x8E;
        ev.lIIlIlll[39] = (0x62 ^ 0x6F) << (" ".length() << " ".length());
        ev.lIIlIlll[40] = -(577352832 + 961275566 - 749394418 + 1224031940);
        ev.lIIlIlll[41] = (0xB5 ^ 0x80) << " ".length();
        ev.lIIlIlll[42] = 0x22 ^ 0x7D;
        ev.lIIlIlll[43] = 0x18 ^ 0x79;
        ev.lIIlIlll[44] = 0xF2 ^ 0x97;
        ev.lIIlIlll[45] = 3 ^ 0x20;
    }
}

