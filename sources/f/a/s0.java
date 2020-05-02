package f.a;

import f.a.a.h;
import f.a.a.k;
import f.a.a.l;
import i.c.d.p.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlinx.coroutines.JobCancellationException;
import n.k.e;
import n.m.b.c;
import n.m.c.f;

/* compiled from: JobSupport.kt */
public class s0 implements p0, j, x0 {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_state");
    public volatile Object _state;

    /* compiled from: JobSupport.kt */
    public static final class a implements l0 {
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        public boolean a() {
            return true;
        }

        public u0 b() {
            return null;
        }

        public String toString() {
            return "Finishing[cancelling=false, completing=false, rootCause=null, exceptions=null, list=null]";
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class b extends h.a {
        public final /* synthetic */ s0 d;
        public final /* synthetic */ Object e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar, h hVar2, s0 s0Var, Object obj) {
            super(hVar2);
            this.d = s0Var;
            this.e = obj;
        }
    }

    public boolean a() {
        Object b2 = b();
        return (b2 instanceof l0) && ((l0) b2).a();
    }

    public final Object b() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof k)) {
                return obj;
            }
            ((k) obj).a(this);
        }
    }

    public final CancellationException f() {
        Object b2 = b();
        if (b2 instanceof a) {
            Throwable th = ((a) b2).rootCause;
            if (th != null) {
                CancellationException a2 = a(th, e.b((Object) this) + " is cancelling");
                if (a2 != null) {
                    return a2;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (b2 instanceof l0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (b2 instanceof m) {
            return a(((m) b2).a, (String) null);
        } else {
            return new JobCancellationException(e.b((Object) this) + " has completed normally", (Throwable) null, this);
        }
    }

    public <R> R fold(R r, c<? super R, ? super e.a, ? extends R> cVar) {
        if (cVar != null) {
            return e.a.C0149a.a(this, r, cVar);
        }
        f.a("operation");
        throw null;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        if (bVar != null) {
            return e.a.C0149a.a((e.a) this, bVar);
        }
        f.a("key");
        throw null;
    }

    public final e.b<?> getKey() {
        return p0.d;
    }

    public n.k.e minusKey(e.b<?> bVar) {
        if (bVar != null) {
            return e.a.C0149a.b(this, bVar);
        }
        f.a("key");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (e.compareAndSet(r6, r0, f.a.t0.a) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (e.compareAndSet(r6, r0, ((f.a.k0) r0).e) == false) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[ADDED_TO_REGION, LOOP:0: B:0:0x0000->B:13:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean start() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6.b()
            boolean r1 = r0 instanceof f.a.e0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001e
            r1 = r0
            f.a.e0 r1 = (f.a.e0) r1
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x0013
            goto L_0x0032
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = e
            f.a.e0 r5 = f.a.t0.a
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0033
        L_0x001e:
            boolean r1 = r0 instanceof f.a.k0
            if (r1 == 0) goto L_0x0032
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = e
            r5 = r0
            f.a.k0 r5 = (f.a.k0) r5
            f.a.u0 r5 = r5.e
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r2 = 1
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0038
            goto L_0x0000
        L_0x0038:
            return r4
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.s0.start():boolean");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.c.d.p.e.b((Object) this));
        sb2.append('{');
        Object b2 = b();
        if (b2 instanceof a) {
            a aVar = (a) b2;
            if (aVar == null) {
                throw null;
            } else if (aVar.isCompleting) {
                str = "Completing";
                sb2.append(str);
                sb2.append('}');
                sb.append(sb2.toString());
                sb.append('@');
                sb.append(i.c.d.p.e.c((Object) this));
                return sb.toString();
            }
        } else {
            if (!(b2 instanceof l0)) {
                str = b2 instanceof m ? "Cancelled" : "Completed";
            } else if (!((l0) b2).a()) {
                str = "New";
            }
            sb2.append(str);
            sb2.append('}');
            sb.append(sb2.toString());
            sb.append('@');
            sb.append(i.c.d.p.e.c((Object) this));
            return sb.toString();
        }
        str = "Active";
        sb2.append(str);
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(i.c.d.p.e.c((Object) this));
        return sb.toString();
    }

    public final CancellationException a(Throwable th, String str) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = th;
            }
            CancellationException cancellationException2 = cancellationException;
            if (cancellationException2 == null) {
                if (str == null) {
                    str = i.c.d.p.e.b((Object) th) + " was cancelled";
                }
                cancellationException2 = new JobCancellationException(str, th, this);
            }
            return cancellationException2;
        }
        f.a("$this$toCancellationException");
        throw null;
    }

    public final r0<?> a(n.m.b.b<? super Throwable, n.h> bVar, boolean z) {
        boolean z2 = true;
        q0 q0Var = null;
        if (z) {
            if (bVar instanceof q0) {
                q0Var = bVar;
            }
            q0 q0Var2 = q0Var;
            if (q0Var2 == null) {
                return new n0(this, bVar);
            }
            if (q0Var2.f863h != this) {
                z2 = false;
            }
            if (z2) {
                return q0Var2;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (bVar instanceof r0) {
            q0Var = bVar;
        }
        r0<?> r0Var = q0Var;
        if (r0Var == null) {
            return new o0(this, bVar);
        }
        if (r0Var.f863h != this || (r0Var instanceof q0)) {
            z2 = false;
        }
        if (z2) {
            return r0Var;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARNING: type inference failed for: r4v14, types: [f.a.k0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.d0 a(boolean r7, boolean r8, n.m.b.b<? super java.lang.Throwable, n.h> r9) {
        /*
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L_0x00d2
            r1 = r0
        L_0x0004:
            java.lang.Object r2 = r6.b()
            boolean r3 = r2 instanceof f.a.e0
            if (r3 == 0) goto L_0x0039
            r3 = r2
            f.a.e0 r3 = (f.a.e0) r3
            boolean r4 = r3.e
            if (r4 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            f.a.r0 r1 = r6.a((n.m.b.b<? super java.lang.Throwable, n.h>) r9, (boolean) r7)
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = e
            boolean r2 = r3.compareAndSet(r6, r2, r1)
            if (r2 == 0) goto L_0x0004
            return r1
        L_0x0023:
            f.a.u0 r2 = new f.a.u0
            r2.<init>()
            boolean r4 = r3.e
            if (r4 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            f.a.k0 r4 = new f.a.k0
            r4.<init>(r2)
            r2 = r4
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = e
            r4.compareAndSet(r6, r3, r2)
            goto L_0x0004
        L_0x0039:
            boolean r3 = r2 instanceof f.a.l0
            if (r3 == 0) goto L_0x00bf
            r3 = r2
            f.a.l0 r3 = (f.a.l0) r3
            f.a.u0 r3 = r3.b()
            if (r3 != 0) goto L_0x007d
            if (r2 == 0) goto L_0x0075
            f.a.r0 r2 = (f.a.r0) r2
            f.a.u0 r3 = new f.a.u0
            r3.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f.a.a.h.f792f
            r4.lazySet(r3, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f.a.a.h.e
            r4.lazySet(r3, r2)
        L_0x0059:
            java.lang.Object r4 = r2.d()
            if (r4 == r2) goto L_0x0060
            goto L_0x006b
        L_0x0060:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f.a.a.h.e
            boolean r4 = r4.compareAndSet(r2, r2, r3)
            if (r4 == 0) goto L_0x0059
            r3.a(r2)
        L_0x006b:
            f.a.a.h r3 = r2.e()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = e
            r4.compareAndSet(r6, r2, r3)
            goto L_0x0004
        L_0x0075:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r8 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r7.<init>(r8)
            throw r7
        L_0x007d:
            f.a.v0 r4 = f.a.v0.e
            if (r7 == 0) goto L_0x00a8
            boolean r5 = r2 instanceof f.a.s0.a
            if (r5 == 0) goto L_0x00a8
            monitor-enter(r2)
            r5 = r2
            f.a.s0$a r5 = (f.a.s0.a) r5     // Catch:{ all -> 0x00a5 }
            java.lang.Throwable r5 = r5.rootCause     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x008e
            goto L_0x00a3
        L_0x008e:
            if (r1 == 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            f.a.r0 r1 = r6.a((n.m.b.b<? super java.lang.Throwable, n.h>) r9, (boolean) r7)     // Catch:{ all -> 0x00a5 }
        L_0x0095:
            boolean r4 = r6.a((java.lang.Object) r2, (f.a.u0) r3, (f.a.r0<?>) r1)     // Catch:{ all -> 0x00a5 }
            if (r4 != 0) goto L_0x009e
            monitor-exit(r2)
            goto L_0x0004
        L_0x009e:
            if (r5 != 0) goto L_0x00a2
            monitor-exit(r2)
            return r1
        L_0x00a2:
            r4 = r1
        L_0x00a3:
            monitor-exit(r2)
            goto L_0x00a9
        L_0x00a5:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x00a8:
            r5 = r0
        L_0x00a9:
            if (r5 == 0) goto L_0x00b1
            if (r8 == 0) goto L_0x00b0
            r9.a(r5)
        L_0x00b0:
            return r4
        L_0x00b1:
            if (r1 == 0) goto L_0x00b4
            goto L_0x00b8
        L_0x00b4:
            f.a.r0 r1 = r6.a((n.m.b.b<? super java.lang.Throwable, n.h>) r9, (boolean) r7)
        L_0x00b8:
            boolean r2 = r6.a((java.lang.Object) r2, (f.a.u0) r3, (f.a.r0<?>) r1)
            if (r2 == 0) goto L_0x0004
            return r1
        L_0x00bf:
            if (r8 == 0) goto L_0x00cf
            boolean r7 = r2 instanceof f.a.m
            if (r7 != 0) goto L_0x00c6
            r2 = r0
        L_0x00c6:
            f.a.m r2 = (f.a.m) r2
            if (r2 == 0) goto L_0x00cc
            java.lang.Throwable r0 = r2.a
        L_0x00cc:
            r9.a(r0)
        L_0x00cf:
            f.a.v0 r7 = f.a.v0.e
            return r7
        L_0x00d2:
            java.lang.String r7 = "handler"
            n.m.c.f.a((java.lang.String) r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.s0.a(boolean, boolean, n.m.b.b):f.a.d0");
    }

    public final boolean a(Object obj, u0 u0Var, r0<?> r0Var) {
        char c;
        b bVar = new b(r0Var, r0Var, this, obj);
        while (true) {
            Object obj2 = u0Var._prev;
            if (!(obj2 instanceof l)) {
                if (obj2 != null) {
                    h hVar = (h) obj2;
                    if (hVar.d() != u0Var) {
                        u0Var.a(hVar, (k) null);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            }
            if (obj2 != null) {
                h hVar2 = (h) obj2;
                if (r0Var != null) {
                    h.f792f.lazySet(r0Var, hVar2);
                    h.e.lazySet(r0Var, u0Var);
                    bVar.f794b = u0Var;
                    if (!h.e.compareAndSet(hVar2, u0Var, bVar)) {
                        c = 0;
                    } else {
                        c = bVar.a(hVar2) == null ? (char) 1 : 2;
                    }
                    if (c == 1) {
                        return true;
                    }
                    if (c == 2) {
                        return false;
                    }
                } else {
                    f.a("node");
                    throw null;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }
}
