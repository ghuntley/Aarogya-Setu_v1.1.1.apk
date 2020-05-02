package i.c.f;

import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class l {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4963b;

    /* compiled from: Internal */
    public interface a {
    }

    /* compiled from: Internal */
    public interface b<E> extends List<E>, RandomAccess {
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4963b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f4963b;
        int length = bArr2.length;
        try {
            new g(bArr2, 0, length, false).b(length);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }
}
