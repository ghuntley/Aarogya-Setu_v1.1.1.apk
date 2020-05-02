package f.a;

import n.k.e;
import n.m.c.f;

/* compiled from: Unconfined.kt */
public final class a1 extends s {
    public static final a1 e = new a1();

    public void a(e eVar, Runnable runnable) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (runnable != null) {
            throw new UnsupportedOperationException();
        } else {
            f.a("block");
            throw null;
        }
    }

    public boolean b(e eVar) {
        if (eVar != null) {
            return false;
        }
        f.a("context");
        throw null;
    }

    public String toString() {
        return "Unconfined";
    }
}
