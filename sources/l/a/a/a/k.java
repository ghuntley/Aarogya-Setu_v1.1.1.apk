package l.a.a.a;

import android.content.Context;
import i.a.a.a.a;
import java.io.File;
import java.util.Collection;
import l.a.a.a.o.b.s;
import l.a.a.a.o.c.d;
import l.a.a.a.o.c.l;

/* compiled from: Kit */
public abstract class k<Result> implements Comparable<k> {
    public Context context;
    public final d dependsOnAnnotation = ((d) getClass().getAnnotation(d.class));
    public f fabric;
    public s idManager;
    public i<Result> initializationCallback;
    public j<Result> initializationTask = new j<>(this);

    public boolean containsAnnotatedDependency(k kVar) {
        if (hasAnnotatedDependency()) {
            for (Class isAssignableFrom : this.dependsOnAnnotation.value()) {
                if (isAssignableFrom.isAssignableFrom(kVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract Result doInBackground();

    public Context getContext() {
        return this.context;
    }

    public Collection<l> getDependencies() {
        return this.initializationTask.getDependencies();
    }

    public f getFabric() {
        return this.fabric;
    }

    public s getIdManager() {
        return this.idManager;
    }

    public abstract String getIdentifier();

    public String getPath() {
        StringBuilder a = a.a(".Fabric");
        a.append(File.separator);
        a.append(getIdentifier());
        return a.toString();
    }

    public abstract String getVersion();

    public boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r5 == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initialize() {
        /*
            r10 = this;
            l.a.a.a.j<Result> r0 = r10.initializationTask
            l.a.a.a.f r1 = r10.fabric
            java.util.concurrent.ExecutorService r1 = r1.c
            r2 = 1
            java.lang.Void[] r3 = new java.lang.Void[r2]
            r4 = 0
            r5 = 0
            r3[r4] = r5
            if (r0 == 0) goto L_0x007a
            l.a.a.a.o.c.f$a r4 = new l.a.a.a.o.c.f$a
            r4.<init>(r1, r0)
            l.a.a.a.o.c.a$g r1 = r0.f5127g
            l.a.a.a.o.c.a$g r5 = l.a.a.a.o.c.a.g.PENDING
            if (r1 == r5) goto L_0x0036
            l.a.a.a.o.c.a$g r1 = r0.f5127g
            int r1 = r1.ordinal()
            if (r1 == r2) goto L_0x002e
            r5 = 2
            if (r1 == r5) goto L_0x0026
            goto L_0x0036
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot execute task: the task has already been executed (a task can be executed only once)"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot execute task: the task is already running."
            r0.<init>(r1)
            throw r0
        L_0x0036:
            l.a.a.a.o.c.a$g r1 = l.a.a.a.o.c.a.g.RUNNING
            r0.f5127g = r1
            java.lang.String r1 = "onPreExecute"
            l.a.a.a.o.b.w r1 = r0.a(r1)
            l.a.a.a.k<Result> r5 = r0.s     // Catch:{ UnmetDependencyException -> 0x0071, Exception -> 0x004e }
            boolean r5 = r5.onPreExecute()     // Catch:{ UnmetDependencyException -> 0x0071, Exception -> 0x004e }
            r1.b()
            if (r5 != 0) goto L_0x0067
            goto L_0x0064
        L_0x004c:
            r3 = move-exception
            goto L_0x0073
        L_0x004e:
            r5 = move-exception
            l.a.a.a.c r6 = l.a.a.a.f.a()     // Catch:{ all -> 0x004c }
            java.lang.String r7 = "Fabric"
            java.lang.String r8 = "Failure onPreExecute()"
            r9 = 6
            boolean r6 = r6.a(r7, r9)     // Catch:{ all -> 0x004c }
            if (r6 == 0) goto L_0x0061
            android.util.Log.e(r7, r8, r5)     // Catch:{ all -> 0x004c }
        L_0x0061:
            r1.b()
        L_0x0064:
            r0.a((boolean) r2)
        L_0x0067:
            l.a.a.a.o.c.a$h<Params, Result> r1 = r0.e
            r1.e = r3
            java.util.concurrent.FutureTask<Result> r0 = r0.f5126f
            r4.execute(r0)
            return
        L_0x0071:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0073:
            r1.b()
            r0.a((boolean) r2)
            throw r3
        L_0x007a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.k.initialize():void");
    }

    public void injectParameters(Context context2, f fVar, i<Result> iVar, s sVar) {
        this.fabric = fVar;
        this.context = new g(context2, getIdentifier(), getPath());
        this.initializationCallback = iVar;
        this.idManager = sVar;
    }

    public void onCancelled(Result result) {
    }

    public void onPostExecute(Result result) {
    }

    public boolean onPreExecute() {
        return true;
    }

    public int compareTo(k kVar) {
        if (containsAnnotatedDependency(kVar)) {
            return 1;
        }
        if (kVar.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !kVar.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || !kVar.hasAnnotatedDependency()) {
            return 0;
        }
        return -1;
    }
}
