package i.c.c.a.t;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.c0.c;
import i.c.c.a.c0.d0;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.z.k;
import i.c.c.a.z.l;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: AesCtrKeyManager */
public class g implements i.c.c.a.g<d0> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof l) {
            l lVar = (l) oVar;
            i0.a(lVar.f4502i);
            int i2 = lVar.i().f4532h;
            if (i2 < 12 || i2 > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
            k.b bVar = (k.b) k.f4486k.e();
            i.c.c.a.z.o i3 = lVar.i();
            bVar.k();
            k.a((k) bVar.f4951f, i3);
            f a = f.a(g0.a(lVar.f4502i));
            bVar.k();
            k.a((k) bVar.f4951f, a);
            bVar.k();
            ((k) bVar.f4951f).f4488h = 0;
            return bVar.i();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (k) i.c.f.k.a(k.f4486k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    public c a(o oVar) {
        if (oVar instanceof k) {
            k kVar = (k) oVar;
            i0.a(kVar.f4488h, 0);
            i0.a(kVar.f4490j.size());
            int i2 = kVar.i().f4532h;
            if (i2 >= 12 && i2 <= 16) {
                return new c(kVar.f4490j.d(), kVar.i().f4532h);
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    public o a(f fVar) {
        try {
            return b((o) (l) i.c.f.k.a(l.f4499j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.AesCtrKey");
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.AesCtrKey");
        f a = ((k) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }
}
