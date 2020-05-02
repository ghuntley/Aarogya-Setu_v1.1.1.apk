package i.c.a.b.g.e;

import java.io.InputStream;
import java.util.Deque;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class f {
    static {
        new e();
    }

    public static byte[] a(Deque<byte[]> deque, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i3, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i2 - i3, min);
            i3 -= min;
        }
        return bArr;
    }

    public static InputStream a(InputStream inputStream) {
        return new h(inputStream);
    }
}
