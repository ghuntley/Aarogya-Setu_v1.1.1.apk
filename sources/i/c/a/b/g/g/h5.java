package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import com.google.android.gms.internal.measurement.zzfo;
import i.a.a.a.a;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.w3;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class h5<T> implements t5<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f3299q = new int[0];
    public static final Unsafe r = l6.a();
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3300b;
    public final int c;
    public final int d;
    public final f5 e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3301f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3302g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3303h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f3304i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3305j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3306k;

    /* renamed from: l  reason: collision with root package name */
    public final l5 f3307l;

    /* renamed from: m  reason: collision with root package name */
    public final o4 f3308m;

    /* renamed from: n  reason: collision with root package name */
    public final g6<?, ?> f3309n;

    /* renamed from: o  reason: collision with root package name */
    public final k3<?> f3310o;

    /* renamed from: p  reason: collision with root package name */
    public final y4 f3311p;

    public h5(int[] iArr, Object[] objArr, int i2, int i3, f5 f5Var, boolean z, int[] iArr2, int i4, int i5, l5 l5Var, o4 o4Var, g6 g6Var, k3 k3Var, y4 y4Var) {
        this.a = iArr;
        this.f3300b = objArr;
        this.c = i2;
        this.d = i3;
        boolean z2 = f5Var instanceof w3;
        this.f3302g = z;
        this.f3301f = k3Var != null && (f5Var instanceof w3.d);
        this.f3303h = false;
        this.f3304i = iArr2;
        this.f3305j = i4;
        this.f3306k = i5;
        this.f3307l = l5Var;
        this.f3308m = o4Var;
        this.f3309n = g6Var;
        this.f3310o = k3Var;
        this.e = f5Var;
        this.f3311p = y4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> i.c.a.b.g.g.h5<T> a(java.lang.Class<T> r33, i.c.a.b.g.g.d5 r34, i.c.a.b.g.g.l5 r35, i.c.a.b.g.g.o4 r36, i.c.a.b.g.g.g6<?, ?> r37, i.c.a.b.g.g.k3<?> r38, i.c.a.b.g.g.y4 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof i.c.a.b.g.g.r5
            if (r1 == 0) goto L_0x0420
            i.c.a.b.g.g.r5 r0 = (i.c.a.b.g.g.r5) r0
            int r1 = r0.d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 2
        L_0x0012:
            r4 = 0
            if (r1 != r3) goto L_0x0017
            r11 = 1
            goto L_0x0018
        L_0x0017:
            r11 = 0
        L_0x0018:
            java.lang.String r1 = r0.f3423b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = 1
            r9 = 13
        L_0x002c:
            int r10 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x003c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x002c
        L_0x003c:
            int r8 = r8 << r9
            r5 = r5 | r8
            goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x004c:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x005c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x004c
        L_0x005c:
            int r8 = r8 << r10
            r9 = r9 | r8
            r8 = r12
        L_0x005f:
            if (r9 != 0) goto L_0x006c
            int[] r9 = f3299q
            r12 = r9
            r6 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x0188
        L_0x006c:
            int r9 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x008b
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0078:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x0088
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0078
        L_0x0088:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r12
        L_0x008b:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x00aa
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0097:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00a7
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x0097
        L_0x00a7:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00aa:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00c9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b6:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00c6
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00b6
        L_0x00c6:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00c9:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00e8
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00d5:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x00e5
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00d5
        L_0x00e5:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00e8:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x0109
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00f4:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x0105
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00f4
        L_0x0105:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0109:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x012c
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0115:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0127
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0115
        L_0x0127:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x012c:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0152
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x013a:
            int r17 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L_0x014c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x013a
        L_0x014c:
            int r4 = r4 << r16
            r15 = r15 | r4
            r4 = r17
            goto L_0x0154
        L_0x0152:
            r4 = r16
        L_0x0154:
            int r16 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L_0x0179
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r6 = r16
            r16 = 13
        L_0x0162:
            int r17 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r7) goto L_0x0174
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r16
            r4 = r4 | r6
            int r16 = r16 + 13
            r6 = r17
            goto L_0x0162
        L_0x0174:
            int r6 = r6 << r16
            r4 = r4 | r6
            r16 = r17
        L_0x0179:
            int r6 = r4 + r14
            int r6 = r6 + r15
            int[] r6 = new int[r6]
            int r15 = r8 << 1
            int r15 = r15 + r9
            r9 = r12
            r12 = r6
            r6 = r14
            r14 = r4
            r4 = r8
            r8 = r16
        L_0x0188:
            sun.misc.Unsafe r7 = r
            java.lang.Object[] r2 = r0.c
            r18 = r8
            i.c.a.b.g.g.f5 r8 = r0.a
            java.lang.Class r8 = r8.getClass()
            r19 = r15
            int r15 = r13 * 3
            int[] r15 = new int[r15]
            r17 = 1
            int r13 = r13 << 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r20 = r14 + r6
            r22 = r14
            r6 = r18
            r23 = r20
            r18 = 0
            r21 = 0
        L_0x01ac:
            if (r6 >= r3) goto L_0x03f2
            int r24 = r6 + 1
            char r6 = r1.charAt(r6)
            r25 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r3) goto L_0x01e0
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x01c1:
            int r26 = r3 + 1
            char r3 = r1.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x01da
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r6 = r6 | r3
            int r24 = r24 + 13
            r3 = r26
            r14 = r27
            goto L_0x01c1
        L_0x01da:
            int r3 = r3 << r24
            r6 = r6 | r3
            r3 = r26
            goto L_0x01e4
        L_0x01e0:
            r27 = r14
            r3 = r24
        L_0x01e4:
            int r14 = r3 + 1
            char r3 = r1.charAt(r3)
            r24 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0216
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r24
            r24 = 13
        L_0x01f7:
            int r26 = r14 + 1
            char r14 = r1.charAt(r14)
            r28 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r11) goto L_0x0210
            r11 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r24
            r3 = r3 | r11
            int r24 = r24 + 13
            r14 = r26
            r11 = r28
            goto L_0x01f7
        L_0x0210:
            int r11 = r14 << r24
            r3 = r3 | r11
            r14 = r26
            goto L_0x021a
        L_0x0216:
            r28 = r11
            r14 = r24
        L_0x021a:
            r11 = r3 & 255(0xff, float:3.57E-43)
            r24 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0228
            int r9 = r18 + 1
            r12[r18] = r21
            r18 = r9
        L_0x0228:
            r9 = 51
            r30 = r10
            if (r11 < r9) goto L_0x02c2
            int r9 = r14 + 1
            char r14 = r1.charAt(r14)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r10) goto L_0x0257
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x023d:
            int r32 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r10) goto L_0x0252
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r14 = r14 | r9
            int r31 = r31 + 13
            r9 = r32
            r10 = 55296(0xd800, float:7.7486E-41)
            goto L_0x023d
        L_0x0252:
            int r9 = r9 << r31
            r14 = r14 | r9
            r9 = r32
        L_0x0257:
            int r10 = r11 + -51
            r31 = r9
            r9 = 9
            if (r10 == r9) goto L_0x027b
            r9 = 17
            if (r10 != r9) goto L_0x0264
            goto L_0x027b
        L_0x0264:
            r9 = 12
            if (r10 != r9) goto L_0x0279
            r9 = r5 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0279
            int r9 = r21 / 3
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r19 + 1
            r19 = r2[r19]
            r13[r9] = r19
            r19 = r10
        L_0x0279:
            r10 = 1
            goto L_0x0288
        L_0x027b:
            int r9 = r21 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r17 = r19 + 1
            r19 = r2[r19]
            r13[r9] = r19
            r19 = r17
        L_0x0288:
            int r9 = r14 << 1
            r10 = r2[r9]
            boolean r14 = r10 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0293
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x029b
        L_0x0293:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = a((java.lang.Class<?>) r8, (java.lang.String) r10)
            r2[r9] = r10
        L_0x029b:
            r32 = r15
            long r14 = r7.objectFieldOffset(r10)
            int r10 = (int) r14
            int r9 = r9 + 1
            r14 = r2[r9]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02ad
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x02b5
        L_0x02ad:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = a((java.lang.Class<?>) r8, (java.lang.String) r14)
            r2[r9] = r14
        L_0x02b5:
            long r14 = r7.objectFieldOffset(r14)
            int r9 = (int) r14
            r26 = r0
            r15 = r1
            r29 = r31
            r14 = 0
            goto L_0x03bb
        L_0x02c2:
            r32 = r15
            int r9 = r19 + 1
            r10 = r2[r19]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = a((java.lang.Class<?>) r8, (java.lang.String) r10)
            r15 = 9
            if (r11 == r15) goto L_0x0341
            r15 = 17
            if (r11 != r15) goto L_0x02d8
            goto L_0x0341
        L_0x02d8:
            r15 = 27
            if (r11 == r15) goto L_0x0330
            r15 = 49
            if (r11 != r15) goto L_0x02e1
            goto L_0x0330
        L_0x02e1:
            r15 = 12
            if (r11 == r15) goto L_0x031e
            r15 = 30
            if (r11 == r15) goto L_0x031e
            r15 = 44
            if (r11 != r15) goto L_0x02ee
            goto L_0x031e
        L_0x02ee:
            r15 = 50
            if (r11 != r15) goto L_0x031a
            int r15 = r22 + 1
            r12[r22] = r21
            int r22 = r21 / 3
            r17 = 1
            int r22 = r22 << 1
            int r26 = r9 + 1
            r9 = r2[r9]
            r13[r22] = r9
            r9 = r3 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0313
            int r22 = r22 + 1
            int r9 = r26 + 1
            r26 = r2[r26]
            r13[r22] = r26
            r26 = r0
            r22 = r15
            goto L_0x034e
        L_0x0313:
            r22 = r15
            r9 = r26
            r26 = r0
            goto L_0x034e
        L_0x031a:
            r26 = r0
            r0 = 1
            goto L_0x034e
        L_0x031e:
            r15 = r5 & 1
            r26 = r0
            r0 = 1
            if (r15 != r0) goto L_0x034e
            int r15 = r21 / 3
            int r15 = r15 << r0
            int r15 = r15 + r0
            int r17 = r9 + 1
            r9 = r2[r9]
            r13[r15] = r9
            goto L_0x033d
        L_0x0330:
            r26 = r0
            r0 = 1
            int r15 = r21 / 3
            int r15 = r15 << r0
            int r15 = r15 + r0
            int r17 = r9 + 1
            r9 = r2[r9]
            r13[r15] = r9
        L_0x033d:
            r15 = r1
            r9 = r17
            goto L_0x034f
        L_0x0341:
            r26 = r0
            r0 = 1
            int r15 = r21 / 3
            int r15 = r15 << r0
            int r15 = r15 + r0
            java.lang.Class r17 = r10.getType()
            r13[r15] = r17
        L_0x034e:
            r15 = r1
        L_0x034f:
            long r0 = r7.objectFieldOffset(r10)
            int r10 = (int) r0
            r0 = r5 & 1
            r1 = 1
            if (r0 != r1) goto L_0x03a6
            r0 = 17
            if (r11 > r0) goto L_0x03a6
            int r0 = r14 + 1
            r1 = r15
            char r14 = r1.charAt(r14)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r15) goto L_0x0383
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x036d:
            int r29 = r0 + 1
            char r0 = r1.charAt(r0)
            if (r0 < r15) goto L_0x037f
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r16
            r14 = r14 | r0
            int r16 = r16 + 13
            r0 = r29
            goto L_0x036d
        L_0x037f:
            int r0 = r0 << r16
            r14 = r14 | r0
            goto L_0x0385
        L_0x0383:
            r29 = r0
        L_0x0385:
            r0 = 1
            int r16 = r4 << 1
            int r17 = r14 / 32
            int r17 = r17 + r16
            r0 = r2[r17]
            boolean r15 = r0 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0395
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x039d
        L_0x0395:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = a((java.lang.Class<?>) r8, (java.lang.String) r0)
            r2[r17] = r0
        L_0x039d:
            r15 = r1
            long r0 = r7.objectFieldOffset(r0)
            int r1 = (int) r0
            int r14 = r14 % 32
            goto L_0x03aa
        L_0x03a6:
            r29 = r14
            r1 = 0
            r14 = 0
        L_0x03aa:
            r0 = 18
            if (r11 < r0) goto L_0x03b8
            r0 = 49
            if (r11 > r0) goto L_0x03b8
            int r0 = r23 + 1
            r12[r23] = r10
            r23 = r0
        L_0x03b8:
            r19 = r9
            r9 = r1
        L_0x03bb:
            int r0 = r21 + 1
            r32[r21] = r6
            int r1 = r0 + 1
            r6 = r3 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x03c8
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03c9
        L_0x03c8:
            r6 = 0
        L_0x03c9:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03d0
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03d1
        L_0x03d0:
            r3 = 0
        L_0x03d1:
            r3 = r3 | r6
            int r6 = r11 << 20
            r3 = r3 | r6
            r3 = r3 | r10
            r32[r0] = r3
            int r21 = r1 + 1
            int r0 = r14 << 20
            r0 = r0 | r9
            r32[r1] = r0
            r1 = r15
            r9 = r24
            r3 = r25
            r0 = r26
            r14 = r27
            r11 = r28
            r6 = r29
            r10 = r30
            r15 = r32
            goto L_0x01ac
        L_0x03f2:
            r26 = r0
            r24 = r9
            r30 = r10
            r28 = r11
            r27 = r14
            r32 = r15
            i.c.a.b.g.g.h5 r0 = new i.c.a.b.g.g.h5
            r1 = r26
            i.c.a.b.g.g.f5 r10 = r1.a
            r5 = r0
            r6 = r32
            r7 = r13
            r8 = r30
            r9 = r24
            r11 = r28
            r13 = r27
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0420:
            i.c.a.b.g.g.e6 r0 = (i.c.a.b.g.g.e6) r0
            if (r0 == 0) goto L_0x042a
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x042a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Class, i.c.a.b.g.g.d5, i.c.a.b.g.g.l5, i.c.a.b.g.g.o4, i.c.a.b.g.g.g6, i.c.a.b.g.g.k3, i.c.a.b.g.g.y4):i.c.a.b.g.g.h5");
    }

    public static i6 e(Object obj) {
        w3 w3Var = (w3) obj;
        i6 i6Var = w3Var.zzb;
        if (i6Var != i6.f3317f) {
            return i6Var;
        }
        i6 b2 = i6.b();
        w3Var.zzb = b2;
        return b2;
    }

    public static <T> boolean f(T t, long j2) {
        return ((Boolean) l6.f(t, j2)).booleanValue();
    }

    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 3) {
                int d2 = d(i2);
                long j2 = (long) (1048575 & d2);
                int i3 = this.a[i2];
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.e(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 1:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.d(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 2:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 3:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 4:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 5:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 6:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 7:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.c(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 8:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 9:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 11:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 12:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 13:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 14:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 15:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.f3347f.a((Object) t, j2, l6.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 16:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 17:
                        a(t, t2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f3308m.a(t, t2, j2);
                        break;
                    case 50:
                        u5.a(this.f3311p, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(t2, i3, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case 60:
                        b(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(t2, i3, i2)) {
                            break;
                        } else {
                            l6.a((Object) t, j2, l6.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case 68:
                        b(t, t2, i2);
                        break;
                }
            }
            u5.a(this.f3309n, t, t2);
            if (this.f3301f) {
                u5.a(this.f3310o, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0318, code lost:
        r7 = ((r10 + r8) + r9) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0825, code lost:
        r8 = ((r6 + r5) + r4) + r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r0.f3302g
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = 0
            if (r2 == 0) goto L_0x04f6
            sun.misc.Unsafe r2 = r
            r6 = 0
            r7 = 0
        L_0x0012:
            int[] r8 = r0.a
            int r8 = r8.length
            if (r6 >= r8) goto L_0x04e5
            int r8 = r0.d((int) r6)
            r9 = r8 & r4
            int r9 = r9 >>> 20
            int[] r10 = r0.a
            r11 = r10[r6]
            r8 = r8 & r3
            long r12 = (long) r8
            i.c.a.b.g.g.p3 r8 = i.c.a.b.g.g.p3.DOUBLE_LIST_PACKED
            int r8 = r8.e
            if (r9 < r8) goto L_0x0037
            i.c.a.b.g.g.p3 r8 = i.c.a.b.g.g.p3.SINT64_LIST_PACKED
            int r8 = r8.e
            if (r9 > r8) goto L_0x0037
            int r8 = r6 + 2
            r8 = r10[r8]
            r8 = r8 & r3
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            switch(r9) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04cb;
                case 2: goto L_0x04bc;
                case 3: goto L_0x04ad;
                case 4: goto L_0x049e;
                case 5: goto L_0x0493;
                case 6: goto L_0x0488;
                case 7: goto L_0x047d;
                case 8: goto L_0x0460;
                case 9: goto L_0x044c;
                case 10: goto L_0x043a;
                case 11: goto L_0x042a;
                case 12: goto L_0x041a;
                case 13: goto L_0x040e;
                case 14: goto L_0x0402;
                case 15: goto L_0x03f2;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c2;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03ae;
                case 21: goto L_0x03a4;
                case 22: goto L_0x039a;
                case 23: goto L_0x0390;
                case 24: goto L_0x0386;
                case 25: goto L_0x037c;
                case 26: goto L_0x0372;
                case 27: goto L_0x0364;
                case 28: goto L_0x035a;
                case 29: goto L_0x0350;
                case 30: goto L_0x0346;
                case 31: goto L_0x033c;
                case 32: goto L_0x0332;
                case 33: goto L_0x0328;
                case 34: goto L_0x031e;
                case 35: goto L_0x02fc;
                case 36: goto L_0x02df;
                case 37: goto L_0x02c2;
                case 38: goto L_0x02a5;
                case 39: goto L_0x0287;
                case 40: goto L_0x0269;
                case 41: goto L_0x024b;
                case 42: goto L_0x022d;
                case 43: goto L_0x020f;
                case 44: goto L_0x01f1;
                case 45: goto L_0x01d3;
                case 46: goto L_0x01b5;
                case 47: goto L_0x0197;
                case 48: goto L_0x0179;
                case 49: goto L_0x016b;
                case 50: goto L_0x015b;
                case 51: goto L_0x014f;
                case 52: goto L_0x0143;
                case 53: goto L_0x0133;
                case 54: goto L_0x0123;
                case 55: goto L_0x0113;
                case 56: goto L_0x0107;
                case 57: goto L_0x00fb;
                case 58: goto L_0x00ef;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00bd;
                case 61: goto L_0x00ab;
                case 62: goto L_0x009b;
                case 63: goto L_0x008b;
                case 64: goto L_0x007f;
                case 65: goto L_0x0073;
                case 66: goto L_0x0063;
                case 67: goto L_0x0053;
                case 68: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x04e1
        L_0x003d:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            i.c.a.b.g.g.f5 r8 = (i.c.a.b.g.g.f5) r8
            i.c.a.b.g.g.t5 r9 = r0.a((int) r6)
            int r8 = com.google.android.gms.internal.measurement.zzen.a(r11, r8, r9)
            goto L_0x04e0
        L_0x0053:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            long r8 = e(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.c((int) r11, (long) r8)
            goto L_0x04e0
        L_0x0063:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = d(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.d(r11, r8)
            goto L_0x04e0
        L_0x0073:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.k(r11)
            goto L_0x04e0
        L_0x007f:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.m(r11)
            goto L_0x04e0
        L_0x008b:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = d(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.e(r11, r8)
            goto L_0x04e0
        L_0x009b:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = d(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.c((int) r11, (int) r8)
            goto L_0x04e0
        L_0x00ab:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            i.c.a.b.g.g.u2 r8 = (i.c.a.b.g.g.u2) r8
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (i.c.a.b.g.g.u2) r8)
            goto L_0x04e0
        L_0x00bd:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            i.c.a.b.g.g.t5 r9 = r0.a((int) r6)
            int r8 = i.c.a.b.g.g.u5.a((int) r11, (java.lang.Object) r8, (i.c.a.b.g.g.t5) r9)
            goto L_0x04e0
        L_0x00d1:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            boolean r9 = r8 instanceof i.c.a.b.g.g.u2
            if (r9 == 0) goto L_0x00e7
            i.c.a.b.g.g.u2 r8 = (i.c.a.b.g.g.u2) r8
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (i.c.a.b.g.g.u2) r8)
            goto L_0x04e0
        L_0x00e7:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (java.lang.String) r8)
            goto L_0x04e0
        L_0x00ef:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.e((int) r11)
            goto L_0x04e0
        L_0x00fb:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.l(r11)
            goto L_0x04e0
        L_0x0107:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.i(r11)
            goto L_0x04e0
        L_0x0113:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = d(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.b((int) r11, (int) r8)
            goto L_0x04e0
        L_0x0123:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            long r8 = e(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.b((int) r11, (long) r8)
            goto L_0x04e0
        L_0x0133:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            long r8 = e(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (long) r8)
            goto L_0x04e0
        L_0x0143:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.b((int) r11)
            goto L_0x04e0
        L_0x014f:
            boolean r8 = r0.a(r1, (int) r11, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.d((int) r11)
            goto L_0x04e0
        L_0x015b:
            i.c.a.b.g.g.y4 r8 = r0.f3311p
            java.lang.Object r9 = i.c.a.b.g.g.l6.f(r1, r12)
            java.lang.Object r10 = r0.b((int) r6)
            int r8 = r8.a(r11, r9, r10)
            goto L_0x04e0
        L_0x016b:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            i.c.a.b.g.g.t5 r9 = r0.a((int) r6)
            int r8 = i.c.a.b.g.g.u5.b((int) r11, (java.util.List<i.c.a.b.g.g.f5>) r8, (i.c.a.b.g.g.t5) r9)
            goto L_0x04e0
        L_0x0179:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.c(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x018d
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x018d:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x0197:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.g(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x01ab
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x01ab:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x01b5:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.i(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x01c9
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x01c9:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x01d3:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.h(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x01e7
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x01e7:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x01f1:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.d(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x0205
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x0205:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x020f:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.f(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x0223
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x0223:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x022d:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.j(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x0241
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x0241:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x024b:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.h(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x025f
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x025f:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x0269:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.i(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x027d
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x027d:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x0287:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.e(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x029b
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x029b:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x02a5:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.b(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x02b9
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x02b9:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x02c2:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.a((java.util.List<java.lang.Long>) r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x02d6
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x02d6:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x02df:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.h(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x02f3
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x02f3:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
            goto L_0x0318
        L_0x02fc:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = i.c.a.b.g.g.u5.i(r9)
            if (r9 <= 0) goto L_0x04e1
            boolean r10 = r0.f3303h
            if (r10 == 0) goto L_0x0310
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x0310:
            int r8 = com.google.android.gms.internal.measurement.zzen.f(r11)
            int r10 = com.google.android.gms.internal.measurement.zzen.h(r9)
        L_0x0318:
            int r10 = r10 + r8
            int r10 = r10 + r9
            int r10 = r10 + r7
            r7 = r10
            goto L_0x04e1
        L_0x031e:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.e(r11, r8)
            goto L_0x04e0
        L_0x0328:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.i(r11, r8)
            goto L_0x04e0
        L_0x0332:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.k(r11, r8)
            goto L_0x04e0
        L_0x033c:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.j(r11, r8)
            goto L_0x04e0
        L_0x0346:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.f(r11, r8)
            goto L_0x04e0
        L_0x0350:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.h(r11, r8)
            goto L_0x04e0
        L_0x035a:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.c(r11, r8)
            goto L_0x04e0
        L_0x0364:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            i.c.a.b.g.g.t5 r9 = r0.a((int) r6)
            int r8 = i.c.a.b.g.g.u5.a((int) r11, (java.util.List<?>) r8, (i.c.a.b.g.g.t5) r9)
            goto L_0x04e0
        L_0x0372:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.a((int) r11, (java.util.List<?>) r8)
            goto L_0x04e0
        L_0x037c:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.l(r11, r8)
            goto L_0x04e0
        L_0x0386:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.j(r11, r8)
            goto L_0x04e0
        L_0x0390:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.k(r11, r8)
            goto L_0x04e0
        L_0x039a:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.g(r11, r8)
            goto L_0x04e0
        L_0x03a4:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.d(r11, r8)
            goto L_0x04e0
        L_0x03ae:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.b(r11, r8)
            goto L_0x04e0
        L_0x03b8:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.j(r11, r8)
            goto L_0x04e0
        L_0x03c2:
            java.util.List r8 = a((java.lang.Object) r1, (long) r12)
            int r8 = i.c.a.b.g.g.u5.k(r11, r8)
            goto L_0x04e0
        L_0x03cc:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            i.c.a.b.g.g.f5 r8 = (i.c.a.b.g.g.f5) r8
            i.c.a.b.g.g.t5 r9 = r0.a((int) r6)
            int r8 = com.google.android.gms.internal.measurement.zzen.a(r11, r8, r9)
            goto L_0x04e0
        L_0x03e2:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            long r8 = i.c.a.b.g.g.l6.b(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.c((int) r11, (long) r8)
            goto L_0x04e0
        L_0x03f2:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = i.c.a.b.g.g.l6.a((java.lang.Object) r1, (long) r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.d(r11, r8)
            goto L_0x04e0
        L_0x0402:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.k(r11)
            goto L_0x04e0
        L_0x040e:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.m(r11)
            goto L_0x04e0
        L_0x041a:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = i.c.a.b.g.g.l6.a((java.lang.Object) r1, (long) r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.e(r11, r8)
            goto L_0x04e0
        L_0x042a:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = i.c.a.b.g.g.l6.a((java.lang.Object) r1, (long) r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.c((int) r11, (int) r8)
            goto L_0x04e0
        L_0x043a:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            i.c.a.b.g.g.u2 r8 = (i.c.a.b.g.g.u2) r8
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (i.c.a.b.g.g.u2) r8)
            goto L_0x04e0
        L_0x044c:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            i.c.a.b.g.g.t5 r9 = r0.a((int) r6)
            int r8 = i.c.a.b.g.g.u5.a((int) r11, (java.lang.Object) r8, (i.c.a.b.g.g.t5) r9)
            goto L_0x04e0
        L_0x0460:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            java.lang.Object r8 = i.c.a.b.g.g.l6.f(r1, r12)
            boolean r9 = r8 instanceof i.c.a.b.g.g.u2
            if (r9 == 0) goto L_0x0476
            i.c.a.b.g.g.u2 r8 = (i.c.a.b.g.g.u2) r8
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (i.c.a.b.g.g.u2) r8)
            goto L_0x04e0
        L_0x0476:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (java.lang.String) r8)
            goto L_0x04e0
        L_0x047d:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.e((int) r11)
            goto L_0x04e0
        L_0x0488:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.l(r11)
            goto L_0x04e0
        L_0x0493:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.i(r11)
            goto L_0x04e0
        L_0x049e:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = i.c.a.b.g.g.l6.a((java.lang.Object) r1, (long) r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.b((int) r11, (int) r8)
            goto L_0x04e0
        L_0x04ad:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            long r8 = i.c.a.b.g.g.l6.b(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.b((int) r11, (long) r8)
            goto L_0x04e0
        L_0x04bc:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            long r8 = i.c.a.b.g.g.l6.b(r1, r12)
            int r8 = com.google.android.gms.internal.measurement.zzen.a((int) r11, (long) r8)
            goto L_0x04e0
        L_0x04cb:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.b((int) r11)
            goto L_0x04e0
        L_0x04d6:
            boolean r8 = r0.a(r1, (int) r6)
            if (r8 == 0) goto L_0x04e1
            int r8 = com.google.android.gms.internal.measurement.zzen.d((int) r11)
        L_0x04e0:
            int r7 = r7 + r8
        L_0x04e1:
            int r6 = r6 + 3
            goto L_0x0012
        L_0x04e5:
            i.c.a.b.g.g.g6<?, ?> r2 = r0.f3309n
            i.c.a.b.g.g.h6 r2 = (i.c.a.b.g.g.h6) r2
            if (r2 == 0) goto L_0x04f5
            i.c.a.b.g.g.w3 r1 = (i.c.a.b.g.g.w3) r1
            i.c.a.b.g.g.i6 r1 = r1.zzb
            int r1 = r1.a()
            int r1 = r1 + r7
            return r1
        L_0x04f5:
            throw r5
        L_0x04f6:
            sun.misc.Unsafe r2 = r
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x04fc:
            int[] r10 = r0.a
            int r10 = r10.length
            if (r7 >= r10) goto L_0x09f3
            int r10 = r0.d((int) r7)
            int[] r11 = r0.a
            r12 = r11[r7]
            r4 = r4 & r10
            int r4 = r4 >>> 20
            r13 = 17
            if (r4 > r13) goto L_0x0525
            int r13 = r7 + 2
            r11 = r11[r13]
            r13 = r11 & r3
            int r14 = r11 >>> 20
            r15 = 1
            int r14 = r15 << r14
            if (r13 == r6) goto L_0x053f
            long r5 = (long) r13
            int r5 = r2.getInt(r1, r5)
            r9 = r5
            r6 = r13
            goto L_0x053f
        L_0x0525:
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x053c
            i.c.a.b.g.g.p3 r5 = i.c.a.b.g.g.p3.DOUBLE_LIST_PACKED
            int r5 = r5.e
            if (r4 < r5) goto L_0x053c
            i.c.a.b.g.g.p3 r5 = i.c.a.b.g.g.p3.SINT64_LIST_PACKED
            int r5 = r5.e
            if (r4 > r5) goto L_0x053c
            int r5 = r7 + 2
            r5 = r11[r5]
            r5 = r5 & r3
            r11 = r5
            goto L_0x053e
        L_0x053c:
            r5 = 0
            r11 = 0
        L_0x053e:
            r14 = 0
        L_0x053f:
            r5 = r10 & r3
            r10 = r6
            long r5 = (long) r5
            switch(r4) {
                case 0: goto L_0x09e2;
                case 1: goto L_0x09d9;
                case 2: goto L_0x09cc;
                case 3: goto L_0x09bf;
                case 4: goto L_0x09b2;
                case 5: goto L_0x09a9;
                case 6: goto L_0x09a0;
                case 7: goto L_0x0997;
                case 8: goto L_0x097d;
                case 9: goto L_0x096b;
                case 10: goto L_0x095b;
                case 11: goto L_0x094d;
                case 12: goto L_0x093f;
                case 13: goto L_0x0935;
                case 14: goto L_0x092b;
                case 15: goto L_0x091d;
                case 16: goto L_0x090f;
                case 17: goto L_0x08fb;
                case 18: goto L_0x08ef;
                case 19: goto L_0x08e3;
                case 20: goto L_0x08d7;
                case 21: goto L_0x08cb;
                case 22: goto L_0x08bf;
                case 23: goto L_0x08b3;
                case 24: goto L_0x08a7;
                case 25: goto L_0x089b;
                case 26: goto L_0x088f;
                case 27: goto L_0x087f;
                case 28: goto L_0x0873;
                case 29: goto L_0x0867;
                case 30: goto L_0x085b;
                case 31: goto L_0x084f;
                case 32: goto L_0x0843;
                case 33: goto L_0x0837;
                case 34: goto L_0x082b;
                case 35: goto L_0x0809;
                case 36: goto L_0x07ec;
                case 37: goto L_0x07cf;
                case 38: goto L_0x07b2;
                case 39: goto L_0x0794;
                case 40: goto L_0x0776;
                case 41: goto L_0x0758;
                case 42: goto L_0x073a;
                case 43: goto L_0x071c;
                case 44: goto L_0x06fe;
                case 45: goto L_0x06e0;
                case 46: goto L_0x06c2;
                case 47: goto L_0x06a4;
                case 48: goto L_0x0686;
                case 49: goto L_0x0676;
                case 50: goto L_0x0666;
                case 51: goto L_0x065a;
                case 52: goto L_0x064e;
                case 53: goto L_0x063e;
                case 54: goto L_0x062e;
                case 55: goto L_0x061e;
                case 56: goto L_0x0612;
                case 57: goto L_0x0606;
                case 58: goto L_0x05fa;
                case 59: goto L_0x05dc;
                case 60: goto L_0x05c8;
                case 61: goto L_0x05b6;
                case 62: goto L_0x05a6;
                case 63: goto L_0x0596;
                case 64: goto L_0x058a;
                case 65: goto L_0x057e;
                case 66: goto L_0x056e;
                case 67: goto L_0x055e;
                case 68: goto L_0x0548;
                default: goto L_0x0546;
            }
        L_0x0546:
            goto L_0x09eb
        L_0x0548:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            i.c.a.b.g.g.f5 r4 = (i.c.a.b.g.g.f5) r4
            i.c.a.b.g.g.t5 r5 = r0.a((int) r7)
            int r4 = com.google.android.gms.internal.measurement.zzen.a(r12, r4, r5)
            goto L_0x09ea
        L_0x055e:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            long r4 = e(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.c((int) r12, (long) r4)
            goto L_0x09ea
        L_0x056e:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = d(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.d(r12, r4)
            goto L_0x09ea
        L_0x057e:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.k(r12)
            goto L_0x09ea
        L_0x058a:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.m(r12)
            goto L_0x09ea
        L_0x0596:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = d(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.e(r12, r4)
            goto L_0x09ea
        L_0x05a6:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = d(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.c((int) r12, (int) r4)
            goto L_0x09ea
        L_0x05b6:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            i.c.a.b.g.g.u2 r4 = (i.c.a.b.g.g.u2) r4
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (i.c.a.b.g.g.u2) r4)
            goto L_0x09ea
        L_0x05c8:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            i.c.a.b.g.g.t5 r5 = r0.a((int) r7)
            int r4 = i.c.a.b.g.g.u5.a((int) r12, (java.lang.Object) r4, (i.c.a.b.g.g.t5) r5)
            goto L_0x09ea
        L_0x05dc:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            boolean r5 = r4 instanceof i.c.a.b.g.g.u2
            if (r5 == 0) goto L_0x05f2
            i.c.a.b.g.g.u2 r4 = (i.c.a.b.g.g.u2) r4
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (i.c.a.b.g.g.u2) r4)
            goto L_0x09ea
        L_0x05f2:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (java.lang.String) r4)
            goto L_0x09ea
        L_0x05fa:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.e((int) r12)
            goto L_0x09ea
        L_0x0606:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.l(r12)
            goto L_0x09ea
        L_0x0612:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.i(r12)
            goto L_0x09ea
        L_0x061e:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = d(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.b((int) r12, (int) r4)
            goto L_0x09ea
        L_0x062e:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            long r4 = e(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.b((int) r12, (long) r4)
            goto L_0x09ea
        L_0x063e:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            long r4 = e(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (long) r4)
            goto L_0x09ea
        L_0x064e:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.b((int) r12)
            goto L_0x09ea
        L_0x065a:
            boolean r4 = r0.a(r1, (int) r12, (int) r7)
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.d((int) r12)
            goto L_0x09ea
        L_0x0666:
            i.c.a.b.g.g.y4 r4 = r0.f3311p
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.lang.Object r6 = r0.b((int) r7)
            int r4 = r4.a(r12, r5, r6)
            goto L_0x09ea
        L_0x0676:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            i.c.a.b.g.g.t5 r5 = r0.a((int) r7)
            int r4 = i.c.a.b.g.g.u5.b((int) r12, (java.util.List<i.c.a.b.g.g.f5>) r4, (i.c.a.b.g.g.t5) r5)
            goto L_0x09ea
        L_0x0686:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.c(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x069a
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x069a:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x06a4:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.g(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x06b8
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x06b8:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x06c2:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.i(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x06d6
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x06d6:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x06e0:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.h(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x06f4
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x06f4:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x06fe:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.d(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x0712
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x0712:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x071c:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.f(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x0730
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x0730:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x073a:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.j(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x074e
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x074e:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x0758:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.h(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x076c
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x076c:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x0776:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.i(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x078a
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x078a:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x0794:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.e(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x07a8
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x07a8:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x07b2:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.b(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x07c6
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x07c6:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x07cf:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.a((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x07e3
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x07e3:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x07ec:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.h(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x0800
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x0800:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
            goto L_0x0825
        L_0x0809:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.i(r4)
            if (r4 <= 0) goto L_0x09eb
            boolean r5 = r0.f3303h
            if (r5 == 0) goto L_0x081d
            long r5 = (long) r11
            r2.putInt(r1, r5, r4)
        L_0x081d:
            int r5 = com.google.android.gms.internal.measurement.zzen.f(r12)
            int r6 = com.google.android.gms.internal.measurement.zzen.h(r4)
        L_0x0825:
            int r6 = r6 + r5
            int r6 = r6 + r4
            int r6 = r6 + r8
            r8 = r6
            goto L_0x09eb
        L_0x082b:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.e(r12, r4)
            goto L_0x09ea
        L_0x0837:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.i(r12, r4)
            goto L_0x09ea
        L_0x0843:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.k(r12, r4)
            goto L_0x09ea
        L_0x084f:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.j(r12, r4)
            goto L_0x09ea
        L_0x085b:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.f(r12, r4)
            goto L_0x09ea
        L_0x0867:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.h(r12, r4)
            goto L_0x09ea
        L_0x0873:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.c(r12, r4)
            goto L_0x09ea
        L_0x087f:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            i.c.a.b.g.g.t5 r5 = r0.a((int) r7)
            int r4 = i.c.a.b.g.g.u5.a((int) r12, (java.util.List<?>) r4, (i.c.a.b.g.g.t5) r5)
            goto L_0x09ea
        L_0x088f:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.a((int) r12, (java.util.List<?>) r4)
            goto L_0x09ea
        L_0x089b:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.l(r12, r4)
            goto L_0x09ea
        L_0x08a7:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.j(r12, r4)
            goto L_0x09ea
        L_0x08b3:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.k(r12, r4)
            goto L_0x09ea
        L_0x08bf:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.g(r12, r4)
            goto L_0x09ea
        L_0x08cb:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.d(r12, r4)
            goto L_0x09ea
        L_0x08d7:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.b(r12, r4)
            goto L_0x09ea
        L_0x08e3:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.j(r12, r4)
            goto L_0x09ea
        L_0x08ef:
            java.lang.Object r4 = r2.getObject(r1, r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = i.c.a.b.g.g.u5.k(r12, r4)
            goto L_0x09ea
        L_0x08fb:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            i.c.a.b.g.g.f5 r4 = (i.c.a.b.g.g.f5) r4
            i.c.a.b.g.g.t5 r5 = r0.a((int) r7)
            int r4 = com.google.android.gms.internal.measurement.zzen.a(r12, r4, r5)
            goto L_0x09ea
        L_0x090f:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            long r4 = r2.getLong(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.c((int) r12, (long) r4)
            goto L_0x09ea
        L_0x091d:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = r2.getInt(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.d(r12, r4)
            goto L_0x09ea
        L_0x092b:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.k(r12)
            goto L_0x09ea
        L_0x0935:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.m(r12)
            goto L_0x09ea
        L_0x093f:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = r2.getInt(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.e(r12, r4)
            goto L_0x09ea
        L_0x094d:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = r2.getInt(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.c((int) r12, (int) r4)
            goto L_0x09ea
        L_0x095b:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            i.c.a.b.g.g.u2 r4 = (i.c.a.b.g.g.u2) r4
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (i.c.a.b.g.g.u2) r4)
            goto L_0x09ea
        L_0x096b:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            i.c.a.b.g.g.t5 r5 = r0.a((int) r7)
            int r4 = i.c.a.b.g.g.u5.a((int) r12, (java.lang.Object) r4, (i.c.a.b.g.g.t5) r5)
            goto L_0x09ea
        L_0x097d:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            java.lang.Object r4 = r2.getObject(r1, r5)
            boolean r5 = r4 instanceof i.c.a.b.g.g.u2
            if (r5 == 0) goto L_0x0990
            i.c.a.b.g.g.u2 r4 = (i.c.a.b.g.g.u2) r4
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (i.c.a.b.g.g.u2) r4)
            goto L_0x09ea
        L_0x0990:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (java.lang.String) r4)
            goto L_0x09ea
        L_0x0997:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.e((int) r12)
            goto L_0x09ea
        L_0x09a0:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.l(r12)
            goto L_0x09ea
        L_0x09a9:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.i(r12)
            goto L_0x09ea
        L_0x09b2:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = r2.getInt(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.b((int) r12, (int) r4)
            goto L_0x09ea
        L_0x09bf:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            long r4 = r2.getLong(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.b((int) r12, (long) r4)
            goto L_0x09ea
        L_0x09cc:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            long r4 = r2.getLong(r1, r5)
            int r4 = com.google.android.gms.internal.measurement.zzen.a((int) r12, (long) r4)
            goto L_0x09ea
        L_0x09d9:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.b((int) r12)
            goto L_0x09ea
        L_0x09e2:
            r4 = r9 & r14
            if (r4 == 0) goto L_0x09eb
            int r4 = com.google.android.gms.internal.measurement.zzen.d((int) r12)
        L_0x09ea:
            int r8 = r8 + r4
        L_0x09eb:
            int r7 = r7 + 3
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = r10
            r5 = 0
            goto L_0x04fc
        L_0x09f3:
            i.c.a.b.g.g.g6<?, ?> r2 = r0.f3309n
            i.c.a.b.g.g.h6 r2 = (i.c.a.b.g.g.h6) r2
            if (r2 == 0) goto L_0x0a5e
            r2 = r1
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2
            i.c.a.b.g.g.i6 r2 = r2.zzb
            int r2 = r2.a()
            int r2 = r2 + r8
            boolean r3 = r0.f3301f
            if (r3 == 0) goto L_0x0a5d
            i.c.a.b.g.g.k3<?> r3 = r0.f3310o
            i.c.a.b.g.g.m3 r3 = (i.c.a.b.g.g.m3) r3
            if (r3 == 0) goto L_0x0a5b
            i.c.a.b.g.g.w3$d r1 = (i.c.a.b.g.g.w3.d) r1
            i.c.a.b.g.g.o3<i.c.a.b.g.g.w3$c> r1 = r1.zzc
            r3 = 0
            r4 = 0
        L_0x0a13:
            i.c.a.b.g.g.x5<T, java.lang.Object> r5 = r1.a
            int r5 = r5.b()
            if (r3 >= r5) goto L_0x0a33
            i.c.a.b.g.g.x5<T, java.lang.Object> r5 = r1.a
            java.util.Map$Entry r5 = r5.a((int) r3)
            java.lang.Object r6 = r5.getKey()
            i.c.a.b.g.g.q3 r6 = (i.c.a.b.g.g.q3) r6
            java.lang.Object r5 = r5.getValue()
            int r5 = i.c.a.b.g.g.o3.b((i.c.a.b.g.g.q3<?>) r6, (java.lang.Object) r5)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L_0x0a13
        L_0x0a33:
            i.c.a.b.g.g.x5<T, java.lang.Object> r1 = r1.a
            java.lang.Iterable r1 = r1.c()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0a59
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            i.c.a.b.g.g.q3 r5 = (i.c.a.b.g.g.q3) r5
            java.lang.Object r3 = r3.getValue()
            int r3 = i.c.a.b.g.g.o3.b((i.c.a.b.g.g.q3<?>) r5, (java.lang.Object) r3)
            int r4 = r4 + r3
            goto L_0x0a3d
        L_0x0a59:
            int r2 = r2 + r4
            goto L_0x0a5d
        L_0x0a5b:
            r1 = 0
            throw r1
        L_0x0a5d:
            return r2
        L_0x0a5e:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.c(java.lang.Object):int");
    }

    public final boolean d(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 < this.f3305j) {
                int i6 = this.f3304i[i4];
                int i7 = this.a[i6];
                int d2 = d(i6);
                if (!this.f3302g) {
                    int i8 = this.a[i6 + 2];
                    int i9 = i8 & 1048575;
                    i2 = 1 << (i8 >>> 20);
                    if (i9 != i3) {
                        i5 = r.getInt(t, (long) i9);
                        i3 = i9;
                    }
                } else {
                    i2 = 0;
                }
                if (((268435456 & d2) != 0) && !a(t, i6, i5, i2)) {
                    return false;
                }
                int i10 = (267386880 & d2) >>> 20;
                if (i10 != 9 && i10 != 17) {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            if (a(t, i7, i6) && !a(i6).d(l6.f(t, (long) (d2 & 1048575)))) {
                                return false;
                            }
                        } else if (i10 != 49) {
                            if (i10 == 50 && !this.f3311p.c(l6.f(t, (long) (d2 & 1048575))).isEmpty()) {
                                this.f3311p.e(b(i6));
                                throw null;
                            }
                        }
                    }
                    List list = (List) l6.f(t, (long) (d2 & 1048575));
                    if (!list.isEmpty()) {
                        t5 a2 = a(i6);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= list.size()) {
                                break;
                            } else if (!a2.d(list.get(i11))) {
                                z = false;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                } else if (a(t, i6, i5, i2) && !a(i6).d(l6.f(t, (long) (d2 & 1048575)))) {
                    return false;
                }
                i4++;
            } else {
                if (this.f3301f) {
                    if (((m3) this.f3310o) == null) {
                        throw null;
                    } else if (!((w3.d) t).zzc.c()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final int e(int i2) {
        return this.a[i2 + 2];
    }

    public static <T> long e(T t, long j2) {
        return ((Long) l6.f(t, j2)).longValue();
    }

    public final int d(int i2) {
        return this.a[i2 + 1];
    }

    public static <T> int d(T t, long j2) {
        return ((Integer) l6.f(t, j2)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0503  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(T r19, i.c.a.b.g.g.b7 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f3301f
            r4 = 0
            if (r3 == 0) goto L_0x002a
            i.c.a.b.g.g.k3<?> r3 = r0.f3310o
            i.c.a.b.g.g.m3 r3 = (i.c.a.b.g.g.m3) r3
            if (r3 == 0) goto L_0x0029
            r3 = r1
            i.c.a.b.g.g.w3$d r3 = (i.c.a.b.g.g.w3.d) r3
            i.c.a.b.g.g.o3<i.c.a.b.g.g.w3$c> r3 = r3.zzc
            i.c.a.b.g.g.x5<T, java.lang.Object> r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x002a
            java.util.Iterator r3 = r3.b()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x002b
        L_0x0029:
            throw r4
        L_0x002a:
            r3 = r4
        L_0x002b:
            r5 = -1
            int[] r6 = r0.a
            int r6 = r6.length
            sun.misc.Unsafe r7 = r
            r9 = 0
            r10 = 0
        L_0x0033:
            if (r9 >= r6) goto L_0x04fb
            int r11 = r0.d((int) r9)
            int[] r12 = r0.a
            r13 = r12[r9]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r11
            int r14 = r14 >>> 20
            boolean r15 = r0.f3302g
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 1
            if (r15 != 0) goto L_0x0063
            r15 = 17
            if (r14 > r15) goto L_0x0063
            int r15 = r9 + 2
            r12 = r12[r15]
            r15 = r12 & r16
            r17 = r9
            if (r15 == r5) goto L_0x005e
            long r8 = (long) r15
            int r10 = r7.getInt(r1, r8)
            r5 = r15
        L_0x005e:
            int r8 = r12 >>> 20
            int r8 = r4 << r8
            goto L_0x0066
        L_0x0063:
            r17 = r9
            r8 = 0
        L_0x0066:
            if (r3 != 0) goto L_0x04f4
            r9 = r11 & r16
            long r11 = (long) r9
            r9 = r17
            switch(r14) {
                case 0: goto L_0x04e0;
                case 1: goto L_0x04d0;
                case 2: goto L_0x04c0;
                case 3: goto L_0x04b0;
                case 4: goto L_0x049e;
                case 5: goto L_0x048e;
                case 6: goto L_0x047e;
                case 7: goto L_0x046d;
                case 8: goto L_0x045f;
                case 9: goto L_0x044a;
                case 10: goto L_0x0437;
                case 11: goto L_0x0426;
                case 12: goto L_0x0413;
                case 13: goto L_0x0402;
                case 14: goto L_0x03f1;
                case 15: goto L_0x03e0;
                case 16: goto L_0x03cf;
                case 17: goto L_0x03ba;
                case 18: goto L_0x03aa;
                case 19: goto L_0x039a;
                case 20: goto L_0x038a;
                case 21: goto L_0x037a;
                case 22: goto L_0x036a;
                case 23: goto L_0x035a;
                case 24: goto L_0x034a;
                case 25: goto L_0x033a;
                case 26: goto L_0x032b;
                case 27: goto L_0x0318;
                case 28: goto L_0x0309;
                case 29: goto L_0x02f9;
                case 30: goto L_0x02e9;
                case 31: goto L_0x02d9;
                case 32: goto L_0x02c9;
                case 33: goto L_0x02b9;
                case 34: goto L_0x02a9;
                case 35: goto L_0x029a;
                case 36: goto L_0x028b;
                case 37: goto L_0x027c;
                case 38: goto L_0x026d;
                case 39: goto L_0x025e;
                case 40: goto L_0x024f;
                case 41: goto L_0x0240;
                case 42: goto L_0x0231;
                case 43: goto L_0x0222;
                case 44: goto L_0x0213;
                case 45: goto L_0x0204;
                case 46: goto L_0x01f5;
                case 47: goto L_0x01e6;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c4;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a9;
                case 52: goto L_0x0197;
                case 53: goto L_0x0185;
                case 54: goto L_0x0173;
                case 55: goto L_0x015f;
                case 56: goto L_0x014d;
                case 57: goto L_0x013b;
                case 58: goto L_0x0129;
                case 59: goto L_0x011a;
                case 60: goto L_0x0104;
                case 61: goto L_0x00f0;
                case 62: goto L_0x00df;
                case 63: goto L_0x00cc;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00aa;
                case 66: goto L_0x0099;
                case 67: goto L_0x0088;
                case 68: goto L_0x0073;
                default: goto L_0x0070;
            }
        L_0x0070:
            r14 = 0
            goto L_0x04ef
        L_0x0073:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r7.getObject(r1, r11)
            i.c.a.b.g.g.t5 r8 = r0.a((int) r9)
            r11 = r2
            i.c.a.b.g.g.h3 r11 = (i.c.a.b.g.g.h3) r11
            r11.b(r13, r4, r8)
            goto L_0x0070
        L_0x0088:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            long r11 = e(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.e(r13, r11)
            goto L_0x0070
        L_0x0099:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            int r4 = d(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.d((int) r13, (int) r4)
            goto L_0x0070
        L_0x00aa:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            long r11 = e(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.b((int) r13, (long) r11)
            goto L_0x0070
        L_0x00bb:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            int r4 = d(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (int) r4)
            goto L_0x0070
        L_0x00cc:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            int r4 = d(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            com.google.android.gms.internal.measurement.zzen r8 = r8.a
            r8.a((int) r13, (int) r4)
            goto L_0x0070
        L_0x00df:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            int r4 = d(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.c((int) r13, (int) r4)
            goto L_0x0070
        L_0x00f0:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r7.getObject(r1, r11)
            i.c.a.b.g.g.u2 r4 = (i.c.a.b.g.g.u2) r4
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (i.c.a.b.g.g.u2) r4)
            goto L_0x0070
        L_0x0104:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r7.getObject(r1, r11)
            i.c.a.b.g.g.t5 r8 = r0.a((int) r9)
            r11 = r2
            i.c.a.b.g.g.h3 r11 = (i.c.a.b.g.g.h3) r11
            r11.a(r13, r4, r8)
            goto L_0x0070
        L_0x011a:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r7.getObject(r1, r11)
            a((int) r13, (java.lang.Object) r4, (i.c.a.b.g.g.b7) r2)
            goto L_0x0070
        L_0x0129:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            boolean r4 = f(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (boolean) r4)
            goto L_0x0070
        L_0x013b:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            int r4 = d(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.b((int) r13, (int) r4)
            goto L_0x0070
        L_0x014d:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            long r11 = e(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.d((int) r13, (long) r11)
            goto L_0x0070
        L_0x015f:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            int r4 = d(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            com.google.android.gms.internal.measurement.zzen r8 = r8.a
            r8.a((int) r13, (int) r4)
            goto L_0x0070
        L_0x0173:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            long r11 = e(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.c((int) r13, (long) r11)
            goto L_0x0070
        L_0x0185:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            long r11 = e(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.a((int) r13, (long) r11)
            goto L_0x0070
        L_0x0197:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            float r4 = c(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (float) r4)
            goto L_0x0070
        L_0x01a9:
            boolean r4 = r0.a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0070
            double r11 = b(r1, (long) r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.a((int) r13, (double) r11)
            goto L_0x0070
        L_0x01bb:
            java.lang.Object r4 = r7.getObject(r1, r11)
            r0.a((i.c.a.b.g.g.b7) r2, (int) r13, (java.lang.Object) r4, (int) r9)
            goto L_0x0070
        L_0x01c4:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.t5 r11 = r0.a((int) r9)
            i.c.a.b.g.g.u5.b((int) r4, (java.util.List<?>) r8, (i.c.a.b.g.g.b7) r2, (i.c.a.b.g.g.t5) r11)
            goto L_0x0070
        L_0x01d7:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.e(r8, r11, r2, r4)
            goto L_0x0070
        L_0x01e6:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.j(r8, r11, r2, r4)
            goto L_0x0070
        L_0x01f5:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.g(r8, r11, r2, r4)
            goto L_0x0070
        L_0x0204:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.l(r8, r11, r2, r4)
            goto L_0x0070
        L_0x0213:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.m(r8, r11, r2, r4)
            goto L_0x0070
        L_0x0222:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.i(r8, r11, r2, r4)
            goto L_0x0070
        L_0x0231:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.n(r8, r11, r2, r4)
            goto L_0x0070
        L_0x0240:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.k(r8, r11, r2, r4)
            goto L_0x0070
        L_0x024f:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.f(r8, r11, r2, r4)
            goto L_0x0070
        L_0x025e:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.h(r8, r11, r2, r4)
            goto L_0x0070
        L_0x026d:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.d(r8, r11, r2, r4)
            goto L_0x0070
        L_0x027c:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.c(r8, r11, r2, r4)
            goto L_0x0070
        L_0x028b:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.b((int) r8, (java.util.List<java.lang.Float>) r11, (i.c.a.b.g.g.b7) r2, (boolean) r4)
            goto L_0x0070
        L_0x029a:
            int[] r8 = r0.a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            i.c.a.b.g.g.u5.a((int) r8, (java.util.List<java.lang.Double>) r11, (i.c.a.b.g.g.b7) r2, (boolean) r4)
            goto L_0x0070
        L_0x02a9:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            i.c.a.b.g.g.u5.e(r4, r8, r2, r13)
            goto L_0x0070
        L_0x02b9:
            r13 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.j(r4, r8, r2, r13)
            goto L_0x0070
        L_0x02c9:
            r13 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.g(r4, r8, r2, r13)
            goto L_0x0070
        L_0x02d9:
            r13 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.l(r4, r8, r2, r13)
            goto L_0x0070
        L_0x02e9:
            r13 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.m(r4, r8, r2, r13)
            goto L_0x0070
        L_0x02f9:
            r13 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.i(r4, r8, r2, r13)
            goto L_0x0070
        L_0x0309:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.b((int) r4, (java.util.List<i.c.a.b.g.g.u2>) r8, (i.c.a.b.g.g.b7) r2)
            goto L_0x0070
        L_0x0318:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.t5 r11 = r0.a((int) r9)
            i.c.a.b.g.g.u5.a((int) r4, (java.util.List<?>) r8, (i.c.a.b.g.g.b7) r2, (i.c.a.b.g.g.t5) r11)
            goto L_0x0070
        L_0x032b:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.a((int) r4, (java.util.List<java.lang.String>) r8, (i.c.a.b.g.g.b7) r2)
            goto L_0x0070
        L_0x033a:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            i.c.a.b.g.g.u5.n(r4, r8, r2, r14)
            goto L_0x04ef
        L_0x034a:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.k(r4, r8, r2, r14)
            goto L_0x04ef
        L_0x035a:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.f(r4, r8, r2, r14)
            goto L_0x04ef
        L_0x036a:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.h(r4, r8, r2, r14)
            goto L_0x04ef
        L_0x037a:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.d(r4, r8, r2, r14)
            goto L_0x04ef
        L_0x038a:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.c(r4, r8, r2, r14)
            goto L_0x04ef
        L_0x039a:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.b((int) r4, (java.util.List<java.lang.Float>) r8, (i.c.a.b.g.g.b7) r2, (boolean) r14)
            goto L_0x04ef
        L_0x03aa:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            i.c.a.b.g.g.u5.a((int) r4, (java.util.List<java.lang.Double>) r8, (i.c.a.b.g.g.b7) r2, (boolean) r14)
            goto L_0x04ef
        L_0x03ba:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            java.lang.Object r4 = r7.getObject(r1, r11)
            i.c.a.b.g.g.t5 r8 = r0.a((int) r9)
            r11 = r2
            i.c.a.b.g.g.h3 r11 = (i.c.a.b.g.g.h3) r11
            r11.b(r13, r4, r8)
            goto L_0x04ef
        L_0x03cf:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            long r11 = r7.getLong(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.e(r13, r11)
            goto L_0x04ef
        L_0x03e0:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            int r4 = r7.getInt(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.d((int) r13, (int) r4)
            goto L_0x04ef
        L_0x03f1:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            long r11 = r7.getLong(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.b((int) r13, (long) r11)
            goto L_0x04ef
        L_0x0402:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            int r4 = r7.getInt(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (int) r4)
            goto L_0x04ef
        L_0x0413:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            int r4 = r7.getInt(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            com.google.android.gms.internal.measurement.zzen r8 = r8.a
            r8.a((int) r13, (int) r4)
            goto L_0x04ef
        L_0x0426:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            int r4 = r7.getInt(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.c((int) r13, (int) r4)
            goto L_0x04ef
        L_0x0437:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            java.lang.Object r4 = r7.getObject(r1, r11)
            i.c.a.b.g.g.u2 r4 = (i.c.a.b.g.g.u2) r4
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (i.c.a.b.g.g.u2) r4)
            goto L_0x04ef
        L_0x044a:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            java.lang.Object r4 = r7.getObject(r1, r11)
            i.c.a.b.g.g.t5 r8 = r0.a((int) r9)
            r11 = r2
            i.c.a.b.g.g.h3 r11 = (i.c.a.b.g.g.h3) r11
            r11.a(r13, r4, r8)
            goto L_0x04ef
        L_0x045f:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            java.lang.Object r4 = r7.getObject(r1, r11)
            a((int) r13, (java.lang.Object) r4, (i.c.a.b.g.g.b7) r2)
            goto L_0x04ef
        L_0x046d:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            boolean r4 = i.c.a.b.g.g.l6.c(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (boolean) r4)
            goto L_0x04ef
        L_0x047e:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            int r4 = r7.getInt(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.b((int) r13, (int) r4)
            goto L_0x04ef
        L_0x048e:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            long r11 = r7.getLong(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.d((int) r13, (long) r11)
            goto L_0x04ef
        L_0x049e:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            int r4 = r7.getInt(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            com.google.android.gms.internal.measurement.zzen r8 = r8.a
            r8.a((int) r13, (int) r4)
            goto L_0x04ef
        L_0x04b0:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            long r11 = r7.getLong(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.c((int) r13, (long) r11)
            goto L_0x04ef
        L_0x04c0:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            long r11 = r7.getLong(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.a((int) r13, (long) r11)
            goto L_0x04ef
        L_0x04d0:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            float r4 = i.c.a.b.g.g.l6.d(r1, r11)
            r8 = r2
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r13, (float) r4)
            goto L_0x04ef
        L_0x04e0:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x04ef
            double r11 = i.c.a.b.g.g.l6.e(r1, r11)
            r4 = r2
            i.c.a.b.g.g.h3 r4 = (i.c.a.b.g.g.h3) r4
            r4.a((int) r13, (double) r11)
        L_0x04ef:
            int r9 = r9 + 3
            r4 = 0
            goto L_0x0033
        L_0x04f4:
            i.c.a.b.g.g.k3<?> r1 = r0.f3310o
            r1.a(r3)
            r4 = 0
            throw r4
        L_0x04fb:
            if (r3 != 0) goto L_0x0503
            i.c.a.b.g.g.g6<?, ?> r3 = r0.f3309n
            a(r3, r1, (i.c.a.b.g.g.b7) r2)
            return
        L_0x0503:
            i.c.a.b.g.g.k3<?> r1 = r0.f3310o
            r1.a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.b(java.lang.Object, i.c.a.b.g.g.b7):void");
    }

    public static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(a.a(arrays, name.length() + a.a(str, 40)));
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(a.a(sb, " not found. Known fields are ", arrays));
        }
    }

    public final T a() {
        return this.f3307l.a(this.e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (i.c.a.b.g.g.u5.a(i.c.a.b.g.g.l6.f(r10, r6), i.c.a.b.g.g.l6.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (i.c.a.b.g.g.l6.b(r10, r6) == i.c.a.b.g.g.l6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (i.c.a.b.g.g.l6.a((java.lang.Object) r10, r6) == i.c.a.b.g.g.l6.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (i.c.a.b.g.g.l6.b(r10, r6) == i.c.a.b.g.g.l6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (i.c.a.b.g.g.l6.a((java.lang.Object) r10, r6) == i.c.a.b.g.g.l6.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (i.c.a.b.g.g.l6.a((java.lang.Object) r10, r6) == i.c.a.b.g.g.l6.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (i.c.a.b.g.g.l6.a((java.lang.Object) r10, r6) == i.c.a.b.g.g.l6.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (i.c.a.b.g.g.u5.a(i.c.a.b.g.g.l6.f(r10, r6), i.c.a.b.g.g.l6.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (i.c.a.b.g.g.u5.a(i.c.a.b.g.g.l6.f(r10, r6), i.c.a.b.g.g.l6.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (i.c.a.b.g.g.u5.a(i.c.a.b.g.g.l6.f(r10, r6), i.c.a.b.g.g.l6.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (i.c.a.b.g.g.l6.c(r10, r6) == i.c.a.b.g.g.l6.c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (i.c.a.b.g.g.l6.a((java.lang.Object) r10, r6) == i.c.a.b.g.g.l6.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (i.c.a.b.g.g.l6.b(r10, r6) == i.c.a.b.g.g.l6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (i.c.a.b.g.g.l6.a((java.lang.Object) r10, r6) == i.c.a.b.g.g.l6.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (i.c.a.b.g.g.l6.b(r10, r6) == i.c.a.b.g.g.l6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (i.c.a.b.g.g.l6.b(r10, r6) == i.c.a.b.g.g.l6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(i.c.a.b.g.g.l6.d(r10, r6)) == java.lang.Float.floatToIntBits(i.c.a.b.g.g.l6.d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(i.c.a.b.g.g.l6.e(r10, r6)) == java.lang.Double.doubleToLongBits(i.c.a.b.g.g.l6.e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (i.c.a.b.g.g.u5.a(i.c.a.b.g.g.l6.f(r10, r6), i.c.a.b.g.g.l6.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.d((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.e((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = i.c.a.b.g.g.l6.a((java.lang.Object) r10, (long) r4)
            int r4 = i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = i.c.a.b.g.g.l6.f(r10, r6)
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r11, r6)
            boolean r4 = i.c.a.b.g.g.u5.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r10, r6)
            java.lang.Object r4 = i.c.a.b.g.g.l6.f(r11, r6)
            boolean r3 = i.c.a.b.g.g.u5.a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r10, r6)
            java.lang.Object r4 = i.c.a.b.g.g.l6.f(r11, r6)
            boolean r3 = i.c.a.b.g.g.u5.a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i.c.a.b.g.g.l6.f(r10, r6)
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r11, r6)
            boolean r4 = i.c.a.b.g.g.u5.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i.c.a.b.g.g.l6.b(r10, r6)
            long r6 = i.c.a.b.g.g.l6.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i.c.a.b.g.g.l6.a((java.lang.Object) r10, (long) r6)
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i.c.a.b.g.g.l6.b(r10, r6)
            long r6 = i.c.a.b.g.g.l6.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i.c.a.b.g.g.l6.a((java.lang.Object) r10, (long) r6)
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i.c.a.b.g.g.l6.a((java.lang.Object) r10, (long) r6)
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i.c.a.b.g.g.l6.a((java.lang.Object) r10, (long) r6)
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i.c.a.b.g.g.l6.f(r10, r6)
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r11, r6)
            boolean r4 = i.c.a.b.g.g.u5.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i.c.a.b.g.g.l6.f(r10, r6)
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r11, r6)
            boolean r4 = i.c.a.b.g.g.u5.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i.c.a.b.g.g.l6.f(r10, r6)
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r11, r6)
            boolean r4 = i.c.a.b.g.g.u5.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = i.c.a.b.g.g.l6.c(r10, r6)
            boolean r5 = i.c.a.b.g.g.l6.c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i.c.a.b.g.g.l6.a((java.lang.Object) r10, (long) r6)
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i.c.a.b.g.g.l6.b(r10, r6)
            long r6 = i.c.a.b.g.g.l6.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i.c.a.b.g.g.l6.a((java.lang.Object) r10, (long) r6)
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i.c.a.b.g.g.l6.b(r10, r6)
            long r6 = i.c.a.b.g.g.l6.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i.c.a.b.g.g.l6.b(r10, r6)
            long r6 = i.c.a.b.g.g.l6.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = i.c.a.b.g.g.l6.d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = i.c.a.b.g.g.l6.d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = i.c.a.b.g.g.l6.e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = i.c.a.b.g.g.l6.e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            i.c.a.b.g.g.g6<?, ?> r0 = r9.f3309n
            r2 = r0
            i.c.a.b.g.g.h6 r2 = (i.c.a.b.g.g.h6) r2
            r4 = 0
            if (r2 == 0) goto L_0x0206
            r2 = r10
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2
            i.c.a.b.g.g.i6 r2 = r2.zzb
            i.c.a.b.g.g.h6 r0 = (i.c.a.b.g.g.h6) r0
            if (r0 == 0) goto L_0x0205
            r0 = r11
            i.c.a.b.g.g.w3 r0 = (i.c.a.b.g.g.w3) r0
            i.c.a.b.g.g.i6 r0 = r0.zzb
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01e6
            return r1
        L_0x01e6:
            boolean r0 = r9.f3301f
            if (r0 == 0) goto L_0x0204
            i.c.a.b.g.g.k3<?> r0 = r9.f3310o
            r1 = r0
            i.c.a.b.g.g.m3 r1 = (i.c.a.b.g.g.m3) r1
            if (r1 == 0) goto L_0x0203
            i.c.a.b.g.g.w3$d r10 = (i.c.a.b.g.g.w3.d) r10
            i.c.a.b.g.g.o3<i.c.a.b.g.g.w3$c> r10 = r10.zzc
            i.c.a.b.g.g.m3 r0 = (i.c.a.b.g.g.m3) r0
            if (r0 == 0) goto L_0x0202
            i.c.a.b.g.g.w3$d r11 = (i.c.a.b.g.g.w3.d) r11
            i.c.a.b.g.g.o3<i.c.a.b.g.g.w3$c> r11 = r11.zzc
            boolean r10 = r10.equals(r11)
            return r10
        L_0x0202:
            throw r4
        L_0x0203:
            throw r4
        L_0x0204:
            return r3
        L_0x0205:
            throw r4
        L_0x0206:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.d((int) r1)
            int[] r4 = r8.a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0229
        L_0x0020:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = f(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = b(r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = i.c.a.b.g.g.l6.b(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = i.c.a.b.g.g.l6.a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = i.c.a.b.g.g.l6.b(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = i.c.a.b.g.g.l6.a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = i.c.a.b.g.g.l6.a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = i.c.a.b.g.g.l6.a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = i.c.a.b.g.g.l6.f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = i.c.a.b.g.g.l6.c(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = i.c.a.b.g.g.l6.a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = i.c.a.b.g.g.l6.b(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = i.c.a.b.g.g.l6.a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = i.c.a.b.g.g.l6.b(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = i.c.a.b.g.g.l6.b(r9, r5)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = i.c.a.b.g.g.l6.d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = i.c.a.b.g.g.l6.e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = i.c.a.b.g.g.y3.a((long) r3)
        L_0x0227:
            int r3 = r3 + r2
            r2 = r3
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            i.c.a.b.g.g.g6<?, ?> r0 = r8.f3309n
            i.c.a.b.g.g.h6 r0 = (i.c.a.b.g.g.h6) r0
            r1 = 0
            if (r0 == 0) goto L_0x0258
            r0 = r9
            i.c.a.b.g.g.w3 r0 = (i.c.a.b.g.g.w3) r0
            i.c.a.b.g.g.i6 r0 = r0.zzb
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r2 = r8.f3301f
            if (r2 == 0) goto L_0x0257
            int r0 = r0 * 53
            i.c.a.b.g.g.k3<?> r2 = r8.f3310o
            i.c.a.b.g.g.m3 r2 = (i.c.a.b.g.g.m3) r2
            if (r2 == 0) goto L_0x0256
            i.c.a.b.g.g.w3$d r9 = (i.c.a.b.g.g.w3.d) r9
            i.c.a.b.g.g.o3<i.c.a.b.g.g.w3$c> r9 = r9.zzc
            int r9 = r9.hashCode()
            int r0 = r0 + r9
            goto L_0x0257
        L_0x0256:
            throw r1
        L_0x0257:
            return r0
        L_0x0258:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Object):int");
    }

    public static List<?> a(Object obj, long j2) {
        return (List) l6.f(obj, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0531  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r12, i.c.a.b.g.g.b7 r13) {
        /*
            r11 = this;
            r0 = r13
            i.c.a.b.g.g.h3 r0 = (i.c.a.b.g.g.h3) r0
            r1 = 0
            if (r0 == 0) goto L_0x053b
            boolean r0 = r11.f3302g
            if (r0 == 0) goto L_0x0537
            boolean r0 = r11.f3301f
            if (r0 == 0) goto L_0x002d
            i.c.a.b.g.g.k3<?> r0 = r11.f3310o
            i.c.a.b.g.g.m3 r0 = (i.c.a.b.g.g.m3) r0
            if (r0 == 0) goto L_0x002c
            r0 = r12
            i.c.a.b.g.g.w3$d r0 = (i.c.a.b.g.g.w3.d) r0
            i.c.a.b.g.g.o3<i.c.a.b.g.g.w3$c> r0 = r0.zzc
            i.c.a.b.g.g.x5<T, java.lang.Object> r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002d
            java.util.Iterator r0 = r0.b()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x002e
        L_0x002c:
            throw r1
        L_0x002d:
            r0 = r1
        L_0x002e:
            int[] r2 = r11.a
            int r2 = r2.length
            r3 = 0
            r4 = 0
        L_0x0033:
            if (r4 >= r2) goto L_0x0529
            int r5 = r11.d((int) r4)
            int[] r6 = r11.a
            r7 = r6[r4]
            if (r0 != 0) goto L_0x0523
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r5
            int r8 = r8 >>> 20
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x050d;
                case 1: goto L_0x04fa;
                case 2: goto L_0x04e7;
                case 3: goto L_0x04d4;
                case 4: goto L_0x04bf;
                case 5: goto L_0x04ac;
                case 6: goto L_0x0498;
                case 7: goto L_0x0484;
                case 8: goto L_0x0473;
                case 9: goto L_0x045b;
                case 10: goto L_0x0445;
                case 11: goto L_0x0431;
                case 12: goto L_0x041b;
                case 13: goto L_0x0407;
                case 14: goto L_0x03f3;
                case 15: goto L_0x03df;
                case 16: goto L_0x03cb;
                case 17: goto L_0x03b3;
                case 18: goto L_0x03a4;
                case 19: goto L_0x0395;
                case 20: goto L_0x0386;
                case 21: goto L_0x0377;
                case 22: goto L_0x0368;
                case 23: goto L_0x0359;
                case 24: goto L_0x034a;
                case 25: goto L_0x033b;
                case 26: goto L_0x032c;
                case 27: goto L_0x0319;
                case 28: goto L_0x030a;
                case 29: goto L_0x02fb;
                case 30: goto L_0x02ec;
                case 31: goto L_0x02dd;
                case 32: goto L_0x02ce;
                case 33: goto L_0x02bf;
                case 34: goto L_0x02b0;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0292;
                case 37: goto L_0x0283;
                case 38: goto L_0x0274;
                case 39: goto L_0x0265;
                case 40: goto L_0x0256;
                case 41: goto L_0x0247;
                case 42: goto L_0x0238;
                case 43: goto L_0x0229;
                case 44: goto L_0x021a;
                case 45: goto L_0x020b;
                case 46: goto L_0x01fc;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01de;
                case 49: goto L_0x01cb;
                case 50: goto L_0x01c0;
                case 51: goto L_0x01ac;
                case 52: goto L_0x0198;
                case 53: goto L_0x0184;
                case 54: goto L_0x0170;
                case 55: goto L_0x015a;
                case 56: goto L_0x0146;
                case 57: goto L_0x0132;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00df;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b5;
                case 64: goto L_0x00a1;
                case 65: goto L_0x008d;
                case 66: goto L_0x0079;
                case 67: goto L_0x0065;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x051f
        L_0x004d:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            i.c.a.b.g.g.t5 r6 = r11.a((int) r4)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.b(r7, r5, r6)
            goto L_0x051f
        L_0x0065:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = e(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.e(r7, r5)
            goto L_0x051f
        L_0x0079:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = d(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.d((int) r7, (int) r5)
            goto L_0x051f
        L_0x008d:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = e(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.b((int) r7, (long) r5)
            goto L_0x051f
        L_0x00a1:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = d(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (int) r5)
            goto L_0x051f
        L_0x00b5:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = d(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            com.google.android.gms.internal.measurement.zzen r6 = r6.a
            r6.a((int) r7, (int) r5)
            goto L_0x051f
        L_0x00cb:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = d(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.c((int) r7, (int) r5)
            goto L_0x051f
        L_0x00df:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            i.c.a.b.g.g.u2 r5 = (i.c.a.b.g.g.u2) r5
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (i.c.a.b.g.g.u2) r5)
            goto L_0x051f
        L_0x00f5:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            i.c.a.b.g.g.t5 r6 = r11.a((int) r4)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a(r7, r5, r6)
            goto L_0x051f
        L_0x010d:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            a((int) r7, (java.lang.Object) r5, (i.c.a.b.g.g.b7) r13)
            goto L_0x051f
        L_0x011e:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            boolean r5 = f(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (boolean) r5)
            goto L_0x051f
        L_0x0132:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = d(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.b((int) r7, (int) r5)
            goto L_0x051f
        L_0x0146:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = e(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.d((int) r7, (long) r5)
            goto L_0x051f
        L_0x015a:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = d(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            com.google.android.gms.internal.measurement.zzen r6 = r6.a
            r6.a((int) r7, (int) r5)
            goto L_0x051f
        L_0x0170:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = e(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.c((int) r7, (long) r5)
            goto L_0x051f
        L_0x0184:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = e(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r7, (long) r5)
            goto L_0x051f
        L_0x0198:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            float r5 = c(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (float) r5)
            goto L_0x051f
        L_0x01ac:
            boolean r6 = r11.a(r12, (int) r7, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            double r5 = b(r12, (long) r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r7, (double) r5)
            goto L_0x051f
        L_0x01c0:
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            r11.a((i.c.a.b.g.g.b7) r13, (int) r7, (java.lang.Object) r5, (int) r4)
            goto L_0x051f
        L_0x01cb:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.t5 r7 = r11.a((int) r4)
            i.c.a.b.g.g.u5.b((int) r6, (java.util.List<?>) r5, (i.c.a.b.g.g.b7) r13, (i.c.a.b.g.g.t5) r7)
            goto L_0x051f
        L_0x01de:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.e(r6, r5, r13, r9)
            goto L_0x051f
        L_0x01ed:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.j(r6, r5, r13, r9)
            goto L_0x051f
        L_0x01fc:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.g(r6, r5, r13, r9)
            goto L_0x051f
        L_0x020b:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.l(r6, r5, r13, r9)
            goto L_0x051f
        L_0x021a:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.m(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0229:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.i(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0238:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.n(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0247:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.k(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0256:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.f(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0265:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.h(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0274:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.d(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0283:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.c(r6, r5, r13, r9)
            goto L_0x051f
        L_0x0292:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.b((int) r6, (java.util.List<java.lang.Float>) r5, (i.c.a.b.g.g.b7) r13, (boolean) r9)
            goto L_0x051f
        L_0x02a1:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.a((int) r6, (java.util.List<java.lang.Double>) r5, (i.c.a.b.g.g.b7) r13, (boolean) r9)
            goto L_0x051f
        L_0x02b0:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.e(r6, r5, r13, r3)
            goto L_0x051f
        L_0x02bf:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.j(r6, r5, r13, r3)
            goto L_0x051f
        L_0x02ce:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.g(r6, r5, r13, r3)
            goto L_0x051f
        L_0x02dd:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.l(r6, r5, r13, r3)
            goto L_0x051f
        L_0x02ec:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.m(r6, r5, r13, r3)
            goto L_0x051f
        L_0x02fb:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.i(r6, r5, r13, r3)
            goto L_0x051f
        L_0x030a:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.b((int) r6, (java.util.List<i.c.a.b.g.g.u2>) r5, (i.c.a.b.g.g.b7) r13)
            goto L_0x051f
        L_0x0319:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.t5 r7 = r11.a((int) r4)
            i.c.a.b.g.g.u5.a((int) r6, (java.util.List<?>) r5, (i.c.a.b.g.g.b7) r13, (i.c.a.b.g.g.t5) r7)
            goto L_0x051f
        L_0x032c:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.a((int) r6, (java.util.List<java.lang.String>) r5, (i.c.a.b.g.g.b7) r13)
            goto L_0x051f
        L_0x033b:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.n(r6, r5, r13, r3)
            goto L_0x051f
        L_0x034a:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.k(r6, r5, r13, r3)
            goto L_0x051f
        L_0x0359:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.f(r6, r5, r13, r3)
            goto L_0x051f
        L_0x0368:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.h(r6, r5, r13, r3)
            goto L_0x051f
        L_0x0377:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.d(r6, r5, r13, r3)
            goto L_0x051f
        L_0x0386:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.c(r6, r5, r13, r3)
            goto L_0x051f
        L_0x0395:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.b((int) r6, (java.util.List<java.lang.Float>) r5, (i.c.a.b.g.g.b7) r13, (boolean) r3)
            goto L_0x051f
        L_0x03a4:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            i.c.a.b.g.g.u5.a((int) r6, (java.util.List<java.lang.Double>) r5, (i.c.a.b.g.g.b7) r13, (boolean) r3)
            goto L_0x051f
        L_0x03b3:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            i.c.a.b.g.g.t5 r6 = r11.a((int) r4)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.b(r7, r5, r6)
            goto L_0x051f
        L_0x03cb:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = i.c.a.b.g.g.l6.b(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.e(r7, r5)
            goto L_0x051f
        L_0x03df:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r12, (long) r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.d((int) r7, (int) r5)
            goto L_0x051f
        L_0x03f3:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = i.c.a.b.g.g.l6.b(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.b((int) r7, (long) r5)
            goto L_0x051f
        L_0x0407:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r12, (long) r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (int) r5)
            goto L_0x051f
        L_0x041b:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r12, (long) r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            com.google.android.gms.internal.measurement.zzen r6 = r6.a
            r6.a((int) r7, (int) r5)
            goto L_0x051f
        L_0x0431:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r12, (long) r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.c((int) r7, (int) r5)
            goto L_0x051f
        L_0x0445:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            i.c.a.b.g.g.u2 r5 = (i.c.a.b.g.g.u2) r5
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (i.c.a.b.g.g.u2) r5)
            goto L_0x051f
        L_0x045b:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            i.c.a.b.g.g.t5 r6 = r11.a((int) r4)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a(r7, r5, r6)
            goto L_0x051f
        L_0x0473:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = i.c.a.b.g.g.l6.f(r12, r5)
            a((int) r7, (java.lang.Object) r5, (i.c.a.b.g.g.b7) r13)
            goto L_0x051f
        L_0x0484:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            boolean r5 = i.c.a.b.g.g.l6.c(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (boolean) r5)
            goto L_0x051f
        L_0x0498:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r12, (long) r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.b((int) r7, (int) r5)
            goto L_0x051f
        L_0x04ac:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = i.c.a.b.g.g.l6.b(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.d((int) r7, (long) r5)
            goto L_0x051f
        L_0x04bf:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = i.c.a.b.g.g.l6.a((java.lang.Object) r12, (long) r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            com.google.android.gms.internal.measurement.zzen r6 = r6.a
            r6.a((int) r7, (int) r5)
            goto L_0x051f
        L_0x04d4:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = i.c.a.b.g.g.l6.b(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.c((int) r7, (long) r5)
            goto L_0x051f
        L_0x04e7:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = i.c.a.b.g.g.l6.b(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r7, (long) r5)
            goto L_0x051f
        L_0x04fa:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            float r5 = i.c.a.b.g.g.l6.d(r12, r5)
            r6 = r13
            i.c.a.b.g.g.h3 r6 = (i.c.a.b.g.g.h3) r6
            r6.a((int) r7, (float) r5)
            goto L_0x051f
        L_0x050d:
            boolean r6 = r11.a(r12, (int) r4)
            if (r6 == 0) goto L_0x051f
            r5 = r5 & r10
            long r5 = (long) r5
            double r5 = i.c.a.b.g.g.l6.e(r12, r5)
            r8 = r13
            i.c.a.b.g.g.h3 r8 = (i.c.a.b.g.g.h3) r8
            r8.a((int) r7, (double) r5)
        L_0x051f:
            int r4 = r4 + 3
            goto L_0x0033
        L_0x0523:
            i.c.a.b.g.g.k3<?> r12 = r11.f3310o
            r12.a(r0)
            throw r1
        L_0x0529:
            if (r0 != 0) goto L_0x0531
            i.c.a.b.g.g.g6<?, ?> r0 = r11.f3309n
            a(r0, r12, (i.c.a.b.g.g.b7) r13)
            return
        L_0x0531:
            i.c.a.b.g.g.k3<?> r12 = r11.f3310o
            r12.a(r13, r0)
            throw r1
        L_0x0537:
            r11.b(r12, (i.c.a.b.g.g.b7) r13)
            return
        L_0x053b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Object, i.c.a.b.g.g.b7):void");
    }

    public final Object b(int i2) {
        return this.f3300b[(i2 / 3) << 1];
    }

    public final void b(T t) {
        int i2;
        int i3 = this.f3305j;
        while (true) {
            i2 = this.f3306k;
            if (i3 >= i2) {
                break;
            }
            long d2 = (long) (d(this.f3304i[i3]) & 1048575);
            Object f2 = l6.f(t, d2);
            if (f2 != null) {
                l6.a((Object) t, d2, this.f3311p.d(f2));
            }
            i3++;
        }
        int length = this.f3304i.length;
        while (i2 < length) {
            this.f3308m.a(t, (long) this.f3304i[i2]);
            i2++;
        }
        if (((h6) this.f3309n) != null) {
            ((w3) t).zzb.e = false;
            if (!this.f3301f) {
                return;
            }
            if (((m3) this.f3310o) != null) {
                ((w3.d) t).zzc.a();
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void b(T t, T t2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (a(t2, i4, i2)) {
            Object f2 = l6.f(t, j2);
            Object f3 = l6.f(t2, j2);
            if (f2 != null && f3 != null) {
                l6.a((Object) t, j2, y3.a(f2, f3));
                b(t, i4, i2);
            } else if (f3 != null) {
                l6.a((Object) t, j2, f3);
                b(t, i4, i2);
            }
        }
    }

    public final void b(T t, int i2, int i3) {
        l6.f3347f.a((Object) t, (long) (this.a[i3 + 2] & 1048575), i2);
    }

    public static <T> double b(T t, long j2) {
        return ((Double) l6.f(t, j2)).doubleValue();
    }

    public final void b(T t, int i2) {
        if (!this.f3302g) {
            int i3 = this.a[i2 + 2];
            long j2 = (long) (i3 & 1048575);
            l6.f3347f.a((Object) t, j2, l6.a((Object) t, j2) | (1 << (i3 >>> 20)));
        }
    }

    public final c4 c(int i2) {
        return (c4) this.f3300b[((i2 / 3) << 1) + 1];
    }

    public static <T> float c(T t, long j2) {
        return ((Float) l6.f(t, j2)).floatValue();
    }

    public final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    public final <K, V> void a(b7 b7Var, int i2, Object obj, int i3) {
        if (obj != null) {
            this.f3311p.e(this.f3300b[(i3 / 3) << 1]);
            Map<?, ?> c2 = this.f3311p.c(obj);
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                Iterator<Map.Entry<?, ?>> it = c2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    next.getKey();
                    next.getValue();
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    public static <UT, UB> void a(g6<UT, UB> g6Var, T t, b7 b7Var) {
        if (((h6) g6Var) != null) {
            ((w3) t).zzb.a(b7Var);
            return;
        }
        throw null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0426 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ef  */
    public final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, i.c.a.b.g.g.t2 r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = r
            java.lang.Object r11 = r11.getObject(r1, r9)
            i.c.a.b.g.g.d4 r11 = (i.c.a.b.g.g.d4) r11
            boolean r12 = r11.a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            i.c.a.b.g.g.d4 r11 = r11.a(r12)
            sun.misc.Unsafe r12 = r
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r10 = 3
            r14 = 0
            r12 = 2
            switch(r27) {
                case 18: goto L_0x03e8;
                case 19: goto L_0x03aa;
                case 20: goto L_0x0369;
                case 21: goto L_0x0369;
                case 22: goto L_0x034f;
                case 23: goto L_0x0310;
                case 24: goto L_0x02d1;
                case 25: goto L_0x027a;
                case 26: goto L_0x01c7;
                case 27: goto L_0x01ad;
                case 28: goto L_0x0155;
                case 29: goto L_0x034f;
                case 30: goto L_0x0119;
                case 31: goto L_0x02d1;
                case 32: goto L_0x0310;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e8;
                case 36: goto L_0x03aa;
                case 37: goto L_0x0369;
                case 38: goto L_0x0369;
                case 39: goto L_0x034f;
                case 40: goto L_0x0310;
                case 41: goto L_0x02d1;
                case 42: goto L_0x027a;
                case 43: goto L_0x034f;
                case 44: goto L_0x0119;
                case 45: goto L_0x02d1;
                case 46: goto L_0x0310;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0426
        L_0x0040:
            if (r6 != r10) goto L_0x0426
            i.c.a.b.g.g.t5 r1 = r0.a((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = i.c.a.b.d.l.q.a((i.c.a.b.g.g.t5) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (i.c.a.b.g.g.t2) r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0426
            int r8 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r9 = r7.a
            if (r2 != r9) goto L_0x0426
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = i.c.a.b.d.l.q.a((i.c.a.b.g.g.t5) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (i.c.a.b.g.g.t2) r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r12) goto L_0x00a3
            i.c.a.b.g.g.t4 r11 = (i.c.a.b.g.g.t4) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            long r4 = r7.f3453b
            long r4 = i.c.a.b.g.g.e3.a((long) r4)
            r11.a((long) r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0427
        L_0x009e:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0426
            i.c.a.b.g.g.t4 r11 = (i.c.a.b.g.g.t4) r11
            int r1 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            long r8 = r7.f3453b
            long r8 = i.c.a.b.g.g.e3.a((long) r8)
            r11.a((long) r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            int r1 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            long r8 = r7.f3453b
            long r8 = i.c.a.b.g.g.e3.a((long) r8)
            r11.a((long) r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r12) goto L_0x00f0
            i.c.a.b.g.g.z3 r11 = (i.c.a.b.g.g.z3) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r4 = r7.a
            int r4 = i.c.a.b.g.g.e3.a((int) r4)
            r11.d(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0427
        L_0x00eb:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0426
            i.c.a.b.g.g.z3 r11 = (i.c.a.b.g.g.z3) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r4 = r7.a
            int r4 = i.c.a.b.g.g.e3.a((int) r4)
            r11.d(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r4 = r7.a
            int r4 = i.c.a.b.g.g.e3.a((int) r4)
            r11.d(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r12) goto L_0x0120
            int r2 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.d4<?>) r11, (i.c.a.b.g.g.t2) r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0426
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = i.c.a.b.d.l.q.a((int) r2, (byte[]) r3, (int) r4, (int) r5, (i.c.a.b.g.g.d4<?>) r6, (i.c.a.b.g.g.t2) r7)
        L_0x0131:
            i.c.a.b.g.g.w3 r1 = (i.c.a.b.g.g.w3) r1
            i.c.a.b.g.g.i6 r3 = r1.zzb
            i.c.a.b.g.g.i6 r4 = i.c.a.b.g.g.i6.f3317f
            if (r3 != r4) goto L_0x013a
            r3 = 0
        L_0x013a:
            java.lang.Object[] r4 = r0.f3300b
            int r5 = r8 / 3
            int r5 = r5 << r13
            int r5 = r5 + r13
            r4 = r4[r5]
            i.c.a.b.g.g.c4 r4 = (i.c.a.b.g.g.c4) r4
            i.c.a.b.g.g.g6<?, ?> r5 = r0.f3309n
            r6 = r22
            java.lang.Object r3 = i.c.a.b.g.g.u5.a(r6, r11, r4, r3, r5)
            i.c.a.b.g.g.i6 r3 = (i.c.a.b.g.g.i6) r3
            if (r3 == 0) goto L_0x0152
            r1.zzb = r3
        L_0x0152:
            r1 = r2
            goto L_0x0427
        L_0x0155:
            if (r6 != r12) goto L_0x0426
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01a8
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a3
            if (r4 != 0) goto L_0x016b
            i.c.a.b.g.g.u2 r4 = i.c.a.b.g.g.u2.f3471f
            r11.add(r4)
            goto L_0x0173
        L_0x016b:
            i.c.a.b.g.g.u2 r6 = i.c.a.b.g.g.u2.a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
        L_0x0172:
            int r1 = r1 + r4
        L_0x0173:
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x019e
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0199
            if (r4 != 0) goto L_0x0191
            i.c.a.b.g.g.u2 r4 = i.c.a.b.g.g.u2.f3471f
            r11.add(r4)
            goto L_0x0173
        L_0x0191:
            i.c.a.b.g.g.u2 r6 = i.c.a.b.g.g.u2.a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            goto L_0x0172
        L_0x0199:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x019e:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.b()
            throw r1
        L_0x01a3:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x01a8:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.b()
            throw r1
        L_0x01ad:
            if (r6 != r12) goto L_0x0426
            i.c.a.b.g.g.t5 r1 = r0.a((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = i.c.a.b.d.l.q.a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0427
        L_0x01c7:
            if (r6 != r12) goto L_0x0426
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x021a
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0215
            if (r6 != 0) goto L_0x01e2
            r11.add(r1)
            goto L_0x01ed
        L_0x01e2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = i.c.a.b.g.g.y3.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01ec:
            int r4 = r4 + r6
        L_0x01ed:
            if (r4 >= r5) goto L_0x0426
            int r6 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0426
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r6, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0210
            if (r6 != 0) goto L_0x0205
            r11.add(r1)
            goto L_0x01ed
        L_0x0205:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = i.c.a.b.g.g.y3.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01ec
        L_0x0210:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.b()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.b()
            throw r1
        L_0x021a:
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0275
            if (r6 != 0) goto L_0x0228
            r11.add(r1)
            goto L_0x023b
        L_0x0228:
            int r8 = r4 + r6
            boolean r9 = i.c.a.b.g.g.o6.a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x0270
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = i.c.a.b.g.g.y3.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x023a:
            r4 = r8
        L_0x023b:
            if (r4 >= r5) goto L_0x0426
            int r6 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0426
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r6, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x026b
            if (r6 != 0) goto L_0x0253
            r11.add(r1)
            goto L_0x023b
        L_0x0253:
            int r8 = r4 + r6
            boolean r9 = i.c.a.b.g.g.o6.a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x0266
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = i.c.a.b.g.g.y3.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x023a
        L_0x0266:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.f()
            throw r1
        L_0x026b:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.b()
            throw r1
        L_0x0270:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.f()
            throw r1
        L_0x0275:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.b()
            throw r1
        L_0x027a:
            r1 = 0
            if (r6 != r12) goto L_0x02a2
            i.c.a.b.g.g.s2 r11 = (i.c.a.b.g.g.s2) r11
            int r2 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r4 = r7.a
            int r4 = r4 + r2
        L_0x0286:
            if (r2 >= r4) goto L_0x0299
            int r2 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r2, (i.c.a.b.g.g.t2) r7)
            long r5 = r7.f3453b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0294
            r5 = 1
            goto L_0x0295
        L_0x0294:
            r5 = 0
        L_0x0295:
            r11.a((boolean) r5)
            goto L_0x0286
        L_0x0299:
            if (r2 != r4) goto L_0x029d
            goto L_0x0152
        L_0x029d:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x02a2:
            if (r6 != 0) goto L_0x0426
            i.c.a.b.g.g.s2 r11 = (i.c.a.b.g.g.s2) r11
            int r4 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            long r8 = r7.f3453b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02b2
            r6 = 1
            goto L_0x02b3
        L_0x02b2:
            r6 = 0
        L_0x02b3:
            r11.a((boolean) r6)
        L_0x02b6:
            if (r4 >= r5) goto L_0x0426
            int r6 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0426
            int r4 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r6, (i.c.a.b.g.g.t2) r7)
            long r8 = r7.f3453b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02cc
            r6 = 1
            goto L_0x02cd
        L_0x02cc:
            r6 = 0
        L_0x02cd:
            r11.a((boolean) r6)
            goto L_0x02b6
        L_0x02d1:
            if (r6 != r12) goto L_0x02f1
            i.c.a.b.g.g.z3 r11 = (i.c.a.b.g.g.z3) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02dc:
            if (r1 >= r2) goto L_0x02e8
            int r4 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r1)
            r11.d(r4)
            int r1 = r1 + 4
            goto L_0x02dc
        L_0x02e8:
            if (r1 != r2) goto L_0x02ec
            goto L_0x0427
        L_0x02ec:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x02f1:
            if (r6 != r9) goto L_0x0426
            i.c.a.b.g.g.z3 r11 = (i.c.a.b.g.g.z3) r11
            int r1 = i.c.a.b.d.l.q.b((byte[]) r18, (int) r19)
            r11.d(r1)
        L_0x02fc:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            int r1 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4)
            r11.d(r1)
            goto L_0x02fc
        L_0x0310:
            if (r6 != r12) goto L_0x0330
            i.c.a.b.g.g.t4 r11 = (i.c.a.b.g.g.t4) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x031b:
            if (r1 >= r2) goto L_0x0327
            long r4 = i.c.a.b.d.l.q.c((byte[]) r3, (int) r1)
            r11.a((long) r4)
            int r1 = r1 + 8
            goto L_0x031b
        L_0x0327:
            if (r1 != r2) goto L_0x032b
            goto L_0x0427
        L_0x032b:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x0330:
            if (r6 != r13) goto L_0x0426
            i.c.a.b.g.g.t4 r11 = (i.c.a.b.g.g.t4) r11
            long r8 = i.c.a.b.d.l.q.c((byte[]) r18, (int) r19)
            r11.a((long) r8)
        L_0x033b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            long r8 = i.c.a.b.d.l.q.c((byte[]) r3, (int) r4)
            r11.a((long) r8)
            goto L_0x033b
        L_0x034f:
            if (r6 != r12) goto L_0x0357
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.d4<?>) r11, (i.c.a.b.g.g.t2) r7)
            goto L_0x0427
        L_0x0357:
            if (r6 != 0) goto L_0x0426
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = i.c.a.b.d.l.q.a((int) r21, (byte[]) r22, (int) r23, (int) r24, (i.c.a.b.g.g.d4<?>) r25, (i.c.a.b.g.g.t2) r26)
            goto L_0x0427
        L_0x0369:
            if (r6 != r12) goto L_0x0389
            i.c.a.b.g.g.t4 r11 = (i.c.a.b.g.g.t4) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0374:
            if (r1 >= r2) goto L_0x0380
            int r1 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            long r4 = r7.f3453b
            r11.a((long) r4)
            goto L_0x0374
        L_0x0380:
            if (r1 != r2) goto L_0x0384
            goto L_0x0427
        L_0x0384:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x0389:
            if (r6 != 0) goto L_0x0426
            i.c.a.b.g.g.t4 r11 = (i.c.a.b.g.g.t4) r11
            int r1 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            long r8 = r7.f3453b
            r11.a((long) r8)
        L_0x0396:
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            int r1 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            long r8 = r7.f3453b
            r11.a((long) r8)
            goto L_0x0396
        L_0x03aa:
            if (r6 != r12) goto L_0x03c9
            i.c.a.b.g.g.v3 r11 = (i.c.a.b.g.g.v3) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03b5:
            if (r1 >= r2) goto L_0x03c1
            float r4 = i.c.a.b.d.l.q.e((byte[]) r3, (int) r1)
            r11.a((float) r4)
            int r1 = r1 + 4
            goto L_0x03b5
        L_0x03c1:
            if (r1 != r2) goto L_0x03c4
            goto L_0x0427
        L_0x03c4:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x03c9:
            if (r6 != r9) goto L_0x0426
            i.c.a.b.g.g.v3 r11 = (i.c.a.b.g.g.v3) r11
            float r1 = i.c.a.b.d.l.q.e((byte[]) r18, (int) r19)
            r11.a((float) r1)
        L_0x03d4:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            float r1 = i.c.a.b.d.l.q.e((byte[]) r3, (int) r4)
            r11.a((float) r1)
            goto L_0x03d4
        L_0x03e8:
            if (r6 != r12) goto L_0x0407
            i.c.a.b.g.g.g3 r11 = (i.c.a.b.g.g.g3) r11
            int r1 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03f3:
            if (r1 >= r2) goto L_0x03ff
            double r4 = i.c.a.b.d.l.q.d((byte[]) r3, (int) r1)
            r11.a((double) r4)
            int r1 = r1 + 8
            goto L_0x03f3
        L_0x03ff:
            if (r1 != r2) goto L_0x0402
            goto L_0x0427
        L_0x0402:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r1
        L_0x0407:
            if (r6 != r13) goto L_0x0426
            i.c.a.b.g.g.g3 r11 = (i.c.a.b.g.g.g3) r11
            double r8 = i.c.a.b.d.l.q.d((byte[]) r18, (int) r19)
            r11.a((double) r8)
        L_0x0412:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0427
            int r4 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r1, (i.c.a.b.g.g.t2) r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0427
            double r8 = i.c.a.b.d.l.q.d((byte[]) r3, (int) r4)
            r11.a((double) r8)
            goto L_0x0412
        L_0x0426:
            r1 = r4
        L_0x0427:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, i.c.a.b.g.g.t2):int");
    }

    public final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, t2 t2Var) {
        Unsafe unsafe = r;
        Object obj = this.f3300b[(i4 / 3) << 1];
        Object object = unsafe.getObject(t, j2);
        if (this.f3311p.b(object)) {
            Object f2 = this.f3311p.f(obj);
            this.f3311p.a(f2, object);
            unsafe.putObject(t, j2, f2);
            object = f2;
        }
        this.f3311p.e(obj);
        this.f3311p.a(object);
        int a2 = q.a(bArr, i2, t2Var);
        int i5 = t2Var.a;
        if (i5 < 0 || i5 > i3 - a2) {
            throw zzfo.a();
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0191, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a1, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a3, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, i.c.a.b.g.g.t2 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = r
            int[] r7 = r0.a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 3
            r15 = 1
            switch(r25) {
                case 51: goto L_0x0194;
                case 52: goto L_0x0183;
                case 53: goto L_0x0173;
                case 54: goto L_0x0173;
                case 55: goto L_0x0163;
                case 56: goto L_0x0155;
                case 57: goto L_0x0146;
                case 58: goto L_0x012e;
                case 59: goto L_0x00f9;
                case 60: goto L_0x00ca;
                case 61: goto L_0x00bc;
                case 62: goto L_0x0163;
                case 63: goto L_0x0089;
                case 64: goto L_0x0146;
                case 65: goto L_0x0155;
                case 66: goto L_0x0074;
                case 67: goto L_0x005f;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a7
        L_0x0028:
            if (r5 != r7) goto L_0x01a7
            r2 = r2 & -8
            r7 = r2 | 4
            i.c.a.b.g.g.t5 r2 = r0.a((int) r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = i.c.a.b.d.l.q.a((i.c.a.b.g.g.t5) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (i.c.a.b.g.g.t2) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004a
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004b
        L_0x004a:
            r15 = 0
        L_0x004b:
            if (r15 != 0) goto L_0x0054
            java.lang.Object r3 = r11.c
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x0054:
            java.lang.Object r3 = r11.c
            java.lang.Object r3 = i.c.a.b.g.g.y3.a((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x005f:
            if (r5 != 0) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r11)
            long r3 = r11.f3453b
            long r3 = i.c.a.b.g.g.e3.a((long) r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x0074:
            if (r5 != 0) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r11)
            int r3 = r11.a
            int r3 = i.c.a.b.g.g.e3.a((int) r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x0089:
            if (r5 != 0) goto L_0x01a7
            int r3 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r11)
            int r4 = r11.a
            java.lang.Object[] r5 = r0.f3300b
            int r6 = r6 / r7
            int r6 = r6 << r15
            int r6 = r6 + r15
            r5 = r5[r6]
            i.c.a.b.g.g.c4 r5 = (i.c.a.b.g.g.c4) r5
            if (r5 == 0) goto L_0x00b2
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x00a3
            goto L_0x00b2
        L_0x00a3:
            i.c.a.b.g.g.i6 r1 = e((java.lang.Object) r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.a(r2, r4)
            r2 = r3
            goto L_0x01a8
        L_0x00b2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x01a3
        L_0x00bc:
            r2 = 2
            if (r5 != r2) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.e(r3, r4, r11)
            java.lang.Object r3 = r11.c
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x00ca:
            r2 = 2
            if (r5 != r2) goto L_0x01a7
            i.c.a.b.g.g.t5 r2 = r0.a((int) r6)
            r5 = r20
            int r2 = i.c.a.b.d.l.q.a((i.c.a.b.g.g.t5) r2, (byte[]) r3, (int) r4, (int) r5, (i.c.a.b.g.g.t2) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00e2
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00e3
        L_0x00e2:
            r15 = 0
        L_0x00e3:
            if (r15 != 0) goto L_0x00eb
            java.lang.Object r3 = r11.c
            r12.putObject(r1, r9, r3)
            goto L_0x00f4
        L_0x00eb:
            java.lang.Object r3 = r11.c
            java.lang.Object r3 = i.c.a.b.g.g.y3.a((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
        L_0x00f4:
            r12.putInt(r1, r13, r8)
            goto L_0x01a8
        L_0x00f9:
            r2 = 2
            if (r5 != r2) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x010a
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0129
        L_0x010a:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x011e
            int r5 = r2 + r4
            boolean r5 = i.c.a.b.g.g.o6.a((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x0119
            goto L_0x011e
        L_0x0119:
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.f()
            throw r1
        L_0x011e:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = i.c.a.b.g.g.y3.a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0129:
            r12.putInt(r1, r13, r8)
            goto L_0x01a8
        L_0x012e:
            if (r5 != 0) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r11)
            long r3 = r11.f3453b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r15 = 0
        L_0x013e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x0146:
            r2 = 5
            if (r5 != r2) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.b((byte[]) r18, (int) r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x0191
        L_0x0155:
            if (r5 != r15) goto L_0x01a7
            long r2 = i.c.a.b.d.l.q.c((byte[]) r18, (int) r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x01a1
        L_0x0163:
            if (r5 != 0) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.a((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r11)
            int r3 = r11.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x0173:
            if (r5 != 0) goto L_0x01a7
            int r2 = i.c.a.b.d.l.q.b((byte[]) r3, (int) r4, (i.c.a.b.g.g.t2) r11)
            long r3 = r11.f3453b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a3
        L_0x0183:
            r2 = 5
            if (r5 != r2) goto L_0x01a7
            float r2 = i.c.a.b.d.l.q.e((byte[]) r18, (int) r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x0191:
            int r2 = r4 + 4
            goto L_0x01a3
        L_0x0194:
            if (r5 != r15) goto L_0x01a7
            double r2 = i.c.a.b.d.l.q.d((byte[]) r18, (int) r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x01a1:
            int r2 = r4 + 8
        L_0x01a3:
            r12.putInt(r1, r13, r8)
            goto L_0x01a8
        L_0x01a7:
            r2 = r4
        L_0x01a8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, i.c.a.b.g.g.t2):int");
    }

    public final t5 a(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.f3300b;
        t5 t5Var = (t5) objArr[i3];
        if (t5Var != null) {
            return t5Var;
        }
        t5 a2 = o5.c.a((Class) objArr[i3 + 1]);
        this.f3300b[i3] = a2;
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0330, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0332, code lost:
        r10 = r0;
        r0 = r8 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0336, code lost:
        r8 = r0;
        r24 = r5;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x033a, code lost:
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x033d, code lost:
        r1 = r37;
        r3 = r5;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        r7 = r19;
        r9 = r21;
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c8, code lost:
        r8 = r8 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01cb, code lost:
        r24 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0274, code lost:
        r8 = r8 | r25;
        r1 = r37;
        r13 = r38;
        r3 = r4;
        r4 = r7;
        r5 = r9;
        r16 = r15;
        r7 = r19;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0286, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x046c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r33, byte[] r34, int r35, int r36, int r37, i.c.a.b.g.g.t2 r38) {
        /*
            r32 = this;
            r15 = r32
            r14 = r34
            r12 = r36
            r13 = r38
            sun.misc.Unsafe r11 = r
            r6 = r33
            r0 = r35
            r1 = r37
            r4 = r13
            r5 = r15
            r2 = -1
            r3 = 0
            r7 = -1
            r8 = 0
            r16 = 0
        L_0x0018:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r18 = 0
            if (r0 >= r12) goto L_0x0501
            int r10 = r0 + 1
            byte r0 = r14[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = i.c.a.b.d.l.q.a((int) r0, (byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r4)
            int r10 = r4.a
            r31 = r10
            r10 = r0
            r0 = r31
        L_0x0030:
            int r9 = r0 >>> 3
            r13 = r0 & 7
            r16 = r0
            r0 = 3
            if (r9 <= r2) goto L_0x0049
            int r3 = r3 / r0
            int r2 = r5.c
            if (r9 < r2) goto L_0x0047
            int r2 = r5.d
            if (r9 > r2) goto L_0x0047
            int r2 = r5.a((int) r9, (int) r3)
            goto L_0x0058
        L_0x0047:
            r3 = 0
            goto L_0x0057
        L_0x0049:
            int r2 = r5.c
            if (r9 < r2) goto L_0x0047
            int r2 = r5.d
            if (r9 > r2) goto L_0x0047
            r3 = 0
            int r2 = r5.a((int) r9, (int) r3)
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            r3 = -1
            if (r2 != r3) goto L_0x0067
            r21 = r9
            r15 = r16
            r3 = 0
            r4 = 1
            r16 = 0
            r20 = -1
            goto L_0x0342
        L_0x0067:
            int[] r1 = r5.a
            int r3 = r2 + 1
            r3 = r1[r3]
            r21 = 267386880(0xff00000, float:2.3665827E-29)
            r21 = r3 & r21
            int r0 = r21 >>> 20
            r21 = r4
            r4 = r3 & r17
            long r14 = (long) r4
            r4 = 17
            r23 = r3
            if (r0 > r4) goto L_0x034f
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r24 = 1
            int r25 = r24 << r4
            r1 = r1 & r17
            if (r1 == r7) goto L_0x0099
            r4 = -1
            if (r7 == r4) goto L_0x0093
            long r3 = (long) r7
            r11.putInt(r6, r3, r8)
        L_0x0093:
            long r3 = (long) r1
            int r8 = r11.getInt(r6, r3)
            r7 = r1
        L_0x0099:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x0315;
                case 1: goto L_0x02f4;
                case 2: goto L_0x02cc;
                case 3: goto L_0x02cc;
                case 4: goto L_0x02ad;
                case 5: goto L_0x0289;
                case 6: goto L_0x0258;
                case 7: goto L_0x022e;
                case 8: goto L_0x0205;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01ab;
                case 11: goto L_0x02ad;
                case 12: goto L_0x016b;
                case 13: goto L_0x0258;
                case 14: goto L_0x0289;
                case 15: goto L_0x0149;
                case 16: goto L_0x0106;
                case 17: goto L_0x00ad;
                default: goto L_0x009d;
            }
        L_0x009d:
            r14 = r34
            r5 = r2
            r19 = r7
            r21 = r9
            r15 = r16
            r4 = 1
            r16 = 0
            r20 = -1
            goto L_0x033d
        L_0x00ad:
            r0 = 3
            if (r13 != r0) goto L_0x00f6
            int r0 = r9 << 3
            r4 = r0 | 4
            i.c.a.b.g.g.t5 r0 = r5.a((int) r2)
            r13 = r16
            r1 = r34
            r3 = r2
            r2 = r10
            r10 = r3
            r16 = 0
            r3 = r36
            r19 = r7
            r7 = r21
            r20 = -1
            r21 = r9
            r9 = r5
            r5 = r38
            int r0 = i.c.a.b.d.l.q.a((i.c.a.b.g.g.t5) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (i.c.a.b.g.g.t2) r5)
            r1 = r8 & r25
            if (r1 != 0) goto L_0x00dc
            java.lang.Object r1 = r7.c
            r11.putObject(r6, r14, r1)
            goto L_0x00e9
        L_0x00dc:
            java.lang.Object r1 = r11.getObject(r6, r14)
            java.lang.Object r2 = r7.c
            java.lang.Object r1 = i.c.a.b.g.g.y3.a((java.lang.Object) r1, (java.lang.Object) r2)
            r11.putObject(r6, r14, r1)
        L_0x00e9:
            r1 = r8 | r25
            r12 = r38
            r8 = r1
            r4 = r7
            r5 = r9
            r24 = r10
            r30 = r11
            r10 = r13
            goto L_0x013a
        L_0x00f6:
            r19 = r7
            r21 = r9
            r13 = r16
            r16 = 0
            r20 = -1
            r14 = r34
            r5 = r2
            r15 = r13
            goto L_0x0313
        L_0x0106:
            r4 = r2
            r19 = r7
            r7 = r21
            r20 = -1
            r21 = r9
            r9 = r5
            r5 = r16
            r16 = 0
            if (r13 != 0) goto L_0x0144
            r2 = r14
            r14 = r34
            int r10 = i.c.a.b.d.l.q.b((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
            long r0 = r7.f3453b
            long r17 = i.c.a.b.g.g.e3.a((long) r0)
            r0 = r11
            r1 = r33
            r13 = r4
            r15 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r8 | r25
            r12 = r38
            r8 = r0
            r4 = r7
            r5 = r9
            r0 = r10
            r30 = r11
            r24 = r13
            r10 = r15
        L_0x013a:
            r7 = r19
            r9 = r21
            r20 = 0
            r11 = r32
            goto L_0x04f0
        L_0x0144:
            r14 = r34
            r15 = r5
            goto L_0x0286
        L_0x0149:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != 0) goto L_0x0286
            int r0 = i.c.a.b.d.l.q.a((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
            int r1 = r7.a
            int r1 = i.c.a.b.g.g.e3.a((int) r1)
            r11.putInt(r6, r2, r1)
            goto L_0x01c8
        L_0x016b:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != 0) goto L_0x0286
            int r0 = i.c.a.b.d.l.q.a((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
            int r1 = r7.a
            i.c.a.b.g.g.c4 r5 = r9.c((int) r4)
            if (r5 == 0) goto L_0x01a2
            boolean r5 = r5.a(r1)
            if (r5 == 0) goto L_0x0191
            goto L_0x01a2
        L_0x0191:
            i.c.a.b.g.g.i6 r2 = e((java.lang.Object) r33)
            r35 = r0
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.a(r15, r0)
        L_0x019f:
            r0 = r35
            goto L_0x01cb
        L_0x01a2:
            r35 = r0
            r11.putInt(r6, r2, r1)
            r0 = r8 | r25
            r8 = r0
            goto L_0x019f
        L_0x01ab:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r0 = 2
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != r0) goto L_0x0286
            int r0 = i.c.a.b.d.l.q.e(r14, r10, r7)
            java.lang.Object r1 = r7.c
            r11.putObject(r6, r2, r1)
        L_0x01c8:
            r1 = r8 | r25
            r8 = r1
        L_0x01cb:
            r24 = r4
            goto L_0x033a
        L_0x01cf:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r0 = 2
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != r0) goto L_0x0286
            i.c.a.b.g.g.t5 r0 = r9.a((int) r4)
            int r0 = i.c.a.b.d.l.q.a((i.c.a.b.g.g.t5) r0, (byte[]) r14, (int) r10, (int) r12, (i.c.a.b.g.g.t2) r7)
            r1 = r8 & r25
            if (r1 != 0) goto L_0x01f6
            java.lang.Object r1 = r7.c
            r11.putObject(r6, r2, r1)
            goto L_0x0274
        L_0x01f6:
            java.lang.Object r1 = r11.getObject(r6, r2)
            java.lang.Object r5 = r7.c
            java.lang.Object r1 = i.c.a.b.g.g.y3.a((java.lang.Object) r1, (java.lang.Object) r5)
            r11.putObject(r6, r2, r1)
            goto L_0x0274
        L_0x0205:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r0 = 2
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != r0) goto L_0x0286
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0224
            int r0 = i.c.a.b.d.l.q.c((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
            goto L_0x0228
        L_0x0224:
            int r0 = i.c.a.b.d.l.q.d((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
        L_0x0228:
            java.lang.Object r1 = r7.c
            r11.putObject(r6, r2, r1)
            goto L_0x0274
        L_0x022e:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != 0) goto L_0x0286
            int r0 = i.c.a.b.d.l.q.b((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
            r5 = r0
            long r0 = r7.f3453b
            r17 = 0
            int r10 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x0250
            r10 = 1
            goto L_0x0251
        L_0x0250:
            r10 = 0
        L_0x0251:
            i.c.a.b.g.g.l6$d r0 = i.c.a.b.g.g.l6.f3347f
            r0.a((java.lang.Object) r6, (long) r2, (boolean) r10)
            r0 = r5
            goto L_0x0274
        L_0x0258:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != r1) goto L_0x0286
            int r0 = i.c.a.b.d.l.q.b((byte[]) r14, (int) r10)
            r11.putInt(r6, r2, r0)
            int r0 = r10 + 4
        L_0x0274:
            r1 = r8 | r25
            r8 = r1
            r1 = r37
            r13 = r38
            r3 = r4
            r4 = r7
            r5 = r9
            r16 = r15
            r7 = r19
            r2 = r21
            goto L_0x03ac
        L_0x0286:
            r5 = r4
            goto L_0x0313
        L_0x0289:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r0 = 1
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != r0) goto L_0x0286
            long r17 = i.c.a.b.d.l.q.c((byte[]) r14, (int) r10)
            r0 = r11
            r1 = r33
            r13 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r13
            goto L_0x0330
        L_0x02ad:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != 0) goto L_0x0286
            int r0 = i.c.a.b.d.l.q.a((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
            int r1 = r7.a
            r11.putInt(r6, r2, r1)
            r5 = r4
            goto L_0x0332
        L_0x02cc:
            r4 = r2
            r19 = r7
            r2 = r14
            r15 = r16
            r7 = r21
            r16 = 0
            r20 = -1
            r14 = r34
            r21 = r9
            r9 = r5
            if (r13 != 0) goto L_0x0286
            int r10 = i.c.a.b.d.l.q.b((byte[]) r14, (int) r10, (i.c.a.b.g.g.t2) r7)
            long r0 = r7.f3453b
            r17 = r0
            r0 = r11
            r1 = r33
            r13 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r8 | r25
            r5 = r13
            goto L_0x0336
        L_0x02f4:
            r19 = r7
            r7 = r21
            r20 = -1
            r21 = r9
            r9 = r5
            r5 = r2
            r2 = r14
            r15 = r16
            r16 = 0
            r14 = r34
            if (r13 != r1) goto L_0x0313
            float r0 = i.c.a.b.d.l.q.e((byte[]) r14, (int) r10)
            i.c.a.b.g.g.l6$d r1 = i.c.a.b.g.g.l6.f3347f
            r1.a((java.lang.Object) r6, (long) r2, (float) r0)
            int r0 = r10 + 4
            goto L_0x0332
        L_0x0313:
            r4 = 1
            goto L_0x033d
        L_0x0315:
            r19 = r7
            r7 = r21
            r4 = 1
            r20 = -1
            r21 = r9
            r9 = r5
            r5 = r2
            r2 = r14
            r15 = r16
            r16 = 0
            r14 = r34
            if (r13 != r4) goto L_0x033d
            double r0 = i.c.a.b.d.l.q.d((byte[]) r14, (int) r10)
            i.c.a.b.g.g.l6.a((java.lang.Object) r6, (long) r2, (double) r0)
        L_0x0330:
            int r0 = r10 + 8
        L_0x0332:
            r1 = r8 | r25
            r10 = r0
            r0 = r1
        L_0x0336:
            r8 = r0
            r24 = r5
            r0 = r10
        L_0x033a:
            r10 = r6
            goto L_0x039d
        L_0x033d:
            r1 = r37
            r3 = r5
            r7 = r19
        L_0x0342:
            r6 = r1
            r24 = r3
            r2 = r10
            r30 = r11
            r10 = r15
            r20 = 0
            r29 = 1
            goto L_0x046a
        L_0x034f:
            r22 = r7
            r7 = r21
            r4 = 1
            r20 = -1
            r21 = r9
            r9 = r5
            r5 = r2
            r2 = r14
            r15 = r16
            r16 = 0
            r14 = r34
            r1 = 27
            if (r0 != r1) goto L_0x03bf
            r1 = 2
            if (r13 != r1) goto L_0x03b0
            java.lang.Object r0 = r11.getObject(r6, r2)
            i.c.a.b.g.g.d4 r0 = (i.c.a.b.g.g.d4) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0386
            int r1 = r0.size()
            if (r1 != 0) goto L_0x037d
            r1 = 10
            goto L_0x037f
        L_0x037d:
            int r1 = r1 << 1
        L_0x037f:
            i.c.a.b.g.g.d4 r0 = r0.a(r1)
            r11.putObject(r6, r2, r0)
        L_0x0386:
            r13 = r0
            i.c.a.b.g.g.t5 r0 = r9.a((int) r5)
            r1 = r15
            r2 = r34
            r3 = r10
            r4 = r36
            r24 = r5
            r5 = r13
            r10 = r6
            r6 = r38
            int r0 = i.c.a.b.d.l.q.a(r0, r1, r2, r3, r4, r5, r6)
            r19 = r22
        L_0x039d:
            r1 = r37
            r13 = r38
            r4 = r7
            r5 = r9
            r6 = r10
            r16 = r15
            r7 = r19
            r2 = r21
            r3 = r24
        L_0x03ac:
            r15 = r32
            goto L_0x0018
        L_0x03b0:
            r24 = r5
            r23 = r8
            r30 = r11
            r16 = r15
            r20 = 0
            r29 = 1
            r15 = r10
            goto L_0x0430
        L_0x03bf:
            r24 = r5
            r1 = 49
            if (r0 > r1) goto L_0x0416
            r5 = r23
            long r6 = (long) r5
            r9 = r0
            r0 = r32
            r1 = r33
            r25 = r2
            r2 = r34
            r3 = r10
            r19 = 1
            r4 = r36
            r5 = r15
            r27 = r6
            r6 = r21
            r7 = r13
            r23 = r8
            r8 = r24
            r35 = r9
            r13 = r10
            r20 = 0
            r29 = 1
            r9 = r27
            r30 = r11
            r11 = r35
            r16 = r15
            r15 = r13
            r12 = r25
            r14 = r38
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (i.c.a.b.g.g.t2) r14)
            if (r0 != r15) goto L_0x03fc
            goto L_0x0460
        L_0x03fc:
            r5 = r32
            r15 = r5
            r6 = r33
            r14 = r34
            r12 = r36
            r1 = r37
            r4 = r38
            r13 = r4
            r2 = r21
            r7 = r22
            r8 = r23
            r3 = r24
            r11 = r30
            goto L_0x0018
        L_0x0416:
            r35 = r0
            r25 = r2
            r30 = r11
            r16 = r15
            r5 = r23
            r20 = 0
            r29 = 1
            r23 = r8
            r15 = r10
            r0 = 50
            r9 = r35
            if (r9 != r0) goto L_0x0445
            r0 = 2
            if (r13 == r0) goto L_0x0432
        L_0x0430:
            r10 = r15
            goto L_0x0461
        L_0x0432:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r24
            r6 = r25
            r8 = r38
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (i.c.a.b.g.g.t2) r8)
            throw r18
        L_0x0445:
            r0 = r32
            r1 = r33
            r2 = r34
            r8 = r5
            r3 = r15
            r4 = r36
            r5 = r16
            r6 = r21
            r7 = r13
            r10 = r25
            r12 = r24
            r13 = r38
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (i.c.a.b.g.g.t2) r13)
            if (r0 != r15) goto L_0x04e0
        L_0x0460:
            r10 = r0
        L_0x0461:
            r6 = r37
            r2 = r10
            r10 = r16
            r7 = r22
            r8 = r23
        L_0x046a:
            if (r10 != r6) goto L_0x047a
            if (r6 != 0) goto L_0x046f
            goto L_0x047a
        L_0x046f:
            r5 = r32
            r3 = -1
            r11 = r5
            r0 = r2
            r1 = r6
            r2 = r10
            r10 = r33
            goto L_0x050f
        L_0x047a:
            r11 = r32
            boolean r0 = r11.f3301f
            if (r0 == 0) goto L_0x04bc
            r12 = r38
            i.c.a.b.g.g.i3 r0 = r12.d
            i.c.a.b.g.g.i3 r1 = i.c.a.b.g.g.i3.a()
            if (r0 == r1) goto L_0x04be
            i.c.a.b.g.g.f5 r0 = r11.e
            i.c.a.b.g.g.i3 r1 = r12.d
            java.util.Map<i.c.a.b.g.g.i3$a, i.c.a.b.g.g.w3$f<?, ?>> r1 = r1.a
            i.c.a.b.g.g.i3$a r3 = new i.c.a.b.g.g.i3$a
            r9 = r21
            r3.<init>(r0, r9)
            java.lang.Object r0 = r1.get(r3)
            i.c.a.b.g.g.w3$f r0 = (i.c.a.b.g.g.w3.f) r0
            if (r0 != 0) goto L_0x04af
            i.c.a.b.g.g.i6 r4 = e((java.lang.Object) r33)
            r0 = r10
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = i.c.a.b.d.l.q.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (i.c.a.b.g.g.i6) r4, (i.c.a.b.g.g.t2) r5)
            goto L_0x04cf
        L_0x04af:
            r0 = r33
            i.c.a.b.g.g.w3$d r0 = (i.c.a.b.g.g.w3.d) r0
            r0.a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x04bc:
            r12 = r38
        L_0x04be:
            r9 = r21
            i.c.a.b.g.g.i6 r4 = e((java.lang.Object) r33)
            r0 = r10
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = i.c.a.b.d.l.q.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (i.c.a.b.g.g.i6) r4, (i.c.a.b.g.g.t2) r5)
        L_0x04cf:
            r14 = r34
            r1 = r6
            r2 = r9
            r16 = r10
            r5 = r11
            r15 = r5
            r4 = r12
            r13 = r4
            r3 = r24
            r11 = r30
            r6 = r33
            goto L_0x04fd
        L_0x04e0:
            r11 = r32
            r12 = r38
            r10 = r16
            r9 = r21
            r6 = r33
            r5 = r11
            r4 = r12
            r7 = r22
            r8 = r23
        L_0x04f0:
            r14 = r34
            r1 = r37
            r2 = r9
            r16 = r10
            r15 = r11
            r13 = r12
            r3 = r24
            r11 = r30
        L_0x04fd:
            r12 = r36
            goto L_0x0018
        L_0x0501:
            r9 = r5
            r10 = r6
            r22 = r7
            r23 = r8
            r30 = r11
            r11 = r15
            r29 = 1
            r2 = r16
            r3 = -1
        L_0x050f:
            if (r7 == r3) goto L_0x0517
            long r3 = (long) r7
            r6 = r30
            r6.putInt(r10, r3, r8)
        L_0x0517:
            int r3 = r5.f3305j
        L_0x0519:
            int r4 = r5.f3306k
            if (r3 >= r4) goto L_0x0589
            int[] r4 = r5.f3304i
            r4 = r4[r3]
            i.c.a.b.g.g.g6<?, ?> r6 = r5.f3309n
            int[] r7 = r5.a
            r8 = r7[r4]
            int r8 = r4 + 1
            r7 = r7[r8]
            r7 = r7 & r17
            long r7 = (long) r7
            java.lang.Object r7 = i.c.a.b.g.g.l6.f(r10, r7)
            if (r7 != 0) goto L_0x0535
            goto L_0x0586
        L_0x0535:
            java.lang.Object[] r8 = r5.f3300b
            int r4 = r4 / 3
            int r4 = r4 << 1
            int r9 = r4 + 1
            r8 = r8[r9]
            i.c.a.b.g.g.c4 r8 = (i.c.a.b.g.g.c4) r8
            if (r8 != 0) goto L_0x0544
            goto L_0x0586
        L_0x0544:
            i.c.a.b.g.g.y4 r9 = r5.f3311p
            java.util.Map r7 = r9.a(r7)
            i.c.a.b.g.g.y4 r9 = r5.f3311p
            java.lang.Object[] r12 = r5.f3300b
            r4 = r12[r4]
            r9.e(r4)
            java.util.Set r4 = r7.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x055b:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0586
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getValue()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r9 = r8.a(r9)
            if (r9 != 0) goto L_0x055b
            i.c.a.b.g.g.h6 r6 = (i.c.a.b.g.g.h6) r6
            if (r6 == 0) goto L_0x0585
            i.c.a.b.g.g.i6.b()
            r7.getKey()
            r7.getValue()
            throw r18
        L_0x0585:
            throw r18
        L_0x0586:
            int r3 = r3 + 1
            goto L_0x0519
        L_0x0589:
            if (r1 != 0) goto L_0x0595
            r3 = r36
            if (r0 != r3) goto L_0x0590
            goto L_0x059b
        L_0x0590:
            com.google.android.gms.internal.measurement.zzfo r0 = com.google.android.gms.internal.measurement.zzfo.e()
            throw r0
        L_0x0595:
            r3 = r36
            if (r0 > r3) goto L_0x059c
            if (r2 != r1) goto L_0x059c
        L_0x059b:
            return r0
        L_0x059c:
            com.google.android.gms.internal.measurement.zzfo r0 = com.google.android.gms.internal.measurement.zzfo.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Object, byte[], int, int, int, i.c.a.b.g.g.t2):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0267, code lost:
        if (r0 == r15) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0269, code lost:
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r25 = r5;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017b, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018d, code lost:
        r0 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019d, code lost:
        r0 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019f, code lost:
        r2 = r5;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021f, code lost:
        if (r0 == r15) goto L_0x0269;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r27, byte[] r28, int r29, int r30, i.c.a.b.g.g.t2 r31) {
        /*
            r26 = this;
            r15 = r26
            boolean r0 = r15.f3302g
            if (r0 == 0) goto L_0x029b
            sun.misc.Unsafe r14 = r
            r12 = -1
            r13 = 0
            r11 = r27
            r8 = r28
            r0 = r29
            r7 = r30
            r9 = r31
            r10 = r15
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r7) goto L_0x0293
            int r3 = r0 + 1
            byte r0 = r8[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = i.c.a.b.d.l.q.a((int) r0, (byte[]) r8, (int) r3, (i.c.a.b.g.g.t2) r9)
            int r3 = r9.a
            r17 = r3
            goto L_0x002b
        L_0x0028:
            r17 = r0
            r0 = r3
        L_0x002b:
            int r5 = r17 >>> 3
            r6 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r1 = r10.c
            if (r5 < r1) goto L_0x004e
            int r1 = r10.d
            if (r5 > r1) goto L_0x004e
            int r1 = r10.a((int) r5, (int) r2)
            goto L_0x004c
        L_0x0040:
            int r1 = r10.c
            if (r5 < r1) goto L_0x004e
            int r1 = r10.d
            if (r5 > r1) goto L_0x004e
            int r1 = r10.a((int) r5, (int) r13)
        L_0x004c:
            r3 = r1
            goto L_0x004f
        L_0x004e:
            r3 = -1
        L_0x004f:
            if (r3 != r12) goto L_0x005d
            r18 = r0
            r25 = r5
            r24 = r14
            r22 = -1
            r23 = 0
            goto L_0x026d
        L_0x005d:
            int[] r1 = r10.a
            int r2 = r3 + 1
            r4 = r1[r2]
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r4
            int r2 = r1 >>> 20
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            long r12 = (long) r1
            r1 = 17
            r16 = r3
            r3 = 2
            if (r2 > r1) goto L_0x01a8
            r1 = 1
            switch(r2) {
                case 0: goto L_0x0190;
                case 1: goto L_0x017d;
                case 2: goto L_0x0163;
                case 3: goto L_0x0163;
                case 4: goto L_0x0153;
                case 5: goto L_0x013d;
                case 6: goto L_0x012e;
                case 7: goto L_0x0113;
                case 8: goto L_0x00f8;
                case 9: goto L_0x00d2;
                case 10: goto L_0x00c1;
                case 11: goto L_0x0153;
                case 12: goto L_0x00b0;
                case 13: goto L_0x012e;
                case 14: goto L_0x013d;
                case 15: goto L_0x009b;
                case 16: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0095
        L_0x0079:
            if (r6 != 0) goto L_0x0095
            int r0 = i.c.a.b.d.l.q.b((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
            long r1 = r9.f3453b
            long r17 = i.c.a.b.g.g.e3.a((long) r1)
            r1 = r14
            r2 = r27
            r6 = r16
            r3 = r12
            r25 = r5
            r12 = r6
            r5 = r17
            r1.putLong(r2, r3, r5)
            goto L_0x017b
        L_0x0095:
            r25 = r5
            r5 = r16
            goto L_0x01eb
        L_0x009b:
            r25 = r5
            r5 = r16
            if (r6 != 0) goto L_0x01eb
            int r0 = i.c.a.b.d.l.q.a((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
            int r1 = r9.a
            int r1 = i.c.a.b.g.g.e3.a((int) r1)
            r14.putInt(r11, r12, r1)
            goto L_0x019f
        L_0x00b0:
            r25 = r5
            r5 = r16
            if (r6 != 0) goto L_0x01eb
            int r0 = i.c.a.b.d.l.q.a((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
            int r1 = r9.a
            r14.putInt(r11, r12, r1)
            goto L_0x019f
        L_0x00c1:
            r25 = r5
            r5 = r16
            if (r6 != r3) goto L_0x01eb
            int r0 = i.c.a.b.d.l.q.e(r8, r0, r9)
            java.lang.Object r1 = r9.c
            r14.putObject(r11, r12, r1)
            goto L_0x019f
        L_0x00d2:
            r25 = r5
            r5 = r16
            if (r6 != r3) goto L_0x01eb
            i.c.a.b.g.g.t5 r1 = r10.a((int) r5)
            int r0 = i.c.a.b.d.l.q.a((i.c.a.b.g.g.t5) r1, (byte[]) r8, (int) r0, (int) r7, (i.c.a.b.g.g.t2) r9)
            java.lang.Object r1 = r14.getObject(r11, r12)
            if (r1 != 0) goto L_0x00ed
            java.lang.Object r1 = r9.c
            r14.putObject(r11, r12, r1)
            goto L_0x019f
        L_0x00ed:
            java.lang.Object r2 = r9.c
            java.lang.Object r1 = i.c.a.b.g.g.y3.a((java.lang.Object) r1, (java.lang.Object) r2)
            r14.putObject(r11, r12, r1)
            goto L_0x019f
        L_0x00f8:
            r25 = r5
            r5 = r16
            if (r6 != r3) goto L_0x01eb
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0108
            int r0 = i.c.a.b.d.l.q.c((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
            goto L_0x010c
        L_0x0108:
            int r0 = i.c.a.b.d.l.q.d((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
        L_0x010c:
            java.lang.Object r1 = r9.c
            r14.putObject(r11, r12, r1)
            goto L_0x019f
        L_0x0113:
            r25 = r5
            r5 = r16
            if (r6 != 0) goto L_0x01eb
            int r0 = i.c.a.b.d.l.q.b((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
            long r2 = r9.f3453b
            r16 = 0
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r1 = 0
        L_0x0127:
            i.c.a.b.g.g.l6$d r2 = i.c.a.b.g.g.l6.f3347f
            r2.a((java.lang.Object) r11, (long) r12, (boolean) r1)
            goto L_0x019f
        L_0x012e:
            r25 = r5
            r5 = r16
            r1 = 5
            if (r6 != r1) goto L_0x01eb
            int r1 = i.c.a.b.d.l.q.b((byte[]) r8, (int) r0)
            r14.putInt(r11, r12, r1)
            goto L_0x018d
        L_0x013d:
            r25 = r5
            r5 = r16
            if (r6 != r1) goto L_0x01eb
            long r16 = i.c.a.b.d.l.q.c((byte[]) r8, (int) r0)
            r1 = r14
            r2 = r27
            r3 = r12
            r12 = r5
            r5 = r16
            r1.putLong(r2, r3, r5)
            r5 = r12
            goto L_0x019d
        L_0x0153:
            r25 = r5
            r5 = r16
            if (r6 != 0) goto L_0x01eb
            int r0 = i.c.a.b.d.l.q.a((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
            int r1 = r9.a
            r14.putInt(r11, r12, r1)
            goto L_0x019f
        L_0x0163:
            r25 = r5
            r5 = r16
            if (r6 != 0) goto L_0x01eb
            int r0 = i.c.a.b.d.l.q.b((byte[]) r8, (int) r0, (i.c.a.b.g.g.t2) r9)
            long r3 = r9.f3453b
            r1 = r14
            r2 = r27
            r16 = r3
            r3 = r12
            r12 = r5
            r5 = r16
            r1.putLong(r2, r3, r5)
        L_0x017b:
            r5 = r12
            goto L_0x019f
        L_0x017d:
            r25 = r5
            r5 = r16
            r1 = 5
            if (r6 != r1) goto L_0x01eb
            float r1 = i.c.a.b.d.l.q.e((byte[]) r8, (int) r0)
            i.c.a.b.g.g.l6$d r2 = i.c.a.b.g.g.l6.f3347f
            r2.a((java.lang.Object) r11, (long) r12, (float) r1)
        L_0x018d:
            int r0 = r0 + 4
            goto L_0x019f
        L_0x0190:
            r25 = r5
            r5 = r16
            if (r6 != r1) goto L_0x01eb
            double r1 = i.c.a.b.d.l.q.d((byte[]) r8, (int) r0)
            i.c.a.b.g.g.l6.a((java.lang.Object) r11, (long) r12, (double) r1)
        L_0x019d:
            int r0 = r0 + 8
        L_0x019f:
            r2 = r5
            r24 = r14
            r22 = -1
            r23 = 0
            goto L_0x0289
        L_0x01a8:
            r25 = r5
            r5 = r16
            r1 = 27
            if (r2 != r1) goto L_0x01f5
            if (r6 != r3) goto L_0x01eb
            java.lang.Object r1 = r14.getObject(r11, r12)
            i.c.a.b.g.g.d4 r1 = (i.c.a.b.g.g.d4) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x01d0
            int r2 = r1.size()
            if (r2 != 0) goto L_0x01c7
            r2 = 10
            goto L_0x01c9
        L_0x01c7:
            int r2 = r2 << 1
        L_0x01c9:
            i.c.a.b.g.g.d4 r1 = r1.a(r2)
            r14.putObject(r11, r12, r1)
        L_0x01d0:
            r21 = r1
            i.c.a.b.g.g.t5 r16 = r10.a((int) r5)
            r18 = r28
            r19 = r0
            r20 = r30
            r22 = r31
            int r0 = i.c.a.b.d.l.q.a(r16, r17, r18, r19, r20, r21, r22)
            r3 = r5
            r24 = r14
            r22 = -1
            r23 = 0
            goto L_0x0288
        L_0x01eb:
            r15 = r0
            r16 = r5
            r24 = r14
            r22 = -1
            r23 = 0
            goto L_0x023a
        L_0x01f5:
            r1 = 49
            if (r2 > r1) goto L_0x0226
            long r9 = (long) r4
            r11 = r0
            r0 = r26
            r1 = r27
            r8 = r2
            r2 = r28
            r3 = r11
            r4 = r30
            r16 = r5
            r5 = r17
            r7 = r6
            r6 = r25
            r29 = r8
            r8 = r16
            r15 = r11
            r11 = r29
            r22 = -1
            r23 = 0
            r24 = r14
            r14 = r31
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (i.c.a.b.g.g.t2) r14)
            if (r0 != r15) goto L_0x0222
            goto L_0x0269
        L_0x0222:
            r3 = r16
            goto L_0x027e
        L_0x0226:
            r15 = r0
            r29 = r2
            r16 = r5
            r7 = r6
            r24 = r14
            r22 = -1
            r23 = 0
            r0 = 50
            r9 = r29
            if (r9 != r0) goto L_0x0250
            if (r7 == r3) goto L_0x023d
        L_0x023a:
            r18 = r15
            goto L_0x026b
        L_0x023d:
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r16
            r6 = r12
            r8 = r31
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (i.c.a.b.g.g.t2) r8)
            r0 = 0
            throw r0
        L_0x0250:
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r8 = r4
            r4 = r30
            r5 = r17
            r6 = r25
            r10 = r12
            r12 = r16
            r13 = r31
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (i.c.a.b.g.g.t2) r13)
            if (r0 != r15) goto L_0x0222
        L_0x0269:
            r18 = r0
        L_0x026b:
            r13 = r16
        L_0x026d:
            i.c.a.b.g.g.i6 r20 = e((java.lang.Object) r27)
            r16 = r17
            r17 = r28
            r19 = r30
            r21 = r31
            int r0 = i.c.a.b.d.l.q.a((int) r16, (byte[]) r17, (int) r18, (int) r19, (i.c.a.b.g.g.i6) r20, (i.c.a.b.g.g.t2) r21)
            r3 = r13
        L_0x027e:
            r10 = r26
            r11 = r27
            r8 = r28
            r7 = r30
            r9 = r31
        L_0x0288:
            r2 = r3
        L_0x0289:
            r12 = -1
            r13 = 0
            r15 = r26
            r14 = r24
            r1 = r25
            goto L_0x0017
        L_0x0293:
            if (r0 != r7) goto L_0x0296
            return
        L_0x0296:
            com.google.android.gms.internal.measurement.zzfo r0 = com.google.android.gms.internal.measurement.zzfo.e()
            throw r0
        L_0x029b:
            r5 = 0
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r6 = r31
            r0.a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.h5.a(java.lang.Object, byte[], int, int, i.c.a.b.g.g.t2):void");
    }

    public static void a(int i2, Object obj, b7 b7Var) {
        if (obj instanceof String) {
            zzen.a aVar = (zzen.a) ((h3) b7Var).a;
            aVar.b((i2 << 3) | 2);
            aVar.b((String) obj);
            return;
        }
        zzen.a aVar2 = (zzen.a) ((h3) b7Var).a;
        aVar2.b((i2 << 3) | 2);
        aVar2.b((u2) obj);
    }

    public final void a(T t, T t2, int i2) {
        long j2 = (long) (this.a[i2 + 1] & 1048575);
        if (a(t2, i2)) {
            Object f2 = l6.f(t, j2);
            Object f3 = l6.f(t2, j2);
            if (f2 != null && f3 != null) {
                l6.a((Object) t, j2, y3.a(f2, f3));
                b(t, i2);
            } else if (f3 != null) {
                l6.a((Object) t, j2, f3);
                b(t, i2);
            }
        }
    }

    public final boolean a(T t, int i2, int i3) {
        return l6.a((Object) t, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final boolean a(T t, int i2, int i3, int i4) {
        if (this.f3302g) {
            return a(t, i2);
        }
        return (i3 & i4) != 0;
    }

    public final boolean a(T t, int i2) {
        if (this.f3302g) {
            int i3 = this.a[i2 + 1];
            long j2 = (long) (i3 & 1048575);
            switch ((i3 & 267386880) >>> 20) {
                case 0:
                    return l6.e(t, j2) != 0.0d;
                case 1:
                    return l6.d(t, j2) != 0.0f;
                case 2:
                    return l6.b(t, j2) != 0;
                case 3:
                    return l6.b(t, j2) != 0;
                case 4:
                    return l6.a((Object) t, j2) != 0;
                case 5:
                    return l6.b(t, j2) != 0;
                case 6:
                    return l6.a((Object) t, j2) != 0;
                case 7:
                    return l6.c(t, j2);
                case 8:
                    Object f2 = l6.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof u2) {
                        return !u2.f3471f.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return l6.f(t, j2) != null;
                case 10:
                    return !u2.f3471f.equals(l6.f(t, j2));
                case 11:
                    return l6.a((Object) t, j2) != 0;
                case 12:
                    return l6.a((Object) t, j2) != 0;
                case 13:
                    return l6.a((Object) t, j2) != 0;
                case 14:
                    return l6.b(t, j2) != 0;
                case 15:
                    return l6.a((Object) t, j2) != 0;
                case 16:
                    return l6.b(t, j2) != 0;
                case 17:
                    return l6.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i4 = this.a[i2 + 2];
            return (l6.a((Object) t, (long) (i4 & 1048575)) & (1 << (i4 >>> 20))) != 0;
        }
    }

    public final int a(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }
}
