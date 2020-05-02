package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import h.b.p.f;
import h.h.m.m;
import i.c.a.b.d.l.q;
import i.c.a.c.e0.g;
import i.c.a.c.e0.n;
import i.c.a.c.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends f implements Checkable, n {
    public static final int[] s = {16842911};
    public static final int[] t = {16842912};
    public static final int u = j.Widget_MaterialComponents_Button;

    /* renamed from: g  reason: collision with root package name */
    public final i.c.a.c.q.a f586g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashSet<a> f587h;

    /* renamed from: i  reason: collision with root package name */
    public b f588i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f589j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f590k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f591l;

    /* renamed from: m  reason: collision with root package name */
    public int f592m;

    /* renamed from: n  reason: collision with root package name */
    public int f593n;

    /* renamed from: o  reason: collision with root package name */
    public int f594o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f595p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f596q;
    public int r;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public final void a(boolean z) {
        Drawable drawable = this.f591l;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = g.a.a.b.a.c(drawable).mutate();
            this.f591l = mutate;
            mutate.setTintList(this.f590k);
            PorterDuff.Mode mode = this.f589j;
            if (mode != null) {
                this.f591l.setTintMode(mode);
            }
            int i2 = this.f592m;
            if (i2 == 0) {
                i2 = this.f591l.getIntrinsicWidth();
            }
            int i3 = this.f592m;
            if (i3 == 0) {
                i3 = this.f591l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f591l;
            int i4 = this.f593n;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.r;
        boolean z3 = i5 == 1 || i5 == 2;
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[2];
            if ((z3 && drawable3 != this.f591l) || (!z3 && drawable4 != this.f591l)) {
                z2 = true;
            }
            if (!z2) {
                return;
            }
            if (z3) {
                setCompoundDrawablesRelative(this.f591l, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f591l, (Drawable) null);
            }
        } else if (z3) {
            setCompoundDrawablesRelative(this.f591l, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f591l, (Drawable) null);
        }
    }

    public final boolean b() {
        i.c.a.c.q.a aVar = this.f586g;
        return aVar != null && !aVar.f4191o;
    }

    public final void c() {
        if (this.f591l != null && getLayout() != null) {
            int i2 = this.r;
            boolean z = true;
            if (i2 == 1 || i2 == 3) {
                this.f593n = 0;
                a(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i3 = this.f592m;
            if (i3 == 0) {
                i3 = this.f591l.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - m.n(this)) - i3) - this.f594o) - getPaddingStart()) / 2;
            boolean z2 = m.k(this) == 1;
            if (this.r != 4) {
                z = false;
            }
            if (z2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f593n != measuredWidth) {
                this.f593n = measuredWidth;
                a(false);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f586g.f4183g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f591l;
    }

    public int getIconGravity() {
        return this.r;
    }

    public int getIconPadding() {
        return this.f594o;
    }

    public int getIconSize() {
        return this.f592m;
    }

    public ColorStateList getIconTint() {
        return this.f590k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f589j;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f586g.f4188l;
        }
        return null;
    }

    public i.c.a.c.e0.j getShapeAppearanceModel() {
        if (b()) {
            return this.f586g.f4181b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f586g.f4187k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f586g.f4184h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f586g.f4186j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f586g.f4185i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f595p;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q.a((View) this, this.f586g.b());
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, s);
        }
        if (this.f595p) {
            Button.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f595p);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f595p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        i.c.a.c.q.a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f586g) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = aVar.f4189m;
            if (drawable != null) {
                drawable.setBounds(aVar.c, aVar.e, i7 - aVar.d, i6 - aVar.f4182f);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        c();
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        c();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            if (aVar.b() != null) {
                aVar.b().setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            i.c.a.c.q.a aVar = this.f586g;
            aVar.f4191o = true;
            aVar.a.setSupportBackgroundTintList(aVar.f4186j);
            aVar.a.setSupportBackgroundTintMode(aVar.f4185i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? h.b.l.a.a.c(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.f586g.f4193q = z;
        }
    }

    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.f595p != z) {
            this.f595p = z;
            refreshDrawableState();
            if (!this.f596q) {
                this.f596q = true;
                Iterator it = this.f587h.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.f595p);
                }
                this.f596q = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            if (!aVar.f4192p || aVar.f4183g != i2) {
                aVar.f4183g = i2;
                aVar.f4192p = true;
                aVar.a(aVar.f4181b.a((float) i2));
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            g b2 = this.f586g.b();
            g.b bVar = b2.e;
            if (bVar.f4069o != f2) {
                bVar.f4069o = f2;
                b2.i();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f591l != drawable) {
            this.f591l = drawable;
            a(true);
        }
    }

    public void setIconGravity(int i2) {
        if (this.r != i2) {
            this.r = i2;
            c();
        }
    }

    public void setIconPadding(int i2) {
        if (this.f594o != i2) {
            this.f594o = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? h.b.l.a.a.c(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f592m != i2) {
            this.f592m = i2;
            a(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f590k != colorStateList) {
            this.f590k = colorStateList;
            a(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f589j != mode) {
            this.f589j = mode;
            a(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(h.b.l.a.a.b(getContext(), i2));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f588i = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.f588i;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            if (aVar.f4188l != colorStateList) {
                aVar.f4188l = colorStateList;
                if (aVar.a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.a.getBackground()).setColor(i.c.a.c.c0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(h.b.l.a.a.b(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(i.c.a.c.e0.j jVar) {
        if (b()) {
            this.f586g.a(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            aVar.f4190n = z;
            aVar.d();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            if (aVar.f4187k != colorStateList) {
                aVar.f4187k = colorStateList;
                aVar.d();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(h.b.l.a.a.b(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            if (aVar.f4184h != i2) {
                aVar.f4184h = i2;
                aVar.d();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            if (aVar.f4186j != colorStateList) {
                aVar.f4186j = colorStateList;
                if (aVar.b() != null) {
                    aVar.b().setTintList(aVar.f4186j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            i.c.a.c.q.a aVar = this.f586g;
            if (aVar.f4185i != mode) {
                aVar.f4185i = mode;
                if (aVar.b() != null && aVar.f4185i != null) {
                    aVar.b().setTintMode(aVar.f4185i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void toggle() {
        setChecked(!this.f595p);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.c.a.c.b.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r1 = u
            r2 = r21
            android.content.Context r1 = i.c.a.c.j0.a.a.a(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f587h = r1
            r9 = 0
            r0.f595p = r9
            r0.f596q = r9
            android.content.Context r10 = r20.getContext()
            int[] r3 = i.c.a.c.k.MaterialButton
            int r5 = u
            int[] r6 = new int[r9]
            r1 = r10
            r2 = r22
            r4 = r23
            android.content.res.TypedArray r1 = i.c.a.c.z.i.b(r1, r2, r3, r4, r5, r6)
            int r2 = i.c.a.c.k.MaterialButton_iconPadding
            int r2 = r1.getDimensionPixelSize(r2, r9)
            r0.f594o = r2
            int r2 = i.c.a.c.k.MaterialButton_iconTintMode
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = i.c.a.b.d.l.q.a((int) r2, (android.graphics.PorterDuff.Mode) r4)
            r0.f589j = r2
            android.content.Context r2 = r20.getContext()
            int r4 = i.c.a.c.k.MaterialButton_iconTint
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r4)
            r0.f590k = r2
            android.content.Context r2 = r20.getContext()
            int r4 = i.c.a.c.k.MaterialButton_icon
            android.graphics.drawable.Drawable r2 = i.c.a.b.d.l.q.b((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r4)
            r0.f591l = r2
            int r2 = i.c.a.c.k.MaterialButton_iconGravity
            r4 = 1
            int r2 = r1.getInteger(r2, r4)
            r0.r = r2
            int r2 = i.c.a.c.k.MaterialButton_iconSize
            int r2 = r1.getDimensionPixelSize(r2, r9)
            r0.f592m = r2
            int r2 = u
            i.c.a.c.e0.j$b r2 = i.c.a.c.e0.j.a((android.content.Context) r10, (android.util.AttributeSet) r7, (int) r8, (int) r2)
            i.c.a.c.e0.j r2 = r2.a()
            i.c.a.c.q.a r5 = new i.c.a.c.q.a
            r5.<init>(r0, r2)
            r0.f586g = r5
            if (r5 == 0) goto L_0x01da
            int r2 = i.c.a.c.k.MaterialButton_android_insetLeft
            int r2 = r1.getDimensionPixelOffset(r2, r9)
            r5.c = r2
            int r2 = i.c.a.c.k.MaterialButton_android_insetRight
            int r2 = r1.getDimensionPixelOffset(r2, r9)
            r5.d = r2
            int r2 = i.c.a.c.k.MaterialButton_android_insetTop
            int r2 = r1.getDimensionPixelOffset(r2, r9)
            r5.e = r2
            int r2 = i.c.a.c.k.MaterialButton_android_insetBottom
            int r2 = r1.getDimensionPixelOffset(r2, r9)
            r5.f4182f = r2
            int r2 = i.c.a.c.k.MaterialButton_cornerRadius
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00bf
            int r2 = i.c.a.c.k.MaterialButton_cornerRadius
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r5.f4183g = r2
            i.c.a.c.e0.j r6 = r5.f4181b
            float r2 = (float) r2
            i.c.a.c.e0.j r2 = r6.a((float) r2)
            r5.a((i.c.a.c.e0.j) r2)
            r5.f4192p = r4
        L_0x00bf:
            int r2 = i.c.a.c.k.MaterialButton_strokeWidth
            int r2 = r1.getDimensionPixelSize(r2, r9)
            r5.f4184h = r2
            int r2 = i.c.a.c.k.MaterialButton_backgroundTintMode
            int r2 = r1.getInt(r2, r3)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = i.c.a.b.d.l.q.a((int) r2, (android.graphics.PorterDuff.Mode) r6)
            r5.f4185i = r2
            com.google.android.material.button.MaterialButton r2 = r5.a
            android.content.Context r2 = r2.getContext()
            int r6 = i.c.a.c.k.MaterialButton_backgroundTint
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r6)
            r5.f4186j = r2
            com.google.android.material.button.MaterialButton r2 = r5.a
            android.content.Context r2 = r2.getContext()
            int r6 = i.c.a.c.k.MaterialButton_strokeColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r6)
            r5.f4187k = r2
            com.google.android.material.button.MaterialButton r2 = r5.a
            android.content.Context r2 = r2.getContext()
            int r6 = i.c.a.c.k.MaterialButton_rippleColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r6)
            r5.f4188l = r2
            int r2 = i.c.a.c.k.MaterialButton_android_checkable
            boolean r2 = r1.getBoolean(r2, r9)
            r5.f4193q = r2
            int r2 = i.c.a.c.k.MaterialButton_elevation
            int r2 = r1.getDimensionPixelSize(r2, r9)
            com.google.android.material.button.MaterialButton r6 = r5.a
            int r6 = h.h.m.m.o(r6)
            com.google.android.material.button.MaterialButton r7 = r5.a
            int r7 = r7.getPaddingTop()
            com.google.android.material.button.MaterialButton r8 = r5.a
            int r8 = r8.getPaddingEnd()
            com.google.android.material.button.MaterialButton r10 = r5.a
            int r10 = r10.getPaddingBottom()
            com.google.android.material.button.MaterialButton r11 = r5.a
            i.c.a.c.e0.g r12 = new i.c.a.c.e0.g
            i.c.a.c.e0.j r13 = r5.f4181b
            r12.<init>((i.c.a.c.e0.j) r13)
            com.google.android.material.button.MaterialButton r13 = r5.a
            android.content.Context r13 = r13.getContext()
            r12.a((android.content.Context) r13)
            android.content.res.ColorStateList r13 = r5.f4186j
            r12.setTintList(r13)
            android.graphics.PorterDuff$Mode r13 = r5.f4185i
            if (r13 == 0) goto L_0x0143
            r12.setTintMode(r13)
        L_0x0143:
            int r13 = r5.f4184h
            float r13 = (float) r13
            android.content.res.ColorStateList r14 = r5.f4187k
            r12.a((float) r13, (android.content.res.ColorStateList) r14)
            i.c.a.c.e0.g r13 = new i.c.a.c.e0.g
            i.c.a.c.e0.j r14 = r5.f4181b
            r13.<init>((i.c.a.c.e0.j) r14)
            r13.setTint(r9)
            int r14 = r5.f4184h
            float r14 = (float) r14
            boolean r15 = r5.f4190n
            if (r15 == 0) goto L_0x0165
            com.google.android.material.button.MaterialButton r15 = r5.a
            int r4 = i.c.a.c.b.colorSurface
            int r4 = i.c.a.b.d.l.q.a((android.view.View) r15, (int) r4)
            goto L_0x0166
        L_0x0165:
            r4 = 0
        L_0x0166:
            r13.a((float) r14, (int) r4)
            i.c.a.c.e0.g r4 = new i.c.a.c.e0.g
            i.c.a.c.e0.j r14 = r5.f4181b
            r4.<init>((i.c.a.c.e0.j) r14)
            r5.f4189m = r4
            r4.setTint(r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r4 = r5.f4188l
            android.content.res.ColorStateList r4 = i.c.a.c.c0.a.a((android.content.res.ColorStateList) r4)
            android.graphics.drawable.LayerDrawable r15 = new android.graphics.drawable.LayerDrawable
            r14 = 2
            android.graphics.drawable.Drawable[] r14 = new android.graphics.drawable.Drawable[r14]
            r14[r9] = r13
            r13 = 1
            r14[r13] = r12
            r15.<init>(r14)
            android.graphics.drawable.InsetDrawable r12 = new android.graphics.drawable.InsetDrawable
            int r14 = r5.c
            int r9 = r5.e
            int r13 = r5.d
            int r0 = r5.f4182f
            r16 = r14
            r14 = r12
            r17 = r9
            r18 = r13
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            android.graphics.drawable.Drawable r0 = r5.f4189m
            r3.<init>(r4, r12, r0)
            r5.r = r3
            r11.setInternalBackground(r3)
            i.c.a.c.e0.g r0 = r5.b()
            if (r0 == 0) goto L_0x01b4
            float r2 = (float) r2
            r0.a((float) r2)
        L_0x01b4:
            com.google.android.material.button.MaterialButton r0 = r5.a
            int r2 = r5.c
            int r6 = r6 + r2
            int r2 = r5.e
            int r7 = r7 + r2
            int r2 = r5.d
            int r8 = r8 + r2
            int r2 = r5.f4182f
            int r10 = r10 + r2
            r0.setPaddingRelative(r6, r7, r8, r10)
            r1.recycle()
            r0 = r20
            int r1 = r0.f594o
            r0.setCompoundDrawablePadding(r1)
            android.graphics.drawable.Drawable r1 = r0.f591l
            if (r1 == 0) goto L_0x01d5
            r9 = 1
            goto L_0x01d6
        L_0x01d5:
            r9 = 0
        L_0x01d6:
            r0.a(r9)
            return
        L_0x01da:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean a() {
        i.c.a.c.q.a aVar = this.f586g;
        return aVar != null && aVar.f4193q;
    }
}
