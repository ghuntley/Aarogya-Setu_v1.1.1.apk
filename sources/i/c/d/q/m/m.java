package i.c.d.q.m;

import android.content.SharedPreferences;
import i.c.d.q.h;
import java.util.Date;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class m {
    public static final Date d = new Date(-1);
    public static final Date e = new Date(-1);
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4805b = new Object();
    public final Object c = new Object();

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public Date f4806b;

        public a(int i2, Date date) {
            this.a = i2;
            this.f4806b = date;
        }
    }

    public m(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public void a(h hVar) {
        synchronized (this.f4805b) {
            this.a.edit().putBoolean("is_developer_mode_enabled", hVar.a).putLong("fetch_timeout_in_seconds", hVar.f4779b).putLong("minimum_fetch_interval_in_seconds", hVar.c).commit();
        }
    }

    public void b() {
        synchronized (this.f4805b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void c() {
        synchronized (this.f4805b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public void a(Date date) {
        synchronized (this.f4805b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void a(String str) {
        synchronized (this.f4805b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public void a(int i2, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
