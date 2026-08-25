/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class au {
    public /* synthetic */ String a;
    public /* synthetic */ String[] b;
    public /* synthetic */ bu c;
    public /* synthetic */ int d;
    private /* synthetic */ Image l;
    private /* synthetic */ Image m;
    public /* synthetic */ Image e;
    public /* synthetic */ int f;
    public /* synthetic */ int g;
    public /* synthetic */ int h;
    public /* synthetic */ int i;
    public /* synthetic */ boolean j;
    public /* synthetic */ Object k;
    private static final /* synthetic */ int[] llIIIIl;

    public au(String string, bu bu2, int n2, Object object, int n3, int n4) {
        this.f = llIIIIl[0];
        this.g = llIIIIl[0];
        this.h = fj.ct;
        this.i = fj.cu;
        this.j = llIIIIl[0];
        this.a = string;
        this.d = n2;
        this.c = bu2;
        this.k = object;
        this.f = n3;
        this.g = n4;
        this.h = fj.ct;
        this.i = fj.cu;
        this.l = null;
        this.m = null;
    }

    public au(String string, bu bu2, int n2, Object object) {
        this.f = llIIIIl[0];
        this.g = llIIIIl[0];
        this.h = fj.ct;
        this.i = fj.cu;
        this.j = llIIIIl[0];
        this.a = string;
        this.d = n2;
        this.c = bu2;
        this.k = object;
    }

    public au(String string, int n2, Object object) {
        this.f = llIIIIl[0];
        this.g = llIIIIl[0];
        this.h = fj.ct;
        this.i = fj.cu;
        this.j = llIIIIl[0];
        this.a = string;
        this.d = n2;
        this.k = object;
    }

    public au(String string, int n2) {
        this.f = llIIIIl[0];
        this.g = llIIIIl[0];
        this.h = fj.ct;
        this.i = fj.cu;
        this.j = llIIIIl[0];
        this.a = string;
        this.d = n2;
    }

    public au(String string, int n2, int n3, int n4) {
        this.f = llIIIIl[0];
        this.g = llIIIIl[0];
        this.h = fj.ct;
        this.i = fj.cu;
        this.j = llIIIIl[0];
        this.a = string;
        this.d = llIIIIl[0];
        this.f = n3;
        this.g = n4;
    }

    public final void a() {
        if (this.d > 0) {
            au lllIlllIllIlIIl;
            if (this.c != null) {
                this.c.a(this.d, this.k);
                return;
            }
            bt.m().b(lllIlllIllIlIIl.d, lllIlllIllIlIIl.k);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(fh fh2) {
        if (this.e != null) {
            fh2.a(this.e, this.f + fh.a(this.e) / llIIIIl[1], this.g + fh.b(this.e) / llIIIIl[1], llIIIIl[2]);
        } else {
            void lllIlllIllIIlIl;
            au lllIlllIllIIllI;
            if (lllIlllIllIIllI.a != "") {
                if (!lllIlllIllIIllI.j) {
                    lllIlllIllIIlIl.a(bt.bu, lllIlllIllIIllI.f, lllIlllIllIIllI.g, llIIIIl[0]);
                } else {
                    lllIlllIllIIlIl.a(bt.bv, lllIlllIllIIllI.f, lllIlllIllIIllI.g, llIIIIl[0]);
                }
            }
            fg.d.a((fh)lllIlllIllIIlIl, lllIlllIllIIllI.a, lllIlllIllIIllI.f + llIIIIl[3], lllIlllIllIIllI.g + llIIIIl[4], llIIIIl[1]);
        }
    }

    public final boolean b() {
        this.j = llIIIIl[0];
        if (bq.b(this.f - llIIIIl[2], this.g - llIIIIl[2], this.h + llIIIIl[4], this.i + llIIIIl[4])) {
            if (bq.p) {
                this.j = llIIIIl[5];
            }
            if (bq.r && bq.q) {
                return llIIIIl[5];
            }
        }
        return llIIIIl[0];
    }

    public final void c() {
        if (this.f > 0 && this.g > 0 && this.b()) {
            this.a();
            bq.p = llIIIIl[0];
            this.j = llIIIIl[0];
        }
    }

    static {
        au.lIIIllI();
    }

    private static void lIIIllI() {
        llIIIIl = new int[6];
        au.llIIIIl[0] = (0x5C ^ 0x7F) << " ".length() & ~((0xBB ^ 0x98) << " ".length());
        au.llIIIIl[1] = " ".length() << " ".length();
        au.llIIIIl[2] = "   ".length();
        au.llIIIIl[3] = (0xA ^ 3) << (" ".length() << " ".length());
        au.llIIIIl[4] = "   ".length() << " ".length();
        au.llIIIIl[5] = " ".length();
    }
}

