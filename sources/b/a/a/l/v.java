package b.a.a.l;

import android.os.Build;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import nic.goi.aarogyasetu.models.EncryptedInfo;

/* compiled from: DecryptionUtil */
public class v extends d0 {
    public String a(EncryptedInfo encryptedInfo) {
        Cipher cipher;
        byte[] decode = Base64.decode(encryptedInfo.getData().getBytes(), 0);
        if (Build.VERSION.SDK_INT >= 23) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, encryptedInfo.getIv());
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, a(), gCMParameterSpec);
        } else {
            cipher = a(false);
        }
        return new String(cipher.doFinal(decode), StandardCharsets.UTF_8);
    }
}
