package i.c.c.a.v;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.c0.i0;
import i.c.c.a.d;
import i.c.c.a.g;
import i.c.c.a.z.g0;
import i.c.c.a.z.h0;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* compiled from: AesSivKeyManager */
public class a implements g<d> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof h0) {
            h0 h0Var = (h0) oVar;
            if (h0Var.f4467h == 64) {
                g0.b bVar = (g0.b) g0.f4456j.e();
                f a = f.a(i.c.c.a.c0.g0.a(h0Var.f4467h));
                bVar.k();
                g0.a((g0) bVar.f4951f, a);
                bVar.k();
                ((g0) bVar.f4951f).f4458h = 0;
                return bVar.i();
            }
            StringBuilder a2 = i.a.a.a.a.a("invalid key size: ");
            a2.append(h0Var.f4467h);
            a2.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(a2.toString());
        }
        throw new GeneralSecurityException("expected AesSivKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (g0) k.a(g0.f4456j, fVar));
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("expected AesSivKey proto");
        }
    }

    public d a(o oVar) {
        if (oVar instanceof g0) {
            g0 g0Var = (g0) oVar;
            i0.a(g0Var.f4458h, 0);
            if (g0Var.f4459i.size() == 64) {
                return new i.c.c.a.c0.g(g0Var.f4459i.d());
            }
            StringBuilder a = i.a.a.a.a.a("invalid key size: ");
            a.append(g0Var.f4459i.size());
            a.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(a.toString());
        }
        throw new GeneralSecurityException("expected AesSivKey proto");
    }

    public o a(f fVar) {
        try {
            return b((o) (h0) k.a(h0.f4465i, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesSivKeyFormat proto", e);
        }
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.AesSivKey");
        f a = ((g0) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.AesSivKey");
    }
}
