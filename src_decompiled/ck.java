/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class ck {
    public /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private static final /* synthetic */ int[] lIII;

    public ck(int n2, int n3) {
        this.b = n2 * lIII[0] + lIII[1];
        this.c = n3 * lIII[0] + lIII[0] + lIII[2];
    }

    private Object a() {
        Object object = fb.x.a(String.valueOf(this.a));
        return object != null ? object : null;
    }

    public final void a(fh fh2) {
        if (!bq.a && this.a() != null) {
            fh2.a((Image)this.a(), this.b, this.c, lIII[3]);
        }
    }

    static {
        ck.l();
    }

    private static void l() {
        lIII = new int[4];
        ck.lIII[0] = "   ".length() << "   ".length();
        ck.lIII[1] = "   ".length() << (" ".length() << " ".length());
        ck.lIII[2] = "   ".length();
        ck.lIII[3] = 0x90 ^ 0xB1;
    }
}

