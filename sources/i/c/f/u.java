package i.c.f;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil */
public final class u {
    public static final Unsafe a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f4979b;
    public static final boolean c;
    public static final long d = ((long) a());

    /* compiled from: UnsafeUtil */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0069 A[SYNTHETIC, Splitter:B:9:0x0069] */
    static {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            sun.misc.Unsafe r1 = b()
            a = r1
            r2 = 3
            java.lang.String r3 = "copyMemory"
            java.lang.String r4 = "putByte"
            r5 = 2
            java.lang.String r6 = "getByte"
            java.lang.String r7 = "getLong"
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r10 = "objectFieldOffset"
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0062 }
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            r11[r9] = r12     // Catch:{ all -> 0x0062 }
            r1.getMethod(r10, r11)     // Catch:{ all -> 0x0062 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0062 }
            r10[r9] = r11     // Catch:{ all -> 0x0062 }
            r1.getMethod(r6, r10)     // Catch:{ all -> 0x0062 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x0062 }
            r10[r9] = r0     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0062 }
            r10[r8] = r11     // Catch:{ all -> 0x0062 }
            r1.getMethod(r7, r10)     // Catch:{ all -> 0x0062 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0062 }
            r10[r9] = r11     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0062 }
            r10[r8] = r11     // Catch:{ all -> 0x0062 }
            r1.getMethod(r4, r10)     // Catch:{ all -> 0x0062 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0062 }
            r10[r9] = r11     // Catch:{ all -> 0x0062 }
            r1.getMethod(r7, r10)     // Catch:{ all -> 0x0062 }
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0062 }
            r10[r9] = r11     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0062 }
            r10[r8] = r11     // Catch:{ all -> 0x0062 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0062 }
            r10[r5] = r11     // Catch:{ all -> 0x0062 }
            r1.getMethod(r3, r10)     // Catch:{ all -> 0x0062 }
            r1 = 1
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            f4979b = r1
            sun.misc.Unsafe r1 = a
            if (r1 == 0) goto L_0x00b5
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x00b5 }
            java.lang.String r10 = "arrayBaseOffset"
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x00b5 }
            java.lang.Class<java.lang.Class> r12 = java.lang.Class.class
            r11[r9] = r12     // Catch:{ all -> 0x00b5 }
            r1.getMethod(r10, r11)     // Catch:{ all -> 0x00b5 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x00b5 }
            r10[r9] = r0     // Catch:{ all -> 0x00b5 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b5 }
            r10[r8] = r11     // Catch:{ all -> 0x00b5 }
            r1.getMethod(r6, r10)     // Catch:{ all -> 0x00b5 }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x00b5 }
            r6[r9] = r0     // Catch:{ all -> 0x00b5 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b5 }
            r6[r8] = r10     // Catch:{ all -> 0x00b5 }
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00b5 }
            r6[r5] = r10     // Catch:{ all -> 0x00b5 }
            r1.getMethod(r4, r6)     // Catch:{ all -> 0x00b5 }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x00b5 }
            r4[r9] = r0     // Catch:{ all -> 0x00b5 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b5 }
            r4[r8] = r6     // Catch:{ all -> 0x00b5 }
            r1.getMethod(r7, r4)     // Catch:{ all -> 0x00b5 }
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x00b5 }
            r4[r9] = r0     // Catch:{ all -> 0x00b5 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b5 }
            r4[r8] = r6     // Catch:{ all -> 0x00b5 }
            r4[r5] = r0     // Catch:{ all -> 0x00b5 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b5 }
            r4[r2] = r0     // Catch:{ all -> 0x00b5 }
            r0 = 4
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b5 }
            r4[r0] = r2     // Catch:{ all -> 0x00b5 }
            r1.getMethod(r3, r4)     // Catch:{ all -> 0x00b5 }
            r9 = 1
        L_0x00b5:
            c = r9
            int r0 = a()
            long r0 = (long) r0
            d = r0
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ all -> 0x00ca }
            r0.setAccessible(r8)     // Catch:{ all -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.f.u.<clinit>():void");
    }

    public static byte a(byte[] bArr, long j2) {
        return a.getByte(bArr, j2);
    }

    public static long b(byte[] bArr, long j2) {
        return a.getLong(bArr, j2);
    }

    public static void a(byte[] bArr, long j2, byte b2) {
        a.putByte(bArr, j2, b2);
    }

    public static Unsafe b() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int a() {
        if (c) {
            return a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    public static long a(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = a) == null) {
            return -1;
        }
        return unsafe.objectFieldOffset(field);
    }
}
