package i.c.a.b.d.o;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class d {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f3159b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        int i2 = 0;
        while (i2 < length && (!z || i2 != length - 1 || (bArr[i2] & 255) != 0)) {
            sb.append(a[(bArr[i2] & 240) >>> 4]);
            sb.append(a[bArr[i2] & 15]);
            i2++;
        }
        return sb.toString();
    }
}
