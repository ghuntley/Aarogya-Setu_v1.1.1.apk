package i.c.c.a.a0;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.c0.i0;
import i.c.c.a.c0.m;
import i.c.c.a.g;
import i.c.c.a.q;
import i.c.c.a.z.t0;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: EcdsaVerifyKeyManager */
public class b implements g<q> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        throw new GeneralSecurityException("Not implemented");
    }

    public Object c(f fVar) {
        try {
            return a((o) (t0) k.a(t0.f4579l, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized EcdsaPublicKey proto", e);
        }
    }

    public q a(o oVar) {
        if (oVar instanceof t0) {
            t0 t0Var = (t0) oVar;
            i0.a(t0Var.f4581h, 0);
            i.c.a.b.d.l.q.a(t0Var.i());
            return new m(i.c.a.b.d.l.q.a(i.c.a.b.d.l.q.b(t0Var.i().i()), t0Var.f4583j.d(), t0Var.f4584k.d()), i.c.a.b.d.l.q.a(t0Var.i().k()), i.c.a.b.d.l.q.a(t0Var.i().j()));
        }
        throw new GeneralSecurityException("expected EcdsaPublicKey proto");
    }

    public w1 b(f fVar) {
        throw new GeneralSecurityException("Not implemented");
    }

    public o a(f fVar) {
        throw new GeneralSecurityException("Not implemented");
    }

    public boolean a(String str) {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey".equals(str);
    }
}
