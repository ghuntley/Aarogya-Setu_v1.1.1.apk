package i.c.a.c.a0;

import android.content.res.ColorStateList;
import android.view.View;
import h.b.p.r;
import i.c.a.b.d.l.q;
import i.c.a.c.b;
import i.c.a.c.j;

/* compiled from: MaterialRadioButton */
public class a extends r {

    /* renamed from: j  reason: collision with root package name */
    public static final int f4022j = j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: k  reason: collision with root package name */
    public static final int[][] f4023k = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f4024h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4025i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = i.c.a.c.b.radioButtonStyle
            int r0 = f4022j
            android.content.Context r7 = i.c.a.c.j0.a.a.a(r7, r8, r3, r0)
            r6.<init>(r7, r8, r3)
            android.content.Context r0 = r6.getContext()
            int[] r2 = i.c.a.c.k.MaterialRadioButton
            int r4 = f4022j
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = i.c.a.c.z.i.b(r0, r1, r2, r3, r4, r5)
            int r0 = i.c.a.c.k.MaterialRadioButton_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r0, r7)
            r6.f4025i = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.a0.a.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4024h == null) {
            int a = q.a((View) this, b.colorControlActivated);
            int a2 = q.a((View) this, b.colorOnSurface);
            int a3 = q.a((View) this, b.colorSurface);
            int[] iArr = new int[f4023k.length];
            iArr[0] = q.a(a3, a, 1.0f);
            iArr[1] = q.a(a3, a2, 0.54f);
            iArr[2] = q.a(a3, a2, 0.38f);
            iArr[3] = q.a(a3, a2, 0.38f);
            this.f4024h = new ColorStateList(f4023k, iArr);
        }
        return this.f4024h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4025i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f4025i = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }
}
