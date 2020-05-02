package n.n;

/* compiled from: Ranges.kt */
public final class c extends a {
    static {
        new c(1, 0);
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.e == cVar.e && this.f5219f == cVar.f5219f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.f5219f;
    }

    public boolean isEmpty() {
        return this.e > this.f5219f;
    }

    public String toString() {
        return this.e + ".." + this.f5219f;
    }
}
