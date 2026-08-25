/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class aj {
    public /* synthetic */ byte a;
    private /* synthetic */ ByteArrayOutputStream b;
    private /* synthetic */ DataOutputStream c;
    private /* synthetic */ ByteArrayInputStream d;
    private /* synthetic */ DataInputStream e;

    public aj() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public aj(byte by2) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.a = by2;
        this.b = new ByteArrayOutputStream();
        this.c = new DataOutputStream(this.b);
    }

    public aj(byte by2, byte[] byArray) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.a = by2;
        this.d = new ByteArrayInputStream(byArray);
        this.e = new DataInputStream(this.d);
        at.a(by2, byArray);
    }

    public final byte[] a() {
        return this.b.toByteArray();
    }

    public final DataInputStream b() {
        return this.e;
    }

    public final DataOutputStream c() {
        return this.c;
    }

    public final void d() {
        try {
            aj llIllllIIllllll;
            if (llIllllIIllllll.e != null) {
                llIllllIIllllll.e.close();
            }
            if (llIllllIIllllll.c != null) {
                llIllllIIllllll.c.close();
                return;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

