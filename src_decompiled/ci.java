/*
 * Decompiled with CFR 0.152.
 */
public final class ci {
    public /* synthetic */ short a;
    public /* synthetic */ byte b;
    public /* synthetic */ byte c;
    public /* synthetic */ String d;
    public /* synthetic */ String e;
    public /* synthetic */ byte f;
    public /* synthetic */ short g;
    public /* synthetic */ short h;
    public /* synthetic */ boolean i;
    private static final /* synthetic */ int[] llIllI;

    public ci(short s2, byte by2, byte by3, String string, String string2, byte by4, short s3, short s4, boolean bl2) {
        this.a = s2;
        this.b = by2;
        this.c = by3;
        this.d = string;
        this.e = string2;
        this.f = by4;
        this.g = s3;
        this.h = s4;
        this.i = bl2;
    }

    public final boolean a() {
        if (this.b >= 0 && this.b <= llIllI[0]) {
            return llIllI[1];
        }
        return llIllI[2];
    }

    public final boolean b() {
        if (this.b >= llIllI[3] && this.b <= llIllI[4]) {
            return llIllI[1];
        }
        return llIllI[2];
    }

    static {
        ci.lIIllI();
    }

    private static void lIIllI() {
        llIllI = new int[5];
        ci.llIllI[0] = 0x8C ^ 0x83;
        ci.llIllI[1] = " ".length();
        ci.llIllI[2] = (0x9C ^ 0x8F) & ~(0xD5 ^ 0xC6);
        ci.llIllI[3] = 0x81 ^ 0x96;
        ci.llIllI[4] = 0x50 ^ 0x49;
    }
}

