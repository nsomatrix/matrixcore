/*
 * Decompiled with CFR 0.152.
 */
public final class b {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private /* synthetic */ int f;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private /* synthetic */ v j;
    private /* synthetic */ c k;
    private static /* synthetic */ byte[] l;
    private static /* synthetic */ int[] m;
    private static /* synthetic */ int[] n;
    private static final /* synthetic */ int[] lllIlII;

    static {
        b.lIllIII();
        byte[] byArray = new byte[lllIlII[0]];
        byArray[b.lllIlII[1]] = lllIlII[1];
        byArray[b.lllIlII[2]] = lllIlII[2];
        byArray[b.lllIlII[3]] = lllIlII[1];
        byArray[b.lllIlII[4]] = lllIlII[1];
        byArray[b.lllIlII[5]] = lllIlII[2];
        byArray[b.lllIlII[6]] = lllIlII[1];
        byArray[b.lllIlII[7]] = lllIlII[1];
        byArray[b.lllIlII[8]] = lllIlII[2];
        byArray[b.lllIlII[9]] = lllIlII[1];
        byArray[b.lllIlII[10]] = lllIlII[1];
        byArray[b.lllIlII[11]] = lllIlII[2];
        byArray[b.lllIlII[12]] = lllIlII[1];
        byArray[b.lllIlII[13]] = lllIlII[1];
        byArray[b.lllIlII[14]] = lllIlII[2];
        byArray[b.lllIlII[15]] = lllIlII[1];
        byArray[b.lllIlII[16]] = lllIlII[1];
        byArray[b.lllIlII[17]] = lllIlII[2];
        byArray[b.lllIlII[18]] = lllIlII[1];
        l = byArray;
        int[] nArray = new int[lllIlII[14]];
        nArray[b.lllIlII[1]] = lllIlII[12];
        nArray[b.lllIlII[2]] = lllIlII[19];
        nArray[b.lllIlII[3]] = lllIlII[20];
        nArray[b.lllIlII[21]] = lllIlII[22];
        nArray[b.lllIlII[4]] = lllIlII[23];
        nArray[b.lllIlII[5]] = lllIlII[24];
        nArray[b.lllIlII[6]] = lllIlII[25];
        nArray[b.lllIlII[26]] = lllIlII[27];
        nArray[b.lllIlII[7]] = lllIlII[28];
        nArray[b.lllIlII[8]] = lllIlII[29];
        nArray[b.lllIlII[9]] = lllIlII[30];
        nArray[b.lllIlII[31]] = lllIlII[32];
        nArray[b.lllIlII[10]] = lllIlII[33];
        nArray[b.lllIlII[11]] = lllIlII[34];
        nArray[b.lllIlII[12]] = lllIlII[35];
        nArray[b.lllIlII[36]] = lllIlII[37];
        nArray[b.lllIlII[13]] = lllIlII[38];
        m = nArray;
        int[] nArray2 = new int[lllIlII[36]];
        nArray2[b.lllIlII[3]] = lllIlII[6];
        nArray2[b.lllIlII[21]] = lllIlII[5];
        nArray2[b.lllIlII[4]] = lllIlII[5];
        nArray2[b.lllIlII[5]] = lllIlII[5];
        nArray2[b.lllIlII[6]] = lllIlII[2];
        nArray2[b.lllIlII[26]] = lllIlII[2];
        nArray2[b.lllIlII[7]] = lllIlII[3];
        nArray2[b.lllIlII[8]] = lllIlII[3];
        nArray2[b.lllIlII[9]] = lllIlII[21];
        nArray2[b.lllIlII[31]] = lllIlII[4];
        nArray2[b.lllIlII[10]] = lllIlII[4];
        nArray2[b.lllIlII[11]] = lllIlII[4];
        nArray2[b.lllIlII[12]] = lllIlII[1];
        n = nArray2;
    }

    public b(v v2, c c2) {
        this.a = lllIlII[39];
        this.k = null;
        this.j = v2;
        this.k = c2;
    }

    public final void a() {
        if (this.j.aS != null || this.j.aW != null) {
            b lllIIIlIIIIIIlI;
            if (lllIIIlIIIIIIlI.j.aS != null) {
                lllIIIlIIIIIIlI.d = lllIIIlIIIIIIlI.j.aS.d;
                lllIIIlIIIIIIlI.e = lllIIIlIIIIIIlI.j.aS.e - lllIIIlIIIIIIlI.j.aS.k / lllIlII[21];
            } else if (lllIIIlIIIIIIlI.j.aW != null) {
                lllIIIlIIIIIIlI.d = lllIIIlIIIIIIlI.j.aW.j;
                lllIIIlIIIIIIlI.e = lllIIIlIIIIIIlI.j.aW.k - lllIIIlIIIIIIlI.j.aW.ah / lllIlII[21];
            }
            int lllIIIlIIIIIIIl = lllIIIlIIIIIIlI.d - lllIIIlIIIIIIlI.b;
            int lllIIIlIIIIIIII = lllIIIlIIIIIIlI.e - lllIIIlIIIIIIlI.c;
            int lllIIIIllllllll = lllIlII[21];
            if (lllIIIlIIIIIIIl + lllIIIlIIIIIIII < lllIlII[40]) {
                lllIIIIllllllll = lllIlII[3];
            } else if (lllIIIlIIIIIIIl + lllIIIlIIIIIIII < lllIlII[41]) {
                lllIIIIllllllll = lllIlII[2];
            }
            if (lllIIIlIIIIIIlI.b != lllIIIlIIIIIIlI.d) {
                if (lllIIIlIIIIIIIl > 0 && lllIIIlIIIIIIIl < lllIlII[4]) {
                    lllIIIlIIIIIIlI.b = lllIIIlIIIIIIlI.d;
                } else if (lllIIIlIIIIIIIl < 0 && lllIIIlIIIIIIIl > lllIlII[42]) {
                    lllIIIlIIIIIIlI.b = lllIIIlIIIIIIlI.d;
                } else {
                    lllIIIlIIIIIIlI.f = lllIIIlIIIIIIlI.d - lllIIIlIIIIIIlI.b << lllIlII[2];
                    lllIIIlIIIIIIlI.h += lllIIIlIIIIIIlI.f;
                    lllIIIlIIIIIIlI.b += lllIIIlIIIIIIlI.h >> lllIIIIllllllll;
                    lllIIIlIIIIIIlI.h &= lllIlII[12];
                }
            }
            if (lllIIIlIIIIIIlI.c != lllIIIlIIIIIIlI.e) {
                if (lllIIIlIIIIIIII > 0 && lllIIIlIIIIIIII < lllIlII[4]) {
                    lllIIIlIIIIIIlI.c = lllIIIlIIIIIIlI.e;
                } else if (lllIIIlIIIIIIII < 0 && lllIIIlIIIIIIII > lllIlII[42]) {
                    lllIIIlIIIIIIlI.c = lllIIIlIIIIIIlI.e;
                } else {
                    lllIIIlIIIIIIlI.g = lllIIIlIIIIIIlI.e - lllIIIlIIIIIIlI.c << lllIlII[2];
                    lllIIIlIIIIIIlI.i += lllIIIlIIIIIIlI.g;
                    lllIIIlIIIIIIlI.c += lllIIIlIIIIIIlI.i >> lllIIIIllllllll;
                    lllIIIlIIIIIIlI.i &= lllIlII[12];
                }
            }
            lllIIIlIIIIIIIl = lllIlII[39];
            lllIIIlIIIIIIII = lllIlII[39];
            lllIIIIllllllll = lllIlII[39];
            int lllIIIIlllllllI = lllIlII[39];
            if (lllIIIlIIIIIIlI.j.aS != null) {
                lllIIIlIIIIIIIl = lllIIIlIIIIIIlI.d - lllIIIlIIIIIIlI.j.aS.j / lllIlII[21];
                lllIIIIllllllll = lllIIIlIIIIIIlI.d + lllIIIlIIIIIIlI.j.aS.j / lllIlII[21];
                lllIIIlIIIIIIII = lllIIIlIIIIIIlI.e - lllIIIlIIIIIIlI.j.aS.k / lllIlII[21];
                lllIIIIlllllllI = lllIIIlIIIIIIlI.e + lllIIIlIIIIIIlI.j.aS.k / lllIlII[21];
            } else if (lllIIIlIIIIIIlI.j.aW != null) {
                lllIIIlIIIIIIIl = lllIIIlIIIIIIlI.d - lllIIIlIIIIIIlI.j.aW.ag / lllIlII[21];
                lllIIIIllllllll = lllIIIlIIIIIIlI.d + lllIIIlIIIIIIlI.j.aW.ag / lllIlII[21];
                lllIIIlIIIIIIII = lllIIIlIIIIIIlI.e - lllIIIlIIIIIIlI.j.aW.ah / lllIlII[21];
                lllIIIIlllllllI = lllIIIlIIIIIIlI.e + lllIIIlIIIIIIlI.j.aW.ah / lllIlII[21];
            }
            if (lllIIIlIIIIIIlI.a > 0) {
                lllIIIlIIIIIIlI.a -= lllIlII[1];
            }
            if (lllIIIlIIIIIIlI.a != 0 && (lllIIIlIIIIIIlI.b < lllIIIlIIIIIIIl || lllIIIlIIIIIIlI.b > lllIIIIllllllll || lllIIIlIIIIIIlI.c < lllIIIlIIIIIIII || lllIIIlIIIIIIlI.c > lllIIIIlllllllI)) {
                return;
            }
        }
        this.b();
    }

    private void b() {
        this.j.bZ = null;
        this.h = this.i = lllIlII[39];
        this.g = this.i;
        this.f = this.i;
        this.e = this.i;
        this.d = this.i;
        this.c = this.i;
        this.b = this.i;
        this.j.q();
        if (this.j.al) {
            this.j.l();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(fh fh2) {
        int lllIIIIllllIIll;
        int lllIIIIllllIIIl;
        int n2 = this.d - this.b;
        int n3 = this.e - this.c;
        n2 = eb.a(n2, -n3);
        int lllIIIIllllIIlI = lllIlII[39];
        while (true) {
            if (lllIIIIllllIIlI >= m.length - lllIlII[1]) {
                lllIIIIllllIIIl = lllIlII[39];
                break;
            }
            if (lllIIIIllllIIll >= m[lllIIIIllllIIlI] && lllIIIIllllIIll <= m[lllIIIIllllIIlI + lllIlII[1]]) {
                lllIIIIllllIIIl = lllIIIIllllIIlI >= lllIlII[36] ? lllIlII[39] : lllIIIIllllIIlI;
                break;
            }
            ++lllIIIIllllIIlI;
        }
        lllIIIIllllIIll = lllIIIIllllIIIl;
        try {
            b lllIIIIllllIlIl;
            void lllIIIIllllIlII;
            ev.a((fh)lllIIIIllllIlII, lllIIIIllllIlIl.k.a[l[lllIIIIllllIIll]], lllIIIIllllIlIl.b, lllIIIIllllIlIl.c, n[lllIIIIllllIIll], lllIlII[3]);
        }
        catch (Exception lllIIIIllllIIII) {
            // empty catch block
        }
    }

    private static void lIllIII() {
        lllIlII = new int[43];
        b.lllIlII[0] = 0x2F ^ 0x36;
        b.lllIlII[1] = " ".length();
        b.lllIlII[2] = " ".length() << " ".length();
        b.lllIlII[3] = "   ".length();
        b.lllIlII[4] = 0x66 ^ 0x63;
        b.lllIlII[5] = "   ".length() << " ".length();
        b.lllIlII[6] = 0xA8 ^ 0xAF;
        b.lllIlII[7] = 0x2D ^ 0x24;
        b.lllIlII[8] = (0xB3 ^ 0xB6) << " ".length();
        b.lllIlII[9] = 0xCB ^ 0xC0;
        b.lllIlII[10] = 0xA0 ^ 0xAD;
        b.lllIlII[11] = (0x3A ^ 0x3D) << " ".length();
        b.lllIlII[12] = 0x56 ^ 0x59;
        b.lllIlII[13] = 0xA6 ^ 0xB7;
        b.lllIlII[14] = (0x39 ^ 0x30) << " ".length();
        b.lllIlII[15] = 0x59 ^ 0x4A;
        b.lllIlII[16] = 0x11 ^ 4;
        b.lllIlII[17] = (0x38 ^ 0x33) << " ".length();
        b.lllIlII[18] = 0x6B ^ 0x7C;
        b.lllIlII[19] = 0xA2 ^ 0x87;
        b.lllIlII[20] = (0x58 ^ 0x55) << (" ".length() << " ".length());
        b.lllIlII[21] = " ".length() << (" ".length() << " ".length());
        b.lllIlII[22] = 0xF7 ^ 0xBC;
        b.lllIlII[23] = 0x57 ^ 0x3E;
        b.lllIlII[24] = 60 + 20 - -15 + 32;
        b.lllIlII[25] = (0x6F ^ 0x28) << " ".length();
        b.lllIlII[26] = " ".length() << "   ".length();
        b.lllIlII[27] = 89 + 12 - -40 + 24;
        b.lllIlII[28] = 176 + 141 - 146 + 24;
        b.lllIlII[29] = 215 + 126 - 259 + 135;
        b.lllIlII[30] = (0x30 ^ 0x2D) << "   ".length();
        b.lllIlII[31] = "   ".length() << (" ".length() << " ".length());
        b.lllIlII[32] = 152 + 130 - 131 + 104;
        b.lllIlII[33] = 108 + 240 - 268 + 205;
        b.lllIlII[34] = 257 + 286 - 455 + 219;
        b.lllIlII[35] = 73 + 143 - 67 + 12 << " ".length();
        b.lllIlII[36] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        b.lllIlII[37] = 231 + 200 - 145 + 59;
        b.lllIlII[38] = 94 + 180 - 225 + 136 << " ".length();
        b.lllIlII[39] = (0x25 ^ 0x22) << " ".length() & ~((0xA0 ^ 0xA7) << " ".length());
        b.lllIlII[40] = (0xA2 ^ 0xAD) << (" ".length() << " ".length());
        b.lllIlII[41] = (0x1E ^ 0x11) << " ".length();
        b.lllIlII[42] = -(0x3A ^ 0x3F);
    }
}

