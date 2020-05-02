package i.c.a.b.i.a;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class j4 extends c3 {
    public String c;
    public String d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public String f3724f;

    /* renamed from: g  reason: collision with root package name */
    public long f3725g;

    /* renamed from: h  reason: collision with root package name */
    public long f3726h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f3727i;

    /* renamed from: j  reason: collision with root package name */
    public int f3728j;

    /* renamed from: k  reason: collision with root package name */
    public String f3729k;

    /* renamed from: l  reason: collision with root package name */
    public String f3730l;

    /* renamed from: m  reason: collision with root package name */
    public String f3731m;

    public j4(s5 s5Var, long j2) {
        super(s5Var);
        this.f3726h = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0179, code lost:
        if (r2 == 0) goto L_0x017b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0260 A[Catch:{ IllegalStateException -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0281 A[Catch:{ IllegalStateException -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ec A[SYNTHETIC, Splitter:B:138:0x02ec] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01fb A[Catch:{ IllegalStateException -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fd A[Catch:{ IllegalStateException -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x020a A[SYNTHETIC, Splitter:B:91:0x020a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r14 = this;
            i.c.a.b.i.a.s5 r0 = r14.a
            android.content.Context r0 = r0.a
            java.lang.String r0 = r0.getPackageName()
            i.c.a.b.i.a.s5 r1 = r14.a
            android.content.Context r1 = r1.a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002b
            i.c.a.b.i.a.m4 r7 = r14.n()
            i.c.a.b.i.a.o4 r7 = r7.f3758f
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.a(r9, r8)
            goto L_0x0086
        L_0x002b:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0030 }
            goto L_0x003f
        L_0x0030:
            i.c.a.b.i.a.m4 r7 = r14.n()
            i.c.a.b.i.a.o4 r7 = r7.f3758f
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.a(r9, r8)
        L_0x003f:
            if (r5 != 0) goto L_0x0044
            java.lang.String r5 = "manual_install"
            goto L_0x004d
        L_0x0044:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x004d
            r5 = r3
        L_0x004d:
            i.c.a.b.i.a.s5 r7 = r14.a     // Catch:{ NameNotFoundException -> 0x0075 }
            android.content.Context r7 = r7.a     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0075 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r7 == 0) goto L_0x0086
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0075 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r9 != 0) goto L_0x006c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x006d
        L_0x006c:
            r8 = r2
        L_0x006d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0072 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0072 }
            goto L_0x0086
        L_0x0072:
            r7 = r2
            r2 = r8
            goto L_0x0076
        L_0x0075:
            r7 = r2
        L_0x0076:
            i.c.a.b.i.a.m4 r8 = r14.n()
            i.c.a.b.i.a.o4 r8 = r8.f3758f
            java.lang.Object r9 = i.c.a.b.i.a.m4.a((java.lang.String) r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.a(r10, r9, r2)
            r2 = r7
        L_0x0086:
            r14.c = r0
            r14.f3724f = r5
            r14.d = r2
            r14.e = r6
            r5 = 0
            r14.f3725g = r5
            i.c.a.b.i.a.s5 r2 = r14.a
            i.c.a.b.i.a.oa r5 = r2.f3860f
            android.content.Context r2 = r2.a
            com.google.android.gms.common.api.Status r2 = i.c.a.b.d.k.h.h.a((android.content.Context) r2)
            r5 = 1
            if (r2 == 0) goto L_0x00a7
            boolean r6 = r2.d()
            if (r6 == 0) goto L_0x00a7
            r6 = 1
            goto L_0x00a8
        L_0x00a7:
            r6 = 0
        L_0x00a8:
            i.c.a.b.i.a.s5 r7 = r14.a
            java.lang.String r7 = r7.f3859b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00c0
            i.c.a.b.i.a.s5 r7 = r14.a
            java.lang.String r7 = r7.c
            java.lang.String r8 = "am"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00c0
            r7 = 1
            goto L_0x00c1
        L_0x00c0:
            r7 = 0
        L_0x00c1:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00d2
            i.c.a.b.i.a.m4 r2 = r14.n()
            i.c.a.b.i.a.o4 r2 = r2.f3759g
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r2.a(r8)
            goto L_0x00e5
        L_0x00d2:
            i.c.a.b.i.a.m4 r8 = r14.n()
            i.c.a.b.i.a.o4 r8 = r8.f3759g
            int r9 = r2.f476f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.f477g
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.a(r10, r9, r2)
        L_0x00e5:
            if (r6 == 0) goto L_0x01df
            boolean r2 = i.c.a.b.g.g.j9.b()
            if (r2 == 0) goto L_0x017d
            i.c.a.b.i.a.s5 r2 = r14.a
            i.c.a.b.i.a.pa r2 = r2.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r6 = i.c.a.b.i.a.o.Y0
            boolean r2 = r2.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r6)
            if (r2 == 0) goto L_0x017d
            i.c.a.b.i.a.s5 r2 = r14.a
            int r2 = r2.c()
            switch(r2) {
                case 0: goto L_0x015b;
                case 1: goto L_0x014f;
                case 2: goto L_0x0143;
                case 3: goto L_0x0137;
                case 4: goto L_0x012b;
                case 5: goto L_0x011f;
                case 6: goto L_0x0113;
                case 7: goto L_0x0107;
                default: goto L_0x0102;
            }
        L_0x0102:
            i.c.a.b.i.a.m4 r6 = r14.n()
            goto L_0x0167
        L_0x0107:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3764l
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r6.a(r8)
            goto L_0x0179
        L_0x0113:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3763k
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r6.a(r8)
            goto L_0x0179
        L_0x011f:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3766n
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r6.a(r8)
            goto L_0x0179
        L_0x012b:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3764l
            java.lang.String r8 = "App measurement disabled via the manifest"
            r6.a(r8)
            goto L_0x0179
        L_0x0137:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3764l
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r6.a(r8)
            goto L_0x0179
        L_0x0143:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3766n
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r6.a(r8)
            goto L_0x0179
        L_0x014f:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3764l
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r6.a(r8)
            goto L_0x0179
        L_0x015b:
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3766n
            java.lang.String r8 = "App measurement collection enabled"
            r6.a(r8)
            goto L_0x0179
        L_0x0167:
            i.c.a.b.i.a.o4 r6 = r6.f3764l
            java.lang.String r8 = "App measurement disabled"
            r6.a(r8)
            i.c.a.b.i.a.m4 r6 = r14.n()
            i.c.a.b.i.a.o4 r6 = r6.f3759g
            java.lang.String r8 = "Invalid scion state in identity"
            r6.a(r8)
        L_0x0179:
            if (r2 != 0) goto L_0x01df
        L_0x017b:
            r2 = 1
            goto L_0x01e0
        L_0x017d:
            i.c.a.b.i.a.s5 r2 = r14.a
            i.c.a.b.i.a.pa r2 = r2.f3861g
            java.lang.Boolean r2 = r2.r()
            i.c.a.b.i.a.s5 r6 = r14.a
            i.c.a.b.i.a.pa r6 = r6.f3861g
            boolean r6 = r6.q()
            if (r6 == 0) goto L_0x01a3
            i.c.a.b.i.a.s5 r2 = r14.a
            boolean r2 = r2.r()
            if (r2 == 0) goto L_0x01df
            i.c.a.b.i.a.m4 r2 = r14.n()
            i.c.a.b.i.a.o4 r2 = r2.f3764l
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r2.a(r6)
            goto L_0x01df
        L_0x01a3:
            if (r2 == 0) goto L_0x01bf
            boolean r6 = r2.booleanValue()
            if (r6 != 0) goto L_0x01bf
            i.c.a.b.i.a.s5 r2 = r14.a
            boolean r2 = r2.r()
            if (r2 == 0) goto L_0x01df
            i.c.a.b.i.a.m4 r2 = r14.n()
            i.c.a.b.i.a.o4 r2 = r2.f3764l
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r2.a(r6)
            goto L_0x01df
        L_0x01bf:
            if (r2 != 0) goto L_0x01d3
            boolean r2 = i.c.a.b.d.k.h.h.b()
            if (r2 == 0) goto L_0x01d3
            i.c.a.b.i.a.m4 r2 = r14.n()
            i.c.a.b.i.a.o4 r2 = r2.f3764l
            java.lang.String r6 = "Collection disabled with google_app_measurement_enable=0"
            r2.a(r6)
            goto L_0x01df
        L_0x01d3:
            i.c.a.b.i.a.m4 r2 = r14.n()
            i.c.a.b.i.a.o4 r2 = r2.f3766n
            java.lang.String r6 = "Collection enabled"
            r2.a(r6)
            goto L_0x017b
        L_0x01df:
            r2 = 0
        L_0x01e0:
            r14.f3729k = r3
            r14.f3730l = r3
            r14.f3731m = r3
            i.c.a.b.i.a.s5 r6 = r14.a
            i.c.a.b.i.a.oa r8 = r6.f3860f
            if (r7 == 0) goto L_0x01f0
            java.lang.String r6 = r6.f3859b
            r14.f3730l = r6
        L_0x01f0:
            r6 = 0
            java.lang.String r7 = i.c.a.b.d.k.h.h.a()     // Catch:{ IllegalStateException -> 0x029c }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x029c }
            if (r8 == 0) goto L_0x01fd
            r8 = r3
            goto L_0x01fe
        L_0x01fd:
            r8 = r7
        L_0x01fe:
            r14.f3729k = r8     // Catch:{ IllegalStateException -> 0x029c }
            boolean r8 = i.c.a.b.g.g.x9.b()     // Catch:{ IllegalStateException -> 0x029c }
            java.lang.String r9 = "admob_app_id"
            java.lang.String r10 = "string"
            if (r8 == 0) goto L_0x025a
            i.c.a.b.i.a.s5 r8 = r14.a     // Catch:{ IllegalStateException -> 0x029c }
            i.c.a.b.i.a.pa r8 = r8.f3861g     // Catch:{ IllegalStateException -> 0x029c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r11 = i.c.a.b.i.a.o.I0     // Catch:{ IllegalStateException -> 0x029c }
            boolean r8 = r8.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r11)     // Catch:{ IllegalStateException -> 0x029c }
            if (r8 == 0) goto L_0x025a
            i.c.a.b.i.a.s5 r8 = r14.a     // Catch:{ IllegalStateException -> 0x029c }
            android.content.Context r8 = r8.a     // Catch:{ IllegalStateException -> 0x029c }
            i.c.a.b.d.l.q.a(r8)     // Catch:{ IllegalStateException -> 0x029c }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IllegalStateException -> 0x029c }
            int r11 = i.c.a.b.d.i.common_google_play_services_unknown_issue     // Catch:{ IllegalStateException -> 0x029c }
            java.lang.String r11 = r8.getResourcePackageName(r11)     // Catch:{ IllegalStateException -> 0x029c }
            java.lang.String r12 = "ga_app_id"
            int r12 = r8.getIdentifier(r12, r10, r11)     // Catch:{ IllegalStateException -> 0x029c }
            if (r12 != 0) goto L_0x0231
            r12 = r6
            goto L_0x0235
        L_0x0231:
            java.lang.String r12 = r8.getString(r12)     // Catch:{ IllegalStateException -> 0x029c }
        L_0x0235:
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IllegalStateException -> 0x029c }
            if (r13 == 0) goto L_0x023c
            goto L_0x023d
        L_0x023c:
            r3 = r12
        L_0x023d:
            r14.f3731m = r3     // Catch:{ IllegalStateException -> 0x029c }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x029c }
            if (r3 == 0) goto L_0x024b
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IllegalStateException -> 0x029c }
            if (r3 != 0) goto L_0x027f
        L_0x024b:
            int r3 = r8.getIdentifier(r9, r10, r11)     // Catch:{ IllegalStateException -> 0x029c }
            if (r3 != 0) goto L_0x0253
            r3 = r6
            goto L_0x0257
        L_0x0253:
            java.lang.String r3 = r8.getString(r3)     // Catch:{ IllegalStateException -> 0x029c }
        L_0x0257:
            r14.f3730l = r3     // Catch:{ IllegalStateException -> 0x029c }
            goto L_0x027f
        L_0x025a:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x029c }
            if (r3 != 0) goto L_0x027f
            i.c.a.b.i.a.s5 r3 = r14.a     // Catch:{ IllegalStateException -> 0x029c }
            android.content.Context r3 = r3.a     // Catch:{ IllegalStateException -> 0x029c }
            i.c.a.b.d.l.q.a(r3)     // Catch:{ IllegalStateException -> 0x029c }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ IllegalStateException -> 0x029c }
            int r7 = i.c.a.b.d.i.common_google_play_services_unknown_issue     // Catch:{ IllegalStateException -> 0x029c }
            java.lang.String r7 = r3.getResourcePackageName(r7)     // Catch:{ IllegalStateException -> 0x029c }
            int r7 = r3.getIdentifier(r9, r10, r7)     // Catch:{ IllegalStateException -> 0x029c }
            if (r7 != 0) goto L_0x0279
            r3 = r6
            goto L_0x027d
        L_0x0279:
            java.lang.String r3 = r3.getString(r7)     // Catch:{ IllegalStateException -> 0x029c }
        L_0x027d:
            r14.f3730l = r3     // Catch:{ IllegalStateException -> 0x029c }
        L_0x027f:
            if (r2 == 0) goto L_0x02ac
            i.c.a.b.i.a.m4 r2 = r14.n()     // Catch:{ IllegalStateException -> 0x029c }
            i.c.a.b.i.a.o4 r2 = r2.f3766n     // Catch:{ IllegalStateException -> 0x029c }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r7 = r14.c     // Catch:{ IllegalStateException -> 0x029c }
            java.lang.String r8 = r14.f3729k     // Catch:{ IllegalStateException -> 0x029c }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x029c }
            if (r8 == 0) goto L_0x0296
            java.lang.String r8 = r14.f3730l     // Catch:{ IllegalStateException -> 0x029c }
            goto L_0x0298
        L_0x0296:
            java.lang.String r8 = r14.f3729k     // Catch:{ IllegalStateException -> 0x029c }
        L_0x0298:
            r2.a(r3, r7, r8)     // Catch:{ IllegalStateException -> 0x029c }
            goto L_0x02ac
        L_0x029c:
            r2 = move-exception
            i.c.a.b.i.a.m4 r3 = r14.n()
            i.c.a.b.i.a.o4 r3 = r3.f3758f
            java.lang.Object r0 = i.c.a.b.i.a.m4.a((java.lang.String) r0)
            java.lang.String r7 = "Fetching Google App Id failed with exception. appId"
            r3.a(r7, r0, r2)
        L_0x02ac:
            r14.f3727i = r6
            i.c.a.b.i.a.s5 r0 = r14.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.m0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r0 == 0) goto L_0x0348
            i.c.a.b.i.a.s5 r0 = r14.a
            i.c.a.b.i.a.oa r2 = r0.f3860f
            i.c.a.b.i.a.pa r0 = r0.f3861g
            java.lang.String r2 = "analytics.safelisted_events"
            if (r0 == 0) goto L_0x0347
            i.c.a.b.d.l.q.b((java.lang.String) r2)
            android.os.Bundle r3 = r0.u()
            if (r3 != 0) goto L_0x02d9
            i.c.a.b.i.a.m4 r2 = r0.n()
            i.c.a.b.i.a.o4 r2 = r2.f3758f
            java.lang.String r3 = "Failed to load metadata: Metadata bundle is null"
            r2.a(r3)
            goto L_0x02df
        L_0x02d9:
            boolean r7 = r3.containsKey(r2)
            if (r7 != 0) goto L_0x02e1
        L_0x02df:
            r2 = r6
            goto L_0x02e9
        L_0x02e1:
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x02e9:
            if (r2 != 0) goto L_0x02ec
            goto L_0x0310
        L_0x02ec:
            i.c.a.b.i.a.s5 r3 = r0.a     // Catch:{ NotFoundException -> 0x0304 }
            android.content.Context r3 = r3.a     // Catch:{ NotFoundException -> 0x0304 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ NotFoundException -> 0x0304 }
            int r2 = r2.intValue()     // Catch:{ NotFoundException -> 0x0304 }
            java.lang.String[] r2 = r3.getStringArray(r2)     // Catch:{ NotFoundException -> 0x0304 }
            if (r2 != 0) goto L_0x02ff
            goto L_0x0310
        L_0x02ff:
            java.util.List r6 = java.util.Arrays.asList(r2)     // Catch:{ NotFoundException -> 0x0304 }
            goto L_0x0310
        L_0x0304:
            r2 = move-exception
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r3 = "Failed to load string array from metadata: resource not found"
            r0.a(r3, r2)
        L_0x0310:
            if (r6 == 0) goto L_0x0342
            int r0 = r6.size()
            if (r0 != 0) goto L_0x0325
            i.c.a.b.i.a.m4 r0 = r14.n()
            i.c.a.b.i.a.o4 r0 = r0.f3763k
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.a(r2)
        L_0x0323:
            r5 = 0
            goto L_0x0342
        L_0x0325:
            java.util.Iterator r0 = r6.iterator()
        L_0x0329:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0342
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            i.c.a.b.i.a.ca r3 = r14.f()
            java.lang.String r7 = "safelisted event"
            boolean r2 = r3.b((java.lang.String) r7, (java.lang.String) r2)
            if (r2 != 0) goto L_0x0329
            goto L_0x0323
        L_0x0342:
            if (r5 == 0) goto L_0x0348
            r14.f3727i = r6
            goto L_0x0348
        L_0x0347:
            throw r6
        L_0x0348:
            if (r1 == 0) goto L_0x0355
            i.c.a.b.i.a.s5 r0 = r14.a
            android.content.Context r0 = r0.a
            boolean r0 = i.c.a.b.d.p.a.a(r0)
            r14.f3728j = r0
            return
        L_0x0355:
            r14.f3728j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.j4.v():void");
    }

    public final boolean y() {
        return true;
    }
}
