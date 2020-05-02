package h.a0.x.r;

import androidx.work.impl.WorkDatabase;
import h.a0.l;
import h.a0.t;
import h.a0.x.c;
import h.a0.x.q.q;
import h.a0.x.q.r;

/* compiled from: StopWorkRunnable */
public class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1094h = l.a("StopWorkRunnable");
    public final h.a0.x.j e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1095f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1096g;

    public j(h.a0.x.j jVar, String str, boolean z) {
        this.e = jVar;
        this.f1095f = str;
        this.f1096g = z;
    }

    public void run() {
        boolean z;
        h.a0.x.j jVar = this.e;
        WorkDatabase workDatabase = jVar.c;
        c cVar = jVar.f959f;
        q n2 = workDatabase.n();
        workDatabase.c();
        try {
            boolean c = cVar.c(this.f1095f);
            if (this.f1096g) {
                z = this.e.f959f.e(this.f1095f);
            } else {
                if (!c) {
                    r rVar = (r) n2;
                    if (rVar.a(this.f1095f) == t.RUNNING) {
                        rVar.a(t.ENQUEUED, this.f1095f);
                    }
                }
                z = this.e.f959f.f(this.f1095f);
            }
            l.a().a(f1094h, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f1095f, Boolean.valueOf(z)}), new Throwable[0]);
            workDatabase.h();
        } finally {
            workDatabase.e();
        }
    }
}
