package i.b.a.n.o.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g.a.a.b.a;
import i.b.a.n.m.r;
import i.b.a.n.m.v;

/* compiled from: LazyBitmapDrawableResource */
public final class t implements v<BitmapDrawable>, r {
    public final Resources e;

    /* renamed from: f  reason: collision with root package name */
    public final v<Bitmap> f2755f;

    public t(Resources resources, v<Bitmap> vVar) {
        a.a(resources, "Argument must not be null");
        this.e = resources;
        a.a(vVar, "Argument must not be null");
        this.f2755f = vVar;
    }

    public static v<BitmapDrawable> a(Resources resources, v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new t(resources, vVar);
    }

    public int b() {
        return this.f2755f.b();
    }

    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    public void d() {
        this.f2755f.d();
    }

    public Object get() {
        return new BitmapDrawable(this.e, this.f2755f.get());
    }

    public void a() {
        v<Bitmap> vVar = this.f2755f;
        if (vVar instanceof r) {
            ((r) vVar).a();
        }
    }
}
