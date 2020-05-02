package i.c.c.a.t;

import i.c.c.a.z.b;
import i.c.c.a.z.d0;
import i.c.c.a.z.l;
import i.c.c.a.z.o;
import i.c.c.a.z.p1;
import i.c.c.a.z.p2;
import i.c.c.a.z.r;
import i.c.c.a.z.r1;
import i.c.c.a.z.u;
import i.c.c.a.z.u1;
import i.c.c.a.z.z1;
import i.c.f.f;

/* compiled from: AeadKeyTemplates */
public final class e {
    public static final z1 a = a(32);

    static {
        a(16);
        a(16, 16);
        a(32, 16);
        a(16, 16, 32, 16, p1.SHA256);
        a(32, 16, 32, 32, p1.SHA256);
        z1.b i2 = z1.i();
        i2.k();
        z1.a((z1) i2.f4951f, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        i2.a(p2.TINK);
        z1 z1Var = (z1) i2.i();
    }

    public static z1 a(int i2) {
        d0.b bVar = (d0.b) d0.f4416i.e();
        bVar.k();
        ((d0) bVar.f4951f).f4418h = i2;
        z1.b i3 = z1.i();
        f a2 = ((d0) bVar.i()).a();
        i3.k();
        z1.a((z1) i3.f4951f, a2);
        i3.k();
        z1.a((z1) i3.f4951f, "type.googleapis.com/google.crypto.tink.AesGcmKey");
        i3.a(p2.TINK);
        return (z1) i3.i();
    }

    public static z1 a(int i2, int i3, int i4, int i5, p1 p1Var) {
        l.b bVar = (l.b) l.f4499j.e();
        o.b bVar2 = (o.b) o.f4530i.e();
        bVar2.k();
        ((o) bVar2.f4951f).f4532h = i3;
        bVar.k();
        l.a((l) bVar.f4951f, (o) bVar2.i());
        bVar.k();
        ((l) bVar.f4951f).f4502i = i2;
        r1.b bVar3 = (r1.b) r1.f4575j.e();
        u1.b bVar4 = (u1.b) u1.f4588j.e();
        bVar4.k();
        u1.a((u1) bVar4.f4951f, p1Var);
        bVar4.k();
        ((u1) bVar4.f4951f).f4591i = i5;
        bVar3.k();
        r1.a((r1) bVar3.f4951f, (u1) bVar4.i());
        bVar3.k();
        ((r1) bVar3.f4951f).f4578i = i4;
        b.C0129b bVar5 = (b.C0129b) b.f4396j.e();
        bVar5.k();
        b.a((b) bVar5.f4951f, (l) bVar.i());
        bVar5.k();
        b.a((b) bVar5.f4951f, (r1) bVar3.i());
        z1.b i6 = z1.i();
        f a2 = ((b) bVar5.i()).a();
        i6.k();
        z1.a((z1) i6.f4951f, a2);
        i6.k();
        z1.a((z1) i6.f4951f, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        i6.a(p2.TINK);
        return (z1) i6.i();
    }

    public static z1 a(int i2, int i3) {
        r.b bVar = (r.b) r.f4566j.e();
        bVar.k();
        ((r) bVar.f4951f).f4569i = i2;
        u.b bVar2 = (u.b) u.f4585i.e();
        bVar2.k();
        ((u) bVar2.f4951f).f4587h = i3;
        bVar.k();
        r.a((r) bVar.f4951f, (u) bVar2.i());
        z1.b i4 = z1.i();
        f a2 = ((r) bVar.i()).a();
        i4.k();
        z1.a((z1) i4.f4951f, a2);
        i4.k();
        z1.a((z1) i4.f4951f, "type.googleapis.com/google.crypto.tink.AesEaxKey");
        i4.a(p2.TINK);
        return (z1) i4.i();
    }
}
