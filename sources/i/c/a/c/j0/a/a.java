package i.c.a.c.j0.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import h.b.o.c;
import i.c.a.c.b;

/* compiled from: MaterialThemeOverlay */
public class a {
    public static final int[] a = {16842752, b.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4146b = {b.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4146b, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof c) && ((c) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        c cVar = new c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
