package i.c.c.a.a0;

import i.c.a.b.d.l.q;
import i.c.c.a.r;
import i.c.c.a.z.q2;
import java.security.GeneralSecurityException;

/* compiled from: SignatureConfig */
public final class g {
    @Deprecated
    public static final q2 a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final q2 f4321b;
    public static final q2 c;

    static {
        q2.b i2 = q2.i();
        i2.k();
        q2.a((q2) i2.f4951f, "TINK_SIGNATURE_1_0_0");
        i2.a(q.a("TinkPublicKeySign", "PublicKeySign", "EcdsaPrivateKey", 0, true));
        i2.a(q.a("TinkPublicKeySign", "PublicKeySign", "Ed25519PrivateKey", 0, true));
        i2.a(q.a("TinkPublicKeyVerify", "PublicKeyVerify", "EcdsaPublicKey", 0, true));
        i2.a(q.a("TinkPublicKeyVerify", "PublicKeyVerify", "Ed25519PublicKey", 0, true));
        a = (q2) i2.i();
        q2.b i3 = q2.i();
        i3.a(a);
        q2.b bVar = i3;
        bVar.k();
        q2.a((q2) bVar.f4951f, "TINK_SIGNATURE_1_1_0");
        f4321b = (q2) bVar.i();
        q2.b i4 = q2.i();
        i4.k();
        q2.a((q2) i4.f4951f, "TINK_SIGNATURE");
        i4.a(q.a("TinkPublicKeySign", "PublicKeySign", "EcdsaPrivateKey", 0, true));
        i4.a(q.a("TinkPublicKeySign", "PublicKeySign", "Ed25519PrivateKey", 0, true));
        i4.a(q.a("TinkPublicKeyVerify", "PublicKeyVerify", "EcdsaPublicKey", 0, true));
        i4.a(q.a("TinkPublicKeyVerify", "PublicKeyVerify", "Ed25519PublicKey", 0, true));
        c = (q2) i4.i();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        r.a("TinkPublicKeySign", new e());
        r.a("TinkPublicKeyVerify", new f());
        q.a(c);
    }
}
