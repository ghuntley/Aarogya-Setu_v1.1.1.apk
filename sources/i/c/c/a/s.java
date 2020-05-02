package i.c.c.a;

import i.c.c.a.z.d2;
import i.c.c.a.z.e2;
import i.c.c.a.z.p2;
import i.c.c.a.z.w1;
import i.c.c.a.z.y1;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: Util */
public class s {
    static {
        Charset.forName("UTF-8");
    }

    public static e2 a(d2 d2Var) {
        e2.b bVar = (e2.b) e2.f4441k.e();
        int i2 = d2Var.f4422i;
        bVar.k();
        ((e2) bVar.f4951f).f4444i = i2;
        for (d2.c next : d2Var.f4423j) {
            e2.c.a aVar = (e2.c.a) e2.c.f4446l.e();
            String str = next.i().f4607h;
            aVar.k();
            e2.c.a((e2.c) aVar.f4951f, str);
            y1 k2 = next.k();
            aVar.k();
            e2.c.a((e2.c) aVar.f4951f, k2);
            p2 j2 = next.j();
            aVar.k();
            e2.c.a((e2.c) aVar.f4951f, j2);
            int i3 = next.f4428j;
            aVar.k();
            ((e2.c) aVar.f4951f).f4450j = i3;
            bVar.k();
            e2.a((e2) bVar.f4951f, (e2.c) aVar.i());
        }
        return (e2) bVar.i();
    }

    public static void b(d2 d2Var) {
        if (d2Var.f4423j.size() != 0) {
            int i2 = d2Var.f4422i;
            boolean z = false;
            boolean z2 = true;
            for (d2.c next : d2Var.f4423j) {
                if (!(next.f4426h != null)) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.f4428j)}));
                } else if (next.j() == p2.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.f4428j)}));
                } else if (next.k() != y1.UNKNOWN_STATUS) {
                    if (next.k() == y1.ENABLED && next.f4428j == i2) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    w1.c a = w1.c.a(next.i().f4609j);
                    if (a == null) {
                        a = w1.c.UNRECOGNIZED;
                    }
                    if (a != w1.c.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.f4428j)}));
                }
            }
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
