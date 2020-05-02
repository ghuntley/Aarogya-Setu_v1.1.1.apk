package i.c.a.d.a.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class b {
    public static final a a = new a("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        String str;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                a.a(5, "Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            for (Signature byteArray : signatureArr) {
                byte[] byteArray2 = byteArray.toByteArray();
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(byteArray2);
                    str = Base64.encodeToString(instance.digest(), 11);
                } catch (NoSuchAlgorithmException unused) {
                    str = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
