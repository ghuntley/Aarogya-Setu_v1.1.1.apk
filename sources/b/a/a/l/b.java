package b.a.a.l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b.a.a.l.o;
import com.crashlytics.android.core.CrashlyticsController;
import com.google.firebase.analytics.FirebaseAnalytics;
import i.c.d.p.e;
import n.h;
import n.m.c.f;
import n.m.c.g;
import n.q.d;
import nic.goi.aarogyasetu.CoronaApplication;

/* compiled from: AnalyticsUtils.kt */
public final class b {

    /* compiled from: AnalyticsUtils.kt */
    public static final class a extends g implements n.m.b.a<h> {
        public static final a e = new a();

        public a() {
            super(0);
        }

        public Object invoke() {
            b0 b0Var;
            String str;
            String str2;
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(CoronaApplication.f5224g);
            f.a((Object) instance, "FirebaseAnalytics.getIns…ronaApplication.instance)");
            String str3 = "";
            String a = b.a.a.k.a.a((Context) CoronaApplication.f5224g, "unique_id", str3);
            o.a aVar = o.f436b;
            try {
                CoronaApplication coronaApplication = CoronaApplication.f5224g;
                f.a((Object) coronaApplication, "CoronaApplication.instance");
                PackageManager packageManager = coronaApplication.getPackageManager();
                CoronaApplication coronaApplication2 = CoronaApplication.f5224g;
                f.a((Object) coronaApplication2, "CoronaApplication.instance");
                PackageInfo packageInfo = packageManager.getPackageInfo(coronaApplication2.getPackageName(), 128);
                f.a((Object) packageInfo, "packageManager.getPackag…ageManager.GET_META_DATA)");
                b0Var = new b0(String.valueOf(packageInfo.firstInstallTime), String.valueOf(packageInfo.lastUpdateTime));
            } catch (Exception unused) {
                b0Var = null;
            }
            instance.a("did", a);
            instance.a("is_loggedin", String.valueOf(h.c.a()));
            if (b0Var == null || (str = b0Var.a) == null) {
                str = str3;
            }
            instance.a("first_install_time", str);
            if (!(b0Var == null || (str2 = b0Var.f423b) == null)) {
                str3 = str2;
            }
            instance.a("last_update_time", str3);
            instance.a("version_code", "1045");
            o.a aVar2 = o.f436b;
            CoronaApplication coronaApplication3 = CoronaApplication.f5224g;
            f.a((Object) coronaApplication3, "CoronaApplication.instance");
            instance.a("bl_allowed", String.valueOf(aVar2.d(coronaApplication3)));
            o.a aVar3 = o.f436b;
            CoronaApplication coronaApplication4 = CoronaApplication.f5224g;
            f.a((Object) coronaApplication4, "CoronaApplication.instance");
            instance.a("loc_allowed", String.valueOf(aVar3.f(coronaApplication4)));
            instance.a("bl_on", String.valueOf(o.f436b.b()));
            o.a aVar4 = o.f436b;
            CoronaApplication coronaApplication5 = CoronaApplication.f5224g;
            f.a((Object) coronaApplication5, "CoronaApplication.instance");
            instance.a("loc_on", String.valueOf(aVar4.e(coronaApplication5)));
            instance.a("lang", b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", "en"));
            return h.a;
        }
    }

    public static final void a() {
        e.a(false, false, (ClassLoader) null, (String) null, 0, a.e, 31);
    }

    public static final void a(String str, String str2) {
        a(str, str2, (String) null, (Bundle) null, 12);
    }

    public static /* synthetic */ void a(String str, String str2, String str3, Bundle bundle, int i2) {
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        if (str == null) {
            f.a("eventName");
            throw null;
        } else if (str2 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("screenName", str2);
            if (!(str3 == null || d.b(str3))) {
                bundle2.putString(CrashlyticsController.EVENT_TYPE_LOGGED, str3);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            o.a aVar = o.f436b;
            CoronaApplication coronaApplication = CoronaApplication.f5224g;
            f.a((Object) coronaApplication, "CoronaApplication.instance");
            bundle2.putBoolean("is_bl_allowed", aVar.d(coronaApplication));
            o.a aVar2 = o.f436b;
            CoronaApplication coronaApplication2 = CoronaApplication.f5224g;
            f.a((Object) coronaApplication2, "CoronaApplication.instance");
            bundle2.putBoolean("is_loc_allowed", aVar2.f(coronaApplication2));
            bundle2.putBoolean("is_bl_on", o.f436b.b());
            o.a aVar3 = o.f436b;
            CoronaApplication coronaApplication3 = CoronaApplication.f5224g;
            f.a((Object) coronaApplication3, "CoronaApplication.instance");
            bundle2.putBoolean("is_loc_on", aVar3.e(coronaApplication3));
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(CoronaApplication.f5224g);
            f.a((Object) instance, "FirebaseAnalytics.getIns…ronaApplication.instance)");
            instance.a(str, bundle2);
        } else {
            f.a("screenName");
            throw null;
        }
    }

    public static /* synthetic */ void a(String str, Bundle bundle, int i2) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        a(str, bundle);
    }

    public static final void a(String str, Bundle bundle) {
        if (str != null) {
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(CoronaApplication.f5224g);
            f.a((Object) instance, "FirebaseAnalytics.getIns…ronaApplication.instance)");
            instance.a(str, bundle);
            return;
        }
        f.a("eventName");
        throw null;
    }
}
