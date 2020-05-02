package i.c.c.a.a0;

import i.c.c.a.b;
import i.c.c.a.g;
import i.c.c.a.p;
import java.security.GeneralSecurityException;

/* compiled from: PublicKeySignCatalogue */
public class e implements b<p> {
    public g<p> a(String str, String str2, int i2) {
        g<p> gVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == -1213945325 && lowerCase.equals("publickeysign")) ? (char) 0 : 65535) == 0) {
            int hashCode = str.hashCode();
            if (hashCode != -1470419991) {
                if (hashCode == -359160126 && str.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    c = 0;
                }
            } else if (str.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                c = 1;
            }
            if (c == 0) {
                gVar = new a();
            } else if (c == 1) {
                gVar = new c();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'PublicKeySign' with key type '%s'.", new Object[]{str}));
            }
            if (gVar.b() >= i2) {
                return gVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
