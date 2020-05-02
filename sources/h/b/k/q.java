package h.b.k;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import h.b.o.a;
import h.h.m.c;

/* compiled from: AppCompatDialog */
public class q extends Dialog implements i {
    public j e;

    /* renamed from: f  reason: collision with root package name */
    public final c.a f1153f;

    /* compiled from: AppCompatDialog */
    public class a implements c.a {
        public a() {
        }

        public boolean a(KeyEvent keyEvent) {
            return q.this.a(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = h.b.a.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r4.<init>(r5, r1)
            h.b.k.q$a r1 = new h.b.k.q$a
            r1.<init>()
            r4.f1153f = r1
            h.b.k.j r1 = r4.a()
            if (r6 != 0) goto L_0x0035
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = h.b.a.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L_0x0035:
            r5 = r1
            h.b.k.k r5 = (h.b.k.k) r5
            r5.R = r6
            r5 = 0
            r1.a((android.os.Bundle) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.q.<init>(android.content.Context, int):void");
    }

    public h.b.o.a a(a.C0035a aVar) {
        return null;
    }

    public void a(h.b.o.a aVar) {
    }

    public boolean a(int i2) {
        return a().a(i2);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public void b(h.b.o.a aVar) {
    }

    public void dismiss() {
        super.dismiss();
        a().c();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c.a(this.f1153f, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i2) {
        k kVar = (k) a();
        kVar.f();
        return kVar.f1127i.findViewById(i2);
    }

    public void invalidateOptionsMenu() {
        a().b();
    }

    public void onCreate(Bundle bundle) {
        a().a();
        super.onCreate(bundle);
        a().a(bundle);
    }

    public void onStop() {
        super.onStop();
        k kVar = (k) a();
        kVar.O = false;
        kVar.i();
        a aVar = kVar.f1130l;
        if (aVar != null) {
            aVar.c(false);
        }
    }

    public void setContentView(int i2) {
        a().b(i2);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    public j a() {
        if (this.e == null) {
            this.e = j.a((Dialog) this, (i) this);
        }
        return this.e;
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        a().a((CharSequence) getContext().getString(i2));
    }

    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
