package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import h.b.p.g;
import h.h.k.c;
import h.h.k.d;
import h.h.m.m;
import h.h.m.w.b;
import i.c.a.b.d.l.q;
import i.c.a.c.b0.d;
import i.c.a.c.e0.g;
import i.c.a.c.e0.n;
import i.c.a.c.f;
import i.c.a.c.i;
import i.c.a.c.j;
import i.c.a.c.t.b;
import java.lang.ref.WeakReference;
import java.util.List;

public class Chip extends g implements b.a, n {
    public static final int[] A = {16842911};
    public static final int x = j.Widget_MaterialComponents_Chip_Action;
    public static final Rect y = new Rect();
    public static final int[] z = {16842913};

    /* renamed from: h  reason: collision with root package name */
    public i.c.a.c.t.b f597h;

    /* renamed from: i  reason: collision with root package name */
    public InsetDrawable f598i;

    /* renamed from: j  reason: collision with root package name */
    public RippleDrawable f599j;

    /* renamed from: k  reason: collision with root package name */
    public View.OnClickListener f600k;

    /* renamed from: l  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f601l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f602m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f603n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f604o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f605p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f606q;
    public int r;
    public int s;
    public final b t;
    public final Rect u;
    public final RectF v;
    public final d w;

    public class a extends d {
        public a() {
        }

        public void a(int i2) {
        }

        public void a(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            i.c.a.c.t.b bVar = chip.f597h;
            if (bVar.I0) {
                charSequence = bVar.J;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.v.setEmpty();
        if (b()) {
            i.c.a.c.t.b bVar = this.f597h;
            bVar.c(bVar.getBounds(), this.v);
        }
        return this.v;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.u;
    }

    private i.c.a.c.b0.b getTextAppearance() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.p0.f4287f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f604o != z2) {
            this.f604o = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f603n != z2) {
            this.f603n = z2;
            refreshDrawableState();
        }
    }

    public final void d() {
        if (this.f598i != null) {
            this.f598i = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cb A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.Class<h.j.b.a> r0 = h.j.b.a.class
            java.lang.String r1 = "Unable to send Accessibility Exit event"
            java.lang.String r2 = "Chip"
            int r3 = r11.getAction()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 10
            r6 = 0
            r7 = 1
            if (r3 != r5) goto L_0x005a
            java.lang.String r3 = "m"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r3.setAccessible(r7)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            com.google.android.material.chip.Chip$b r8 = r10.t     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            int r3 = r3.intValue()     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            if (r3 == r4) goto L_0x005a
            java.lang.String r3 = "f"
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r8[r6] = r9     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r8)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r0.setAccessible(r7)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            com.google.android.material.chip.Chip$b r3 = r10.t     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r8[r6] = r9     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r0.invoke(r3, r8)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r0 = 1
            goto L_0x005b
        L_0x0047:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
            goto L_0x005a
        L_0x004c:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
            goto L_0x005a
        L_0x0051:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 != 0) goto L_0x00cb
            com.google.android.material.chip.Chip$b r0 = r10.t
            android.view.accessibility.AccessibilityManager r1 = r0.f1870h
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x00c2
            android.view.accessibility.AccessibilityManager r1 = r0.f1870h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x0070
            goto L_0x00c2
        L_0x0070:
            int r1 = r11.getAction()
            r2 = 7
            r3 = 256(0x100, float:3.59E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r1 == r2) goto L_0x0092
            r2 = 9
            if (r1 == r2) goto L_0x0092
            if (r1 == r5) goto L_0x0082
            goto L_0x00c2
        L_0x0082:
            int r1 = r0.f1875m
            if (r1 == r4) goto L_0x00c2
            if (r1 != r4) goto L_0x0089
            goto L_0x00c0
        L_0x0089:
            r0.f1875m = r4
            r0.a((int) r4, (int) r8)
            r0.a((int) r1, (int) r3)
            goto L_0x00c0
        L_0x0092:
            float r1 = r11.getX()
            float r2 = r11.getY()
            com.google.android.material.chip.Chip r5 = com.google.android.material.chip.Chip.this
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x00b0
            com.google.android.material.chip.Chip r5 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r5 = r5.getCloseIconTouchBounds()
            boolean r1 = r5.contains(r1, r2)
            if (r1 == 0) goto L_0x00b0
            r1 = 1
            goto L_0x00b1
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            int r2 = r0.f1875m
            if (r2 != r1) goto L_0x00b6
            goto L_0x00be
        L_0x00b6:
            r0.f1875m = r1
            r0.a((int) r1, (int) r8)
            r0.a((int) r2, (int) r3)
        L_0x00be:
            if (r1 == r4) goto L_0x00c2
        L_0x00c0:
            r0 = 1
            goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            if (r0 != 0) goto L_0x00cb
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L_0x00cc
        L_0x00cb:
            r6 = 1
        L_0x00cc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.t;
        if (bVar != null) {
            int i2 = 0;
            if (keyEvent.getAction() != 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 61) {
                    int i3 = 66;
                    if (keyCode != 66) {
                        switch (keyCode) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                if (keyEvent.hasNoModifiers()) {
                                    if (keyCode == 19) {
                                        i3 = 33;
                                    } else if (keyCode == 21) {
                                        i3 = 17;
                                    } else if (keyCode != 22) {
                                        i3 = 130;
                                    }
                                    int repeatCount = keyEvent.getRepeatCount() + 1;
                                    int i4 = 0;
                                    while (i2 < repeatCount && bVar.a(i3, (Rect) null)) {
                                        i2++;
                                        i4 = 1;
                                    }
                                    i2 = i4;
                                    break;
                                }
                                break;
                            case 23:
                                break;
                        }
                    }
                    if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                        int i5 = bVar.f1874l;
                        if (i5 != Integer.MIN_VALUE) {
                            bVar.a(i5, 16, (Bundle) null);
                        }
                        i2 = 1;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i2 = bVar.a(2, (Rect) null);
                } else if (keyEvent.hasModifiers(1)) {
                    i2 = bVar.a(1, (Rect) null);
                }
            }
            if (i2 == 0 || this.t.f1874l == Integer.MIN_VALUE) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        }
        throw null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        i.c.a.c.t.b bVar = this.f597h;
        int i2 = 0;
        if (bVar != null && i.c.a.c.t.b.f(bVar.Q)) {
            i.c.a.c.t.b bVar2 = this.f597h;
            int isEnabled = isEnabled();
            if (this.f605p) {
                isEnabled++;
            }
            if (this.f604o) {
                isEnabled++;
            }
            if (this.f603n) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f605p) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f604o) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f603n) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            i2 = bVar2.b(iArr);
        }
        if (i2 != 0) {
            invalidate();
        }
    }

    public final void e() {
        if (b()) {
            i.c.a.c.t.b bVar = this.f597h;
            if ((bVar != null && bVar.P) && this.f600k != null) {
                m.a((View) this, (h.h.m.a) this.t);
                return;
            }
        }
        m.a((View) this, (h.h.m.a) null);
    }

    public final void f() {
        if (i.c.a.c.c0.a.a) {
            g();
            return;
        }
        this.f597h.e(true);
        m.a((View) this, getBackgroundDrawable());
        h();
        if (getBackgroundDrawable() == this.f598i && this.f597h.getCallback() == null) {
            this.f597h.setCallback(this.f598i);
        }
    }

    public final void g() {
        this.f599j = new RippleDrawable(i.c.a.c.c0.a.a(this.f597h.I), getBackgroundDrawable(), (Drawable) null);
        this.f597h.e(false);
        m.a((View) this, (Drawable) this.f599j);
        h();
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f598i;
        return insetDrawable == null ? this.f597h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.X;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.D;
        }
        return null;
    }

    public float getChipCornerRadius() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.l();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f597h;
    }

    public float getChipEndPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.h0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar == null || (drawable = bVar.L) == null) {
            return null;
        }
        return drawable instanceof h.h.g.j.b ? ((h.h.g.j.b) drawable).a() : drawable;
    }

    public float getChipIconSize() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.N;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.M;
        }
        return null;
    }

    public float getChipMinHeight() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.E;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.G;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.H;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.m();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.U;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.g0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.T;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.f0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.S;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.H0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        b bVar = this.t;
        if (bVar.f1874l == 1 || bVar.f1873k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public i.c.a.c.l.g getHideMotionSpec() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.c0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.b0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.I;
        }
        return null;
    }

    public i.c.a.c.e0.j getShapeAppearanceModel() {
        return this.f597h.e.a;
    }

    public i.c.a.c.l.g getShowMotionSpec() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.e0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            return bVar.d0;
        }
        return 0.0f;
    }

    public final void h() {
        i.c.a.c.t.b bVar;
        if (!TextUtils.isEmpty(getText()) && (bVar = this.f597h) != null) {
            int k2 = (int) (bVar.k() + bVar.h0 + bVar.e0);
            i.c.a.c.t.b bVar2 = this.f597h;
            int j2 = (int) (bVar2.j() + bVar2.a0 + bVar2.d0);
            if (this.f598i != null) {
                Rect rect = new Rect();
                this.f598i.getPadding(rect);
                j2 += rect.left;
                k2 += rect.right;
            }
            m.a(this, j2, getPaddingTop(), k2, getPaddingBottom());
        }
    }

    public final void i() {
        TextPaint paint = getPaint();
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        i.c.a.c.b0.b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.a(getContext(), paint, this.w);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q.a((View) this, (i.c.a.c.e0.g) this.f597h);
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, z);
        }
        if (c()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        b bVar = this.t;
        int i3 = bVar.f1874l;
        if (i3 != Integer.MIN_VALUE) {
            bVar.b(i3);
        }
        if (z2) {
            bVar.a(i2, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        int i3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (c() || isClickable()) {
            accessibilityNodeInfo.setClassName(c() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            h.h.m.w.b bVar = new h.h.m.w.b(accessibilityNodeInfo);
            if (chipGroup.f4273g) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= chipGroup.getChildCount()) {
                        i5 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i4) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i4)) == this) {
                            break;
                        }
                        i5++;
                    }
                    i4++;
                }
                i2 = i5;
            } else {
                i2 = -1;
            }
            Object tag = getTag(f.row_index_key);
            if (!(tag instanceof Integer)) {
                i3 = -1;
            } else {
                i3 = ((Integer) tag).intValue();
            }
            bVar.b((Object) b.c.a(i3, 1, i2, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.r != i2) {
            this.r = i2;
            h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.f603n
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r2)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.f603n
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f600k
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.t
            r0.a((int) r3, (int) r3)
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r5.setCloseIconPressed(r2)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r3)
        L_0x004a:
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 != 0) goto L_0x0055
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f599j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f599j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.a(z2);
        }
    }

    public void setCheckableResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.a(bVar.i0.getResources().getBoolean(i2));
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar == null) {
            this.f602m = z2;
        } else if (bVar.V) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked != z2 && (onCheckedChangeListener = this.f601l) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z2);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.b(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.b(h.b.l.a.a.c(bVar.i0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.b(bVar.i0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null && bVar.D != colorStateList) {
            bVar.D = colorStateList;
            bVar.onStateChange(bVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.c(h.b.l.a.a.b(bVar.i0, i2));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.c(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.c(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(i.c.a.c.t.b bVar) {
        i.c.a.c.t.b bVar2 = this.f597h;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.G0 = new WeakReference<>((Object) null);
            }
            this.f597h = bVar;
            bVar.I0 = false;
            if (bVar != null) {
                bVar.G0 = new WeakReference<>(this);
                a(this.s);
                return;
            }
            throw null;
        }
    }

    public void setChipEndPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null && bVar.h0 != f2) {
            bVar.h0 = f2;
            bVar.invalidateSelf();
            bVar.n();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.d(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setChipIcon(Drawable drawable) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.c(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.c(h.b.l.a.a.c(bVar.i0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.e(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.e(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.d(h.b.l.a.a.b(bVar.i0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.c(bVar.i0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null && bVar.E != f2) {
            bVar.E = f2;
            bVar.invalidateSelf();
            bVar.n();
        }
    }

    public void setChipMinHeightResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.f(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setChipStartPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null && bVar.a0 != f2) {
            bVar.a0 = f2;
            bVar.invalidateSelf();
            bVar.n();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.g(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.e(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.e(h.b.l.a.a.b(bVar.i0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.h(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.h(bVar.i0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.d(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null && bVar.U != charSequence) {
            h.h.k.a a2 = h.h.k.a.a();
            c cVar = a2.c;
            if (charSequence == null) {
                spannableStringBuilder = null;
            } else {
                boolean a3 = ((d.C0049d) cVar).a(charSequence, 0, charSequence.length());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String str2 = "";
                if ((a2.f1800b & 2) != 0) {
                    boolean a4 = ((d.C0049d) (a3 ? h.h.k.d.f1804b : h.h.k.d.a)).a(charSequence, 0, charSequence.length());
                    if (a2.a || (!a4 && h.h.k.a.a(charSequence) != 1)) {
                        str = (!a2.a || (a4 && h.h.k.a.a(charSequence) != -1)) ? str2 : h.h.k.a.f1797f;
                    } else {
                        str = h.h.k.a.e;
                    }
                    spannableStringBuilder2.append(str);
                }
                if (a3 != a2.a) {
                    spannableStringBuilder2.append(a3 ? (char) 8235 : 8234);
                    spannableStringBuilder2.append(charSequence);
                    spannableStringBuilder2.append(8236);
                } else {
                    spannableStringBuilder2.append(charSequence);
                }
                boolean a5 = ((d.C0049d) (a3 ? h.h.k.d.f1804b : h.h.k.d.a)).a(charSequence, 0, charSequence.length());
                if (!a2.a && (a5 || h.h.k.a.b(charSequence) == 1)) {
                    str2 = h.h.k.a.e;
                } else if (a2.a && (!a5 || h.h.k.a.b(charSequence) == -1)) {
                    str2 = h.h.k.a.f1797f;
                }
                spannableStringBuilder2.append(str2);
                spannableStringBuilder = spannableStringBuilder2;
            }
            bVar.U = spannableStringBuilder;
            bVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.i(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.i(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.d(h.b.l.a.a.c(bVar.i0, i2));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.j(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.j(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.k(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.k(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.f(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.f(h.b.l.a.a.b(bVar.i0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            g.b bVar2 = bVar.e;
            if (bVar2.f4069o != f2) {
                bVar2.f4069o = f2;
                bVar.i();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f597h != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                i.c.a.c.t.b bVar = this.f597h;
                if (bVar != null) {
                    bVar.H0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f606q = z2;
        a(this.s);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(i.c.a.c.l.g gVar) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.Z = gVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.Z = i.c.a.c.l.g.a(bVar.i0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.l(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.l(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.m(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.m(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.f597h != null) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.J0 = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f601l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f600k = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.g(colorStateList);
        }
        if (!this.f597h.E0) {
            g();
        }
    }

    public void setRippleColorResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.g(h.b.l.a.a.b(bVar.i0, i2));
            if (!this.f597h.E0) {
                g();
            }
        }
    }

    public void setShapeAppearanceModel(i.c.a.c.e0.j jVar) {
        i.c.a.c.t.b bVar = this.f597h;
        bVar.e.a = jVar;
        bVar.invalidateSelf();
    }

    public void setShowMotionSpec(i.c.a.c.l.g gVar) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.Y = gVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.Y = i.c.a.c.l.g.a(bVar.i0, i2);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f597h != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(this.f597h.I0 ? null : charSequence, bufferType);
            i.c.a.c.t.b bVar = this.f597h;
            if (bVar != null) {
                bVar.a(charSequence);
            }
        }
    }

    public void setTextAppearance(i.c.a.c.b0.b bVar) {
        i.c.a.c.t.b bVar2 = this.f597h;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
        i();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null && bVar.e0 != f2) {
            bVar.e0 = f2;
            bVar.invalidateSelf();
            bVar.n();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.n(bVar.i0.getResources().getDimension(i2));
        }
    }

    public void setTextStartPadding(float f2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null && bVar.d0 != f2) {
            bVar.d0 = f2;
            bVar.invalidateSelf();
            bVar.n();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.o(bVar.i0.getResources().getDimension(i2));
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.c.a.c.b.chipStyle);
    }

    public void a() {
        a(this.s);
        requestLayout();
        invalidateOutline();
    }

    public final boolean b() {
        i.c.a.c.t.b bVar = this.f597h;
        return (bVar == null || bVar.m() == null) ? false : true;
    }

    public boolean c() {
        i.c.a.c.t.b bVar = this.f597h;
        return bVar != null && bVar.V;
    }

    public void setCloseIconVisible(boolean z2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.d(z2);
        }
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011a, code lost:
        r4 = r1.getResourceId(r4, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r0 = r14
            r7 = r16
            r8 = r17
            int r1 = x
            r2 = r15
            android.content.Context r1 = i.c.a.c.j0.a.a.a(r15, r7, r8, r1)
            r14.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.u = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.v = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.w = r1
            android.content.Context r9 = r14.getContext()
            r10 = 8388627(0x800013, float:1.175497E-38)
            r11 = 1
            if (r7 != 0) goto L_0x002f
            goto L_0x008f
        L_0x002f:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0040:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0350
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0348
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0342
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x033c
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x0334
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0334
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0334
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0334
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r10)
            if (r1 == r10) goto L_0x008f
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x008f:
            int r5 = x
            i.c.a.c.t.b r12 = new i.c.a.c.t.b
            r12.<init>(r9, r7, r8, r5)
            android.content.Context r1 = r12.i0
            int[] r3 = i.c.a.c.k.Chip
            r13 = 0
            int[] r6 = new int[r13]
            r2 = r16
            r4 = r17
            android.content.res.TypedArray r1 = i.c.a.c.z.i.b(r1, r2, r3, r4, r5, r6)
            int r2 = i.c.a.c.k.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            r12.K0 = r2
            android.content.Context r2 = r12.i0
            int r3 = i.c.a.c.k.Chip_chipSurfaceColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r3)
            android.content.res.ColorStateList r3 = r12.C
            if (r3 == r2) goto L_0x00c2
            r12.C = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00c2:
            android.content.Context r2 = r12.i0
            int r3 = i.c.a.c.k.Chip_chipBackgroundColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r3)
            r12.c((android.content.res.ColorStateList) r2)
            int r2 = i.c.a.c.k.Chip_chipMinHeight
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r12.f((float) r2)
            int r2 = i.c.a.c.k.Chip_chipCornerRadius
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00e8
            int r2 = i.c.a.c.k.Chip_chipCornerRadius
            float r2 = r1.getDimension(r2, r3)
            r12.c((float) r2)
        L_0x00e8:
            android.content.Context r2 = r12.i0
            int r4 = i.c.a.c.k.Chip_chipStrokeColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r4)
            r12.e((android.content.res.ColorStateList) r2)
            int r2 = i.c.a.c.k.Chip_chipStrokeWidth
            float r2 = r1.getDimension(r2, r3)
            r12.h((float) r2)
            android.content.Context r2 = r12.i0
            int r4 = i.c.a.c.k.Chip_rippleColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r4)
            r12.g((android.content.res.ColorStateList) r2)
            int r2 = i.c.a.c.k.Chip_android_text
            java.lang.CharSequence r2 = r1.getText(r2)
            r12.a((java.lang.CharSequence) r2)
            android.content.Context r2 = r12.i0
            int r4 = i.c.a.c.k.Chip_android_textAppearance
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x0126
            int r4 = r1.getResourceId(r4, r13)
            if (r4 == 0) goto L_0x0126
            i.c.a.c.b0.b r5 = new i.c.a.c.b0.b
            r5.<init>(r2, r4)
            goto L_0x0127
        L_0x0126:
            r5 = 0
        L_0x0127:
            r12.a((i.c.a.c.b0.b) r5)
            int r2 = i.c.a.c.k.Chip_android_ellipsize
            int r2 = r1.getInt(r2, r13)
            if (r2 == r11) goto L_0x0143
            r4 = 2
            if (r2 == r4) goto L_0x013e
            r4 = 3
            if (r2 == r4) goto L_0x0139
            goto L_0x0147
        L_0x0139:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r12.H0 = r2
            goto L_0x0147
        L_0x013e:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r12.H0 = r2
            goto L_0x0147
        L_0x0143:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r12.H0 = r2
        L_0x0147:
            int r2 = i.c.a.c.k.Chip_chipIconVisible
            boolean r2 = r1.getBoolean(r2, r13)
            r12.c((boolean) r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x016d
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x016d
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x016d
            int r4 = i.c.a.c.k.Chip_chipIconEnabled
            boolean r4 = r1.getBoolean(r4, r13)
            r12.c((boolean) r4)
        L_0x016d:
            android.content.Context r4 = r12.i0
            int r5 = i.c.a.c.k.Chip_chipIcon
            android.graphics.drawable.Drawable r4 = i.c.a.b.d.l.q.b((android.content.Context) r4, (android.content.res.TypedArray) r1, (int) r5)
            r12.c((android.graphics.drawable.Drawable) r4)
            int r4 = i.c.a.c.k.Chip_chipIconTint
            boolean r4 = r1.hasValue(r4)
            if (r4 == 0) goto L_0x018b
            android.content.Context r4 = r12.i0
            int r5 = i.c.a.c.k.Chip_chipIconTint
            android.content.res.ColorStateList r4 = i.c.a.b.d.l.q.a((android.content.Context) r4, (android.content.res.TypedArray) r1, (int) r5)
            r12.d((android.content.res.ColorStateList) r4)
        L_0x018b:
            int r4 = i.c.a.c.k.Chip_chipIconSize
            float r4 = r1.getDimension(r4, r3)
            r12.e((float) r4)
            int r4 = i.c.a.c.k.Chip_closeIconVisible
            boolean r4 = r1.getBoolean(r4, r13)
            r12.d((boolean) r4)
            if (r7 == 0) goto L_0x01b8
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01b8
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01b8
            int r4 = i.c.a.c.k.Chip_closeIconEnabled
            boolean r4 = r1.getBoolean(r4, r13)
            r12.d((boolean) r4)
        L_0x01b8:
            android.content.Context r4 = r12.i0
            int r5 = i.c.a.c.k.Chip_closeIcon
            android.graphics.drawable.Drawable r4 = i.c.a.b.d.l.q.b((android.content.Context) r4, (android.content.res.TypedArray) r1, (int) r5)
            r12.d((android.graphics.drawable.Drawable) r4)
            android.content.Context r4 = r12.i0
            int r5 = i.c.a.c.k.Chip_closeIconTint
            android.content.res.ColorStateList r4 = i.c.a.b.d.l.q.a((android.content.Context) r4, (android.content.res.TypedArray) r1, (int) r5)
            r12.f((android.content.res.ColorStateList) r4)
            int r4 = i.c.a.c.k.Chip_closeIconSize
            float r4 = r1.getDimension(r4, r3)
            r12.j(r4)
            int r4 = i.c.a.c.k.Chip_android_checkable
            boolean r4 = r1.getBoolean(r4, r13)
            r12.a((boolean) r4)
            int r4 = i.c.a.c.k.Chip_checkedIconVisible
            boolean r4 = r1.getBoolean(r4, r13)
            r12.b((boolean) r4)
            if (r7 == 0) goto L_0x0204
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x0204
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x0204
            int r2 = i.c.a.c.k.Chip_checkedIconEnabled
            boolean r2 = r1.getBoolean(r2, r13)
            r12.b((boolean) r2)
        L_0x0204:
            android.content.Context r2 = r12.i0
            int r4 = i.c.a.c.k.Chip_checkedIcon
            android.graphics.drawable.Drawable r2 = i.c.a.b.d.l.q.b((android.content.Context) r2, (android.content.res.TypedArray) r1, (int) r4)
            r12.b((android.graphics.drawable.Drawable) r2)
            android.content.Context r2 = r12.i0
            int r4 = i.c.a.c.k.Chip_showMotionSpec
            i.c.a.c.l.g r2 = i.c.a.c.l.g.a(r2, r1, r4)
            r12.Y = r2
            android.content.Context r2 = r12.i0
            int r4 = i.c.a.c.k.Chip_hideMotionSpec
            i.c.a.c.l.g r2 = i.c.a.c.l.g.a(r2, r1, r4)
            r12.Z = r2
            int r2 = i.c.a.c.k.Chip_chipStartPadding
            float r2 = r1.getDimension(r2, r3)
            r12.g((float) r2)
            int r2 = i.c.a.c.k.Chip_iconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r12.m(r2)
            int r2 = i.c.a.c.k.Chip_iconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r12.l(r2)
            int r2 = i.c.a.c.k.Chip_textStartPadding
            float r2 = r1.getDimension(r2, r3)
            r12.o(r2)
            int r2 = i.c.a.c.k.Chip_textEndPadding
            float r2 = r1.getDimension(r2, r3)
            r12.n(r2)
            int r2 = i.c.a.c.k.Chip_closeIconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r12.k(r2)
            int r2 = i.c.a.c.k.Chip_closeIconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r12.i(r2)
            int r2 = i.c.a.c.k.Chip_chipEndPadding
            float r2 = r1.getDimension(r2, r3)
            r12.d((float) r2)
            int r2 = i.c.a.c.k.Chip_android_maxWidth
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r12.J0 = r2
            r1.recycle()
            int[] r3 = i.c.a.c.k.Chip
            int r5 = x
            int[] r6 = new int[r13]
            r1 = r9
            r2 = r16
            r4 = r17
            android.content.res.TypedArray r1 = i.c.a.c.z.i.b(r1, r2, r3, r4, r5, r6)
            int r2 = i.c.a.c.k.Chip_ensureMinTouchTargetSize
            boolean r2 = r1.getBoolean(r2, r13)
            r0.f606q = r2
            android.content.Context r2 = r14.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 48
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r11, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = i.c.a.c.k.Chip_chipMinTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.s = r2
            r1.recycle()
            r14.setChipDrawable(r12)
            float r1 = h.h.m.m.g(r14)
            r12.a((float) r1)
            int[] r3 = i.c.a.c.k.Chip
            int r5 = x
            int[] r6 = new int[r13]
            r1 = r9
            r2 = r16
            android.content.res.TypedArray r1 = i.c.a.c.z.i.b(r1, r2, r3, r4, r5, r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L_0x02e0
            int r2 = i.c.a.c.k.Chip_android_textColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r9, (android.content.res.TypedArray) r1, (int) r2)
            r14.setTextColor(r2)
        L_0x02e0:
            int r2 = i.c.a.c.k.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r14)
            r0.t = r1
            r14.e()
            if (r2 != 0) goto L_0x02fd
            i.c.a.c.t.a r1 = new i.c.a.c.t.a
            r1.<init>(r14)
            r14.setOutlineProvider(r1)
        L_0x02fd:
            boolean r1 = r0.f602m
            r14.setChecked(r1)
            java.lang.CharSequence r1 = r12.J
            r14.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r12.H0
            r14.setEllipsize(r1)
            r14.setIncludeFontPadding(r13)
            r14.i()
            i.c.a.c.t.b r1 = r0.f597h
            boolean r1 = r1.I0
            if (r1 != 0) goto L_0x031e
            r14.setLines(r11)
            r14.setHorizontallyScrolling(r11)
        L_0x031e:
            r14.setGravity(r10)
            r14.h()
            boolean r1 = r0.f606q
            if (r1 == 0) goto L_0x032d
            int r1 = r0.s
            r14.setMinHeight(r1)
        L_0x032d:
            int r1 = r14.getLayoutDirection()
            r0.r = r1
            return
        L_0x0334:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x033c:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0342:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0348:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x0350:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.b(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.c(z2);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.a(new i.c.a.c.b0.b(bVar.i0, i2));
        }
        i();
    }

    public boolean a(int i2) {
        this.s = i2;
        if (!this.f606q) {
            if (this.f598i != null) {
                d();
            } else {
                f();
            }
            return false;
        }
        int max = Math.max(0, i2 - ((int) this.f597h.E));
        int max2 = Math.max(0, i2 - this.f597h.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            int i4 = max > 0 ? max / 2 : 0;
            if (this.f598i != null) {
                Rect rect = new Rect();
                this.f598i.getPadding(rect);
                if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                    f();
                    return true;
                }
            }
            if (getMinHeight() != i2) {
                setMinHeight(i2);
            }
            if (getMinWidth() != i2) {
                setMinWidth(i2);
            }
            this.f598i = new InsetDrawable(this.f597h, i3, i4, i3, i4);
            f();
            return true;
        }
        if (this.f598i != null) {
            d();
        } else {
            f();
        }
        return false;
    }

    public class b extends h.j.b.a {
        public b(Chip chip) {
            super(chip);
        }

        public void a(List<Integer> list) {
            boolean z = false;
            list.add(0);
            if (Chip.this.b()) {
                i.c.a.c.t.b bVar = Chip.this.f597h;
                if (bVar != null && bVar.P) {
                    z = true;
                }
                if (z && Chip.this.f600k != null) {
                    list.add(1);
                }
            }
        }

        public void a(int i2, h.h.m.w.b bVar) {
            CharSequence charSequence = "";
            if (i2 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    bVar.a.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i3 = i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    bVar.a.setContentDescription(context.getString(i3, objArr).trim());
                }
                bVar.a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                bVar.a(b.a.e);
                bVar.a.setEnabled(Chip.this.isEnabled());
                return;
            }
            bVar.a.setContentDescription(charSequence);
            bVar.a.setBoundsInParent(Chip.y);
        }

        public boolean a(int i2, int i3, Bundle bundle) {
            boolean z = false;
            if (i3 == 16) {
                if (i2 == 0) {
                    return Chip.this.performClick();
                }
                if (i2 == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f600k;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.t.a(1, 1);
                }
            }
            return z;
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        i.c.a.c.t.b bVar = this.f597h;
        if (bVar != null) {
            bVar.a(new i.c.a.c.b0.b(bVar.i0, i2));
        }
        i();
    }
}
