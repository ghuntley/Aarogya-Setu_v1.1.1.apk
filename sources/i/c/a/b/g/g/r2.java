package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class r2 {
    public static final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3418b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f3418b = cls2 != null;
    }

    public static boolean a() {
        return a != null && !f3418b;
    }
}
