package f.a.a;

import n.e;
import n.m.c.f;

/* compiled from: StackTraceRecovery.kt */
public final class m {
    public static final String a;

    static {
        Object obj;
        Object obj2;
        try {
            Class<?> cls = Class.forName("n.k.i.a.a");
            f.a((Object) cls, "Class.forName(baseContinuationImplClass)");
            obj = cls.getCanonicalName();
            e.a(obj);
        } catch (Throwable th) {
            obj = i.c.d.p.e.a(th);
        }
        if (e.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) obj;
        try {
            Class<?> cls2 = Class.forName("f.a.a.m");
            f.a((Object) cls2, "Class.forName(stackTraceRecoveryClass)");
            obj2 = cls2.getCanonicalName();
        } catch (Throwable th2) {
            obj2 = i.c.d.p.e.a(th2);
        }
        if (e.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E extends java.lang.Throwable> E a(E r11, n.k.c<?> r12) {
        /*
            r0 = 0
            if (r11 == 0) goto L_0x017a
            if (r12 == 0) goto L_0x0174
            boolean r0 = f.a.x.c
            if (r0 == 0) goto L_0x0173
            boolean r0 = r12 instanceof n.k.i.a.d
            if (r0 != 0) goto L_0x000f
            goto L_0x0173
        L_0x000f:
            n.k.i.a.d r12 = (n.k.i.a.d) r12
            java.lang.Throwable r0 = r11.getCause()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0057
            java.lang.Class r3 = r0.getClass()
            java.lang.Class r4 = r11.getClass()
            boolean r3 = n.m.c.f.a((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0057
            java.lang.StackTraceElement[] r3 = r11.getStackTrace()
            java.lang.String r4 = "currentTrace"
            n.m.c.f.a((java.lang.Object) r3, (java.lang.String) r4)
            int r4 = r3.length
            r5 = 0
        L_0x0032:
            if (r5 >= r4) goto L_0x0046
            r6 = r3[r5]
            java.lang.String r7 = "it"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r7)
            boolean r6 = a(r6)
            if (r6 == 0) goto L_0x0043
            r4 = 1
            goto L_0x0047
        L_0x0043:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x0046:
            r4 = 0
        L_0x0047:
            if (r4 == 0) goto L_0x004f
            n.d r4 = new n.d
            r4.<init>(r0, r3)
            goto L_0x005f
        L_0x004f:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            n.d r3 = new n.d
            r3.<init>(r11, r0)
            goto L_0x005e
        L_0x0057:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            n.d r3 = new n.d
            r3.<init>(r11, r0)
        L_0x005e:
            r4 = r3
        L_0x005f:
            A r0 = r4.e
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            B r3 = r4.f5204f
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3
            java.lang.Throwable r4 = f.a.a.a.a(r0)
            if (r4 == 0) goto L_0x0173
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            java.lang.StackTraceElement r6 = r12.b()
            if (r6 == 0) goto L_0x007b
            r5.add(r6)
        L_0x007b:
            n.k.i.a.d r12 = r12.a()
            if (r12 == 0) goto L_0x008b
            java.lang.StackTraceElement r6 = r12.b()
            if (r6 == 0) goto L_0x007b
            r5.add(r6)
            goto L_0x007b
        L_0x008b:
            boolean r12 = r5.isEmpty()
            if (r12 == 0) goto L_0x0093
            goto L_0x0173
        L_0x0093:
            r12 = -1
            if (r0 == r11) goto L_0x00ff
            int r11 = r3.length
            r6 = 0
        L_0x0098:
            if (r6 >= r11) goto L_0x00a6
            r7 = r3[r6]
            boolean r7 = a(r7)
            if (r7 == 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            int r6 = r6 + 1
            goto L_0x0098
        L_0x00a6:
            r6 = -1
        L_0x00a7:
            int r6 = r6 + r2
            int r11 = r3.length
            int r11 = r11 - r2
            if (r11 < r6) goto L_0x00ff
        L_0x00ac:
            r7 = r3[r11]
            java.lang.Object r8 = r5.getLast()
            java.lang.String r9 = "result.last"
            n.m.c.f.a((java.lang.Object) r8, (java.lang.String) r9)
            java.lang.StackTraceElement r8 = (java.lang.StackTraceElement) r8
            int r9 = r7.getLineNumber()
            int r10 = r8.getLineNumber()
            if (r9 != r10) goto L_0x00ef
            java.lang.String r9 = r7.getMethodName()
            java.lang.String r10 = r8.getMethodName()
            boolean r9 = n.m.c.f.a((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x00ef
            java.lang.String r9 = r7.getFileName()
            java.lang.String r10 = r8.getFileName()
            boolean r9 = n.m.c.f.a((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x00ef
            java.lang.String r7 = r7.getClassName()
            java.lang.String r8 = r8.getClassName()
            boolean r7 = n.m.c.f.a((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x00ef
            r7 = 1
            goto L_0x00f0
        L_0x00ef:
            r7 = 0
        L_0x00f0:
            if (r7 == 0) goto L_0x00f5
            r5.removeLast()
        L_0x00f5:
            r7 = r3[r11]
            r5.addFirst(r7)
            if (r11 == r6) goto L_0x00ff
            int r11 = r11 + -1
            goto L_0x00ac
        L_0x00ff:
            java.lang.StackTraceElement r11 = new java.lang.StackTraceElement
            java.lang.String r3 = "\b\b\b(Coroutine boundary"
            java.lang.String r6 = "\b"
            r11.<init>(r3, r6, r6, r12)
            r5.addFirst(r11)
            java.lang.StackTraceElement[] r11 = r0.getStackTrace()
            java.lang.String r0 = "causeTrace"
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r0)
            java.lang.String r0 = a
            java.lang.String r3 = "baseContinuationImplClassName"
            n.m.c.f.a((java.lang.Object) r0, (java.lang.String) r3)
            int r3 = r11.length
            r6 = 0
        L_0x011d:
            if (r6 >= r3) goto L_0x012f
            r7 = r11[r6]
            java.lang.String r7 = r7.getClassName()
            boolean r7 = n.m.c.f.a((java.lang.Object) r0, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            int r6 = r6 + 1
            goto L_0x011d
        L_0x012f:
            r6 = -1
        L_0x0130:
            if (r6 != r12) goto L_0x0148
            java.lang.StackTraceElement[] r11 = new java.lang.StackTraceElement[r1]
            java.lang.Object[] r11 = r5.toArray(r11)
            if (r11 == 0) goto L_0x0140
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            r4.setStackTrace(r11)
            goto L_0x0172
        L_0x0140:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.Array<T>"
            r11.<init>(r12)
            throw r11
        L_0x0148:
            int r12 = r5.size()
            int r12 = r12 + r6
            java.lang.StackTraceElement[] r12 = new java.lang.StackTraceElement[r12]
            r0 = 0
        L_0x0150:
            if (r0 >= r6) goto L_0x0159
            r3 = r11[r0]
            r12[r0] = r3
            int r0 = r0 + 1
            goto L_0x0150
        L_0x0159:
            java.util.Iterator r11 = r5.iterator()
        L_0x015d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r0 = r11.next()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            int r3 = r6 + r1
            r12[r3] = r0
            int r1 = r1 + r2
            goto L_0x015d
        L_0x016f:
            r4.setStackTrace(r12)
        L_0x0172:
            r11 = r4
        L_0x0173:
            return r11
        L_0x0174:
            java.lang.String r11 = "continuation"
            n.m.c.f.a((java.lang.String) r11)
            throw r0
        L_0x017a:
            java.lang.String r11 = "exception"
            n.m.c.f.a((java.lang.String) r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.m.a(java.lang.Throwable, n.k.c):java.lang.Throwable");
    }

    public static final boolean a(StackTraceElement stackTraceElement) {
        if (stackTraceElement != null) {
            String className = stackTraceElement.getClassName();
            f.a((Object) className, "className");
            return className.startsWith("\b\b\b");
        }
        f.a("$this$isArtificial");
        throw null;
    }
}
