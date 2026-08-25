/*
 * Decompiled with CFR 0.152.
 */
public class ea
implements Runnable {
    private static final /* synthetic */ int[] llIIIll;

    @Override
    public void run() {
        do {
            try {
                bq.m();
                ej.a().c();
                Thread.sleep(5000L);
                bq.c(llIIIll[0]);
                byte[] byArray = new byte[llIIIll[1]];
                byArray[ea.llIIIll[2]] = llIIIll[2];
                byArray[ea.llIIIll[3]] = llIIIll[4];
                byArray[ea.llIIIll[5]] = llIIIll[2];
                byArray[ea.llIIIll[6]] = llIIIll[7];
                byArray[ea.llIIIll[8]] = llIIIll[2];
                byArray[ea.llIIIll[0]] = llIIIll[9];
                byArray[ea.llIIIll[10]] = llIIIll[2];
                byArray[ea.llIIIll[11]] = llIIIll[7];
                byArray[ea.llIIIll[12]] = llIIIll[2];
                byArray[ea.llIIIll[13]] = llIIIll[14];
                ei.a().a(eg.a, eg.b, ec.a(byArray));
                fn.b(10000L);
                ei.a().b(ef.k);
                fn.b(5000L);
            }
            catch (InterruptedException lllIlllIIlllIIl) {
                lllIlllIIlllIIl.printStackTrace();
            }
        } while (fn.a && bq.E != bt.a);
    }

    static {
        ea.lIIlIIl();
    }

    private static void lIIlIIl() {
        llIIIll = new int[15];
        ea.llIIIll[0] = 0x8B ^ 0x8E;
        ea.llIIIll[1] = (0x82 ^ 0x87) << " ".length();
        ea.llIIIll[2] = (0x83 ^ 0x96) << " ".length() & ~((0x70 ^ 0x65) << " ".length());
        ea.llIIIll[3] = " ".length();
        ea.llIIIll[4] = (0x4E ^ 0x57) << " ".length();
        ea.llIIIll[5] = " ".length() << " ".length();
        ea.llIIIll[6] = "   ".length();
        ea.llIIIll[7] = (0x98 ^ 0x8F) << " ".length();
        ea.llIIIll[8] = " ".length() << (" ".length() << " ".length());
        ea.llIIIll[9] = 0xA1 ^ 0x90;
        ea.llIIIll[10] = "   ".length() << " ".length();
        ea.llIIIll[11] = 0x58 ^ 0x5F;
        ea.llIIIll[12] = " ".length() << "   ".length();
        ea.llIIIll[13] = 0x7E ^ 0x77;
        ea.llIIIll[14] = 0x19 ^ 0x2E;
    }
}

