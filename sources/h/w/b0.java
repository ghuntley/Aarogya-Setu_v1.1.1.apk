package h.w;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase */
public class b0 {
    public static Method a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2263b;
    public static Field c;
    public static boolean d;

    public void a(View view) {
        throw null;
    }

    public void a(View view, float f2) {
        throw null;
    }

    public void a(View view, int i2) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void a(View view, Matrix matrix) {
        throw null;
    }

    public float b(View view) {
        throw null;
    }

    public void b(View view, Matrix matrix) {
        throw null;
    }

    public void c(View view) {
        throw null;
    }

    public void a(View view, int i2, int i3, int i4, int i5) {
        if (!f2263b) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f2263b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
