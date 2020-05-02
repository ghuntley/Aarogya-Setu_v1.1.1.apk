package i.b.a.n.m.b0;

/* compiled from: IntegerArrayAdapter */
public final class h implements a<int[]> {
    public int a(Object obj) {
        return ((int[]) obj).length;
    }

    public String a() {
        return "IntegerArrayPool";
    }

    public int b() {
        return 4;
    }

    public Object newArray(int i2) {
        return new int[i2];
    }
}
