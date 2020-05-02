package i.c.c.a.c0;

import i.c.c.a.q;

/* compiled from: Ed25519Verify */
public final class t implements q {
    public t(byte[] bArr) {
        if (bArr.length == 32) {
            int length = bArr.length;
            System.arraycopy(bArr, 0, new byte[length], 0, length);
            return;
        }
        throw new IllegalArgumentException(String.format("Given public key's length is not %s.", new Object[]{32}));
    }
}
