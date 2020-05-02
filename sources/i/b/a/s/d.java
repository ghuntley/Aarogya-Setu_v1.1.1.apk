package i.b.a.s;

import g.a.a.b.a;
import i.b.a.n.e;
import java.security.MessageDigest;

/* compiled from: ObjectKey */
public final class d implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f2860b;

    public d(Object obj) {
        a.a(obj, "Argument must not be null");
        this.f2860b = obj;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f2860b.toString().getBytes(e.a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f2860b.equals(((d) obj).f2860b);
        }
        return false;
    }

    public int hashCode() {
        return this.f2860b.hashCode();
    }

    public String toString() {
        StringBuilder a = i.a.a.a.a.a("ObjectKey{object=");
        a.append(this.f2860b);
        a.append('}');
        return a.toString();
    }
}
