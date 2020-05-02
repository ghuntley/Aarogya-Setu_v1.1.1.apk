package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class k2 extends g2 {
    public final j2 a = new j2();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        r1 = new java.util.Vector(2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Throwable r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            if (r6 == r5) goto L_0x0050
            if (r6 == 0) goto L_0x0048
            i.c.a.b.g.g.j2 r0 = r4.a
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r1 = r0.f3323b
            java.lang.ref.Reference r1 = r1.poll()
        L_0x000c:
            if (r1 == 0) goto L_0x001a
            java.util.concurrent.ConcurrentHashMap<i.c.a.b.g.g.i2, java.util.List<java.lang.Throwable>> r2 = r0.a
            r2.remove(r1)
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r1 = r0.f3323b
            java.lang.ref.Reference r1 = r1.poll()
            goto L_0x000c
        L_0x001a:
            i.c.a.b.g.g.i2 r1 = new i.c.a.b.g.g.i2
            r2 = 0
            r1.<init>(r5, r2)
            java.util.concurrent.ConcurrentHashMap<i.c.a.b.g.g.i2, java.util.List<java.lang.Throwable>> r2 = r0.a
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x002b
            goto L_0x0044
        L_0x002b:
            java.util.Vector r1 = new java.util.Vector
            r2 = 2
            r1.<init>(r2)
            java.util.concurrent.ConcurrentHashMap<i.c.a.b.g.g.i2, java.util.List<java.lang.Throwable>> r2 = r0.a
            i.c.a.b.g.g.i2 r3 = new i.c.a.b.g.g.i2
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r0 = r0.f3323b
            r3.<init>(r5, r0)
            java.lang.Object r5 = r2.putIfAbsent(r3, r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = r5
        L_0x0044:
            r1.add(r6)
            return
        L_0x0048:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "The suppressed exception cannot be null."
            r5.<init>(r6)
            throw r5
        L_0x0050:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Self suppression is not allowed."
            r5.<init>(r0, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.k2.a(java.lang.Throwable, java.lang.Throwable):void");
    }
}
