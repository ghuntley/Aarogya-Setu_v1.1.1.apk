package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class f4<V> {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f3662h = new Object();
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final d4<V> f3663b;
    public final V c;
    public final V d;
    public final Object e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile V f3664f = null;

    /* renamed from: g  reason: collision with root package name */
    public volatile V f3665g = null;

    public /* synthetic */ f4(String str, Object obj, Object obj2, d4 d4Var, a4 a4Var) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.f3663b = d4Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            i.c.a.b.i.a.oa r4 = i.c.a.b.d.l.q.e
            if (r4 != 0) goto L_0x000e
            V r4 = r3.c
            return r4
        L_0x000e:
            java.lang.Object r4 = f3662h
            monitor-enter(r4)
            boolean r0 = i.c.a.b.i.a.oa.a()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0022
            V r0 = r3.f3665g     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x001e
            V r0 = r3.c     // Catch:{ all -> 0x006b }
            goto L_0x0020
        L_0x001e:
            V r0 = r3.f3665g     // Catch:{ all -> 0x006b }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            java.util.List<i.c.a.b.i.a.f4<?>> r4 = i.c.a.b.i.a.o.a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x0029:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            i.c.a.b.i.a.f4 r0 = (i.c.a.b.i.a.f4) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = i.c.a.b.i.a.oa.a()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            i.c.a.b.i.a.d4<V> r2 = r0.f3663b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            i.c.a.b.i.a.d4<V> r2 = r0.f3663b     // Catch:{ IllegalStateException -> 0x0046 }
            java.lang.Object r1 = r2.a()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f3662h     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f3665g = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x0029
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
        L_0x0059:
            i.c.a.b.i.a.d4<V> r4 = r3.f3663b
            if (r4 != 0) goto L_0x0060
            V r4 = r3.c
            return r4
        L_0x0060:
            java.lang.Object r4 = r4.a()     // Catch:{ SecurityException -> 0x0068, IllegalStateException -> 0x0065 }
            return r4
        L_0x0065:
            V r4 = r3.c
            return r4
        L_0x0068:
            V r4 = r3.c
            return r4
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r4
        L_0x0070:
            r4 = move-exception
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.f4.a(java.lang.Object):java.lang.Object");
    }
}
