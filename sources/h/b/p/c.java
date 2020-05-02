package h.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import h.b.o.i.g;
import h.b.o.i.i;
import h.b.o.i.k;
import h.b.o.i.l;
import h.b.o.i.m;
import h.b.o.i.n;
import h.b.o.i.p;
import h.b.o.i.r;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter */
public class c extends h.b.o.i.b {
    public b A;
    public final f B = new f();
    public int C;

    /* renamed from: m  reason: collision with root package name */
    public d f1369m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f1370n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1371o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1372p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1373q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public e x;
    public a y;
    public C0038c z;

    /* compiled from: ActionMenuPresenter */
    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, h.b.a.actionOverflowMenuStyle, 0);
            if (!rVar.B.d()) {
                View view2 = c.this.f1369m;
                this.f1320f = view2 == null ? (View) c.this.f1256l : view2;
            }
            a(c.this.B);
        }

        public void c() {
            c cVar = c.this;
            cVar.y = null;
            cVar.C = 0;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: h.b.p.c$c  reason: collision with other inner class name */
    /* compiled from: ActionMenuPresenter */
    public class C0038c implements Runnable {
        public e e;

        public C0038c(e eVar) {
            this.e = eVar;
        }

        public void run() {
            g.a aVar;
            g gVar = c.this.f1251g;
            if (!(gVar == null || (aVar = gVar.e) == null)) {
                aVar.a(gVar);
            }
            View view = (View) c.this.f1256l;
            if (!(view == null || view.getWindowToken() == null || !this.e.d())) {
                c.this.x = this.e;
            }
            c.this.z = null;
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class d extends n implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter */
        public class a extends h0 {
            public a(View view, c cVar) {
                super(view);
            }

            public p b() {
                e eVar = c.this.x;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public boolean c() {
                c.this.f();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.z != null) {
                    return false;
                }
                cVar.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, h.b.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g.a.a.b.a.a((View) this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.f();
            return true;
        }

        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, h.b.a.actionOverflowMenuStyle, 0);
            this.f1321g = 8388613;
            a(c.this.B);
        }

        public void c() {
            g gVar = c.this.f1251g;
            if (gVar != null) {
                gVar.a(true);
            }
            c.this.x = null;
            super.c();
        }
    }

    public c(Context context) {
        super(context, h.b.g.abc_action_menu_layout, h.b.g.abc_action_menu_item_layout);
    }

    public void a(Context context, g gVar) {
        this.f1250f = context;
        LayoutInflater.from(context);
        this.f1251g = gVar;
        Resources resources = context.getResources();
        if (!this.f1373q) {
            this.f1372p = true;
        }
        int i2 = 2;
        this.r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.t = i2;
        int i5 = this.r;
        if (this.f1372p) {
            if (this.f1369m == null) {
                d dVar = new d(this.e);
                this.f1369m = dVar;
                if (this.f1371o) {
                    dVar.setImageDrawable(this.f1370n);
                    this.f1370n = null;
                    this.f1371o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1369m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f1369m.getMeasuredWidth();
        } else {
            this.f1369m = null;
        }
        this.s = i5;
        this.v = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean b() {
        n nVar;
        C0038c cVar = this.z;
        if (cVar == null || (nVar = this.f1256l) == null) {
            e eVar = this.x;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f1324j.dismiss();
            }
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.z = null;
        return true;
    }

    public boolean c() {
        int i2;
        ArrayList<i> arrayList;
        int i3;
        boolean z2;
        g gVar = this.f1251g;
        View view = null;
        if (gVar != null) {
            arrayList = gVar.d();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.t;
        int i5 = this.s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1256l;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            i iVar = arrayList.get(i6);
            if ((iVar.y & 2) == 2) {
                i8++;
            } else {
                if ((iVar.y & 1) == 1) {
                    i7++;
                } else {
                    z3 = true;
                }
            }
            if (this.u && iVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f1372p && (z3 || i7 + i8 > i4)) {
            i4--;
        }
        int i9 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.w;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i2) {
            i iVar2 = arrayList.get(i10);
            if ((iVar2.y & i3) == i3) {
                View a2 = a(iVar2, view, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i12 = iVar2.f1303b;
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z2);
                }
                iVar2.b(z2);
            } else {
                if ((iVar2.y & z2) == z2) {
                    int i13 = iVar2.f1303b;
                    boolean z4 = sparseBooleanArray.get(i13);
                    boolean z5 = (i9 > 0 || z4) && i5 > 0;
                    if (z5) {
                        View a3 = a(iVar2, view, viewGroup);
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a3.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        z5 &= i5 + i11 > 0;
                    }
                    boolean z6 = z5;
                    if (z6 && i13 != 0) {
                        sparseBooleanArray.put(i13, z2);
                    } else if (z4) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            i iVar3 = arrayList.get(i14);
                            if (iVar3.f1303b == i13) {
                                if (iVar3.d()) {
                                    i9++;
                                }
                                iVar3.b(false);
                            }
                        }
                    }
                    if (z6) {
                        i9--;
                    }
                    iVar2.b(z6);
                } else {
                    iVar2.b(false);
                    i10++;
                    view = null;
                    i3 = 2;
                    z2 = true;
                }
            }
            i10++;
            view = null;
            i3 = 2;
            z2 = true;
        }
        return true;
    }

    public boolean d() {
        a aVar = this.y;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.f1324j.dismiss();
        return true;
    }

    public boolean e() {
        e eVar = this.x;
        return eVar != null && eVar.b();
    }

    public boolean f() {
        g gVar;
        if (!this.f1372p || e() || (gVar = this.f1251g) == null || this.f1256l == null || this.z != null) {
            return false;
        }
        gVar.a();
        if (gVar.f1293j.isEmpty()) {
            return false;
        }
        C0038c cVar = new C0038c(new e(this.f1250f, this.f1251g, this.f1369m, true));
        this.z = cVar;
        ((View) this.f1256l).post(cVar);
        super.a((r) null);
        return true;
    }

    /* compiled from: ActionMenuPresenter */
    public class f implements m.a {
        public f() {
        }

        public boolean a(g gVar) {
            if (gVar == null) {
                return false;
            }
            c.this.C = ((r) gVar).B.getItemId();
            m.a aVar = c.this.f1253i;
            if (aVar != null) {
                return aVar.a(gVar);
            }
            return false;
        }

        public void a(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.c().a(false);
            }
            m.a aVar = c.this.f1253i;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }
    }

    public View a(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.c()) {
            actionView = super.a(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (actionMenuView != null) {
            if (!(layoutParams instanceof ActionMenuView.c)) {
                actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
            }
            return actionView;
        }
        throw null;
    }

    public void a(boolean z2) {
        ArrayList<i> arrayList;
        n nVar;
        super.a(z2);
        ((View) this.f1256l).requestLayout();
        g gVar = this.f1251g;
        boolean z3 = false;
        if (gVar != null) {
            gVar.a();
            ArrayList<i> arrayList2 = gVar.f1292i;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                h.h.m.b bVar = arrayList2.get(i2).A;
            }
        }
        g gVar2 = this.f1251g;
        if (gVar2 != null) {
            gVar2.a();
            arrayList = gVar2.f1293j;
        } else {
            arrayList = null;
        }
        if (this.f1372p && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f1369m == null) {
                this.f1369m = new d(this.e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1369m.getParent();
            if (viewGroup != this.f1256l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1369m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1256l;
                d dVar = this.f1369m;
                ActionMenuView.c generateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.c = true;
                actionMenuView.addView(dVar, generateDefaultLayoutParams);
            }
        } else {
            d dVar2 = this.f1369m;
            if (dVar2 != null && dVar2.getParent() == (nVar = this.f1256l)) {
                ((ViewGroup) nVar).removeView(this.f1369m);
            }
        }
        ((ActionMenuView) this.f1256l).setOverflowReserved(this.f1372p);
    }

    public boolean a(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (true) {
            g gVar = rVar2.A;
            if (gVar == this.f1251g) {
                break;
            }
            rVar2 = gVar;
        }
        i iVar = rVar2.B;
        ViewGroup viewGroup = (ViewGroup) this.f1256l;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        rVar.B.getItemId();
        int size = rVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        a aVar = new a(this.f1250f, rVar, view);
        this.y = aVar;
        aVar.f1322h = z2;
        k kVar = aVar.f1324j;
        if (kVar != null) {
            kVar.b(z2);
        }
        if (this.y.d()) {
            m.a aVar2 = this.f1253i;
            if (aVar2 != null) {
                aVar2.a(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean a() {
        return b() | d();
    }

    public void a(g gVar, boolean z2) {
        a();
        m.a aVar = this.f1253i;
        if (aVar != null) {
            aVar.a(gVar, z2);
        }
    }
}
