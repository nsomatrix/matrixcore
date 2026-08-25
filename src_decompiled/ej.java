/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.SocketConnection
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.SocketConnection;

public final class ej {
    protected static /* synthetic */ ej a;
    public /* synthetic */ boolean b;
    private /* synthetic */ DataOutputStream s;
    public /* synthetic */ DataInputStream c;
    public /* synthetic */ av d;
    public /* synthetic */ SocketConnection e;
    public /* synthetic */ boolean f;
    public /* synthetic */ boolean g;
    private final /* synthetic */ ae t;
    public /* synthetic */ Thread h;
    public /* synthetic */ Thread i;
    public /* synthetic */ Thread j;
    public /* synthetic */ Thread k;
    public /* synthetic */ int l;
    public /* synthetic */ int m;
    /* synthetic */ boolean n;
    public /* synthetic */ byte[] o;
    private /* synthetic */ byte u;
    private /* synthetic */ byte v;
    /* synthetic */ long p;
    public /* synthetic */ String q;
    public static /* synthetic */ boolean r;
    private /* synthetic */ dh w;
    private static final /* synthetic */ int[] llIlllI;

    static {
        ej.lIlIIIl();
        a = new ej();
    }

    public ej() {
        this.b = llIlllI[0];
        this.t = new ae(this);
        this.o = null;
        this.q = "";
    }

    public static ej a() {
        return a;
    }

    public final boolean b() {
        return this.f;
    }

    public final void a(av av2) {
        this.d = av2;
    }

    public final void a(String string) {
        byte[] byArray = new byte[llIlllI[1]];
        byArray[ej.llIlllI[0]] = llIlllI[0];
        byArray[ej.llIlllI[2]] = llIlllI[3];
        byArray[ej.llIlllI[4]] = llIlllI[0];
        byArray[ej.llIlllI[5]] = llIlllI[6];
        byArray[ej.llIlllI[7]] = llIlllI[0];
        byArray[ej.llIlllI[8]] = llIlllI[9];
        byArray[ej.llIlllI[10]] = llIlllI[0];
        byArray[ej.llIlllI[11]] = llIlllI[9];
        byArray[ej.llIlllI[12]] = llIlllI[0];
        byArray[ej.llIlllI[13]] = llIlllI[14];
        byArray[ej.llIlllI[15]] = llIlllI[0];
        byArray[ej.llIlllI[16]] = llIlllI[3];
        byArray[ej.llIlllI[17]] = llIlllI[0];
        byArray[ej.llIlllI[18]] = llIlllI[19];
        byArray[ej.llIlllI[20]] = llIlllI[0];
        byArray[ej.llIlllI[21]] = llIlllI[22];
        byArray[ej.llIlllI[23]] = llIlllI[0];
        byArray[ej.llIlllI[24]] = llIlllI[19];
        byArray[ej.llIlllI[25]] = llIlllI[0];
        byArray[ej.llIlllI[26]] = llIlllI[6];
        byArray[ej.llIlllI[27]] = llIlllI[0];
        byArray[ej.llIlllI[28]] = llIlllI[22];
        byte[] byArray2 = new byte[llIlllI[4]];
        byArray2[ej.llIlllI[0]] = llIlllI[0];
        byArray2[ej.llIlllI[2]] = llIlllI[29];
        System.out.println(ec.a(byArray) + string + ec.a(byArray2) + bs.e);
        if (!this.f && !this.g) {
            this.n = llIlllI[0];
            this.e = null;
            this.h = new Thread(new ai(this, string));
            ap.a();
        }
    }

    public final void a(aj aj2) {
        this.t.a.w.addElement(aj2);
    }

    /*
     * WARNING - void declaration
     */
    private synchronized void b(aj aj2) {
        byte[] lllIIllIIIIllII = aj2.a();
        try {
            int lllIIllIIIIlIll;
            void lllIIllIIIIllIl;
            ej lllIIllIIIIlllI;
            if (lllIIllIIIIlllI.n) {
                lllIIllIIIIlIll = lllIIllIIIIlllI.a(lllIIllIIIIllIl.a);
                lllIIllIIIIlllI.s.writeByte(lllIIllIIIIlIll);
            } else {
                lllIIllIIIIlllI.s.writeByte(lllIIllIIIIllIl.a);
            }
            byte[] byArray = new byte[llIlllI[30]];
            byArray[ej.llIlllI[0]] = llIlllI[0];
            byArray[ej.llIlllI[2]] = llIlllI[3];
            byArray[ej.llIlllI[4]] = llIlllI[0];
            byArray[ej.llIlllI[5]] = llIlllI[31];
            byArray[ej.llIlllI[7]] = llIlllI[0];
            byArray[ej.llIlllI[8]] = llIlllI[32];
            byArray[ej.llIlllI[10]] = llIlllI[0];
            byArray[ej.llIlllI[11]] = llIlllI[22];
            byArray[ej.llIlllI[12]] = llIlllI[0];
            byArray[ej.llIlllI[13]] = llIlllI[33];
            byArray[ej.llIlllI[15]] = llIlllI[0];
            byArray[ej.llIlllI[16]] = llIlllI[14];
            byArray[ej.llIlllI[17]] = llIlllI[0];
            byArray[ej.llIlllI[18]] = llIlllI[9];
            byArray[ej.llIlllI[20]] = llIlllI[0];
            byArray[ej.llIlllI[21]] = llIlllI[32];
            byArray[ej.llIlllI[23]] = llIlllI[0];
            byArray[ej.llIlllI[24]] = llIlllI[22];
            byArray[ej.llIlllI[25]] = llIlllI[0];
            byArray[ej.llIlllI[26]] = llIlllI[34];
            byArray[ej.llIlllI[27]] = llIlllI[0];
            byArray[ej.llIlllI[28]] = llIlllI[34];
            byArray[ej.llIlllI[1]] = llIlllI[0];
            byArray[ej.llIlllI[35]] = llIlllI[34];
            byArray[ej.llIlllI[36]] = llIlllI[0];
            byArray[ej.llIlllI[37]] = llIlllI[38];
            byArray[ej.llIlllI[39]] = llIlllI[0];
            byArray[ej.llIlllI[40]] = llIlllI[22];
            new StringBuffer(ec.a(byArray)).append(lllIIllIIIIllIl.a).toString();
            if (lllIIllIIIIllII != null) {
                int lllIIllIIIIlIlI;
                lllIIllIIIIlIll = lllIIllIIIIllII.length;
                if (lllIIllIIIIllIl.a != llIlllI[41] && lllIIllIIIIlllI.n) {
                    lllIIllIIIIlIlI = lllIIllIIIIlllI.a((byte)(lllIIllIIIIlIll >> llIlllI[12]));
                    lllIIllIIIIlllI.s.writeByte(lllIIllIIIIlIlI);
                    lllIIllIIIIlIlI = lllIIllIIIIlllI.a((byte)lllIIllIIIIlIll);
                    lllIIllIIIIlllI.s.writeByte(lllIIllIIIIlIlI);
                } else {
                    lllIIllIIIIlllI.s.writeShort(lllIIllIIIIlIll);
                }
                if (lllIIllIIIIlllI.n) {
                    lllIIllIIIIlIlI = llIlllI[0];
                    while (lllIIllIIIIlIlI < lllIIllIIIIllII.length) {
                        lllIIllIIIIllII[lllIIllIIIIlIlI] = lllIIllIIIIlllI.a(lllIIllIIIIllII[lllIIllIIIIlIlI]);
                        ++lllIIllIIIIlIlI;
                    }
                }
                lllIIllIIIIlllI.s.write(lllIIllIIIIllII);
                lllIIllIIIIlllI.l += llIlllI[8] + lllIIllIIIIllII.length;
            } else {
                lllIIllIIIIlllI.s.writeShort(llIlllI[0]);
                lllIIllIIIIlllI.l += llIlllI[8];
            }
            lllIIllIIIIlllI.s.flush();
        }
        catch (IOException lllIIllIIIIlIll) {
            lllIIllIIIIlIll.printStackTrace();
        }
    }

    private byte a(byte by2) {
        byte[] byArray = this.o;
        byte by3 = this.v;
        this.v = (byte)(by3 + llIlllI[2]);
        by2 = (byte)(byArray[by3] & llIlllI[42] ^ by2 & llIlllI[42]);
        if (this.v >= this.o.length) {
            this.v = (byte)(this.v % this.o.length);
        }
        return by2;
    }

    public final void c() {
        at.a.a();
        this.d();
    }

    private void d() {
        this.o = null;
        this.u = (byte)llIlllI[0];
        this.v = (byte)llIlllI[0];
        this.n = llIlllI[0];
        this.f = llIlllI[0];
        this.g = llIlllI[0];
        this.w.removeAllElements();
        try {
            ej lllIIlIllllllll;
            if (lllIIlIllllllll.e != null) {
                lllIIlIllllllll.e.close();
                lllIIlIllllllll.e = null;
            }
            if (lllIIlIllllllll.s != null) {
                lllIIlIllllllll.s.close();
                lllIIlIllllllll.s = null;
            }
            if (lllIIlIllllllll.c != null) {
                lllIIlIllllllll.c.close();
                lllIIlIllllllll.c = null;
            }
            if (lllIIlIllllllll.j != null) {
                if (lllIIlIllllllll.j.isAlive()) {
                    lllIIlIllllllll.j.interrupt();
                }
                lllIIlIllllllll.j = null;
            }
            if (lllIIlIllllllll.k != null) {
                if (lllIIlIllllllll.k.isAlive()) {
                    lllIIlIllllllll.k.interrupt();
                }
                lllIIlIllllllll.k = null;
            }
            if (lllIIlIllllllll.h != null) {
                if (lllIIlIllllllll.h.isAlive()) {
                    lllIIlIllllllll.h.interrupt();
                }
                lllIIlIllllllll.h = null;
            }
            if (lllIIlIllllllll.i != null) {
                if (lllIIlIllllllll.i.isAlive()) {
                    lllIIlIllllllll.i.interrupt();
                }
                lllIIlIllllllll.i = null;
            }
            System.gc();
        }
        catch (Exception lllIIlIlllllllI) {
            lllIIlIlllllllI.printStackTrace();
        }
    }

    static void a(ej ej2, DataOutputStream dataOutputStream) {
        ej2.s = dataOutputStream;
    }

    static ae a(ej ej2) {
        return ej2.t;
    }

    static void a(ej ej2, aj aj2) {
        ej2.b(aj2);
    }

    static void a(ej ej2, dh dh2) {
        ej2.w = dh2;
    }

    static dh b(ej ej2) {
        return ej2.w;
    }

    static void c(ej ej2) {
        ej2.d();
    }

    static byte a(ej ej2, byte by2) {
        byte[] byArray = ej2.o;
        byte by3 = ej2.u;
        ej2.u = (byte)(by3 + llIlllI[2]);
        by2 = (byte)(byArray[by3] & llIlllI[42] ^ by2 & llIlllI[42]);
        if (ej2.u >= ej2.o.length) {
            ej2.u = (byte)(ej2.u % ej2.o.length);
        }
        return by2;
    }

    private static void lIlIIIl() {
        llIlllI = new int[43];
        ej.llIlllI[0] = (0x63 ^ 0x56) & ~(0x93 ^ 0xA6);
        ej.llIlllI[1] = (0x4A ^ 0x41) << " ".length();
        ej.llIlllI[2] = " ".length();
        ej.llIlllI[3] = 0x32 ^ 0x51;
        ej.llIlllI[4] = " ".length() << " ".length();
        ej.llIlllI[5] = "   ".length();
        ej.llIlllI[6] = 0xF0 ^ 0x9F;
        ej.llIlllI[7] = " ".length() << (" ".length() << " ".length());
        ej.llIlllI[8] = 0x7D ^ 0x78;
        ej.llIlllI[9] = (0x3F ^ 8) << " ".length();
        ej.llIlllI[10] = "   ".length() << " ".length();
        ej.llIlllI[11] = 0x73 ^ 0x74;
        ej.llIlllI[12] = " ".length() << "   ".length();
        ej.llIlllI[13] = 0x89 ^ 0x80;
        ej.llIlllI[14] = 0xE2 ^ 0x87;
        ej.llIlllI[15] = (0x3A ^ 0x3F) << " ".length();
        ej.llIlllI[16] = 0x14 ^ 0x1F;
        ej.llIlllI[17] = "   ".length() << (" ".length() << " ".length());
        ej.llIlllI[18] = 5 ^ 8;
        ej.llIlllI[19] = (0xA8 ^ 0xB5) << (" ".length() << " ".length());
        ej.llIlllI[20] = (0xB3 ^ 0xB4) << " ".length();
        ej.llIlllI[21] = 0x9B ^ 0x94;
        ej.llIlllI[22] = " ".length() << (0x76 ^ 0x73);
        ej.llIlllI[23] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        ej.llIlllI[24] = 0x20 ^ 0x31;
        ej.llIlllI[25] = (0x9F ^ 0x96) << " ".length();
        ej.llIlllI[26] = 7 ^ 0x14;
        ej.llIlllI[27] = (0x5A ^ 0x5F) << (" ".length() << " ".length());
        ej.llIlllI[28] = 0x83 ^ 0x96;
        ej.llIlllI[29] = (0xDD ^ 0xC0) << " ".length();
        ej.llIlllI[30] = (0x8F ^ 0x88) << (" ".length() << " ".length());
        ej.llIlllI[31] = 0x46 ^ 0x2B;
        ej.llIlllI[32] = (0xB7 ^ 0xAE) << (" ".length() << " ".length());
        ej.llIlllI[33] = 0xB7 ^ 0xC4;
        ej.llIlllI[34] = 0x8A ^ 0xA7;
        ej.llIlllI[35] = 0x8B ^ 0x9C;
        ej.llIlllI[36] = "   ".length() << "   ".length();
        ej.llIlllI[37] = 0x23 ^ 0x3A;
        ej.llIlllI[38] = (0x61 ^ 0x7E) << " ".length();
        ej.llIlllI[39] = (0x36 ^ 0x3B) << " ".length();
        ej.llIlllI[40] = 0x4E ^ 0x55;
        ej.llIlllI[41] = -(0x80 ^ 0x9F);
        ej.llIlllI[42] = 32 + 166 - 67 + 124;
    }
}

