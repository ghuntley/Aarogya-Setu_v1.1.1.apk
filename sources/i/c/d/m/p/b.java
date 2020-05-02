package i.c.d.m.p;

import i.c.d.m.p.e;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public final class b extends e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4747b;
    public final e.b c;

    /* renamed from: i.c.d.m.p.b$b  reason: collision with other inner class name */
    /* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
    public static final class C0134b extends e.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public Long f4748b;
        public e.b c;

        public e.a a(long j2) {
            this.f4748b = Long.valueOf(j2);
            return this;
        }

        public e a() {
            String str = this.f4748b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.a, this.f4748b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str));
        }
    }

    public /* synthetic */ b(String str, long j2, e.b bVar, a aVar) {
        this.a = str;
        this.f4747b = j2;
        this.c = bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.a;
        if (str != null ? str.equals(((b) eVar).a) : ((b) eVar).a == null) {
            if (this.f4747b == ((b) eVar).f4747b) {
                e.b bVar = this.c;
                if (bVar == null) {
                    if (((b) eVar).c == null) {
                        return true;
                    }
                } else if (bVar.equals(((b) eVar).c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f4747b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        e.b bVar = this.c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("TokenResult{token=");
        a2.append(this.a);
        a2.append(", tokenExpirationTimestamp=");
        a2.append(this.f4747b);
        a2.append(", responseCode=");
        a2.append(this.c);
        a2.append("}");
        return a2.toString();
    }
}
