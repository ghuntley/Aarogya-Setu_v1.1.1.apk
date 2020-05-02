package i.c.a.b.g.g;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class l6 {
    public static final Logger a = Logger.getLogger(l6.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f3346b = a();
    public static final Class<?> c = r2.a;
    public static final boolean d = d(Long.TYPE);
    public static final boolean e = d(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    public static final d f3347f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f3348g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f3349h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f3350i = ((long) b(byte[].class));

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f3351j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }

        public final boolean b(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        public final float c(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        public final double d(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }

        public final void a(Object obj, long j2, byte b2) {
            this.a.putByte(obj, j2, b2);
        }

        public final void a(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        public final void a(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }

        public final void a(Object obj, long j2, double d) {
            this.a.putDouble(obj, j2, d);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static abstract class d {
        public Unsafe a;

        public d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j2);

        public abstract void a(Object obj, long j2, byte b2);

        public abstract void a(Object obj, long j2, double d);

        public abstract void a(Object obj, long j2, float f2);

        public final void a(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public abstract void a(Object obj, long j2, boolean z);

        public abstract boolean b(Object obj, long j2);

        public abstract float c(Object obj, long j2);

        public abstract double d(Object obj, long j2);

        public final int e(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long f(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }

        public final void a(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016a A[SYNTHETIC, Splitter:B:41:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02e9  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<i.c.a.b.g.g.l6> r0 = i.c.a.b.g.g.l6.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            a = r0
            sun.misc.Unsafe r0 = a()
            f3346b = r0
            java.lang.Class<?> r0 = i.c.a.b.g.g.r2.a
            c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = d(r0)
            d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = d(r0)
            e = r0
            sun.misc.Unsafe r0 = f3346b
            r8 = 0
            if (r0 != 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            boolean r0 = i.c.a.b.g.g.r2.a()
            if (r0 == 0) goto L_0x0058
            boolean r0 = d
            if (r0 == 0) goto L_0x004c
            i.c.a.b.g.g.l6$c r8 = new i.c.a.b.g.g.l6$c
            sun.misc.Unsafe r0 = f3346b
            r8.<init>(r0)
            goto L_0x005f
        L_0x004c:
            boolean r0 = e
            if (r0 == 0) goto L_0x005f
            i.c.a.b.g.g.l6$a r8 = new i.c.a.b.g.g.l6$a
            sun.misc.Unsafe r0 = f3346b
            r8.<init>(r0)
            goto L_0x005f
        L_0x0058:
            i.c.a.b.g.g.l6$b r8 = new i.c.a.b.g.g.l6$b
            sun.misc.Unsafe r0 = f3346b
            r8.<init>(r0)
        L_0x005f:
            f3347f = r8
            java.lang.String r0 = "copyMemory"
            sun.misc.Unsafe r8 = f3346b
            java.lang.String r10 = "putLong"
            java.lang.String r11 = "putInt"
            java.lang.String r12 = "getInt"
            java.lang.String r13 = "putByte"
            java.lang.String r14 = "getByte"
            java.lang.String r9 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r15 = "platform method missing - proto runtime falling back to safer methods: "
            r16 = r1
            java.lang.String r1 = "objectFieldOffset"
            r17 = r2
            java.lang.String r2 = "getLong"
            r18 = r3
            r3 = 1
            r19 = 0
            if (r8 != 0) goto L_0x0089
            r20 = r4
        L_0x0084:
            r22 = r5
        L_0x0086:
            r0 = 0
            goto L_0x015f
        L_0x0089:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x0136 }
            r20 = r4
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0134 }
            java.lang.Class<java.lang.reflect.Field> r21 = java.lang.reflect.Field.class
            r4[r19] = r21     // Catch:{ all -> 0x0134 }
            r8.getMethod(r1, r4)     // Catch:{ all -> 0x0134 }
            r4 = 2
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0134 }
            r3[r19] = r7     // Catch:{ all -> 0x0134 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0134 }
            r21 = 1
            r3[r21] = r4     // Catch:{ all -> 0x0134 }
            r8.getMethod(r2, r3)     // Catch:{ all -> 0x0134 }
            java.lang.reflect.Field r3 = b()     // Catch:{ all -> 0x0134 }
            if (r3 != 0) goto L_0x00ad
            goto L_0x0084
        L_0x00ad:
            boolean r3 = i.c.a.b.g.g.r2.a()     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00b8
            r22 = r5
        L_0x00b5:
            r0 = 1
            goto L_0x015f
        L_0x00b8:
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0134 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0134 }
            r4[r19] = r3     // Catch:{ all -> 0x0134 }
            r8.getMethod(r14, r4)     // Catch:{ all -> 0x0134 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0134 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0134 }
            r4[r19] = r3     // Catch:{ all -> 0x0134 }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0134 }
            r22 = r5
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0132 }
            r8.getMethod(r13, r4)     // Catch:{ all -> 0x0132 }
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ all -> 0x0132 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r3[r19] = r4     // Catch:{ all -> 0x0132 }
            r8.getMethod(r12, r3)     // Catch:{ all -> 0x0132 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0132 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r4[r19] = r3     // Catch:{ all -> 0x0132 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0132 }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0132 }
            r8.getMethod(r11, r4)     // Catch:{ all -> 0x0132 }
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ all -> 0x0132 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r3[r19] = r4     // Catch:{ all -> 0x0132 }
            r8.getMethod(r2, r3)     // Catch:{ all -> 0x0132 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0132 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r4[r19] = r3     // Catch:{ all -> 0x0132 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0132 }
            r8.getMethod(r10, r4)     // Catch:{ all -> 0x0132 }
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0132 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r4[r19] = r3     // Catch:{ all -> 0x0132 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0132 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r5 = 2
            r4[r5] = r3     // Catch:{ all -> 0x0132 }
            r8.getMethod(r0, r4)     // Catch:{ all -> 0x0132 }
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0132 }
            r3[r19] = r7     // Catch:{ all -> 0x0132 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x0132 }
            r4 = 2
            r3[r4] = r7     // Catch:{ all -> 0x0132 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r5 = 3
            r3[r5] = r4     // Catch:{ all -> 0x0132 }
            r4 = 4
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ all -> 0x0132 }
            r3[r4] = r5     // Catch:{ all -> 0x0132 }
            r8.getMethod(r0, r3)     // Catch:{ all -> 0x0132 }
            goto L_0x00b5
        L_0x0132:
            r0 = move-exception
            goto L_0x013b
        L_0x0134:
            r0 = move-exception
            goto L_0x0139
        L_0x0136:
            r0 = move-exception
            r20 = r4
        L_0x0139:
            r22 = r5
        L_0x013b:
            java.util.logging.Logger r3 = a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            int r5 = r5 + 71
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            r8.append(r15)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r5 = "supportsUnsafeByteBufferOperations"
            r3.logp(r4, r9, r5, r0)
            goto L_0x0086
        L_0x015f:
            f3348g = r0
            sun.misc.Unsafe r0 = f3346b
            if (r0 != 0) goto L_0x016a
            r0 = 0
        L_0x0166:
            r21 = 1
            goto L_0x02a0
        L_0x016a:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x027a }
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x027a }
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            r4[r19] = r5     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r4)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x027a }
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r19] = r5     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r4)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x027a }
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r4[r19] = r3     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r4)     // Catch:{ all -> 0x027a }
            r1 = 2
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x027a }
            r3[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r3[r4] = r1     // Catch:{ all -> 0x027a }
            r0.getMethod(r12, r3)     // Catch:{ all -> 0x027a }
            r1 = 3
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x027a }
            r3[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r3[r4] = r1     // Catch:{ all -> 0x027a }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x027a }
            r4 = 2
            r3[r4] = r1     // Catch:{ all -> 0x027a }
            r0.getMethod(r11, r3)     // Catch:{ all -> 0x027a }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x027a }
            r1[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r1[r4] = r3     // Catch:{ all -> 0x027a }
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x027a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x027a }
            r2[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r2[r4] = r1     // Catch:{ all -> 0x027a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x027a }
            r0.getMethod(r10, r2)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x027a }
            r2[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "putObject"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x027a }
            r3[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x027a }
            r2 = 2
            r3[r2] = r7     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x027a }
            boolean r1 = i.c.a.b.g.g.r2.a()     // Catch:{ all -> 0x027a }
            if (r1 == 0) goto L_0x01f2
            r0 = 1
            goto L_0x0166
        L_0x01f2:
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x027a }
            r1[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x027a }
            r0.getMethod(r14, r1)     // Catch:{ all -> 0x027a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x027a }
            r2[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r2[r3] = r1     // Catch:{ all -> 0x027a }
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ all -> 0x027a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x027a }
            r0.getMethod(r13, r2)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x027a }
            r2[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "putBoolean"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x027a }
            r3[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x027a }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x027a }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x027a }
            r2[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "putFloat"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x027a }
            r3[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x027a }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x027a }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x027a }
            r2[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027a }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x027a }
            java.lang.String r1 = "putDouble"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x027a }
            r2[r19] = r7     // Catch:{ all -> 0x027a }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x027a }
            r21 = 1
            r2[r21] = r3     // Catch:{ all -> 0x0278 }
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ all -> 0x0278 }
            r4 = 2
            r2[r4] = r3     // Catch:{ all -> 0x0278 }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0278 }
            r0 = 1
            goto L_0x02a0
        L_0x0278:
            r0 = move-exception
            goto L_0x027d
        L_0x027a:
            r0 = move-exception
            r21 = 1
        L_0x027d:
            java.util.logging.Logger r1 = a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 71
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r15)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r1.logp(r2, r9, r3, r0)
            r0 = 0
        L_0x02a0:
            f3349h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = b(r0)
            long r0 = (long) r0
            f3350i = r0
            b(r6)
            c(r6)
            b(r22)
            c(r22)
            b(r20)
            c(r20)
            b(r18)
            c(r18)
            b(r17)
            c(r17)
            b(r16)
            c(r16)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x02df
            i.c.a.b.g.g.l6$d r1 = f3347f
            if (r1 != 0) goto L_0x02da
            goto L_0x02df
        L_0x02da:
            sun.misc.Unsafe r1 = r1.a
            r1.objectFieldOffset(r0)
        L_0x02df:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x02e9
            r3 = 1
            goto L_0x02ea
        L_0x02e9:
            r3 = 0
        L_0x02ea:
            f3351j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.l6.<clinit>():void");
    }

    public static <T> T a(Class<T> cls) {
        try {
            return f3346b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class<?> cls) {
        if (f3349h) {
            return f3347f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int c(Class<?> cls) {
        if (f3349h) {
            return f3347f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static float d(Object obj, long j2) {
        return f3347f.c(obj, j2);
    }

    public static double e(Object obj, long j2) {
        return f3347f.d(obj, j2);
    }

    public static Object f(Object obj, long j2) {
        return f3347f.a.getObject(obj, j2);
    }

    public static byte g(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    public static byte h(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    public static boolean d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!r2.a()) {
            return false;
        }
        try {
            Class<?> cls3 = c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j2) {
            if (l6.f3351j) {
                return l6.g(obj, j2);
            }
            return l6.h(obj, j2);
        }

        public final boolean b(Object obj, long j2) {
            if (l6.f3351j) {
                if (l6.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            } else if (l6.h(obj, j2) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float c(Object obj, long j2) {
            return Float.intBitsToFloat(e(obj, j2));
        }

        public final double d(Object obj, long j2) {
            return Double.longBitsToDouble(f(obj, j2));
        }

        public final void a(Object obj, long j2, byte b2) {
            if (l6.f3351j) {
                l6.a(obj, j2, b2);
            } else {
                l6.b(obj, j2, b2);
            }
        }

        public final void a(Object obj, long j2, boolean z) {
            if (l6.f3351j) {
                l6.a(obj, j2, z ? (byte) 1 : 0);
            } else {
                l6.b(obj, j2, z ? (byte) 1 : 0);
            }
        }

        public final void a(Object obj, long j2, float f2) {
            a(obj, j2, Float.floatToIntBits(f2));
        }

        public final void a(Object obj, long j2, double d) {
            a(obj, j2, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j2) {
            if (l6.f3351j) {
                return l6.g(obj, j2);
            }
            return l6.h(obj, j2);
        }

        public final boolean b(Object obj, long j2) {
            if (l6.f3351j) {
                if (l6.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            } else if (l6.h(obj, j2) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float c(Object obj, long j2) {
            return Float.intBitsToFloat(e(obj, j2));
        }

        public final double d(Object obj, long j2) {
            return Double.longBitsToDouble(f(obj, j2));
        }

        public final void a(Object obj, long j2, byte b2) {
            if (l6.f3351j) {
                l6.a(obj, j2, b2);
            } else {
                l6.b(obj, j2, b2);
            }
        }

        public final void a(Object obj, long j2, boolean z) {
            if (l6.f3351j) {
                l6.a(obj, j2, z ? (byte) 1 : 0);
            } else {
                l6.b(obj, j2, z ? (byte) 1 : 0);
            }
        }

        public final void a(Object obj, long j2, float f2) {
            a(obj, j2, Float.floatToIntBits(f2));
        }

        public final void a(Object obj, long j2, double d) {
            a(obj, j2, Double.doubleToLongBits(d));
        }
    }

    public static int a(Object obj, long j2) {
        return f3347f.e(obj, j2);
    }

    public static long b(Object obj, long j2) {
        return f3347f.f(obj, j2);
    }

    public static boolean c(Object obj, long j2) {
        return f3347f.b(obj, j2);
    }

    public static void a(Object obj, long j2, long j3) {
        f3347f.a(obj, j2, j3);
    }

    public static Field b() {
        Field field;
        Field field2;
        if (r2.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void a(Object obj, long j2, double d2) {
        f3347f.a(obj, j2, d2);
    }

    public static void a(Object obj, long j2, Object obj2) {
        f3347f.a.putObject(obj, j2, obj2);
    }

    public static byte a(byte[] bArr, long j2) {
        return f3347f.a(bArr, f3350i + j2);
    }

    public static void a(byte[] bArr, long j2, byte b2) {
        f3347f.a((Object) bArr, f3350i + j2, b2);
    }

    public static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        d dVar = f3347f;
        dVar.a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & (~(255 << i2))));
    }

    public static void a(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int a2 = a(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        d dVar = f3347f;
        dVar.a(obj, j3, ((255 & b2) << i2) | (a2 & (~(255 << i2))));
    }
}
