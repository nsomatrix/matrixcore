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

public final class co
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
    private static final /* synthetic */ int[] lIIllll;

    static {
        co.lllIll();
        k = new Vector();
    }

    public co() {
        co.b();
        byte[] byArray = new byte[lIIllll[0]];
        byArray[co.lIIllll[1]] = lIIllll[1];
        byArray[co.lIIllll[2]] = lIIllll[3];
        byArray[co.lIIllll[4]] = lIIllll[1];
        byArray[co.lIIllll[5]] = lIIllll[6];
        byArray[co.lIIllll[7]] = lIIllll[1];
        byArray[co.lIIllll[8]] = lIIllll[9];
        byArray[co.lIIllll[10]] = lIIllll[1];
        byArray[co.lIIllll[11]] = lIIllll[12];
        this.a = new Command(ec.a(byArray), lIIllll[11], lIIllll[2]);
        byte[] byArray2 = new byte[lIIllll[0]];
        byArray2[co.lIIllll[1]] = lIIllll[1];
        byArray2[co.lIIllll[2]] = lIIllll[13];
        byArray2[co.lIIllll[4]] = lIIllll[1];
        byArray2[co.lIIllll[5]] = lIIllll[14];
        byArray2[co.lIIllll[7]] = lIIllll[1];
        byArray2[co.lIIllll[8]] = lIIllll[15];
        byArray2[co.lIIllll[10]] = lIIllll[1];
        byArray2[co.lIIllll[11]] = lIIllll[16];
        this.b = new Command(ec.a(byArray2), lIIllll[2], lIIllll[2]);
        byte[] byArray3 = new byte[lIIllll[10]];
        byArray3[co.lIIllll[1]] = lIIllll[1];
        byArray3[co.lIIllll[2]] = lIIllll[3];
        byArray3[co.lIIllll[4]] = lIIllll[1];
        byArray3[co.lIIllll[5]] = lIIllll[17];
        byArray3[co.lIIllll[7]] = lIIllll[1];
        byArray3[co.lIIllll[8]] = lIIllll[18];
        this.c = new Command(ec.a(byArray3), lIIllll[2], lIIllll[4]);
        byte[] byArray4 = new byte[lIIllll[7]];
        byArray4[co.lIIllll[1]] = lIIllll[1];
        byArray4[co.lIIllll[2]] = lIIllll[19];
        byArray4[co.lIIllll[4]] = lIIllll[1];
        byArray4[co.lIIllll[5]] = lIIllll[20];
        this.d = new Command(ec.a(byArray4), lIIllll[7], lIIllll[2]);
        byte[] byArray5 = new byte[lIIllll[10]];
        byArray5[co.lIIllll[1]] = lIIllll[1];
        byArray5[co.lIIllll[2]] = lIIllll[21];
        byArray5[co.lIIllll[4]] = lIIllll[22];
        byArray5[co.lIIllll[5]] = lIIllll[23];
        byArray5[co.lIIllll[7]] = lIIllll[1];
        byArray5[co.lIIllll[8]] = lIIllll[24];
        this.e = new Command(ec.a(byArray5), lIIllll[11], lIIllll[2]);
    }

    public final void a() {
        if (k.size() <= 0) {
            byte[] byArray = new byte[lIIllll[22]];
            byArray[co.lIIllll[1]] = lIIllll[1];
            byArray[co.lIIllll[2]] = lIIllll[25];
            byArray[co.lIIllll[4]] = lIIllll[1];
            byArray[co.lIIllll[5]] = lIIllll[18];
            byArray[co.lIIllll[7]] = lIIllll[1];
            byArray[co.lIIllll[8]] = lIIllll[9];
            byArray[co.lIIllll[10]] = lIIllll[1];
            byArray[co.lIIllll[11]] = lIIllll[14];
            byArray[co.lIIllll[0]] = lIIllll[1];
            byArray[co.lIIllll[26]] = lIIllll[27];
            byArray[co.lIIllll[28]] = lIIllll[1];
            byArray[co.lIIllll[29]] = lIIllll[30];
            byArray[co.lIIllll[31]] = lIIllll[1];
            byArray[co.lIIllll[32]] = lIIllll[33];
            byArray[co.lIIllll[34]] = lIIllll[1];
            byArray[co.lIIllll[35]] = lIIllll[36];
            byArray[co.lIIllll[37]] = lIIllll[1];
            byArray[co.lIIllll[38]] = lIIllll[14];
            byArray[co.lIIllll[39]] = lIIllll[1];
            byArray[co.lIIllll[40]] = lIIllll[27];
            byArray[co.lIIllll[41]] = lIIllll[1];
            byArray[co.lIIllll[42]] = lIIllll[43];
            byArray[co.lIIllll[44]] = lIIllll[1];
            byArray[co.lIIllll[45]] = lIIllll[6];
            byArray[co.lIIllll[46]] = lIIllll[1];
            byArray[co.lIIllll[47]] = lIIllll[27];
            byArray[co.lIIllll[48]] = lIIllll[1];
            byArray[co.lIIllll[49]] = lIIllll[50];
            byArray[co.lIIllll[51]] = lIIllll[1];
            byArray[co.lIIllll[52]] = lIIllll[43];
            this.h = new Form(ec.a(byArray));
            byte[] byArray2 = new byte[lIIllll[53]];
            byArray2[co.lIIllll[1]] = lIIllll[1];
            byArray2[co.lIIllll[2]] = lIIllll[21];
            byArray2[co.lIIllll[4]] = lIIllll[1];
            byArray2[co.lIIllll[5]] = lIIllll[54];
            byArray2[co.lIIllll[7]] = lIIllll[1];
            byArray2[co.lIIllll[8]] = lIIllll[24];
            byArray2[co.lIIllll[10]] = lIIllll[1];
            byArray2[co.lIIllll[11]] = lIIllll[27];
            byArray2[co.lIIllll[0]] = lIIllll[1];
            byArray2[co.lIIllll[26]] = lIIllll[55];
            byArray2[co.lIIllll[28]] = lIIllll[1];
            byArray2[co.lIIllll[29]] = lIIllll[14];
            byArray2[co.lIIllll[31]] = lIIllll[1];
            byArray2[co.lIIllll[32]] = lIIllll[15];
            byArray2[co.lIIllll[34]] = lIIllll[1];
            byArray2[co.lIIllll[35]] = lIIllll[16];
            byArray2[co.lIIllll[37]] = lIIllll[1];
            byArray2[co.lIIllll[38]] = lIIllll[27];
            byArray2[co.lIIllll[39]] = lIIllll[2];
            byArray2[co.lIIllll[40]] = lIIllll[38];
            byArray2[co.lIIllll[41]] = lIIllll[22];
            byArray2[co.lIIllll[42]] = lIIllll[56];
            byArray2[co.lIIllll[44]] = lIIllll[1];
            byArray2[co.lIIllll[45]] = lIIllll[57];
            byArray2[co.lIIllll[46]] = lIIllll[1];
            byArray2[co.lIIllll[47]] = lIIllll[27];
            byArray2[co.lIIllll[48]] = lIIllll[1];
            byArray2[co.lIIllll[49]] = lIIllll[55];
            byArray2[co.lIIllll[51]] = lIIllll[2];
            byArray2[co.lIIllll[52]] = lIIllll[58];
            byArray2[co.lIIllll[22]] = lIIllll[22];
            byArray2[co.lIIllll[59]] = lIIllll[54];
            byArray2[co.lIIllll[27]] = lIIllll[1];
            byArray2[co.lIIllll[60]] = lIIllll[9];
            byArray2[co.lIIllll[61]] = lIIllll[1];
            byArray2[co.lIIllll[62]] = lIIllll[12];
            byArray2[co.lIIllll[63]] = lIIllll[1];
            byArray2[co.lIIllll[64]] = lIIllll[27];
            byArray2[co.lIIllll[65]] = lIIllll[1];
            byArray2[co.lIIllll[66]] = lIIllll[43];
            byArray2[co.lIIllll[67]] = lIIllll[1];
            byArray2[co.lIIllll[68]] = lIIllll[6];
            byArray2[co.lIIllll[69]] = lIIllll[1];
            byArray2[co.lIIllll[70]] = lIIllll[27];
            byArray2[co.lIIllll[71]] = lIIllll[1];
            byArray2[co.lIIllll[72]] = lIIllll[50];
            byArray2[co.lIIllll[73]] = lIIllll[1];
            byArray2[co.lIIllll[74]] = lIIllll[43];
            byArray2[co.lIIllll[75]] = lIIllll[1];
            byArray2[co.lIIllll[76]] = lIIllll[27];
            this.h.append(ec.a(byArray2));
            this.h.addCommand(this.a);
            this.h.addCommand(this.b);
            this.h.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)this.h);
        } else {
            co llllIIIlIIlIIIl;
            try {
                byte[] byArray = new byte[lIIllll[41]];
                byArray[co.lIIllll[1]] = lIIllll[1];
                byArray[co.lIIllll[2]] = lIIllll[74];
                byArray[co.lIIllll[4]] = lIIllll[1];
                byArray[co.lIIllll[5]] = lIIllll[77];
                byArray[co.lIIllll[7]] = lIIllll[1];
                byArray[co.lIIllll[8]] = lIIllll[76];
                byArray[co.lIIllll[10]] = lIIllll[1];
                byArray[co.lIIllll[11]] = lIIllll[74];
                byArray[co.lIIllll[0]] = lIIllll[1];
                byArray[co.lIIllll[26]] = lIIllll[43];
                byArray[co.lIIllll[28]] = lIIllll[1];
                byArray[co.lIIllll[29]] = lIIllll[55];
                byArray[co.lIIllll[31]] = lIIllll[1];
                byArray[co.lIIllll[32]] = lIIllll[73];
                byArray[co.lIIllll[34]] = lIIllll[1];
                byArray[co.lIIllll[35]] = lIIllll[50];
                byArray[co.lIIllll[37]] = lIIllll[1];
                byArray[co.lIIllll[38]] = lIIllll[9];
                byArray[co.lIIllll[39]] = lIIllll[1];
                byArray[co.lIIllll[40]] = lIIllll[12];
                llllIIIlIIlIIIl.j = Image.createImage((String)ec.a(byArray));
            }
            catch (Exception llllIIIlIIlIIII) {
                // empty catch block
            }
            byte[] byArray = new byte[lIIllll[22]];
            byArray[co.lIIllll[1]] = lIIllll[1];
            byArray[co.lIIllll[2]] = lIIllll[25];
            byArray[co.lIIllll[4]] = lIIllll[1];
            byArray[co.lIIllll[5]] = lIIllll[18];
            byArray[co.lIIllll[7]] = lIIllll[1];
            byArray[co.lIIllll[8]] = lIIllll[9];
            byArray[co.lIIllll[10]] = lIIllll[1];
            byArray[co.lIIllll[11]] = lIIllll[14];
            byArray[co.lIIllll[0]] = lIIllll[1];
            byArray[co.lIIllll[26]] = lIIllll[27];
            byArray[co.lIIllll[28]] = lIIllll[1];
            byArray[co.lIIllll[29]] = lIIllll[30];
            byArray[co.lIIllll[31]] = lIIllll[1];
            byArray[co.lIIllll[32]] = lIIllll[33];
            byArray[co.lIIllll[34]] = lIIllll[1];
            byArray[co.lIIllll[35]] = lIIllll[36];
            byArray[co.lIIllll[37]] = lIIllll[1];
            byArray[co.lIIllll[38]] = lIIllll[14];
            byArray[co.lIIllll[39]] = lIIllll[1];
            byArray[co.lIIllll[40]] = lIIllll[27];
            byArray[co.lIIllll[41]] = lIIllll[1];
            byArray[co.lIIllll[42]] = lIIllll[43];
            byArray[co.lIIllll[44]] = lIIllll[1];
            byArray[co.lIIllll[45]] = lIIllll[6];
            byArray[co.lIIllll[46]] = lIIllll[1];
            byArray[co.lIIllll[47]] = lIIllll[27];
            byArray[co.lIIllll[48]] = lIIllll[1];
            byArray[co.lIIllll[49]] = lIIllll[50];
            byArray[co.lIIllll[51]] = lIIllll[1];
            byArray[co.lIIllll[52]] = lIIllll[43];
            llllIIIlIIlIIIl.f = new List(ec.a(byArray), lIIllll[5]);
            int llllIIIlIIlIIII = lIIllll[1];
            while (llllIIIlIIlIIII < k.size()) {
                String llllIIIlIIIllll = (String)k.elementAt(llllIIIlIIlIIII);
                llllIIIlIIlIIIl.f.append(llllIIIlIIIllll, llllIIIlIIlIIIl.j);
                ++llllIIIlIIlIIII;
            }
            llllIIIlIIlIIIl.f.addCommand(llllIIIlIIlIIIl.a);
            llllIIIlIIlIIIl.f.addCommand(llllIIIlIIlIIIl.b);
            llllIIIlIIlIIIl.f.addCommand(llllIIIlIIlIIIl.c);
            llllIIIlIIlIIIl.f.setCommandListener((CommandListener)llllIIIlIIlIIIl);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)llllIIIlIIlIIIl.f);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void commandAction(Command command, Displayable displayable) {
        co llllIIIlIIIlIII;
        void llllIIIlIIIIlll;
        String llllIIIlIIIIlII;
        String llllIIIlIIIIlIl;
        int llllIIIlIIIIllI;
        if (command == this.a) {
            byte[] byArray = new byte[lIIllll[31]];
            byArray[co.lIIllll[1]] = lIIllll[1];
            byArray[co.lIIllll[2]] = lIIllll[57];
            byArray[co.lIIllll[4]] = lIIllll[1];
            byArray[co.lIIllll[5]] = lIIllll[78];
            byArray[co.lIIllll[7]] = lIIllll[1];
            byArray[co.lIIllll[8]] = lIIllll[79];
            byArray[co.lIIllll[10]] = lIIllll[1];
            byArray[co.lIIllll[11]] = lIIllll[57];
            byArray[co.lIIllll[0]] = lIIllll[1];
            byArray[co.lIIllll[26]] = lIIllll[30];
            byArray[co.lIIllll[28]] = lIIllll[1];
            byArray[co.lIIllll[29]] = lIIllll[55];
            co.b(ec.a(byArray));
            if (k.size() > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                int n2 = lIIllll[1];
                while (llllIIIlIIIIllI < k.size()) {
                    llllIIIlIIIIlIl = (String)k.elementAt(llllIIIlIIIIllI);
                    byte[] byArray2 = new byte[lIIllll[4]];
                    byArray2[co.lIIllll[1]] = lIIllll[1];
                    byArray2[co.lIIllll[2]] = lIIllll[72];
                    ((StringBuffer)((Object)llllIIIlIIIIlII)).append(String.valueOf(llllIIIlIIIIlIl) + ec.a(byArray2));
                    ++llllIIIlIIIIllI;
                }
                co.a(lIIllll[2], ((StringBuffer)((Object)llllIIIlIIIIlII)).toString());
            } else {
                co.a(lIIllll[2], "");
            }
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)dc.a);
            byte[] byArray3 = new byte[lIIllll[63]];
            byArray3[co.lIIllll[1]] = lIIllll[2];
            byArray3[co.lIIllll[2]] = lIIllll[37];
            byArray3[co.lIIllll[4]] = lIIllll[1];
            byArray3[co.lIIllll[5]] = lIIllll[54];
            byArray3[co.lIIllll[7]] = lIIllll[1];
            byArray3[co.lIIllll[8]] = lIIllll[27];
            byArray3[co.lIIllll[10]] = lIIllll[1];
            byArray3[co.lIIllll[11]] = lIIllll[80];
            byArray3[co.lIIllll[0]] = lIIllll[2];
            byArray3[co.lIIllll[26]] = lIIllll[58];
            byArray3[co.lIIllll[28]] = lIIllll[1];
            byArray3[co.lIIllll[29]] = lIIllll[78];
            byArray3[co.lIIllll[31]] = lIIllll[1];
            byArray3[co.lIIllll[32]] = lIIllll[27];
            byArray3[co.lIIllll[34]] = lIIllll[1];
            byArray3[co.lIIllll[35]] = lIIllll[55];
            byArray3[co.lIIllll[37]] = lIIllll[1];
            byArray3[co.lIIllll[38]] = lIIllll[14];
            byArray3[co.lIIllll[39]] = lIIllll[1];
            byArray3[co.lIIllll[40]] = lIIllll[81];
            byArray3[co.lIIllll[41]] = lIIllll[1];
            byArray3[co.lIIllll[42]] = lIIllll[9];
            byArray3[co.lIIllll[44]] = lIIllll[1];
            byArray3[co.lIIllll[45]] = lIIllll[14];
            byArray3[co.lIIllll[46]] = lIIllll[1];
            byArray3[co.lIIllll[47]] = lIIllll[27];
            byArray3[co.lIIllll[48]] = lIIllll[1];
            byArray3[co.lIIllll[49]] = lIIllll[36];
            byArray3[co.lIIllll[51]] = lIIllll[1];
            byArray3[co.lIIllll[52]] = lIIllll[82];
            byArray3[co.lIIllll[22]] = lIIllll[1];
            byArray3[co.lIIllll[59]] = lIIllll[9];
            byArray3[co.lIIllll[27]] = lIIllll[1];
            byArray3[co.lIIllll[60]] = lIIllll[12];
            byArray3[co.lIIllll[61]] = lIIllll[1];
            byArray3[co.lIIllll[62]] = lIIllll[60];
            at.a(ec.a(byArray3));
        }
        if (llllIIIlIIIIlll == llllIIIlIIIlIII.b) {
            byte[] byArray = new byte[lIIllll[48]];
            byArray[co.lIIllll[1]] = lIIllll[1];
            byArray[co.lIIllll[2]] = lIIllll[13];
            byArray[co.lIIllll[4]] = lIIllll[1];
            byArray[co.lIIllll[5]] = lIIllll[14];
            byArray[co.lIIllll[7]] = lIIllll[1];
            byArray[co.lIIllll[8]] = lIIllll[15];
            byArray[co.lIIllll[10]] = lIIllll[1];
            byArray[co.lIIllll[11]] = lIIllll[16];
            byArray[co.lIIllll[0]] = lIIllll[1];
            byArray[co.lIIllll[26]] = lIIllll[27];
            byArray[co.lIIllll[28]] = lIIllll[1];
            byArray[co.lIIllll[29]] = lIIllll[43];
            byArray[co.lIIllll[31]] = lIIllll[22];
            byArray[co.lIIllll[32]] = lIIllll[83];
            byArray[co.lIIllll[34]] = lIIllll[1];
            byArray[co.lIIllll[35]] = lIIllll[27];
            byArray[co.lIIllll[37]] = lIIllll[1];
            byArray[co.lIIllll[38]] = lIIllll[43];
            byArray[co.lIIllll[39]] = lIIllll[1];
            byArray[co.lIIllll[40]] = lIIllll[6];
            byArray[co.lIIllll[41]] = lIIllll[1];
            byArray[co.lIIllll[42]] = lIIllll[27];
            byArray[co.lIIllll[44]] = lIIllll[1];
            byArray[co.lIIllll[45]] = lIIllll[50];
            byArray[co.lIIllll[46]] = lIIllll[1];
            byArray[co.lIIllll[47]] = lIIllll[43];
            llllIIIlIIIlIII.g = new Form(ec.a(byArray));
            byte[] byArray4 = new byte[lIIllll[0]];
            byArray4[co.lIIllll[1]] = lIIllll[1];
            byArray4[co.lIIllll[2]] = lIIllll[13];
            byArray4[co.lIIllll[4]] = lIIllll[1];
            byArray4[co.lIIllll[5]] = lIIllll[15];
            byArray4[co.lIIllll[7]] = lIIllll[1];
            byArray4[co.lIIllll[8]] = lIIllll[9];
            byArray4[co.lIIllll[10]] = lIIllll[1];
            byArray4[co.lIIllll[11]] = lIIllll[84];
            llllIIIlIIIlIII.i = new TextField(ec.a(byArray4), null, lIIllll[85], lIIllll[1]);
            llllIIIlIIIlIII.g.append((Item)llllIIIlIIIlIII.i);
            llllIIIlIIIlIII.g.addCommand(llllIIIlIIIlIII.d);
            llllIIIlIIIlIII.g.addCommand(llllIIIlIIIlIII.e);
            llllIIIlIIIlIII.g.setCommandListener((CommandListener)llllIIIlIIIlIII);
            Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)llllIIIlIIIlIII.g);
        }
        if (llllIIIlIIIIlll != llllIIIlIIIlIII.c) {
            if (llllIIIlIIIIlll == llllIIIlIIIlIII.e) {
                llllIIIlIIIlIII.a();
            }
            if (llllIIIlIIIIlll == llllIIIlIIIlIII.d) {
                llllIIIlIIIIlII = llllIIIlIIIlIII.i.getString();
                if (!llllIIIlIIIIlII.equals("")) {
                    k.addElement(llllIIIlIIIIlII);
                }
                llllIIIlIIIlIII.a();
                return;
            }
        } else {
            llllIIIlIIIIllI = llllIIIlIIIlIII.f.getSelectedIndex();
            llllIIIlIIIIlIl = llllIIIlIIIlIII.f.getString(llllIIIlIIIIllI);
            llllIIIlIIIlIII.f.delete(llllIIIlIIIIllI);
            int llllIIIlIIIIIll = lIIllll[1];
            while (llllIIIlIIIIIll < k.size()) {
                llllIIIlIIIIlII = (String)k.elementAt(llllIIIlIIIIIll);
                if (llllIIIlIIIIlIl.equals(llllIIIlIIIIlII)) {
                    k.removeElementAt(llllIIIlIIIIIll);
                    return;
                }
                ++llllIIIlIIIIIll;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void b() {
        byte[] byArray = new byte[lIIllll[0]];
        byArray[co.lIIllll[1]] = lIIllll[1];
        byArray[co.lIIllll[2]] = lIIllll[9];
        byArray[co.lIIllll[4]] = lIIllll[1];
        byArray[co.lIIllll[5]] = lIIllll[78];
        byArray[co.lIIllll[7]] = lIIllll[1];
        byArray[co.lIIllll[8]] = lIIllll[80];
        byArray[co.lIIllll[10]] = lIIllll[1];
        byArray[co.lIIllll[11]] = lIIllll[80];
        String string = co.b(lIIllll[2], ec.a(byArray));
        byte[] byArray2 = new byte[lIIllll[0]];
        byArray2[co.lIIllll[1]] = lIIllll[1];
        byArray2[co.lIIllll[2]] = lIIllll[9];
        byArray2[co.lIIllll[4]] = lIIllll[1];
        byArray2[co.lIIllll[5]] = lIIllll[78];
        byArray2[co.lIIllll[7]] = lIIllll[1];
        byArray2[co.lIIllll[8]] = lIIllll[80];
        byArray2[co.lIIllll[10]] = lIIllll[1];
        byArray2[co.lIIllll[11]] = lIIllll[80];
        if (!string.equals(ec.a(byArray2))) {
            void llllIIIIllllIIl;
            void llllIIIIllllIlI;
            String llllIIIIllllIll;
            byte[] byArray3 = new byte[lIIllll[4]];
            byArray3[co.lIIllll[1]] = lIIllll[1];
            byArray3[co.lIIllll[2]] = lIIllll[72];
            String string2 = ec.a(byArray3);
            Vector vector = new Vector();
            String string3 = string2;
            if (!string.endsWith(string2)) {
                llllIIIIllllIll = String.valueOf(string) + string2;
            }
            int llllIIIIlllIlll = lIIllll[1];
            int llllIIIIlllIllI = llllIIIIllllIll.indexOf((String)llllIIIIllllIlI);
            while (llllIIIIlllIllI != lIIllll[86]) {
                void llllIIIIllllIII;
                llllIIIIllllIIl.addElement(llllIIIIllllIll.substring(llllIIIIlllIlll, llllIIIIlllIllI));
                llllIIIIlllIlll = llllIIIIlllIllI + llllIIIIllllIII.length();
                llllIIIIlllIllI = llllIIIIllllIll.indexOf((String)llllIIIIllllIII, llllIIIIlllIlll);
            }
            Object[] llllIIIIlllIlIl = new String[llllIIIIllllIIl.size()];
            llllIIIIllllIIl.copyInto(llllIIIIlllIlIl);
            llllIIIIlllIllI = lIIllll[1];
            while (llllIIIIlllIllI < llllIIIIlllIlIl.length) {
                k.addElement(llllIIIIlllIlIl[llllIIIIlllIllI]);
                ++llllIIIIlllIllI;
            }
        }
    }

    private static void b(String llllIIIIlllIIlI) {
        try {
            RecordStore.deleteRecordStore((String)llllIIIIlllIIlI);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void a(int n2, String llllIIIIllIlIll) {
        try {
            byte[] llllIIIIllIlIII;
            byte[] byArray = new byte[lIIllll[31]];
            byArray[co.lIIllll[1]] = lIIllll[1];
            byArray[co.lIIllll[2]] = lIIllll[57];
            byArray[co.lIIllll[4]] = lIIllll[1];
            byArray[co.lIIllll[5]] = lIIllll[78];
            byArray[co.lIIllll[7]] = lIIllll[1];
            byArray[co.lIIllll[8]] = lIIllll[79];
            byArray[co.lIIllll[10]] = lIIllll[1];
            byArray[co.lIIllll[11]] = lIIllll[57];
            byArray[co.lIIllll[0]] = lIIllll[1];
            byArray[co.lIIllll[26]] = lIIllll[30];
            byArray[co.lIIllll[28]] = lIIllll[1];
            byArray[co.lIIllll[29]] = lIIllll[55];
            RecordStore llllIIIIllIlIlI = RecordStore.openRecordStore((String)ec.a(byArray), (boolean)lIIllll[2]);
            int llllIIIIllIlIIl = llllIIIIllIlIlI.getNumRecords();
            if (llllIIIIllIlIIl <= 0) {
                llllIIIIllIlIII = new byte[lIIllll[1]];
                int llllIIIIllIIlll = lIIllll[1];
                while (llllIIIIllIIlll < lIIllll[2] - llllIIIIllIlIIl) {
                    llllIIIIllIlIlI.addRecord(llllIIIIllIlIII, lIIllll[1], lIIllll[1]);
                    ++llllIIIIllIIlll;
                }
            }
            byte[] byArray2 = new byte[lIIllll[28]];
            byArray2[co.lIIllll[1]] = lIIllll[1];
            byArray2[co.lIIllll[2]] = lIIllll[87];
            byArray2[co.lIIllll[4]] = lIIllll[1];
            byArray2[co.lIIllll[5]] = lIIllll[13];
            byArray2[co.lIIllll[7]] = lIIllll[1];
            byArray2[co.lIIllll[8]] = lIIllll[88];
            byArray2[co.lIIllll[10]] = lIIllll[1];
            byArray2[co.lIIllll[11]] = lIIllll[72];
            byArray2[co.lIIllll[0]] = lIIllll[1];
            byArray2[co.lIIllll[26]] = lIIllll[89];
            llllIIIIllIlIII = llllIIIIllIlIll.getBytes(ec.a(byArray2));
            llllIIIIllIlIlI.setRecord(lIIllll[2], llllIIIIllIlIII, lIIllll[1], llllIIIIllIlIII.length);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String b(int n2, String llllIIIIllIIlII) {
        try {
            byte[] byArray = new byte[lIIllll[31]];
            byArray[co.lIIllll[1]] = lIIllll[1];
            byArray[co.lIIllll[2]] = lIIllll[57];
            byArray[co.lIIllll[4]] = lIIllll[1];
            byArray[co.lIIllll[5]] = lIIllll[78];
            byArray[co.lIIllll[7]] = lIIllll[1];
            byArray[co.lIIllll[8]] = lIIllll[79];
            byArray[co.lIIllll[10]] = lIIllll[1];
            byArray[co.lIIllll[11]] = lIIllll[57];
            byArray[co.lIIllll[0]] = lIIllll[1];
            byArray[co.lIIllll[26]] = lIIllll[30];
            byArray[co.lIIllll[28]] = lIIllll[1];
            byArray[co.lIIllll[29]] = lIIllll[55];
            byte[] llllIIIIllIIIll = RecordStore.openRecordStore((String)ec.a(byArray), (boolean)lIIllll[2]).getRecord(lIIllll[2]);
            byte[] byArray2 = new byte[lIIllll[28]];
            byArray2[co.lIIllll[1]] = lIIllll[1];
            byArray2[co.lIIllll[2]] = lIIllll[87];
            byArray2[co.lIIllll[4]] = lIIllll[1];
            byArray2[co.lIIllll[5]] = lIIllll[13];
            byArray2[co.lIIllll[7]] = lIIllll[1];
            byArray2[co.lIIllll[8]] = lIIllll[88];
            byArray2[co.lIIllll[10]] = lIIllll[1];
            byArray2[co.lIIllll[11]] = lIIllll[72];
            byArray2[co.lIIllll[0]] = lIIllll[1];
            byArray2[co.lIIllll[26]] = lIIllll[89];
            return new String(llllIIIIllIIIll, ec.a(byArray2));
        }
        catch (Exception exception) {
            void var1_1;
            return var1_1;
        }
    }

    public static boolean a(String string) {
        return k.contains(string);
    }

    private static void lllIll() {
        lIIllll = new int[90];
        co.lIIllll[0] = " ".length() << "   ".length();
        co.lIIllll[1] = (0x7E ^ 0x6D) & ~(0x1E ^ 0xD);
        co.lIIllll[2] = " ".length();
        co.lIIllll[3] = (0x64 ^ 0x6F) << "   ".length();
        co.lIIllll[4] = " ".length() << " ".length();
        co.lIIllll[5] = "   ".length();
        co.lIIllll[6] = 0xC1 ^ 0xAE;
        co.lIIllll[7] = " ".length() << (" ".length() << " ".length());
        co.lIIllll[8] = 0x6F ^ 0x6A;
        co.lIIllll[9] = (0xA1 ^ 0x96) << " ".length();
        co.lIIllll[10] = "   ".length() << " ".length();
        co.lIIllll[11] = 0x8F ^ 0x88;
        co.lIIllll[12] = 0x21 ^ 0x46;
        co.lIIllll[13] = (0x40 ^ 0x55) << (" ".length() << " ".length());
        co.lIIllll[14] = (0x36 ^ 0x3B) << "   ".length();
        co.lIIllll[15] = -(0x95 ^ 0x83);
        co.lIIllll[16] = 0x6F ^ 2;
        co.lIIllll[17] = -(0x42 ^ 0x4F);
        co.lIIllll[18] = 0xEE ^ 0x8F;
        co.lIIllll[19] = 0xED ^ 0xA2;
        co.lIIllll[20] = 0x10 ^ 0x5B;
        co.lIIllll[21] = (0x6D ^ 0x64) << "   ".length();
        co.lIIllll[22] = (0x9B ^ 0x94) << " ".length();
        co.lIIllll[23] = -(0x98 ^ 0x81);
        co.lIIllll[24] = 0x4C ^ 0x35;
        co.lIIllll[25] = (0x6D ^ 0x7C) << (" ".length() << " ".length());
        co.lIIllll[26] = 0x34 ^ 0x3D;
        co.lIIllll[27] = " ".length() << (0x9A ^ 0x9F);
        co.lIIllll[28] = (0x8B ^ 0x8E) << " ".length();
        co.lIIllll[29] = 0xCF ^ 0xC4;
        co.lIIllll[30] = 0x2F ^ 0x5C;
        co.lIIllll[31] = "   ".length() << (" ".length() << " ".length());
        co.lIIllll[32] = 0x38 ^ 0x35;
        co.lIIllll[33] = -(0xB ^ 0x14);
        co.lIIllll[34] = (0x82 ^ 0x85) << " ".length();
        co.lIIllll[35] = 0x84 ^ 0x8B;
        co.lIIllll[36] = 0xC9 ^ 0xAA;
        co.lIIllll[37] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        co.lIIllll[38] = 0x4B ^ 0x5A;
        co.lIIllll[39] = (0x46 ^ 0x4F) << " ".length();
        co.lIIllll[40] = 0xF ^ 0x1C;
        co.lIIllll[41] = (0x34 ^ 0x31) << (" ".length() << " ".length());
        co.lIIllll[42] = 0x92 ^ 0x87;
        co.lIIllll[43] = 0xC5 ^ 0xAE;
        co.lIIllll[44] = (0x18 ^ 0x13) << " ".length();
        co.lIIllll[45] = 0x5B ^ 0x4C;
        co.lIIllll[46] = "   ".length() << "   ".length();
        co.lIIllll[47] = 0xB ^ 0x12;
        co.lIIllll[48] = (0x30 ^ 0x3D) << " ".length();
        co.lIIllll[49] = 0xA1 ^ 0xBA;
        co.lIIllll[50] = (0xD ^ 0xA) << (" ".length() << (" ".length() << " ".length()));
        co.lIIllll[51] = (0x5C ^ 0x5B) << (" ".length() << " ".length());
        co.lIIllll[52] = 0x94 ^ 0x89;
        co.lIIllll[53] = (0x1F ^ 6) << " ".length();
        co.lIIllll[54] = -(0x25 ^ 0x38);
        co.lIIllll[55] = (0xBA ^ 0xA7) << (" ".length() << " ".length());
        co.lIIllll[56] = -(0xAB ^ 0x84);
        co.lIIllll[57] = 0xDB ^ 0xB2;
        co.lIIllll[58] = -(0x31 ^ 0x61);
        co.lIIllll[59] = 0x33 ^ 0x2C;
        co.lIIllll[60] = 0x5D ^ 0x7C;
        co.lIIllll[61] = (0x67 ^ 0x76) << " ".length();
        co.lIIllll[62] = 0x22 ^ 1;
        co.lIIllll[63] = (0xAD ^ 0xA4) << (" ".length() << " ".length());
        co.lIIllll[64] = 0xB5 ^ 0x90;
        co.lIIllll[65] = (0x37 ^ 0x24) << " ".length();
        co.lIIllll[66] = 0xE4 ^ 0xC3;
        co.lIIllll[67] = (0x4F ^ 0x4A) << "   ".length();
        co.lIIllll[68] = 0xBB ^ 0x92;
        co.lIIllll[69] = (0x14 ^ 1) << " ".length();
        co.lIIllll[70] = 0xAC ^ 0x87;
        co.lIIllll[71] = (0x38 ^ 0x33) << (" ".length() << " ".length());
        co.lIIllll[72] = 0x5B ^ 0x76;
        co.lIIllll[73] = (0x7E ^ 0x69) << " ".length();
        co.lIIllll[74] = 0xA3 ^ 0x8C;
        co.lIIllll[75] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        co.lIIllll[76] = 0xB5 ^ 0x84;
        co.lIIllll[77] = (0x60 ^ 0x6F) << "   ".length();
        co.lIIllll[78] = 0x6B ^ 0x1E;
        co.lIIllll[79] = (9 ^ 0x1A) << (" ".length() << " ".length());
        co.lIIllll[80] = (0xA5 ^ 0xBE) << (" ".length() << " ".length());
        co.lIIllll[81] = -(0x36 ^ 0x16);
        co.lIIllll[82] = -(0x10 ^ 0x1C);
        co.lIIllll[83] = -(0xE8 ^ 0xAD);
        co.lIIllll[84] = (0x8B ^ 0x96) << " ".length();
        co.lIIllll[85] = 334 + 384 - 179 + 86 << "   ".length();
        co.lIIllll[86] = -" ".length();
        co.lIIllll[87] = 0x73 ^ 0x26;
        co.lIIllll[88] = (0xBB ^ 0x98) << " ".length();
        co.lIIllll[89] = (0x3C ^ 0x3B) << "   ".length();
    }
}

