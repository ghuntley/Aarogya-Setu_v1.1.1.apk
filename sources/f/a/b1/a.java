package f.a.b1;

import com.crashlytics.android.answers.AnswersRetryFilesSender;
import f.a.a.j;
import f.a.a.n;
import f.a.x;
import i.c.d.p.e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n.m.c.f;

/* compiled from: CoroutineScheduler.kt */
public final class a implements Executor, Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f801m = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f802n = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f803o = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: p  reason: collision with root package name */
    public static final int f804p;

    /* renamed from: q  reason: collision with root package name */
    public static final int f805q;
    public static final int r = ((int) TimeUnit.SECONDS.toNanos(1));
    public static final int s;
    public static final n t = new n("NOT_IN_STACK");
    public volatile int _isTerminated;
    public volatile long controlState;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final Semaphore f806f;

    /* renamed from: g  reason: collision with root package name */
    public final C0019a[] f807g;

    /* renamed from: h  reason: collision with root package name */
    public final Random f808h;

    /* renamed from: i  reason: collision with root package name */
    public final int f809i;

    /* renamed from: j  reason: collision with root package name */
    public final int f810j;

    /* renamed from: k  reason: collision with root package name */
    public final long f811k;

    /* renamed from: l  reason: collision with root package name */
    public final String f812l;
    public volatile long parkedWorkersStack;

    /* compiled from: CoroutineScheduler.kt */
    public enum b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    static {
        int a = e.a("kotlinx.coroutines.scheduler.spins", (int) AnswersRetryFilesSender.BACKOFF_MS, 1, 0, 8, (Object) null);
        f804p = a;
        f805q = a + e.a("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null);
        long j2 = l.a / ((long) 4);
        if (j2 < 10) {
            j2 = 10;
        }
        s = (int) e.a(j2, (long) r);
    }

    public a(int i2, int i3, long j2, String str) {
        if (str != null) {
            this.f809i = i2;
            this.f810j = i3;
            this.f811k = j2;
            this.f812l = str;
            if (i2 >= 1) {
                if (this.f810j >= this.f809i) {
                    if (this.f810j <= 2097150) {
                        if (this.f811k > 0) {
                            this.e = new d();
                            this.f806f = new Semaphore(this.f809i, false);
                            this.parkedWorkersStack = 0;
                            this.f807g = new C0019a[(this.f810j + 1)];
                            this.controlState = 0;
                            this.f808h = new Random();
                            this._isTerminated = 0;
                            return;
                        }
                        StringBuilder a = i.a.a.a.a.a("Idle worker keep alive time ");
                        a.append(this.f811k);
                        a.append(" must be positive");
                        throw new IllegalArgumentException(a.toString().toString());
                    }
                    StringBuilder a2 = i.a.a.a.a.a("Max pool size ");
                    a2.append(this.f810j);
                    a2.append(" should not exceed maximal supported number of threads 2097150");
                    throw new IllegalArgumentException(a2.toString().toString());
                }
                StringBuilder a3 = i.a.a.a.a.a("Max pool size ");
                a3.append(this.f810j);
                a3.append(" should be greater than or equals to core pool size ");
                a3.append(this.f809i);
                throw new IllegalArgumentException(a3.toString().toString());
            }
            StringBuilder a4 = i.a.a.a.a.a("Core pool size ");
            a4.append(this.f809i);
            a4.append(" should be at least 1");
            throw new IllegalArgumentException(a4.toString().toString());
        }
        f.a("schedulerName");
        throw null;
    }

    public static /* synthetic */ void a(a aVar, Runnable runnable, i iVar, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            iVar = g.f835f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        aVar.a(runnable, iVar, z);
    }

    public void close() {
        e(10000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ae, code lost:
        if (r13 != null) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(long r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f803o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r12, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            f.a.b1.a$a r0 = r12.f()
            f.a.b1.a$a[] r3 = r12.f807g
            monitor-enter(r3)
            long r4 = r12.controlState     // Catch:{ all -> 0x00ef }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x009c
            r3 = 1
        L_0x001d:
            f.a.b1.a$a[] r4 = r12.f807g
            r4 = r4[r3]
            r6 = 0
            if (r4 == 0) goto L_0x0098
            if (r4 == r0) goto L_0x0093
        L_0x0026:
            boolean r7 = r4.isAlive()
            if (r7 == 0) goto L_0x0033
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r13)
            goto L_0x0026
        L_0x0033:
            f.a.b1.a$b r7 = r4.state
            boolean r8 = f.a.x.a
            if (r8 == 0) goto L_0x0049
            f.a.b1.a$b r8 = f.a.b1.a.b.TERMINATED
            if (r7 != r8) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            if (r7 == 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x0049:
            f.a.b1.n r4 = r4.e
            f.a.b1.d r7 = r12.e
            if (r4 == 0) goto L_0x0092
            if (r7 == 0) goto L_0x008c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f.a.b1.n.f842b
            java.lang.Object r8 = r8.getAndSet(r4, r6)
            f.a.b1.h r8 = (f.a.b1.h) r8
            if (r8 == 0) goto L_0x005e
            r4.a((f.a.b1.d) r7, (f.a.b1.h) r8)
        L_0x005e:
            int r8 = r4.consumerIndex
            int r9 = r4.producerIndex
            int r9 = r8 - r9
            if (r9 != 0) goto L_0x0068
            r8 = r6
            goto L_0x0086
        L_0x0068:
            r9 = r8 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray<f.a.b1.h> r10 = r4.a
            java.lang.Object r10 = r10.get(r9)
            f.a.b1.h r10 = (f.a.b1.h) r10
            if (r10 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r10 = f.a.b1.n.d
            int r11 = r8 + 1
            boolean r8 = r10.compareAndSet(r4, r8, r11)
            if (r8 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicReferenceArray<f.a.b1.h> r8 = r4.a
            java.lang.Object r8 = r8.getAndSet(r9, r6)
            f.a.b1.h r8 = (f.a.b1.h) r8
        L_0x0086:
            if (r8 == 0) goto L_0x0093
            r4.a((f.a.b1.d) r7, (f.a.b1.h) r8)
            goto L_0x005e
        L_0x008c:
            java.lang.String r13 = "globalQueue"
            n.m.c.f.a((java.lang.String) r13)
            throw r6
        L_0x0092:
            throw r6
        L_0x0093:
            if (r3 == r5) goto L_0x009c
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0098:
            n.m.c.f.a()
            throw r6
        L_0x009c:
            f.a.b1.d r13 = r12.e
        L_0x009e:
            java.lang.Object r14 = r13._cur$internal
            f.a.a.j r14 = (f.a.a.j) r14
            boolean r3 = r14.a()
            if (r3 == 0) goto L_0x00e5
        L_0x00a8:
            if (r0 == 0) goto L_0x00b1
            f.a.b1.h r13 = r0.b()
            if (r13 == 0) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            f.a.b1.d r13 = r12.e
            java.lang.Object r13 = r13.a()
            f.a.b1.h r13 = (f.a.b1.h) r13
        L_0x00b9:
            if (r13 == 0) goto L_0x00bf
            r12.a((f.a.b1.h) r13)
            goto L_0x00a8
        L_0x00bf:
            if (r0 == 0) goto L_0x00c6
            f.a.b1.a$b r13 = f.a.b1.a.b.TERMINATED
            r0.a((f.a.b1.a.b) r13)
        L_0x00c6:
            boolean r13 = f.a.x.a
            if (r13 == 0) goto L_0x00de
            java.util.concurrent.Semaphore r13 = r12.f806f
            int r13 = r13.availablePermits()
            int r14 = r12.f809i
            if (r13 != r14) goto L_0x00d5
            r1 = 1
        L_0x00d5:
            if (r1 == 0) goto L_0x00d8
            goto L_0x00de
        L_0x00d8:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x00de:
            r13 = 0
            r12.parkedWorkersStack = r13
            r12.controlState = r13
            return
        L_0x00e5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f.a.a.i.a
            f.a.a.j r4 = r14.c()
            r3.compareAndSet(r13, r14, r4)
            goto L_0x009e
        L_0x00ef:
            r13 = move-exception
            monitor-exit(r3)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b1.a.e(long):void");
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            a(runnable, g.f835f, false);
        } else {
            f.a("command");
            throw null;
        }
    }

    public final C0019a f() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C0019a)) {
            currentThread = null;
        }
        C0019a aVar = (C0019a) currentThread;
        if (aVar == null || !f.a((Object) a.this, (Object) this)) {
            return null;
        }
        return aVar;
    }

    public final void h() {
        if (this.f806f.availablePermits() == 0) {
            j();
        } else if (!j()) {
            long j2 = this.controlState;
            if (((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)) < this.f809i) {
                int a = a();
                if (a == 1 && this.f809i > 1) {
                    a();
                }
                if (a > 0) {
                    return;
                }
            }
            j();
        }
    }

    public final boolean j() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            C0019a aVar = this.f807g[(int) (2097151 & j2)];
            if (aVar != null) {
                long j3 = (2097152 + j2) & -2097152;
                int a = a(aVar);
                if (a < 0) {
                    continue;
                } else {
                    if (f801m.compareAndSet(this, j2, ((long) a) | j3)) {
                        aVar.nextParkedWorker = t;
                    } else {
                        continue;
                    }
                }
            } else {
                aVar = null;
            }
            boolean z = false;
            if (aVar == null) {
                return false;
            }
            aVar.f816h = s;
            aVar.spins = 0;
            boolean z2 = aVar.state == b.PARKING;
            LockSupport.unpark(aVar);
            if (z2) {
                int i2 = aVar.terminationState;
                if (!(i2 == 1 || i2 == -1)) {
                    if (i2 == 0) {
                        z = C0019a.f813l.compareAndSet(aVar, 0, -1);
                    } else {
                        throw new IllegalStateException(i.a.a.a.a.b("Invalid terminationState = ", i2).toString());
                    }
                }
                if (z) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (C0019a aVar : this.f807g) {
            if (aVar != null) {
                n nVar = aVar.e;
                Object obj = nVar.lastScheduledTask;
                int a = nVar.a();
                if (obj != null) {
                    a++;
                }
                int ordinal = aVar.state.ordinal();
                if (ordinal == 0) {
                    i2++;
                    arrayList.add(String.valueOf(a) + "c");
                } else if (ordinal == 1) {
                    i3++;
                    arrayList.add(String.valueOf(a) + "b");
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (a > 0) {
                        arrayList.add(String.valueOf(a) + "r");
                    }
                } else if (ordinal == 4) {
                    i6++;
                }
            }
        }
        long j2 = this.controlState;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f812l);
        sb.append('@');
        sb.append(e.c((Object) this));
        sb.append('[');
        sb.append("Pool Size {");
        sb.append("core = ");
        sb.append(this.f809i);
        sb.append(", ");
        sb.append("max = ");
        sb.append(this.f810j);
        sb.append("}, ");
        sb.append("Worker States {");
        sb.append("CPU = ");
        sb.append(i2);
        sb.append(", ");
        sb.append("blocking = ");
        sb.append(i3);
        sb.append(", ");
        sb.append("parked = ");
        sb.append(i4);
        sb.append(", ");
        sb.append("retired = ");
        sb.append(i5);
        sb.append(", ");
        sb.append("terminated = ");
        sb.append(i6);
        sb.append("}, ");
        sb.append("running workers queues = ");
        sb.append(arrayList);
        sb.append(", ");
        sb.append("global queue size = ");
        long j3 = ((j) this.e._cur$internal)._state$internal;
        sb.append(1073741823 & (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j3) >> 0))));
        sb.append(", ");
        sb.append("Control State Workers {");
        sb.append("created = ");
        sb.append((int) (2097151 & j2));
        sb.append(", ");
        sb.append("blocking = ");
        sb.append((int) ((j2 & 4398044413952L) >> 21));
        sb.append('}');
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r7.c() == false) goto L_0x0058;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Runnable r6, f.a.b1.i r7, boolean r8) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0087
            if (r7 == 0) goto L_0x0081
            f.a.b1.h r6 = r5.a((java.lang.Runnable) r6, (f.a.b1.i) r7)
            f.a.b1.a$a r7 = r5.f()
            r0 = -1
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0058
            f.a.b1.a$b r3 = r7.state
            f.a.b1.a$b r4 = f.a.b1.a.b.TERMINATED
            if (r3 != r4) goto L_0x0019
            goto L_0x0058
        L_0x0019:
            f.a.b1.k r3 = r6.d()
            f.a.b1.k r4 = f.a.b1.k.NON_BLOCKING
            if (r3 != r4) goto L_0x0035
            f.a.b1.a$b r3 = r7.state
            f.a.b1.a$b r4 = f.a.b1.a.b.BLOCKING
            if (r3 != r4) goto L_0x0029
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 == 0) goto L_0x002e
            r3 = 0
            goto L_0x0036
        L_0x002e:
            boolean r3 = r7.c()
            if (r3 != 0) goto L_0x0035
            goto L_0x0058
        L_0x0035:
            r3 = -1
        L_0x0036:
            if (r8 == 0) goto L_0x0041
            f.a.b1.n r8 = r7.e
            f.a.b1.d r4 = r5.e
            boolean r8 = r8.b(r6, r4)
            goto L_0x0049
        L_0x0041:
            f.a.b1.n r8 = r7.e
            f.a.b1.d r4 = r5.e
            boolean r8 = r8.a((f.a.b1.h) r6, (f.a.b1.d) r4)
        L_0x0049:
            if (r8 == 0) goto L_0x0059
            f.a.b1.n r7 = r7.e
            int r7 = r7.a()
            int r8 = f.a.b1.l.f840b
            if (r7 <= r8) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r1 = r3
            goto L_0x0059
        L_0x0058:
            r1 = 1
        L_0x0059:
            if (r1 == r0) goto L_0x0080
            if (r1 == r2) goto L_0x0061
            r5.h()
            goto L_0x006c
        L_0x0061:
            f.a.b1.d r7 = r5.e
            boolean r6 = r7.a(r6)
            if (r6 == 0) goto L_0x006d
            r5.h()
        L_0x006c:
            return
        L_0x006d:
            java.util.concurrent.RejectedExecutionException r6 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.f812l
            java.lang.String r0 = " was terminated"
            java.lang.String r7 = i.a.a.a.a.a((java.lang.StringBuilder) r7, (java.lang.String) r8, (java.lang.String) r0)
            r6.<init>(r7)
            throw r6
        L_0x0080:
            return
        L_0x0081:
            java.lang.String r6 = "taskContext"
            n.m.c.f.a((java.lang.String) r6)
            throw r0
        L_0x0087:
            java.lang.String r6 = "block"
            n.m.c.f.a((java.lang.String) r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b1.a.a(java.lang.Runnable, f.a.b1.i, boolean):void");
    }

    /* renamed from: f.a.b1.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutineScheduler.kt */
    public final class C0019a extends Thread {

        /* renamed from: l  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f813l = AtomicIntegerFieldUpdater.newUpdater(C0019a.class, "terminationState");
        public final n e = new n();

        /* renamed from: f  reason: collision with root package name */
        public long f814f;

        /* renamed from: g  reason: collision with root package name */
        public long f815g;

        /* renamed from: h  reason: collision with root package name */
        public int f816h = a.s;

        /* renamed from: i  reason: collision with root package name */
        public int f817i;
        public volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public int f818j;
        public volatile Object nextParkedWorker = a.t;
        public volatile int spins;
        public volatile b state = b.RETIRING;
        public volatile int terminationState = 0;

        public C0019a(int i2) {
            setDaemon(true);
            this.f817i = a.this.f808h.nextInt();
            b(i2);
        }

        public final boolean a(b bVar) {
            if (bVar != null) {
                b bVar2 = this.state;
                boolean z = bVar2 == b.CPU_ACQUIRED;
                if (z) {
                    a.this.f806f.release();
                }
                if (bVar2 != bVar) {
                    this.state = bVar;
                }
                return z;
            }
            f.a("newState");
            throw null;
        }

        public final void b(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f812l);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final boolean c() {
            if (this.state == b.CPU_ACQUIRED) {
                return true;
            }
            if (!a.this.f806f.tryAcquire()) {
                return false;
            }
            this.state = b.CPU_ACQUIRED;
            return true;
        }

        public final void d() {
            synchronized (a.this.f807g) {
                if (!(a.this._isTerminated != 0)) {
                    if (((int) (a.this.controlState & 2097151)) > a.this.f809i) {
                        if (a()) {
                            if (f813l.compareAndSet(this, 0, 1)) {
                                int i2 = this.indexInArray;
                                b(0);
                                a.a(a.this, this, i2, 0);
                                int andDecrement = (int) (a.f802n.getAndDecrement(a.this) & 2097151);
                                if (andDecrement != i2) {
                                    C0019a aVar = a.this.f807g[andDecrement];
                                    if (aVar != null) {
                                        a.this.f807g[i2] = aVar;
                                        aVar.b(i2);
                                        a.a(a.this, aVar, andDecrement, i2);
                                    } else {
                                        f.a();
                                        throw null;
                                    }
                                }
                                a.this.f807g[andDecrement] = null;
                                this.state = b.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        public void run() {
            boolean z;
            boolean z2 = false;
            while (true) {
                if ((a.this._isTerminated != 0) || this.state == b.TERMINATED) {
                    a(b.TERMINATED);
                } else {
                    h b2 = b();
                    if (b2 == null) {
                        if (this.state == b.CPU_ACQUIRED) {
                            int i2 = this.spins;
                            if (i2 <= a.f805q) {
                                this.spins = i2 + 1;
                                if (i2 >= a.f804p) {
                                    Thread.yield();
                                }
                            } else {
                                int i3 = this.f816h;
                                int i4 = a.r;
                                if (i3 < i4) {
                                    int i5 = (i3 * 3) >>> 1;
                                    if (i5 <= i4) {
                                        i4 = i5;
                                    }
                                    this.f816h = i4;
                                }
                                a(b.PARKING);
                                long j2 = (long) this.f816h;
                                a.a(a.this, this);
                                if (a()) {
                                    LockSupport.parkNanos(j2);
                                }
                            }
                        } else {
                            a(b.PARKING);
                            if (a()) {
                                this.terminationState = 0;
                                if (this.f814f == 0) {
                                    this.f814f = System.nanoTime() + a.this.f811k;
                                }
                                a aVar = a.this;
                                long j3 = aVar.f811k;
                                a.a(aVar, this);
                                if (!a()) {
                                    z = false;
                                } else {
                                    LockSupport.parkNanos(j3);
                                    z = true;
                                }
                                if (z && System.nanoTime() - this.f814f >= 0) {
                                    this.f814f = 0;
                                    d();
                                }
                            }
                        }
                        z2 = true;
                    } else {
                        k d = b2.d();
                        if (z2) {
                            this.f814f = 0;
                            this.f818j = 0;
                            if (this.state == b.PARKING) {
                                if (x.a) {
                                    if (!(d == k.PROBABLY_BLOCKING)) {
                                        throw new AssertionError();
                                    }
                                }
                                this.state = b.BLOCKING;
                                this.f816h = a.s;
                            }
                            this.spins = 0;
                            z2 = false;
                        }
                        long j4 = b2.e;
                        if (d != k.NON_BLOCKING) {
                            a.f802n.addAndGet(a.this, 2097152);
                            if (a(b.BLOCKING)) {
                                a.this.h();
                            }
                        } else if (a.this.f806f.availablePermits() != 0) {
                            if (((f) l.f841f) != null) {
                                long nanoTime = System.nanoTime();
                                long j5 = l.a;
                                if (nanoTime - j4 >= j5 && nanoTime - this.f815g >= j5 * ((long) 5)) {
                                    this.f815g = nanoTime;
                                    a.this.h();
                                }
                            } else {
                                throw null;
                            }
                        }
                        a.this.a(b2);
                        if (d != k.NON_BLOCKING) {
                            a.f802n.addAndGet(a.this, -2097152);
                            b bVar = this.state;
                            if (bVar == b.TERMINATED) {
                                continue;
                            } else {
                                if (x.a) {
                                    if (!(bVar == b.BLOCKING)) {
                                        throw new AssertionError();
                                    }
                                }
                                this.state = b.RETIRING;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            a(b.TERMINATED);
        }

        public final h b() {
            h hVar;
            h hVar2;
            h a;
            if (c()) {
                boolean z = false;
                boolean z2 = a(a.this.f809i * 2) == 0;
                if (z2 && (a = a.this.e.a(k.NON_BLOCKING)) != null) {
                    return a;
                }
                h b2 = this.e.b();
                if (b2 != null) {
                    return b2;
                }
                if (!z2 && (hVar2 = (h) a.this.e.a()) != null) {
                    return hVar2;
                }
                int i2 = (int) (a.this.controlState & 2097151);
                if (i2 < 2) {
                    return null;
                }
                int i3 = this.f818j;
                if (i3 == 0) {
                    i3 = a(i2);
                }
                int i4 = i3 + 1;
                if (i4 > i2) {
                    i4 = 1;
                }
                this.f818j = i4;
                a aVar = a.this;
                C0019a aVar2 = aVar.f807g[i4];
                if (aVar2 == null || aVar2 == this) {
                    return null;
                }
                n nVar = this.e;
                n nVar2 = aVar2.e;
                d dVar = aVar.e;
                if (nVar == null) {
                    throw null;
                } else if (nVar2 == null) {
                    f.a("victim");
                    throw null;
                } else if (dVar == null) {
                    f.a("globalQueue");
                    throw null;
                } else if (((f) l.f841f) != null) {
                    long nanoTime = System.nanoTime();
                    int a2 = nVar2.a();
                    if (a2 == 0) {
                        h hVar3 = (h) nVar2.lastScheduledTask;
                        if (hVar3 != null && nanoTime - hVar3.e >= l.a && n.f842b.compareAndSet(nVar2, hVar3, (Object) null)) {
                            nVar.a(hVar3, dVar);
                            z = true;
                        }
                    } else {
                        int i5 = a2 / 2;
                        if (i5 < 1) {
                            i5 = 1;
                        }
                        int i6 = 0;
                        boolean z3 = false;
                        while (i6 < i5) {
                            while (true) {
                                int i7 = nVar2.consumerIndex;
                                if (i7 - nVar2.producerIndex == 0) {
                                    break;
                                }
                                int i8 = i7 & 127;
                                h hVar4 = nVar2.a.get(i8);
                                if (hVar4 != null) {
                                    if (!(nanoTime - hVar4.e >= l.a || nVar2.a() > l.f840b)) {
                                        break;
                                    } else if (n.d.compareAndSet(nVar2, i7, i7 + 1)) {
                                        hVar = nVar2.a.getAndSet(i8, (Object) null);
                                        break;
                                    }
                                }
                            }
                            hVar = null;
                            if (hVar == null) {
                                break;
                            }
                            nVar.a(hVar, dVar);
                            i6++;
                            z3 = true;
                        }
                        z = z3;
                    }
                    if (z) {
                        return this.e.b();
                    }
                    return null;
                } else {
                    throw null;
                }
            } else {
                h b3 = this.e.b();
                return b3 != null ? b3 : a.this.e.a(k.PROBABLY_BLOCKING);
            }
        }

        public final int a(int i2) {
            int i3 = this.f817i;
            int i4 = i3 ^ (i3 << 13);
            this.f817i = i4;
            int i5 = i4 ^ (i4 >> 17);
            this.f817i = i5;
            int i6 = i5 ^ (i5 << 5);
            this.f817i = i6;
            int i7 = i2 - 1;
            if ((i7 & i2) == 0) {
                return i6 & i7;
            }
            return (i6 & Integer.MAX_VALUE) % i2;
        }

        public final boolean a() {
            h a = a.this.e.a(k.PROBABLY_BLOCKING);
            if (a == null) {
                return true;
            }
            this.e.a(a, a.this.e);
            return false;
        }
    }

    public final h a(Runnable runnable, i iVar) {
        if (runnable == null) {
            f.a("block");
            throw null;
        } else if (iVar == null) {
            f.a("taskContext");
            throw null;
        } else if (((f) l.f841f) != null) {
            long nanoTime = System.nanoTime();
            if (!(runnable instanceof h)) {
                return new j(runnable, nanoTime, iVar);
            }
            h hVar = (h) runnable;
            hVar.e = nanoTime;
            hVar.f836f = iVar;
            return hVar;
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007f, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
            r10 = this;
            f.a.b1.a$a[] r0 = r10.f807g
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch:{ all -> 0x0080 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x0011
            r1 = -1
            monitor-exit(r0)
            return r1
        L_0x0011:
            long r4 = r10.controlState     // Catch:{ all -> 0x0080 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r8 = r4 & r6
            int r1 = (int) r8     // Catch:{ all -> 0x0080 }
            r8 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r4 = r4 & r8
            r8 = 21
            long r4 = r4 >> r8
            int r5 = (int) r4     // Catch:{ all -> 0x0080 }
            int r4 = r1 - r5
            int r5 = r10.f809i     // Catch:{ all -> 0x0080 }
            if (r4 < r5) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r5 = r10.f810j     // Catch:{ all -> 0x0080 }
            if (r1 >= r5) goto L_0x007e
            java.util.concurrent.Semaphore r1 = r10.f806f     // Catch:{ all -> 0x0080 }
            int r1 = r1.availablePermits()     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x0038
            goto L_0x007e
        L_0x0038:
            long r8 = r10.controlState     // Catch:{ all -> 0x0080 }
            long r8 = r8 & r6
            int r1 = (int) r8     // Catch:{ all -> 0x0080 }
            int r1 = r1 + r3
            if (r1 <= 0) goto L_0x0047
            f.a.b1.a$a[] r5 = r10.f807g     // Catch:{ all -> 0x0080 }
            r5 = r5[r1]     // Catch:{ all -> 0x0080 }
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            if (r5 == 0) goto L_0x0072
            f.a.b1.a$a r5 = new f.a.b1.a$a     // Catch:{ all -> 0x0080 }
            r5.<init>(r1)     // Catch:{ all -> 0x0080 }
            r5.start()     // Catch:{ all -> 0x0080 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f802n     // Catch:{ all -> 0x0080 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0080 }
            long r6 = r6 & r8
            int r7 = (int) r6     // Catch:{ all -> 0x0080 }
            if (r1 != r7) goto L_0x005d
            r2 = 1
        L_0x005d:
            if (r2 == 0) goto L_0x0066
            f.a.b1.a$a[] r2 = r10.f807g     // Catch:{ all -> 0x0080 }
            r2[r1] = r5     // Catch:{ all -> 0x0080 }
            int r4 = r4 + r3
            monitor-exit(r0)
            return r4
        L_0x0066:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0080 }
            r2.<init>(r1)     // Catch:{ all -> 0x0080 }
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x0072:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0080 }
            r2.<init>(r1)     // Catch:{ all -> 0x0080 }
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r0)
            return r2
        L_0x0080:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b1.a.a():int");
    }

    public final void a(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            f.a((Object) currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public static final /* synthetic */ void a(a aVar, C0019a aVar2) {
        long j2;
        long j3;
        int i2;
        if (aVar == null) {
            throw null;
        } else if (aVar2.nextParkedWorker == t) {
            do {
                j2 = aVar.parkedWorkersStack;
                int i3 = (int) (2097151 & j2);
                j3 = (2097152 + j2) & -2097152;
                i2 = aVar2.indexInArray;
                if (x.a) {
                    if (!(i2 != 0)) {
                        throw new AssertionError();
                    }
                }
                aVar2.nextParkedWorker = aVar.f807g[i3];
            } while (!f801m.compareAndSet(aVar, j2, ((long) i2) | j3));
        }
    }

    public final int a(C0019a aVar) {
        Object obj = aVar.nextParkedWorker;
        while (obj != t) {
            if (obj == null) {
                return 0;
            }
            C0019a aVar2 = (C0019a) obj;
            int i2 = aVar2.indexInArray;
            if (i2 != 0) {
                return i2;
            }
            obj = aVar2.nextParkedWorker;
        }
        return -1;
    }

    public static final /* synthetic */ void a(a aVar, C0019a aVar2, int i2, int i3) {
        while (true) {
            long j2 = aVar.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? aVar.a(aVar2) : i3;
            }
            if (i4 >= 0) {
                if (f801m.compareAndSet(aVar, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }
}
