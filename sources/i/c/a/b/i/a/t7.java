package i.c.a.b.i.a;

import i.c.a.b.d.l.q;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class t7 implements Runnable {
    public final URL e;

    /* renamed from: f  reason: collision with root package name */
    public final r5 f3883f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3884g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f3885h = null;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r7 f3886i;

    public t7(r7 r7Var, String str, URL url, r5 r5Var) {
        this.f3886i = r7Var;
        q.b(str);
        q.a(url);
        q.a(r5Var);
        this.e = url;
        this.f3883f = r5Var;
        this.f3884g = str;
    }

    public final void a(int i2, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        m5 k2 = this.f3886i.k();
        v7 v7Var = new v7(this, i2, exc, bArr, map);
        k2.o();
        q.a(v7Var);
        k2.a((q5<?>) new q5(k2, v7Var, "Task exception on worker thread"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            i.c.a.b.i.a.r7 r0 = r7.f3886i
            r0.b()
            r0 = 0
            r1 = 0
            i.c.a.b.i.a.r7 r2 = r7.f3886i     // Catch:{ IOException -> 0x0068, all -> 0x005c }
            java.net.URL r3 = r7.e     // Catch:{ IOException -> 0x0068, all -> 0x005c }
            java.net.HttpURLConnection r2 = r2.a((java.net.URL) r3)     // Catch:{ IOException -> 0x0068, all -> 0x005c }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f3885h     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f3885h     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            byte[] r4 = i.c.a.b.i.a.r7.a((java.net.HttpURLConnection) r2)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            r2.disconnect()
            r7.a(r1, r0, r4, r3)
            return
        L_0x004c:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x005f
        L_0x0051:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x006b
        L_0x0056:
            r3 = move-exception
            r4 = r0
            goto L_0x005f
        L_0x0059:
            r3 = move-exception
            r4 = r0
            goto L_0x006b
        L_0x005c:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r2.disconnect()
        L_0x0064:
            r7.a(r1, r0, r0, r4)
            throw r3
        L_0x0068:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.disconnect()
        L_0x0070:
            r7.a(r1, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t7.run():void");
    }
}
