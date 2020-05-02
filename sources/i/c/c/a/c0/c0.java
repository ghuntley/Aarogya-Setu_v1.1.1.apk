package i.c.c.a.c0;

/* compiled from: ImmutableByteArray */
public final class c0 {
    public final byte[] a;

    public c0(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.a = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
    }
}
