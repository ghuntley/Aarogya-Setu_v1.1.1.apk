package f.a;

import f.a.a.c;
import f.a.a.j;
import f.a.g0;
import i.c.d.p.e;
import n.m.c.f;

/* compiled from: EventLoop.common.kt */
public abstract class f0 extends s {
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f848f;

    /* renamed from: g  reason: collision with root package name */
    public c<b0<?>> f849g;

    public final void a(b0<?> b0Var) {
        if (b0Var != null) {
            c<b0<?>> cVar = this.f849g;
            if (cVar == null) {
                cVar = new c<>();
                this.f849g = cVar;
            }
            Object[] objArr = cVar.a;
            int i2 = cVar.c;
            objArr[i2] = b0Var;
            int length = (objArr.length - 1) & (i2 + 1);
            cVar.c = length;
            int i3 = cVar.f791b;
            if (length == i3) {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[(length2 << 1)];
                e.a(objArr, objArr2, 0, i3, 0, 10);
                Object[] objArr3 = cVar.a;
                int length3 = objArr3.length;
                int i4 = cVar.f791b;
                e.a(objArr3, objArr2, length3 - i4, 0, i4, 4);
                cVar.a = objArr2;
                cVar.f791b = 0;
                cVar.c = length2;
                return;
            }
            return;
        }
        f.a("task");
        throw null;
    }

    public final long b(boolean z) {
        return z ? 4294967296L : 1;
    }

    public final void c(boolean z) {
        this.e = b(z) + this.e;
        if (!z) {
            this.f848f = true;
        }
    }

    public final boolean m() {
        return this.e >= b(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: f.a.b0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o() {
        /*
            r7 = this;
            f.a.a.c<f.a.b0<?>> r0 = r7.f849g
            r1 = 0
            if (r0 == 0) goto L_0x002f
            int r2 = r0.f791b
            int r3 = r0.c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000e
            goto L_0x001e
        L_0x000e:
            java.lang.Object[] r3 = r0.a
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f791b = r2
            if (r6 == 0) goto L_0x0027
            r4 = r6
        L_0x001e:
            f.a.b0 r4 = (f.a.b0) r4
            if (r4 == 0) goto L_0x0026
            r4.run()
            return r5
        L_0x0026:
            return r1
        L_0x0027:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type T"
            r0.<init>(r1)
            throw r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.f0.o():boolean");
    }

    public final void a(boolean z) {
        g0.a aVar;
        long b2 = this.e - b(z);
        this.e = b2;
        int i2 = (b2 > 0 ? 1 : (b2 == 0 ? 0 : -1));
        if (i2 <= 0) {
            if (x.a) {
                if (!(i2 == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f848f) {
                g0 g0Var = (g0) this;
                z0 z0Var = z0.f873b;
                z0.a.set((Object) null);
                g0Var.isCompleted = true;
                if (!x.a || g0Var.isCompleted) {
                    while (true) {
                        Object obj = g0Var._queue;
                        if (obj == null) {
                            if (g0.f850h.compareAndSet(g0Var, (Object) null, i0.f856b)) {
                                break;
                            }
                        } else if (obj instanceof j) {
                            ((j) obj).a();
                            break;
                        } else if (obj == i0.f856b) {
                            break;
                        } else {
                            j jVar = new j(8, true);
                            jVar.a((Runnable) obj);
                            if (g0.f850h.compareAndSet(g0Var, obj, jVar)) {
                                break;
                            }
                        }
                    }
                    do {
                    } while (g0Var.u() <= 0);
                    long nanoTime = System.nanoTime();
                    while (true) {
                        g0.b bVar = (g0.b) g0Var._delayed;
                        if (bVar != null && (aVar = (g0.a) bVar.c()) != null) {
                            g0Var.a(nanoTime, aVar);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new AssertionError();
                }
            }
        }
    }
}
