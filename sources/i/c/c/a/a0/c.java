package i.c.c.a.a0;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.c0.q;
import i.c.c.a.c0.s;
import i.c.c.a.o;
import i.c.c.a.p;
import i.c.c.a.z.i1;
import i.c.c.a.z.k1;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: Ed25519PrivateKeyManager */
public class c implements o<p> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    public int b() {
        return 0;
    }

    public i.c.f.o b(i.c.f.o oVar) {
        return c();
    }

    public final i1 c() {
        byte[] a = g0.a(32);
        byte[] b2 = q.b(q.a(a));
        k1.b bVar = (k1.b) k1.f4495j.e();
        bVar.k();
        ((k1) bVar.f4951f).f4497h = 0;
        f a2 = f.a(Arrays.copyOf(b2, b2.length));
        bVar.k();
        k1.a((k1) bVar.f4951f, a2);
        i1.b bVar2 = (i1.b) i1.f4478k.e();
        bVar2.k();
        ((i1) bVar2.f4951f).f4480h = 0;
        f a3 = f.a(Arrays.copyOf(a, a.length));
        bVar2.k();
        i1.a((i1) bVar2.f4951f, a3);
        bVar2.k();
        i1.a((i1) bVar2.f4951f, (k1) bVar.i());
        return (i1) bVar2.i();
    }

    public p a(i.c.f.o oVar) {
        if (oVar instanceof i1) {
            i1 i1Var = (i1) oVar;
            i0.a(i1Var.f4480h, 0);
            if (i1Var.f4481i.size() == 32) {
                return new s(i1Var.f4481i.d());
            }
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
        throw new GeneralSecurityException("expected Ed25519PrivateKey proto");
    }

    public w1 b(f fVar) {
        i1 c = c();
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f a = c.a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.ASYMMETRIC_PRIVATE);
        return (w1) i2.i();
    }

    public i.c.f.o a(f fVar) {
        return c();
    }

    public boolean a(String str) {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey".equals(str);
    }

    public Object c(f fVar) {
        try {
            return a((i.c.f.o) (i1) k.a(i1.f4478k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid Ed25519 private key", e);
        }
    }
}
