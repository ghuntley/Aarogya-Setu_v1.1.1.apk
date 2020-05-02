package i.c.d.f;

import i.c.d.i.a;
import i.c.d.i.b;
import i.c.d.i.c;
import i.c.d.i.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class s implements d, c {
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Queue<a<?>> f4668b = new ArrayDeque();
    public final Executor c;

    public s(Executor executor) {
        this.c = executor;
    }

    public final synchronized Set<Map.Entry<b<Object>, Executor>> a(a<?> aVar) {
        Map map;
        Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> map2 = this.a;
        if (aVar != null) {
            map = map2.get((Object) null);
        } else {
            throw null;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new i.c.d.f.r(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r0 = a(r5).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(i.c.d.i.a<?> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0036
            monitor-enter(r4)
            java.util.Queue<i.c.d.i.a<?>> r0 = r4.f4668b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000e
            java.util.Queue<i.c.d.i.a<?>> r0 = r4.f4668b     // Catch:{ all -> 0x0033 }
            r0.add(r5)     // Catch:{ all -> 0x0033 }
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            return
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r4.a(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            i.c.d.f.r r3 = new i.c.d.f.r
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0017
        L_0x0032:
            return
        L_0x0033:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            throw r5
        L_0x0036:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.f.s.b(i.c.d.i.a):void");
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, b<? super T> bVar) {
        if (cls == null) {
            throw null;
        } else if (bVar == null) {
            throw null;
        } else if (executor != null) {
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            this.a.get(cls).put(bVar, executor);
        } else {
            throw null;
        }
    }

    public <T> void a(Class<T> cls, b<? super T> bVar) {
        a(cls, this.c, bVar);
    }

    public void a() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f4668b != null) {
                Queue<a<?>> queue2 = this.f4668b;
                this.f4668b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (a b2 : queue) {
                b(b2);
            }
        }
    }
}
