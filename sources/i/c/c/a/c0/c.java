package i.c.c.a.c0;

import i.a.a.a.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesCtrJceCipher */
public final class c implements d0 {
    public final SecretKeySpec a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4328b;
    public final int c;

    public c(byte[] bArr, int i2) {
        i0.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = y.f4361f.a("AES/CTR/NoPadding").getBlockSize();
        this.c = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f4328b = i2;
    }

    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.f4328b;
        if (length <= Integer.MAX_VALUE - i2) {
            byte[] bArr2 = new byte[(bArr.length + i2)];
            byte[] a2 = g0.a(i2);
            System.arraycopy(a2, 0, bArr2, 0, this.f4328b);
            a(bArr, 0, bArr.length, bArr2, this.f4328b, a2, true);
            return bArr2;
        }
        StringBuilder a3 = a.a("plaintext length can not exceed ");
        a3.append(Integer.MAX_VALUE - this.f4328b);
        throw new GeneralSecurityException(a3.toString());
    }

    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.f4328b;
        if (length >= i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            int length2 = bArr.length;
            int i3 = this.f4328b;
            byte[] bArr3 = new byte[(length2 - i3)];
            a(bArr, i3, bArr.length - i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void a(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, byte[] bArr3, boolean z) {
        Cipher a2 = y.f4361f.a("AES/CTR/NoPadding");
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f4328b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            a2.init(1, this.a, ivParameterSpec);
        } else {
            a2.init(2, this.a, ivParameterSpec);
        }
        if (a2.doFinal(bArr, i2, i3, bArr2, i4) != i3) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
