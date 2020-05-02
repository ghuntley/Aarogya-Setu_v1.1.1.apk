package h.a0.x.n.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import h.a0.l;
import h.a0.x.j;
import h.a0.x.q.g;
import h.a0.x.q.i;
import h.a0.x.r.e;

/* compiled from: Alarms */
public class a {
    public static final String a = l.a("Alarms");

    public static void a(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.a(context, str), 536870912);
        if (service != null && alarmManager != null) {
            l.a().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i2)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void a(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.a(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j2, service);
        }
    }

    public static void a(Context context, j jVar, String str) {
        i iVar = (i) jVar.c.k();
        g a2 = iVar.a(str);
        if (a2 != null) {
            a(context, str, a2.f1054b);
            l.a().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            iVar.b(str);
        }
    }

    public static void a(Context context, j jVar, String str, long j2) {
        WorkDatabase workDatabase = jVar.c;
        i iVar = (i) workDatabase.k();
        g a2 = iVar.a(str);
        if (a2 != null) {
            a(context, str, a2.f1054b);
            a(context, str, a2.f1054b, j2);
            return;
        }
        int a3 = new e(workDatabase).a();
        iVar.a(new g(str, a3));
        a(context, str, a3, j2);
    }
}
