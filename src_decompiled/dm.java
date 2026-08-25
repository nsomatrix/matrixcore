/*
 * Decompiled with CFR 0.152.
 */
public final class dm
extends v {
    public /* synthetic */ dn cT;
    public static /* synthetic */ dn[] cU;
    private static final /* synthetic */ int[] lIlIlIII;

    public dm(int n2, int n3, int n4, int n5, int n6) {
        this.j = n4;
        this.k = n5;
        this.o = n3;
        this.cT = cU[n6];
    }

    /*
     * WARNING - void declaration
     */
    public static void I() {
        int n2 = lIlIlIII[0];
        while (n2 < bt.K.size()) {
            void llIIlIIlIIlIllI;
            dm llIIlIIlIIlIlIl = (dm)bt.K.elementAt((int)llIIlIIlIIlIllI);
            ((dm)bt.K.elementAt((int)llIIlIIlIIlIllI)).bY = null;
            llIIlIIlIIlIlIl.bX = lIlIlIII[1];
            ++llIIlIIlIIlIllI;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void j() {
        block4: {
            block6: {
                block5: {
                    if (this.bY != null) break block4;
                    v0 = new byte[dm.lIlIlIII[2]];
                    v0[dm.lIlIlIII[0]] = dm.lIlIlIII[1];
                    v0[dm.lIlIlIII[3]] = dm.lIlIlIII[4];
                    v0[dm.lIlIlIII[5]] = dm.lIlIlIII[4];
                    v0[dm.lIlIlIII[6]] = dm.lIlIlIII[7];
                    v0[dm.lIlIlIII[8]] = dm.lIlIlIII[7];
                    v0[dm.lIlIlIII[9]] = dm.lIlIlIII[10];
                    v0[dm.lIlIlIII[11]] = dm.lIlIlIII[10];
                    var1_1 = v0;
                    if (v.f().s < dm.lIlIlIII[4] || v.f().s > dm.lIlIlIII[7] || v.f().aw.a <= 0 || var1_1[v.f().aw.a] != this.cT.a) break block5;
                    if (v.f().aB == null) ** GOTO lbl-1000
                    if (v.f().aB == null || v.f().aB.a + dm.lIlIlIII[3] != v.f().aB.e.length) break block4;
                    llIIlIIlIIlIIIl.bY = bt.w[dm.lIlIlIII[12]];
                    break block6;
                }
                bt.m();
                llIIlIIlIIIllll = bt.F();
                if (v.f().aB != null || llIIlIIlIIIllll != llIIlIIlIIlIIIl.cT.a) {
                    if (v.f().aB != null && llIIlIIlIIIllll == llIIlIIlIIlIIIl.cT.a) {
                        ** if (v.f().aB.a + dm.lIlIlIII[3] != v.f().aB.e.length) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            llIIlIIlIIlIIIl.bY = bt.w[dm.lIlIlIII[12]];
                            ** GOTO lbl28
                        }
                    } else {
                        ** GOTO lbl26
                    }
                }
                ** GOTO lbl-1000
lbl26:
                // 2 sources

                break block4;
lbl-1000:
                // 3 sources

                {
                    llIIlIIlIIlIIIl.bY = bt.w[dm.lIlIlIII[13]];
                }
            }
            llIIlIIlIIlIIIl.bX = dm.lIlIlIII[0];
        }
        super.j();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        if (this.t() && this.o != lIlIlIII[14]) {
            dm llIIlIIIlIIIlIl;
            if (this.aO != 0) {
                super.a(fh2);
            } else if (llIIlIIIlIIIlIl.cT != null) {
                void llIIlIIIlIIIIll;
                if (llIIlIIIlIIIlIl.cT.a == lIlIlIII[15]) {
                    if (v.f().aV != null && v.f().aV.equals(llIIlIIIlIIIlIl)) {
                        ev.a((fh)llIIlIIIlIIIIll, lIlIlIII[16], llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k - llIIlIIIlIIIlIl.ah - lIlIlIII[3], lIlIlIII[0], lIlIlIII[17]);
                    }
                    ev.a((fh)llIIlIIIlIIIIll, lIlIlIII[18], llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k, lIlIlIII[0], lIlIlIII[17]);
                    fg.i.a((fh)llIIlIIIlIIIIll, String.valueOf(fb.l), llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k - lIlIlIII[7] - lIlIlIII[5] - fg.g.c(), lIlIlIII[5]);
                } else if (llIIlIIIlIIIlIl.cT.a == lIlIlIII[19]) {
                    if (v.f().aV != null && v.f().aV.equals(llIIlIIIlIIIlIl)) {
                        ev.a((fh)llIIlIIIlIIIIll, lIlIlIII[16], llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k - llIIlIIIlIIIlIl.ah - lIlIlIII[3], lIlIlIII[0], lIlIlIII[17]);
                    }
                    ev.a((fh)llIIlIIIlIIIIll, lIlIlIII[20], llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k, lIlIlIII[0], lIlIlIII[17]);
                } else if (llIIlIIIlIIIlIl.cT.a == lIlIlIII[21]) {
                    if (v.f().aV != null && v.f().aV.equals(llIIlIIIlIIIlIl)) {
                        ev.a((fh)llIIlIIIlIIIIll, lIlIlIII[16], llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k - llIIlIIIlIIIlIl.ah - lIlIlIII[3], lIlIlIII[0], lIlIlIII[17]);
                    }
                    ev.a((fh)llIIlIIIlIIIIll, lIlIlIII[22], llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k, lIlIlIII[0], lIlIlIII[17]);
                } else {
                    dq llIIlIIIlIIIIIl = bt.v[llIIlIIIlIIIlIl.cT.c];
                    dq llIIlIIIIllllll = bt.v[llIIlIIIlIIIlIl.cT.e];
                    dq llIIlIIIIllllIl = bt.v[llIIlIIIlIIIlIl.cT.d];
                    if (llIIlIIIlIIIlIl.p == lIlIlIII[3]) {
                        ev.a((fh)llIIlIIIlIIIIll, llIIlIIIlIIIIIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[0]][dm.lIlIlIII[0]]].a, llIIlIIIlIIIlIl.j + v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[0]][lIlIlIII[3]] + llIIlIIIlIIIIIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[0]][dm.lIlIlIII[0]]].b, llIIlIIIlIIIlIl.k - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[0]][lIlIlIII[5]] + llIIlIIIlIIIIIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[0]][dm.lIlIlIII[0]]].c, lIlIlIII[0], lIlIlIII[0]);
                        ev.a((fh)llIIlIIIlIIIIll, llIIlIIIIllllll.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[3]][dm.lIlIlIII[0]]].a, llIIlIIIlIIIlIl.j + v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[3]][lIlIlIII[3]] + llIIlIIIIllllll.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[3]][dm.lIlIlIII[0]]].b, llIIlIIIlIIIlIl.k - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[3]][lIlIlIII[5]] + llIIlIIIIllllll.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[3]][dm.lIlIlIII[0]]].c, lIlIlIII[0], lIlIlIII[0]);
                        ev.a((fh)llIIlIIIlIIIIll, llIIlIIIIllllIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[5]][dm.lIlIlIII[0]]].a, llIIlIIIlIIIlIl.j + v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[5]][lIlIlIII[3]] + llIIlIIIIllllIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[5]][dm.lIlIlIII[0]]].b, llIIlIIIlIIIlIl.k - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[5]][lIlIlIII[5]] + llIIlIIIIllllIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[5]][dm.lIlIlIII[0]]].c, lIlIlIII[0], lIlIlIII[0]);
                    } else {
                        ev.a((fh)llIIlIIIlIIIIll, llIIlIIIlIIIIIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[0]][dm.lIlIlIII[0]]].a, llIIlIIIlIIIlIl.j - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[0]][lIlIlIII[3]] - llIIlIIIlIIIIIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[0]][dm.lIlIlIII[0]]].b, llIIlIIIlIIIlIl.k - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[0]][lIlIlIII[5]] + llIIlIIIlIIIIIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[0]][dm.lIlIlIII[0]]].c, lIlIlIII[5], lIlIlIII[23]);
                        ev.a((fh)llIIlIIIlIIIIll, llIIlIIIIllllll.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[3]][dm.lIlIlIII[0]]].a, llIIlIIIlIIIlIl.j - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[3]][lIlIlIII[3]] - llIIlIIIIllllll.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[3]][dm.lIlIlIII[0]]].b, llIIlIIIlIIIlIl.k - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[3]][lIlIlIII[5]] + llIIlIIIIllllll.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[3]][dm.lIlIlIII[0]]].c, lIlIlIII[5], lIlIlIII[23]);
                        ev.a((fh)llIIlIIIlIIIIll, llIIlIIIIllllIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[5]][dm.lIlIlIII[0]]].a, llIIlIIIlIIIlIl.j - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[5]][lIlIlIII[3]] - llIIlIIIIllllIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[5]][dm.lIlIlIII[0]]].b, llIIlIIIlIIIlIl.k - v.bC[llIIlIIIlIIIlIl.an][lIlIlIII[5]][lIlIlIII[5]] + llIIlIIIIllllIl.a[v.bC[llIIlIIIlIIIlIl.an][dm.lIlIlIII[5]][dm.lIlIlIII[0]]].c, lIlIlIII[5], lIlIlIII[23]);
                    }
                    if (llIIlIIIlIIIlIl.bX >= 0 && llIIlIIIlIIIlIl.bY != null && llIIlIIIlIIIlIl.aO == 0) {
                        ev.a((fh)llIIlIIIlIIIIll, llIIlIIIlIIIlIl.bY.b[llIIlIIIlIIIlIl.bX].c, llIIlIIIlIIIlIl.j + llIIlIIIlIIIlIl.bY.b[llIIlIIIlIIIlIl.bX].a, llIIlIIIlIIIlIl.k + llIIlIIIlIIIlIl.bY.b[llIIlIIIlIIIlIl.bX].b, lIlIlIII[0], lIlIlIII[6]);
                        if (bq.w % lIlIlIII[5] == 0) {
                            llIIlIIIlIIIlIl.bX += lIlIlIII[3];
                            if (llIIlIIIlIIIlIl.bX >= llIIlIIIlIIIlIl.bY.b.length) {
                                llIIlIIIlIIIlIl.bX = lIlIlIII[0];
                            }
                        }
                    }
                    if (v.f().aV != null && v.f().aV.equals(llIIlIIIlIIIlIl)) {
                        fg.j.a((fh)llIIlIIIlIIIIll, llIIlIIIlIIIlIl.cT.b, llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k - llIIlIIIlIIIlIl.ah - fg.g.c() - lIlIlIII[2], lIlIlIII[5], fg.k);
                        ev.a((fh)llIIlIIIlIIIIll, lIlIlIII[16], llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k - llIIlIIIlIIIlIl.ah - lIlIlIII[5], lIlIlIII[0], lIlIlIII[17]);
                    } else {
                        fg.j.a((fh)llIIlIIIlIIIIll, llIIlIIIlIIIlIl.cT.b, llIIlIIIlIIIlIl.j, llIIlIIIlIIIlIl.k - llIIlIIIlIIIlIl.ah - lIlIlIII[6] - fg.g.c(), lIlIlIII[5], fg.k);
                    }
                }
            }
        }
    }

    static {
        dm.lIIIIIII();
    }

    private static void lIIIIIII() {
        lIlIlIII = new int[24];
        dm.lIlIlIII[0] = (0x81 ^ 0xB8) & ~(0x4A ^ 0x73);
        dm.lIlIlIII[1] = -" ".length();
        dm.lIlIlIII[2] = 0x76 ^ 0x71;
        dm.lIlIlIII[3] = " ".length();
        dm.lIlIlIII[4] = 0x7A ^ 0x73;
        dm.lIlIlIII[5] = " ".length() << " ".length();
        dm.lIlIlIII[6] = "   ".length();
        dm.lIlIlIII[7] = (0x11 ^ 0x14) << " ".length();
        dm.lIlIlIII[8] = " ".length() << (" ".length() << " ".length());
        dm.lIlIlIII[9] = 7 ^ 2;
        dm.lIlIlIII[10] = 0xB2 ^ 0xB9;
        dm.lIlIlIII[11] = "   ".length() << " ".length();
        dm.lIlIlIII[12] = (0x33 ^ 0x2C) << " ".length();
        dm.lIlIlIII[13] = 0x9D ^ 0xA4;
        dm.lIlIlIII[14] = 0xB2 ^ 0xBD;
        dm.lIlIlIII[15] = 0xA ^ 7;
        dm.lIlIlIII[16] = 133 + 6 - -37 + 71 << (" ".length() << " ".length());
        dm.lIlIlIII[17] = 5 ^ 0x24;
        dm.lIlIlIII[18] = 2 + 225 - 226 + 264 << (" ".length() << " ".length());
        dm.lIlIlIII[19] = 0x9C ^ 0x83;
        dm.lIlIlIII[20] = 98 + 275 - 362 + 1280;
        dm.lIlIlIII[21] = 0x60 ^ 0x7B;
        dm.lIlIlIII[22] = 68 + 128 - 48 + 5 << "   ".length();
        dm.lIlIlIII[23] = "   ".length() << "   ".length();
    }
}

