package h.w;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import h.h.m.m;

/* compiled from: ViewUtils */
public class v {
    public static final b0 a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f2293b = new a(Float.class, "translationAlpha");

    /* compiled from: ViewUtils */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(v.b((View) obj));
        }

        public void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            v.a.a((View) obj, floatValue);
        }
    }

    /* compiled from: ViewUtils */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return m.e((View) obj);
        }

        public void set(Object obj, Object obj2) {
            m.a((View) obj, (Rect) obj2);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new a0();
        } else if (i2 >= 23) {
            a = new z();
        } else if (i2 >= 22) {
            a = new y();
        } else {
            a = new x();
        }
        new b(Rect.class, "clipBounds");
    }

    public static u a(View view) {
        return new t(view);
    }

    public static float b(View view) {
        return a.b(view);
    }

    public static f0 c(View view) {
        return new e0(view);
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        a.a(view, i2, i3, i4, i5);
    }
}
