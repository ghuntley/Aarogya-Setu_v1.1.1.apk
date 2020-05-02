package i.b.a.n.n.y;

import android.net.Uri;
import i.b.a.n.n.g;
import i.b.a.n.n.n;
import i.b.a.n.n.o;
import i.b.a.n.n.r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: HttpUriLoader */
public class b implements n<Uri, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f2708b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    public final n<g, InputStream> a;

    /* compiled from: HttpUriLoader */
    public static class a implements o<Uri, InputStream> {
        public n<Uri, InputStream> a(r rVar) {
            return new b(rVar.a(g.class, InputStream.class));
        }
    }

    public b(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, i.b.a.n.g gVar) {
        return this.a.a(new g(((Uri) obj).toString()), i2, i3, gVar);
    }

    public boolean a(Object obj) {
        return f2708b.contains(((Uri) obj).getScheme());
    }
}
