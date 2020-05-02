package i.c.c.a.c0;

import i.c.a.b.d.l.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: Snuffle */
public abstract class h0 implements d0 {
    public static final int[] c = b(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));
    public final c0 a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4341b;

    public h0(byte[] bArr, int i2) {
        if (bArr.length == 32) {
            this.a = new c0(bArr, 0, bArr.length);
            this.f4341b = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public static int a(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    public abstract ByteBuffer a(byte[] bArr, int i2);

    public byte[] a(byte[] bArr) {
        if (bArr.length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(12 + bArr.length);
            a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr) {
        return a(ByteBuffer.wrap(bArr));
    }

    public static int[] b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public void a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - 12 >= bArr.length) {
            byte[] a2 = g0.a(12);
            byteBuffer.put(a2);
            a(a2, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public byte[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 12) {
            byte[] bArr = new byte[12];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            a(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void a(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i2 = (remaining / 64) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer a2 = a(bArr, this.f4341b + i3);
            if (i3 == i2 - 1) {
                q.a(byteBuffer, byteBuffer2, a2, remaining % 64);
            } else {
                q.a(byteBuffer, byteBuffer2, a2, 64);
            }
        }
    }
}
