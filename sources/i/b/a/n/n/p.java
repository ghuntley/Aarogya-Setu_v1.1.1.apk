package i.b.a.n.n;

import h.h.l.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry */
public class p {
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2693b = new a();

    /* compiled from: ModelLoaderRegistry */
    public static class a {
        public final Map<Class<?>, C0091a<?>> a = new HashMap();

        /* renamed from: i.b.a.n.n.p$a$a  reason: collision with other inner class name */
        /* compiled from: ModelLoaderRegistry */
        public static class C0091a<Model> {
            public final List<n<Model, ?>> a;

            public C0091a(List<n<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public p(c<List<Throwable>> cVar) {
        r rVar = new r(cVar);
        this.a = rVar;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.a.a(cls, cls2, oVar);
        this.f2693b.a.clear();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<A>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <A> java.util.List<i.b.a.n.n.n<A, ?>> b(java.lang.Class<A> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            i.b.a.n.n.p$a r0 = r3.f2693b     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.Class<?>, i.b.a.n.n.p$a$a<?>> r0 = r0.a     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0048 }
            i.b.a.n.n.p$a$a r0 = (i.b.a.n.n.p.a.C0091a) r0     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0011
        L_0x000f:
            java.util.List<i.b.a.n.n.n<Model, ?>> r0 = r0.a     // Catch:{ all -> 0x0048 }
        L_0x0011:
            if (r0 != 0) goto L_0x0046
            i.b.a.n.n.r r0 = r3.a     // Catch:{ all -> 0x0048 }
            java.util.List r0 = r0.a(r4)     // Catch:{ all -> 0x0048 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0048 }
            i.b.a.n.n.p$a r1 = r3.f2693b     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.Class<?>, i.b.a.n.n.p$a$a<?>> r1 = r1.a     // Catch:{ all -> 0x0048 }
            i.b.a.n.n.p$a$a r2 = new i.b.a.n.n.p$a$a     // Catch:{ all -> 0x0048 }
            r2.<init>(r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r1.put(r4, r2)     // Catch:{ all -> 0x0048 }
            i.b.a.n.n.p$a$a r1 = (i.b.a.n.n.p.a.C0091a) r1     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "Already cached loaders for model: "
            r1.append(r2)     // Catch:{ all -> 0x0048 }
            r1.append(r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0048 }
            r0.<init>(r4)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r3)
            return r0
        L_0x0048:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.n.p.b(java.lang.Class):java.util.List");
    }

    public synchronized List<Class<?>> a(Class<?> cls) {
        return this.a.b(cls);
    }
}
