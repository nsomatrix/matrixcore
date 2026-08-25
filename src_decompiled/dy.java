/*
 * Decompiled with CFR 0.152.
 */
public final class dy {
    private static final /* synthetic */ int[] lIIIlI;

    public final void a(aj llllllIIIIIllll) {
        try {
            switch (llllllIIIIIllll.b().readByte()) {
                case 0: {
                    aj llllllIIIIIlIll = llllllIIIIIllll;
                    try {
                        llllllIIIIIllll = null;
                        int llllllIIIIIlllI = llllllIIIIIlIll.b().readInt();
                        v llllllIIIIIlIlI = v.f().q == llllllIIIIIlllI ? v.f() : bt.f(llllllIIIIIlllI);
                        if (llllllIIIIIlIlI != null) {
                            llllllIIIIIlIlI.aG = new cd[lIIIlI[0]];
                            int llllllIIIIIlIIl = lIIIlI[1];
                            while (llllllIIIIIlIIl < llllllIIIIIlIlI.aG.length) {
                                short llllllIIIIIlIII = llllllIIIIIlIll.b().readShort();
                                if (llllllIIIIIlIII > lIIIlI[2]) {
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl] = new cd();
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl].e = llllllIIIIIlIIl;
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl].o = lIIIlI[3];
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl].b = cj.a(llllllIIIIIlIII);
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl].j = llllllIIIIIlIll.b().readByte();
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl].g = llllllIIIIIlIll.b().readLong();
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl].i = llllllIIIIIlIll.b().readByte();
                                    byte llllllIIIIIIlll = llllllIIIIIlIll.b().readByte();
                                    llllllIIIIIlIlI.aG[llllllIIIIIlIIl].c = new dh();
                                    int llllllIIIIIllII = lIIIlI[1];
                                    while (llllllIIIIIllII < llllllIIIIIIlll) {
                                        llllllIIIIIlIlI.aG[llllllIIIIIlIIl].c.addElement(new cf(llllllIIIIIlIll.b().readUnsignedByte(), llllllIIIIIlIll.b().readInt()));
                                        ++llllllIIIIIllII;
                                    }
                                }
                                ++llllllIIIIIlIIl;
                            }
                        }
                        break;
                    }
                    catch (Exception llllllIIIIIIlll) {
                        return;
                    }
                }
                case 1: {
                    aj llllllIIIIIlIll = llllllIIIIIllll;
                    try {
                        llllllIIIIIllll = null;
                        int llllllIIIIIlllI = llllllIIIIIlIll.b().readInt();
                        v llllllIIIIIlIlI = v.f().q == llllllIIIIIlllI ? v.f() : bt.f(llllllIIIIIlllI);
                        if (llllllIIIIIlIlI != null) {
                            short llllllIIIIIlIIl = llllllIIIIIlIll.b().readShort();
                            byte llllllIIIIIlIII = llllllIIIIIlIll.b().readByte();
                            if (llllllIIIIIlIIl > 0) {
                                short llllllIIIIIllIl = (short)llllllIIIIIlIlI.j;
                                short llllllIIIIIllII = (short)(llllllIIIIIlIlI.k - lIIIlI[4]);
                                llllllIIIIIlIlI.aU = new cx(lIIIlI[2], lIIIlI[1], lIIIlI[1], lIIIlI[1], lIIIlI[1], lIIIlI[1], llllllIIIIIlIIl, lIIIlI[5], lIIIlI[1], lIIIlI[1], lIIIlI[1], llllllIIIIIllIl, llllllIIIIIllII, lIIIlI[6], lIIIlI[1], llllllIIIIIlIII != 0 ? lIIIlI[5] : lIIIlI[1], lIIIlI[1]);
                                llllllIIIIIlIlI.aU.g = lIIIlI[0];
                            } else {
                                llllllIIIIIlIlI.aU = null;
                            }
                        }
                        break;
                    }
                    catch (Exception llllllIIIIIIlll) {
                        llllllIIIIIIlll.printStackTrace();
                        return;
                    }
                }
                case 2: {
                    try {
                        short llllllIIIIIlllI = llllllIIIIIllll.b().readShort();
                        String llllllIIIIIIlll = llllllIIIIIllll.b().readUTF();
                        int llllllIIIIIIllI = llllllIIIIIllll.b().readInt();
                        short llllllIIIIIllIl = llllllIIIIIllll.b().readShort();
                        byte llllllIIIIIllII = llllllIIIIIllll.b().readByte();
                        if (llllllIIIIIIllI >= 0) {
                            as llllllIIIIIIIlI;
                            as llllllIIIIIIIll;
                            short llllllIIIIIIlIl = llllllIIIIIlllI;
                            int llllllIIIIIIlII = lIIIlI[1];
                            while (true) {
                                if (llllllIIIIIIlII >= bt.q.size()) {
                                    llllllIIIIIIIll = null;
                                    break;
                                }
                                llllllIIIIIIIlI = (as)bt.q.elementAt(llllllIIIIIIlII);
                                if (llllllIIIIIIIlI != null && llllllIIIIIIIlI.d == llllllIIIIIIlIl) {
                                    llllllIIIIIIIll = llllllIIIIIIIlI;
                                    break;
                                }
                                ++llllllIIIIIIlII;
                            }
                            llllllIIIIIIIlI = llllllIIIIIIIll;
                            if (llllllIIIIIIIlI == null) {
                                llllllIIIIIIIlI = new as(llllllIIIIIlllI, llllllIIIIIllIl, llllllIIIIIIllI, llllllIIIIIIlll, llllllIIIIIllII);
                                bt.q.addElement(llllllIIIIIIIlI);
                            }
                            if (llllllIIIIIIIlI != null) {
                                llllllIIIIIIIlI.b = llllllIIIIIIlll;
                                llllllIIIIIIIlI.e = llllllIIIIIllIl;
                                long llllllIIIIIIIIl = llllllIIIIIIllI;
                                llllllIIIIIIIlI.a = System.currentTimeMillis() + llllllIIIIIIIIl * 1000L;
                                if (llllllIIIIIllII == lIIIlI[7]) {
                                    llllllIIIIIIIlI.c = lIIIlI[5];
                                    break;
                                }
                            }
                        }
                    }
                    catch (Exception llllllIIIIIIlll) {
                        // empty catch block
                    }
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    static {
        dy.lIlll();
    }

    private static void lIlll() {
        lIIIlI = new int[8];
        dy.lIIIlI[0] = 0x71 ^ 0x74;
        dy.lIIIlI[1] = (0x66 ^ 0x77) << (" ".length() << " ".length()) & ~((0x24 ^ 0x35) << (" ".length() << " ".length()));
        dy.lIIIlI[2] = -" ".length();
        dy.lIIIlI[3] = 0x35 ^ 6;
        dy.lIIIlI[4] = (0x22 ^ 0x27) << "   ".length();
        dy.lIIIlI[5] = " ".length();
        dy.lIIIlI[6] = " ".length() << (" ".length() << " ".length());
        dy.lIIIlI[7] = -"  ".length();
    }
}

