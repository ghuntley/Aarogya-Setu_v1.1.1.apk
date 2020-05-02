package i.b.a.n.o.e;

import android.graphics.drawable.Drawable;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;

/* compiled from: UnitDrawableDecoder */
public class e implements i<Drawable, Drawable> {
    public v a(Object obj, int i2, int i3, g gVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    public boolean a(Object obj, g gVar) {
        Drawable drawable = (Drawable) obj;
        return true;
    }
}
