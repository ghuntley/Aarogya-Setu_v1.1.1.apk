package f.a;

import f.a.a.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import n.h;
import n.k.c;
import n.k.e;
import n.k.h.a;
import n.k.i.a.d;
import n.m.b.b;

/* compiled from: CancellableContinuationImpl.kt */
public class f<T> extends b0<T> implements e<T>, d {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f844j = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decision");

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f845k = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    public volatile int _decision;
    public volatile Object _state;

    /* renamed from: h  reason: collision with root package name */
    public final e f846h;

    /* renamed from: i  reason: collision with root package name */
    public final c<T> f847i;
    public volatile d0 parentHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(c<? super T> cVar, int i2) {
        super(i2);
        if (cVar != null) {
            this.f847i = cVar;
            this.f846h = cVar.c();
            this._decision = 0;
            this._state = b.e;
            return;
        }
        n.m.c.f.a("delegate");
        throw null;
    }

    public d a() {
        c<T> cVar = this.f847i;
        if (!(cVar instanceof d)) {
            cVar = null;
        }
        return (d) cVar;
    }

    public <T> T b(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).a;
        }
        return obj instanceof o ? ((o) obj).a : obj;
    }

    public StackTraceElement b() {
        return null;
    }

    public e c() {
        return this.f846h;
    }

    public final c<T> e() {
        return this.f847i;
    }

    public Object f() {
        return this._state;
    }

    public final Object g() {
        boolean z;
        p0 p0Var;
        p0 p0Var2;
        if (!(!(this._state instanceof w0)) && (p0Var2 = (p0) this.f847i.c().get(p0.d)) != null) {
            p0Var2.start();
            d0 a = p0Var2.a(true, true, new h(p0Var2, this));
            this.parentHandle = a;
            if (!(this._state instanceof w0)) {
                a.f();
                this.parentHandle = v0.e;
            }
        }
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (f844j.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i2 != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return a.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof m) {
            throw m.a(((m) obj).a, this);
        } else if (this.f800g != 1 || (p0Var = (p0) this.f846h.get(p0.d)) == null || p0Var.a()) {
            return b(obj);
        } else {
            CancellationException f2 = p0Var.f();
            a(obj, (Throwable) f2);
            throw m.a(f2, this);
        }
    }

    public String toString() {
        return "CancellableContinuation" + '(' + i.c.d.p.e.b((c<?>) this.f847i) + "){" + this._state + "}@" + i.c.d.p.e.c((Object) this);
    }

    public void a(Object obj, Throwable th) {
        if (th == null) {
            n.m.c.f.a("cause");
            throw null;
        } else if (obj instanceof o) {
            try {
                ((o) obj).f861b.a(th);
            } catch (Throwable th2) {
                e eVar = this.f846h;
                i.c.d.p.e.a(eVar, (Throwable) new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    public void a(Object obj) {
        Object obj2;
        Object f2 = i.c.d.p.e.f(obj);
        int i2 = this.f800g;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof w0)) {
                if (obj2 instanceof g) {
                    g gVar = (g) obj2;
                    if (gVar == null) {
                        throw null;
                    } else if (g.c.compareAndSet(gVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + f2).toString());
            }
        } while (!f845k.compareAndSet(this, obj2, f2));
        d0 d0Var = this.parentHandle;
        if (d0Var != null) {
            d0Var.f();
            this.parentHandle = v0.e;
        }
        a(i2);
    }

    public final void a(b<? super Throwable, h> bVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + bVar + ", already has " + obj).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f844j
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            f.a.a0.a(r4, (int) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.f.a(int):void");
    }

    public void a(b<? super Throwable, h> bVar) {
        Object obj;
        Throwable th = null;
        if (bVar != null) {
            Object obj2 = null;
            do {
                obj = this._state;
                if (obj instanceof b) {
                    if (obj2 == null) {
                        obj2 = bVar instanceof d ? (d) bVar : new m0(bVar);
                    }
                } else if (obj instanceof d) {
                    a(bVar, obj);
                    throw null;
                } else if (obj instanceof g) {
                    g gVar = (g) obj;
                    if (gVar == null) {
                        throw null;
                    } else if (m.f858b.compareAndSet(gVar, 0, 1)) {
                        try {
                            if (!(obj instanceof m)) {
                                obj = null;
                            }
                            m mVar = (m) obj;
                            if (mVar != null) {
                                th = mVar.a;
                            }
                            bVar.a(th);
                            return;
                        } catch (Throwable th2) {
                            i.c.d.p.e.a(this.f846h, (Throwable) new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
                            return;
                        }
                    } else {
                        a(bVar, obj);
                        throw null;
                    }
                } else {
                    return;
                }
            } while (!f845k.compareAndSet(this, obj, obj2));
            return;
        }
        n.m.c.f.a("handler");
        throw null;
    }
}
