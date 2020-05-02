package i.c.d.k;

import android.text.TextUtils;
import h.e.a;
import i.c.a.b.l.h;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class e0 {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, h<Void>> f4691b = new a();
    public final z c;

    public e0(z zVar) {
        this.c = zVar;
    }

    public final synchronized boolean a() {
        return b() != null;
    }

    public final String b() {
        String a2;
        synchronized (this.c) {
            a2 = this.c.a();
        }
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String[] split = a2.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = r0.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r3.length != 2) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r4 = r3[0];
        r3 = r3[1];
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r7 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r7 == 83) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r7 == 85) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r4.equals("U") == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r4.equals("S") == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r5 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r5 == 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        r10.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.h() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        android.util.Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r10.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.h() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        android.util.Log.d("FirebaseInstanceId", "subscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r3.getMessage()) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r3.getMessage() == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        android.util.Log.e("FirebaseInstanceId", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r3 = r3.getMessage();
        r5 = new java.lang.StringBuilder(i.a.a.a.a.a(r3, 53));
        r5.append("Topic operation failed: ");
        r5.append(r3);
        r5.append(". Will retry Topic operation.");
        android.util.Log.e("FirebaseInstanceId", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        if (r2 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2 = r9.f4691b.remove(java.lang.Integer.valueOf(r9.a));
        a(r0);
        r9.a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        if (r2 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        r2.a.a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.firebase.iid.FirebaseInstanceId r10) {
        /*
            r9 = this;
        L_0x0000:
            monitor-enter(r9)
            java.lang.String r0 = r9.b()     // Catch:{ all -> 0x00e2 }
            r1 = 1
            if (r0 != 0) goto L_0x0017
            boolean r10 = com.google.firebase.iid.FirebaseInstanceId.h()     // Catch:{ all -> 0x00e2 }
            if (r10 == 0) goto L_0x0015
            java.lang.String r10 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r10, r0)     // Catch:{ all -> 0x00e2 }
        L_0x0015:
            monitor-exit(r9)     // Catch:{ all -> 0x00e2 }
            return r1
        L_0x0017:
            monitor-exit(r9)     // Catch:{ all -> 0x00e2 }
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "!"
            java.lang.String[] r3 = r0.split(r3)
            int r4 = r3.length
            r5 = 2
            r6 = 0
            if (r4 != r5) goto L_0x00b9
            r4 = r3[r6]
            r3 = r3[r1]
            r5 = -1
            int r7 = r4.hashCode()     // Catch:{ IOException -> 0x006d }
            r8 = 83
            if (r7 == r8) goto L_0x0041
            r8 = 85
            if (r7 == r8) goto L_0x0037
            goto L_0x004a
        L_0x0037:
            java.lang.String r7 = "U"
            boolean r4 = r4.equals(r7)     // Catch:{ IOException -> 0x006d }
            if (r4 == 0) goto L_0x004a
            r5 = 1
            goto L_0x004a
        L_0x0041:
            java.lang.String r7 = "S"
            boolean r4 = r4.equals(r7)     // Catch:{ IOException -> 0x006d }
            if (r4 == 0) goto L_0x004a
            r5 = 0
        L_0x004a:
            if (r5 == 0) goto L_0x005e
            if (r5 == r1) goto L_0x004f
            goto L_0x00b9
        L_0x004f:
            r10.b(r3)     // Catch:{ IOException -> 0x006d }
            boolean r3 = com.google.firebase.iid.FirebaseInstanceId.h()     // Catch:{ IOException -> 0x006d }
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = "unsubscribe operation succeeded"
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x006d }
            goto L_0x00b9
        L_0x005e:
            r10.a((java.lang.String) r3)     // Catch:{ IOException -> 0x006d }
            boolean r3 = com.google.firebase.iid.FirebaseInstanceId.h()     // Catch:{ IOException -> 0x006d }
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = "subscribe operation succeeded"
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x006d }
            goto L_0x00b9
        L_0x006d:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "SERVICE_NOT_AVAILABLE"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0094
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "INTERNAL_SERVER_ERROR"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            java.lang.String r4 = r3.getMessage()
            if (r4 != 0) goto L_0x0093
            java.lang.String r3 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r2, r3)
            goto L_0x00b7
        L_0x0093:
            throw r3
        L_0x0094:
            java.lang.String r3 = r3.getMessage()
            r4 = 53
            int r4 = i.a.a.a.a.a((java.lang.String) r3, (int) r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Topic operation failed: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ". Will retry Topic operation."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.e(r2, r3)
        L_0x00b7:
            r2 = 0
            goto L_0x00ba
        L_0x00b9:
            r2 = 1
        L_0x00ba:
            if (r2 != 0) goto L_0x00bd
            return r6
        L_0x00bd:
            monitor-enter(r9)
            java.util.Map<java.lang.Integer, i.c.a.b.l.h<java.lang.Void>> r2 = r9.f4691b     // Catch:{ all -> 0x00df }
            int r3 = r9.a     // Catch:{ all -> 0x00df }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00df }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x00df }
            i.c.a.b.l.h r2 = (i.c.a.b.l.h) r2     // Catch:{ all -> 0x00df }
            r9.a((java.lang.String) r0)     // Catch:{ all -> 0x00df }
            int r0 = r9.a     // Catch:{ all -> 0x00df }
            int r0 = r0 + r1
            r9.a = r0     // Catch:{ all -> 0x00df }
            monitor-exit(r9)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            i.c.a.b.l.d0<TResult> r1 = r2.a
            r1.a(r0)
            goto L_0x0000
        L_0x00df:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00df }
            throw r10
        L_0x00e2:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00e2 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.e0.a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    public final synchronized boolean a(String str) {
        synchronized (this.c) {
            String a2 = this.c.a();
            String valueOf = String.valueOf(str);
            if (!a2.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                return false;
            }
            String valueOf2 = String.valueOf(str);
            this.c.a(a2.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
            return true;
        }
    }
}
