package b.a.a.l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import i.b.a.c;
import i.b.a.i;
import i.b.a.j;
import i.b.a.o.h;
import i.b.a.o.m;
import i.b.a.r.a;
import i.b.a.r.e;

/* compiled from: GlideRequests */
public class a0 extends j {
    public a0(c cVar, h hVar, m mVar, Context context) {
        super(cVar, hVar, mVar, context);
    }

    public i a(Class cls) {
        return new z(this.e, this, cls, this.f2424f);
    }

    public i e() {
        return (z) a(Bitmap.class).a((a<?>) j.f2423p);
    }

    public i f() {
        return (z) a(Drawable.class);
    }

    public void a(e eVar) {
        if (eVar instanceof y) {
            super.a(eVar);
        } else {
            super.a((e) new y().a((a<?>) eVar));
        }
    }

    public i a(Integer num) {
        return (z) f().a(num);
    }
}
