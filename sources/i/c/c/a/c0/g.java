package i.c.c.a.c0;

import i.a.a.a.a;
import i.c.a.b.d.l.q;
import i.c.c.a.d;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesSiv */
public final class g implements d {
    public static final Collection<Integer> c = Arrays.asList(new Integer[]{64});
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4331b;

    public g(byte[] bArr) {
        if (c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f4331b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.a = new a(copyOfRange, 16);
            return;
        }
        StringBuilder a2 = a.a("invalid key size: ");
        a2.append(bArr.length);
        a2.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(a2.toString());
    }

    public final byte[] a(byte[]... bArr) {
        byte[] bArr2;
        if (bArr.length == 0) {
            return this.a.a(e);
        }
        byte[] a2 = this.a.a(d);
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            a2 = q.c(q.b(a2), this.a.a(bArr[i2]));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length < 16) {
            bArr2 = q.c(q.a(bArr3), q.b(a2));
        } else if (bArr3.length >= a2.length) {
            int length = bArr3.length - a2.length;
            bArr2 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i3 = 0; i3 < a2.length; i3++) {
                int i4 = length + i3;
                bArr2[i4] = (byte) (bArr2[i4] ^ a2[i3]);
            }
        } else {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        return this.a.a(bArr2);
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a2 = y.f4361f.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a2.init(2, new SecretKeySpec(this.f4331b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a2.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && q.e()) {
                doFinal = new byte[0];
            }
            if (q.b(copyOfRange, a(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a2 = y.f4361f.a("AES/CTR/NoPadding");
            byte[] a3 = a(bArr2, bArr);
            byte[] bArr3 = (byte[]) a3.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a2.init(1, new SecretKeySpec(this.f4331b, "AES"), new IvParameterSpec(bArr3));
            return q.a(a3, a2.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
