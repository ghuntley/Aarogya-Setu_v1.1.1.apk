package h.a0.x.o.f;

import android.content.Context;
import h.a0.l;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f1028f = l.a("ConstraintTracker");
    public final h.a0.x.r.p.a a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1029b;
    public final Object c = new Object();
    public final Set<h.a0.x.o.a<T>> d = new LinkedHashSet();
    public T e;

    /* compiled from: ConstraintTracker */
    public class a implements Runnable {
        public final /* synthetic */ List e;

        public a(List list) {
            this.e = list;
        }

        public void run() {
            for (h.a0.x.o.a a : this.e) {
                a.a(d.this.e);
            }
        }
    }

    public d(Context context, h.a0.x.r.p.a aVar) {
        this.f1029b = context.getApplicationContext();
        this.a = aVar;
    }

    public abstract T a();

    public void a(h.a0.x.o.a<T> aVar) {
        synchronized (this.c) {
            if (this.d.add(aVar)) {
                if (this.d.size() == 1) {
                    this.e = a();
                    l.a().a(f1028f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.e}), new Throwable[0]);
                    b();
                }
                aVar.a(this.e);
            }
        }
    }

    public abstract void b();

    public void b(h.a0.x.o.a<T> aVar) {
        synchronized (this.c) {
            if (this.d.remove(aVar) && this.d.isEmpty()) {
                c();
            }
        }
    }

    public abstract void c();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            T r1 = r3.e     // Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x002d
            T r1 = r3.e     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.e     // Catch:{ all -> 0x002f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            r3.e = r4     // Catch:{ all -> 0x002f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.Set<h.a0.x.o.a<T>> r1 = r3.d     // Catch:{ all -> 0x002f }
            r4.<init>(r1)     // Catch:{ all -> 0x002f }
            h.a0.x.r.p.a r1 = r3.a     // Catch:{ all -> 0x002f }
            h.a0.x.r.p.b r1 = (h.a0.x.r.p.b) r1     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = r1.c     // Catch:{ all -> 0x002f }
            h.a0.x.o.f.d$a r2 = new h.a0.x.o.f.d$a     // Catch:{ all -> 0x002f }
            r2.<init>(r4)     // Catch:{ all -> 0x002f }
            r1.execute(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.x.o.f.d.a(java.lang.Object):void");
    }
}
