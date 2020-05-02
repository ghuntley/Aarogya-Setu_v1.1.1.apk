package h.o;

import h.c.a.b.b;
import h.o.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: LifecycleRegistry */
public class m extends h {
    public h.c.a.b.a<k, a> a = new h.c.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    public h.b f2058b;
    public final WeakReference<l> c;
    public int d = 0;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2059f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<h.b> f2060g = new ArrayList<>();

    /* compiled from: LifecycleRegistry */
    public static class a {
        public h.b a;

        /* renamed from: b  reason: collision with root package name */
        public j f2061b;

        public a(k kVar, h.b bVar) {
            this.f2061b = p.a((Object) kVar);
            this.a = bVar;
        }

        public void a(l lVar, h.a aVar) {
            h.b b2 = m.b(aVar);
            this.a = m.a(this.a, b2);
            this.f2061b.a(lVar, aVar);
            this.a = b2;
        }
    }

    public m(l lVar) {
        this.c = new WeakReference<>(lVar);
        this.f2058b = h.b.INITIALIZED;
    }

    public void a(h.a aVar) {
        a(b(aVar));
    }

    public final h.b b(k kVar) {
        h.c.a.b.a<k, a> aVar = this.a;
        h.b bVar = null;
        b.c<K, V> cVar = aVar.f1523i.containsKey(kVar) ? aVar.f1523i.get(kVar).f1529h : null;
        h.b bVar2 = cVar != null ? ((a) cVar.getValue()).a : null;
        if (!this.f2060g.isEmpty()) {
            ArrayList<h.b> arrayList = this.f2060g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f2058b, bVar2), bVar);
    }

    public final void a(h.b bVar) {
        if (this.f2058b != bVar) {
            this.f2058b = bVar;
            if (this.e || this.d != 0) {
                this.f2059f = true;
                return;
            }
            this.e = true;
            b();
            this.e = false;
        }
    }

    public static h.b b(h.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return h.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return h.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return h.b.STARTED;
        }
        return h.b.CREATED;
    }

    public void a(k kVar) {
        l lVar;
        h.b bVar = this.f2058b;
        h.b bVar2 = h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = h.b.INITIALIZED;
        }
        a aVar = new a(kVar, bVar2);
        if (this.a.b(kVar, aVar) == null && (lVar = (l) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            h.b b2 = b(kVar);
            this.d++;
            while (aVar.a.compareTo(b2) < 0 && this.a.f1523i.containsKey(kVar)) {
                this.f2060g.add(aVar.a);
                aVar.a(lVar, b(aVar.a));
                a();
                b2 = b(kVar);
            }
            if (!z) {
                b();
            }
            this.d--;
        }
    }

    public static h.a b(h.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return h.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return h.a.ON_START;
        }
        if (ordinal == 3) {
            return h.a.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = ((h.o.m.a) r1.e.getValue()).a;
        r2 = ((h.o.m.a) r8.a.f1524f.getValue()).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r8 = this;
            java.lang.ref.WeakReference<h.o.l> r0 = r8.c
            java.lang.Object r0 = r0.get()
            h.o.l r0 = (h.o.l) r0
            if (r0 == 0) goto L_0x0143
        L_0x000a:
            h.c.a.b.a<h.o.k, h.o.m$a> r1 = r8.a
            int r2 = r1.f1526h
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            h.c.a.b.b$c<K, V> r1 = r1.e
            java.lang.Object r1 = r1.getValue()
            h.o.m$a r1 = (h.o.m.a) r1
            h.o.h$b r1 = r1.a
            h.c.a.b.a<h.o.k, h.o.m$a> r2 = r8.a
            h.c.a.b.b$c<K, V> r2 = r2.f1524f
            java.lang.Object r2 = r2.getValue()
            h.o.m$a r2 = (h.o.m.a) r2
            h.o.h$b r2 = r2.a
            if (r1 != r2) goto L_0x0031
            h.o.h$b r1 = r8.f2058b
            if (r1 != r2) goto L_0x0031
        L_0x002f:
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 != 0) goto L_0x0140
            r8.f2059f = r3
            h.o.h$b r1 = r8.f2058b
            h.c.a.b.a<h.o.k, h.o.m$a> r2 = r8.a
            h.c.a.b.b$c<K, V> r2 = r2.e
            java.lang.Object r2 = r2.getValue()
            h.o.m$a r2 = (h.o.m.a) r2
            h.o.h$b r2 = r2.a
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L_0x00dc
            h.c.a.b.a<h.o.k, h.o.m$a> r1 = r8.a
            h.c.a.b.b$b r2 = new h.c.a.b.b$b
            h.c.a.b.b$c<K, V> r5 = r1.f1524f
            h.c.a.b.b$c<K, V> r6 = r1.e
            r2.<init>(r5, r6)
            java.util.WeakHashMap<h.c.a.b.b$f<K, V>, java.lang.Boolean> r1 = r1.f1525g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.put(r2, r3)
        L_0x005e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r8.f2059f
            if (r1 != 0) goto L_0x00dc
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            h.o.m$a r3 = (h.o.m.a) r3
        L_0x0074:
            h.o.h$b r5 = r3.a
            h.o.h$b r6 = r8.f2058b
            int r5 = r5.compareTo(r6)
            if (r5 <= 0) goto L_0x005e
            boolean r5 = r8.f2059f
            if (r5 != 0) goto L_0x005e
            h.c.a.b.a<h.o.k, h.o.m$a> r5 = r8.a
            java.lang.Object r6 = r1.getKey()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x005e
            h.o.h$b r5 = r3.a
            int r6 = r5.ordinal()
            if (r6 == 0) goto L_0x00d6
            if (r6 == r4) goto L_0x00d0
            r7 = 2
            if (r6 == r7) goto L_0x00be
            r7 = 3
            if (r6 == r7) goto L_0x00bb
            r7 = 4
            if (r6 != r7) goto L_0x00a4
            h.o.h$a r5 = h.o.h.a.ON_PAUSE
            goto L_0x00c0
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            h.o.h$a r5 = h.o.h.a.ON_STOP
            goto L_0x00c0
        L_0x00be:
            h.o.h$a r5 = h.o.h.a.ON_DESTROY
        L_0x00c0:
            h.o.h$b r6 = b((h.o.h.a) r5)
            java.util.ArrayList<h.o.h$b> r7 = r8.f2060g
            r7.add(r6)
            r3.a(r0, r5)
            r8.a()
            goto L_0x0074
        L_0x00d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00dc:
            h.c.a.b.a<h.o.k, h.o.m$a> r1 = r8.a
            h.c.a.b.b$c<K, V> r1 = r1.f1524f
            boolean r2 = r8.f2059f
            if (r2 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            h.o.h$b r2 = r8.f2058b
            java.lang.Object r1 = r1.getValue()
            h.o.m$a r1 = (h.o.m.a) r1
            h.o.h$b r1 = r1.a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            h.c.a.b.a<h.o.k, h.o.m$a> r1 = r8.a
            h.c.a.b.b$d r1 = r1.c()
        L_0x00fc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x000a
            boolean r2 = r8.f2059f
            if (r2 != 0) goto L_0x000a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            h.o.m$a r3 = (h.o.m.a) r3
        L_0x0112:
            h.o.h$b r4 = r3.a
            h.o.h$b r5 = r8.f2058b
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L_0x00fc
            boolean r4 = r8.f2059f
            if (r4 != 0) goto L_0x00fc
            h.c.a.b.a<h.o.k, h.o.m$a> r4 = r8.a
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00fc
            h.o.h$b r4 = r3.a
            java.util.ArrayList<h.o.h$b> r5 = r8.f2060g
            r5.add(r4)
            h.o.h$b r4 = r3.a
            h.o.h$a r4 = b((h.o.h.b) r4)
            r3.a(r0, r4)
            r8.a()
            goto L_0x0112
        L_0x0140:
            r8.f2059f = r3
            return
        L_0x0143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.m.b():void");
    }

    public final void a() {
        ArrayList<h.b> arrayList = this.f2060g;
        arrayList.remove(arrayList.size() - 1);
    }

    public static h.b a(h.b bVar, h.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
