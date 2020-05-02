package i.c.c.a.w;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.a.b.d.l.q;
import i.c.c.a.c0.i0;
import i.c.c.a.c0.p;
import i.c.c.a.f;
import i.c.c.a.g;
import i.c.c.a.z.a1;
import i.c.c.a.z.e1;
import i.c.c.a.z.g1;
import i.c.c.a.z.w1;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: EciesAeadHkdfPublicKeyManager */
public class b implements g<f> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public Object c(i.c.f.f fVar) {
        try {
            return a((o) (e1) k.a(e1.f4435l, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    public f a(o oVar) {
        if (oVar instanceof e1) {
            e1 e1Var = (e1) oVar;
            i0.a(e1Var.f4437h, 0);
            q.a(e1Var.i());
            a1 i2 = e1Var.i();
            g1 k2 = i2.k();
            return new p(q.a(q.a(k2.i()), e1Var.f4439j.d(), e1Var.f4440k.d()), k2.f4464j.d(), q.b(k2.j()), q.a(i2.j()), new f(i2.i().i()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    public w1 b(i.c.f.f fVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public o a(i.c.f.f fVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public boolean a(String str) {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey".equals(str);
    }
}
