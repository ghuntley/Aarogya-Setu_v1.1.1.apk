package i.c.f;

/* compiled from: ExtensionRegistryFactory */
public final class h {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
