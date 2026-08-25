/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public class dj
extends fj {
    private static /* synthetic */ dj d;
    public static /* synthetic */ Image a;
    public static /* synthetic */ Image b;
    private static /* synthetic */ String e;
    private /* synthetic */ int f;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private /* synthetic */ int j;
    private /* synthetic */ String k;
    private /* synthetic */ int l;
    private /* synthetic */ long m;
    public static /* synthetic */ long c;
    private static final /* synthetic */ int[] lIlIIIl;

    static {
        dj.llllII();
        e = null;
        c = 0L;
    }

    public dj() {
        this.k = "";
        this.l = lIlIIIl[0];
        this.m = 0L;
    }

    public static dj b() {
        byte[] byArray = new byte[lIlIIIl[1]];
        byArray[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[2]] = lIlIIIl[3];
        byArray[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[5]] = lIlIIIl[6];
        byArray[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[8]] = lIlIIIl[9];
        byArray[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[11]] = lIlIIIl[12];
        byArray[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[14]] = lIlIIIl[12];
        byArray[dj.lIlIIIl[15]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[16]] = lIlIIIl[17];
        byArray[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[19]] = lIlIIIl[20];
        byArray[dj.lIlIIIl[21]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[22]] = lIlIIIl[23];
        byArray[dj.lIlIIIl[24]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[25]] = lIlIIIl[26];
        a = dj.a(dj.a(ec.a(byArray), lIlIIIl[0]));
        byte[] byArray2 = new byte[lIlIIIl[1]];
        byArray2[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[2]] = lIlIIIl[3];
        byArray2[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[5]] = lIlIIIl[6];
        byArray2[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[8]] = lIlIIIl[9];
        byArray2[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[11]] = lIlIIIl[12];
        byArray2[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[14]] = lIlIIIl[12];
        byArray2[dj.lIlIIIl[15]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[16]] = lIlIIIl[17];
        byArray2[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[19]] = lIlIIIl[20];
        byArray2[dj.lIlIIIl[21]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[22]] = lIlIIIl[23];
        byArray2[dj.lIlIIIl[24]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[25]] = lIlIIIl[26];
        b = dj.a(dj.a(ec.a(byArray2), lIlIIIl[2]));
        byte[] byArray3 = new byte[lIlIIIl[1]];
        byArray3[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[2]] = lIlIIIl[3];
        byArray3[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[5]] = lIlIIIl[6];
        byArray3[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[8]] = lIlIIIl[9];
        byArray3[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[11]] = lIlIIIl[12];
        byArray3[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[14]] = lIlIIIl[12];
        byArray3[dj.lIlIIIl[15]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[16]] = lIlIIIl[17];
        byArray3[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[19]] = lIlIIIl[20];
        byArray3[dj.lIlIIIl[21]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[22]] = lIlIIIl[23];
        byArray3[dj.lIlIIIl[24]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[25]] = lIlIIIl[26];
        cr.a = dj.a(dj.a(ec.a(byArray3), lIlIIIl[0]));
        if (d == null) {
            d = new dj();
        }
        return d;
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] a(String string, int n2) {
        byte[] byArray = new byte[lIlIIIl[21]];
        byArray[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[2]] = lIlIIIl[27];
        byArray[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[5]] = lIlIIIl[28];
        byArray[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[8]] = lIlIIIl[29];
        byArray[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[11]] = lIlIIIl[30];
        byArray[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[14]] = lIlIIIl[26];
        byArray[dj.lIlIIIl[15]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[16]] = lIlIIIl[31];
        byArray[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[19]] = lIlIIIl[27];
        String[] stringArray = bs.b(string).split(ec.a(byArray));
        byte[] byArray2 = new byte[lIlIIIl[4]];
        byArray2[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[2]] = lIlIIIl[32];
        String[] stringArray2 = stringArray[n2].split(ec.a(byArray2));
        byte[] byArray3 = new byte[stringArray2.length];
        int n3 = lIlIIIl[0];
        while (n3 < stringArray2.length) {
            void llllIIIIlIlIllI;
            void llllIIIIlIllIII;
            if (!llllIIIIlIllIII[llllIIIIlIlIllI].equals("")) {
                try {
                    llllIIIIlIlIlll[llllIIIIlIlIllI] = Byte.parseByte((String)llllIIIIlIllIII[llllIIIIlIlIllI]);
                }
                catch (Exception llllIIIIlIlIlIl) {
                    // empty catch block
                }
            }
            ++llllIIIIlIlIllI;
        }
        return byArray3;
    }

    private static byte[] a(String string) {
        File llllIIIIlIIllIl = new File(string);
        try {
            Throwable llllIIIIlIIllII = null;
            Object llllIIIIlIIlIll22 = null;
            try (FileInputStream llllIIIIlIIlIlI = new FileInputStream(llllIIIIlIIllIl);){
                byte[] llllIIIIlIIlIIl = new byte[(int)llllIIIIlIIllIl.length()];
                llllIIIIlIIlIlI.read(llllIIIIlIIlIIl);
                return llllIIIIlIIlIIl;
            }
            catch (Throwable llllIIIIlIIlIll22) {
                if (llllIIIIlIIllII == null) {
                    llllIIIIlIIllII = llllIIIIlIIlIll22;
                } else if (llllIIIIlIIllII != llllIIIIlIIlIll22) {
                    llllIIIIlIIllII.addSuppressed(llllIIIIlIIlIll22);
                }
                throw llllIIIIlIIllII;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    private static Image a(byte[] byArray) {
        ByteArrayInputStream llllIIIIlIIIlII = new ByteArrayInputStream(byArray);
        try {
            return Image.createImage((InputStream)llllIIIIlIIIlII);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public final void c() {
        dj llllIIIIlIIIIIl;
        bt.c = bq.B;
        if (bq.T == lIlIIIl[4]) {
            bq.d(lIlIIIl[0]);
        } else {
            bq.d(fb.m);
        }
        super.c();
        if (bt.a != null) {
            bt.a = null;
        }
        if ((fb.m = (byte)(System.currentTimeMillis() % 9L)) == lIlIIIl[8] || fb.m == lIlIIIl[10]) {
            fb.m = (byte)lIlIIIl[7];
        }
        bt.a(lIlIIIl[2]);
        bt.i = lIlIIIl[33];
        llllIIIIlIIIIIl.g = lIlIIIl[3];
        llllIIIIlIIIIIl.h = lIlIIIl[34];
        llllIIIIlIIIIIl.i = bq.A / lIlIIIl[4] - llllIIIIlIIIIIl.g / lIlIIIl[4];
        llllIIIIlIIIIIl.j = bq.B / lIlIIIl[4] - llllIIIIlIIIIIl.h / lIlIIIl[4] + lIlIIIl[35];
        llllIIIIlIIIIIl.f = lIlIIIl[0];
        if (e == null) {
            byte[] byArray = new byte[lIlIIIl[35]];
            byArray[dj.lIlIIIl[0]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[2]] = lIlIIIl[36];
            byArray[dj.lIlIIIl[4]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[5]] = lIlIIIl[37];
            byArray[dj.lIlIIIl[7]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[8]] = lIlIIIl[38];
            byArray[dj.lIlIIIl[10]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[11]] = lIlIIIl[39];
            byArray[dj.lIlIIIl[13]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[14]] = lIlIIIl[36];
            byArray[dj.lIlIIIl[15]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[16]] = lIlIIIl[40];
            byArray[dj.lIlIIIl[18]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[19]] = lIlIIIl[41];
            byArray[dj.lIlIIIl[21]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[22]] = lIlIIIl[17];
            byArray[dj.lIlIIIl[24]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[25]] = lIlIIIl[36];
            byArray[dj.lIlIIIl[1]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[42]] = lIlIIIl[43];
            byArray[dj.lIlIIIl[44]] = lIlIIIl[0];
            byArray[dj.lIlIIIl[45]] = lIlIIIl[46];
            e = ec.a(byArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        void llllIIIIIllllIl;
        dj llllIIIIIlllllI;
        fh2.a(lIlIIIl[0]);
        fh2.c(lIlIIIl[0], lIlIIIl[0], bq.A, bq.B);
        bq.a(fh2);
        if (a != null) {
            fh2.a(a, bq.C, this.f, lIlIIIl[5]);
        }
        dp.a(llllIIIIIlllllI.i, llllIIIIIlllllI.j, llllIIIIIlllllI.g, llllIIIIIlllllI.h, (fh)llllIIIIIllllIl);
        llllIIIIIllllIl.a(dp.c);
        byte[] byArray = new byte[lIlIIIl[21]];
        byArray[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[2]] = lIlIIIl[39];
        byArray[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[5]] = lIlIIIl[29];
        byArray[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[8]] = lIlIIIl[47];
        byArray[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[11]] = lIlIIIl[48];
        byArray[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[14]] = lIlIIIl[49];
        byArray[dj.lIlIIIl[15]] = lIlIIIl[50];
        byArray[dj.lIlIIIl[16]] = lIlIIIl[51];
        byArray[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray[dj.lIlIIIl[19]] = lIlIIIl[52];
        byte[] byArray2 = new byte[lIlIIIl[21]];
        byArray2[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[2]] = lIlIIIl[39];
        byArray2[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[5]] = lIlIIIl[29];
        byArray2[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[8]] = lIlIIIl[47];
        byArray2[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[11]] = lIlIIIl[48];
        byArray2[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[14]] = lIlIIIl[49];
        byArray2[dj.lIlIIIl[15]] = lIlIIIl[50];
        byArray2[dj.lIlIIIl[16]] = lIlIIIl[51];
        byArray2[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray2[dj.lIlIIIl[19]] = lIlIIIl[52];
        llllIIIIIllllIl.b(bq.C - fg.o.a(ec.a(byArray)) / lIlIIIl[4] - lIlIIIl[35], llllIIIIIlllllI.j + lIlIIIl[11], fg.o.a(ec.a(byArray2)) + lIlIIIl[53], lIlIIIl[54], lIlIIIl[10], lIlIIIl[10]);
        llllIIIIIllllIl.a(dp.b);
        byte[] byArray3 = new byte[lIlIIIl[21]];
        byArray3[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[2]] = lIlIIIl[39];
        byArray3[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[5]] = lIlIIIl[29];
        byArray3[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[8]] = lIlIIIl[47];
        byArray3[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[11]] = lIlIIIl[48];
        byArray3[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[14]] = lIlIIIl[49];
        byArray3[dj.lIlIIIl[15]] = lIlIIIl[50];
        byArray3[dj.lIlIIIl[16]] = lIlIIIl[51];
        byArray3[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray3[dj.lIlIIIl[19]] = lIlIIIl[52];
        byte[] byArray4 = new byte[lIlIIIl[21]];
        byArray4[dj.lIlIIIl[0]] = lIlIIIl[0];
        byArray4[dj.lIlIIIl[2]] = lIlIIIl[39];
        byArray4[dj.lIlIIIl[4]] = lIlIIIl[0];
        byArray4[dj.lIlIIIl[5]] = lIlIIIl[29];
        byArray4[dj.lIlIIIl[7]] = lIlIIIl[0];
        byArray4[dj.lIlIIIl[8]] = lIlIIIl[47];
        byArray4[dj.lIlIIIl[10]] = lIlIIIl[0];
        byArray4[dj.lIlIIIl[11]] = lIlIIIl[48];
        byArray4[dj.lIlIIIl[13]] = lIlIIIl[0];
        byArray4[dj.lIlIIIl[14]] = lIlIIIl[49];
        byArray4[dj.lIlIIIl[15]] = lIlIIIl[50];
        byArray4[dj.lIlIIIl[16]] = lIlIIIl[51];
        byArray4[dj.lIlIIIl[18]] = lIlIIIl[0];
        byArray4[dj.lIlIIIl[19]] = lIlIIIl[52];
        llllIIIIIllllIl.a(bq.C - fg.o.a(ec.a(byArray3)) / lIlIIIl[4] - lIlIIIl[35], llllIIIIIlllllI.j + lIlIIIl[11], fg.o.a(ec.a(byArray4)) + lIlIIIl[53], lIlIIIl[54], lIlIIIl[10], lIlIIIl[10]);
        fg.o.a((fh)llllIIIIIllllIl, llllIIIIIlllllI.k, bq.C, llllIIIIIlllllI.j + lIlIIIl[18], lIlIIIl[4]);
        super.a((fh)llllIIIIIllllIl);
        if (bq.J == null) {
            dp.a((fh)llllIIIIIllllIl, llllIIIIIlllllI.cp, llllIIIIIlllllI.cq, llllIIIIIlllllI.cr);
        }
    }

    @Override
    public final void a() {
        dj llllIIIIIlllIll;
        if (this.l < e.length() && System.currentTimeMillis() - this.m >= 100L) {
            this.k = String.valueOf(this.k) + e.charAt(this.l);
            this.l += lIlIIIl[2];
            this.m = System.currentTimeMillis();
        }
        if ((llllIIIIIlllIll.f += lIlIIIl[4]) >= llllIIIIIlllIll.j - lIlIIIl[55]) {
            llllIIIIIlllIll.f = llllIIIIIlllIll.j - lIlIIIl[55];
            if (c == 0L) {
                c = System.currentTimeMillis();
                bq.J = null;
                bs.c();
                dv.a();
                bq.b();
                bq.G.c();
            }
        }
        if ((bt.i += lIlIIIl[2]) > bq.A * lIlIIIl[5] + lIlIIIl[33]) {
            bt.i = lIlIIIl[33];
        }
        super.a();
    }

    private static void llllII() {
        lIlIIIl = new int[56];
        dj.lIlIIIl[0] = "   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()));
        dj.lIlIIIl[1] = (0xA9 ^ 0xA0) << " ".length();
        dj.lIlIIIl[2] = " ".length();
        dj.lIlIIIl[3] = (0x47 ^ 0x48) << "   ".length();
        dj.lIlIIIl[4] = " ".length() << " ".length();
        dj.lIlIIIl[5] = "   ".length();
        dj.lIlIIIl[6] = 0x64 ^ 0x55;
        dj.lIlIIIl[7] = " ".length() << (" ".length() << " ".length());
        dj.lIlIIIl[8] = 0x38 ^ 0x3D;
        dj.lIlIIIl[9] = 0x56 ^ 0x79;
        dj.lIlIIIl[10] = "   ".length() << " ".length();
        dj.lIlIIIl[11] = 0x40 ^ 0x47;
        dj.lIlIIIl[12] = (0x22 ^ 0x3F) << (" ".length() << " ".length());
        dj.lIlIIIl[13] = " ".length() << "   ".length();
        dj.lIlIIIl[14] = 0x99 ^ 0x90;
        dj.lIlIIIl[15] = (0x5D ^ 0x58) << " ".length();
        dj.lIlIIIl[16] = 0x47 ^ 0x4C;
        dj.lIlIIIl[17] = (1 ^ 0x16) << " ".length();
        dj.lIlIIIl[18] = "   ".length() << (" ".length() << " ".length());
        dj.lIlIIIl[19] = 0x4F ^ 0x42;
        dj.lIlIIIl[20] = (0x78 ^ 0x7F) << (" ".length() << (" ".length() << " ".length()));
        dj.lIlIIIl[21] = (0x7C ^ 0x7B) << " ".length();
        dj.lIlIIIl[22] = 0x81 ^ 0x8E;
        dj.lIlIIIl[23] = (0x15 ^ 0x22) << " ".length();
        dj.lIlIIIl[24] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        dj.lIlIIIl[25] = 0x48 ^ 0x59;
        dj.lIlIIIl[26] = 0xF9 ^ 0x9E;
        dj.lIlIIIl[27] = 0x5B ^ 4;
        dj.lIlIIIl[28] = 0x30 ^ 0x5B;
        dj.lIlIIIl[29] = (0x86 ^ 0x8B) << "   ".length();
        dj.lIlIIIl[30] = 6 ^ 0x69;
        dj.lIlIIIl[31] = 0xEC ^ 0x8D;
        dj.lIlIIIl[32] = (0xAA ^ 0xA1) << (" ".length() << " ".length());
        dj.lIlIIIl[33] = (0xA8 ^ 0xB1) << (" ".length() << " ".length());
        dj.lIlIIIl[34] = (0x27 ^ 0x34) << " ".length();
        dj.lIlIIIl[35] = (0x93 ^ 0x98) << " ".length();
        dj.lIlIIIl[36] = (0xBE ^ 0x99) << " ".length();
        dj.lIlIIIl[37] = 0x23 ^ 0x6A;
        dj.lIlIIIl[38] = 0x77 ^ 0x34;
        dj.lIlIIIl[39] = 0x47 ^ 0xC;
        dj.lIlIIIl[40] = 0x10 ^ 0x43;
        dj.lIlIIIl[41] = 0xF1 ^ 0xBE;
        dj.lIlIIIl[42] = 0xA9 ^ 0xBA;
        dj.lIlIIIl[43] = 0x66 ^ 0x23;
        dj.lIlIIIl[44] = (0x23 ^ 0x26) << (" ".length() << " ".length());
        dj.lIlIIIl[45] = 0xAF ^ 0xBA;
        dj.lIlIIIl[46] = (0x5A ^ 0x4F) << (" ".length() << " ".length());
        dj.lIlIIIl[47] = 0x5C ^ 0x29;
        dj.lIlIIIl[48] = " ".length() << (0x8B ^ 0x8E);
        dj.lIlIIIl[49] = (0x62 ^ 0x49) << " ".length();
        dj.lIlIIIl[50] = (0x71 ^ 0x7E) << " ".length();
        dj.lIlIIIl[51] = -(0x2B ^ 0x24);
        dj.lIlIIIl[52] = 0xCC ^ 0xAF;
        dj.lIlIIIl[53] = (0x56 ^ 0x53) << "   ".length();
        dj.lIlIIIl[54] = "   ".length() << "   ".length();
        dj.lIlIIIl[55] = (0x69 ^ 0x66) << (" ".length() << " ".length());
    }
}

