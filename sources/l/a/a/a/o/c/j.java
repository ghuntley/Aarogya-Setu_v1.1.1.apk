package l.a.a.a.o.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PriorityTask */
public class j implements b<l>, i, l {
    public final List<l> dependencies = new ArrayList();
    public final AtomicBoolean hasRun = new AtomicBoolean(false);
    public final AtomicReference<Throwable> throwable = new AtomicReference<>((Object) null);

    public static boolean isProperDelegate(Object obj) {
        try {
            b bVar = (b) obj;
            l lVar = (l) obj;
            i iVar = (i) obj;
            if (bVar == null || lVar == null || iVar == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean areDependenciesMet() {
        for (l isFinished : getDependencies()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public int compareTo(Object obj) {
        return e.a(this, obj);
    }

    public synchronized Collection<l> getDependencies() {
        return Collections.unmodifiableCollection(this.dependencies);
    }

    public Throwable getError() {
        return this.throwable.get();
    }

    public e getPriority() {
        return e.NORMAL;
    }

    public boolean isFinished() {
        return this.hasRun.get();
    }

    public void setError(Throwable th) {
        this.throwable.set(th);
    }

    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    public synchronized void addDependency(l lVar) {
        this.dependencies.add(lVar);
    }
}
