/*
 * Decompiled with CFR 0.152.
 */
final class an
implements Runnable {
    private static final /* synthetic */ int[] lIlIl;

    an() {
    }

    @Override
    public final void run() {
        try {
            Thread.sleep(20000L);
        }
        catch (InterruptedException llllllIllIlllll) {
            // empty catch block
        }
        if (ej.a.g) {
            try {
                ej.a.e.close();
            }
            catch (Exception llllllIllIlllll) {
                // empty catch block
            }
            ej.r = lIlIl[0];
            ej.a.g = lIlIl[1];
            ej.a.f = lIlIl[1];
            ej.a.d.b();
        }
    }

    static {
        an.lllI();
    }

    private static void lllI() {
        lIlIl = new int[2];
        an.lIlIl[0] = " ".length();
        an.lIlIl[1] = (0x10 ^ 0x19) << (" ".length() << " ".length()) & ~((0x8E ^ 0x87) << (" ".length() << " ".length()));
    }
}

