package i.b.a.n.o.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import i.b.a.c;
import i.b.a.n.k;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.v;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation */
public class n implements k<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final k<Bitmap> f2748b;
    public final boolean c;

    public n(k<Bitmap> kVar, boolean z) {
        this.f2748b = kVar;
        this.c = z;
    }

    public v<Drawable> a(Context context, v<Drawable> vVar, int i2, int i3) {
        d dVar = c.a(context).e;
        Drawable drawable = vVar.get();
        v<Bitmap> a = m.a(dVar, drawable, i2, i3);
        if (a != null) {
            v<Bitmap> a2 = this.f2748b.a(context, a, i2, i3);
            if (!a2.equals(a)) {
                return t.a(context.getResources(), a2);
            }
            a2.d();
            return vVar;
        } else if (!this.c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f2748b.equals(((n) obj).f2748b);
        }
        return false;
    }

    public int hashCode() {
        return this.f2748b.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        this.f2748b.a(messageDigest);
    }
}
