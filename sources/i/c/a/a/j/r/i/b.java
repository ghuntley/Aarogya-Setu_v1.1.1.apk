package i.c.a.a.j.r.i;

import i.a.a.a.a;
import i.c.a.a.j.f;
import i.c.a.a.j.h;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class b extends g {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2993b;
    public final f c;

    public b(long j2, h hVar, f fVar) {
        this.a = j2;
        if (hVar != null) {
            this.f2993b = hVar;
            if (fVar != null) {
                this.c = fVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        b bVar = (b) ((g) obj);
        if (this.a != bVar.a || !this.f2993b.equals(bVar.f2993b) || !this.c.equals(bVar.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.a;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f2993b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder a2 = a.a("PersistedEvent{id=");
        a2.append(this.a);
        a2.append(", transportContext=");
        a2.append(this.f2993b);
        a2.append(", event=");
        a2.append(this.c);
        a2.append("}");
        return a2.toString();
    }
}
