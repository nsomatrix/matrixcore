/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.List
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class cp
implements CommandListener {
    private /* synthetic */ Command a;
    private /* synthetic */ Command b;
    private /* synthetic */ Command c;
    private /* synthetic */ Command d;
    private /* synthetic */ Command e;
    private /* synthetic */ List f;
    private /* synthetic */ Form g;
    private /* synthetic */ Form h;
    private /* synthetic */ TextField i;
    private /* synthetic */ Image j;
    private static /* synthetic */ Vector k;
    private static final /* synthetic */ int[] lIlllI;

    static {
        cp.lIIIlI();
        k = new Vector();
    }

    public cp() {
        cp.b();
        byte[] byArray = new byte[lIlllI[0]];
        byArray[cp.lIlllI[1]] = lIlllI[1];
        byArray[cp.lIlllI[2]] = lIlllI[3];
        byArray[cp.lIlllI[4]] = lIlllI[1];
        byArray[cp.lIlllI[5]] = lIlllI[6];
        byArray[cp.lIlllI[7]] = lIlllI[1];
        byArray[cp.lIlllI[8]] = lIlllI[9];
        byArray[cp.lIlllI[10]] = lIlllI[1];
        byArray[cp.lIlllI[11]] = lIlllI[12];
        this.a = new Command(ec.a(byArray), lIlllI[11], lIlllI[2]);
        byte[] byArray2 = new byte[lIlllI[0]];
        byArray2[cp.lIlllI[1]] = lIlllI[1];
        byArray2[cp.lIlllI[2]] = lIlllI[13];
        byArray2[cp.lIlllI[4]] = lIlllI[1];
        byArray2[cp.lIlllI[5]] = lIlllI[14];
        byArray2[cp.lIlllI[7]] = lIlllI[1];
        byArray2[cp.lIlllI[8]] = lIlllI[15];
        byArray2[cp.lIlllI[10]] = lIlllI[1];
        byArray2[cp.lIlllI[11]] = lIlllI[16];
        this.b = new Command(ec.a(byArray2), lIlllI[2], lIlllI[2]);
        byte[] byArray3 = new byte[lIlllI[10]];
        byArray3[cp.lIlllI[1]] = lIlllI[1];
        byArray3[cp.lIlllI[2]] = lIlllI[3];
        byArray3[cp.lIlllI[4]] = lIlllI[1];
        byArray3[cp.lIlllI[5]] = lIlllI[17];
        byArray3[cp.lIlllI[7]] = lIlllI[1];
        byArray3[cp.lIlllI[8]] = lIlllI[18];
        this.c = new Command(ec.a(byArray3), lIlllI[2], lIlllI[4]);
        byte[] byArray4 = new byte[lIlllI[7]];
        byArray4[cp.lIlllI[1]] = lIlllI[1];
        byArray4[cp.lIlllI[2]] = lIlllI[19];
        byArray4[cp.lIlllI[4]] = lIlllI[1];
        byArray4[cp.lIlllI[5]] = lIlllI[20];
        this.d = new Command(ec.a(byArray4), lIlllI[7], lIlllI[2]);
        byte[] byArray5 = new byte[lIlllI[10]];
        byArray5[cp.lIlllI[1]] = lIlllI[1];
        byArray5[cp.lIlllI[2]] = lIlllI[21];
        byArray5[cp.lIlllI[4]] = lIlllI[22];
        byArray5[cp.lIlllI[5]] = lIlllI[23];
        byArray5[cp.lIlllI[7]] = lIlllI[1];
        byArray5[cp.lIlllI[8]] = lIlllI[24];
        this.e = new Command(ec.a(byArray5), lIlllI[11], lIlllI[2]);
    }

    public final void a() {
        if (k.size() <= 0) {
            byte[] byArray = new byte[lIlllI[25]];
            byArray[cp.lIlllI[1]] = lIlllI[1];
            byArray[cp.lIlllI[2]] = lIlllI[26];
            byArray[cp.lIlllI[4]] = lIlllI[1];
            byArray[cp.lIlllI[5]] = lIlllI[18];
            byArray[cp.lIlllI[7]] = lIlllI[1];
            byArray[cp.lIlllI[8]] = lIlllI[9];
            byArray[cp.lIlllI[10]] = lIlllI[1];
            byArray[cp.lIlllI[11]] = lIlllI[14];
            byArray[cp.lIlllI[0]] = lIlllI[1];
            byArray[cp.lIlllI[27]] = lIlllI[28];
            byArray[cp.lIlllI[29]] = lIlllI[1];
            byArray[cp.lIlllI[30]] = lIlllI[31];
            byArray[cp.lIlllI[32]] = lIlllI[1];
            byArray[cp.lIlllI[33]] = lIlllI[34];
            byArray[cp.lIlllI[35]] = lIlllI[1];
            byArray[cp.lIlllI[36]] = lIlllI[37];
            byArray[cp.lIlllI[38]] = lIlllI[1];
            byArray[cp.lIlllI[39]] = lIlllI[14];
            byArray[cp.lIlllI[40]] = lIlllI[1];
            byArray[cp.lIlllI[41]] = lIlllI[28];
            byArray[cp.lIlllI[42]] = lIlllI[1];
            byArray[cp.lIlllI[43]] = lIlllI[44];
            byArray[cp.lIlllI[45]] = lIlllI[1];
            byArray[cp.lIlllI[46]] = lIlllI[47];
            this.h = new Form(ec.a(byArray));
            byte[] byArray2 = new byte[lIlllI[48]];
            byArray2[cp.lIlllI[1]] = lIlllI[1];
            byArray2[cp.lIlllI[2]] = lIlllI[21];
            byArray2[cp.lIlllI[4]] = lIlllI[1];
            byArray2[cp.lIlllI[5]] = lIlllI[49];
            byArray2[cp.lIlllI[7]] = lIlllI[1];
            byArray2[cp.lIlllI[8]] = lIlllI[24];
            byArray2[cp.lIlllI[10]] = lIlllI[1];
            byArray2[cp.lIlllI[11]] = lIlllI[28];
            byArray2[cp.lIlllI[0]] = lIlllI[1];
            byArray2[cp.lIlllI[27]] = lIlllI[50];
            byArray2[cp.lIlllI[29]] = lIlllI[1];
            byArray2[cp.lIlllI[30]] = lIlllI[14];
            byArray2[cp.lIlllI[32]] = lIlllI[1];
            byArray2[cp.lIlllI[33]] = lIlllI[15];
            byArray2[cp.lIlllI[35]] = lIlllI[1];
            byArray2[cp.lIlllI[36]] = lIlllI[16];
            byArray2[cp.lIlllI[38]] = lIlllI[1];
            byArray2[cp.lIlllI[39]] = lIlllI[28];
            byArray2[cp.lIlllI[40]] = lIlllI[2];
            byArray2[cp.lIlllI[41]] = lIlllI[39];
            byArray2[cp.lIlllI[42]] = lIlllI[22];
            byArray2[cp.lIlllI[43]] = lIlllI[51];
            byArray2[cp.lIlllI[45]] = lIlllI[1];
            byArray2[cp.lIlllI[46]] = lIlllI[52];
            byArray2[cp.lIlllI[25]] = lIlllI[1];
            byArray2[cp.lIlllI[53]] = lIlllI[28];
            byArray2[cp.lIlllI[54]] = lIlllI[1];
            byArray2[cp.lIlllI[55]] = lIlllI[50];
            byArray2[cp.lIlllI[56]] = lIlllI[2];
            byArray2[cp.lIlllI[57]] = lIlllI[58];
            byArray2[cp.lIlllI[22]] = lIlllI[22];
            byArray2[cp.lIlllI[59]] = lIlllI[49];
            byArray2[cp.lIlllI[28]] = lIlllI[1];
            byArray2[cp.lIlllI[60]] = lIlllI[9];
            byArray2[cp.lIlllI[61]] = lIlllI[1];
            byArray2[cp.lIlllI[62]] = lIlllI[12];
            byArray2[cp.lIlllI[63]] = lIlllI[1];
            byArray2[cp.lIlllI[64]] = lIlllI[28];
            byArray2[cp.lIlllI[65]] = lIlllI[1];
            byArray2[cp.lIlllI[66]] = lIlllI[44];
            byArray2[cp.lIlllI[67]] = lIlllI[1];
            byArray2[cp.lIlllI[68]] = lIlllI[47];
            this.h.append(ec.a(byArray2));
            this.h.addCommand(this.a);
            this.h.addCommand(this.b);
            this.h.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)this.h);
        } else {
            cp llllIlllIlIlIll;
            try {
                byte[] byArray = new byte[lIlllI[42]];
                byArray[cp.lIlllI[1]] = lIlllI[1];
                byArray[cp.lIlllI[2]] = lIlllI[69];
                byArray[cp.lIlllI[4]] = lIlllI[1];
                byArray[cp.lIlllI[5]] = lIlllI[70];
                byArray[cp.lIlllI[7]] = lIlllI[1];
                byArray[cp.lIlllI[8]] = lIlllI[71];
                byArray[cp.lIlllI[10]] = lIlllI[1];
                byArray[cp.lIlllI[11]] = lIlllI[69];
                byArray[cp.lIlllI[0]] = lIlllI[1];
                byArray[cp.lIlllI[27]] = lIlllI[47];
                byArray[cp.lIlllI[29]] = lIlllI[1];
                byArray[cp.lIlllI[30]] = lIlllI[50];
                byArray[cp.lIlllI[32]] = lIlllI[1];
                byArray[cp.lIlllI[33]] = lIlllI[72];
                byArray[cp.lIlllI[35]] = lIlllI[1];
                byArray[cp.lIlllI[36]] = lIlllI[44];
                byArray[cp.lIlllI[38]] = lIlllI[1];
                byArray[cp.lIlllI[39]] = lIlllI[9];
                byArray[cp.lIlllI[40]] = lIlllI[1];
                byArray[cp.lIlllI[41]] = lIlllI[12];
                llllIlllIlIlIll.j = Image.createImage((String)ec.a(byArray));
            }
            catch (Exception llllIlllIlIlIlI) {
                // empty catch block
            }
            byte[] byArray = new byte[lIlllI[25]];
            byArray[cp.lIlllI[1]] = lIlllI[1];
            byArray[cp.lIlllI[2]] = lIlllI[26];
            byArray[cp.lIlllI[4]] = lIlllI[1];
            byArray[cp.lIlllI[5]] = lIlllI[18];
            byArray[cp.lIlllI[7]] = lIlllI[1];
            byArray[cp.lIlllI[8]] = lIlllI[9];
            byArray[cp.lIlllI[10]] = lIlllI[1];
            byArray[cp.lIlllI[11]] = lIlllI[14];
            byArray[cp.lIlllI[0]] = lIlllI[1];
            byArray[cp.lIlllI[27]] = lIlllI[28];
            byArray[cp.lIlllI[29]] = lIlllI[1];
            byArray[cp.lIlllI[30]] = lIlllI[31];
            byArray[cp.lIlllI[32]] = lIlllI[1];
            byArray[cp.lIlllI[33]] = lIlllI[34];
            byArray[cp.lIlllI[35]] = lIlllI[1];
            byArray[cp.lIlllI[36]] = lIlllI[37];
            byArray[cp.lIlllI[38]] = lIlllI[1];
            byArray[cp.lIlllI[39]] = lIlllI[14];
            byArray[cp.lIlllI[40]] = lIlllI[1];
            byArray[cp.lIlllI[41]] = lIlllI[28];
            byArray[cp.lIlllI[42]] = lIlllI[1];
            byArray[cp.lIlllI[43]] = lIlllI[44];
            byArray[cp.lIlllI[45]] = lIlllI[1];
            byArray[cp.lIlllI[46]] = lIlllI[47];
            llllIlllIlIlIll.f = new List(ec.a(byArray), lIlllI[5]);
            int llllIlllIlIlIlI = lIlllI[1];
            while (llllIlllIlIlIlI < k.size()) {
                String llllIlllIlIlIIl = (String)k.elementAt(llllIlllIlIlIlI);
                llllIlllIlIlIll.f.append(llllIlllIlIlIIl, llllIlllIlIlIll.j);
                ++llllIlllIlIlIlI;
            }
            llllIlllIlIlIll.f.addCommand(llllIlllIlIlIll.a);
            llllIlllIlIlIll.f.addCommand(llllIlllIlIlIll.b);
            llllIlllIlIlIll.f.addCommand(llllIlllIlIlIll.c);
            llllIlllIlIlIll.f.setCommandListener((CommandListener)llllIlllIlIlIll);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)llllIlllIlIlIll.f);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void commandAction(Command command, Displayable displayable) {
        cp llllIlllIIlllll;
        void llllIlllIIlllIl;
        String llllIlllIIlIlll;
        String llllIlllIIllIIl;
        int llllIlllIIllIll;
        if (command == this.a) {
            byte[] byArray = new byte[lIlllI[32]];
            byArray[cp.lIlllI[1]] = lIlllI[1];
            byArray[cp.lIlllI[2]] = lIlllI[44];
            byArray[cp.lIlllI[4]] = lIlllI[1];
            byArray[cp.lIlllI[5]] = lIlllI[47];
            byArray[cp.lIlllI[7]] = lIlllI[1];
            byArray[cp.lIlllI[8]] = lIlllI[73];
            byArray[cp.lIlllI[10]] = lIlllI[1];
            byArray[cp.lIlllI[11]] = lIlllI[52];
            byArray[cp.lIlllI[0]] = lIlllI[1];
            byArray[cp.lIlllI[27]] = lIlllI[31];
            byArray[cp.lIlllI[29]] = lIlllI[1];
            byArray[cp.lIlllI[30]] = lIlllI[50];
            cp.b(ec.a(byArray));
            if (k.size() > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                int n2 = lIlllI[1];
                while (llllIlllIIllIll < k.size()) {
                    llllIlllIIllIIl = (String)k.elementAt(llllIlllIIllIll);
                    byte[] byArray2 = new byte[lIlllI[4]];
                    byArray2[cp.lIlllI[1]] = lIlllI[1];
                    byArray2[cp.lIlllI[2]] = lIlllI[74];
                    ((StringBuffer)((Object)llllIlllIIlIlll)).append(String.valueOf(llllIlllIIllIIl) + ec.a(byArray2));
                    ++llllIlllIIllIll;
                }
                cp.a(lIlllI[2], ((StringBuffer)((Object)llllIlllIIlIlll)).toString());
            } else {
                cp.a(lIlllI[2], "");
            }
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)dc.a);
            byte[] byArray3 = new byte[lIlllI[63]];
            byArray3[cp.lIlllI[1]] = lIlllI[2];
            byArray3[cp.lIlllI[2]] = lIlllI[38];
            byArray3[cp.lIlllI[4]] = lIlllI[1];
            byArray3[cp.lIlllI[5]] = lIlllI[49];
            byArray3[cp.lIlllI[7]] = lIlllI[1];
            byArray3[cp.lIlllI[8]] = lIlllI[28];
            byArray3[cp.lIlllI[10]] = lIlllI[1];
            byArray3[cp.lIlllI[11]] = lIlllI[75];
            byArray3[cp.lIlllI[0]] = lIlllI[2];
            byArray3[cp.lIlllI[27]] = lIlllI[58];
            byArray3[cp.lIlllI[29]] = lIlllI[1];
            byArray3[cp.lIlllI[30]] = lIlllI[76];
            byArray3[cp.lIlllI[32]] = lIlllI[1];
            byArray3[cp.lIlllI[33]] = lIlllI[28];
            byArray3[cp.lIlllI[35]] = lIlllI[1];
            byArray3[cp.lIlllI[36]] = lIlllI[50];
            byArray3[cp.lIlllI[38]] = lIlllI[1];
            byArray3[cp.lIlllI[39]] = lIlllI[14];
            byArray3[cp.lIlllI[40]] = lIlllI[1];
            byArray3[cp.lIlllI[41]] = lIlllI[77];
            byArray3[cp.lIlllI[42]] = lIlllI[1];
            byArray3[cp.lIlllI[43]] = lIlllI[9];
            byArray3[cp.lIlllI[45]] = lIlllI[1];
            byArray3[cp.lIlllI[46]] = lIlllI[14];
            byArray3[cp.lIlllI[25]] = lIlllI[1];
            byArray3[cp.lIlllI[53]] = lIlllI[28];
            byArray3[cp.lIlllI[54]] = lIlllI[1];
            byArray3[cp.lIlllI[55]] = lIlllI[37];
            byArray3[cp.lIlllI[56]] = lIlllI[1];
            byArray3[cp.lIlllI[57]] = lIlllI[78];
            byArray3[cp.lIlllI[22]] = lIlllI[1];
            byArray3[cp.lIlllI[59]] = lIlllI[9];
            byArray3[cp.lIlllI[28]] = lIlllI[1];
            byArray3[cp.lIlllI[60]] = lIlllI[12];
            byArray3[cp.lIlllI[61]] = lIlllI[1];
            byArray3[cp.lIlllI[62]] = lIlllI[60];
            at.a(ec.a(byArray3));
        }
        if (llllIlllIIlllIl == llllIlllIIlllll.b) {
            byte[] byArray = new byte[lIlllI[42]];
            byArray[cp.lIlllI[1]] = lIlllI[1];
            byArray[cp.lIlllI[2]] = lIlllI[13];
            byArray[cp.lIlllI[4]] = lIlllI[1];
            byArray[cp.lIlllI[5]] = lIlllI[14];
            byArray[cp.lIlllI[7]] = lIlllI[1];
            byArray[cp.lIlllI[8]] = lIlllI[15];
            byArray[cp.lIlllI[10]] = lIlllI[1];
            byArray[cp.lIlllI[11]] = lIlllI[16];
            byArray[cp.lIlllI[0]] = lIlllI[1];
            byArray[cp.lIlllI[27]] = lIlllI[28];
            byArray[cp.lIlllI[29]] = lIlllI[1];
            byArray[cp.lIlllI[30]] = lIlllI[47];
            byArray[cp.lIlllI[32]] = lIlllI[22];
            byArray[cp.lIlllI[33]] = lIlllI[79];
            byArray[cp.lIlllI[35]] = lIlllI[1];
            byArray[cp.lIlllI[36]] = lIlllI[28];
            byArray[cp.lIlllI[38]] = lIlllI[1];
            byArray[cp.lIlllI[39]] = lIlllI[44];
            byArray[cp.lIlllI[40]] = lIlllI[1];
            byArray[cp.lIlllI[41]] = lIlllI[47];
            llllIlllIIlllll.g = new Form(ec.a(byArray));
            byte[] byArray4 = new byte[lIlllI[0]];
            byArray4[cp.lIlllI[1]] = lIlllI[1];
            byArray4[cp.lIlllI[2]] = lIlllI[13];
            byArray4[cp.lIlllI[4]] = lIlllI[1];
            byArray4[cp.lIlllI[5]] = lIlllI[15];
            byArray4[cp.lIlllI[7]] = lIlllI[1];
            byArray4[cp.lIlllI[8]] = lIlllI[9];
            byArray4[cp.lIlllI[10]] = lIlllI[1];
            byArray4[cp.lIlllI[11]] = lIlllI[80];
            llllIlllIIlllll.i = new TextField(ec.a(byArray4), null, lIlllI[81], lIlllI[1]);
            llllIlllIIlllll.g.append((Item)llllIlllIIlllll.i);
            llllIlllIIlllll.g.addCommand(llllIlllIIlllll.d);
            llllIlllIIlllll.g.addCommand(llllIlllIIlllll.e);
            llllIlllIIlllll.g.setCommandListener((CommandListener)llllIlllIIlllll);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)llllIlllIIlllll.g);
        }
        if (llllIlllIIlllIl != llllIlllIIlllll.c) {
            if (llllIlllIIlllIl == llllIlllIIlllll.e) {
                llllIlllIIlllll.a();
            }
            if (llllIlllIIlllIl == llllIlllIIlllll.d) {
                llllIlllIIlIlll = llllIlllIIlllll.i.getString();
                if (!llllIlllIIlIlll.equals("")) {
                    k.addElement(llllIlllIIlIlll);
                }
                llllIlllIIlllll.a();
                return;
            }
        } else {
            llllIlllIIllIll = llllIlllIIlllll.f.getSelectedIndex();
            llllIlllIIllIIl = llllIlllIIlllll.f.getString(llllIlllIIllIll);
            llllIlllIIlllll.f.delete(llllIlllIIllIll);
            int llllIlllIIlIlIl = lIlllI[1];
            while (llllIlllIIlIlIl < k.size()) {
                llllIlllIIlIlll = (String)k.elementAt(llllIlllIIlIlIl);
                if (llllIlllIIllIIl.equals(llllIlllIIlIlll)) {
                    k.removeElementAt(llllIlllIIlIlIl);
                    return;
                }
                ++llllIlllIIlIlIl;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void b() {
        byte[] byArray = new byte[lIlllI[0]];
        byArray[cp.lIlllI[1]] = lIlllI[1];
        byArray[cp.lIlllI[2]] = lIlllI[9];
        byArray[cp.lIlllI[4]] = lIlllI[1];
        byArray[cp.lIlllI[5]] = lIlllI[76];
        byArray[cp.lIlllI[7]] = lIlllI[1];
        byArray[cp.lIlllI[8]] = lIlllI[75];
        byArray[cp.lIlllI[10]] = lIlllI[1];
        byArray[cp.lIlllI[11]] = lIlllI[75];
        String string = cp.b(lIlllI[2], ec.a(byArray));
        byte[] byArray2 = new byte[lIlllI[0]];
        byArray2[cp.lIlllI[1]] = lIlllI[1];
        byArray2[cp.lIlllI[2]] = lIlllI[9];
        byArray2[cp.lIlllI[4]] = lIlllI[1];
        byArray2[cp.lIlllI[5]] = lIlllI[76];
        byArray2[cp.lIlllI[7]] = lIlllI[1];
        byArray2[cp.lIlllI[8]] = lIlllI[75];
        byArray2[cp.lIlllI[10]] = lIlllI[1];
        byArray2[cp.lIlllI[11]] = lIlllI[75];
        if (!string.equals(ec.a(byArray2))) {
            void llllIllIlllllIl;
            void llllIllIllllllI;
            String llllIllIlllllll;
            byte[] byArray3 = new byte[lIlllI[4]];
            byArray3[cp.lIlllI[1]] = lIlllI[1];
            byArray3[cp.lIlllI[2]] = lIlllI[74];
            String string2 = ec.a(byArray3);
            Vector vector = new Vector();
            String string3 = string2;
            if (!string.endsWith(string2)) {
                llllIllIlllllll = String.valueOf(string) + string2;
            }
            int llllIllIllllIlI = lIlllI[1];
            int llllIllIllllIII = llllIllIlllllll.indexOf((String)llllIllIllllllI);
            while (llllIllIllllIII != lIlllI[82]) {
                void llllIllIllllIll;
                llllIllIlllllIl.addElement(llllIllIlllllll.substring(llllIllIllllIlI, llllIllIllllIII));
                llllIllIllllIlI = llllIllIllllIII + llllIllIllllIll.length();
                llllIllIllllIII = llllIllIlllllll.indexOf((String)llllIllIllllIll, llllIllIllllIlI);
            }
            Object[] llllIllIlllIllI = new String[llllIllIlllllIl.size()];
            llllIllIlllllIl.copyInto(llllIllIlllIllI);
            llllIllIllllIII = lIlllI[1];
            while (llllIllIllllIII < llllIllIlllIllI.length) {
                k.addElement(llllIllIlllIllI[llllIllIllllIII]);
                ++llllIllIllllIII;
            }
        }
    }

    private static void b(String llllIllIllIlllI) {
        try {
            RecordStore.deleteRecordStore((String)llllIllIllIlllI);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void a(int n2, String llllIllIllIIlIl) {
        try {
            byte[] llllIllIllIIIlI;
            byte[] byArray = new byte[lIlllI[32]];
            byArray[cp.lIlllI[1]] = lIlllI[1];
            byArray[cp.lIlllI[2]] = lIlllI[44];
            byArray[cp.lIlllI[4]] = lIlllI[1];
            byArray[cp.lIlllI[5]] = lIlllI[47];
            byArray[cp.lIlllI[7]] = lIlllI[1];
            byArray[cp.lIlllI[8]] = lIlllI[73];
            byArray[cp.lIlllI[10]] = lIlllI[1];
            byArray[cp.lIlllI[11]] = lIlllI[52];
            byArray[cp.lIlllI[0]] = lIlllI[1];
            byArray[cp.lIlllI[27]] = lIlllI[31];
            byArray[cp.lIlllI[29]] = lIlllI[1];
            byArray[cp.lIlllI[30]] = lIlllI[50];
            RecordStore llllIllIllIIlII = RecordStore.openRecordStore((String)ec.a(byArray), (boolean)lIlllI[2]);
            int llllIllIllIIIll = llllIllIllIIlII.getNumRecords();
            if (llllIllIllIIIll <= 0) {
                llllIllIllIIIlI = new byte[lIlllI[1]];
                int llllIllIllIIIIl = lIlllI[1];
                while (llllIllIllIIIIl < lIlllI[2] - llllIllIllIIIll) {
                    llllIllIllIIlII.addRecord(llllIllIllIIIlI, lIlllI[1], lIlllI[1]);
                    ++llllIllIllIIIIl;
                }
            }
            byte[] byArray2 = new byte[lIlllI[29]];
            byArray2[cp.lIlllI[1]] = lIlllI[1];
            byArray2[cp.lIlllI[2]] = lIlllI[83];
            byArray2[cp.lIlllI[4]] = lIlllI[1];
            byArray2[cp.lIlllI[5]] = lIlllI[13];
            byArray2[cp.lIlllI[7]] = lIlllI[1];
            byArray2[cp.lIlllI[8]] = lIlllI[84];
            byArray2[cp.lIlllI[10]] = lIlllI[1];
            byArray2[cp.lIlllI[11]] = lIlllI[74];
            byArray2[cp.lIlllI[0]] = lIlllI[1];
            byArray2[cp.lIlllI[27]] = lIlllI[85];
            llllIllIllIIIlI = llllIllIllIIlIl.getBytes(ec.a(byArray2));
            llllIllIllIIlII.setRecord(lIlllI[2], llllIllIllIIIlI, lIlllI[1], llllIllIllIIIlI.length);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String b(int n2, String llllIllIlIllllI) {
        try {
            byte[] byArray = new byte[lIlllI[32]];
            byArray[cp.lIlllI[1]] = lIlllI[1];
            byArray[cp.lIlllI[2]] = lIlllI[44];
            byArray[cp.lIlllI[4]] = lIlllI[1];
            byArray[cp.lIlllI[5]] = lIlllI[47];
            byArray[cp.lIlllI[7]] = lIlllI[1];
            byArray[cp.lIlllI[8]] = lIlllI[73];
            byArray[cp.lIlllI[10]] = lIlllI[1];
            byArray[cp.lIlllI[11]] = lIlllI[52];
            byArray[cp.lIlllI[0]] = lIlllI[1];
            byArray[cp.lIlllI[27]] = lIlllI[31];
            byArray[cp.lIlllI[29]] = lIlllI[1];
            byArray[cp.lIlllI[30]] = lIlllI[50];
            byte[] llllIllIlIlllIl = RecordStore.openRecordStore((String)ec.a(byArray), (boolean)lIlllI[2]).getRecord(lIlllI[2]);
            byte[] byArray2 = new byte[lIlllI[29]];
            byArray2[cp.lIlllI[1]] = lIlllI[1];
            byArray2[cp.lIlllI[2]] = lIlllI[83];
            byArray2[cp.lIlllI[4]] = lIlllI[1];
            byArray2[cp.lIlllI[5]] = lIlllI[13];
            byArray2[cp.lIlllI[7]] = lIlllI[1];
            byArray2[cp.lIlllI[8]] = lIlllI[84];
            byArray2[cp.lIlllI[10]] = lIlllI[1];
            byArray2[cp.lIlllI[11]] = lIlllI[74];
            byArray2[cp.lIlllI[0]] = lIlllI[1];
            byArray2[cp.lIlllI[27]] = lIlllI[85];
            return new String(llllIllIlIlllIl, ec.a(byArray2));
        }
        catch (Exception exception) {
            void var1_1;
            return var1_1;
        }
    }

    public static boolean a(String string) {
        return k.contains(string);
    }

    private static void lIIIlI() {
        lIlllI = new int[86];
        cp.lIlllI[0] = " ".length() << "   ".length();
        cp.lIlllI[1] = (0x74 ^ 0x29) & ~(0x4C ^ 0x11);
        cp.lIlllI[2] = " ".length();
        cp.lIlllI[3] = (0x55 ^ 0x5E) << "   ".length();
        cp.lIlllI[4] = " ".length() << " ".length();
        cp.lIlllI[5] = "   ".length();
        cp.lIlllI[6] = 0x30 ^ 0x5F;
        cp.lIlllI[7] = " ".length() << (" ".length() << " ".length());
        cp.lIlllI[8] = 0x5C ^ 0x59;
        cp.lIlllI[9] = (0xB8 ^ 0x8F) << " ".length();
        cp.lIlllI[10] = "   ".length() << " ".length();
        cp.lIlllI[11] = 0xF ^ 8;
        cp.lIlllI[12] = 0x10 ^ 0x77;
        cp.lIlllI[13] = (0x97 ^ 0x82) << (" ".length() << " ".length());
        cp.lIlllI[14] = (0x75 ^ 0x78) << "   ".length();
        cp.lIlllI[15] = -(0x7E ^ 0x68);
        cp.lIlllI[16] = 0xF0 ^ 0x9D;
        cp.lIlllI[17] = -(0x16 ^ 0x1B);
        cp.lIlllI[18] = 0xFB ^ 0x9A;
        cp.lIlllI[19] = 0x1A ^ 0x55;
        cp.lIlllI[20] = 0x49 ^ 2;
        cp.lIlllI[21] = (5 ^ 0xC) << "   ".length();
        cp.lIlllI[22] = (0x91 ^ 0x9E) << " ".length();
        cp.lIlllI[23] = -(8 ^ 0x11);
        cp.lIlllI[24] = 0x2D ^ 0x54;
        cp.lIlllI[25] = "   ".length() << "   ".length();
        cp.lIlllI[26] = (0x46 ^ 0x57) << (" ".length() << " ".length());
        cp.lIlllI[27] = 0xB ^ 2;
        cp.lIlllI[28] = " ".length() << (0x12 ^ 0x17);
        cp.lIlllI[29] = (0x3D ^ 0x38) << " ".length();
        cp.lIlllI[30] = 0x7A ^ 0x71;
        cp.lIlllI[31] = 0x75 ^ 6;
        cp.lIlllI[32] = "   ".length() << (" ".length() << " ".length());
        cp.lIlllI[33] = 0x4A ^ 0x47;
        cp.lIlllI[34] = -(0x7B ^ 0x64);
        cp.lIlllI[35] = (0x96 ^ 0x91) << " ".length();
        cp.lIlllI[36] = 0x5B ^ 0x54;
        cp.lIlllI[37] = 0x5F ^ 0x3C;
        cp.lIlllI[38] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        cp.lIlllI[39] = 0x53 ^ 0x42;
        cp.lIlllI[40] = (0xB8 ^ 0xB1) << " ".length();
        cp.lIlllI[41] = 0xB3 ^ 0xA0;
        cp.lIlllI[42] = (0 ^ 5) << (" ".length() << " ".length());
        cp.lIlllI[43] = 0xA6 ^ 0xB3;
        cp.lIlllI[44] = (0x59 ^ 0x5E) << (" ".length() << (" ".length() << " ".length()));
        cp.lIlllI[45] = (0x35 ^ 0x3E) << " ".length();
        cp.lIlllI[46] = 0xB3 ^ 0xA4;
        cp.lIlllI[47] = 0x62 ^ 9;
        cp.lIlllI[48] = (0x6F ^ 0x7A) << " ".length();
        cp.lIlllI[49] = -(0xA3 ^ 0xBE);
        cp.lIlllI[50] = (0x8D ^ 0x90) << (" ".length() << " ".length());
        cp.lIlllI[51] = -(0x6E ^ 0x41);
        cp.lIlllI[52] = 0x34 ^ 0x5D;
        cp.lIlllI[53] = 0xD9 ^ 0xC0;
        cp.lIlllI[54] = (0xB7 ^ 0xBA) << " ".length();
        cp.lIlllI[55] = 0xB9 ^ 0xA2;
        cp.lIlllI[56] = (0x25 ^ 0x22) << (" ".length() << " ".length());
        cp.lIlllI[57] = 0xA1 ^ 0xBC;
        cp.lIlllI[58] = -(0x95 ^ 0xC5);
        cp.lIlllI[59] = 0x19 ^ 6;
        cp.lIlllI[60] = 0x35 ^ 0x14;
        cp.lIlllI[61] = (0x95 ^ 0x84) << " ".length();
        cp.lIlllI[62] = 0x25 ^ 6;
        cp.lIlllI[63] = (0xA0 ^ 0xA9) << (" ".length() << " ".length());
        cp.lIlllI[64] = 0xBC ^ 0x99;
        cp.lIlllI[65] = (0x65 ^ 0x76) << " ".length();
        cp.lIlllI[66] = 2 ^ 0x25;
        cp.lIlllI[67] = (0x5D ^ 0x58) << "   ".length();
        cp.lIlllI[68] = 0x83 ^ 0xAA;
        cp.lIlllI[69] = 0x5F ^ 0x70;
        cp.lIlllI[70] = (0xA6 ^ 0xA9) << "   ".length();
        cp.lIlllI[71] = 0x65 ^ 0x54;
        cp.lIlllI[72] = (0x9F ^ 0x88) << " ".length();
        cp.lIlllI[73] = (0x81 ^ 0x92) << (" ".length() << " ".length());
        cp.lIlllI[74] = 0xAA ^ 0x87;
        cp.lIlllI[75] = (0x5F ^ 0x44) << (" ".length() << " ".length());
        cp.lIlllI[76] = 0xD5 ^ 0xA0;
        cp.lIlllI[77] = -(0x17 ^ 0x37);
        cp.lIlllI[78] = -(0x90 ^ 0x9C);
        cp.lIlllI[79] = -(0x60 ^ 0x25);
        cp.lIlllI[80] = (0x55 ^ 0x48) << " ".length();
        cp.lIlllI[81] = 184 + 420 - 56 + 77 << "   ".length();
        cp.lIlllI[82] = -" ".length();
        cp.lIlllI[83] = 0x6A ^ 0x3F;
        cp.lIlllI[84] = (0x51 ^ 0x72) << " ".length();
        cp.lIlllI[85] = (0x17 ^ 0x10) << "   ".length();
    }
}

