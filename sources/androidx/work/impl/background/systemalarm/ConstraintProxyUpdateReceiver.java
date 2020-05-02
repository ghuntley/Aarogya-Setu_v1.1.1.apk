package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import h.a0.l;
import h.a0.x.j;
import h.a0.x.r.f;
import h.a0.x.r.p.b;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = l.a("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {
        public final /* synthetic */ Intent e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Context f379f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f380g;

        public a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.e = intent;
            this.f379f = context;
            this.f380g = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.e.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.e.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.e.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.e.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                l.a().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                f.a(this.f379f, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                f.a(this.f379f, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                f.a(this.f379f, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                f.a(this.f379f, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f380g.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            l.a().a(a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((b) j.a(context).d).a.execute(new a(this, intent, context, goAsync));
    }
}
