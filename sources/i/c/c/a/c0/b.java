package i.c.c.a.c0;

import i.a.a.a.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* compiled from: AesCtrHmacStreaming */
public final class b extends f0 {
    public b(byte[] bArr, String str, int i2, String str2, int i3, int i4, int i5) {
        int length = bArr.length;
        if (length < 16 || length < i2) {
            StringBuilder a = a.a("ikm too short, must be >= ");
            a.append(Math.max(16, i2));
            throw new InvalidAlgorithmParameterException(a.toString());
        }
        i0.a(i2);
        if (i3 < 10) {
            throw new InvalidAlgorithmParameterException(a.b("tag size too small ", i3));
        } else if ((str2.equals("HmacSha1") && i3 > 20) || ((str2.equals("HmacSha256") && i3 > 32) || (str2.equals("HmacSha512") && i3 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        } else if (((((i4 - i5) - i3) - i2) - 7) - 1 > 0) {
            Arrays.copyOf(bArr, bArr.length);
        } else {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
    }
}
