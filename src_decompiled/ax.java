/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;

public final class ax {
    public /* synthetic */ long a;
    public /* synthetic */ dh b;
    private /* synthetic */ ev[] t;
    private /* synthetic */ byte[][] u;
    public /* synthetic */ byte[] c;
    private /* synthetic */ byte v;
    private /* synthetic */ byte w;
    public /* synthetic */ boolean d;
    public /* synthetic */ short e;
    private /* synthetic */ byte x;
    private /* synthetic */ byte[] y;
    private /* synthetic */ boolean z;
    public /* synthetic */ boolean f;
    public /* synthetic */ byte[] g;
    public /* synthetic */ byte[] h;
    public /* synthetic */ byte[] i;
    public /* synthetic */ byte[] j;
    public /* synthetic */ byte[] k;
    public /* synthetic */ byte[] l;
    public /* synthetic */ byte[] m;
    public /* synthetic */ byte n;
    public /* synthetic */ byte o;
    public /* synthetic */ byte p;
    private /* synthetic */ dh A;
    private /* synthetic */ dh B;
    private /* synthetic */ dh C;
    private /* synthetic */ dh D;
    private /* synthetic */ dh E;
    private /* synthetic */ dh F;
    private /* synthetic */ dh G;
    public /* synthetic */ long q;
    private /* synthetic */ long H;
    public /* synthetic */ int r;
    public /* synthetic */ boolean s;
    private /* synthetic */ boolean I;
    private static final /* synthetic */ int[] lllllI;

    static {
        ax.lIlllI();
        new fi();
    }

    public ax() {
        this.b = new dh();
        new dh();
        this.u = new byte[lllllI[0]][];
        new dh();
        this.e = (short)lllllI[1];
        this.x = (byte)lllllI[1];
        this.y = new byte[lllllI[0]];
        this.f = lllllI[1];
        this.A = new dh();
        this.B = new dh();
        this.C = new dh();
        this.D = new dh();
        this.E = new dh();
        this.F = new dh();
        this.G = new dh();
        new dh();
    }

    public ax(short s2, boolean bl2) {
        this.b = new dh();
        new dh();
        this.u = new byte[lllllI[0]][];
        new dh();
        this.e = (short)lllllI[1];
        this.x = (byte)lllllI[1];
        this.y = new byte[lllllI[0]];
        this.f = lllllI[1];
        this.A = new dh();
        this.B = new dh();
        this.C = new dh();
        this.D = new dh();
        this.E = new dh();
        this.F = new dh();
        this.G = new dh();
        new dh();
        this.e = s2;
        this.z = bl2;
        this.a(null);
    }

    private void a(byte[] llllIIllllIllII) {
        try {
            ax llllIIllllIllIl;
            bh llllIIllllIlIll = (bh)br.c.a("" + llllIIllllIllIl.e);
            if (llllIIllllIlIll != null && llllIIllllIlIll.a != null) {
                llllIIllllIllII = llllIIllllIlIll.a;
            }
            if (llllIIllllIlIll == null) {
                llllIIllllIlIll = new bh();
                br.c.a("" + llllIIllllIllIl.e, llllIIllllIlIll);
                ei.a().R(llllIIllllIllIl.e);
                System.currentTimeMillis();
            }
            if (llllIIllllIllII != null && llllIIllllIllII.length > 0) {
                llllIIllllIllIl.b(llllIIllllIllII);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    private void b(byte[] byArray) {
        if (byArray != null) {
            FilterInputStream llllIIlllIlllII = null;
            try {
                try {
                    int llllIIlllIlIllI;
                    int llllIIlllIllIIl;
                    void llllIIlllIlllIl;
                    ax llllIIlllIllllI;
                    llllIIlllIllllI.b.removeAllElements();
                    llllIIlllIllllI.t = null;
                    llllIIlllIlllII = new DataInputStream(new ByteArrayInputStream((byte[])llllIIlllIlllIl));
                    short llllIIlllIllIll = ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIllllI.t = new ev[llllIIlllIllIll];
                    int llllIIlllIllIlI = lllllI[1];
                    while (llllIIlllIllIlI < llllIIlllIllIll) {
                        llllIIlllIllllI.t[llllIIlllIllIlI] = new ev(((DataInputStream)llllIIlllIlllII).readUnsignedByte(), ((DataInputStream)llllIIlllIlllII).readUnsignedByte(), ((DataInputStream)llllIIlllIlllII).readUnsignedByte(), ((DataInputStream)llllIIlllIlllII).readUnsignedByte(), ((DataInputStream)llllIIlllIlllII).readUnsignedByte());
                        ++llllIIlllIllIlI;
                    }
                    llllIIlllIllIll = ((DataInputStream)llllIIlllIlllII).readShort();
                    llllIIlllIllIlI = lllllI[1];
                    while (llllIIlllIllIlI < llllIIlllIllIll) {
                        llllIIlllIllIIl = ((DataInputStream)llllIIlllIlllII).readByte();
                        dh llllIIlllIllIII = new dh();
                        dh llllIIlllIlIlll = new dh();
                        llllIIlllIlIllI = lllllI[1];
                        while (llllIIlllIlIllI < llllIIlllIllIIl) {
                            dr llllIIlllIlIlIl = new dr(((DataInputStream)llllIIlllIlllII).readShort(), ((DataInputStream)llllIIlllIlllII).readShort(), ((DataInputStream)llllIIlllIlllII).readByte());
                            new dr(((DataInputStream)llllIIlllIlllII).readShort(), ((DataInputStream)llllIIlllIlllII).readShort(), ((DataInputStream)llllIIlllIlllII).readByte()).d = ((DataInputStream)llllIIlllIlllII).readByte();
                            llllIIlllIlIlIl.e = ((DataInputStream)llllIIlllIlllII).readByte();
                            if (llllIIlllIlIlIl.e == 0) {
                                llllIIlllIllIII.addElement(llllIIlllIlIlIl);
                            } else {
                                llllIIlllIlIlll.addElement(llllIIlllIlIlIl);
                            }
                            ++llllIIlllIlIllI;
                        }
                        llllIIlllIllllI.b.addElement(new bn(llllIIlllIllIII, llllIIlllIlIlll));
                        ++llllIIlllIllIlI;
                    }
                    short llllIIlllIllIII = (short)((DataInputStream)llllIIlllIlllII).readUnsignedByte();
                    llllIIlllIllllI.c = new byte[llllIIlllIllIII];
                    llllIIlllIllIIl = lllllI[1];
                    int llllIIlllIlIlll = lllllI[1];
                    while (llllIIlllIlIlll < llllIIlllIllIII) {
                        llllIIlllIllllI.c[llllIIlllIlIlll] = (byte)((DataInputStream)llllIIlllIlllII).readShort();
                        if (llllIIlllIllllI.z) {
                            if (llllIIlllIllIIl == lllllI[2] && llllIIlllIllllI.c[llllIIlllIlIlll] != lllllI[3]) {
                                llllIIlllIllllI.A.addElement(String.valueOf(llllIIlllIllllI.c[llllIIlllIlIlll]));
                            }
                            if (llllIIlllIllIIl == lllllI[4] && llllIIlllIllllI.c[llllIIlllIlIlll] != lllllI[3]) {
                                llllIIlllIllllI.B.addElement(String.valueOf(llllIIlllIllllI.c[llllIIlllIlIlll]));
                            }
                            if (llllIIlllIllIIl == lllllI[0] && llllIIlllIllllI.c[llllIIlllIlIlll] != lllllI[3]) {
                                llllIIlllIllllI.C.addElement(String.valueOf(llllIIlllIllllI.c[llllIIlllIlIlll]));
                            }
                            if (llllIIlllIllIIl == lllllI[5] && llllIIlllIllllI.c[llllIIlllIlIlll] != lllllI[3]) {
                                llllIIlllIllllI.D.addElement(String.valueOf(llllIIlllIllllI.c[llllIIlllIlIlll]));
                            }
                            if (llllIIlllIllIIl == lllllI[6] && llllIIlllIllllI.c[llllIIlllIlIlll] != lllllI[3]) {
                                llllIIlllIllllI.E.addElement(String.valueOf(llllIIlllIllllI.c[llllIIlllIlIlll]));
                            }
                            if (llllIIlllIllIIl == lllllI[7] && llllIIlllIllllI.c[llllIIlllIlIlll] != lllllI[3]) {
                                llllIIlllIllllI.F.addElement(String.valueOf(llllIIlllIllllI.c[llllIIlllIlIlll]));
                            }
                            if (llllIIlllIllIIl == lllllI[8] && llllIIlllIllllI.c[llllIIlllIlIlll] != lllllI[3]) {
                                llllIIlllIllllI.G.addElement(String.valueOf(llllIIlllIllllI.c[llllIIlllIlIlll]));
                            }
                            if (llllIIlllIllllI.c[llllIIlllIlIlll] == lllllI[3]) {
                                ++llllIIlllIllIIl;
                            }
                        }
                        ++llllIIlllIlIlll;
                    }
                    if (llllIIlllIllllI.z) {
                        llllIIlllIllllI.n = llllIIlllIllllI.c[lllllI[1]];
                        llllIIlllIllllI.o = llllIIlllIllllI.c[lllllI[2]];
                        llllIIlllIllllI.p = llllIIlllIllllI.c[lllllI[4]];
                        llllIIlllIllllI.k = ax.a(llllIIlllIllllI.A);
                        llllIIlllIllllI.g = ax.a(llllIIlllIllllI.B);
                        llllIIlllIllllI.h = ax.a(llllIIlllIllllI.C);
                        llllIIlllIllllI.i = ax.a(llllIIlllIllllI.D);
                        llllIIlllIllllI.j = ax.a(llllIIlllIllllI.E);
                        llllIIlllIllllI.l = ax.a(llllIIlllIllllI.F);
                        if (llllIIlllIllllI.l == null || llllIIlllIllllI.l.length == 0) {
                            llllIIlllIllllI.l = new byte[llllIIlllIllllI.n];
                        }
                        llllIIlllIllllI.m = ax.a(llllIIlllIllllI.G);
                        if (llllIIlllIllllI.m == null || llllIIlllIllllI.m.length == 0) {
                            llllIIlllIllllI.m = new byte[llllIIlllIllllI.n];
                        }
                        llllIIlllIllllI.A.removeAllElements();
                        llllIIlllIllllI.B.removeAllElements();
                        llllIIlllIllllI.C.removeAllElements();
                        llllIIlllIllllI.D.removeAllElements();
                        llllIIlllIllllI.E.removeAllElements();
                        llllIIlllIllllI.F.removeAllElements();
                        llllIIlllIllllI.G.removeAllElements();
                    }
                    ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIlIllI = ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIllllI.u[ax.lllllI[1]] = new byte[llllIIlllIlIllI];
                    llllIIlllIlIlll = lllllI[1];
                    while (llllIIlllIlIlll < llllIIlllIlIllI) {
                        llllIIlllIllllI.u[ax.lllllI[1]][llllIIlllIlIlll] = ((DataInputStream)llllIIlllIlllII).readByte();
                        ++llllIIlllIlIlll;
                    }
                    llllIIlllIlIllI = ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIllllI.u[ax.lllllI[9]] = new byte[llllIIlllIlIllI];
                    llllIIlllIlIlll = lllllI[1];
                    while (llllIIlllIlIlll < llllIIlllIlIllI) {
                        llllIIlllIllllI.u[ax.lllllI[9]][llllIIlllIlIlll] = ((DataInputStream)llllIIlllIlllII).readByte();
                        ++llllIIlllIlIlll;
                    }
                    llllIIlllIlIllI = ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIllllI.u[ax.lllllI[4]] = new byte[llllIIlllIlIllI];
                    llllIIlllIlIlll = lllllI[1];
                    while (llllIIlllIlIlll < llllIIlllIlIllI) {
                        llllIIlllIllllI.u[ax.lllllI[4]][llllIIlllIlIlll] = ((DataInputStream)llllIIlllIlllII).readByte();
                        ++llllIIlllIlIlll;
                    }
                    llllIIlllIllllI.d = lllllI[9];
                    try {
                        llllIIlllIllllI.y[ax.lllllI[1]] = (byte)(llllIIlllIllllI.u[lllllI[1]].length - lllllI[7]);
                        llllIIlllIllllI.y[ax.lllllI[9]] = (byte)(llllIIlllIllllI.u[lllllI[9]].length - lllllI[7]);
                        llllIIlllIllllI.y[ax.lllllI[2]] = (byte)(llllIIlllIllllI.u[lllllI[4]].length - lllllI[7]);
                        llllIIlllIllllI.y[ax.lllllI[4]] = (byte)(llllIIlllIllllI.u[lllllI[4]].length - lllllI[7]);
                    }
                    catch (Exception llllIIlllIlIlIl) {
                        // empty catch block
                    }
                    llllIIlllIllllI.y[ax.lllllI[1]] = ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIllllI.y[ax.lllllI[9]] = ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIllllI.y[ax.lllllI[2]] = ((DataInputStream)llllIIlllIlllII).readByte();
                    llllIIlllIllllI.y[ax.lllllI[4]] = llllIIlllIllllI.y[lllllI[2]];
                }
                catch (Exception llllIIlllIllIll) {
                    try {
                        llllIIlllIlllII.close();
                    }
                    catch (Exception llllIIlllIlIIll) {}
                }
            }
            finally {
                try {
                    llllIIlllIlllII.close();
                }
                catch (Exception llllIIlllIlIIll) {}
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public ax(short s2, long l2, int n2, boolean bl2) {
        void llllIIlllIIlIll;
        this.b = new dh();
        new dh();
        this.u = new byte[lllllI[0]][];
        new dh();
        this.e = (short)lllllI[1];
        this.x = (byte)lllllI[1];
        this.y = new byte[lllllI[0]];
        this.f = lllllI[1];
        this.A = new dh();
        this.B = new dh();
        this.C = new dh();
        this.D = new dh();
        this.E = new dh();
        this.F = new dh();
        this.G = new dh();
        new dh();
        this.e = s2;
        this.q = l2;
        this.r = n2;
        this.f = bl2;
        this.a(null);
        if (l2 == -1L) {
            this.x = (byte)lllllI[4];
        } else if (llllIIlllIIlIll == 0L) {
            llllIIlllIIllIl.x = (byte)lllllI[9];
        } else {
            llllIIlllIIllIl.q += System.currentTimeMillis();
            llllIIlllIIllIl.x = (byte)lllllI[2];
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(long l2) {
        if (l2 == -1L) {
            this.x = (byte)lllllI[4];
        } else {
            void llllIIlllIIIlIl;
            llllIIlllIIIllI.x = llllIIlllIIIlIl == 0L ? (byte)lllllI[9] : (byte)lllllI[2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] a(dh dh2) {
        Object var1_1 = null;
        byte[] byArray = new byte[dh2.size()];
        int n2 = lllllI[1];
        while (n2 < byArray.length) {
            void llllIIllIllllIl;
            dh llllIIlllIIIIII;
            llllIIllIlllllI[llllIIllIllllIl] = Byte.parseByte((String)llllIIlllIIIIII.elementAt((int)llllIIllIllllIl));
            ++llllIIllIllllIl;
        }
        return byArray;
    }

    private boolean b() {
        if (this.d) {
            return lllllI[9];
        }
        this.a(null);
        return lllllI[1];
    }

    /*
     * WARNING - void declaration
     */
    public final void a(fh fh2, int n2, int n3, int n4, int n5) {
        if (this.b() && n4 < this.b.size()) {
            bn llllIIllIlIIIIl = (bn)this.b.elementAt(n4);
            try {
                dh llllIIllIlIIIII = llllIIllIlIIIIl.b;
                int llllIIllIIlllll = lllllI[1];
                while (llllIIllIIlllll < llllIIllIlIIIII.size()) {
                    ax llllIIllIlIIlll;
                    dr llllIIllIIllllI = (dr)llllIIllIlIIIII.elementAt(llllIIllIIlllll);
                    ev llllIIllIIlllIl = llllIIllIlIIlll.t[llllIIllIIllllI.a];
                    bv llllIIllIIlllII = br.a(llllIIllIlIIlll.e);
                    if (llllIIllIIlllII != null && llllIIllIIlllII.a != null) {
                        void llllIIllIlIIlII;
                        void llllIIllIlIIlIl;
                        void llllIIllIlIIllI;
                        void llllIIllIlIIIlI;
                        int llllIIllIIllIll = llllIIllIIllllI.b;
                        int llllIIllIIllIlI = llllIIllIIlllIl.e;
                        int llllIIllIIllIIl = llllIIllIIlllIl.f;
                        int llllIIllIIllIII = llllIIllIIlllIl.c;
                        int llllIIllIIlIlll = llllIIllIIlllIl.d;
                        int llllIIllIIlIllI = llllIIllIIlllII.a.getWidth();
                        int llllIIllIIlIlIl = llllIIllIIlllII.a.getHeight();
                        if (llllIIllIIllIII > llllIIllIIlIllI) {
                            llllIIllIIllIII = lllllI[1];
                        }
                        if (llllIIllIIlIlll > llllIIllIIlIlIl) {
                            llllIIllIIlIlll = lllllI[1];
                        }
                        if (llllIIllIIllIII + llllIIllIIllIlI > llllIIllIIlIllI) {
                            llllIIllIIllIlI = llllIIllIIlIllI - llllIIllIIllIII;
                        }
                        if (llllIIllIIlIlll + llllIIllIIllIIl > llllIIllIIlIlIl) {
                            llllIIllIIllIIl = llllIIllIIlIlIl - llllIIllIIlIlll;
                        }
                        int n6 = llllIIllIIlIllI = llllIIllIIllllI.d == lllllI[9] ? lllllI[2] : lllllI[1];
                        if (llllIIllIlIIIlI == lllllI[2] || llllIIllIlIIIlI == lllllI[6]) {
                            llllIIllIIlIllI = llllIIllIIlIllI == lllllI[2] ? lllllI[1] : lllllI[2];
                            llllIIllIIllIll = -(llllIIllIIllIll + llllIIllIIllIlI);
                        }
                        llllIIllIlIIllI.a(llllIIllIIlllII.a, llllIIllIIllIII, llllIIllIIlIlll, llllIIllIIllIlI, llllIIllIIllIIl, llllIIllIIlIllI, (int)(llllIIllIlIIlIl + llllIIllIIllIll), (int)(llllIIllIlIIlII + llllIIllIIllllI.c), lllllI[1]);
                    }
                    ++llllIIllIIlllll;
                }
                return;
            }
            catch (Exception llllIIllIlIIIII) {
                llllIIllIlIIIII.printStackTrace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void b(fh fh2, int n2, int n3, int n4, int n5) {
        if (this.b() && n4 < this.b.size()) {
            bn llllIIlIllllIll = (bn)this.b.elementAt(n4);
            try {
                dh llllIIlIllllIlI = llllIIlIllllIll.a;
                int llllIIlIllllIIl = lllllI[1];
                while (llllIIlIllllIIl < llllIIlIllllIlI.size()) {
                    ax llllIIllIIIIIIl;
                    dr llllIIlIllllIII = (dr)llllIIlIllllIlI.elementAt(llllIIlIllllIIl);
                    ev llllIIlIlllIlll = llllIIllIIIIIIl.t[llllIIlIllllIII.a];
                    bv llllIIlIlllIllI = br.a(llllIIllIIIIIIl.e);
                    if (llllIIlIlllIllI != null && llllIIlIlllIllI.a != null) {
                        void llllIIlIllllllI;
                        void llllIIlIlllllll;
                        void llllIIllIIIIIII;
                        void llllIIlIlllllII;
                        int llllIIlIlllIlIl = llllIIlIllllIII.b;
                        int llllIIlIlllIlII = llllIIlIlllIlll.e;
                        int llllIIlIlllIIll = llllIIlIlllIlll.f;
                        int llllIIlIlllIIlI = llllIIlIlllIlll.c;
                        int llllIIlIlllIIIl = llllIIlIlllIlll.d;
                        int llllIIlIlllIIII = llllIIlIlllIllI.a.getWidth();
                        int llllIIlIllIllll = llllIIlIlllIllI.a.getHeight();
                        if (llllIIlIlllIIlI > llllIIlIlllIIII) {
                            llllIIlIlllIIlI = lllllI[1];
                        }
                        if (llllIIlIlllIIIl > llllIIlIllIllll) {
                            llllIIlIlllIIIl = lllllI[1];
                        }
                        if (llllIIlIlllIIlI + llllIIlIlllIlII > llllIIlIlllIIII) {
                            llllIIlIlllIlII = llllIIlIlllIIII - llllIIlIlllIIlI;
                        }
                        if (llllIIlIlllIIIl + llllIIlIlllIIll > llllIIlIllIllll) {
                            llllIIlIlllIIll = llllIIlIllIllll - llllIIlIlllIIIl;
                        }
                        int n6 = llllIIlIlllIIII = llllIIlIllllIII.d == lllllI[9] ? lllllI[2] : lllllI[1];
                        if (llllIIlIlllllII == lllllI[2] || llllIIlIlllllII == lllllI[6]) {
                            llllIIlIlllIIII = llllIIlIlllIIII == lllllI[2] ? lllllI[1] : lllllI[2];
                            llllIIlIlllIlIl = -(llllIIlIlllIlIl + llllIIlIlllIlII);
                        }
                        llllIIllIIIIIII.a(llllIIlIlllIllI.a, llllIIlIlllIIlI, llllIIlIlllIIIl, llllIIlIlllIlII, llllIIlIlllIIll, llllIIlIlllIIII, (int)(llllIIlIlllllll + llllIIlIlllIlIl), (int)(llllIIlIllllllI + llllIIlIllllIII.c), lllllI[1]);
                    }
                    ++llllIIlIllllIIl;
                }
                return;
            }
            catch (Exception llllIIlIllllIlI) {
                llllIIlIllllIlI.printStackTrace();
            }
        }
    }

    public final void a(fh llllIIlIlIlllll, int llllIIlIlIllllI, int llllIIlIlIlllIl) {
        ax llllIIlIllIIIII;
        try {
            if (!llllIIlIllIIIII.b()) {
                return;
            }
            if (llllIIlIllIIIII.I) {
                return;
            }
            if (llllIIlIllIIIII.v < llllIIlIllIIIII.b.size()) {
                dh llllIIlIlIlllII = ((bn)llllIIlIllIIIII.b.elementAt((int)llllIIlIllIIIII.v)).a;
                int llllIIlIlIllIll = lllllI[1];
                while (llllIIlIlIllIll < llllIIlIlIlllII.size()) {
                    dr llllIIlIlIllIlI = (dr)llllIIlIlIlllII.elementAt(llllIIlIlIllIll);
                    ev llllIIlIlIllIIl = llllIIlIllIIIII.t[llllIIlIlIllIlI.a];
                    bv llllIIlIlIllIII = br.a(llllIIlIllIIIII.e);
                    if (llllIIlIlIllIII != null && llllIIlIlIllIII.a != null) {
                        short llllIIlIlIlIlll = llllIIlIlIllIlI.b;
                        int llllIIlIlIlIllI = llllIIlIlIllIIl.e;
                        int llllIIlIlIlIlIl = llllIIlIlIllIIl.f;
                        int llllIIlIlIlIlII = llllIIlIlIllIIl.c;
                        int llllIIlIlIlIIll = llllIIlIlIllIIl.d;
                        if (llllIIlIlIlIlII > llllIIlIlIllIII.a.getWidth()) {
                            llllIIlIlIlIlII = lllllI[1];
                        }
                        if (llllIIlIlIlIIll > llllIIlIlIllIII.a.getHeight()) {
                            llllIIlIlIlIIll = lllllI[1];
                        }
                        if (llllIIlIlIlIlII + llllIIlIlIlIllI > llllIIlIlIllIII.a.getWidth()) {
                            llllIIlIlIlIllI = llllIIlIlIllIII.a.getWidth() - llllIIlIlIlIlII;
                        }
                        if (llllIIlIlIlIIll + llllIIlIlIlIlIl > llllIIlIlIllIII.a.getHeight()) {
                            llllIIlIlIlIlIl = llllIIlIlIllIII.a.getHeight() - llllIIlIlIlIIll;
                        }
                        llllIIlIlIlllll.a(llllIIlIlIllIII.a, llllIIlIlIlIlII, llllIIlIlIlIIll, llllIIlIlIlIllI, llllIIlIlIlIlIl, llllIIlIlIllIlI.d == lllllI[9] ? lllllI[2] : lllllI[1], llllIIlIlIllllI + llllIIlIlIlIlll, llllIIlIlIlllIl + llllIIlIlIllIlI.c, lllllI[1]);
                    }
                    ++llllIIlIlIllIll;
                }
                return;
            }
        }
        catch (Exception llllIIlIlIlllII) {
            llllIIlIlIlllII.printStackTrace();
            System.err.println(ec.a(ec.a("JhNLJq~2#~PSI)&pL7](I}5sWLiN+%TGw7WW!<D80f[`p/#xBF3?sd 7IsP-2*0lp+", "x-\u007f\r{5J\u0005\u0011K`\u0017x\u001c\u0017E~\u0006miyJ\u0005Gg{[\n\u001b\u001cdvC\u0006c\u0014\u0010\ru\r\u0001$k&An\u00119rr\u0002|B&\u0010\u000fy0b\u0014\u0002\u001d\u0001^D\u0013")) + llllIIlIllIIIII.e);
        }
    }

    public final void b(fh llllIIlIlIIIIll, int llllIIlIlIIIIlI, int llllIIlIlIIIIIl) {
        ax llllIIlIlIIIlII;
        try {
            if (!llllIIlIlIIIlII.b()) {
                return;
            }
            if (llllIIlIlIIIlII.I) {
                return;
            }
            if (llllIIlIlIIIlII.v < llllIIlIlIIIlII.b.size()) {
                dh llllIIlIlIIIIII = ((bn)llllIIlIlIIIlII.b.elementAt((int)llllIIlIlIIIlII.v)).b;
                int llllIIlIIllllll = lllllI[1];
                while (llllIIlIIllllll < llllIIlIlIIIIII.size()) {
                    dr llllIIlIIlllllI = (dr)llllIIlIlIIIIII.elementAt(llllIIlIIllllll);
                    ev llllIIlIIllllIl = llllIIlIlIIIlII.t[llllIIlIIlllllI.a];
                    bv llllIIlIIllllII = br.a(llllIIlIlIIIlII.e);
                    if (llllIIlIIllllII != null && llllIIlIIllllII.a != null) {
                        short llllIIlIIlllIll = llllIIlIIlllllI.b;
                        int llllIIlIIlllIlI = llllIIlIIllllIl.e;
                        int llllIIlIIlllIIl = llllIIlIIllllIl.f;
                        int llllIIlIIlllIII = llllIIlIIllllIl.c;
                        int llllIIlIIllIlll = llllIIlIIllllIl.d;
                        if (llllIIlIIlllIII > llllIIlIIllllII.a.getWidth()) {
                            llllIIlIIlllIII = lllllI[1];
                        }
                        if (llllIIlIIllIlll > llllIIlIIllllII.a.getHeight()) {
                            llllIIlIIllIlll = lllllI[1];
                        }
                        if (llllIIlIIlllIII + llllIIlIIlllIlI > llllIIlIIllllII.a.getWidth()) {
                            llllIIlIIlllIlI = llllIIlIIllllII.a.getWidth() - llllIIlIIlllIII;
                        }
                        if (llllIIlIIllIlll + llllIIlIIlllIIl > llllIIlIIllllII.a.getHeight()) {
                            llllIIlIIlllIIl = llllIIlIIllllII.a.getHeight() - llllIIlIIllIlll;
                        }
                        llllIIlIlIIIIll.a(llllIIlIIllllII.a, llllIIlIIlllIII, llllIIlIIllIlll, llllIIlIIlllIlI, llllIIlIIlllIIl, llllIIlIIlllllI.d == lllllI[9] ? lllllI[2] : lllllI[1], llllIIlIlIIIIlI + llllIIlIIlllIll, llllIIlIlIIIIIl + llllIIlIIlllllI.c, lllllI[1]);
                    }
                    ++llllIIlIIllllll;
                }
                return;
            }
        }
        catch (Exception llllIIlIlIIIIII) {
            llllIIlIlIIIIII.printStackTrace();
            System.err.println(ec.a(ec.a("<N0#3$h<*rw`+yfh@>T<QU./8KN5zdz[.B}Vde~k6@t1M};Bp=fXm%9a#SK^y9:||/", "\u000e\u000b\u0001b\u0002`\\\u000b\u0018GG$\u001aLW]r\u000fd}ab\u001e\u001b\b||qJ]Jj\u001asI\u0015UTO^\u0007\u0002Dw|<\t\u0003@\tW\u001b\\g\tY\u0013\u0010ygI\u000e\u000bNH\u0017")) + llllIIlIlIIIlII.e);
        }
    }

    private void a(boolean bl2) {
        if (this.r > 0) {
            this.I = bl2;
            if (this.I) {
                this.H = System.currentTimeMillis() + (long)this.r;
                return;
            }
        } else {
            llllIIlIIllIlII.I = lllllI[1];
        }
    }

    public final void a() {
        if (this.b.size() > 0) {
            try {
                ax llllIIlIIllIIII;
                if (!llllIIlIIllIIII.I) {
                    switch (llllIIlIIllIIII.x) {
                        case 0: {
                            llllIIlIIllIIII.w = (byte)(llllIIlIIllIIII.w + lllllI[9]);
                            if (llllIIlIIllIIII.w > llllIIlIIllIIII.c.length) {
                                llllIIlIIllIIII.s = lllllI[9];
                                llllIIlIIllIIII.w = (byte)lllllI[1];
                            }
                            llllIIlIIllIIII.v = llllIIlIIllIIII.c[llllIIlIIllIIII.w];
                            return;
                        }
                        case 1: {
                            llllIIlIIllIIII.w = (byte)(llllIIlIIllIIII.w + lllllI[9]);
                            if (llllIIlIIllIIII.w > llllIIlIIllIIII.c.length) {
                                llllIIlIIllIIII.w = (byte)lllllI[1];
                                llllIIlIIllIIII.s = lllllI[9];
                            }
                            llllIIlIIllIIII.v = llllIIlIIllIIII.c[llllIIlIIllIIII.w];
                            return;
                        }
                        case 2: {
                            llllIIlIIllIIII.w = (byte)(llllIIlIIllIIII.w + lllllI[9]);
                            if (llllIIlIIllIIII.q - System.currentTimeMillis() < 0L) {
                                llllIIlIIllIIII.s = lllllI[9];
                            }
                            if (llllIIlIIllIIII.w > llllIIlIIllIIII.c.length) {
                                llllIIlIIllIIII.w = (byte)lllllI[1];
                            }
                            llllIIlIIllIIII.v = llllIIlIIllIIII.c[llllIIlIIllIIII.w];
                            return;
                        }
                        case 3: {
                            llllIIlIIllIIII.w = (byte)(llllIIlIIllIIII.w + lllllI[9]);
                            if (llllIIlIIllIIII.w > llllIIlIIllIIII.c.length) {
                                llllIIlIIllIIII.w = (byte)lllllI[1];
                                llllIIlIIllIIII.a(lllllI[9]);
                            }
                            llllIIlIIllIIII.v = llllIIlIIllIIII.c[llllIIlIIllIIII.w];
                            return;
                        }
                    }
                    return;
                }
                if (llllIIlIIllIIII.H - System.currentTimeMillis() < 0L) {
                    llllIIlIIllIIII.a(lllllI[1]);
                    return;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static void lIlllI() {
        lllllI = new int[10];
        ax.lllllI[0] = " ".length() << (" ".length() << " ".length());
        ax.lllllI[1] = (0x8A ^ 0x95) & ~(0x2A ^ 0x35);
        ax.lllllI[2] = " ".length() << " ".length();
        ax.lllllI[3] = -" ".length();
        ax.lllllI[4] = "   ".length();
        ax.lllllI[5] = 0xD ^ 8;
        ax.lllllI[6] = "   ".length() << " ".length();
        ax.lllllI[7] = 0x5C ^ 0x5B;
        ax.lllllI[8] = " ".length() << "   ".length();
        ax.lllllI[9] = " ".length();
    }
}

