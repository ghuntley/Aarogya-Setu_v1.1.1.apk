package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h.h.m.m;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public Map<View, Integer> f688i;

    public FabTransformationSheetBehavior() {
    }

    public boolean a(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f688i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f688i;
                        if (map != null && map.containsKey(childAt)) {
                            m.h(childAt, this.f688i.get(childAt).intValue());
                        }
                    } else {
                        this.f688i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        m.h(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f688i = null;
            }
        }
        super.a(view, view2, z, z2);
        return true;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
