package i.c.f;

/* compiled from: LazyFieldLite */
public class n {
    public f a;

    /* renamed from: b  reason: collision with root package name */
    public volatile o f4964b;

    static {
        i.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f4964b = r4;
        r4 = i.c.f.f.f4932f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(i.c.f.o r4) {
        /*
            r3 = this;
            i.c.f.o r0 = r3.f4964b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            i.c.f.o r0 = r3.f4964b     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x000c:
            i.c.f.f r0 = r3.a     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            if (r0 == 0) goto L_0x0020
            i.c.f.q r0 = r4.g()     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            i.c.f.f r1 = r3.a     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            r2 = 0
            java.lang.Object r0 = r0.a((i.c.f.f) r1, (i.c.f.i) r2)     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            i.c.f.o r0 = (i.c.f.o) r0     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            r3.f4964b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            goto L_0x0029
        L_0x0020:
            r3.f4964b = r4     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            i.c.f.f r4 = i.c.f.f.f4932f     // Catch:{ InvalidProtocolBufferException -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r3.f4964b = r4     // Catch:{ all -> 0x002b }
            i.c.f.f r4 = i.c.f.f.f4932f     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.f.n.a(i.c.f.o):void");
    }
}
