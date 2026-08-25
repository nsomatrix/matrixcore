/*
 * Decompiled with CFR 0.152.
 */
public final class x {
    public /* synthetic */ dh a;
    private static /* synthetic */ x h;
    public /* synthetic */ int b;
    public static /* synthetic */ boolean c;
    public static /* synthetic */ boolean d;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ boolean f;
    public /* synthetic */ dh g;
    private static final /* synthetic */ int[] llIIlII;

    public final void a() {
        this.b += llIIlII[0];
        if (this.b > this.a.size() - llIIlII[0]) {
            this.b = llIIlII[1];
        }
    }

    public final void b() {
        this.b -= llIIlII[0];
        if (this.b < 0) {
            this.b = this.a.size() - llIIlII[0];
        }
    }

    public final void a(int n2) {
        this.b = n2;
    }

    public final void a(z z2) {
        this.b = this.a.indexOf(z2);
    }

    public final void c() {
        this.b = this.a.size() - llIIlII[0];
    }

    public static x d() {
        return h == null ? (h = new x()) : h;
    }

    public x() {
        this.a = new dh();
        this.b = llIIlII[1];
        this.g = new dh();
        this.a.addElement(new z(fa.gI[llIIlII[1]], llIIlII[1]));
        this.a.addElement(new z(fa.gJ[llIIlII[1]], llIIlII[0]));
        this.a.addElement(new z(fa.gK[llIIlII[1]], llIIlII[2]));
        this.a.addElement(new z(fa.gL[llIIlII[1]], llIIlII[3]));
        z z2 = this.a(fa.gK[llIIlII[1]]);
        byte[] byArray = new byte[llIIlII[3]];
        byArray[x.llIIlII[1]] = llIIlII[1];
        byArray[x.llIIlII[0]] = llIIlII[4];
        byArray[x.llIIlII[5]] = llIIlII[1];
        byArray[x.llIIlII[2]] = llIIlII[6];
        z2.a(ec.a(byArray) + fa.gK[llIIlII[0]]);
        byte[] byArray2 = new byte[llIIlII[3]];
        byArray2[x.llIIlII[1]] = llIIlII[1];
        byArray2[x.llIIlII[0]] = llIIlII[4];
        byArray2[x.llIIlII[5]] = llIIlII[1];
        byArray2[x.llIIlII[2]] = llIIlII[6];
        z2.a(ec.a(byArray2) + fa.gK[llIIlII[5]]);
        byte[] byArray3 = new byte[llIIlII[3]];
        byArray3[x.llIIlII[1]] = llIIlII[1];
        byArray3[x.llIIlII[0]] = llIIlII[4];
        byArray3[x.llIIlII[5]] = llIIlII[1];
        byArray3[x.llIIlII[2]] = llIIlII[6];
        z2.a(ec.a(byArray3) + fa.gK[llIIlII[2]]);
        byte[] byArray4 = new byte[llIIlII[3]];
        byArray4[x.llIIlII[1]] = llIIlII[1];
        byArray4[x.llIIlII[0]] = llIIlII[4];
        byArray4[x.llIIlII[5]] = llIIlII[1];
        byArray4[x.llIIlII[2]] = llIIlII[6];
        this.a(fa.gJ[llIIlII[1]]).a(ec.a(byArray4) + fa.gJ[llIIlII[0]]);
        byte[] byArray5 = new byte[llIIlII[3]];
        byArray5[x.llIIlII[1]] = llIIlII[1];
        byArray5[x.llIIlII[0]] = llIIlII[4];
        byArray5[x.llIIlII[5]] = llIIlII[1];
        byArray5[x.llIIlII[2]] = llIIlII[6];
        this.a(fa.gL[llIIlII[1]]).a(ec.a(byArray5) + fa.gL[llIIlII[0]]);
        byte[] byArray6 = new byte[llIIlII[3]];
        byArray6[x.llIIlII[1]] = llIIlII[1];
        byArray6[x.llIIlII[0]] = llIIlII[4];
        byArray6[x.llIIlII[5]] = llIIlII[1];
        byArray6[x.llIIlII[2]] = llIIlII[6];
        this.a(fa.gI[llIIlII[1]]).a(ec.a(byArray6) + fa.gI[llIIlII[0]]);
    }

    /*
     * WARNING - void declaration
     */
    public final z a(String string) {
        int n2 = llIIlII[1];
        while (n2 < this.a.size()) {
            void lllIlllIIlIllll;
            void lllIlllIIlIlllI;
            x lllIlllIIllIIII;
            z lllIlllIIlIllIl = (z)lllIlllIIllIIII.a.elementAt((int)lllIlllIIlIlllI);
            if (lllIlllIIlIllIl.b.equals(lllIlllIIlIllll)) {
                return lllIlllIIlIllIl;
            }
            ++lllIlllIIlIlllI;
        }
        return null;
    }

    public final void a(String string, String string2, String string3) {
        z z2 = this.a(string);
        if (z2 == null) {
            z lllIlllIIlIIIll = this.b(string);
        }
        z2.a(string2, string3);
    }

    public final z e() {
        return (z)this.a.elementAt(this.b);
    }

    public final z b(String string) {
        z z2 = new z(string, llIIlII[5]);
        if (!bq.g) {
            byte[] byArray = new byte[llIIlII[3]];
            byArray[x.llIIlII[1]] = llIIlII[1];
            byArray[x.llIIlII[0]] = llIIlII[4];
            byArray[x.llIIlII[5]] = llIIlII[1];
            byArray[x.llIIlII[2]] = llIIlII[7];
            z2.a(ec.a(byArray) + fa.gH);
        }
        this.a.addElement(z2);
        return z2;
    }

    /*
     * WARNING - void declaration
     */
    public final void c(String string) {
        int n2 = llIIlII[1];
        while (n2 < this.g.size()) {
            void lllIlllIIIllIII;
            void lllIlllIIIlIlll;
            x lllIlllIIIllIIl;
            if (((String)lllIlllIIIllIIl.g.elementAt((int)lllIlllIIIlIlll)).equals(lllIlllIIIllIII)) {
                return;
            }
            ++lllIlllIIIlIlll;
        }
        this.g.addElement(string);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean d(String string) {
        int n2 = llIIlII[1];
        while (n2 < this.g.size()) {
            void lllIlllIIIlIIlI;
            void lllIlllIIIlIIIl;
            x lllIlllIIIlIIll;
            if (((String)lllIlllIIIlIIll.g.elementAt((int)lllIlllIIIlIIIl)).equals(lllIlllIIIlIIlI)) {
                return llIIlII[0];
            }
            ++lllIlllIIIlIIIl;
        }
        return llIIlII[1];
    }

    /*
     * WARNING - void declaration
     */
    public final void e(String string) {
        int n2 = llIIlII[1];
        while (n2 < this.g.size()) {
            void lllIlllIIIIllII;
            void lllIlllIIIIlIll;
            x lllIlllIIIIllIl;
            if (((String)lllIlllIIIIllIl.g.elementAt((int)lllIlllIIIIlIll)).equals(lllIlllIIIIllII)) {
                lllIlllIIIIllIl.g.removeElementAt((int)lllIlllIIIIlIll);
                return;
            }
            ++lllIlllIIIIlIll;
        }
    }

    public static void f() {
        h = null;
    }

    static {
        x.lIIlIlI();
    }

    private static void lIIlIlI() {
        llIIlII = new int[8];
        x.llIIlII[0] = " ".length();
        x.llIIlII[1] = (0x9C ^ 0x9B) << "   ".length() & ~((0x1C ^ 0x1B) << "   ".length());
        x.llIIlII[2] = "   ".length();
        x.llIIlII[3] = " ".length() << (" ".length() << " ".length());
        x.llIIlII[4] = 6 ^ 0x65;
        x.llIIlII[5] = " ".length() << " ".length();
        x.llIIlII[6] = (0x90 ^ 0x97) << "   ".length();
        x.llIIlII[7] = (0x21 ^ 0x38) << " ".length();
    }
}

