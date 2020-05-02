package i.c.c.a.v;

import i.c.c.a.d;
import i.c.c.a.g;
import i.c.c.a.h;
import i.c.c.a.n;
import i.c.c.a.r;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

/* compiled from: DeterministicAeadFactory */
public final class e {
    public static final Logger a = Logger.getLogger(e.class.getName());

    public static d a(h hVar) {
        n a2 = r.a(hVar, (g) null);
        for (Collection it : a2.a.values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!(((n.a) it2.next()).a instanceof d)) {
                        throw new GeneralSecurityException("invalid Deterministic AEAD key material");
                    }
                }
            }
        }
        return new d(a2);
    }
}
