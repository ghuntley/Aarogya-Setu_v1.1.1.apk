package l.a.a.a.o.b;

/* compiled from: AdvertisingInfo */
public class b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5058b;

    public b(String str, boolean z) {
        this.a = str;
        this.f5058b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5058b != bVar.f5058b) {
            return false;
        }
        String str = this.a;
        String str2 = bVar.a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f5058b ? 1 : 0);
    }
}
