package i.b.a.q;

import i.b.a.n.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry */
public class a {
    public final List<C0097a<?>> a = new ArrayList();

    /* renamed from: i.b.a.q.a$a  reason: collision with other inner class name */
    /* compiled from: EncoderRegistry */
    public static final class C0097a<T> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final d<T> f2814b;

        public C0097a(Class<T> cls, d<T> dVar) {
            this.a = cls;
            this.f2814b = dVar;
        }
    }

    public synchronized <T> d<T> a(Class<T> cls) {
        for (C0097a next : this.a) {
            if (next.a.isAssignableFrom(cls)) {
                return next.f2814b;
            }
        }
        return null;
    }

    public synchronized <T> void a(Class<T> cls, d<T> dVar) {
        this.a.add(new C0097a(cls, dVar));
    }
}
