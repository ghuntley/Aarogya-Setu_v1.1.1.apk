package i.c.c.a.t;

import i.c.a.b.d.l.q;
import i.c.c.a.r;
import i.c.c.a.y.c;
import i.c.c.a.z.q2;
import java.security.GeneralSecurityException;

/* compiled from: AeadConfig */
public final class b {
    @Deprecated
    public static final q2 a;

    /* renamed from: b  reason: collision with root package name */
    public static final q2 f4370b;

    static {
        q2.b i2 = q2.i();
        i2.a(c.a);
        q2.b bVar = i2;
        bVar.a(q.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        bVar.a(q.a("TinkAead", "Aead", "AesEaxKey", 0, true));
        bVar.a(q.a("TinkAead", "Aead", "AesGcmKey", 0, true));
        bVar.a(q.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        bVar.a(q.a("TinkAead", "Aead", "KmsAeadKey", 0, true));
        bVar.a(q.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        bVar.k();
        q2.a((q2) bVar.f4951f, "TINK_AEAD_1_0_0");
        a = (q2) bVar.i();
        q2.b i3 = q2.i();
        i3.a(a);
        q2.b bVar2 = i3;
        bVar2.k();
        q2.a((q2) bVar2.f4951f, "TINK_AEAD_1_1_0");
        q2 q2Var = (q2) bVar2.i();
        q2.b i4 = q2.i();
        i4.a(c.f4380b);
        q2.b bVar3 = i4;
        bVar3.a(q.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true));
        bVar3.a(q.a("TinkAead", "Aead", "AesEaxKey", 0, true));
        bVar3.a(q.a("TinkAead", "Aead", "AesGcmKey", 0, true));
        bVar3.a(q.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true));
        bVar3.a(q.a("TinkAead", "Aead", "KmsAeadKey", 0, true));
        bVar3.a(q.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true));
        bVar3.k();
        q2.a((q2) bVar3.f4951f, "TINK_AEAD");
        f4370b = (q2) bVar3.i();
        try {
            c.a();
            r.a("TinkAead", new a());
            q.a(f4370b);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        c.a();
        r.a("TinkAead", new a());
        q.a(f4370b);
    }
}
