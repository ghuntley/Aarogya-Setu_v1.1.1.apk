package i.c.a.b.d.o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import i.c.a.b.d.p.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class a {
    public static byte[] a(Context context, String str) {
        MessageDigest a;
        PackageInfo packageInfo = c.b(context).a.getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (a = a("SHA1")) == null) {
            return null;
        }
        return a.digest(packageInfo.signatures[0].toByteArray());
    }

    public static MessageDigest a(String str) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
