/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public class ec {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ int[] lllIl;

    static {
        ec.lIlII();
        byte[] byArray = new byte[lllIl[0]];
        byArray[ec.lllIl[1]] = lllIl[2];
        byArray[ec.lllIl[3]] = lllIl[4];
        byArray[ec.lllIl[5]] = lllIl[6];
        byArray[ec.lllIl[7]] = lllIl[8];
        byArray[ec.lllIl[9]] = lllIl[10];
        byArray[ec.lllIl[11]] = lllIl[12];
        byArray[ec.lllIl[13]] = lllIl[10];
        byArray[ec.lllIl[14]] = lllIl[15];
        byArray[ec.lllIl[16]] = lllIl[17];
        byArray[ec.lllIl[18]] = lllIl[10];
        byArray[ec.lllIl[19]] = lllIl[20];
        byArray[ec.lllIl[21]] = lllIl[4];
        a = ec.a(byArray);
        byte[] byArray2 = new byte[lllIl[22]];
        byArray2[ec.lllIl[1]] = lllIl[23];
        byArray2[ec.lllIl[3]] = lllIl[24];
        byArray2[ec.lllIl[5]] = lllIl[25];
        byArray2[ec.lllIl[7]] = lllIl[26];
        byArray2[ec.lllIl[9]] = lllIl[27];
        byArray2[ec.lllIl[11]] = lllIl[28];
        byArray2[ec.lllIl[13]] = lllIl[29];
        byArray2[ec.lllIl[14]] = lllIl[30];
        byArray2[ec.lllIl[16]] = lllIl[31];
        byArray2[ec.lllIl[18]] = lllIl[32];
        byArray2[ec.lllIl[19]] = lllIl[33];
        byArray2[ec.lllIl[21]] = lllIl[34];
        byArray2[ec.lllIl[35]] = lllIl[36];
        byArray2[ec.lllIl[37]] = lllIl[38];
        byArray2[ec.lllIl[39]] = lllIl[40];
        byArray2[ec.lllIl[41]] = lllIl[42];
        b = ec.a(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    static String a(int[] nArray) {
        void llllllIIlllIIIl;
        void llllllIIlllIIII;
        int[] llllllIIlllIIll;
        void llllllIIlllIIlI;
        void llllllIIllIllll;
        int n2 = nArray.length - lllIl[1];
        int n3 = lllIl[43];
        StringBuilder stringBuilder = new StringBuilder();
        int n4 = lllIl[43];
        while (llllllIIllIllll < llllllIIlllIIlI) {
            llllllIIlllIIIl += llllllIIlllIIll[llllllIIllIllll];
            llllllIIlllIIII.append((char)(llllllIIlllIIll[llllllIIllIllll] - llllllIIlllIIlI));
            ++llllllIIllIllll;
        }
        return (llllllIIlllIIIl - llllllIIlllIIll[llllllIIlllIIlI]) % llllllIIlllIIlI == false ? llllllIIlllIIII.toString() : null;
    }

    /*
     * WARNING - void declaration
     */
    public static String a(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = lllIl[43];
        while (n2 < byArray.length) {
            void llllllIIllIlIIl;
            void llllllIIllIlIII;
            byte[] llllllIIllIlIlI;
            int llllllIIllIIlll = (llllllIIllIlIlI[llllllIIllIlIII] & lllIl[44]) << lllIl[45] | llllllIIllIlIlI[llllllIIllIlIII + lllIl[1]] & lllIl[44];
            llllllIIllIlIIl.append((char)llllllIIllIIlll);
            llllllIIllIlIII += 2;
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = lllIl[43];
        while (n2 < string.length()) {
            void llllllIIlIlllIl;
            void llllllIIlIllllI;
            void llllllIIlIlllII;
            String llllllIIlIlllll;
            char llllllIIlIllIll = llllllIIlIlllll.charAt((int)llllllIIlIlllII);
            char llllllIIlIllIlI = llllllIIlIllllI.charAt((int)(llllllIIlIlllII % llllllIIlIllllI.length()));
            char llllllIIlIllIIl = (char)(llllllIIlIllIll ^ llllllIIlIllIlI);
            llllllIIlIlllIl.append(llllllIIlIllIIl);
            ++llllllIIlIlllII;
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static String a(String llllllIIlIlIIIl) {
        void var5_7;
        String llllllIIlIIllII2;
        ByteArrayOutputStream llllllIIlIlIIII = new ByteArrayOutputStream(llllllIIlIlIIIl.length() / lllIl[46]);
        int llllllIIlIIllll22 = lllIl[43];
        while (llllllIIlIIllll22 < llllllIIlIlIIIl.length()) {
            llllllIIlIlIIII.write(b.indexOf(llllllIIlIlIIIl.charAt(llllllIIlIIllll22)) << lllIl[47] | b.indexOf(llllllIIlIlIIIl.charAt(llllllIIlIIllll22 + lllIl[1])));
            llllllIIlIIllll22 += 2;
        }
        byte[] llllllIIlIIllll22 = llllllIIlIlIIII.toByteArray();
        int llllllIIlIIlllI = llllllIIlIIllll22.length;
        int llllllIIlIIllIl = a.length();
        int llllllIIlIIllII2 = lllIl[43];
        while (llllllIIlIIllII2 < llllllIIlIIlllI) {
            int n2 = llllllIIlIIllII2;
            llllllIIlIIllll22[n2] = (byte)(llllllIIlIIllll22[n2] ^ (byte)a.charAt(llllllIIlIIllII2 % llllllIIlIIllIl));
            ++llllllIIlIIllII2;
        }
        try {
            byte[] byArray = new byte[lllIl[48]];
            byArray[ec.lllIl[1]] = lllIl[49];
            byArray[ec.lllIl[3]] = lllIl[50];
            byArray[ec.lllIl[5]] = lllIl[42];
            byArray[ec.lllIl[7]] = lllIl[51];
            byArray[ec.lllIl[9]] = lllIl[31];
            llllllIIlIIllII2 = new String(llllllIIlIIllll22, ec.a(byArray));
        }
        catch (UnsupportedEncodingException llllllIIlIIlIll) {
            llllllIIlIIllII2 = "";
        }
        return var5_7;
    }

    private static void lIlII() {
        lllIl = new int[52];
        ec.lllIl[0] = "   ".length() << "   ".length();
        ec.lllIl[1] = " ".length();
        ec.lllIl[2] = 0xAB ^ 0xC0;
        ec.lllIl[3] = "   ".length();
        ec.lllIl[4] = (0x66 ^ 0x6B) << "   ".length();
        ec.lllIl[5] = 0xB6 ^ 0xB3;
        ec.lllIl[6] = 0xC ^ 0x63;
        ec.lllIl[7] = 0x9C ^ 0x9B;
        ec.lllIl[8] = 0xC5 ^ 0xA2;
        ec.lllIl[9] = 0xAE ^ 0xA7;
        ec.lllIl[10] = 0x29 ^ 0x48;
        ec.lllIl[11] = 0x88 ^ 0x83;
        ec.lllIl[12] = (0x94 ^ 0x8F) << (" ".length() << " ".length());
        ec.lllIl[13] = 0x2F ^ 0x22;
        ec.lllIl[14] = 0x26 ^ 0x29;
        ec.lllIl[15] = (0x88 ^ 0x95) << (" ".length() << " ".length());
        ec.lllIl[16] = 0x88 ^ 0x99;
        ec.lllIl[17] = (0x38 ^ 1) << " ".length();
        ec.lllIl[18] = 0xBE ^ 0xAD;
        ec.lllIl[19] = 0xAB ^ 0xBE;
        ec.lllIl[20] = (0xA6 ^ 0x91) << " ".length();
        ec.lllIl[21] = 0x1C ^ 0xB;
        ec.lllIl[22] = " ".length() << (0x12 ^ 0x17);
        ec.lllIl[23] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        ec.lllIl[24] = 0x43 ^ 0x72;
        ec.lllIl[25] = (0x72 ^ 0x6B) << " ".length();
        ec.lllIl[26] = 0xA1 ^ 0x92;
        ec.lllIl[27] = (0x9C ^ 0x91) << (" ".length() << " ".length());
        ec.lllIl[28] = 0x5E ^ 0x6B;
        ec.lllIl[29] = (0x90 ^ 0x8B) << " ".length();
        ec.lllIl[30] = 0x83 ^ 0xB4;
        ec.lllIl[31] = (0x14 ^ 0x13) << "   ".length();
        ec.lllIl[32] = 0x52 ^ 0x6B;
        ec.lllIl[33] = 0xEE ^ 0xAF;
        ec.lllIl[34] = (0xE1 ^ 0xC0) << " ".length();
        ec.lllIl[35] = 0xA3 ^ 0xBA;
        ec.lllIl[36] = 0x62 ^ 0x21;
        ec.lllIl[37] = 0x58 ^ 0x43;
        ec.lllIl[38] = (0x66 ^ 0x77) << (" ".length() << " ".length());
        ec.lllIl[39] = 0x2B ^ 0x36;
        ec.lllIl[40] = 0x1C ^ 0x59;
        ec.lllIl[41] = 0xB0 ^ 0xAF;
        ec.lllIl[42] = (0xBB ^ 0x98) << " ".length();
        ec.lllIl[43] = (0x1E ^ 0x7F) & ~(0xC0 ^ 0xA1);
        ec.lllIl[44] = 133 + 253 - 379 + 248;
        ec.lllIl[45] = " ".length() << "   ".length();
        ec.lllIl[46] = " ".length() << " ".length();
        ec.lllIl[47] = " ".length() << (" ".length() << " ".length());
        ec.lllIl[48] = (0x8A ^ 0x8F) << " ".length();
        ec.lllIl[49] = 0xE ^ 0x5B;
        ec.lllIl[50] = (0x24 ^ 0x31) << (" ".length() << " ".length());
        ec.lllIl[51] = 0x32 ^ 0x1F;
    }
}

