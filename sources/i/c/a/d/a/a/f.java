package i.c.a.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import i.c.a.d.a.c.a;
import i.c.a.d.a.c.e;
import i.c.a.d.a.c.j;
import i.c.a.d.a.c.n;

public final class f {
    public static final a d = new a("AppUpdateService");
    public static final Intent e = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final j<e> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4293b;
    public final Context c;

    public f(Context context) {
        this.f4293b = context.getPackageName();
        this.c = context;
        this.a = new j(context.getApplicationContext(), d, "AppUpdateService", e, e.a, (n) null);
    }

    public static /* synthetic */ Bundle a(f fVar, String str) {
        Integer num = null;
        if (fVar != null) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("playcore.version.code", 10600);
            bundle.putAll(bundle2);
            bundle.putString("package.name", str);
            try {
                num = Integer.valueOf(fVar.c.getPackageManager().getPackageInfo(fVar.c.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                d.a(6, "The current version of the app could not be retrieved", new Object[0]);
            }
            if (num != null) {
                bundle.putInt("app.version.code", num.intValue());
            }
            return bundle;
        }
        throw null;
    }
}
