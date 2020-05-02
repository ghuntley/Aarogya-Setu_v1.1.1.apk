package i.b.a.n.o.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import i.b.a.n.c;
import i.b.a.n.g;
import i.b.a.n.j;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.v;
import java.io.File;

/* compiled from: BitmapDrawableEncoder */
public class b implements j<BitmapDrawable> {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final j<Bitmap> f2728b;

    public b(d dVar, j<Bitmap> jVar) {
        this.a = dVar;
        this.f2728b = jVar;
    }

    public boolean a(Object obj, File file, g gVar) {
        return this.f2728b.a(new e(((BitmapDrawable) ((v) obj).get()).getBitmap(), this.a), file, gVar);
    }

    public c a(g gVar) {
        return this.f2728b.a(gVar);
    }
}
