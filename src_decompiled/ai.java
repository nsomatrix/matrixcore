/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class ai
implements Runnable {
    private final /* synthetic */ String a;
    private /* synthetic */ ej b;
    private static final /* synthetic */ int[] lIIIllll;

    ai(ej ej2, String string) {
        this.b = ej2;
        this.a = string;
    }

    @Override
    public final void run() {
        block4: {
            ai llIlIIIlIIIIIIl;
            this.b.j = new Thread(new an());
            this.b.j.start();
            this.b.g = lIIIllll[0];
            this.b.f = lIIIllll[0];
            try {
                String llIlIIIlIIIIIII = llIlIIIlIIIIIIl.a;
                llIlIIIlIIIIIIl.b.e = (SocketConnection)Connector.open((String)llIlIIIlIIIIIII);
                ej.a(llIlIIIlIIIIIIl.b, llIlIIIlIIIIIIl.b.e.openDataOutputStream());
                llIlIIIlIIIIIIl.b.c = llIlIIIlIIIIIIl.b.e.openDataInputStream();
                llIlIIIlIIIIIIl.b.k = new Thread(ej.a(llIlIIIlIIIIIIl.b));
                llIlIIIlIIIIIIl.b.k.start();
                llIlIIIlIIIIIIl.b.i = new Thread(new am(llIlIIIlIIIIIIl.b));
                llIlIIIlIIIIIIl.b.i.start();
                llIlIIIlIIIIIIl.b.p = System.currentTimeMillis();
                ej.a(llIlIIIlIIIIIIl.b, new aj(lIIIllll[1]));
                llIlIIIlIIIIIIl.b.g = lIIIllll[2];
                av llIlIIIIlllllll = llIlIIIlIIIIIIl.b.d;
                byte[] byArray = new byte[lIIIllll[3]];
                byArray[ai.lIIIllll[2]] = lIIIllll[2];
                byArray[ai.lIIIllll[0]] = lIIIllll[4];
                byArray[ai.lIIIllll[5]] = lIIIllll[2];
                byArray[ai.lIIIllll[6]] = lIIIllll[7];
                byArray[ai.lIIIllll[8]] = lIIIllll[2];
                byArray[ai.lIIIllll[9]] = lIIIllll[10];
                byArray[ai.lIIIllll[11]] = lIIIllll[2];
                byArray[ai.lIIIllll[12]] = lIIIllll[10];
                byArray[ai.lIIIllll[13]] = lIIIllll[2];
                byArray[ai.lIIIllll[14]] = lIIIllll[15];
                byArray[ai.lIIIllll[16]] = lIIIllll[2];
                byArray[ai.lIIIllll[17]] = lIIIllll[18];
                byArray[ai.lIIIllll[19]] = lIIIllll[2];
                byArray[ai.lIIIllll[20]] = lIIIllll[21];
                byArray[ai.lIIIllll[22]] = lIIIllll[2];
                byArray[ai.lIIIllll[23]] = lIIIllll[24];
                byArray[ai.lIIIllll[25]] = lIIIllll[2];
                byArray[ai.lIIIllll[26]] = lIIIllll[7];
                byArray[ai.lIIIllll[27]] = lIIIllll[2];
                byArray[ai.lIIIllll[28]] = lIIIllll[29];
                System.out.println(ec.a(byArray));
            }
            catch (Exception llIlIIIlIIIIIII) {
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException llIlIIIIlllllll) {
                    // empty catch block
                }
                llIlIIIlIIIIIIl.b.c();
                if (llIlIIIlIIIIIIl.b.d == null) break block4;
                llIlIIIlIIIIIIl.b.d.b();
            }
        }
    }

    static {
        ai.llIllII();
    }

    private static void llIllII() {
        lIIIllll = new int[30];
        ai.lIIIllll[0] = " ".length();
        ai.lIIIllll[1] = -(0xDD ^ 0xC6);
        ai.lIIIllll[2] = (0xD ^ 0x26) << " ".length() & ~((0x54 ^ 0x7F) << " ".length());
        ai.lIIIllll[3] = (5 ^ 0) << (" ".length() << " ".length());
        ai.lIIIllll[4] = 0x1E ^ 0x5D;
        ai.lIIIllll[5] = " ".length() << " ".length();
        ai.lIIIllll[6] = "   ".length();
        ai.lIIIllll[7] = 0xCA ^ 0xA5;
        ai.lIIIllll[8] = " ".length() << (" ".length() << " ".length());
        ai.lIIIllll[9] = 0x68 ^ 0x6D;
        ai.lIIIllll[10] = (6 ^ 0x31) << " ".length();
        ai.lIIIllll[11] = "   ".length() << " ".length();
        ai.lIIIllll[12] = 0x8C ^ 0x8B;
        ai.lIIIllll[13] = " ".length() << "   ".length();
        ai.lIIIllll[14] = 8 ^ 1;
        ai.lIIIllll[15] = 0x34 ^ 0x51;
        ai.lIIIllll[16] = (0x4D ^ 0x48) << " ".length();
        ai.lIIIllll[17] = 0x37 ^ 0x3C;
        ai.lIIIllll[18] = 2 ^ 0x61;
        ai.lIIIllll[19] = "   ".length() << (" ".length() << " ".length());
        ai.lIIIllll[20] = 0x78 ^ 0x75;
        ai.lIIIllll[21] = (0x9C ^ 0x81) << (" ".length() << " ".length());
        ai.lIIIllll[22] = (0x55 ^ 0x52) << " ".length();
        ai.lIIIllll[23] = 0x69 ^ 0x66;
        ai.lIIIllll[24] = " ".length() << (0x1F ^ 0x1A);
        ai.lIIIllll[25] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        ai.lIIIllll[26] = 0xD1 ^ 0xC0;
        ai.lIIIllll[27] = (0xE ^ 7) << " ".length();
        ai.lIIIllll[28] = 0xD0 ^ 0xC3;
        ai.lIIIllll[29] = 0x5A ^ 0x31;
    }
}

