package i.c.c.a.y;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.c0.e0;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.m;
import i.c.c.a.z.p1;
import i.c.c.a.z.q1;
import i.c.c.a.z.r1;
import i.c.c.a.z.u1;
import i.c.c.a.z.w1;
import i.c.f.f;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: HmacKeyManager */
public class a implements g<m> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof r1) {
            r1 r1Var = (r1) oVar;
            if (r1Var.f4578i >= 16) {
                a(r1Var.i());
                q1.b bVar = (q1.b) q1.f4556k.e();
                bVar.k();
                ((q1) bVar.f4951f).f4558h = 0;
                u1 i2 = r1Var.i();
                bVar.k();
                q1.a((q1) bVar.f4951f, i2);
                f a = f.a(g0.a(r1Var.f4578i));
                bVar.k();
                q1.a((q1) bVar.f4951f, a);
                return bVar.i();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    public Object c(f fVar) {
        try {
            return a((o) (q1) k.a(q1.f4556k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    public m a(o oVar) {
        if (oVar instanceof q1) {
            q1 q1Var = (q1) oVar;
            i0.a(q1Var.f4558h, 0);
            if (q1Var.f4560j.size() >= 16) {
                a(q1Var.i());
                p1 i2 = q1Var.i().i();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q1Var.f4560j.d(), "HMAC");
                int i3 = q1Var.i().f4591i;
                int ordinal = i2.ordinal();
                if (ordinal == 1) {
                    return new e0("HMACSHA1", secretKeySpec, i3);
                }
                if (ordinal == 2) {
                    return new e0("HMACSHA256", secretKeySpec, i3);
                }
                if (ordinal == 3) {
                    return new e0("HMACSHA512", secretKeySpec, i3);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    public w1 b(f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.HmacKey");
        f a = ((q1) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }

    public final void a(u1 u1Var) {
        if (u1Var.f4591i >= 10) {
            int ordinal = u1Var.i().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (u1Var.f4591i > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (u1Var.f4591i > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (u1Var.f4591i > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public o a(f fVar) {
        try {
            return b((o) (r1) k.a(r1.f4575j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.HmacKey");
    }
}
