package i.b.a.n.o.c;

import android.graphics.Bitmap;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;
import i.b.a.t.j;

/* compiled from: UnitBitmapDecoder */
public final class z implements i<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder */
    public static final class a implements v<Bitmap> {
        public final Bitmap e;

        public a(Bitmap bitmap) {
            this.e = bitmap;
        }

        public int b() {
            return j.a(this.e);
        }

        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        public void d() {
        }

        public Object get() {
            return this.e;
        }
    }

    public v a(Object obj, int i2, int i3, g gVar) {
        return new a((Bitmap) obj);
    }

    public boolean a(Object obj, g gVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
