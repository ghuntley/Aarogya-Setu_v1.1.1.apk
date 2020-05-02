package i.c.c.a.v;

import i.c.c.a.d;
import i.c.c.a.g;
import java.security.GeneralSecurityException;

/* compiled from: DeterministicAeadCatalogue */
public class b implements i.c.c.a.b<d> {
    public g<d> a(String str, String str2, int i2) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 109397593 && lowerCase.equals("deterministicaead")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == -2089717248 && str.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                c = 0;
            }
            if (c == 0) {
                a aVar = new a();
                if (aVar.b() >= i2) {
                    return aVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'DeterministicAead' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
