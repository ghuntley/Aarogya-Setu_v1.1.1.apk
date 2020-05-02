package i.c.c.a.b0;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.a.b.d.l.q;
import i.c.c.a.c0.e;
import i.c.c.a.c0.f0;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.z.a0;
import i.c.c.a.z.p1;
import i.c.c.a.z.w;
import i.c.c.a.z.w1;
import i.c.c.a.z.x;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: AesGcmHkdfStreamingKeyManager */
public class b implements g<f0> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof x) {
            x xVar = (x) oVar;
            if (xVar.f4620i >= 16) {
                a(xVar.i());
                w.b bVar = (w.b) w.f4597k.e();
                f a = f.a(g0.a(xVar.f4620i));
                bVar.k();
                ((w) bVar.f4951f).f4601j = a;
                a0 i2 = xVar.i();
                bVar.k();
                w.a((w) bVar.f4951f, i2);
                bVar.k();
                ((w) bVar.f4951f).f4599h = 0;
                return bVar.i();
            }
            throw new GeneralSecurityException("key_size must be at least 16 bytes");
        }
        throw new GeneralSecurityException("expected AesGcmHkdfStreamingKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (w) k.a(w.f4597k, fVar));
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("expected AesGcmHkdfStreamingKey proto");
        }
    }

    public final void a(a0 a0Var) {
        i0.a(a0Var.f4389i);
        p1 a = p1.a(a0Var.f4390j);
        if (a == null) {
            a = p1.UNRECOGNIZED;
        }
        if (a == p1.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (a0Var.f4388h < a0Var.f4389i + 8) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + 8)");
        }
    }

    public f0 a(o oVar) {
        if (oVar instanceof w) {
            w wVar = (w) oVar;
            i0.a(wVar.f4599h, 0);
            a(wVar.i());
            byte[] d = wVar.f4601j.d();
            p1 a = p1.a(wVar.i().f4390j);
            if (a == null) {
                a = p1.UNRECOGNIZED;
            }
            return new e(d, q.c(a), wVar.i().f4389i, wVar.i().f4388h, 0);
        }
        throw new GeneralSecurityException("expected AesGcmHkdfStreamingKey proto");
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        f a = ((w) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
    }

    public o a(f fVar) {
        try {
            return b((o) (x) k.a(x.f4617j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesGcmHkdfStreamingKeyFormat proto", e);
        }
    }
}
