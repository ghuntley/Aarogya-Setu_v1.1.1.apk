package i.b.a.n.m;

import i.a.a.a.a;
import java.security.MessageDigest;

/* compiled from: DataCacheKey */
public final class e implements i.b.a.n.e {

    /* renamed from: b  reason: collision with root package name */
    public final i.b.a.n.e f2575b;
    public final i.b.a.n.e c;

    public e(i.b.a.n.e eVar, i.b.a.n.e eVar2) {
        this.f2575b = eVar;
        this.c = eVar2;
    }

    public void a(MessageDigest messageDigest) {
        this.f2575b.a(messageDigest);
        this.c.a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f2575b.equals(eVar.f2575b) || !this.c.equals(eVar.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.c.hashCode() + (this.f2575b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a = a.a("DataCacheKey{sourceKey=");
        a.append(this.f2575b);
        a.append(", signature=");
        a.append(this.c);
        a.append('}');
        return a.toString();
    }
}
