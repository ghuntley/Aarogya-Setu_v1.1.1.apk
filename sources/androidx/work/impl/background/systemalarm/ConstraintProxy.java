package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h.a0.c;
import h.a0.l;
import h.a0.m;
import h.a0.x.n.b.b;
import h.a0.x.q.p;
import java.util.List;

public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final String a = l.a("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    public static void a(Context context, List<p> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (p pVar : list) {
            c cVar = pVar.f1065j;
            z |= cVar.d;
            z2 |= cVar.f902b;
            z3 |= cVar.e;
            z4 |= cVar.a != m.e;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        l.a().a(a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(b.a(context));
    }
}
