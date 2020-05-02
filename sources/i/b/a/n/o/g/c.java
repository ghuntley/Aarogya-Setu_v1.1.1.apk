package i.b.a.n.o.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import h.x.a.a.b;
import i.b.a.n.k;
import i.b.a.n.o.g.g;

/* compiled from: GifDrawable */
public class c extends Drawable implements g.b, Animatable, b {
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2769f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2770g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2771h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2772i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f2773j;

    /* renamed from: k  reason: collision with root package name */
    public int f2774k = -1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2775l;

    /* renamed from: m  reason: collision with root package name */
    public Paint f2776m;

    /* renamed from: n  reason: collision with root package name */
    public Rect f2777n;

    /* compiled from: GifDrawable */
    public static final class a extends Drawable.ConstantState {
        public final g a;

        public a(g gVar) {
            this.a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, i.b.a.m.a aVar, k<Bitmap> kVar, int i2, int i3, Bitmap bitmap) {
        a aVar2 = new a(new g(i.b.a.c.a(context), aVar, i2, i3, kVar, bitmap));
        g.a.a.b.a.a(aVar2, "Argument must not be null");
        this.e = aVar2;
    }

    public void a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g.a aVar = this.e.a.f2784j;
        if ((aVar != null ? aVar.f2793i : -1) == this.e.a.a.e() - 1) {
            this.f2773j++;
        }
        int i2 = this.f2774k;
        if (i2 != -1 && this.f2773j >= i2) {
            stop();
        }
    }

    public Bitmap b() {
        return this.e.a.f2787m;
    }

    public final Paint c() {
        if (this.f2776m == null) {
            this.f2776m = new Paint(2);
        }
        return this.f2776m;
    }

    public final void d() {
        g.a.a.b.a.a(!this.f2771h, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.e.a.a.e() == 1) {
            invalidateSelf();
        } else if (!this.f2769f) {
            this.f2769f = true;
            g gVar = this.e.a;
            if (gVar.f2785k) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!gVar.c.contains(this)) {
                boolean isEmpty = gVar.c.isEmpty();
                gVar.c.add(this);
                if (isEmpty && !gVar.f2780f) {
                    gVar.f2780f = true;
                    gVar.f2785k = false;
                    gVar.a();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f2771h) {
            if (this.f2775l) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f2777n == null) {
                    this.f2777n = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f2777n);
                this.f2775l = false;
            }
            g gVar = this.e.a;
            g.a aVar = gVar.f2784j;
            if (aVar != null) {
                bitmap = aVar.f2795k;
            } else {
                bitmap = gVar.f2787m;
            }
            if (this.f2777n == null) {
                this.f2777n = new Rect();
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.f2777n, c());
        }
    }

    public final void e() {
        this.f2769f = false;
        g gVar = this.e.a;
        gVar.c.remove(this);
        if (gVar.c.isEmpty()) {
            gVar.f2780f = false;
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    public int getIntrinsicHeight() {
        return this.e.a.f2791q;
    }

    public int getIntrinsicWidth() {
        return this.e.a.f2790p;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f2769f;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2775l = true;
    }

    public void setAlpha(int i2) {
        c().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        g.a.a.b.a.a(!this.f2771h, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f2772i = z;
        if (!z) {
            e();
        } else if (this.f2770g) {
            d();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f2770g = true;
        this.f2773j = 0;
        if (this.f2772i) {
            d();
        }
    }

    public void stop() {
        this.f2770g = false;
        e();
    }

    public c(a aVar) {
        g.a.a.b.a.a(aVar, "Argument must not be null");
        this.e = aVar;
    }
}
