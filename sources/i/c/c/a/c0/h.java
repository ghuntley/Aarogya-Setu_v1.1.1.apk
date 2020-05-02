package i.c.c.a.c0;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: Base64 */
public final class h {
    public static final Charset a = Charset.forName("UTF-8");

    /* compiled from: Base64 */
    public static abstract class a {
        public byte[] a;

        /* renamed from: b  reason: collision with root package name */
        public int f4332b;
    }

    /* compiled from: Base64 */
    public static class b extends a {

        /* renamed from: f  reason: collision with root package name */
        public static final int[] f4333f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g  reason: collision with root package name */
        public static final int[] f4334g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public int c;
        public int d;
        public final int[] e;

        public b(int i2, byte[] bArr) {
            this.a = bArr;
            this.e = (i2 & 8) == 0 ? f4333f : f4334g;
            this.c = 0;
            this.d = 0;
        }
    }

    /* compiled from: Base64 */
    public static class c extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final byte[] f4335j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k  reason: collision with root package name */
        public static final byte[] f4336k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public final byte[] c;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f4337f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f4338g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f4339h;

        /* renamed from: i  reason: collision with root package name */
        public final byte[] f4340i;

        public c(int i2, byte[] bArr) {
            this.a = bArr;
            boolean z = true;
            this.f4337f = (i2 & 1) == 0;
            this.f4338g = (i2 & 2) == 0;
            this.f4339h = (i2 & 4) == 0 ? false : z;
            this.f4340i = (i2 & 8) == 0 ? f4335j : f4336k;
            this.c = new byte[2];
            this.d = 0;
            this.e = this.f4338g ? 19 : -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0104, code lost:
        if (r3 == 1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r3 == 2) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0108, code lost:
        if (r3 == 3) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        if (r3 == 4) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010d, code lost:
        r2.c = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0110, code lost:
        r1 = r12 + 1;
        r9[r12] = (byte) (r8 >> 10);
        r12 = r1 + 1;
        r9[r1] = (byte) (r8 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011f, code lost:
        r9[r12] = (byte) (r8 >> 4);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0127, code lost:
        r2.c = r3;
        r2.f4332b = r12;
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        r2.c = 6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r17, int r18) {
        /*
            java.nio.charset.Charset r0 = a
            r1 = r17
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            i.c.c.a.c0.h$b r2 = new i.c.c.a.c0.h$b
            int r3 = r1 * 3
            r4 = 4
            int r3 = r3 / r4
            byte[] r3 = new byte[r3]
            r5 = r18
            r2.<init>(r5, r3)
            int r3 = r2.c
            r5 = 0
            r6 = 6
            r7 = 1
            if (r3 != r6) goto L_0x001f
            goto L_0x012f
        L_0x001f:
            int r1 = r1 + r5
            int r8 = r2.d
            byte[] r9 = r2.a
            int[] r10 = r2.e
            r11 = 0
            r12 = 0
        L_0x0028:
            r13 = 3
            r14 = 2
            if (r11 >= r1) goto L_0x0103
            if (r3 != 0) goto L_0x0074
        L_0x002e:
            int r15 = r11 + 4
            if (r15 > r1) goto L_0x0070
            byte r8 = r0[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r10[r8]
            int r8 = r8 << 18
            int r16 = r11 + 1
            byte r5 = r0[r16]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r10[r5]
            int r5 = r5 << 12
            r5 = r5 | r8
            int r8 = r11 + 2
            byte r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r10[r8]
            int r8 = r8 << r6
            r5 = r5 | r8
            int r8 = r11 + 3
            byte r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r10[r8]
            r8 = r8 | r5
            if (r8 < 0) goto L_0x0070
            int r5 = r12 + 2
            byte r11 = (byte) r8
            r9[r5] = r11
            int r5 = r12 + 1
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            r9[r5] = r11
            int r5 = r8 >> 16
            byte r5 = (byte) r5
            r9[r12] = r5
            int r12 = r12 + 3
            r11 = r15
            r5 = 0
            goto L_0x002e
        L_0x0070:
            if (r11 < r1) goto L_0x0074
            goto L_0x0103
        L_0x0074:
            int r5 = r11 + 1
            byte r11 = r0[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r10[r11]
            r15 = -1
            if (r3 == 0) goto L_0x00f3
            if (r3 == r7) goto L_0x00e8
            r7 = 5
            if (r3 == r14) goto L_0x00d3
            if (r3 == r13) goto L_0x009f
            if (r3 == r4) goto L_0x0092
            if (r3 == r7) goto L_0x008c
            goto L_0x00fe
        L_0x008c:
            if (r11 == r15) goto L_0x00fe
            r2.c = r6
            goto L_0x012f
        L_0x0092:
            r7 = -2
            if (r11 != r7) goto L_0x0099
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0099:
            if (r11 == r15) goto L_0x00fe
            r2.c = r6
            goto L_0x012f
        L_0x009f:
            if (r11 < 0) goto L_0x00ba
            int r3 = r8 << 6
            r8 = r3 | r11
            int r3 = r12 + 2
            byte r7 = (byte) r8
            r9[r3] = r7
            int r3 = r12 + 1
            int r7 = r8 >> 8
            byte r7 = (byte) r7
            r9[r3] = r7
            int r3 = r8 >> 16
            byte r3 = (byte) r3
            r9[r12] = r3
            int r12 = r12 + 3
            r3 = 0
            goto L_0x00fe
        L_0x00ba:
            r13 = -2
            if (r11 != r13) goto L_0x00cd
            int r3 = r12 + 1
            int r11 = r8 >> 2
            byte r11 = (byte) r11
            r9[r3] = r11
            int r3 = r8 >> 10
            byte r3 = (byte) r3
            r9[r12] = r3
            int r12 = r12 + 2
            r3 = 5
            goto L_0x00fe
        L_0x00cd:
            if (r11 == r15) goto L_0x00fe
            r2.c = r6
            goto L_0x012f
        L_0x00d3:
            if (r11 < 0) goto L_0x00d6
            goto L_0x00ea
        L_0x00d6:
            r7 = -2
            if (r11 != r7) goto L_0x00e3
            int r3 = r12 + 1
            int r7 = r8 >> 4
            byte r7 = (byte) r7
            r9[r12] = r7
            r12 = r3
            r3 = 4
            goto L_0x00fe
        L_0x00e3:
            if (r11 == r15) goto L_0x00fe
            r2.c = r6
            goto L_0x012f
        L_0x00e8:
            if (r11 < 0) goto L_0x00ee
        L_0x00ea:
            int r7 = r8 << 6
            r11 = r11 | r7
            goto L_0x00f5
        L_0x00ee:
            if (r11 == r15) goto L_0x00fe
            r2.c = r6
            goto L_0x012f
        L_0x00f3:
            if (r11 < 0) goto L_0x00f9
        L_0x00f5:
            int r3 = r3 + 1
            r8 = r11
            goto L_0x00fe
        L_0x00f9:
            if (r11 == r15) goto L_0x00fe
            r2.c = r6
            goto L_0x012f
        L_0x00fe:
            r11 = r5
            r5 = 0
            r7 = 1
            goto L_0x0028
        L_0x0103:
            r0 = 1
            if (r3 == r0) goto L_0x012d
            if (r3 == r14) goto L_0x011f
            if (r3 == r13) goto L_0x0110
            if (r3 == r4) goto L_0x010d
            goto L_0x0127
        L_0x010d:
            r2.c = r6
            goto L_0x012f
        L_0x0110:
            int r1 = r12 + 1
            int r4 = r8 >> 10
            byte r4 = (byte) r4
            r9[r12] = r4
            int r12 = r1 + 1
            int r4 = r8 >> 2
            byte r4 = (byte) r4
            r9[r1] = r4
            goto L_0x0127
        L_0x011f:
            int r1 = r12 + 1
            int r4 = r8 >> 4
            byte r4 = (byte) r4
            r9[r12] = r4
            r12 = r1
        L_0x0127:
            r2.c = r3
            r2.f4332b = r12
            r7 = 1
            goto L_0x0130
        L_0x012d:
            r2.c = r6
        L_0x012f:
            r7 = 0
        L_0x0130:
            if (r7 == 0) goto L_0x0142
            int r0 = r2.f4332b
            byte[] r1 = r2.a
            int r2 = r1.length
            if (r0 != r2) goto L_0x013a
            goto L_0x0141
        L_0x013a:
            byte[] r2 = new byte[r0]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r1 = r2
        L_0x0141:
            return r1
        L_0x0142:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bad base-64"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.c0.h.a(java.lang.String, int):byte[]");
    }

    public static String a(byte[] bArr) {
        try {
            return new String(a(bArr, 2), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0125 A[SYNTHETIC] */
    public static byte[] a(byte[] r17, int r18) {
        /*
            r0 = r17
            int r1 = r0.length
            i.c.c.a.c0.h$c r2 = new i.c.c.a.c0.h$c
            r3 = 0
            r4 = r18
            r2.<init>(r4, r3)
            int r3 = r1 / 3
            r4 = 4
            int r3 = r3 * 4
            boolean r5 = r2.f4337f
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x001d
            int r5 = r1 % 3
            if (r5 <= 0) goto L_0x0029
            int r3 = r3 + 4
            goto L_0x0029
        L_0x001d:
            int r5 = r1 % 3
            if (r5 == r7) goto L_0x0027
            if (r5 == r6) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            int r3 = r3 + 3
            goto L_0x0029
        L_0x0027:
            int r3 = r3 + 2
        L_0x0029:
            boolean r5 = r2.f4338g
            if (r5 == 0) goto L_0x003e
            if (r1 <= 0) goto L_0x003e
            int r5 = r1 + -1
            int r5 = r5 / 57
            int r5 = r5 + r7
            boolean r8 = r2.f4339h
            if (r8 == 0) goto L_0x003a
            r8 = 2
            goto L_0x003b
        L_0x003a:
            r8 = 1
        L_0x003b:
            int r5 = r5 * r8
            int r3 = r3 + r5
        L_0x003e:
            byte[] r3 = new byte[r3]
            r2.a = r3
            byte[] r5 = r2.f4340i
            int r8 = r2.e
            r9 = 0
            int r1 = r1 + r9
            int r10 = r2.d
            r11 = -1
            if (r10 == r7) goto L_0x006a
            if (r10 == r6) goto L_0x0050
            goto L_0x0084
        L_0x0050:
            if (r7 > r1) goto L_0x0084
            byte[] r10 = r2.c
            byte r12 = r10[r9]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 16
            byte r10 = r10[r7]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r10 = r10 | r12
            byte r12 = r0[r9]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r10 = r10 | r12
            r2.d = r9
            r12 = 1
            goto L_0x0086
        L_0x006a:
            if (r6 > r1) goto L_0x0084
            byte[] r10 = r2.c
            byte r10 = r10[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            byte r12 = r0[r9]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r10 = r10 | r12
            byte r12 = r0[r7]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r10 = r10 | r12
            r2.d = r9
            r12 = 2
            goto L_0x0086
        L_0x0084:
            r10 = -1
            r12 = 0
        L_0x0086:
            r14 = 13
            r15 = 10
            if (r10 == r11) goto L_0x00c3
            int r11 = r10 >> 18
            r11 = r11 & 63
            byte r11 = r5[r11]
            r3[r9] = r11
            int r11 = r10 >> 12
            r11 = r11 & 63
            byte r11 = r5[r11]
            r3[r7] = r11
            int r11 = r10 >> 6
            r11 = r11 & 63
            byte r11 = r5[r11]
            r3[r6] = r11
            r10 = r10 & 63
            byte r10 = r5[r10]
            r11 = 3
            r3[r11] = r10
            int r8 = r8 + -1
            if (r8 != 0) goto L_0x00c1
            boolean r8 = r2.f4339h
            if (r8 == 0) goto L_0x00b7
            r8 = 5
            r3[r4] = r14
            goto L_0x00b8
        L_0x00b7:
            r8 = 4
        L_0x00b8:
            int r10 = r8 + 1
            r3[r8] = r15
            r8 = r5
            r11 = r10
            r5 = r3
            r3 = r2
            goto L_0x011c
        L_0x00c1:
            r10 = 4
            goto L_0x00c4
        L_0x00c3:
            r10 = 0
        L_0x00c4:
            r11 = r10
            r10 = r8
            r8 = r5
            r5 = r3
            r3 = r2
        L_0x00c9:
            int r13 = r12 + 3
            if (r13 > r1) goto L_0x0125
            byte r7 = r0[r12]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            int r16 = r12 + 1
            byte r6 = r0[r16]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r6 = r6 | r7
            int r12 = r12 + 2
            byte r7 = r0[r12]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r7 = r6 >> 18
            r7 = r7 & 63
            byte r7 = r8[r7]
            r5[r11] = r7
            int r7 = r11 + 1
            int r12 = r6 >> 12
            r12 = r12 & 63
            byte r12 = r8[r12]
            r5[r7] = r12
            int r7 = r11 + 2
            int r12 = r6 >> 6
            r12 = r12 & 63
            byte r12 = r8[r12]
            r5[r7] = r12
            int r7 = r11 + 3
            r6 = r6 & 63
            byte r6 = r8[r6]
            r5[r7] = r6
            int r11 = r11 + 4
            int r10 = r10 + -1
            if (r10 != 0) goto L_0x0121
            boolean r6 = r2.f4339h
            if (r6 == 0) goto L_0x0116
            int r6 = r11 + 1
            r5[r11] = r14
            r11 = r6
        L_0x0116:
            int r10 = r11 + 1
            r5[r11] = r15
            r11 = r10
            r12 = r13
        L_0x011c:
            r6 = 2
            r7 = 1
            r10 = 19
            goto L_0x00c9
        L_0x0121:
            r12 = r13
            r6 = 2
            r7 = 1
            goto L_0x00c9
        L_0x0125:
            int r6 = r2.d
            int r7 = r12 - r6
            int r13 = r1 + -1
            r16 = 61
            if (r7 != r13) goto L_0x0176
            if (r6 <= 0) goto L_0x0137
            byte[] r0 = r2.c
            byte r0 = r0[r9]
            r7 = 1
            goto L_0x013a
        L_0x0137:
            byte r0 = r0[r12]
            r7 = 0
        L_0x013a:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r4
            int r1 = r2.d
            int r1 = r1 - r7
            r2.d = r1
            int r1 = r11 + 1
            int r4 = r0 >> 6
            r4 = r4 & 63
            byte r4 = r8[r4]
            r5[r11] = r4
            int r4 = r1 + 1
            r0 = r0 & 63
            byte r0 = r8[r0]
            r5[r1] = r0
            boolean r0 = r2.f4337f
            if (r0 == 0) goto L_0x0162
            int r0 = r4 + 1
            r5[r4] = r16
            int r1 = r0 + 1
            r5[r0] = r16
            r11 = r1
            goto L_0x0163
        L_0x0162:
            r11 = r4
        L_0x0163:
            boolean r0 = r2.f4338g
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r2.f4339h
            if (r0 == 0) goto L_0x0170
            int r0 = r11 + 1
            r5[r11] = r14
            r11 = r0
        L_0x0170:
            int r0 = r11 + 1
            r5[r11] = r15
            goto L_0x01f4
        L_0x0176:
            r4 = 2
            int r1 = r1 - r4
            if (r7 != r1) goto L_0x01dd
            r1 = 1
            if (r6 <= r1) goto L_0x0183
            byte[] r4 = r2.c
            byte r4 = r4[r9]
            r7 = 1
            goto L_0x0189
        L_0x0183:
            int r1 = r12 + 1
            byte r4 = r0[r12]
            r12 = r1
            r7 = 0
        L_0x0189:
            r1 = r4 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r15
            int r4 = r2.d
            if (r4 <= 0) goto L_0x0198
            byte[] r0 = r2.c
            int r4 = r7 + 1
            byte r0 = r0[r7]
            r7 = r4
            goto L_0x019a
        L_0x0198:
            byte r0 = r0[r12]
        L_0x019a:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 2
            int r0 = r0 << r4
            r0 = r0 | r1
            int r1 = r2.d
            int r1 = r1 - r7
            r2.d = r1
            int r1 = r11 + 1
            int r4 = r0 >> 12
            r4 = r4 & 63
            byte r4 = r8[r4]
            r5[r11] = r4
            int r4 = r1 + 1
            int r6 = r0 >> 6
            r6 = r6 & 63
            byte r6 = r8[r6]
            r5[r1] = r6
            int r1 = r4 + 1
            r0 = r0 & 63
            byte r0 = r8[r0]
            r5[r4] = r0
            boolean r0 = r2.f4337f
            if (r0 == 0) goto L_0x01ca
            int r0 = r1 + 1
            r5[r1] = r16
            r11 = r0
            goto L_0x01cb
        L_0x01ca:
            r11 = r1
        L_0x01cb:
            boolean r0 = r2.f4338g
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r2.f4339h
            if (r0 == 0) goto L_0x01d8
            int r0 = r11 + 1
            r5[r11] = r14
            r11 = r0
        L_0x01d8:
            int r0 = r11 + 1
            r5[r11] = r15
            goto L_0x01f4
        L_0x01dd:
            boolean r0 = r2.f4338g
            if (r0 == 0) goto L_0x01f5
            if (r11 <= 0) goto L_0x01f5
            r0 = 19
            if (r10 == r0) goto L_0x01f5
            boolean r0 = r2.f4339h
            if (r0 == 0) goto L_0x01f0
            int r0 = r11 + 1
            r5[r11] = r14
            r11 = r0
        L_0x01f0:
            int r0 = r11 + 1
            r5[r11] = r15
        L_0x01f4:
            r11 = r0
        L_0x01f5:
            r2.f4332b = r11
            r2.e = r10
            byte[] r0 = r3.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.c0.h.a(byte[], int):byte[]");
    }
}
