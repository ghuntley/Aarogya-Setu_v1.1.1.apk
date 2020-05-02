package i.c.a.b.i.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.da;
import i.c.a.b.g.g.ga;
import i.c.a.b.g.g.q9;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class q7 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ t6 e;

    public /* synthetic */ q7(t6 t6Var, v6 v6Var) {
        this.e = t6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096 A[SYNTHETIC, Splitter:B:33:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de A[Catch:{ Exception -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef A[SYNTHETIC, Splitter:B:49:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011e A[Catch:{ Exception -> 0x019b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f A[Catch:{ Exception -> 0x019b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            i.c.a.b.i.a.t6 r3 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.s5 r3 = r3.a     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.pa r3 = r3.f3861g     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.B0     // Catch:{ Exception -> 0x019b }
            boolean r3 = r3.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r4)     // Catch:{ Exception -> 0x019b }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x003f
            i.c.a.b.i.a.t6 r3 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.s5 r3 = r3.a     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.pa r3 = r3.f3861g     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.f4<java.lang.Boolean> r11 = i.c.a.b.i.a.o.D0     // Catch:{ Exception -> 0x019b }
            boolean r3 = r3.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x019b }
            if (r3 != 0) goto L_0x003f
            i.c.a.b.i.a.t6 r3 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.s5 r3 = r3.a     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.pa r3 = r3.f3861g     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.f4<java.lang.Boolean> r11 = i.c.a.b.i.a.o.C0     // Catch:{ Exception -> 0x019b }
            boolean r3 = r3.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x019b }
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            goto L_0x0090
        L_0x003f:
            i.c.a.b.i.a.t6 r3 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.ca r3 = r3.f()     // Catch:{ Exception -> 0x019b }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x019b }
            if (r11 == 0) goto L_0x004c
            goto L_0x003d
        L_0x004c:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x019b }
            if (r11 != 0) goto L_0x006e
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x019b }
            if (r11 != 0) goto L_0x006e
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x019b }
            if (r11 != 0) goto L_0x006e
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x019b }
            if (r11 != 0) goto L_0x006e
            i.c.a.b.i.a.m4 r3 = r3.n()     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.o4 r3 = r3.f3765m     // Catch:{ Exception -> 0x019b }
            r3.a(r4)     // Catch:{ Exception -> 0x019b }
            goto L_0x003d
        L_0x006e:
            java.lang.String r11 = "https://google.com/search?"
            int r12 = r21.length()     // Catch:{ Exception -> 0x019b }
            if (r12 == 0) goto L_0x007b
            java.lang.String r11 = r11.concat(r2)     // Catch:{ Exception -> 0x019b }
            goto L_0x0081
        L_0x007b:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x019b }
            r12.<init>(r11)     // Catch:{ Exception -> 0x019b }
            r11 = r12
        L_0x0081:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x019b }
            android.os.Bundle r3 = r3.a((android.net.Uri) r11)     // Catch:{ Exception -> 0x019b }
            if (r3 == 0) goto L_0x0090
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x019b }
        L_0x0090:
            r11 = 0
            java.lang.String r12 = "_cmp"
            r13 = 1
            if (r18 == 0) goto L_0x00de
            i.c.a.b.i.a.t6 r14 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.ca r14 = r14.f()     // Catch:{ Exception -> 0x019b }
            r15 = r19
            android.os.Bundle r14 = r14.a((android.net.Uri) r15)     // Catch:{ Exception -> 0x019b }
            if (r14 == 0) goto L_0x00df
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.t6 r6 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.s5 r6 = r6.a     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.pa r6 = r6.f3861g     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.f4<java.lang.Boolean> r15 = i.c.a.b.i.a.o.B0     // Catch:{ Exception -> 0x019b }
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x019b }
            if (r6 == 0) goto L_0x00d8
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x019b }
            if (r6 != 0) goto L_0x00d8
            if (r3 == 0) goto L_0x00d8
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x019b }
            if (r6 == 0) goto L_0x00d8
            java.lang.String r6 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x019b }
            java.lang.String r16 = r3.getString(r10)     // Catch:{ Exception -> 0x019b }
            r9[r11] = r16     // Catch:{ Exception -> 0x019b }
            java.lang.String r9 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x019b }
            r14.putString(r6, r9)     // Catch:{ Exception -> 0x019b }
        L_0x00d8:
            i.c.a.b.i.a.t6 r6 = r1.e     // Catch:{ Exception -> 0x019b }
            r6.a((java.lang.String) r0, (java.lang.String) r12, (android.os.Bundle) r14)     // Catch:{ Exception -> 0x019b }
            goto L_0x00df
        L_0x00de:
            r14 = 0
        L_0x00df:
            i.c.a.b.i.a.t6 r6 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.s5 r6 = r6.a     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.pa r6 = r6.f3861g     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.f4<java.lang.Boolean> r9 = i.c.a.b.i.a.o.D0     // Catch:{ Exception -> 0x019b }
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r9)     // Catch:{ Exception -> 0x019b }
            java.lang.String r9 = "auto"
            if (r6 == 0) goto L_0x0118
            i.c.a.b.i.a.t6 r6 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.s5 r6 = r6.a     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.pa r6 = r6.f3861g     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.f4<java.lang.Boolean> r15 = i.c.a.b.i.a.o.C0     // Catch:{ Exception -> 0x019b }
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x019b }
            if (r6 != 0) goto L_0x0118
            if (r3 == 0) goto L_0x0118
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x019b }
            if (r6 == 0) goto L_0x0118
            if (r14 == 0) goto L_0x010d
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x019b }
            if (r6 != 0) goto L_0x0118
        L_0x010d:
            i.c.a.b.i.a.t6 r6 = r1.e     // Catch:{ Exception -> 0x019b }
            java.lang.String r14 = "_lgclid"
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x019b }
            r6.a((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r15, (boolean) r13)     // Catch:{ Exception -> 0x019b }
        L_0x0118:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x019b }
            if (r6 == 0) goto L_0x011f
            return
        L_0x011f:
            i.c.a.b.i.a.t6 r6 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.m4 r6 = r6.n()     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.o4 r6 = r6.f3765m     // Catch:{ Exception -> 0x019b }
            java.lang.String r14 = "Activity created with referrer"
            r6.a(r14, r2)     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.t6 r6 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.s5 r6 = r6.a     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.pa r6 = r6.f3861g     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.f4<java.lang.Boolean> r14 = i.c.a.b.i.a.o.C0     // Catch:{ Exception -> 0x019b }
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r14)     // Catch:{ Exception -> 0x019b }
            java.lang.String r14 = "_ldl"
            if (r6 == 0) goto L_0x0158
            if (r3 == 0) goto L_0x0144
            i.c.a.b.i.a.t6 r2 = r1.e     // Catch:{ Exception -> 0x019b }
            r2.a((java.lang.String) r0, (java.lang.String) r12, (android.os.Bundle) r3)     // Catch:{ Exception -> 0x019b }
            goto L_0x0151
        L_0x0144:
            i.c.a.b.i.a.t6 r0 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.o4 r0 = r0.f3765m     // Catch:{ Exception -> 0x019b }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.a(r3, r2)     // Catch:{ Exception -> 0x019b }
        L_0x0151:
            i.c.a.b.i.a.t6 r0 = r1.e     // Catch:{ Exception -> 0x019b }
            r2 = 0
            r0.a((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r2, (boolean) r13)     // Catch:{ Exception -> 0x019b }
            return
        L_0x0158:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x019b }
            if (r0 == 0) goto L_0x0181
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x019b }
            if (r0 != 0) goto L_0x0180
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x019b }
            if (r0 != 0) goto L_0x0180
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x019b }
            if (r0 != 0) goto L_0x0180
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x019b }
            if (r0 != 0) goto L_0x0180
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x019b }
            if (r0 == 0) goto L_0x0181
        L_0x0180:
            r11 = 1
        L_0x0181:
            if (r11 != 0) goto L_0x018f
            i.c.a.b.i.a.t6 r0 = r1.e     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ Exception -> 0x019b }
            i.c.a.b.i.a.o4 r0 = r0.f3765m     // Catch:{ Exception -> 0x019b }
            r0.a(r4)     // Catch:{ Exception -> 0x019b }
            return
        L_0x018f:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x019b }
            if (r0 != 0) goto L_0x019a
            i.c.a.b.i.a.t6 r0 = r1.e     // Catch:{ Exception -> 0x019b }
            r0.a((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r2, (boolean) r13)     // Catch:{ Exception -> 0x019b }
        L_0x019a:
            return
        L_0x019b:
            r0 = move-exception
            i.c.a.b.i.a.t6 r2 = r1.e
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3758f
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.q7.a(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.e.n().f3766n.a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.e.f();
                        String str = ca.a(intent) ? "gs" : "auto";
                        String queryParameter = data.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        if (!((ga) da.f3257f.a()).a() || !o.E0.a(null).booleanValue()) {
                            a(z, data, str, queryParameter);
                        } else {
                            m5 k2 = this.e.k();
                            p7 p7Var = new p7(this, z, data, str, queryParameter);
                            k2.o();
                            q.a(p7Var);
                            k2.a((q5<?>) new q5(k2, p7Var, "Task exception on worker thread"));
                        }
                        this.e.s().a(activity, bundle);
                        return;
                    }
                }
                this.e.s().a(activity, bundle);
            }
        } catch (Exception e2) {
            this.e.n().f3758f.a("Throwable caught in onActivityCreated", e2);
        } finally {
            this.e.s().a(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.e.s().f3965f.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        y7 s = this.e.s();
        w7 b2 = s.b(activity);
        s.e = s.d;
        s.d = null;
        if (((c) s.a.f3868n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m5 k2 = s.k();
            b8 b8Var = new b8(s, b2, elapsedRealtime);
            k2.o();
            q.a(b8Var);
            k2.a((q5<?>) new q5(k2, b8Var, "Task exception on worker thread"));
            g9 u = this.e.u();
            if (((c) u.a.f3868n) != null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                m5 k3 = u.k();
                i9 i9Var = new i9(u, elapsedRealtime2);
                k3.o();
                q.a(i9Var);
                k3.a((q5<?>) new q5(k3, i9Var, "Task exception on worker thread"));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void onActivityResumed(Activity activity) {
        if (!q9.b() || !o.Z.a(null).booleanValue()) {
            this.e.s().a(activity);
            this.e.u().z();
            return;
        }
        this.e.u().z();
        this.e.s().a(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        w7 w7Var;
        y7 s = this.e.s();
        if (s == null) {
            throw null;
        } else if (bundle != null && (w7Var = s.f3965f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", w7Var.c);
            bundle2.putString(DefaultAppMeasurementEventListenerRegistrar.NAME, w7Var.a);
            bundle2.putString("referrer_name", w7Var.f3927b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
