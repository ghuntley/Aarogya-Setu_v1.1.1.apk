package h.a0.x.q;

/* compiled from: Preference */
public class d {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public Long f1052b;

    public d(String str, long j2) {
        this.a = str;
        this.f1052b = Long.valueOf(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.a)) {
            return false;
        }
        Long l2 = this.f1052b;
        Long l3 = dVar.f1052b;
        if (l2 != null) {
            return l2.equals(l3);
        }
        if (l3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l2 = this.f1052b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public d(String str, boolean z) {
        long j2 = z ? 1 : 0;
        this.a = str;
        this.f1052b = Long.valueOf(j2);
    }
}
