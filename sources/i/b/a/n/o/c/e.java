package i.b.a.n.o.c;

import android.graphics.Bitmap;
import g.a.a.b.a;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.r;
import i.b.a.n.m.v;
import i.b.a.t.j;

/* compiled from: BitmapResource */
public class e implements v<Bitmap>, r {
    public final Bitmap e;

    /* renamed from: f  reason: collision with root package name */
    public final d f2731f;

    public e(Bitmap bitmap, d dVar) {
        a.a(bitmap, "Bitmap must not be null");
        this.e = bitmap;
        a.a(dVar, "BitmapPool must not be null");
        this.f2731f = dVar;
    }

    public static e a(Bitmap bitmap, d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    public int b() {
        return j.a(this.e);
    }

    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    public void d() {
        this.f2731f.a(this.e);
    }

    public Object get() {
        return this.e;
    }

    public void a() {
        this.e.prepareToDraw();
    }
}
