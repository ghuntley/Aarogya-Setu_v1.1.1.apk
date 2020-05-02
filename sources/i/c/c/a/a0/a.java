package i.c.c.a.a0;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.a.b.d.l.q;
import i.c.c.a.c0.i0;
import i.c.c.a.c0.l;
import i.c.c.a.o;
import i.c.c.a.p;
import i.c.c.a.z.n0;
import i.c.c.a.z.p0;
import i.c.c.a.z.r0;
import i.c.c.a.z.t0;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: EcdsaSignKeyManager */
public class a implements o<p> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public int b() {
        return 0;
    }

    public i.c.f.o b(i.c.f.o oVar) {
        if (oVar instanceof n0) {
            p0 i2 = ((n0) oVar).i();
            q.a(i2);
            KeyPair a = q.a(q.b(i2.i()));
            ECPoint w = ((ECPublicKey) a.getPublic()).getW();
            t0.b bVar = (t0.b) t0.f4579l.e();
            bVar.k();
            ((t0) bVar.f4951f).f4581h = 0;
            bVar.k();
            t0.a((t0) bVar.f4951f, i2);
            f a2 = f.a(w.getAffineX().toByteArray());
            bVar.k();
            t0.a((t0) bVar.f4951f, a2);
            f a3 = f.a(w.getAffineY().toByteArray());
            bVar.k();
            t0.b((t0) bVar.f4951f, a3);
            r0.b bVar2 = (r0.b) r0.f4570k.e();
            bVar2.k();
            ((r0) bVar2.f4951f).f4572h = 0;
            bVar2.k();
            r0.a((r0) bVar2.f4951f, (t0) bVar.i());
            f a4 = f.a(((ECPrivateKey) a.getPrivate()).getS().toByteArray());
            bVar2.k();
            r0.a((r0) bVar2.f4951f, a4);
            return bVar2.i();
        }
        throw new GeneralSecurityException("expected EcdsaKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((i.c.f.o) (r0) k.a(r0.f4570k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized EcdsaPrivateKey proto", e);
        }
    }

    public p a(i.c.f.o oVar) {
        if (oVar instanceof r0) {
            r0 r0Var = (r0) oVar;
            i0.a(r0Var.f4572h, 0);
            q.a(r0Var.i().i());
            return new l(q.a(q.b(r0Var.i().i().i()), r0Var.f4574j.d()), q.a(r0Var.i().i().k()), q.a(r0Var.i().i().j()));
        }
        throw new GeneralSecurityException("expected EcdsaPrivateKey proto");
    }

    public i.c.f.o a(f fVar) {
        try {
            return b((i.c.f.o) (n0) k.a(n0.f4523i, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected EcdsaKeyFormat proto", e);
        }
    }

    public boolean a(String str) {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey".equals(str);
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f a = ((r0) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.ASYMMETRIC_PRIVATE);
        return (w1) i2.i();
    }
}
