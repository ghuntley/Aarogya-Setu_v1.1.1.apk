package l.a.a.a.o.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import l.a.a.a.f;
import l.a.a.a.o.f.c;

/* compiled from: AdvertisingInfoProvider */
public class d {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5060b;

    public d(Context context) {
        this.a = context.getApplicationContext();
        this.f5060b = new l.a.a.a.o.f.d(context, "TwitterAdvertisingInfoPreferences");
    }

    public b a() {
        b bVar = new b(((l.a.a.a.o.f.d) this.f5060b).a.getString("advertising_id", ""), ((l.a.a.a.o.f.d) this.f5060b).a.getBoolean("limit_ad_tracking_enabled", false));
        if (a(bVar)) {
            if (f.a().a("Fabric", 3)) {
                Log.d("Fabric", "Using AdvertisingInfo from Preference Store", (Throwable) null);
            }
            new Thread(new c(this, bVar)).start();
            return bVar;
        }
        b b2 = b();
        b(b2);
        return b2;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void b(b bVar) {
        if (a(bVar)) {
            c cVar = this.f5060b;
            SharedPreferences.Editor putBoolean = ((l.a.a.a.o.f.d) cVar).a().putString("advertising_id", bVar.a).putBoolean("limit_ad_tracking_enabled", bVar.f5058b);
            if (((l.a.a.a.o.f.d) cVar) != null) {
                putBoolean.apply();
                return;
            }
            throw null;
        }
        c cVar2 = this.f5060b;
        SharedPreferences.Editor remove = ((l.a.a.a.o.f.d) cVar2).a().remove("advertising_id").remove("limit_ad_tracking_enabled");
        if (((l.a.a.a.o.f.d) cVar2) != null) {
            remove.apply();
            return;
        }
        throw null;
    }

    public final b b() {
        b a2 = new e(this.a).a();
        if (!a(a2)) {
            a2 = new f(this.a).a();
            if (!a(a2)) {
                if (f.a().a("Fabric", 3)) {
                    Log.d("Fabric", "AdvertisingInfo not present", (Throwable) null);
                }
            } else if (f.a().a("Fabric", 3)) {
                Log.d("Fabric", "Using AdvertisingInfo from Service Provider", (Throwable) null);
            }
        } else if (f.a().a("Fabric", 3)) {
            Log.d("Fabric", "Using AdvertisingInfo from Reflection Provider", (Throwable) null);
        }
        return a2;
    }

    public final boolean a(b bVar) {
        return bVar != null && !TextUtils.isEmpty(bVar.a);
    }
}
