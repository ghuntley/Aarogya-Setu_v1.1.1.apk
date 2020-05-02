package i.c.c.a.a0;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.c0.i0;
import i.c.c.a.c0.t;
import i.c.c.a.g;
import i.c.c.a.q;
import i.c.c.a.z.k1;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: Ed25519PublicKeyManager */
public class d implements g<q> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        throw new GeneralSecurityException("Not implemented");
    }

    public Object c(f fVar) {
        try {
            return a((o) (k1) k.a(k1.f4495j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid Ed25519 public key", e);
        }
    }

    public q a(o oVar) {
        if (oVar instanceof k1) {
            k1 k1Var = (k1) oVar;
            i0.a(k1Var.f4497h, 0);
            if (k1Var.f4498i.size() == 32) {
                return new t(k1Var.f4498i.d());
            }
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
        throw new GeneralSecurityException("expected Ed25519PublicKey proto");
    }

    public w1 b(f fVar) {
        throw new GeneralSecurityException("Not implemented");
    }

    public o a(f fVar) {
        throw new GeneralSecurityException("Not implemented");
    }

    public boolean a(String str) {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey".equals(str);
    }
}
