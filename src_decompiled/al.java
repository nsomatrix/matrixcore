/*
 * Decompiled with CFR 0.152.
 */
public final class al {
    /* synthetic */ int a;
    /* synthetic */ int b;
    /* synthetic */ int c;
    private static final /* synthetic */ int[] llllIl;

    /*
     * WARNING - void declaration
     */
    public al(cd cd2) {
        void llllIlIIlIIIlIl;
        if (cd2.r()) {
            this.a = bt.aR[cd2.j];
            this.b = bt.aV[cd2.j];
        } else if (llllIlIIlIIIlIl.s()) {
            llllIlIIlIIIllI.a = bt.aS[llllIlIIlIIIlIl.j];
            llllIlIIlIIIllI.b = bt.aW[llllIlIIlIIIlIl.j];
        } else if (llllIlIIlIIIlIl.t()) {
            llllIlIIlIIIllI.a = bt.aT[llllIlIIlIIIlIl.j];
            llllIlIIlIIIllI.b = bt.aX[llllIlIIlIIIlIl.j];
        } else {
            llllIlIIlIIIllI.a = llllIl[0];
            llllIlIIlIIIllI.b = llllIl[0];
        }
        this.c = bt.aY[cd2.j];
    }

    static {
        al.lIllIl();
    }

    private static void lIllIl() {
        llllIl = new int[1];
        al.llllIl[0] = (0x65 ^ 0x72) << " ".length() & ~((0x3B ^ 0x2C) << " ".length());
    }
}

