package i.c.a.d.a.e;

import java.util.ArrayDeque;
import java.util.Queue;

public final class e<TResult> {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public Queue<f<TResult>> f4319b;
    public boolean c;

    public final void a(f<TResult> fVar) {
        synchronized (this.a) {
            if (this.f4319b == null) {
                this.f4319b = new ArrayDeque();
            }
            this.f4319b.add(fVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f4319b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i.c.a.d.a.e.h<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.Queue<i.c.a.d.a.e.f<TResult>> r1 = r2.f4319b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.a
            monitor-enter(r1)
            java.util.Queue<i.c.a.d.a.e.f<TResult>> r0 = r2.f4319b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            i.c.a.d.a.e.f r0 = (i.c.a.d.a.e.f) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.d.a.e.e.a(i.c.a.d.a.e.h):void");
    }
}
