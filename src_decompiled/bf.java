/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;

public final class bf
extends be {
    private /* synthetic */ short a;
    private /* synthetic */ dg b;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private /* synthetic */ int j;
    private /* synthetic */ byte k;
    private /* synthetic */ long l;
    private static /* synthetic */ bc[] m;
    private static /* synthetic */ Hashtable n;
    private static /* synthetic */ Hashtable o;
    private /* synthetic */ boolean p;
    private static final /* synthetic */ int[] lllIII;

    static {
        bf.lIlIIl();
        m = new bc[lllIII[0]];
        n = new Hashtable();
        o = new Hashtable();
    }

    public bf() {
        this.k = (byte)lllIII[1];
        this.l = 0L;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(short s2, int n2, int n3, byte by2, short s3, int n4) {
        void llllIllIIlIlIIl;
        bf bf2 = new bf();
        new bf().a = s2;
        bf2.g = n2;
        bf2.h = n3;
        bf2.k = by2;
        if (bf2.k < 0) {
            bf2.p = lllIII[2];
        } else {
            llllIllIIlIIlll.p = lllIII[1];
        }
        llllIllIIlIIlll.l = llllIllIIlIlIIl > 0 ? System.currentTimeMillis() + (long)(llllIllIIlIlIIl * lllIII[3]) : -1L;
        bf2.j = n4;
        be.c.addElement(bf2);
    }

    private bc d() {
        return m[this.a];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(fh fh2) {
        if (this.b != null && this.b.a != null && this.d().c != null) {
            void llllIllIIIlllIl;
            void llllIllIIIlllII;
            bm bm2 = this.d().b[this.d().c[this.i]];
            int n2 = lllIII[1];
            while (llllIllIIIlllII < llllIllIIIlllIl.a.length) {
                void llllIllIIIllllI;
                bf llllIllIIIlllll;
                bc llllIllIIIllIll = llllIllIIIlllll.d();
                byte llllIllIIIllIlI = llllIllIIIlllIl.c[llllIllIIIlllII];
                bw llllIllIIIllIIl = llllIllIIIllIll.a[llllIllIIIllIlI];
                if (llllIllIIIlllll.j > 0) {
                    llllIllIIIllllI.a(llllIllIIIlllll.b.a, llllIllIIIllIIl.a, llllIllIIIllIIl.b, llllIllIIIllIIl.c, llllIllIIIllIIl.d, lllIII[1], llllIllIIIlllll.g + llllIllIIIlllIl.a[llllIllIIIlllII], llllIllIIIlllll.h + llllIllIIIlllIl.b[llllIllIIIlllII] - lllIII[2], lllIII[0]);
                } else {
                    llllIllIIIllllI.a(llllIllIIIlllll.b.a, llllIllIIIllIIl.a, llllIllIIIllIIl.b, llllIllIIIllIIl.c, llllIllIIIllIIl.d, lllIII[4], llllIllIIIlllll.g - llllIllIIIlllIl.a[llllIllIIIlllII], llllIllIIIlllll.h + llllIllIIIlllIl.b[llllIllIIIlllII] - lllIII[2], lllIII[5]);
                }
                ++llllIllIIIlllII;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void a() {
        block14: {
            try {
                block15: {
                    block16: {
                        bf.m[llllIllIIIlIllI.a] = (bc)bf.o.get(String.valueOf(llllIllIIIlIllI.a));
                        if (bf.m[llllIllIIIlIllI.a] == null) {
                            bf.m[llllIllIIIlIllI.a] = new bc();
                            bf.o.put(String.valueOf(llllIllIIIlIllI.a), bf.m[llllIllIIIlIllI.a]);
                            llllIllIIIlIllI.d().d = System.currentTimeMillis();
                            ei.a().a(bf.lllIII[2], llllIllIIIlIllI.a);
                        } else if (llllIllIIIlIllI.d().c == null && System.currentTimeMillis() - llllIllIIIlIllI.d().d > 3000L) {
                            llllIllIIIlIllI.d().d = System.currentTimeMillis();
                            ei.a().a(bf.lllIII[2], llllIllIIIlIllI.a);
                        }
                        if (llllIllIIIlIllI.d().c != null) {
                            llllIllIIIlIllI.b = (dg)bf.n.get(String.valueOf(llllIllIIIlIllI.a));
                            if (llllIllIIIlIllI.b == null) {
                                llllIllIIIlIllI.b = new dg();
                                bf.n.put(String.valueOf(llllIllIIIlIllI.a), llllIllIIIlIllI.b);
                                v0 = new byte[bf.lllIII[6]];
                                v0[bf.lllIII[1]] = bf.lllIII[1];
                                v0[bf.lllIII[2]] = bf.lllIII[7];
                                v0[bf.lllIII[4]] = bf.lllIII[1];
                                v0[bf.lllIII[8]] = bf.lllIII[9];
                                v0[bf.lllIII[10]] = bf.lllIII[1];
                                v0[bf.lllIII[11]] = bf.lllIII[9];
                                v0[bf.lllIII[12]] = bf.lllIII[1];
                                v0[bf.lllIII[13]] = bf.lllIII[14];
                                v0[bf.lllIII[15]] = bf.lllIII[1];
                                v0[bf.lllIII[16]] = bf.lllIII[17];
                                v0[bf.lllIII[18]] = bf.lllIII[1];
                                v0[bf.lllIII[19]] = bf.lllIII[20];
                                v0[bf.lllIII[21]] = bf.lllIII[1];
                                v0[bf.lllIII[22]] = bf.lllIII[23];
                                v0[bf.lllIII[24]] = bf.lllIII[1];
                                v0[bf.lllIII[25]] = bf.lllIII[26];
                                llllIllIIIlIllI.b.a = av.a(dv.a(ec.a(v0) + llllIllIIIlIllI.a));
                                if (llllIllIIIlIllI.b.a == null) {
                                    llllIllIIIlIllI.b.b = System.currentTimeMillis();
                                    ei.a().a(bf.lllIII[1], llllIllIIIlIllI.a);
                                }
                            } else if (llllIllIIIlIllI.b.a == null && System.currentTimeMillis() - llllIllIIIlIllI.b.b > 6000L) {
                                llllIllIIIlIllI.b.b = System.currentTimeMillis();
                                ei.a().a(bf.lllIII[1], llllIllIIIlIllI.a);
                            }
                        }
                        if (llllIllIIIlIllI.b == null || llllIllIIIlIllI.b.a == null || llllIllIIIlIllI.d().c == null) break block14;
                        llllIllIIIlIllI.i += bf.lllIII[2];
                        if (llllIllIIIlIllI.i < llllIllIIIlIllI.d().c.length) break block15;
                        if (llllIllIIIlIllI.l == -1L) break block16;
                        if (llllIllIIIlIllI.l - System.currentTimeMillis() <= 0L) {
                            be.c.removeElement(llllIllIIIlIllI);
                        } else {
                            llllIllIIIlIllI.i = bf.lllIII[1];
                        }
                        break block15;
                    }
                    if (llllIllIIIlIllI.p) ** GOTO lbl-1000
                    llllIllIIIlIllI.k = (byte)(llllIllIIIlIllI.k - bf.lllIII[2]);
                    if (llllIllIIIlIllI.k <= 0) {
                        be.c.removeElement(llllIllIIIlIllI);
                    } else lbl-1000:
                    // 2 sources

                    {
                        llllIllIIIlIllI.i = bf.lllIII[1];
                    }
                }
                llllIllIIIlIllI.b.c = System.currentTimeMillis();
                return;
            }
            catch (Exception llllIllIIIlIlIl) {
                v1 = new byte[bf.lllIII[27]];
                v1[bf.lllIII[1]] = bf.lllIII[1];
                v1[bf.lllIII[2]] = bf.lllIII[28];
                v1[bf.lllIII[4]] = bf.lllIII[1];
                v1[bf.lllIII[8]] = bf.lllIII[29];
                v1[bf.lllIII[10]] = bf.lllIII[1];
                v1[bf.lllIII[11]] = bf.lllIII[29];
                v1[bf.lllIII[12]] = bf.lllIII[1];
                v1[bf.lllIII[13]] = bf.lllIII[26];
                v1[bf.lllIII[15]] = bf.lllIII[1];
                v1[bf.lllIII[16]] = bf.lllIII[17];
                v1[bf.lllIII[18]] = bf.lllIII[1];
                v1[bf.lllIII[19]] = bf.lllIII[30];
                v1[bf.lllIII[21]] = bf.lllIII[1];
                v1[bf.lllIII[22]] = bf.lllIII[31];
                v1[bf.lllIII[24]] = bf.lllIII[1];
                v1[bf.lllIII[25]] = bf.lllIII[14];
                v1[bf.lllIII[6]] = bf.lllIII[1];
                v1[bf.lllIII[32]] = bf.lllIII[20];
                v1[bf.lllIII[33]] = bf.lllIII[1];
                v1[bf.lllIII[34]] = bf.lllIII[7];
                v1[bf.lllIII[0]] = bf.lllIII[1];
                v1[bf.lllIII[35]] = bf.lllIII[26];
                v1[bf.lllIII[36]] = bf.lllIII[1];
                v1[bf.lllIII[37]] = bf.lllIII[7];
                v1[bf.lllIII[5]] = bf.lllIII[1];
                v1[bf.lllIII[38]] = bf.lllIII[9];
                v1[bf.lllIII[39]] = bf.lllIII[1];
                v1[bf.lllIII[40]] = bf.lllIII[9];
                v1[bf.lllIII[41]] = bf.lllIII[1];
                v1[bf.lllIII[42]] = bf.lllIII[14];
                v1[bf.lllIII[43]] = bf.lllIII[1];
                v1[bf.lllIII[44]] = bf.lllIII[17];
                v1[bf.lllIII[26]] = bf.lllIII[1];
                v1[bf.lllIII[45]] = bf.lllIII[20];
                v1[bf.lllIII[46]] = bf.lllIII[1];
                v1[bf.lllIII[47]] = bf.lllIII[23];
                v1[bf.lllIII[48]] = bf.lllIII[1];
                v1[bf.lllIII[49]] = bf.lllIII[50];
                System.out.println(ec.a(v1) + llllIllIIIlIlIl.toString());
            }
        }
    }

    public static void a(short s2, byte[] byArray) {
        if (((bc)bf.o.get((Object)String.valueOf((int)s2))).c == null) {
            new bc();
            bc bc2 = bf.c(s2, byArray);
            o.put(String.valueOf(s2), bc2);
        }
    }

    private static bc c(short s2, byte[] llllIllIIIIIlll) {
        try {
            int llllIllIIIIIIIl;
            int llllIllIIIIIIlI;
            bc llllIllIIIIIllI = new bc();
            ByteArrayInputStream llllIllIIIIIlIl = new ByteArrayInputStream(llllIllIIIIIlll);
            DataInputStream llllIllIIIIIlII = new DataInputStream(llllIllIIIIIlIl);
            llllIllIIIIIllI.a = new bw[llllIllIIIIIlII.readByte()];
            int llllIllIIIIIIll = lllIII[1];
            while (llllIllIIIIIIll < llllIllIIIIIllI.a.length) {
                llllIllIIIIIllI.a[llllIllIIIIIIll] = new bw();
                llllIllIIIIIlII.readByte();
                llllIllIIIIIllI.a[llllIllIIIIIIll].a = llllIllIIIIIlII.readUnsignedByte();
                llllIllIIIIIllI.a[llllIllIIIIIIll].b = llllIllIIIIIlII.readUnsignedByte();
                llllIllIIIIIllI.a[llllIllIIIIIIll].c = llllIllIIIIIlII.readUnsignedByte();
                llllIllIIIIIllI.a[llllIllIIIIIIll].d = llllIllIIIIIlII.readUnsignedByte();
                ++llllIllIIIIIIll;
            }
            llllIllIIIIIllI.b = new bm[llllIllIIIIIlII.readShort()];
            llllIllIIIIIIll = lllIII[1];
            while (llllIllIIIIIIll < llllIllIIIIIllI.b.length) {
                llllIllIIIIIllI.b[llllIllIIIIIIll] = new bm();
                llllIllIIIIIIlI = llllIllIIIIIlII.readByte();
                llllIllIIIIIllI.b[llllIllIIIIIIll].a = new short[llllIllIIIIIIlI];
                llllIllIIIIIllI.b[llllIllIIIIIIll].b = new short[llllIllIIIIIIlI];
                llllIllIIIIIllI.b[llllIllIIIIIIll].c = new byte[llllIllIIIIIIlI];
                llllIllIIIIIIIl = lllIII[1];
                while (llllIllIIIIIIIl < llllIllIIIIIIlI) {
                    llllIllIIIIIllI.b[llllIllIIIIIIll].a[llllIllIIIIIIIl] = llllIllIIIIIlII.readShort();
                    llllIllIIIIIllI.b[llllIllIIIIIIll].b[llllIllIIIIIIIl] = llllIllIIIIIlII.readShort();
                    llllIllIIIIIllI.b[llllIllIIIIIIll].c[llllIllIIIIIIIl] = llllIllIIIIIlII.readByte();
                    ++llllIllIIIIIIIl;
                }
                ++llllIllIIIIIIll;
            }
            llllIllIIIIIIIl = llllIllIIIIIlII.readShort();
            llllIllIIIIIllI.c = new short[llllIllIIIIIIIl];
            llllIllIIIIIIlI = lllIII[1];
            while (llllIllIIIIIIlI < llllIllIIIIIIIl) {
                llllIllIIIIIllI.c[llllIllIIIIIIlI] = llllIllIIIIIlII.readShort();
                ++llllIllIIIIIIlI;
            }
            return llllIllIIIIIllI;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(short s2, byte[] byArray) {
        void llllIlIllllllII;
        dg dg2 = (dg)n.get(String.valueOf(s2));
        if (dg2 == null) {
            dg2 = new dg();
            n.put(String.valueOf(s2), dg2);
        }
        llllIlIlllllIlI.a = av.a((byte[])llllIlIllllllII);
        if (bs.a != lllIII[2]) {
            short llllIlIllllllIl;
            byte[] byArray2 = new byte[lllIII[6]];
            byArray2[bf.lllIII[1]] = lllIII[1];
            byArray2[bf.lllIII[2]] = lllIII[7];
            byArray2[bf.lllIII[4]] = lllIII[1];
            byArray2[bf.lllIII[8]] = lllIII[9];
            byArray2[bf.lllIII[10]] = lllIII[1];
            byArray2[bf.lllIII[11]] = lllIII[9];
            byArray2[bf.lllIII[12]] = lllIII[1];
            byArray2[bf.lllIII[13]] = lllIII[14];
            byArray2[bf.lllIII[15]] = lllIII[1];
            byArray2[bf.lllIII[16]] = lllIII[17];
            byArray2[bf.lllIII[18]] = lllIII[1];
            byArray2[bf.lllIII[19]] = lllIII[20];
            byArray2[bf.lllIII[21]] = lllIII[1];
            byArray2[bf.lllIII[22]] = lllIII[23];
            byArray2[bf.lllIII[24]] = lllIII[1];
            byArray2[bf.lllIII[25]] = lllIII[26];
            dv.b(ec.a(byArray2) + llllIlIllllllIl, (byte[])llllIlIllllllII);
        }
    }

    public static void b() {
        try {
            Enumeration llllIlIllllIIll = n.keys();
            while (llllIlIllllIIll.hasMoreElements()) {
                String llllIlIllllIIlI = (String)llllIlIllllIIll.nextElement();
                dg llllIlIllllIIIl = (dg)n.get(llllIlIllllIIlI);
                if (System.currentTimeMillis() - llllIlIllllIIIl.c <= 60000L) continue;
                n.remove(llllIlIllllIIlI);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void c() {
        try {
            Enumeration llllIlIlllIlIIl = o.keys();
            while (llllIlIlllIlIIl.hasMoreElements()) {
                String llllIlIlllIlIII = (String)llllIlIlllIlIIl.nextElement();
                bc llllIlIlllIIllI = (bc)o.get(llllIlIlllIlIII);
                if (System.currentTimeMillis() - llllIlIlllIIllI.e <= 600000L) continue;
                o.remove(llllIlIlllIlIII);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void lIlIIl() {
        lllIII = new int[51];
        bf.lllIII[0] = (0x62 ^ 0x67) << (" ".length() << " ".length());
        bf.lllIII[1] = "   ".length() << " ".length() & ~("   ".length() << " ".length());
        bf.lllIII[2] = " ".length();
        bf.lllIII[3] = (0xB ^ 0x76) << "   ".length();
        bf.lllIII[4] = " ".length() << " ".length();
        bf.lllIII[5] = "   ".length() << "   ".length();
        bf.lllIII[6] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        bf.lllIII[7] = 0x42 ^ 0x27;
        bf.lllIII[8] = "   ".length();
        bf.lllIII[9] = (0xAB ^ 0x98) << " ".length();
        bf.lllIII[10] = " ".length() << (" ".length() << " ".length());
        bf.lllIII[11] = 0xBD ^ 0xB8;
        bf.lllIII[12] = "   ".length() << " ".length();
        bf.lllIII[13] = 1 ^ 6;
        bf.lllIII[14] = 0xEF ^ 0x8E;
        bf.lllIII[15] = " ".length() << "   ".length();
        bf.lllIII[16] = 0x81 ^ 0x88;
        bf.lllIII[17] = 0x75 ^ 0;
        bf.lllIII[18] = (3 ^ 6) << " ".length();
        bf.lllIII[19] = 0x23 ^ 0x28;
        bf.lllIII[20] = (0x19 ^ 4) << (" ".length() << " ".length());
        bf.lllIII[21] = "   ".length() << (" ".length() << " ".length());
        bf.lllIII[22] = 0xAE ^ 0xA3;
        bf.lllIII[23] = 0xAD ^ 0xC2;
        bf.lllIII[24] = (0xC6 ^ 0xC1) << " ".length();
        bf.lllIII[25] = 0xB6 ^ 0xB9;
        bf.lllIII[26] = " ".length() << (0xAA ^ 0xAF);
        bf.lllIII[27] = (0x4B ^ 0x58) << " ".length();
        bf.lllIII[28] = 0x31 ^ 0x74;
        bf.lllIII[29] = (0x2B ^ 0x12) << " ".length();
        bf.lllIII[30] = (0x9F ^ 0x98) << (" ".length() << (" ".length() << " ".length()));
        bf.lllIII[31] = (0xA ^ 0x13) << (" ".length() << " ".length());
        bf.lllIII[32] = 0x29 ^ 0x38;
        bf.lllIII[33] = (0x43 ^ 0x4A) << " ".length();
        bf.lllIII[34] = 0x6B ^ 0x78;
        bf.lllIII[35] = 0x36 ^ 0x23;
        bf.lllIII[36] = (0x76 ^ 0x7D) << " ".length();
        bf.lllIII[37] = 0x88 ^ 0x9F;
        bf.lllIII[38] = 0x45 ^ 0x5C;
        bf.lllIII[39] = (0xB9 ^ 0xB4) << " ".length();
        bf.lllIII[40] = 0xD8 ^ 0xC3;
        bf.lllIII[41] = (0x74 ^ 0x73) << (" ".length() << " ".length());
        bf.lllIII[42] = 0x8E ^ 0x93;
        bf.lllIII[43] = (0x1F ^ 0x10) << " ".length();
        bf.lllIII[44] = 0x88 ^ 0x97;
        bf.lllIII[45] = 0x66 ^ 0x47;
        bf.lllIII[46] = (0x45 ^ 0x54) << " ".length();
        bf.lllIII[47] = 0x57 ^ 0x74;
        bf.lllIII[48] = (0x59 ^ 0x50) << (" ".length() << " ".length());
        bf.lllIII[49] = 0xF ^ 0x2A;
        bf.lllIII[50] = (0x8C ^ 0x91) << " ".length();
    }
}

