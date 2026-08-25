/*
 * Decompiled with CFR 0.152.
 */
public final class ak
extends fj {
    public static /* synthetic */ int a;
    private static final /* synthetic */ int[] l;

    @Override
    public final void a() {
        if (a > l[0]) {
            if (cl.b() >= 0) {
                bq.b();
                bq.G.c();
            } else {
                bq.b();
                bq.I.c();
            }
        }
        a += l[1];
    }

    static {
        ak.I();
    }

    private static void I() {
        l = new int[2];
        ak.l[0] = 0x1A ^ 0x1F;
        ak.l[1] = " ".length();
    }
}

