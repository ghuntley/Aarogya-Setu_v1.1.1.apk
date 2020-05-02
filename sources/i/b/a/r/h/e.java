package i.b.a.r.h;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import i.b.a.r.i.b;

/* compiled from: ImageViewTarget */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: h  reason: collision with root package name */
    public Animatable f2853h;

    public e(ImageView imageView) {
        super(imageView);
    }

    public void a(Drawable drawable) {
        b((Object) null);
        ((ImageView) this.e).setImageDrawable(drawable);
    }

    public abstract void a(Z z);

    public void b(Drawable drawable) {
        b((Object) null);
        ((ImageView) this.e).setImageDrawable(drawable);
    }

    public void c() {
        Animatable animatable = this.f2853h;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void a(Z z, b<? super Z> bVar) {
        b(z);
    }

    public final void b(Z z) {
        a(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f2853h = animatable;
            animatable.start();
            return;
        }
        this.f2853h = null;
    }

    public void c(Drawable drawable) {
        this.f2855f.a();
        Animatable animatable = this.f2853h;
        if (animatable != null) {
            animatable.stop();
        }
        b((Object) null);
        ((ImageView) this.e).setImageDrawable(drawable);
    }

    public void a() {
        Animatable animatable = this.f2853h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
