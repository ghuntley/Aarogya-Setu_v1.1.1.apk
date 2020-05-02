package q.j0.a;

import com.google.gson.Gson;
import i.c.e.q;
import i.c.e.v.c;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import o.a0;
import o.g0;
import o.i0;
import p.e;
import p.f;
import q.j;

/* compiled from: GsonRequestBodyConverter */
public final class b<T> implements j<T, i0> {
    public static final a0 c = a0.a("application/json; charset=UTF-8");
    public static final Charset d = Charset.forName("UTF-8");
    public final Gson a;

    /* renamed from: b  reason: collision with root package name */
    public final q<T> f5720b;

    public b(Gson gson, q<T> qVar) {
        this.a = gson;
        this.f5720b = qVar;
    }

    public Object a(Object obj) {
        f fVar = new f();
        c a2 = this.a.a((Writer) new OutputStreamWriter(new e(fVar), d));
        this.f5720b.a(a2, obj);
        a2.close();
        return new g0(c, fVar.q());
    }
}
