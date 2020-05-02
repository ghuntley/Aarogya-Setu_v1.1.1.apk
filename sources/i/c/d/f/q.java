package i.c.d.f;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class q {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4666b;
    public final int c;

    public q(Class<?> cls, int i2, int i3) {
        i.c.a.b.d.l.q.a(cls, "Null dependency anInterface.");
        this.a = cls;
        this.f4666b = i2;
        this.c = i3;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q b(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.a && this.f4666b == qVar.f4666b && this.c == qVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4666b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i2 = this.f4666b;
        boolean z = true;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public boolean a() {
        return this.f4666b == 2;
    }
}
