package i.c.c.a.b0;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.a.b.d.l.q;
import i.c.c.a.c0.b;
import i.c.c.a.c0.f0;
import i.c.c.a.c0.g0;
import i.c.c.a.c0.i0;
import i.c.c.a.g;
import i.c.c.a.z.e;
import i.c.c.a.z.f;
import i.c.c.a.z.i;
import i.c.c.a.z.p1;
import i.c.c.a.z.u1;
import i.c.c.a.z.w1;
import i.c.f.k;
import i.c.f.o;
import java.security.GeneralSecurityException;

/* compiled from: AesCtrHmacStreamingKeyManager */
public class a implements g<f0> {
    public String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    public int b() {
        return 0;
    }

    public o b(o oVar) {
        if (oVar instanceof f) {
            f fVar = (f) oVar;
            if (fVar.f4455i >= 16) {
                a(fVar.i());
                e.b bVar = (e.b) e.f4430k.e();
                i.c.f.f a = i.c.f.f.a(g0.a(fVar.f4455i));
                bVar.k();
                ((e) bVar.f4951f).f4434j = a;
                i i2 = fVar.i();
                bVar.k();
                e.a((e) bVar.f4951f, i2);
                bVar.k();
                ((e) bVar.f4951f).f4432h = 0;
                return bVar.i();
            }
            throw new GeneralSecurityException("key_size must be at least 16 bytes");
        }
        throw new GeneralSecurityException("expected AesCtrHmacStreamingKeyFormat proto");
    }

    public Object c(i.c.f.f fVar) {
        try {
            return a((o) (e) k.a(e.f4430k, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected AesCtrHmacStreamingKey proto", e);
        }
    }

    public final void a(i iVar) {
        i0.a(iVar.f4475i);
        p1 a = p1.a(iVar.f4476j);
        if (a == null) {
            a = p1.UNRECOGNIZED;
        }
        if (a == p1.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (iVar.i().i() != p1.UNKNOWN_HASH) {
            u1 i2 = iVar.i();
            if (i2.f4591i >= 10) {
                int ordinal = i2.i().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (i2.f4591i > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (i2.f4591i > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (i2.f4591i > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                if (iVar.f4474h < iVar.f4475i + iVar.i().f4591i + 8) {
                    throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + 8)");
                }
                return;
            }
            throw new GeneralSecurityException("tag size too small");
        } else {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
    }

    public w1 b(i.c.f.f fVar) {
        w1.b i2 = w1.i();
        i2.k();
        w1.a((w1) i2.f4951f, "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        i.c.f.f a = ((e) a(fVar)).a();
        i2.k();
        w1.a((w1) i2.f4951f, a);
        i2.a(w1.c.SYMMETRIC);
        return (w1) i2.i();
    }

    public f0 a(o oVar) {
        if (oVar instanceof e) {
            e eVar = (e) oVar;
            i0.a(eVar.f4432h, 0);
            if (eVar.f4434j.size() < 16) {
                throw new GeneralSecurityException("key_value must have at least 16 bytes");
            } else if (eVar.f4434j.size() >= eVar.i().f4475i) {
                a(eVar.i());
                byte[] d = eVar.f4434j.d();
                p1 a = p1.a(eVar.i().f4476j);
                if (a == null) {
                    a = p1.UNRECOGNIZED;
                }
                return new b(d, q.c(a), eVar.i().f4475i, q.c(eVar.i().i().i()), eVar.i().i().f4591i, eVar.i().f4474h, 0);
            } else {
                throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
            }
        } else {
            throw new GeneralSecurityException("expected AesCtrHmacStreamingKey proto");
        }
    }

    public boolean a(String str) {
        return str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
    }

    public o a(i.c.f.f fVar) {
        try {
            return b((o) (f) k.a(f.f4452j, fVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacStreamingKeyFormat proto", e);
        }
    }
}
