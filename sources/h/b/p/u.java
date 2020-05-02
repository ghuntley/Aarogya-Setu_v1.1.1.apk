package h.b.p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import g.a.a.b.a;
import h.b.j;
import h.h.m.m;

/* compiled from: AppCompatSeekBarHelper */
public class u extends q {
    public final SeekBar d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1471f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1472g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1473h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1474i = false;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        x0 a = x0.a(this.d.getContext(), attributeSet, j.AppCompatSeekBar, i2, 0);
        SeekBar seekBar = this.d;
        m.a(seekBar, seekBar.getContext(), j.AppCompatSeekBar, attributeSet, a.f1492b, i2, 0);
        Drawable c = a.c(j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.d.setThumb(c);
        }
        Drawable b2 = a.b(j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.e = b2;
        if (b2 != null) {
            b2.setCallback(this.d);
            a.a(b2, m.k(this.d));
            if (b2.isStateful()) {
                b2.setState(this.d.getDrawableState());
            }
            a();
        }
        this.d.invalidate();
        if (a.f(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1472g = e0.a(a.d(j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1472g);
            this.f1474i = true;
        }
        if (a.f(j.AppCompatSeekBar_tickMarkTint)) {
            this.f1471f = a.a(j.AppCompatSeekBar_tickMarkTint);
            this.f1473h = true;
        }
        a.f1492b.recycle();
        a();
    }

    public final void a() {
        if (this.e == null) {
            return;
        }
        if (this.f1473h || this.f1474i) {
            Drawable c = a.c(this.e.mutate());
            this.e = c;
            if (this.f1473h) {
                c.setTintList(this.f1471f);
            }
            if (this.f1474i) {
                this.e.setTintMode(this.f1472g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    public void a(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.d.getPaddingLeft(), (float) (this.d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
