package i.c.c.a.c0;

import i.c.c.a.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesEaxJce */
public final class d implements a {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4329b;
    public final SecretKeySpec c;
    public final int d;

    public d(byte[] bArr, int i2) {
        if (i2 == 12 || i2 == 16) {
            this.d = i2;
            i0.a(bArr.length);
            this.c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.c);
            byte[] a2 = a(instance.doFinal(new byte[16]));
            this.a = a2;
            this.f4329b = a(a2);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        int i3 = 0;
        while (i3 < 15) {
            int i4 = i3 + 1;
            bArr2[i3] = (byte) (((bArr[i3] << 1) ^ ((bArr[i4] & 255) >>> 7)) & 255);
            i3 = i4;
        }
        int i5 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i2 = 135;
        }
        bArr2[15] = (byte) (i5 ^ i2);
        return bArr2;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.d) - 16;
        if (length >= 0) {
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.c);
            byte[] a2 = a(instance, 0, bArr, 0, this.d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] a3 = a(instance, 1, bArr3, 0, bArr3.length);
            byte[] a4 = a(instance, 2, bArr, this.d, length);
            int length2 = bArr.length - 16;
            byte b2 = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                b2 = (byte) (b2 | (((bArr[length2 + i2] ^ a3[i2]) ^ a2[i2]) ^ a4[i2]));
            }
            if (b2 == 0) {
                Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
                instance2.init(1, this.c, new IvParameterSpec(a2));
                return instance2.doFinal(bArr, this.d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] a(Cipher cipher, int i2, byte[] bArr, int i3, int i4) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(c(bArr3, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i5 = 0;
        while (i4 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i3 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i3, i3 + i4);
        if (copyOfRange.length == 16) {
            bArr2 = c(copyOfRange, this.a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f4329b, 16);
            for (int i7 = 0; i7 < copyOfRange.length; i7++) {
                copyOf[i7] = (byte) (copyOf[i7] ^ copyOfRange[i7]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(c(doFinal, bArr2));
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i2 = this.d;
        if (length <= (Integer.MAX_VALUE - i2) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i2 + 16)];
            byte[] a2 = g0.a(i2);
            System.arraycopy(a2, 0, bArr4, 0, this.d);
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.c);
            byte[] a3 = a(instance, 0, a2, 0, a2.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a4 = a(instance, 1, bArr5, 0, bArr5.length);
            Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
            instance2.init(1, this.c, new IvParameterSpec(a3));
            instance2.doFinal(bArr, 0, bArr3.length, bArr4, this.d);
            byte[] a5 = a(instance, 2, bArr4, this.d, bArr3.length);
            int length2 = bArr3.length + this.d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr4[length2 + i3] = (byte) ((a4[i3] ^ a3[i3]) ^ a5[i3]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
