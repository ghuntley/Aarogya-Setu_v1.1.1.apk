package i.c.c.a.v;

import i.c.a.b.d.l.q;
import i.c.c.a.r;
import i.c.c.a.z.q2;
import java.security.GeneralSecurityException;

/* compiled from: DeterministicAeadConfig */
public final class c {
    @Deprecated
    public static final q2 a;

    /* renamed from: b  reason: collision with root package name */
    public static final q2 f4372b;

    static {
        q2.b i2 = q2.i();
        i2.a(q.a("TinkDeterministicAead", "DeterministicAead", "AesSivKey", 0, true));
        i2.k();
        q2.a((q2) i2.f4951f, "TINK_DETERMINISTIC_AEAD_1_1_0");
        a = (q2) i2.i();
        q2.b i3 = q2.i();
        i3.a(q.a("TinkDeterministicAead", "DeterministicAead", "AesSivKey", 0, true));
        i3.k();
        q2.a((q2) i3.f4951f, "TINK_DETERMINISTIC_AEAD");
        f4372b = (q2) i3.i();
        try {
            r.a("TinkDeterministicAead", new b());
            q.a(f4372b);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        r.a("TinkDeterministicAead", new b());
        q.a(f4372b);
    }
}
