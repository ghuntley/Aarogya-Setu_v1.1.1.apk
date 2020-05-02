package q.j0.a;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import i.c.e.q;
import i.c.e.v.a;
import i.c.e.v.b;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import o.a0;
import o.l0;
import p.h;
import q.j;

/* compiled from: GsonResponseBodyConverter */
public final class c<T> implements j<l0, T> {
    public final Gson a;

    /* renamed from: b  reason: collision with root package name */
    public final q<T> f5721b;

    public c(Gson gson, q<T> qVar) {
        this.a = gson;
        this.f5721b = qVar;
    }

    public Object a(Object obj) {
        l0 l0Var = (l0) obj;
        Gson gson = this.a;
        Reader reader = l0Var.e;
        if (reader == null) {
            h h2 = l0Var.h();
            a0 f2 = l0Var.f();
            reader = new l0.a(h2, f2 != null ? f2.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8);
            l0Var.e = reader;
        }
        if (gson != null) {
            a aVar = new a(reader);
            aVar.f4898f = gson.f721j;
            try {
                T a2 = this.f5721b.a(aVar);
                if (aVar.C() == b.END_DOCUMENT) {
                    return a2;
                }
                throw new JsonIOException("JSON document was not fully consumed.");
            } finally {
                l0Var.close();
            }
        } else {
            throw null;
        }
    }
}
