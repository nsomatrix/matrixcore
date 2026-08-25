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

public final class cq
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
    private static final /* synthetic */ int[] lIIll;

    static {
        cq.lIIII();
        k = new Vector();
    }

    public cq() {
        cq.b();
        byte[] byArray = new byte[lIIll[0]];
        byArray[cq.lIIll[1]] = lIIll[1];
        byArray[cq.lIIll[2]] = lIIll[3];
        byArray[cq.lIIll[4]] = lIIll[1];
        byArray[cq.lIIll[5]] = lIIll[6];
        byArray[cq.lIIll[7]] = lIIll[1];
        byArray[cq.lIIll[8]] = lIIll[9];
        byArray[cq.lIIll[10]] = lIIll[1];
        byArray[cq.lIIll[11]] = lIIll[12];
        this.a = new Command(ec.a(byArray), lIIll[11], lIIll[2]);
        byte[] byArray2 = new byte[lIIll[0]];
        byArray2[cq.lIIll[1]] = lIIll[1];
        byArray2[cq.lIIll[2]] = lIIll[13];
        byArray2[cq.lIIll[4]] = lIIll[1];
        byArray2[cq.lIIll[5]] = lIIll[14];
        byArray2[cq.lIIll[7]] = lIIll[1];
        byArray2[cq.lIIll[8]] = lIIll[15];
        byArray2[cq.lIIll[10]] = lIIll[1];
        byArray2[cq.lIIll[11]] = lIIll[16];
        this.b = new Command(ec.a(byArray2), lIIll[2], lIIll[2]);
        byte[] byArray3 = new byte[lIIll[10]];
        byArray3[cq.lIIll[1]] = lIIll[1];
        byArray3[cq.lIIll[2]] = lIIll[3];
        byArray3[cq.lIIll[4]] = lIIll[1];
        byArray3[cq.lIIll[5]] = lIIll[17];
        byArray3[cq.lIIll[7]] = lIIll[1];
        byArray3[cq.lIIll[8]] = lIIll[18];
        this.c = new Command(ec.a(byArray3), lIIll[2], lIIll[4]);
        byte[] byArray4 = new byte[lIIll[7]];
        byArray4[cq.lIIll[1]] = lIIll[1];
        byArray4[cq.lIIll[2]] = lIIll[19];
        byArray4[cq.lIIll[4]] = lIIll[1];
        byArray4[cq.lIIll[5]] = lIIll[20];
        this.d = new Command(ec.a(byArray4), lIIll[7], lIIll[2]);
        byte[] byArray5 = new byte[lIIll[10]];
        byArray5[cq.lIIll[1]] = lIIll[1];
        byArray5[cq.lIIll[2]] = lIIll[21];
        byArray5[cq.lIIll[4]] = lIIll[22];
        byArray5[cq.lIIll[5]] = lIIll[23];
        byArray5[cq.lIIll[7]] = lIIll[1];
        byArray5[cq.lIIll[8]] = lIIll[24];
        this.e = new Command(ec.a(byArray5), lIIll[11], lIIll[2]);
    }

    public final void a() {
        if (k.size() <= 0) {
            byte[] byArray = new byte[lIIll[25]];
            byArray[cq.lIIll[1]] = lIIll[1];
            byArray[cq.lIIll[2]] = lIIll[26];
            byArray[cq.lIIll[4]] = lIIll[1];
            byArray[cq.lIIll[5]] = lIIll[18];
            byArray[cq.lIIll[7]] = lIIll[1];
            byArray[cq.lIIll[8]] = lIIll[9];
            byArray[cq.lIIll[10]] = lIIll[1];
            byArray[cq.lIIll[11]] = lIIll[14];
            byArray[cq.lIIll[0]] = lIIll[1];
            byArray[cq.lIIll[27]] = lIIll[28];
            byArray[cq.lIIll[29]] = lIIll[1];
            byArray[cq.lIIll[30]] = lIIll[31];
            byArray[cq.lIIll[32]] = lIIll[1];
            byArray[cq.lIIll[33]] = lIIll[34];
            byArray[cq.lIIll[35]] = lIIll[1];
            byArray[cq.lIIll[36]] = lIIll[37];
            byArray[cq.lIIll[38]] = lIIll[1];
            byArray[cq.lIIll[39]] = lIIll[14];
            byArray[cq.lIIll[40]] = lIIll[1];
            byArray[cq.lIIll[41]] = lIIll[28];
            byArray[cq.lIIll[42]] = lIIll[1];
            byArray[cq.lIIll[43]] = lIIll[37];
            byArray[cq.lIIll[44]] = lIIll[1];
            byArray[cq.lIIll[45]] = lIIll[17];
            byArray[cq.lIIll[46]] = lIIll[1];
            byArray[cq.lIIll[47]] = lIIll[28];
            byArray[cq.lIIll[48]] = lIIll[1];
            byArray[cq.lIIll[49]] = lIIll[50];
            byArray[cq.lIIll[51]] = lIIll[1];
            byArray[cq.lIIll[52]] = lIIll[14];
            byArray[cq.lIIll[22]] = lIIll[22];
            byArray[cq.lIIll[53]] = lIIll[54];
            byArray[cq.lIIll[28]] = lIIll[1];
            byArray[cq.lIIll[55]] = lIIll[28];
            byArray[cq.lIIll[56]] = lIIll[1];
            byArray[cq.lIIll[57]] = lIIll[16];
            byArray[cq.lIIll[58]] = lIIll[22];
            byArray[cq.lIIll[59]] = lIIll[60];
            byArray[cq.lIIll[61]] = lIIll[1];
            byArray[cq.lIIll[62]] = lIIll[63];
            byArray[cq.lIIll[64]] = lIIll[1];
            byArray[cq.lIIll[65]] = lIIll[28];
            byArray[cq.lIIll[66]] = lIIll[1];
            byArray[cq.lIIll[67]] = lIIll[9];
            byArray[cq.lIIll[68]] = lIIll[1];
            byArray[cq.lIIll[69]] = lIIll[14];
            byArray[cq.lIIll[70]] = lIIll[1];
            byArray[cq.lIIll[71]] = lIIll[17];
            byArray[cq.lIIll[72]] = lIIll[1];
            byArray[cq.lIIll[73]] = lIIll[16];
            byArray[cq.lIIll[74]] = lIIll[1];
            byArray[cq.lIIll[75]] = lIIll[71];
            byArray[cq.lIIll[76]] = lIIll[1];
            byArray[cq.lIIll[77]] = lIIll[12];
            byArray[cq.lIIll[78]] = lIIll[1];
            byArray[cq.lIIll[79]] = lIIll[63];
            byArray[cq.lIIll[80]] = lIIll[1];
            byArray[cq.lIIll[81]] = lIIll[18];
            byArray[cq.lIIll[82]] = lIIll[1];
            byArray[cq.lIIll[83]] = lIIll[6];
            byArray[cq.lIIll[84]] = lIIll[1];
            byArray[cq.lIIll[85]] = lIIll[28];
            byArray[cq.lIIll[86]] = lIIll[1];
            byArray[cq.lIIll[87]] = lIIll[88];
            byArray[cq.lIIll[89]] = lIIll[22];
            byArray[cq.lIIll[90]] = lIIll[91];
            byArray[cq.lIIll[92]] = lIIll[1];
            byArray[cq.lIIll[93]] = lIIll[37];
            byArray[cq.lIIll[26]] = lIIll[1];
            byArray[cq.lIIll[94]] = lIIll[14];
            this.h = new Form(ec.a(byArray));
            byte[] byArray2 = new byte[lIIll[44]];
            byArray2[cq.lIIll[1]] = lIIll[1];
            byArray2[cq.lIIll[2]] = lIIll[21];
            byArray2[cq.lIIll[4]] = lIIll[1];
            byArray2[cq.lIIll[5]] = lIIll[95];
            byArray2[cq.lIIll[7]] = lIIll[1];
            byArray2[cq.lIIll[8]] = lIIll[24];
            byArray2[cq.lIIll[10]] = lIIll[1];
            byArray2[cq.lIIll[11]] = lIIll[28];
            byArray2[cq.lIIll[0]] = lIIll[1];
            byArray2[cq.lIIll[27]] = lIIll[50];
            byArray2[cq.lIIll[29]] = lIIll[1];
            byArray2[cq.lIIll[30]] = lIIll[14];
            byArray2[cq.lIIll[32]] = lIIll[1];
            byArray2[cq.lIIll[33]] = lIIll[15];
            byArray2[cq.lIIll[35]] = lIIll[1];
            byArray2[cq.lIIll[36]] = lIIll[16];
            byArray2[cq.lIIll[38]] = lIIll[1];
            byArray2[cq.lIIll[39]] = lIIll[28];
            byArray2[cq.lIIll[40]] = lIIll[1];
            byArray2[cq.lIIll[41]] = lIIll[63];
            byArray2[cq.lIIll[42]] = lIIll[1];
            byArray2[cq.lIIll[43]] = lIIll[12];
            this.h.append(ec.a(byArray2));
            this.h.addCommand(this.a);
            this.h.addCommand(this.b);
            this.h.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)this.h);
        } else {
            cq llllllIllIllIll;
            try {
                byte[] byArray = new byte[lIIll[42]];
                byArray[cq.lIIll[1]] = lIIll[1];
                byArray[cq.lIIll[2]] = lIIll[71];
                byArray[cq.lIIll[4]] = lIIll[1];
                byArray[cq.lIIll[5]] = lIIll[96];
                byArray[cq.lIIll[7]] = lIIll[1];
                byArray[cq.lIIll[8]] = lIIll[73];
                byArray[cq.lIIll[10]] = lIIll[1];
                byArray[cq.lIIll[11]] = lIIll[71];
                byArray[cq.lIIll[0]] = lIIll[1];
                byArray[cq.lIIll[27]] = lIIll[97];
                byArray[cq.lIIll[29]] = lIIll[1];
                byArray[cq.lIIll[30]] = lIIll[50];
                byArray[cq.lIIll[32]] = lIIll[1];
                byArray[cq.lIIll[33]] = lIIll[70];
                byArray[cq.lIIll[35]] = lIIll[1];
                byArray[cq.lIIll[36]] = lIIll[98];
                byArray[cq.lIIll[38]] = lIIll[1];
                byArray[cq.lIIll[39]] = lIIll[9];
                byArray[cq.lIIll[40]] = lIIll[1];
                byArray[cq.lIIll[41]] = lIIll[12];
                llllllIllIllIll.j = Image.createImage((String)ec.a(byArray));
            }
            catch (Exception llllllIllIllIlI) {
                // empty catch block
            }
            byte[] byArray = new byte[lIIll[25]];
            byArray[cq.lIIll[1]] = lIIll[1];
            byArray[cq.lIIll[2]] = lIIll[26];
            byArray[cq.lIIll[4]] = lIIll[1];
            byArray[cq.lIIll[5]] = lIIll[18];
            byArray[cq.lIIll[7]] = lIIll[1];
            byArray[cq.lIIll[8]] = lIIll[9];
            byArray[cq.lIIll[10]] = lIIll[1];
            byArray[cq.lIIll[11]] = lIIll[14];
            byArray[cq.lIIll[0]] = lIIll[1];
            byArray[cq.lIIll[27]] = lIIll[28];
            byArray[cq.lIIll[29]] = lIIll[1];
            byArray[cq.lIIll[30]] = lIIll[31];
            byArray[cq.lIIll[32]] = lIIll[1];
            byArray[cq.lIIll[33]] = lIIll[34];
            byArray[cq.lIIll[35]] = lIIll[1];
            byArray[cq.lIIll[36]] = lIIll[37];
            byArray[cq.lIIll[38]] = lIIll[1];
            byArray[cq.lIIll[39]] = lIIll[14];
            byArray[cq.lIIll[40]] = lIIll[1];
            byArray[cq.lIIll[41]] = lIIll[28];
            byArray[cq.lIIll[42]] = lIIll[1];
            byArray[cq.lIIll[43]] = lIIll[37];
            byArray[cq.lIIll[44]] = lIIll[1];
            byArray[cq.lIIll[45]] = lIIll[17];
            byArray[cq.lIIll[46]] = lIIll[1];
            byArray[cq.lIIll[47]] = lIIll[28];
            byArray[cq.lIIll[48]] = lIIll[1];
            byArray[cq.lIIll[49]] = lIIll[50];
            byArray[cq.lIIll[51]] = lIIll[1];
            byArray[cq.lIIll[52]] = lIIll[14];
            byArray[cq.lIIll[22]] = lIIll[22];
            byArray[cq.lIIll[53]] = lIIll[54];
            byArray[cq.lIIll[28]] = lIIll[1];
            byArray[cq.lIIll[55]] = lIIll[28];
            byArray[cq.lIIll[56]] = lIIll[1];
            byArray[cq.lIIll[57]] = lIIll[16];
            byArray[cq.lIIll[58]] = lIIll[22];
            byArray[cq.lIIll[59]] = lIIll[60];
            byArray[cq.lIIll[61]] = lIIll[1];
            byArray[cq.lIIll[62]] = lIIll[63];
            byArray[cq.lIIll[64]] = lIIll[1];
            byArray[cq.lIIll[65]] = lIIll[28];
            byArray[cq.lIIll[66]] = lIIll[1];
            byArray[cq.lIIll[67]] = lIIll[9];
            byArray[cq.lIIll[68]] = lIIll[1];
            byArray[cq.lIIll[69]] = lIIll[14];
            byArray[cq.lIIll[70]] = lIIll[1];
            byArray[cq.lIIll[71]] = lIIll[17];
            byArray[cq.lIIll[72]] = lIIll[1];
            byArray[cq.lIIll[73]] = lIIll[16];
            byArray[cq.lIIll[74]] = lIIll[1];
            byArray[cq.lIIll[75]] = lIIll[71];
            byArray[cq.lIIll[76]] = lIIll[1];
            byArray[cq.lIIll[77]] = lIIll[12];
            byArray[cq.lIIll[78]] = lIIll[1];
            byArray[cq.lIIll[79]] = lIIll[63];
            byArray[cq.lIIll[80]] = lIIll[1];
            byArray[cq.lIIll[81]] = lIIll[18];
            byArray[cq.lIIll[82]] = lIIll[1];
            byArray[cq.lIIll[83]] = lIIll[6];
            byArray[cq.lIIll[84]] = lIIll[1];
            byArray[cq.lIIll[85]] = lIIll[28];
            byArray[cq.lIIll[86]] = lIIll[1];
            byArray[cq.lIIll[87]] = lIIll[88];
            byArray[cq.lIIll[89]] = lIIll[22];
            byArray[cq.lIIll[90]] = lIIll[91];
            byArray[cq.lIIll[92]] = lIIll[1];
            byArray[cq.lIIll[93]] = lIIll[37];
            byArray[cq.lIIll[26]] = lIIll[1];
            byArray[cq.lIIll[94]] = lIIll[14];
            llllllIllIllIll.f = new List(ec.a(byArray), lIIll[5]);
            int llllllIllIllIlI = lIIll[1];
            while (llllllIllIllIlI < k.size()) {
                String llllllIllIllIIl = (String)k.elementAt(llllllIllIllIlI);
                llllllIllIllIll.f.append(llllllIllIllIIl, llllllIllIllIll.j);
                ++llllllIllIllIlI;
            }
            llllllIllIllIll.f.addCommand(llllllIllIllIll.a);
            llllllIllIllIll.f.addCommand(llllllIllIllIll.b);
            llllllIllIllIll.f.addCommand(llllllIllIllIll.c);
            llllllIllIllIll.f.setCommandListener((CommandListener)llllllIllIllIll);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)llllllIllIllIll.f);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void commandAction(Command command, Displayable displayable) {
        cq llllllIllIIlIlI;
        void llllllIllIIlIII;
        String llllllIllIIIIlI;
        String llllllIllIIIlII;
        int llllllIllIIIllI;
        if (command == this.a) {
            byte[] byArray = new byte[lIIll[32]];
            byArray[cq.lIIll[1]] = lIIll[1];
            byArray[cq.lIIll[2]] = lIIll[98];
            byArray[cq.lIIll[4]] = lIIll[1];
            byArray[cq.lIIll[5]] = lIIll[50];
            byArray[cq.lIIll[7]] = lIIll[1];
            byArray[cq.lIIll[8]] = lIIll[99];
            byArray[cq.lIIll[10]] = lIIll[1];
            byArray[cq.lIIll[11]] = lIIll[63];
            byArray[cq.lIIll[0]] = lIIll[1];
            byArray[cq.lIIll[27]] = lIIll[31];
            byArray[cq.lIIll[29]] = lIIll[1];
            byArray[cq.lIIll[30]] = lIIll[50];
            cq.b(ec.a(byArray));
            if (k.size() > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                int n2 = lIIll[1];
                while (llllllIllIIIllI < k.size()) {
                    llllllIllIIIlII = (String)k.elementAt(llllllIllIIIllI);
                    byte[] byArray2 = new byte[lIIll[4]];
                    byArray2[cq.lIIll[1]] = lIIll[1];
                    byArray2[cq.lIIll[2]] = lIIll[69];
                    ((StringBuffer)((Object)llllllIllIIIIlI)).append(String.valueOf(llllllIllIIIlII) + ec.a(byArray2));
                    ++llllllIllIIIllI;
                }
                cq.a(lIIll[2], ((StringBuffer)((Object)llllllIllIIIIlI)).toString());
            } else {
                cq.a(lIIll[2], "");
            }
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)dc.a);
            byte[] byArray3 = new byte[lIIll[58]];
            byArray3[cq.lIIll[1]] = lIIll[2];
            byArray3[cq.lIIll[2]] = lIIll[38];
            byArray3[cq.lIIll[4]] = lIIll[1];
            byArray3[cq.lIIll[5]] = lIIll[95];
            byArray3[cq.lIIll[7]] = lIIll[1];
            byArray3[cq.lIIll[8]] = lIIll[28];
            byArray3[cq.lIIll[10]] = lIIll[1];
            byArray3[cq.lIIll[11]] = lIIll[100];
            byArray3[cq.lIIll[0]] = lIIll[2];
            byArray3[cq.lIIll[27]] = lIIll[101];
            byArray3[cq.lIIll[29]] = lIIll[1];
            byArray3[cq.lIIll[30]] = lIIll[102];
            byArray3[cq.lIIll[32]] = lIIll[1];
            byArray3[cq.lIIll[33]] = lIIll[28];
            byArray3[cq.lIIll[35]] = lIIll[1];
            byArray3[cq.lIIll[36]] = lIIll[50];
            byArray3[cq.lIIll[38]] = lIIll[1];
            byArray3[cq.lIIll[39]] = lIIll[14];
            byArray3[cq.lIIll[40]] = lIIll[1];
            byArray3[cq.lIIll[41]] = lIIll[103];
            byArray3[cq.lIIll[42]] = lIIll[1];
            byArray3[cq.lIIll[43]] = lIIll[9];
            byArray3[cq.lIIll[44]] = lIIll[1];
            byArray3[cq.lIIll[45]] = lIIll[14];
            byArray3[cq.lIIll[46]] = lIIll[1];
            byArray3[cq.lIIll[47]] = lIIll[28];
            byArray3[cq.lIIll[48]] = lIIll[1];
            byArray3[cq.lIIll[49]] = lIIll[37];
            byArray3[cq.lIIll[51]] = lIIll[1];
            byArray3[cq.lIIll[52]] = lIIll[104];
            byArray3[cq.lIIll[22]] = lIIll[1];
            byArray3[cq.lIIll[53]] = lIIll[9];
            byArray3[cq.lIIll[28]] = lIIll[1];
            byArray3[cq.lIIll[55]] = lIIll[12];
            byArray3[cq.lIIll[56]] = lIIll[1];
            byArray3[cq.lIIll[57]] = lIIll[55];
            at.a(ec.a(byArray3));
        }
        if (llllllIllIIlIII == llllllIllIIlIlI.b) {
            byte[] byArray = new byte[lIIll[35]];
            byArray[cq.lIIll[1]] = lIIll[1];
            byArray[cq.lIIll[2]] = lIIll[13];
            byArray[cq.lIIll[4]] = lIIll[1];
            byArray[cq.lIIll[5]] = lIIll[14];
            byArray[cq.lIIll[7]] = lIIll[1];
            byArray[cq.lIIll[8]] = lIIll[15];
            byArray[cq.lIIll[10]] = lIIll[1];
            byArray[cq.lIIll[11]] = lIIll[16];
            byArray[cq.lIIll[0]] = lIIll[1];
            byArray[cq.lIIll[27]] = lIIll[28];
            byArray[cq.lIIll[29]] = lIIll[1];
            byArray[cq.lIIll[30]] = lIIll[63];
            byArray[cq.lIIll[32]] = lIIll[1];
            byArray[cq.lIIll[33]] = lIIll[12];
            llllllIllIIlIlI.g = new Form(ec.a(byArray));
            byte[] byArray4 = new byte[lIIll[0]];
            byArray4[cq.lIIll[1]] = lIIll[1];
            byArray4[cq.lIIll[2]] = lIIll[13];
            byArray4[cq.lIIll[4]] = lIIll[1];
            byArray4[cq.lIIll[5]] = lIIll[15];
            byArray4[cq.lIIll[7]] = lIIll[1];
            byArray4[cq.lIIll[8]] = lIIll[9];
            byArray4[cq.lIIll[10]] = lIIll[1];
            byArray4[cq.lIIll[11]] = lIIll[82];
            llllllIllIIlIlI.i = new TextField(ec.a(byArray4), null, lIIll[105], lIIll[1]);
            llllllIllIIlIlI.g.append((Item)llllllIllIIlIlI.i);
            llllllIllIIlIlI.g.addCommand(llllllIllIIlIlI.d);
            llllllIllIIlIlI.g.addCommand(llllllIllIIlIlI.e);
            llllllIllIIlIlI.g.setCommandListener((CommandListener)llllllIllIIlIlI);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)llllllIllIIlIlI.g);
        }
        if (llllllIllIIlIII != llllllIllIIlIlI.c) {
            if (llllllIllIIlIII == llllllIllIIlIlI.e) {
                llllllIllIIlIlI.a();
            }
            if (llllllIllIIlIII == llllllIllIIlIlI.d) {
                llllllIllIIIIlI = llllllIllIIlIlI.i.getString();
                if (!llllllIllIIIIlI.equals("")) {
                    k.addElement(llllllIllIIIIlI);
                }
                llllllIllIIlIlI.a();
                return;
            }
        } else {
            llllllIllIIIllI = llllllIllIIlIlI.f.getSelectedIndex();
            llllllIllIIIlII = llllllIllIIlIlI.f.getString(llllllIllIIIllI);
            llllllIllIIlIlI.f.delete(llllllIllIIIllI);
            int llllllIllIIIIII = lIIll[1];
            while (llllllIllIIIIII < k.size()) {
                llllllIllIIIIlI = (String)k.elementAt(llllllIllIIIIII);
                if (llllllIllIIIlII.equals(llllllIllIIIIlI)) {
                    k.removeElementAt(llllllIllIIIIII);
                    return;
                }
                ++llllllIllIIIIII;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void b() {
        byte[] byArray = new byte[lIIll[0]];
        byArray[cq.lIIll[1]] = lIIll[1];
        byArray[cq.lIIll[2]] = lIIll[9];
        byArray[cq.lIIll[4]] = lIIll[1];
        byArray[cq.lIIll[5]] = lIIll[102];
        byArray[cq.lIIll[7]] = lIIll[1];
        byArray[cq.lIIll[8]] = lIIll[100];
        byArray[cq.lIIll[10]] = lIIll[1];
        byArray[cq.lIIll[11]] = lIIll[100];
        String string = cq.b(lIIll[2], ec.a(byArray));
        byte[] byArray2 = new byte[lIIll[0]];
        byArray2[cq.lIIll[1]] = lIIll[1];
        byArray2[cq.lIIll[2]] = lIIll[9];
        byArray2[cq.lIIll[4]] = lIIll[1];
        byArray2[cq.lIIll[5]] = lIIll[102];
        byArray2[cq.lIIll[7]] = lIIll[1];
        byArray2[cq.lIIll[8]] = lIIll[100];
        byArray2[cq.lIIll[10]] = lIIll[1];
        byArray2[cq.lIIll[11]] = lIIll[100];
        if (!string.equals(ec.a(byArray2))) {
            void llllllIlIlIllll;
            void llllllIlIllIIIl;
            String llllllIlIllIIll;
            byte[] byArray3 = new byte[lIIll[4]];
            byArray3[cq.lIIll[1]] = lIIll[1];
            byArray3[cq.lIIll[2]] = lIIll[69];
            String string2 = ec.a(byArray3);
            Vector vector = new Vector();
            String string3 = string2;
            if (!string.endsWith(string2)) {
                llllllIlIllIIll = String.valueOf(string) + string2;
            }
            int llllllIlIlIllII = lIIll[1];
            int llllllIlIlIlIlI = llllllIlIllIIll.indexOf((String)llllllIlIllIIIl);
            while (llllllIlIlIlIlI != lIIll[106]) {
                void llllllIlIlIlllI;
                llllllIlIlIllll.addElement(llllllIlIllIIll.substring(llllllIlIlIllII, llllllIlIlIlIlI));
                llllllIlIlIllII = llllllIlIlIlIlI + llllllIlIlIlllI.length();
                llllllIlIlIlIlI = llllllIlIllIIll.indexOf((String)llllllIlIlIlllI, llllllIlIlIllII);
            }
            Object[] llllllIlIlIlIII = new String[llllllIlIlIllll.size()];
            llllllIlIlIllll.copyInto(llllllIlIlIlIII);
            llllllIlIlIlIlI = lIIll[1];
            while (llllllIlIlIlIlI < llllllIlIlIlIII.length) {
                k.addElement(llllllIlIlIlIII[llllllIlIlIlIlI]);
                ++llllllIlIlIlIlI;
            }
        }
    }

    private static void b(String llllllIlIlIIIlI) {
        try {
            RecordStore.deleteRecordStore((String)llllllIlIlIIIlI);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void a(int n2, String llllllIlIIllIll) {
        try {
            byte[] llllllIlIIllIII;
            byte[] byArray = new byte[lIIll[32]];
            byArray[cq.lIIll[1]] = lIIll[1];
            byArray[cq.lIIll[2]] = lIIll[98];
            byArray[cq.lIIll[4]] = lIIll[1];
            byArray[cq.lIIll[5]] = lIIll[50];
            byArray[cq.lIIll[7]] = lIIll[1];
            byArray[cq.lIIll[8]] = lIIll[99];
            byArray[cq.lIIll[10]] = lIIll[1];
            byArray[cq.lIIll[11]] = lIIll[63];
            byArray[cq.lIIll[0]] = lIIll[1];
            byArray[cq.lIIll[27]] = lIIll[31];
            byArray[cq.lIIll[29]] = lIIll[1];
            byArray[cq.lIIll[30]] = lIIll[50];
            RecordStore llllllIlIIllIlI = RecordStore.openRecordStore((String)ec.a(byArray), (boolean)lIIll[2]);
            int llllllIlIIllIIl = llllllIlIIllIlI.getNumRecords();
            if (llllllIlIIllIIl <= 0) {
                llllllIlIIllIII = new byte[lIIll[1]];
                int llllllIlIIlIlll = lIIll[1];
                while (llllllIlIIlIlll < lIIll[2] - llllllIlIIllIIl) {
                    llllllIlIIllIlI.addRecord(llllllIlIIllIII, lIIll[1], lIIll[1]);
                    ++llllllIlIIlIlll;
                }
            }
            byte[] byArray2 = new byte[lIIll[29]];
            byArray2[cq.lIIll[1]] = lIIll[1];
            byArray2[cq.lIIll[2]] = lIIll[107];
            byArray2[cq.lIIll[4]] = lIIll[1];
            byArray2[cq.lIIll[5]] = lIIll[13];
            byArray2[cq.lIIll[7]] = lIIll[1];
            byArray2[cq.lIIll[8]] = lIIll[25];
            byArray2[cq.lIIll[10]] = lIIll[1];
            byArray2[cq.lIIll[11]] = lIIll[69];
            byArray2[cq.lIIll[0]] = lIIll[1];
            byArray2[cq.lIIll[27]] = lIIll[80];
            llllllIlIIllIII = llllllIlIIllIll.getBytes(ec.a(byArray2));
            llllllIlIIllIlI.setRecord(lIIll[2], llllllIlIIllIII, lIIll[1], llllllIlIIllIII.length);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String b(int n2, String llllllIlIIlIlII) {
        try {
            byte[] byArray = new byte[lIIll[32]];
            byArray[cq.lIIll[1]] = lIIll[1];
            byArray[cq.lIIll[2]] = lIIll[98];
            byArray[cq.lIIll[4]] = lIIll[1];
            byArray[cq.lIIll[5]] = lIIll[50];
            byArray[cq.lIIll[7]] = lIIll[1];
            byArray[cq.lIIll[8]] = lIIll[99];
            byArray[cq.lIIll[10]] = lIIll[1];
            byArray[cq.lIIll[11]] = lIIll[63];
            byArray[cq.lIIll[0]] = lIIll[1];
            byArray[cq.lIIll[27]] = lIIll[31];
            byArray[cq.lIIll[29]] = lIIll[1];
            byArray[cq.lIIll[30]] = lIIll[50];
            byte[] llllllIlIIlIIll = RecordStore.openRecordStore((String)ec.a(byArray), (boolean)lIIll[2]).getRecord(lIIll[2]);
            byte[] byArray2 = new byte[lIIll[29]];
            byArray2[cq.lIIll[1]] = lIIll[1];
            byArray2[cq.lIIll[2]] = lIIll[107];
            byArray2[cq.lIIll[4]] = lIIll[1];
            byArray2[cq.lIIll[5]] = lIIll[13];
            byArray2[cq.lIIll[7]] = lIIll[1];
            byArray2[cq.lIIll[8]] = lIIll[25];
            byArray2[cq.lIIll[10]] = lIIll[1];
            byArray2[cq.lIIll[11]] = lIIll[69];
            byArray2[cq.lIIll[0]] = lIIll[1];
            byArray2[cq.lIIll[27]] = lIIll[80];
            return new String(llllllIlIIlIIll, ec.a(byArray2));
        }
        catch (Exception exception) {
            void var1_1;
            return var1_1;
        }
    }

    public static boolean a(String string) {
        return k.contains(string);
    }

    private static void lIIII() {
        lIIll = new int[108];
        cq.lIIll[0] = " ".length() << "   ".length();
        cq.lIIll[1] = (0x5C ^ 0xB) & ~(0xEB ^ 0xBC);
        cq.lIIll[2] = " ".length();
        cq.lIIll[3] = (0x60 ^ 0x6B) << "   ".length();
        cq.lIIll[4] = " ".length() << " ".length();
        cq.lIIll[5] = "   ".length();
        cq.lIIll[6] = 0xCD ^ 0xA2;
        cq.lIIll[7] = " ".length() << (" ".length() << " ".length());
        cq.lIIll[8] = 0x73 ^ 0x76;
        cq.lIIll[9] = (0x5F ^ 0x68) << " ".length();
        cq.lIIll[10] = "   ".length() << " ".length();
        cq.lIIll[11] = 0x60 ^ 0x67;
        cq.lIIll[12] = 7 ^ 0x60;
        cq.lIIll[13] = (0x19 ^ 0xC) << (" ".length() << " ".length());
        cq.lIIll[14] = (0x8F ^ 0x82) << "   ".length();
        cq.lIIll[15] = -(0x53 ^ 0x45);
        cq.lIIll[16] = 0xF0 ^ 0x9D;
        cq.lIIll[17] = -(1 ^ 0xC);
        cq.lIIll[18] = 0x49 ^ 0x28;
        cq.lIIll[19] = 0xC2 ^ 0x8D;
        cq.lIIll[20] = 0xCA ^ 0x81;
        cq.lIIll[21] = (0 ^ 9) << "   ".length();
        cq.lIIll[22] = (0x3E ^ 0x31) << " ".length();
        cq.lIIll[23] = -(0xA4 ^ 0xBD);
        cq.lIIll[24] = 0x30 ^ 0x49;
        cq.lIIll[25] = (0xA0 ^ 0x83) << " ".length();
        cq.lIIll[26] = (0xAA ^ 0xBB) << (" ".length() << " ".length());
        cq.lIIll[27] = 0x4B ^ 0x42;
        cq.lIIll[28] = " ".length() << (0x70 ^ 0x75);
        cq.lIIll[29] = (0x66 ^ 0x63) << " ".length();
        cq.lIIll[30] = 0x7A ^ 0x71;
        cq.lIIll[31] = 0 ^ 0x73;
        cq.lIIll[32] = "   ".length() << (" ".length() << " ".length());
        cq.lIIll[33] = 0x6D ^ 0x60;
        cq.lIIll[34] = -(0x85 ^ 0x9A);
        cq.lIIll[35] = (0xB8 ^ 0xBF) << " ".length();
        cq.lIIll[36] = 0x68 ^ 0x67;
        cq.lIIll[37] = 0x1E ^ 0x7D;
        cq.lIIll[38] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        cq.lIIll[39] = 0x2B ^ 0x3A;
        cq.lIIll[40] = (0xA3 ^ 0xAA) << " ".length();
        cq.lIIll[41] = 0x5E ^ 0x4D;
        cq.lIIll[42] = (0xC1 ^ 0xC4) << (" ".length() << " ".length());
        cq.lIIll[43] = 0x27 ^ 0x32;
        cq.lIIll[44] = (0x9F ^ 0x94) << " ".length();
        cq.lIIll[45] = 0x2C ^ 0x3B;
        cq.lIIll[46] = "   ".length() << "   ".length();
        cq.lIIll[47] = 0x80 ^ 0x99;
        cq.lIIll[48] = (0x92 ^ 0x9F) << " ".length();
        cq.lIIll[49] = 0x1F ^ 4;
        cq.lIIll[50] = (0x5E ^ 0x43) << (" ".length() << " ".length());
        cq.lIIll[51] = (0xA3 ^ 0xA4) << (" ".length() << " ".length());
        cq.lIIll[52] = 0x8A ^ 0x97;
        cq.lIIll[53] = 0x40 ^ 0x5F;
        cq.lIIll[54] = -(0x33 ^ 0xE);
        cq.lIIll[55] = 0xAC ^ 0x8D;
        cq.lIIll[56] = (0xAA ^ 0xBB) << " ".length();
        cq.lIIll[57] = 0x96 ^ 0xB5;
        cq.lIIll[58] = (0x83 ^ 0x8A) << (" ".length() << " ".length());
        cq.lIIll[59] = 0x76 ^ 0x53;
        cq.lIIll[60] = -(0x65 ^ 0x46);
        cq.lIIll[61] = (0x5C ^ 0x4F) << " ".length();
        cq.lIIll[62] = 0x47 ^ 0x60;
        cq.lIIll[63] = 0x5A ^ 0x33;
        cq.lIIll[64] = (0x99 ^ 0x9C) << "   ".length();
        cq.lIIll[65] = 0x38 ^ 0x11;
        cq.lIIll[66] = (0x72 ^ 0x67) << " ".length();
        cq.lIIll[67] = 0x2A ^ 1;
        cq.lIIll[68] = (0x6D ^ 0x66) << (" ".length() << " ".length());
        cq.lIIll[69] = 0x51 ^ 0x7C;
        cq.lIIll[70] = (0x3D ^ 0x2A) << " ".length();
        cq.lIIll[71] = 0x9B ^ 0xB4;
        cq.lIIll[72] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        cq.lIIll[73] = 0x29 ^ 0x18;
        cq.lIIll[74] = (0x25 ^ 0x3C) << " ".length();
        cq.lIIll[75] = 0x23 ^ 0x10;
        cq.lIIll[76] = (0x99 ^ 0x94) << (" ".length() << " ".length());
        cq.lIIll[77] = 0x84 ^ 0xB1;
        cq.lIIll[78] = (0x50 ^ 0x4B) << " ".length();
        cq.lIIll[79] = 0x33 ^ 4;
        cq.lIIll[80] = (0x70 ^ 0x77) << "   ".length();
        cq.lIIll[81] = 0x1B ^ 0x22;
        cq.lIIll[82] = (0xA1 ^ 0xBC) << " ".length();
        cq.lIIll[83] = 0x32 ^ 9;
        cq.lIIll[84] = (0x56 ^ 0x59) << (" ".length() << " ".length());
        cq.lIIll[85] = 0x2D ^ 0x10;
        cq.lIIll[86] = (0x94 ^ 0x8B) << " ".length();
        cq.lIIll[87] = 4 ^ 0x3B;
        cq.lIIll[88] = (0x5F ^ 0x46) << (" ".length() << " ".length());
        cq.lIIll[89] = " ".length() << ("   ".length() << " ".length());
        cq.lIIll[90] = 0xE8 ^ 0xA9;
        cq.lIIll[91] = -(0xA9 ^ 0x9C);
        cq.lIIll[92] = (0xA7 ^ 0x86) << " ".length();
        cq.lIIll[93] = 0xDD ^ 0x9E;
        cq.lIIll[94] = 0x49 ^ 0xC;
        cq.lIIll[95] = -(0x85 ^ 0x98);
        cq.lIIll[96] = (0xCD ^ 0xC2) << "   ".length();
        cq.lIIll[97] = 0xAF ^ 0xC4;
        cq.lIIll[98] = (0x40 ^ 0x47) << (" ".length() << (" ".length() << " ".length()));
        cq.lIIll[99] = (0x8B ^ 0x98) << (" ".length() << " ".length());
        cq.lIIll[100] = (0x1C ^ 7) << (" ".length() << " ".length());
        cq.lIIll[101] = -(0x75 ^ 0x25);
        cq.lIIll[102] = 0x4A ^ 0x3F;
        cq.lIIll[103] = -(0x9F ^ 0xBF);
        cq.lIIll[104] = -(4 ^ 8);
        cq.lIIll[105] = 169 + 601 - 521 + 376 << "   ".length();
        cq.lIIll[106] = -" ".length();
        cq.lIIll[107] = 0x50 ^ 5;
    }
}

