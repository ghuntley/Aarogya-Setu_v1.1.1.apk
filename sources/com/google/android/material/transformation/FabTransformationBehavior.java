package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i.c.a.c.l.g;
import i.c.a.c.l.h;
import i.c.a.c.l.i;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c = new Rect();
    public final RectF d = new RectF();
    public final RectF e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f682f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public float f683g;

    /* renamed from: h  reason: collision with root package name */
    public float f684h;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f685b;
        public final /* synthetic */ View c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.f685b = view;
            this.c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.f685b.setVisibility(4);
                this.c.setAlpha(1.0f);
                this.c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.f685b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    public static class b {
        public g a;

        /* renamed from: b  reason: collision with root package name */
        public i f686b;
    }

    public FabTransformationBehavior() {
    }

    public final float a(b bVar, h hVar, float f2, float f3) {
        long j2 = hVar.a;
        long j3 = hVar.f4152b;
        h a2 = bVar.a.a("expansion");
        return i.c.a.c.l.a.a(f2, f3, hVar.a().getInterpolation(((float) (((a2.a + a2.f4152b) + 17) - j2)) / ((float) j3)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x03f2 A[LOOP:1: B:112:0x03f0->B:113:0x03f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0373  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet b(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            android.content.Context r4 = r29.getContext()
            if (r3 == 0) goto L_0x0011
            int r5 = i.c.a.c.a.mtrl_fab_transformation_sheet_expand_spec
            goto L_0x0013
        L_0x0011:
            int r5 = i.c.a.c.a.mtrl_fab_transformation_sheet_collapse_spec
        L_0x0013:
            com.google.android.material.transformation.FabTransformationBehavior$b r6 = new com.google.android.material.transformation.FabTransformationBehavior$b
            r6.<init>()
            i.c.a.c.l.g r4 = i.c.a.c.l.g.a(r4, r5)
            r6.a = r4
            i.c.a.c.l.i r4 = new i.c.a.c.l.i
            r5 = 17
            r7 = 0
            r4.<init>(r5, r7, r7)
            r6.f686b = r4
            if (r3 == 0) goto L_0x0036
            float r4 = r28.getTranslationX()
            r0.f683g = r4
            float r4 = r28.getTranslationY()
            r0.f684h = r4
        L_0x0036:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            float r8 = h.h.m.m.g(r29)
            float r9 = r28.getElevation()
            float r8 = r8 - r9
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x005e
            if (r31 != 0) goto L_0x0053
            float r8 = -r8
            r2.setTranslationZ(r8)
        L_0x0053:
            android.util.Property r8 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r7
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
            goto L_0x0069
        L_0x005e:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r8 = -r8
            r12[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0069:
            i.c.a.c.l.g r11 = r6.a
            java.lang.String r12 = "elevation"
            i.c.a.c.l.h r11 = r11.a((java.lang.String) r12)
            r11.a(r8)
            r4.add(r8)
            android.graphics.RectF r8 = r0.d
            i.c.a.c.l.i r11 = r6.f686b
            float r11 = r0.a((android.view.View) r1, (android.view.View) r2, (i.c.a.c.l.i) r11)
            i.c.a.c.l.i r12 = r6.f686b
            float r12 = r0.b(r1, r2, r12)
            android.util.Pair r13 = r0.a((float) r11, (float) r12, (boolean) r3, (com.google.android.material.transformation.FabTransformationBehavior.b) r6)
            java.lang.Object r14 = r13.first
            i.c.a.c.l.h r14 = (i.c.a.c.l.h) r14
            java.lang.Object r13 = r13.second
            i.c.a.c.l.h r13 = (i.c.a.c.l.h) r13
            if (r3 == 0) goto L_0x00db
            if (r31 != 0) goto L_0x009d
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x009d:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r5
            float[] r5 = new float[r9]
            r5[r10] = r7
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r15, r5)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r5
            float[] r5 = new float[r9]
            r5[r10] = r7
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r15, r5)
            float r11 = -r11
            float r12 = -r12
            float r11 = r0.a((com.google.android.material.transformation.FabTransformationBehavior.b) r6, (i.c.a.c.l.h) r14, (float) r11, (float) r7)
            float r12 = r0.a((com.google.android.material.transformation.FabTransformationBehavior.b) r6, (i.c.a.c.l.h) r13, (float) r12, (float) r7)
            android.graphics.Rect r15 = r0.c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r7 = r0.d
            r7.set(r15)
            android.graphics.RectF r15 = r0.e
            r0.a(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r7)
            r8.set(r15)
            r7 = r5
            r5 = r17
            goto L_0x00f3
        L_0x00db:
            r16 = r5
            android.util.Property r5 = android.view.View.TRANSLATION_X
            float[] r7 = new float[r9]
            float r11 = -r11
            r7[r10] = r11
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r5, r7)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
        L_0x00f3:
            r14.a(r5)
            r13.a(r7)
            r4.add(r5)
            r4.add(r7)
            float r5 = r8.width()
            float r7 = r8.height()
            i.c.a.c.l.i r8 = r6.f686b
            float r8 = r0.a((android.view.View) r1, (android.view.View) r2, (i.c.a.c.l.i) r8)
            i.c.a.c.l.i r11 = r6.f686b
            float r11 = r0.b(r1, r2, r11)
            android.util.Pair r12 = r0.a((float) r8, (float) r11, (boolean) r3, (com.google.android.material.transformation.FabTransformationBehavior.b) r6)
            java.lang.Object r13 = r12.first
            i.c.a.c.l.h r13 = (i.c.a.c.l.h) r13
            java.lang.Object r12 = r12.second
            i.c.a.c.l.h r12 = (i.c.a.c.l.h) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            float r8 = r0.f683g
        L_0x0128:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            float r11 = r0.f684h
        L_0x0137:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.a(r8)
            r12.a(r11)
            r4.add(r8)
            r4.add(r11)
            boolean r8 = r2 instanceof i.c.a.c.u.c
            if (r8 == 0) goto L_0x01a1
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x0152
            goto L_0x01a1
        L_0x0152:
            r11 = r2
            i.c.a.c.u.c r11 = (i.c.a.c.u.c) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x015f
            goto L_0x01a1
        L_0x015f:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0176
            if (r31 != 0) goto L_0x016b
            r12.setAlpha(r13)
        L_0x016b:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r13 = i.c.a.c.l.d.f4149b
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x0180
        L_0x0176:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = i.c.a.c.l.d.f4149b
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x0180:
            i.c.a.c.k0.a r14 = new i.c.a.c.k0.a
            r14.<init>(r0, r2)
            r13.addUpdateListener(r14)
            i.c.a.c.l.g r14 = r6.a
            java.lang.String r15 = "iconFade"
            i.c.a.c.l.h r14 = r14.a((java.lang.String) r15)
            r14.a(r13)
            r4.add(r13)
            i.c.a.c.k0.b r13 = new i.c.a.c.k0.b
            r13.<init>(r0, r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x01a3
        L_0x01a1:
            r11 = r16
        L_0x01a3:
            if (r8 != 0) goto L_0x01ad
            r1 = r4
            r19 = r6
            r18 = r8
            r3 = r11
            goto L_0x0312
        L_0x01ad:
            r12 = r2
            i.c.a.c.u.c r12 = (i.c.a.c.u.c) r12
            i.c.a.c.l.i r13 = r6.f686b
            android.graphics.RectF r14 = r0.d
            android.graphics.RectF r15 = r0.e
            r0.a(r1, r14)
            float r10 = r0.f683g
            float r9 = r0.f684h
            r14.offset(r10, r9)
            r0.a(r2, r15)
            float r9 = r0.a((android.view.View) r1, (android.view.View) r2, (i.c.a.c.l.i) r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            i.c.a.c.l.i r10 = r6.f686b
            android.graphics.RectF r13 = r0.d
            android.graphics.RectF r14 = r0.e
            r0.a(r1, r13)
            float r15 = r0.f683g
            r18 = r8
            float r8 = r0.f684h
            r13.offset(r15, r8)
            r0.a(r2, r14)
            float r8 = r0.b(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.c
            r10.a((android.graphics.Rect) r13)
            android.graphics.Rect r10 = r0.c
            int r10 = r10.width()
            float r10 = (float) r10
            r13 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r13
            i.c.a.c.l.g r13 = r6.a
            java.lang.String r14 = "expansion"
            i.c.a.c.l.h r13 = r13.a((java.lang.String) r14)
            if (r3 == 0) goto L_0x0282
            if (r31 != 0) goto L_0x021e
            i.c.a.c.u.c$e r14 = new i.c.a.c.u.c$e
            r14.<init>(r9, r8, r10)
            r12.setRevealInfo(r14)
        L_0x021e:
            if (r31 == 0) goto L_0x0226
            i.c.a.c.u.c$e r10 = r12.getRevealInfo()
            float r10 = r10.c
        L_0x0226:
            r14 = 0
            float r15 = i.c.a.b.d.l.q.a((float) r9, (float) r8, (float) r14, (float) r14)
            float r21 = i.c.a.b.d.l.q.a((float) r9, (float) r8, (float) r5, (float) r14)
            float r5 = i.c.a.b.d.l.q.a((float) r9, (float) r8, (float) r5, (float) r7)
            float r7 = i.c.a.b.d.l.q.a((float) r9, (float) r8, (float) r14, (float) r7)
            int r14 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            if (r14 <= 0) goto L_0x0244
            int r14 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0244
            int r14 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0244
            goto L_0x0256
        L_0x0244:
            int r14 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x024f
            int r14 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x024f
            r15 = r21
            goto L_0x0256
        L_0x024f:
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0255
            r15 = r5
            goto L_0x0256
        L_0x0255:
            r15 = r7
        L_0x0256:
            android.animation.Animator r5 = i.c.a.b.d.l.q.a((i.c.a.c.u.c) r12, (float) r9, (float) r8, (float) r15)
            i.c.a.c.k0.c r7 = new i.c.a.c.k0.c
            r7.<init>(r0, r12)
            r5.addListener(r7)
            long r14 = r13.a
            int r7 = (int) r9
            int r8 = (int) r8
            r0 = 0
            int r9 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0279
            android.animation.Animator r7 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r10, r10)
            r7.setStartDelay(r0)
            r7.setDuration(r14)
            r4.add(r7)
        L_0x0279:
            r1 = r4
            r19 = r6
            r22 = r11
            r23 = r12
            goto L_0x0300
        L_0x0282:
            i.c.a.c.u.c$e r0 = r12.getRevealInfo()
            float r0 = r0.c
            android.animation.Animator r5 = i.c.a.b.d.l.q.a((i.c.a.c.u.c) r12, (float) r9, (float) r8, (float) r10)
            long r14 = r13.a
            int r1 = (int) r9
            int r7 = (int) r8
            r8 = 0
            int r19 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x02a3
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r0, r0)
            r0.setStartDelay(r8)
            r0.setDuration(r14)
            r4.add(r0)
        L_0x02a3:
            long r14 = r13.a
            long r8 = r13.f4152b
            i.c.a.c.l.g r0 = r6.a
            r21 = r5
            h.e.h<java.lang.String, i.c.a.c.l.h> r5 = r0.a
            int r5 = r5.f1570g
            r19 = r6
            r22 = r11
            r23 = r12
            r6 = 0
            r11 = 0
        L_0x02b8:
            if (r6 >= r5) goto L_0x02e0
            r20 = r5
            h.e.h<java.lang.String, i.c.a.c.l.h> r5 = r0.a
            java.lang.Object r5 = r5.e(r6)
            i.c.a.c.l.h r5 = (i.c.a.c.l.h) r5
            r24 = r4
            long r3 = r5.a
            r26 = r0
            r25 = r1
            long r0 = r5.f4152b
            long r3 = r3 + r0
            long r11 = java.lang.Math.max(r11, r3)
            int r6 = r6 + 1
            r3 = r30
            r5 = r20
            r4 = r24
            r1 = r25
            r0 = r26
            goto L_0x02b8
        L_0x02e0:
            r25 = r1
            r24 = r4
            long r14 = r14 + r8
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02fc
            r0 = r25
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r0, r7, r10, r10)
            r0.setStartDelay(r14)
            long r11 = r11 - r14
            r0.setDuration(r11)
            r1 = r24
            r1.add(r0)
            goto L_0x02fe
        L_0x02fc:
            r1 = r24
        L_0x02fe:
            r5 = r21
        L_0x0300:
            r13.a(r5)
            r1.add(r5)
            i.c.a.c.u.a r0 = new i.c.a.c.u.a
            r3 = r23
            r0.<init>(r3)
            r3 = r22
            r3.add(r0)
        L_0x0312:
            if (r18 != 0) goto L_0x0319
            r6 = r30
            r4 = r19
            goto L_0x036b
        L_0x0319:
            r0 = r2
            i.c.a.c.u.c r0 = (i.c.a.c.u.c) r0
            android.content.res.ColorStateList r4 = r28.getBackgroundTintList()
            if (r4 == 0) goto L_0x032f
            int[] r5 = r28.getDrawableState()
            int r6 = r4.getDefaultColor()
            int r4 = r4.getColorForState(r5, r6)
            goto L_0x0330
        L_0x032f:
            r4 = 0
        L_0x0330:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = r30
            if (r6 == 0) goto L_0x034a
            if (r31 != 0) goto L_0x033d
            r0.setCircularRevealScrimColor(r4)
        L_0x033d:
            android.util.Property<i.c.a.c.u.c, java.lang.Integer> r4 = i.c.a.c.u.c.d.a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
            goto L_0x0356
        L_0x034a:
            r7 = 1
            r9 = 0
            android.util.Property<i.c.a.c.u.c, java.lang.Integer> r5 = i.c.a.c.u.c.d.a
            int[] r8 = new int[r7]
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r8)
        L_0x0356:
            i.c.a.c.l.b r4 = i.c.a.c.l.b.a
            r0.setEvaluator(r4)
            r4 = r19
            i.c.a.c.l.g r5 = r4.a
            java.lang.String r7 = "color"
            i.c.a.c.l.h r5 = r5.a((java.lang.String) r7)
            r5.a(r0)
            r1.add(r0)
        L_0x036b:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0373
            r10 = 0
            r5 = r27
            goto L_0x03da
        L_0x0373:
            int r0 = i.c.a.c.f.mtrl_child_content_container
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x0382
            r5 = r27
            android.view.ViewGroup r0 = r5.a((android.view.View) r0)
            goto L_0x039e
        L_0x0382:
            r5 = r27
            boolean r0 = r2 instanceof i.c.a.c.k0.e
            if (r0 != 0) goto L_0x0392
            boolean r0 = r2 instanceof i.c.a.c.k0.d
            if (r0 == 0) goto L_0x038d
            goto L_0x0392
        L_0x038d:
            android.view.ViewGroup r0 = r5.a((android.view.View) r2)
            goto L_0x039e
        L_0x0392:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = 0
            android.view.View r0 = r0.getChildAt(r7)
            android.view.ViewGroup r0 = r5.a((android.view.View) r0)
        L_0x039e:
            if (r0 != 0) goto L_0x03a2
            r10 = 0
            goto L_0x03da
        L_0x03a2:
            if (r6 == 0) goto L_0x03bf
            if (r31 != 0) goto L_0x03b0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = i.c.a.c.l.c.a
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7.set(r0, r8)
        L_0x03b0:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = i.c.a.c.l.c.a
            r8 = 1
            float[] r8 = new float[r8]
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
            goto L_0x03cc
        L_0x03bf:
            r8 = 1
            r10 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = i.c.a.c.l.c.a
            float[] r8 = new float[r8]
            r9 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
        L_0x03cc:
            i.c.a.c.l.g r4 = r4.a
            java.lang.String r7 = "contentFade"
            i.c.a.c.l.h r4 = r4.a((java.lang.String) r7)
            r4.a(r0)
            r1.add(r0)
        L_0x03da:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            i.c.a.b.d.l.q.a((android.animation.AnimatorSet) r0, (java.util.List<android.animation.Animator>) r1)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r28
            r1.<init>(r5, r6, r2, r4)
            r0.addListener(r1)
            int r1 = r3.size()
        L_0x03f0:
            if (r10 >= r1) goto L_0x03fe
            java.lang.Object r2 = r3.get(r10)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r10 = r10 + 1
            goto L_0x03f0
        L_0x03fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public void a(CoordinatorLayout.f fVar) {
        if (fVar.f197h == 0) {
            fVar.f197h = 80;
        }
    }

    public final Pair<h, h> a(float f2, float f3, boolean z, b bVar) {
        h hVar;
        h hVar2;
        int i2;
        if (f2 == 0.0f || f3 == 0.0f) {
            hVar2 = bVar.a.a("translationXLinear");
            hVar = bVar.a.a("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || i2 <= 0)) {
            hVar2 = bVar.a.a("translationXCurveDownwards");
            hVar = bVar.a.a("translationYCurveDownwards");
        } else {
            hVar2 = bVar.a.a("translationXCurveUpwards");
            hVar = bVar.a.a("translationYCurveUpwards");
        }
        return new Pair<>(hVar2, hVar);
    }

    public final float a(View view, View view2, i iVar) {
        float f2;
        float f3;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        rectF.offset(this.f683g, this.f684h);
        a(view2, rectF2);
        float f4 = 0.0f;
        int i2 = iVar.a & 7;
        if (i2 == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i2 != 3) {
            if (i2 == 5) {
                f3 = rectF2.right;
                f2 = rectF.right;
            }
            return f4 + iVar.f4153b;
        } else {
            f3 = rectF2.left;
            f2 = rectF.left;
        }
        f4 = f3 - f2;
        return f4 + iVar.f4153b;
    }

    public final void a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f682f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public final ViewGroup a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public final float b(View view, View view2, i iVar) {
        float f2;
        float f3;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        rectF.offset(this.f683g, this.f684h);
        a(view2, rectF2);
        float f4 = 0.0f;
        int i2 = iVar.a & 112;
        if (i2 == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i2 != 48) {
            if (i2 == 80) {
                f3 = rectF2.bottom;
                f2 = rectF.bottom;
            }
            return f4 + iVar.c;
        } else {
            f3 = rectF2.top;
            f2 = rectF.top;
        }
        f4 = f3 - f2;
        return f4 + iVar.c;
    }
}
