package i.c.a.b.l;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.tasks.RuntimeExecutionException;
import i.c.a.b.d.k.h.j;
import i.c.a.b.d.l.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class d0<TResult> extends g<TResult> {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final b0<TResult> f4000b = new b0<>();
    @GuardedBy("mLock")
    public boolean c;
    public volatile boolean d;
    @GuardedBy("mLock")
    public TResult e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public Exception f4001f;

    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            q.b(this.c, (Object) "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (cls.isInstance(this.f4001f)) {
                throw ((Throwable) cls.cast(this.f4001f));
            } else if (this.f4001f == null) {
                tresult = this.e;
            } else {
                throw new RuntimeExecutionException(this.f4001f);
            }
        }
        return tresult;
    }

    public final TResult b() {
        TResult tresult;
        synchronized (this.a) {
            q.b(this.c, (Object) "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (this.f4001f == null) {
                tresult = this.e;
            } else {
                throw new RuntimeExecutionException(this.f4001f);
            }
        }
        return tresult;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f4001f == null;
        }
        return z;
    }

    public final boolean e() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.f4000b.a(this);
            return true;
        }
    }

    public final void f() {
        synchronized (this.a) {
            if (this.c) {
                this.f4000b.a(this);
            }
        }
    }

    public final <TContinuationResult> g<TContinuationResult> b(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        d0 d0Var = new d0();
        this.f4000b.a(new o(executor, aVar, d0Var));
        f();
        return d0Var;
    }

    public final Exception a() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f4001f;
        }
        return exc;
    }

    public final boolean b(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.f4000b.a(this);
            return true;
        }
    }

    public final g<TResult> a(Executor executor, e<? super TResult> eVar) {
        this.f4000b.a(new w(executor, eVar));
        f();
        return this;
    }

    public final g<TResult> a(Executor executor, d dVar) {
        this.f4000b.a(new u(executor, dVar));
        f();
        return this;
    }

    public final g<TResult> a(Executor executor, c<TResult> cVar) {
        this.f4000b.a(new s(executor, cVar));
        f();
        return this;
    }

    public final <TContinuationResult> g<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        d0 d0Var = new d0();
        this.f4000b.a(new m(executor, aVar, d0Var));
        f();
        return d0Var;
    }

    public final boolean b(Exception exc) {
        q.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f4001f = exc;
            this.f4000b.a(this);
            return true;
        }
    }

    public final g<TResult> a(Executor executor, b bVar) {
        this.f4000b.a(new q(executor, bVar));
        f();
        return this;
    }

    public static class a extends LifecycleCallback {

        /* renamed from: f  reason: collision with root package name */
        public final List<WeakReference<a0<?>>> f4002f = new ArrayList();

        public a(j jVar) {
            super(jVar);
            this.e.a("TaskOnStopCallback", (LifecycleCallback) this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: i.c.a.b.d.k.h.y0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: i.c.a.b.d.k.h.y0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: i.c.a.b.d.k.h.y0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: i.c.a.b.d.k.h.y0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: i.c.a.b.d.k.h.b1} */
        /* JADX WARNING: type inference failed for: r1v18, types: [androidx.fragment.app.Fragment, i.c.a.b.d.k.h.b1] */
        /* JADX WARNING: type inference failed for: r1v20, types: [androidx.fragment.app.Fragment, i.c.a.b.d.k.h.b1] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
            if (r2 != false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
            if (r1 != null) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
            if (r2 != false) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
            if (r1 != null) goto L_0x00a4;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static i.c.a.b.l.d0.a a(android.app.Activity r5) {
            /*
                java.lang.String r0 = "Activity must not be null"
                i.c.a.b.d.l.q.a(r5, (java.lang.Object) r0)
                boolean r0 = r5 instanceof h.l.d.e
                if (r0 == 0) goto L_0x005f
                h.l.d.e r5 = (h.l.d.e) r5
                java.lang.String r0 = "SupportLifecycleFragmentImpl"
                java.util.WeakHashMap<h.l.d.e, java.lang.ref.WeakReference<i.c.a.b.d.k.h.b1>> r1 = i.c.a.b.d.k.h.b1.d0
                java.lang.Object r1 = r1.get(r5)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                if (r1 == 0) goto L_0x0021
                java.lang.Object r1 = r1.get()
                i.c.a.b.d.k.h.b1 r1 = (i.c.a.b.d.k.h.b1) r1
                if (r1 == 0) goto L_0x0021
                goto L_0x00a4
            L_0x0021:
                h.l.d.r r1 = r5.k()     // Catch:{ ClassCastException -> 0x0056 }
                androidx.fragment.app.Fragment r1 = r1.b((java.lang.String) r0)     // Catch:{ ClassCastException -> 0x0056 }
                i.c.a.b.d.k.h.b1 r1 = (i.c.a.b.d.k.h.b1) r1     // Catch:{ ClassCastException -> 0x0056 }
                if (r1 == 0) goto L_0x0031
                boolean r2 = r1.f238p
                if (r2 == 0) goto L_0x0049
            L_0x0031:
                i.c.a.b.d.k.h.b1 r1 = new i.c.a.b.d.k.h.b1
                r1.<init>()
                h.l.d.r r2 = r5.k()
                if (r2 == 0) goto L_0x0054
                h.l.d.a r3 = new h.l.d.a
                r3.<init>(r2)
                r2 = 0
                r4 = 1
                r3.a(r2, r1, r0, r4)
                r3.a()
            L_0x0049:
                java.util.WeakHashMap<h.l.d.e, java.lang.ref.WeakReference<i.c.a.b.d.k.h.b1>> r0 = i.c.a.b.d.k.h.b1.d0
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r1)
                r0.put(r5, r2)
                goto L_0x00a4
            L_0x0054:
                r5 = 0
                throw r5
            L_0x0056:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
                r0.<init>(r1, r5)
                throw r0
            L_0x005f:
                java.lang.String r0 = "LifecycleFragmentImpl"
                java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<i.c.a.b.d.k.h.y0>> r1 = i.c.a.b.d.k.h.y0.f3083h
                java.lang.Object r1 = r1.get(r5)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                if (r1 == 0) goto L_0x0074
                java.lang.Object r1 = r1.get()
                i.c.a.b.d.k.h.y0 r1 = (i.c.a.b.d.k.h.y0) r1
                if (r1 == 0) goto L_0x0074
                goto L_0x00a4
            L_0x0074:
                android.app.FragmentManager r1 = r5.getFragmentManager()     // Catch:{ ClassCastException -> 0x00b6 }
                android.app.Fragment r1 = r1.findFragmentByTag(r0)     // Catch:{ ClassCastException -> 0x00b6 }
                i.c.a.b.d.k.h.y0 r1 = (i.c.a.b.d.k.h.y0) r1     // Catch:{ ClassCastException -> 0x00b6 }
                if (r1 == 0) goto L_0x0086
                boolean r2 = r1.isRemoving()
                if (r2 == 0) goto L_0x009a
            L_0x0086:
                i.c.a.b.d.k.h.y0 r1 = new i.c.a.b.d.k.h.y0
                r1.<init>()
                android.app.FragmentManager r2 = r5.getFragmentManager()
                android.app.FragmentTransaction r2 = r2.beginTransaction()
                android.app.FragmentTransaction r0 = r2.add(r1, r0)
                r0.commitAllowingStateLoss()
            L_0x009a:
                java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<i.c.a.b.d.k.h.y0>> r0 = i.c.a.b.d.k.h.y0.f3083h
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r1)
                r0.put(r5, r2)
            L_0x00a4:
                java.lang.Class<i.c.a.b.l.d0$a> r5 = i.c.a.b.l.d0.a.class
                java.lang.String r0 = "TaskOnStopCallback"
                com.google.android.gms.common.api.internal.LifecycleCallback r5 = r1.a((java.lang.String) r0, r5)
                i.c.a.b.l.d0$a r5 = (i.c.a.b.l.d0.a) r5
                if (r5 != 0) goto L_0x00b5
                i.c.a.b.l.d0$a r5 = new i.c.a.b.l.d0$a
                r5.<init>(r1)
            L_0x00b5:
                return r5
            L_0x00b6:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
                r0.<init>(r1, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.l.d0.a.a(android.app.Activity):i.c.a.b.l.d0$a");
        }

        public final <T> void a(a0<T> a0Var) {
            synchronized (this.f4002f) {
                this.f4002f.add(new WeakReference(a0Var));
            }
        }

        public void a() {
            synchronized (this.f4002f) {
                for (WeakReference<a0<?>> weakReference : this.f4002f) {
                    a0 a0Var = (a0) weakReference.get();
                    if (a0Var != null) {
                        a0Var.cancel();
                    }
                }
                this.f4002f.clear();
            }
        }
    }

    public final <TContinuationResult> g<TContinuationResult> a(Executor executor, f<TResult, TContinuationResult> fVar) {
        d0 d0Var = new d0();
        this.f4000b.a(new y(executor, fVar, d0Var));
        f();
        return d0Var;
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            q.b(!this.c, (Object) "Task is already complete");
            this.c = true;
            this.e = tresult;
        }
        this.f4000b.a(this);
    }

    public final void a(Exception exc) {
        q.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            q.b(!this.c, (Object) "Task is already complete");
            this.c = true;
            this.f4001f = exc;
        }
        this.f4000b.a(this);
    }
}
