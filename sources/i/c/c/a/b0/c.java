package i.c.c.a.b0;

import i.c.c.a.b;
import i.c.c.a.c0.f0;
import i.c.c.a.g;
import java.security.GeneralSecurityException;

/* compiled from: StreamingAeadCatalogue */
public class c implements b<f0> {
    public g<f0> a(String str, String str2, int i2) {
        g<f0> gVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 754366121 && lowerCase.equals("streamingaead")) ? (char) 0 : 65535) == 0) {
            int hashCode = str.hashCode();
            if (hashCode != -2002307740) {
                if (hashCode == -608502222 && str.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    c = 1;
                }
            } else if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                c = 0;
            }
            if (c == 0) {
                gVar = new a();
            } else if (c == 1) {
                gVar = new b();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'StreamingAead' with key type '%s'.", new Object[]{str}));
            }
            if (gVar.b() >= i2) {
                return gVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
