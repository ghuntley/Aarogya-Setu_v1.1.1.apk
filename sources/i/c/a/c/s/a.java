package i.c.a.c.s;

import android.content.res.ColorStateList;
import android.view.View;
import h.b.p.g;
import i.c.a.b.d.l.q;
import i.c.a.c.b;
import i.c.a.c.j;

/* compiled from: MaterialCheckBox */
public class a extends g {

    /* renamed from: j  reason: collision with root package name */
    public static final int f4200j = j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: k  reason: collision with root package name */
    public static final int[][] f4201k = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f4202h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4203i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = i.c.a.c.b.checkboxStyle
            int r0 = f4200j
            android.content.Context r8 = i.c.a.c.j0.a.a.a(r8, r9, r3, r0)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = i.c.a.c.k.MaterialCheckBox
            int r4 = f4200j
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = i.c.a.c.z.i.b(r0, r1, r2, r3, r4, r5)
            int r0 = i.c.a.c.k.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r0)
            if (r0 == 0) goto L_0x002d
            int r0 = i.c.a.c.k.MaterialCheckBox_buttonTint
            android.content.res.ColorStateList r8 = i.c.a.b.d.l.q.a((android.content.Context) r8, (android.content.res.TypedArray) r9, (int) r0)
            r7.setButtonTintList(r8)
        L_0x002d:
            int r8 = i.c.a.c.k.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f4203i = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.s.a.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4202h == null) {
            int[] iArr = new int[f4201k.length];
            int a = q.a((View) this, b.colorControlActivated);
            int a2 = q.a((View) this, b.colorSurface);
            int a3 = q.a((View) this, b.colorOnSurface);
            iArr[0] = q.a(a2, a, 1.0f);
            iArr[1] = q.a(a2, a3, 0.54f);
            iArr[2] = q.a(a2, a3, 0.38f);
            iArr[3] = q.a(a2, a3, 0.38f);
            this.f4202h = new ColorStateList(f4201k, iArr);
        }
        return this.f4202h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4203i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f4203i = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }
}
