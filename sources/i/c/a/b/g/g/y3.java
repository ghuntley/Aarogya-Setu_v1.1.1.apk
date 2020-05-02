package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzfo;
import i.c.a.b.g.g.w3;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class y3 {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3529b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3529b = bArr;
        ByteBuffer.wrap(bArr);
        int length = f3529b.length;
        int i2 = length + 0;
        if (length < 0) {
            throw zzfo.b();
        } else if ((0 - 0) + length <= Integer.MAX_VALUE) {
            int i3 = i2 + 0 + 0;
        } else {
            try {
                throw zzfo.a();
            } catch (zzfo e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int i2 = length;
        for (int i3 = 0; i3 < 0 + length; i3++) {
            i2 = (i2 * 31) + bArr[i3];
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static Object a(Object obj, Object obj2) {
        f5 f5Var = (f5) obj2;
        o2 o2Var = (o2) ((f5) obj).g();
        if (o2Var != null) {
            w3.b bVar = (w3.b) o2Var;
            if (bVar.e.getClass().isInstance(f5Var)) {
                return bVar.a((w3) ((m2) f5Var)).j();
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        throw null;
    }
}
