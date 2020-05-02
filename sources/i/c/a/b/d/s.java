package i.c.a.b.d;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.q0;
import i.c.a.b.d.l.r0;
import i.c.a.b.e.b;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class s {
    public static volatile r0 a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f3167b = new Object();
    public static Context c;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<i.c.a.b.d.s> r0 = i.c.a.b.d.s.class
            monitor-enter(r0)
            android.content.Context r1 = c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.s.a(android.content.Context):void");
    }

    public static b0 b(String str, t tVar, boolean z, boolean z2) {
        try {
            if (a == null) {
                q.a(c);
                synchronized (f3167b) {
                    if (a == null) {
                        a = q0.a(DynamiteModule.a(c, DynamiteModule.f504j, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            q.a(c);
            try {
                if (a.a(new z(str, tVar, z, z2), new b(c.getPackageManager()))) {
                    return b0.d;
                }
                return b0.a((Callable<String>) new u(z, str, tVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return new b0(false, "module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return new b0(false, valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    public static b0 a(String str, t tVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, tVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
