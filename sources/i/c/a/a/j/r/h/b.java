package i.c.a.a.j.r.h;

import i.c.a.a.d;
import i.c.a.a.j.r.h.f;
import i.c.a.a.j.t.a;
import java.util.Map;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class b extends f {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, f.a> f2970b;

    public b(a aVar, Map<d, f.a> map) {
        if (aVar != null) {
            this.a = aVar;
            if (map != null) {
                this.f2970b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        b bVar = (b) ((f) obj);
        if (!this.a.equals(bVar.a) || !this.f2970b.equals(bVar.f2970b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f2970b.hashCode();
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("SchedulerConfig{clock=");
        a2.append(this.a);
        a2.append(", values=");
        a2.append(this.f2970b);
        a2.append("}");
        return a2.toString();
    }
}
