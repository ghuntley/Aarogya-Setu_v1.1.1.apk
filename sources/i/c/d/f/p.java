package i.c.d.f;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class p {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4665b;

    public /* synthetic */ p(Class cls, boolean z, n nVar) {
        this.a = cls;
        this.f4665b = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!pVar.a.equals(this.a) || pVar.f4665b != this.f4665b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f4665b).hashCode();
    }
}
