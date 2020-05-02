package i.c.a.c.v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import g.a.a.b.a;
import h.h.m.m;
import i.c.a.b.d.l.q;
import i.c.a.c.e0.c;
import i.c.a.c.e0.g;
import i.c.a.c.e0.j;
import i.c.a.c.k;

/* compiled from: CalendarItemStyle */
public final class b {
    public final Rect a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f4211b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final j f4212f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, j jVar, Rect rect) {
        a.a(rect.left);
        a.a(rect.top);
        a.a(rect.right);
        a.a(rect.bottom);
        this.a = rect;
        this.f4211b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i2;
        this.f4212f = jVar;
    }

    public static b a(Context context, int i2) {
        if (i2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.MaterialCalendarItem);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetBottom, 0));
            ColorStateList a2 = q.a(context, obtainStyledAttributes, k.MaterialCalendarItem_itemFillColor);
            ColorStateList a3 = q.a(context, obtainStyledAttributes, k.MaterialCalendarItem_itemTextColor);
            ColorStateList a4 = q.a(context, obtainStyledAttributes, k.MaterialCalendarItem_itemStrokeColor);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(k.MaterialCalendarItem_itemStrokeWidth, 0);
            j a5 = j.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), (c) new i.c.a.c.e0.a((float) 0)).a();
            obtainStyledAttributes.recycle();
            return new b(a2, a3, a4, dimensionPixelSize, a5, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public void a(TextView textView) {
        g gVar = new g();
        g gVar2 = new g();
        gVar.setShapeAppearanceModel(this.f4212f);
        gVar2.setShapeAppearanceModel(this.f4212f);
        gVar.a(this.c);
        gVar.a((float) this.e, this.d);
        textView.setTextColor(this.f4211b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f4211b.withAlpha(30), gVar, gVar2);
        Rect rect = this.a;
        m.a((View) textView, (Drawable) new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
