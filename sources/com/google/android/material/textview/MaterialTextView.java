package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import h.b.p.z;
import i.c.a.b.d.l.q;
import i.c.a.c.b;
import i.c.a.c.j0.a.a;
import i.c.a.c.k;

public class MaterialTextView extends z {
    public MaterialTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(Resources.Theme theme, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i2, k.MaterialTextAppearance);
        int a = a(getContext(), obtainStyledAttributes, k.MaterialTextAppearance_android_lineHeight, k.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (q.a(context, b.textAppearanceLineHeightEnabled, true)) {
            a(context.getTheme(), i2);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(a.a(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        boolean z = true;
        if (q.a(context2, b.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.MaterialTextView, i2, i3);
            int a = a(context2, obtainStyledAttributes, k.MaterialTextView_android_lineHeight, k.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (!(a == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, k.MaterialTextView, i2, i3);
                int resourceId = obtainStyledAttributes2.getResourceId(k.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    a(theme, resourceId);
                }
            }
        }
    }

    public static int a(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            int i4 = iArr[i3];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
                i2 = typedArray.getDimensionPixelSize(i4, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize;
            }
        }
        return i2;
    }
}
