package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import h.b.f;
import h.b.j;
import h.b.p.b;
import h.b.p.q0;
import h.h.m.m;

public class ActionBarContainer extends FrameLayout {
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public View f90f;

    /* renamed from: g  reason: collision with root package name */
    public View f91g;

    /* renamed from: h  reason: collision with root package name */
    public View f92h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f93i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f94j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f95k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f96l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f97m;

    /* renamed from: n  reason: collision with root package name */
    public int f98n;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f93i;
        if (drawable != null && drawable.isStateful()) {
            this.f93i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f94j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f94j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f95k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f95k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f90f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f93i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f94j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f95k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f91g = findViewById(f.action_bar);
        this.f92h = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.e || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f90f;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f96l) {
            Drawable drawable2 = this.f95k;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f93i != null) {
                if (this.f91g.getVisibility() == 0) {
                    this.f93i.setBounds(this.f91g.getLeft(), this.f91g.getTop(), this.f91g.getRight(), this.f91g.getBottom());
                } else {
                    View view2 = this.f92h;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f93i.setBounds(0, 0, 0, 0);
                    } else {
                        this.f93i.setBounds(this.f92h.getLeft(), this.f92h.getTop(), this.f92h.getRight(), this.f92h.getBottom());
                    }
                }
                z3 = true;
            }
            this.f97m = z4;
            if (!z4 || (drawable = this.f94j) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.f91g == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i5 = this.f98n) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i3)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i2, i3);
        if (this.f91g != null) {
            int mode = View.MeasureSpec.getMode(i3);
            View view = this.f90f;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f91g)) {
                    i4 = a(this.f91g);
                } else {
                    i4 = !b(this.f92h) ? a(this.f92h) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f90f) + i4, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f93i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f93i);
        }
        this.f93i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f91g;
            if (view != null) {
                this.f93i.setBounds(view.getLeft(), this.f91g.getTop(), this.f91g.getRight(), this.f91g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f96l ? !(this.f93i == null && this.f94j == null) : this.f95k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f95k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f95k);
        }
        this.f95k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f96l && (drawable2 = this.f95k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f96l ? this.f93i == null && this.f94j == null : this.f95k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f94j;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f94j);
        }
        this.f94j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f97m && (drawable2 = this.f94j) != null) {
                drawable2.setBounds(this.f90f.getLeft(), this.f90f.getTop(), this.f90f.getRight(), this.f90f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f96l ? !(this.f93i == null && this.f94j == null) : this.f95k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(q0 q0Var) {
        View view = this.f90f;
        if (view != null) {
            removeView(view);
        }
        this.f90f = q0Var;
        if (q0Var != null) {
            addView(q0Var);
            ViewGroup.LayoutParams layoutParams = q0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            q0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f93i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f94j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f95k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f93i && !this.f96l) || (drawable == this.f94j && this.f97m) || ((drawable == this.f95k && this.f96l) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.a((View) this, (Drawable) new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBar);
        this.f93i = obtainStyledAttributes.getDrawable(j.ActionBar_background);
        this.f94j = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundStacked);
        this.f98n = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == f.split_action_bar) {
            this.f96l = true;
            this.f95k = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f96l ? !(this.f93i == null && this.f94j == null) : this.f95k != null) {
            z = false;
        }
        setWillNotDraw(z);
    }
}
