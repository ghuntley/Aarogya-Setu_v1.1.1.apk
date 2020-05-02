package h.a0.x.o.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import h.a0.l;

/* compiled from: NetworkStateTracker */
public class e extends d<h.a0.x.o.b> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f1031j = l.a("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f1032g = ((ConnectivityManager) this.f1029b.getSystemService("connectivity"));

    /* renamed from: h  reason: collision with root package name */
    public b f1033h;

    /* renamed from: i  reason: collision with root package name */
    public a f1034i;

    /* compiled from: NetworkStateTracker */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                l.a().a(e.f1031j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.a(eVar.d());
            }
        }
    }

    /* compiled from: NetworkStateTracker */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            l.a().a(e.f1031j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.a(eVar.d());
        }

        public void onLost(Network network) {
            l.a().a(e.f1031j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.a(eVar.d());
        }
    }

    public e(Context context, h.a0.x.r.p.a aVar) {
        super(context, aVar);
        if (e()) {
            this.f1033h = new b();
        } else {
            this.f1034i = new a();
        }
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public Object a() {
        return d();
    }

    public void b() {
        if (e()) {
            try {
                l.a().a(f1031j, "Registering network callback", new Throwable[0]);
                this.f1032g.registerDefaultNetworkCallback(this.f1033h);
            } catch (IllegalArgumentException e) {
                l.a().b(f1031j, "Received exception while unregistering network callback", e);
            }
        } else {
            l.a().a(f1031j, "Registering broadcast receiver", new Throwable[0]);
            this.f1029b.registerReceiver(this.f1034i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void c() {
        if (e()) {
            try {
                l.a().a(f1031j, "Unregistering network callback", new Throwable[0]);
                this.f1032g.unregisterNetworkCallback(this.f1033h);
            } catch (IllegalArgumentException e) {
                l.a().b(f1031j, "Received exception while unregistering network callback", e);
            }
        } else {
            l.a().a(f1031j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f1029b.unregisterReceiver(this.f1034i);
        }
    }

    public h.a0.x.o.b d() {
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo = this.f1032g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean z3 = Build.VERSION.SDK_INT >= 23 && (networkCapabilities = this.f1032g.getNetworkCapabilities(this.f1032g.getActiveNetwork())) != null && networkCapabilities.hasCapability(16);
        boolean isActiveNetworkMetered = this.f1032g.isActiveNetworkMetered();
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new h.a0.x.o.b(z2, z3, isActiveNetworkMetered, z);
    }
}
