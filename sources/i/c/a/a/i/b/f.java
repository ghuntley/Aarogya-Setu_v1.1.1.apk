package i.c.a.a.i.b;

import i.a.a.a.a;
import i.c.a.a.i.b.m;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class f extends m {
    public final m.a a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2889b;

    public /* synthetic */ f(m.a aVar, a aVar2) {
        this.a = aVar;
        this.f2889b = aVar2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m.a aVar = this.a;
        if (aVar != null ? aVar.equals(((f) obj).a) : ((f) obj).a == null) {
            a aVar2 = this.f2889b;
            if (aVar2 == null) {
                if (((f) obj).f2889b == null) {
                    return true;
                }
            } else if (aVar2.equals(((f) obj).f2889b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        m.a aVar = this.a;
        int i2 = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f2889b;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("ClientInfo{clientType=");
        a2.append(this.a);
        a2.append(", androidClientInfo=");
        a2.append(this.f2889b);
        a2.append("}");
        return a2.toString();
    }
}
