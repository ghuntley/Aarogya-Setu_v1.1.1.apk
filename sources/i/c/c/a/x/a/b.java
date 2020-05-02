package i.c.c.a.x.a;

import android.annotation.TargetApi;
import i.c.c.a.a;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

@TargetApi(23)
/* compiled from: AndroidKeystoreAesGcm */
public final class b implements a {
    public final SecretKey a;

    public b(String str) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        this.a = (SecretKey) instance.getKey(str, (char[]) null);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
