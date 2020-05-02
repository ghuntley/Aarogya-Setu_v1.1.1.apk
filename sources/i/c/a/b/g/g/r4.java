package i.c.a.b.g.g;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class r4 extends o4 {
    public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ r4(n4 n4Var) {
        super((n4) null);
    }

    public final void a(Object obj, long j2) {
        Object obj2;
        List list = (List) l6.f(obj, j2);
        if (list instanceof l4) {
            obj2 = ((l4) list).g();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof q5) || !(list instanceof d4)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                d4 d4Var = (d4) list;
                if (d4Var.a()) {
                    d4Var.l();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        l6.a(obj, j2, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: i.c.a.b.g.g.m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: i.c.a.b.g.g.m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: i.c.a.b.g.g.m4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void a(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = i.c.a.b.g.g.l6.f(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = i.c.a.b.g.g.l6.f(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof i.c.a.b.g.g.l4
            if (r2 == 0) goto L_0x0020
            i.c.a.b.g.g.m4 r1 = new i.c.a.b.g.g.m4
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof i.c.a.b.g.g.q5
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof i.c.a.b.g.g.d4
            if (r2 == 0) goto L_0x0030
            i.c.a.b.g.g.d4 r1 = (i.c.a.b.g.g.d4) r1
            i.c.a.b.g.g.d4 r0 = r1.a(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            i.c.a.b.g.g.l6.a((java.lang.Object) r5, (long) r7, (java.lang.Object) r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            i.c.a.b.g.g.l6.a((java.lang.Object) r5, (long) r7, (java.lang.Object) r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof i.c.a.b.g.g.k6
            if (r2 == 0) goto L_0x0072
            i.c.a.b.g.g.m4 r2 = new i.c.a.b.g.g.m4
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            i.c.a.b.g.g.k6 r1 = (i.c.a.b.g.g.k6) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            i.c.a.b.g.g.l6.a((java.lang.Object) r5, (long) r7, (java.lang.Object) r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof i.c.a.b.g.g.q5
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof i.c.a.b.g.g.d4
            if (r2 == 0) goto L_0x008f
            r2 = r1
            i.c.a.b.g.g.d4 r2 = (i.c.a.b.g.g.d4) r2
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            i.c.a.b.g.g.d4 r1 = r2.a(r1)
            i.c.a.b.g.g.l6.a((java.lang.Object) r5, (long) r7, (java.lang.Object) r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 <= 0) goto L_0x00a1
            r6 = r1
        L_0x00a1:
            i.c.a.b.g.g.l6.a((java.lang.Object) r5, (long) r7, (java.lang.Object) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.r4.a(java.lang.Object, java.lang.Object, long):void");
    }
}
