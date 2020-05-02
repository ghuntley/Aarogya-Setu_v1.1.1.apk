package i.c.c.a;

import i.a.a.a.a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KmsClients */
public final class l {
    public static final CopyOnWriteArrayList<k> a = new CopyOnWriteArrayList<>();

    public static k a(String str) {
        Iterator<k> it = a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(a.b("No KMS client does support: ", str));
    }
}
