package l.a.a.a.o.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import l.a.a.a.c;
import l.a.a.a.f;
import l.a.a.a.k;

/* compiled from: IdManager */
public class s {

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f5088m = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: n  reason: collision with root package name */
    public static final String f5089n = Pattern.quote("/");
    public final ReentrantLock a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final t f5090b;
    public final boolean c;
    public final boolean d;
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5091f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5092g;

    /* renamed from: h  reason: collision with root package name */
    public final Collection<k> f5093h;

    /* renamed from: i  reason: collision with root package name */
    public d f5094i;

    /* renamed from: j  reason: collision with root package name */
    public b f5095j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5096k;

    /* renamed from: l  reason: collision with root package name */
    public r f5097l;

    /* compiled from: IdManager */
    public enum a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int e;

        /* access modifiers changed from: public */
        a(int i2) {
            this.e = i2;
        }
    }

    public s(Context context, String str, String str2, Collection<k> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.e = context;
            this.f5091f = str;
            this.f5092g = str2;
            this.f5093h = collection;
            this.f5090b = new t();
            this.f5094i = new d(context);
            this.f5097l = new r();
            boolean a2 = i.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            this.c = a2;
            if (!a2) {
                c a3 = f.a();
                StringBuilder a4 = i.a.a.a.a.a("Device ID collection disabled for ");
                a4.append(context.getPackageName());
                String sb = a4.toString();
                if (a3.a("Fabric", 3)) {
                    Log.d("Fabric", sb, (Throwable) null);
                }
            }
            boolean a5 = i.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            this.d = a5;
            if (!a5) {
                c a6 = f.a();
                StringBuilder a7 = i.a.a.a.a.a("User information collection disabled for ");
                a7.append(context.getPackageName());
                String sb2 = a7.toString();
                if (a6.a("Fabric", 3)) {
                    Log.d("Fabric", sb2, (Throwable) null);
                }
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    public final String a(String str) {
        return str.replaceAll(f5089n, "");
    }

    public String b() {
        String str;
        String str2 = this.f5092g;
        if (str2 != null) {
            return str2;
        }
        SharedPreferences e2 = i.e(this.e);
        b a2 = a();
        String str3 = null;
        if (a2 != null) {
            String str4 = a2.a;
            this.a.lock();
            try {
                if (!TextUtils.isEmpty(str4)) {
                    String string = e2.getString("crashlytics.advertising.id", (String) null);
                    if (TextUtils.isEmpty(string)) {
                        e2.edit().putString("crashlytics.advertising.id", str4).commit();
                    } else if (!string.equals(str4)) {
                        e2.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str4).commit();
                    }
                }
            } finally {
                this.a.unlock();
            }
        }
        String string2 = e2.getString("crashlytics.installation.id", (String) null);
        if (string2 != null) {
            return string2;
        }
        this.a.lock();
        try {
            String string3 = e2.getString("crashlytics.installation.id", (String) null);
            if (string3 == null) {
                String uuid = UUID.randomUUID().toString();
                if (uuid != null) {
                    str3 = f5088m.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
                }
                e2.edit().putString("crashlytics.installation.id", str3).commit();
                str = str3;
            } else {
                str = string3;
            }
            return str;
        } finally {
            this.a.unlock();
        }
    }

    public Map<a, String> c() {
        HashMap hashMap = new HashMap();
        for (k next : this.f5093h) {
            if (next instanceof n) {
                for (Map.Entry next2 : ((n) next).getDeviceIdentifiers().entrySet()) {
                    a aVar = (a) next2.getKey();
                    String str = (String) next2.getValue();
                    if (str != null) {
                        hashMap.put(aVar, str);
                    }
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String d() {
        t tVar = this.f5090b;
        Context context = this.e;
        if (tVar != null) {
            try {
                String a2 = tVar.f5106b.a(context, tVar.a);
                if ("".equals(a2)) {
                    return null;
                }
                return a2;
            } catch (Exception e2) {
                if (!f.a().a("Fabric", 6)) {
                    return null;
                }
                Log.e("Fabric", "Failed to determine installer package name", e2);
                return null;
            }
        } else {
            throw null;
        }
    }

    public String e() {
        return String.format(Locale.US, "%s/%s", new Object[]{a(Build.MANUFACTURER), a(Build.MODEL)});
    }

    public synchronized b a() {
        if (!this.f5096k) {
            this.f5095j = this.f5094i.a();
            this.f5096k = true;
        }
        return this.f5095j;
    }
}
