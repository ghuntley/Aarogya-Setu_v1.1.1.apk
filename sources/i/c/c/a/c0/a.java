package i.c.c.a.c0;

import i.c.a.b.d.l.q;
import i.c.c.a.m;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesCmac */
public final class a implements m {
    public final SecretKey a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4323b;
    public byte[] c;
    public byte[] d;

    public a(byte[] bArr, int i2) {
        i0.a(bArr.length);
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i2 <= 16) {
            this.a = new SecretKeySpec(bArr, "AES");
            this.f4323b = i2;
            Cipher a2 = y.f4361f.a("AES/ECB/NoPadding");
            a2.init(1, this.a);
            byte[] b2 = q.b(a2.doFinal(new byte[16]));
            this.c = b2;
            this.d = q.b(b2);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    public byte[] a(byte[] bArr) {
        byte[] bArr2;
        Cipher a2 = y.f4361f.a("AES/ECB/NoPadding");
        boolean z = true;
        a2.init(1, this.a);
        int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (max * 16 != bArr.length) {
            z = false;
        }
        if (z) {
            bArr2 = q.a(bArr, (max - 1) * 16, this.c, 0, 16);
        } else {
            bArr2 = q.c(q.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.d);
        }
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr3 = a2.doFinal(q.a(bArr3, 0, bArr, i2 * 16, 16));
        }
        byte[] c2 = q.c(bArr2, bArr3);
        byte[] bArr4 = new byte[this.f4323b];
        System.arraycopy(a2.doFinal(c2), 0, bArr4, 0, this.f4323b);
        return bArr4;
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (!q.b(bArr, a(bArr2))) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
