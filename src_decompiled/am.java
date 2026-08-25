/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class am
implements Runnable {
    private /* synthetic */ ej a;
    private static final /* synthetic */ int[] llIIII;

    am(ej ej2) {
        this.a = ej2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object llllIlllIIlIIII2;
        am llllIlllIIlIIIl;
        try {
            while (llllIlllIIlIIIl.a.b()) {
                Object llllIlllIIIIIll;
                int llllIlllIIIlllI;
                int llllIlllIIIIlll;
                int llllIlllIIIlIII;
                int llllIlllIIIlIlI;
                byte llllIlllIIIllII;
                llllIlllIIlIIII2 = llllIlllIIlIIIl;
                byte llllIlllIIIllll = llllIlllIIlIIIl.a.c.readByte();
                if (llllIlllIIlIIIl.a.n) {
                    llllIlllIIIllll = ej.a(llllIlllIIlIIIl.a, llllIlllIIIllll);
                }
                if (llllIlllIIIllll == llIIII[0]) {
                    llllIlllIIIllll = llllIlllIIlIIIl.a.c.readByte();
                    if (llllIlllIIlIIIl.a.n) {
                        llllIlllIIIllll = ej.a(llllIlllIIlIIIl.a, llllIlllIIIllll);
                    }
                    llllIlllIIIllII = ej.a(llllIlllIIlIIIl.a, llllIlllIIlIIIl.a.c.readByte());
                    llllIlllIIIlIlI = ej.a(llllIlllIIlIIIl.a, llllIlllIIlIIIl.a.c.readByte());
                    llllIlllIIIlIII = ej.a(llllIlllIIlIIIl.a, llllIlllIIlIIIl.a.c.readByte());
                    llllIlllIIIIlll = ej.a(llllIlllIIlIIIl.a, llllIlllIIlIIIl.a.c.readByte());
                    llllIlllIIIlllI = (llllIlllIIIllII & llIIII[1]) << llIIII[2] | (llllIlllIIIlIlI & llIIII[1]) << llIIII[3] | (llllIlllIIIlIII & llIIII[1]) << llIIII[4] | llllIlllIIIIlll & llIIII[1];
                } else if (llllIlllIIlIIIl.a.n) {
                    llllIlllIIIllII = llllIlllIIlIIIl.a.c.readByte();
                    llllIlllIIIlIlI = llllIlllIIlIIIl.a.c.readByte();
                    llllIlllIIIlllI = (ej.a(llllIlllIIlIIIl.a, llllIlllIIIllII) & llIIII[1]) << llIIII[4] | ej.a(llllIlllIIlIIIl.a, (byte)llllIlllIIIlIlI) & llIIII[1];
                } else {
                    llllIlllIIIlllI = llllIlllIIlIIIl.a.c.readUnsignedShort();
                }
                byte[] llllIlllIIIIlIl = new byte[llllIlllIIIlllI];
                llllIlllIIIlIlI = llIIII[5];
                llllIlllIIIlIII = llIIII[5];
                while (llllIlllIIIlIlI != llIIII[16] && llllIlllIIIlIII < llllIlllIIIlllI) {
                    llllIlllIIIlIlI = ((am)llllIlllIIlIIII2).a.c.read(llllIlllIIIIlIl, llllIlllIIIlIII, llllIlllIIIlllI - llllIlllIIIlIII);
                    if (llllIlllIIIlIlI <= 0) continue;
                    llllIlllIIIIIll = ((am)llllIlllIIlIIII2).a;
                    ((ej)llllIlllIIIIIll).m += (llllIlllIIIlIII += llllIlllIIIlIlI) + llIIII[6];
                    llllIlllIIIIlll = ej.a().m + ej.a().l;
                    byte[] byArray = new byte[llIIII[8]];
                    byArray[am.llIIII[5]] = llIIII[5];
                    byArray[am.llIIII[9]] = llIIII[10];
                    byte[] byArray2 = new byte[llIIII[12]];
                    byArray2[am.llIIII[5]] = llIIII[5];
                    byArray2[am.llIIII[9]] = llIIII[13];
                    byArray2[am.llIIII[8]] = llIIII[5];
                    byArray2[am.llIIII[14]] = llIIII[15];
                    ((am)llllIlllIIlIIII2).a.q = String.valueOf(llllIlllIIIIlll / llIIII[7]) + ec.a(byArray) + llllIlllIIIIlll % llIIII[7] / llIIII[11] + ec.a(byArray2);
                }
                if (((am)llllIlllIIlIIII2).a.n) {
                    llllIlllIIIIlll = llIIII[5];
                    while (llllIlllIIIIlll < llllIlllIIIIlIl.length) {
                        llllIlllIIIIlIl[llllIlllIIIIlll] = ej.a(((am)llllIlllIIlIIII2).a, llllIlllIIIIlIl[llllIlllIIIIlll]);
                        ++llllIlllIIIIlll;
                    }
                }
                llllIlllIIIIIll = new aj(llllIlllIIIllll, llllIlllIIIIlIl);
                try {
                    if (((aj)llllIlllIIIIIll).a == llIIII[17]) {
                        llllIlllIIlIIIl.a((aj)llllIlllIIIIIll);
                        continue;
                    }
                    llllIlllIIlIIIl.a.d.a((aj)llllIlllIIIIIll);
                }
                catch (Exception llllIlllIIIIIIl) {
                    llllIlllIIIIIIl.printStackTrace();
                }
            }
        }
        catch (Exception llllIlllIIlIIII2) {
            // empty catch block
        }
        if (llllIlllIIlIIIl.a.f) {
            if (llllIlllIIlIIIl.a.d != null) {
                if (System.currentTimeMillis() - llllIlllIIlIIIl.a.p > 500L) {
                    llllIlllIIlIIII2 = llllIlllIIlIIIl.a.d;
                    fn.b();
                } else {
                    llllIlllIIlIIIl.a.d.b();
                }
            }
            if (llllIlllIIlIIIl.a.e != null) {
                ej.c(llllIlllIIlIIIl.a);
            }
        }
    }

    private void a(aj llllIllIlllIIIl) {
        try {
            am llllIllIlllIIll;
            byte llllIllIllIllll = llllIllIlllIIIl.b().readByte();
            llllIllIlllIIll.a.o = new byte[llllIllIllIllll];
            int llllIllIllIllIl = llIIII[5];
            while (llllIllIllIllIl < llllIllIllIllll) {
                llllIllIlllIIll.a.o[llllIllIllIllIl] = llllIllIlllIIIl.b().readByte();
                ++llllIllIllIllIl;
            }
            llllIllIllIllIl = llIIII[5];
            while (llllIllIllIllIl < llllIllIlllIIll.a.o.length - llIIII[9]) {
                byte[] llllIllIllIlIll = llllIllIlllIIll.a.o;
                int n2 = llllIllIllIllIl + llIIII[9];
                llllIllIllIlIll[n2] = (byte)(llllIllIllIlIll[n2] ^ llllIllIlllIIll.a.o[llllIllIllIllIl]);
                ++llllIllIllIllIl;
            }
            llllIllIlllIIll.a.n = llIIII[9];
        }
        catch (IOException llllIllIllIllIl) {
            llllIllIllIllIl.printStackTrace();
        }
    }

    static {
        am.lIIIll();
    }

    private static void lIIIll() {
        llIIII = new int[18];
        am.llIIII[0] = -(0xAD ^ 0x8D);
        am.llIIII[1] = 156 + 42 - 55 + 112;
        am.llIIII[2] = "   ".length() << "   ".length();
        am.llIIII[3] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        am.llIIII[4] = " ".length() << "   ".length();
        am.llIIII[5] = (0xDB ^ 0x82) & ~(0x36 ^ 0x6F);
        am.llIIII[6] = 4 ^ 1;
        am.llIIII[7] = " ".length() << ((0x5D ^ 0x58) << " ".length());
        am.llIIII[8] = " ".length() << " ".length();
        am.llIIII[9] = " ".length();
        am.llIIII[10] = (0x26 ^ 0x31) << " ".length();
        am.llIIII[11] = (0x2B ^ 0x18) << " ".length();
        am.llIIII[12] = " ".length() << (" ".length() << " ".length());
        am.llIIII[13] = 0x52 ^ 0x19;
        am.llIIII[14] = "   ".length();
        am.llIIII[15] = (0x61 ^ 0x50) << " ".length();
        am.llIIII[16] = -" ".length();
        am.llIIII[17] = -(0x1C ^ 7);
    }
}

