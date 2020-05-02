package i.c.a.b.d.k.h;

import i.c.a.b.d.k.a;
import i.c.a.b.d.k.a.d;
import i.c.a.b.d.l.q;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class b<O extends a.d> {
    public final boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public final int f3033b;
    public final a<O> c;
    public final O d;

    public b(a<O> aVar, O o2) {
        this.c = aVar;
        this.d = o2;
        this.f3033b = Arrays.hashCode(new Object[]{aVar, o2});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return !this.a && !bVar.a && q.b((Object) this.c, (Object) bVar.c) && q.b((Object) this.d, (Object) bVar.d);
    }

    public final int hashCode() {
        return this.f3033b;
    }
}
