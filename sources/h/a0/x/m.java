package h.a0.x;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import h.a0.b;
import h.a0.e;
import h.a0.i;
import h.a0.k;
import h.a0.l;
import h.a0.x.q.o;
import h.a0.x.q.p;
import h.a0.x.q.q;
import h.a0.x.q.r;
import h.a0.x.q.t;
import h.a0.x.q.u;
import h.a0.x.r.f;
import h.a0.x.r.o.c;
import h.s.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkerWrapper */
public class m implements Runnable {
    public static final String x = l.a("WorkerWrapper");
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public String f966f;

    /* renamed from: g  reason: collision with root package name */
    public List<d> f967g;

    /* renamed from: h  reason: collision with root package name */
    public WorkerParameters.a f968h;

    /* renamed from: i  reason: collision with root package name */
    public p f969i;

    /* renamed from: j  reason: collision with root package name */
    public ListenableWorker f970j;

    /* renamed from: k  reason: collision with root package name */
    public ListenableWorker.a f971k = new ListenableWorker.a.C0002a();

    /* renamed from: l  reason: collision with root package name */
    public b f972l;

    /* renamed from: m  reason: collision with root package name */
    public h.a0.x.r.p.a f973m;

    /* renamed from: n  reason: collision with root package name */
    public h.a0.x.p.a f974n;

    /* renamed from: o  reason: collision with root package name */
    public WorkDatabase f975o;

    /* renamed from: p  reason: collision with root package name */
    public q f976p;

    /* renamed from: q  reason: collision with root package name */
    public h.a0.x.q.b f977q;
    public t r;
    public List<String> s;
    public String t;
    public c<Boolean> u = new c<>();
    public i.c.b.a.a.a<ListenableWorker.a> v = null;
    public volatile boolean w;

    /* compiled from: WorkerWrapper */
    public static class a {
        public Context a;

        /* renamed from: b  reason: collision with root package name */
        public ListenableWorker f978b;
        public h.a0.x.p.a c;
        public h.a0.x.r.p.a d;
        public b e;

        /* renamed from: f  reason: collision with root package name */
        public WorkDatabase f979f;

        /* renamed from: g  reason: collision with root package name */
        public String f980g;

        /* renamed from: h  reason: collision with root package name */
        public List<d> f981h;

        /* renamed from: i  reason: collision with root package name */
        public WorkerParameters.a f982i = new WorkerParameters.a();

        public a(Context context, b bVar, h.a0.x.r.p.a aVar, h.a0.x.p.a aVar2, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.d = aVar;
            this.c = aVar2;
            this.e = bVar;
            this.f979f = workDatabase;
            this.f980g = str;
        }
    }

    public m(a aVar) {
        this.e = aVar.a;
        this.f973m = aVar.d;
        this.f974n = aVar.c;
        this.f966f = aVar.f980g;
        this.f967g = aVar.f981h;
        this.f968h = aVar.f982i;
        this.f970j = aVar.f978b;
        this.f972l = aVar.e;
        WorkDatabase workDatabase = aVar.f979f;
        this.f975o = workDatabase;
        this.f976p = workDatabase.n();
        this.f977q = this.f975o.i();
        this.r = this.f975o.o();
    }

    public void a() {
        if (!f()) {
            this.f975o.c();
            try {
                h.a0.t a2 = ((r) this.f976p).a(this.f966f);
                ((o) this.f975o.m()).a(this.f966f);
                if (a2 == null) {
                    a(false);
                } else if (a2 == h.a0.t.RUNNING) {
                    a(this.f971k);
                } else if (!a2.f()) {
                    b();
                }
                this.f975o.h();
            } finally {
                this.f975o.e();
            }
        }
        List<d> list = this.f967g;
        if (list != null) {
            for (d a3 : list) {
                a3.a(this.f966f);
            }
            e.a(this.f972l, this.f975o, this.f967g);
        }
    }

    public final void b() {
        this.f975o.c();
        try {
            q qVar = this.f976p;
            ((r) qVar).a(h.a0.t.ENQUEUED, this.f966f);
            ((r) this.f976p).b(this.f966f, System.currentTimeMillis());
            ((r) this.f976p).a(this.f966f, -1);
            this.f975o.h();
        } finally {
            this.f975o.e();
            a(true);
        }
    }

    public final void c() {
        this.f975o.c();
        try {
            ((r) this.f976p).b(this.f966f, System.currentTimeMillis());
            q qVar = this.f976p;
            ((r) qVar).a(h.a0.t.ENQUEUED, this.f966f);
            ((r) this.f976p).e(this.f966f);
            ((r) this.f976p).a(this.f966f, -1);
            this.f975o.h();
        } finally {
            this.f975o.e();
            a(false);
        }
    }

    public final void d() {
        h.a0.t a2 = ((r) this.f976p).a(this.f966f);
        if (a2 == h.a0.t.RUNNING) {
            l.a().a(x, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f966f}), new Throwable[0]);
            a(true);
            return;
        }
        l.a().a(x, String.format("Status for %s is %s; not doing any work", new Object[]{this.f966f, a2}), new Throwable[0]);
        a(false);
    }

    public void e() {
        this.f975o.c();
        try {
            a(this.f966f);
            ((r) this.f976p).a(this.f966f, ((ListenableWorker.a.C0002a) this.f971k).a);
            this.f975o.h();
        } finally {
            this.f975o.e();
            a(false);
        }
    }

    public final boolean f() {
        if (!this.w) {
            return false;
        }
        l.a().a(x, String.format("Work interrupted for %s", new Object[]{this.t}), new Throwable[0]);
        h.a0.t a2 = ((r) this.f976p).a(this.f966f);
        if (a2 == null) {
            a(false);
        } else {
            a(!a2.f());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        e a2;
        t tVar = this.r;
        String str = this.f966f;
        u uVar = (u) tVar;
        if (uVar != null) {
            boolean z = true;
            j a3 = j.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
            if (str == null) {
                a3.bindNull(1);
            } else {
                a3.bindString(1, str);
            }
            uVar.a.b();
            Cursor a4 = h.s.n.b.a(uVar.a, a3, false, (CancellationSignal) null);
            try {
                ArrayList<String> arrayList = new ArrayList<>(a4.getCount());
                while (a4.moveToNext()) {
                    arrayList.add(a4.getString(0));
                }
                a4.close();
                a3.f();
                this.s = arrayList;
                StringBuilder sb = new StringBuilder("Work [ id=");
                sb.append(this.f966f);
                sb.append(", tags={ ");
                boolean z2 = true;
                for (String str2 : arrayList) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(str2);
                }
                sb.append(" } ]");
                this.t = sb.toString();
                if (!f()) {
                    this.f975o.c();
                    try {
                        p c = ((r) this.f976p).c(this.f966f);
                        this.f969i = c;
                        if (c == null) {
                            l.a().b(x, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f966f}), new Throwable[0]);
                            a(false);
                        } else if (c.f1060b != h.a0.t.ENQUEUED) {
                            d();
                            this.f975o.h();
                            l.a().a(x, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f969i.c}), new Throwable[0]);
                        } else {
                            if (c.d() || this.f969i.c()) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (!(this.f969i.f1069n == 0) && currentTimeMillis < this.f969i.a()) {
                                    l.a().a(x, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f969i.c}), new Throwable[0]);
                                    a(true);
                                }
                            }
                            this.f975o.h();
                            this.f975o.e();
                            if (this.f969i.d()) {
                                a2 = this.f969i.e;
                            } else {
                                k kVar = this.f972l.d;
                                String str3 = this.f969i.d;
                                if (kVar != null) {
                                    i a5 = i.a(str3);
                                    if (a5 == null) {
                                        l.a().b(x, String.format("Could not create Input Merger %s", new Object[]{this.f969i.d}), new Throwable[0]);
                                        e();
                                        return;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(this.f969i.e);
                                    q qVar = this.f976p;
                                    String str4 = this.f966f;
                                    r rVar = (r) qVar;
                                    if (rVar != null) {
                                        j a6 = j.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                        if (str4 == null) {
                                            a6.bindNull(1);
                                        } else {
                                            a6.bindString(1, str4);
                                        }
                                        rVar.a.b();
                                        Cursor a7 = h.s.n.b.a(rVar.a, a6, false, (CancellationSignal) null);
                                        try {
                                            ArrayList arrayList3 = new ArrayList(a7.getCount());
                                            while (a7.moveToNext()) {
                                                arrayList3.add(e.b(a7.getBlob(0)));
                                            }
                                            a7.close();
                                            a6.f();
                                            arrayList2.addAll(arrayList3);
                                            a2 = a5.a((List<e>) arrayList2);
                                        } catch (Throwable th) {
                                            a7.close();
                                            a6.f();
                                            throw th;
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            e eVar = a2;
                            UUID fromString = UUID.fromString(this.f966f);
                            List<String> list = this.s;
                            WorkerParameters.a aVar = this.f968h;
                            int i2 = this.f969i.f1066k;
                            b bVar = this.f972l;
                            WorkerParameters workerParameters = new WorkerParameters(fromString, eVar, list, aVar, i2, bVar.a, this.f973m, bVar.c, new h.a0.x.r.m(this.f975o, this.f973m), new h.a0.x.r.l(this.f974n, this.f973m));
                            if (this.f970j == null) {
                                this.f970j = this.f972l.c.a(this.e, this.f969i.c, workerParameters);
                            }
                            ListenableWorker listenableWorker = this.f970j;
                            if (listenableWorker == null) {
                                l.a().b(x, String.format("Could not create Worker %s", new Object[]{this.f969i.c}), new Throwable[0]);
                                e();
                            } else if (listenableWorker.f367g) {
                                l.a().b(x, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f969i.c}), new Throwable[0]);
                                e();
                            } else {
                                listenableWorker.f367g = true;
                                this.f975o.c();
                                try {
                                    if (((r) this.f976p).a(this.f966f) == h.a0.t.ENQUEUED) {
                                        ((r) this.f976p).a(h.a0.t.RUNNING, this.f966f);
                                        ((r) this.f976p).d(this.f966f);
                                    } else {
                                        z = false;
                                    }
                                    this.f975o.h();
                                    if (!z) {
                                        d();
                                    } else if (!f()) {
                                        c cVar = new c();
                                        ((h.a0.x.r.p.b) this.f973m).c.execute(new k(this, cVar));
                                        cVar.a(new l(this, cVar, this.t), ((h.a0.x.r.p.b) this.f973m).a);
                                    }
                                } finally {
                                    this.f975o.e();
                                }
                            }
                        }
                    } finally {
                        this.f975o.e();
                    }
                }
            } catch (Throwable th2) {
                a4.close();
                a3.f();
                throw th2;
            }
        } else {
            throw null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(boolean z) {
        this.f975o.c();
        try {
            if (((ArrayList) ((r) this.f975o.n()).a()).isEmpty()) {
                f.a(this.e, RescheduleReceiver.class, false);
            }
            if (z) {
                ((r) this.f976p).a(this.f966f, -1);
            }
            if (!(this.f969i == null || this.f970j == null)) {
                if (this.f970j == null) {
                    throw null;
                }
            }
            this.f975o.h();
            this.f975o.e();
            this.u.c(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f975o.e();
            throw th;
        }
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            l.a().c(x, String.format("Worker result SUCCESS for %s", new Object[]{this.t}), new Throwable[0]);
            if (this.f969i.d()) {
                c();
                return;
            }
            this.f975o.c();
            try {
                q qVar = this.f976p;
                ((r) qVar).a(h.a0.t.SUCCEEDED, this.f966f);
                ((r) this.f976p).a(this.f966f, ((ListenableWorker.a.c) this.f971k).a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((h.a0.x.q.c) this.f977q).a(this.f966f)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((r) this.f976p).a(str) == h.a0.t.BLOCKED) {
                        if (((h.a0.x.q.c) this.f977q).b(str)) {
                            l.a().c(x, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                            q qVar2 = this.f976p;
                            ((r) qVar2).a(h.a0.t.ENQUEUED, str);
                            ((r) this.f976p).b(str, currentTimeMillis);
                        }
                    }
                }
                this.f975o.h();
            } finally {
                this.f975o.e();
                a(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            l.a().c(x, String.format("Worker result RETRY for %s", new Object[]{this.t}), new Throwable[0]);
            b();
        } else {
            l.a().c(x, String.format("Worker result FAILURE for %s", new Object[]{this.t}), new Throwable[0]);
            if (this.f969i.d()) {
                c();
            } else {
                e();
            }
        }
    }

    public final void a(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((r) this.f976p).a(str2) != h.a0.t.CANCELLED) {
                q qVar = this.f976p;
                ((r) qVar).a(h.a0.t.FAILED, str2);
            }
            linkedList.addAll(((h.a0.x.q.c) this.f977q).a(str2));
        }
    }
}
