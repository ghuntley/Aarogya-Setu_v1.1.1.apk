package f.a;

import i.a.a.a.a;

/* compiled from: JobSupport.kt */
public final class e0 implements l0 {
    public final boolean e;

    public e0(boolean z) {
        this.e = z;
    }

    public boolean a() {
        return this.e;
    }

    public u0 b() {
        return null;
    }

    public String toString() {
        StringBuilder a = a.a("Empty{");
        a.append(this.e ? "Active" : "New");
        a.append('}');
        return a.toString();
    }
}
