package n;

import java.io.Serializable;
import n.m.c.f;

/* compiled from: Tuples.kt */
public final class d<A, B> implements Serializable {
    public final A e;

    /* renamed from: f  reason: collision with root package name */
    public final B f5204f;

    public d(A a, B b2) {
        this.e = a;
        this.f5204f = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.a((Object) this.e, (Object) dVar.e) && f.a((Object) this.f5204f, (Object) dVar.f5204f);
    }

    public int hashCode() {
        A a = this.e;
        int i2 = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b2 = this.f5204f;
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + this.e + ", " + this.f5204f + ')';
    }
}
