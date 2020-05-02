package i.c.c.a.w;

import i.c.c.a.b;
import i.c.c.a.e;
import i.c.c.a.g;
import java.security.GeneralSecurityException;

/* compiled from: HybridDecryptCatalogue */
public class d implements b<e> {
    public g<e> a(String str, String str2, int i2) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 275448849 && lowerCase.equals("hybriddecrypt")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == -80133005 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                c = 0;
            }
            if (c == 0) {
                a aVar = new a();
                if (aVar.b() >= i2) {
                    return aVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
