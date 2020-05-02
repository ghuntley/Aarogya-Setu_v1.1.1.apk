package i.c.c.a.w;

import i.c.c.a.b;
import i.c.c.a.f;
import i.c.c.a.g;
import java.security.GeneralSecurityException;

/* compiled from: HybridEncryptCatalogue */
public class e implements b<f> {
    public g<f> a(String str, String str2, int i2) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 1420614889 && lowerCase.equals("hybridencrypt")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == 396454335 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                c = 0;
            }
            if (c == 0) {
                b bVar = new b();
                if (bVar.b() >= i2) {
                    return bVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
