package i.c.c.a.c0;

import i.c.a.b.d.l.q;
import i.c.c.a.f;
import java.security.interfaces.ECPublicKey;

/* compiled from: EciesAeadHkdfHybridEncrypt */
public final class p implements f {
    public p(ECPublicKey eCPublicKey, byte[] bArr, String str, w wVar, n nVar) {
        q.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }
}
