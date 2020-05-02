package l.a.a.a.o.a;

import android.content.Context;

/* compiled from: AbstractValueCache */
public abstract class a<T> {
    public final a<T> a;

    public a(a<T> aVar) {
        this.a = aVar;
    }

    public final synchronized T a(Context context, c<T> cVar) {
        T t;
        t = ((b) this).f5057b;
        if (t == null) {
            t = this.a != null ? this.a.a(context, cVar) : cVar.load(context);
            if (t != null) {
                ((b) this).f5057b = t;
            } else {
                throw null;
            }
        }
        return t;
    }
}
