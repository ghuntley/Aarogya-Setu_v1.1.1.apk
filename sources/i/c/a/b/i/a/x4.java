package i.c.a.b.i.a;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import i.c.a.b.d.o.c;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class x4 extends n6 {
    public static final Pair<String, Long> C = new Pair<>("", 0L);
    public d5 A = new d5(this, "deep_link_retrieval_attempts", 0);
    public final f5 B = new f5(this, "firebase_feature_rollouts");
    public SharedPreferences c;
    public b5 d;
    public final d5 e = new d5(this, "last_upload", 0);

    /* renamed from: f  reason: collision with root package name */
    public final d5 f3929f = new d5(this, "last_upload_attempt", 0);

    /* renamed from: g  reason: collision with root package name */
    public final d5 f3930g = new d5(this, "backoff", 0);

    /* renamed from: h  reason: collision with root package name */
    public final d5 f3931h = new d5(this, "last_delete_stale", 0);

    /* renamed from: i  reason: collision with root package name */
    public final d5 f3932i = new d5(this, "midnight_offset", 0);

    /* renamed from: j  reason: collision with root package name */
    public final d5 f3933j = new d5(this, "first_open_time", 0);

    /* renamed from: k  reason: collision with root package name */
    public final d5 f3934k = new d5(this, "app_install_time", 0);

    /* renamed from: l  reason: collision with root package name */
    public final f5 f3935l = new f5(this, "app_instance_id");

    /* renamed from: m  reason: collision with root package name */
    public String f3936m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3937n;

    /* renamed from: o  reason: collision with root package name */
    public long f3938o;

    /* renamed from: p  reason: collision with root package name */
    public final d5 f3939p = new d5(this, "time_before_start", 10000);

    /* renamed from: q  reason: collision with root package name */
    public final d5 f3940q = new d5(this, "session_timeout", 1800000);
    public final z4 r = new z4(this, "start_new_session", true);
    public final f5 s = new f5(this, "non_personalized_ads");
    public final z4 t = new z4(this, "use_dynamite_api", false);
    public final z4 u = new z4(this, "allow_remote_dynamite", false);
    public final d5 v = new d5(this, "last_pause_time", 0);
    public final d5 w = new d5(this, "time_active", 0);
    public boolean x;
    public z4 y = new z4(this, "app_backgrounded", false);
    public z4 z = new z4(this, "deep_link_retrieval_complete", false);

    public x4(s5 s5Var) {
        super(s5Var);
    }

    public final Pair<String, Boolean> a(String str) {
        c();
        if (((c) this.a.f3868n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f3936m != null && elapsedRealtime < this.f3938o) {
                return new Pair<>(this.f3936m, Boolean.valueOf(this.f3937n));
            }
            this.f3938o = this.a.f3861g.a(str, o.f3801b) + elapsedRealtime;
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.a);
                if (advertisingIdInfo != null) {
                    this.f3936m = advertisingIdInfo.getId();
                    this.f3937n = advertisingIdInfo.isLimitAdTrackingEnabled();
                }
                if (this.f3936m == null) {
                    this.f3936m = "";
                }
            } catch (Exception e2) {
                n().f3765m.a("Unable to get advertising id", e2);
                this.f3936m = "";
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair<>(this.f3936m, Boolean.valueOf(this.f3937n));
        }
        throw null;
    }

    public final String b(String str) {
        c();
        String str2 = (String) a(str).first;
        MessageDigest x2 = ca.x();
        if (x2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, x2.digest(str2.getBytes()))});
    }

    public final void m() {
        SharedPreferences sharedPreferences = this.a.a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.x = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.d = new b5(this, "health_monitor", Math.max(0, o.c.a(null).longValue()), (a5) null);
    }

    public final boolean r() {
        return true;
    }

    public final SharedPreferences t() {
        c();
        o();
        return this.c;
    }

    public final Boolean u() {
        c();
        if (t().contains("measurement_enabled")) {
            return Boolean.valueOf(t().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void a(boolean z2) {
        c();
        n().f3766n.a("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    public final boolean a(long j2) {
        return j2 - this.f3940q.a() > this.v.a();
    }
}
