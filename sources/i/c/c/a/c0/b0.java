package i.c.c.a.c0;

import i.a.a.a.a;
import java.util.Arrays;

/* compiled from: Field25519 */
public final class b0 {
    public static final int[] a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4327b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] c = {67108863, 33554431};
    public static final int[] d = {26, 25};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = {jArr2[0] * jArr3[0], (jArr2[1] * jArr3[0]) + (jArr2[0] * jArr3[1]), (jArr2[2] * jArr3[0]) + (jArr2[0] * jArr3[2]) + (jArr2[1] * 2 * jArr3[1]), (jArr2[3] * jArr3[0]) + (jArr2[0] * jArr3[3]) + (jArr2[2] * jArr3[1]) + (jArr2[1] * jArr3[2]), (jArr2[4] * jArr3[0]) + (jArr2[0] * jArr3[4]) + (((jArr2[3] * jArr3[1]) + (jArr2[1] * jArr3[3])) * 2) + (jArr2[2] * jArr3[2]), (jArr2[5] * jArr3[0]) + (jArr2[0] * jArr3[5]) + (jArr2[4] * jArr3[1]) + (jArr2[1] * jArr3[4]) + (jArr2[3] * jArr3[2]) + (jArr2[2] * jArr3[3]), (jArr2[6] * jArr3[0]) + (jArr2[0] * jArr3[6]) + (jArr2[4] * jArr3[2]) + (jArr2[2] * jArr3[4]) + a.a(jArr2[5], jArr3[1], (jArr2[1] * jArr3[5]) + (jArr2[3] * jArr3[3]), 2), (jArr2[7] * jArr3[0]) + (jArr2[0] * jArr3[7]) + (jArr2[6] * jArr3[1]) + (jArr2[1] * jArr3[6]) + (jArr2[5] * jArr3[2]) + (jArr2[2] * jArr3[5]) + (jArr2[4] * jArr3[3]) + (jArr2[3] * jArr3[4]), (jArr2[8] * jArr3[0]) + (jArr2[0] * jArr3[8]) + (jArr2[6] * jArr3[2]) + (jArr2[2] * jArr3[6]) + (((jArr2[7] * jArr3[1]) + (jArr2[1] * jArr3[7]) + (jArr2[5] * jArr3[3]) + (jArr2[3] * jArr3[5])) * 2) + (jArr2[4] * jArr3[4]), (jArr2[9] * jArr3[0]) + (jArr2[0] * jArr3[9]) + (jArr2[8] * jArr3[1]) + (jArr2[1] * jArr3[8]) + (jArr2[7] * jArr3[2]) + (jArr2[2] * jArr3[7]) + (jArr2[6] * jArr3[3]) + (jArr2[3] * jArr3[6]) + (jArr2[5] * jArr3[4]) + (jArr2[4] * jArr3[5]), (jArr2[8] * jArr3[2]) + (jArr2[2] * jArr3[8]) + (jArr2[6] * jArr3[4]) + (jArr2[4] * jArr3[6]) + a.a(jArr2[9], jArr3[1], (jArr2[1] * jArr3[9]) + (jArr2[7] * jArr3[3]) + (jArr2[3] * jArr3[7]) + (jArr2[5] * jArr3[5]), 2), (jArr2[9] * jArr3[2]) + (jArr2[2] * jArr3[9]) + (jArr2[8] * jArr3[3]) + (jArr2[3] * jArr3[8]) + (jArr2[7] * jArr3[4]) + (jArr2[4] * jArr3[7]) + (jArr2[6] * jArr3[5]) + (jArr2[5] * jArr3[6]), (jArr2[8] * jArr3[4]) + (jArr2[4] * jArr3[8]) + (((jArr2[9] * jArr3[3]) + (jArr2[3] * jArr3[9]) + (jArr2[7] * jArr3[5]) + (jArr2[5] * jArr3[7])) * 2) + (jArr2[6] * jArr3[6]), (jArr2[9] * jArr3[4]) + (jArr2[4] * jArr3[9]) + (jArr2[8] * jArr3[5]) + (jArr2[5] * jArr3[8]) + (jArr2[7] * jArr3[6]) + (jArr2[6] * jArr3[7]), (jArr2[8] * jArr3[6]) + (jArr2[6] * jArr3[8]) + a.a(jArr2[9], jArr3[5], (jArr2[5] * jArr3[9]) + (jArr2[7] * jArr3[7]), 2), (jArr2[9] * jArr3[6]) + (jArr2[6] * jArr3[9]) + (jArr2[8] * jArr3[7]) + (jArr2[7] * jArr3[8]), (((jArr2[9] * jArr3[7]) + (jArr2[7] * jArr3[9])) * 2) + (jArr2[8] * jArr3[8]), (jArr2[9] * jArr3[8]) + (jArr2[8] * jArr3[9]), jArr2[9] * 2 * jArr3[9]};
        c(jArr4);
        b(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static void b(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2] / 67108864;
            jArr[i2] = jArr[i2] - (j2 << 26);
            int i3 = i2 + 1;
            jArr[i3] = jArr[i3] + j2;
            long j3 = jArr[i3] / 33554432;
            jArr[i3] = jArr[i3] - (j3 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j3;
        }
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
        jArr[10] = 0;
        long j4 = jArr[0] / 67108864;
        jArr[0] = jArr[0] - (j4 << 26);
        jArr[1] = jArr[1] + j4;
    }

    public static void c(long[] jArr) {
        jArr[8] = jArr[8] + (jArr[18] << 4);
        jArr[8] = jArr[8] + (jArr[18] << 1);
        jArr[8] = jArr[8] + jArr[18];
        jArr[7] = jArr[7] + (jArr[17] << 4);
        jArr[7] = jArr[7] + (jArr[17] << 1);
        jArr[7] = jArr[7] + jArr[17];
        jArr[6] = jArr[6] + (jArr[16] << 4);
        jArr[6] = jArr[6] + (jArr[16] << 1);
        jArr[6] = jArr[6] + jArr[16];
        jArr[5] = jArr[5] + (jArr[15] << 4);
        jArr[5] = jArr[5] + (jArr[15] << 1);
        jArr[5] = jArr[5] + jArr[15];
        jArr[4] = jArr[4] + (jArr[14] << 4);
        jArr[4] = jArr[4] + (jArr[14] << 1);
        jArr[4] = jArr[4] + jArr[14];
        jArr[3] = jArr[3] + (jArr[13] << 4);
        jArr[3] = jArr[3] + (jArr[13] << 1);
        jArr[3] = jArr[3] + jArr[13];
        jArr[2] = jArr[2] + (jArr[12] << 4);
        jArr[2] = jArr[2] + (jArr[12] << 1);
        jArr[2] = jArr[2] + jArr[12];
        jArr[1] = jArr[1] + (jArr[11] << 4);
        jArr[1] = jArr[1] + (jArr[11] << 1);
        jArr[1] = jArr[1] + jArr[11];
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
    }

    public static void a(long[] jArr, long[] jArr2) {
        long[] jArr3 = {jArr2[0] * jArr2[0], jArr2[0] * 2 * jArr2[1], a.a(jArr2[0], jArr2[2], jArr2[1] * jArr2[1], 2), a.a(jArr2[0], jArr2[3], jArr2[1] * jArr2[2], 2), (jArr2[0] * 2 * jArr2[4]) + (jArr2[1] * 4 * jArr2[3]) + (jArr2[2] * jArr2[2]), a.a(jArr2[0], jArr2[5], (jArr2[1] * jArr2[4]) + (jArr2[2] * jArr2[3]), 2), a.a(jArr2[1] * 2, jArr2[5], (jArr2[0] * jArr2[6]) + (jArr2[2] * jArr2[4]) + (jArr2[3] * jArr2[3]), 2), a.a(jArr2[0], jArr2[7], (jArr2[1] * jArr2[6]) + (jArr2[2] * jArr2[5]) + (jArr2[3] * jArr2[4]), 2), (((((jArr2[3] * jArr2[5]) + (jArr2[1] * jArr2[7])) * 2) + (jArr2[0] * jArr2[8]) + (jArr2[2] * jArr2[6])) * 2) + (jArr2[4] * jArr2[4]), a.a(jArr2[0], jArr2[9], (jArr2[1] * jArr2[8]) + (jArr2[2] * jArr2[7]) + (jArr2[3] * jArr2[6]) + (jArr2[4] * jArr2[5]), 2), ((((jArr2[1] * jArr2[9]) + (jArr2[3] * jArr2[7])) * 2) + (jArr2[2] * jArr2[8]) + (jArr2[4] * jArr2[6]) + (jArr2[5] * jArr2[5])) * 2, a.a(jArr2[2], jArr2[9], (jArr2[3] * jArr2[8]) + (jArr2[4] * jArr2[7]) + (jArr2[5] * jArr2[6]), 2), (((((jArr2[3] * jArr2[9]) + (jArr2[5] * jArr2[7])) * 2) + (jArr2[4] * jArr2[8])) * 2) + (jArr2[6] * jArr2[6]), a.a(jArr2[4], jArr2[9], (jArr2[5] * jArr2[8]) + (jArr2[6] * jArr2[7]), 2), a.a(jArr2[5] * 2, jArr2[9], (jArr2[6] * jArr2[8]) + (jArr2[7] * jArr2[7]), 2), a.a(jArr2[6], jArr2[9], jArr2[7] * jArr2[8], 2), (jArr2[7] * 4 * jArr2[9]) + (jArr2[8] * jArr2[8]), jArr2[8] * 2 * jArr2[9], jArr2[9] * 2 * jArr2[9]};
        c(jArr3);
        b(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static long[] a(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int[] iArr = a;
            jArr[i2] = ((((((long) (bArr[iArr[i2]] & 255)) | (((long) (bArr[iArr[i2] + 1] & 255)) << 8)) | (((long) (bArr[iArr[i2] + 2] & 255)) << 16)) | (((long) (bArr[iArr[i2] + 3] & 255)) << 24)) >> f4327b[i2]) & ((long) c[i2 & 1]);
        }
        return jArr;
    }

    public static byte[] a(long[] jArr) {
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            while (i3 < 9) {
                long j2 = copyOf[i3] & (copyOf[i3] >> 31);
                int[] iArr = d;
                int i4 = i3 & 1;
                int i5 = -((int) (j2 >> iArr[i4]));
                copyOf[i3] = copyOf[i3] + ((long) (i5 << iArr[i4]));
                i3++;
                copyOf[i3] = copyOf[i3] - ((long) i5);
            }
            int i6 = -((int) (((copyOf[9] >> 31) & copyOf[9]) >> 25));
            copyOf[9] = copyOf[9] + ((long) (i6 << 25));
            copyOf[0] = copyOf[0] - ((long) (i6 * 19));
        }
        int i7 = -((int) ((copyOf[0] & (copyOf[0] >> 31)) >> 26));
        copyOf[0] = copyOf[0] + ((long) (i7 << 26));
        copyOf[1] = copyOf[1] - ((long) i7);
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 9) {
                int i10 = i9 & 1;
                int i11 = (int) (copyOf[i9] >> d[i10]);
                copyOf[i9] = ((long) c[i10]) & copyOf[i9];
                i9++;
                copyOf[i9] = copyOf[i9] + ((long) i11);
            }
        }
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[0] = copyOf[0] + ((long) (((int) (copyOf[9] >> 25)) * 19));
        int i12 = ~((((int) copyOf[0]) - 67108845) >> 31);
        for (int i13 = 1; i13 < 10; i13++) {
            int i14 = ~(c[i13 & 1] ^ ((int) copyOf[i13]));
            int i15 = i14 & (i14 << 16);
            int i16 = i15 & (i15 << 8);
            int i17 = i16 & (i16 << 4);
            int i18 = i17 & (i17 << 2);
            i12 &= (i18 & (i18 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i12));
        long j3 = (long) (33554431 & i12);
        copyOf[1] = copyOf[1] - j3;
        for (int i19 = 2; i19 < 10; i19 += 2) {
            copyOf[i19] = copyOf[i19] - ((long) (67108863 & i12));
            int i20 = i19 + 1;
            copyOf[i20] = copyOf[i20] - j3;
        }
        for (int i21 = 0; i21 < 10; i21++) {
            copyOf[i21] = copyOf[i21] << f4327b[i21];
        }
        byte[] bArr = new byte[32];
        for (int i22 = 0; i22 < 10; i22++) {
            int[] iArr2 = a;
            int i23 = iArr2[i22];
            bArr[i23] = (byte) ((int) (((long) bArr[i23]) | (copyOf[i22] & 255)));
            int i24 = iArr2[i22] + 1;
            bArr[i24] = (byte) ((int) (((long) bArr[i24]) | ((copyOf[i22] >> 8) & 255)));
            int i25 = iArr2[i22] + 2;
            bArr[i25] = (byte) ((int) (((long) bArr[i25]) | ((copyOf[i22] >> 16) & 255)));
            int i26 = iArr2[i22] + 3;
            bArr[i26] = (byte) ((int) (((long) bArr[i26]) | ((copyOf[i22] >> 24) & 255)));
        }
        return bArr;
    }
}
