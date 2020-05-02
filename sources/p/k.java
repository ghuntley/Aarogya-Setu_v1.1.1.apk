package p;

/* compiled from: ForwardingSink */
public abstract class k implements z {
    public final z e;

    public k(z zVar) {
        if (zVar != null) {
            this.e = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public b0 c() {
        return this.e.c();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.e.toString() + ")";
    }
}
