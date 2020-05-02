package i.c.c.a.c0;

import i.c.a.b.d.l.q;
import i.c.c.a.a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesGcmJce */
public final class f implements a {
    public final SecretKey a;

    public f(byte[] bArr) {
        i0.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a2 = g0.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            Cipher a3 = y.f4361f.a("AES/GCM/NoPadding");
            a3.init(1, this.a, a(a2, 0, a2.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                a3.updateAAD(bArr2);
            }
            int doFinal = a3.doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec a2 = a(bArr, 0, 12);
            Cipher a3 = y.f4361f.a("AES/GCM/NoPadding");
            a3.init(2, this.a, a2);
            if (!(bArr2 == null || bArr2.length == 0)) {
                a3.updateAAD(bArr2);
            }
            return a3.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public static AlgorithmParameterSpec a(byte[] bArr, int i2, int i3) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i2, i3);
        } catch (ClassNotFoundException unused) {
            if (q.e()) {
                return new IvParameterSpec(bArr, i2, i3);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }
}
