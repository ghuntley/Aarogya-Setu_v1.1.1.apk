package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class n1 {
    public static volatile z1<Boolean> a = y1.e;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f3367b = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r3, android.net.Uri r4) {
        /*
            java.lang.String r4 = r4.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r4)
            r1 = 0
            if (r0 != 0) goto L_0x002a
            r3 = 91
            int r3 = i.a.a.a.a.a((java.lang.String) r4, (int) r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r3 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "PhenotypeClientHelper"
            android.util.Log.e(r4, r3)
            return r1
        L_0x002a:
            i.c.a.b.g.g.z1<java.lang.Boolean> r4 = a
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x003f
            i.c.a.b.g.g.z1<java.lang.Boolean> r3 = a
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L_0x003f:
            java.lang.Object r4 = f3367b
            monitor-enter(r4)
            i.c.a.b.g.g.z1<java.lang.Boolean> r0 = a     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.a()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0058
            i.c.a.b.g.g.z1<java.lang.Boolean> r3 = a     // Catch:{ all -> 0x00ae }
            java.lang.Object r3 = r3.b()     // Catch:{ all -> 0x00ae }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x00ae }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x00ae }
            monitor-exit(r4)     // Catch:{ all -> 0x00ae }
            return r3
        L_0x0058:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r3.getPackageName()     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0065
            goto L_0x007b
        L_0x0065:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "com.google.android.gms.phenotype"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r1)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x007d
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x00ae }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x007d
        L_0x007b:
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x0096
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0092 }
            int r3 = r3.flags     // Catch:{ all -> 0x00ae }
            r3 = r3 & 129(0x81, float:1.81E-43)
            if (r3 == 0) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 == 0) goto L_0x0096
            r1 = 1
        L_0x0096:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00ae }
            i.c.a.b.g.g.z1 r3 = i.c.a.b.g.g.z1.a(r3)     // Catch:{ all -> 0x00ae }
            a = r3     // Catch:{ all -> 0x00ae }
            monitor-exit(r4)     // Catch:{ all -> 0x00ae }
            i.c.a.b.g.g.z1<java.lang.Boolean> r3 = a
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L_0x00ae:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ae }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.n1.a(android.content.Context, android.net.Uri):boolean");
    }
}
