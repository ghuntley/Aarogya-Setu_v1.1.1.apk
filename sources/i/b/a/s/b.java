package i.b.a.s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import i.a.a.a.a;
import i.b.a.n.e;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ApplicationVersionSignature */
public final class b {
    public static final ConcurrentMap<String, e> a = new ConcurrentHashMap();

    public static e a(Context context) {
        PackageInfo packageInfo;
        String str;
        String packageName = context.getPackageName();
        e eVar = (e) a.get(packageName);
        if (eVar != null) {
            return eVar;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder a2 = a.a("Cannot resolve info for");
            a2.append(context.getPackageName());
            Log.e("AppVersionSignature", a2.toString(), e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            str = String.valueOf(packageInfo.versionCode);
        } else {
            str = UUID.randomUUID().toString();
        }
        d dVar = new d(str);
        e putIfAbsent = a.putIfAbsent(packageName, dVar);
        return putIfAbsent == null ? dVar : putIfAbsent;
    }
}
