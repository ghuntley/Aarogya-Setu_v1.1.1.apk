package n.m.c;

import i.c.d.p.e;
import n.o.b;

/* compiled from: ClassReference.kt */
public final class c implements b<Object>, b {
    public final Class<?> a;

    public c(Class<?> cls) {
        if (cls != null) {
            this.a = cls;
        } else {
            f.a("jClass");
            throw null;
        }
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && f.a((Object) e.a(this), (Object) e.a((b) obj));
    }

    public int hashCode() {
        return e.a(this).hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
