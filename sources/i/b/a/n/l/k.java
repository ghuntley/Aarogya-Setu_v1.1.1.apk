package i.b.a.n.l;

import i.b.a.n.l.e;
import i.b.a.n.m.b0.b;
import i.b.a.n.o.c.v;
import java.io.InputStream;

/* compiled from: InputStreamRewinder */
public final class k implements e<InputStream> {
    public final v a;

    public k(InputStream inputStream, b bVar) {
        v vVar = new v(inputStream, bVar);
        this.a = vVar;
        vVar.mark(5242880);
    }

    public void b() {
        this.a.f();
    }

    /* compiled from: InputStreamRewinder */
    public static final class a implements e.a<InputStream> {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public e a(Object obj) {
            return new k((InputStream) obj, this.a);
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }
    }

    public InputStream a() {
        this.a.reset();
        return this.a;
    }
}
