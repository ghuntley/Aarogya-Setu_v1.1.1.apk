package i.c.c.a.c0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: ChaCha20 */
public class i extends h0 {
    public i(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    public ByteBuffer a(byte[] bArr, int i2) {
        int[] iArr = new int[16];
        int[] iArr2 = h0.c;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        byte[] bArr2 = this.a.a;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        int[] b2 = h0.b(ByteBuffer.wrap(bArr3));
        int i3 = 4;
        System.arraycopy(b2, 0, iArr, 4, b2.length);
        iArr[12] = i2;
        System.arraycopy(h0.b(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr3 = (int[]) iArr.clone();
        int i4 = 0;
        while (i4 < 10) {
            a(iArr3, 0, i3, 8, 12);
            a(iArr3, 1, 5, 9, 13);
            a(iArr3, 2, 6, 10, 14);
            a(iArr3, 3, 7, 11, 15);
            a(iArr3, 0, 5, 10, 15);
            a(iArr3, 1, 6, 11, 12);
            a(iArr3, 2, 7, 8, 13);
            a(iArr3, 3, 4, 9, 14);
            i4++;
            i3 = 4;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            iArr[i5] = iArr[i5] + iArr3[i5];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }

    public static void a(int[] iArr, int i2, int i3, int i4, int i5) {
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = h0.a(iArr[i5] ^ iArr[i2], 16);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = h0.a(iArr[i3] ^ iArr[i4], 12);
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = h0.a(iArr[i2] ^ iArr[i5], 8);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = h0.a(iArr[i3] ^ iArr[i4], 7);
    }
}
