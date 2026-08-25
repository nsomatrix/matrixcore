/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import javax.microedition.rms.RecordStore;

public final class dv {
    private static final /* synthetic */ int[] lIllI;

    public static void a(String llllllIIlIIIlll, byte[] llllllIIlIIIllI) {
        try {
            byte[] byArray = new byte[lIllI[0]];
            byArray[dv.lIllI[1]] = lIllI[1];
            byArray[dv.lIllI[2]] = lIllI[3];
            byArray[dv.lIllI[4]] = lIllI[1];
            byArray[dv.lIllI[5]] = lIllI[6];
            RecordStore llllllIIlIIIlIl = RecordStore.openRecordStore((String)(ec.a(byArray) + llllllIIlIIIlll), (boolean)lIllI[2]);
            if (llllllIIlIIIlIl.getNumRecords() > 0) {
                llllllIIlIIIlIl.setRecord(lIllI[2], llllllIIlIIIllI, lIllI[1], llllllIIlIIIllI.length);
            } else {
                llllllIIlIIIlIl.addRecord(llllllIIlIIIllI, lIllI[1], llllllIIlIIIllI.length);
            }
            llllllIIlIIIlIl.closeRecordStore();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static byte[] a(String llllllIIlIIIIIl) {
        try {
            byte[] byArray = new byte[lIllI[0]];
            byArray[dv.lIllI[1]] = lIllI[1];
            byArray[dv.lIllI[2]] = lIllI[3];
            byArray[dv.lIllI[4]] = lIllI[1];
            byArray[dv.lIllI[5]] = lIllI[6];
            RecordStore llllllIIlIIIIII = RecordStore.openRecordStore((String)(ec.a(byArray) + llllllIIlIIIIIl), (boolean)lIllI[1]);
            byte[] llllllIIIllllll = llllllIIlIIIIII.getRecord(lIllI[2]);
            llllllIIlIIIIII.closeRecordStore();
            return llllllIIIllllll;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(String llllllIIIlllIll, int llllllIIIlllIlI) {
        try {
            byte[] byArray = new byte[lIllI[2]];
            byArray[dv.lIllI[1]] = (byte)llllllIIIlllIlI;
            dv.a(llllllIIIlllIll, byArray);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void a(String llllllIIIllIlIl, String llllllIIIllIlII) {
        try {
            byte[] byArray = new byte[lIllI[7]];
            byArray[dv.lIllI[1]] = lIllI[1];
            byArray[dv.lIllI[2]] = lIllI[8];
            byArray[dv.lIllI[4]] = lIllI[1];
            byArray[dv.lIllI[5]] = lIllI[9];
            byArray[dv.lIllI[0]] = lIllI[1];
            byArray[dv.lIllI[10]] = lIllI[11];
            byArray[dv.lIllI[12]] = lIllI[1];
            byArray[dv.lIllI[13]] = lIllI[14];
            byArray[dv.lIllI[15]] = lIllI[1];
            byArray[dv.lIllI[16]] = lIllI[17];
            dv.a(llllllIIIllIlIl, llllllIIIllIlII.getBytes(ec.a(byArray)));
        }
        catch (Exception llllllIIIllIIll) {
            llllllIIIllIIll.printStackTrace();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String b(String string) {
        byte[] byArray = dv.a(string);
        if (byArray == null) {
            return null;
        }
        try {
            void llllllIIIlIlllI;
            byte[] byArray2 = new byte[lIllI[7]];
            byArray2[dv.lIllI[1]] = lIllI[1];
            byArray2[dv.lIllI[2]] = lIllI[8];
            byArray2[dv.lIllI[4]] = lIllI[1];
            byArray2[dv.lIllI[5]] = lIllI[9];
            byArray2[dv.lIllI[0]] = lIllI[1];
            byArray2[dv.lIllI[10]] = lIllI[11];
            byArray2[dv.lIllI[12]] = lIllI[1];
            byArray2[dv.lIllI[13]] = lIllI[14];
            byArray2[dv.lIllI[15]] = lIllI[1];
            byArray2[dv.lIllI[16]] = lIllI[17];
            return new String((byte[])llllllIIIlIlllI, ec.a(byArray2));
        }
        catch (Exception exception) {
            return new String(byArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int c(String string) {
        void llllllIIIlIlIIl;
        byte[] byArray = dv.a(string);
        return byArray == null ? lIllI[18] : llllllIIIlIlIIl[lIllI[1]];
    }

    private static void d(String llllllIIIlIIllI) {
        try {
            byte[] byArray = new byte[lIllI[0]];
            byArray[dv.lIllI[1]] = lIllI[1];
            byArray[dv.lIllI[2]] = lIllI[3];
            byArray[dv.lIllI[4]] = lIllI[1];
            byArray[dv.lIllI[5]] = lIllI[6];
            RecordStore.deleteRecordStore((String)(ec.a(byArray) + llllllIIIlIIllI));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void b(String llllllIIIlIIIIl, byte[] llllllIIIlIIIII) {
        try {
            byte[] byArray = new byte[lIllI[0]];
            byArray[dv.lIllI[1]] = lIllI[1];
            byArray[dv.lIllI[2]] = lIllI[3];
            byArray[dv.lIllI[4]] = lIllI[1];
            byArray[dv.lIllI[5]] = lIllI[6];
            RecordStore llllllIIIIlllll = RecordStore.openRecordStore((String)(ec.a(byArray) + llllllIIIlIIIIl), (boolean)lIllI[2]);
            if (llllllIIIIlllll.getNumRecords() > 0) {
                llllllIIIIlllll.setRecord(lIllI[2], llllllIIIlIIIII, lIllI[1], llllllIIIlIIIII.length);
            } else {
                llllllIIIIlllll.addRecord(llllllIIIlIIIII, lIllI[1], llllllIIIlIIIII.length);
            }
            llllllIIIIlllll.closeRecordStore();
        }
        catch (Exception llllllIIIIlllll) {
            llllllIIIIlllll.printStackTrace();
        }
    }

    public static void a() {
        byte[] byArray = new byte[lIllI[19]];
        byArray[dv.lIllI[1]] = lIllI[1];
        byArray[dv.lIllI[2]] = lIllI[20];
        byArray[dv.lIllI[4]] = lIllI[1];
        byArray[dv.lIllI[5]] = lIllI[6];
        byArray[dv.lIllI[0]] = lIllI[1];
        byArray[dv.lIllI[10]] = lIllI[21];
        byArray[dv.lIllI[12]] = lIllI[1];
        byArray[dv.lIllI[13]] = lIllI[22];
        byArray[dv.lIllI[15]] = lIllI[1];
        byArray[dv.lIllI[16]] = lIllI[23];
        byArray[dv.lIllI[7]] = lIllI[1];
        byArray[dv.lIllI[24]] = lIllI[23];
        byArray[dv.lIllI[25]] = lIllI[1];
        byArray[dv.lIllI[26]] = lIllI[27];
        byArray[dv.lIllI[28]] = lIllI[1];
        byArray[dv.lIllI[29]] = lIllI[30];
        dv.d(ec.a(byArray));
        byte[] byArray2 = new byte[lIllI[31]];
        byArray2[dv.lIllI[1]] = lIllI[1];
        byArray2[dv.lIllI[2]] = lIllI[20];
        byArray2[dv.lIllI[4]] = lIllI[1];
        byArray2[dv.lIllI[5]] = lIllI[6];
        byArray2[dv.lIllI[0]] = lIllI[1];
        byArray2[dv.lIllI[10]] = lIllI[21];
        byArray2[dv.lIllI[12]] = lIllI[1];
        byArray2[dv.lIllI[13]] = lIllI[32];
        byArray2[dv.lIllI[15]] = lIllI[1];
        byArray2[dv.lIllI[16]] = lIllI[33];
        byArray2[dv.lIllI[7]] = lIllI[1];
        byArray2[dv.lIllI[24]] = lIllI[33];
        byArray2[dv.lIllI[25]] = lIllI[1];
        byArray2[dv.lIllI[26]] = lIllI[32];
        byArray2[dv.lIllI[28]] = lIllI[1];
        byArray2[dv.lIllI[29]] = lIllI[34];
        byArray2[dv.lIllI[19]] = lIllI[1];
        byArray2[dv.lIllI[35]] = lIllI[36];
        dv.d(ec.a(byArray2));
        byte[] byArray3 = new byte[lIllI[19]];
        byArray3[dv.lIllI[1]] = lIllI[1];
        byArray3[dv.lIllI[2]] = lIllI[20];
        byArray3[dv.lIllI[4]] = lIllI[1];
        byArray3[dv.lIllI[5]] = lIllI[6];
        byArray3[dv.lIllI[0]] = lIllI[1];
        byArray3[dv.lIllI[10]] = lIllI[21];
        byArray3[dv.lIllI[12]] = lIllI[1];
        byArray3[dv.lIllI[13]] = lIllI[37];
        byArray3[dv.lIllI[15]] = lIllI[1];
        byArray3[dv.lIllI[16]] = lIllI[38];
        byArray3[dv.lIllI[7]] = lIllI[1];
        byArray3[dv.lIllI[24]] = lIllI[22];
        byArray3[dv.lIllI[25]] = lIllI[1];
        byArray3[dv.lIllI[26]] = lIllI[39];
        byArray3[dv.lIllI[28]] = lIllI[1];
        byArray3[dv.lIllI[29]] = lIllI[32];
        dv.d(ec.a(byArray3));
        byte[] byArray4 = new byte[lIllI[28]];
        byArray4[dv.lIllI[1]] = lIllI[1];
        byArray4[dv.lIllI[2]] = lIllI[20];
        byArray4[dv.lIllI[4]] = lIllI[1];
        byArray4[dv.lIllI[5]] = lIllI[6];
        byArray4[dv.lIllI[0]] = lIllI[1];
        byArray4[dv.lIllI[10]] = lIllI[21];
        byArray4[dv.lIllI[12]] = lIllI[1];
        byArray4[dv.lIllI[13]] = lIllI[40];
        byArray4[dv.lIllI[15]] = lIllI[1];
        byArray4[dv.lIllI[16]] = lIllI[22];
        byArray4[dv.lIllI[7]] = lIllI[1];
        byArray4[dv.lIllI[24]] = lIllI[23];
        byArray4[dv.lIllI[25]] = lIllI[1];
        byArray4[dv.lIllI[26]] = lIllI[36];
        dv.d(ec.a(byArray4));
        byte[] byArray5 = new byte[lIllI[19]];
        byArray5[dv.lIllI[1]] = lIllI[1];
        byArray5[dv.lIllI[2]] = lIllI[20];
        byArray5[dv.lIllI[4]] = lIllI[1];
        byArray5[dv.lIllI[5]] = lIllI[6];
        byArray5[dv.lIllI[0]] = lIllI[1];
        byArray5[dv.lIllI[10]] = lIllI[21];
        byArray5[dv.lIllI[12]] = lIllI[1];
        byArray5[dv.lIllI[13]] = lIllI[41];
        byArray5[dv.lIllI[15]] = lIllI[1];
        byArray5[dv.lIllI[16]] = lIllI[42];
        byArray5[dv.lIllI[7]] = lIllI[1];
        byArray5[dv.lIllI[24]] = lIllI[37];
        byArray5[dv.lIllI[25]] = lIllI[1];
        byArray5[dv.lIllI[26]] = lIllI[43];
        byArray5[dv.lIllI[28]] = lIllI[1];
        byArray5[dv.lIllI[29]] = lIllI[43];
        dv.d(ec.a(byArray5));
        byte[] byArray6 = new byte[lIllI[15]];
        byArray6[dv.lIllI[1]] = lIllI[1];
        byArray6[dv.lIllI[2]] = lIllI[44];
        byArray6[dv.lIllI[4]] = lIllI[1];
        byArray6[dv.lIllI[5]] = lIllI[22];
        byArray6[dv.lIllI[0]] = lIllI[1];
        byArray6[dv.lIllI[10]] = lIllI[36];
        byArray6[dv.lIllI[12]] = lIllI[1];
        byArray6[dv.lIllI[13]] = lIllI[22];
        dv.d(ec.a(byArray6));
        byte[] byArray7 = new byte[lIllI[45]];
        byArray7[dv.lIllI[1]] = lIllI[1];
        byArray7[dv.lIllI[2]] = lIllI[44];
        byArray7[dv.lIllI[4]] = lIllI[1];
        byArray7[dv.lIllI[5]] = lIllI[22];
        byArray7[dv.lIllI[0]] = lIllI[1];
        byArray7[dv.lIllI[10]] = lIllI[36];
        byArray7[dv.lIllI[12]] = lIllI[1];
        byArray7[dv.lIllI[13]] = lIllI[22];
        byArray7[dv.lIllI[15]] = lIllI[1];
        byArray7[dv.lIllI[16]] = lIllI[46];
        byArray7[dv.lIllI[7]] = lIllI[1];
        byArray7[dv.lIllI[24]] = lIllI[32];
        byArray7[dv.lIllI[25]] = lIllI[1];
        byArray7[dv.lIllI[26]] = lIllI[23];
        byArray7[dv.lIllI[28]] = lIllI[1];
        byArray7[dv.lIllI[29]] = lIllI[41];
        byArray7[dv.lIllI[19]] = lIllI[1];
        byArray7[dv.lIllI[35]] = lIllI[37];
        byArray7[dv.lIllI[31]] = lIllI[1];
        byArray7[dv.lIllI[47]] = lIllI[27];
        byArray7[dv.lIllI[48]] = lIllI[1];
        byArray7[dv.lIllI[49]] = lIllI[20];
        dv.d(ec.a(byArray7));
        byte[] byArray8 = new byte[lIllI[12]];
        byArray8[dv.lIllI[1]] = lIllI[1];
        byArray8[dv.lIllI[2]] = lIllI[38];
        byArray8[dv.lIllI[4]] = lIllI[1];
        byArray8[dv.lIllI[5]] = lIllI[22];
        byArray8[dv.lIllI[0]] = lIllI[1];
        byArray8[dv.lIllI[10]] = lIllI[40];
        dv.d(ec.a(byArray8));
        byte[] byArray9 = new byte[lIllI[48]];
        byArray9[dv.lIllI[1]] = lIllI[1];
        byArray9[dv.lIllI[2]] = lIllI[38];
        byArray9[dv.lIllI[4]] = lIllI[1];
        byArray9[dv.lIllI[5]] = lIllI[22];
        byArray9[dv.lIllI[0]] = lIllI[1];
        byArray9[dv.lIllI[10]] = lIllI[40];
        byArray9[dv.lIllI[12]] = lIllI[1];
        byArray9[dv.lIllI[13]] = lIllI[46];
        byArray9[dv.lIllI[15]] = lIllI[1];
        byArray9[dv.lIllI[16]] = lIllI[32];
        byArray9[dv.lIllI[7]] = lIllI[1];
        byArray9[dv.lIllI[24]] = lIllI[23];
        byArray9[dv.lIllI[25]] = lIllI[1];
        byArray9[dv.lIllI[26]] = lIllI[41];
        byArray9[dv.lIllI[28]] = lIllI[1];
        byArray9[dv.lIllI[29]] = lIllI[37];
        byArray9[dv.lIllI[19]] = lIllI[1];
        byArray9[dv.lIllI[35]] = lIllI[27];
        byArray9[dv.lIllI[31]] = lIllI[1];
        byArray9[dv.lIllI[47]] = lIllI[20];
        dv.d(ec.a(byArray9));
        byte[] byArray10 = new byte[lIllI[7]];
        byArray10[dv.lIllI[1]] = lIllI[1];
        byArray10[dv.lIllI[2]] = lIllI[41];
        byArray10[dv.lIllI[4]] = lIllI[1];
        byArray10[dv.lIllI[5]] = lIllI[42];
        byArray10[dv.lIllI[0]] = lIllI[1];
        byArray10[dv.lIllI[10]] = lIllI[37];
        byArray10[dv.lIllI[12]] = lIllI[1];
        byArray10[dv.lIllI[13]] = lIllI[43];
        byArray10[dv.lIllI[15]] = lIllI[1];
        byArray10[dv.lIllI[16]] = lIllI[43];
        dv.d(ec.a(byArray10));
        byte[] byArray11 = new byte[lIllI[45]];
        byArray11[dv.lIllI[1]] = lIllI[1];
        byArray11[dv.lIllI[2]] = lIllI[42];
        byArray11[dv.lIllI[4]] = lIllI[1];
        byArray11[dv.lIllI[5]] = lIllI[37];
        byArray11[dv.lIllI[0]] = lIllI[1];
        byArray11[dv.lIllI[10]] = lIllI[43];
        byArray11[dv.lIllI[12]] = lIllI[1];
        byArray11[dv.lIllI[13]] = lIllI[43];
        byArray11[dv.lIllI[15]] = lIllI[1];
        byArray11[dv.lIllI[16]] = lIllI[46];
        byArray11[dv.lIllI[7]] = lIllI[1];
        byArray11[dv.lIllI[24]] = lIllI[32];
        byArray11[dv.lIllI[25]] = lIllI[1];
        byArray11[dv.lIllI[26]] = lIllI[23];
        byArray11[dv.lIllI[28]] = lIllI[1];
        byArray11[dv.lIllI[29]] = lIllI[41];
        byArray11[dv.lIllI[19]] = lIllI[1];
        byArray11[dv.lIllI[35]] = lIllI[37];
        byArray11[dv.lIllI[31]] = lIllI[1];
        byArray11[dv.lIllI[47]] = lIllI[27];
        byArray11[dv.lIllI[48]] = lIllI[1];
        byArray11[dv.lIllI[49]] = lIllI[20];
        dv.d(ec.a(byArray11));
        byte[] byArray12 = new byte[lIllI[15]];
        byArray12[dv.lIllI[1]] = lIllI[1];
        byArray12[dv.lIllI[2]] = lIllI[37];
        byArray12[dv.lIllI[4]] = lIllI[1];
        byArray12[dv.lIllI[5]] = lIllI[36];
        byArray12[dv.lIllI[0]] = lIllI[1];
        byArray12[dv.lIllI[10]] = lIllI[32];
        byArray12[dv.lIllI[12]] = lIllI[1];
        byArray12[dv.lIllI[13]] = lIllI[38];
        dv.d(ec.a(byArray12));
        byte[] byArray13 = new byte[lIllI[45]];
        byArray13[dv.lIllI[1]] = lIllI[1];
        byArray13[dv.lIllI[2]] = lIllI[37];
        byArray13[dv.lIllI[4]] = lIllI[1];
        byArray13[dv.lIllI[5]] = lIllI[36];
        byArray13[dv.lIllI[0]] = lIllI[1];
        byArray13[dv.lIllI[10]] = lIllI[32];
        byArray13[dv.lIllI[12]] = lIllI[1];
        byArray13[dv.lIllI[13]] = lIllI[38];
        byArray13[dv.lIllI[15]] = lIllI[1];
        byArray13[dv.lIllI[16]] = lIllI[46];
        byArray13[dv.lIllI[7]] = lIllI[1];
        byArray13[dv.lIllI[24]] = lIllI[32];
        byArray13[dv.lIllI[25]] = lIllI[1];
        byArray13[dv.lIllI[26]] = lIllI[23];
        byArray13[dv.lIllI[28]] = lIllI[1];
        byArray13[dv.lIllI[29]] = lIllI[41];
        byArray13[dv.lIllI[19]] = lIllI[1];
        byArray13[dv.lIllI[35]] = lIllI[37];
        byArray13[dv.lIllI[31]] = lIllI[1];
        byArray13[dv.lIllI[47]] = lIllI[27];
        byArray13[dv.lIllI[48]] = lIllI[1];
        byArray13[dv.lIllI[49]] = lIllI[20];
        dv.d(ec.a(byArray13));
    }

    static {
        dv.lIllI();
    }

    private static void lIllI() {
        lIllI = new int[50];
        dv.lIllI[0] = " ".length() << (" ".length() << " ".length());
        dv.lIllI[1] = (0x53 ^ 0x70) & ~(0x7F ^ 0x5C);
        dv.lIllI[2] = " ".length();
        dv.lIllI[3] = (0xB4 ^ 0x8F) << " ".length();
        dv.lIllI[4] = " ".length() << " ".length();
        dv.lIllI[5] = "   ".length();
        dv.lIllI[6] = (0xF ^ 0x3A) << " ".length();
        dv.lIllI[7] = (0xAE ^ 0xAB) << " ".length();
        dv.lIllI[8] = 0xF7 ^ 0xA2;
        dv.lIllI[9] = (0xAB ^ 0xBE) << (" ".length() << " ".length());
        dv.lIllI[10] = 0x7B ^ 0x7E;
        dv.lIllI[11] = (0x58 ^ 0x7B) << " ".length();
        dv.lIllI[12] = "   ".length() << " ".length();
        dv.lIllI[13] = 0x7C ^ 0x7B;
        dv.lIllI[14] = 0xD ^ 0x20;
        dv.lIllI[15] = " ".length() << "   ".length();
        dv.lIllI[16] = 0x82 ^ 0x8B;
        dv.lIllI[17] = (0x55 ^ 0x52) << "   ".length();
        dv.lIllI[18] = -" ".length();
        dv.lIllI[19] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        dv.lIllI[20] = (0xF ^ 0x38) << " ".length();
        dv.lIllI[21] = 0xD0 ^ 0x8F;
        dv.lIllI[22] = 8 ^ 0x69;
        dv.lIllI[23] = (0xE ^ 0x37) << " ".length();
        dv.lIllI[24] = 0x74 ^ 0x7F;
        dv.lIllI[25] = "   ".length() << (" ".length() << " ".length());
        dv.lIllI[26] = 0x97 ^ 0x9A;
        dv.lIllI[27] = 0x44 ^ 0x2B;
        dv.lIllI[28] = (0x33 ^ 0x34) << " ".length();
        dv.lIllI[29] = 2 ^ 0xD;
        dv.lIllI[30] = 0x19 ^ 0x6E;
        dv.lIllI[31] = (0xCE ^ 0xC7) << " ".length();
        dv.lIllI[32] = 0x69 ^ 0xC;
        dv.lIllI[33] = (0xC ^ 0x3F) << " ".length();
        dv.lIllI[34] = 0x28 ^ 0x4B;
        dv.lIllI[35] = 0x6D ^ 0x7C;
        dv.lIllI[36] = (0x56 ^ 0x4B) << (" ".length() << " ".length());
        dv.lIllI[37] = 0x70 ^ 0x19;
        dv.lIllI[38] = 0xDC ^ 0xB1;
        dv.lIllI[39] = 0x30 ^ 0x57;
        dv.lIllI[40] = (0xB7 ^ 0xB0) << (" ".length() << (" ".length() << " ".length()));
        dv.lIllI[41] = 0x1E ^ 0x6D;
        dv.lIllI[42] = 0x17 ^ 0x7C;
        dv.lIllI[43] = (0x8C ^ 0x97) << (" ".length() << " ".length());
        dv.lIllI[44] = (0x64 ^ 0x7D) << (" ".length() << " ".length());
        dv.lIllI[45] = (0x3B ^ 0x30) << " ".length();
        dv.lIllI[46] = (0x77 ^ 0x5C) << " ".length();
        dv.lIllI[47] = 0x14 ^ 7;
        dv.lIllI[48] = (0xB2 ^ 0xB7) << (" ".length() << " ".length());
        dv.lIllI[49] = 0x51 ^ 0x44;
    }
}

