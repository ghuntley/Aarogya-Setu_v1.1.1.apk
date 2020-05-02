package j.a;

/* compiled from: DoubleCheck */
public final class a<T> implements m.a.a<T> {
    public static final Object c = new Object();
    public volatile m.a.a<T> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f5011b = c;

    public a(m.a.a<T> aVar) {
        this.a = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f5011b;
        if (t == c) {
            synchronized (this) {
                t = this.f5011b;
                if (t == c) {
                    t = this.a.get();
                    a(this.f5011b, t);
                    this.f5011b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }

    public static <P extends m.a.a<T>, T> m.a.a<T> a(P p2) {
        if (p2 == null) {
            throw null;
        } else if (p2 instanceof a) {
            return p2;
        } else {
            return new a(p2);
        }
    }
}
