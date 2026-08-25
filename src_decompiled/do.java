/*
 * Decompiled with CFR 0.152.
 */
public class do
implements Runnable {
    private /* synthetic */ cd a;
    private /* synthetic */ int b;
    private /* synthetic */ boolean c;
    private static final /* synthetic */ int[] lIIIIIII;

    do(cd cd2) {
        this.a = cd2;
        this.c = lIIIIIII[0];
        this.b = lIIIIIII[1];
    }

    @Override
    public final void run() {
        try {
            do llIllllIIlllIll;
            while (bq.E instanceof bt && llIllllIIlllIll.c && at.e() > lIIIIIII[2]) {
                if (llIllllIIlllIll.b >= llIllllIIlllIll.a.f || at.e() <= lIIIIIII[2]) {
                    llIllllIIlllIll.c = lIIIIIII[1];
                    break;
                }
                ei.a().f(llIllllIIlllIll.a.e);
                Thread.sleep(at.L);
                llIllllIIlllIll.b += lIIIIIII[0];
            }
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    static {
        do.llIIIlI();
    }

    private static void llIIIlI() {
        lIIIIIII = new int[3];
        do.lIIIIIII[0] = " ".length();
        do.lIIIIIII[1] = (0x86 ^ 0x9D) & ~(0x3B ^ 0x20);
        do.lIIIIIII[2] = 0x7C ^ 0x79;
    }
}

