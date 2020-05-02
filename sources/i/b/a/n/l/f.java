package i.b.a.n.l;

import i.b.a.n.l.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry */
public class f {

    /* renamed from: b  reason: collision with root package name */
    public static final e.a<?> f2506b = new a();
    public final Map<Class<?>, e.a<?>> a = new HashMap();

    /* compiled from: DataRewinderRegistry */
    public class a implements e.a<Object> {
        public e<Object> a(Object obj) {
            return new b(obj);
        }

        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* compiled from: DataRewinderRegistry */
    public static final class b implements e<Object> {
        public final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        public Object a() {
            return this.a;
        }

        public void b() {
        }
    }

    public synchronized <T> e<T> a(T t) {
        e.a<?> aVar;
        g.a.a.b.a.a(t, "Argument must not be null");
        aVar = this.a.get(t.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a<?> next = it.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f2506b;
        }
        return aVar.a(t);
    }

    public synchronized void a(e.a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
