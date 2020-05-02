package i.c.a.b.j;

import i.c.a.b.d.k.a;
import i.c.a.b.d.l.q;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a implements a.d.f {

    /* renamed from: j  reason: collision with root package name */
    public static final a f3978j = new a();
    public final boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3979b = false;
    public final String c = null;
    public final boolean d = false;
    public final String e = null;

    /* renamed from: f  reason: collision with root package name */
    public final String f3980f = null;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3981g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Long f3982h = null;

    /* renamed from: i  reason: collision with root package name */
    public final Long f3983i = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f3979b == aVar.f3979b && q.b((Object) this.c, (Object) aVar.c) && this.d == aVar.d && this.f3981g == aVar.f3981g && q.b((Object) this.e, (Object) aVar.e) && q.b((Object) this.f3980f, (Object) aVar.f3980f) && q.b((Object) this.f3982h, (Object) aVar.f3982h) && q.b((Object) this.f3983i, (Object) aVar.f3983i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.f3979b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.f3981g), this.e, this.f3980f, this.f3982h, this.f3983i});
    }
}
