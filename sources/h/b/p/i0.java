package h.b.p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import h.b.j;
import h.h.m.m;

/* compiled from: LinearLayoutCompat */
public class i0 extends ViewGroup {
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f1411f;

    /* renamed from: g  reason: collision with root package name */
    public int f1412g;

    /* renamed from: h  reason: collision with root package name */
    public int f1413h;

    /* renamed from: i  reason: collision with root package name */
    public int f1414i;

    /* renamed from: j  reason: collision with root package name */
    public int f1415j;

    /* renamed from: k  reason: collision with root package name */
    public float f1416k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1417l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f1418m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f1419n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f1420o;

    /* renamed from: p  reason: collision with root package name */
    public int f1421p;

    /* renamed from: q  reason: collision with root package name */
    public int f1422q;
    public int r;
    public int s;

    public i0(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a(Canvas canvas, int i2) {
        this.f1420o.setBounds(getPaddingLeft() + this.s, i2, (getWidth() - getPaddingRight()) - this.s, this.f1422q + i2);
        this.f1420o.draw(canvas);
    }

    public void b(Canvas canvas, int i2) {
        this.f1420o.setBounds(i2, getPaddingTop() + this.s, this.f1421p + i2, (getHeight() - getPaddingBottom()) - this.s);
        this.f1420o.draw(canvas);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public int getBaseline() {
        int i2;
        if (this.f1411f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1411f;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f1412g;
                if (this.f1413h == 1 && (i2 = this.f1414i & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1415j) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1415j;
                    }
                }
                return i4 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1411f == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1411f;
    }

    public Drawable getDividerDrawable() {
        return this.f1420o;
    }

    public int getDividerPadding() {
        return this.s;
    }

    public int getDividerWidth() {
        return this.f1421p;
    }

    public int getGravity() {
        return this.f1414i;
    }

    public int getOrientation() {
        return this.f1413h;
    }

    public int getShowDividers() {
        return this.r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1416k;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f1420o != null) {
            int i7 = 0;
            if (this.f1413h == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i7 < virtualChildCount) {
                    View childAt = getChildAt(i7);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !a(i7))) {
                        a(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.f1422q);
                    }
                    i7++;
                }
                if (a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i6 = (getHeight() - getPaddingBottom()) - this.f1422q;
                    } else {
                        i6 = childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    a(canvas, i6);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = d1.a(this);
            while (i7 < virtualChildCount2) {
                View childAt3 = getChildAt(i7);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !a(i7))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (a2) {
                        i5 = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        i5 = (childAt3.getLeft() - aVar.leftMargin) - this.f1421p;
                    }
                    b(canvas, i5);
                }
                i7++;
            }
            if (a(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a2) {
                        i4 = childAt4.getLeft() - aVar2.leftMargin;
                        i3 = this.f1421p;
                    } else {
                        i2 = childAt4.getRight() + aVar2.rightMargin;
                        b(canvas, i2);
                    }
                } else if (a2) {
                    i2 = getPaddingLeft();
                    b(canvas, i2);
                } else {
                    i4 = getWidth() - getPaddingRight();
                    i3 = this.f1421p;
                }
                i2 = i4 - i3;
                b(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.f1413h
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r8 = 1
            if (r1 != r8) goto L_0x00b9
            int r1 = r24.getPaddingLeft()
            int r10 = r28 - r26
            int r11 = r24.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r24.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r24.getVirtualChildCount()
            int r13 = r0.f1414i
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r24.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r24.getPaddingTop()
            int r2 = r2 + r29
            int r2 = r2 - r27
            int r3 = r0.f1415j
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r24.getPaddingTop()
            int r3 = r29 - r27
            int r13 = r0.f1415j
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d1
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b3
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b3
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            h.b.p.i0$a r4 = (h.b.p.i0.a) r4
            int r9 = r4.f1423b
            if (r9 >= 0) goto L_0x0074
            r9 = r6
        L_0x0074:
            int r7 = h.h.m.m.k(r24)
            int r7 = android.view.Gravity.getAbsoluteGravity(r9, r7)
            r7 = r7 & 7
            if (r7 == r8) goto L_0x008b
            if (r7 == r5) goto L_0x0086
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0096
        L_0x0086:
            int r7 = r11 - r14
            int r9 = r4.rightMargin
            goto L_0x0095
        L_0x008b:
            int r7 = r10 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r1
            int r9 = r4.leftMargin
            int r7 = r7 + r9
            int r9 = r4.rightMargin
        L_0x0095:
            int r7 = r7 - r9
        L_0x0096:
            boolean r9 = r0.a(r3)
            if (r9 == 0) goto L_0x009f
            int r9 = r0.f1422q
            int r2 = r2 + r9
        L_0x009f:
            int r9 = r4.topMargin
            int r2 = r2 + r9
            int r9 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r9
            r13.layout(r7, r9, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b3:
            int r3 = r3 + r8
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00b9:
            boolean r1 = h.b.p.d1.a(r24)
            int r4 = r24.getPaddingTop()
            int r5 = r29 - r27
            int r7 = r24.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r9 = r24.getPaddingBottom()
            int r5 = r5 - r9
            int r9 = r24.getVirtualChildCount()
            int r10 = r0.f1414i
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.e
            int[] r12 = r0.f1418m
            int[] r13 = r0.f1419n
            int r14 = r24.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r8) goto L_0x00fc
            r14 = 5
            if (r6 == r14) goto L_0x00f0
            int r6 = r24.getPaddingLeft()
            goto L_0x0108
        L_0x00f0:
            int r6 = r24.getPaddingLeft()
            int r6 = r6 + r28
            int r6 = r6 - r26
            int r14 = r0.f1415j
            int r6 = r6 - r14
            goto L_0x0108
        L_0x00fc:
            int r6 = r24.getPaddingLeft()
            int r14 = r28 - r26
            int r15 = r0.f1415j
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x0108:
            if (r1 == 0) goto L_0x010e
            int r1 = r9 + -1
            r15 = -1
            goto L_0x0110
        L_0x010e:
            r1 = 0
            r15 = 1
        L_0x0110:
            r17 = r6
            r6 = 0
        L_0x0113:
            if (r6 >= r9) goto L_0x01d1
            int r18 = r15 * r6
            int r8 = r18 + r1
            android.view.View r2 = r0.getChildAt(r8)
            if (r2 != 0) goto L_0x012b
            int r17 = r17 + 0
        L_0x0121:
            r27 = r1
            r29 = r9
            r21 = r10
            r1 = 0
        L_0x0128:
            r2 = 1
            goto L_0x01c3
        L_0x012b:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0121
            int r3 = r2.getMeasuredWidth()
            int r20 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r21 = r2.getLayoutParams()
            r14 = r21
            h.b.p.i0$a r14 = (h.b.p.i0.a) r14
            if (r11 == 0) goto L_0x0153
            r27 = r1
            int r1 = r14.height
            r29 = r9
            r9 = -1
            if (r1 == r9) goto L_0x0157
            int r9 = r2.getBaseline()
            goto L_0x0158
        L_0x0153:
            r27 = r1
            r29 = r9
        L_0x0157:
            r9 = -1
        L_0x0158:
            int r1 = r14.f1423b
            if (r1 >= 0) goto L_0x015d
            r1 = r10
        L_0x015d:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r21 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0195
            r10 = 48
            if (r1 == r10) goto L_0x0186
            r10 = 80
            if (r1 == r10) goto L_0x0170
            r1 = r4
            r10 = -1
            goto L_0x01a1
        L_0x0170:
            int r1 = r7 - r20
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r9 == r10) goto L_0x01a1
            int r22 = r2.getMeasuredHeight()
            int r22 = r22 - r9
            r9 = 2
            r23 = r13[r9]
            int r23 = r23 - r22
            int r1 = r1 - r23
            goto L_0x01a1
        L_0x0186:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r9 == r10) goto L_0x01a1
            r19 = 1
            r22 = r12[r19]
            int r22 = r22 - r9
            int r1 = r22 + r1
            goto L_0x01a1
        L_0x0195:
            r10 = -1
            int r1 = r5 - r20
            r9 = 2
            int r1 = r1 / r9
            int r1 = r1 + r4
            int r9 = r14.topMargin
            int r1 = r1 + r9
            int r9 = r14.bottomMargin
            int r1 = r1 - r9
        L_0x01a1:
            boolean r8 = r0.a(r8)
            if (r8 == 0) goto L_0x01ab
            int r8 = r0.f1421p
            int r17 = r17 + r8
        L_0x01ab:
            int r8 = r14.leftMargin
            int r17 = r17 + r8
            int r8 = r17 + 0
            int r9 = r3 + r8
            int r10 = r20 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r17 = r3 + r17
            int r6 = r6 + 0
            goto L_0x0128
        L_0x01c3:
            int r6 = r6 + r2
            r1 = r27
            r9 = r29
            r10 = r21
            r2 = 80
            r3 = 16
            r8 = 1
            goto L_0x0113
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.i0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07f6, code lost:
        if (r13[3] != -1) goto L_0x07fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0688  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0795  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x07f3  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x07f9  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0852  */
    /* JADX WARNING: Removed duplicated region for block: B:405:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.f1413h
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x0364
            r6.f1415j = r4
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.f1411f
            boolean r9 = r6.f1417l
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x0039:
            if (r14 >= r3) goto L_0x017e
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x0047
            int r5 = r6.f1415j
            int r5 = r5 + r4
            r6.f1415j = r5
            goto L_0x004f
        L_0x0047:
            int r5 = r26.getVisibility()
            if (r5 != r12) goto L_0x005b
            int r14 = r14 + 0
        L_0x004f:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r12 = r19
            r27 = 1
            goto L_0x0168
        L_0x005b:
            boolean r5 = r6.a(r14)
            if (r5 == 0) goto L_0x0068
            int r5 = r6.f1415j
            int r4 = r6.f1422q
            int r5 = r5 + r4
            r6.f1415j = r5
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            h.b.p.i0$a r5 = (h.b.p.i0.a) r5
            float r4 = r5.a
            float r22 = r22 + r4
            if (r1 != r15) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0097
            int r4 = r6.f1415j
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.f1415j = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto L_0x00f0
        L_0x0097:
            int r4 = r5.height
            if (r4 != 0) goto L_0x00a5
            float r4 = r5.a
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a5
            r5.height = r10
            r12 = 0
            goto L_0x00a7
        L_0x00a5:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a7:
            r4 = 0
            int r15 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00b0
            int r15 = r6.f1415j
            r10 = r0
            goto L_0x00b2
        L_0x00b0:
            r10 = r0
            r15 = 0
        L_0x00b2:
            r0 = r37
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r38
            r31 = r3
            r3 = r4
            r13 = 0
            r4 = r39
            r13 = r5
            r27 = 1
            r5 = r15
            r0.a(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00cd
            r13.height = r12
        L_0x00cd:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f1415j
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f1415j = r1
            if (r9 == 0) goto L_0x00ec
            r4 = r17
            int r17 = java.lang.Math.max(r0, r4)
            goto L_0x00ee
        L_0x00ec:
            r4 = r17
        L_0x00ee:
            r5 = r23
        L_0x00f0:
            if (r10 < 0) goto L_0x00fa
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00fa
            int r0 = r6.f1415j
            r6.f1412g = r0
        L_0x00fa:
            if (r14 >= r10) goto L_0x010c
            float r0 = r13.a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0104
            goto L_0x010c
        L_0x0104:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x010c:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x011b
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x011b
            r1 = 1
            r25 = 1
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r21
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r19
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r24 == 0) goto L_0x013f
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L_0x013f
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            float r13 = r13.a
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x0152
            if (r1 == 0) goto L_0x014a
            goto L_0x014b
        L_0x014a:
            r2 = r3
        L_0x014b:
            r13 = r20
            int r20 = java.lang.Math.max(r13, r2)
            goto L_0x0160
        L_0x0152:
            r13 = r20
            if (r1 == 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r2 = r3
        L_0x0158:
            r1 = r18
            int r18 = java.lang.Math.max(r1, r2)
            r20 = r13
        L_0x0160:
            int r14 = r14 + 0
            r21 = r4
            r23 = r5
            r24 = r11
        L_0x0168:
            int r14 = r14 + 1
            r2 = r0
            r0 = r10
            r19 = r12
            r1 = r29
            r3 = r31
            r4 = 0
            r5 = 1
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x017e:
            r29 = r1
            r0 = r2
            r31 = r3
            r4 = r17
            r1 = r18
            r15 = r19
            r13 = r20
            r12 = r21
            r27 = 1
            int r2 = r6.f1415j
            if (r2 <= 0) goto L_0x01a3
            r2 = r31
            boolean r3 = r6.a(r2)
            if (r3 == 0) goto L_0x01a5
            int r3 = r6.f1415j
            int r5 = r6.f1422q
            int r3 = r3 + r5
            r6.f1415j = r3
            goto L_0x01a5
        L_0x01a3:
            r2 = r31
        L_0x01a5:
            r3 = r29
            if (r9 == 0) goto L_0x01eb
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L_0x01af
            if (r3 != 0) goto L_0x01eb
        L_0x01af:
            r5 = 0
            r6.f1415j = r5
            r10 = 0
        L_0x01b3:
            if (r10 >= r2) goto L_0x01eb
            android.view.View r11 = r6.getChildAt(r10)
            if (r11 != 0) goto L_0x01c1
            int r11 = r6.f1415j
            int r11 = r11 + r5
            r6.f1415j = r11
            goto L_0x01e7
        L_0x01c1:
            int r5 = r11.getVisibility()
            r14 = 8
            if (r5 != r14) goto L_0x01cc
            int r10 = r10 + 0
            goto L_0x01e7
        L_0x01cc:
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
            h.b.p.i0$a r5 = (h.b.p.i0.a) r5
            int r11 = r6.f1415j
            int r17 = r11 + r4
            int r14 = r5.topMargin
            int r17 = r17 + r14
            int r5 = r5.bottomMargin
            int r17 = r17 + r5
            r5 = 0
            int r14 = r17 + 0
            int r5 = java.lang.Math.max(r11, r14)
            r6.f1415j = r5
        L_0x01e7:
            int r10 = r10 + 1
            r5 = 0
            goto L_0x01b3
        L_0x01eb:
            int r5 = r6.f1415j
            int r10 = r37.getPaddingTop()
            int r11 = r37.getPaddingBottom()
            int r11 = r11 + r10
            int r11 = r11 + r5
            r6.f1415j = r11
            int r5 = r37.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r11, r5)
            r10 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r8, r10)
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r5
            int r11 = r6.f1415j
            int r10 = r10 - r11
            if (r23 != 0) goto L_0x0258
            if (r10 == 0) goto L_0x0217
            r11 = 0
            int r14 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x0217
            goto L_0x0258
        L_0x0217:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L_0x0254
            r9 = 1073741824(0x40000000, float:2.0)
            if (r3 == r9) goto L_0x0254
            r3 = 0
        L_0x0222:
            if (r3 >= r2) goto L_0x0254
            android.view.View r9 = r6.getChildAt(r3)
            if (r9 == 0) goto L_0x0251
            int r10 = r9.getVisibility()
            r11 = 8
            if (r10 != r11) goto L_0x0233
            goto L_0x0251
        L_0x0233:
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            h.b.p.i0$a r10 = (h.b.p.i0.a) r10
            float r10 = r10.a
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0251
            int r10 = r9.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r9.measure(r10, r13)
        L_0x0251:
            int r3 = r3 + 1
            goto L_0x0222
        L_0x0254:
            r21 = r12
            goto L_0x033b
        L_0x0258:
            float r4 = r6.f1416k
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0261
            r22 = r4
        L_0x0261:
            r4 = 0
            r6.f1415j = r4
            r4 = 0
        L_0x0265:
            if (r4 >= r2) goto L_0x032b
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x0277
            r29 = r3
            goto L_0x0325
        L_0x0277:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            h.b.p.i0$a r11 = (h.b.p.i0.a) r11
            float r13 = r11.a
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02da
            float r14 = (float) r10
            float r14 = r14 * r13
            float r14 = r14 / r22
            int r14 = (int) r14
            float r22 = r22 - r13
            int r10 = r10 - r14
            int r13 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r10
            int r10 = r11.width
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r10)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02bc
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 == r13) goto L_0x02b0
            goto L_0x02be
        L_0x02b0:
            if (r14 <= 0) goto L_0x02b3
            goto L_0x02b4
        L_0x02b3:
            r14 = 0
        L_0x02b4:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r10, r14)
            goto L_0x02ce
        L_0x02bc:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x02be:
            int r17 = r9.getMeasuredHeight()
            int r14 = r17 + r14
            if (r14 >= 0) goto L_0x02c7
            r14 = 0
        L_0x02c7:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r10, r14)
        L_0x02ce:
            int r10 = r9.getMeasuredState()
            r10 = r10 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r10)
            r10 = r16
        L_0x02da:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r29 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x02f7
            int r3 = r11.width
            r16 = r10
            r10 = -1
            if (r3 != r10) goto L_0x02fa
            r3 = 1
            goto L_0x02fb
        L_0x02f7:
            r16 = r10
            r10 = -1
        L_0x02fa:
            r3 = 0
        L_0x02fb:
            if (r3 == 0) goto L_0x02fe
            goto L_0x02ff
        L_0x02fe:
            r13 = r14
        L_0x02ff:
            int r1 = java.lang.Math.max(r1, r13)
            if (r24 == 0) goto L_0x030b
            int r3 = r11.width
            if (r3 != r10) goto L_0x030b
            r3 = 1
            goto L_0x030c
        L_0x030b:
            r3 = 0
        L_0x030c:
            int r10 = r6.f1415j
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r10
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            r11 = 0
            int r9 = r9 + r11
            int r9 = java.lang.Math.max(r10, r9)
            r6.f1415j = r9
            r24 = r3
            r10 = r16
        L_0x0325:
            int r4 = r4 + 1
            r3 = r29
            goto L_0x0265
        L_0x032b:
            int r3 = r6.f1415j
            int r4 = r37.getPaddingTop()
            int r9 = r37.getPaddingBottom()
            int r9 = r9 + r4
            int r9 = r9 + r3
            r6.f1415j = r9
            goto L_0x0254
        L_0x033b:
            if (r24 != 0) goto L_0x0342
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x0342
            goto L_0x0344
        L_0x0342:
            r1 = r21
        L_0x0344:
            int r0 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r3 = r3 + r0
            int r3 = r3 + r1
            int r0 = r37.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r5)
            if (r25 == 0) goto L_0x0859
            r6.b((int) r2, (int) r8)
            goto L_0x0859
        L_0x0364:
            r27 = 1
            r0 = 0
            r6.f1415j = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.f1418m
            r12 = 4
            if (r0 == 0) goto L_0x037e
            int[] r0 = r6.f1419n
            if (r0 != 0) goto L_0x0386
        L_0x037e:
            int[] r0 = new int[r12]
            r6.f1418m = r0
            int[] r0 = new int[r12]
            r6.f1419n = r0
        L_0x0386:
            int[] r13 = r6.f1418m
            int[] r14 = r6.f1419n
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.e
            boolean r4 = r6.f1417l
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03aa
            r18 = 1
            goto L_0x03ac
        L_0x03aa:
            r18 = 0
        L_0x03ac:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 1
            r24 = 0
        L_0x03b9:
            if (r3 >= r9) goto L_0x055d
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x03ce
            int r7 = r6.f1415j
            r25 = 0
            int r7 = r7 + 0
            r6.f1415j = r7
            r25 = r0
            r26 = r2
            goto L_0x03dc
        L_0x03ce:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x03e6
            int r3 = r3 + 0
        L_0x03dc:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x0553
        L_0x03e6:
            boolean r0 = r6.a(r3)
            if (r0 == 0) goto L_0x03f3
            int r0 = r6.f1415j
            int r2 = r6.f1421p
            int r0 = r0 + r2
            r6.f1415j = r0
        L_0x03f3:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            h.b.p.i0$a r2 = (h.b.p.i0.a) r2
            float r0 = r2.a
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0451
            int r1 = r2.width
            if (r1 != 0) goto L_0x0451
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0451
            if (r18 == 0) goto L_0x041a
            int r0 = r6.f1415j
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f1415j = r1
            goto L_0x042a
        L_0x041a:
            r30 = r3
            int r0 = r6.f1415j
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1415j = r0
        L_0x042a:
            if (r5 == 0) goto L_0x0441
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04ca
        L_0x0441:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r5 = 1
            goto L_0x04ce
        L_0x0451:
            r30 = r3
            int r0 = r2.width
            if (r0 != 0) goto L_0x0463
            float r0 = r2.a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0464
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x0466
        L_0x0463:
            r1 = 0
        L_0x0464:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0466:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x046f
            int r0 = r6.f1415j
            r31 = r0
            goto L_0x0471
        L_0x046f:
            r31 = 0
        L_0x0471:
            r32 = 0
            r1 = r25
            r0 = r37
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r38
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r39
            r30 = r5
            r5 = r32
            r0.a(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x049c
            r1 = r35
            r1.width = r0
            goto L_0x049e
        L_0x049c:
            r1 = r35
        L_0x049e:
            int r0 = r7.getMeasuredWidth()
            if (r18 == 0) goto L_0x04b2
            int r2 = r6.f1415j
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f1415j = r3
            goto L_0x04c4
        L_0x04b2:
            r4 = 0
            int r2 = r6.f1415j
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f1415j = r2
        L_0x04c4:
            if (r26 == 0) goto L_0x04ca
            int r8 = java.lang.Math.max(r0, r8)
        L_0x04ca:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04ce:
            if (r11 == r0) goto L_0x04d9
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x04d9
            r0 = 1
            r24 = 1
            goto L_0x04da
        L_0x04d9:
            r0 = 0
        L_0x04da:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r30 == 0) goto L_0x051c
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L_0x051c
            int r12 = r1.f1423b
            if (r12 >= 0) goto L_0x04fb
            int r12 = r6.f1414i
        L_0x04fb:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & -2
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L_0x051e
        L_0x051c:
            r22 = r2
        L_0x051e:
            r2 = r34
            int r2 = java.lang.Math.max(r2, r3)
            if (r23 == 0) goto L_0x052d
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L_0x052d
            r7 = 1
            goto L_0x052e
        L_0x052d:
            r7 = 0
        L_0x052e:
            float r1 = r1.a
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0540
            if (r0 == 0) goto L_0x0539
            r3 = r22
        L_0x0539:
            int r15 = java.lang.Math.max(r15, r3)
            r0 = r33
            goto L_0x054a
        L_0x0540:
            if (r0 == 0) goto L_0x0544
            r3 = r22
        L_0x0544:
            r0 = r33
            int r0 = java.lang.Math.max(r0, r3)
        L_0x054a:
            int r3 = r25 + 0
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r29
        L_0x0553:
            int r3 = r3 + 1
            r7 = r38
            r4 = r26
            r5 = r30
            goto L_0x03b9
        L_0x055d:
            r26 = r4
            r30 = r5
            int r3 = r6.f1415j
            if (r3 <= 0) goto L_0x0572
            boolean r3 = r6.a(r9)
            if (r3 == 0) goto L_0x0572
            int r3 = r6.f1415j
            int r4 = r6.f1421p
            int r3 = r3 + r4
            r6.f1415j = r3
        L_0x0572:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L_0x0589
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L_0x0589
            r3 = r13[r17]
            if (r3 != r4) goto L_0x0589
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L_0x0586
            goto L_0x058a
        L_0x0586:
            r25 = r12
            goto L_0x05bc
        L_0x0589:
            r3 = 3
        L_0x058a:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r17]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r17]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r2 = java.lang.Math.max(r2, r4)
        L_0x05bc:
            if (r26 == 0) goto L_0x060e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x05c4
            if (r10 != 0) goto L_0x060e
        L_0x05c4:
            r3 = 0
            r6.f1415j = r3
            r4 = 0
        L_0x05c8:
            if (r4 >= r9) goto L_0x060e
            android.view.View r5 = r6.getChildAt(r4)
            if (r5 != 0) goto L_0x05d6
            int r5 = r6.f1415j
            int r5 = r5 + r3
            r6.f1415j = r5
            goto L_0x060a
        L_0x05d6:
            int r3 = r5.getVisibility()
            r7 = 8
            if (r3 != r7) goto L_0x05e1
            int r4 = r4 + 0
            goto L_0x060a
        L_0x05e1:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            h.b.p.i0$a r3 = (h.b.p.i0.a) r3
            if (r18 == 0) goto L_0x05f7
            int r5 = r6.f1415j
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r12 = 0
            int r7 = r7 + r12
            int r7 = r7 + r5
            r6.f1415j = r7
            goto L_0x060a
        L_0x05f7:
            r12 = 0
            int r5 = r6.f1415j
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r5, r7)
            r6.f1415j = r3
        L_0x060a:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x05c8
        L_0x060e:
            int r3 = r6.f1415j
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f1415j = r5
            int r3 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r4 = r38
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r4, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r7 = r6.f1415j
            int r5 = r5 - r7
            if (r22 != 0) goto L_0x0681
            if (r5 == 0) goto L_0x063c
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x063c
            goto L_0x0681
        L_0x063c:
            int r0 = java.lang.Math.max(r0, r15)
            if (r26 == 0) goto L_0x0679
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x0679
            r1 = 0
        L_0x0647:
            if (r1 >= r9) goto L_0x0679
            android.view.View r5 = r6.getChildAt(r1)
            if (r5 == 0) goto L_0x0676
            int r10 = r5.getVisibility()
            r12 = 8
            if (r10 != r12) goto L_0x0658
            goto L_0x0676
        L_0x0658:
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            h.b.p.i0$a r10 = (h.b.p.i0.a) r10
            float r10 = r10.a
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0676
            r10 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r13 = r5.getMeasuredHeight()
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            r5.measure(r12, r13)
        L_0x0676:
            int r1 = r1 + 1
            goto L_0x0647
        L_0x0679:
            r8 = r39
            r22 = r9
            r12 = r25
            goto L_0x0829
        L_0x0681:
            float r2 = r6.f1416k
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0689
            r1 = r2
        L_0x0689:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r17] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r17] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.f1415j = r12
            r8 = r5
            r12 = r25
            r2 = -1
            r5 = 0
        L_0x06a3:
            if (r5 >= r9) goto L_0x07d3
            android.view.View r15 = r6.getChildAt(r5)
            if (r15 == 0) goto L_0x07be
            int r7 = r15.getVisibility()
            r4 = 8
            if (r7 != r4) goto L_0x06b5
            goto L_0x07be
        L_0x06b5:
            android.view.ViewGroup$LayoutParams r7 = r15.getLayoutParams()
            h.b.p.i0$a r7 = (h.b.p.i0.a) r7
            float r4 = r7.a
            r19 = 0
            int r22 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r22 <= 0) goto L_0x0721
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r4
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r4
            int r8 = r8 - r9
            int r4 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r4
            int r4 = r7.topMargin
            int r25 = r25 + r4
            int r4 = r7.bottomMargin
            int r4 = r25 + r4
            r25 = r1
            int r1 = r7.height
            r26 = r8
            r8 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r4, r1)
            int r4 = r7.width
            if (r4 != 0) goto L_0x06ff
            r4 = 1073741824(0x40000000, float:2.0)
            if (r10 == r4) goto L_0x06f3
            goto L_0x0701
        L_0x06f3:
            if (r9 <= 0) goto L_0x06f6
            goto L_0x06f7
        L_0x06f6:
            r9 = 0
        L_0x06f7:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r4)
            r15.measure(r9, r1)
            goto L_0x0711
        L_0x06ff:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x0701:
            int r28 = r15.getMeasuredWidth()
            int r9 = r28 + r9
            if (r9 >= 0) goto L_0x070a
            r9 = 0
        L_0x070a:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r4)
            r15.measure(r9, r1)
        L_0x0711:
            int r1 = r15.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r4 = r26
            goto L_0x0726
        L_0x0721:
            r4 = r8
            r22 = r9
            r8 = r39
        L_0x0726:
            if (r18 == 0) goto L_0x0742
            int r9 = r6.f1415j
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r7.leftMargin
            int r25 = r25 + r1
            int r1 = r7.rightMargin
            int r25 = r25 + r1
            r1 = 0
            int r25 = r25 + 0
            int r9 = r25 + r9
            r6.f1415j = r9
            r29 = r4
            goto L_0x0760
        L_0x0742:
            r26 = r1
            r1 = 0
            int r9 = r6.f1415j
            int r25 = r15.getMeasuredWidth()
            int r25 = r25 + r9
            int r1 = r7.leftMargin
            int r25 = r25 + r1
            int r1 = r7.rightMargin
            int r25 = r25 + r1
            r29 = r4
            r1 = 0
            int r4 = r25 + 0
            int r1 = java.lang.Math.max(r9, r4)
            r6.f1415j = r1
        L_0x0760:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x076b
            int r1 = r7.height
            r4 = -1
            if (r1 != r4) goto L_0x076b
            r1 = 1
            goto L_0x076c
        L_0x076b:
            r1 = 0
        L_0x076c:
            int r4 = r7.topMargin
            int r9 = r7.bottomMargin
            int r4 = r4 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r4
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x077d
            goto L_0x077e
        L_0x077d:
            r4 = r9
        L_0x077e:
            int r0 = java.lang.Math.max(r0, r4)
            if (r23 == 0) goto L_0x078b
            int r1 = r7.height
            r4 = -1
            if (r1 != r4) goto L_0x078c
            r1 = 1
            goto L_0x078d
        L_0x078b:
            r4 = -1
        L_0x078c:
            r1 = 0
        L_0x078d:
            if (r30 == 0) goto L_0x07b7
            int r15 = r15.getBaseline()
            if (r15 == r4) goto L_0x07b7
            int r4 = r7.f1423b
            if (r4 >= 0) goto L_0x079b
            int r4 = r6.f1414i
        L_0x079b:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r7 = 4
            int r4 = r4 >> r7
            r21 = -2
            r4 = r4 & -2
            int r4 = r4 >> 1
            r7 = r13[r4]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r4] = r7
            r7 = r14[r4]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r4] = r7
            goto L_0x07b9
        L_0x07b7:
            r21 = -2
        L_0x07b9:
            r23 = r1
            r1 = r26
            goto L_0x07c9
        L_0x07be:
            r4 = r8
            r22 = r9
            r19 = 0
            r21 = -2
            r8 = r39
            r29 = r4
        L_0x07c9:
            int r5 = r5 + 1
            r4 = r38
            r9 = r22
            r8 = r29
            goto L_0x06a3
        L_0x07d3:
            r8 = r39
            r22 = r9
            int r1 = r6.f1415j
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.f1415j = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x07f9
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L_0x07f9
            r1 = r13[r17]
            if (r1 != r4) goto L_0x07f9
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L_0x0829
            goto L_0x07fa
        L_0x07f9:
            r1 = 3
        L_0x07fa:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r5 = r14[r5]
            r7 = r14[r27]
            r9 = r14[r17]
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r2 = r1
        L_0x0829:
            if (r23 != 0) goto L_0x0830
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0830
            goto L_0x0831
        L_0x0830:
            r0 = r2
        L_0x0831:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x0859
            r0 = r38
            r1 = r22
            r6.a((int) r1, (int) r0)
        L_0x0859:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.i0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.e = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder a2 = i.a.a.a.a.a("base aligned child index out of range (0, ");
            a2.append(getChildCount());
            a2.append(")");
            throw new IllegalArgumentException(a2.toString());
        }
        this.f1411f = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1420o) {
            this.f1420o = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1421p = drawable.getIntrinsicWidth();
                this.f1422q = drawable.getIntrinsicHeight();
            } else {
                this.f1421p = 0;
                this.f1422q = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.s = i2;
    }

    public void setGravity(int i2) {
        if (this.f1414i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1414i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1414i;
        if ((8388615 & i4) != i3) {
            this.f1414i = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1417l = z;
    }

    public void setOrientation(int i2) {
        if (this.f1413h != i2) {
            this.f1413h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.r) {
            requestLayout();
        }
        this.r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1414i;
        if ((i4 & 112) != i3) {
            this.f1414i = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1416k = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a generateDefaultLayoutParams() {
        int i2 = this.f1413h;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Drawable drawable;
        int resourceId;
        this.e = true;
        this.f1411f = -1;
        this.f1412g = 0;
        this.f1414i = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.LinearLayoutCompat, i2, 0);
        m.a(this, context, j.LinearLayoutCompat, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = obtainStyledAttributes.getInt(j.LinearLayoutCompat_android_orientation, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(j.LinearLayoutCompat_android_gravity, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = obtainStyledAttributes.getBoolean(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1416k = obtainStyledAttributes.getFloat(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1411f = obtainStyledAttributes.getInt(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1417l = obtainStyledAttributes.getBoolean(j.LinearLayoutCompat_measureWithLargestChild, false);
        int i5 = j.LinearLayoutCompat_divider;
        if (!obtainStyledAttributes.hasValue(i5) || (resourceId = obtainStyledAttributes.getResourceId(i5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i5);
        } else {
            drawable = h.b.l.a.a.c(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.r = obtainStyledAttributes.getInt(j.LinearLayoutCompat_showDividers, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(j.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public boolean a(int i2) {
        if (i2 == 0) {
            return (this.r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            if ((this.r & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.r & 2) == 0) {
            return false;
        } else {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void b(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i5 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i3, 0);
                    aVar.height = i5;
                }
            }
        }
    }

    /* compiled from: LinearLayoutCompat */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public int f1423b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1423b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.LinearLayoutCompat_Layout);
            this.a = obtainStyledAttributes.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1423b = obtainStyledAttributes.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1423b = -1;
            this.a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1423b = -1;
        }
    }

    public final void a(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.height == -1) {
                    int i5 = aVar.width;
                    aVar.width = childAt.getMeasuredWidth();
                    measureChildWithMargins(childAt, i3, 0, makeMeasureSpec, 0);
                    aVar.width = i5;
                }
            }
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }
}
