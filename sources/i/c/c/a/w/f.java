package i.c.c.a.w;

import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.c0.n;
import i.c.c.a.r;
import i.c.c.a.z.a;
import i.c.c.a.z.b;
import i.c.c.a.z.c0;
import i.c.c.a.z.d0;
import i.c.c.a.z.z1;
import i.c.f.k;
import java.security.GeneralSecurityException;

/* compiled from: RegistryEciesAeadHkdfDemHelper */
public class f implements n {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public int f4374b;

    public f(z1 z1Var) {
        String str = z1Var.f4632h;
        this.a = str;
        if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                i.c.f.f fVar = z1Var.f4633i;
                c0 c0Var = (c0) r.a(z1Var);
                int i2 = ((d0) k.a(d0.f4416i, fVar)).f4418h;
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                b bVar = (b) k.a(b.f4396j, z1Var.f4633i);
                a aVar = (a) r.a(z1Var);
                this.f4374b = bVar.i().f4502i;
                int i3 = bVar.j().f4578i;
            } catch (InvalidProtocolBufferException e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            StringBuilder a2 = i.a.a.a.a.a("unsupported AEAD DEM key type: ");
            a2.append(this.a);
            throw new GeneralSecurityException(a2.toString());
        }
    }
}
