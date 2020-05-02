package h.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h.b.j;
import h.b.k.a;
import h.b.o.a;
import h.b.o.f;
import h.b.o.g;
import h.b.o.i.g;
import h.b.p.d0;
import h.b.p.q0;
import h.h.m.m;
import h.h.m.r;
import h.h.m.s;
import h.h.m.t;
import h.h.m.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar */
public class v extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new AccelerateInterpolator();
    public static final Interpolator B = new DecelerateInterpolator();
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public Context f1161b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public d0 e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f1162f;

    /* renamed from: g  reason: collision with root package name */
    public View f1163g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1164h;

    /* renamed from: i  reason: collision with root package name */
    public d f1165i;

    /* renamed from: j  reason: collision with root package name */
    public h.b.o.a f1166j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0035a f1167k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1168l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f1169m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f1170n;

    /* renamed from: o  reason: collision with root package name */
    public int f1171o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1172p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1173q;
    public boolean r;
    public boolean s;
    public boolean t = true;
    public g u;
    public boolean v;
    public boolean w;
    public final s x = new a();
    public final s y = new b();
    public final u z = new c();

    /* compiled from: WindowDecorActionBar */
    public class a extends t {
        public a() {
        }

        public void a(View view) {
            View view2;
            v vVar = v.this;
            if (vVar.f1172p && (view2 = vVar.f1163g) != null) {
                view2.setTranslationY(0.0f);
                v.this.d.setTranslationY(0.0f);
            }
            v.this.d.setVisibility(8);
            v.this.d.setTransitioning(false);
            v vVar2 = v.this;
            vVar2.u = null;
            a.C0035a aVar = vVar2.f1167k;
            if (aVar != null) {
                aVar.a(vVar2.f1166j);
                vVar2.f1166j = null;
                vVar2.f1167k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = v.this.c;
            if (actionBarOverlayLayout != null) {
                m.C(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class b extends t {
        public b() {
        }

        public void a(View view) {
            v vVar = v.this;
            vVar.u = null;
            vVar.d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class c implements u {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends h.b.o.a implements g.a {

        /* renamed from: g  reason: collision with root package name */
        public final Context f1174g;

        /* renamed from: h  reason: collision with root package name */
        public final h.b.o.i.g f1175h;

        /* renamed from: i  reason: collision with root package name */
        public a.C0035a f1176i;

        /* renamed from: j  reason: collision with root package name */
        public WeakReference<View> f1177j;

        public d(Context context, a.C0035a aVar) {
            this.f1174g = context;
            this.f1176i = aVar;
            h.b.o.i.g gVar = new h.b.o.i.g(context);
            gVar.f1295l = 1;
            this.f1175h = gVar;
            gVar.e = this;
        }

        public void a(boolean z) {
            this.f1208f = z;
            v.this.f1162f.setTitleOptional(z);
        }

        public void b(CharSequence charSequence) {
            v.this.f1162f.setTitle(charSequence);
        }

        public Menu c() {
            return this.f1175h;
        }

        public MenuInflater d() {
            return new f(this.f1174g);
        }

        public CharSequence e() {
            return v.this.f1162f.getSubtitle();
        }

        public CharSequence f() {
            return v.this.f1162f.getTitle();
        }

        public void g() {
            if (v.this.f1165i == this) {
                this.f1175h.j();
                try {
                    this.f1176i.a((h.b.o.a) this, (Menu) this.f1175h);
                } finally {
                    this.f1175h.i();
                }
            }
        }

        public boolean h() {
            return v.this.f1162f.v;
        }

        public void b(int i2) {
            v.this.f1162f.setTitle(v.this.a.getResources().getString(i2));
        }

        public void a() {
            v vVar = v.this;
            if (vVar.f1165i == this) {
                boolean z = vVar.f1173q;
                boolean z2 = vVar.r;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    v vVar2 = v.this;
                    vVar2.f1166j = this;
                    vVar2.f1167k = this.f1176i;
                } else {
                    this.f1176i.a(this);
                }
                this.f1176i = null;
                v.this.d(false);
                ActionBarContextView actionBarContextView = v.this.f1162f;
                if (actionBarContextView.f101o == null) {
                    actionBarContextView.b();
                }
                v.this.e.j().sendAccessibilityEvent(32);
                v vVar3 = v.this;
                vVar3.c.setHideOnContentScrollEnabled(vVar3.w);
                v.this.f1165i = null;
            }
        }

        public View b() {
            WeakReference<View> weakReference = this.f1177j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public void a(View view) {
            v.this.f1162f.setCustomView(view);
            this.f1177j = new WeakReference<>(view);
        }

        public void a(CharSequence charSequence) {
            v.this.f1162f.setSubtitle(charSequence);
        }

        public void a(int i2) {
            v.this.f1162f.setSubtitle(v.this.a.getResources().getString(i2));
        }

        public boolean a(h.b.o.i.g gVar, MenuItem menuItem) {
            a.C0035a aVar = this.f1176i;
            if (aVar != null) {
                return aVar.a((h.b.o.a) this, menuItem);
            }
            return false;
        }

        public void a(h.b.o.i.g gVar) {
            if (this.f1176i != null) {
                g();
                h.b.p.c cVar = v.this.f1162f.f1341h;
                if (cVar != null) {
                    cVar.f();
                }
            }
        }
    }

    public v(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.f1163g = decorView.findViewById(16908290);
        }
    }

    public final void a(View view) {
        d0 d0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(h.b.f.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(h.b.f.action_bar);
        if (findViewById instanceof d0) {
            d0Var = (d0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            d0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a2 = i.a.a.a.a.a("Can't make a decor toolbar out of ");
            a2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a2.toString());
        }
        this.e = d0Var;
        this.f1162f = (ActionBarContextView) view.findViewById(h.b.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(h.b.f.action_bar_container);
        this.d = actionBarContainer;
        d0 d0Var2 = this.e;
        if (d0Var2 == null || this.f1162f == null || actionBarContainer == null) {
            throw new IllegalStateException(v.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = d0Var2.c();
        boolean z2 = (this.e.i() & 4) != 0;
        if (z2) {
            this.f1164h = true;
        }
        Context context = this.a;
        this.e.a((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        e(context.getResources().getBoolean(h.b.b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet) null, j.ActionBar, h.b.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2.f110l) {
                this.w = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m.a((View) this.d, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public int b() {
        return this.e.i();
    }

    public void c(boolean z2) {
        h.b.o.g gVar;
        this.v = z2;
        if (!z2 && (gVar = this.u) != null) {
            gVar.a();
        }
    }

    public void d(boolean z2) {
        r rVar;
        r rVar2;
        if (z2) {
            if (!this.s) {
                this.s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (this.s) {
            this.s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        if (m.x(this.d)) {
            if (z2) {
                rVar = this.e.a(4, 100);
                rVar2 = this.f1162f.a(0, 200);
            } else {
                rVar2 = this.e.a(0, 200);
                rVar = this.f1162f.a(8, 100);
            }
            h.b.o.g gVar = new h.b.o.g();
            gVar.a.add(rVar);
            View view = (View) rVar.a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) rVar2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.a.add(rVar2);
            gVar.b();
        } else if (z2) {
            this.e.a(4);
            this.f1162f.setVisibility(0);
        } else {
            this.e.a(0);
            this.f1162f.setVisibility(8);
        }
    }

    public final void e(boolean z2) {
        this.f1170n = z2;
        if (!z2) {
            this.e.a((q0) null);
            this.d.setTabContainer((q0) null);
        } else {
            this.d.setTabContainer((q0) null);
            this.e.a((q0) null);
        }
        boolean z3 = true;
        boolean z4 = this.e.k() == 2;
        this.e.b(!this.f1170n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (this.f1170n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void f(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.s || !this.r) {
            if (!this.t) {
                this.t = true;
                h.b.o.g gVar = this.u;
                if (gVar != null) {
                    gVar.a();
                }
                this.d.setVisibility(0);
                if (this.f1171o != 0 || (!this.v && !z2)) {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.f1172p && (view2 = this.f1163g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.y.a((View) null);
                } else {
                    this.d.setTranslationY(0.0f);
                    float f2 = (float) (-this.d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.d.setTranslationY(f2);
                    h.b.o.g gVar2 = new h.b.o.g();
                    r a2 = m.a(this.d);
                    a2.b(0.0f);
                    a2.a(this.z);
                    if (!gVar2.e) {
                        gVar2.a.add(a2);
                    }
                    if (this.f1172p && (view3 = this.f1163g) != null) {
                        view3.setTranslationY(f2);
                        r a3 = m.a(this.f1163g);
                        a3.b(0.0f);
                        if (!gVar2.e) {
                            gVar2.a.add(a3);
                        }
                    }
                    Interpolator interpolator = B;
                    if (!gVar2.e) {
                        gVar2.c = interpolator;
                    }
                    if (!gVar2.e) {
                        gVar2.f1234b = 250;
                    }
                    s sVar = this.y;
                    if (!gVar2.e) {
                        gVar2.d = sVar;
                    }
                    this.u = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    m.C(actionBarOverlayLayout);
                }
            }
        } else if (this.t) {
            this.t = false;
            h.b.o.g gVar3 = this.u;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.f1171o != 0 || (!this.v && !z2)) {
                this.x.a((View) null);
                return;
            }
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            h.b.o.g gVar4 = new h.b.o.g();
            float f3 = (float) (-this.d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            r a4 = m.a(this.d);
            a4.b(f3);
            a4.a(this.z);
            if (!gVar4.e) {
                gVar4.a.add(a4);
            }
            if (this.f1172p && (view = this.f1163g) != null) {
                r a5 = m.a(view);
                a5.b(f3);
                if (!gVar4.e) {
                    gVar4.a.add(a5);
                }
            }
            Interpolator interpolator2 = A;
            if (!gVar4.e) {
                gVar4.c = interpolator2;
            }
            if (!gVar4.e) {
                gVar4.f1234b = 250;
            }
            s sVar2 = this.x;
            if (!gVar4.e) {
                gVar4.d = sVar2;
            }
            this.u = gVar4;
            gVar4.b();
        }
    }

    public void b(boolean z2) {
        if (!this.f1164h) {
            int i2 = z2 ? 4 : 0;
            int i3 = this.e.i();
            this.f1164h = true;
            this.e.c((i2 & 4) | (i3 & -5));
        }
    }

    public Context c() {
        if (this.f1161b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(h.b.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1161b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.f1161b = this.a;
            }
        }
        return this.f1161b;
    }

    public v(Dialog dialog) {
        new ArrayList();
        a(dialog.getWindow().getDecorView());
    }

    public void a(Configuration configuration) {
        e(this.a.getResources().getBoolean(h.b.b.abc_action_bar_embed_tabs));
    }

    public void a(boolean z2) {
        if (z2 != this.f1168l) {
            this.f1168l = z2;
            int size = this.f1169m.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1169m.get(i2).a(z2);
            }
        }
    }

    public void a(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    public h.b.o.a a(a.C0035a aVar) {
        d dVar = this.f1165i;
        if (dVar != null) {
            dVar.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f1162f.b();
        d dVar2 = new d(this.f1162f.getContext(), aVar);
        dVar2.f1175h.j();
        try {
            if (!dVar2.f1176i.b(dVar2, dVar2.f1175h)) {
                return null;
            }
            this.f1165i = dVar2;
            dVar2.g();
            this.f1162f.a(dVar2);
            d(true);
            this.f1162f.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.f1175h.i();
        }
    }

    public boolean a() {
        d0 d0Var = this.e;
        if (d0Var == null || !d0Var.m()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        h.b.o.i.g gVar;
        d dVar = this.f1165i;
        if (dVar == null || (gVar = dVar.f1175h) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        gVar.setQwertyMode(z2);
        return gVar.performShortcut(i2, keyEvent, 0);
    }
}
