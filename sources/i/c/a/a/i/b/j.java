package i.c.a.a.i.b;

import i.a.a.a.a;
import i.c.a.a.i.b.t;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class j extends t {
    public final t.b a;

    /* renamed from: b  reason: collision with root package name */
    public final t.a f2899b;

    public /* synthetic */ j(t.b bVar, t.a aVar) {
        this.a = bVar;
        this.f2899b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t.b bVar = this.a;
        if (bVar != null ? bVar.equals(((j) obj).a) : ((j) obj).a == null) {
            t.a aVar = this.f2899b;
            if (aVar == null) {
                if (((j) obj).f2899b == null) {
                    return true;
                }
            } else if (aVar.equals(((j) obj).f2899b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        t.b bVar = this.a;
        int i2 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        t.a aVar = this.f2899b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("NetworkConnectionInfo{networkType=");
        a2.append(this.a);
        a2.append(", mobileSubtype=");
        a2.append(this.f2899b);
        a2.append("}");
        return a2.toString();
    }
}
