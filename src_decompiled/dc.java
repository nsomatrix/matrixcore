/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class dc
extends Canvas {
    public static /* synthetic */ dc a;
    public /* synthetic */ ar b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private static /* synthetic */ boolean f;
    private static final /* synthetic */ int[] lIIIIlI;

    static {
        dc.llIIlI();
        f = lIIIIlI[0];
    }

    public dc() {
        this.c = lIIIIlI[0];
        this.setFullScreenMode(lIIIIlI[0]);
        fh.b = lIIIIlI[0];
    }

    public final void a(ar ar2) {
        this.b = ar2;
    }

    protected final void paint(Graphics graphics) {
        this.b.a(graphics);
    }

    protected final void keyPressed(int n2) {
        this.b.a(n2);
    }

    protected final void keyReleased(int n2) {
        this.b.b(n2);
    }

    protected final void pointerDragged(int n2, int n3) {
        this.b.a(n2 /= this.c, n3 /= this.c);
    }

    protected final void pointerPressed(int n2, int n3) {
        this.b.b(n2 /= this.c, n3 /= this.c);
    }

    protected final void pointerReleased(int n2, int n3) {
        this.b.c(n2 /= this.c, n3 /= this.c);
    }

    public final int a() {
        dc llllIIIllllIlll;
        return this.c == lIIIIlI[0] ? this.getHeight() : llllIIIllllIlll.e;
    }

    public final int b() {
        dc llllIIIllllIlIl;
        return this.c == lIIIIlI[0] ? this.getWidth() : llllIIIllllIlIl.d;
    }

    private static void llIIlI() {
        lIIIIlI = new int[1];
        dc.lIIIIlI[0] = " ".length();
    }
}

