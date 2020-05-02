package f.a.a;

import i.c.d.p.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.m.c.f;
import n.m.c.g;
import n.m.c.k;

/* compiled from: ExceptionsConstuctor.kt */
public final class a {
    public static final int a = a(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantReadWriteLock f785b = new ReentrantReadWriteLock();
    public static final WeakHashMap<Class<? extends Throwable>, n.m.b.b<Throwable, Throwable>> c = new WeakHashMap<>();

    /* renamed from: f.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class C0017a extends g implements n.m.b.b {

        /* renamed from: f  reason: collision with root package name */
        public static final C0017a f786f = new C0017a(0);

        /* renamed from: g  reason: collision with root package name */
        public static final C0017a f787g = new C0017a(1);
        public final /* synthetic */ int e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0017a(int i2) {
            super(1);
            this.e = i2;
        }

        public final Object a(Object obj) {
            int i2 = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw null;
                } else if (((Throwable) obj) != null) {
                    return null;
                } else {
                    f.a("it");
                    throw null;
                }
            } else if (((Throwable) obj) != null) {
                return null;
            } else {
                f.a("it");
                throw null;
            }
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            f.a((Object) constructor, "it");
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            f.a((Object) constructor2, "it");
            Integer valueOf2 = Integer.valueOf(constructor2.getParameterTypes().length);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final <E extends java.lang.Throwable> E a(E r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0181
            boolean r1 = r9 instanceof f.a.q
            if (r1 == 0) goto L_0x001c
            f.a.q r9 = (f.a.q) r9     // Catch:{ all -> 0x000e }
            java.lang.Throwable r9 = r9.a()     // Catch:{ all -> 0x000e }
            goto L_0x0013
        L_0x000e:
            r9 = move-exception
            java.lang.Object r9 = i.c.d.p.e.a((java.lang.Throwable) r9)
        L_0x0013:
            boolean r1 = r9 instanceof n.e.a
            if (r1 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = r9
        L_0x0019:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f785b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, n.m.b.b<java.lang.Throwable, java.lang.Throwable>> r2 = c     // Catch:{ all -> 0x017c }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x017c }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x017c }
            n.m.b.b r2 = (n.m.b.b) r2     // Catch:{ all -> 0x017c }
            r1.unlock()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r9 = r2.a(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x003d:
            int r1 = a
            java.lang.Class r2 = r9.getClass()
            r3 = 0
            int r2 = a(r2, r3)
            if (r1 == r2) goto L_0x0090
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f785b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r4 = r1.getWriteHoldCount()
            if (r4 != 0) goto L_0x005b
            int r4 = r1.getReadHoldCount()
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            r5 = 0
        L_0x005d:
            if (r5 >= r4) goto L_0x0065
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x005d
        L_0x0065:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, n.m.b.b<java.lang.Throwable, java.lang.Throwable>> r5 = c     // Catch:{ all -> 0x0083 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0083 }
            f.a.a.a$a r6 = f.a.a.a.C0017a.f786f     // Catch:{ all -> 0x0083 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0083 }
        L_0x0077:
            if (r3 >= r4) goto L_0x007f
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0077
        L_0x007f:
            r1.unlock()
            return r0
        L_0x0083:
            r9 = move-exception
        L_0x0084:
            if (r3 >= r4) goto L_0x008c
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0084
        L_0x008c:
            r1.unlock()
            throw r9
        L_0x0090:
            java.lang.Class r1 = r9.getClass()
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()
            java.lang.String r2 = "exception.javaClass.constructors"
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r2)
            f.a.a.a$b r2 = new f.a.a.a$b
            r2.<init>()
            int r4 = r1.length
            r5 = 1
            if (r4 != 0) goto L_0x00a8
            r4 = 1
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            if (r4 == 0) goto L_0x00ac
            goto L_0x00bc
        L_0x00ac:
            int r4 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r4)
            int r4 = r1.length
            if (r4 <= r5) goto L_0x00bc
            java.util.Arrays.sort(r1, r2)
        L_0x00bc:
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r2 = "ArraysUtilJVM.asList(this)"
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
        L_0x00ca:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0129
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.String r4 = "constructor"
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r4)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r6 = r2.getParameterTypes()
            int r7 = r6.length
            if (r7 == 0) goto L_0x0120
            r8 = 2
            if (r7 == r5) goto L_0x0102
            if (r7 == r8) goto L_0x00ea
            goto L_0x011e
        L_0x00ea:
            r7 = r6[r3]
            boolean r4 = n.m.c.f.a((java.lang.Object) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x011e
            r4 = r6[r5]
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            boolean r4 = n.m.c.f.a((java.lang.Object) r4, (java.lang.Object) r6)
            if (r4 == 0) goto L_0x011e
            e r4 = new e
            r4.<init>(r3, r2)
            goto L_0x0126
        L_0x0102:
            r6 = r6[r3]
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            boolean r7 = n.m.c.f.a((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0112
            e r4 = new e
            r4.<init>(r5, r2)
            goto L_0x0126
        L_0x0112:
            boolean r4 = n.m.c.f.a((java.lang.Object) r6, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x011e
            e r4 = new e
            r4.<init>(r8, r2)
            goto L_0x0126
        L_0x011e:
            r2 = r0
            goto L_0x0127
        L_0x0120:
            e r4 = new e
            r6 = 3
            r4.<init>(r6, r2)
        L_0x0126:
            r2 = r4
        L_0x0127:
            if (r2 == 0) goto L_0x00ca
        L_0x0129:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f785b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r5 = r1.getWriteHoldCount()
            if (r5 != 0) goto L_0x013a
            int r5 = r1.getReadHoldCount()
            goto L_0x013b
        L_0x013a:
            r5 = 0
        L_0x013b:
            r6 = 0
        L_0x013c:
            if (r6 >= r5) goto L_0x0144
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x013c
        L_0x0144:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, n.m.b.b<java.lang.Throwable, java.lang.Throwable>> r6 = c     // Catch:{ all -> 0x016f }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x016f }
            if (r2 == 0) goto L_0x0155
            r8 = r2
            goto L_0x0157
        L_0x0155:
            f.a.a.a$a r8 = f.a.a.a.C0017a.f787g     // Catch:{ all -> 0x016f }
        L_0x0157:
            r6.put(r7, r8)     // Catch:{ all -> 0x016f }
        L_0x015a:
            if (r3 >= r5) goto L_0x0162
            r4.lock()
            int r3 = r3 + 1
            goto L_0x015a
        L_0x0162:
            r1.unlock()
            if (r2 == 0) goto L_0x016e
            java.lang.Object r9 = r2.a(r9)
            r0 = r9
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x016e:
            return r0
        L_0x016f:
            r9 = move-exception
        L_0x0170:
            if (r3 >= r5) goto L_0x0178
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0170
        L_0x0178:
            r1.unlock()
            throw r9
        L_0x017c:
            r9 = move-exception
            r1.unlock()
            throw r9
        L_0x0181:
            java.lang.String r9 = "exception"
            n.m.c.f.a((java.lang.String) r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.a(java.lang.Throwable):java.lang.Throwable");
    }

    public static final int a(Class<?> cls, int i2) {
        Integer num;
        if (cls != null) {
            k.a((Class) cls);
            int i3 = 0;
            Class<? super Object> cls2 = cls;
            while (true) {
                try {
                    Field[] declaredFields = cls2.getDeclaredFields();
                    f.a((Object) declaredFields, "declaredFields");
                    int i4 = 0;
                    for (Field field : declaredFields) {
                        f.a((Object) field, "it");
                        if (!Modifier.isStatic(field.getModifiers())) {
                            i4++;
                        }
                    }
                    i3 += i4;
                    Class<? super Object> superclass = cls2.getSuperclass();
                    if (superclass == null) {
                        break;
                    }
                    cls2 = superclass;
                } catch (Throwable th) {
                    num = e.a(th);
                }
            }
            num = Integer.valueOf(i3);
            n.e.a(num);
            Integer valueOf = Integer.valueOf(i2);
            if (n.e.c(num)) {
                num = valueOf;
            }
            return ((Number) num).intValue();
        }
        f.a("$this$kotlin");
        throw null;
    }
}
