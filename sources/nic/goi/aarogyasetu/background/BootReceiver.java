package nic.goi.aarogyasetu.background;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b.a.a.l.h;
import b.a.a.l.o;
import h.h.f.a;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;

/* compiled from: BootReceiver.kt */
public final class BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (context != null) {
            if (f.a((Object) intent != null ? intent.getAction() : null, (Object) "android.intent.action.BOOT_COMPLETED") && h.c.a()) {
                boolean z = false;
                if (a.a(context, "android.permission.BLUETOOTH") == 0 && a.a(context, "android.permission.BLUETOOTH_ADMIN") == 0 && a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    String a = b.a.a.k.a.a((Context) CoronaApplication.f5224g, "unique_id", "");
                    if (!BluetoothScanningService.f5231p) {
                        f.a((Object) a, "uniqueId");
                        if (a.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            a.a(context, new Intent(context, BluetoothScanningService.class));
                        }
                    }
                    o.f436b.c();
                }
            }
        }
    }
}
