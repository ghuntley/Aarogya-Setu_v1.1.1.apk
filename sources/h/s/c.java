package h.s;

import h.v.a.f.f;

/* compiled from: EntityInsertionAdapter */
public abstract class c<T> extends l {
    public c(h hVar) {
        super(hVar);
    }

    public abstract void a(f fVar, T t);

    public final void a(T t) {
        f a = a();
        try {
            a(a, t);
            a.a();
            if (a == this.c) {
                this.a.set(false);
            }
        } catch (Throwable th) {
            a(a);
            throw th;
        }
    }
}
