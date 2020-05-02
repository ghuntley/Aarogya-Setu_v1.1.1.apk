package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import h.a0.l;
import h.a0.x.n.b.e;
import h.a0.x.r.k;
import h.o.o;

public class SystemAlarmService extends o implements e.c {

    /* renamed from: h  reason: collision with root package name */
    public static final String f381h = l.a("SystemAlarmService");

    /* renamed from: f  reason: collision with root package name */
    public e f382f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f383g;

    public void d() {
        this.f383g = true;
        l.a().a(f381h, "All commands completed in dispatcher", new Throwable[0]);
        k.a();
        stopSelf();
    }

    public final void e() {
        e eVar = new e(this);
        this.f382f = eVar;
        if (eVar.f1012n != null) {
            l.a().b(e.f1003o, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            eVar.f1012n = this;
        }
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f383g = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f383g = true;
        this.f382f.c();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f383g) {
            l.a().c(f381h, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f382f.c();
            e();
            this.f383g = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f382f.a(intent, i3);
        return 3;
    }
}
