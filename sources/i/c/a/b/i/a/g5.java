package i.c.a.b.i.a;

import android.content.ServiceConnection;
import i.c.a.b.g.g.b2;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class g5 implements Runnable {
    public final /* synthetic */ b2 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f3680f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h5 f3681g;

    public g5(h5 h5Var, b2 b2Var, ServiceConnection serviceConnection) {
        this.f3681g = h5Var;
        this.e = b2Var;
        this.f3680f = serviceConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            i.c.a.b.i.a.h5 r0 = r14.f3681g
            i.c.a.b.i.a.e5 r1 = r0.f3691b
            java.lang.String r0 = r0.a
            i.c.a.b.g.g.b2 r2 = r14.e
            android.content.ServiceConnection r3 = r14.f3680f
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.m5 r4 = r4.k()
            r4.c()
            r4 = 0
            if (r2 != 0) goto L_0x0024
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            java.lang.String r2 = "Attempting to use Install Referrer Service while it is not initialized"
            r0.a(r2)
            goto L_0x0054
        L_0x0024:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "package_name"
            r5.putString(r6, r0)
            android.os.Bundle r0 = r2.a(r5)     // Catch:{ Exception -> 0x0042 }
            if (r0 != 0) goto L_0x0055
            i.c.a.b.i.a.s5 r0 = r1.a     // Catch:{ Exception -> 0x0042 }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ Exception -> 0x0042 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "Install Referrer Service returned a null response"
            r0.a(r2)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0054
        L_0x0042:
            r0 = move-exception
            i.c.a.b.i.a.s5 r2 = r1.a
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3758f
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "Exception occurred while retrieving the Install Referrer"
            r2.a(r5, r0)
        L_0x0054:
            r0 = r4
        L_0x0055:
            i.c.a.b.i.a.s5 r2 = r1.a
            i.c.a.b.i.a.m5 r2 = r2.k()
            r2.c()
            if (r0 == 0) goto L_0x0188
            r5 = 0
            java.lang.String r2 = "install_begin_timestamp_seconds"
            long r7 = r0.getLong(r2, r5)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x007f
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r2 = "Service response is missing Install Referrer install timestamp"
            r0.a(r2)
            goto L_0x0188
        L_0x007f:
            java.lang.String r2 = "install_referrer"
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x017b
            boolean r11 = r2.isEmpty()
            if (r11 == 0) goto L_0x008f
            goto L_0x017b
        L_0x008f:
            i.c.a.b.i.a.s5 r11 = r1.a
            i.c.a.b.i.a.m4 r11 = r11.n()
            i.c.a.b.i.a.o4 r11 = r11.f3766n
            java.lang.String r12 = "InstallReferrer API result"
            r11.a(r12, r2)
            i.c.a.b.i.a.s5 r11 = r1.a
            i.c.a.b.i.a.ca r11 = r11.p()
            java.lang.String r12 = "?"
            int r13 = r2.length()
            if (r13 == 0) goto L_0x00af
            java.lang.String r2 = r12.concat(r2)
            goto L_0x00b4
        L_0x00af:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r12)
        L_0x00b4:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.os.Bundle r2 = r11.a((android.net.Uri) r2)
            if (r2 != 0) goto L_0x00cd
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r2 = "No campaign params defined in Install Referrer result"
            r0.a(r2)
            goto L_0x0188
        L_0x00cd:
            java.lang.String r11 = "medium"
            java.lang.String r11 = r2.getString(r11)
            if (r11 == 0) goto L_0x00e7
            java.lang.String r12 = "(not set)"
            boolean r12 = r12.equalsIgnoreCase(r11)
            if (r12 != 0) goto L_0x00e7
            java.lang.String r12 = "organic"
            boolean r11 = r12.equalsIgnoreCase(r11)
            if (r11 != 0) goto L_0x00e7
            r11 = 1
            goto L_0x00e8
        L_0x00e7:
            r11 = 0
        L_0x00e8:
            if (r11 == 0) goto L_0x010a
            java.lang.String r11 = "referrer_click_timestamp_seconds"
            long r11 = r0.getLong(r11, r5)
            long r11 = r11 * r9
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r2 = "Install Referrer is missing click timestamp for ad campaign"
            r0.a(r2)
            goto L_0x0188
        L_0x0105:
            java.lang.String r0 = "click_timestamp"
            r2.putLong(r0, r11)
        L_0x010a:
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.x4 r0 = r0.i()
            i.c.a.b.i.a.d5 r0 = r0.f3934k
            long r5 = r0.a()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x012a
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.oa r2 = r0.f3860f
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3766n
            java.lang.String r2 = "Install Referrer campaign has already been logged"
            r0.a(r2)
            goto L_0x0188
        L_0x012a:
            i.c.a.b.g.g.x8 r0 = i.c.a.b.g.g.x8.f3525f
            java.lang.Object r0 = r0.a()
            i.c.a.b.g.g.w8 r0 = (i.c.a.b.g.g.w8) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x014c
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.X0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r5)
            if (r0 == 0) goto L_0x014c
            i.c.a.b.i.a.s5 r0 = r1.a
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0188
        L_0x014c:
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.x4 r0 = r0.i()
            i.c.a.b.i.a.d5 r0 = r0.f3934k
            r0.a(r7)
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.oa r5 = r0.f3860f
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3766n
            java.lang.String r5 = "referrer API"
            java.lang.String r6 = "Logging Install Referrer campaign from sdk with "
            r0.a(r6, r5)
            java.lang.String r0 = "_cis"
            r2.putString(r0, r5)
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.t6 r0 = r0.o()
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_cmp"
            r0.a((java.lang.String) r5, (java.lang.String) r6, (android.os.Bundle) r2)
            goto L_0x0188
        L_0x017b:
            i.c.a.b.i.a.s5 r0 = r1.a
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r2 = "No referrer defined in Install Referrer response"
            r0.a(r2)
        L_0x0188:
            if (r3 == 0) goto L_0x0199
            i.c.a.b.d.n.a r0 = i.c.a.b.d.n.a.a()
            i.c.a.b.i.a.s5 r1 = r1.a
            android.content.Context r1 = r1.a
            if (r0 == 0) goto L_0x0198
            r1.unbindService(r3)
            goto L_0x0199
        L_0x0198:
            throw r4
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.g5.run():void");
    }
}
