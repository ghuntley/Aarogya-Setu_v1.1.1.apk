package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import h.b.l.a.a;
import h.b.o.i.g;
import h.b.o.i.i;
import h.b.o.i.m;
import h.b.o.i.n;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f77f = {16842964, 16843049};
    public g e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public void a(g gVar) {
        this.e = gVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((i) getAdapter().getItem(i2));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f77f, i2, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable2 = a.c(context, resourceId2);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(1);
            } else {
                drawable = a.c(context, resourceId);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    public boolean a(i iVar) {
        return this.e.a((MenuItem) iVar, (m) null, 0);
    }
}
