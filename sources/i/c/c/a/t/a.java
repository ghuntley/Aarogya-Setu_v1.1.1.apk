package i.c.c.a.t;

import i.c.c.a.b;
import i.c.c.a.g;
import java.security.GeneralSecurityException;

/* compiled from: AeadCatalogue */
public class a implements b<i.c.c.a.a> {
    public g<i.c.c.a.a> a(String str, String str2, int i2) {
        g<i.c.c.a.a> gVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? (char) 0 : 65535) == 0) {
            switch (str.hashCode()) {
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                gVar = new f();
            } else if (c == 1) {
                gVar = new h();
            } else if (c == 2) {
                gVar = new i();
            } else if (c == 3) {
                gVar = new j();
            } else if (c == 4) {
                gVar = new k();
            } else if (c == 5) {
                gVar = new m();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
            }
            if (gVar.b() >= i2) {
                return gVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i2)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
