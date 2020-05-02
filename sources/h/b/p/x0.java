package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import h.b.l.a.a;
import h.h.f.b.g;

/* compiled from: TintTypedArray */
public class x0 {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1492b;
    public TypedValue c;

    public x0(Context context, TypedArray typedArray) {
        this.a = context;
        this.f1492b = typedArray;
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public Drawable b(int i2) {
        int resourceId;
        if (!this.f1492b.hasValue(i2) || (resourceId = this.f1492b.getResourceId(i2, 0)) == 0) {
            return this.f1492b.getDrawable(i2);
        }
        return a.c(this.a, resourceId);
    }

    public Drawable c(int i2) {
        int resourceId;
        if (!this.f1492b.hasValue(i2) || (resourceId = this.f1492b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.a().a(this.a, resourceId, true);
    }

    public String d(int i2) {
        return this.f1492b.getString(i2);
    }

    public CharSequence e(int i2) {
        return this.f1492b.getText(i2);
    }

    public int f(int i2, int i3) {
        return this.f1492b.getResourceId(i2, i3);
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public int d(int i2, int i3) {
        return this.f1492b.getInt(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.f1492b.getLayoutDimension(i2, i3);
    }

    public boolean f(int i2) {
        return this.f1492b.hasValue(i2);
    }

    public Typeface a(int i2, int i3, g gVar) {
        int resourceId = this.f1492b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        Context context = this.a;
        TypedValue typedValue = this.c;
        if (context.isRestricted()) {
            return null;
        }
        return g.a.a.b.a.a(context, resourceId, typedValue, i3, gVar, (Handler) null, true);
    }

    public int c(int i2, int i3) {
        return this.f1492b.getDimensionPixelSize(i2, i3);
    }

    public int b(int i2, int i3) {
        return this.f1492b.getDimensionPixelOffset(i2, i3);
    }

    public boolean a(int i2, boolean z) {
        return this.f1492b.getBoolean(i2, z);
    }

    public int a(int i2, int i3) {
        return this.f1492b.getColor(i2, i3);
    }

    public ColorStateList a(int i2) {
        int resourceId;
        ColorStateList b2;
        if (!this.f1492b.hasValue(i2) || (resourceId = this.f1492b.getResourceId(i2, 0)) == 0 || (b2 = a.b(this.a, resourceId)) == null) {
            return this.f1492b.getColorStateList(i2);
        }
        return b2;
    }

    public float a(int i2, float f2) {
        return this.f1492b.getDimension(i2, f2);
    }
}
