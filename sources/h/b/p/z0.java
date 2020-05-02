package h.b.p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import h.b.h;
import h.b.j;
import h.b.o.i.g;
import h.b.o.i.i;
import h.b.o.i.m;
import h.h.m.r;
import h.h.m.t;

/* compiled from: ToolbarWidgetWrapper */
public class z0 implements d0 {
    public Toolbar a;

    /* renamed from: b  reason: collision with root package name */
    public int f1507b;
    public View c;
    public View d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1508f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1509g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1510h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1511i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1512j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1513k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1514l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1515m;

    /* renamed from: n  reason: collision with root package name */
    public c f1516n;

    /* renamed from: o  reason: collision with root package name */
    public int f1517o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f1518p = 0;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f1519q;

    /* compiled from: ToolbarWidgetWrapper */
    public class a extends t {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1520b;

        public a(int i2) {
            this.f1520b = i2;
        }

        public void a(View view) {
            if (!this.a) {
                z0.this.a.setVisibility(this.f1520b);
            }
        }

        public void b(View view) {
            z0.this.a.setVisibility(0);
        }

        public void c(View view) {
            this.a = true;
        }
    }

    public z0(Toolbar toolbar, boolean z) {
        int i2;
        Drawable drawable;
        int i3 = h.abc_action_bar_up_description;
        this.a = toolbar;
        this.f1511i = toolbar.getTitle();
        this.f1512j = toolbar.getSubtitle();
        this.f1510h = this.f1511i != null;
        this.f1509g = toolbar.getNavigationIcon();
        String str = null;
        x0 a2 = x0.a(toolbar.getContext(), (AttributeSet) null, j.ActionBar, h.b.a.actionBarStyle, 0);
        this.f1519q = a2.b(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e2 = a2.e(j.ActionBar_title);
            if (!TextUtils.isEmpty(e2)) {
                this.f1510h = true;
                this.f1511i = e2;
                if ((this.f1507b & 8) != 0) {
                    this.a.setTitle(e2);
                }
            }
            CharSequence e3 = a2.e(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e3)) {
                this.f1512j = e3;
                if ((this.f1507b & 8) != 0) {
                    this.a.setSubtitle(e3);
                }
            }
            Drawable b2 = a2.b(j.ActionBar_logo);
            if (b2 != null) {
                this.f1508f = b2;
                q();
            }
            Drawable b3 = a2.b(j.ActionBar_icon);
            if (b3 != null) {
                this.e = b3;
                q();
            }
            if (this.f1509g == null && (drawable = this.f1519q) != null) {
                this.f1509g = drawable;
                p();
            }
            c(a2.d(j.ActionBar_displayOptions, 0));
            int f2 = a2.f(j.ActionBar_customNavigationLayout, 0);
            if (f2 != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(f2, this.a, false);
                View view = this.d;
                if (!(view == null || (this.f1507b & 16) == 0)) {
                    this.a.removeView(view);
                }
                this.d = inflate;
                if (!(inflate == null || (this.f1507b & 16) == 0)) {
                    this.a.addView(inflate);
                }
                c(this.f1507b | 16);
            }
            int e4 = a2.e(j.ActionBar_height, 0);
            if (e4 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = e4;
                this.a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(b4, 0);
                int max2 = Math.max(b5, 0);
                toolbar2.b();
                toolbar2.x.a(max, max2);
            }
            int f3 = a2.f(j.ActionBar_titleTextStyle, 0);
            if (f3 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.f146p = f3;
                TextView textView = toolbar3.f136f;
                if (textView != null) {
                    textView.setTextAppearance(context, f3);
                }
            }
            int f4 = a2.f(j.ActionBar_subtitleTextStyle, 0);
            if (f4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = toolbar4.getContext();
                toolbar4.f147q = f4;
                TextView textView2 = toolbar4.f137g;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, f4);
                }
            }
            int f5 = a2.f(j.ActionBar_popupTheme, 0);
            if (f5 != 0) {
                this.a.setPopupTheme(f5);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                i2 = 15;
                this.f1519q = this.a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f1507b = i2;
        }
        a2.f1492b.recycle();
        if (i3 != this.f1518p) {
            this.f1518p = i3;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i4 = this.f1518p;
                this.f1513k = i4 != 0 ? c().getString(i4) : str;
                o();
            }
        }
        this.f1513k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new y0(this));
    }

    public void a(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            h.b.p.c r0 = r0.x
            if (r0 == 0) goto L_0x001e
            h.b.p.c$c r3 = r0.z
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.z0.a():boolean");
    }

    public void b(int i2) {
        this.f1508f = i2 != 0 ? h.b.l.a.a.c(c(), i2) : null;
        q();
    }

    public Context c() {
        return this.a.getContext();
    }

    public void collapseActionView() {
        Toolbar.d dVar = this.a.O;
        i iVar = dVar == null ? null : dVar.f148f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public boolean d() {
        ActionMenuView actionMenuView = this.a.e;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.x;
        if (cVar != null && cVar.b()) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.a.g();
    }

    public void f() {
        this.f1515m = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.z0.g():boolean");
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public void h() {
        c cVar;
        ActionMenuView actionMenuView = this.a.e;
        if (actionMenuView != null && (cVar = actionMenuView.x) != null) {
            cVar.a();
        }
    }

    public int i() {
        return this.f1507b;
    }

    public ViewGroup j() {
        return this.a;
    }

    public int k() {
        return this.f1517o;
    }

    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean m() {
        Toolbar.d dVar = this.a.O;
        return (dVar == null || dVar.f148f == null) ? false : true;
    }

    public void n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void o() {
        if ((this.f1507b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1513k)) {
            this.a.setNavigationContentDescription(this.f1518p);
        } else {
            this.a.setNavigationContentDescription(this.f1513k);
        }
    }

    public final void p() {
        if ((this.f1507b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.f1509g;
            if (drawable == null) {
                drawable = this.f1519q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    public final void q() {
        Drawable drawable;
        int i2 = this.f1507b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1508f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    public void setIcon(int i2) {
        this.e = i2 != 0 ? h.b.l.a.a.c(c(), i2) : null;
        q();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1514l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1510h) {
            this.f1511i = charSequence;
            if ((this.f1507b & 8) != 0) {
                this.a.setTitle(charSequence);
            }
        }
    }

    public void c(int i2) {
        View view;
        int i3 = this.f1507b ^ i2;
        this.f1507b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    o();
                }
                p();
            }
            if ((i3 & 3) != 0) {
                q();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f1511i);
                    this.a.setSubtitle(this.f1512j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public boolean b() {
        return this.a.f();
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        q();
    }

    public void a(Menu menu, m.a aVar) {
        i iVar;
        if (this.f1516n == null) {
            this.f1516n = new c(this.a.getContext());
        }
        c cVar = this.f1516n;
        cVar.f1253i = aVar;
        Toolbar toolbar = this.a;
        g gVar = (g) menu;
        if (gVar != null || toolbar.e != null) {
            toolbar.d();
            g gVar2 = toolbar.e.t;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    gVar2.a((m) toolbar.N);
                    gVar2.a((m) toolbar.O);
                }
                if (toolbar.O == null) {
                    toolbar.O = new Toolbar.d();
                }
                cVar.u = true;
                if (gVar != null) {
                    gVar.a((m) cVar, toolbar.f144n);
                    gVar.a((m) toolbar.O, toolbar.f144n);
                } else {
                    cVar.a(toolbar.f144n, (g) null);
                    Toolbar.d dVar = toolbar.O;
                    g gVar3 = dVar.e;
                    if (!(gVar3 == null || (iVar = dVar.f148f) == null)) {
                        gVar3.a(iVar);
                    }
                    dVar.e = null;
                    cVar.a(true);
                    toolbar.O.a(true);
                }
                toolbar.e.setPopupTheme(toolbar.f145o);
                toolbar.e.setPresenter(cVar);
                toolbar.N = cVar;
            }
        }
    }

    public void b(boolean z) {
        this.a.setCollapsible(z);
    }

    public void a(q0 q0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = q0Var;
        if (q0Var != null && this.f1517o == 2) {
            this.a.addView(q0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.a = 8388691;
            q0Var.setAllowCollapse(true);
        }
    }

    public r a(int i2, long j2) {
        r a2 = h.h.m.m.a(this.a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.a(j2);
        a aVar = new a(i2);
        View view = (View) a2.a.get();
        if (view != null) {
            a2.a(view, aVar);
        }
        return a2;
    }

    public void a(int i2) {
        this.a.setVisibility(i2);
    }
}
