package i.c.a.b.i.a;

import androidx.recyclerview.widget.RecyclerView;
import i.c.a.b.d.l.q;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class q5<V> extends FutureTask<V> implements Comparable<q5<V>> {
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3843f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3844g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m5 f3845h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q5(m5 m5Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f3845h = m5Var;
        q.a(str);
        long andIncrement = m5.f3767l.getAndIncrement();
        this.e = andIncrement;
        this.f3844g = str;
        this.f3843f = z;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            m5Var.n().f3758f.a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        q5 q5Var = (q5) obj;
        boolean z = this.f3843f;
        if (z != q5Var.f3843f) {
            return z ? -1 : 1;
        }
        long j2 = this.e;
        long j3 = q5Var.e;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f3845h.n().f3759g.a("Two tasks share the same index. index", Long.valueOf(this.e));
        return 0;
    }

    public final void setException(Throwable th) {
        this.f3845h.n().f3758f.a(this.f3844g, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q5(m5 m5Var, Runnable runnable, String str) {
        super(runnable, (Object) null);
        this.f3845h = m5Var;
        q.a(str);
        long andIncrement = m5.f3767l.getAndIncrement();
        this.e = andIncrement;
        this.f3844g = str;
        this.f3843f = false;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            m5Var.n().f3758f.a("Tasks index overflow");
        }
    }
}
