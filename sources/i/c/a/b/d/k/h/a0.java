package i.c.a.b.d.k.h;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.a.d;
import i.c.a.b.d.k.b;
import i.c.a.b.d.k.f;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a0<O extends a.d> extends t {
    public final b<O> a;

    public a0(b<O> bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.a = bVar;
    }

    public final <A extends a.b, R extends f, T extends d<R, A>> T a(T t) {
        b<O> bVar = this.a;
        if (bVar != null) {
            t.f486k = t.f486k || BasePendingResult.f479l.get().booleanValue();
            g gVar = bVar.f3029i;
            if (gVar != null) {
                o0 o0Var = new o0(0, t);
                Handler handler = gVar.f3053m;
                handler.sendMessage(handler.obtainMessage(4, new c0(o0Var, gVar.f3048h.get(), bVar)));
                return t;
            }
            throw null;
        }
        throw null;
    }

    public final Looper a() {
        return this.a.e;
    }
}
