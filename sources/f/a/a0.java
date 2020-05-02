package f.a;

import f.a.a.b;
import f.a.a.m;
import f.a.a.n;
import i.a.a.a.a;
import n.k.c;
import n.k.e;
import n.m.c.f;

/* compiled from: Dispatched.kt */
public final class a0 {
    public static final n a = new n("UNDEFINED");

    public static final <T> void a(c<? super T> cVar, T t) {
        boolean z;
        e c;
        Object b2;
        if (cVar == null) {
            f.a("$this$resumeCancellable");
            throw null;
        } else if (cVar instanceof z) {
            z zVar = (z) cVar;
            if (zVar.f871k.b(zVar.c())) {
                zVar.f868h = t;
                zVar.f800g = 1;
                zVar.f871k.a(zVar.c(), zVar);
                return;
            }
            z0 z0Var = z0.f873b;
            f0 a2 = z0.a();
            if (a2.m()) {
                zVar.f868h = t;
                zVar.f800g = 1;
                a2.a((b0<?>) zVar);
                return;
            }
            a2.c(true);
            try {
                p0 p0Var = (p0) zVar.c().get(p0.d);
                if (p0Var == null || p0Var.a()) {
                    z = false;
                } else {
                    zVar.a(i.c.d.p.e.a((Throwable) p0Var.f()));
                    z = true;
                }
                if (!z) {
                    c = zVar.c();
                    b2 = b.b(c, zVar.f870j);
                    zVar.f872l.a(t);
                    b.a(c, b2);
                }
                do {
                } while (a2.o());
            } catch (Throwable th) {
                try {
                    zVar.a(th, (Throwable) null);
                } catch (Throwable th2) {
                    a2.a(true);
                    throw th2;
                }
            }
            a2.a(true);
        } else {
            cVar.a(t);
        }
    }

    public static final <T> void b(c<? super T> cVar, T t) {
        if (cVar == null) {
            f.a("$this$resumeDirect");
            throw null;
        } else if (cVar instanceof z) {
            ((z) cVar).f872l.a(t);
        } else {
            cVar.a(t);
        }
    }

    public static final <T> void b(c<? super T> cVar, Throwable th) {
        if (cVar == null) {
            f.a("$this$resumeDirectWithException");
            throw null;
        } else if (th == null) {
            f.a("exception");
            throw null;
        } else if (cVar instanceof z) {
            c<T> cVar2 = ((z) cVar).f872l;
            cVar2.a(i.c.d.p.e.a(m.a(th, cVar2)));
        } else {
            cVar.a(i.c.d.p.e.a(m.a(th, cVar)));
        }
    }

    public static final <T> void a(c<? super T> cVar, Throwable th) {
        e c;
        Object b2;
        if (cVar == null) {
            f.a("$this$resumeCancellableWithException");
            throw null;
        } else if (th == null) {
            f.a("exception");
            throw null;
        } else if (cVar instanceof z) {
            z zVar = (z) cVar;
            e c2 = zVar.f872l.c();
            boolean z = false;
            m mVar = new m(th, false, 2);
            if (zVar.f871k.b(c2)) {
                zVar.f868h = new m(th, false, 2);
                zVar.f800g = 1;
                zVar.f871k.a(c2, zVar);
                return;
            }
            z0 z0Var = z0.f873b;
            f0 a2 = z0.a();
            if (a2.m()) {
                zVar.f868h = mVar;
                zVar.f800g = 1;
                a2.a((b0<?>) zVar);
                return;
            }
            a2.c(true);
            try {
                p0 p0Var = (p0) zVar.c().get(p0.d);
                if (p0Var != null && !p0Var.a()) {
                    zVar.a(i.c.d.p.e.a((Throwable) p0Var.f()));
                    z = true;
                }
                if (!z) {
                    c = zVar.c();
                    b2 = b.b(c, zVar.f870j);
                    c<T> cVar2 = zVar.f872l;
                    cVar2.a(i.c.d.p.e.a(m.a(th, cVar2)));
                    b.a(c, b2);
                }
                do {
                } while (a2.o());
            } catch (Throwable th2) {
                try {
                    zVar.a(th2, (Throwable) null);
                } catch (Throwable th3) {
                    a2.a(true);
                    throw th3;
                }
            }
            a2.a(true);
        } else {
            cVar.a(i.c.d.p.e.a(m.a(th, cVar)));
        }
    }

    public static final <T> void a(b0<? super T> b0Var, int i2) {
        if (b0Var != null) {
            c<? super T> e = b0Var.e();
            if (!(i2 == 0 || i2 == 1) || !(e instanceof z) || i.c.d.p.e.b(i2) != i.c.d.p.e.b(b0Var.f800g)) {
                a(b0Var, e, i2);
                return;
            }
            s sVar = ((z) e).f871k;
            e c = e.c();
            if (sVar.b(c)) {
                sVar.a(c, b0Var);
                return;
            }
            z0 z0Var = z0.f873b;
            f0 a2 = z0.a();
            if (a2.m()) {
                a2.a((b0<?>) b0Var);
                return;
            }
            a2.c(true);
            try {
                a(b0Var, b0Var.e(), 3);
                do {
                } while (a2.o());
            } catch (Throwable th) {
                a2.a(true);
                throw th;
            }
            a2.a(true);
            return;
        }
        f.a("$this$dispatch");
        throw null;
    }

    public static final <T> void a(b0<? super T> b0Var, c<? super T> cVar, int i2) {
        if (b0Var == null) {
            f.a("$this$resume");
            throw null;
        } else if (cVar != null) {
            Object f2 = b0Var.f();
            m mVar = (m) (!(f2 instanceof m) ? null : f2);
            Throwable th = mVar != null ? mVar.a : null;
            if (th != null) {
                if (!(cVar instanceof b0)) {
                    th = m.a(th, cVar);
                }
                if (th == null) {
                    f.a("exception");
                    throw null;
                } else if (i2 == 0) {
                    cVar.a(i.c.d.p.e.a(th));
                } else if (i2 == 1) {
                    a(cVar, th);
                } else if (i2 == 2) {
                    b(cVar, th);
                } else if (i2 == 3) {
                    z zVar = (z) cVar;
                    e c = zVar.c();
                    Object b2 = b.b(c, zVar.f870j);
                    try {
                        c<T> cVar2 = zVar.f872l;
                        cVar2.a(i.c.d.p.e.a(m.a(th, cVar2)));
                    } finally {
                        b.a(c, b2);
                    }
                } else if (i2 != 4) {
                    throw new IllegalStateException(a.b("Invalid mode ", i2).toString());
                }
            } else {
                Object b3 = b0Var.b(f2);
                if (i2 == 0) {
                    cVar.a(b3);
                } else if (i2 == 1) {
                    a(cVar, b3);
                } else if (i2 == 2) {
                    b(cVar, b3);
                } else if (i2 == 3) {
                    z zVar2 = (z) cVar;
                    e c2 = zVar2.c();
                    Object b4 = b.b(c2, zVar2.f870j);
                    try {
                        zVar2.f872l.a(b3);
                    } finally {
                        b.a(c2, b4);
                    }
                } else if (i2 != 4) {
                    throw new IllegalStateException(a.b("Invalid mode ", i2).toString());
                }
            }
        } else {
            f.a("delegate");
            throw null;
        }
    }
}
