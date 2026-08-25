/*
 * Decompiled with CFR 0.152.
 */
public final class ce {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public /* synthetic */ int d;
    public /* synthetic */ int e;
    public /* synthetic */ int f;
    public /* synthetic */ int g;
    public /* synthetic */ ci h;
    public /* synthetic */ byte i;
    public /* synthetic */ dg j;
    public /* synthetic */ boolean k;
    public /* synthetic */ long l;
    private static final /* synthetic */ int[] lIIllIIl;

    public ce(short s2, short s3, int n2, int n3, int n4, int n5) {
        this.k = lIIllIIl[0];
        this.l = 0L;
        this.g = s2;
        this.h = cj.a(s3);
        this.a = n4;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n4 - n2 >> lIIllIIl[1];
        this.f = lIIllIIl[2];
    }

    public ce(short s2, short s3, int n2, int n3) {
        this.k = lIIllIIl[0];
        this.l = 0L;
        this.g = s2;
        this.h = cj.a(s3);
        this.a = this.c = n2;
        this.b = this.d = n3;
        this.i = (byte)lIIllIIl[3];
    }

    public final void a(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.e = n2 - this.a >> lIIllIIl[1];
        this.f = n3 - this.b >> lIIllIIl[1];
        this.i = (byte)lIIllIIl[1];
    }

    static {
        ce.lllIIll();
    }

    private static void lllIIll() {
        lIIllIIl = new int[4];
        ce.lIIllIIl[0] = (0xAF ^ 0xB6) & ~(0x75 ^ 0x6C);
        ce.lIIllIIl[1] = " ".length() << " ".length();
        ce.lIIllIIl[2] = 0x28 ^ 0x2D;
        ce.lIIllIIl[3] = " ".length();
    }
}

