package i.c.c.a.c0;

/* compiled from: Curve25519 */
public final class k {
    public static void a(long[] jArr, long[] jArr2, int i2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            jArr[i4] = (long) (((((int) jArr2[i4]) ^ ((int) jArr[i4])) & i3) ^ ((int) jArr[i4]));
        }
    }
}
