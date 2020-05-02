package h.b.k;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import h.b.p.d;
import h.b.p.f;
import h.b.p.g;
import h.b.p.r;
import h.b.p.z;
import h.e.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater */
public class s {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f1154b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    public static final h<String, Constructor<? extends View>> e = new h<>();
    public final Object[] a = new Object[2];

    /* compiled from: AppCompatViewInflater */
    public static class a implements View.OnClickListener {
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public final String f1155f;

        /* renamed from: g  reason: collision with root package name */
        public Method f1156g;

        /* renamed from: h  reason: collision with root package name */
        public Context f1157h;

        public a(View view, String str) {
            this.e = view;
            this.f1155f = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f1156g == null) {
                for (Context context = this.e.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1155f, new Class[]{View.class})) != null) {
                            this.f1156g = method;
                            this.f1157h = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.e.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder a = i.a.a.a.a.a(" with id '");
                    a.append(this.e.getContext().getResources().getResourceEntryName(id));
                    a.append("'");
                    str = a.toString();
                }
                StringBuilder a2 = i.a.a.a.a.a("Could not find method ");
                a2.append(this.f1155f);
                a2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a2.append(this.e.getClass());
                a2.append(str);
                throw new IllegalStateException(a2.toString());
            }
            try {
                this.f1156g.invoke(this.f1157h, new Object[]{view});
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public d a(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public r d(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet, h.b.a.radioButtonStyle);
    }

    public z e(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    public final void a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    public final View a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> orDefault = e.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1154b);
            e.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.a);
    }
}
