package i.c.c.a.t;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.a;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.l;
import i.c.c.a.z.h2;
import i.c.c.a.z.i2;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: KmsAeadKeyManager */
public class k implements g<a> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof i2) {
            h2.b bVar = (h2.b) h2.f4468j.e();
            bVar.k();
            h2.a((h2) bVar.f4951f, (i2) oVar);
            bVar.k();
            ((h2) bVar.f4951f).f4470h = 0;
            return bVar.i();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (h2) i.c.f.k.a(h2.f4468j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    public a a(o oVar) {
        if (oVar instanceof h2) {
            h2 h2Var = (h2) oVar;
            i0.a(h2Var.f4470h, 0);
            String str = h2Var.i().f4485h;
            return l.a(str).b(str);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey");
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f a = ((h2) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.REMOTE);
        return (w1) i2.i();
    }

    public o a(f fVar) {
        try {
            return b((o) (i2) i.c.f.k.a(i2.f4483i, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }
}
