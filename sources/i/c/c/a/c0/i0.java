package i.c.c.a.c0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

/* compiled from: Validators */
public final class i0 {
    static {
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);
    }

    public static void a(int i2) {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException("invalid key size; only 128-bit and 256-bit AES keys are supported");
        }
    }

    public static void a(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    public static void a(a0 a0Var) {
        int ordinal = a0Var.ordinal();
        if (ordinal == 0) {
            throw new GeneralSecurityException("SHA1 is not safe for signature");
        } else if (ordinal != 1 && ordinal != 2) {
            throw new GeneralSecurityException("Unsupported hash " + a0Var);
        }
    }

    public static String a(String str, String str2) {
        if (str2.toLowerCase().startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[]{str}));
    }
}
