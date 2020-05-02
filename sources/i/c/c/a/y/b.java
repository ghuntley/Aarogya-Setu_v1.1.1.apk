package i.c.c.a.y;

import i.c.c.a.g;
import i.c.c.a.m;
import java.security.GeneralSecurityException;

/* compiled from: MacCatalogue */
public class b implements i.c.c.a.b<m> {
    public g<m> a(String str, String str2, int i2) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 107855 && lowerCase.equals("mac")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == 836622442 && str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                c = 0;
            }
            if (c == 0) {
                a aVar = new a();
                if (aVar.b() >= i2) {
                    return aVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
