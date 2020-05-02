package i.c.a.b.i.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import android.os.SystemClock;
import com.crashlytics.android.core.LogFileManager;
import i.c.a.b.d.l.q;
import i.c.a.b.d.n.a;
import i.c.a.b.d.o.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class z7 extends c3 {
    public final s8 c;
    public e4 d;
    public volatile Boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final f f3974f;

    /* renamed from: g  reason: collision with root package name */
    public final n9 f3975g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Runnable> f3976h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final f f3977i;

    public z7(s5 s5Var) {
        super(s5Var);
        this.f3975g = new n9(s5Var.f3868n);
        this.c = new s8(this);
        this.f3974f = new d8(this, s5Var);
        this.f3977i = new k8(this, s5Var);
    }

    public final void A() {
        c();
        w();
        if (!z()) {
            if (E()) {
                this.c.a();
            } else if (!this.a.f3861g.t()) {
                s5 s5Var = this.a;
                oa oaVar = s5Var.f3860f;
                List<ResolveInfo> queryIntentServices = s5Var.a.getPackageManager().queryIntentServices(new Intent().setClassName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"), LogFileManager.MAX_LOG_SIZE);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    s5 s5Var2 = this.a;
                    Context context = s5Var2.a;
                    oa oaVar2 = s5Var2.f3860f;
                    intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.a(intent);
                    return;
                }
                n().f3758f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    public final void B() {
        c();
        w();
        s8 s8Var = this.c;
        if (s8Var.f3872b != null && (s8Var.f3872b.c() || s8Var.f3872b.a())) {
            s8Var.f3872b.f();
        }
        s8Var.f3872b = null;
        try {
            a a = a.a();
            Context context = this.a.a;
            s8 s8Var2 = this.c;
            if (a != null) {
                context.unbindService(s8Var2);
                this.d = null;
                return;
            }
            throw null;
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    public final boolean C() {
        oa oaVar = this.a.f3860f;
        return true;
    }

    public final void D() {
        c();
        n9 n9Var = this.f3975g;
        if (((c) n9Var.a) != null) {
            n9Var.f3790b = SystemClock.elapsedRealtime();
            this.f3974f.a(o.J.a(null).longValue());
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E() {
        /*
            r7 = this;
            r7.c()
            r7.w()
            java.lang.Boolean r0 = r7.e
            if (r0 != 0) goto L_0x0124
            r7.c()
            r7.w()
            i.c.a.b.i.a.x4 r0 = r7.g()
            r0.c()
            android.content.SharedPreferences r1 = r0.t()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x0027
            r0 = r3
            goto L_0x0033
        L_0x0027:
            android.content.SharedPreferences r0 = r0.t()
            boolean r0 = r0.getBoolean(r2, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0033:
            r1 = 1
            if (r0 == 0) goto L_0x003e
            boolean r5 = r0.booleanValue()
            if (r5 == 0) goto L_0x003e
            goto L_0x011c
        L_0x003e:
            i.c.a.b.i.a.s5 r5 = r7.a
            i.c.a.b.i.a.oa r5 = r5.f3860f
            i.c.a.b.i.a.j4 r5 = r7.q()
            r5.w()
            int r5 = r5.f3728j
            if (r5 != r1) goto L_0x004f
            goto L_0x00eb
        L_0x004f:
            i.c.a.b.i.a.m4 r5 = r7.n()
            i.c.a.b.i.a.o4 r5 = r5.f3766n
            java.lang.String r6 = "Checking service availability"
            r5.a(r6)
            i.c.a.b.i.a.ca r5 = r7.f()
            if (r5 == 0) goto L_0x0123
            i.c.a.b.d.f r3 = i.c.a.b.d.f.f3022b
            i.c.a.b.i.a.s5 r5 = r5.a
            android.content.Context r5 = r5.a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r3 = r3.a(r5, r6)
            if (r3 == 0) goto L_0x00e0
            if (r3 == r1) goto L_0x00d2
            r5 = 2
            if (r3 == r5) goto L_0x00b4
            r0 = 3
            if (r3 == r0) goto L_0x00a7
            r0 = 9
            if (r3 == r0) goto L_0x009b
            r0 = 18
            if (r3 == r0) goto L_0x008f
            i.c.a.b.i.a.m4 r0 = r7.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "Unexpected service status"
            r0.a(r3, r1)
            goto L_0x00b2
        L_0x008f:
            i.c.a.b.i.a.m4 r0 = r7.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            java.lang.String r3 = "Service updating"
            r0.a(r3)
            goto L_0x00eb
        L_0x009b:
            i.c.a.b.i.a.m4 r0 = r7.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x00b2
        L_0x00a7:
            i.c.a.b.i.a.m4 r0 = r7.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
        L_0x00b2:
            r1 = 0
            goto L_0x00dd
        L_0x00b4:
            i.c.a.b.i.a.m4 r3 = r7.n()
            i.c.a.b.i.a.o4 r3 = r3.f3765m
            java.lang.String r5 = "Service container out of date"
            r3.a(r5)
            i.c.a.b.i.a.ca r3 = r7.f()
            int r3 = r3.v()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r3 >= r5) goto L_0x00cc
            goto L_0x00dd
        L_0x00cc:
            if (r0 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            r0 = 0
            goto L_0x00ec
        L_0x00d2:
            i.c.a.b.i.a.m4 r0 = r7.n()
            i.c.a.b.i.a.o4 r0 = r0.f3766n
            java.lang.String r3 = "Service missing"
            r0.a(r3)
        L_0x00dd:
            r0 = r1
            r1 = 0
            goto L_0x00ec
        L_0x00e0:
            i.c.a.b.i.a.m4 r0 = r7.n()
            i.c.a.b.i.a.o4 r0 = r0.f3766n
            java.lang.String r3 = "Service available"
            r0.a(r3)
        L_0x00eb:
            r0 = 1
        L_0x00ec:
            if (r1 != 0) goto L_0x0104
            i.c.a.b.i.a.s5 r3 = r7.a
            i.c.a.b.i.a.pa r3 = r3.f3861g
            boolean r3 = r3.t()
            if (r3 == 0) goto L_0x0104
            i.c.a.b.i.a.m4 r0 = r7.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r3 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r3)
            goto L_0x0105
        L_0x0104:
            r4 = r0
        L_0x0105:
            if (r4 == 0) goto L_0x011c
            i.c.a.b.i.a.x4 r0 = r7.g()
            r0.c()
            android.content.SharedPreferences r0 = r0.t()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r1)
            r0.apply()
        L_0x011c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.e = r0
            goto L_0x0124
        L_0x0123:
            throw r3
        L_0x0124:
            java.lang.Boolean r0 = r7.e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.z7.E():boolean");
    }

    public final void F() {
        c();
        n().f3766n.a("Processing queued up service tasks", Integer.valueOf(this.f3976h.size()));
        for (Runnable run : this.f3976h) {
            try {
                run.run();
            } catch (Exception e2) {
                n().f3758f.a("Task exception while flushing queue", e2);
            }
        }
        this.f3976h.clear();
        this.f3977i.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.i.a.ea a(boolean r36) {
        /*
            r35 = this;
            r0 = r35
            i.c.a.b.i.a.s5 r1 = r0.a
            i.c.a.b.i.a.oa r1 = r1.f3860f
            i.c.a.b.i.a.j4 r1 = r35.q()
            if (r36 == 0) goto L_0x0016
            i.c.a.b.i.a.m4 r3 = r35.n()
            java.lang.String r3 = r3.A()
            r15 = r3
            goto L_0x0017
        L_0x0016:
            r15 = 0
        L_0x0017:
            r1.c()
            r1.a()
            i.c.a.b.i.a.ea r3 = new i.c.a.b.i.a.ea
            r1.w()
            java.lang.String r5 = r1.c
            r1.w()
            java.lang.String r6 = r1.f3729k
            r1.w()
            java.lang.String r7 = r1.d
            r1.w()
            int r4 = r1.e
            long r8 = (long) r4
            r1.w()
            java.lang.String r10 = r1.f3724f
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            r4.o()
            r1.w()
            r1.c()
            long r11 = r1.f3725g
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.ca r4 = r4.p()
            i.c.a.b.i.a.s5 r11 = r1.a
            android.content.Context r11 = r11.a
            java.lang.String r12 = r11.getPackageName()
            long r11 = r4.a((android.content.Context) r11, (java.lang.String) r12)
            r1.f3725g = r11
        L_0x0062:
            long r11 = r1.f3725g
            i.c.a.b.i.a.s5 r4 = r1.a
            boolean r16 = r4.b()
            i.c.a.b.i.a.x4 r4 = r1.g()
            boolean r4 = r4.x
            r13 = 1
            r19 = r4 ^ 1
            r1.c()
            r1.a()
            i.c.a.b.i.a.s5 r4 = r1.a
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x0084
        L_0x0081:
            r0 = 0
            goto L_0x0104
        L_0x0084:
            i.c.a.b.g.g.vb r4 = i.c.a.b.g.g.vb.f3507f
            java.lang.Object r4 = r4.a()
            i.c.a.b.g.g.yb r4 = (i.c.a.b.g.g.yb) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x00aa
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.L0
            boolean r2 = r4.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r2 == 0) goto L_0x00aa
            i.c.a.b.i.a.m4 r2 = r1.n()
            i.c.a.b.i.a.o4 r2 = r2.f3766n
            java.lang.String r4 = "Disabled IID for tests."
            r2.a(r4)
            goto L_0x0081
        L_0x00aa:
            i.c.a.b.i.a.s5 r2 = r1.a     // Catch:{ ClassNotFoundException -> 0x0081 }
            android.content.Context r2 = r2.a     // Catch:{ ClassNotFoundException -> 0x0081 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0081 }
            java.lang.String r4 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r2 = r2.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0081 }
            if (r2 != 0) goto L_0x00bb
            goto L_0x0081
        L_0x00bb:
            java.lang.String r4 = "getInstance"
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x00f7 }
            java.lang.Class<android.content.Context> r21 = android.content.Context.class
            r13 = 0
            r14[r13] = r21     // Catch:{ Exception -> 0x00f7 }
            java.lang.reflect.Method r4 = r2.getDeclaredMethod(r4, r14)     // Catch:{ Exception -> 0x00f7 }
            r14 = 1
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x00f7 }
            i.c.a.b.i.a.s5 r14 = r1.a     // Catch:{ Exception -> 0x00f7 }
            android.content.Context r14 = r14.a     // Catch:{ Exception -> 0x00f7 }
            r0 = 0
            r13[r0] = r14     // Catch:{ Exception -> 0x00f7 }
            r14 = 0
            java.lang.Object r4 = r4.invoke(r14, r13)     // Catch:{ Exception -> 0x00f7 }
            if (r4 != 0) goto L_0x00da
            goto L_0x0081
        L_0x00da:
            java.lang.String r13 = "getFirebaseInstanceId"
            java.lang.Class[] r14 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00eb }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r13, r14)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r0 = r2.invoke(r4, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00eb }
            goto L_0x0104
        L_0x00eb:
            i.c.a.b.i.a.m4 r0 = r1.n()
            i.c.a.b.i.a.o4 r0 = r0.f3763k
            java.lang.String r2 = "Failed to retrieve Firebase Instance Id"
            r0.a(r2)
            goto L_0x0081
        L_0x00f7:
            i.c.a.b.i.a.m4 r0 = r1.n()
            i.c.a.b.i.a.o4 r0 = r0.f3762j
            java.lang.String r2 = "Failed to obtain Firebase Analytics instance"
            r0.a(r2)
            goto L_0x0081
        L_0x0104:
            r23 = 0
            i.c.a.b.i.a.s5 r2 = r1.a
            i.c.a.b.i.a.x4 r4 = r2.i()
            i.c.a.b.i.a.d5 r4 = r4.f3933j
            long r13 = r4.a()
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            long r13 = r4.longValue()
            r17 = 0
            int r21 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r21 != 0) goto L_0x0127
            long r13 = r2.F
            r17 = r11
            r25 = r13
            goto L_0x0135
        L_0x0127:
            long r13 = r2.F
            r17 = r11
            long r11 = r4.longValue()
            long r11 = java.lang.Math.min(r13, r11)
            r25 = r11
        L_0x0135:
            r1.w()
            int r2 = r1.f3728j
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            java.lang.Boolean r4 = r4.s()
            boolean r27 = r4.booleanValue()
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            r4.a()
            java.lang.String r11 = "google_analytics_ssaid_collection_enabled"
            java.lang.Boolean r4 = r4.c(r11)
            if (r4 == 0) goto L_0x015e
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            r13 = 0
            goto L_0x015f
        L_0x015e:
            r13 = 1
        L_0x015f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)
            boolean r28 = r4.booleanValue()
            i.c.a.b.i.a.x4 r4 = r1.g()
            r4.c()
            android.content.SharedPreferences r4 = r4.t()
            java.lang.String r11 = "deferred_analytics_collection"
            r12 = 0
            boolean r29 = r4.getBoolean(r11, r12)
            r1.w()
            java.lang.String r13 = r1.f3730l
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r11 = i.c.a.b.i.a.o.e0
            boolean r4 = r4.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r11)
            if (r4 == 0) goto L_0x01a3
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            java.lang.String r11 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.c(r11)
            if (r4 == 0) goto L_0x01a3
            boolean r4 = r4.booleanValue()
            r11 = 1
            r4 = r4 ^ r11
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r30 = r4
            goto L_0x01a5
        L_0x01a3:
            r30 = 0
        L_0x01a5:
            long r11 = r1.f3726h
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r14 = i.c.a.b.i.a.o.m0
            boolean r4 = r4.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r14)
            if (r4 == 0) goto L_0x01b8
            java.util.List<java.lang.String> r4 = r1.f3727i
            r31 = r4
            goto L_0x01ba
        L_0x01b8:
            r31 = 0
        L_0x01ba:
            boolean r4 = i.c.a.b.g.g.x9.b()
            if (r4 == 0) goto L_0x01d4
            i.c.a.b.i.a.s5 r4 = r1.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r14 = i.c.a.b.i.a.o.I0
            boolean r4 = r4.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r14)
            if (r4 == 0) goto L_0x01d4
            r1.w()
            java.lang.String r1 = r1.f3731m
            r32 = r1
            goto L_0x01d6
        L_0x01d4:
            r32 = 0
        L_0x01d6:
            r20 = 25001(0x61a9, double:1.2352E-319)
            r33 = r11
            r11 = r20
            r4 = r3
            r1 = r13
            r13 = r17
            r17 = r19
            r18 = r0
            r19 = r23
            r21 = r25
            r23 = r2
            r24 = r27
            r25 = r28
            r26 = r29
            r27 = r1
            r28 = r30
            r29 = r33
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (long) r8, (java.lang.String) r10, (long) r11, (long) r13, (java.lang.String) r15, (boolean) r16, (boolean) r17, (java.lang.String) r18, (long) r19, (long) r21, (int) r23, (boolean) r24, (boolean) r25, (boolean) r26, (java.lang.String) r27, (java.lang.Boolean) r28, (long) r29, (java.util.List<java.lang.String>) r31, (java.lang.String) r32)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.z7.a(boolean):i.c.a.b.i.a.ea");
    }

    public final boolean y() {
        return false;
    }

    public final boolean z() {
        c();
        w();
        return this.d != null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:84|85|86|87) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:99|100|101|102) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:71|72|73|74|237) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r8.n().f3758f.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r5.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0194, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0197, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ba, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01f6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0201, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0202, code lost:
        r25 = r10;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0207, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x020d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x020e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0214, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0215, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0216, code lost:
        r25 = r10;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x021b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x021e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0223, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0226, code lost:
        r5 = r11;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x023a, code lost:
        if (r10.inTransaction() != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x023c, code lost:
        r10.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x024d, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0252, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0264, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0269, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0281, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0286, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0291, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0292, code lost:
        r25 = r4;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0297, code lost:
        r28 = r25;
        r25 = r10;
        r10 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x029f, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02a4, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r25 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0118, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r8.n().f3758f.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012a, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r8.n().f3758f.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r5.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015f, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0162, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x011a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x014a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x017f */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01f2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:56:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01f8 A[ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:56:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:56:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:17:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0214 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:22:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x021b A[ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:17:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0223 A[ExcHandler: SQLiteFullException (e android.database.sqlite.SQLiteFullException), Splitter:B:17:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0236 A[SYNTHETIC, Splitter:B:157:0x0236] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:17:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0289 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i.c.a.b.i.a.e4 r30, i.c.a.b.d.l.w.a r31, i.c.a.b.i.a.ea r32) {
        /*
            r29 = this;
            r1 = r30
            r2 = r31
            r3 = r32
            r29.c()
            r29.a()
            r29.w()
            r29.C()
            r4 = 100
            r0 = 100
            r6 = 0
        L_0x0017:
            r7 = 1001(0x3e9, float:1.403E-42)
            if (r6 >= r7) goto L_0x0333
            if (r0 != r4) goto L_0x0333
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            i.c.a.b.i.a.i4 r8 = r29.t()
            java.lang.String r9 = "Error reading entries from local database"
            r8.c()
            r8.a()
            boolean r0 = r8.d
            if (r0 == 0) goto L_0x0037
        L_0x0032:
            r10 = 0
        L_0x0033:
            r17 = 0
            goto L_0x02b6
        L_0x0037:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            i.c.a.b.i.a.s5 r0 = r8.a
            android.content.Context r0 = r0.a
            java.lang.String r12 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r12)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x004e
            r10 = r11
            goto L_0x0033
        L_0x004e:
            r12 = 5
            r13 = 0
            r14 = 5
        L_0x0051:
            if (r13 >= r12) goto L_0x02a8
            r15 = 1
            android.database.sqlite.SQLiteDatabase r10 = r8.B()     // Catch:{ SQLiteFullException -> 0x026d, SQLiteDatabaseLockedException -> 0x0257, SQLiteException -> 0x022f, all -> 0x0229 }
            if (r10 != 0) goto L_0x0064
            r8.d = r15     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0062 }
            if (r10 == 0) goto L_0x0032
            r10.close()
            goto L_0x0032
        L_0x0062:
            r0 = move-exception
            goto L_0x00c3
        L_0x0064:
            r10.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0214 }
            i.c.a.b.i.a.s5 r0 = r8.a     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x0207, all -> 0x0214 }
            i.c.a.b.i.a.pa r0 = r0.f3861g     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x0207, all -> 0x0214 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r12 = i.c.a.b.i.a.o.A0     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0214 }
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r12)     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0214 }
            java.lang.String r12 = "entry"
            java.lang.String r4 = "type"
            java.lang.String r5 = "rowid"
            r26 = -1
            if (r0 == 0) goto L_0x00c7
            long r16 = i.c.a.b.i.a.i4.a(r10)     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0062 }
            int r0 = (r16 > r26 ? 1 : (r16 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "rowid<?"
            r18 = r0
            java.lang.String[] r0 = new java.lang.String[r15]     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0062 }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0062 }
            r17 = 0
            r0[r17] = r16     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x0220, SQLiteException -> 0x021b, all -> 0x0062 }
            r20 = r0
            r19 = r18
            goto L_0x00a2
        L_0x0096:
            r17 = 0
            goto L_0x021e
        L_0x009a:
            r17 = 0
            goto L_0x0226
        L_0x009e:
            r19 = 0
            r20 = 0
        L_0x00a2:
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r5, r4, r12}     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0062 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r4 = 100
            java.lang.String r24 = java.lang.Integer.toString(r4)     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x021b, all -> 0x0062 }
            r16 = r10
            android.database.Cursor r0 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x00bf, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x00bb, all -> 0x0201 }
            goto L_0x00e3
        L_0x00bb:
            r0 = move-exception
            r4 = 0
            goto L_0x01b5
        L_0x00bf:
            r0 = move-exception
            r4 = 0
            goto L_0x01ba
        L_0x00c3:
            r25 = 0
            goto L_0x0297
        L_0x00c7:
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r5, r4, r12}     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x0207, all -> 0x0201 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r4 = 100
            java.lang.String r24 = java.lang.Integer.toString(r4)     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x0207, all -> 0x0201 }
            r16 = r10
            android.database.Cursor r0 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x020a, SQLiteException -> 0x0207, all -> 0x0201 }
        L_0x00e3:
            r4 = r0
        L_0x00e4:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            if (r0 == 0) goto L_0x01bf
            r5 = 0
            long r26 = r4.getLong(r5)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            int r0 = r4.getInt(r15)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            r5 = 2
            byte[] r12 = r4.getBlob(r5)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            if (r0 != 0) goto L_0x012e
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            int r0 = r12.length     // Catch:{ SafeParcelReader$ParseException -> 0x011a }
            r15 = 0
            r5.unmarshall(r12, r15, r0)     // Catch:{ SafeParcelReader$ParseException -> 0x011a }
            r5.setDataPosition(r15)     // Catch:{ SafeParcelReader$ParseException -> 0x011a }
            android.os.Parcelable$Creator<i.c.a.b.i.a.m> r0 = i.c.a.b.i.a.m.CREATOR     // Catch:{ SafeParcelReader$ParseException -> 0x011a }
            java.lang.Object r0 = r0.createFromParcel(r5)     // Catch:{ SafeParcelReader$ParseException -> 0x011a }
            i.c.a.b.i.a.m r0 = (i.c.a.b.i.a.m) r0     // Catch:{ SafeParcelReader$ParseException -> 0x011a }
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            if (r0 == 0) goto L_0x01b2
            r11.add(r0)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            goto L_0x01b2
        L_0x0118:
            r0 = move-exception
            goto L_0x012a
        L_0x011a:
            i.c.a.b.i.a.m4 r0 = r8.n()     // Catch:{ all -> 0x0118 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ all -> 0x0118 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.a(r12)     // Catch:{ all -> 0x0118 }
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            goto L_0x01b2
        L_0x012a:
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
        L_0x012e:
            if (r0 != r15) goto L_0x0163
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            int r0 = r12.length     // Catch:{ SafeParcelReader$ParseException -> 0x014a }
            r15 = 0
            r5.unmarshall(r12, r15, r0)     // Catch:{ SafeParcelReader$ParseException -> 0x014a }
            r5.setDataPosition(r15)     // Catch:{ SafeParcelReader$ParseException -> 0x014a }
            android.os.Parcelable$Creator<i.c.a.b.i.a.aa> r0 = i.c.a.b.i.a.aa.CREATOR     // Catch:{ SafeParcelReader$ParseException -> 0x014a }
            java.lang.Object r0 = r0.createFromParcel(r5)     // Catch:{ SafeParcelReader$ParseException -> 0x014a }
            i.c.a.b.i.a.aa r0 = (i.c.a.b.i.a.aa) r0     // Catch:{ SafeParcelReader$ParseException -> 0x014a }
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            goto L_0x0159
        L_0x0148:
            r0 = move-exception
            goto L_0x015f
        L_0x014a:
            i.c.a.b.i.a.m4 r0 = r8.n()     // Catch:{ all -> 0x0148 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ all -> 0x0148 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x0148 }
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            r0 = 0
        L_0x0159:
            if (r0 == 0) goto L_0x01b2
            r11.add(r0)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            goto L_0x01b2
        L_0x015f:
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
        L_0x0163:
            if (r0 != r5) goto L_0x0198
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            int r0 = r12.length     // Catch:{ SafeParcelReader$ParseException -> 0x017f }
            r15 = 0
            r5.unmarshall(r12, r15, r0)     // Catch:{ SafeParcelReader$ParseException -> 0x017f }
            r5.setDataPosition(r15)     // Catch:{ SafeParcelReader$ParseException -> 0x017f }
            android.os.Parcelable$Creator<i.c.a.b.i.a.na> r0 = i.c.a.b.i.a.na.CREATOR     // Catch:{ SafeParcelReader$ParseException -> 0x017f }
            java.lang.Object r0 = r0.createFromParcel(r5)     // Catch:{ SafeParcelReader$ParseException -> 0x017f }
            i.c.a.b.i.a.na r0 = (i.c.a.b.i.a.na) r0     // Catch:{ SafeParcelReader$ParseException -> 0x017f }
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            goto L_0x018e
        L_0x017d:
            r0 = move-exception
            goto L_0x0194
        L_0x017f:
            i.c.a.b.i.a.m4 r0 = r8.n()     // Catch:{ all -> 0x017d }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ all -> 0x017d }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x017d }
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            r0 = 0
        L_0x018e:
            if (r0 == 0) goto L_0x01b2
            r11.add(r0)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            goto L_0x01b2
        L_0x0194:
            r5.recycle()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
        L_0x0198:
            r5 = 3
            if (r0 != r5) goto L_0x01a7
            i.c.a.b.i.a.m4 r0 = r8.n()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            i.c.a.b.i.a.o4 r0 = r0.f3761i     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            java.lang.String r5 = "Skipping app launch break"
            r0.a(r5)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            goto L_0x01b2
        L_0x01a7:
            i.c.a.b.i.a.m4 r0 = r8.n()     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            java.lang.String r5 = "Unknown record type in local database"
            r0.a(r5)     // Catch:{ SQLiteFullException -> 0x01b9, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
        L_0x01b2:
            r15 = 1
            goto L_0x00e4
        L_0x01b5:
            r17 = 0
            goto L_0x0234
        L_0x01b9:
            r0 = move-exception
        L_0x01ba:
            r5 = r11
            r17 = 0
            goto L_0x0273
        L_0x01bf:
            java.lang.String r0 = "messages"
            java.lang.String r5 = "rowid <= ?"
            r12 = 1
            java.lang.String[] r15 = new java.lang.String[r12]     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            java.lang.String r12 = java.lang.Long.toString(r26)     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x01fa, SQLiteException -> 0x01f8, all -> 0x01f2 }
            r17 = 0
            r15[r17] = r12     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
            int r0 = r10.delete(r0, r5, r15)     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
            int r5 = r11.size()     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
            if (r0 >= r5) goto L_0x01e3
            i.c.a.b.i.a.m4 r0 = r8.n()     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r5 = "Fewer entries removed from local database than expected"
            r0.a(r5)     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
        L_0x01e3:
            r10.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
            r10.endTransaction()     // Catch:{ SQLiteFullException -> 0x01f6, SQLiteDatabaseLockedException -> 0x0221, SQLiteException -> 0x01f4, all -> 0x01f2 }
            r4.close()
            r10.close()
            r10 = r11
            goto L_0x02b6
        L_0x01f2:
            r0 = move-exception
            goto L_0x0216
        L_0x01f4:
            r0 = move-exception
            goto L_0x0234
        L_0x01f6:
            r0 = move-exception
            goto L_0x0211
        L_0x01f8:
            r0 = move-exception
            goto L_0x01b5
        L_0x01fa:
            r17 = 0
            goto L_0x0221
        L_0x01fd:
            r0 = move-exception
            r17 = 0
            goto L_0x0211
        L_0x0201:
            r0 = move-exception
            r25 = r10
            r10 = 0
            goto L_0x029d
        L_0x0207:
            r0 = move-exception
            goto L_0x0096
        L_0x020a:
            r17 = 0
            goto L_0x0220
        L_0x020d:
            r0 = move-exception
            r17 = 0
            r4 = 0
        L_0x0211:
            r5 = r11
            goto L_0x0273
        L_0x0214:
            r0 = move-exception
            r4 = 0
        L_0x0216:
            r25 = r10
            r10 = r4
            goto L_0x029d
        L_0x021b:
            r0 = move-exception
            goto L_0x0096
        L_0x021e:
            r4 = 0
            goto L_0x0234
        L_0x0220:
            r4 = 0
        L_0x0221:
            r5 = r11
            goto L_0x025c
        L_0x0223:
            r0 = move-exception
            goto L_0x009a
        L_0x0226:
            r5 = r11
            r4 = 0
            goto L_0x0273
        L_0x0229:
            r0 = move-exception
            r10 = 0
            r25 = 0
            goto L_0x029d
        L_0x022f:
            r0 = move-exception
            r17 = 0
            r4 = 0
            r10 = 0
        L_0x0234:
            if (r10 == 0) goto L_0x023f
            boolean r5 = r10.inTransaction()     // Catch:{ all -> 0x0291 }
            if (r5 == 0) goto L_0x023f
            r10.endTransaction()     // Catch:{ all -> 0x0291 }
        L_0x023f:
            i.c.a.b.i.a.m4 r5 = r8.n()     // Catch:{ all -> 0x0291 }
            i.c.a.b.i.a.o4 r5 = r5.f3758f     // Catch:{ all -> 0x0291 }
            r5.a(r9, r0)     // Catch:{ all -> 0x0291 }
            r5 = 1
            r8.d = r5     // Catch:{ all -> 0x0291 }
            if (r4 == 0) goto L_0x0250
            r4.close()
        L_0x0250:
            if (r10 == 0) goto L_0x0255
            r10.close()
        L_0x0255:
            r5 = r11
            goto L_0x0289
        L_0x0257:
            r17 = 0
            r5 = r11
            r4 = 0
            r10 = 0
        L_0x025c:
            long r11 = (long) r14
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0291 }
            int r14 = r14 + 20
            if (r4 == 0) goto L_0x0267
            r4.close()
        L_0x0267:
            if (r10 == 0) goto L_0x0289
            r10.close()
            goto L_0x0289
        L_0x026d:
            r0 = move-exception
            r5 = r11
            r17 = 0
            r4 = 0
            r10 = 0
        L_0x0273:
            i.c.a.b.i.a.m4 r11 = r8.n()     // Catch:{ all -> 0x0291 }
            i.c.a.b.i.a.o4 r11 = r11.f3758f     // Catch:{ all -> 0x0291 }
            r11.a(r9, r0)     // Catch:{ all -> 0x0291 }
            r11 = 1
            r8.d = r11     // Catch:{ all -> 0x0291 }
            if (r4 == 0) goto L_0x0284
            r4.close()
        L_0x0284:
            if (r10 == 0) goto L_0x0289
            r10.close()
        L_0x0289:
            int r13 = r13 + 1
            r11 = r5
            r4 = 100
            r12 = 5
            goto L_0x0051
        L_0x0291:
            r0 = move-exception
            r1 = r10
            r10 = r4
            r25 = r10
            r10 = r1
        L_0x0297:
            r28 = r25
            r25 = r10
            r10 = r28
        L_0x029d:
            if (r10 == 0) goto L_0x02a2
            r10.close()
        L_0x02a2:
            if (r25 == 0) goto L_0x02a7
            r25.close()
        L_0x02a7:
            throw r0
        L_0x02a8:
            r17 = 0
            i.c.a.b.i.a.m4 r0 = r8.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            java.lang.String r4 = "Failed to read events from database in reasonable time"
            r0.a(r4)
            r10 = 0
        L_0x02b6:
            if (r10 == 0) goto L_0x02c1
            r7.addAll(r10)
            int r0 = r10.size()
            r4 = r0
            goto L_0x02c2
        L_0x02c1:
            r4 = 0
        L_0x02c2:
            r5 = 100
            if (r2 == 0) goto L_0x02cb
            if (r4 >= r5) goto L_0x02cb
            r7.add(r2)
        L_0x02cb:
            int r8 = r7.size()
            r0 = 0
        L_0x02d0:
            if (r0 >= r8) goto L_0x032c
            java.lang.Object r9 = r7.get(r0)
            int r10 = r0 + 1
            i.c.a.b.d.l.w.a r9 = (i.c.a.b.d.l.w.a) r9
            boolean r0 = r9 instanceof i.c.a.b.i.a.m
            if (r0 == 0) goto L_0x02f1
            i.c.a.b.i.a.m r9 = (i.c.a.b.i.a.m) r9     // Catch:{ RemoteException -> 0x02e4 }
            r1.a((i.c.a.b.i.a.m) r9, (i.c.a.b.i.a.ea) r3)     // Catch:{ RemoteException -> 0x02e4 }
            goto L_0x032a
        L_0x02e4:
            r0 = move-exception
            i.c.a.b.i.a.m4 r9 = r29.n()
            i.c.a.b.i.a.o4 r9 = r9.f3758f
            java.lang.String r11 = "Failed to send event to the service"
            r9.a(r11, r0)
            goto L_0x032a
        L_0x02f1:
            boolean r0 = r9 instanceof i.c.a.b.i.a.aa
            if (r0 == 0) goto L_0x0308
            i.c.a.b.i.a.aa r9 = (i.c.a.b.i.a.aa) r9     // Catch:{ RemoteException -> 0x02fb }
            r1.a((i.c.a.b.i.a.aa) r9, (i.c.a.b.i.a.ea) r3)     // Catch:{ RemoteException -> 0x02fb }
            goto L_0x032a
        L_0x02fb:
            r0 = move-exception
            i.c.a.b.i.a.m4 r9 = r29.n()
            i.c.a.b.i.a.o4 r9 = r9.f3758f
            java.lang.String r11 = "Failed to send user property to the service"
            r9.a(r11, r0)
            goto L_0x032a
        L_0x0308:
            boolean r0 = r9 instanceof i.c.a.b.i.a.na
            if (r0 == 0) goto L_0x031f
            i.c.a.b.i.a.na r9 = (i.c.a.b.i.a.na) r9     // Catch:{ RemoteException -> 0x0312 }
            r1.a((i.c.a.b.i.a.na) r9, (i.c.a.b.i.a.ea) r3)     // Catch:{ RemoteException -> 0x0312 }
            goto L_0x032a
        L_0x0312:
            r0 = move-exception
            i.c.a.b.i.a.m4 r9 = r29.n()
            i.c.a.b.i.a.o4 r9 = r9.f3758f
            java.lang.String r11 = "Failed to send conditional user property to the service"
            r9.a(r11, r0)
            goto L_0x032a
        L_0x031f:
            i.c.a.b.i.a.m4 r0 = r29.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r9 = "Discarding data. Unrecognized parcel type."
            r0.a(r9)
        L_0x032a:
            r0 = r10
            goto L_0x02d0
        L_0x032c:
            int r6 = r6 + 1
            r0 = r4
            r4 = 100
            goto L_0x0017
        L_0x0333:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.z7.a(i.c.a.b.i.a.e4, i.c.a.b.d.l.w.a, i.c.a.b.i.a.ea):void");
    }

    public final void a(na naVar) {
        boolean z;
        q.a(naVar);
        c();
        w();
        oa oaVar = this.a.f3860f;
        i4 t = t();
        t.f();
        byte[] a = ca.a((Parcelable) naVar);
        if (a.length > 131072) {
            t.n().f3759g.a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = t.a(2, a);
        }
        a((Runnable) new p8(this, true, z, new na(naVar), a(true), naVar));
    }

    public static /* synthetic */ void a(z7 z7Var, ComponentName componentName) {
        z7Var.c();
        if (z7Var.d != null) {
            z7Var.d = null;
            z7Var.n().f3766n.a("Disconnected from device MeasurementService", componentName);
            z7Var.c();
            z7Var.A();
        }
    }

    public final void a(Runnable runnable) {
        c();
        if (z()) {
            runnable.run();
        } else if (((long) this.f3976h.size()) >= 1000) {
            n().f3758f.a("Discarding data. Max runnable queue size reached");
        } else {
            this.f3976h.add(runnable);
            this.f3977i.a(60000);
            A();
        }
    }
}
