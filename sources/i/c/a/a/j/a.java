package i.c.a.a.j;

import i.c.a.a.j.f;
import java.util.Map;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class a extends f {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f2929b;
    public final e c;
    public final long d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f2930f;

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static final class b extends f.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f2931b;
        public e c;
        public Long d;
        public Long e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f2932f;

        public f.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public f.a b(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }

        public Map<String, String> b() {
            Map<String, String> map = this.f2932f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public f.a a(e eVar) {
            if (eVar != null) {
                this.c = eVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public f.a a(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        public f a() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = i.a.a.a.a.b(str, " encodedPayload");
            }
            if (this.d == null) {
                str = i.a.a.a.a.b(str, " eventMillis");
            }
            if (this.e == null) {
                str = i.a.a.a.a.b(str, " uptimeMillis");
            }
            if (this.f2932f == null) {
                str = i.a.a.a.a.b(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f2931b, this.c, this.d.longValue(), this.e.longValue(), this.f2932f, (C0102a) null);
            }
            throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str));
        }
    }

    public /* synthetic */ a(String str, Integer num, e eVar, long j2, long j3, Map map, C0102a aVar) {
        this.a = str;
        this.f2929b = num;
        this.c = eVar;
        this.d = j2;
        this.e = j3;
        this.f2930f = map;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(((a) fVar).a) && ((num = this.f2929b) != null ? num.equals(((a) fVar).f2929b) : ((a) fVar).f2929b == null)) {
            a aVar = (a) fVar;
            if (!this.c.equals(aVar.c) || this.d != aVar.d || this.e != aVar.e || !this.f2930f.equals(aVar.f2930f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f2929b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.d;
        long j3 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f2930f.hashCode();
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("EventInternal{transportName=");
        a2.append(this.a);
        a2.append(", code=");
        a2.append(this.f2929b);
        a2.append(", encodedPayload=");
        a2.append(this.c);
        a2.append(", eventMillis=");
        a2.append(this.d);
        a2.append(", uptimeMillis=");
        a2.append(this.e);
        a2.append(", autoMetadata=");
        a2.append(this.f2930f);
        a2.append("}");
        return a2.toString();
    }
}
