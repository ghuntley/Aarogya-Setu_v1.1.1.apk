package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import i.c.a.c.b;
import i.c.a.c.f0.n;
import i.c.a.c.f0.o;
import i.c.a.c.f0.p;
import i.c.a.c.h;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] s = {b.snackbarButtonStyle, b.snackbarTextViewStyle};

    /* renamed from: q  reason: collision with root package name */
    public final AccessibilityManager f657q;
    public boolean r;

    public static final class SnackbarLayout extends BaseTransientBottomBar.i {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public Snackbar(ViewGroup viewGroup, View view, n nVar) {
        super(viewGroup, view, nVar);
        this.f657q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar a(View view, CharSequence charSequence, int i2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(s);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            boolean z = true;
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || resourceId2 == -1) {
                z = false;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(z ? h.mtrl_layout_snackbar_include : h.design_layout_snackbar_include, viewGroup, false);
            Snackbar snackbar = new Snackbar(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.c.getChildAt(0)).getMessageView().setText(charSequence);
            snackbar.e = i2;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public void f() {
        p b2 = p.b();
        int i2 = this.e;
        int i3 = -2;
        if (i2 != -2) {
            if (Build.VERSION.SDK_INT >= 29) {
                i3 = this.f657q.getRecommendedTimeoutMillis(i2, (this.r ? 4 : 0) | 1 | 2);
            } else {
                if (this.r && this.f657q.isTouchExplorationEnabled()) {
                    i2 = -2;
                }
                i3 = i2;
            }
        }
        b2.a(i3, this.f648n);
    }

    public Snackbar a(int i2, View.OnClickListener onClickListener) {
        CharSequence text = this.f639b.getText(i2);
        Button actionView = ((SnackbarContentLayout) this.c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.r = false;
        } else {
            this.r = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new o(this, onClickListener));
        }
        return this;
    }
}
