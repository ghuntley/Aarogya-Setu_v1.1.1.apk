package i.b.a.n.o.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;
import i.b.a.n.o.e.d;

/* compiled from: ResourceBitmapDecoder */
public class w implements i<Uri, Bitmap> {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final i.b.a.n.m.b0.d f2761b;

    public w(d dVar, i.b.a.n.m.b0.d dVar2) {
        this.a = dVar;
        this.f2761b = dVar2;
    }

    public v a(Object obj, int i2, int i3, g gVar) {
        v a2 = this.a.a((Uri) obj);
        if (a2 == null) {
            return null;
        }
        return m.a(this.f2761b, (Drawable) a2.get(), i2, i3);
    }

    public boolean a(Object obj, g gVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
