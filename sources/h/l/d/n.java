package h.l.d;

import androidx.fragment.app.Fragment;
import h.e.h;
import i.a.a.a.a;

/* compiled from: FragmentFactory */
public class n {
    public static final h<String, Class<?>> a = new h<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str) {
        Class<?> orDefault = a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        a.put(str, cls);
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.InstantiationException(a.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException(a.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
