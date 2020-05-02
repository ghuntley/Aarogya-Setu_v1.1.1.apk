package i.c.d.j;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public static d f4679b;
    public final SharedPreferences a;

    public d(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f4679b == null) {
                f4679b = new d(context);
            }
            dVar = f4679b;
        }
        return dVar;
    }

    public synchronized boolean a(String str, long j2) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j2).apply();
            return true;
        } else if (j2 - this.a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.a.edit().putLong(str, j2).apply();
            return true;
        }
    }

    public synchronized boolean a(long j2) {
        return a("fire-global", j2);
    }
}
