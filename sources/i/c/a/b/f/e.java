package i.c.a.b.f;

import dalvik.system.PathClassLoader;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class e extends PathClassLoader {
    public e(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
