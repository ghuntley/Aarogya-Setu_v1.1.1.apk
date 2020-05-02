package i.c.c.a.w;

import i.c.a.b.d.l.q;
import i.c.c.a.r;
import i.c.c.a.t.b;
import i.c.c.a.z.q2;
import java.security.GeneralSecurityException;

/* compiled from: HybridConfig */
public final class c {
    @Deprecated
    public static final q2 a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final q2 f4373b;
    public static final q2 c;

    static {
        q2.b i2 = q2.i();
        i2.a(b.a);
        q2.b bVar = i2;
        bVar.a(q.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        bVar.a(q.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        bVar.k();
        q2.a((q2) bVar.f4951f, "TINK_HYBRID_1_0_0");
        a = (q2) bVar.i();
        q2.b i3 = q2.i();
        i3.a(a);
        q2.b bVar2 = i3;
        bVar2.k();
        q2.a((q2) bVar2.f4951f, "TINK_HYBRID_1_1_0");
        f4373b = (q2) bVar2.i();
        q2.b i4 = q2.i();
        i4.a(b.f4370b);
        q2.b bVar3 = i4;
        bVar3.a(q.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true));
        bVar3.a(q.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true));
        bVar3.k();
        q2.a((q2) bVar3.f4951f, "TINK_HYBRID");
        c = (q2) bVar3.i();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        b.a();
        r.a("TinkHybridEncrypt", new e());
        r.a("TinkHybridDecrypt", new d());
        q.a(c);
    }
}
