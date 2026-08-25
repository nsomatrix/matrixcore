/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.TimeZone;

public class r
extends d {
    public /* synthetic */ int w;
    public static /* synthetic */ boolean x;
    private static final /* synthetic */ int[] llIlIl;

    static {
        r.lIIlll();
        x = llIlIl[0];
    }

    public void a(int n2, int n3, int n4) {
        super.b();
        this.c = n3;
        this.d = n4;
        this.w = n2;
        this.b = fb.g(n3);
    }

    public static int e(int n2) {
        Calendar calendar = Calendar.getInstance();
        byte[] byArray = new byte[llIlIl[1]];
        byArray[r.llIlIl[0]] = llIlIl[0];
        byArray[r.llIlIl[2]] = llIlIl[3];
        byArray[r.llIlIl[4]] = llIlIl[0];
        byArray[r.llIlIl[5]] = llIlIl[6];
        byArray[r.llIlIl[7]] = llIlIl[0];
        byArray[r.llIlIl[8]] = llIlIl[9];
        byArray[r.llIlIl[10]] = llIlIl[0];
        byArray[r.llIlIl[11]] = llIlIl[12];
        byArray[r.llIlIl[13]] = llIlIl[0];
        byArray[r.llIlIl[14]] = llIlIl[15];
        byArray[r.llIlIl[16]] = llIlIl[0];
        byArray[r.llIlIl[17]] = llIlIl[18];
        byArray[r.llIlIl[19]] = llIlIl[0];
        byArray[r.llIlIl[20]] = llIlIl[21];
        byArray[r.llIlIl[22]] = llIlIl[0];
        byArray[r.llIlIl[23]] = llIlIl[24];
        byArray[r.llIlIl[25]] = llIlIl[0];
        byArray[r.llIlIl[26]] = llIlIl[27];
        byArray[r.llIlIl[28]] = llIlIl[0];
        byArray[r.llIlIl[29]] = llIlIl[30];
        byArray[r.llIlIl[31]] = llIlIl[0];
        byArray[r.llIlIl[32]] = llIlIl[9];
        byArray[r.llIlIl[33]] = llIlIl[0];
        byArray[r.llIlIl[34]] = llIlIl[24];
        byArray[r.llIlIl[35]] = llIlIl[0];
        byArray[r.llIlIl[36]] = llIlIl[37];
        byArray[r.llIlIl[38]] = llIlIl[0];
        byArray[r.llIlIl[39]] = llIlIl[9];
        byArray[r.llIlIl[40]] = llIlIl[0];
        byArray[r.llIlIl[41]] = llIlIl[42];
        byArray[r.llIlIl[43]] = llIlIl[0];
        byArray[r.llIlIl[44]] = llIlIl[30];
        calendar.setTimeZone(TimeZone.getTimeZone(ec.a(byArray)));
        return calendar.get(n2);
    }

    @Override
    protected void p() {
        if (r.b(v.f())) {
            if (v.cH) {
                r.a(llIlIl[2]);
            }
        } else {
            cd llllIllIIllllll;
            int llllIllIlIIIIII;
            r llllIllIlIIIIIl;
            if (fm.k) {
                if (r.e(llIlIl[17]) == fm.g && r.e(llIlIl[19]) == fm.h) {
                    if (j.q() == llIlIl[45]) {
                        j.D = llIlIl[2];
                        j.E = llIlIl[0];
                    }
                    at.J.s();
                    at.a(at.J);
                    return;
                }
                if (r.e(llIlIl[17]) == fm.g + llIlIl[2] && r.e(llIlIl[19]) == fm.h + llIlIl[4] && j.q() == llIlIl[45]) {
                    j.D = llIlIl[0];
                    j.E = llIlIl[2];
                    at.J.s();
                    at.a(at.J);
                    return;
                }
                if (fm.l) {
                    if (x) {
                        x = llIlIl[0];
                        at.J.s();
                        at.a(at.J);
                        return;
                    }
                    if (r.e(llIlIl[17]) == fm.i && r.e(llIlIl[19]) == fm.j && at.e(llIlIl[46]) && !x) {
                        ei.a().f(at.f((int)r.llIlIl[46]).e);
                        fn.a(200L);
                    }
                }
            }
            if (!d.r && v.f().c) {
                llllIllIlIIIIIl.l();
                return;
            }
            if (at.Q == llIlIl[5]) {
                llllIllIlIIIIII = llIlIl[0];
                while (llllIllIlIIIIII < v.f().aC.length) {
                    llllIllIIllllll = v.f().aC[llllIllIlIIIIII];
                    if (r.a(llllIllIIllllll) && !llllIllIIllllll.h) {
                        llllIllIIllllll.x = System.currentTimeMillis();
                        ei.a().r(llllIllIIllllll.e);
                    }
                    ++llllIllIlIIIIII;
                }
            }
            if (at.Q == llIlIl[5] && (fb.d(fb.o) || fb.f(fb.o))) {
                llllIllIlIIIIII = llIlIl[0];
                while (llllIllIlIIIIII < v.f().aC.length) {
                    llllIllIIllllll = v.f().aC[llllIllIlIIIIII];
                    if (llllIllIIllllll != null && llllIllIIllllll.b.b >= 0 && llllIllIIllllll.b.b <= llIlIl[14] && llllIllIIllllll.b.a < llIlIl[47] && llllIllIIllllll.j <= 0) {
                        llllIllIIllllll.x = System.currentTimeMillis();
                        ei.a().g(llllIllIIllllll.e, llIlIl[2]);
                    }
                    ++llllIllIlIIIIII;
                }
            }
            if (llllIllIlIIIIIl.c == fb.o && llllIllIlIIIIIl.d == fb.l) {
                if ((v.cC || at.T) && at.l() && at.e() <= llIlIl[8] && !fb.e(fb.o) && !fb.d(fb.o) && !fb.f(fb.o)) {
                    d.g();
                    return;
                }
                if (v.cE && at.k() && at.e() <= llIlIl[8] && !fb.e(fb.o) && !fb.d(fb.o) && !fb.f(fb.o)) {
                    d.g();
                    return;
                }
                llllIllIlIIIIIl.c(llIlIl[48]);
                llllIllIlIIIIIl.b(llllIllIlIIIIIl.w, llllIllIlIIIIIl.a(v.cn, v.co, v.cp));
                return;
            }
            llllIllIlIIIIIl.a(llllIllIlIIIIIl.c, llllIllIlIIIIIl.d, llllIllIlIIIIIl.e, llllIllIlIIIIIl.f);
        }
    }

    public static boolean a(cd cd2) {
        cd llllIllIIllllIl;
        if (cd2 == null) {
            return llIlIl[0];
        }
        if (llllIllIIllllIl.h) {
            return llIlIl[0];
        }
        if (llllIllIIllllIl.w || System.currentTimeMillis() - llllIllIIllllIl.x < 5000L) {
            return llIlIl[0];
        }
        if (llllIllIIllllIl.b.b >= 0 && llllIllIIllllIl.b.b <= llIlIl[14] && llllIllIIllllIl.b.a < llIlIl[47] && llllIllIIllllIl.n == llIlIl[8]) {
            if (!llllIllIIllllIl.v()) {
                return llIlIl[0];
            }
            return llIlIl[2];
        }
        return llIlIl[0];
    }

    public static boolean b(cd cd2) {
        cd llllIllIIlllIll;
        if (cd2 == null) {
            return llIlIl[0];
        }
        if (llllIllIIlllIll.h) {
            return llIlIl[0];
        }
        if (llllIllIIlllIll.w || System.currentTimeMillis() - llllIllIIlllIll.x < 5000L) {
            return llIlIl[0];
        }
        if (llllIllIIlllIll.b.b >= 0 && llllIllIIlllIll.b.b <= llIlIl[14] && llllIllIIlllIll.b.a < llIlIl[47] && llllIllIIlllIll.n != llIlIl[8]) {
            if (!llllIllIIlllIll.v()) {
                return llIlIl[0];
            }
            return llIlIl[2];
        }
        return llIlIl[0];
    }

    @Override
    public String toString() {
        if (this.w > 0 && this.w < cx.a.length) {
            byte[] byArray = new byte[llIlIl[25]];
            byArray[r.llIlIl[0]] = llIlIl[0];
            byArray[r.llIlIl[2]] = llIlIl[49];
            byArray[r.llIlIl[4]] = llIlIl[0];
            byArray[r.llIlIl[5]] = llIlIl[50];
            byArray[r.llIlIl[7]] = llIlIl[0];
            byArray[r.llIlIl[8]] = llIlIl[42];
            byArray[r.llIlIl[10]] = llIlIl[0];
            byArray[r.llIlIl[11]] = llIlIl[1];
            byArray[r.llIlIl[13]] = llIlIl[0];
            byArray[r.llIlIl[14]] = llIlIl[6];
            byArray[r.llIlIl[16]] = llIlIl[0];
            byArray[r.llIlIl[17]] = llIlIl[51];
            byArray[r.llIlIl[19]] = llIlIl[0];
            byArray[r.llIlIl[20]] = llIlIl[52];
            byArray[r.llIlIl[22]] = llIlIl[0];
            byArray[r.llIlIl[23]] = llIlIl[1];
            return ec.a(byArray) + cx.a[this.w].g;
        }
        byte[] byArray = new byte[llIlIl[22]];
        byArray[r.llIlIl[0]] = llIlIl[0];
        byArray[r.llIlIl[2]] = llIlIl[49];
        byArray[r.llIlIl[4]] = llIlIl[0];
        byArray[r.llIlIl[5]] = llIlIl[50];
        byArray[r.llIlIl[7]] = llIlIl[0];
        byArray[r.llIlIl[8]] = llIlIl[42];
        byArray[r.llIlIl[10]] = llIlIl[0];
        byArray[r.llIlIl[11]] = llIlIl[1];
        byArray[r.llIlIl[13]] = llIlIl[0];
        byArray[r.llIlIl[14]] = llIlIl[6];
        byArray[r.llIlIl[16]] = llIlIl[0];
        byArray[r.llIlIl[17]] = llIlIl[51];
        byArray[r.llIlIl[19]] = llIlIl[0];
        byArray[r.llIlIl[20]] = llIlIl[52];
        return ec.a(byArray);
    }

    private static void lIIlll() {
        llIlIl = new int[53];
        r.llIlIl[0] = (0xCD ^ 0x8A) & ~(0x20 ^ 0x67);
        r.llIlIl[1] = " ".length() << (0x10 ^ 0x15);
        r.llIlIl[2] = " ".length();
        r.llIlIl[3] = 0x33 ^ 0x72;
        r.llIlIl[4] = " ".length() << " ".length();
        r.llIlIl[5] = "   ".length();
        r.llIlIl[6] = 0xE8 ^ 0x9B;
        r.llIlIl[7] = " ".length() << (" ".length() << " ".length());
        r.llIlIl[8] = 0x1F ^ 0x1A;
        r.llIlIl[9] = 0x1B ^ 0x72;
        r.llIlIl[10] = "   ".length() << " ".length();
        r.llIlIl[11] = 0x9D ^ 0x9A;
        r.llIlIl[12] = 3 ^ 0x62;
        r.llIlIl[13] = " ".length() << "   ".length();
        r.llIlIl[14] = 0xB1 ^ 0xB8;
        r.llIlIl[15] = 0x9A ^ 0xB5;
        r.llIlIl[16] = (0x48 ^ 0x4D) << " ".length();
        r.llIlIl[17] = 7 ^ 0xC;
        r.llIlIl[18] = (0x97 ^ 0x9E) << "   ".length();
        r.llIlIl[19] = "   ".length() << (" ".length() << " ".length());
        r.llIlIl[20] = 0x8C ^ 0x81;
        r.llIlIl[21] = 0x3B ^ 0x54;
        r.llIlIl[22] = (0x13 ^ 0x14) << " ".length();
        r.llIlIl[23] = 0x9B ^ 0x94;
        r.llIlIl[24] = 0x1E ^ 0x41;
        r.llIlIl[25] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        r.llIlIl[26] = 0x6F ^ 0x7E;
        r.llIlIl[27] = 0x68 ^ 0x2B;
        r.llIlIl[28] = (0x84 ^ 0x8D) << " ".length();
        r.llIlIl[29] = 0x37 ^ 0x24;
        r.llIlIl[30] = (0x70 ^ 0x7D) << "   ".length();
        r.llIlIl[31] = (0x27 ^ 0x22) << (" ".length() << " ".length());
        r.llIlIl[32] = 0x16 ^ 3;
        r.llIlIl[33] = (0xC8 ^ 0xC3) << " ".length();
        r.llIlIl[34] = 0x69 ^ 0x7E;
        r.llIlIl[35] = "   ".length() << "   ".length();
        r.llIlIl[36] = 0x58 ^ 0x41;
        r.llIlIl[37] = 0xF ^ 0x42;
        r.llIlIl[38] = (0x28 ^ 0x25) << " ".length();
        r.llIlIl[39] = 8 ^ 0x13;
        r.llIlIl[40] = (0x85 ^ 0x82) << (" ".length() << " ".length());
        r.llIlIl[41] = 0x2C ^ 0x31;
        r.llIlIl[42] = (0x6E ^ 0x59) << " ".length();
        r.llIlIl[43] = (0xB3 ^ 0xBC) << " ".length();
        r.llIlIl[44] = 0x14 ^ 0xB;
        r.llIlIl[45] = 2 + 101 - 10 + 64;
        r.llIlIl[46] = (0x73 ^ 0x50) << "   ".length();
        r.llIlIl[47] = 34 + 83 - 48 + 126 << (" ".length() << " ".length());
        r.llIlIl[48] = -" ".length();
        r.llIlIl[49] = (0x29 ^ 0x3C) << (" ".length() << " ".length());
        r.llIlIl[50] = -(0x33 ^ 0x13);
        r.llIlIl[51] = -(0x3C ^ 0x23);
        r.llIlIl[52] = (0x15 ^ 8) << (" ".length() << " ".length());
    }
}

