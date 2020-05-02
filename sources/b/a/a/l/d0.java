package b.a.a.l;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import nic.goi.aarogyasetu.CoronaApplication;

/* compiled from: SecureUtil */
public abstract class d0 {
    public static final Object a = new Object();

    public Cipher a(boolean z) {
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding", "BC");
        try {
            Key b2 = b();
            if (z) {
                instance.init(1, b2);
            } else {
                instance.init(2, b2);
            }
            return instance;
        } catch (IOException | IllegalArgumentException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            c();
            throw e;
        }
    }

    public final Key b() {
        String string = CoronaApplication.f5224g.getApplicationContext().getSharedPreferences("aarogya_setu_sp", 0).getString("sk", (String) null);
        if (!TextUtils.isEmpty(string)) {
            byte[] decode = Base64.decode(string, 0);
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
            instance2.init(2, ((KeyStore.PrivateKeyEntry) instance.getEntry("COVID-19-ALIAS", (KeyStore.ProtectionParameter) null)).getPrivateKey());
            return new SecretKeySpec(instance2.doFinal(decode), "AES");
        }
        throw new InvalidKeyException("Saved key missing from shared preferences");
    }

    public final void c() {
        synchronized (a) {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            a(instance);
        }
    }

    public final void a(KeyStore keyStore) {
        synchronized (a) {
            keyStore.deleteEntry("COVID-19-ALIAS");
            CoronaApplication.f5224g.getApplicationContext().getSharedPreferences("aarogya_setu_sp", 0).edit().clear().commit();
        }
    }

    public SecretKey a() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        if (instance.containsAlias("COVID-19-ALIAS")) {
            return ((KeyStore.SecretKeyEntry) instance.getEntry("COVID-19-ALIAS", (KeyStore.ProtectionParameter) null)).getSecretKey();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        instance2.init(new KeyGenParameterSpec.Builder("COVID-19-ALIAS", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        return instance2.generateKey();
    }
}
