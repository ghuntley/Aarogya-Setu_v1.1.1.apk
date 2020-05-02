package n.l.c;

import n.m.c.f;

/* compiled from: JDK7PlatformImplementations.kt */
public class a extends n.l.a {
    public void a(Throwable th, Throwable th2) {
        if (th == null) {
            f.a("cause");
            throw null;
        } else if (th2 != null) {
            th.addSuppressed(th2);
        } else {
            f.a("exception");
            throw null;
        }
    }
}
