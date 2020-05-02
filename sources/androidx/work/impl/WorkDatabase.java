package androidx.work.impl;

import android.content.Context;
import android.text.TextUtils;
import h.a0.x.g;
import h.a0.x.h;
import h.a0.x.i;
import h.a0.x.q.b;
import h.a0.x.q.e;
import h.a0.x.q.k;
import h.a0.x.q.n;
import h.a0.x.q.q;
import h.a0.x.q.t;
import h.s.h;
import h.v.a.c;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final long f370j = TimeUnit.DAYS.toMillis(7);

    public static class a implements c.C0069c {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        public c a(c.b bVar) {
            Context context = this.a;
            String str = bVar.f2243b;
            c.a aVar = bVar.c;
            if (aVar == null) {
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            } else if (context == null) {
                throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
            } else if (!TextUtils.isEmpty(str)) {
                return new h.v.a.f.c(context, str, aVar, true);
            } else {
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
        }
    }

    public static WorkDatabase a(Context context, Executor executor, boolean z) {
        h.a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = new h.a<>(context, cls, (String) null);
            aVar.f2190h = true;
        } else {
            i.a();
            aVar = g.a.a.b.a.a(context, cls, "androidx.work.workdb");
            aVar.f2189g = new a(context);
        }
        aVar.e = executor;
        g gVar = new g();
        if (aVar.d == null) {
            aVar.d = new ArrayList<>();
        }
        aVar.d.add(gVar);
        aVar.a(h.a0.x.h.a);
        aVar.a(new h.g(context, 2, 3));
        aVar.a(h.a0.x.h.f952b);
        aVar.a(h.a0.x.h.c);
        aVar.a(new h.g(context, 5, 6));
        aVar.a(h.a0.x.h.d);
        aVar.a(h.a0.x.h.e);
        aVar.a(h.a0.x.h.f953f);
        aVar.a(new h.C0027h(context));
        aVar.a(new h.g(context, 10, 11));
        aVar.f2192j = false;
        aVar.f2193k = true;
        return aVar.a();
    }

    public static String p() {
        StringBuilder a2 = i.a.a.a.a.a("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        a2.append(System.currentTimeMillis() - f370j);
        a2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return a2.toString();
    }

    public abstract b i();

    public abstract e j();

    public abstract h.a0.x.q.h k();

    public abstract k l();

    public abstract n m();

    public abstract q n();

    public abstract t o();
}
