package h.a0.x.r;

import android.content.ComponentName;
import android.content.Context;
import h.a0.l;

/* compiled from: PackageManagerHelper */
public class f {
    public static final String a = l.a("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            l a2 = l.a();
            String str3 = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            a2.a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            l a3 = l.a();
            String str4 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            a3.a(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}
