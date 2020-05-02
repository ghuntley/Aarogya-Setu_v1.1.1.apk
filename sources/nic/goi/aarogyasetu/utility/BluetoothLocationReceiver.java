package nic.goi.aarogyasetu.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import b.a.a.l.o;
import n.m.c.f;
import nic.goi.aarogyasetu.background.BluetoothScanningService;

/* compiled from: BluetoothLocationReceiver.kt */
public final class BluetoothLocationReceiver extends BroadcastReceiver {
    public final String a;

    public BluetoothLocationReceiver() {
        String simpleName = BluetoothLocationReceiver.class.getSimpleName();
        f.a((Object) simpleName, "BluetoothLocationReceiver::class.java.simpleName");
        this.a = simpleName;
    }

    public void onReceive(Context context, Intent intent) {
        String action;
        if (intent != null) {
            intent.getAction();
        }
        if (!BluetoothScanningService.f5231p && intent != null && (action = intent.getAction()) != null) {
            if (f.a((Object) "android.location.PROVIDERS_CHANGED", (Object) action)) {
                o.f436b.c();
            } else if (f.a((Object) "android.bluetooth.adapter.action.STATE_CHANGED", (Object) action) && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", RecyclerView.UNDEFINED_DURATION) == 12) {
                o.f436b.c();
            }
        }
    }
}
