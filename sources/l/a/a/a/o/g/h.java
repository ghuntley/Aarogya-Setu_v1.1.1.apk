package l.a.a.a.o.g;

import l.a.a.a.k;

/* compiled from: DefaultCachedSettingsIo */
public class h {
    public final k a;

    public h(k kVar) {
        this.a = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[Catch:{ Exception -> 0x0099, all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a A[SYNTHETIC, Splitter:B:27:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8 A[Catch:{ all -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject a() {
        /*
            r8 = this;
            java.lang.String r0 = "Error while closing settings cache file."
            l.a.a.a.c r1 = l.a.a.a.f.a()
            r2 = 3
            java.lang.String r3 = "Fabric"
            boolean r1 = r1.a(r3, r2)
            r4 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "Reading cached settings..."
            android.util.Log.d(r3, r1, r4)
        L_0x0015:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            l.a.a.a.k r5 = r8.a     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            android.content.Context r6 = r5.getContext()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r6 == 0) goto L_0x008f
            android.content.Context r6 = r5.getContext()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            r5.getPath()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            r6.getPackageName()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            java.io.File r5 = r6.getFilesDir()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r5 == 0) goto L_0x004d
            boolean r6 = r5.exists()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r6 != 0) goto L_0x005d
            boolean r6 = r5.mkdirs()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r6 == 0) goto L_0x003c
            goto L_0x005d
        L_0x003c:
            l.a.a.a.c r5 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            r6 = 5
            boolean r5 = r5.a(r3, r6)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r5 == 0) goto L_0x005c
            java.lang.String r5 = "Couldn't create file"
            android.util.Log.w(r3, r5, r4)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            goto L_0x005c
        L_0x004d:
            l.a.a.a.c r5 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            boolean r5 = r5.a(r3, r2)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r5 == 0) goto L_0x005c
            java.lang.String r5 = "Null File"
            android.util.Log.d(r3, r5, r4)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
        L_0x005c:
            r5 = r4
        L_0x005d:
            java.lang.String r6 = "com.crashlytics.settings.json"
            r1.<init>(r5, r6)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            boolean r5 = r1.exists()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r5 == 0) goto L_0x007a
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            java.lang.String r1 = l.a.a.a.o.b.i.b((java.io.InputStream) r2)     // Catch:{ Exception -> 0x0078 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0078 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0078 }
            r4 = r2
            goto L_0x008a
        L_0x0078:
            r1 = move-exception
            goto L_0x009b
        L_0x007a:
            l.a.a.a.c r1 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            java.lang.String r5 = "No cached settings found."
            boolean r1 = r1.a(r3, r2)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            if (r1 == 0) goto L_0x0089
            android.util.Log.d(r3, r5, r4)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
        L_0x0089:
            r5 = r4
        L_0x008a:
            l.a.a.a.o.b.i.a((java.io.Closeable) r4, (java.lang.String) r0)
            r4 = r5
            goto L_0x00ae
        L_0x008f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            java.lang.String r2 = "Cannot get directory before context has been set. Call Fabric.with() first"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
            throw r1     // Catch:{ Exception -> 0x0099, all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            goto L_0x00b1
        L_0x0099:
            r1 = move-exception
            r2 = r4
        L_0x009b:
            l.a.a.a.c r5 = l.a.a.a.f.a()     // Catch:{ all -> 0x00af }
            java.lang.String r6 = "Failed to fetch cached settings"
            r7 = 6
            boolean r5 = r5.a(r3, r7)     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x00ab
            android.util.Log.e(r3, r6, r1)     // Catch:{ all -> 0x00af }
        L_0x00ab:
            l.a.a.a.o.b.i.a((java.io.Closeable) r2, (java.lang.String) r0)
        L_0x00ae:
            return r4
        L_0x00af:
            r1 = move-exception
            r4 = r2
        L_0x00b1:
            l.a.a.a.o.b.i.a((java.io.Closeable) r4, (java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.g.h.a():org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2 A[Catch:{ all -> 0x0086 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r7, org.json.JSONObject r9) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to close settings writer."
            l.a.a.a.c r1 = l.a.a.a.f.a()
            r2 = 3
            java.lang.String r3 = "Fabric"
            boolean r1 = r1.a(r3, r2)
            r4 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "Writing settings to cache file..."
            android.util.Log.d(r3, r1, r4)
        L_0x0015:
            if (r9 == 0) goto L_0x00ad
            java.lang.String r1 = "expires_at"
            r9.put(r1, r7)     // Catch:{ Exception -> 0x0094 }
            java.io.FileWriter r7 = new java.io.FileWriter     // Catch:{ Exception -> 0x0094 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0094 }
            l.a.a.a.k r1 = r6.a     // Catch:{ Exception -> 0x0094 }
            android.content.Context r5 = r1.getContext()     // Catch:{ Exception -> 0x0088 }
            if (r5 == 0) goto L_0x008a
            android.content.Context r5 = r1.getContext()     // Catch:{ Exception -> 0x0088 }
            r1.getPath()     // Catch:{ Exception -> 0x0088 }
            r5.getPackageName()     // Catch:{ Exception -> 0x0088 }
            java.io.File r1 = r5.getFilesDir()     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x0056
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0088 }
            if (r2 != 0) goto L_0x0066
            boolean r2 = r1.mkdirs()     // Catch:{ Exception -> 0x0088 }
            if (r2 == 0) goto L_0x0045
            goto L_0x0066
        L_0x0045:
            l.a.a.a.c r1 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0088 }
            r2 = 5
            boolean r1 = r1.a(r3, r2)     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x0065
            java.lang.String r1 = "Couldn't create file"
            android.util.Log.w(r3, r1, r4)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0065
        L_0x0056:
            l.a.a.a.c r1 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0088 }
            boolean r1 = r1.a(r3, r2)     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x0065
            java.lang.String r1 = "Null File"
            android.util.Log.d(r3, r1, r4)     // Catch:{ Exception -> 0x0088 }
        L_0x0065:
            r1 = r4
        L_0x0066:
            java.lang.String r2 = "com.crashlytics.settings.json"
            r8.<init>(r1, r2)     // Catch:{ Exception -> 0x0094 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r7.write(r8)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r7.flush()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            l.a.a.a.o.b.i.a((java.io.Closeable) r7, (java.lang.String) r0)
            goto L_0x00ad
        L_0x007c:
            r8 = move-exception
            r4 = r7
            goto L_0x00a9
        L_0x007f:
            r8 = move-exception
            r4 = r7
            goto L_0x0095
        L_0x0082:
            r8 = r7
            goto L_0x00a9
        L_0x0084:
            r8 = r7
            goto L_0x0095
        L_0x0086:
            r7 = move-exception
            goto L_0x0082
        L_0x0088:
            r7 = move-exception
            goto L_0x0084
        L_0x008a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0088 }
            java.lang.String r8 = "Cannot get directory before context has been set. Call Fabric.with() first"
            r7.<init>(r8)     // Catch:{ Exception -> 0x0088 }
            throw r7     // Catch:{ Exception -> 0x0088 }
        L_0x0092:
            r8 = move-exception
            goto L_0x00a9
        L_0x0094:
            r8 = move-exception
        L_0x0095:
            l.a.a.a.c r7 = l.a.a.a.f.a()     // Catch:{ all -> 0x0092 }
            java.lang.String r9 = "Failed to cache settings"
            r1 = 6
            boolean r7 = r7.a(r3, r1)     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x00a5
            android.util.Log.e(r3, r9, r8)     // Catch:{ all -> 0x0086 }
        L_0x00a5:
            l.a.a.a.o.b.i.a((java.io.Closeable) r4, (java.lang.String) r0)
            goto L_0x00ad
        L_0x00a9:
            l.a.a.a.o.b.i.a((java.io.Closeable) r4, (java.lang.String) r0)
            throw r8
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.g.h.a(long, org.json.JSONObject):void");
    }
}
