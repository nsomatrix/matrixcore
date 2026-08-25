/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class da {
    public /* synthetic */ byte a;
    public /* synthetic */ byte b;
    public /* synthetic */ byte c;
    public /* synthetic */ byte d;
    public /* synthetic */ short e;
    public /* synthetic */ int f;
    public /* synthetic */ String g;
    public /* synthetic */ Image[] h;
    public /* synthetic */ bw[] i;
    public /* synthetic */ bm[] j;
    public /* synthetic */ byte[] k;
    public /* synthetic */ byte[][] l;
    public /* synthetic */ byte[][] m;
    public /* synthetic */ byte[] n;
    public /* synthetic */ byte[] o;
    private static final /* synthetic */ int[] llIIIlI;

    public da() {
        this.d = (byte)llIIIlI[0];
        this.m = new byte[llIIIlI[1]][];
        this.o = new byte[llIIIlI[1]];
    }

    static {
        da.lIIlIII();
    }

    private static void lIIlIII() {
        llIIIlI = new int[2];
        da.llIIIlI[0] = (0xD ^ 6) << "   ".length() & ~((2 ^ 9) << "   ".length());
        da.llIIIlI[1] = " ".length() << (" ".length() << " ".length());
    }
}

