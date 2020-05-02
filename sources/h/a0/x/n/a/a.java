package h.a0.x.n.a;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.crashlytics.android.answers.SessionEvent;
import h.a0.l;
import h.a0.t;
import h.a0.x.d;
import h.a0.x.j;
import h.a0.x.o.c;
import h.a0.x.q.p;
import h.a0.x.r.i;
import h.a0.x.r.p.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GreedyScheduler */
public class a implements d, c, h.a0.x.a {

    /* renamed from: l  reason: collision with root package name */
    public static final String f983l = l.a("GreedyScheduler");
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final j f984f;

    /* renamed from: g  reason: collision with root package name */
    public final h.a0.x.o.d f985g;

    /* renamed from: h  reason: collision with root package name */
    public List<p> f986h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f987i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f988j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f989k;

    public a(Context context, h.a0.x.r.p.a aVar, j jVar) {
        this.e = context;
        this.f984f = jVar;
        this.f985g = new h.a0.x.o.d(context, aVar, this);
        this.f988j = new Object();
    }

    public void a(p... pVarArr) {
        if (this.f989k == null) {
            this.f989k = Boolean.valueOf(TextUtils.equals(this.e.getPackageName(), a()));
        }
        if (!this.f989k.booleanValue()) {
            l.a().c(f983l, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f987i) {
            this.f984f.f959f.a((h.a0.x.a) this);
            this.f987i = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (p pVar : pVarArr) {
            if (pVar.f1060b == t.ENQUEUED && !pVar.d() && pVar.f1062g == 0 && !pVar.c()) {
                if (!pVar.b()) {
                    l.a().a(f983l, String.format("Starting work for %s", new Object[]{pVar.a}), new Throwable[0]);
                    j jVar = this.f984f;
                    ((b) jVar.d).a.execute(new i(jVar, pVar.a, (WorkerParameters.a) null));
                } else if (Build.VERSION.SDK_INT < 23 || !pVar.f1065j.c) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (pVar.f1065j.f905h.a() > 0) {
                            l.a().a(f983l, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                        }
                    }
                    arrayList.add(pVar);
                    arrayList2.add(pVar.a);
                } else {
                    l.a().a(f983l, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                }
            }
        }
        synchronized (this.f988j) {
            if (!arrayList.isEmpty()) {
                l.a().a(f983l, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.f986h.addAll(arrayList);
                this.f985g.a((Iterable<p>) this.f986h);
            }
        }
    }

    public void b(List<String> list) {
        for (String next : list) {
            l.a().a(f983l, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f984f.a(next);
        }
    }

    public final void b(String str) {
        synchronized (this.f988j) {
            int size = this.f986h.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.f986h.get(i2).a.equals(str)) {
                    l.a().a(f983l, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f986h.remove(i2);
                    this.f985g.a((Iterable<p>) this.f986h);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    public void a(String str) {
        if (this.f989k == null) {
            this.f989k = Boolean.valueOf(TextUtils.equals(this.e.getPackageName(), a()));
        }
        if (!this.f989k.booleanValue()) {
            l.a().c(f983l, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f987i) {
            this.f984f.f959f.a((h.a0.x.a) this);
            this.f987i = true;
        }
        l.a().a(f983l, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.f984f.a(str);
    }

    public void a(List<String> list) {
        for (String next : list) {
            l.a().a(f983l, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            j jVar = this.f984f;
            h.a0.x.r.p.a aVar = jVar.d;
            ((b) aVar).a.execute(new i(jVar, next, (WorkerParameters.a) null));
        }
    }

    public void a(String str, boolean z) {
        b(str);
    }

    public final String a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) this.e.getSystemService(SessionEvent.ACTIVITY_KEY);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty()) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.processName;
            }
        }
        return null;
    }
}
