package i.c.a.b.g.g;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import h.e.a;
import i.c.a.b.d.l.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class c1 implements h1 {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<Uri, c1> f3233g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f3234h = {"key", "value"};
    public final ContentResolver a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f3235b;
    public final ContentObserver c = new e1(this);
    public final Object d = new Object();
    public volatile Map<String, String> e;

    /* renamed from: f  reason: collision with root package name */
    public final List<i1> f3236f = new ArrayList();

    public c1(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.f3235b = uri;
        contentResolver.registerContentObserver(uri, false, this.c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.c.a.b.g.g.c1 a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<i.c.a.b.g.g.c1> r0 = i.c.a.b.g.g.c1.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, i.c.a.b.g.g.c1> r1 = f3233g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            i.c.a.b.g.g.c1 r1 = (i.c.a.b.g.g.c1) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            i.c.a.b.g.g.c1 r2 = new i.c.a.b.g.g.c1     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, i.c.a.b.g.g.c1> r3 = f3233g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.c1.a(android.content.ContentResolver, android.net.Uri):i.c.a.b.g.g.c1");
    }

    public static synchronized void c() {
        synchronized (c1.class) {
            for (c1 next : f3233g.values()) {
                next.a.unregisterContentObserver(next.c);
            }
            f3233g.clear();
        }
    }

    public final void b() {
        synchronized (this.d) {
            this.e = null;
            o1.f3376i.incrementAndGet();
        }
        synchronized (this) {
            for (i1 a2 : this.f3236f) {
                a2.a();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final Map<String, String> a() {
        Map<String, String> map;
        Map<String, String> map2 = this.e;
        if (map2 == null) {
            synchronized (this.d) {
                map2 = this.e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) q.a(new g1(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.e = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    public final /* synthetic */ Object a(String str) {
        return a().get(str);
    }
}
