package i.c.c.a.t;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.a;
import i.c.c.a.c0.d0;
import i.c.c.a.c0.i0;
import i.c.c.a.c0.x;
import i.c.c.a.g;
import i.c.c.a.m;
import i.c.c.a.r;
import i.c.c.a.z.a;
import i.c.c.a.z.b;
import i.c.c.a.z.k;
import i.c.c.a.z.q1;
import i.c.c.a.z.w1;
import i.c.f.o;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: AesCtrHmacAeadKeyManager */
public class f implements g<a> {
    static {
        Logger.getLogger(f.class.getName());
    }

    public f() {
        r.a(new g());
    }

    public String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof b) {
            b bVar = (b) oVar;
            a.b bVar2 = (a.b) i.c.c.a.z.a.f4381k.e();
            bVar2.k();
            i.c.c.a.z.a.a((i.c.c.a.z.a) bVar2.f4951f, (k) r.a("type.googleapis.com/google.crypto.tink.AesCtrKey", (o) bVar.i()));
            bVar2.k();
            i.c.c.a.z.a.a((i.c.c.a.z.a) bVar2.f4951f, (q1) r.a("type.googleapis.com/google.crypto.tink.HmacKey", (o) bVar.j()));
            bVar2.k();
            ((i.c.c.a.z.a) bVar2.f4951f).f4383h = 0;
            return bVar2.i();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    public Object c(i.c.f.f fVar) {
        try {
            return a((o) (i.c.c.a.z.a) i.c.f.k.a(i.c.c.a.z.a.f4381k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    public i.c.c.a.a a(o oVar) {
        if (oVar instanceof i.c.c.a.z.a) {
            i.c.c.a.z.a aVar = (i.c.c.a.z.a) oVar;
            i0.a(aVar.f4383h, 0);
            return new x((d0) r.b("type.googleapis.com/google.crypto.tink.AesCtrKey").a((o) aVar.i()), (m) r.b("type.googleapis.com/google.crypto.tink.HmacKey").a((o) aVar.j()), aVar.j().i().f4591i);
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    public w1 b(i.c.f.f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        i.c.f.f a = ((i.c.c.a.z.a) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    }

    public o a(i.c.f.f fVar) {
        try {
            return b((o) (b) i.c.f.k.a(b.f4396j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }
}
