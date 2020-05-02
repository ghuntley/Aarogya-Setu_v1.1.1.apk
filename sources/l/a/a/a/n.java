package l.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.crashlytics.android.core.SessionProtobufHelper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.l;
import l.a.a.a.o.e.a;
import l.a.a.a.o.e.c;
import l.a.a.a.o.g.d;
import l.a.a.a.o.g.e;
import l.a.a.a.o.g.g;
import l.a.a.a.o.g.m;
import l.a.a.a.o.g.p;
import l.a.a.a.o.g.s;
import l.a.a.a.o.g.v;

/* compiled from: Onboarding */
public class n extends k<Boolean> {
    public final c e = new a();

    /* renamed from: f  reason: collision with root package name */
    public PackageManager f5047f;

    /* renamed from: g  reason: collision with root package name */
    public String f5048g;

    /* renamed from: h  reason: collision with root package name */
    public PackageInfo f5049h;

    /* renamed from: i  reason: collision with root package name */
    public String f5050i;

    /* renamed from: j  reason: collision with root package name */
    public String f5051j;

    /* renamed from: k  reason: collision with root package name */
    public String f5052k;

    /* renamed from: l  reason: collision with root package name */
    public String f5053l;

    /* renamed from: m  reason: collision with root package name */
    public String f5054m;

    /* renamed from: n  reason: collision with root package name */
    public final Future<Map<String, m>> f5055n;

    /* renamed from: o  reason: collision with root package name */
    public final Collection<k> f5056o;

    public n(Future<Map<String, m>> future, Collection<k> collection) {
        this.f5055n = future;
        this.f5056o = collection;
    }

    public final boolean a(String str, e eVar, Collection<m> collection) {
        if ("new".equals(eVar.a)) {
            if (new g(this, getOverridenSpiEndpoint(), eVar.f5174b, this.e).a(a(m.a(getContext(), str), collection))) {
                return p.b.a.c();
            }
            if (f.a().a("Fabric", 6)) {
                Log.e("Fabric", "Failed to create app with Crashlytics service.", (Throwable) null);
            }
            return false;
        } else if ("configured".equals(eVar.a)) {
            return p.b.a.c();
        } else {
            if (eVar.e) {
                if (f.a().a("Fabric", 3)) {
                    Log.d("Fabric", "Server says an update is required - forcing a full App update.", (Throwable) null);
                }
                new v(this, getOverridenSpiEndpoint(), eVar.f5174b, this.e).a(a(m.a(getContext(), str), collection));
            }
            return true;
        }
    }

    public Object doInBackground() {
        s sVar;
        boolean z;
        Map map;
        String b2 = i.b(getContext());
        try {
            p pVar = p.b.a;
            pVar.a(this, this.idManager, this.e, this.f5050i, this.f5051j, getOverridenSpiEndpoint(), l.a(getContext()));
            pVar.b();
            sVar = p.b.a.a();
        } catch (Exception e2) {
            if (f.a().a("Fabric", 6)) {
                Log.e("Fabric", "Error dealing with settings", e2);
            }
            sVar = null;
        }
        if (sVar != null) {
            try {
                if (this.f5055n != null) {
                    map = this.f5055n.get();
                } else {
                    map = new HashMap();
                }
                for (k next : this.f5056o) {
                    if (!map.containsKey(next.getIdentifier())) {
                        map.put(next.getIdentifier(), new m(next.getIdentifier(), next.getVersion(), "binary"));
                    }
                }
                z = a(b2, sVar.a, map.values());
            } catch (Exception e3) {
                if (f.a().a("Fabric", 6)) {
                    Log.e("Fabric", "Error performing auto configuration.", e3);
                }
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public String getOverridenSpiEndpoint() {
        return i.a(getContext(), "com.crashlytics.ApiEndpoint");
    }

    public String getVersion() {
        return "1.4.8.32";
    }

    public boolean onPreExecute() {
        try {
            this.f5052k = getIdManager().d();
            this.f5047f = getContext().getPackageManager();
            String packageName = getContext().getPackageName();
            this.f5048g = packageName;
            PackageInfo packageInfo = this.f5047f.getPackageInfo(packageName, 0);
            this.f5049h = packageInfo;
            this.f5050i = Integer.toString(packageInfo.versionCode);
            this.f5051j = this.f5049h.versionName == null ? "0.0" : this.f5049h.versionName;
            this.f5053l = this.f5047f.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.f5054m = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            if (f.a().a("Fabric", 6)) {
                Log.e("Fabric", "Failed init", e2);
            }
            return false;
        }
    }

    public final d a(m mVar, Collection<m> collection) {
        Context context = getContext();
        return new d(new l.a.a.a.o.b.g().c(context), getIdManager().f5091f, this.f5051j, this.f5050i, i.a(i.j(context)), this.f5053l, l.a.a.a.o.b.m.a(this.f5052k).e, this.f5054m, SessionProtobufHelper.SIGNAL_DEFAULT, mVar, collection);
    }
}
