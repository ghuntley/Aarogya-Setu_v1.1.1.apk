package h.a0.x.n.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h.a0.l;
import h.a0.x.a;
import h.a0.x.n.b.e;
import h.a0.x.q.p;
import h.a0.x.q.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: CommandHandler */
public class b implements a {

    /* renamed from: h  reason: collision with root package name */
    public static final String f990h = l.a("CommandHandler");
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, a> f991f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Object f992g = new Object();

    public b(Context context) {
        this.e = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    public static Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    public void b(Intent intent, int i2, e eVar) {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            l.a().a(f990h, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
            c cVar = new c(this.e, i2, eVar);
            List<p> c = ((r) cVar.c.f1007i.c.n()).c();
            ConstraintProxy.a(cVar.a, c);
            cVar.d.a((Iterable<p>) c);
            ArrayList arrayList = (ArrayList) c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                String str = pVar.a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || cVar.d.a(str))) {
                    arrayList2.add(pVar);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = ((p) it2.next()).a;
                Intent a = a(cVar.a, str2);
                l.a().a(c.e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
                e eVar2 = cVar.c;
                eVar2.f1009k.post(new e.b(eVar2, a, cVar.f993b));
            }
            cVar.d.a();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            l.a().a(f990h, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
            eVar.f1007i.b();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= 1) {
                        z = true;
                        break;
                    } else if (extras.get(strArr[i3]) == null) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z = false;
            if (!z) {
                l.a().b(f990h, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                l.a().a(f990h, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
                WorkDatabase workDatabase = eVar.f1007i.c;
                workDatabase.c();
                try {
                    p c2 = ((r) workDatabase.n()).c(string);
                    if (c2 == null) {
                        l a2 = l.a();
                        String str3 = f990h;
                        a2.d(str3, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    } else if (c2.f1060b.f()) {
                        l a3 = l.a();
                        String str4 = f990h;
                        a3.d(str4, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    } else {
                        long a4 = c2.a();
                        if (!c2.b()) {
                            l.a().a(f990h, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                            a.a(this.e, eVar.f1007i, string, a4);
                        } else {
                            l.a().a(f990h, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                            a.a(this.e, eVar.f1007i, string, a4);
                            eVar.f1009k.post(new e.b(eVar, a(this.e), i2));
                        }
                        workDatabase.h();
                    }
                } finally {
                    workDatabase.e();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                a(intent, i2, eVar);
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string2 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                l.a().a(f990h, String.format("Handing stopWork work for %s", new Object[]{string2}), new Throwable[0]);
                eVar.f1007i.a(string2);
                a.a(this.e, eVar.f1007i, string2);
                eVar.a(string2, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string3 = extras2.getString("KEY_WORKSPEC_ID");
                boolean z2 = extras2.getBoolean("KEY_NEEDS_RESCHEDULE");
                l.a().a(f990h, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
                a(string3, z2);
            } else {
                l.a().d(f990h, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
            }
        }
    }

    public void a(String str, boolean z) {
        synchronized (this.f992g) {
            a remove = this.f991f.remove(str);
            if (remove != null) {
                remove.a(str, z);
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f992g) {
            z = !this.f991f.isEmpty();
        }
        return z;
    }

    public final void a(Intent intent, int i2, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f992g) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            l.a().a(f990h, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f991f.containsKey(string)) {
                d dVar = new d(this.e, i2, string, eVar);
                this.f991f.put(string, dVar);
                dVar.b();
            } else {
                l.a().a(f990h, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }
}
