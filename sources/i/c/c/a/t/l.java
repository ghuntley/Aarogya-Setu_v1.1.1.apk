package i.c.c.a.t;

import i.c.c.a.a;
import i.c.c.a.r;
import i.c.c.a.z.z1;
import i.c.f.f;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: KmsEnvelopeAead */
public final class l implements a {
    public static final byte[] c = new byte[0];
    public final z1 a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4371b;

    public l(z1 z1Var, a aVar) {
        this.a = z1Var;
        this.f4371b = aVar;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] b2 = r.a(this.a).b();
        byte[] a2 = this.f4371b.a(b2, c);
        String str = this.a.f4632h;
        byte[] a3 = ((a) r.b(str).c(f.a(b2))).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 <= 0 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i2];
            wrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((a) r.a(this.a.f4632h, this.f4371b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
