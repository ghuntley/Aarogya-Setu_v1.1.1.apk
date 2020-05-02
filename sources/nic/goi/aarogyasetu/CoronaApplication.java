package nic.goi.aarogyasetu;

import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import b.a.a.d;
import b.a.a.k.a;
import b.a.a.l.o;
import com.crashlytics.android.core.SessionProtobufHelper;
import h.a0.b;
import h.a0.x.j;
import i.c.a.b.h.c;
import i.c.a.b.h.v;
import i.c.a.b.l.d0;
import i.c.a.b.l.g;
import i.c.a.b.l.i;
import java.util.concurrent.Executors;

public class CoronaApplication extends Application implements b.C0025b {

    /* renamed from: g  reason: collision with root package name */
    public static CoronaApplication f5224g;

    /* renamed from: h  reason: collision with root package name */
    public static Location f5225h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f5226i = CoronaApplication.class.getSimpleName();
    public long e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f5227f = -1;

    public static /* synthetic */ void a(Location location) {
        if (location != null) {
            f5225h = location;
        }
    }

    public static void h() {
        if (o.f436b.f(f5224g)) {
            g a = c.a(f5224g).a(0, new v());
            b.a.a.c cVar = b.a.a.c.a;
            d0 d0Var = (d0) a;
            if (d0Var != null) {
                d0Var.a(i.a, cVar);
                return;
            }
            throw null;
        }
    }

    public Location b() {
        LocationManager locationManager = (LocationManager) getApplicationContext().getSystemService("location");
        for (String next : locationManager.getProviders(true)) {
            if (Build.VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 && checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(next);
            if (lastKnownLocation != null && (f5225h == null || lastKnownLocation.getAccuracy() > f5225h.getAccuracy())) {
                f5225h = lastKnownLocation;
            }
        }
        return f5225h;
    }

    public void c() {
        if (o.f436b.b()) {
            this.e = System.currentTimeMillis();
        } else {
            this.e = -1;
        }
    }

    public void d() {
        if (o.a(f5224g)) {
            this.f5227f = System.currentTimeMillis();
        } else {
            this.f5227f = -1;
        }
    }

    public void e() {
        if (this.e > 0) {
            a.b(f5224g, "bluetooth_on_time", String.valueOf(Long.parseLong(a.a((Context) f5224g, "bluetooth_on_time", SessionProtobufHelper.SIGNAL_DEFAULT)) + (System.currentTimeMillis() - this.e)));
            c();
        }
    }

    public void f() {
        if (this.f5227f > 0) {
            a.b(f5224g, "location_on_time", String.valueOf(Long.parseLong(a.a((Context) f5224g, "location_on_time", SessionProtobufHelper.SIGNAL_DEFAULT)) + (System.currentTimeMillis() - this.f5227f)));
            d();
        }
    }

    public void onCreate() {
        super.onCreate();
        f5224g = this;
        b.a aVar = new b.a();
        aVar.a = Executors.newFixedThreadPool(8);
        j.a(this, new b(aVar));
        registerActivityLifecycleCallbacks(new d());
        new Thread(b.a.a.b.e).start();
        c();
        d();
    }

    public b a() {
        b.a aVar = new b.a();
        aVar.a = Executors.newFixedThreadPool(8);
        return new b(aVar);
    }
}
