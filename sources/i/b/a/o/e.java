package i.b.a.o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import i.b.a.j;
import i.b.a.o.c;

/* compiled from: DefaultConnectivityMonitor */
public final class e implements c {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final c.a f2802f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2803g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2804h;

    /* renamed from: i  reason: collision with root package name */
    public final BroadcastReceiver f2805i = new a();

    /* compiled from: DefaultConnectivityMonitor */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f2803g;
            eVar.f2803g = eVar.a(context);
            if (z != e.this.f2803g) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder a2 = i.a.a.a.a.a("connectivity changed, isConnected: ");
                    a2.append(e.this.f2803g);
                    Log.d("ConnectivityMonitor", a2.toString());
                }
                e eVar2 = e.this;
                ((j.b) eVar2.f2802f).a(eVar2.f2803g);
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.e = context.getApplicationContext();
        this.f2802f = aVar;
    }

    public void a() {
        if (this.f2804h) {
            this.e.unregisterReceiver(this.f2805i);
            this.f2804h = false;
        }
    }

    public void c() {
        if (!this.f2804h) {
            this.f2803g = a(this.e);
            try {
                this.e.registerReceiver(this.f2805i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f2804h = true;
            } catch (SecurityException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e2);
                }
            }
        }
    }

    public void d() {
    }

    @SuppressLint({"MissingPermission"})
    public boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        g.a.a.b.a.a(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }
}
