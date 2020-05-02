package i.b.a.q;

import i.b.a.n.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry */
public class f {
    public final List<a<?>> a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry */
    public static final class a<T> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final j<T> f2819b;

        public a(Class<T> cls, j<T> jVar) {
            this.a = cls;
            this.f2819b = jVar;
        }
    }

    public synchronized <Z> void a(Class<Z> cls, j<Z> jVar) {
        this.a.add(new a(cls, jVar));
    }

    public synchronized <Z> j<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.a.get(i2);
            if (aVar.a.isAssignableFrom(cls)) {
                return aVar.f2819b;
            }
        }
        return null;
    }
}
