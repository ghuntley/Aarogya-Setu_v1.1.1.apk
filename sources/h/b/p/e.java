package h.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import h.h.m.m;

/* compiled from: AppCompatBackgroundHelper */
public class e {
    public final View a;

    /* renamed from: b  reason: collision with root package name */
    public final j f1381b;
    public int c = -1;
    public v0 d;
    public v0 e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f1382f;

    public e(View view) {
        this.a = view;
        this.f1381b = j.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[Catch:{ all -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.view.View r0 = r10.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = h.b.j.ViewBackgroundHelper
            r2 = 0
            h.b.p.x0 r0 = h.b.p.x0.a(r0, r11, r1, r12, r2)
            android.view.View r3 = r10.a
            android.content.Context r4 = r3.getContext()
            int[] r5 = h.b.j.ViewBackgroundHelper
            android.content.res.TypedArray r7 = r0.f1492b
            r9 = 0
            r6 = r11
            r8 = r12
            h.h.m.m.a(r3, r4, r5, r6, r7, r8, r9)
            int r11 = h.b.j.ViewBackgroundHelper_android_background     // Catch:{ all -> 0x0081 }
            boolean r11 = r0.f(r11)     // Catch:{ all -> 0x0081 }
            r12 = -1
            if (r11 == 0) goto L_0x0041
            int r11 = h.b.j.ViewBackgroundHelper_android_background     // Catch:{ all -> 0x0081 }
            int r11 = r0.f(r11, r12)     // Catch:{ all -> 0x0081 }
            r10.c = r11     // Catch:{ all -> 0x0081 }
            h.b.p.j r11 = r10.f1381b     // Catch:{ all -> 0x0081 }
            android.view.View r1 = r10.a     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0081 }
            int r3 = r10.c     // Catch:{ all -> 0x0081 }
            android.content.res.ColorStateList r11 = r11.b(r1, r3)     // Catch:{ all -> 0x0081 }
            if (r11 == 0) goto L_0x0041
            r10.a((android.content.res.ColorStateList) r11)     // Catch:{ all -> 0x0081 }
        L_0x0041:
            int r11 = h.b.j.ViewBackgroundHelper_backgroundTint     // Catch:{ all -> 0x0081 }
            boolean r11 = r0.f(r11)     // Catch:{ all -> 0x0081 }
            r1 = 1
            r3 = 21
            if (r11 == 0) goto L_0x0086
            android.view.View r11 = r10.a     // Catch:{ all -> 0x0081 }
            int r4 = h.b.j.ViewBackgroundHelper_backgroundTint     // Catch:{ all -> 0x0081 }
            android.content.res.ColorStateList r4 = r0.a(r4)     // Catch:{ all -> 0x0081 }
            r11.setBackgroundTintList(r4)     // Catch:{ all -> 0x0081 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0081 }
            if (r4 != r3) goto L_0x0086
            android.graphics.drawable.Drawable r4 = r11.getBackground()     // Catch:{ all -> 0x0081 }
            android.content.res.ColorStateList r5 = r11.getBackgroundTintList()     // Catch:{ all -> 0x0081 }
            if (r5 != 0) goto L_0x006e
            android.graphics.PorterDuff$Mode r5 = r11.getBackgroundTintMode()     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r5 = 0
            goto L_0x006f
        L_0x006e:
            r5 = 1
        L_0x006f:
            if (r4 == 0) goto L_0x0086
            if (r5 == 0) goto L_0x0086
            boolean r5 = r4.isStateful()     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x0083
            int[] r5 = r11.getDrawableState()     // Catch:{ all -> 0x0081 }
            r4.setState(r5)     // Catch:{ all -> 0x0081 }
            goto L_0x0083
        L_0x0081:
            r11 = move-exception
            goto L_0x00cd
        L_0x0083:
            r11.setBackground(r4)     // Catch:{ all -> 0x0081 }
        L_0x0086:
            int r11 = h.b.j.ViewBackgroundHelper_backgroundTintMode     // Catch:{ all -> 0x0081 }
            boolean r11 = r0.f(r11)     // Catch:{ all -> 0x0081 }
            if (r11 == 0) goto L_0x00c7
            android.view.View r11 = r10.a     // Catch:{ all -> 0x0081 }
            int r4 = h.b.j.ViewBackgroundHelper_backgroundTintMode     // Catch:{ all -> 0x0081 }
            int r12 = r0.d(r4, r12)     // Catch:{ all -> 0x0081 }
            r4 = 0
            android.graphics.PorterDuff$Mode r12 = h.b.p.e0.a(r12, r4)     // Catch:{ all -> 0x0081 }
            r11.setBackgroundTintMode(r12)     // Catch:{ all -> 0x0081 }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0081 }
            if (r12 != r3) goto L_0x00c7
            android.graphics.drawable.Drawable r12 = r11.getBackground()     // Catch:{ all -> 0x0081 }
            android.content.res.ColorStateList r3 = r11.getBackgroundTintList()     // Catch:{ all -> 0x0081 }
            if (r3 != 0) goto L_0x00b2
            android.graphics.PorterDuff$Mode r3 = r11.getBackgroundTintMode()     // Catch:{ all -> 0x0081 }
            if (r3 == 0) goto L_0x00b3
        L_0x00b2:
            r2 = 1
        L_0x00b3:
            if (r12 == 0) goto L_0x00c7
            if (r2 == 0) goto L_0x00c7
            boolean r1 = r12.isStateful()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x00c4
            int[] r1 = r11.getDrawableState()     // Catch:{ all -> 0x0081 }
            r12.setState(r1)     // Catch:{ all -> 0x0081 }
        L_0x00c4:
            r11.setBackground(r12)     // Catch:{ all -> 0x0081 }
        L_0x00c7:
            android.content.res.TypedArray r11 = r0.f1492b
            r11.recycle()
            return
        L_0x00cd:
            android.content.res.TypedArray r12 = r0.f1492b
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.e.a(android.util.AttributeSet, int):void");
    }

    public void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.a = colorStateList;
        v0Var.d = true;
        a();
    }

    public PorterDuff.Mode c() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.f1477b;
        }
        return null;
    }

    public void d() {
        this.c = -1;
        a((ColorStateList) null);
        a();
    }

    public ColorStateList b() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public void a(int i2) {
        this.c = i2;
        j jVar = this.f1381b;
        a(jVar != null ? jVar.b(this.a.getContext(), i2) : null);
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.f1477b = mode;
        v0Var.c = true;
        a();
    }

    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 ? i2 == 21 : this.d != null) {
                if (this.f1382f == null) {
                    this.f1382f = new v0();
                }
                v0 v0Var = this.f1382f;
                v0Var.a = null;
                v0Var.d = false;
                v0Var.f1477b = null;
                v0Var.c = false;
                ColorStateList d2 = m.d(this.a);
                if (d2 != null) {
                    v0Var.d = true;
                    v0Var.a = d2;
                }
                PorterDuff.Mode backgroundTintMode = this.a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    v0Var.c = true;
                    v0Var.f1477b = backgroundTintMode;
                }
                if (v0Var.d || v0Var.c) {
                    j.a(background, v0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.e;
            if (v0Var2 != null) {
                j.a(background, v0Var2, this.a.getDrawableState());
                return;
            }
            v0 v0Var3 = this.d;
            if (v0Var3 != null) {
                j.a(background, v0Var3, this.a.getDrawableState());
            }
        }
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new v0();
            }
            v0 v0Var = this.d;
            v0Var.a = colorStateList;
            v0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }
}
