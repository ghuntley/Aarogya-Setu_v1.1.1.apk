package h.x.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: VectorDrawableCompat */
public class g extends f {

    /* renamed from: n  reason: collision with root package name */
    public static final PorterDuff.Mode f2311n = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    public h f2312f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuffColorFilter f2313g;

    /* renamed from: h  reason: collision with root package name */
    public ColorFilter f2314h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2315i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2316j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f2317k;

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f2318l;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f2319m;

    /* compiled from: VectorDrawableCompat */
    public static class b extends f {
        public b() {
        }

        public boolean b() {
            return true;
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class c extends f {
        public int[] e;

        /* renamed from: f  reason: collision with root package name */
        public h.h.f.b.a f2320f;

        /* renamed from: g  reason: collision with root package name */
        public float f2321g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        public h.h.f.b.a f2322h;

        /* renamed from: i  reason: collision with root package name */
        public float f2323i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f2324j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2325k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f2326l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f2327m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Cap f2328n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Join f2329o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        public float f2330p = 4.0f;

        public c() {
        }

        public boolean a() {
            return this.f2322h.b() || this.f2320f.b();
        }

        public float getFillAlpha() {
            return this.f2324j;
        }

        public int getFillColor() {
            return this.f2322h.c;
        }

        public float getStrokeAlpha() {
            return this.f2323i;
        }

        public int getStrokeColor() {
            return this.f2320f.c;
        }

        public float getStrokeWidth() {
            return this.f2321g;
        }

        public float getTrimPathEnd() {
            return this.f2326l;
        }

        public float getTrimPathOffset() {
            return this.f2327m;
        }

        public float getTrimPathStart() {
            return this.f2325k;
        }

        public void setFillAlpha(float f2) {
            this.f2324j = f2;
        }

        public void setFillColor(int i2) {
            this.f2322h.c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f2323i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f2320f.c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f2321g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f2326l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f2327m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f2325k = f2;
        }

        public boolean a(int[] iArr) {
            return this.f2320f.a(iArr) | this.f2322h.a(iArr);
        }

        public c(c cVar) {
            super(cVar);
            this.e = cVar.e;
            this.f2320f = cVar.f2320f;
            this.f2321g = cVar.f2321g;
            this.f2323i = cVar.f2323i;
            this.f2322h = cVar.f2322h;
            this.c = cVar.c;
            this.f2324j = cVar.f2324j;
            this.f2325k = cVar.f2325k;
            this.f2326l = cVar.f2326l;
            this.f2327m = cVar.f2327m;
            this.f2328n = cVar.f2328n;
            this.f2329o = cVar.f2329o;
            this.f2330p = cVar.f2330p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }

        public /* synthetic */ e(a aVar) {
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class h extends Drawable.ConstantState {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public C0076g f2354b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f2355f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f2356g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f2357h;

        /* renamed from: i  reason: collision with root package name */
        public int f2358i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2359j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2360k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f2361l;

        public h(h hVar) {
            this.c = null;
            this.d = g.f2311n;
            if (hVar != null) {
                this.a = hVar.a;
                C0076g gVar = new C0076g(hVar.f2354b);
                this.f2354b = gVar;
                if (hVar.f2354b.e != null) {
                    gVar.e = new Paint(hVar.f2354b.e);
                }
                if (hVar.f2354b.d != null) {
                    this.f2354b.d = new Paint(hVar.f2354b.d);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public void a(int i2, int i3) {
            this.f2355f.eraseColor(0);
            Canvas canvas = new Canvas(this.f2355f);
            C0076g gVar = this.f2354b;
            gVar.a(gVar.f2345h, C0076g.f2341q, canvas, i2, i3, (ColorFilter) null);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            return new g(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public boolean a() {
            C0076g gVar = this.f2354b;
            if (gVar.f2352o == null) {
                gVar.f2352o = Boolean.valueOf(gVar.f2345h.a());
            }
            return gVar.f2352o.booleanValue();
        }

        public h() {
            this.c = null;
            this.d = g.f2311n;
            this.f2354b = new C0076g();
        }
    }

    public g() {
        this.f2316j = true;
        this.f2317k = new float[9];
        this.f2318l = new Matrix();
        this.f2319m = new Rect();
        this.f2312f = new h();
    }

    public static g createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f2355f.getHeight()) == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.e
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.f2319m
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f2319m
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x016b
            android.graphics.Rect r0 = r10.f2319m
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x016b
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.f2314h
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.f2313g
        L_0x0025:
            android.graphics.Matrix r1 = r10.f2318l
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f2318l
            float[] r2 = r10.f2317k
            r1.getValues(r2)
            float[] r1 = r10.f2317k
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f2317k
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f2317k
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f2317k
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0064
        L_0x0060:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0064:
            android.graphics.Rect r4 = r10.f2319m
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f2319m
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x016b
            if (r3 > 0) goto L_0x0088
            goto L_0x016b
        L_0x0088:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f2319m
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a5
            int r6 = g.a.a.b.a.b((android.graphics.drawable.Drawable) r10)
            if (r6 != r5) goto L_0x00a5
            r6 = 1
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00b7
            android.graphics.Rect r6 = r10.f2319m
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00b7:
            android.graphics.Rect r6 = r10.f2319m
            r6.offsetTo(r2, r2)
            h.x.a.a.g$h r6 = r10.f2312f
            android.graphics.Bitmap r7 = r6.f2355f
            if (r7 == 0) goto L_0x00d5
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00d2
            android.graphics.Bitmap r7 = r6.f2355f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00d2
            r7 = 1
            goto L_0x00d3
        L_0x00d2:
            r7 = 0
        L_0x00d3:
            if (r7 != 0) goto L_0x00df
        L_0x00d5:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f2355f = r7
            r6.f2360k = r5
        L_0x00df:
            boolean r6 = r10.f2316j
            if (r6 != 0) goto L_0x00e9
            h.x.a.a.g$h r6 = r10.f2312f
            r6.a(r1, r3)
            goto L_0x012d
        L_0x00e9:
            h.x.a.a.g$h r6 = r10.f2312f
            boolean r7 = r6.f2360k
            if (r7 != 0) goto L_0x010d
            android.content.res.ColorStateList r7 = r6.f2356g
            android.content.res.ColorStateList r8 = r6.c
            if (r7 != r8) goto L_0x010d
            android.graphics.PorterDuff$Mode r7 = r6.f2357h
            android.graphics.PorterDuff$Mode r8 = r6.d
            if (r7 != r8) goto L_0x010d
            boolean r7 = r6.f2359j
            boolean r8 = r6.e
            if (r7 != r8) goto L_0x010d
            int r7 = r6.f2358i
            h.x.a.a.g$g r6 = r6.f2354b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x010d
            r6 = 1
            goto L_0x010e
        L_0x010d:
            r6 = 0
        L_0x010e:
            if (r6 != 0) goto L_0x012d
            h.x.a.a.g$h r6 = r10.f2312f
            r6.a(r1, r3)
            h.x.a.a.g$h r1 = r10.f2312f
            android.content.res.ColorStateList r3 = r1.c
            r1.f2356g = r3
            android.graphics.PorterDuff$Mode r3 = r1.d
            r1.f2357h = r3
            h.x.a.a.g$g r3 = r1.f2354b
            int r3 = r3.getRootAlpha()
            r1.f2358i = r3
            boolean r3 = r1.e
            r1.f2359j = r3
            r1.f2360k = r2
        L_0x012d:
            h.x.a.a.g$h r1 = r10.f2312f
            android.graphics.Rect r3 = r10.f2319m
            h.x.a.a.g$g r6 = r1.f2354b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x013c
            r2 = 1
        L_0x013c:
            r6 = 0
            if (r2 != 0) goto L_0x0143
            if (r0 != 0) goto L_0x0143
            r0 = r6
            goto L_0x0163
        L_0x0143:
            android.graphics.Paint r2 = r1.f2361l
            if (r2 != 0) goto L_0x0151
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f2361l = r2
            r2.setFilterBitmap(r5)
        L_0x0151:
            android.graphics.Paint r2 = r1.f2361l
            h.x.a.a.g$g r5 = r1.f2354b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f2361l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f2361l
        L_0x0163:
            android.graphics.Bitmap r1 = r1.f2355f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.a.a.g.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f2312f.f2354b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f2312f.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f2314h;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.e != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.e.getConstantState());
        }
        this.f2312f.a = getChangingConfigurations();
        return this.f2312f;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f2312f.f2354b.f2347j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f2312f.f2354b.f2346i;
    }

    public int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f2312f.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f2312f.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f2312f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            h.x.a.a.g$h r0 = r1.f2312f
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0028
            h.x.a.a.g$h r0 = r1.f2312f
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.a.a.g.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2315i && super.mutate() == this) {
            this.f2312f = new h(this.f2312f);
            this.f2315i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f2312f;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.d) == null)) {
            this.f2313g = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.a()) {
            boolean a2 = hVar.f2354b.f2345h.a(iArr);
            hVar.f2360k |= a2;
            if (a2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2312f.f2354b.getRootAlpha() != i2) {
            this.f2312f.f2354b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f2312f.e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2314h = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.a.a.b.a.b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.a.a.b.a.a(drawable, colorStateList);
            return;
        }
        h hVar = this.f2312f;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.f2313g = a(colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.a.a.b.a.a(drawable, mode);
            return;
        }
        h hVar = this.f2312f;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.f2313g = a(hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class d extends e {
        public final Matrix a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f2331b = new ArrayList<>();
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2332f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2333g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f2334h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f2335i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f2336j = new Matrix();

        /* renamed from: k  reason: collision with root package name */
        public int f2337k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f2338l;

        /* renamed from: m  reason: collision with root package name */
        public String f2339m = null;

        public d(d dVar, h.e.a<String, Object> aVar) {
            super((a) null);
            f fVar;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f2332f = dVar.f2332f;
            this.f2333g = dVar.f2333g;
            this.f2334h = dVar.f2334h;
            this.f2335i = dVar.f2335i;
            this.f2338l = dVar.f2338l;
            String str = dVar.f2339m;
            this.f2339m = str;
            this.f2337k = dVar.f2337k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2336j.set(dVar.f2336j);
            ArrayList<e> arrayList = dVar.f2331b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f2331b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f2331b.add(fVar);
                    String str2 = fVar.f2340b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.f2331b.size(); i2++) {
                if (this.f2331b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public final void b() {
            this.f2336j.reset();
            this.f2336j.postTranslate(-this.d, -this.e);
            this.f2336j.postScale(this.f2332f, this.f2333g);
            this.f2336j.postRotate(this.c, 0.0f, 0.0f);
            this.f2336j.postTranslate(this.f2334h + this.d, this.f2335i + this.e);
        }

        public String getGroupName() {
            return this.f2339m;
        }

        public Matrix getLocalMatrix() {
            return this.f2336j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f2332f;
        }

        public float getScaleY() {
            return this.f2333g;
        }

        public float getTranslateX() {
            return this.f2334h;
        }

        public float getTranslateY() {
            return this.f2335i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2332f) {
                this.f2332f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2333g) {
                this.f2333g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2334h) {
                this.f2334h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f2335i) {
                this.f2335i = f2;
                b();
            }
        }

        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f2331b.size(); i2++) {
                z |= this.f2331b.get(i2).a(iArr);
            }
            return z;
        }

        public d() {
            super((a) null);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            g gVar = new g();
            gVar.e = (VectorDrawable) this.a.newDrawable();
            return gVar;
        }

        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.e = (VectorDrawable) this.a.newDrawable(resources);
            return gVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
            return gVar;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class f extends e {
        public h.h.g.b[] a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f2340b;
        public int c = 0;
        public int d;

        public f() {
            super((a) null);
        }

        public boolean b() {
            return false;
        }

        public h.h.g.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.f2340b;
        }

        public void setPathData(h.h.g.b[] bVarArr) {
            if (!g.a.a.b.a.a(this.a, bVarArr)) {
                this.a = g.a.a.b.a.a(bVarArr);
                return;
            }
            h.h.g.b[] bVarArr2 = this.a;
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                bVarArr2[i2].a = bVarArr[i2].a;
                for (int i3 = 0; i3 < bVarArr[i2].f1755b.length; i3++) {
                    bVarArr2[i2].f1755b[i3] = bVarArr[i2].f1755b[i3];
                }
            }
        }

        public f(f fVar) {
            super((a) null);
            this.f2340b = fVar.f2340b;
            this.d = fVar.d;
            this.a = g.a.a.b.a.a(fVar.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h.x.a.a.g a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            h.x.a.a.g r0 = new h.x.a.a.g
            r0.<init>()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7, r8)
            r0.e = r6
            h.x.a.a.g$i r6 = new h.x.a.a.g$i
            android.graphics.drawable.Drawable r7 = r0.e
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            h.x.a.a.g r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.a.a.g.a(android.content.res.Resources, int, android.content.res.Resources$Theme):h.x.a.a.g");
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto L_0x0012
            r0.inflate(r2, r9, r10, r11)
            return
        L_0x0012:
            h.x.a.a.g$h r12 = r1.f2312f
            h.x.a.a.g$g r0 = new h.x.a.a.g$g
            r0.<init>()
            r12.f2354b = r0
            int[] r0 = h.x.a.a.a.a
            android.content.res.TypedArray r3 = g.a.a.b.a.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r0)
            h.x.a.a.g$h r4 = r1.f2312f
            h.x.a.a.g$g r5 = r4.f2354b
            r13 = 6
            r14 = -1
            java.lang.String r0 = "tintMode"
            int r0 = g.a.a.b.a.b(r3, r9, r0, r13, r14)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L_0x0049
            if (r0 == r8) goto L_0x004b
            if (r0 == r15) goto L_0x0046
            switch(r0) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r4.d = r6
            java.lang.String r0 = "tint"
            boolean r0 = g.a.a.b.a.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r0)
            r13 = 0
            r15 = 1
            r14 = 2
            if (r0 == 0) goto L_0x00ac
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r15, r0)
            int r6 = r0.type
            if (r6 == r14) goto L_0x008d
            r14 = 28
            if (r6 < r14) goto L_0x0073
            r14 = 31
            if (r6 > r14) goto L_0x0073
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00ad
        L_0x0073:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r15, r13)
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ Exception -> 0x0084 }
            android.content.res.ColorStateList r0 = g.a.a.b.a.a((android.content.res.Resources) r0, (org.xmlpull.v1.XmlPullParser) r6, (android.content.res.Resources.Theme) r11)     // Catch:{ Exception -> 0x0084 }
            goto L_0x00ad
        L_0x0084:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto L_0x00ac
        L_0x008d:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 == 0) goto L_0x00b1
            r4.c = r0
        L_0x00b1:
            boolean r0 = r4.e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = g.a.a.b.a.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r6)
            if (r6 != 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            boolean r0 = r3.getBoolean(r8, r0)
        L_0x00c0:
            r4.e = r0
            float r0 = r5.f2348k
            r14 = 7
            java.lang.String r4 = "viewportWidth"
            float r0 = g.a.a.b.a.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r14, (float) r0)
            r5.f2348k = r0
            float r0 = r5.f2349l
            r6 = 8
            java.lang.String r4 = "viewportHeight"
            float r0 = g.a.a.b.a.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r0)
            r5.f2349l = r0
            float r4 = r5.f2348k
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x043e
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0422
            float r0 = r5.f2346i
            float r0 = r3.getDimension(r7, r0)
            r5.f2346i = r0
            float r0 = r5.f2347j
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.f2347j = r0
            float r4 = r5.f2346i
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x0406
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ea
            float r0 = r5.getAlpha()
            r4 = 4
            java.lang.String r6 = "alpha"
            float r0 = g.a.a.b.a.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r6, (int) r4, (float) r0)
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r13)
            if (r0 == 0) goto L_0x011b
            r5.f2351n = r0
            h.e.a<java.lang.String, java.lang.Object> r6 = r5.f2353p
            r6.put(r0, r5)
        L_0x011b:
            r3.recycle()
            int r0 = r27.getChangingConfigurations()
            r12.a = r0
            r12.f2360k = r15
            h.x.a.a.g$h r0 = r1.f2312f
            h.x.a.a.g$g r6 = r0.f2354b
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            h.x.a.a.g$d r3 = r6.f2345h
            r5.push(r3)
            int r3 = r29.getEventType()
            int r20 = r29.getDepth()
            int r14 = r20 + 1
            r20 = 1
        L_0x0140:
            if (r3 == r15) goto L_0x03d1
            int r4 = r29.getDepth()
            if (r4 >= r14) goto L_0x014a
            if (r3 == r7) goto L_0x03d1
        L_0x014a:
            java.lang.String r4 = "group"
            r7 = 2
            if (r3 != r7) goto L_0x03a1
            java.lang.String r3 = r29.getName()
            java.lang.Object r7 = r5.peek()
            h.x.a.a.g$d r7 = (h.x.a.a.g.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r15 = "fillType"
            java.lang.String r13 = "pathData"
            if (r8 == 0) goto L_0x02a8
            h.x.a.a.g$c r8 = new h.x.a.a.g$c
            r8.<init>()
            int[] r3 = h.x.a.a.a.c
            android.content.res.TypedArray r4 = g.a.a.b.a.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r3)
            r3 = 0
            r8.e = r3
            boolean r13 = g.a.a.b.a.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r13)
            if (r13 != 0) goto L_0x018b
            r1 = r4
            r25 = r5
            r26 = r6
            r13 = r8
            r18 = r14
            r5 = 4
            r17 = -1
            r21 = 9
            r22 = 8
            r14 = r7
            goto L_0x027a
        L_0x018b:
            r13 = 0
            java.lang.String r3 = r4.getString(r13)
            if (r3 == 0) goto L_0x0194
            r8.f2340b = r3
        L_0x0194:
            r3 = 2
            java.lang.String r13 = r4.getString(r3)
            if (r13 == 0) goto L_0x01a1
            h.h.g.b[] r3 = g.a.a.b.a.a((java.lang.String) r13)
            r8.a = r3
        L_0x01a1:
            r13 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r4
            r24 = r4
            r4 = r29
            r25 = r5
            r5 = r31
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r13
            r13 = r8
            r1 = 5
            r8 = r20
            h.h.f.b.a r3 = g.a.a.b.a.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r4, (android.content.res.Resources.Theme) r5, (java.lang.String) r6, (int) r7, (int) r8)
            r13.f2322h = r3
            r3 = 12
            float r4 = r13.f2324j
            java.lang.String r5 = "fillAlpha"
            r8 = r24
            float r3 = g.a.a.b.a.a((android.content.res.TypedArray) r8, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r5, (int) r3, (float) r4)
            r13.f2324j = r3
            java.lang.String r3 = "strokeLineCap"
            r4 = -1
            r7 = 8
            int r3 = g.a.a.b.a.b(r8, r9, r3, r7, r4)
            android.graphics.Paint$Cap r4 = r13.f2328n
            if (r3 == 0) goto L_0x01ec
            r5 = 1
            if (r3 == r5) goto L_0x01e9
            r5 = 2
            if (r3 == r5) goto L_0x01e6
            goto L_0x01ee
        L_0x01e6:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01ee
        L_0x01e9:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x01ee
        L_0x01ec:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x01ee:
            r13.f2328n = r4
            java.lang.String r3 = "strokeLineJoin"
            r5 = -1
            r6 = 9
            int r3 = g.a.a.b.a.b(r8, r9, r3, r6, r5)
            android.graphics.Paint$Join r4 = r13.f2329o
            if (r3 == 0) goto L_0x020a
            r5 = 1
            if (r3 == r5) goto L_0x0207
            r5 = 2
            if (r3 == r5) goto L_0x0204
            goto L_0x020c
        L_0x0204:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x020c
        L_0x0207:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x020c
        L_0x020a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L_0x020c:
            r13.f2329o = r4
            r3 = 10
            float r4 = r13.f2330p
            java.lang.String r5 = "strokeMiterLimit"
            float r3 = g.a.a.b.a.a((android.content.res.TypedArray) r8, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r5, (int) r3, (float) r4)
            r13.f2330p = r3
            r16 = 3
            r19 = 0
            java.lang.String r20 = "strokeColor"
            r3 = r8
            r4 = r29
            r17 = -1
            r5 = r31
            r21 = 9
            r6 = r20
            r22 = 8
            r7 = r16
            r1 = r8
            r8 = r19
            h.h.f.b.a r3 = g.a.a.b.a.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r4, (android.content.res.Resources.Theme) r5, (java.lang.String) r6, (int) r7, (int) r8)
            r13.f2320f = r3
            r3 = 11
            float r4 = r13.f2323i
            java.lang.String r5 = "strokeAlpha"
            float r3 = g.a.a.b.a.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r5, (int) r3, (float) r4)
            r13.f2323i = r3
            float r3 = r13.f2321g
            java.lang.String r4 = "strokeWidth"
            r5 = 4
            float r3 = g.a.a.b.a.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r5, (float) r3)
            r13.f2321g = r3
            float r3 = r13.f2326l
            java.lang.String r4 = "trimPathEnd"
            r6 = 6
            float r3 = g.a.a.b.a.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r3)
            r13.f2326l = r3
            float r3 = r13.f2327m
            java.lang.String r4 = "trimPathOffset"
            r6 = 7
            float r3 = g.a.a.b.a.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r3)
            r13.f2327m = r3
            float r3 = r13.f2325k
            java.lang.String r4 = "trimPathStart"
            r6 = 5
            float r3 = g.a.a.b.a.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r3)
            r13.f2325k = r3
            r3 = 13
            int r4 = r13.c
            int r3 = g.a.a.b.a.b(r1, r9, r15, r3, r4)
            r13.c = r3
        L_0x027a:
            r1.recycle()
            java.util.ArrayList<h.x.a.a.g$e> r1 = r14.f2331b
            r1.add(r13)
            java.lang.String r1 = r13.getPathName()
            if (r1 == 0) goto L_0x0294
            r1 = r26
            h.e.a<java.lang.String, java.lang.Object> r3 = r1.f2353p
            java.lang.String r4 = r13.getPathName()
            r3.put(r4, r13)
            goto L_0x0296
        L_0x0294:
            r1 = r26
        L_0x0296:
            int r3 = r0.a
            int r4 = r13.d
            r3 = r3 | r4
            r0.a = r3
            r7 = r25
            r5 = 7
            r6 = 0
            r8 = 6
            r13 = 5
            r15 = 2
            r20 = 0
            goto L_0x039f
        L_0x02a8:
            r25 = r5
            r1 = r6
            r18 = r14
            r5 = 4
            r17 = -1
            r21 = 9
            r22 = 8
            r14 = r7
            java.lang.String r6 = "clip-path"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x030c
            h.x.a.a.g$b r3 = new h.x.a.a.g$b
            r3.<init>()
            boolean r4 = g.a.a.b.a.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r13)
            if (r4 != 0) goto L_0x02c9
            goto L_0x02ef
        L_0x02c9:
            int[] r4 = h.x.a.a.a.d
            android.content.res.TypedArray r4 = g.a.a.b.a.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r4)
            r6 = 0
            java.lang.String r7 = r4.getString(r6)
            if (r7 == 0) goto L_0x02d8
            r3.f2340b = r7
        L_0x02d8:
            r7 = 1
            java.lang.String r8 = r4.getString(r7)
            if (r8 == 0) goto L_0x02e5
            h.h.g.b[] r7 = g.a.a.b.a.a((java.lang.String) r8)
            r3.a = r7
        L_0x02e5:
            r7 = 2
            int r8 = g.a.a.b.a.b(r4, r9, r15, r7, r6)
            r3.c = r8
            r4.recycle()
        L_0x02ef:
            java.util.ArrayList<h.x.a.a.g$e> r4 = r14.f2331b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L_0x0303
            h.e.a<java.lang.String, java.lang.Object> r4 = r1.f2353p
            java.lang.String r6 = r3.getPathName()
            r4.put(r6, r3)
        L_0x0303:
            int r4 = r0.a
            int r3 = r3.d
            r3 = r3 | r4
            r0.a = r3
            goto L_0x0398
        L_0x030c:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0398
            h.x.a.a.g$d r3 = new h.x.a.a.g$d
            r3.<init>()
            int[] r4 = h.x.a.a.a.f2298b
            android.content.res.TypedArray r4 = g.a.a.b.a.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r4)
            r6 = 0
            r3.f2338l = r6
            float r7 = r3.c
            java.lang.String r8 = "rotation"
            r13 = 5
            float r7 = g.a.a.b.a.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r8, (int) r13, (float) r7)
            r3.c = r7
            float r7 = r3.d
            r8 = 1
            float r7 = r4.getFloat(r8, r7)
            r3.d = r7
            float r7 = r3.e
            r15 = 2
            float r7 = r4.getFloat(r15, r7)
            r3.e = r7
            float r7 = r3.f2332f
            java.lang.String r6 = "scaleX"
            r8 = 3
            float r6 = g.a.a.b.a.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r6, (int) r8, (float) r7)
            r3.f2332f = r6
            float r6 = r3.f2333g
            java.lang.String r7 = "scaleY"
            float r6 = g.a.a.b.a.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r7, (int) r5, (float) r6)
            r3.f2333g = r6
            float r6 = r3.f2334h
            java.lang.String r7 = "translateX"
            r8 = 6
            float r6 = g.a.a.b.a.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r7, (int) r8, (float) r6)
            r3.f2334h = r6
            float r6 = r3.f2335i
            java.lang.String r7 = "translateY"
            r5 = 7
            float r6 = g.a.a.b.a.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r7, (int) r5, (float) r6)
            r3.f2335i = r6
            r6 = 0
            java.lang.String r7 = r4.getString(r6)
            if (r7 == 0) goto L_0x0371
            r3.f2339m = r7
        L_0x0371:
            r3.b()
            r4.recycle()
            java.util.ArrayList<h.x.a.a.g$e> r4 = r14.f2331b
            r4.add(r3)
            r7 = r25
            r7.push(r3)
            java.lang.String r4 = r3.getGroupName()
            if (r4 == 0) goto L_0x0390
            h.e.a<java.lang.String, java.lang.Object> r4 = r1.f2353p
            java.lang.String r14 = r3.getGroupName()
            r4.put(r14, r3)
        L_0x0390:
            int r4 = r0.a
            int r3 = r3.f2337k
            r3 = r3 | r4
            r0.a = r3
            goto L_0x039f
        L_0x0398:
            r7 = r25
            r5 = 7
            r6 = 0
            r8 = 6
            r13 = 5
            r15 = 2
        L_0x039f:
            r14 = 3
            goto L_0x03c0
        L_0x03a1:
            r7 = r5
            r1 = r6
            r18 = r14
            r5 = 7
            r6 = 0
            r8 = 6
            r13 = 5
            r14 = 3
            r15 = 2
            r17 = -1
            r21 = 9
            r22 = 8
            if (r3 != r14) goto L_0x03c0
            java.lang.String r3 = r29.getName()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x03c0
            r7.pop()
        L_0x03c0:
            int r3 = r29.next()
            r6 = r1
            r5 = r7
            r14 = r18
            r4 = 4
            r7 = 3
            r8 = 5
            r13 = 0
            r15 = 1
            r1 = r27
            goto L_0x0140
        L_0x03d1:
            if (r20 != 0) goto L_0x03e0
            android.content.res.ColorStateList r0 = r12.c
            android.graphics.PorterDuff$Mode r1 = r12.d
            r2 = r27
            android.graphics.PorterDuffColorFilter r0 = r2.a((android.content.res.ColorStateList) r0, (android.graphics.PorterDuff.Mode) r1)
            r2.f2313g = r0
            return
        L_0x03e0:
            r2 = r27
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x03ea:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0406:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0422:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x043e:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.a.a.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public g(h hVar) {
        this.f2316j = true;
        this.f2317k = new float[9];
        this.f2318l = new Matrix();
        this.f2319m = new Rect();
        this.f2312f = hVar;
        this.f2313g = a(hVar.c, hVar.d);
    }

    /* renamed from: h.x.a.a.g$g  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    public static class C0076g {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f2341q = new Matrix();
        public final Path a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f2342b;
        public final Matrix c;
        public Paint d;
        public Paint e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f2343f;

        /* renamed from: g  reason: collision with root package name */
        public int f2344g;

        /* renamed from: h  reason: collision with root package name */
        public final d f2345h;

        /* renamed from: i  reason: collision with root package name */
        public float f2346i;

        /* renamed from: j  reason: collision with root package name */
        public float f2347j;

        /* renamed from: k  reason: collision with root package name */
        public float f2348k;

        /* renamed from: l  reason: collision with root package name */
        public float f2349l;

        /* renamed from: m  reason: collision with root package name */
        public int f2350m;

        /* renamed from: n  reason: collision with root package name */
        public String f2351n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f2352o;

        /* renamed from: p  reason: collision with root package name */
        public final h.e.a<String, Object> f2353p;

        public C0076g() {
            this.c = new Matrix();
            this.f2346i = 0.0f;
            this.f2347j = 0.0f;
            this.f2348k = 0.0f;
            this.f2349l = 0.0f;
            this.f2350m = 255;
            this.f2351n = null;
            this.f2352o = null;
            this.f2353p = new h.e.a<>();
            this.f2345h = new d();
            this.a = new Path();
            this.f2342b = new Path();
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            C0076g gVar;
            C0076g gVar2 = this;
            d dVar2 = dVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            dVar2.a.set(matrix);
            dVar2.a.preConcat(dVar2.f2336j);
            canvas.save();
            ? r11 = 0;
            int i4 = 0;
            while (i4 < dVar2.f2331b.size()) {
                e eVar = dVar2.f2331b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar2.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f2 = ((float) i2) / gVar2.f2348k;
                    float f3 = ((float) i3) / gVar2.f2349l;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = dVar2.a;
                    gVar2.c.set(matrix2);
                    gVar2.c.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = min;
                    float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.a;
                        if (fVar != null) {
                            path.reset();
                            h.h.g.b[] bVarArr = fVar.a;
                            if (bVarArr != null) {
                                h.h.g.b.a(bVarArr, path);
                            }
                            Path path2 = gVar.a;
                            gVar.f2342b.reset();
                            if (fVar.b()) {
                                gVar.f2342b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                gVar.f2342b.addPath(path2, gVar.c);
                                canvas2.clipPath(gVar.f2342b);
                            } else {
                                c cVar = (c) fVar;
                                if (!(cVar.f2325k == 0.0f && cVar.f2326l == 1.0f)) {
                                    float f6 = cVar.f2325k;
                                    float f7 = cVar.f2327m;
                                    float f8 = (f6 + f7) % 1.0f;
                                    float f9 = (cVar.f2326l + f7) % 1.0f;
                                    if (gVar.f2343f == null) {
                                        gVar.f2343f = new PathMeasure();
                                    }
                                    gVar.f2343f.setPath(gVar.a, r11);
                                    float length = gVar.f2343f.getLength();
                                    float f10 = f8 * length;
                                    float f11 = f9 * length;
                                    path2.reset();
                                    if (f10 > f11) {
                                        gVar.f2343f.getSegment(f10, length, path2, true);
                                        gVar.f2343f.getSegment(0.0f, f11, path2, true);
                                    } else {
                                        gVar.f2343f.getSegment(f10, f11, path2, true);
                                    }
                                    path2.rLineTo(0.0f, 0.0f);
                                }
                                gVar.f2342b.addPath(path2, gVar.c);
                                h.h.f.b.a aVar = cVar.f2322h;
                                if (aVar.a() || aVar.c != 0) {
                                    h.h.f.b.a aVar2 = cVar.f2322h;
                                    if (gVar.e == null) {
                                        Paint paint = new Paint(1);
                                        gVar.e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = gVar.e;
                                    if (aVar2.a()) {
                                        Shader shader = aVar2.a;
                                        shader.setLocalMatrix(gVar.c);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cVar.f2324j * 255.0f));
                                    } else {
                                        paint2.setShader((Shader) null);
                                        paint2.setAlpha(255);
                                        paint2.setColor(g.a(aVar2.c, cVar.f2324j));
                                    }
                                    paint2.setColorFilter(colorFilter2);
                                    gVar.f2342b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas2.drawPath(gVar.f2342b, paint2);
                                }
                                h.h.f.b.a aVar3 = cVar.f2320f;
                                if (aVar3.a() || aVar3.c != 0) {
                                    h.h.f.b.a aVar4 = cVar.f2320f;
                                    if (gVar.d == null) {
                                        Paint paint3 = new Paint(1);
                                        gVar.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = gVar.d;
                                    Paint.Join join = cVar.f2329o;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cVar.f2328n;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cVar.f2330p);
                                    if (aVar4.a()) {
                                        Shader shader2 = aVar4.a;
                                        shader2.setLocalMatrix(gVar.c);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cVar.f2323i * 255.0f));
                                    } else {
                                        paint4.setShader((Shader) null);
                                        paint4.setAlpha(255);
                                        paint4.setColor(g.a(aVar4.c, cVar.f2323i));
                                    }
                                    paint4.setColorFilter(colorFilter2);
                                    paint4.setStrokeWidth(cVar.f2321g * abs * f4);
                                    canvas2.drawPath(gVar.f2342b, paint4);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    i4++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                int i5 = i2;
                int i6 = i3;
                gVar = gVar2;
                i4++;
                gVar2 = gVar;
                r11 = 0;
            }
            C0076g gVar3 = gVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2350m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f2350m = i2;
        }

        public C0076g(C0076g gVar) {
            this.c = new Matrix();
            this.f2346i = 0.0f;
            this.f2347j = 0.0f;
            this.f2348k = 0.0f;
            this.f2349l = 0.0f;
            this.f2350m = 255;
            this.f2351n = null;
            this.f2352o = null;
            h.e.a<String, Object> aVar = new h.e.a<>();
            this.f2353p = aVar;
            this.f2345h = new d(gVar.f2345h, aVar);
            this.a = new Path(gVar.a);
            this.f2342b = new Path(gVar.f2342b);
            this.f2346i = gVar.f2346i;
            this.f2347j = gVar.f2347j;
            this.f2348k = gVar.f2348k;
            this.f2349l = gVar.f2349l;
            this.f2344g = gVar.f2344g;
            this.f2350m = gVar.f2350m;
            this.f2351n = gVar.f2351n;
            String str = gVar.f2351n;
            if (str != null) {
                this.f2353p.put(str, this);
            }
            this.f2352o = gVar.f2352o;
        }
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }
}
