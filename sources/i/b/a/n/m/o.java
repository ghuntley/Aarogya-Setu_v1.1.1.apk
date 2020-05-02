package i.b.a.n.m;

import g.a.a.b.a;
import i.b.a.n.e;
import i.b.a.n.g;
import i.b.a.n.k;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey */
public class o implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f2642b;
    public final int c;
    public final int d;
    public final Class<?> e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f2643f;

    /* renamed from: g  reason: collision with root package name */
    public final e f2644g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, k<?>> f2645h;

    /* renamed from: i  reason: collision with root package name */
    public final g f2646i;

    /* renamed from: j  reason: collision with root package name */
    public int f2647j;

    public o(Object obj, e eVar, int i2, int i3, Map<Class<?>, k<?>> map, Class<?> cls, Class<?> cls2, g gVar) {
        a.a(obj, "Argument must not be null");
        this.f2642b = obj;
        a.a(eVar, "Signature must not be null");
        this.f2644g = eVar;
        this.c = i2;
        this.d = i3;
        a.a(map, "Argument must not be null");
        this.f2645h = map;
        a.a(cls, "Resource class must not be null");
        this.e = cls;
        a.a(cls2, "Transcode class must not be null");
        this.f2643f = cls2;
        a.a(gVar, "Argument must not be null");
        this.f2646i = gVar;
    }

    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f2642b.equals(oVar.f2642b) || !this.f2644g.equals(oVar.f2644g) || this.d != oVar.d || this.c != oVar.c || !this.f2645h.equals(oVar.f2645h) || !this.e.equals(oVar.e) || !this.f2643f.equals(oVar.f2643f) || !this.f2646i.equals(oVar.f2646i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f2647j == 0) {
            int hashCode = this.f2642b.hashCode();
            this.f2647j = hashCode;
            int hashCode2 = this.f2644g.hashCode() + (hashCode * 31);
            this.f2647j = hashCode2;
            int i2 = (hashCode2 * 31) + this.c;
            this.f2647j = i2;
            int i3 = (i2 * 31) + this.d;
            this.f2647j = i3;
            int hashCode3 = this.f2645h.hashCode() + (i3 * 31);
            this.f2647j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.f2647j = hashCode4;
            int hashCode5 = this.f2643f.hashCode() + (hashCode4 * 31);
            this.f2647j = hashCode5;
            this.f2647j = this.f2646i.hashCode() + (hashCode5 * 31);
        }
        return this.f2647j;
    }

    public String toString() {
        StringBuilder a = i.a.a.a.a.a("EngineKey{model=");
        a.append(this.f2642b);
        a.append(", width=");
        a.append(this.c);
        a.append(", height=");
        a.append(this.d);
        a.append(", resourceClass=");
        a.append(this.e);
        a.append(", transcodeClass=");
        a.append(this.f2643f);
        a.append(", signature=");
        a.append(this.f2644g);
        a.append(", hashCode=");
        a.append(this.f2647j);
        a.append(", transformations=");
        a.append(this.f2645h);
        a.append(", options=");
        a.append(this.f2646i);
        a.append('}');
        return a.toString();
    }
}
