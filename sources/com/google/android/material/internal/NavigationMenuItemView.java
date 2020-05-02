package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import h.b.o.i.i;
import h.b.o.i.n;
import h.b.p.i0;
import h.h.m.m;
import h.h.m.w.b;
import i.c.a.c.d;
import i.c.a.c.f;
import i.c.a.c.h;
import i.c.a.c.z.e;

public class NavigationMenuItemView extends e implements n.a {
    public static final int[] J = {16842912};
    public boolean A;
    public boolean B;
    public final CheckedTextView C;
    public FrameLayout D;
    public i E;
    public ColorStateList F;
    public boolean G;
    public Drawable H;
    public final h.h.m.a I;
    public int z;

    public class a extends h.h.m.a {
        public a() {
        }

        public void a(View view, b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            bVar.a.setCheckable(NavigationMenuItemView.this.B);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    public void a(i iVar, int i2) {
        StateListDrawable stateListDrawable;
        this.E = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z2 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(h.b.a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            m.a((View) this, (Drawable) stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.e);
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.f1315q);
        g.a.a.b.a.a((View) this, iVar.r);
        i iVar2 = this.E;
        if (!(iVar2.e == null && iVar2.getIcon() == null && this.E.getActionView() != null)) {
            z2 = false;
        }
        if (z2) {
            this.C.setVisibility(8);
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                i0.a aVar = (i0.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.D.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.C.setVisibility(0);
        FrameLayout frameLayout2 = this.D;
        if (frameLayout2 != null) {
            i0.a aVar2 = (i0.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.D.setLayoutParams(aVar2);
        }
    }

    public boolean c() {
        return false;
    }

    public i getItemData() {
        return this.E;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.E;
        if (iVar != null && iVar.isCheckable() && this.E.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.B != z2) {
            this.B = z2;
            this.I.a((View) this.C, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.C.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = g.a.a.b.a.c(drawable).mutate();
                drawable.setTintList(this.F);
            }
            int i2 = this.z;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.A) {
            if (this.H == null) {
                Drawable drawable2 = getResources().getDrawable(i.c.a.c.e.navigation_empty_icon, getContext().getTheme());
                this.H = drawable2;
                if (drawable2 != null) {
                    int i3 = this.z;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.H;
        }
        this.C.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i2) {
        this.C.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.z = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.G = colorStateList != null;
        i iVar = this.E;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.C.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.A = z2;
    }

    public void setTextAppearance(int i2) {
        g.a.a.b.a.d(this.C, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.I = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        m.a((View) this.C, this.I);
    }
}
