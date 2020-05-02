package i.c.c.a;

import i.c.c.a.z.d2;
import i.c.c.a.z.p2;
import i.c.c.a.z.w1;
import i.c.c.a.z.y1;
import i.c.c.a.z.z1;
import java.security.SecureRandom;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: KeysetManager */
public final class i {
    @GuardedBy("this")
    public final d2.b a;

    public i(d2.b bVar) {
        this.a = bVar;
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b2 = 0;
        while (b2 == 0) {
            secureRandom.nextBytes(bArr);
            b2 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b2;
    }

    @GuardedBy("this")
    public synchronized h a() {
        return h.a((d2) this.a.i());
    }

    @GuardedBy("this")
    public synchronized i b(z1 z1Var) {
        d2.c a2 = a(z1Var);
        d2.b bVar = this.a;
        bVar.k();
        d2.a((d2) bVar.f4951f, a2);
        int i2 = a2.f4428j;
        bVar.k();
        ((d2) bVar.f4951f).f4422i = i2;
        return this;
    }

    @GuardedBy("this")
    public final synchronized d2.c a(z1 z1Var) {
        d2.c.a aVar;
        w1 b2 = r.b(z1Var);
        int b3 = b();
        p2 a2 = p2.a(z1Var.f4634j);
        if (a2 == null) {
            a2 = p2.UNRECOGNIZED;
        }
        if (a2 == p2.UNKNOWN_PREFIX) {
            a2 = p2.TINK;
        }
        aVar = (d2.c.a) d2.c.f4424l.e();
        aVar.k();
        d2.c.a((d2.c) aVar.f4951f, b2);
        aVar.k();
        ((d2.c) aVar.f4951f).f4428j = b3;
        y1 y1Var = y1.ENABLED;
        aVar.k();
        d2.c.a((d2.c) aVar.f4951f, y1Var);
        aVar.k();
        d2.c.a((d2.c) aVar.f4951f, a2);
        return (d2.c) aVar.i();
    }

    @GuardedBy("this")
    public final synchronized int b() {
        int c;
        c = c();
        for (T t : Collections.unmodifiableList(((d2) this.a.f4951f).f4423j)) {
            if (t.f4428j == c) {
                c = c();
            }
        }
        return c;
    }
}
