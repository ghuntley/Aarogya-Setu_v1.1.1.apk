package i.c.a.b.g.g;

import android.content.Context;
import android.os.Bundle;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class b extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f3212i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3213j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Context f3214k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Bundle f3215l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ rc f3216m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(rc rcVar, String str, String str2, Context context, Bundle bundle) {
        super(true);
        this.f3216m = rcVar;
        this.f3212i = str;
        this.f3213j = str2;
        this.f3214k = context;
        this.f3215l = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad A[Catch:{ Exception -> 0x00ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            i.c.a.b.g.g.rc r2 = r14.f3216m     // Catch:{ Exception -> 0x00ae }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ae }
            r3.<init>()     // Catch:{ Exception -> 0x00ae }
            r2.d = r3     // Catch:{ Exception -> 0x00ae }
            java.lang.String r2 = r14.f3212i     // Catch:{ Exception -> 0x00ae }
            java.lang.String r3 = r14.f3213j     // Catch:{ Exception -> 0x00ae }
            boolean r2 = i.c.a.b.g.g.rc.a(r2, r3)     // Catch:{ Exception -> 0x00ae }
            r3 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r14.f3213j     // Catch:{ Exception -> 0x00ae }
            java.lang.String r4 = r14.f3212i     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.g.g.rc r5 = r14.f3216m     // Catch:{ Exception -> 0x00ae }
            java.lang.String r5 = r5.a     // Catch:{ Exception -> 0x00ae }
            r11 = r2
            r10 = r4
            r9 = r5
            goto L_0x0025
        L_0x0022:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x0025:
            android.content.Context r2 = r14.f3214k     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.g.g.rc.b(r2)     // Catch:{ Exception -> 0x00ae }
            java.lang.Boolean r2 = i.c.a.b.g.g.rc.f3430j     // Catch:{ Exception -> 0x00ae }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00ae }
            if (r2 != 0) goto L_0x0037
            if (r10 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r2 = 0
            goto L_0x0038
        L_0x0037:
            r2 = 1
        L_0x0038:
            i.c.a.b.g.g.rc r4 = r14.f3216m     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.g.g.rc r5 = r14.f3216m     // Catch:{ Exception -> 0x00ae }
            android.content.Context r6 = r14.f3214k     // Catch:{ Exception -> 0x00ae }
            if (r5 == 0) goto L_0x00ad
            java.lang.String r7 = "com.google.android.gms.measurement.dynamite"
            if (r2 == 0) goto L_0x0047
            com.google.android.gms.dynamite.DynamiteModule$a r8 = com.google.android.gms.dynamite.DynamiteModule.f505k     // Catch:{ LoadingException -> 0x0058 }
            goto L_0x0049
        L_0x0047:
            com.google.android.gms.dynamite.DynamiteModule$a r8 = com.google.android.gms.dynamite.DynamiteModule.f503i     // Catch:{ LoadingException -> 0x0058 }
        L_0x0049:
            com.google.android.gms.dynamite.DynamiteModule r6 = com.google.android.gms.dynamite.DynamiteModule.a((android.content.Context) r6, (com.google.android.gms.dynamite.DynamiteModule.a) r8, (java.lang.String) r7)     // Catch:{ LoadingException -> 0x0058 }
            java.lang.String r8 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"
            android.os.IBinder r6 = r6.a((java.lang.String) r8)     // Catch:{ LoadingException -> 0x0058 }
            i.c.a.b.g.g.ma r3 = i.c.a.b.g.g.l9.asInterface(r6)     // Catch:{ LoadingException -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r6 = move-exception
            r5.a(r6, r1, r0)     // Catch:{ Exception -> 0x00ae }
        L_0x005c:
            r4.f3435g = r3     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.g.g.rc r3 = r14.f3216m     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.g.g.ma r3 = r3.f3435g     // Catch:{ Exception -> 0x00ae }
            if (r3 != 0) goto L_0x006e
            i.c.a.b.g.g.rc r2 = r14.f3216m     // Catch:{ Exception -> 0x00ae }
            java.lang.String r2 = r2.a     // Catch:{ Exception -> 0x00ae }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x00ae }
            return
        L_0x006e:
            android.content.Context r3 = r14.f3214k     // Catch:{ Exception -> 0x00ae }
            int r3 = com.google.android.gms.dynamite.DynamiteModule.a(r3, r7)     // Catch:{ Exception -> 0x00ae }
            android.content.Context r4 = r14.f3214k     // Catch:{ Exception -> 0x00ae }
            int r4 = com.google.android.gms.dynamite.DynamiteModule.a((android.content.Context) r4, (java.lang.String) r7, (boolean) r0)     // Catch:{ Exception -> 0x00ae }
            if (r2 == 0) goto L_0x0087
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x00ae }
            if (r4 >= r3) goto L_0x0084
            r3 = 1
            goto L_0x0085
        L_0x0084:
            r3 = 0
        L_0x0085:
            r8 = r3
            goto L_0x0091
        L_0x0087:
            if (r3 <= 0) goto L_0x008a
            r4 = r3
        L_0x008a:
            if (r3 <= 0) goto L_0x008e
            r2 = 1
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            r8 = r2
            r2 = r4
        L_0x0091:
            i.c.a.b.g.g.pc r13 = new i.c.a.b.g.g.pc     // Catch:{ Exception -> 0x00ae }
            r4 = 25001(0x61a9, double:1.2352E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x00ae }
            android.os.Bundle r12 = r14.f3215l     // Catch:{ Exception -> 0x00ae }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.g.g.rc r2 = r14.f3216m     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.g.g.ma r2 = r2.f3435g     // Catch:{ Exception -> 0x00ae }
            android.content.Context r3 = r14.f3214k     // Catch:{ Exception -> 0x00ae }
            i.c.a.b.e.b r4 = new i.c.a.b.e.b     // Catch:{ Exception -> 0x00ae }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00ae }
            long r5 = r14.e     // Catch:{ Exception -> 0x00ae }
            r2.initialize(r4, r13, r5)     // Catch:{ Exception -> 0x00ae }
            return
        L_0x00ad:
            throw r3     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            r2 = move-exception
            i.c.a.b.g.g.rc r3 = r14.f3216m
            r3.a(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.b.a():void");
    }
}
