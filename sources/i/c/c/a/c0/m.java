package i.c.c.a.c0;

import i.c.c.a.q;
import java.security.interfaces.ECPublicKey;

/* compiled from: EcdsaVerifyJce */
public final class m implements q {
    public m(ECPublicKey eCPublicKey, a0 a0Var, v vVar) {
        i.c.a.b.d.l.q.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        i0.a(a0Var);
        a0Var + "withECDSA";
    }
}
