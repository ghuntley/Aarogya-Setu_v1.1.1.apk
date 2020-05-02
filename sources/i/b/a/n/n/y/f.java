package i.b.a.n.n.y;

import i.b.a.n.n.g;
import i.b.a.n.n.n;
import i.b.a.n.n.o;
import i.b.a.n.n.r;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader */
public class f implements n<URL, InputStream> {
    public final n<g, InputStream> a;

    /* compiled from: UrlLoader */
    public static class a implements o<URL, InputStream> {
        public n<URL, InputStream> a(r rVar) {
            return new f(rVar.a(g.class, InputStream.class));
        }
    }

    public f(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, i.b.a.n.g gVar) {
        return this.a.a(new g((URL) obj), i2, i3, gVar);
    }

    public boolean a(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
