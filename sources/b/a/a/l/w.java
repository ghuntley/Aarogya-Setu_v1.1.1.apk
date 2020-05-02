package b.a.a.l;

import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.security.auth.x500.X500Principal;
import nic.goi.aarogyasetu.CoronaApplication;

/* compiled from: EncryptionUtil */
public class w extends d0 {
    public static final w c = new w();

    /* renamed from: b  reason: collision with root package name */
    public byte[] f441b;

    public String a(String str) {
        Cipher d = d();
        this.f441b = d.getIV();
        return Base64.encodeToString(d.doFinal(str.getBytes(StandardCharsets.UTF_8)), 0);
    }

    public final Cipher d() {
        if (Build.VERSION.SDK_INT >= 23) {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, a());
            return instance;
        }
        KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
        instance2.load((KeyStore.LoadStoreParameter) null);
        if (!instance2.containsAlias("COVID-19-ALIAS")) {
            Calendar instance3 = Calendar.getInstance();
            Calendar instance4 = Calendar.getInstance();
            instance4.add(1, 30);
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(CoronaApplication.f5224g.getApplicationContext()).setAlias("COVID-19-ALIAS").setSubject(new X500Principal("CN=COVID-19-ALIAS")).setSerialNumber(BigInteger.TEN).setStartDate(instance3.getTime()).setEndDate(instance4.getTime()).setKeySize(1024).build();
            KeyPairGenerator instance5 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance5.initialize(build);
            instance5.generateKeyPair();
        }
        SharedPreferences sharedPreferences = CoronaApplication.f5224g.getApplicationContext().getSharedPreferences("aarogya_setu_sp", 0);
        if (sharedPreferences.getString("sk", (String) null) == null) {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            KeyStore instance6 = KeyStore.getInstance("AndroidKeyStore");
            instance6.load((KeyStore.LoadStoreParameter) null);
            Cipher instance7 = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
            instance7.init(1, ((KeyStore.PrivateKeyEntry) instance6.getEntry("COVID-19-ALIAS", (KeyStore.ProtectionParameter) null)).getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance7);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("sk", encodeToString);
            edit.commit();
        }
        return a(true);
    }
}
