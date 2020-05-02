package i.c.f;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: ExtensionRegistryLite */
public class i {
    public static final i a = new i(true);

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }

    public i() {
        new HashMap();
    }

    public static i a() {
        Class<?> cls = h.a;
        if (cls != null) {
            try {
                return (i) cls.getMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return a;
    }

    public i(boolean z) {
        Collections.emptyMap();
    }
}
