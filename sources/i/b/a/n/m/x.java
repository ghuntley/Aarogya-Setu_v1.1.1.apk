package i.b.a.n.m;

import i.a.a.a.a;
import i.b.a.n.e;
import i.b.a.n.k;
import i.b.a.n.m.b0.b;
import i.b.a.t.g;
import i.b.a.t.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey */
public final class x implements e {

    /* renamed from: j  reason: collision with root package name */
    public static final g<Class<?>, byte[]> f2669j = new g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f2670b;
    public final e c;
    public final e d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2671f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f2672g;

    /* renamed from: h  reason: collision with root package name */
    public final i.b.a.n.g f2673h;

    /* renamed from: i  reason: collision with root package name */
    public final k<?> f2674i;

    public x(b bVar, e eVar, e eVar2, int i2, int i3, k<?> kVar, Class<?> cls, i.b.a.n.g gVar) {
        this.f2670b = bVar;
        this.c = eVar;
        this.d = eVar2;
        this.e = i2;
        this.f2671f = i3;
        this.f2674i = kVar;
        this.f2672g = cls;
        this.f2673h = gVar;
    }

    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f2670b.a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f2671f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        k<?> kVar = this.f2674i;
        if (kVar != null) {
            kVar.a(messageDigest);
        }
        this.f2673h.a(messageDigest);
        byte[] a = f2669j.a(this.f2672g);
        if (a == null) {
            a = this.f2672g.getName().getBytes(e.a);
            f2669j.b(this.f2672g, a);
        }
        messageDigest.update(a);
        this.f2670b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f2671f != xVar.f2671f || this.e != xVar.e || !j.b(this.f2674i, xVar.f2674i) || !this.f2672g.equals(xVar.f2672g) || !this.c.equals(xVar.c) || !this.d.equals(xVar.d) || !this.f2673h.equals(xVar.f2673h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f2671f;
        k<?> kVar = this.f2674i;
        if (kVar != null) {
            hashCode = (hashCode * 31) + kVar.hashCode();
        }
        int hashCode2 = this.f2672g.hashCode();
        return this.f2673h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder a = a.a("ResourceCacheKey{sourceKey=");
        a.append(this.c);
        a.append(", signature=");
        a.append(this.d);
        a.append(", width=");
        a.append(this.e);
        a.append(", height=");
        a.append(this.f2671f);
        a.append(", decodedResourceClass=");
        a.append(this.f2672g);
        a.append(", transformation='");
        a.append(this.f2674i);
        a.append('\'');
        a.append(", options=");
        a.append(this.f2673h);
        a.append('}');
        return a.toString();
    }
}
