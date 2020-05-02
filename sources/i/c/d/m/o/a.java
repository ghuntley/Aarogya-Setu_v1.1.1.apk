package i.c.d.m.o;

import i.c.d.m.o.c;
import i.c.d.m.o.d;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public final class a extends d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f4733b;
    public final String c;
    public final String d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4734f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4735g;

    /* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
    public static final class b extends d.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f4736b;
        public String c;
        public String d;
        public Long e;

        /* renamed from: f  reason: collision with root package name */
        public Long f4737f;

        /* renamed from: g  reason: collision with root package name */
        public String f4738g;

        public b() {
        }

        public d.a a(c.a aVar) {
            if (aVar != null) {
                this.f4736b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d.a b(long j2) {
            this.f4737f = Long.valueOf(j2);
            return this;
        }

        public /* synthetic */ b(d dVar, C0132a aVar) {
            a aVar2 = (a) dVar;
            this.a = aVar2.a;
            this.f4736b = aVar2.f4733b;
            this.c = aVar2.c;
            this.d = aVar2.d;
            this.e = Long.valueOf(aVar2.e);
            this.f4737f = Long.valueOf(aVar2.f4734f);
            this.f4738g = aVar2.f4735g;
        }

        public d.a a(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }

        public d a() {
            String str = this.f4736b == null ? " registrationStatus" : "";
            if (this.e == null) {
                str = i.a.a.a.a.b(str, " expiresInSecs");
            }
            if (this.f4737f == null) {
                str = i.a.a.a.a.b(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f4736b, this.c, this.d, this.e.longValue(), this.f4737f.longValue(), this.f4738g, (C0132a) null);
            }
            throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str));
        }
    }

    public /* synthetic */ a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4, C0132a aVar2) {
        this.a = str;
        this.f4733b = aVar;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f4734f = j3;
        this.f4735g = str4;
    }

    public d.a d() {
        return new b(this, (C0132a) null);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(((a) dVar).a) : ((a) dVar).a == null) {
            if (this.f4733b.equals(((a) dVar).f4733b) && ((str = this.c) != null ? str.equals(((a) dVar).c) : ((a) dVar).c == null) && ((str2 = this.d) != null ? str2.equals(((a) dVar).d) : ((a) dVar).d == null)) {
                a aVar = (a) dVar;
                if (this.e == aVar.e && this.f4734f == aVar.f4734f) {
                    String str4 = this.f4735g;
                    if (str4 == null) {
                        if (aVar.f4735g == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.f4735g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f4733b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.e;
        long j3 = this.f4734f;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f4735g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("PersistedInstallationEntry{firebaseInstallationId=");
        a2.append(this.a);
        a2.append(", registrationStatus=");
        a2.append(this.f4733b);
        a2.append(", authToken=");
        a2.append(this.c);
        a2.append(", refreshToken=");
        a2.append(this.d);
        a2.append(", expiresInSecs=");
        a2.append(this.e);
        a2.append(", tokenCreationEpochInSecs=");
        a2.append(this.f4734f);
        a2.append(", fisError=");
        return i.a.a.a.a.a(a2, this.f4735g, "}");
    }
}
