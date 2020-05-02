package h.b.o.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import h.b.g;
import h.b.o.i.m;
import h.b.p.l0;
import h.b.p.m0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int F = g.abc_cascading_menu_item_layout;
    public boolean A;
    public m.a B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;

    /* renamed from: f  reason: collision with root package name */
    public final Context f1258f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1259g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1260h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1261i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1262j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f1263k;

    /* renamed from: l  reason: collision with root package name */
    public final List<g> f1264l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final List<C0036d> f1265m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1266n = new a();

    /* renamed from: o  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1267o = new b();

    /* renamed from: p  reason: collision with root package name */
    public final l0 f1268p = new c();

    /* renamed from: q  reason: collision with root package name */
    public int f1269q;
    public int r;
    public View s;
    public View t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    /* compiled from: CascadingMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.f1265m.size() > 0 && !d.this.f1265m.get(0).a.E) {
                View view = d.this.t;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0036d dVar : d.this.f1265m) {
                    dVar.a.a();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.C = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.C.removeGlobalOnLayoutListener(dVar.f1266n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    public class c implements l0 {

        /* compiled from: CascadingMenuPopup */
        public class a implements Runnable {
            public final /* synthetic */ C0036d e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ MenuItem f1270f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ g f1271g;

            public a(C0036d dVar, MenuItem menuItem, g gVar) {
                this.e = dVar;
                this.f1270f = menuItem;
                this.f1271g = gVar;
            }

            public void run() {
                C0036d dVar = this.e;
                if (dVar != null) {
                    d.this.E = true;
                    dVar.f1273b.a(false);
                    d.this.E = false;
                }
                if (this.f1270f.isEnabled() && this.f1270f.hasSubMenu()) {
                    this.f1271g.a(this.f1270f, 4);
                }
            }
        }

        public c() {
        }

        public void a(g gVar, MenuItem menuItem) {
            C0036d dVar = null;
            d.this.f1263k.removeCallbacksAndMessages((Object) null);
            int size = d.this.f1265m.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f1265m.get(i2).f1273b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < d.this.f1265m.size()) {
                    dVar = d.this.f1265m.get(i3);
                }
                d.this.f1263k.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void b(g gVar, MenuItem menuItem) {
            d.this.f1263k.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: h.b.o.i.d$d  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    public static class C0036d {
        public final m0 a;

        /* renamed from: b  reason: collision with root package name */
        public final g f1273b;
        public final int c;

        public C0036d(m0 m0Var, g gVar, int i2) {
            this.a = m0Var;
            this.f1273b = gVar;
            this.c = i2;
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        int i4 = 0;
        this.f1269q = 0;
        this.r = 0;
        this.f1258f = context;
        this.s = view;
        this.f1260h = i2;
        this.f1261i = i3;
        this.f1262j = z2;
        this.z = false;
        this.u = h.h.m.m.k(view) != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.f1259g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.b.d.abc_config_prefDialogWidth));
        this.f1263k = new Handler();
    }

    public void a() {
        if (!b()) {
            for (g c2 : this.f1264l) {
                c(c2);
            }
            this.f1264l.clear();
            View view = this.s;
            this.t = view;
            if (view != null) {
                boolean z2 = this.C == null;
                ViewTreeObserver viewTreeObserver = this.t.getViewTreeObserver();
                this.C = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1266n);
                }
                this.t.addOnAttachStateChangeListener(this.f1267o);
            }
        }
    }

    public void b(boolean z2) {
        this.z = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014f, code lost:
        if ((r11[0] - r4) < 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0153, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(h.b.o.i.g r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f1258f
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            h.b.o.i.f r3 = new h.b.o.i.f
            boolean r4 = r0.f1262j
            int r5 = F
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.b()
            r5 = 1
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.z
            if (r4 == 0) goto L_0x0021
            r3.f1284g = r5
            goto L_0x002d
        L_0x0021:
            boolean r4 = r16.b()
            if (r4 == 0) goto L_0x002d
            boolean r4 = h.b.o.i.k.b((h.b.o.i.g) r17)
            r3.f1284g = r4
        L_0x002d:
            android.content.Context r4 = r0.f1258f
            int r6 = r0.f1259g
            r7 = 0
            int r4 = h.b.o.i.k.a(r3, r7, r4, r6)
            h.b.p.m0 r6 = new h.b.p.m0
            android.content.Context r8 = r0.f1258f
            int r9 = r0.f1260h
            int r10 = r0.f1261i
            r6.<init>(r8, r7, r9, r10)
            h.b.p.l0 r8 = r0.f1268p
            r6.J = r8
            r6.w = r0
            android.widget.PopupWindow r8 = r6.F
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.s
            r6.v = r8
            int r8 = r0.r
            r6.f1439p = r8
            r6.a((boolean) r5)
            android.widget.PopupWindow r8 = r6.F
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.a((android.widget.ListAdapter) r3)
            r6.d(r4)
            int r3 = r0.r
            r6.f1439p = r3
            java.util.List<h.b.o.i.d$d> r3 = r0.f1265m
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e5
            java.util.List<h.b.o.i.d$d> r3 = r0.f1265m
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            h.b.o.i.d$d r3 = (h.b.o.i.d.C0036d) r3
            h.b.o.i.g r10 = r3.f1273b
            int r11 = r10.size()
            r12 = 0
        L_0x0084:
            if (r12 >= r11) goto L_0x009a
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0097
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x009a:
            r13 = r7
        L_0x009b:
            if (r13 != 0) goto L_0x009e
            goto L_0x00e7
        L_0x009e:
            h.b.p.m0 r10 = r3.a
            h.b.p.f0 r10 = r10.f1430g
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b7
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            h.b.o.i.f r11 = (h.b.o.i.f) r11
            goto L_0x00ba
        L_0x00b7:
            h.b.o.i.f r11 = (h.b.o.i.f) r11
            r12 = 0
        L_0x00ba:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00bf:
            r9 = -1
            if (r15 >= r14) goto L_0x00cd
            h.b.o.i.i r7 = r11.getItem((int) r15)
            if (r13 != r7) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00bf
        L_0x00cd:
            r15 = -1
        L_0x00ce:
            if (r15 != r9) goto L_0x00d1
            goto L_0x00e6
        L_0x00d1:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e6
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e0
            goto L_0x00e6
        L_0x00e0:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e7
        L_0x00e5:
            r3 = 0
        L_0x00e6:
            r7 = 0
        L_0x00e7:
            if (r7 == 0) goto L_0x01b8
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0109
            java.lang.reflect.Method r9 = h.b.p.m0.K
            if (r9 == 0) goto L_0x010e
            android.widget.PopupWindow r10 = r6.F     // Catch:{ Exception -> 0x0101 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0101 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0101 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0101 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0101 }
            goto L_0x010e
        L_0x0101:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x010e
        L_0x0109:
            android.widget.PopupWindow r9 = r6.F
            r9.setTouchModal(r8)
        L_0x010e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x011a
            android.widget.PopupWindow r9 = r6.F
            r10 = 0
            r9.setEnterTransition(r10)
        L_0x011a:
            java.util.List<h.b.o.i.d$d> r9 = r0.f1265m
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            h.b.o.i.d$d r9 = (h.b.o.i.d.C0036d) r9
            h.b.p.m0 r9 = r9.a
            h.b.p.f0 r9 = r9.f1430g
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.t
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.u
            if (r12 != r5) goto L_0x014c
            r11 = r11[r8]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r4
            int r10 = r10.right
            if (r9 <= r10) goto L_0x0151
            goto L_0x0153
        L_0x014c:
            r9 = r11[r8]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0153
        L_0x0151:
            r9 = 1
            goto L_0x0154
        L_0x0153:
            r9 = 0
        L_0x0154:
            if (r9 != r5) goto L_0x0158
            r10 = 1
            goto L_0x0159
        L_0x0158:
            r10 = 0
        L_0x0159:
            r0.u = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x0167
            r6.v = r7
            r9 = 0
            r13 = 0
            goto L_0x0198
        L_0x0167:
            r9 = 2
            int[] r11 = new int[r9]
            android.view.View r13 = r0.s
            r13.getLocationOnScreen(r11)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.r
            r13 = r13 & 7
            if (r13 != r12) goto L_0x018e
            r13 = r11[r8]
            android.view.View r14 = r0.s
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r11[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x018e:
            r13 = r9[r8]
            r14 = r11[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r11 = r11[r5]
            int r9 = r9 - r11
        L_0x0198:
            int r11 = r0.r
            r11 = r11 & r12
            if (r11 != r12) goto L_0x01a5
            if (r10 == 0) goto L_0x01a0
            goto L_0x01ab
        L_0x01a0:
            int r4 = r7.getWidth()
            goto L_0x01ad
        L_0x01a5:
            if (r10 == 0) goto L_0x01ad
            int r4 = r7.getWidth()
        L_0x01ab:
            int r13 = r13 + r4
            goto L_0x01ae
        L_0x01ad:
            int r13 = r13 - r4
        L_0x01ae:
            r6.f1433j = r13
            r6.f1438o = r5
            r6.f1437n = r5
            r6.b(r9)
            goto L_0x01d6
        L_0x01b8:
            boolean r4 = r0.v
            if (r4 == 0) goto L_0x01c0
            int r4 = r0.x
            r6.f1433j = r4
        L_0x01c0:
            boolean r4 = r0.w
            if (r4 == 0) goto L_0x01c9
            int r4 = r0.y
            r6.b(r4)
        L_0x01c9:
            android.graphics.Rect r4 = r0.e
            if (r4 == 0) goto L_0x01d3
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4)
            goto L_0x01d4
        L_0x01d3:
            r10 = 0
        L_0x01d4:
            r6.D = r10
        L_0x01d6:
            h.b.o.i.d$d r4 = new h.b.o.i.d$d
            int r5 = r0.u
            r4.<init>(r6, r1, r5)
            java.util.List<h.b.o.i.d$d> r5 = r0.f1265m
            r5.add(r4)
            r6.a()
            h.b.p.f0 r4 = r6.f1430g
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x0214
            boolean r3 = r0.A
            if (r3 == 0) goto L_0x0214
            java.lang.CharSequence r3 = r1.f1296m
            if (r3 == 0) goto L_0x0214
            int r3 = h.b.g.abc_popup_menu_header_item_layout
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f1296m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.a()
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.o.i.d.c(h.b.o.i.g):void");
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public void dismiss() {
        int size = this.f1265m.size();
        if (size > 0) {
            C0036d[] dVarArr = (C0036d[]) this.f1265m.toArray(new C0036d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0036d dVar = dVarArr[i2];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    public ListView g() {
        if (this.f1265m.isEmpty()) {
            return null;
        }
        List<C0036d> list = this.f1265m;
        return list.get(list.size() - 1).a.f1430g;
    }

    public void onDismiss() {
        C0036d dVar;
        int size = this.f1265m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1265m.get(i2);
            if (!dVar.a.b()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f1273b.a(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean b() {
        return this.f1265m.size() > 0 && this.f1265m.get(0).a.b();
    }

    public void b(int i2) {
        this.v = true;
        this.x = i2;
    }

    public void a(g gVar) {
        gVar.a((m) this, this.f1258f);
        if (b()) {
            c(gVar);
        } else {
            this.f1264l.add(gVar);
        }
    }

    public void a(boolean z2) {
        for (C0036d dVar : this.f1265m) {
            ListAdapter adapter = dVar.a.f1430g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    public void a(m.a aVar) {
        this.B = aVar;
    }

    public boolean a(r rVar) {
        for (C0036d next : this.f1265m) {
            if (rVar == next.f1273b) {
                next.a.f1430g.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.a((m) this, this.f1258f);
        if (b()) {
            c((g) rVar);
        } else {
            this.f1264l.add(rVar);
        }
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.a(rVar);
        }
        return true;
    }

    public void a(g gVar, boolean z2) {
        int size = this.f1265m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (gVar == this.f1265m.get(i2).f1273b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.f1265m.size()) {
                this.f1265m.get(i3).f1273b.a(false);
            }
            C0036d remove = this.f1265m.remove(i2);
            remove.f1273b.a((m) this);
            if (this.E) {
                m0 m0Var = remove.a;
                if (m0Var != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        m0Var.F.setExitTransition((Transition) null);
                    }
                    remove.a.F.setAnimationStyle(0);
                } else {
                    throw null;
                }
            }
            remove.a.dismiss();
            int size2 = this.f1265m.size();
            if (size2 > 0) {
                this.u = this.f1265m.get(size2 - 1).c;
            } else {
                this.u = h.h.m.m.k(this.s) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                m.a aVar = this.B;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.C.removeGlobalOnLayoutListener(this.f1266n);
                    }
                    this.C = null;
                }
                this.t.removeOnAttachStateChangeListener(this.f1267o);
                this.D.onDismiss();
            } else if (z2) {
                this.f1265m.get(0).f1273b.a(false);
            }
        }
    }

    public void a(int i2) {
        if (this.f1269q != i2) {
            this.f1269q = i2;
            this.r = Gravity.getAbsoluteGravity(i2, h.h.m.m.k(this.s));
        }
    }

    public void a(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = Gravity.getAbsoluteGravity(this.f1269q, h.h.m.m.k(view));
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    public void c(int i2) {
        this.w = true;
        this.y = i2;
    }

    public void c(boolean z2) {
        this.A = z2;
    }
}
