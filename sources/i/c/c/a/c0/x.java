package i.c.c.a.c0;

import i.c.a.b.d.l.q;
import i.c.c.a.a;
import i.c.c.a.m;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: EncryptThenAuthenticate */
public final class x implements a {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final m f4360b;
    public final int c;

    public x(d0 d0Var, m mVar, int i2) {
        this.a = d0Var;
        this.f4360b = mVar;
        this.c = i2;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return q.a(a2, this.f4360b.a(q.a(bArr2, a2, copyOf)));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.c;
        if (length >= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f4360b.a(copyOfRange2, q.a(bArr2, copyOfRange, copyOf));
            return this.a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
