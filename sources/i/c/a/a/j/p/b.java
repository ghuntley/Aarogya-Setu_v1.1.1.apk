package i.c.a.a.j.p;

import i.a.a.a.a;
import i.c.a.a.j.p.g;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class b extends g {
    public final g.a a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2952b;

    public b(g.a aVar, long j2) {
        if (aVar != null) {
            this.a = aVar;
            this.f2952b = j2;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        b bVar = (b) ((g) obj);
        if (!this.a.equals(bVar.a) || this.f2952b != bVar.f2952b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.f2952b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder a2 = a.a("BackendResponse{status=");
        a2.append(this.a);
        a2.append(", nextRequestWaitMillis=");
        a2.append(this.f2952b);
        a2.append("}");
        return a2.toString();
    }
}
