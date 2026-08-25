/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class bo {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ Image d;
    private /* synthetic */ int[] e;
    private /* synthetic */ int f;
    private static final /* synthetic */ int[] lIIIIIll;

    /*
     * WARNING - void declaration
     */
    public bo(Image image, int n2, int n3) {
        this.d = image;
        this.a = n2;
        this.b = n3;
        this.f = image.getHeight();
        this.c = this.f / n3;
        this.e = new int[this.c];
        int n4 = lIIIIIll[0];
        while (n4 < this.c) {
            void llIllllIIllIIIl;
            void llIllllIIllIIII;
            llIllllIIllIlII.e[llIllllIIllIIII] = llIllllIIllIIII * llIllllIIllIIIl;
            ++llIllllIIllIIII;
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, fh fh2) {
        if (n2 >= 0 && n2 < this.c) {
            fh2.a(this.d, lIIIIIll[0], this.e[n2], this.a, this.b, n5, n3, n4, n6);
        }
    }

    static {
        bo.llIIlII();
    }

    private static void llIIlII() {
        lIIIIIll = new int[1];
        bo.lIIIIIll[0] = (0x4C ^ 0x5D) << " ".length() & ~((0xB0 ^ 0xA1) << " ".length());
    }
}

