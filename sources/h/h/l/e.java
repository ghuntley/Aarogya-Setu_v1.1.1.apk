package h.h.l;

/* compiled from: Pools */
public class e<T> extends d<T> {
    public final Object c = new Object();

    public e(int i2) {
        super(i2);
    }

    public T a() {
        T a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }
}
