package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import i.c.e.d;
import i.c.e.q;
import i.c.e.r;
import i.c.e.s.c;
import i.c.e.t.g;
import i.c.e.t.s;
import i.c.e.t.z.b;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements r {
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final d f735f;

    /* renamed from: g  reason: collision with root package name */
    public final Excluder f736g;

    /* renamed from: h  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f737h;

    /* renamed from: i  reason: collision with root package name */
    public final b f738i = b.a;

    public static abstract class a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f740b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.f740b = z;
            this.c = z2;
        }
    }

    public ReflectiveTypeAdapterFactory(g gVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.e = gVar;
        this.f735f = dVar;
        this.f736g = excluder;
        this.f737h = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public boolean a(Field field, boolean z) {
        boolean z2;
        Excluder excluder = this.f736g;
        Class<?> type = field.getType();
        if (!(excluder.a(type) || excluder.a(type, z))) {
            if ((excluder.f723f & field.getModifiers()) == 0 && ((excluder.e == -1.0d || excluder.a((c) field.getAnnotation(c.class), (i.c.e.s.d) field.getAnnotation(i.c.e.s.d.class))) && !field.isSynthetic() && ((excluder.f724g || !excluder.c(field.getType())) && !excluder.b(field.getType())))) {
                List<i.c.e.a> list = z ? excluder.f725h : excluder.f726i;
                if (!list.isEmpty()) {
                    i.c.e.b bVar = new i.c.e.b(field);
                    Iterator<i.c.e.a> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().a(bVar)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    public static final class Adapter<T> extends q<T> {
        public final s<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, a> f739b;

        public Adapter(s<T> sVar, Map<String, a> map) {
            this.a = sVar;
            this.f739b = map;
        }

        public T a(i.c.e.v.a aVar) {
            if (aVar.C() == i.c.e.v.b.NULL) {
                aVar.z();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.f();
                while (aVar.s()) {
                    a aVar2 = this.f739b.get(aVar.y());
                    if (aVar2 != null) {
                        if (aVar2.c) {
                            i.c.e.t.y.c cVar = (i.c.e.t.y.c) aVar2;
                            Object a3 = cVar.f4893f.a(aVar);
                            if (a3 != null || !cVar.f4896i) {
                                cVar.d.set(a2, a3);
                            }
                        }
                    }
                    aVar.F();
                }
                aVar.o();
                return a2;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public void a(i.c.e.v.c cVar, T t) {
            q qVar;
            if (t == null) {
                cVar.q();
                return;
            }
            cVar.h();
            try {
                for (a next : this.f739b.values()) {
                    i.c.e.t.y.c cVar2 = (i.c.e.t.y.c) next;
                    boolean z = false;
                    if (cVar2.f740b) {
                        if (cVar2.d.get(t) != t) {
                            z = true;
                        }
                    }
                    if (z) {
                        cVar.b(next.a);
                        i.c.e.t.y.c cVar3 = (i.c.e.t.y.c) next;
                        Object obj = cVar3.d.get(t);
                        if (cVar3.e) {
                            qVar = cVar3.f4893f;
                        } else {
                            qVar = new TypeAdapterRuntimeTypeWrapper(cVar3.f4894g, cVar3.f4893f, cVar3.f4895h.getType());
                        }
                        qVar.a(cVar, obj);
                    }
                }
                cVar.m();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0189 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> i.c.e.q<T> a(com.google.gson.Gson r36, i.c.e.u.a<T> r37) {
        /*
            r35 = this;
            r11 = r35
            r12 = r36
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class r0 = r37.getRawType()
            boolean r1 = r13.isAssignableFrom(r0)
            r14 = 0
            if (r1 != 0) goto L_0x0012
            return r14
        L_0x0012:
            i.c.e.t.g r1 = r11.e
            r2 = r37
            i.c.e.t.s r15 = r1.a(r2)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r1 = r0.isInterface()
            if (r1 == 0) goto L_0x002e
        L_0x0027:
            r14 = r9
            r34 = r10
            r22 = r15
            goto L_0x01e4
        L_0x002e:
            java.lang.reflect.Type r8 = r37.getType()
            r7 = r0
            r16 = r2
        L_0x0035:
            if (r7 == r13) goto L_0x0027
            java.lang.reflect.Field[] r6 = r7.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x003e:
            if (r3 >= r5) goto L_0x01bd
            r2 = r6[r3]
            r1 = 1
            boolean r0 = r11.a((java.lang.reflect.Field) r2, (boolean) r1)
            boolean r17 = r11.a((java.lang.reflect.Field) r2, (boolean) r4)
            if (r0 != 0) goto L_0x0063
            if (r17 != 0) goto L_0x0063
            r20 = r3
            r32 = r5
            r33 = r6
            r37 = r7
            r12 = r8
            r14 = r9
            r34 = r10
            r19 = r13
            r22 = r15
            r31 = 0
            goto L_0x0189
        L_0x0063:
            i.c.e.t.z.b r4 = r11.f738i
            r4.a(r2)
            java.lang.reflect.Type r4 = r16.getType()
            java.lang.reflect.Type r14 = r2.getGenericType()
            java.lang.reflect.Type r14 = i.c.e.t.a.a((java.lang.reflect.Type) r4, (java.lang.Class<?>) r7, (java.lang.reflect.Type) r14)
            java.lang.Class<i.c.e.s.b> r4 = i.c.e.s.b.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            i.c.e.s.b r4 = (i.c.e.s.b) r4
            if (r4 != 0) goto L_0x008b
            i.c.e.d r4 = r11.f735f
            java.lang.String r4 = r4.a(r2)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r19 = r0
            goto L_0x009c
        L_0x008b:
            java.lang.String r1 = r4.value()
            java.lang.String[] r4 = r4.alternate()
            r19 = r0
            int r0 = r4.length
            if (r0 != 0) goto L_0x00a1
            java.util.List r4 = java.util.Collections.singletonList(r1)
        L_0x009c:
            r20 = r3
            r18 = 1
            goto L_0x00c1
        L_0x00a1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r20 = r3
            int r3 = r4.length
            r18 = 1
            int r3 = r3 + 1
            r0.<init>(r3)
            r0.add(r1)
            int r1 = r4.length
            r3 = 0
        L_0x00b2:
            if (r3 >= r1) goto L_0x00c0
            r21 = r1
            r1 = r4[r3]
            r0.add(r1)
            int r3 = r3 + 1
            r1 = r21
            goto L_0x00b2
        L_0x00c0:
            r4 = r0
        L_0x00c1:
            int r3 = r4.size()
            r0 = r19
            r1 = 0
            r19 = r13
            r13 = 0
        L_0x00cb:
            if (r1 >= r3) goto L_0x0179
            java.lang.Object r21 = r4.get(r1)
            r22 = r15
            r15 = r21
            java.lang.String r15 = (java.lang.String) r15
            if (r1 == 0) goto L_0x00dc
            r21 = 0
            goto L_0x00de
        L_0x00dc:
            r21 = r0
        L_0x00de:
            i.c.e.u.a r0 = i.c.e.u.a.get((java.lang.reflect.Type) r14)
            r23 = r1
            java.lang.Class r1 = r0.getRawType()
            r24 = r3
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x00f7
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L_0x00f7
            r25 = 1
            goto L_0x00f9
        L_0x00f7:
            r25 = 0
        L_0x00f9:
            java.lang.Class<i.c.e.s.a> r1 = i.c.e.s.a.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            i.c.e.s.a r1 = (i.c.e.s.a) r1
            if (r1 == 0) goto L_0x010e
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r3 = r11.f737h
            r26 = r2
            i.c.e.t.g r2 = r11.e
            i.c.e.q r1 = r3.a(r2, r12, r0, r1)
            goto L_0x0111
        L_0x010e:
            r26 = r2
            r1 = 0
        L_0x0111:
            if (r1 == 0) goto L_0x0116
            r27 = 1
            goto L_0x0118
        L_0x0116:
            r27 = 0
        L_0x0118:
            if (r1 != 0) goto L_0x011e
            i.c.e.q r1 = r12.a(r0)
        L_0x011e:
            r28 = r1
            i.c.e.t.y.c r3 = new i.c.e.t.y.c
            r29 = r0
            r0 = r3
            r18 = r23
            r23 = 1
            r1 = r35
            r2 = r15
            r11 = r3
            r3 = r21
            r30 = r4
            r31 = 0
            r4 = r17
            r32 = r5
            r5 = r26
            r33 = r6
            r6 = r27
            r37 = r7
            r7 = r28
            r12 = r8
            r8 = r36
            r27 = r14
            r14 = r9
            r9 = r29
            r34 = r10
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r14.put(r15, r11)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a) r0
            if (r13 != 0) goto L_0x0159
            r13 = r0
        L_0x0159:
            int r1 = r18 + 1
            r11 = r35
            r7 = r37
            r8 = r12
            r9 = r14
            r0 = r21
            r15 = r22
            r3 = r24
            r2 = r26
            r14 = r27
            r4 = r30
            r5 = r32
            r6 = r33
            r10 = r34
            r18 = 1
            r12 = r36
            goto L_0x00cb
        L_0x0179:
            r32 = r5
            r33 = r6
            r37 = r7
            r12 = r8
            r14 = r9
            r34 = r10
            r22 = r15
            r31 = 0
            if (r13 != 0) goto L_0x01a1
        L_0x0189:
            int r3 = r20 + 1
            r11 = r35
            r7 = r37
            r8 = r12
            r9 = r14
            r13 = r19
            r15 = r22
            r5 = r32
            r6 = r33
            r10 = r34
            r4 = 0
            r14 = 0
            r12 = r36
            goto L_0x003e
        L_0x01a1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r13.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            r37 = r7
            r12 = r8
            r14 = r9
            r34 = r10
            r19 = r13
            r22 = r15
            java.lang.reflect.Type r0 = r16.getType()
            java.lang.reflect.Type r1 = r37.getGenericSuperclass()
            r2 = r37
            java.lang.reflect.Type r0 = i.c.e.t.a.a((java.lang.reflect.Type) r0, (java.lang.Class<?>) r2, (java.lang.reflect.Type) r1)
            i.c.e.u.a r16 = i.c.e.u.a.get((java.lang.reflect.Type) r0)
            java.lang.Class r7 = r16.getRawType()
            r11 = r35
            r14 = 0
            r12 = r36
            goto L_0x0035
        L_0x01e4:
            r0 = r22
            r1 = r34
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(com.google.gson.Gson, i.c.e.u.a):i.c.e.q");
    }
}
