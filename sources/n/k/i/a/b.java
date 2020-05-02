package n.k.i.a;

import n.k.c;
import n.k.e;

/* compiled from: ContinuationImpl.kt */
public final class b implements c<Object> {
    public static final b e = new b();

    public void a(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public e c() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
