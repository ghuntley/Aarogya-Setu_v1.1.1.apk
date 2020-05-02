package h.a0.x.n.b;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h.a0.l;
import h.a0.x.a;
import h.a0.x.n.b.e;
import h.a0.x.o.c;
import h.a0.x.q.p;
import h.a0.x.q.r;
import h.a0.x.r.k;
import h.a0.x.r.n;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler */
public class d implements c, a, n.b {

    /* renamed from: n  reason: collision with root package name */
    public static final String f994n = l.a("DelayMetCommandHandler");
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final int f995f;

    /* renamed from: g  reason: collision with root package name */
    public final String f996g;

    /* renamed from: h  reason: collision with root package name */
    public final e f997h;

    /* renamed from: i  reason: collision with root package name */
    public final h.a0.x.o.d f998i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f999j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public int f1000k = 0;

    /* renamed from: l  reason: collision with root package name */
    public PowerManager.WakeLock f1001l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1002m = false;

    public d(Context context, int i2, String str, e eVar) {
        this.e = context;
        this.f995f = i2;
        this.f997h = eVar;
        this.f996g = str;
        this.f998i = new h.a0.x.o.d(this.e, eVar.f1004f, this);
    }

    public void a(List<String> list) {
        if (list.contains(this.f996g)) {
            synchronized (this.f999j) {
                if (this.f1000k == 0) {
                    this.f1000k = 1;
                    l.a().a(f994n, String.format("onAllConstraintsMet for %s", new Object[]{this.f996g}), new Throwable[0]);
                    if (this.f997h.f1006h.a(this.f996g, (WorkerParameters.a) null)) {
                        this.f997h.f1005g.a(this.f996g, 600000, this);
                    } else {
                        a();
                    }
                } else {
                    l.a().a(f994n, String.format("Already started work for %s", new Object[]{this.f996g}), new Throwable[0]);
                }
            }
        }
    }

    public void b(List<String> list) {
        c();
    }

    public final void c() {
        synchronized (this.f999j) {
            if (this.f1000k < 2) {
                this.f1000k = 2;
                l.a().a(f994n, String.format("Stopping work for WorkSpec %s", new Object[]{this.f996g}), new Throwable[0]);
                Context context = this.e;
                String str = this.f996g;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str);
                e eVar = this.f997h;
                eVar.f1009k.post(new e.b(this.f997h, intent, this.f995f));
                if (this.f997h.f1006h.b(this.f996g)) {
                    l.a().a(f994n, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f996g}), new Throwable[0]);
                    Intent b2 = b.b(this.e, this.f996g);
                    e eVar2 = this.f997h;
                    eVar2.f1009k.post(new e.b(this.f997h, b2, this.f995f));
                } else {
                    l.a().a(f994n, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f996g}), new Throwable[0]);
                }
            } else {
                l.a().a(f994n, String.format("Already stopped work for %s", new Object[]{this.f996g}), new Throwable[0]);
            }
        }
    }

    public void b() {
        this.f1001l = k.a(this.e, String.format("%s (%s)", new Object[]{this.f996g, Integer.valueOf(this.f995f)}));
        l.a().a(f994n, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f1001l, this.f996g}), new Throwable[0]);
        this.f1001l.acquire();
        p c = ((r) this.f997h.f1007i.c.n()).c(this.f996g);
        if (c == null) {
            c();
            return;
        }
        boolean b2 = c.b();
        this.f1002m = b2;
        if (!b2) {
            l.a().a(f994n, String.format("No constraints for %s", new Object[]{this.f996g}), new Throwable[0]);
            a((List<String>) Collections.singletonList(this.f996g));
            return;
        }
        this.f998i.a((Iterable<p>) Collections.singletonList(c));
    }

    public void a(String str, boolean z) {
        l.a().a(f994n, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        a();
        if (z) {
            Intent b2 = b.b(this.e, this.f996g);
            e eVar = this.f997h;
            eVar.f1009k.post(new e.b(eVar, b2, this.f995f));
        }
        if (this.f1002m) {
            Intent a = b.a(this.e);
            e eVar2 = this.f997h;
            eVar2.f1009k.post(new e.b(eVar2, a, this.f995f));
        }
    }

    public void a(String str) {
        l.a().a(f994n, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        c();
    }

    public final void a() {
        synchronized (this.f999j) {
            this.f998i.a();
            this.f997h.f1005g.a(this.f996g);
            if (this.f1001l != null && this.f1001l.isHeld()) {
                l.a().a(f994n, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f1001l, this.f996g}), new Throwable[0]);
                this.f1001l.release();
            }
        }
    }
}
