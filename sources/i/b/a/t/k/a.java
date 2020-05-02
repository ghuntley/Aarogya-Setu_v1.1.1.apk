package i.b.a.t.k;

import android.util.Log;
import i.b.a.t.k.d;
import java.util.List;

/* compiled from: FactoryPools */
public final class a {
    public static final e<Object> a = new C0101a();

    /* renamed from: i.b.a.t.k.a$a  reason: collision with other inner class name */
    /* compiled from: FactoryPools */
    public class C0101a implements e<Object> {
        public void a(Object obj) {
        }
    }

    /* compiled from: FactoryPools */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools */
    public interface d {
        d g();
    }

    /* compiled from: FactoryPools */
    public interface e<T> {
        void a(T t);
    }

    public static <T extends d> h.h.l.c<T> a(int i2, b<T> bVar) {
        return new c(new h.h.l.e(i2), bVar, a);
    }

    public static <T> h.h.l.c<List<T>> a() {
        return new c(new h.h.l.e(20), new b(), new c());
    }

    /* compiled from: FactoryPools */
    public static final class c<T> implements h.h.l.c<T> {
        public final b<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f2871b;
        public final h.h.l.c<T> c;

        public c(h.h.l.c<T> cVar, b<T> bVar, e<T> eVar) {
            this.c = cVar;
            this.a = bVar;
            this.f2871b = eVar;
        }

        public T a() {
            T a2 = this.c.a();
            if (a2 == null) {
                a2 = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder a3 = i.a.a.a.a.a("Created new ");
                    a3.append(a2.getClass());
                    Log.v("FactoryPools", a3.toString());
                }
            }
            if (a2 instanceof d) {
                ((d.b) ((d) a2).g()).a = false;
            }
            return a2;
        }

        public boolean a(T t) {
            if (t instanceof d) {
                ((d.b) ((d) t).g()).a = true;
            }
            this.f2871b.a(t);
            return this.c.a(t);
        }
    }
}
