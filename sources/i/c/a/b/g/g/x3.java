package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class x3 implements c5 {
    public static final x3 a = new x3();

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.g.g.d5 a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<i.c.a.b.g.g.w3> r0 = i.c.a.b.g.g.w3.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            i.c.a.b.g.g.w3 r0 = i.c.a.b.g.g.w3.a(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.a((int) r1, (java.lang.Object) r2, (java.lang.Object) r2)     // Catch:{ Exception -> 0x0035 }
            i.c.a.b.g.g.d5 r0 = (i.c.a.b.g.g.d5) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0049
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.x3.a(java.lang.Class):i.c.a.b.g.g.d5");
    }

    public final boolean b(Class<?> cls) {
        return w3.class.isAssignableFrom(cls);
    }
}
