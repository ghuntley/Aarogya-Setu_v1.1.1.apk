package i.c.a.b.g.g;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class w2 implements b3 {
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f3510f = this.f3511g.a();

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u2 f3511g;

    public w2(u2 u2Var) {
        this.f3511g = u2Var;
    }

    public final byte a() {
        int i2 = this.e;
        if (i2 < this.f3510f) {
            this.e = i2 + 1;
            return this.f3511g.b(i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.e < this.f3510f;
    }

    public Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
