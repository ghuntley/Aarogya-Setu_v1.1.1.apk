package h.a0.x.o.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import h.a0.l;

/* compiled from: BatteryChargingTracker */
public class a extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f1024i = l.a("BatteryChrgTracker");

    public a(Context context, h.a0.x.r.p.a aVar) {
        super(context, aVar);
    }

    public Object a() {
        int intExtra;
        Intent registerReceiver = this.f1029b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            l.a().b(f1024i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : (intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    public void a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            l.a().a(f1024i, String.format("Received %s", new Object[]{action}), new Throwable[0]);
            char c = 65535;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        c = 1;
                        break;
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a(true);
            } else if (c == 1) {
                a(false);
            } else if (c == 2) {
                a(true);
            } else if (c == 3) {
                a(false);
            }
        }
    }
}
