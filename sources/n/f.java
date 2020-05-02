package n;

import java.io.Serializable;
import n.m.b.a;

/* compiled from: LazyJVM.kt */
public final class f<T> implements b<T>, Serializable {
    public a<? extends T> e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f5205f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f5206g;

    public /* synthetic */ f(a aVar, Object obj, int i2) {
        obj = (i2 & 2) != 0 ? null : obj;
        if (aVar != null) {
            this.e = aVar;
            this.f5205f = g.a;
            this.f5206g = obj == null ? this : obj;
            return;
        }
        n.m.c.f.a("initializer");
        throw null;
    }

    public T getValue() {
        T t;
        T t2 = this.f5205f;
        if (t2 != g.a) {
            return t2;
        }
        synchronized (this.f5206g) {
            t = this.f5205f;
            if (t == g.a) {
                a aVar = this.e;
                if (aVar != null) {
                    t = aVar.invoke();
                    this.f5205f = t;
                    this.e = null;
                } else {
                    n.m.c.f.a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return this.f5205f != g.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
