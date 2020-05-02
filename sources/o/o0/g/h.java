package o.o0.g;

import java.util.LinkedHashSet;
import java.util.Set;
import o.m0;

/* compiled from: RouteDatabase */
public final class h {
    public final Set<m0> a = new LinkedHashSet();

    public synchronized void a(m0 m0Var) {
        this.a.remove(m0Var);
    }

    public synchronized void b(m0 m0Var) {
        this.a.add(m0Var);
    }

    public synchronized boolean c(m0 m0Var) {
        return this.a.contains(m0Var);
    }
}
