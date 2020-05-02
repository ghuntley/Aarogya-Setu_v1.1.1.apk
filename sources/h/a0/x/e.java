package h.a0.x;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import h.a0.b;
import h.a0.l;
import h.a0.x.q.p;
import h.a0.x.q.q;
import h.a0.x.q.r;
import h.a0.x.r.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers */
public class e {
    public static final String a = l.a("Schedulers");

    /* JADX INFO: finally extract failed */
    public static void a(b bVar, WorkDatabase workDatabase, List<d> list) {
        int i2;
        if (list != null && list.size() != 0) {
            q n2 = workDatabase.n();
            workDatabase.c();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i2 = bVar.f896h / 2;
                } else {
                    i2 = bVar.f896h;
                }
                r rVar = (r) n2;
                ArrayList arrayList = (ArrayList) rVar.a(i2);
                if (arrayList.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        rVar.a(((p) it.next()).a, currentTimeMillis);
                    }
                }
                workDatabase.h();
                workDatabase.e();
                if (arrayList.size() > 0) {
                    p[] pVarArr = (p[]) arrayList.toArray(new p[0]);
                    for (d a2 : list) {
                        a2.a(pVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.e();
                throw th;
            }
        }
    }

    public static d a(Context context, j jVar) {
        d dVar;
        if (Build.VERSION.SDK_INT >= 23) {
            h.a0.x.n.c.b bVar = new h.a0.x.n.c.b(context, jVar);
            f.a(context, SystemJobService.class, true);
            l.a().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        try {
            dVar = (d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            l.a().a(a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
        } catch (Throwable th) {
            l.a().a(a, "Unable to create GCM Scheduler", th);
            dVar = null;
        }
        d dVar2 = dVar;
        if (dVar2 != null) {
            return dVar2;
        }
        h.a0.x.n.b.f fVar = new h.a0.x.n.b.f(context);
        f.a(context, SystemAlarmService.class, true);
        l.a().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }
}
