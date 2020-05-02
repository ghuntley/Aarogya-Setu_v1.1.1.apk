package i.c.d.f;

import i.c.d.l.a;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class t<T> implements a<T> {
    public static final Object c = new Object();
    public volatile Object a = c;

    /* renamed from: b  reason: collision with root package name */
    public volatile a<T> f4669b;

    public t(a<T> aVar) {
        this.f4669b = aVar;
    }

    public T get() {
        T t = this.a;
        if (t == c) {
            synchronized (this) {
                t = this.a;
                if (t == c) {
                    t = this.f4669b.get();
                    this.a = t;
                    this.f4669b = null;
                }
            }
        }
        return t;
    }
}
