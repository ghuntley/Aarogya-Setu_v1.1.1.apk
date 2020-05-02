package p;

/* compiled from: ForwardingSource */
public abstract class l implements a0 {
    public final a0 e;

    public l(a0 a0Var) {
        if (a0Var != null) {
            this.e = a0Var;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long b(f fVar, long j2) {
        return this.e.b(fVar, j2);
    }

    public b0 c() {
        return this.e.c();
    }

    public void close() {
        this.e.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.e.toString() + ")";
    }
}
