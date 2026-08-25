/*
 * Decompiled with CFR 0.152.
 */
public class ff
implements Runnable {
    private final /* synthetic */ int a;
    private static final /* synthetic */ int[] llIIll;

    ff(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        try {
            ff llllIllIlIllIlI;
            fb.k(llllIllIlIllIlI.a);
        }
        catch (Exception llllIllIlIllIIl) {
            llllIllIlIllIIl.printStackTrace();
        }
        System.gc();
        if (ej.a().f) {
            bt.m().c();
        }
        bq.k();
        bq.f = llIIll[0];
    }

    static {
        ff.lIIlII();
    }

    private static void lIIlII() {
        llIIll = new int[1];
        ff.llIIll[0] = (0x80 ^ 0x8D) << (" ".length() << " ".length()) & ~((0x59 ^ 0x54) << (" ".length() << " ".length()));
    }
}

