package i.c.a.b.i.a;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import i.c.a.b.d.l.q;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final /* synthetic */ class w6 implements Runnable {
    public final t6 e;

    public w6(t6 t6Var) {
        this.e = t6Var;
    }

    public final void run() {
        NetworkInfo networkInfo;
        URL url;
        t6 t6Var = this.e;
        t6Var.c();
        if (t6Var.g().z.a()) {
            t6Var.n().f3765m.a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = t6Var.g().A.a();
        t6Var.g().A.a(a + 1);
        if (a >= 5) {
            t6Var.n().f3761i.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            t6Var.g().z.a(true);
            return;
        }
        s5 s5Var = t6Var.a;
        s5Var.k().c();
        s5.a((n6) s5Var.f());
        j4 v = s5Var.v();
        v.w();
        String str = v.c;
        Pair<String, Boolean> a2 = s5Var.i().a(str);
        if (!s5Var.f3861g.s().booleanValue() || ((Boolean) a2.second).booleanValue() || TextUtils.isEmpty((CharSequence) a2.first)) {
            s5Var.n().f3765m.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        r7 f2 = s5Var.f();
        f2.o();
        try {
            networkInfo = ((ConnectivityManager) f2.a.a.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (!(networkInfo != null && networkInfo.isConnected())) {
            s5Var.n().f3761i.a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        ca p2 = s5Var.p();
        s5Var.v().a.f3861g.o();
        String str2 = (String) a2.first;
        long a3 = s5Var.i().A.a() - 1;
        if (p2 != null) {
            try {
                q.b(str2);
                q.b(str);
                String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{25001L, Integer.valueOf(p2.v())}), str2, str, Long.valueOf(a3)});
                if (str.equals(p2.a.f3861g.a("debug.deferred.deeplink", ""))) {
                    format = format.concat("&ddl_test=1");
                }
                url = new URL(format);
            } catch (IllegalArgumentException | MalformedURLException e2) {
                p2.n().f3758f.a("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
                url = null;
            }
            r7 f3 = s5Var.f();
            r5 r5Var = new r5(s5Var);
            f3.c();
            f3.o();
            q.a(url);
            q.a(r5Var);
            f3.k().b(new t7(f3, str, url, r5Var));
            return;
        }
        throw null;
    }
}
