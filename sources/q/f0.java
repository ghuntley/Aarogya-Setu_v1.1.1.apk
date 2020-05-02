package q;

/* compiled from: ServiceMethod */
public abstract class f0<T> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: q.z$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: q.z$m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v13, resolved type: q.z$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v14, resolved type: q.z$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v77, resolved type: q.z$i} */
    /* JADX WARNING: type inference failed for: r10v13, types: [q.z$b] */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r10v27, types: [q.z$j] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x07ef  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x07f3 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> q.f0<T> a(q.e0 r23, java.lang.reflect.Method r24) {
        /*
            r0 = r23
            r1 = r24
            q.c0$a r2 = new q.c0$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.c
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x000e:
            java.lang.String r7 = "HEAD"
            r8 = 1
            if (r6 >= r4) goto L_0x0120
            r9 = r3[r6]
            boolean r10 = r9 instanceof q.k0.b
            if (r10 == 0) goto L_0x0026
            q.k0.b r9 = (q.k0.b) r9
            java.lang.String r7 = r9.value()
            java.lang.String r8 = "DELETE"
            r2.a(r8, r7, r5)
            goto L_0x011c
        L_0x0026:
            boolean r10 = r9 instanceof q.k0.e
            if (r10 == 0) goto L_0x0037
            q.k0.e r9 = (q.k0.e) r9
            java.lang.String r7 = r9.value()
            java.lang.String r8 = "GET"
            r2.a(r8, r7, r5)
            goto L_0x011c
        L_0x0037:
            boolean r10 = r9 instanceof q.k0.f
            if (r10 == 0) goto L_0x0046
            q.k0.f r9 = (q.k0.f) r9
            java.lang.String r8 = r9.value()
            r2.a(r7, r8, r5)
            goto L_0x011c
        L_0x0046:
            boolean r7 = r9 instanceof q.k0.l
            if (r7 == 0) goto L_0x0057
            q.k0.l r9 = (q.k0.l) r9
            java.lang.String r7 = r9.value()
            java.lang.String r9 = "PATCH"
            r2.a(r9, r7, r8)
            goto L_0x011c
        L_0x0057:
            boolean r7 = r9 instanceof q.k0.m
            if (r7 == 0) goto L_0x0068
            q.k0.m r9 = (q.k0.m) r9
            java.lang.String r7 = r9.value()
            java.lang.String r9 = "POST"
            r2.a(r9, r7, r8)
            goto L_0x011c
        L_0x0068:
            boolean r7 = r9 instanceof q.k0.n
            if (r7 == 0) goto L_0x0079
            q.k0.n r9 = (q.k0.n) r9
            java.lang.String r7 = r9.value()
            java.lang.String r9 = "PUT"
            r2.a(r9, r7, r8)
            goto L_0x011c
        L_0x0079:
            boolean r7 = r9 instanceof q.k0.k
            if (r7 == 0) goto L_0x008a
            q.k0.k r9 = (q.k0.k) r9
            java.lang.String r7 = r9.value()
            java.lang.String r8 = "OPTIONS"
            r2.a(r8, r7, r5)
            goto L_0x011c
        L_0x008a:
            boolean r7 = r9 instanceof q.k0.g
            if (r7 == 0) goto L_0x00a1
            q.k0.g r9 = (q.k0.g) r9
            java.lang.String r7 = r9.method()
            java.lang.String r8 = r9.path()
            boolean r9 = r9.hasBody()
            r2.a(r7, r8, r9)
            goto L_0x011c
        L_0x00a1:
            boolean r7 = r9 instanceof q.k0.j
            if (r7 == 0) goto L_0x011c
            q.k0.j r9 = (q.k0.j) r9
            java.lang.String[] r7 = r9.value()
            int r9 = r7.length
            if (r9 == 0) goto L_0x0111
            o.x$a r9 = new o.x$a
            r9.<init>()
            int r10 = r7.length
            r11 = 0
        L_0x00b5:
            if (r11 >= r10) goto L_0x0109
            r12 = r7[r11]
            r13 = 58
            int r13 = r12.indexOf(r13)
            r14 = -1
            if (r13 == r14) goto L_0x00fc
            if (r13 == 0) goto L_0x00fc
            int r14 = r12.length()
            int r14 = r14 - r8
            if (r13 == r14) goto L_0x00fc
            java.lang.String r14 = r12.substring(r5, r13)
            int r13 = r13 + 1
            java.lang.String r12 = r12.substring(r13)
            java.lang.String r12 = r12.trim()
            java.lang.String r13 = "Content-Type"
            boolean r13 = r13.equalsIgnoreCase(r14)
            if (r13 == 0) goto L_0x00f6
            o.a0 r13 = o.a0.a((java.lang.String) r12)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r2.t = r13     // Catch:{ IllegalArgumentException -> 0x00e8 }
            goto L_0x00f9
        L_0x00e8:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r5] = r12
            java.lang.String r3 = "Malformed content type: %s"
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            throw r0
        L_0x00f6:
            r9.a(r14, r12)
        L_0x00f9:
            int r11 = r11 + 1
            goto L_0x00b5
        L_0x00fc:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r5] = r12
            java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x0109:
            o.x r7 = new o.x
            r7.<init>((o.x.a) r9)
            r2.s = r7
            goto L_0x011c
        L_0x0111:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x011c:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0120:
            java.lang.String r3 = r2.f5709n
            if (r3 == 0) goto L_0x09c2
            boolean r3 = r2.f5710o
            if (r3 != 0) goto L_0x0147
            boolean r3 = r2.f5712q
            if (r3 != 0) goto L_0x013c
            boolean r3 = r2.f5711p
            if (r3 != 0) goto L_0x0131
            goto L_0x0147
        L_0x0131:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x013c:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x0147:
            java.lang.annotation.Annotation[][] r3 = r2.d
            int r3 = r3.length
            q.z[] r4 = new q.z[r3]
            r2.v = r4
            int r4 = r3 + -1
            r5 = 0
        L_0x0151:
            if (r5 >= r3) goto L_0x0840
            q.z<?>[] r6 = r2.v
            java.lang.reflect.Type[] r8 = r2.e
            r14 = r8[r5]
            java.lang.annotation.Annotation[][] r8 = r2.d
            r15 = r8[r5]
            if (r5 != r4) goto L_0x0163
            r8 = 1
            r16 = 1
            goto L_0x0166
        L_0x0163:
            r8 = 0
            r16 = 0
        L_0x0166:
            if (r15 == 0) goto L_0x0810
            int r13 = r15.length
            r8 = 0
            r9 = 0
            r17 = r9
            r12 = 0
        L_0x016e:
            if (r12 >= r13) goto L_0x080b
            r8 = r15[r12]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class<o.b0$b> r10 = o.b0.b.class
            boolean r11 = r8 instanceof q.k0.q
            r18 = r3
            r3 = 2
            if (r11 == 0) goto L_0x0239
            r2.a(r5, r14)
            boolean r9 = r2.f5705j
            if (r9 != 0) goto L_0x022d
            boolean r9 = r2.f5706k
            if (r9 != 0) goto L_0x0221
            boolean r9 = r2.f5707l
            if (r9 != 0) goto L_0x0215
            boolean r9 = r2.f5708m
            if (r9 != 0) goto L_0x0209
            java.lang.String r9 = r2.r
            if (r9 == 0) goto L_0x01f8
            r9 = 1
            r2.f5704i = r9
            q.k0.q r8 = (q.k0.q) r8
            java.lang.String r11 = r8.value()
            java.util.regex.Pattern r9 = q.c0.a.y
            java.util.regex.Matcher r9 = r9.matcher(r11)
            boolean r9 = r9.matches()
            if (r9 == 0) goto L_0x01e1
            java.util.Set<java.lang.String> r9 = r2.u
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x01ce
            q.e0 r3 = r2.a
            q.j r3 = r3.c(r14, r15)
            q.z$i r19 = new q.z$i
            java.lang.reflect.Method r9 = r2.f5700b
            boolean r20 = r8.encoded()
            r8 = r19
            r10 = r5
            r21 = r12
            r12 = r3
            r22 = r13
            r13 = r20
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0623
        L_0x01ce:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r2.r
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r11
            java.lang.String r2 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x01e1:
            r0 = 0
            r1 = 1
            java.lang.reflect.Method r2 = r2.f5700b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.util.regex.Pattern r4 = q.c0.a.x
            java.lang.String r4 = r4.pattern()
            r3[r0] = r4
            r3[r1] = r11
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r2, (int) r5, (java.lang.String) r0, (java.lang.Object[]) r3)
            throw r0
        L_0x01f8:
            r0 = 0
            r1 = 1
            java.lang.reflect.Method r3 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f5709n
            r1[r0] = r2
            java.lang.String r0 = "@Path can only be used with relative url on @%s"
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r3, (int) r5, (java.lang.String) r0, (java.lang.Object[]) r1)
            throw r0
        L_0x0209:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Path parameters may not be used with @Url."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0215:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryMap."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0221:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryName."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x022d:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @Query."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0239:
            r21 = r12
            r22 = r13
            boolean r3 = r8 instanceof q.k0.r
            java.lang.String r11 = "<String>)"
            java.lang.String r12 = " must include generic type (e.g., "
            if (r3 == 0) goto L_0x02c1
            r2.a(r5, r14)
            q.k0.r r8 = (q.k0.r) r8
            java.lang.String r3 = r8.value()
            boolean r8 = r8.encoded()
            java.lang.Class r9 = q.i0.b(r14)
            r10 = 1
            r2.f5705j = r10
            java.lang.Class<java.lang.Iterable> r10 = java.lang.Iterable.class
            boolean r10 = r10.isAssignableFrom(r9)
            if (r10 == 0) goto L_0x0292
            boolean r10 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r10 == 0) goto L_0x027f
            r9 = r14
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            r10 = 0
            java.lang.reflect.Type r9 = q.i0.a((int) r10, (java.lang.reflect.ParameterizedType) r9)
            q.e0 r10 = r2.a
            q.j r9 = r10.c(r9, r15)
            q.z$j r10 = new q.z$j
            r10.<init>(r3, r9, r8)
            q.x r3 = new q.x
            r3.<init>(r10)
            goto L_0x04fb
        L_0x027f:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = i.a.a.a.a.a((java.lang.Class) r9, (java.lang.StringBuilder) r1, (java.lang.String) r12, (java.lang.String) r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x0292:
            boolean r10 = r9.isArray()
            if (r10 == 0) goto L_0x02b2
            java.lang.Class r9 = r9.getComponentType()
            java.lang.Class r9 = q.c0.a.a(r9)
            q.e0 r10 = r2.a
            q.j r9 = r10.c(r9, r15)
            q.z$j r10 = new q.z$j
            r10.<init>(r3, r9, r8)
            q.y r3 = new q.y
            r3.<init>(r10)
            goto L_0x04fb
        L_0x02b2:
            q.e0 r9 = r2.a
            q.j r9 = r9.c(r14, r15)
            q.z$j r10 = new q.z$j
            r10.<init>(r3, r9, r8)
        L_0x02bd:
            r19 = r10
            goto L_0x0623
        L_0x02c1:
            boolean r3 = r8 instanceof q.k0.t
            if (r3 == 0) goto L_0x033b
            r2.a(r5, r14)
            q.k0.t r8 = (q.k0.t) r8
            boolean r3 = r8.encoded()
            java.lang.Class r8 = q.i0.b(r14)
            r9 = 1
            r2.f5706k = r9
            java.lang.Class<java.lang.Iterable> r9 = java.lang.Iterable.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 == 0) goto L_0x030e
            boolean r9 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r9 == 0) goto L_0x02fb
            r8 = r14
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            r9 = 0
            java.lang.reflect.Type r8 = q.i0.a((int) r9, (java.lang.reflect.ParameterizedType) r8)
            q.e0 r9 = r2.a
            q.j r8 = r9.c(r8, r15)
            q.z$l r9 = new q.z$l
            r9.<init>(r8, r3)
            q.x r3 = new q.x
            r3.<init>(r9)
            goto L_0x04fb
        L_0x02fb:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = i.a.a.a.a.a((java.lang.Class) r8, (java.lang.StringBuilder) r1, (java.lang.String) r12, (java.lang.String) r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x030e:
            boolean r9 = r8.isArray()
            if (r9 == 0) goto L_0x032e
            java.lang.Class r8 = r8.getComponentType()
            java.lang.Class r8 = q.c0.a.a(r8)
            q.e0 r9 = r2.a
            q.j r8 = r9.c(r8, r15)
            q.z$l r9 = new q.z$l
            r9.<init>(r8, r3)
            q.y r3 = new q.y
            r3.<init>(r9)
            goto L_0x04fb
        L_0x032e:
            q.e0 r8 = r2.a
            q.j r8 = r8.c(r14, r15)
            q.z$l r9 = new q.z$l
            r9.<init>(r8, r3)
            goto L_0x055c
        L_0x033b:
            boolean r3 = r8 instanceof q.k0.s
            java.lang.String r13 = "Map must include generic types (e.g., Map<String, String>)"
            if (r3 == 0) goto L_0x03a5
            r2.a(r5, r14)
            java.lang.Class r3 = q.i0.b(r14)
            r10 = 1
            r2.f5707l = r10
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            boolean r11 = r11.isAssignableFrom(r3)
            if (r11 == 0) goto L_0x0399
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            java.lang.reflect.Type r3 = q.i0.b(r14, r3, r11)
            boolean r11 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L_0x038f
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r11 = 0
            java.lang.reflect.Type r11 = q.i0.a((int) r11, (java.lang.reflect.ParameterizedType) r3)
            if (r9 != r11) goto L_0x037f
            java.lang.reflect.Type r3 = q.i0.a((int) r10, (java.lang.reflect.ParameterizedType) r3)
            q.e0 r9 = r2.a
            q.j r3 = r9.c(r3, r15)
            q.z$k r9 = new q.z$k
            java.lang.reflect.Method r10 = r2.f5700b
            q.k0.s r8 = (q.k0.s) r8
            boolean r8 = r8.encoded()
            r9.<init>(r10, r5, r3, r8)
            goto L_0x055c
        L_0x037f:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.String r1 = "@QueryMap keys must be of type String: "
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r1, (java.lang.reflect.Type) r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x038f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r13, (java.lang.Object[]) r0)
            throw r0
        L_0x0399:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x03a5:
            boolean r3 = r8 instanceof q.k0.h
            if (r3 == 0) goto L_0x041c
            r2.a(r5, r14)
            q.k0.h r8 = (q.k0.h) r8
            java.lang.String r3 = r8.value()
            java.lang.Class r8 = q.i0.b(r14)
            java.lang.Class<java.lang.Iterable> r9 = java.lang.Iterable.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 == 0) goto L_0x03ef
            boolean r9 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r9 == 0) goto L_0x03dc
            r8 = r14
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            r9 = 0
            java.lang.reflect.Type r8 = q.i0.a((int) r9, (java.lang.reflect.ParameterizedType) r8)
            q.e0 r9 = r2.a
            q.j r8 = r9.c(r8, r15)
            q.z$d r9 = new q.z$d
            r9.<init>(r3, r8)
            q.x r3 = new q.x
            r3.<init>(r9)
            goto L_0x04fb
        L_0x03dc:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = i.a.a.a.a.a((java.lang.Class) r8, (java.lang.StringBuilder) r1, (java.lang.String) r12, (java.lang.String) r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x03ef:
            boolean r9 = r8.isArray()
            if (r9 == 0) goto L_0x040f
            java.lang.Class r8 = r8.getComponentType()
            java.lang.Class r8 = q.c0.a.a(r8)
            q.e0 r9 = r2.a
            q.j r8 = r9.c(r8, r15)
            q.z$d r9 = new q.z$d
            r9.<init>(r3, r8)
            q.y r3 = new q.y
            r3.<init>(r9)
            goto L_0x04fb
        L_0x040f:
            q.e0 r8 = r2.a
            q.j r8 = r8.c(r14, r15)
            q.z$d r9 = new q.z$d
            r9.<init>(r3, r8)
            goto L_0x055c
        L_0x041c:
            boolean r3 = r8 instanceof q.k0.i
            if (r3 == 0) goto L_0x0489
            java.lang.Class<o.x> r3 = o.x.class
            if (r14 != r3) goto L_0x042d
            q.z$f r3 = new q.z$f
            java.lang.reflect.Method r8 = r2.f5700b
            r3.<init>(r8, r5)
            goto L_0x04fb
        L_0x042d:
            r2.a(r5, r14)
            java.lang.Class r3 = q.i0.b(r14)
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            boolean r8 = r8.isAssignableFrom(r3)
            if (r8 == 0) goto L_0x047d
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            java.lang.reflect.Type r3 = q.i0.b(r14, r3, r8)
            boolean r8 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r8 == 0) goto L_0x0473
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r8 = 0
            java.lang.reflect.Type r8 = q.i0.a((int) r8, (java.lang.reflect.ParameterizedType) r3)
            if (r9 != r8) goto L_0x0463
            r8 = 1
            java.lang.reflect.Type r3 = q.i0.a((int) r8, (java.lang.reflect.ParameterizedType) r3)
            q.e0 r8 = r2.a
            q.j r3 = r8.c(r3, r15)
            q.z$e r8 = new q.z$e
            java.lang.reflect.Method r9 = r2.f5700b
            r8.<init>(r9, r5, r3)
            goto L_0x060b
        L_0x0463:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.String r1 = "@HeaderMap keys must be of type String: "
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r1, (java.lang.reflect.Type) r8)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x0473:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r13, (java.lang.Object[]) r0)
            throw r0
        L_0x047d:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@HeaderMap parameter type must be Map."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0489:
            boolean r3 = r8 instanceof q.k0.c
            if (r3 == 0) goto L_0x0518
            r2.a(r5, r14)
            boolean r3 = r2.f5711p
            if (r3 == 0) goto L_0x050c
            q.k0.c r8 = (q.k0.c) r8
            java.lang.String r3 = r8.value()
            boolean r8 = r8.encoded()
            r9 = 1
            r2.f5701f = r9
            java.lang.Class r9 = q.i0.b(r14)
            java.lang.Class<java.lang.Iterable> r10 = java.lang.Iterable.class
            boolean r10 = r10.isAssignableFrom(r9)
            if (r10 == 0) goto L_0x04dd
            boolean r10 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r10 == 0) goto L_0x04ca
            r9 = r14
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            r10 = 0
            java.lang.reflect.Type r9 = q.i0.a((int) r10, (java.lang.reflect.ParameterizedType) r9)
            q.e0 r10 = r2.a
            q.j r9 = r10.c(r9, r15)
            q.z$b r10 = new q.z$b
            r10.<init>(r3, r9, r8)
            q.x r3 = new q.x
            r3.<init>(r10)
            goto L_0x04fb
        L_0x04ca:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = i.a.a.a.a.a((java.lang.Class) r9, (java.lang.StringBuilder) r1, (java.lang.String) r12, (java.lang.String) r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x04dd:
            boolean r10 = r9.isArray()
            if (r10 == 0) goto L_0x04ff
            java.lang.Class r9 = r9.getComponentType()
            java.lang.Class r9 = q.c0.a.a(r9)
            q.e0 r10 = r2.a
            q.j r9 = r10.c(r9, r15)
            q.z$b r10 = new q.z$b
            r10.<init>(r3, r9, r8)
            q.y r3 = new q.y
            r3.<init>(r10)
        L_0x04fb:
            r19 = r4
            goto L_0x07c1
        L_0x04ff:
            q.e0 r9 = r2.a
            q.j r9 = r9.c(r14, r15)
            q.z$b r10 = new q.z$b
            r10.<init>(r3, r9, r8)
            goto L_0x02bd
        L_0x050c:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x0518:
            boolean r3 = r8 instanceof q.k0.d
            if (r3 == 0) goto L_0x0592
            r2.a(r5, r14)
            boolean r3 = r2.f5711p
            if (r3 == 0) goto L_0x0586
            java.lang.Class r3 = q.i0.b(r14)
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            boolean r10 = r10.isAssignableFrom(r3)
            if (r10 == 0) goto L_0x057a
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            java.lang.reflect.Type r3 = q.i0.b(r14, r3, r10)
            boolean r10 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r10 == 0) goto L_0x0570
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r10 = 0
            java.lang.reflect.Type r10 = q.i0.a((int) r10, (java.lang.reflect.ParameterizedType) r3)
            if (r9 != r10) goto L_0x0560
            r9 = 1
            java.lang.reflect.Type r3 = q.i0.a((int) r9, (java.lang.reflect.ParameterizedType) r3)
            q.e0 r10 = r2.a
            q.j r3 = r10.c(r3, r15)
            r2.f5701f = r9
            q.z$c r9 = new q.z$c
            java.lang.reflect.Method r10 = r2.f5700b
            q.k0.d r8 = (q.k0.d) r8
            boolean r8 = r8.encoded()
            r9.<init>(r10, r5, r3, r8)
        L_0x055c:
            r19 = r4
            goto L_0x07ec
        L_0x0560:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.String r1 = "@FieldMap keys must be of type String: "
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r1, (java.lang.reflect.Type) r10)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x0570:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r13, (java.lang.Object[]) r0)
            throw r0
        L_0x057a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0586:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0592:
            boolean r3 = r8 instanceof q.k0.o
            if (r3 == 0) goto L_0x070a
            r2.a(r5, r14)
            boolean r3 = r2.f5712q
            if (r3 == 0) goto L_0x06fe
            q.k0.o r8 = (q.k0.o) r8
            r3 = 1
            r2.f5702g = r3
            java.lang.String r3 = r8.value()
            java.lang.Class r9 = q.i0.b(r14)
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L_0x0630
            java.lang.Class<java.lang.Iterable> r3 = java.lang.Iterable.class
            boolean r3 = r3.isAssignableFrom(r9)
            java.lang.String r8 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r3 == 0) goto L_0x05f4
            boolean r3 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x05e1
            r3 = r14
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r9 = 0
            java.lang.reflect.Type r3 = q.i0.a((int) r9, (java.lang.reflect.ParameterizedType) r3)
            java.lang.Class r3 = q.i0.b(r3)
            boolean r3 = r10.isAssignableFrom(r3)
            if (r3 == 0) goto L_0x05d8
            q.z$m r3 = q.z.m.a
            q.x r8 = new q.x
            r8.<init>(r3)
            goto L_0x060b
        L_0x05d8:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r8, (java.lang.Object[]) r1)
            throw r0
        L_0x05e1:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = i.a.a.a.a.a((java.lang.Class) r9, (java.lang.StringBuilder) r1, (java.lang.String) r12, (java.lang.String) r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x05f4:
            boolean r3 = r9.isArray()
            if (r3 == 0) goto L_0x061a
            java.lang.Class r3 = r9.getComponentType()
            boolean r3 = r10.isAssignableFrom(r3)
            if (r3 == 0) goto L_0x0610
            q.z$m r3 = q.z.m.a
            q.y r8 = new q.y
            r8.<init>(r3)
        L_0x060b:
            r19 = r4
            r9 = r8
            goto L_0x07ec
        L_0x0610:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r8, (java.lang.Object[]) r1)
            throw r0
        L_0x061a:
            r3 = 0
            boolean r9 = r10.isAssignableFrom(r9)
            if (r9 == 0) goto L_0x0627
            q.z$m r19 = q.z.m.a
        L_0x0623:
            r9 = r19
            goto L_0x055c
        L_0x0627:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r8, (java.lang.Object[]) r1)
            throw r0
        L_0x0630:
            r13 = 4
            java.lang.String[] r13 = new java.lang.String[r13]
            java.lang.String r20 = "Content-Disposition"
            r19 = 0
            r13[r19] = r20
            r19 = r4
            java.lang.String r4 = "form-data; name=\""
            java.lang.String r1 = "\""
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r4, (java.lang.String) r3, (java.lang.String) r1)
            r3 = 1
            r13[r3] = r1
            java.lang.String r1 = "Content-Transfer-Encoding"
            r3 = 2
            r13[r3] = r1
            r1 = 3
            java.lang.String r3 = r8.encoding()
            r13[r1] = r3
            o.x r1 = o.x.a((java.lang.String[]) r13)
            java.lang.Class<java.lang.Iterable> r3 = java.lang.Iterable.class
            boolean r3 = r3.isAssignableFrom(r9)
            java.lang.String r4 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r3 == 0) goto L_0x06a9
            boolean r3 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0696
            r3 = r14
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r8 = 0
            java.lang.reflect.Type r3 = q.i0.a((int) r8, (java.lang.reflect.ParameterizedType) r3)
            java.lang.Class r8 = q.i0.b(r3)
            boolean r8 = r10.isAssignableFrom(r8)
            if (r8 != 0) goto L_0x068c
            q.e0 r4 = r2.a
            java.lang.annotation.Annotation[] r8 = r2.c
            q.j r3 = r4.a(r3, r15, r8)
            q.z$g r4 = new q.z$g
            java.lang.reflect.Method r8 = r2.f5700b
            r4.<init>(r8, r5, r1, r3)
            q.x r3 = new q.x
            r3.<init>(r4)
            goto L_0x07c1
        L_0x068c:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r4, (java.lang.Object[]) r1)
            throw r0
        L_0x0696:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = i.a.a.a.a.a((java.lang.Class) r9, (java.lang.StringBuilder) r1, (java.lang.String) r12, (java.lang.String) r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r1, (java.lang.Object[]) r2)
            throw r0
        L_0x06a9:
            boolean r3 = r9.isArray()
            if (r3 == 0) goto L_0x06dd
            java.lang.Class r3 = r9.getComponentType()
            java.lang.Class r3 = q.c0.a.a(r3)
            boolean r8 = r10.isAssignableFrom(r3)
            if (r8 != 0) goto L_0x06d3
            q.e0 r4 = r2.a
            java.lang.annotation.Annotation[] r8 = r2.c
            q.j r3 = r4.a(r3, r15, r8)
            q.z$g r4 = new q.z$g
            java.lang.reflect.Method r8 = r2.f5700b
            r4.<init>(r8, r5, r1, r3)
            q.y r3 = new q.y
            r3.<init>(r4)
            goto L_0x07c1
        L_0x06d3:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r4, (java.lang.Object[]) r1)
            throw r0
        L_0x06dd:
            boolean r3 = r10.isAssignableFrom(r9)
            if (r3 != 0) goto L_0x06f4
            q.e0 r3 = r2.a
            java.lang.annotation.Annotation[] r4 = r2.c
            q.j r3 = r3.a(r14, r15, r4)
            q.z$g r9 = new q.z$g
            java.lang.reflect.Method r4 = r2.f5700b
            r9.<init>(r4, r5, r1, r3)
            goto L_0x07ec
        L_0x06f4:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r4, (java.lang.Object[]) r1)
            throw r0
        L_0x06fe:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x070a:
            r19 = r4
            boolean r1 = r8 instanceof q.k0.p
            if (r1 == 0) goto L_0x079c
            r2.a(r5, r14)
            boolean r1 = r2.f5712q
            if (r1 == 0) goto L_0x0790
            r1 = 1
            r2.f5702g = r1
            java.lang.Class r1 = q.i0.b(r14)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0784
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = q.i0.b(r14, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x077a
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = q.i0.a((int) r3, (java.lang.reflect.ParameterizedType) r1)
            if (r9 != r3) goto L_0x076a
            r3 = 1
            java.lang.reflect.Type r1 = q.i0.a((int) r3, (java.lang.reflect.ParameterizedType) r1)
            java.lang.Class r3 = q.i0.b(r1)
            boolean r3 = r10.isAssignableFrom(r3)
            if (r3 != 0) goto L_0x075e
            q.e0 r3 = r2.a
            java.lang.annotation.Annotation[] r4 = r2.c
            q.j r1 = r3.a(r1, r15, r4)
            q.k0.p r8 = (q.k0.p) r8
            q.z$h r3 = new q.z$h
            java.lang.reflect.Method r4 = r2.f5700b
            java.lang.String r8 = r8.encoding()
            r3.<init>(r4, r5, r1, r8)
            goto L_0x07c1
        L_0x075e:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x076a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.String r2 = "@PartMap keys must be of type String: "
            java.lang.String r2 = i.a.a.a.a.a((java.lang.String) r2, (java.lang.reflect.Type) r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x077a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r13, (java.lang.Object[]) r0)
            throw r0
        L_0x0784:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0790:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x079c:
            boolean r1 = r8 instanceof q.k0.a
            if (r1 == 0) goto L_0x07eb
            r2.a(r5, r14)
            boolean r1 = r2.f5711p
            if (r1 != 0) goto L_0x07df
            boolean r1 = r2.f5712q
            if (r1 != 0) goto L_0x07df
            boolean r1 = r2.f5703h
            if (r1 != 0) goto L_0x07d3
            q.e0 r1 = r2.a     // Catch:{ RuntimeException -> 0x07c3 }
            java.lang.annotation.Annotation[] r3 = r2.c     // Catch:{ RuntimeException -> 0x07c3 }
            q.j r1 = r1.a(r14, r15, r3)     // Catch:{ RuntimeException -> 0x07c3 }
            r3 = 1
            r2.f5703h = r3
            q.z$a r3 = new q.z$a
            java.lang.reflect.Method r4 = r2.f5700b
            r3.<init>(r4, r5, r1)
        L_0x07c1:
            r9 = r3
            goto L_0x07ec
        L_0x07c3:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f5700b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r14
            java.lang.String r3 = "Unable to create @Body converter for %s"
            java.lang.RuntimeException r0 = q.i0.a(r1, r0, r5, r3, r2)
            throw r0
        L_0x07d3:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x07df:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x07eb:
            r9 = 0
        L_0x07ec:
            if (r9 != 0) goto L_0x07ef
            goto L_0x07f3
        L_0x07ef:
            if (r17 != 0) goto L_0x07ff
            r17 = r9
        L_0x07f3:
            int r12 = r21 + 1
            r1 = r24
            r3 = r18
            r4 = r19
            r13 = r22
            goto L_0x016e
        L_0x07ff:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x080b:
            r18 = r3
            r19 = r4
            goto L_0x0816
        L_0x0810:
            r18 = r3
            r19 = r4
            r17 = 0
        L_0x0816:
            if (r17 != 0) goto L_0x0834
            if (r16 == 0) goto L_0x0828
            java.lang.Class r1 = q.i0.b(r14)     // Catch:{ NoClassDefFoundError -> 0x0828 }
            java.lang.Class<n.k.c> r3 = n.k.c.class
            if (r1 != r3) goto L_0x0828
            r1 = 1
            r2.w = r1     // Catch:{ NoClassDefFoundError -> 0x0828 }
            r17 = 0
            goto L_0x0834
        L_0x0828:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (int) r5, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x0834:
            r6[r5] = r17
            int r5 = r5 + 1
            r1 = r24
            r3 = r18
            r4 = r19
            goto L_0x0151
        L_0x0840:
            java.lang.String r1 = r2.r
            if (r1 != 0) goto L_0x085a
            boolean r1 = r2.f5708m
            if (r1 == 0) goto L_0x0849
            goto L_0x085a
        L_0x0849:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f5709n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x085a:
            boolean r1 = r2.f5711p
            if (r1 != 0) goto L_0x0877
            boolean r1 = r2.f5712q
            if (r1 != 0) goto L_0x0877
            boolean r1 = r2.f5710o
            if (r1 != 0) goto L_0x0877
            boolean r1 = r2.f5703h
            if (r1 != 0) goto L_0x086b
            goto L_0x0877
        L_0x086b:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Non-body HTTP method cannot contain @Body."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x0877:
            boolean r1 = r2.f5711p
            if (r1 == 0) goto L_0x088c
            boolean r1 = r2.f5701f
            if (r1 == 0) goto L_0x0880
            goto L_0x088c
        L_0x0880:
            java.lang.reflect.Method r0 = r2.f5700b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Form-encoded method must contain at least one @Field."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x088c:
            r1 = 0
            boolean r3 = r2.f5712q
            if (r3 == 0) goto L_0x08a1
            boolean r3 = r2.f5702g
            if (r3 == 0) goto L_0x0896
            goto L_0x08a1
        L_0x0896:
            java.lang.reflect.Method r0 = r2.f5700b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multipart method must contain at least one @Part."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
            throw r0
        L_0x08a1:
            q.c0 r3 = new q.c0
            r3.<init>(r2)
            java.lang.reflect.Type r1 = r24.getGenericReturnType()
            boolean r2 = q.i0.c(r1)
            if (r2 != 0) goto L_0x09b3
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L_0x09a7
            java.lang.Class<q.d0> r1 = q.d0.class
            boolean r2 = r3.f5699k
            java.lang.annotation.Annotation[] r4 = r24.getAnnotations()
            if (r2 == 0) goto L_0x0901
            java.lang.reflect.Type[] r5 = r24.getGenericParameterTypes()
            int r6 = r5.length
            int r6 = r6 + -1
            r5 = r5[r6]
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r6 = 0
            r5 = r5[r6]
            boolean r8 = r5 instanceof java.lang.reflect.WildcardType
            if (r8 == 0) goto L_0x08dc
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            r5 = r5[r6]
        L_0x08dc:
            java.lang.Class r8 = q.i0.b(r5)
            if (r8 != r1) goto L_0x08ee
            boolean r8 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r8 == 0) goto L_0x08ee
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r5 = q.i0.a((int) r6, (java.lang.reflect.ParameterizedType) r5)
            r8 = 1
            goto L_0x08ef
        L_0x08ee:
            r8 = 0
        L_0x08ef:
            q.i0$b r9 = new q.i0$b
            java.lang.Class<q.d> r10 = q.d.class
            r11 = 1
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r11]
            r11[r6] = r5
            r5 = 0
            r9.<init>(r5, r10, r11)
            java.lang.annotation.Annotation[] r4 = q.h0.a(r4)
            goto L_0x0906
        L_0x0901:
            java.lang.reflect.Type r9 = r24.getGenericReturnType()
            r8 = 0
        L_0x0906:
            q.e r5 = r0.a(r9, r4)     // Catch:{ RuntimeException -> 0x0996 }
            java.lang.reflect.Type r4 = r5.a()
            java.lang.Class<o.j0> r6 = o.j0.class
            if (r4 == r6) goto L_0x0972
            if (r4 == r1) goto L_0x0966
            java.lang.String r1 = r3.c
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0931
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0925
            goto L_0x0931
        L_0x0925:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r6 = r24
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r6, (java.lang.String) r1, (java.lang.Object[]) r0)
            throw r0
        L_0x0931:
            r6 = r24
            java.lang.annotation.Annotation[] r1 = r24.getAnnotations()
            q.j r4 = r0.b(r4, r1)     // Catch:{ RuntimeException -> 0x0957 }
            o.j$a r0 = r0.f5714b
            if (r2 != 0) goto L_0x0945
            q.l$a r1 = new q.l$a
            r1.<init>(r3, r0, r4, r5)
            goto L_0x0956
        L_0x0945:
            if (r8 == 0) goto L_0x094d
            q.l$c r1 = new q.l$c
            r1.<init>(r3, r0, r4, r5)
            goto L_0x0956
        L_0x094d:
            q.l$b r7 = new q.l$b
            r6 = 0
            r1 = r7
            r2 = r3
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0956:
            return r1
        L_0x0957:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r6, (java.lang.Throwable) r1, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        L_0x0966:
            r6 = r24
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r6, (java.lang.String) r1, (java.lang.Object[]) r0)
            throw r0
        L_0x0972:
            r6 = r24
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
            java.lang.Class r1 = q.i0.b(r4)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r6, (java.lang.String) r0, (java.lang.Object[]) r1)
            throw r0
        L_0x0996:
            r0 = move-exception
            r6 = r24
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r9
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r6, (java.lang.Throwable) r1, (java.lang.String) r0, (java.lang.Object[]) r2)
            throw r0
        L_0x09a7:
            r6 = r24
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Service methods cannot return void."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r6, (java.lang.String) r1, (java.lang.Object[]) r0)
            throw r0
        L_0x09b3:
            r6 = r24
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r6, (java.lang.String) r0, (java.lang.Object[]) r2)
            throw r0
        L_0x09c2:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f5700b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.RuntimeException r0 = q.i0.a((java.lang.reflect.Method) r1, (java.lang.String) r2, (java.lang.Object[]) r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f0.a(q.e0, java.lang.reflect.Method):q.f0");
    }
}
