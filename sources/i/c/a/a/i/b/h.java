package i.c.a.a.i.b;

import i.a.a.a.a;
import java.util.List;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class h extends q {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2896b;
    public final m c;
    public final int d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final List<o> f2897f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2898g;

    public /* synthetic */ h(long j2, long j3, m mVar, int i2, String str, List list, b bVar) {
        this.a = j2;
        this.f2896b = j3;
        this.c = mVar;
        this.d = i2;
        this.e = str;
        this.f2897f = list;
        this.f2898g = bVar;
    }

    public boolean equals(Object obj) {
        m mVar;
        String str;
        List<o> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        h hVar = (h) ((q) obj);
        if (this.a == hVar.a && this.f2896b == hVar.f2896b && ((mVar = this.c) != null ? mVar.equals(hVar.c) : hVar.c == null) && this.d == hVar.d && ((str = this.e) != null ? str.equals(hVar.e) : hVar.e == null) && ((list = this.f2897f) != null ? list.equals(hVar.f2897f) : hVar.f2897f == null)) {
            b bVar = this.f2898g;
            if (bVar == null) {
                if (hVar.f2898g == null) {
                    return true;
                }
            } else if (bVar.equals(hVar.f2898g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f2896b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        m mVar = this.c;
        int i3 = 0;
        int hashCode = (((i2 ^ (mVar == null ? 0 : mVar.hashCode())) * 1000003) ^ this.d) * 1000003;
        String str = this.e;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<o> list = this.f2897f;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        b bVar = this.f2898g;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return hashCode3 ^ i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("LogRequest{requestTimeMs=");
        a2.append(this.a);
        a2.append(", requestUptimeMs=");
        a2.append(this.f2896b);
        a2.append(", clientInfo=");
        a2.append(this.c);
        a2.append(", logSource=");
        a2.append(this.d);
        a2.append(", logSourceName=");
        a2.append(this.e);
        a2.append(", logEvents=");
        a2.append(this.f2897f);
        a2.append(", qosTier=");
        a2.append(this.f2898g);
        a2.append("}");
        return a2.toString();
    }
}
