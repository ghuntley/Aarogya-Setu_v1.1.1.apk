package i.c.a.a.j.r.i;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final long f2992b;
    public final int c;
    public final int d;
    public final long e;

    public /* synthetic */ a(long j2, int i2, int i3, long j3, C0106a aVar) {
        this.f2992b = j2;
        this.c = i2;
        this.d = i3;
        this.e = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        if (this.f2992b == aVar.f2992b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f2992b;
        long j3 = this.e;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public String toString() {
        StringBuilder a = i.a.a.a.a.a("EventStoreConfig{maxStorageSizeInBytes=");
        a.append(this.f2992b);
        a.append(", loadBatchSize=");
        a.append(this.c);
        a.append(", criticalSectionEnterTimeoutMs=");
        a.append(this.d);
        a.append(", eventCleanUpAge=");
        a.append(this.e);
        a.append("}");
        return a.toString();
    }
}
