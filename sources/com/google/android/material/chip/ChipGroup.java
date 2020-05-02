package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import h.h.m.m;
import h.h.m.w.b;
import i.c.a.c.j;
import i.c.a.c.k;
import i.c.a.c.z.i;
import java.util.ArrayList;
import java.util.List;

public class ChipGroup extends i.c.a.c.z.d {
    public static final int r = j.Widget_MaterialComponents_ChipGroup;

    /* renamed from: i  reason: collision with root package name */
    public int f608i;

    /* renamed from: j  reason: collision with root package name */
    public int f609j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f610k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f611l;

    /* renamed from: m  reason: collision with root package name */
    public d f612m;

    /* renamed from: n  reason: collision with root package name */
    public final b f613n;

    /* renamed from: o  reason: collision with root package name */
    public e f614o;

    /* renamed from: p  reason: collision with root package name */
    public int f615p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f616q;

    public class b implements CompoundButton.OnCheckedChangeListener {
        public /* synthetic */ b(a aVar) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (!chipGroup.f616q) {
                if (chipGroup.getCheckedChipIds().isEmpty()) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.f611l) {
                        chipGroup2.a(compoundButton.getId(), true);
                        ChipGroup chipGroup3 = ChipGroup.this;
                        chipGroup3.f615p = compoundButton.getId();
                        d dVar = chipGroup3.f612m;
                        return;
                    }
                }
                int id = compoundButton.getId();
                if (z) {
                    ChipGroup chipGroup4 = ChipGroup.this;
                    int i2 = chipGroup4.f615p;
                    if (!(i2 == -1 || i2 == id || !chipGroup4.f610k)) {
                        chipGroup4.a(i2, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                    return;
                }
                ChipGroup chipGroup5 = ChipGroup.this;
                if (chipGroup5.f615p == id) {
                    chipGroup5.setCheckedId(-1);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i2);
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener e;

        public /* synthetic */ e(a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f613n);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.e;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.e;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i2) {
        this.f615p = i2;
        d dVar = this.f612m;
        if (dVar != null && this.f610k) {
            dVar.a(this, i2);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.f615p;
                if (i3 != -1 && this.f610k) {
                    a(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f610k) {
            return this.f615p;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f610k) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f608i;
    }

    public int getChipSpacingVertical() {
        return this.f609j;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f615p;
        if (i2 != -1) {
            a(i2, true);
            setCheckedId(this.f615p);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new h.h.m.w.b(accessibilityNodeInfo).a((Object) new b.C0051b(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.f4273g ? getChipCount() : -1, false, this.f610k ? 1 : 2)));
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f608i != i2) {
            this.f608i = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f609j != i2) {
            this.f609j = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f612m = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f614o.e = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f611l = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f610k != z) {
            this.f610k = z;
            this.f616q = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f616q = false;
            setCheckedId(-1);
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.c.a.c.b.chipGroupStyle);
    }

    public boolean a() {
        return this.f4273g;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(i.c.a.c.j0.a.a.a(context, attributeSet, i2, r), attributeSet, i2);
        this.f613n = new b((a) null);
        this.f614o = new e((a) null);
        this.f615p = -1;
        this.f616q = false;
        TypedArray b2 = i.b(getContext(), attributeSet, k.ChipGroup, i2, r, new int[0]);
        int dimensionPixelOffset = b2.getDimensionPixelOffset(k.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(b2.getDimensionPixelOffset(k.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(b2.getDimensionPixelOffset(k.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(b2.getBoolean(k.ChipGroup_singleLine, false));
        setSingleSelection(b2.getBoolean(k.ChipGroup_singleSelection, false));
        setSelectionRequired(b2.getBoolean(k.ChipGroup_selectionRequired, false));
        int resourceId = b2.getResourceId(k.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f615p = resourceId;
        }
        b2.recycle();
        super.setOnHierarchyChangeListener(this.f614o);
        m.h(this, 1);
    }

    public final void a(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.f616q = true;
            ((Chip) findViewById).setChecked(z);
            this.f616q = false;
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
