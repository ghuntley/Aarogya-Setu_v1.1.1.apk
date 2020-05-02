package i.c.a.a.j;

import i.c.a.a.b;
import i.c.a.a.e;
import i.c.a.a.f;
import i.c.a.a.g;
import java.util.Set;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class i implements g {
    public final Set<b> a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2947b;
    public final l c;

    public i(Set<b> set, h hVar, l lVar) {
        this.a = set;
        this.f2947b = hVar;
        this.c = lVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.a.contains(bVar)) {
            return new k(this.f2947b, str, bVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.a}));
    }
}
