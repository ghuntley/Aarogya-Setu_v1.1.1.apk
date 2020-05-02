package i.b.a.n.o.d;

import g.a.a.b.a;
import i.b.a.n.m.v;

/* compiled from: BytesResource */
public class b implements v<byte[]> {
    public final byte[] e;

    public b(byte[] bArr) {
        a.a(bArr, "Argument must not be null");
        this.e = bArr;
    }

    public int b() {
        return this.e.length;
    }

    public Class<byte[]> c() {
        return byte[].class;
    }

    public void d() {
    }

    public Object get() {
        return this.e;
    }
}
