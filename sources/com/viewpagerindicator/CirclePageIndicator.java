package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import b.a.a.a.t0;
import h.h.m.q;
import h.z.a.b;
import i.d.c;
import i.d.d;
import i.d.e;
import i.d.f;
import i.d.g;

public class CirclePageIndicator extends View implements i.d.a {
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f770f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f771g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f772h;

    /* renamed from: i  reason: collision with root package name */
    public h.z.a.b f773i;

    /* renamed from: j  reason: collision with root package name */
    public b.i f774j;

    /* renamed from: k  reason: collision with root package name */
    public int f775k;

    /* renamed from: l  reason: collision with root package name */
    public int f776l;

    /* renamed from: m  reason: collision with root package name */
    public float f777m;

    /* renamed from: n  reason: collision with root package name */
    public int f778n;

    /* renamed from: o  reason: collision with root package name */
    public int f779o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f780p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f781q;
    public int r;
    public float s;
    public int t;
    public boolean u;

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int e;

        public static class a implements Parcelable.Creator<b> {
            public Object createFromParcel(Parcel parcel) {
                return new b(parcel, (a) null);
            }

            public Object[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.e);
        }

        public /* synthetic */ b(Parcel parcel, a aVar) {
            super(parcel);
            this.e = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a(int i2) {
        this.f778n = i2;
        b.i iVar = this.f774j;
        if (iVar != null) {
            iVar.a(i2);
        }
    }

    public void b(int i2) {
        if (this.f781q || this.f778n == 0) {
            this.f775k = i2;
            this.f776l = i2;
            invalidate();
        }
        b.i iVar = this.f774j;
        if (iVar != null) {
            iVar.b(i2);
        }
    }

    public final int c(int i2) {
        h.z.a.b bVar;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 || (bVar = this.f773i) == null) {
            return size;
        }
        if (((t0) bVar.getAdapter()) != null) {
            float paddingRight = (float) (getPaddingRight() + getPaddingLeft());
            float f2 = this.e;
            int i3 = (int) ((((float) 3) * f2) + (((float) 8) * f2) + paddingRight + 1.0f);
            return mode == Integer.MIN_VALUE ? Math.min(i3, size) : i3;
        }
        throw null;
    }

    public final int d(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.e * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public int getFillColor() {
        return this.f772h.getColor();
    }

    public int getOrientation() {
        return this.f779o;
    }

    public int getPageColor() {
        return this.f770f.getColor();
    }

    public float getRadius() {
        return this.e;
    }

    public int getStrokeColor() {
        return this.f771g.getColor();
    }

    public float getStrokeWidth() {
        return this.f771g.getStrokeWidth();
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        float f3;
        super.onDraw(canvas);
        h.z.a.b bVar = this.f773i;
        if (bVar != null) {
            if (((t0) bVar.getAdapter()) == null) {
                throw null;
            } else if (this.f775k >= 4) {
                setCurrentItem(3);
            } else {
                if (this.f779o == 0) {
                    i5 = getWidth();
                    i4 = getPaddingLeft();
                    i3 = getPaddingRight();
                    i2 = getPaddingTop();
                } else {
                    i5 = getHeight();
                    i4 = getPaddingTop();
                    i3 = getPaddingBottom();
                    i2 = getPaddingLeft();
                }
                float f4 = this.e;
                float f5 = 3.0f * f4;
                float f6 = ((float) i2) + f4;
                float f7 = ((float) i4) + f4;
                if (this.f780p) {
                    f7 += (((float) ((i5 - i4) - i3)) / 2.0f) - ((((float) 4) * f5) / 2.0f);
                }
                float f8 = this.e;
                if (this.f771g.getStrokeWidth() > 0.0f) {
                    f8 -= this.f771g.getStrokeWidth() / 2.0f;
                }
                for (int i6 = 0; i6 < 4; i6++) {
                    float f9 = (((float) i6) * f5) + f7;
                    if (this.f779o == 0) {
                        f3 = f6;
                    } else {
                        f3 = f9;
                        f9 = f6;
                    }
                    if (this.f770f.getAlpha() > 0) {
                        canvas.drawCircle(f9, f3, f8, this.f770f);
                    }
                    float f10 = this.e;
                    if (f8 != f10) {
                        canvas.drawCircle(f9, f3, f10, this.f771g);
                    }
                }
                float f11 = ((float) (this.f781q ? this.f776l : this.f775k)) * f5;
                if (!this.f781q) {
                    f11 += this.f777m * f5;
                }
                if (this.f779o == 0) {
                    float f12 = f7 + f11;
                    f2 = f6;
                    f6 = f12;
                } else {
                    f2 = f7 + f11;
                }
                canvas.drawCircle(f6, f2, this.e, this.f772h);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        if (this.f779o == 0) {
            setMeasuredDimension(c(i2), d(i3));
        } else {
            setMeasuredDimension(d(i2), c(i3));
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        int i2 = bVar.e;
        this.f775k = i2;
        this.f776l = i2;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.e = this.f775k;
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (r2 != 0) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            boolean r0 = super.onTouchEvent(r14)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            h.z.a.b r0 = r13.f773i
            r2 = 0
            if (r0 == 0) goto L_0x0135
            h.z.a.a r0 = r0.getAdapter()
            b.a.a.a.t0 r0 = (b.a.a.a.t0) r0
            r3 = 0
            if (r0 == 0) goto L_0x0134
            int r0 = r14.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0127
            r4 = 3
            if (r0 == r1) goto L_0x00cc
            r5 = 2
            if (r0 == r5) goto L_0x0063
            if (r0 == r4) goto L_0x00cc
            r3 = 5
            if (r0 == r3) goto L_0x0051
            r3 = 6
            if (r0 == r3) goto L_0x002e
            goto L_0x0133
        L_0x002e:
            int r0 = r14.getActionIndex()
            int r3 = r14.getPointerId(r0)
            int r4 = r13.t
            if (r3 != r4) goto L_0x0043
            if (r0 != 0) goto L_0x003d
            r2 = 1
        L_0x003d:
            int r0 = r14.getPointerId(r2)
            r13.t = r0
        L_0x0043:
            int r0 = r13.t
            int r0 = r14.findPointerIndex(r0)
            float r14 = r14.getX(r0)
            r13.s = r14
            goto L_0x0133
        L_0x0051:
            int r0 = r14.getActionIndex()
            float r2 = r14.getX(r0)
            r13.s = r2
            int r14 = r14.getPointerId(r0)
            r13.t = r14
            goto L_0x0133
        L_0x0063:
            int r0 = r13.t
            int r0 = r14.findPointerIndex(r0)
            float r14 = r14.getX(r0)
            float r0 = r13.s
            float r0 = r14 - r0
            boolean r3 = r13.u
            if (r3 != 0) goto L_0x0082
            float r3 = java.lang.Math.abs(r0)
            int r4 = r13.r
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0082
            r13.u = r1
        L_0x0082:
            boolean r3 = r13.u
            if (r3 == 0) goto L_0x0133
            r13.s = r14
            h.z.a.b r14 = r13.f773i
            boolean r3 = r14.Q
            if (r3 != 0) goto L_0x00c6
            boolean r3 = r14.B
            if (r3 == 0) goto L_0x0093
            goto L_0x00c4
        L_0x0093:
            r14.Q = r1
            r14.setScrollState(r1)
            r2 = 0
            r14.G = r2
            r14.I = r2
            android.view.VelocityTracker r2 = r14.L
            if (r2 != 0) goto L_0x00a8
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r14.L = r2
            goto L_0x00ab
        L_0x00a8:
            r2.clear()
        L_0x00ab:
            long r11 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r11
            r5 = r11
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.VelocityTracker r3 = r14.L
            r3.addMovement(r2)
            r2.recycle()
            r14.R = r11
            r2 = 1
        L_0x00c4:
            if (r2 == 0) goto L_0x0133
        L_0x00c6:
            h.z.a.b r14 = r13.f773i
            r14.a((float) r0)
            goto L_0x0133
        L_0x00cc:
            boolean r5 = r13.u
            if (r5 != 0) goto L_0x0118
            h.z.a.b r5 = r13.f773i
            h.z.a.a r5 = r5.getAdapter()
            b.a.a.a.t0 r5 = (b.a.a.a.t0) r5
            if (r5 == 0) goto L_0x0117
            int r3 = r13.getWidth()
            float r3 = (float) r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r5
            r6 = 1086324736(0x40c00000, float:6.0)
            float r3 = r3 / r6
            int r6 = r13.f775k
            if (r6 <= 0) goto L_0x00ff
            float r6 = r14.getX()
            float r7 = r5 - r3
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ff
            if (r0 == r4) goto L_0x00fe
            h.z.a.b r14 = r13.f773i
            int r0 = r13.f775k
            int r0 = r0 - r1
            r14.setCurrentItem(r0)
        L_0x00fe:
            return r1
        L_0x00ff:
            int r6 = r13.f775k
            if (r6 >= r4) goto L_0x0118
            float r14 = r14.getX()
            float r5 = r5 + r3
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0118
            if (r0 == r4) goto L_0x0116
            h.z.a.b r14 = r13.f773i
            int r0 = r13.f775k
            int r0 = r0 + r1
            r14.setCurrentItem(r0)
        L_0x0116:
            return r1
        L_0x0117:
            throw r3
        L_0x0118:
            r13.u = r2
            r14 = -1
            r13.t = r14
            h.z.a.b r14 = r13.f773i
            boolean r0 = r14.Q
            if (r0 == 0) goto L_0x0133
            r14.b()
            goto L_0x0133
        L_0x0127:
            int r0 = r14.getPointerId(r2)
            r13.t = r0
            float r14 = r14.getX()
            r13.s = r14
        L_0x0133:
            return r1
        L_0x0134:
            throw r3
        L_0x0135:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.viewpagerindicator.CirclePageIndicator.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCentered(boolean z) {
        this.f780p = z;
        invalidate();
    }

    public void setCurrentItem(int i2) {
        h.z.a.b bVar = this.f773i;
        if (bVar != null) {
            bVar.setCurrentItem(i2);
            this.f775k = i2;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i2) {
        this.f772h.setColor(i2);
        invalidate();
    }

    public void setOnPageChangeListener(b.i iVar) {
        this.f774j = iVar;
    }

    public void setOrientation(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.f779o = i2;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i2) {
        this.f770f.setColor(i2);
        invalidate();
    }

    public void setRadius(float f2) {
        this.e = f2;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f781q = z;
        invalidate();
    }

    public void setStrokeColor(int i2) {
        this.f771g.setColor(i2);
        invalidate();
    }

    public void setStrokeWidth(float f2) {
        this.f771g.setStrokeWidth(f2);
        invalidate();
    }

    public void setViewPager(h.z.a.b bVar) {
        h.z.a.b bVar2 = this.f773i;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.setOnPageChangeListener((b.i) null);
            }
            if (bVar.getAdapter() != null) {
                this.f773i = bVar;
                bVar.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.d.b.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f770f = new Paint(1);
        this.f771g = new Paint(1);
        this.f772h = new Paint(1);
        this.s = -1.0f;
        this.t = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(d.default_circle_indicator_page_color);
            int color2 = resources.getColor(d.default_circle_indicator_fill_color);
            int integer = resources.getInteger(f.default_circle_indicator_orientation);
            int color3 = resources.getColor(d.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(e.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(e.default_circle_indicator_radius);
            boolean z = resources.getBoolean(c.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(c.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.CirclePageIndicator, i2, 0);
            this.f780p = obtainStyledAttributes.getBoolean(g.CirclePageIndicator_centered, z);
            this.f779o = obtainStyledAttributes.getInt(g.CirclePageIndicator_android_orientation, integer);
            this.f770f.setStyle(Paint.Style.FILL);
            this.f770f.setColor(obtainStyledAttributes.getColor(g.CirclePageIndicator_pageColor, color));
            this.f771g.setStyle(Paint.Style.STROKE);
            this.f771g.setColor(obtainStyledAttributes.getColor(g.CirclePageIndicator_strokeColor, color3));
            this.f771g.setStrokeWidth(obtainStyledAttributes.getDimension(g.CirclePageIndicator_strokeWidth, dimension));
            this.f772h.setStyle(Paint.Style.FILL);
            this.f772h.setColor(obtainStyledAttributes.getColor(g.CirclePageIndicator_fillColor, color2));
            this.e = obtainStyledAttributes.getDimension(g.CirclePageIndicator_radius, dimension2);
            this.f781q = obtainStyledAttributes.getBoolean(g.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(g.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.r = q.b(ViewConfiguration.get(context));
        }
    }

    public void a(int i2, float f2, int i3) {
        this.f775k = i2;
        this.f777m = f2;
        invalidate();
        b.i iVar = this.f774j;
        if (iVar != null) {
            iVar.a(i2, f2, i3);
        }
    }
}
