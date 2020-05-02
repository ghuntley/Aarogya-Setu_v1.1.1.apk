package i.b.a.n.n;

import android.net.Uri;
import i.b.a.n.g;
import i.b.a.n.n.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader */
public class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f2706b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    public final n<g, Data> a;

    /* compiled from: UrlUriLoader */
    public static class a implements o<Uri, InputStream> {
        public n<Uri, InputStream> a(r rVar) {
            return new x(rVar.a(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        return this.a.a(new g(((Uri) obj).toString()), i2, i3, gVar);
    }

    public boolean a(Object obj) {
        return f2706b.contains(((Uri) obj).getScheme());
    }
}
