package h.a0.x.r.o;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture */
public abstract class a<V> implements i.c.b.a.a.a<V> {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f1101h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f1102i = Logger.getLogger(a.class.getName());

    /* renamed from: j  reason: collision with root package name */
    public static final b f1103j;

    /* renamed from: k  reason: collision with root package name */
    public static final Object f1104k = new Object();
    public volatile Object e;

    /* renamed from: f  reason: collision with root package name */
    public volatile e f1105f;

    /* renamed from: g  reason: collision with root package name */
    public volatile i f1106g;

    /* compiled from: AbstractFuture */
    public static abstract class b {
        public /* synthetic */ b(C0028a aVar) {
        }

        public abstract void a(i iVar, i iVar2);

        public abstract void a(i iVar, Thread thread);

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean a(a<?> aVar, i iVar, i iVar2);

        public abstract boolean a(a<?> aVar, Object obj, Object obj2);
    }

    /* compiled from: AbstractFuture */
    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f1107b;

        static {
            if (a.f1101h) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, (Throwable) null);
            c = new c(true, (Throwable) null);
        }

        public c(boolean z, Throwable th) {
            this.a = z;
            this.f1107b = th;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f1108b = new d(new C0029a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* renamed from: h.a0.x.r.o.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        public static class C0029a extends Throwable {
            public C0029a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            a.b(th);
            this.a = th;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class e {
        public static final e d = new e((Runnable) null, (Executor) null);
        public final Runnable a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f1109b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.f1109b = executor;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f1110b;
        public final AtomicReferenceFieldUpdater<a, i> c;
        public final AtomicReferenceFieldUpdater<a, e> d;
        public final AtomicReferenceFieldUpdater<a, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super((C0028a) null);
            this.a = atomicReferenceFieldUpdater;
            this.f1110b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        public void a(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }

        public void a(i iVar, i iVar2) {
            this.f1110b.lazySet(iVar, iVar2);
        }

        public boolean a(a<?> aVar, i iVar, i iVar2) {
            return this.c.compareAndSet(aVar, iVar, iVar2);
        }

        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.d.compareAndSet(aVar, eVar, eVar2);
        }

        public boolean a(a<?> aVar, Object obj, Object obj2) {
            return this.e.compareAndSet(aVar, obj, obj2);
        }
    }

    /* compiled from: AbstractFuture */
    public static final class g<V> implements Runnable {
        public final a<V> e;

        /* renamed from: f  reason: collision with root package name */
        public final i.c.b.a.a.a<? extends V> f1111f;

        public g(a<V> aVar, i.c.b.a.a.a<? extends V> aVar2) {
            this.e = aVar;
            this.f1111f = aVar2;
        }

        public void run() {
            if (this.e.e == this) {
                if (a.f1103j.a((a<?>) this.e, (Object) this, a.a((i.c.b.a.a.a<?>) this.f1111f))) {
                    a.a((a<?>) this.e);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    public static final class h extends b {
        public h() {
            super((C0028a) null);
        }

        public void a(i iVar, Thread thread) {
            iVar.a = thread;
        }

        public void a(i iVar, i iVar2) {
            iVar.f1112b = iVar2;
        }

        public boolean a(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1106g != iVar) {
                    return false;
                }
                aVar.f1106g = iVar2;
                return true;
            }
        }

        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1105f != eVar) {
                    return false;
                }
                aVar.f1105f = eVar2;
                return true;
            }
        }

        public boolean a(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.e != obj) {
                    return false;
                }
                aVar.e = obj2;
                return true;
            }
        }
    }

    /* compiled from: AbstractFuture */
    public static final class i {
        public static final i c = new i(false);
        public volatile Thread a;

        /* renamed from: b  reason: collision with root package name */
        public volatile i f1112b;

        public i(boolean z) {
        }

        public i() {
            a.f1103j.a(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: h.a0.x.r.o.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: h.a0.x.r.o.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: h.a0.x.r.o.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: h.a0.x.r.o.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<h.a0.x.r.o.a$i> r0 = h.a0.x.r.o.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f1101h = r1
            java.lang.Class<h.a0.x.r.o.a> r1 = h.a0.x.r.o.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f1102i = r1
            h.a0.x.r.o.a$f r1 = new h.a0.x.r.o.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<h.a0.x.r.o.a> r2 = h.a0.x.r.o.a.class
            java.lang.String r5 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<h.a0.x.r.o.a> r0 = h.a0.x.r.o.a.class
            java.lang.Class<h.a0.x.r.o.a$e> r2 = h.a0.x.r.o.a.e.class
            java.lang.String r6 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<h.a0.x.r.o.a> r0 = h.a0.x.r.o.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            h.a0.x.r.o.a$h r1 = new h.a0.x.r.o.a$h
            r1.<init>()
        L_0x0054:
            f1103j = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f1102i
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f1104k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.x.r.o.a.<clinit>():void");
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f1102i;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    public final void a(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.f1106g;
            if (iVar2 != i.c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f1112b;
                    if (iVar2.a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f1112b = iVar4;
                        if (iVar3.a == null) {
                        }
                    } else if (!f1103j.a((a<?>) this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, i.c.b.a.a.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof h.a0.x.r.o.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f1101h
            if (r3 == 0) goto L_0x001f
            h.a0.x.r.o.a$c r3 = new h.a0.x.r.o.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            h.a0.x.r.o.a$c r3 = h.a0.x.r.o.a.c.c
            goto L_0x0026
        L_0x0024:
            h.a0.x.r.o.a$c r3 = h.a0.x.r.o.a.c.d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            h.a0.x.r.o.a$b r6 = f1103j
            boolean r6 = r6.a((h.a0.x.r.o.a<?>) r4, (java.lang.Object) r0, (java.lang.Object) r3)
            if (r6 == 0) goto L_0x0054
            a((h.a0.x.r.o.a<?>) r4)
            boolean r4 = r0 instanceof h.a0.x.r.o.a.g
            if (r4 == 0) goto L_0x005d
            h.a0.x.r.o.a$g r0 = (h.a0.x.r.o.a.g) r0
            i.c.b.a.a.a<? extends V> r0 = r0.f1111f
            boolean r4 = r0 instanceof h.a0.x.r.o.a
            if (r4 == 0) goto L_0x0050
            r4 = r0
            h.a0.x.r.o.a r4 = (h.a0.x.r.o.a) r4
            java.lang.Object r0 = r4.e
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof h.a0.x.r.o.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = 1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.e
            boolean r6 = r0 instanceof h.a0.x.r.o.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.x.r.o.a.cancel(boolean):boolean");
    }

    public final V get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.e;
            if ((obj != null) && (!(obj instanceof g))) {
                return a(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f1106g;
                if (iVar != i.c) {
                    i iVar2 = new i();
                    do {
                        f1103j.a(iVar2, iVar);
                        if (f1103j.a((a<?>) this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.e;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return a(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(iVar2);
                        } else {
                            iVar = this.f1106g;
                        }
                    } while (iVar != i.c);
                }
                return a(this.e);
            }
            while (nanos > 0) {
                Object obj3 = this.e;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String b2 = i.a.a.a.a.b(str, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str2 = b2 + convert + " " + lowerCase;
                    if (z) {
                        str2 = i.a.a.a.a.b(str2, ",");
                    }
                    b2 = i.a.a.a.a.b(str2, " ");
                }
                if (z) {
                    b2 = b2 + nanos2 + " nanoseconds ";
                }
                str = i.a.a.a.a.b(b2, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(i.a.a.a.a.b(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(i.a.a.a.a.a(str, " for ", aVar));
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.e instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.e;
        return (!(obj instanceof g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.e instanceof c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = a();
            } catch (RuntimeException e2) {
                StringBuilder a = i.a.a.a.a.a("Exception thrown from implementation: ");
                a.append(e2.getClass());
                str = a.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public final V a(Object obj) {
        if (obj instanceof c) {
            Throwable th = ((c) obj).f1107b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        } else if (obj == f1104k) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw null;
        } else if (executor != null) {
            e eVar = this.f1105f;
            if (eVar != e.d) {
                e eVar2 = new e(runnable, executor);
                do {
                    eVar2.c = eVar;
                    if (!f1103j.a((a<?>) this, eVar, eVar2)) {
                        eVar = this.f1105f;
                    } else {
                        return;
                    }
                } while (eVar != e.d);
            }
            b(runnable, executor);
        } else {
            throw null;
        }
    }

    public static Object a(i.c.b.a.a.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).e;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.a) {
                return cVar.f1107b != null ? new c(false, cVar.f1107b) : c.d;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f1101h) && isCancelled) {
            return c.d;
        }
        try {
            Object a = a(aVar);
            return a == null ? f1104k : a;
        } catch (ExecutionException e2) {
            return new d(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new c(false, e3);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e3));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V a(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static void a(a<?> aVar) {
        a<V> aVar2;
        e eVar;
        e eVar2;
        e eVar3 = null;
        a<?> aVar3 = aVar;
        while (true) {
            i iVar = aVar3.f1106g;
            if (f1103j.a(aVar3, iVar, i.c)) {
                while (iVar != null) {
                    Thread thread = iVar.a;
                    if (thread != null) {
                        iVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f1112b;
                }
                do {
                    eVar = aVar3.f1105f;
                } while (!f1103j.a(aVar3, eVar, e.d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.c;
                    eVar3.c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.c;
                    Runnable runnable = eVar2.a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar4 = gVar.e;
                        if (aVar4.e == gVar) {
                            if (f1103j.a((a<?>) aVar4, (Object) gVar, a((i.c.b.a.a.a<?>) gVar.f1111f))) {
                                aVar2 = aVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, eVar2.f1109b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
            aVar2 = aVar3;
            aVar3 = aVar2;
        }
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return a(obj2);
            }
            i iVar = this.f1106g;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    f1103j.a(iVar2, iVar);
                    if (f1103j.a((a<?>) this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                a(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return a(obj);
                    }
                    iVar = this.f1106g;
                } while (iVar != i.c);
            }
            return a(this.e);
        }
        throw new InterruptedException();
    }

    public String a() {
        String str;
        Object obj = this.e;
        if (obj instanceof g) {
            StringBuilder a = i.a.a.a.a.a("setFuture=[");
            i.c.b.a.a.a<? extends V> aVar = ((g) obj).f1111f;
            if (aVar == this) {
                str = "this future";
            } else {
                str = String.valueOf(aVar);
            }
            return i.a.a.a.a.a(a, str, "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder a2 = i.a.a.a.a.a("remaining delay=[");
            a2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            a2.append(" ms]");
            return a2.toString();
        }
    }

    public final void a(StringBuilder sb) {
        String str;
        try {
            Object a = a(this);
            sb.append("SUCCESS, result=[");
            if (a == this) {
                str = "this future";
            } else {
                str = String.valueOf(a);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }
}
