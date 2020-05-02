package i.c.c.a.w;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.a.b.d.l.q;
import i.c.c.a.c0.i0;
import i.c.c.a.e;
import i.c.c.a.o;
import i.c.c.a.z.a1;
import i.c.c.a.z.c1;
import i.c.c.a.z.e1;
import i.c.c.a.z.g1;
import i.c.c.a.z.w1;
import i.c.c.a.z.y0;
import i.c.f.f;
import i.c.f.k;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: EciesAeadHkdfPrivateKeyManager */
public class a implements o<e> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public int b() {
        return 0;
    }

    public i.c.f.o b(i.c.f.o oVar) {
        if (oVar instanceof y0) {
            y0 y0Var = (y0) oVar;
            q.a(y0Var.i());
            KeyPair a = q.a(q.a(y0Var.i().k().i()));
            ECPoint w = ((ECPublicKey) a.getPublic()).getW();
            e1.b bVar = (e1.b) e1.f4435l.e();
            bVar.k();
            ((e1) bVar.f4951f).f4437h = 0;
            a1 i2 = y0Var.i();
            bVar.k();
            e1.a((e1) bVar.f4951f, i2);
            f a2 = f.a(w.getAffineX().toByteArray());
            bVar.k();
            e1.a((e1) bVar.f4951f, a2);
            f a3 = f.a(w.getAffineY().toByteArray());
            bVar.k();
            e1.b((e1) bVar.f4951f, a3);
            c1.b bVar2 = (c1.b) c1.f4411k.e();
            bVar2.k();
            ((c1) bVar2.f4951f).f4413h = 0;
            bVar2.k();
            c1.a((c1) bVar2.f4951f, (e1) bVar.i());
            f a4 = f.a(((ECPrivateKey) a.getPrivate()).getS().toByteArray());
            bVar2.k();
            c1.a((c1) bVar2.f4951f, a4);
            return bVar2.i();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((i.c.f.o) (c1) k.a(c1.f4411k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    public e a(i.c.f.o oVar) {
        if (oVar instanceof c1) {
            c1 c1Var = (c1) oVar;
            i0.a(c1Var.f4413h, 0);
            q.a(c1Var.i().i());
            a1 i2 = c1Var.i().i();
            g1 k2 = i2.k();
            return new i.c.c.a.c0.o(q.a(q.a(k2.i()), c1Var.f4415j.d()), k2.f4464j.d(), q.b(k2.j()), q.a(i2.j()), new f(i2.i().i()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    public i.c.f.o a(f fVar) {
        try {
            return b((i.c.f.o) (y0) k.a(y0.f4621i, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    public boolean a(String str) {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey".equals(str);
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        f a = ((c1) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.ASYMMETRIC_PRIVATE);
        return (w1) i2.i();
    }
}
