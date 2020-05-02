package i.b.a.n.o.g;

import android.content.Context;
import android.graphics.Bitmap;
import g.a.a.b.a;
import i.b.a.c;
import i.b.a.n.k;
import i.b.a.n.m.v;
import i.b.a.n.o.c.e;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation */
public class f implements k<c> {

    /* renamed from: b  reason: collision with root package name */
    public final k<Bitmap> f2778b;

    public f(k<Bitmap> kVar) {
        a.a(kVar, "Argument must not be null");
        this.f2778b = kVar;
    }

    public v<c> a(Context context, v<c> vVar, int i2, int i3) {
        c cVar = vVar.get();
        e eVar = new e(cVar.b(), c.a(context).e);
        v<Bitmap> a = this.f2778b.a(context, eVar, i2, i3);
        if (!eVar.equals(a)) {
            eVar.d();
        }
        k<Bitmap> kVar = this.f2778b;
        cVar.e.a.a(kVar, a.get());
        return vVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f2778b.equals(((f) obj).f2778b);
        }
        return false;
    }

    public int hashCode() {
        return this.f2778b.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        this.f2778b.a(messageDigest);
    }
}
