package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import n.h;
import o.i0;
import o.l0;
import q.j;
import q.k0.u;

/* compiled from: BuiltInConverters */
public final class c extends j.a {
    public boolean a = true;

    /* compiled from: BuiltInConverters */
    public static final class a implements j<l0, l0> {
        public static final a a = new a();

        public Object a(Object obj) {
            l0 l0Var = (l0) obj;
            try {
                return i0.a(l0Var);
            } finally {
                l0Var.close();
            }
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class b implements j<i0, i0> {
        public static final b a = new b();

        public Object a(Object obj) {
            return (i0) obj;
        }
    }

    /* renamed from: q.c$c  reason: collision with other inner class name */
    /* compiled from: BuiltInConverters */
    public static final class C0158c implements j<l0, l0> {
        public static final C0158c a = new C0158c();

        public Object a(Object obj) {
            return (l0) obj;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class d implements j<Object, String> {
        public static final d a = new d();

        public Object a(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class e implements j<l0, h> {
        public static final e a = new e();

        public Object a(Object obj) {
            ((l0) obj).close();
            return h.a;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class f implements j<l0, Void> {
        public static final f a = new f();

        public Object a(Object obj) {
            ((l0) obj).close();
            return null;
        }
    }

    @Nullable
    public j<l0, ?> a(Type type, Annotation[] annotationArr, e0 e0Var) {
        if (type == l0.class) {
            if (i0.a(annotationArr, (Class<? extends Annotation>) u.class)) {
                return C0158c.a;
            }
            return a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (!this.a || type != h.class) {
                return null;
            }
            try {
                return e.a;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
                return null;
            }
        }
    }

    @Nullable
    public j<?, i0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, e0 e0Var) {
        if (i0.class.isAssignableFrom(i0.b(type))) {
            return b.a;
        }
        return null;
    }
}
