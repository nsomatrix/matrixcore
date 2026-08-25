/*
 * Decompiled with CFR 0.152.
 */
final class fe
implements Runnable {
    private final /* synthetic */ int a;
    private static final /* synthetic */ int[] lIlIII;

    fe(int n2) {
        this.a = n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void run() {
        fe lllllIlllIIIlII;
        void lllllIlllIIIIll;
        int lllllIlllIIIIlI;
        dm dm2 = bt.j(lIlIII[0]);
        int n2 = at.g(lIlIII[1]);
        if (n2 == lIlIII[2]) {
            lllllIlllIIIIlI = at.g(lIlIII[3]);
        }
        if (lllllIlllIIIIll != null && lllllIlllIIIIll.o != lIlIII[4]) {
            if (lllllIlllIIIIlI == lIlIII[2] && (Math.abs(lllllIlllIIIIll.j - v.f().j) > lIlIII[5] || Math.abs(lllllIlllIIIIll.k - v.f().k) > lIlIII[5])) {
                v.b(lllllIlllIIIIll.j, lllllIlllIIIIll.k);
            }
        } else {
            if (fb.o != lIlIII[6] && fb.o != lIlIII[7] && fb.o != lIlIII[8] && fb.o != lIlIII[9] && fb.o != lIlIII[10] && fb.o != lIlIII[11]) {
                return;
            }
            lllllIlllIIIIlI = at.g(lIlIII[1]);
            if (lllllIlllIIIIlI < 0 && (lllllIlllIIIIlI = at.g(lIlIII[3])) < 0) {
                return;
            }
        }
        ei.a().a(lllllIlllIIIlII.a, lllllIlllIIIIlI);
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException lllllIlllIIIIIl) {
            lllllIlllIIIIIl.printStackTrace();
        }
    }

    static {
        fe.llIlI();
    }

    private static void llIlI() {
        lIlIII = new int[12];
        fe.lIlIII[0] = 0x83 ^ 0x8E;
        fe.lIlIII[1] = 0x9E ^ 0xBB;
        fe.lIlIII[2] = -" ".length();
        fe.lIlIII[3] = 0x6A ^ 0x49;
        fe.lIlIII[4] = 0x87 ^ 0x88;
        fe.lIlIII[5] = (0xB4 ^ 0xBF) << " ".length();
        fe.lIlIII[6] = 0x3F ^ 0x5C;
        fe.lIlIII[7] = 0x30 ^ 0x57;
        fe.lIlIII[8] = (0xC4 ^ 0x87) << " ".length();
        fe.lIlIII[9] = 35 + 94 - 86 + 92;
        fe.lIlIII[10] = (0x20 ^ 0x31) << "   ".length();
        fe.lIlIII[11] = 67 + 66 - 102 + 106;
    }
}

