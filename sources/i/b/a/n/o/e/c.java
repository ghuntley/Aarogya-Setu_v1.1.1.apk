package i.b.a.n.o.e;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource */
public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    public int b() {
        return Math.max(1, this.e.getIntrinsicHeight() * this.e.getIntrinsicWidth() * 4);
    }

    public Class<Drawable> c() {
        return this.e.getClass();
    }

    public void d() {
    }
}
