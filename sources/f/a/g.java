package f.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletedExceptionally.kt */
public final class g extends m {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(g.class, "_resumed");
    public volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(n.k.c<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0005
            goto L_0x0020
        L_0x0005:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x0020:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        L_0x0027:
            java.lang.String r3 = "continuation"
            n.m.c.f.a((java.lang.String) r3)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.g.<init>(n.k.c, java.lang.Throwable, boolean):void");
    }
}
