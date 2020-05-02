package n.n;

import i.c.d.p.e;
import java.util.Iterator;

/* compiled from: Progressions.kt */
public class a implements Iterable<Integer> {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5219f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5220g;

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.e = i2;
            if (i4 > 0) {
                if (i2 < i3) {
                    i3 -= e.b(e.b(i3, i4) - e.b(i2, i4), i4);
                }
            } else if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i2 > i3) {
                int i5 = -i4;
                i3 += e.b(e.b(i2, i5) - e.b(i3, i5), i5);
            }
            this.f5219f = i3;
            this.f5220g = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public Iterator iterator() {
        return new b(this.e, this.f5219f, this.f5220g);
    }
}
