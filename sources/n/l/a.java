package n.l;

import java.lang.reflect.Method;
import n.m.c.f;

/* compiled from: PlatformImplementations.kt */
public class a {

    /* renamed from: n.l.a$a  reason: collision with other inner class name */
    /* compiled from: PlatformImplementations.kt */
    public static final class C0150a {
        public static final Method a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (n.m.c.f.a((java.lang.Object) r5, (java.lang.Object) r0) != false) goto L_0x003b;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = "it"
                n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r7)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = n.m.c.f.a((java.lang.Object) r7, (java.lang.Object) r8)
                r8 = 1
                if (r7 == 0) goto L_0x003a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                n.m.c.f.a((java.lang.Object) r7, (java.lang.String) r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x0033
                r5 = r7[r3]
            L_0x0033:
                boolean r5 = n.m.c.f.a((java.lang.Object) r5, (java.lang.Object) r0)
                if (r5 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r8 = 0
            L_0x003b:
                if (r8 == 0) goto L_0x003f
                r5 = r6
                goto L_0x0042
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0042:
                a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n.l.a.C0150a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        if (th == null) {
            f.a("cause");
            throw null;
        } else if (th2 != null) {
            Method method = C0150a.a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        } else {
            f.a("exception");
            throw null;
        }
    }
}
