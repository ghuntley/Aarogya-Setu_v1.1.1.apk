package i.c.c.a.t;

import i.c.c.a.a;
import i.c.c.a.g;
import i.c.c.a.h;
import i.c.c.a.n;
import i.c.c.a.r;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

/* compiled from: AeadFactory */
public final class d {
    public static final Logger a = Logger.getLogger(d.class.getName());

    public static a a(h hVar) {
        n a2 = r.a(hVar, (g) null);
        for (Collection it : a2.a.values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!(((n.a) it2.next()).a instanceof a)) {
                        throw new GeneralSecurityException("invalid AEAD key material");
                    }
                }
            }
        }
        return new c(a2);
    }
}
