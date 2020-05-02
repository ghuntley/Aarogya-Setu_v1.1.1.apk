package i.c.a.b.h;

import android.content.Context;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.f;
import i.c.a.b.d.k.h.d;
import i.c.a.b.g.f.q;
import i.c.a.b.g.f.x;

public class c {
    public static final a.g<q> a = new a.g<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0108a<q, a.d.C0110d> f3554b;
    public static final i.c.a.b.d.k.a<a.d.C0110d> c;
    @Deprecated
    public static final x d = new x();

    public static abstract class a<R extends f> extends d<R, q> {
        public a(i.c.a.b.d.k.c cVar) {
            super(c.c, cVar);
        }
    }

    static {
        l lVar = new l();
        f3554b = lVar;
        c = new i.c.a.b.d.k.a<>("LocationServices.API", lVar, a);
    }

    public static a a(Context context) {
        return new a(context);
    }

    public static h b(Context context) {
        return new h(context);
    }
}
