/*
 * Decompiled with CFR 0.152.
 */
public final class z {
    public /* synthetic */ int a;
    public /* synthetic */ String b;
    public /* synthetic */ dh c;
    private static final /* synthetic */ int[] lIIlIIIl;

    public z(String string, int n2) {
        this.c = new dh();
        this.b = string;
        this.a = n2;
    }

    public z() {
        this.c = new dh();
    }

    /*
     * WARNING - void declaration
     */
    public final void a(String string, String string2) {
        void llIlIIIIlllIllI;
        void llIlIIIIlllIlll;
        z llIlIIIIllllIII;
        int llIlIIIIlllIlIl;
        int n2 = lIIlIIIl[0];
        if (bt.aN && x.d().e() == this && bt.O == this.c.size() - lIIlIIIl[1]) {
            llIlIIIIlllIlIl = lIIlIIIl[1];
        }
        byte[] byArray = new byte[lIIlIIIl[2]];
        byArray[z.lIIlIIIl[0]] = lIIlIIIl[0];
        byArray[z.lIIlIIIl[1]] = lIIlIIIl[3];
        byArray[z.lIIlIIIl[4]] = lIIlIIIl[0];
        byArray[z.lIIlIIIl[5]] = lIIlIIIl[6];
        byArray[z.lIIlIIIl[7]] = lIIlIIIl[0];
        byArray[z.lIIlIIIl[8]] = lIIlIIIl[9];
        llIlIIIIllllIII.c.addElement(ec.a(byArray) + (String)llIlIIIIlllIlll);
        dh llIlIIIIlllIlII = fg.i.a((String)llIlIIIIlllIllI, lIIlIIIl[10]);
        int llIlIIIIlllIIll = lIIlIIIl[0];
        while (llIlIIIIlllIIll < llIlIIIIlllIlII.size()) {
            byte[] byArray2 = new byte[lIIlIIIl[7]];
            byArray2[z.lIIlIIIl[0]] = lIIlIIIl[0];
            byArray2[z.lIIlIIIl[1]] = lIIlIIIl[3];
            byArray2[z.lIIlIIIl[4]] = lIIlIIIl[0];
            byArray2[z.lIIlIIIl[5]] = lIIlIIIl[11];
            llIlIIIIllllIII.c.addElement(ec.a(byArray2) + llIlIIIIlllIlII.elementAt(llIlIIIIlllIIll));
            ++llIlIIIIlllIIll;
        }
        if (llIlIIIIlllIlIl != 0) {
            bt.m().I();
        }
        this.a();
    }

    private void a() {
        while (this.c.size() > lIIlIIIl[12]) {
            z llIlIIIIlllIIIl;
            llIlIIIIlllIIIl.c.removeElementAt(lIIlIIIl[1]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(String string) {
        void llIlIIIIllIlIlI;
        int llIlIIIIllIlIIl;
        int n2 = lIIlIIIl[0];
        if (bt.aN && x.d().e() == this && bt.O == this.c.size() - lIIlIIIl[1]) {
            llIlIIIIllIlIIl = lIIlIIIl[1];
        }
        dh llIlIIIIllIlIII = fg.i.a((String)llIlIIIIllIlIlI, lIIlIIIl[10]);
        int llIlIIIIllIIlll = lIIlIIIl[0];
        while (llIlIIIIllIIlll < llIlIIIIllIlIII.size()) {
            z llIlIIIIllIlIll;
            llIlIIIIllIlIll.c.addElement(llIlIIIIllIlIII.elementAt(llIlIIIIllIIlll));
            ++llIlIIIIllIIlll;
        }
        if (llIlIIIIllIlIIl != 0) {
            bt.m().I();
        }
        this.a();
    }

    static {
        z.llIllIl();
    }

    private static void llIllIl() {
        lIIlIIIl = new int[13];
        z.lIIlIIIl[0] = (0x81 ^ 0x94) << (" ".length() << " ".length()) & ~((0x10 ^ 5) << (" ".length() << " ".length()));
        z.lIIlIIIl[1] = " ".length();
        z.lIIlIIIl[2] = "   ".length() << " ".length();
        z.lIIlIIIl[3] = 0x7B ^ 0x18;
        z.lIIlIIIl[4] = " ".length() << " ".length();
        z.lIIlIIIl[5] = "   ".length();
        z.lIIlIIIl[6] = 0x4C ^ 0x7F;
        z.lIIlIIIl[7] = " ".length() << (" ".length() << " ".length());
        z.lIIlIIIl[8] = 0x29 ^ 0x2C;
        z.lIIlIIIl[9] = " ".length() << ("   ".length() << " ".length());
        z.lIIlIIIl[10] = (0xB8 ^ 0xBD) << (0x2D ^ 0x28);
        z.lIIlIIIl[11] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        z.lIIlIIIl[12] = (0x47 ^ 0x5E) << " ".length();
    }
}

