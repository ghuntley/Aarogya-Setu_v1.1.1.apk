package h.a0.x.q;

/* compiled from: SystemIdInfo */
public class g {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1054b;

    public g(String str, int i2) {
        this.a = str;
        this.f1054b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f1054b != gVar.f1054b) {
            return false;
        }
        return this.a.equals(gVar.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.f1054b;
    }
}
