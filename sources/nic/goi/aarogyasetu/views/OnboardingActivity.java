package nic.goi.aarogyasetu.views;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import b.a.a.a.v0;
import b.a.a.e;
import h.b.k.h;
import h.h.f.a;
import java.util.HashMap;
import n.m.c.f;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.utility.ViewPagerFixed;

/* compiled from: OnboardingActivity.kt */
public final class OnboardingActivity extends h implements v0.a {
    public boolean u = true;
    public HashMap v;

    public View c(int i2) {
        if (this.v == null) {
            this.v = new HashMap();
        }
        View view = (View) this.v.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.v.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void d(int i2) {
        try {
            Window window = getWindow();
            f.a((Object) window, "window");
            window.setStatusBarColor(a.a((Context) this, i2));
        } catch (Exception unused) {
        }
    }

    public void g() {
        if (this.u) {
            Button button = (Button) c(e.close);
            f.a((Object) button, "close");
            button.setText(i.c.d.p.e.a((Context) this, (int) R.string.next));
        } else {
            Button button2 = (Button) c(e.close);
            f.a((Object) button2, "close");
            button2.setText(i.c.d.p.e.a((Context) this, (int) R.string.close));
        }
        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) c(e.pager);
        f.a((Object) viewPagerFixed, "pager");
        h.z.a.a adapter = viewPagerFixed.getAdapter();
        if (adapter != null) {
            adapter.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r6 < r0) goto L_0x0020
            android.view.Window r6 = r5.getWindow()
            java.lang.String r0 = "window"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r0)
            android.view.View r6 = r6.getDecorView()
            java.lang.String r0 = "window.decorView"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            r6.setSystemUiVisibility(r0)
        L_0x0020:
            r6 = 2131099850(0x7f0600ca, float:1.7812065E38)
            r5.d(r6)
            r6 = 2131558429(0x7f0d001d, float:1.8742174E38)
            r5.setContentView((int) r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "intent"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r0)
            android.os.Bundle r6 = r6.getExtras()
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L_0x0059
            android.content.Intent r6 = r5.getIntent()
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r0)
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L_0x0055
            java.lang.String r0 = "finishbutton"
            boolean r6 = r6.containsKey(r0)
            if (r6 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            r6 = 0
            goto L_0x005a
        L_0x0055:
            n.m.c.f.a()
            throw r2
        L_0x0059:
            r6 = 1
        L_0x005a:
            r5.u = r6
            r0 = 2
            java.lang.String r3 = "close"
            if (r6 != 0) goto L_0x00ac
            int r6 = b.a.a.e.close
            android.view.View r6 = r5.c(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r3)
            r4 = 2131755050(0x7f10002a, float:1.9140968E38)
            java.lang.String r4 = i.c.d.p.e.a((android.content.Context) r5, (int) r4)
            r6.setText(r4)
            int r6 = b.a.a.e.close
            android.view.View r6 = r5.c(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r3)
            r6.setVisibility(r1)
            int r6 = b.a.a.e.close
            android.view.View r6 = r5.c(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            b.a.a.a.s0 r1 = new b.a.a.a.s0
            r1.<init>(r5)
            r6.setOnClickListener(r1)
            int r6 = b.a.a.e.language_change
            android.view.View r6 = r5.c(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r1 = "language_change"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r1)
            r1 = 8
            r6.setVisibility(r1)
            java.lang.String r6 = "infoScreen"
            b.a.a.l.b.a(r6, r2, r0)
            goto L_0x00e4
        L_0x00ac:
            int r6 = b.a.a.e.close
            android.view.View r6 = r5.c(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r3)
            r6.setVisibility(r1)
            int r6 = b.a.a.e.close
            android.view.View r6 = r5.c(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r3)
            r1 = 2131755148(0x7f10008c, float:1.9141167E38)
            java.lang.String r1 = i.c.d.p.e.a((android.content.Context) r5, (int) r1)
            r6.setText(r1)
            int r6 = b.a.a.e.close
            android.view.View r6 = r5.c(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            b.a.a.a.q0 r1 = new b.a.a.a.q0
            r1.<init>(r5)
            r6.setOnClickListener(r1)
            java.lang.String r6 = "OnboardingScreen"
            b.a.a.l.b.a(r6, r2, r0)
        L_0x00e4:
            int r6 = b.a.a.e.language_change
            android.view.View r6 = r5.c(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            b.a.a.a.p0 r0 = new b.a.a.a.p0
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            int r6 = b.a.a.e.pager
            android.view.View r6 = r5.c(r6)
            nic.goi.aarogyasetu.utility.ViewPagerFixed r6 = (nic.goi.aarogyasetu.utility.ViewPagerFixed) r6
            java.lang.String r0 = "pager"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r0)
            b.a.a.a.t0 r0 = new b.a.a.a.t0
            h.l.d.r r1 = r5.k()
            java.lang.String r2 = "supportFragmentManager"
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r2)
            boolean r2 = r5.u
            r0.<init>(r1, r2)
            r6.setAdapter(r0)
            int r6 = b.a.a.e.pageindicator
            android.view.View r6 = r5.c(r6)
            com.viewpagerindicator.CirclePageIndicator r6 = (com.viewpagerindicator.CirclePageIndicator) r6
            int r0 = b.a.a.e.pager
            android.view.View r0 = r5.c(r0)
            nic.goi.aarogyasetu.utility.ViewPagerFixed r0 = (nic.goi.aarogyasetu.utility.ViewPagerFixed) r0
            r6.setViewPager(r0)
            int r6 = b.a.a.e.pager
            android.view.View r6 = r5.c(r6)
            nic.goi.aarogyasetu.utility.ViewPagerFixed r6 = (nic.goi.aarogyasetu.utility.ViewPagerFixed) r6
            b.a.a.a.r0 r0 = new b.a.a.a.r0
            r0.<init>(r5)
            java.util.List<h.z.a.b$i> r1 = r6.a0
            if (r1 != 0) goto L_0x013f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.a0 = r1
        L_0x013f:
            java.util.List<h.z.a.b$i> r6 = r6.a0
            r6.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nic.goi.aarogyasetu.views.OnboardingActivity.onCreate(android.os.Bundle):void");
    }
}
