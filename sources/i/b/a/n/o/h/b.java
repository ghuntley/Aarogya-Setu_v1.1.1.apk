package i.b.a.n.o.h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g.a.a.b.a;
import i.b.a.n.g;
import i.b.a.n.m.v;
import i.b.a.n.o.c.t;

/* compiled from: BitmapDrawableTranscoder */
public class b implements e<Bitmap, BitmapDrawable> {
    public final Resources a;

    public b(Resources resources) {
        a.a(resources, "Argument must not be null");
        this.a = resources;
    }

    public v<BitmapDrawable> a(v<Bitmap> vVar, g gVar) {
        return t.a(this.a, vVar);
    }
}
