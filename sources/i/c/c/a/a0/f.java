package i.c.c.a.a0;

import i.c.c.a.b;
import i.c.c.a.g;
import i.c.c.a.q;
import java.security.GeneralSecurityException;

/* compiled from: PublicKeyVerifyCatalogue */
public class f implements b<q> {
    public g<q> a(String str, String str2, int i2) {
        g<q> gVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 1712166735 && lowerCase.equals("publickeyverify")) ? (char) 0 : 65535) == 0) {
            int hashCode = str.hashCode();
            if (hashCode != 248906128) {
                if (hashCode == 1737079689 && str.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    c = 1;
                }
            } else if (str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                c = 0;
            }
            if (c == 0) {
                gVar = new b();
            } else if (c == 1) {
                gVar = new d();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'PublicKeyVerify' with key type '%s'.", new Object[]{str}));
            }
            if (gVar.b() >= i2) {
                return gVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
