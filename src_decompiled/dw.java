/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import javax.microedition.rms.RecordStore;

public class dw {
    private static final /* synthetic */ int[] lIllII;

    public static final void a(String lllllIIIllIllIl, byte[] lllllIIIllIllII) {
        try {
            byte[] byArray = new byte[lIllII[0]];
            byArray[dw.lIllII[1]] = lIllII[1];
            byArray[dw.lIllII[2]] = lIllII[3];
            byArray[dw.lIllII[4]] = lIllII[1];
            byArray[dw.lIllII[5]] = lIllII[6];
            RecordStore lllllIIIllIlIll = RecordStore.openRecordStore((String)(ec.a(byArray) + lllllIIIllIllIl), (boolean)lIllII[2]);
            if (lllllIIIllIlIll.getNumRecords() > 0) {
                lllllIIIllIlIll.setRecord(lIllII[2], lllllIIIllIllII, lIllII[1], lllllIIIllIllII.length);
            } else {
                lllllIIIllIlIll.addRecord(lllllIIIllIllII, lIllII[1], lllllIIIllIllII.length);
            }
            lllllIIIllIlIll.closeRecordStore();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static final byte[] a(String lllllIIIllIIlll) {
        try {
            byte[] byArray = new byte[lIllII[0]];
            byArray[dw.lIllII[1]] = lIllII[1];
            byArray[dw.lIllII[2]] = lIllII[3];
            byArray[dw.lIllII[4]] = lIllII[1];
            byArray[dw.lIllII[5]] = lIllII[6];
            RecordStore lllllIIIllIIllI = RecordStore.openRecordStore((String)(ec.a(byArray) + lllllIIIllIIlll), (boolean)lIllII[1]);
            byte[] lllllIIIllIIlIl = lllllIIIllIIllI.getRecord(lIllII[2]);
            lllllIIIllIIllI.closeRecordStore();
            return lllllIIIllIIlIl;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(String lllllIIIllIIIIl, int lllllIIIllIIIII) {
        try {
            byte[] byArray = new byte[lIllII[2]];
            byArray[dw.lIllII[1]] = (byte)lllllIIIllIIIII;
            dw.a(lllllIIIllIIIIl, byArray);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void a(String lllllIIIlIllIll, String lllllIIIlIllIlI) {
        try {
            byte[] byArray = new byte[lIllII[7]];
            byArray[dw.lIllII[1]] = lIllII[1];
            byArray[dw.lIllII[2]] = lIllII[8];
            byArray[dw.lIllII[4]] = lIllII[1];
            byArray[dw.lIllII[5]] = lIllII[9];
            byArray[dw.lIllII[0]] = lIllII[1];
            byArray[dw.lIllII[10]] = lIllII[11];
            byArray[dw.lIllII[12]] = lIllII[1];
            byArray[dw.lIllII[13]] = lIllII[14];
            byArray[dw.lIllII[15]] = lIllII[1];
            byArray[dw.lIllII[16]] = lIllII[17];
            dw.a(lllllIIIlIllIll, lllllIIIlIllIlI.getBytes(ec.a(byArray)));
        }
        catch (Exception lllllIIIlIllIIl) {
            lllllIIIlIllIIl.printStackTrace();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String b(String string) {
        byte[] byArray = dw.a(string);
        if (byArray == null) {
            return null;
        }
        try {
            void lllllIIIlIlIlII;
            byte[] byArray2 = new byte[lIllII[7]];
            byArray2[dw.lIllII[1]] = lIllII[1];
            byArray2[dw.lIllII[2]] = lIllII[8];
            byArray2[dw.lIllII[4]] = lIllII[1];
            byArray2[dw.lIllII[5]] = lIllII[9];
            byArray2[dw.lIllII[0]] = lIllII[1];
            byArray2[dw.lIllII[10]] = lIllII[11];
            byArray2[dw.lIllII[12]] = lIllII[1];
            byArray2[dw.lIllII[13]] = lIllII[14];
            byArray2[dw.lIllII[15]] = lIllII[1];
            byArray2[dw.lIllII[16]] = lIllII[17];
            return new String((byte[])lllllIIIlIlIlII, ec.a(byArray2));
        }
        catch (Exception exception) {
            return new String(byArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int c(String string) {
        void lllllIIIlIIllll;
        byte[] byArray = dw.a(string);
        return byArray == null ? lIllII[18] : lllllIIIlIIllll[lIllII[1]];
    }

    public static final void b(String lllllIIIlIIlIll, byte[] lllllIIIlIIlIlI) {
        try {
            byte[] byArray = new byte[lIllII[0]];
            byArray[dw.lIllII[1]] = lIllII[1];
            byArray[dw.lIllII[2]] = lIllII[3];
            byArray[dw.lIllII[4]] = lIllII[1];
            byArray[dw.lIllII[5]] = lIllII[6];
            RecordStore lllllIIIlIIlIIl = RecordStore.openRecordStore((String)(ec.a(byArray) + lllllIIIlIIlIll), (boolean)lIllII[2]);
            if (lllllIIIlIIlIIl.getNumRecords() > 0) {
                lllllIIIlIIlIIl.setRecord(lIllII[2], lllllIIIlIIlIlI, lIllII[1], lllllIIIlIIlIlI.length);
            } else {
                lllllIIIlIIlIIl.addRecord(lllllIIIlIIlIlI, lIllII[1], lllllIIIlIIlIlI.length);
            }
            lllllIIIlIIlIIl.closeRecordStore();
        }
        catch (Exception lllllIIIlIIlIIl) {
            lllllIIIlIIlIIl.printStackTrace();
        }
    }

    static {
        dw.lllIl();
    }

    private static void lllIl() {
        lIllII = new int[19];
        dw.lIllII[0] = " ".length() << (" ".length() << " ".length());
        dw.lIllII[1] = (0x7D ^ 0x40) & ~(0x5F ^ 0x62);
        dw.lIllII[2] = " ".length();
        dw.lIllII[3] = (0xB3 ^ 0x88) << " ".length();
        dw.lIllII[4] = " ".length() << " ".length();
        dw.lIllII[5] = "   ".length();
        dw.lIllII[6] = (0x96 ^ 0xA3) << " ".length();
        dw.lIllII[7] = (0x43 ^ 0x46) << " ".length();
        dw.lIllII[8] = 0x64 ^ 0x31;
        dw.lIllII[9] = (0x86 ^ 0x93) << (" ".length() << " ".length());
        dw.lIllII[10] = 0x4E ^ 0x4B;
        dw.lIllII[11] = (0x7B ^ 0x58) << " ".length();
        dw.lIllII[12] = "   ".length() << " ".length();
        dw.lIllII[13] = 0x34 ^ 0x33;
        dw.lIllII[14] = 0x9A ^ 0xB7;
        dw.lIllII[15] = " ".length() << "   ".length();
        dw.lIllII[16] = 0x86 ^ 0x8F;
        dw.lIllII[17] = (0x38 ^ 0x3F) << "   ".length();
        dw.lIllII[18] = -" ".length();
    }
}

