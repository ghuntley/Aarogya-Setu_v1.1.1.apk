package l.a.a.a.o.c;

import java.util.Collection;
import java.util.concurrent.Executor;
import l.a.a.a.o.c.a;

/* compiled from: PriorityAsyncTask */
public abstract class f<Params, Progress, Result> extends a<Params, Progress, Result> implements b<l>, i, l {
    public final j r = new j();

    /* compiled from: PriorityAsyncTask */
    public static class a<Result> implements Executor {
        public final Executor e;

        /* renamed from: f  reason: collision with root package name */
        public final f f5142f;

        /* renamed from: l.a.a.a.o.c.f$a$a  reason: collision with other inner class name */
        /* compiled from: PriorityAsyncTask */
        public class C0147a extends h<Result> {
            public C0147a(Runnable runnable, Object obj) {
                super(runnable, obj);
            }

            public <T extends b<l> & i & l> T f() {
                return a.this.f5142f;
            }
        }

        public a(Executor executor, f fVar) {
            this.e = executor;
            this.f5142f = fVar;
        }

        public void execute(Runnable runnable) {
            this.e.execute(new C0147a(runnable, (Object) null));
        }
    }

    /* renamed from: a */
    public void addDependency(l lVar) {
        if (this.f5127g == a.g.PENDING) {
            this.r.addDependency(lVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public boolean areDependenciesMet() {
        return this.r.areDependenciesMet();
    }

    public int compareTo(Object obj) {
        return e.a(this, obj);
    }

    public Collection<l> getDependencies() {
        return this.r.getDependencies();
    }

    public boolean isFinished() {
        return this.r.isFinished();
    }

    public void setError(Throwable th) {
        this.r.setError(th);
    }

    public void setFinished(boolean z) {
        this.r.setFinished(z);
    }
}
