package i.c.c.a.c0;

import i.c.a.b.d.l.q;
import i.c.c.a.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* compiled from: ChaCha20Poly1305 */
public final class j implements a {
    public final h0 a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f4342b;

    public j(byte[] bArr) {
        byte[] bArr2 = (byte[]) bArr.clone();
        this.a = new i(bArr, 1);
        this.f4342b = new i(bArr, 0);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        i iVar = (i) this.a;
        if (iVar == null) {
            throw null;
        } else if (length <= 2147483619) {
            int length2 = bArr.length;
            if (iVar != null) {
                ByteBuffer allocate = ByteBuffer.allocate(length2 + 12 + 16);
                a(allocate, bArr, bArr2);
                return allocate.array();
            }
            throw null;
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        return a(ByteBuffer.wrap(bArr), bArr2);
    }

    public final void a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        int remaining = byteBuffer.remaining();
        int length = bArr.length;
        if (((i) this.a) == null) {
            throw null;
        } else if (remaining >= length + 12 + 16) {
            int position = byteBuffer.position();
            this.a.a(byteBuffer, bArr);
            byteBuffer.position(position);
            if (((i) this.a) != null) {
                byte[] bArr3 = new byte[12];
                byteBuffer.get(bArr3);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] a2 = q.a(a(bArr3), a(bArr2, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(a2);
                return;
            }
            throw null;
        } else {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
    }

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr) {
        int remaining = byteBuffer.remaining();
        if (((i) this.a) == null) {
            throw null;
        } else if (remaining >= 28) {
            int position = byteBuffer.position();
            byte[] bArr2 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (((i) this.a) != null) {
                byte[] bArr3 = new byte[12];
                byteBuffer.get(bArr3);
                if (bArr == null) {
                    bArr = new byte[0];
                }
                try {
                    if (q.b(q.a(a(bArr3), a(bArr, byteBuffer)), bArr2)) {
                        byteBuffer.position(position);
                        return this.a.a(byteBuffer);
                    }
                    throw new GeneralSecurityException("invalid MAC");
                } catch (GeneralSecurityException e) {
                    throw new AEADBadTagException(e.toString());
                }
            } else {
                throw null;
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public static byte[] a(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i2 = remaining % 16;
        int i3 = (i2 == 0 ? remaining : (remaining + 16) - i2) + length;
        ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i3);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f4342b.a(bArr, 0).get(bArr2);
        return bArr2;
    }
}
