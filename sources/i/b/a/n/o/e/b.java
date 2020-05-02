package i.b.a.n.o.e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g.a.a.b.a;
import i.b.a.n.m.r;
import i.b.a.n.m.v;
import i.b.a.n.o.g.c;

/* compiled from: DrawableResource */
public abstract class b<T extends Drawable> implements v<T>, r {
    public final T e;

    public b(T t) {
        a.a(t, "Argument must not be null");
        this.e = t;
    }

    public void a() {
        T t = this.e;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof c) {
            ((c) t).b().prepareToDraw();
        }
    }

    public Object get() {
        Drawable.ConstantState constantState = this.e.getConstantState();
        if (constantState == null) {
            return this.e;
        }
        return constantState.newDrawable();
    }
}
