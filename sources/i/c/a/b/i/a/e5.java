package i.c.a.b.i.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import i.c.a.b.d.n.a;
import i.c.a.b.d.p.b;
import i.c.a.b.d.p.c;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class e5 {
    public final s5 a;

    public e5(s5 s5Var) {
        this.a = s5Var;
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.a.n().f3762j.a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.k().c();
        if (!a()) {
            this.a.n().f3764l.a("Install Referrer Reporter is not available");
            return;
        }
        h5 h5Var = new h5(this, str);
        this.a.k().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.a.getPackageManager();
        if (packageManager == null) {
            this.a.n().f3762j.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.n().f3764l.a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !a()) {
                this.a.n().f3761i.a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            Intent intent2 = new Intent(intent);
            try {
                a a2 = a.a();
                Context context = this.a.a;
                if (a2 != null) {
                    context.getClass().getName();
                    this.a.n().f3766n.a("Install Referrer Service is", a2.b(context, intent2, h5Var, 1) ? "available" : "not available");
                    return;
                }
                throw null;
            } catch (Exception e) {
                this.a.n().f3758f.a("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }

    public final boolean a() {
        try {
            b b2 = c.b(this.a.a);
            if (b2 == null) {
                this.a.n().f3766n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (b2.a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.a.n().f3766n.a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
