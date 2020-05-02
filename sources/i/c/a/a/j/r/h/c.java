package i.c.a.a.j.r.h;

import i.c.a.a.j.r.h.f;
import java.util.Set;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class c extends f.a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2971b;
    public final Set<f.b> c;

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static final class b extends f.a.C0105a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public Long f2972b;
        public Set<f.b> c;

        public f.a.C0105a a(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public f.a.C0105a b(long j2) {
            this.f2972b = Long.valueOf(j2);
            return this;
        }

        public f.a a() {
            String str = this.a == null ? " delta" : "";
            if (this.f2972b == null) {
                str = i.a.a.a.a.b(str, " maxAllowedDelay");
            }
            if (this.c == null) {
                str = i.a.a.a.a.b(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.a.longValue(), this.f2972b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str));
        }
    }

    public /* synthetic */ c(long j2, long j3, Set set, a aVar) {
        this.a = j2;
        this.f2971b = j3;
        this.c = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.a)) {
            return false;
        }
        c cVar = (c) ((f.a) obj);
        if (this.a == cVar.a && this.f2971b == cVar.f2971b && this.c.equals(cVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f2971b;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("ConfigValue{delta=");
        a2.append(this.a);
        a2.append(", maxAllowedDelay=");
        a2.append(this.f2971b);
        a2.append(", flags=");
        a2.append(this.c);
        a2.append("}");
        return a2.toString();
    }
}
