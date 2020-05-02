package i.b.a.n.m.b0;

/* compiled from: ByteArrayAdapter */
public final class f implements a<byte[]> {
    public int a(Object obj) {
        return ((byte[]) obj).length;
    }

    public String a() {
        return "ByteArrayPool";
    }

    public int b() {
        return 1;
    }

    public Object newArray(int i2) {
        return new byte[i2];
    }
}
