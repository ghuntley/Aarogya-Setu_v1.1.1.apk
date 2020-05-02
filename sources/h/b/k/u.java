package h.b.k;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* compiled from: TwilightManager */
public class u {
    public static u d;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f1159b;
    public final a c = new a();

    /* compiled from: TwilightManager */
    public static class a {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public long f1160b;
    }

    public u(Context context, LocationManager locationManager) {
        this.a = context;
        this.f1159b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f1159b.isProviderEnabled(str)) {
                return this.f1159b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
