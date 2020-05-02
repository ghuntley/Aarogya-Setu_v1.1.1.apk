package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import h.h.m.m;
import i.c.a.b.d.l.q;
import i.c.a.c.b;
import i.c.a.c.e0.g;
import i.c.a.c.j;
import i.c.a.c.j0.a.a;

public class MaterialToolbar extends Toolbar {
    public static final int R = j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            q.a((View) this, (g) background);
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        q.a((View) this, f2);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i2) {
        super(a.a(context, attributeSet, i2, R), attributeSet, i2);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.e.f4059b = new i.c.a.c.w.a(context2);
            gVar.i();
            gVar.a(m.g(this));
            setBackground(gVar);
        }
    }
}
