package com.google.gson.internal.bind;

import com.google.gson.Gson;
import i.c.e.q;
import i.c.e.r;
import i.c.e.t.g;
import i.c.e.u.a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements r {
    public final g e;

    public JsonAdapterAnnotationTypeAdapterFactory(g gVar) {
        this.e = gVar;
    }

    public <T> q<T> a(Gson gson, a<T> aVar) {
        i.c.e.s.a aVar2 = (i.c.e.s.a) aVar.getRawType().getAnnotation(i.c.e.s.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.e, gson, aVar, aVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: i.c.e.q<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: i.c.e.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: type inference failed for: r9v3, types: [i.c.e.q<?>, i.c.e.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.c.e.q<?> a(i.c.e.t.g r9, com.google.gson.Gson r10, i.c.e.u.a<?> r11, i.c.e.s.a r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            i.c.e.u.a r0 = i.c.e.u.a.get(r0)
            i.c.e.t.s r9 = r9.a(r0)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof i.c.e.q
            if (r0 == 0) goto L_0x0017
            i.c.e.q r9 = (i.c.e.q) r9
            goto L_0x0071
        L_0x0017:
            boolean r0 = r9 instanceof i.c.e.r
            if (r0 == 0) goto L_0x0022
            i.c.e.r r9 = (i.c.e.r) r9
            i.c.e.q r9 = r9.a(r10, r11)
            goto L_0x0071
        L_0x0022:
            boolean r0 = r9 instanceof i.c.e.o
            if (r0 != 0) goto L_0x0057
            boolean r1 = r9 instanceof i.c.e.i
            if (r1 == 0) goto L_0x002b
            goto L_0x0057
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r12 = i.a.a.a.a.a(r12)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x0057:
            r1 = 0
            if (r0 == 0) goto L_0x005f
            r0 = r9
            i.c.e.o r0 = (i.c.e.o) r0
            r3 = r0
            goto L_0x0060
        L_0x005f:
            r3 = r1
        L_0x0060:
            boolean r0 = r9 instanceof i.c.e.i
            if (r0 == 0) goto L_0x0067
            r1 = r9
            i.c.e.i r1 = (i.c.e.i) r1
        L_0x0067:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0071:
            if (r9 == 0) goto L_0x007f
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x007f
            com.google.gson.TypeAdapter$1 r10 = new com.google.gson.TypeAdapter$1
            r10.<init>(r9)
            r9 = r10
        L_0x007f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a(i.c.e.t.g, com.google.gson.Gson, i.c.e.u.a, i.c.e.s.a):i.c.e.q");
    }
}
