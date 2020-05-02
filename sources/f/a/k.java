package f.a;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import n.k.e;
import n.m.c.f;

/* compiled from: CommonPool.kt */
public final class k extends j0 {
    public static final int e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f857f = new k();
    public static volatile Executor pool;

    /* compiled from: CommonPool.kt */
    public static final class a implements ThreadFactory {
        public final /* synthetic */ AtomicInteger a;

        public a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder a2 = i.a.a.a.a.a("CommonPool-worker-");
            a2.append(this.a.incrementAndGet());
            Thread thread = new Thread(runnable, a2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0066 A[SYNTHETIC] */
    static {
        /*
            f.a.k r0 = new f.a.k
            r0.<init>()
            f857f = r0
            r0 = 0
            java.lang.String r1 = "kotlinx.coroutines.default.parallelism"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            if (r1 == 0) goto L_0x008f
            r2 = 10
            i.c.d.p.e.a((int) r2)
            int r3 = r1.length()
            r4 = 1
            if (r3 != 0) goto L_0x001f
            goto L_0x0072
        L_0x001f:
            r5 = 0
            char r6 = r1.charAt(r5)
            r7 = 48
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 >= r7) goto L_0x003d
            if (r3 != r4) goto L_0x002e
            goto L_0x0072
        L_0x002e:
            r7 = 45
            if (r6 != r7) goto L_0x0037
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r7 = 1
            goto L_0x003f
        L_0x0037:
            r7 = 43
            if (r6 != r7) goto L_0x0072
            r6 = 1
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            r7 = 0
        L_0x003f:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L_0x0045:
            if (r6 >= r3) goto L_0x0066
            char r11 = r1.charAt(r6)
            int r11 = java.lang.Character.digit(r11, r2)
            if (r11 >= 0) goto L_0x0052
            goto L_0x0072
        L_0x0052:
            if (r5 >= r10) goto L_0x005b
            if (r10 != r9) goto L_0x0072
            int r10 = r8 / 10
            if (r5 >= r10) goto L_0x005b
            goto L_0x0072
        L_0x005b:
            int r5 = r5 * 10
            int r12 = r8 + r11
            if (r5 >= r12) goto L_0x0062
            goto L_0x0072
        L_0x0062:
            int r5 = r5 - r11
            int r6 = r6 + 1
            goto L_0x0045
        L_0x0066:
            if (r7 == 0) goto L_0x006d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0072
        L_0x006d:
            int r0 = -r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0072:
            if (r0 == 0) goto L_0x007f
            int r2 = r0.intValue()
            if (r2 < r4) goto L_0x007f
            int r0 = r0.intValue()
            goto L_0x0090
        L_0x007f:
            java.lang.String r0 = "Expected positive number in kotlinx.coroutines.default.parallelism, but has "
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x008f:
            r0 = -1
        L_0x0090:
            e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.k.<clinit>():void");
    }

    public void a(e eVar, Runnable runnable) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (runnable != null) {
            try {
                Executor executor = pool;
                if (executor == null) {
                    executor = q();
                }
                executor.execute(runnable);
            } catch (RejectedExecutionException unused) {
                y.f867k.a(runnable);
            }
        } else {
            f.a("block");
            throw null;
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public final ExecutorService m() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(s(), new a(new AtomicInteger()));
        f.a((Object) newFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return newFixedThreadPool;
    }

    public final ExecutorService o() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return m();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m();
        }
        if (e < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (f857f != null) {
                    executorService.submit(l.e);
                    try {
                        Object invoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                        if (!(invoke2 instanceof Integer)) {
                            invoke2 = null;
                        }
                        num = (Integer) invoke2;
                    } catch (Throwable unused3) {
                        num = null;
                    }
                    if (!(num != null && num.intValue() >= 1)) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        return executorService;
                    }
                } else {
                    throw null;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f857f.s())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused4) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return m();
    }

    public final synchronized Executor q() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = o();
            pool = executor;
        }
        return executor;
    }

    public final int s() {
        Integer valueOf = Integer.valueOf(e);
        int i2 = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors >= 1) {
            i2 = availableProcessors;
        }
        return i2;
    }

    public String toString() {
        return "CommonPool";
    }
}
