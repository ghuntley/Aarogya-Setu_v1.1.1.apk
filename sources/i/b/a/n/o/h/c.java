package i.b.a.n.o.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i.b.a.n.g;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.v;
import i.b.a.n.o.c.e;

/* compiled from: DrawableBytesTranscoder */
public final class c implements e<Drawable, byte[]> {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final e<Bitmap, byte[]> f2799b;
    public final e<i.b.a.n.o.g.c, byte[]> c;

    public c(d dVar, e<Bitmap, byte[]> eVar, e<i.b.a.n.o.g.c, byte[]> eVar2) {
        this.a = dVar;
        this.f2799b = eVar;
        this.c = eVar2;
    }

    public v<byte[]> a(v<Drawable> vVar, g gVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f2799b.a(e.a(((BitmapDrawable) drawable).getBitmap(), this.a), gVar);
        }
        if (drawable instanceof i.b.a.n.o.g.c) {
            return this.c.a(vVar, gVar);
        }
        return null;
    }
}
