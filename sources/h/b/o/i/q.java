package h.b.o.i;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import h.b.d;
import h.b.g;
import h.b.o.i.m;
import h.b.p.m0;

/* compiled from: StandardMenuPopup */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    public static final int z = g.abc_popup_menu_item_layout;

    /* renamed from: f  reason: collision with root package name */
    public final Context f1327f;

    /* renamed from: g  reason: collision with root package name */
    public final g f1328g;

    /* renamed from: h  reason: collision with root package name */
    public final f f1329h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1330i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1331j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1332k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1333l;

    /* renamed from: m  reason: collision with root package name */
    public final m0 f1334m;

    /* renamed from: n  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1335n = new a();

    /* renamed from: o  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1336o = new b();

    /* renamed from: p  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1337p;

    /* renamed from: q  reason: collision with root package name */
    public View f1338q;
    public View r;
    public m.a s;
    public ViewTreeObserver t;
    public boolean u;
    public boolean v;
    public int w;
    public int x = 0;
    public boolean y;

    /* compiled from: StandardMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.b()) {
                q qVar = q.this;
                if (!qVar.f1334m.E) {
                    View view = qVar.r;
                    if (view == null || !view.isShown()) {
                        q.this.dismiss();
                    } else {
                        q.this.f1334m.a();
                    }
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.t = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.t.removeGlobalOnLayoutListener(qVar.f1335n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z2) {
        this.f1327f = context;
        this.f1328g = gVar;
        this.f1330i = z2;
        this.f1329h = new f(gVar, LayoutInflater.from(context), this.f1330i, z);
        this.f1332k = i2;
        this.f1333l = i3;
        Resources resources = context.getResources();
        this.f1331j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.f1338q = view;
        this.f1334m = new m0(this.f1327f, (AttributeSet) null, this.f1332k, this.f1333l);
        gVar.a((m) this, context);
    }

    public void a(int i2) {
        this.x = i2;
    }

    public void a(g gVar) {
    }

    public void b(boolean z2) {
        this.f1329h.f1284g = z2;
    }

    public void c(int i2) {
        m0 m0Var = this.f1334m;
        m0Var.f1434k = i2;
        m0Var.f1436m = true;
    }

    public boolean c() {
        return false;
    }

    public void dismiss() {
        if (b()) {
            this.f1334m.dismiss();
        }
    }

    public ListView g() {
        return this.f1334m.f1430g;
    }

    public void onDismiss() {
        this.u = true;
        this.f1328g.a(true);
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.f1335n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.f1336o);
        PopupWindow.OnDismissListener onDismissListener = this.f1337p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r7 = this;
            boolean r0 = r7.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0008:
            r1 = 1
            goto L_0x00c6
        L_0x000b:
            boolean r0 = r7.u
            if (r0 != 0) goto L_0x00c6
            android.view.View r0 = r7.f1338q
            if (r0 != 0) goto L_0x0015
            goto L_0x00c6
        L_0x0015:
            r7.r = r0
            h.b.p.m0 r0 = r7.f1334m
            android.widget.PopupWindow r0 = r0.F
            r0.setOnDismissListener(r7)
            h.b.p.m0 r0 = r7.f1334m
            r0.w = r7
            r0.a((boolean) r2)
            android.view.View r0 = r7.r
            android.view.ViewTreeObserver r3 = r7.t
            if (r3 != 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.t = r4
            if (r3 == 0) goto L_0x003b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f1335n
            r4.addOnGlobalLayoutListener(r3)
        L_0x003b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f1336o
            r0.addOnAttachStateChangeListener(r3)
            h.b.p.m0 r3 = r7.f1334m
            r3.v = r0
            int r0 = r7.x
            r3.f1439p = r0
            boolean r0 = r7.v
            r3 = 0
            if (r0 != 0) goto L_0x005b
            h.b.o.i.f r0 = r7.f1329h
            android.content.Context r4 = r7.f1327f
            int r5 = r7.f1331j
            int r0 = h.b.o.i.k.a(r0, r3, r4, r5)
            r7.w = r0
            r7.v = r2
        L_0x005b:
            h.b.p.m0 r0 = r7.f1334m
            int r4 = r7.w
            r0.d(r4)
            h.b.p.m0 r0 = r7.f1334m
            r4 = 2
            android.widget.PopupWindow r0 = r0.F
            r0.setInputMethodMode(r4)
            h.b.p.m0 r0 = r7.f1334m
            android.graphics.Rect r4 = r7.e
            if (r0 == 0) goto L_0x00c5
            if (r4 == 0) goto L_0x0078
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L_0x0079
        L_0x0078:
            r5 = r3
        L_0x0079:
            r0.D = r5
            h.b.p.m0 r0 = r7.f1334m
            r0.a()
            h.b.p.m0 r0 = r7.f1334m
            h.b.p.f0 r0 = r0.f1430g
            r0.setOnKeyListener(r7)
            boolean r4 = r7.y
            if (r4 == 0) goto L_0x00b7
            h.b.o.i.g r4 = r7.f1328g
            java.lang.CharSequence r4 = r4.f1296m
            if (r4 == 0) goto L_0x00b7
            android.content.Context r4 = r7.f1327f
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = h.b.g.abc_popup_menu_header_item_layout
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00b1
            h.b.o.i.g r6 = r7.f1328g
            java.lang.CharSequence r6 = r6.f1296m
            r5.setText(r6)
        L_0x00b1:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        L_0x00b7:
            h.b.p.m0 r0 = r7.f1334m
            h.b.o.i.f r1 = r7.f1329h
            r0.a((android.widget.ListAdapter) r1)
            h.b.p.m0 r0 = r7.f1334m
            r0.a()
            goto L_0x0008
        L_0x00c5:
            throw r3
        L_0x00c6:
            if (r1 == 0) goto L_0x00c9
            return
        L_0x00c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.o.i.q.a():void");
    }

    public boolean b() {
        return !this.u && this.f1334m.b();
    }

    public void b(int i2) {
        this.f1334m.f1433j = i2;
    }

    public void c(boolean z2) {
        this.y = z2;
    }

    public void a(boolean z2) {
        this.v = false;
        f fVar = this.f1329h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public void a(m.a aVar) {
        this.s = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(h.b.o.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            h.b.o.i.l r0 = new h.b.o.i.l
            android.content.Context r3 = r9.f1327f
            android.view.View r5 = r9.r
            boolean r6 = r9.f1330i
            int r7 = r9.f1332k
            int r8 = r9.f1333l
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            h.b.o.i.m$a r2 = r9.s
            r0.a(r2)
            boolean r2 = h.b.o.i.k.b((h.b.o.i.g) r10)
            r0.f1322h = r2
            h.b.o.i.k r3 = r0.f1324j
            if (r3 == 0) goto L_0x002a
            r3.b((boolean) r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1337p
            r0.f1325k = r2
            r2 = 0
            r9.f1337p = r2
            h.b.o.i.g r2 = r9.f1328g
            r2.a((boolean) r1)
            h.b.p.m0 r2 = r9.f1334m
            int r3 = r2.f1433j
            boolean r4 = r2.f1436m
            if (r4 != 0) goto L_0x0040
            r2 = 0
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f1434k
        L_0x0042:
            int r4 = r9.x
            android.view.View r5 = r9.f1338q
            int r5 = h.h.m.m.k(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005a
            android.view.View r4 = r9.f1338q
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005a:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            android.view.View r4 = r0.f1320f
            if (r4 != 0) goto L_0x0068
            r0 = 0
            goto L_0x006c
        L_0x0068:
            r0.a(r3, r2, r5, r5)
        L_0x006b:
            r0 = 1
        L_0x006c:
            if (r0 == 0) goto L_0x0076
            h.b.o.i.m$a r0 = r9.s
            if (r0 == 0) goto L_0x0075
            r0.a(r10)
        L_0x0075:
            return r5
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.o.i.q.a(h.b.o.i.r):boolean");
    }

    public void a(g gVar, boolean z2) {
        if (gVar == this.f1328g) {
            dismiss();
            m.a aVar = this.s;
            if (aVar != null) {
                aVar.a(gVar, z2);
            }
        }
    }

    public void a(View view) {
        this.f1338q = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1337p = onDismissListener;
    }
}
