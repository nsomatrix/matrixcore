/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.wireless.messaging.Message
 *  javax.wireless.messaging.MessageConnection
 *  javax.wireless.messaging.TextMessage
 */
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class ao
implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ au d;
    private final /* synthetic */ au e;
    private static final /* synthetic */ int[] lIlIIIll;

    ao(String string, String string2, String string3, au au2, au au3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = au2;
        this.e = au3;
    }

    @Override
    public final void run() {
        ao llIIllIIIIlIIII;
        try {
            MessageConnection llIIllIIIIIllll = null;
            llIIllIIIIIllll = (MessageConnection)Connector.open((String)llIIllIIIIlIIII.a);
            byte[] byArray = new byte[lIlIIIll[0]];
            byArray[ao.lIlIIIll[1]] = lIlIIIll[1];
            byArray[ao.lIlIIIll[2]] = lIlIIIll[3];
            byArray[ao.lIlIIIll[4]] = lIlIIIll[1];
            byArray[ao.lIlIIIll[5]] = lIlIIIll[6];
            byArray[ao.lIlIIIll[7]] = lIlIIIll[1];
            byArray[ao.lIlIIIll[8]] = lIlIIIll[9];
            byArray[ao.lIlIIIll[10]] = lIlIIIll[1];
            byArray[ao.lIlIIIll[11]] = lIlIIIll[3];
            TextMessage llIIllIIIIIlllI = (TextMessage)llIIllIIIIIllll.newMessage(ec.a(byArray));
            llIIllIIIIIlllI.setAddress(llIIllIIIIlIIII.a);
            llIIllIIIIIlllI.setPayloadText(llIIllIIIIlIIII.b);
            llIIllIIIIIllll.send((Message)llIIllIIIIIlllI);
            byte[] byArray2 = new byte[lIlIIIll[12]];
            byArray2[ao.lIlIIIll[1]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[2]] = lIlIIIll[13];
            byArray2[ao.lIlIIIll[4]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[5]] = lIlIIIll[14];
            byArray2[ao.lIlIIIll[7]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[8]] = lIlIIIll[13];
            byArray2[ao.lIlIIIll[10]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[11]] = lIlIIIll[15];
            byArray2[ao.lIlIIIll[0]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[16]] = lIlIIIll[17];
            byArray2[ao.lIlIIIll[18]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[19]] = lIlIIIll[20];
            byArray2[ao.lIlIIIll[21]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[22]] = lIlIIIll[3];
            byArray2[ao.lIlIIIll[23]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[24]] = lIlIIIll[20];
            byArray2[ao.lIlIIIll[25]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[26]] = lIlIIIll[27];
            byArray2[ao.lIlIIIll[28]] = lIlIIIll[1];
            byArray2[ao.lIlIIIll[29]] = lIlIIIll[15];
            byte[] byArray3 = new byte[lIlIIIll[21]];
            byArray3[ao.lIlIIIll[1]] = lIlIIIll[1];
            byArray3[ao.lIlIIIll[2]] = lIlIIIll[30];
            byArray3[ao.lIlIIIll[4]] = lIlIIIll[1];
            byArray3[ao.lIlIIIll[5]] = lIlIIIll[15];
            byArray3[ao.lIlIIIll[7]] = lIlIIIll[1];
            byArray3[ao.lIlIIIll[8]] = lIlIIIll[3];
            byArray3[ao.lIlIIIll[10]] = lIlIIIll[1];
            byArray3[ao.lIlIIIll[11]] = lIlIIIll[31];
            byArray3[ao.lIlIIIll[0]] = lIlIIIll[1];
            byArray3[ao.lIlIIIll[16]] = lIlIIIll[27];
            byArray3[ao.lIlIIIll[18]] = lIlIIIll[1];
            byArray3[ao.lIlIIIll[19]] = lIlIIIll[15];
            System.out.println(ec.a(byArray2) + llIIllIIIIlIIII.b + ec.a(byArray3) + llIIllIIIIlIIII.c);
            llIIllIIIIlIIII.d.a();
        }
        catch (Exception llIIllIIIIIllll) {
            llIIllIIIIlIIII.e.a();
        }
    }

    static {
        ao.llllIll();
    }

    private static void llllIll() {
        lIlIIIll = new int[32];
        ao.lIlIIIll[0] = " ".length() << "   ".length();
        ao.lIlIIIll[1] = (0x24 ^ 0x21) << "   ".length() & ~((0x9C ^ 0x99) << "   ".length());
        ao.lIlIIIll[2] = " ".length();
        ao.lIlIIIll[3] = (0x26 ^ 0x3B) << (" ".length() << " ".length());
        ao.lIlIIIll[4] = " ".length() << " ".length();
        ao.lIlIIIll[5] = "   ".length();
        ao.lIlIIIll[6] = 0x13 ^ 0x76;
        ao.lIlIIIll[7] = " ".length() << (" ".length() << " ".length());
        ao.lIlIIIll[8] = 0xC1 ^ 0xC4;
        ao.lIlIIIll[9] = (5 ^ 0xA) << "   ".length();
        ao.lIlIIIll[10] = "   ".length() << " ".length();
        ao.lIlIIIll[11] = 0x2D ^ 0x2A;
        ao.lIlIIIll[12] = (0x87 ^ 0x82) << (" ".length() << " ".length());
        ao.lIlIIIll[13] = 0x94 ^ 0xC7;
        ao.lIlIIIll[14] = 0x12 ^ 0x5F;
        ao.lIlIIIll[15] = " ".length() << (0x1D ^ 0x18);
        ao.lIlIIIll[16] = 0xCE ^ 0xC7;
        ao.lIlIIIll[17] = (0x16 ^ 0xF) << (" ".length() << " ".length());
        ao.lIlIIIll[18] = (0xBC ^ 0xB9) << " ".length();
        ao.lIlIIIll[19] = 0x39 ^ 0x32;
        ao.lIlIIIll[20] = 0xEF ^ 0x8E;
        ao.lIlIIIll[21] = "   ".length() << (" ".length() << " ".length());
        ao.lIlIIIll[22] = 0x79 ^ 0x74;
        ao.lIlIIIll[23] = (0x16 ^ 0x11) << " ".length();
        ao.lIlIIIll[24] = 0x3C ^ 0x33;
        ao.lIlIIIll[25] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        ao.lIlIIIll[26] = 0x5F ^ 0x4E;
        ao.lIlIIIll[27] = (6 ^ 0x1B) << " ".length();
        ao.lIlIIIll[28] = (0x18 ^ 0x11) << " ".length();
        ao.lIlIIIll[29] = 0x71 ^ 0x62;
        ao.lIlIIIll[30] = (0xA7 ^ 0xAC) << (" ".length() << " ".length());
        ao.lIlIIIll[31] = 0x13 ^ 0x7C;
    }
}

