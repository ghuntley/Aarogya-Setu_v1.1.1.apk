package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h.b.f;
import h.b.g;
import h.b.j;
import h.b.o.i.n;
import h.b.p.c;
import h.b.p.d1;
import h.h.m.m;

public class ActionBarContextView extends h.b.p.a {

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f99m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f100n;

    /* renamed from: o  reason: collision with root package name */
    public View f101o;

    /* renamed from: p  reason: collision with root package name */
    public View f102p;

    /* renamed from: q  reason: collision with root package name */
    public LinearLayout f103q;
    public TextView r;
    public TextView s;
    public int t;
    public int u;
    public boolean v;
    public int w;

    public class a implements View.OnClickListener {
        public final /* synthetic */ h.b.o.a e;

        public a(ActionBarContextView actionBarContextView, h.b.o.a aVar) {
            this.e = aVar;
        }

        public void onClick(View view) {
            this.e.a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        if (this.f103q == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f103q = linearLayout;
            this.r = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.s = (TextView) this.f103q.findViewById(f.action_bar_subtitle);
            if (this.t != 0) {
                this.r.setTextAppearance(getContext(), this.t);
            }
            if (this.u != 0) {
                this.s.setTextAppearance(getContext(), this.u);
            }
        }
        this.r.setText(this.f99m);
        this.s.setText(this.f100n);
        boolean z = !TextUtils.isEmpty(this.f99m);
        boolean z2 = !TextUtils.isEmpty(this.f100n);
        int i2 = 0;
        this.s.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f103q;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f103q.getParent() == null) {
            addView(this.f103q);
        }
    }

    public void b() {
        removeAllViews();
        this.f102p = null;
        this.f1340g = null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f100n;
    }

    public CharSequence getTitle() {
        return this.f99m;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1341h;
        if (cVar != null) {
            cVar.b();
            this.f1341h.d();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f99m);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean a2 = d1.a(this);
        int paddingRight = a2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f101o;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f101o.getLayoutParams();
            int i6 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = a2 ? paddingRight - i6 : paddingRight + i6;
            int a3 = i8 + a(this.f101o, i8, paddingTop, paddingTop2, a2);
            paddingRight = a2 ? a3 - i7 : a3 + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.f103q;
        if (!(linearLayout == null || this.f102p != null || linearLayout.getVisibility() == 8)) {
            i9 += a(this.f103q, i9, paddingTop, paddingTop2, a2);
        }
        int i10 = i9;
        View view2 = this.f102p;
        if (view2 != null) {
            a(view2, i10, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1340g;
        if (actionMenuView != null) {
            a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.f1342i;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, RecyclerView.UNDEFINED_DURATION);
            View view = this.f101o;
            if (view != null) {
                int a2 = a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f101o.getLayoutParams();
                paddingLeft = a2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1340g;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a(this.f1340g, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f103q;
            if (linearLayout != null && this.f102p == null) {
                if (this.v) {
                    this.f103q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f103q.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f103q.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f102p;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                int i8 = layoutParams.width;
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = RecyclerView.UNDEFINED_DURATION;
                }
                int i9 = layoutParams.height;
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.f102p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.f1342i <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i2) {
        this.f1342i = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f102p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f102p = view;
        if (!(view == null || (linearLayout = this.f103q) == null)) {
            removeView(linearLayout);
            this.f103q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f100n = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f99m = charSequence;
        a();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.v) {
            requestLayout();
        }
        this.v = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMode, i2, 0);
        int i3 = j.ActionMode_background;
        if (!obtainStyledAttributes.hasValue(i3) || (resourceId = obtainStyledAttributes.getResourceId(i3, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i3);
        } else {
            drawable = h.b.l.a.a.c(context, resourceId);
        }
        m.a((View) this, drawable);
        this.t = obtainStyledAttributes.getResourceId(j.ActionMode_titleTextStyle, 0);
        this.u = obtainStyledAttributes.getResourceId(j.ActionMode_subtitleTextStyle, 0);
        this.f1342i = obtainStyledAttributes.getLayoutDimension(j.ActionMode_height, 0);
        this.w = obtainStyledAttributes.getResourceId(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public void a(h.b.o.a aVar) {
        View view = this.f101o;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.w, this, false);
            this.f101o = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f101o);
        }
        this.f101o.findViewById(f.action_mode_close_button).setOnClickListener(new a(this, aVar));
        h.b.o.i.g gVar = (h.b.o.i.g) aVar.c();
        c cVar = this.f1341h;
        if (cVar != null) {
            cVar.a();
        }
        c cVar2 = new c(getContext());
        this.f1341h = cVar2;
        cVar2.f1372p = true;
        cVar2.f1373q = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.a((h.b.o.i.m) this.f1341h, this.f1339f);
        c cVar3 = this.f1341h;
        n nVar = cVar3.f1256l;
        if (nVar == null) {
            n nVar2 = (n) cVar3.f1252h.inflate(cVar3.f1254j, this, false);
            cVar3.f1256l = nVar2;
            nVar2.a(cVar3.f1251g);
            cVar3.a(true);
        }
        n nVar3 = cVar3.f1256l;
        if (nVar != nVar3) {
            ((ActionMenuView) nVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) nVar3;
        this.f1340g = actionMenuView;
        m.a((View) actionMenuView, (Drawable) null);
        addView(this.f1340g, layoutParams);
    }
}
