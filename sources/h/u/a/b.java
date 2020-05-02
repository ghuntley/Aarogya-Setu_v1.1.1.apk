package h.u.a;

import android.security.keystore.KeyGenParameterSpec;
import i.a.a.a.a;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* compiled from: MasterKeys */
public final class b {
    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
    }

    public static String a(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            StringBuilder a = a.a("invalid key size, want 256 bits got ");
            a.append(keyGenParameterSpec.getKeySize());
            a.append(" bits");
            throw new IllegalArgumentException(a.toString());
        } else if (keyGenParameterSpec.getBlockModes().equals(new String[]{"GCM"})) {
            StringBuilder a2 = a.a("invalid block mode, want GCM got ");
            a2.append(Arrays.toString(keyGenParameterSpec.getBlockModes()));
            throw new IllegalArgumentException(a2.toString());
        } else if (keyGenParameterSpec.getPurposes() != 3) {
            StringBuilder a3 = a.a("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            a3.append(keyGenParameterSpec.getPurposes());
            throw new IllegalArgumentException(a3.toString());
        } else if (!keyGenParameterSpec.getEncryptionPaddings().equals(new String[]{"NoPadding"})) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!instance.containsAlias(keystoreAlias)) {
                KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance2.init(keyGenParameterSpec);
                instance2.generateKey();
            }
            return keyGenParameterSpec.getKeystoreAlias();
        } else {
            StringBuilder a4 = a.a("invalid padding mode, want NoPadding got ");
            a4.append(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            throw new IllegalArgumentException(a4.toString());
        }
    }
}
