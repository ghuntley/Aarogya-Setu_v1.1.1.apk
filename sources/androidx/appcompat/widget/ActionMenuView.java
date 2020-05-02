package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import h.b.o.i.g;
import h.b.o.i.i;
import h.b.o.i.m;
import h.b.o.i.n;
import h.b.p.c;
import h.b.p.d1;
import h.b.p.i0;

public class ActionMenuView extends i0 implements g.b, n {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public e E;
    public g t;
    public Context u;
    public int v;
    public boolean w;
    public h.b.p.c x;
    public m.a y;
    public g.a z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements m.a {
        public void a(g gVar, boolean z) {
        }

        public boolean a(g gVar) {
            return false;
        }
    }

    public static class c extends i0.a {
        @ViewDebug.ExportedProperty
        public boolean c;
        @ViewDebug.ExportedProperty
        public int d;
        @ViewDebug.ExportedProperty
        public int e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f116f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f117g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f118h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.c = cVar.c;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.c = false;
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static int b(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.d();
        int i6 = 2;
        if (i3 <= 0 || (z3 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z3 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (cVar.c || !z3) {
            z2 = false;
        }
        cVar.f116f = z2;
        cVar.d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    public boolean a(i iVar) {
        return this.t.a((MenuItem) iVar, (m) null, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.t == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.t = gVar;
            gVar.e = new d();
            h.b.p.c cVar = new h.b.p.c(context);
            this.x = cVar;
            cVar.f1372p = true;
            cVar.f1373q = true;
            m.a aVar = this.y;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f1253i = aVar;
            this.t.a((m) this.x, this.u);
            h.b.p.c cVar2 = this.x;
            cVar2.f1256l = this;
            this.t = cVar2.f1251g;
        }
        return this.t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        h.b.p.c cVar = this.x;
        c.d dVar = cVar.f1369m;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f1371o) {
            return cVar.f1370n;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h.b.p.c cVar = this.x;
        if (cVar != null) {
            cVar.a(false);
            if (this.x.e()) {
                this.x.b();
                this.x.f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h.b.p.c cVar = this.x;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (!this.A) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = d1.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (b(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    b(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.c) {
                    int i18 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.c) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i21;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        g gVar;
        boolean z5 = this.A;
        boolean z6 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.A = z6;
        if (z5 != z6) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.A || (gVar = this.t) == null || size == this.B)) {
            this.B = size;
            gVar.b(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            int i8 = i3;
            for (int i9 = 0; i9 < childCount; i9++) {
                c cVar = (c) getChildAt(i9).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.C;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z7 = false;
        long j2 = 0;
        while (i19 < childCount2) {
            View childAt = getChildAt(i19);
            int i20 = size3;
            int i21 = i10;
            if (childAt.getVisibility() != 8) {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i22 = i15 + 1;
                if (z8) {
                    int i23 = this.D;
                    i7 = i22;
                    z4 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i7 = i22;
                    z4 = false;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f118h = z4;
                cVar2.e = z4 ? 1 : 0;
                cVar2.d = z4;
                cVar2.f116f = z4;
                cVar2.leftMargin = z4;
                cVar2.rightMargin = z4;
                cVar2.f117g = z8 && ((ActionMenuItemView) childAt).d();
                int b2 = b(childAt, i14, cVar2.c ? 1 : i12, childMeasureSpec, paddingBottom);
                i17 = Math.max(i17, b2);
                if (cVar2.f116f) {
                    i18++;
                }
                if (cVar2.c) {
                    z7 = true;
                }
                i12 -= b2;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (b2 == 1) {
                    j2 |= (long) (1 << i19);
                }
                i15 = i7;
            }
            i19++;
            size3 = i20;
            i10 = i21;
        }
        int i24 = i10;
        int i25 = size3;
        boolean z9 = z7 && i15 == 2;
        boolean z10 = false;
        while (true) {
            if (i18 <= 0 || i12 <= 0) {
                i4 = i16;
                z2 = z10;
            } else {
                int i26 = Integer.MAX_VALUE;
                int i27 = 0;
                int i28 = 0;
                long j3 = 0;
                while (i27 < childCount2) {
                    int i29 = i16;
                    c cVar3 = (c) getChildAt(i27).getLayoutParams();
                    boolean z11 = z10;
                    if (cVar3.f116f) {
                        int i30 = cVar3.d;
                        if (i30 < i26) {
                            j3 = 1 << i27;
                            i26 = i30;
                            i28 = 1;
                        } else if (i30 == i26) {
                            i28++;
                            j3 |= 1 << i27;
                        }
                    }
                    i27++;
                    z10 = z11;
                    i16 = i29;
                }
                i4 = i16;
                z2 = z10;
                j2 |= j3;
                if (i28 > i12) {
                    break;
                }
                int i31 = i26 + 1;
                int i32 = 0;
                while (i32 < childCount2) {
                    View childAt2 = getChildAt(i32);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i33 = i18;
                    long j4 = (long) (1 << i32);
                    if ((j3 & j4) == 0) {
                        if (cVar4.d == i31) {
                            j2 |= j4;
                        }
                        z3 = z9;
                    } else {
                        if (!z9 || !cVar4.f117g || i12 != 1) {
                            z3 = z9;
                        } else {
                            int i34 = this.D;
                            z3 = z9;
                            childAt2.setPadding(i34 + i14, 0, i34, 0);
                        }
                        cVar4.d++;
                        cVar4.f118h = true;
                        i12--;
                    }
                    i32++;
                    i18 = i33;
                    z9 = z3;
                }
                i16 = i4;
                z10 = true;
            }
        }
        i4 = i16;
        z2 = z10;
        boolean z12 = !z7 && i15 == 1;
        if (i12 > 0 && j2 != 0 && (i12 < i15 - 1 || z12 || i17 > 1)) {
            float bitCount = (float) Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f117g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j2 & ((long) (1 << i35))) != 0 && !((c) getChildAt(i35).getLayoutParams()).f117g) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) (((float) (i12 * i14)) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j2 & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.e = i36;
                        cVar5.f118h = true;
                        if (i37 == 0 && !cVar5.f117g) {
                            cVar5.leftMargin = (-i36) / 2;
                        }
                    } else if (cVar5.c) {
                        cVar5.e = i36;
                        cVar5.f118h = true;
                        cVar5.rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            cVar5.leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            cVar5.rightMargin = i36 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f118h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.d * i14) + cVar6.e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i6 = i24;
            i5 = i4;
        } else {
            i5 = i25;
            i6 = i24;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.x.u = z2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.E = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        h.b.p.c cVar = this.x;
        c.d dVar = cVar.f1369m;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f1371o = true;
        cVar.f1370n = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.w = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.v != i2) {
            this.v = i2;
            if (i2 == 0) {
                this.u = getContext();
            } else {
                this.u = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(h.b.p.c cVar) {
        this.x = cVar;
        cVar.f1256l = this;
        this.t = cVar.f1251g;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f2);
        this.D = (int) (f2 * 4.0f);
        this.u = context;
        this.v = 0;
    }

    public void a(g gVar) {
        this.t = gVar;
    }

    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f1423b = 16;
        return cVar;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public class d implements g.a {
        public d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.E;
            if (eVar == null) {
                return false;
            }
            Toolbar.f fVar = Toolbar.this.K;
            if (fVar != null ? fVar.onMenuItemClick(menuItem) : false) {
                return true;
            }
            return false;
        }

        public void a(g gVar) {
            g.a aVar = ActionMenuView.this.z;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public i0.a m0generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f1423b <= 0) {
            cVar.f1423b = 16;
        }
        return cVar;
    }

    public boolean b(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).b();
    }
}
