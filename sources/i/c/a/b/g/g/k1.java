package i.c.a.b.g.g;

import android.content.Context;
import android.database.ContentObserver;
import g.a.a.b.a;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class k1 implements h1 {
    public static k1 c;
    @Nullable
    public final Context a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final ContentObserver f3335b;

    public k1(Context context) {
        this.a = context;
        this.f3335b = new m1();
        context.getContentResolver().registerContentObserver(b1.a, true, this.f3335b);
    }

    public static k1 a(Context context) {
        k1 k1Var;
        synchronized (k1.class) {
            if (c == null) {
                c = a.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new k1(context) : new k1();
            }
            k1Var = c;
        }
        return k1Var;
    }

    public k1() {
        this.a = null;
        this.f3335b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        android.os.Binder.restoreCallingIdentity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r5.length() != 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r5 = "Unable to read GServices for: ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r5 = new java.lang.String("Unable to read GServices for: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        android.util.Log.e("GservicesLoader", r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = i.c.a.b.g.g.b1.a(r4.a.getContentResolver(), r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010 A[ExcHandler: IllegalStateException | SecurityException (r0v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0046
        L_0x0006:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x0012, IllegalStateException -> 0x0010 }
            java.lang.String r5 = i.c.a.b.g.g.b1.a(r0, r5)     // Catch:{ SecurityException -> 0x0012, IllegalStateException -> 0x0010 }
            r1 = r5
            goto L_0x0046
        L_0x0010:
            r0 = move-exception
            goto L_0x002b
        L_0x0012:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
            android.content.Context r0 = r4.a     // Catch:{ all -> 0x0025 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = i.c.a.b.g.g.b1.a(r0, r5)     // Catch:{ all -> 0x0025 }
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
            r1 = r0
            goto L_0x0046
        L_0x0025:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
            throw r0     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003c
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0041
        L_0x003c:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0041:
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r5, r0)
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.k1.a(java.lang.String):java.lang.Object");
    }

    public static synchronized void a() {
        synchronized (k1.class) {
            if (!(c == null || c.a == null || c.f3335b == null)) {
                c.a.getContentResolver().unregisterContentObserver(c.f3335b);
            }
            c = null;
        }
    }
}
