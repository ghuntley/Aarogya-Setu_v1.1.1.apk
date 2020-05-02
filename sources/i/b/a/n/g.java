package i.b.a.n;

import h.e.a;
import i.b.a.n.f;
import i.b.a.t.b;
import java.security.MessageDigest;

/* compiled from: Options */
public final class g implements e {

    /* renamed from: b  reason: collision with root package name */
    public final a<f<?>, Object> f2498b = new b();

    public void a(g gVar) {
        this.f2498b.a(gVar.f2498b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2498b.equals(((g) obj).f2498b);
        }
        return false;
    }

    public int hashCode() {
        return this.f2498b.hashCode();
    }

    public String toString() {
        StringBuilder a = i.a.a.a.a.a("Options{values=");
        a.append(this.f2498b);
        a.append('}');
        return a.toString();
    }

    public <T> T a(f<T> fVar) {
        if (this.f2498b.a((Object) fVar) >= 0) {
            return this.f2498b.getOrDefault(fVar, null);
        }
        return fVar.a;
    }

    public void a(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            a<f<?>, Object> aVar = this.f2498b;
            if (i2 < aVar.f1570g) {
                f c = aVar.c(i2);
                Object e = this.f2498b.e(i2);
                f.b<T> bVar = c.f2497b;
                if (c.d == null) {
                    c.d = c.c.getBytes(e.a);
                }
                bVar.a(c.d, e, messageDigest);
                i2++;
            } else {
                return;
            }
        }
    }
}
