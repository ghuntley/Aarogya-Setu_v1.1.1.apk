package nic.goi.aarogyasetu.views;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AlertController;
import b.a.a.a.o0;
import b.a.a.a.v0;
import b.a.a.a.y0;
import b.a.a.l.b;
import h.b.k.g;
import h.b.k.h;
import l.a.a.a.o.b.i;
import n.m.c.f;
import n.q.d;

/* compiled from: SplashActivity.kt */
public final class SplashActivity extends h implements v0.a, o0.a {
    public static final /* synthetic */ void a(SplashActivity splashActivity) {
        if (splashActivity != null) {
            Intent a = WebViewActivity.a("https://web.swaraksha.gov.in/ncv19/", "", splashActivity);
            a.putExtra("do_not_show_back", true);
            Intent intent = splashActivity.getIntent();
            f.a((Object) intent, "intent");
            if (intent.getExtras() != null) {
                Intent intent2 = splashActivity.getIntent();
                f.a((Object) intent2, "intent");
                Bundle extras = intent2.getExtras();
                Boolean valueOf = extras != null ? Boolean.valueOf(extras.containsKey("push_consent")) : null;
                if (valueOf == null) {
                    f.a();
                    throw null;
                } else if (valueOf.booleanValue()) {
                    Intent intent3 = splashActivity.getIntent();
                    f.a((Object) intent3, "intent");
                    Bundle extras2 = intent3.getExtras();
                    if (extras2 == null) {
                        f.a();
                        throw null;
                    } else if (d.a(extras2.getString("push_consent"), "1", false, 2)) {
                        Intent intent4 = splashActivity.getIntent();
                        f.a((Object) intent4, "intent");
                        Bundle extras3 = intent4.getExtras();
                        if (extras3 != null) {
                            String string = extras3.getString("upload_type");
                            if (TextUtils.isEmpty(string)) {
                                string = "push_consent";
                            }
                            a.putExtra("push_consent", true);
                            a.putExtra("upload_type", string);
                        } else {
                            f.a();
                            throw null;
                        }
                    }
                }
            }
            splashActivity.startActivity(a);
            splashActivity.finish();
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void b(SplashActivity splashActivity) {
        if (splashActivity != null) {
            splashActivity.startActivity(new Intent(splashActivity, OnboardingActivity.class));
            splashActivity.finish();
            return;
        }
        throw null;
    }

    public void g() {
        startActivity(new Intent(this, OnboardingActivity.class));
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r15 = this;
            java.lang.Class<b.a.a.j.c> r0 = b.a.a.j.c.class
            b.a.a.h.a$b r1 = b.a.a.h.a.d
            r2 = 0
            if (r1 == 0) goto L_0x0245
            n.b r1 = b.a.a.h.a.c
            b.a.a.h.a$b r3 = b.a.a.h.a.d
            n.o.e[] r3 = b.a.a.h.a.b.a
            r4 = 0
            r3 = r3[r4]
            java.lang.Object r1 = r1.getValue()
            b.a.a.h.a r1 = (b.a.a.h.a) r1
            i.c.d.q.g r1 = r1.a()
            i.c.d.q.m.k r3 = r1.f4776g
            i.c.d.q.m.m r5 = r3.f4801h
            android.content.SharedPreferences r5 = r5.a
            long r6 = i.c.d.q.m.k.f4796j
            java.lang.String r8 = "minimum_fetch_interval_in_seconds"
            long r5 = r5.getLong(r8, r6)
            i.c.d.q.m.m r7 = r3.f4801h
            android.content.SharedPreferences r7 = r7.a
            java.lang.String r8 = "is_developer_mode_enabled"
            boolean r7 = r7.getBoolean(r8, r4)
            if (r7 == 0) goto L_0x0036
            r5 = 0
        L_0x0036:
            i.c.d.q.m.e r7 = r3.f4799f
            i.c.a.b.l.g r7 = r7.b()
            java.util.concurrent.Executor r8 = r3.c
            i.c.d.q.m.g r9 = new i.c.d.q.m.g
            r9.<init>(r3, r5)
            i.c.a.b.l.g r3 = r7.b(r8, r9)
            i.c.d.q.e r5 = i.c.d.q.e.a
            i.c.a.b.l.d0 r3 = (i.c.a.b.l.d0) r3
            java.util.concurrent.Executor r6 = i.c.a.b.l.i.a
            i.c.a.b.l.g r3 = r3.a((java.util.concurrent.Executor) r6, r5)
            java.util.concurrent.Executor r5 = r1.c
            i.c.d.q.c r6 = new i.c.d.q.c
            r6.<init>(r1)
            i.c.a.b.l.g r1 = r3.a((java.util.concurrent.Executor) r5, r6)
            b.a.a.h.b r3 = b.a.a.h.b.a
            i.c.a.b.l.d0 r1 = (i.c.a.b.l.d0) r1
            java.util.concurrent.Executor r5 = i.c.a.b.l.i.a
            r1.a((java.util.concurrent.Executor) r5, r3)
            b.a.a.l.o$a r1 = b.a.a.l.o.f436b
            boolean r1 = r1.g(r15)
            java.lang.String r3 = ""
            r5 = 1
            if (r1 == 0) goto L_0x0221
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            nic.goi.aarogyasetu.CoronaApplication r6 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            java.lang.String r7 = "unique_id"
            java.lang.String r6 = b.a.a.k.a.a((android.content.Context) r6, (java.lang.String) r7, (java.lang.String) r3)
            if (r6 == 0) goto L_0x0087
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r7 = 0
            goto L_0x0088
        L_0x0087:
            r7 = 1
        L_0x0088:
            if (r7 != 0) goto L_0x00b7
            b.a.a.l.o$a r7 = b.a.a.l.o.f436b
            nic.goi.aarogyasetu.CoronaApplication r8 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            java.lang.String r9 = "CoronaApplication.instance"
            n.m.c.f.a((java.lang.Object) r8, (java.lang.String) r9)
            boolean r7 = r7.d(r8)
            if (r7 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00ac
            if (r6 == 0) goto L_0x00a6
            int r7 = r6.length()
            if (r7 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r7 = 0
            goto L_0x00a7
        L_0x00a6:
            r7 = 1
        L_0x00a7:
            if (r7 != 0) goto L_0x00ac
            r1.setName(r6)
        L_0x00ac:
            if (r1 == 0) goto L_0x00b7
            boolean r6 = r1.isEnabled()
            if (r6 != 0) goto L_0x00b7
            r1.enable()
        L_0x00b7:
            b.a.a.l.o$a r1 = b.a.a.l.o.f436b
            q.e0 r1 = i.c.d.p.e.a((boolean) r4, (boolean) r4, (boolean) r4, (java.lang.String) r3)
            java.lang.Object r1 = r1.a(r0)
            b.a.a.j.c r1 = (b.a.a.j.c) r1
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r7 = "pt"
            java.lang.String r8 = "9cf23ec2-d83c-4778-aca5-d7fb64ae1b2d"
            r6.put(r7, r8)
            r7 = 1045(0x415, float:1.464E-42)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "ver"
            r6.put(r8, r7)
            java.lang.String r7 = "ver-name"
            java.lang.String r8 = "1.1.1"
            r6.put(r7, r8)
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "os"
            r6.put(r8, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = android.os.Build.MANUFACTURER
            r7.append(r8)
            java.lang.String r8 = "-"
            r7.append(r8)
            java.lang.String r8 = android.os.Build.MODEL
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "device-type"
            r6.put(r8, r7)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "application/json"
            r6.put(r7, r8)
            q.d r1 = r1.b(r6)
            b.a.a.l.m r6 = new b.a.a.l.m
            r6.<init>()
            r1.a(r6)
            android.content.Intent r1 = r15.getIntent()
            if (r1 == 0) goto L_0x01b4
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r6 = "intent"
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r6)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x01b4
            android.content.Intent r1 = r15.getIntent()
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r6)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x01b0
            java.lang.String r7 = "target"
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x0173
            b.a.a.l.o$a r8 = b.a.a.l.o.f436b
            android.content.Intent r1 = r15.getIntent()
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r6)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x015b
            java.lang.String r1 = r1.getString(r7)
            r9 = r1
            goto L_0x015c
        L_0x015b:
            r9 = r2
        L_0x015c:
            if (r9 == 0) goto L_0x016f
            java.lang.String r1 = "intent.extras?.getString(Constants.TARGET)!!"
            n.m.c.f.a((java.lang.Object) r9, (java.lang.String) r1)
            r12 = 0
            r13 = 0
            r14 = 24
            java.lang.String r10 = ""
            r11 = r15
            b.a.a.l.o.a.a(r8, r9, r10, r11, r12, r13, r14)
            r1 = 1
            goto L_0x01b5
        L_0x016f:
            n.m.c.f.a()
            throw r2
        L_0x0173:
            android.content.Intent r1 = r15.getIntent()
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r6)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x01ac
            java.lang.String r7 = "p"
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x01b4
            android.content.Intent r1 = r15.getIntent()
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r6)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x01a8
            java.lang.String r1 = r1.getString(r7)
            r2 = 2
            java.lang.String r6 = "1"
            boolean r1 = n.q.d.a(r1, r6, r4, r2)
            if (r1 == 0) goto L_0x01b4
            b.a.a.l.o$a r1 = b.a.a.l.o.f436b
            r1.h(r15)
            goto L_0x01b4
        L_0x01a8:
            n.m.c.f.a()
            throw r2
        L_0x01ac:
            n.m.c.f.a()
            throw r2
        L_0x01b0:
            n.m.c.f.a()
            throw r2
        L_0x01b4:
            r1 = 0
        L_0x01b5:
            if (r1 == 0) goto L_0x01bb
            r15.finish()
            return
        L_0x01bb:
            nic.goi.aarogyasetu.CoronaApplication.h()
            android.content.SharedPreferences r1 = b.a.a.k.a.a(r15)
            java.lang.String r2 = "USER_SELECTED_LANGUAGE_CODE"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x01ff
            b.a.a.l.h r1 = b.a.a.l.h.c
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x01d3
            goto L_0x01ef
        L_0x01d3:
            q.e0 r1 = i.c.d.p.e.a((boolean) r4, (boolean) r4, (boolean) r5, (java.lang.String) r3)
            java.lang.Object r0 = r1.a(r0)
            b.a.a.j.c r0 = (b.a.a.j.c) r0
            b.a.a.l.o$a r1 = b.a.a.l.o.f436b
            java.util.Map r1 = r1.a((boolean) r4)
            q.d r0 = r0.a((java.util.Map<java.lang.String, java.lang.String>) r1)
            b.a.a.a.w0 r1 = new b.a.a.a.w0
            r1.<init>(r15)
            r0.a(r1)
        L_0x01ef:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            b.a.a.a.x0 r1 = new b.a.a.a.x0
            r1.<init>(r15)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            goto L_0x0243
        L_0x01ff:
            h.l.d.r r0 = r15.k()
            java.lang.String r1 = "supportFragmentManager"
            n.m.c.f.a((java.lang.Object) r0, (java.lang.String) r1)
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x0219
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<nic.goi.aarogyasetu.views.OnboardingActivity> r1 = nic.goi.aarogyasetu.views.OnboardingActivity.class
            r0.<init>(r15, r1)
            r15.startActivity(r0)
            r15.finish()
        L_0x0219:
            h.l.d.r r0 = r15.k()
            b.a.a.a.v0.a((h.l.d.r) r0, (boolean) r4)
            goto L_0x0243
        L_0x0221:
            b.a.a.a.o0 r0 = new b.a.a.a.o0
            r0.<init>()
            r0.d((boolean) r4)
            r0.o0 = r3
            h.l.d.r r1 = r15.k()
            if (r1 == 0) goto L_0x0244
            h.l.d.a r2 = new h.l.d.a
            r2.<init>(r1)
            java.lang.String r1 = "supportFragmentManager.beginTransaction()"
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r1)
            java.lang.String r1 = r0.B
            r2.a(r4, r0, r1, r5)
            r2.a()
        L_0x0243:
            return
        L_0x0244:
            throw r2
        L_0x0245:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nic.goi.aarogyasetu.views.SplashActivity.o():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (i.i(this)) {
            g.a aVar = new g.a(this);
            y0 y0Var = new y0(this);
            AlertController.b bVar = aVar.a;
            bVar.f58i = "Close";
            bVar.f59j = y0Var;
            bVar.f55f = "Alert";
            bVar.f57h = "You can't use this application due to security restrictions(rooted device)";
            bVar.f62m = false;
            if (!isFinishing()) {
                aVar.a().show();
            }
        } else {
            o();
        }
        b.a();
        b.a("splashScreen", (Bundle) null, 2);
    }

    public void a(String str) {
        o();
    }
}
