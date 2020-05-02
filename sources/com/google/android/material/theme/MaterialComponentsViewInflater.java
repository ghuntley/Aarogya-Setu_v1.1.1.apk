package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import h.b.k.s;
import h.b.p.d;
import h.b.p.f;
import h.b.p.g;
import h.b.p.r;
import h.b.p.z;
import i.c.a.c.i0.b;
import l.a.a.a.o.b.a;

public class MaterialComponentsViewInflater extends s {

    /* renamed from: f  reason: collision with root package name */
    public static int f677f = -1;

    public d a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i2 == 23 || i2 == 24 || i2 == 25) {
            if (f677f == -1) {
                f677f = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", a.ANDROID_CLIENT_TYPE);
            }
            int i3 = f677f;
            if (i3 != 0 && i3 != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 < attributeSet.getAttributeCount()) {
                        if (attributeSet.getAttributeNameResource(i4) == 16842964 && f677f == attributeSet.getAttributeListValue(i4, (String[]) null, 0)) {
                            z = true;
                            break;
                        }
                        i4++;
                    } else {
                        break;
                    }
                }
            }
        }
        if (z) {
            return new f(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new i.c.a.c.s.a(context, attributeSet);
    }

    public r d(Context context, AttributeSet attributeSet) {
        return new i.c.a.c.a0.a(context, attributeSet);
    }

    public z e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
