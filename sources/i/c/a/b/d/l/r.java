package i.c.a.b.d.l;

import i.c.a.b.d.k.d;
import i.c.a.b.d.k.f;
import i.c.a.b.h.e;
import i.c.a.b.l.g;
import i.c.a.b.l.h;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class r {
    public static final b a = new c0();

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface a<R extends f, T> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b {
    }

    public static <R extends f, T extends e<R>> g<T> a(d<R> dVar, T t) {
        d0 d0Var = new d0(t);
        b bVar = a;
        h hVar = new h();
        dVar.a(new e0(dVar, hVar, d0Var, bVar));
        return hVar.a;
    }
}
