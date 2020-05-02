package i.c.d.p;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public final class a extends f {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4769b;

    public a(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.f4769b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        a aVar = (a) ((f) obj);
        if (!this.a.equals(aVar.a) || !this.f4769b.equals(aVar.f4769b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4769b.hashCode();
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("LibraryVersion{libraryName=");
        a2.append(this.a);
        a2.append(", version=");
        return i.a.a.a.a.a(a2, this.f4769b, "}");
    }
}
