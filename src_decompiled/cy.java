/*
 * Decompiled with CFR 0.152.
 */
public final class cy {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private /* synthetic */ int f;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private static /* synthetic */ int[] j;
    private static final /* synthetic */ int[] lII;

    static {
        cy.ll();
        int[] nArray = new int[lII[0]];
        nArray[cy.lII[1]] = lII[2];
        nArray[cy.lII[3]] = lII[4];
        nArray[cy.lII[5]] = lII[6];
        int[] nArray2 = nArray;
        int[] nArray3 = new int[lII[0]];
        nArray3[cy.lII[1]] = lII[2];
        nArray3[cy.lII[3]] = lII[4];
        nArray3[cy.lII[5]] = lII[6];
        nArray2 = nArray3;
        int[] nArray4 = new int[lII[0]];
        nArray4[cy.lII[1]] = lII[7];
        nArray4[cy.lII[3]] = lII[3];
        nArray4[cy.lII[5]] = lII[7];
        j = nArray4;
    }

    public final void a() {
        cy llllllllllllIII;
        if (this.i > 0 && this.i < lII[7]) {
            this.a += this.c;
            this.b += this.d;
            this.d += lII[5];
            if (this.c < lII[8]) {
                this.c += lII[3];
            }
            if (llllllllllllIII.c > lII[5]) {
                llllllllllllIII.c -= lII[3];
            }
            if (llllllllllllIII.d == lII[9]) {
                llllllllllllIII.i = llllllllllllIII.i == lII[5] ? lII[1] : lII[7];
                llllllllllllIII.h = lII[6];
                llllllllllllIII.c = eb.b(eb.a(llllllllllllIII.f - llllllllllllIII.a, llllllllllllIII.g - llllllllllllIII.b), llllllllllllIII.h);
                llllllllllllIII.d = eb.c(eb.a(llllllllllllIII.f - llllllllllllIII.a, llllllllllllIII.g - llllllllllllIII.b), llllllllllllIII.h);
            }
        } else {
            v lllllllllllIlIl = null;
            lllllllllllIlIl = (v)bt.F.elementAt(lII[1]);
            llllllllllllIII.f = lllllllllllIlIl.j;
            llllllllllllIII.g = lllllllllllIlIl.k - lllllllllllIlIl.aj;
            llllllllllllIII.a += llllllllllllIII.c;
            llllllllllllIII.b += llllllllllllIII.d;
            llllllllllllIII.h += lII[3];
            llllllllllllIII.c = eb.b(eb.a(llllllllllllIII.f - llllllllllllIII.a, llllllllllllIII.g - llllllllllllIII.b), llllllllllllIII.h);
            llllllllllllIII.d = eb.c(eb.a(llllllllllllIII.f - llllllllllllIII.a, llllllllllllIII.g - llllllllllllIII.b), llllllllllllIII.h);
            llllllllllllIII.e += lII[3];
            if (llllllllllllIII.e == j[lII[1]]) {
                llllllllllllIII.e = lII[1];
            }
            if (llllllllllllIII.a < llllllllllllIII.f + lllllllllllIlIl.ai && llllllllllllIII.a > llllllllllllIII.f - lllllllllllIlIl.ai && llllllllllllIII.b < llllllllllllIII.g + lllllllllllIlIl.aj && llllllllllllIII.b > llllllllllllIII.g - lllllllllllIlIl.aj) {
                bt.H.removeElement(llllllllllllIII);
            }
        }
    }

    private static void ll() {
        lII = new int[10];
        cy.lII[0] = "   ".length();
        cy.lII[1] = (5 ^ 0x1E) << " ".length() & ~((0x1D ^ 6) << " ".length());
        cy.lII[2] = (0xBF ^ 0xBA) << " ".length();
        cy.lII[3] = " ".length();
        cy.lII[4] = 0x5E ^ 0x5B;
        cy.lII[5] = " ".length() << " ".length();
        cy.lII[6] = 0x45 ^ 0x4E;
        cy.lII[7] = " ".length() << (" ".length() << " ".length());
        cy.lII[8] = -"  ".length();
        cy.lII[9] = "   ".length() << " ".length();
    }
}

