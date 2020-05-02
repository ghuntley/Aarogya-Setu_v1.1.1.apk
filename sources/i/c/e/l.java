package i.c.e;

import i.c.e.t.r;

/* compiled from: JsonObject */
public final class l extends j {
    public final r<String, j> a = new r<>();

    public j a(String str) {
        r.e<String, j> a2 = this.a.a((Object) str);
        return (j) (a2 != null ? a2.f4887k : null);
    }

    public boolean b(String str) {
        return this.a.a((Object) str) != null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
