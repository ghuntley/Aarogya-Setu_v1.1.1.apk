package i.c.c.a.b0;

import i.c.a.b.d.l.q;
import i.c.c.a.r;
import i.c.c.a.z.q2;
import java.security.GeneralSecurityException;

/* compiled from: StreamingAeadConfig */
public final class d {
    @Deprecated
    public static final q2 a;

    /* renamed from: b  reason: collision with root package name */
    public static final q2 f4322b;

    static {
        q2.b i2 = q2.i();
        i2.a(q.a("TinkStreamingAead", "StreamingAead", "AesCtrHmacStreamingKey", 0, true));
        i2.a(q.a("TinkStreamingAead", "StreamingAead", "AesGcmHkdfStreamingKey", 0, true));
        i2.k();
        q2.a((q2) i2.f4951f, "TINK_STREAMINGAEAD_1_1_0");
        a = (q2) i2.i();
        q2.b i3 = q2.i();
        i3.a(q.a("TinkStreamingAead", "StreamingAead", "AesCtrHmacStreamingKey", 0, true));
        i3.a(q.a("TinkStreamingAead", "StreamingAead", "AesGcmHkdfStreamingKey", 0, true));
        i3.k();
        q2.a((q2) i3.f4951f, "TINK_STREAMINGAEAD");
        f4322b = (q2) i3.i();
        try {
            r.a("TinkStreamingAead", new c());
            q.a(f4322b);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
