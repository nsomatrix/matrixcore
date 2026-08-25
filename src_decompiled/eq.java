/*
 * Decompiled with CFR 0.152.
 */
public final class eq {
    public /* synthetic */ int a;
    public /* synthetic */ er b;
    private /* synthetic */ String c;
    private static final /* synthetic */ int[] llllI;

    public final String a() {
        if (this.c == null) {
            if (this.b.a != llllI[0] && this.b.a != llllI[1] && this.b.a != llllI[2]) {
                byte[] byArray = new byte[llllI[3]];
                byArray[eq.llllI[4]] = llllI[4];
                byArray[eq.llllI[5]] = llllI[6];
                this.c = dl.a(this.b.b, ec.a(byArray), String.valueOf(this.a));
            } else {
                eq llllllIIllllIlI;
                float llllllIIllllIIl = (float)llllllIIllllIlI.a / 1000.0f;
                byte[] byArray = new byte[llllI[3]];
                byArray[eq.llllI[4]] = llllI[4];
                byArray[eq.llllI[5]] = llllI[6];
                llllllIIllllIlI.c = dl.a(llllllIIllllIlI.b.b, ec.a(byArray), String.valueOf(llllllIIllllIIl));
            }
        }
        return this.c;
    }

    static {
        eq.lIIll();
    }

    private static void lIIll() {
        llllI = new int[7];
        eq.llllI[0] = (0x68 ^ 0x77) << " ".length();
        eq.llllI[1] = " ".length() << ("   ".length() << " ".length());
        eq.llllI[2] = (0xB7 ^ 0x94) << " ".length();
        eq.llllI[3] = " ".length() << " ".length();
        eq.llllI[4] = (0x67 ^ 0x5E) & ~(0x47 ^ 0x7E);
        eq.llllI[5] = " ".length();
        eq.llllI[6] = 0x48 ^ 0x6B;
    }
}

