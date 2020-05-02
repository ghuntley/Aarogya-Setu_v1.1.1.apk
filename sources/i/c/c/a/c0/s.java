package i.c.c.a.c0;

import i.c.c.a.p;

/* compiled from: Ed25519Sign */
public final class s implements p {
    public final byte[] a;

    public s(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] a2 = q.a(bArr);
            this.a = a2;
            q.b(a2);
            return;
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", new Object[]{32}));
    }
}
