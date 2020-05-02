package f.a.a;

import n.m.c.f;

/* compiled from: SystemProps.kt */
public final /* synthetic */ class o {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final String a(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            f.a("propertyName");
            throw null;
        }
    }
}
