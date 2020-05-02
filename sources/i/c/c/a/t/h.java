package i.c.c.a.t;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.a;
import i.c.c.a.c0.d;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.z.q;
import i.c.c.a.z.r;
import i.c.c.a.z.u;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: AesEaxKeyManager */
public class h implements g<a> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof r) {
            r rVar = (r) oVar;
            i0.a(rVar.f4569i);
            if (rVar.i().f4587h == 12 || rVar.i().f4587h == 16) {
                q.b bVar = (q.b) q.f4551k.e();
                f a = f.a(g0.a(rVar.f4569i));
                bVar.k();
                ((q) bVar.f4951f).f4555j = a;
                u i2 = rVar.i();
                bVar.k();
                q.a((q) bVar.f4951f, i2);
                bVar.k();
                ((q) bVar.f4951f).f4553h = 0;
                return bVar.i();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (q) k.a(q.f4551k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    public a a(o oVar) {
        if (oVar instanceof q) {
            q qVar = (q) oVar;
            i0.a(qVar.f4553h, 0);
            i0.a(qVar.f4555j.size());
            if (qVar.i().f4587h == 12 || qVar.i().f4587h == 16) {
                return new d(qVar.f4555j.d(), qVar.i().f4587h);
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey");
    }

    public o a(f fVar) {
        try {
            return b((o) (r) k.a(r.f4566j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.AesEaxKey");
        f a = ((q) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }
}
