package h.h.f.b;

import android.content.res.Resources;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ResourcesCompat */
public class h {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static Method f1754b;
    public static boolean c;

    public static void a(Resources.Theme theme) {
        synchronized (a) {
            if (!c) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    f1754b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                }
                c = true;
            }
            if (f1754b != null) {
                try {
                    f1754b.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                    f1754b = null;
                }
            }
        }
    }
}
