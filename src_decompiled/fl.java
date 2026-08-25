/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;

public class fl
extends Form
implements CommandListener {
    static /* synthetic */ boolean a;
    static /* synthetic */ boolean b;
    static /* synthetic */ boolean c;
    static /* synthetic */ boolean d;
    static /* synthetic */ int e;
    static /* synthetic */ int f;
    static /* synthetic */ int g;
    private /* synthetic */ Command h;
    private /* synthetic */ ChoiceGroup i;
    private /* synthetic */ ChoiceGroup j;
    private /* synthetic */ TextField k;
    private /* synthetic */ TextField l;
    private /* synthetic */ TextField m;
    private static final /* synthetic */ int[] llllIII;

    static {
        fl.lIlllIl();
        e = llllIII[0];
        f = llllIII[0];
        g = llllIII[0];
    }

    public fl() {
        byte[] byArray = new byte[llllIII[1]];
        byArray[fl.llllIII[2]] = llllIII[2];
        byArray[fl.llllIII[3]] = llllIII[4];
        byArray[fl.llllIII[5]] = llllIII[2];
        byArray[fl.llllIII[6]] = llllIII[7];
        byArray[fl.llllIII[8]] = llllIII[2];
        byArray[fl.llllIII[9]] = llllIII[10];
        byArray[fl.llllIII[11]] = llllIII[2];
        byArray[fl.llllIII[12]] = llllIII[13];
        byArray[fl.llllIII[14]] = llllIII[3];
        byArray[fl.llllIII[15]] = llllIII[16];
        byArray[fl.llllIII[17]] = llllIII[18];
        byArray[fl.llllIII[19]] = llllIII[20];
        byArray[fl.llllIII[21]] = llllIII[2];
        byArray[fl.llllIII[22]] = llllIII[23];
        super(ec.a(byArray));
        byte[] byArray2 = new byte[llllIII[24]];
        byArray2[fl.llllIII[2]] = llllIII[2];
        byArray2[fl.llllIII[3]] = llllIII[25];
        byArray2[fl.llllIII[5]] = llllIII[2];
        byArray2[fl.llllIII[6]] = llllIII[26];
        byArray2[fl.llllIII[8]] = llllIII[2];
        byArray2[fl.llllIII[9]] = llllIII[27];
        byArray2[fl.llllIII[11]] = llllIII[2];
        byArray2[fl.llllIII[12]] = llllIII[28];
        byArray2[fl.llllIII[14]] = llllIII[2];
        byArray2[fl.llllIII[15]] = llllIII[13];
        byArray2[fl.llllIII[17]] = llllIII[2];
        byArray2[fl.llllIII[19]] = llllIII[29];
        byArray2[fl.llllIII[21]] = llllIII[2];
        byArray2[fl.llllIII[22]] = llllIII[30];
        byArray2[fl.llllIII[1]] = llllIII[2];
        byArray2[fl.llllIII[31]] = llllIII[32];
        String[] stringArray = new String[llllIII[5]];
        byte[] byArray3 = new byte[llllIII[11]];
        byArray3[fl.llllIII[2]] = llllIII[2];
        byArray3[fl.llllIII[3]] = llllIII[33];
        byArray3[fl.llllIII[5]] = llllIII[18];
        byArray3[fl.llllIII[6]] = llllIII[34];
        byArray3[fl.llllIII[8]] = llllIII[2];
        byArray3[fl.llllIII[9]] = llllIII[23];
        stringArray[fl.llllIII[2]] = ec.a(byArray3);
        byte[] byArray4 = new byte[llllIII[11]];
        byArray4[fl.llllIII[2]] = llllIII[2];
        byArray4[fl.llllIII[3]] = llllIII[35];
        byArray4[fl.llllIII[5]] = llllIII[18];
        byArray4[fl.llllIII[6]] = llllIII[36];
        byArray4[fl.llllIII[8]] = llllIII[2];
        byArray4[fl.llllIII[9]] = llllIII[23];
        stringArray[fl.llllIII[3]] = ec.a(byArray4);
        this.j = new ChoiceGroup(ec.a(byArray2), llllIII[3], stringArray, null);
        this.append((Item)this.j);
        byte[] byArray5 = new byte[llllIII[37]];
        byArray5[fl.llllIII[2]] = llllIII[2];
        byArray5[fl.llllIII[3]] = llllIII[38];
        byArray5[fl.llllIII[5]] = llllIII[2];
        byArray5[fl.llllIII[6]] = llllIII[39];
        byArray5[fl.llllIII[8]] = llllIII[18];
        byArray5[fl.llllIII[9]] = llllIII[40];
        byArray5[fl.llllIII[11]] = llllIII[2];
        byArray5[fl.llllIII[12]] = llllIII[10];
        byArray5[fl.llllIII[14]] = llllIII[2];
        byArray5[fl.llllIII[15]] = llllIII[13];
        byArray5[fl.llllIII[17]] = llllIII[2];
        byArray5[fl.llllIII[19]] = llllIII[41];
        byArray5[fl.llllIII[21]] = llllIII[2];
        byArray5[fl.llllIII[22]] = llllIII[42];
        byArray5[fl.llllIII[1]] = llllIII[2];
        byArray5[fl.llllIII[31]] = llllIII[43];
        byArray5[fl.llllIII[24]] = llllIII[2];
        byArray5[fl.llllIII[16]] = llllIII[10];
        String[] stringArray2 = new String[llllIII[6]];
        byte[] byArray6 = new byte[llllIII[21]];
        byArray6[fl.llllIII[2]] = llllIII[2];
        byArray6[fl.llllIII[3]] = llllIII[35];
        byArray6[fl.llllIII[5]] = llllIII[2];
        byArray6[fl.llllIII[6]] = llllIII[28];
        byArray6[fl.llllIII[8]] = llllIII[3];
        byArray6[fl.llllIII[9]] = llllIII[44];
        byArray6[fl.llllIII[11]] = llllIII[18];
        byArray6[fl.llllIII[12]] = llllIII[45];
        byArray6[fl.llllIII[14]] = llllIII[2];
        byArray6[fl.llllIII[15]] = llllIII[32];
        byArray6[fl.llllIII[17]] = llllIII[2];
        byArray6[fl.llllIII[19]] = llllIII[46];
        stringArray2[fl.llllIII[2]] = ec.a(byArray6);
        byte[] byArray7 = new byte[llllIII[24]];
        byArray7[fl.llllIII[2]] = llllIII[2];
        byArray7[fl.llllIII[3]] = llllIII[35];
        byArray7[fl.llllIII[5]] = llllIII[2];
        byArray7[fl.llllIII[6]] = llllIII[10];
        byArray7[fl.llllIII[8]] = llllIII[2];
        byArray7[fl.llllIII[9]] = llllIII[32];
        byArray7[fl.llllIII[11]] = llllIII[2];
        byArray7[fl.llllIII[12]] = llllIII[28];
        byArray7[fl.llllIII[14]] = llllIII[2];
        byArray7[fl.llllIII[15]] = llllIII[13];
        byArray7[fl.llllIII[17]] = llllIII[2];
        byArray7[fl.llllIII[19]] = llllIII[47];
        byArray7[fl.llllIII[21]] = llllIII[2];
        byArray7[fl.llllIII[22]] = llllIII[32];
        byArray7[fl.llllIII[1]] = llllIII[2];
        byArray7[fl.llllIII[31]] = llllIII[28];
        stringArray2[fl.llllIII[3]] = ec.a(byArray7);
        byte[] byArray8 = new byte[llllIII[24]];
        byArray8[fl.llllIII[2]] = llllIII[2];
        byArray8[fl.llllIII[3]] = llllIII[35];
        byArray8[fl.llllIII[5]] = llllIII[2];
        byArray8[fl.llllIII[6]] = llllIII[28];
        byArray8[fl.llllIII[8]] = llllIII[18];
        byArray8[fl.llllIII[9]] = llllIII[48];
        byArray8[fl.llllIII[11]] = llllIII[2];
        byArray8[fl.llllIII[12]] = llllIII[13];
        byArray8[fl.llllIII[14]] = llllIII[2];
        byArray8[fl.llllIII[15]] = llllIII[49];
        byArray8[fl.llllIII[17]] = llllIII[3];
        byArray8[fl.llllIII[19]] = llllIII[50];
        byArray8[fl.llllIII[21]] = llllIII[2];
        byArray8[fl.llllIII[22]] = llllIII[32];
        byArray8[fl.llllIII[1]] = llllIII[2];
        byArray8[fl.llllIII[31]] = llllIII[28];
        stringArray2[fl.llllIII[5]] = ec.a(byArray8);
        this.i = new ChoiceGroup(ec.a(byArray5), llllIII[5], stringArray2, null);
        this.append((Item)this.i);
        byte[] byArray9 = new byte[llllIII[51]];
        byArray9[fl.llllIII[2]] = llllIII[2];
        byArray9[fl.llllIII[3]] = llllIII[52];
        byArray9[fl.llllIII[5]] = llllIII[2];
        byArray9[fl.llllIII[6]] = llllIII[53];
        byArray9[fl.llllIII[8]] = llllIII[2];
        byArray9[fl.llllIII[9]] = llllIII[13];
        byArray9[fl.llllIII[11]] = llllIII[2];
        byArray9[fl.llllIII[12]] = llllIII[54];
        byArray9[fl.llllIII[14]] = llllIII[2];
        byArray9[fl.llllIII[15]] = llllIII[42];
        byArray9[fl.llllIII[17]] = llllIII[2];
        byArray9[fl.llllIII[19]] = llllIII[43];
        byArray9[fl.llllIII[21]] = llllIII[2];
        byArray9[fl.llllIII[22]] = llllIII[10];
        byArray9[fl.llllIII[1]] = llllIII[2];
        byArray9[fl.llllIII[31]] = llllIII[13];
        byArray9[fl.llllIII[24]] = llllIII[2];
        byArray9[fl.llllIII[16]] = llllIII[35];
        byArray9[fl.llllIII[37]] = llllIII[2];
        byArray9[fl.llllIII[55]] = llllIII[28];
        byArray9[fl.llllIII[56]] = llllIII[3];
        byArray9[fl.llllIII[57]] = llllIII[44];
        byArray9[fl.llllIII[58]] = llllIII[18];
        byArray9[fl.llllIII[59]] = llllIII[45];
        byArray9[fl.llllIII[60]] = llllIII[2];
        byArray9[fl.llllIII[61]] = llllIII[32];
        byArray9[fl.llllIII[62]] = llllIII[2];
        byArray9[fl.llllIII[63]] = llllIII[46];
        this.k = new TextField(ec.a(byArray9), String.valueOf(e), llllIII[15], llllIII[5]);
        this.append((Item)this.k);
        byte[] byArray10 = new byte[llllIII[58]];
        byArray10[fl.llllIII[2]] = llllIII[2];
        byArray10[fl.llllIII[3]] = llllIII[52];
        byArray10[fl.llllIII[5]] = llllIII[2];
        byArray10[fl.llllIII[6]] = llllIII[53];
        byArray10[fl.llllIII[8]] = llllIII[2];
        byArray10[fl.llllIII[9]] = llllIII[13];
        byArray10[fl.llllIII[11]] = llllIII[2];
        byArray10[fl.llllIII[12]] = llllIII[35];
        byArray10[fl.llllIII[14]] = llllIII[2];
        byArray10[fl.llllIII[15]] = llllIII[10];
        byArray10[fl.llllIII[17]] = llllIII[2];
        byArray10[fl.llllIII[19]] = llllIII[32];
        byArray10[fl.llllIII[21]] = llllIII[2];
        byArray10[fl.llllIII[22]] = llllIII[28];
        byArray10[fl.llllIII[1]] = llllIII[2];
        byArray10[fl.llllIII[31]] = llllIII[13];
        byArray10[fl.llllIII[24]] = llllIII[2];
        byArray10[fl.llllIII[16]] = llllIII[64];
        byArray10[fl.llllIII[37]] = llllIII[2];
        byArray10[fl.llllIII[55]] = llllIII[32];
        byArray10[fl.llllIII[56]] = llllIII[2];
        byArray10[fl.llllIII[57]] = llllIII[28];
        this.l = new TextField(ec.a(byArray10), String.valueOf(f), llllIII[15], llllIII[5]);
        this.append((Item)this.l);
        byte[] byArray11 = new byte[llllIII[58]];
        byArray11[fl.llllIII[2]] = llllIII[2];
        byArray11[fl.llllIII[3]] = llllIII[52];
        byArray11[fl.llllIII[5]] = llllIII[2];
        byArray11[fl.llllIII[6]] = llllIII[53];
        byArray11[fl.llllIII[8]] = llllIII[2];
        byArray11[fl.llllIII[9]] = llllIII[13];
        byArray11[fl.llllIII[11]] = llllIII[2];
        byArray11[fl.llllIII[12]] = llllIII[35];
        byArray11[fl.llllIII[14]] = llllIII[2];
        byArray11[fl.llllIII[15]] = llllIII[28];
        byArray11[fl.llllIII[17]] = llllIII[18];
        byArray11[fl.llllIII[19]] = llllIII[48];
        byArray11[fl.llllIII[21]] = llllIII[2];
        byArray11[fl.llllIII[22]] = llllIII[13];
        byArray11[fl.llllIII[1]] = llllIII[2];
        byArray11[fl.llllIII[31]] = llllIII[38];
        byArray11[fl.llllIII[24]] = llllIII[3];
        byArray11[fl.llllIII[16]] = llllIII[50];
        byArray11[fl.llllIII[37]] = llllIII[2];
        byArray11[fl.llllIII[55]] = llllIII[32];
        byArray11[fl.llllIII[56]] = llllIII[2];
        byArray11[fl.llllIII[57]] = llllIII[28];
        this.m = new TextField(ec.a(byArray11), String.valueOf(g), llllIII[15], llllIII[5]);
        this.append((Item)this.m);
        byte[] byArray12 = new byte[llllIII[14]];
        byArray12[fl.llllIII[2]] = llllIII[2];
        byArray12[fl.llllIII[3]] = llllIII[65];
        byArray12[fl.llllIII[5]] = llllIII[2];
        byArray12[fl.llllIII[6]] = llllIII[47];
        byArray12[fl.llllIII[8]] = llllIII[2];
        byArray12[fl.llllIII[9]] = llllIII[66];
        byArray12[fl.llllIII[11]] = llllIII[2];
        byArray12[fl.llllIII[12]] = llllIII[67];
        this.h = new Command(ec.a(byArray12), llllIII[8], llllIII[2]);
        this.addCommand(this.h);
        byte[] byArray13 = new byte[llllIII[21]];
        byArray13[fl.llllIII[2]] = llllIII[2];
        byArray13[fl.llllIII[3]] = llllIII[4];
        byArray13[fl.llllIII[5]] = llllIII[2];
        byArray13[fl.llllIII[6]] = llllIII[47];
        byArray13[fl.llllIII[8]] = llllIII[2];
        byArray13[fl.llllIII[9]] = llllIII[32];
        byArray13[fl.llllIII[11]] = llllIII[2];
        byArray13[fl.llllIII[12]] = llllIII[27];
        byArray13[fl.llllIII[14]] = llllIII[2];
        byArray13[fl.llllIII[15]] = llllIII[67];
        byArray13[fl.llllIII[17]] = llllIII[2];
        byArray13[fl.llllIII[19]] = llllIII[49];
        this.addCommand(new Command(ec.a(byArray13), llllIII[12], llllIII[2]));
        this.setCommandListener(this);
        this.j.setSelectedIndex(d ? llllIII[2] : llllIII[3], llllIII[3]);
        this.i.setSelectedIndex(llllIII[2], a);
        this.i.setSelectedIndex(llllIII[3], b);
        this.i.setSelectedIndex(llllIII[5], c);
    }

    /*
     * WARNING - void declaration
     */
    static void a() {
        byte[] byArray = new byte[llllIII[60]];
        byArray[fl.llllIII[2]] = llllIII[2];
        byArray[fl.llllIII[3]] = llllIII[53];
        byArray[fl.llllIII[5]] = llllIII[2];
        byArray[fl.llllIII[6]] = llllIII[28];
        byArray[fl.llllIII[8]] = llllIII[2];
        byArray[fl.llllIII[9]] = llllIII[39];
        byArray[fl.llllIII[11]] = llllIII[2];
        byArray[fl.llllIII[12]] = llllIII[32];
        byArray[fl.llllIII[14]] = llllIII[2];
        byArray[fl.llllIII[15]] = llllIII[46];
        byArray[fl.llllIII[17]] = llllIII[2];
        byArray[fl.llllIII[19]] = llllIII[25];
        byArray[fl.llllIII[21]] = llllIII[2];
        byArray[fl.llllIII[22]] = llllIII[10];
        byArray[fl.llllIII[1]] = llllIII[2];
        byArray[fl.llllIII[31]] = llllIII[27];
        byArray[fl.llllIII[24]] = llllIII[2];
        byArray[fl.llllIII[16]] = llllIII[28];
        byArray[fl.llllIII[37]] = llllIII[2];
        byArray[fl.llllIII[55]] = llllIII[68];
        byArray[fl.llllIII[56]] = llllIII[2];
        byArray[fl.llllIII[57]] = llllIII[67];
        byArray[fl.llllIII[58]] = llllIII[2];
        byArray[fl.llllIII[59]] = llllIII[32];
        byte[] byArray2 = dv.a(ec.a(byArray));
        if (byArray2 != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray2);
            DataInputStream llIlllllllIllll = new DataInputStream(byteArrayInputStream);
            try {
                void llIllllllllIIII;
                d = llIlllllllIllll.readBoolean();
                a = llIlllllllIllll.readBoolean();
                b = llIlllllllIllll.readBoolean();
                c = llIlllllllIllll.readBoolean();
                e = llIlllllllIllll.readInt();
                f = llIlllllllIllll.readInt();
                g = llIlllllllIllll.readInt();
                llIlllllllIllll.close();
                llIllllllllIIII.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void commandAction(Command command, Displayable displayable) {
        if (command == this.h) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream llIlllllllIIlIl = new DataOutputStream(byteArrayOutputStream);
            try {
                void llIlllllllIIllI;
                fl llIlllllllIlIII;
                d = llIlllllllIlIII.j.getSelectedIndex() == 0 ? llllIII[3] : llllIII[2];
                a = llIlllllllIlIII.i.isSelected(llllIII[2]);
                b = llIlllllllIlIII.i.isSelected(llllIII[3]);
                c = llIlllllllIlIII.i.isSelected(llllIII[5]);
                e = Integer.parseInt(llIlllllllIlIII.k.getString());
                f = Integer.parseInt(llIlllllllIlIII.l.getString());
                g = Integer.parseInt(llIlllllllIlIII.m.getString());
                llIlllllllIIlIl.writeBoolean(d);
                llIlllllllIIlIl.writeBoolean(a);
                llIlllllllIIlIl.writeBoolean(b);
                llIlllllllIIlIl.writeBoolean(c);
                llIlllllllIIlIl.writeInt(e);
                llIlllllllIIlIl.writeInt(f);
                llIlllllllIIlIl.writeInt(g);
                byte[] byArray = new byte[llllIII[60]];
                byArray[fl.llllIII[2]] = llllIII[2];
                byArray[fl.llllIII[3]] = llllIII[53];
                byArray[fl.llllIII[5]] = llllIII[2];
                byArray[fl.llllIII[6]] = llllIII[28];
                byArray[fl.llllIII[8]] = llllIII[2];
                byArray[fl.llllIII[9]] = llllIII[39];
                byArray[fl.llllIII[11]] = llllIII[2];
                byArray[fl.llllIII[12]] = llllIII[32];
                byArray[fl.llllIII[14]] = llllIII[2];
                byArray[fl.llllIII[15]] = llllIII[46];
                byArray[fl.llllIII[17]] = llllIII[2];
                byArray[fl.llllIII[19]] = llllIII[25];
                byArray[fl.llllIII[21]] = llllIII[2];
                byArray[fl.llllIII[22]] = llllIII[10];
                byArray[fl.llllIII[1]] = llllIII[2];
                byArray[fl.llllIII[31]] = llllIII[27];
                byArray[fl.llllIII[24]] = llllIII[2];
                byArray[fl.llllIII[16]] = llllIII[28];
                byArray[fl.llllIII[37]] = llllIII[2];
                byArray[fl.llllIII[55]] = llllIII[68];
                byArray[fl.llllIII[56]] = llllIII[2];
                byArray[fl.llllIII[57]] = llllIII[67];
                byArray[fl.llllIII[58]] = llllIII[2];
                byArray[fl.llllIII[59]] = llllIII[32];
                dv.a(ec.a(byArray), ((ByteArrayOutputStream)llIlllllllIIllI).toByteArray());
                llIlllllllIIlIl.flush();
                llIlllllllIIllI.flush();
                byte[] byArray2 = new byte[llllIII[69]];
                byArray2[fl.llllIII[2]] = llllIII[2];
                byArray2[fl.llllIII[3]] = llllIII[38];
                byArray2[fl.llllIII[5]] = llllIII[3];
                byArray2[fl.llllIII[6]] = llllIII[44];
                byArray2[fl.llllIII[8]] = llllIII[2];
                byArray2[fl.llllIII[9]] = llllIII[42];
                byArray2[fl.llllIII[11]] = llllIII[2];
                byArray2[fl.llllIII[12]] = llllIII[13];
                byArray2[fl.llllIII[14]] = llllIII[2];
                byArray2[fl.llllIII[15]] = llllIII[27];
                byArray2[fl.llllIII[17]] = llllIII[2];
                byArray2[fl.llllIII[19]] = llllIII[7];
                byArray2[fl.llllIII[21]] = llllIII[2];
                byArray2[fl.llllIII[22]] = llllIII[10];
                byArray2[fl.llllIII[1]] = llllIII[2];
                byArray2[fl.llllIII[31]] = llllIII[13];
                byArray2[fl.llllIII[24]] = llllIII[3];
                byArray2[fl.llllIII[16]] = llllIII[16];
                byArray2[fl.llllIII[37]] = llllIII[18];
                byArray2[fl.llllIII[55]] = llllIII[20];
                byArray2[fl.llllIII[56]] = llllIII[2];
                byArray2[fl.llllIII[57]] = llllIII[23];
                byArray2[fl.llllIII[58]] = llllIII[2];
                byArray2[fl.llllIII[59]] = llllIII[13];
                byArray2[fl.llllIII[60]] = llllIII[2];
                byArray2[fl.llllIII[61]] = llllIII[23];
                byArray2[fl.llllIII[62]] = llllIII[2];
                byArray2[fl.llllIII[63]] = llllIII[28];
                byArray2[fl.llllIII[51]] = llllIII[2];
                byArray2[fl.llllIII[70]] = llllIII[7];
                byArray2[fl.llllIII[18]] = llllIII[2];
                byArray2[fl.llllIII[71]] = llllIII[32];
                byArray2[fl.llllIII[13]] = llllIII[2];
                byArray2[fl.llllIII[72]] = llllIII[28];
                byArray2[fl.llllIII[73]] = llllIII[2];
                byArray2[fl.llllIII[74]] = llllIII[13];
                byArray2[fl.llllIII[75]] = llllIII[2];
                byArray2[fl.llllIII[76]] = llllIII[27];
                byArray2[fl.llllIII[77]] = llllIII[2];
                byArray2[fl.llllIII[78]] = llllIII[79];
                byArray2[fl.llllIII[80]] = llllIII[2];
                byArray2[fl.llllIII[50]] = llllIII[32];
                byArray2[fl.llllIII[81]] = llllIII[2];
                byArray2[fl.llllIII[82]] = llllIII[46];
                at.a(ec.a(byArray2));
            }
            catch (Exception llIlllllllIIlII) {
                // empty catch block
            }
        }
        Display.getDisplay((MIDlet)bs.d).setCurrent((Displayable)dc.a);
    }

    public static boolean a(cx cx2) {
        if (cx2 != null && d) {
            cx llIlllllllIIIlI;
            if (cx2.v == 0 && a && cx2.b <= e) {
                return llllIII[3];
            }
            if (llIlllllllIIIlI.v == llllIII[3] && b && llIlllllllIIIlI.b <= f) {
                return llllIII[3];
            }
            if (llIlllllllIIIlI.v == llllIII[5] && c && llIlllllllIIIlI.b <= g) {
                return llllIII[3];
            }
        }
        return llllIII[2];
    }

    private static void lIlllIl() {
        llllIII = new int[83];
        fl.llllIII[0] = 1058 + 209 - 114 + 1972 << (0x93 ^ 0x96);
        fl.llllIII[1] = (0x9A ^ 0x9D) << " ".length();
        fl.llllIII[2] = (0xA3 ^ 0xAC) & ~(0x8F ^ 0x80);
        fl.llllIII[3] = " ".length();
        fl.llllIII[4] = 0xC7 ^ 0x84;
        fl.llllIII[5] = " ".length() << " ".length();
        fl.llllIII[6] = "   ".length();
        fl.llllIII[7] = -(0x82 ^ 0xA2);
        fl.llllIII[8] = " ".length() << (" ".length() << " ".length());
        fl.llllIII[9] = 0x56 ^ 0x53;
        fl.llllIII[10] = 1 ^ 0x68;
        fl.llllIII[11] = "   ".length() << " ".length();
        fl.llllIII[12] = 0x26 ^ 0x21;
        fl.llllIII[13] = " ".length() << (0 ^ 5);
        fl.llllIII[14] = " ".length() << "   ".length();
        fl.llllIII[15] = 0xB2 ^ 0xBB;
        fl.llllIII[16] = 0x9F ^ 0x8E;
        fl.llllIII[17] = (0xA6 ^ 0xA3) << " ".length();
        fl.llllIII[18] = (0x72 ^ 0x7D) << " ".length();
        fl.llllIII[19] = 0x3B ^ 0x30;
        fl.llllIII[20] = -(0xC0 ^ 0x89);
        fl.llllIII[21] = "   ".length() << (" ".length() << " ".length());
        fl.llllIII[22] = 0x1F ^ 0x12;
        fl.llllIII[23] = (0x7A ^ 0x67) << (" ".length() << " ".length());
        fl.llllIII[24] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        fl.llllIII[25] = 0xDE ^ 0x95;
        fl.llllIII[26] = -(0x18 ^ 0xB);
        fl.llllIII[27] = 0x25 ^ 0x46;
        fl.llllIII[28] = (0xB8 ^ 0xB5) << "   ".length();
        fl.llllIII[29] = 0x77 ^ 0xE;
        fl.llllIII[30] = -(0x73 ^ 0x65);
        fl.llllIII[31] = 0xA ^ 5;
        fl.llllIII[32] = (0x47 ^ 0x70) << " ".length();
        fl.llllIII[33] = (0x2C ^ 0xD) << " ".length();
        fl.llllIII[34] = -(0xC7 ^ 0x94);
        fl.llllIII[35] = (0x16 ^ 3) << (" ".length() << " ".length());
        fl.llllIII[36] = -(0x95 ^ 0xC4);
        fl.llllIII[37] = (0x68 ^ 0x61) << " ".length();
        fl.llllIII[38] = (0x49 ^ 0x5A) << (" ".length() << " ".length());
        fl.llllIII[39] = 0xEB ^ 0x84;
        fl.llllIII[40] = -(0x7F ^ 0x20);
        fl.llllIII[41] = 0x41 ^ 0x30;
        fl.llllIII[42] = 0x61 ^ 0x14;
        fl.llllIII[43] = -(0x54 ^ 0x4B);
        fl.llllIII[44] = -(0x6D ^ 0x3D);
        fl.llllIII[45] = -(0x26 ^ 5);
        fl.llllIII[46] = 0xF1 ^ 0x96;
        fl.llllIII[47] = 0xB ^ 0x6A;
        fl.llllIII[48] = -(0xF ^ 0x16);
        fl.llllIII[49] = (0xDA ^ 0xC1) << (" ".length() << " ".length());
        fl.llllIII[50] = 0x11 ^ 0x38;
        fl.llllIII[51] = (0x93 ^ 0x94) << (" ".length() << " ".length());
        fl.llllIII[52] = (0x57 ^ 0x5E) << "   ".length();
        fl.llllIII[53] = (0x71 ^ 0x74) << (" ".length() << (" ".length() << " ".length()));
        fl.llllIII[54] = 0xFF ^ 0xAE;
        fl.llllIII[55] = 0x53 ^ 0x40;
        fl.llllIII[56] = (0x13 ^ 0x16) << (" ".length() << " ".length());
        fl.llllIII[57] = 0xA7 ^ 0xB2;
        fl.llllIII[58] = (0x62 ^ 0x69) << " ".length();
        fl.llllIII[59] = 0xB1 ^ 0xA6;
        fl.llllIII[60] = "   ".length() << "   ".length();
        fl.llllIII[61] = 0x81 ^ 0x98;
        fl.llllIII[62] = (0x17 ^ 0x1A) << " ".length();
        fl.llllIII[63] = 0x80 ^ 0x9B;
        fl.llllIII[64] = 0x67 ^ 0x26;
        fl.llllIII[65] = 0xCF ^ 0x9C;
        fl.llllIII[66] = (0xBA ^ 0x81) << " ".length();
        fl.llllIII[67] = 0xD0 ^ 0xB5;
        fl.llllIII[68] = 0xE6 ^ 0xBF;
        fl.llllIII[69] = (0xB5 ^ 0xBE) << (" ".length() << " ".length());
        fl.llllIII[70] = 0x12 ^ 0xF;
        fl.llllIII[71] = 0x54 ^ 0x4B;
        fl.llllIII[72] = 0x18 ^ 0x39;
        fl.llllIII[73] = (0x7A ^ 0x6B) << " ".length();
        fl.llllIII[74] = 0x96 ^ 0xB5;
        fl.llllIII[75] = (0x24 ^ 0x2D) << (" ".length() << " ".length());
        fl.llllIII[76] = 0x2B ^ 0xE;
        fl.llllIII[77] = (0x6E ^ 0x7D) << " ".length();
        fl.llllIII[78] = 0xE1 ^ 0xC6;
        fl.llllIII[79] = -(0x5F ^ 0x53);
        fl.llllIII[80] = (0x6E ^ 0x6B) << "   ".length();
        fl.llllIII[81] = (0x51 ^ 0x44) << " ".length();
        fl.llllIII[82] = 0x54 ^ 0x7F;
    }
}

