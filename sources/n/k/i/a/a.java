package n.k.i.a;

import androidx.recyclerview.widget.RecyclerView;
import i.c.d.p.e;
import java.io.Serializable;
import n.k.c;
import n.k.d;
import n.k.e;
import n.m.c.f;
import q.u;

/* compiled from: ContinuationImpl.kt */
public abstract class a implements c<Object>, d, Serializable {
    public final c<Object> e;

    public a(c<Object> cVar) {
        this.e = cVar;
    }

    public final void a(Object obj) {
        a aVar = this;
        while (true) {
            c cVar = aVar.e;
            if (cVar != null) {
                try {
                    u uVar = (u) aVar;
                    uVar.f5728h = obj;
                    uVar.f5729i |= RecyclerView.UNDEFINED_DURATION;
                    obj = e.a((Exception) null, (c<?>) uVar);
                    if (obj != n.k.h.a.COROUTINE_SUSPENDED) {
                        n.e.a(obj);
                        c cVar2 = (c) aVar;
                        c<Object> cVar3 = cVar2.f5210f;
                        if (!(cVar3 == null || cVar3 == cVar2)) {
                            e.a aVar2 = cVar2.c().get(d.f5208b);
                            if (aVar2 != null) {
                                ((d) aVar2).a(cVar3);
                            } else {
                                f.a();
                                throw null;
                            }
                        }
                        cVar2.f5210f = b.e;
                        if (cVar instanceof a) {
                            aVar = (a) cVar;
                        } else {
                            cVar.a(obj);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    obj = i.c.d.p.e.a(th);
                }
            } else {
                f.a();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<n.k.i.a.e> r2 = n.k.i.a.e.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            n.k.i.a.e r1 = (n.k.i.a.e) r1
            if (r1 == 0) goto L_0x011e
            int r2 = r1.v()
            r3 = 1
            if (r2 > r3) goto L_0x00f6
            r2 = -1
            r4 = 0
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x003f }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x003f }
            java.lang.String r6 = "field"
            n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x003f }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x003f }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x003f }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x003f }
            if (r6 != 0) goto L_0x0033
            r5 = r0
        L_0x0033:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x003f }
            if (r5 == 0) goto L_0x003c
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x003f }
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            int r5 = r5 - r3
            goto L_0x0040
        L_0x003f:
            r5 = -1
        L_0x0040:
            if (r5 >= 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            int[] r2 = r1.l()
            r2 = r2[r5]
        L_0x0049:
            n.k.i.a.f r3 = n.k.i.a.f.c
            n.k.i.a.f$a r3 = n.k.i.a.f.f5212b
            if (r3 == 0) goto L_0x0050
            goto L_0x0093
        L_0x0050:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x008f }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x008f }
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x008f }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x008f }
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ Exception -> 0x008f }
            java.lang.String r6 = "getDescriptor"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x008f }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x008f }
            java.lang.Class r6 = r9.getClass()     // Catch:{ Exception -> 0x008f }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x008f }
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x008f }
            java.lang.String r7 = "name"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x008f }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x008f }
            n.k.i.a.f$a r7 = new n.k.i.a.f$a     // Catch:{ Exception -> 0x008f }
            r7.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x008f }
            n.k.i.a.f.f5212b = r7     // Catch:{ Exception -> 0x008f }
            r3 = r7
            goto L_0x0093
        L_0x008f:
            n.k.i.a.f$a r3 = n.k.i.a.f.a
            n.k.i.a.f.f5212b = r3
        L_0x0093:
            n.k.i.a.f$a r5 = n.k.i.a.f.a
            if (r3 != r5) goto L_0x0098
            goto L_0x00c8
        L_0x0098:
            java.lang.reflect.Method r5 = r3.a
            if (r5 == 0) goto L_0x00c8
            java.lang.Class r6 = r9.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r5 = r5.invoke(r6, r7)
            if (r5 == 0) goto L_0x00c8
            java.lang.reflect.Method r6 = r3.f5213b
            if (r6 == 0) goto L_0x00c8
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r5 = r6.invoke(r5, r7)
            if (r5 == 0) goto L_0x00c8
            java.lang.reflect.Method r3 = r3.c
            if (r3 == 0) goto L_0x00bf
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r3 = r3.invoke(r5, r4)
            goto L_0x00c0
        L_0x00bf:
            r3 = r0
        L_0x00c0:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r0 = r3
        L_0x00c6:
            java.lang.String r0 = (java.lang.String) r0
        L_0x00c8:
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = r1.c()
            goto L_0x00e7
        L_0x00cf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 47
            r3.append(r0)
            java.lang.String r0 = r1.c()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x00e7:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = r1.m()
            java.lang.String r1 = r1.f()
            r3.<init>(r0, r4, r1, r2)
            r0 = r3
            goto L_0x011e
        L_0x00f6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x011e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.k.i.a.a.b():java.lang.StackTraceElement");
    }

    public String toString() {
        StringBuilder a = i.a.a.a.a.a("Continuation at ");
        Object b2 = b();
        if (b2 == null) {
            b2 = getClass().getName();
        }
        a.append(b2);
        return a.toString();
    }

    public d a() {
        c<Object> cVar = this.e;
        if (!(cVar instanceof d)) {
            cVar = null;
        }
        return (d) cVar;
    }
}
