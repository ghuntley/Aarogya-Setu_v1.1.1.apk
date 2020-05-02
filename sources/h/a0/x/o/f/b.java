package h.a0.x.o.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h.a0.l;
import h.a0.x.r.p.a;

/* compiled from: BatteryNotLowTracker */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f1025i = l.a("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public Object a() {
        Intent registerReceiver = this.f1029b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            l.a().b(f1025i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            l.a().a(f1025i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            if (c == 0) {
                a(true);
            } else if (c == 1) {
                a(false);
            }
        }
    }
}
