package n.l;

/* compiled from: PlatformImplementations.kt */
public final class b {
    public static final a a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: n.l.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: n.l.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    static {
        /*
            java.lang.Class<n.l.a> r0 = n.l.a.class
            java.lang.String r1 = "java.specification.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 == 0) goto L_0x0046
            r2 = 6
            r3 = 46
            r4 = 0
            int r2 = n.q.d.a(r1, r3, r4, r4, r2)
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= 0) goto L_0x001d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0046 }
            int r1 = r1 * r5
            goto L_0x0049
        L_0x001d:
            int r6 = r2 + 1
            r7 = 4
            int r3 = n.q.d.a(r1, r3, r6, r4, r7)
            if (r3 >= 0) goto L_0x002a
            int r3 = r1.length()
        L_0x002a:
            java.lang.String r2 = r1.substring(r4, r2)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r4)
            java.lang.String r1 = r1.substring(r6, r3)
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r4)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0046 }
            int r2 = r2 * r5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0046 }
            int r1 = r1 + r2
            goto L_0x0049
        L_0x0046:
            r1 = 65542(0x10006, float:9.1844E-41)
        L_0x0049:
            r2 = 65544(0x10008, float:9.1847E-41)
            java.lang.String r3 = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)"
            java.lang.String r4 = ", base type classloader: "
            java.lang.String r5 = "Instance classloader: "
            java.lang.String r6 = "Class.forName(\"kotlin.in…entations\").newInstance()"
            if (r1 < r2) goto L_0x00d7
            java.lang.String r2 = "kotlin.internal.jdk8.JDK8PlatformImplementations"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0096 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ ClassNotFoundException -> 0x0096 }
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r6)     // Catch:{ ClassNotFoundException -> 0x0096 }
            n.l.a r2 = (n.l.a) r2     // Catch:{ ClassCastException -> 0x0067 }
            goto L_0x0161
        L_0x0067:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch:{ ClassNotFoundException -> 0x0096 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0096 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0096 }
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0096 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0096 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0096 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x0096 }
            r10.append(r2)     // Catch:{ ClassNotFoundException -> 0x0096 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x0096 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x0096 }
            java.lang.String r2 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0096 }
            r9.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0096 }
            java.lang.Throwable r2 = r9.initCause(r7)     // Catch:{ ClassNotFoundException -> 0x0096 }
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ ClassNotFoundException -> 0x0096 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0096 }
        L_0x0096:
            java.lang.String r2 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ ClassNotFoundException -> 0x00d6 }
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r6)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            n.l.a r2 = (n.l.a) r2     // Catch:{ ClassCastException -> 0x00a7 }
            goto L_0x0161
        L_0x00a7:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch:{ ClassNotFoundException -> 0x00d6 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d6 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d6 }
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x00d6 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00d6 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x00d6 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            r10.append(r2)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            java.lang.String r2 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x00d6 }
            r9.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            java.lang.Throwable r2 = r9.initCause(r7)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ ClassNotFoundException -> 0x00d6 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x00d6 }
        L_0x00d6:
        L_0x00d7:
            r2 = 65543(0x10007, float:9.1845E-41)
            if (r1 < r2) goto L_0x015c
            java.lang.String r1 = "n.l.c.a"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x011c }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x011c }
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r6)     // Catch:{ ClassNotFoundException -> 0x011c }
            r2 = r1
            n.l.a r2 = (n.l.a) r2     // Catch:{ ClassCastException -> 0x00ed }
            goto L_0x0161
        L_0x00ed:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x011c }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x011c }
            java.lang.ClassLoader r7 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x011c }
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x011c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x011c }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x011c }
            r9.append(r5)     // Catch:{ ClassNotFoundException -> 0x011c }
            r9.append(r1)     // Catch:{ ClassNotFoundException -> 0x011c }
            r9.append(r4)     // Catch:{ ClassNotFoundException -> 0x011c }
            r9.append(r7)     // Catch:{ ClassNotFoundException -> 0x011c }
            java.lang.String r1 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x011c }
            r8.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x011c }
            java.lang.Throwable r1 = r8.initCause(r2)     // Catch:{ ClassNotFoundException -> 0x011c }
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r3)     // Catch:{ ClassNotFoundException -> 0x011c }
            throw r1     // Catch:{ ClassNotFoundException -> 0x011c }
        L_0x011c:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x015c }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x015c }
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r6)     // Catch:{ ClassNotFoundException -> 0x015c }
            r2 = r1
            n.l.a r2 = (n.l.a) r2     // Catch:{ ClassCastException -> 0x012d }
            goto L_0x0161
        L_0x012d:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x015c }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x015c }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x015c }
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x015c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x015c }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x015c }
            r7.append(r5)     // Catch:{ ClassNotFoundException -> 0x015c }
            r7.append(r1)     // Catch:{ ClassNotFoundException -> 0x015c }
            r7.append(r4)     // Catch:{ ClassNotFoundException -> 0x015c }
            r7.append(r0)     // Catch:{ ClassNotFoundException -> 0x015c }
            java.lang.String r0 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x015c }
            r6.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x015c }
            java.lang.Throwable r0 = r6.initCause(r2)     // Catch:{ ClassNotFoundException -> 0x015c }
            n.m.c.f.a((java.lang.Object) r0, (java.lang.String) r3)     // Catch:{ ClassNotFoundException -> 0x015c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x015c }
        L_0x015c:
            n.l.a r2 = new n.l.a
            r2.<init>()
        L_0x0161:
            a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.l.b.<clinit>():void");
    }
}
