package i.c.c.a.t;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.a;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.l;
import i.c.c.a.z.l2;
import i.c.c.a.z.m2;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: KmsEnvelopeAeadKeyManager */
public class m implements g<a> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof m2) {
            l2.b bVar = (l2.b) l2.f4503j.e();
            bVar.k();
            l2.a((l2) bVar.f4951f, (m2) oVar);
            bVar.k();
            ((l2) bVar.f4951f).f4505h = 0;
            return bVar.i();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (l2) k.a(l2.f4503j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    public a a(o oVar) {
        if (oVar instanceof l2) {
            l2 l2Var = (l2) oVar;
            i0.a(l2Var.f4505h, 0);
            String str = l2Var.i().f4521h;
            return new l(l2Var.i().i(), l.a(str).b(str));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f a = ((l2) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.REMOTE);
        return (w1) i2.i();
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    public o a(f fVar) {
        try {
            return b((o) (m2) k.a(m2.f4519j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }
}
