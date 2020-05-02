package i.c.c.a.c0;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: EngineWrapper */
public interface z<T> {

    /* compiled from: EngineWrapper */
    public static class a implements z<Cipher> {
        public Object a(String str, Provider provider) {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class b implements z<KeyAgreement> {
        public Object a(String str, Provider provider) {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class c implements z<KeyFactory> {
        public Object a(String str, Provider provider) {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class d implements z<KeyPairGenerator> {
        public Object a(String str, Provider provider) {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class e implements z<Mac> {
        public Object a(String str, Provider provider) {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class f implements z<MessageDigest> {
        public Object a(String str, Provider provider) {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class g implements z<Signature> {
        public Object a(String str, Provider provider) {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider);
}
