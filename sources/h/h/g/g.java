package h.h.g;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl */
public class g extends f {
    public Typeface b(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1760g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1766m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Method c(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
