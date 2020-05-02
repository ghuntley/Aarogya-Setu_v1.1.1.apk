package i.c.a.b.d.p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class b {
    public final Context a;

    public b(Context context) {
        this.a = context;
    }

    public ApplicationInfo a(String str, int i2) {
        return this.a.getPackageManager().getApplicationInfo(str, i2);
    }

    public PackageInfo b(String str, int i2) {
        return this.a.getPackageManager().getPackageInfo(str, i2);
    }

    public CharSequence a(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    public boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.a);
        }
        if (!q.f() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }
}
