package i.c.c.a;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.a.b.d.l.q;
import i.c.c.a.x.a.c;
import i.c.c.a.x.a.d;
import i.c.c.a.z.d2;
import i.c.c.a.z.e2;
import i.c.c.a.z.n1;
import i.c.f.f;
import i.c.f.k;
import java.security.GeneralSecurityException;

/* compiled from: KeysetHandle */
public final class h {
    public d2 a;

    public h(d2 d2Var) {
        this.a = d2Var;
    }

    public static final h a(c cVar, a aVar) {
        n1 n1Var = (n1) k.a(n1.f4526j, cVar.a());
        if (n1Var == null || n1Var.f4528h.size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            d2 a2 = d2.a(aVar.b(n1Var.f4528h.d(), new byte[0]));
            if (a2 != null && a2.f4423j.size() > 0) {
                return new h(a2);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public String toString() {
        return s.a(this.a).toString();
    }

    public void a(j jVar, a aVar) {
        d2 d2Var = this.a;
        byte[] a2 = aVar.a(d2Var.b(), new byte[0]);
        try {
            if (d2.a(aVar.b(a2, new byte[0])).equals(d2Var)) {
                n1.b bVar = (n1.b) n1.f4526j.e();
                f a3 = f.a(a2);
                bVar.k();
                n1.a((n1) bVar.f4951f, a3);
                e2 a4 = s.a(d2Var);
                bVar.k();
                n1.a((n1) bVar.f4951f, a4);
                d dVar = (d) jVar;
                dVar.a.putString(dVar.f4379b, q.c(((n1) bVar.i()).b())).apply();
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final h a(d2 d2Var) {
        if (d2Var != null && d2Var.f4423j.size() > 0) {
            return new h(d2Var);
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
