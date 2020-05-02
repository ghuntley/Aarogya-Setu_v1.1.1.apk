package i.c.a.c.z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import i.a.a.a.a;
import i.c.a.c.b;
import i.c.a.c.k;

/* compiled from: ThemeEnforcement */
public final class i {
    public static final int[] a = {b.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4288b = {b.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ThemeEnforcement, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                a(context, f4288b, "Theme.MaterialComponents");
            }
        }
        a(context, a, "Theme.AppCompat");
    }

    public static TypedArray b(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        a(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0.getResourceId(i.c.a.c.k.ThemeEnforcement_android_textAppearance, -1) != -1) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = i.c.a.c.k.ThemeEnforcement
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            int r1 = i.c.a.c.k.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0013
            r0.recycle()
            return
        L_0x0013:
            r1 = 1
            r3 = -1
            if (r10 == 0) goto L_0x0037
            int r4 = r10.length
            if (r4 != 0) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = 0
        L_0x0021:
            if (r7 >= r6) goto L_0x0032
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r3)
            if (r8 != r3) goto L_0x002f
            r5.recycle()
            goto L_0x0040
        L_0x002f:
            int r7 = r7 + 1
            goto L_0x0021
        L_0x0032:
            r5.recycle()
        L_0x0035:
            r2 = 1
            goto L_0x0040
        L_0x0037:
            int r5 = i.c.a.c.k.ThemeEnforcement_android_textAppearance
            int r5 = r0.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x0040
            goto L_0x0035
        L_0x0040:
            r0.recycle()
            if (r2 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.z.i.a(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(a.a("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }
}
