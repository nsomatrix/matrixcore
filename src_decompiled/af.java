/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;

final class af
implements CommandListener {
    private /* synthetic */ ex a;
    private final /* synthetic */ TextBox b;
    private static final /* synthetic */ int[] llIlll;

    af(ex ex2, TextBox textBox) {
        this.a = ex2;
        this.b = textBox;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command.getLabel().equals(fa.ax)) {
            this.a.a(this.b.getString());
        }
        Display.getDisplay((MIDlet)ex.j).setCurrent((Displayable)ex.i);
        ex.i.setFullScreenMode(llIlll[0]);
        this.a.k = llIlll[0];
    }

    static {
        af.lIlIII();
    }

    private static void lIlIII() {
        llIlll = new int[1];
        af.llIlll[0] = " ".length();
    }
}

