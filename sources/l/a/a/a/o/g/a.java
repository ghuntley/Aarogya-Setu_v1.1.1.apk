package l.a.a.a.o.g;

import l.a.a.a.k;
import l.a.a.a.o.e.b;
import l.a.a.a.o.e.c;

/* compiled from: AbstractAppSpiCall */
public abstract class a extends l.a.a.a.o.b.a {
    public a(k kVar, String str, String str2, c cVar, b bVar) {
        super(kVar, str, str2, cVar, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00eb A[Catch:{ all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f2 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(l.a.a.a.o.g.d r11) {
        /*
            r10 = this;
            io.fabric.sdk.android.services.network.HttpRequest r0 = r10.getHttpRequest()
            java.lang.String r1 = r11.a
            java.net.HttpURLConnection r2 = r0.d()
            java.lang.String r3 = "X-CRASHLYTICS-API-KEY"
            r2.setRequestProperty(r3, r1)
            java.net.HttpURLConnection r1 = r0.d()
            java.lang.String r2 = "X-CRASHLYTICS-API-CLIENT-TYPE"
            java.lang.String r3 = "android"
            r1.setRequestProperty(r2, r3)
            l.a.a.a.k r1 = r10.kit
            java.lang.String r1 = r1.getVersion()
            java.net.HttpURLConnection r2 = r0.d()
            java.lang.String r3 = "X-CRASHLYTICS-API-CLIENT-VERSION"
            r2.setRequestProperty(r3, r1)
            java.lang.String r1 = "Failed to close app icon InputStream."
            java.lang.String r2 = r11.f5167b
            java.lang.String r3 = "app[identifier]"
            r0.c(r3, r2)
            java.lang.String r2 = r11.f5168f
            java.lang.String r3 = "app[name]"
            r0.c(r3, r2)
            java.lang.String r2 = r11.c
            java.lang.String r3 = "app[display_version]"
            r0.c(r3, r2)
            java.lang.String r2 = r11.d
            java.lang.String r3 = "app[build_version]"
            r0.c(r3, r2)
            int r2 = r11.f5169g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "app[source]"
            r0.a((java.lang.String) r3, (java.lang.Number) r2)
            java.lang.String r2 = r11.f5170h
            java.lang.String r3 = "app[minimum_sdk_version]"
            r0.c(r3, r2)
            java.lang.String r2 = r11.f5171i
            java.lang.String r3 = "app[built_sdk_version]"
            r0.c(r3, r2)
            java.lang.String r2 = r11.e
            boolean r2 = l.a.a.a.o.b.i.a((java.lang.String) r2)
            if (r2 != 0) goto L_0x006f
            java.lang.String r2 = r11.e
            java.lang.String r3 = "app[instance_identifier]"
            r0.c(r3, r2)
        L_0x006f:
            l.a.a.a.o.g.m r2 = r11.f5172j
            java.lang.String r3 = "Fabric"
            r4 = 0
            if (r2 == 0) goto L_0x00f8
            l.a.a.a.k r2 = r10.kit     // Catch:{ NotFoundException -> 0x00c8, all -> 0x00c6 }
            android.content.Context r2 = r2.getContext()     // Catch:{ NotFoundException -> 0x00c8, all -> 0x00c6 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ NotFoundException -> 0x00c8, all -> 0x00c6 }
            l.a.a.a.o.g.m r5 = r11.f5172j     // Catch:{ NotFoundException -> 0x00c8, all -> 0x00c6 }
            int r5 = r5.f5180b     // Catch:{ NotFoundException -> 0x00c8, all -> 0x00c6 }
            java.io.InputStream r2 = r2.openRawResource(r5)     // Catch:{ NotFoundException -> 0x00c8, all -> 0x00c6 }
            java.lang.String r5 = "app[icon][hash]"
            l.a.a.a.o.g.m r6 = r11.f5172j     // Catch:{ NotFoundException -> 0x00c4 }
            java.lang.String r6 = r6.a     // Catch:{ NotFoundException -> 0x00c4 }
            r0.c(r5, r6)     // Catch:{ NotFoundException -> 0x00c4 }
            java.lang.String r5 = "app[icon][data]"
            java.lang.String r6 = "icon.png"
            java.lang.String r7 = "application/octet-stream"
            r0.f()     // Catch:{ IOException -> 0x00bd }
            r0.a(r5, r6, r7)     // Catch:{ IOException -> 0x00bd }
            io.fabric.sdk.android.services.network.HttpRequest$e r5 = r0.d     // Catch:{ IOException -> 0x00bd }
            r0.a((java.io.InputStream) r2, (java.io.OutputStream) r5)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r5 = "app[icon][width]"
            l.a.a.a.o.g.m r6 = r11.f5172j     // Catch:{ NotFoundException -> 0x00c4 }
            int r6 = r6.c     // Catch:{ NotFoundException -> 0x00c4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NotFoundException -> 0x00c4 }
            r0.a((java.lang.String) r5, (java.lang.Number) r6)     // Catch:{ NotFoundException -> 0x00c4 }
            java.lang.String r5 = "app[icon][height]"
            l.a.a.a.o.g.m r6 = r11.f5172j     // Catch:{ NotFoundException -> 0x00c4 }
            int r6 = r6.d     // Catch:{ NotFoundException -> 0x00c4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NotFoundException -> 0x00c4 }
            r0.a((java.lang.String) r5, (java.lang.Number) r6)     // Catch:{ NotFoundException -> 0x00c4 }
            goto L_0x00ee
        L_0x00bd:
            r5 = move-exception
            io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException r6 = new io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException     // Catch:{ NotFoundException -> 0x00c4 }
            r6.<init>(r5)     // Catch:{ NotFoundException -> 0x00c4 }
            throw r6     // Catch:{ NotFoundException -> 0x00c4 }
        L_0x00c4:
            r5 = move-exception
            goto L_0x00cb
        L_0x00c6:
            r11 = move-exception
            goto L_0x00f4
        L_0x00c8:
            r2 = move-exception
            r5 = r2
            r2 = r4
        L_0x00cb:
            l.a.a.a.c r6 = l.a.a.a.f.a()     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r7.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r8 = "Failed to find app icon with resource ID: "
            r7.append(r8)     // Catch:{ all -> 0x00f2 }
            l.a.a.a.o.g.m r8 = r11.f5172j     // Catch:{ all -> 0x00f2 }
            int r8 = r8.f5180b     // Catch:{ all -> 0x00f2 }
            r7.append(r8)     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00f2 }
            r8 = 6
            boolean r6 = r6.a(r3, r8)     // Catch:{ all -> 0x00f2 }
            if (r6 == 0) goto L_0x00ee
            android.util.Log.e(r3, r7, r5)     // Catch:{ all -> 0x00f2 }
        L_0x00ee:
            l.a.a.a.o.b.i.a((java.io.Closeable) r2, (java.lang.String) r1)
            goto L_0x00f8
        L_0x00f2:
            r11 = move-exception
            r4 = r2
        L_0x00f4:
            l.a.a.a.o.b.i.a((java.io.Closeable) r4, (java.lang.String) r1)
            throw r11
        L_0x00f8:
            java.util.Collection<l.a.a.a.m> r1 = r11.f5173k
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0135
            java.util.Iterator r1 = r1.iterator()
        L_0x0102:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0135
            java.lang.Object r6 = r1.next()
            l.a.a.a.m r6 = (l.a.a.a.m) r6
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = r6.a
            r8[r2] = r9
            java.lang.String r9 = "app[build][libraries][%s][version]"
            java.lang.String r7 = java.lang.String.format(r7, r9, r8)
            java.lang.String r8 = r6.f5046b
            r0.c(r7, r8)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = r6.a
            r8[r2] = r9
            java.lang.String r9 = "app[build][libraries][%s][type]"
            java.lang.String r7 = java.lang.String.format(r7, r9, r8)
            java.lang.String r6 = r6.c
            r0.c(r7, r6)
            goto L_0x0102
        L_0x0135:
            l.a.a.a.c r1 = l.a.a.a.f.a()
            java.lang.String r5 = "Sending app info to "
            java.lang.StringBuilder r5 = i.a.a.a.a.a(r5)
            java.lang.String r6 = r10.getUrl()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 3
            boolean r1 = r1.a(r3, r6)
            if (r1 == 0) goto L_0x0154
            android.util.Log.d(r3, r5, r4)
        L_0x0154:
            l.a.a.a.o.g.m r1 = r11.f5172j
            if (r1 == 0) goto L_0x01a0
            l.a.a.a.c r1 = l.a.a.a.f.a()
            java.lang.String r5 = "App icon hash is "
            java.lang.StringBuilder r5 = i.a.a.a.a.a(r5)
            l.a.a.a.o.g.m r7 = r11.f5172j
            java.lang.String r7 = r7.a
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            boolean r1 = r1.a(r3, r6)
            if (r1 == 0) goto L_0x0176
            android.util.Log.d(r3, r5, r4)
        L_0x0176:
            l.a.a.a.c r1 = l.a.a.a.f.a()
            java.lang.String r5 = "App icon size is "
            java.lang.StringBuilder r5 = i.a.a.a.a.a(r5)
            l.a.a.a.o.g.m r7 = r11.f5172j
            int r7 = r7.c
            r5.append(r7)
            java.lang.String r7 = "x"
            r5.append(r7)
            l.a.a.a.o.g.m r11 = r11.f5172j
            int r11 = r11.d
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            boolean r1 = r1.a(r3, r6)
            if (r1 == 0) goto L_0x01a0
            android.util.Log.d(r3, r11, r4)
        L_0x01a0:
            int r11 = r0.c()
            java.net.HttpURLConnection r1 = r0.d()
            java.lang.String r1 = r1.getRequestMethod()
            java.lang.String r5 = "POST"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x01b7
            java.lang.String r1 = "Create"
            goto L_0x01b9
        L_0x01b7:
            java.lang.String r1 = "Update"
        L_0x01b9:
            l.a.a.a.c r5 = l.a.a.a.f.a()
            java.lang.String r7 = " app request ID: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a((java.lang.String) r1, (java.lang.String) r7)
            java.lang.String r7 = "X-REQUEST-ID"
            java.lang.String r0 = r0.a((java.lang.String) r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r1 = r5.a(r3, r6)
            if (r1 == 0) goto L_0x01d9
            android.util.Log.d(r3, r0, r4)
        L_0x01d9:
            l.a.a.a.c r0 = l.a.a.a.f.a()
            java.lang.String r1 = "Result was "
            java.lang.String r1 = i.a.a.a.a.b((java.lang.String) r1, (int) r11)
            boolean r0 = r0.a(r3, r6)
            if (r0 == 0) goto L_0x01ec
            android.util.Log.d(r3, r1, r4)
        L_0x01ec:
            int r11 = i.c.d.p.e.c((int) r11)
            if (r11 != 0) goto L_0x01f3
            r2 = 1
        L_0x01f3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.g.a.a(l.a.a.a.o.g.d):boolean");
    }
}
