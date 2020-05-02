package i.c.d.k;

import android.util.Pair;
import h.e.a;
import i.c.a.b.l.g;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class v {
    public final Executor a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public final Map<Pair<String, String>, g<a>> f4713b = new a();

    public v(Executor executor) {
        this.a = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized i.c.a.b.l.g<i.c.d.k.a> a(java.lang.String r6, java.lang.String r7, i.c.d.k.z0 r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x009b }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x009b }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, i.c.a.b.l.g<i.c.d.k.a>> r6 = r5.f4713b     // Catch:{ all -> 0x009b }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x009b }
            i.c.a.b.l.g r6 = (i.c.a.b.l.g) r6     // Catch:{ all -> 0x009b }
            r7 = 3
            if (r6 == 0) goto L_0x003b
            java.lang.String r8 = "FirebaseInstanceId"
            boolean r7 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x009b }
            if (r7 == 0) goto L_0x0039
            java.lang.String r7 = "FirebaseInstanceId"
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009b }
            int r0 = r8.length()     // Catch:{ all -> 0x009b }
            int r0 = r0 + 29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x009b }
            r1.append(r8)     // Catch:{ all -> 0x009b }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x009b }
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x009b }
        L_0x0039:
            monitor-exit(r5)
            return r6
        L_0x003b:
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x0063
            java.lang.String r6 = "FirebaseInstanceId"
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009b }
            int r1 = r7.length()     // Catch:{ all -> 0x009b }
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r2.<init>(r1)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "Making new request for: "
            r2.append(r1)     // Catch:{ all -> 0x009b }
            r2.append(r7)     // Catch:{ all -> 0x009b }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x009b }
            android.util.Log.d(r6, r7)     // Catch:{ all -> 0x009b }
        L_0x0063:
            com.google.firebase.iid.FirebaseInstanceId r6 = r8.a     // Catch:{ all -> 0x009b }
            java.lang.String r7 = r8.f4721b     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r8.c     // Catch:{ all -> 0x009b }
            java.lang.String r8 = r8.d     // Catch:{ all -> 0x009b }
            i.c.d.k.d1 r2 = r6.d     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0099
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x009b }
            r3.<init>()     // Catch:{ all -> 0x009b }
            i.c.a.b.l.g r3 = r2.a(r7, r1, r8, r3)     // Catch:{ all -> 0x009b }
            i.c.a.b.l.g r2 = r2.a(r3)     // Catch:{ all -> 0x009b }
            java.util.concurrent.Executor r3 = r6.a     // Catch:{ all -> 0x009b }
            i.c.d.k.b1 r4 = new i.c.d.k.b1     // Catch:{ all -> 0x009b }
            r4.<init>(r6, r1, r8, r7)     // Catch:{ all -> 0x009b }
            i.c.a.b.l.g r6 = r2.a((java.util.concurrent.Executor) r3, r4)     // Catch:{ all -> 0x009b }
            java.util.concurrent.Executor r7 = r5.a     // Catch:{ all -> 0x009b }
            i.c.d.k.w r8 = new i.c.d.k.w     // Catch:{ all -> 0x009b }
            r8.<init>(r5, r0)     // Catch:{ all -> 0x009b }
            i.c.a.b.l.g r6 = r6.b(r7, r8)     // Catch:{ all -> 0x009b }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, i.c.a.b.l.g<i.c.d.k.a>> r7 = r5.f4713b     // Catch:{ all -> 0x009b }
            r7.put(r0, r6)     // Catch:{ all -> 0x009b }
            monitor-exit(r5)
            return r6
        L_0x0099:
            r6 = 0
            throw r6     // Catch:{ all -> 0x009b }
        L_0x009b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.v.a(java.lang.String, java.lang.String, i.c.d.k.z0):i.c.a.b.l.g");
    }

    public final /* synthetic */ g a(Pair pair, g gVar) {
        synchronized (this) {
            this.f4713b.remove(pair);
        }
        return gVar;
    }
}
