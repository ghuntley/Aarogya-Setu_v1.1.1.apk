package i.c.d.m;

/* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
public final class a extends k {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4722b;
    public final long c;

    public /* synthetic */ a(String str, long j2, long j3, C0131a aVar) {
        this.a = str;
        this.f4722b = j2;
        this.c = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        a aVar = (a) ((k) obj);
        if (this.a.equals(aVar.a) && this.f4722b == aVar.f4722b && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f4722b;
        long j3 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("InstallationTokenResult{token=");
        a2.append(this.a);
        a2.append(", tokenExpirationTimestamp=");
        a2.append(this.f4722b);
        a2.append(", tokenCreationTimestamp=");
        a2.append(this.c);
        a2.append("}");
        return a2.toString();
    }
}
