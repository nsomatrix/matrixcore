/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public class fr {
    private static final /* synthetic */ int[] llllllI;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void a() {
        int llIlllllIIIIlIl;
        block38: {
            cd llIllllIlllllIl;
            cd llIlllllIIIIlll;
            while (true) {
                int llIlllllIIIIlII;
                int llIlllllIIIlIII;
                cd llIlllllIIIIllI;
                int llIlllllIIIlIIl = llllllI[0];
                while (true) {
                    if (llIlllllIIIlIIl >= v.f().aE.length) {
                        llIlllllIIIIlll = null;
                        break;
                    }
                    if (v.f().aE[llIlllllIIIlIIl] != null && fr.a(v.f().aE[llIlllllIIIlIIl])) {
                        llIlllllIIIIllI = v.f().aE[llIlllllIIIlIIl];
                        llIlllllIIIlIII = llIlllllIIIlIIl + llllllI[1];
                        while (llIlllllIIIlIII < v.f().aE.length) {
                            if (v.f().aE[llIlllllIIIlIII] != null && fr.a(v.f().aE[llIlllllIIIlIII]) && v.f().aE[llIlllllIIIlIII].j < llIlllllIIIIllI.j) {
                                llIlllllIIIIllI = v.f().aE[llIlllllIIIlIII];
                            }
                            ++llIlllllIIIlIII;
                        }
                        llIlllllIIIIlll = llIlllllIIIIllI;
                        break;
                    }
                    ++llIlllllIIIlIIl;
                }
                if (llIlllllIIIIlll == null) {
                    if (!v.cC) return;
                    fr.a(v.cB - llllllI[1], llllllI[1]);
                    return;
                }
                if (llIlllllIIIIlll.j == llllllI[2]) {
                    if ((llIlllllIIIIlll.r() || llIlllllIIIIlll.s()) && !llIlllllIIIIlll.t()) {
                        fr.a(llIlllllIIIIlll.j, llllllI[3]);
                    }
                    if (llIlllllIIIIlll.t()) {
                        fr.a(llIlllllIIIIlll.j, llllllI[4]);
                    }
                }
                if (llIlllllIIIIlll.j >= llllllI[5] && llIlllllIIIIlll.j <= llllllI[6]) {
                    fr.a(llIlllllIIIIlll.j, llllllI[3]);
                }
                if (llIlllllIIIIlll.j == fq.a().f - llllllI[1]) {
                    fr.a(llIlllllIIIIlll.j, fq.a().d);
                    return;
                }
                if (llIlllllIIIIlll.j == fq.a().i + llllllI[1]) {
                    fr.a(llIlllllIIIIlll.j, fq.a().d);
                    return;
                }
                if (llIlllllIIIIlll.j == fq.a().h) {
                    fr.a(llIlllllIIIIlll.j, at.W);
                    return;
                }
                if (llIlllllIIIIlll.j == fq.a().i) {
                    if (llIlllllIIIIlll.t()) {
                        llIlllllIIIIlIl = fq.a().d;
                        llIlllllIIIIlII = fq.a().h;
                    } else {
                        llIlllllIIIIlIl = fq.a().j - llllllI[7];
                        llIlllllIIIIlII = fq.a().d;
                    }
                } else if (llIlllllIIIIlll.j == fq.a().d) {
                    llIlllllIIIIlIl = fq.a().e;
                    llIlllllIIIIlII = fq.a().j - llllllI[7];
                } else if (llIlllllIIIIlll.j == fq.a().e + llllllI[1]) {
                    llIlllllIIIIlIl = fq.a().e;
                    llIlllllIIIIlII = llIlllllIIIIlll.t() ? fq.a().j - llllllI[7] : fq.a().e;
                } else if (llIlllllIIIIlll.j == fq.a().e) {
                    llIlllllIIIIlIl = fq.a().c - llllllI[7];
                    llIlllllIIIIlII = fq.a().e;
                } else if (llIlllllIIIIlll.j == fq.a().c - llllllI[7]) {
                    llIlllllIIIIlIl = fq.a().g;
                    llIlllllIIIIlII = fq.a().e;
                } else if (llIlllllIIIIlll.j == fq.a().g) {
                    llIlllllIIIIlIl = llIlllllIIIIlll.t() ? fq.a().b + llllllI[1] : fq.a().b;
                    llIlllllIIIIlII = fq.a().e;
                } else {
                    llIlllllIIIIlIl = fq.a().b;
                    llIlllllIIIIlII = fq.a().e;
                }
                al llIlllllIIIIIll = new al(llIlllllIIIIlll);
                int llIlllllIIIIIlI = llIlllllIIIIIll.a;
                int llIlllllIIIIIIl = llIlllllIIIIIll.b;
                int llIlllllIIIIIII = llIlllllIIIIIll.c;
                llIlllllIIIlIIl = llIlllllIIIIlII;
                int llIllllIlllllll = llIlllllIIIIlIl;
                int llIllllIllllllI = llllllI[0];
                llIlllllIIIlIII = llllllI[0];
                while (llIlllllIIIlIII < v.f().aC.length) {
                    llIllllIlllllIl = v.f().aC[llIlllllIIIlIII];
                    if (llIllllIlllllIl != null && llIllllIlllllIl.b.b == llllllI[8] && llIllllIlllllIl.b.a >= llIllllIlllllll && llIllllIlllllIl.b.a <= llIlllllIIIlIIl) {
                        llIllllIllllllI += bt.aQ[llIllllIlllllIl.b.a];
                    }
                    ++llIlllllIIIlIII;
                }
                if (!((float)(llIllllIllllllI * llllllI[9] / llIlllllIIIIIlI) >= (float)llIlllllIIIIIII) || llIlllllIIIIIIl > v.f().au) break block38;
                bt.N = llIlllllIIIIlll.e;
                ei.a().b(llIlllllIIIIlll.e);
                if (!fo.J() || at.V < 0 || (llIllllIlllllIl = v.f().aC[at.V]) == null) break;
                at.V = llllllI[10];
                if (fb.f(fb.o)) {
                    llIlllllIIIIllI = at.f(llllllI[11]);
                    if (llIlllllIIIIllI == null && (llIlllllIIIIllI = at.f(llllllI[12])) == null) {
                        bt.b(llllllI[13], llllllI[0], llllllI[0]);
                        fn.a(100L);
                        ei.a().a(llllllI[14], llllllI[15], llllllI[1]);
                        fo.a(2000L);
                        llIlllllIIIIllI = at.f(llllllI[12]);
                    }
                    if (llIlllllIIIIllI != null) {
                        ei.a().h(llIlllllIIIIllI.e, llllllI[16]);
                        fb.j();
                    }
                }
                if (!fb.d(fb.o)) return;
                bt.b(fq.a().d, fq.a().b, fq.a().b);
                fo.J();
                bt.aB = llIllllIlllllIl;
                v.f().aC[llIllllIlllllIl.e] = null;
                bt.at = new cd[llllllI[17]];
                int llIllllIlllllII = llllllI[0];
                llIlllllIIIIIIl = llllllI[0];
                float llIllllIllllIll = 0.0f;
                llIllllIllllllI = llllllI[0];
                while (llIllllIllllllI < v.f().aC.length) {
                    cd llIllllIllllIlI = v.f().aC[llIllllIllllllI];
                    if (llIllllIllllIlI != null && llIllllIllllIlI.b.b == llllllI[8] && llIllllIllllIlI.b.a >= llIlllllIIIIlIl && llIllllIllllIlI.b.a <= llIlllllIIIIlII) {
                        bt.N = llIllllIllllIlI.e;
                        bt.at[llIllllIlllllII] = llIllllIllllIlI;
                        v.f().aC[llIllllIllllllI] = null;
                        llIllllIllllIll = (llIlllllIIIIIIl += bt.aQ[llIllllIllllIlI.b.a]) * llllllI[9] / llIlllllIIIIIlI;
                        if (llIllllIllllIll >= (float)llIlllllIIIIIII || llIllllIlllllII >= llllllI[18]) break;
                        ++llIllllIlllllII;
                    }
                    ++llIllllIllllllI;
                }
                if (llIllllIllllIll > 0.0f) {
                    fn.a(1000L);
                    ei.a().a(bt.aB, bt.at, llllllI[0]);
                    if (fo.J()) {
                        fn.a(1000L);
                    }
                }
                if (bt.A()) {
                    bt.m().u();
                }
                if (v.f().aC[llIllllIlllllIl.e] == null) return;
                bt.N = llIllllIlllllIl.e;
                ei.a().f(llIllllIlllllIl.e);
                if (!fo.J()) return;
                fn.a(1000L);
            }
            if (at.V < 0) return;
            llIllllIlllllIl = v.f().aC[at.V];
            at.V = llllllI[10];
            if (llIllllIlllllIl == null || llIllllIlllllIl.b.a != llIlllllIIIIlll.b.a) return;
            ei.a().f(llIllllIlllllIl.e);
            fo.J();
            return;
        }
        if (llIlllllIIIIlIl <= 0) return;
        fr.a(llIlllllIIIIlIl, llllllI[0]);
    }

    /*
     * WARNING - void declaration
     */
    private static void a(int n2, int n3) {
        int llIllllIllIIlll;
        cd llIllllIllIIIlI;
        int llIllllIllIlIII;
        void llIllllIllIlIlI;
        void llIllllIllIlIIl;
        int llIllllIllIlIll;
        cd llIllllIllIIlIl;
        int llIllllIllIIllI;
        dh dh2 = new dh();
        int n4 = llllllI[0];
        int n5 = llllllI[0];
        int n6 = llllllI[0];
        while (llIllllIllIIllI < v.f().aE.length) {
            llIllllIllIIlIl = v.f().aE[llIllllIllIIllI];
            if (llIllllIllIIlIl != null && llIllllIllIIlIl.j == llIllllIllIlIll && fr.a(llIllllIllIIlIl)) {
                llIllllIllIlIIl.addElement(llIllllIllIIlIl);
                al llIllllIllIIlII = new al(llIllllIllIIlIl);
                llIllllIllIIlll += llIllllIllIIlII.b;
                if (llIllllIllIlIll == llllllI[2]) {
                    if (llIllllIllIIlIl.r() && llIllllIllIlIlI == llllllI[3]) {
                        llIllllIllIlIII += 4;
                    } else if (llIllllIllIIlIl.s() && llIllllIllIlIlI == llllllI[3]) {
                        llIllllIllIlIII += 5;
                    } else if (llIllllIllIIlIl.t() && llIllllIllIlIlI == llllllI[4]) {
                        llIllllIllIlIII += 4;
                    }
                }
                if (llIllllIllIlIll == llllllI[6]) {
                    if (llIllllIllIIlIl.r()) {
                        llIllllIllIlIII += 2;
                    } else if (llIllllIllIIlIl.s()) {
                        llIllllIllIlIII += 3;
                    } else if (llIllllIllIIlIl.t()) {
                        llIllllIllIlIII += 7;
                    }
                }
                if (llIllllIllIlIll == llllllI[19]) {
                    if (llIllllIllIIlIl.r()) {
                        ++llIllllIllIlIII;
                    } else if (llIllllIllIIlIl.s()) {
                        llIllllIllIlIII += 2;
                    } else if (llIllllIllIIlIl.t()) {
                        llIllllIllIlIII += 5;
                    }
                }
                if (llIllllIllIlIll == llllllI[20]) {
                    if (llIllllIllIIlIl.r()) {
                        ++llIllllIllIlIII;
                    } else if (llIllllIllIIlIl.s()) {
                        llIllllIllIlIII += 2;
                    } else if (llIllllIllIIlIl.t()) {
                        llIllllIllIlIII += 4;
                    }
                }
                if (llIllllIllIlIll == llllllI[5]) {
                    if (llIllllIllIIlIl.r()) {
                        ++llIllllIllIlIII;
                    } else if (llIllllIllIIlIl.s()) {
                        llIllllIllIlIII += 2;
                    } else if (llIllllIllIIlIl.t()) {
                        llIllllIllIlIII += 5;
                    }
                }
                if (llIllllIllIlIll == fq.a().f - llllllI[1]) {
                    if (llIllllIllIIlIl.r()) {
                        llIllllIllIlIII += fq.a().b + llllllI[1];
                    } else if (llIllllIllIIlIl.s()) {
                        llIllllIllIlIII += fq.a().g;
                    } else if (llIllllIllIIlIl.t()) {
                        llIllllIllIlIII += fq.a().e;
                    }
                } else if (llIllllIllIlIll == fq.a().i + llllllI[1]) {
                    if (!llIllllIllIIlIl.r() && !llIllllIllIIlIl.s()) {
                        if (llIllllIllIIlIl.t()) {
                            llIllllIllIlIII += fq.a().c - llllllI[7];
                        }
                    } else {
                        llIllllIllIlIII += fq.a().g - llllllI[1];
                    }
                } else if (llIllllIllIlIll == fq.a().h) {
                    if (llIllllIllIlIlI == fq.a().d) {
                        if (!llIllllIllIIlIl.r() && !llIllllIllIIlIl.s()) {
                            if (llIllllIllIIlIl.t()) {
                                llIllllIllIlIII += fq.a().g;
                            }
                        } else {
                            llIllllIllIlIII += fq.a().b + llllllI[1];
                        }
                    } else if (llIllllIllIIlIl.r()) {
                        llIllllIllIlIII += fq.a().g;
                    } else if (llIllllIllIIlIl.s()) {
                        llIllllIllIlIII += fq.a().c - llllllI[7];
                    } else if (llIllllIllIIlIl.t()) {
                        llIllllIllIlIII += fq.a().h;
                    }
                }
            }
            ++llIllllIllIIllI;
        }
        int llIllllIllIIlII = llllllI[0];
        int llIllllIllIIIll = llllllI[0];
        while (llIllllIllIIIll < v.f().aC.length) {
            llIllllIllIIIlI = v.f().aC[llIllllIllIIIll];
            if (llIllllIllIIIlI != null && llIllllIllIIIlI.b.b == llllllI[8] && llIllllIllIIIlI.b.a == llIllllIllIlIlI) {
                ++llIllllIllIIlII;
            }
            ++llIllllIllIIIll;
        }
        if (llIllllIllIlIII > 0 && llIllllIllIIlII >= llIllllIllIlIII && llIllllIllIIlll <= v.f().au) {
            if (fb.f(fb.o)) {
                llIllllIllIIlIl = at.f(llllllI[11]);
                if (llIllllIllIIlIl == null && (llIllllIllIIlIl = at.f(llllllI[12])) == null) {
                    bt.b(llllllI[13], llllllI[0], llllllI[0]);
                    fn.a(100L);
                    ei.a().a(llllllI[14], llllllI[15], llllllI[1]);
                    fo.a(2000L);
                    llIllllIllIIlIl = at.f(llllllI[12]);
                }
                if (llIllllIllIIlIl != null) {
                    ei.a().h(llIllllIllIIlIl.e, llllllI[16]);
                    fb.j();
                }
            }
            if (fb.d(fb.o)) {
                llIllllIllIlIll = llllllI[0];
                while (llIllllIllIlIll < llIllllIllIlIIl.size()) {
                    llIllllIllIIlIl = (cd)llIllllIllIlIIl.elementAt(llIllllIllIlIll);
                    al llIllllIllIIIIl = new al(llIllllIllIIlIl);
                    llIllllIllIIlll = llIllllIllIIIIl.a;
                    llIllllIllIIllI = llIllllIllIIIIl.b;
                    llIllllIllIlIII = llIllllIllIIIIl.c;
                    llIllllIllIIlII = llllllI[0];
                    llIllllIllIIIll = llllllI[0];
                    while (llIllllIllIIIll < v.f().aC.length) {
                        llIllllIllIIIlI = v.f().aC[llIllllIllIIIll];
                        if (llIllllIllIIIlI != null && llIllllIllIIIlI.b.b == llllllI[8] && llIllllIllIIIlI.b.a == llIllllIllIlIlI) {
                            llIllllIllIIlII += bt.aQ[llIllllIllIIIlI.b.a];
                        }
                        ++llIllllIllIIIll;
                    }
                    if ((float)(llIllllIllIIlII * llllllI[9] / llIllllIllIIlll) >= (float)llIllllIllIlIII && llIllllIllIIllI <= v.f().au) {
                        cd llIllllIllIIIII;
                        bt.N = llIllllIllIIlIl.e;
                        ei.a().b(llIllllIllIIlIl.e);
                        if (!fo.J() || at.V < 0 || (llIllllIllIIIII = v.f().aC[at.V]) == null) {
                            if (at.V >= 0) {
                                llIllllIllIIIII = v.f().aC[at.V];
                                at.V = llllllI[10];
                                if (llIllllIllIIIII != null && llIllllIllIIIII.b.a == llIllllIllIIlIl.b.a) {
                                    ei.a().f(llIllllIllIIIII.e);
                                    fo.J();
                                }
                            }
                            return;
                        }
                        at.V = llllllI[10];
                        bt.b(fq.a().d, fq.a().b, fq.a().b);
                        fo.J();
                        bt.aB = llIllllIllIIIII;
                        v.f().aC[llIllllIllIIIII.e] = null;
                        bt.at = new cd[llllllI[17]];
                        llIllllIllIIllI = llllllI[0];
                        int llIllllIlIlllll = llllllI[0];
                        float llIllllIlIllllI = 0.0f;
                        llIllllIllIIIll = llllllI[0];
                        while (llIllllIllIIIll < v.f().aC.length) {
                            llIllllIllIIIlI = v.f().aC[llIllllIllIIIll];
                            if (llIllllIllIIIlI != null && llIllllIllIIIlI.b.b == llllllI[8] && llIllllIllIIIlI.b.a == llIllllIllIlIlI) {
                                bt.N = llIllllIllIIIlI.e;
                                bt.at[llIllllIllIIllI] = llIllllIllIIIlI;
                                v.f().aC[llIllllIllIIIll] = null;
                                llIllllIlIllllI = (llIllllIlIlllll += bt.aQ[llIllllIllIIIlI.b.a]) * llllllI[9] / llIllllIllIIlll;
                                if (llIllllIlIllllI >= (float)llIllllIllIlIII || llIllllIllIIllI >= llllllI[18]) break;
                                ++llIllllIllIIllI;
                            }
                            ++llIllllIllIIIll;
                        }
                        if (llIllllIlIllllI > 0.0f) {
                            fn.a(1000L);
                            ei.a().a(bt.aB, bt.at, llllllI[0]);
                            if (fo.J()) {
                                fn.a(1000L);
                            }
                        }
                        if (bt.A()) {
                            bt.m().u();
                        }
                        if (v.f().aC[llIllllIllIIIII.e] != null) {
                            bt.N = llIllllIllIIIII.e;
                            ei.a().f(llIllllIllIIIII.e);
                            if (fo.J()) {
                                fn.a(1000L);
                            }
                        }
                    }
                    ++llIllllIllIlIll;
                }
                return;
            }
        } else {
            fr.a((int)llIllllIllIlIlI, llllllI[0]);
        }
    }

    /*
     * WARNING - void declaration
     */
    static void a(int n2, boolean bl2) {
        int n3 = at.e();
        boolean bl3 = fb.f(fb.o);
        v v2 = v.f();
        if (n3 > 0 && v2.s > llllllI[14]) {
            int llIllllIlIIlIlI;
            int llIllllIlIlIIII;
            int llIllllIlIIlIll;
            block21: {
                int n4 = llllllI[0];
                while (llIllllIlIIlIll < llIllllIlIlIIII) {
                    if (at.h(llIllllIlIIlIll) >= llllllI[13]) {
                        llIllllIlIIlIlI = llllllI[1];
                        break block21;
                    }
                    ++llIllllIlIIlIll;
                }
                llIllllIlIIlIlI = llllllI[0];
            }
            if (llIllllIlIIlIlI != 0) {
                Object llIllllIlIIlIIl;
                void llIllllIlIIllIl;
                if (llIllllIlIIllIl != false) {
                    llIllllIlIIlIIl = at.f(llllllI[11]);
                    if (llIllllIlIIlIIl == null && (llIllllIlIIlIIl = at.f(llllllI[12])) == null) {
                        bt.b(llllllI[13], llllllI[0], llllllI[0]);
                        fn.a(100L);
                        ei.a().a(llllllI[14], llllllI[15], llllllI[1]);
                        fo.a(2000L);
                        llIllllIlIIlIIl = at.f(llllllI[12]);
                    }
                    if (llIllllIlIIlIIl != null) {
                        ei.a().h(((cd)llIllllIlIIlIIl).e, llllllI[16]);
                        fb.j();
                    }
                }
                if (fb.d(fb.o)) {
                    void llIllllIlIIllll;
                    cd llIllllIlIIIlIl;
                    bt.b(llllllI[15], llllllI[1], llllllI[1]);
                    fo.J();
                    llIllllIlIIlIIl = new dh();
                    int llIllllIlIIlIII = llllllI[0];
                    block1: while (llIllllIlIIlIII < llIllllIlIlIIII) {
                        void llIllllIlIIllII;
                        ((dh)llIllllIlIIlIIl).removeAllElements();
                        llIllllIlIIlIll = llllllI[0];
                        while (llIllllIlIIlIll < llIllllIlIIllII.aC.length) {
                            cd llIllllIlIIIlll = llIllllIlIIllII.aC[llIllllIlIIlIll];
                            if (llIllllIlIIIlll != null && llIllllIlIIIlll.b.a == llIllllIlIIlIII) {
                                ((dh)llIllllIlIIlIIl).addElement(llIllllIlIIIlll);
                            }
                            ++llIllllIlIIlIll;
                        }
                        while (((Vector)llIllllIlIIlIIl).size() >= llllllI[13]) {
                            llIllllIlIIlIll = llllllI[1];
                            int llIllllIlIIIllI = llIllllIlIIlIII;
                            while (llIllllIlIIIllI < llIllllIlIlIIII && bt.aU[llIllllIlIIIllI] <= llIllllIlIIllII.au && llIllllIlIIlIll << llllllI[21] <= ((Vector)llIllllIlIIlIIl).size() && llIllllIlIIlIll < llllllI[22]) {
                                llIllllIlIIlIll <<= llllllI[21];
                                ++llIllllIlIIIllI;
                            }
                            if (llIllllIlIIlIll == llllllI[1]) break block1;
                            bt.as = new cd[llllllI[23]];
                            llIllllIlIIIllI = llllllI[0];
                            while (llIllllIlIIIllI < llIllllIlIIlIll) {
                                bt.as[llIllllIlIIIllI] = llIllllIlIIIlIl = (cd)((dh)llIllllIlIIlIIl).elementAt(llllllI[0]);
                                llIllllIlIIllII.aC[llIllllIlIIIlIl.e] = null;
                                ((dh)llIllllIlIIlIIl).removeElementAt(llllllI[0]);
                                ++llIllllIlIIIllI;
                            }
                            ei.a().b(bt.as);
                            fo.a(2000L);
                            if (bt.as[llllllI[0]] == null) continue;
                            llIllllIlIIllII.aC[bt.as[fr.llllllI[0]].e] = bt.as[llllllI[0]];
                        }
                        ++llIllllIlIIlIII;
                    }
                    if (bt.A()) {
                        bt.m().u();
                        fn.a(1000L);
                    }
                    if (llIllllIlIIllll != false) {
                        if (v.f().aD == null) {
                            ei.a().i(llllllI[13]);
                            fo.a(7000L);
                        }
                        if (bt.j(llllllI[16]) != null && (Math.abs(bt.j((int)fr.llllllI[16]).j - v.f().j) > llllllI[24] || Math.abs(bt.j((int)fr.llllllI[16]).k - v.f().k) > llllllI[24])) {
                            v.b(bt.j((int)fr.llllllI[16]).j, bt.j((int)fr.llllllI[16]).k);
                        }
                        bt.m().e(llllllI[13]);
                        llIllllIlIIlIll = llllllI[0];
                        int llIllllIlIIIlII = at.f();
                        while (llIllllIlIIlIll < v.f().aC.length) {
                            llIllllIlIIIlIl = v.f().aC[llIllllIlIIlIll];
                            if (llIllllIlIIIlIl != null && llIllllIlIIIlIl.b.a == llIllllIlIlIIII && llIllllIlIIIlII > 0) {
                                ei.a().e(llIllllIlIIIlIl.e);
                                --llIllllIlIIIlII;
                            }
                            ++llIllllIlIIlIll;
                        }
                    }
                    ei.a().f();
                    fo.J();
                    if (llIllllIlIIllIl != false) {
                        d.g();
                    }
                }
            }
        }
    }

    private static boolean a(cd cd2) {
        if (cd2.b.b >= 0 && cd2.b.b <= llllllI[14] && cd2.b.a <= llllllI[25]) {
            if (cd2.j < at.U && cd2.q() >= at.U && cd2.j < cd2.q()) {
                return llllllI[1];
            }
            return llllllI[0];
        }
        return llllllI[0];
    }

    static {
        fr.llIIIIl();
    }

    private static void llIIIIl() {
        llllllI = new int[26];
        fr.llllllI[0] = (0x2F ^ 2) & ~(0x54 ^ 0x79);
        fr.llllllI[1] = " ".length();
        fr.llllllI[2] = 0x4A ^ 0x45;
        fr.llllllI[3] = 0xA1 ^ 0xA6;
        fr.llllllI[4] = " ".length() << "   ".length();
        fr.llllllI[5] = 0xA7 ^ 0xAC;
        fr.llllllI[6] = (0x49 ^ 0x4E) << " ".length();
        fr.llllllI[7] = (0x27 ^ 0x22) << " ".length();
        fr.llllllI[8] = (0x25 ^ 0x28) << " ".length();
        fr.llllllI[9] = (0x89 ^ 0x90) << (" ".length() << " ".length());
        fr.llllllI[10] = -" ".length();
        fr.llllllI[11] = 0x4D ^ 0x68;
        fr.llllllI[12] = 0x1A ^ 0x39;
        fr.llllllI[13] = " ".length() << (" ".length() << " ".length());
        fr.llllllI[14] = 0x40 ^ 0x49;
        fr.llllllI[15] = "   ".length() << " ".length();
        fr.llllllI[16] = 0x84 ^ 0x81;
        fr.llllllI[17] = (5 ^ 0xC) << " ".length();
        fr.llllllI[18] = 8 ^ 0x19;
        fr.llllllI[19] = 0x11 ^ 0x1C;
        fr.llllllI[20] = "   ".length() << (" ".length() << " ".length());
        fr.llllllI[21] = " ".length() << " ".length();
        fr.llllllI[22] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        fr.llllllI[23] = "   ".length() << "   ".length();
        fr.llllllI[24] = (0x79 ^ 0x72) << " ".length();
        fr.llllllI[25] = 44 + 122 - 26 + 55 << (" ".length() << " ".length());
    }
}

