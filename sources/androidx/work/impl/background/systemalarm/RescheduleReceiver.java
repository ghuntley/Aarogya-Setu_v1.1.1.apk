package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import h.a0.l;
import h.a0.x.j;
import h.a0.x.n.b.b;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = l.a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        l.a().a(a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                j.a(context).a(goAsync());
            } catch (IllegalStateException unused) {
                l.a().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            context.startService(b.b(context));
        }
    }
}
