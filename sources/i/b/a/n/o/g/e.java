package i.b.a.n.o.g;

import android.graphics.Bitmap;
import i.b.a.n.m.r;
import i.b.a.n.o.e.b;
import i.b.a.n.o.g.g;
import i.b.a.r.h.h;

/* compiled from: GifDrawableResource */
public class e extends b<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    public void a() {
        ((c) this.e).b().prepareToDraw();
    }

    public int b() {
        g gVar = ((c) this.e).e.a;
        return gVar.a.b() + gVar.f2789o;
    }

    public Class<c> c() {
        return c.class;
    }

    public void d() {
        ((c) this.e).stop();
        c cVar = (c) this.e;
        cVar.f2771h = true;
        g gVar = cVar.e.a;
        gVar.c.clear();
        Bitmap bitmap = gVar.f2787m;
        if (bitmap != null) {
            gVar.e.a(bitmap);
            gVar.f2787m = null;
        }
        gVar.f2780f = false;
        g.a aVar = gVar.f2784j;
        if (aVar != null) {
            gVar.d.a((h<?>) aVar);
            gVar.f2784j = null;
        }
        g.a aVar2 = gVar.f2786l;
        if (aVar2 != null) {
            gVar.d.a((h<?>) aVar2);
            gVar.f2786l = null;
        }
        g.a aVar3 = gVar.f2788n;
        if (aVar3 != null) {
            gVar.d.a((h<?>) aVar3);
            gVar.f2788n = null;
        }
        gVar.a.clear();
        gVar.f2785k = true;
    }
}
