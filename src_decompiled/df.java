/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

public final class df
extends Hashtable {
    public final synchronized Object a(String string, Object object) {
        return super.put(string, object);
    }

    @Override
    public final synchronized void clear() {
        super.clear();
    }

    @Override
    public final synchronized Object remove(Object object) {
        return super.remove(object);
    }

    public final synchronized Object a(String string) {
        return super.get(string);
    }
}

