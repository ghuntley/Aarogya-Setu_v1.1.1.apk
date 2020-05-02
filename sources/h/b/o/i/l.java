package h.b.o.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import h.b.o.i.m;

/* compiled from: MenuPopupHelper */
public class l {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final g f1319b;
    public final boolean c;
    public final int d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public View f1320f;

    /* renamed from: g  reason: collision with root package name */
    public int f1321g = 8388611;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1322h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f1323i;

    /* renamed from: j  reason: collision with root package name */
    public k f1324j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1325k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f1326l = new a();

    /* compiled from: MenuPopupHelper */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.f1319b = gVar;
        this.f1320f = view;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [h.b.o.i.m, h.b.o.i.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [h.b.o.i.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [h.b.o.i.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h.b.o.i.k a() {
        /*
            r14 = this;
            h.b.o.i.k r0 = r14.f1324j
            if (r0 != 0) goto L_0x0078
            android.content.Context r0 = r14.a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = h.b.d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0046
            h.b.o.i.d r0 = new h.b.o.i.d
            android.content.Context r2 = r14.a
            android.view.View r3 = r14.f1320f
            int r4 = r14.d
            int r5 = r14.e
            boolean r6 = r14.c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0058
        L_0x0046:
            h.b.o.i.q r0 = new h.b.o.i.q
            android.content.Context r8 = r14.a
            h.b.o.i.g r9 = r14.f1319b
            android.view.View r10 = r14.f1320f
            int r11 = r14.d
            int r12 = r14.e
            boolean r13 = r14.c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0058:
            h.b.o.i.g r1 = r14.f1319b
            r0.a((h.b.o.i.g) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1326l
            r0.a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f1320f
            r0.a((android.view.View) r1)
            h.b.o.i.m$a r1 = r14.f1323i
            r0.a((h.b.o.i.m.a) r1)
            boolean r1 = r14.f1322h
            r0.b((boolean) r1)
            int r1 = r14.f1321g
            r0.a((int) r1)
            r14.f1324j = r0
        L_0x0078:
            h.b.o.i.k r0 = r14.f1324j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.o.i.l.a():h.b.o.i.k");
    }

    public boolean b() {
        k kVar = this.f1324j;
        return kVar != null && kVar.b();
    }

    public void c() {
        this.f1324j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1325k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean d() {
        if (b()) {
            return true;
        }
        if (this.f1320f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public final void a(int i2, int i3, boolean z, boolean z2) {
        k a2 = a();
        a2.c(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f1321g, h.h.m.m.k(this.f1320f)) & 7) == 5) {
                i2 -= this.f1320f.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.e = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.a();
    }

    public void a(m.a aVar) {
        this.f1323i = aVar;
        k kVar = this.f1324j;
        if (kVar != null) {
            kVar.a(aVar);
        }
    }
}
