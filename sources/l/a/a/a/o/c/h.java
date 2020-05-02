package l.a.a.a.o.c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: PriorityFutureTask */
public class h<V> extends FutureTask<V> implements b<l>, i, l {
    public final Object e;

    public h(Callable<V> callable) {
        super(callable);
        Object obj;
        if (j.isProperDelegate(callable)) {
            obj = (b) callable;
        } else {
            obj = new j();
        }
        this.e = obj;
    }

    public void addDependency(Object obj) {
        ((b) ((i) f())).addDependency((l) obj);
    }

    public boolean areDependenciesMet() {
        return ((b) ((i) f())).areDependenciesMet();
    }

    public int compareTo(Object obj) {
        return ((i) f()).compareTo(obj);
    }

    public <T extends b<l> & i & l> T f() {
        return (b) this.e;
    }

    public Collection<l> getDependencies() {
        return ((b) ((i) f())).getDependencies();
    }

    public e getPriority() {
        return ((i) f()).getPriority();
    }

    public boolean isFinished() {
        return ((l) ((i) f())).isFinished();
    }

    public void setError(Throwable th) {
        ((l) ((i) f())).setError(th);
    }

    public void setFinished(boolean z) {
        ((l) ((i) f())).setFinished(z);
    }

    public h(Runnable runnable, V v) {
        super(runnable, v);
        Object obj;
        if (j.isProperDelegate(runnable)) {
            obj = (b) runnable;
        } else {
            obj = new j();
        }
        this.e = obj;
    }
}
