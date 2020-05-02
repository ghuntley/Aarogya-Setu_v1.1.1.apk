package i.b.a.n.o.c;

import android.content.Context;
import android.graphics.Bitmap;
import i.b.a.c;
import i.b.a.n.k;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.v;
import i.b.a.t.j;

/* compiled from: BitmapTransformation */
public abstract class f implements k<Bitmap> {
    public abstract Bitmap a(d dVar, Bitmap bitmap, int i2, int i3);

    public final v<Bitmap> a(Context context, v<Bitmap> vVar, int i2, int i3) {
        if (j.a(i2, i3)) {
            d dVar = c.a(context).e;
            Bitmap bitmap = vVar.get();
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getWidth();
            }
            if (i3 == Integer.MIN_VALUE) {
                i3 = bitmap.getHeight();
            }
            Bitmap a = a(dVar, bitmap, i2, i3);
            return bitmap.equals(a) ? vVar : e.a(a, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
