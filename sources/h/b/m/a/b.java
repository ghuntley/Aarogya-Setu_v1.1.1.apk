package h.b.m.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import h.b.m.a.d;

/* compiled from: DrawableContainer */
public class b extends Drawable implements Drawable.Callback {
    public c e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f1183f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1184g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1185h;

    /* renamed from: i  reason: collision with root package name */
    public int f1186i = 255;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1187j;

    /* renamed from: k  reason: collision with root package name */
    public int f1188k = -1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1189l;

    /* renamed from: m  reason: collision with root package name */
    public Runnable f1190m;

    /* renamed from: n  reason: collision with root package name */
    public long f1191n;

    /* renamed from: o  reason: collision with root package name */
    public long f1192o;

    /* renamed from: p  reason: collision with root package name */
    public C0034b f1193p;

    /* compiled from: DrawableContainer */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b.m.a.b$b  reason: collision with other inner class name */
    /* compiled from: DrawableContainer */
    public static class C0034b implements Drawable.Callback {
        public Drawable.Callback e;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public c a() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f1188k
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b.m.a.b$c r0 = r9.e
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f1185h
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f1184g
            if (r0 == 0) goto L_0x0029
            r9.f1185h = r0
            h.b.m.a.b$c r0 = r9.e
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f1192o = r0
            goto L_0x0035
        L_0x0029:
            r9.f1185h = r4
            r9.f1192o = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f1184g
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            h.b.m.a.b$c r0 = r9.e
            int r1 = r0.f1197h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.a((int) r10)
            r9.f1184g = r0
            r9.f1188k = r10
            if (r0 == 0) goto L_0x005a
            h.b.m.a.b$c r10 = r9.e
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f1191n = r2
        L_0x0051:
            r9.a((android.graphics.drawable.Drawable) r0)
            goto L_0x005a
        L_0x0055:
            r9.f1184g = r4
            r10 = -1
            r9.f1188k = r10
        L_0x005a:
            long r0 = r9.f1191n
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f1192o
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f1190m
            if (r0 != 0) goto L_0x0073
            h.b.m.a.b$a r0 = new h.b.m.a.b$a
            r0.<init>()
            r9.f1190m = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a((boolean) r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.m.a.b.a(int):boolean");
    }

    public boolean canApplyTheme() {
        return this.e.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1185h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f1186i;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.e.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.e.a()) {
            return null;
        }
        this.e.d = getChangingConfigurations();
        return this.e;
    }

    public Drawable getCurrent() {
        return this.f1184g;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1183f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        c cVar = this.e;
        if (cVar.f1201l) {
            if (!cVar.f1202m) {
                cVar.b();
            }
            return cVar.f1204o;
        }
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        c cVar = this.e;
        if (cVar.f1201l) {
            if (!cVar.f1202m) {
                cVar.b();
            }
            return cVar.f1203n;
        }
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        c cVar = this.e;
        if (cVar.f1201l) {
            if (!cVar.f1202m) {
                cVar.b();
            }
            return cVar.f1206q;
        }
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        c cVar = this.e;
        if (cVar.f1201l) {
            if (!cVar.f1202m) {
                cVar.b();
            }
            return cVar.f1205p;
        }
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f1184g;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.e;
        if (cVar.r) {
            return cVar.s;
        }
        cVar.c();
        int i3 = cVar.f1197h;
        Drawable[] drawableArr = cVar.f1196g;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        for (int i4 = 1; i4 < i3; i4++) {
            i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
        }
        cVar.s = i2;
        cVar.r = true;
        return i2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        c cVar = this.e;
        Rect rect2 = null;
        boolean z2 = true;
        if (!cVar.f1198i) {
            if (cVar.f1200k != null || cVar.f1199j) {
                rect2 = cVar.f1200k;
            } else {
                cVar.c();
                Rect rect3 = new Rect();
                int i2 = cVar.f1197h;
                Drawable[] drawableArr = cVar.f1196g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect3)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect3.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect3.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect3.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect3.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                cVar.f1199j = true;
                cVar.f1200k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f1184g;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (!this.e.C || g.a.a.b.a.b((Drawable) this) != 1) {
            z2 = false;
        }
        if (z2) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.r = false;
            cVar.t = false;
        }
        if (drawable == this.f1184g && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.e.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1185h;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1185h = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1184g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1187j) {
                this.f1184g.setAlpha(this.f1186i);
            }
        }
        if (this.f1192o != 0) {
            this.f1192o = 0;
            z = true;
        }
        if (this.f1191n != 0) {
            this.f1191n = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f1189l && super.mutate() == this) {
            c a2 = a();
            a2.d();
            a(a2);
            this.f1189l = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1185h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1184g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        c cVar = this.e;
        int i3 = this.f1188k;
        int i4 = cVar.f1197h;
        Drawable[] drawableArr = cVar.f1196g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                if (i5 == i3) {
                    z = layoutDirection;
                }
            }
        }
        cVar.z = i2;
        return z;
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f1185h;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f1184g;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f1184g && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f1187j || this.f1186i != i2) {
            this.f1187j = true;
            this.f1186i = i2;
            Drawable drawable = this.f1184g;
            if (drawable == null) {
                return;
            }
            if (this.f1191n == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        c cVar = this.e;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f1184g;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.e;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f1184g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        c cVar = this.e;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f1184g;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f1183f;
        if (rect == null) {
            this.f1183f = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f1184g;
        if (drawable != null) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.e;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            g.a.a.b.a.a(this.f1184g, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.e;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            g.a.a.b.a.a(this.f1184g, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1185h;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1184g;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f1184g && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* compiled from: DrawableContainer */
    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final b a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f1194b;
        public int c = 160;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f1195f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f1196g;

        /* renamed from: h  reason: collision with root package name */
        public int f1197h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1198i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1199j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f1200k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1201l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1202m;

        /* renamed from: n  reason: collision with root package name */
        public int f1203n;

        /* renamed from: o  reason: collision with root package name */
        public int f1204o;

        /* renamed from: p  reason: collision with root package name */
        public int f1205p;

        /* renamed from: q  reason: collision with root package name */
        public int f1206q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            this.f1198i = false;
            this.f1201l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f1194b : null;
            }
            this.f1194b = resources2;
            int a2 = b.a(resources, cVar != null ? cVar.c : 0);
            this.c = a2;
            if (cVar != null) {
                this.d = cVar.d;
                this.e = cVar.e;
                this.v = true;
                this.w = true;
                this.f1198i = cVar.f1198i;
                this.f1201l = cVar.f1201l;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.c == a2) {
                    if (cVar.f1199j) {
                        this.f1200k = new Rect(cVar.f1200k);
                        this.f1199j = true;
                    }
                    if (cVar.f1202m) {
                        this.f1203n = cVar.f1203n;
                        this.f1204o = cVar.f1204o;
                        this.f1205p = cVar.f1205p;
                        this.f1206q = cVar.f1206q;
                        this.f1202m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.f1196g;
                this.f1196g = new Drawable[drawableArr.length];
                this.f1197h = cVar.f1197h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f1195f;
                if (sparseArray != null) {
                    this.f1195f = sparseArray.clone();
                } else {
                    this.f1195f = new SparseArray<>(this.f1197h);
                }
                int i2 = this.f1197h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f1195f.put(i3, constantState);
                        } else {
                            this.f1196g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f1196g = new Drawable[10];
            this.f1197h = 0;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f1197h;
            if (i2 >= this.f1196g.length) {
                int i3 = i2 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i3];
                System.arraycopy(aVar.f1196g, 0, drawableArr, 0, i2);
                aVar.f1196g = drawableArr;
                int[][] iArr = new int[i3][];
                System.arraycopy(aVar.J, 0, iArr, 0, i2);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f1196g[i2] = drawable;
            this.f1197h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            this.r = false;
            this.t = false;
            this.f1200k = null;
            this.f1199j = false;
            this.f1202m = false;
            this.v = false;
            return i2;
        }

        public void b() {
            this.f1202m = true;
            c();
            int i2 = this.f1197h;
            Drawable[] drawableArr = this.f1196g;
            this.f1204o = -1;
            this.f1203n = -1;
            this.f1206q = 0;
            this.f1205p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1203n) {
                    this.f1203n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1204o) {
                    this.f1204o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1205p) {
                    this.f1205p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1206q) {
                    this.f1206q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1195f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f1195f.keyAt(i2);
                    Drawable[] drawableArr = this.f1196g;
                    Drawable newDrawable = this.f1195f.valueAt(i2).newDrawable(this.f1194b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        newDrawable.setLayoutDirection(this.z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.a);
                    drawableArr[keyAt] = mutate;
                }
                this.f1195f = null;
            }
        }

        public boolean canApplyTheme() {
            int i2 = this.f1197h;
            Drawable[] drawableArr = this.f1196g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1195f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public abstract void d();

        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Drawable a(int i2) {
            int indexOfKey;
            Drawable drawable = this.f1196g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1195f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f1195f.valueAt(indexOfKey).newDrawable(this.f1194b);
            if (Build.VERSION.SDK_INT >= 23) {
                newDrawable.setLayoutDirection(this.z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.a);
            this.f1196g[i2] = mutate;
            this.f1195f.removeAt(indexOfKey);
            if (this.f1195f.size() == 0) {
                this.f1195f = null;
            }
            return mutate;
        }

        public final void a(Resources resources) {
            if (resources != null) {
                this.f1194b = resources;
                int a2 = b.a(resources, this.c);
                int i2 = this.c;
                this.c = a2;
                if (i2 != a2) {
                    this.f1202m = false;
                    this.f1199j = false;
                }
            }
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            c();
            this.v = true;
            int i2 = this.f1197h;
            Drawable[] drawableArr = this.f1196g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }
    }

    public final void a(Drawable drawable) {
        if (this.f1193p == null) {
            this.f1193p = new C0034b();
        }
        C0034b bVar = this.f1193p;
        bVar.e = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.e.A <= 0 && this.f1187j) {
                drawable.setAlpha(this.f1186i);
            }
            if (this.e.E) {
                drawable.setColorFilter(this.e.D);
            } else {
                if (this.e.H) {
                    drawable.setTintList(this.e.F);
                }
                if (this.e.I) {
                    drawable.setTintMode(this.e.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.e.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.e.C);
            Rect rect = this.f1183f;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0034b bVar2 = this.f1193p;
            Drawable.Callback callback = bVar2.e;
            bVar2.e = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f1187j = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f1184g
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f1191n
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f1186i
            r3.setAlpha(r9)
            r13.f1191n = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            h.b.m.a.b$c r9 = r13.e
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f1186i
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f1191n = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f1185h
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f1192o
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f1185h = r0
            r13.f1192o = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b.m.a.b$c r4 = r13.e
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f1186i
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f1192o = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f1190m
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.m.a.b.a(boolean):void");
    }

    public void a(c cVar) {
        this.e = cVar;
        int i2 = this.f1188k;
        if (i2 >= 0) {
            Drawable a2 = cVar.a(i2);
            this.f1184g = a2;
            if (a2 != null) {
                a(a2);
            }
        }
        this.f1185h = null;
    }

    public static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }
}
