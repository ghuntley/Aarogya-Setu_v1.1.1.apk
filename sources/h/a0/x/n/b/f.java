package h.a0.x.n.b;

import android.content.Context;
import h.a0.l;
import h.a0.x.d;
import h.a0.x.q.p;

/* compiled from: SystemAlarmScheduler */
public class f implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final String f1015f = l.a("SystemAlarmScheduler");
    public final Context e;

    public f(Context context) {
        this.e = context.getApplicationContext();
    }

    public void a(p... pVarArr) {
        for (p pVar : pVarArr) {
            l.a().a(f1015f, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.a}), new Throwable[0]);
            this.e.startService(b.b(this.e, pVar.a));
        }
    }

    public void a(String str) {
        this.e.startService(b.c(this.e, str));
    }
}
