package i.c.c.a.c0;

import i.a.a.a.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* compiled from: AesGcmHkdfStreaming */
public final class e extends f0 {
    public final int a;

    public e(byte[] bArr, String str, int i2, int i3, int i4) {
        if (bArr.length < 16 || bArr.length < i2) {
            StringBuilder a2 = a.a("ikm too short, must be >= ");
            a2.append(Math.max(16, i2));
            throw new InvalidAlgorithmParameterException(a2.toString());
        }
        i0.a(i2);
        if (i3 > this.a + 1 + 7 + i4 + 16) {
            Arrays.copyOf(bArr, bArr.length);
            this.a = i2;
            return;
        }
        throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
    }
}
