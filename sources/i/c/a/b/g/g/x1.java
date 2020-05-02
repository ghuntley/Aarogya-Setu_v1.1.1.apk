package i.c.a.b.g.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import h.e.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class x1 implements h1 {

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, x1> f3518f = new a();
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences.OnSharedPreferenceChangeListener f3519b = new w1(this);
    public final Object c = new Object();
    public volatile Map<String, ?> d;
    public final List<i1> e = new ArrayList();

    public x1(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f3519b);
    }

    public static x1 a(Context context, String str) {
        x1 x1Var;
        SharedPreferences sharedPreferences;
        boolean z = true;
        if (d1.a() && !str.startsWith("direct_boot:") && d1.a() && !d1.a(context)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        synchronized (x1.class) {
            x1Var = f3518f.get(str);
            if (x1Var == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (d1.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                    x1Var = new x1(sharedPreferences);
                    f3518f.put(str, x1Var);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
        }
        return x1Var;
    }

    public static synchronized void b() {
        synchronized (x1.class) {
            for (x1 next : f3518f.values()) {
                next.a.unregisterOnSharedPreferenceChangeListener(next.f3519b);
            }
            f3518f.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object a(String str) {
        Map<String, ?> map = this.d;
        if (map == null) {
            synchronized (this.c) {
                map = this.d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.a.getAll();
                        this.d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final /* synthetic */ void a() {
        synchronized (this.c) {
            this.d = null;
            o1.f3376i.incrementAndGet();
        }
        synchronized (this) {
            for (i1 a2 : this.e) {
                a2.a();
            }
        }
    }
}
