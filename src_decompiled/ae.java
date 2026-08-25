/*
 * Decompiled with CFR 0.152.
 */
final class ae
implements Runnable {
    final /* synthetic */ ej a;
    private static final /* synthetic */ int[] llllll;

    public ae(ej ej2) {
        this.a = ej2;
        ej.a(ej2, new dh());
    }

    @Override
    public final void run() {
        while (this.a.f) {
            try {
                ae llllIIlIIlIllII;
                if (llllIIlIIlIllII.a.n) {
                    while (ej.b(llllIIlIIlIllII.a).size() > 0) {
                        aj llllIIlIIlIlIll = (aj)ej.b(llllIIlIIlIllII.a).elementAt(llllll[0]);
                        ej.b(llllIIlIIlIllII.a).removeElementAt(llllll[0]);
                        ej.a(llllIIlIIlIllII.a, llllIIlIIlIlIll);
                    }
                }
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException llllIIlIIlIlIll) {}
            }
            catch (Exception llllIIlIIlIlIll) {
                llllIIlIIlIlIll.printStackTrace();
            }
        }
    }

    static {
        ae.lIllll();
    }

    private static void lIllll() {
        llllll = new int[1];
        ae.llllll[0] = (0xD9 ^ 0xC2) & ~(0x19 ^ 2);
    }
}

