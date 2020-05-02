package i.c.c.a.t;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.a;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.z.c0;
import i.c.c.a.z.d0;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: AesGcmKeyManager */
public class i implements g<a> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof d0) {
            d0 d0Var = (d0) oVar;
            i0.a(d0Var.f4418h);
            c0.b bVar = (c0.b) c0.f4407j.e();
            f a = f.a(g0.a(d0Var.f4418h));
            bVar.k();
            c0.a((c0) bVar.f4951f, a);
            bVar.k();
            ((c0) bVar.f4951f).f4409h = 0;
            return bVar.i();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (c0) k.a(c0.f4407j, fVar));
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    public a a(o oVar) {
        if (oVar instanceof c0) {
            c0 c0Var = (c0) oVar;
            i0.a(c0Var.f4409h, 0);
            i0.a(c0Var.f4410i.size());
            return new i.c.c.a.c0.f(c0Var.f4410i.d());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    public o a(f fVar) {
        try {
            return b((o) (d0) k.a(d0.f4416i, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey");
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.AesGcmKey");
        f a = ((c0) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }
}
