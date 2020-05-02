package i.c.a.b.i.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.pc;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class j5 {
    public final k5 a;

    public j5(k5 k5Var) {
        q.a(k5Var);
        this.a = k5Var;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        q.a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        s5 a2 = s5.a(context, (pc) null);
        m4 n2 = a2.n();
        if (intent == null) {
            n2.f3761i.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        n2.f3766n.a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            n2.f3766n.a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                m5 k2 = a2.k();
                i5 i5Var = new i5(a2, n2);
                k2.o();
                q.a(i5Var);
                k2.a((q5<?>) new q5(k2, i5Var, "Task exception on worker thread"));
            } catch (Exception e) {
                n2.f3761i.a("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult a3 = this.a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                n2.f3766n.a("Install referrer extras are null");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            n2.f3764l.a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                stringExtra = stringExtra.length() != 0 ? "?".concat(stringExtra) : new String("?");
            }
            Bundle a4 = a2.p().a(Uri.parse(stringExtra));
            if (a4 == null) {
                n2.f3766n.a("No campaign defined in install referrer broadcast");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                n2.f3761i.a("Install referrer is missing timestamp");
            }
            m5 k3 = a2.k();
            l5 l5Var = new l5(a2, longExtra, a4, context, n2, a3);
            k3.o();
            q.a(l5Var);
            k3.a((q5<?>) new q5(k3, l5Var, "Task exception on worker thread"));
        }
    }
}
