package i.c.c.a.y;

import i.c.a.b.d.l.q;
import i.c.c.a.r;
import i.c.c.a.z.q2;
import java.security.GeneralSecurityException;

/* compiled from: MacConfig */
public final class c {
    @Deprecated
    public static final q2 a;

    /* renamed from: b  reason: collision with root package name */
    public static final q2 f4380b;

    static {
        q2.b i2 = q2.i();
        i2.k();
        q2.a((q2) i2.f4951f, "TINK_MAC_1_0_0");
        i2.a(q.a("TinkMac", "Mac", "HmacKey", 0, true));
        a = (q2) i2.i();
        q2.b i3 = q2.i();
        i3.a(a);
        q2.b bVar = i3;
        bVar.k();
        q2.a((q2) bVar.f4951f, "TINK_MAC_1_1_0");
        q2 q2Var = (q2) bVar.i();
        q2.b i4 = q2.i();
        i4.a(a);
        q2.b bVar2 = i4;
        bVar2.k();
        q2.a((q2) bVar2.f4951f, "TINK_MAC");
        f4380b = (q2) bVar2.i();
        try {
            r.a("TinkMac", new b());
            q.a(f4380b);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        r.a("TinkMac", new b());
        q.a(f4380b);
    }
}
