package h.o;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider */
public class b0 {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f2051b;

    /* compiled from: ViewModelProvider */
    public static class a extends d {
        public static a c;

        /* renamed from: b  reason: collision with root package name */
        public Application f2052b;

        public a(Application application) {
            this.f2052b = application;
        }

        public <T extends a0> T a(Class<T> cls) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                return (a0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f2052b});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    public interface b {
        <T extends a0> T a(Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    public static abstract class c extends e implements b {
        public <T extends a0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends a0> T a(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    public static class d implements b {
        public static d a;

        public <T extends a0> T a(Class<T> cls) {
            try {
                return (a0) cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    public static class e {
        public void a(a0 a0Var) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0(h.o.d0 r3) {
        /*
            r2 = this;
            h.o.c0 r0 = r3.h()
            boolean r1 = r3 instanceof h.o.g
            if (r1 == 0) goto L_0x000f
            h.o.g r3 = (h.o.g) r3
            h.o.b0$b r3 = r3.j()
            goto L_0x001c
        L_0x000f:
            h.o.b0$d r3 = h.o.b0.d.a
            if (r3 != 0) goto L_0x001a
            h.o.b0$d r3 = new h.o.b0$d
            r3.<init>()
            h.o.b0.d.a = r3
        L_0x001a:
            h.o.b0$d r3 = h.o.b0.d.a
        L_0x001c:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.b0.<init>(h.o.d0):void");
    }

    public <T extends a0> T a(Class<T> cls) {
        T t;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String b2 = i.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            T t2 = (a0) this.f2051b.a.get(b2);
            if (cls.isInstance(t2)) {
                b bVar = this.a;
                if (bVar instanceof e) {
                    ((e) bVar).a(t2);
                }
            } else {
                b bVar2 = this.a;
                if (bVar2 instanceof c) {
                    t = ((c) bVar2).a(b2, cls);
                } else {
                    t = bVar2.a(cls);
                }
                t2 = t;
                a0 put = this.f2051b.a.put(b2, t2);
                if (put != null) {
                    put.b();
                }
            }
            return t2;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public b0(c0 c0Var, b bVar) {
        this.a = bVar;
        this.f2051b = c0Var;
    }
}
