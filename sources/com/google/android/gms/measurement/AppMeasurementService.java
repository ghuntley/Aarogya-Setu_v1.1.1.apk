package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import h.n.a.a;
import i.c.a.b.g.g.pc;
import i.c.a.b.i.a.c9;
import i.c.a.b.i.a.d9;
import i.c.a.b.i.a.m4;
import i.c.a.b.i.a.s5;
import i.c.a.b.i.a.t5;
import i.c.a.b.i.a.t9;
import i.c.a.b.i.a.y8;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class AppMeasurementService extends Service implements d9 {
    public y8<AppMeasurementService> e;

    public final y8<AppMeasurementService> a() {
        if (this.e == null) {
            this.e = new y8<>(this);
        }
        return this.e;
    }

    public final IBinder onBind(Intent intent) {
        y8<AppMeasurementService> a = a();
        if (a == null) {
            throw null;
        } else if (intent == null) {
            a.a().f3758f.a("onBind called with null intent");
            return null;
        } else {
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new t5(t9.a((Context) a.a));
            }
            a.a().f3761i.a("onBind received unknown action", action);
            return null;
        }
    }

    public final void onCreate() {
        super.onCreate();
        s5.a((Context) a().a, (pc) null).n().f3766n.a("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        s5.a((Context) a().a, (pc) null).n().f3766n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        y8<AppMeasurementService> a = a();
        m4 n2 = s5.a((Context) a.a, (pc) null).n();
        if (intent == null) {
            n2.f3761i.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        n2.f3766n.a("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        a.a((Runnable) new c9(a, i3, n2, intent));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        a().a(intent);
        return true;
    }

    public final boolean a(int i2) {
        return stopSelfResult(i2);
    }

    public final void a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        a.a(intent);
    }
}
