package i.c.c.a.t;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.a;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.z.k0;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: ChaCha20Poly1305KeyManager */
public class j implements g<a> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        return c();
    }

    public Object c(f fVar) {
        try {
            return a((o) (k0) k.a(k0.f4491j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    public a a(o oVar) {
        if (oVar instanceof k0) {
            k0 k0Var = (k0) oVar;
            i0.a(k0Var.f4493h, 0);
            if (k0Var.f4494i.size() == 32) {
                return new i.c.c.a.c0.j(k0Var.f4494i.d());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    public w1 b(f fVar) {
        k0 c = c();
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f a = c.a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }

    public final k0 c() {
        k0.b bVar = (k0.b) k0.f4491j.e();
        bVar.k();
        ((k0) bVar.f4951f).f4493h = 0;
        f a = f.a(g0.a(32));
        bVar.k();
        k0.a((k0) bVar.f4951f, a);
        return (k0) bVar.i();
    }

    public o a(f fVar) {
        return c();
    }

    public boolean a(String str) {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key".equals(str);
    }
}
