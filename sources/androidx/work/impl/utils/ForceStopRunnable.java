package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import h.a0.l;
import h.a0.t;
import h.a0.x.e;
import h.a0.x.i;
import h.a0.x.j;
import h.a0.x.n.c.b;
import h.a0.x.q.f;
import h.a0.x.q.n;
import h.a0.x.q.o;
import h.a0.x.q.p;
import h.a0.x.q.q;
import h.a0.x.q.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public static final String f398g = l.a("ForceStopRunnable");

    /* renamed from: h  reason: collision with root package name */
    public static final long f399h = TimeUnit.DAYS.toMillis(3650);
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final j f400f;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = l.a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                l a2 = l.a();
                String str = a;
                if (((l.a) a2).f918b <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.a(context);
            }
        }
    }

    public ForceStopRunnable(Context context, j jVar) {
        this.e = context.getApplicationContext();
        this.f400f = jVar;
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            b.b(this.e);
        }
        WorkDatabase workDatabase = this.f400f.c;
        q n2 = workDatabase.n();
        n m2 = workDatabase.m();
        workDatabase.c();
        r rVar = (r) n2;
        try {
            List<p> b2 = rVar.b();
            boolean z = !((ArrayList) b2).isEmpty();
            if (z) {
                Iterator it = ((ArrayList) b2).iterator();
                while (it.hasNext()) {
                    p pVar = (p) it.next();
                    rVar.a(t.ENQUEUED, pVar.a);
                    rVar.a(pVar.a, -1);
                }
            }
            ((o) m2).a();
            workDatabase.h();
            return z;
        } finally {
            workDatabase.e();
        }
    }

    public boolean b() {
        Long a = ((f) this.f400f.f960g.a.j()).a("reschedule_needed");
        return a != null && a.longValue() == 1;
    }

    public void run() {
        boolean z;
        i.a(this.e);
        l.a().a(f398g, "Performing cleanup operations.", new Throwable[0]);
        try {
            boolean a = a();
            if (b()) {
                l.a().a(f398g, "Rescheduling Workers.", new Throwable[0]);
                this.f400f.b();
                this.f400f.f960g.a(false);
            } else {
                if (a(this.e, 536870912) == null) {
                    a(this.e);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    l.a().a(f398g, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.f400f.b();
                } else if (a) {
                    l.a().a(f398g, "Found unfinished work, scheduling it.", new Throwable[0]);
                    e.a(this.f400f.f958b, this.f400f.c, this.f400f.e);
                }
            }
            this.f400f.a();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteDatabaseCorruptException e2) {
            l.a().b(f398g, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
            throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
        }
    }

    public static PendingIntent a(Context context, int i2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i2);
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f399h;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, a);
        }
    }
}
