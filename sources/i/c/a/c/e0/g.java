package i.c.a.c.e0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import i.c.a.b.d.l.q;
import i.c.a.c.e0.k;
import i.c.a.c.e0.m;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: MaterialShapeDrawable */
public class g extends Drawable implements h.h.g.j.a, n {
    public static final String A = g.class.getSimpleName();
    public static final Paint B = new Paint(1);
    public b e;

    /* renamed from: f  reason: collision with root package name */
    public final m.f[] f4047f;

    /* renamed from: g  reason: collision with root package name */
    public final m.f[] f4048g;

    /* renamed from: h  reason: collision with root package name */
    public final BitSet f4049h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4050i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f4051j;

    /* renamed from: k  reason: collision with root package name */
    public final Path f4052k;

    /* renamed from: l  reason: collision with root package name */
    public final Path f4053l;

    /* renamed from: m  reason: collision with root package name */
    public final RectF f4054m;

    /* renamed from: n  reason: collision with root package name */
    public final RectF f4055n;

    /* renamed from: o  reason: collision with root package name */
    public final Region f4056o;

    /* renamed from: p  reason: collision with root package name */
    public final Region f4057p;

    /* renamed from: q  reason: collision with root package name */
    public j f4058q;
    public final Paint r;
    public final Paint s;
    public final i.c.a.c.d0.a t;
    public final k.a u;
    public final k v;
    public PorterDuffColorFilter w;
    public PorterDuffColorFilter x;
    public final RectF y;
    public boolean z;

    /* compiled from: MaterialShapeDrawable */
    public class a implements k.a {
        public a() {
        }
    }

    public g() {
        this(new j());
    }

    public static g a(Context context, float f2) {
        int a2 = q.a(context, i.c.a.c.b.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.e.f4059b = new i.c.a.c.w.a(context);
        gVar.i();
        gVar.a(ColorStateList.valueOf(a2));
        b bVar = gVar.e;
        if (bVar.f4069o != f2) {
            bVar.f4069o = f2;
            gVar.i();
        }
        return gVar;
    }

    public void b(ColorStateList colorStateList) {
        b bVar = this.e;
        if (bVar.e != colorStateList) {
            bVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public int c() {
        b bVar = this.e;
        return (int) (Math.sin(Math.toRadians((double) bVar.t)) * ((double) bVar.s));
    }

    public int d() {
        b bVar = this.e;
        return (int) (Math.cos(Math.toRadians((double) bVar.t)) * ((double) bVar.s));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        if ((!r2.a.a(b()) && !r13.f4052k.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            android.graphics.Paint r0 = r13.r
            android.graphics.PorterDuffColorFilter r1 = r13.w
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r13.r
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r13.r
            i.c.a.c.e0.g$b r2 = r13.e
            int r2 = r2.f4067m
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r13.s
            android.graphics.PorterDuffColorFilter r2 = r13.x
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r13.s
            i.c.a.c.e0.g$b r2 = r13.e
            float r2 = r2.f4066l
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r13.s
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r13.s
            i.c.a.c.e0.g$b r3 = r13.e
            int r3 = r3.f4067m
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r13.f4050i
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x00c8
            float r2 = r13.e()
            float r2 = -r2
            i.c.a.c.e0.g$b r5 = r13.e
            i.c.a.c.e0.j r5 = r5.a
            if (r5 == 0) goto L_0x00c7
            i.c.a.c.e0.j$b r6 = new i.c.a.c.e0.j$b
            r6.<init>(r5)
            i.c.a.c.e0.c r7 = r5.e
            boolean r8 = r7 instanceof i.c.a.c.e0.h
            if (r8 == 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            i.c.a.c.e0.b r8 = new i.c.a.c.e0.b
            r8.<init>(r2, r7)
            r7 = r8
        L_0x0066:
            r6.e = r7
            i.c.a.c.e0.c r7 = r5.f4073f
            boolean r8 = r7 instanceof i.c.a.c.e0.h
            if (r8 == 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            i.c.a.c.e0.b r8 = new i.c.a.c.e0.b
            r8.<init>(r2, r7)
            r7 = r8
        L_0x0075:
            r6.f4081f = r7
            i.c.a.c.e0.c r7 = r5.f4075h
            boolean r8 = r7 instanceof i.c.a.c.e0.h
            if (r8 == 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            i.c.a.c.e0.b r8 = new i.c.a.c.e0.b
            r8.<init>(r2, r7)
            r7 = r8
        L_0x0084:
            r6.f4083h = r7
            i.c.a.c.e0.c r5 = r5.f4074g
            boolean r7 = r5 instanceof i.c.a.c.e0.h
            if (r7 == 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            i.c.a.c.e0.b r7 = new i.c.a.c.e0.b
            r7.<init>(r2, r5)
            r5 = r7
        L_0x0093:
            r6.f4082g = r5
            i.c.a.c.e0.j r8 = r6.a()
            r13.f4058q = r8
            i.c.a.c.e0.k r7 = r13.v
            i.c.a.c.e0.g$b r2 = r13.e
            float r9 = r2.f4065k
            android.graphics.RectF r2 = r13.f4055n
            android.graphics.RectF r5 = r13.b()
            r2.set(r5)
            float r2 = r13.e()
            android.graphics.RectF r5 = r13.f4055n
            r5.inset(r2, r2)
            android.graphics.RectF r10 = r13.f4055n
            android.graphics.Path r12 = r13.f4053l
            r11 = 0
            r7.a(r8, r9, r10, r11, r12)
            android.graphics.RectF r2 = r13.b()
            android.graphics.Path r5 = r13.f4052k
            r13.a((android.graphics.RectF) r2, (android.graphics.Path) r5)
            r13.f4050i = r3
            goto L_0x00c8
        L_0x00c7:
            throw r4
        L_0x00c8:
            i.c.a.c.e0.g$b r2 = r13.e
            int r5 = r2.f4071q
            r6 = 2
            r7 = 1
            if (r5 == r7) goto L_0x00f7
            int r8 = r2.r
            if (r8 <= 0) goto L_0x00f7
            if (r5 == r6) goto L_0x00f5
            i.c.a.c.e0.j r2 = r2.a
            android.graphics.RectF r5 = r13.b()
            boolean r2 = r2.a((android.graphics.RectF) r5)
            if (r2 != 0) goto L_0x00f2
            android.graphics.Path r2 = r13.f4052k
            boolean r2 = r2.isConvex()
            if (r2 != 0) goto L_0x00f2
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r2 >= r5) goto L_0x00f2
            r2 = 1
            goto L_0x00f3
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            if (r2 == 0) goto L_0x00f7
        L_0x00f5:
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            if (r2 != 0) goto L_0x00fc
            goto L_0x0191
        L_0x00fc:
            r14.save()
            int r2 = r13.c()
            int r5 = r13.d()
            float r2 = (float) r2
            float r5 = (float) r5
            r14.translate(r2, r5)
            boolean r2 = r13.z
            if (r2 != 0) goto L_0x0117
            r13.a((android.graphics.Canvas) r14)
            r14.restore()
            goto L_0x0191
        L_0x0117:
            android.graphics.RectF r2 = r13.y
            float r2 = r2.width()
            android.graphics.Rect r5 = r13.getBounds()
            int r5 = r5.width()
            float r5 = (float) r5
            float r2 = r2 - r5
            int r2 = (int) r2
            android.graphics.RectF r5 = r13.y
            float r5 = r5.height()
            android.graphics.Rect r8 = r13.getBounds()
            int r8 = r8.height()
            float r8 = (float) r8
            float r5 = r5 - r8
            int r5 = (int) r5
            if (r2 < 0) goto L_0x01e1
            if (r5 < 0) goto L_0x01e1
            android.graphics.RectF r8 = r13.y
            float r8 = r8.width()
            int r8 = (int) r8
            i.c.a.c.e0.g$b r9 = r13.e
            int r9 = r9.r
            int r9 = r9 * 2
            int r9 = r9 + r8
            int r9 = r9 + r2
            android.graphics.RectF r8 = r13.y
            float r8 = r8.height()
            int r8 = (int) r8
            i.c.a.c.e0.g$b r10 = r13.e
            int r10 = r10.r
            int r10 = r10 * 2
            int r10 = r10 + r8
            int r10 = r10 + r5
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r10, r6)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r6)
            android.graphics.Rect r9 = r13.getBounds()
            int r9 = r9.left
            i.c.a.c.e0.g$b r10 = r13.e
            int r10 = r10.r
            int r9 = r9 - r10
            int r9 = r9 - r2
            float r2 = (float) r9
            android.graphics.Rect r9 = r13.getBounds()
            int r9 = r9.top
            i.c.a.c.e0.g$b r10 = r13.e
            int r10 = r10.r
            int r9 = r9 - r10
            int r9 = r9 - r5
            float r5 = (float) r9
            float r9 = -r2
            float r10 = -r5
            r8.translate(r9, r10)
            r13.a((android.graphics.Canvas) r8)
            r14.drawBitmap(r6, r2, r5, r4)
            r6.recycle()
            r14.restore()
        L_0x0191:
            i.c.a.c.e0.g$b r2 = r13.e
            android.graphics.Paint$Style r2 = r2.v
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r2 == r4) goto L_0x019d
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            if (r2 != r4) goto L_0x019e
        L_0x019d:
            r3 = 1
        L_0x019e:
            if (r3 == 0) goto L_0x01b1
            android.graphics.Paint r6 = r13.r
            android.graphics.Path r7 = r13.f4052k
            i.c.a.c.e0.g$b r2 = r13.e
            i.c.a.c.e0.j r8 = r2.a
            android.graphics.RectF r9 = r13.b()
            r4 = r13
            r5 = r14
            r4.a(r5, r6, r7, r8, r9)
        L_0x01b1:
            boolean r2 = r13.g()
            if (r2 == 0) goto L_0x01d6
            android.graphics.Paint r5 = r13.s
            android.graphics.Path r6 = r13.f4053l
            i.c.a.c.e0.j r7 = r13.f4058q
            android.graphics.RectF r2 = r13.f4055n
            android.graphics.RectF r3 = r13.b()
            r2.set(r3)
            float r2 = r13.e()
            android.graphics.RectF r3 = r13.f4055n
            r3.inset(r2, r2)
            android.graphics.RectF r8 = r13.f4055n
            r3 = r13
            r4 = r14
            r3.a(r4, r5, r6, r7, r8)
        L_0x01d6:
            android.graphics.Paint r14 = r13.r
            r14.setAlpha(r0)
            android.graphics.Paint r14 = r13.s
            r14.setAlpha(r1)
            return
        L_0x01e1:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.e0.g.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        if (g()) {
            return this.s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float f() {
        return this.e.a.e.a(b());
    }

    public final boolean g() {
        Paint.Style style = this.e.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.s.getStrokeWidth() > 0.0f;
    }

    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.e;
        if (bVar.f4071q != 2) {
            if (bVar.a.a(b())) {
                outline.setRoundRect(getBounds(), f() * this.e.f4065k);
                return;
            }
            a(b(), this.f4052k);
            if (this.f4052k.isConvex() || Build.VERSION.SDK_INT >= 29) {
                outline.setConvexPath(this.f4052k);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.e.f4063i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f4056o.set(getBounds());
        a(b(), this.f4052k);
        this.f4057p.setPath(this.f4052k, this.f4056o);
        this.f4056o.op(this.f4057p, Region.Op.DIFFERENCE);
        return this.f4056o;
    }

    public final boolean h() {
        PorterDuffColorFilter porterDuffColorFilter = this.w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.x;
        b bVar = this.e;
        this.w = a(bVar.f4061g, bVar.f4062h, this.r, true);
        b bVar2 = this.e;
        this.x = a(bVar2.f4060f, bVar2.f4062h, this.s, false);
        b bVar3 = this.e;
        if (bVar3.u) {
            this.t.a(bVar3.f4061g.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.w) || !Objects.equals(porterDuffColorFilter2, this.x)) {
            return true;
        }
        return false;
    }

    public final void i() {
        b bVar = this.e;
        float f2 = bVar.f4069o + bVar.f4070p;
        bVar.r = (int) Math.ceil((double) (0.75f * f2));
        this.e.s = (int) Math.ceil((double) (f2 * 0.25f));
        h();
        super.invalidateSelf();
    }

    public void invalidateSelf() {
        this.f4050i = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.e.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.e.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.e.f4061g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.e.f4060f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            i.c.a.c.e0.g$b r0 = r1.e
            android.content.res.ColorStateList r0 = r0.f4061g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            i.c.a.c.e0.g$b r0 = r1.e
            android.content.res.ColorStateList r0 = r0.f4060f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            i.c.a.c.e0.g$b r0 = r1.e
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            i.c.a.c.e0.g$b r0 = r1.e
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.e0.g.isStateful():boolean");
    }

    public Drawable mutate() {
        this.e = new b(this.e);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        this.f4050i = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2 = a(iArr) || h();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public void setAlpha(int i2) {
        b bVar = this.e;
        if (bVar.f4067m != i2) {
            bVar.f4067m = i2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.c = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(j jVar) {
        this.e.a = jVar;
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.e.f4061g = colorStateList;
        h();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.e;
        if (bVar.f4062h != mode) {
            bVar.f4062h = mode;
            h();
            super.invalidateSelf();
        }
    }

    public g(j jVar) {
        this(new b(jVar, (i.c.a.c.w.a) null));
    }

    public g(b bVar) {
        this.f4047f = new m.f[4];
        this.f4048g = new m.f[4];
        this.f4049h = new BitSet(8);
        this.f4051j = new Matrix();
        this.f4052k = new Path();
        this.f4053l = new Path();
        this.f4054m = new RectF();
        this.f4055n = new RectF();
        this.f4056o = new Region();
        this.f4057p = new Region();
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.t = new i.c.a.c.d0.a();
        this.v = new k();
        this.y = new RectF();
        this.z = true;
        this.e = bVar;
        this.s.setStyle(Paint.Style.STROKE);
        this.r.setStyle(Paint.Style.FILL);
        B.setColor(-1);
        B.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        h();
        a(getState());
        this.u = new a();
    }

    public RectF b() {
        this.f4054m.set(getBounds());
        return this.f4054m;
    }

    public void b(float f2) {
        b bVar = this.e;
        if (bVar.f4065k != f2) {
            bVar.f4065k = f2;
            this.f4050i = true;
            invalidateSelf();
        }
    }

    public final void b(RectF rectF, Path path) {
        k kVar = this.v;
        b bVar = this.e;
        j jVar = bVar.a;
        float f2 = bVar.f4065k;
        kVar.a(jVar, f2, rectF, this.u, path);
    }

    public void a(ColorStateList colorStateList) {
        b bVar = this.e;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void a(float f2, int i2) {
        this.e.f4066l = f2;
        invalidateSelf();
        b(ColorStateList.valueOf(i2));
    }

    public void a(float f2, ColorStateList colorStateList) {
        this.e.f4066l = f2;
        invalidateSelf();
        b(colorStateList);
    }

    public void a(Context context) {
        this.e.f4059b = new i.c.a.c.w.a(context);
        i();
    }

    /* compiled from: MaterialShapeDrawable */
    public static final class b extends Drawable.ConstantState {
        public j a;

        /* renamed from: b  reason: collision with root package name */
        public i.c.a.c.w.a f4059b;
        public ColorFilter c;
        public ColorStateList d = null;
        public ColorStateList e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f4060f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f4061g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f4062h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f4063i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f4064j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f4065k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f4066l;

        /* renamed from: m  reason: collision with root package name */
        public int f4067m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f4068n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f4069o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public float f4070p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f4071q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public b(j jVar, i.c.a.c.w.a aVar) {
            this.a = jVar;
            this.f4059b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f4050i = true;
            return gVar;
        }

        public b(b bVar) {
            this.a = bVar.a;
            this.f4059b = bVar.f4059b;
            this.f4066l = bVar.f4066l;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f4062h = bVar.f4062h;
            this.f4061g = bVar.f4061g;
            this.f4067m = bVar.f4067m;
            this.f4064j = bVar.f4064j;
            this.s = bVar.s;
            this.f4071q = bVar.f4071q;
            this.u = bVar.u;
            this.f4065k = bVar.f4065k;
            this.f4068n = bVar.f4068n;
            this.f4069o = bVar.f4069o;
            this.f4070p = bVar.f4070p;
            this.r = bVar.r;
            this.t = bVar.t;
            this.f4060f = bVar.f4060f;
            this.v = bVar.v;
            if (bVar.f4063i != null) {
                this.f4063i = new Rect(bVar.f4063i);
            }
        }
    }

    public final int a(int i2) {
        b bVar = this.e;
        float f2 = bVar.f4069o + bVar.f4070p + bVar.f4068n;
        i.c.a.c.w.a aVar = bVar.f4059b;
        if (aVar == null || !aVar.a) {
            return i2;
        }
        if (!(h.h.g.a.b(i2, 255) == aVar.c)) {
            return i2;
        }
        float f3 = aVar.d;
        float f4 = 0.0f;
        if (f3 > 0.0f && f2 > 0.0f) {
            f4 = Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return h.h.g.a.b(q.a(h.h.g.a.b(i2, 255), aVar.f4239b, f4), Color.alpha(i2));
    }

    public void a(float f2) {
        b bVar = this.e;
        if (bVar.f4069o != f2) {
            bVar.f4069o = f2;
            i();
        }
    }

    public final void a(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (jVar.a(rectF)) {
            float a2 = jVar.f4073f.a(rectF) * this.e.f4065k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void a(Canvas canvas) {
        if (this.f4049h.cardinality() > 0) {
            Log.w(A, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.e.s != 0) {
            canvas.drawPath(this.f4052k, this.t.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f4047f[i2].a(m.f.a, this.t, this.e.r, canvas);
            this.f4048g[i2].a(m.f.a, this.t, this.e.r, canvas);
        }
        if (this.z) {
            int c = c();
            int d = d();
            canvas.translate((float) (-c), (float) (-d));
            canvas.drawPath(this.f4052k, B);
            canvas.translate((float) c, (float) d);
        }
    }

    public final void a(RectF rectF, Path path) {
        b(rectF, path);
        if (this.e.f4064j != 1.0f) {
            this.f4051j.reset();
            Matrix matrix = this.f4051j;
            float f2 = this.e.f4064j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4051j);
        }
        path.computeBounds(this.y, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
        r3 = a(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.a((int) r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.a((int) r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.e0.g.a(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final boolean a(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.e.d == null || (color2 = this.r.getColor()) == (colorForState2 = this.e.d.getColorForState(iArr, color2))) {
            z2 = false;
        } else {
            this.r.setColor(colorForState2);
            z2 = true;
        }
        if (this.e.e == null || (color = this.s.getColor()) == (colorForState = this.e.e.getColorForState(iArr, color))) {
            return z2;
        }
        this.s.setColor(colorForState);
        return true;
    }
}
