package n.n;

import java.util.NoSuchElementException;
import n.i.c;

/* compiled from: ProgressionIterators.kt */
public final class b extends c {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5221f;

    /* renamed from: g  reason: collision with root package name */
    public int f5222g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5223h;

    public b(int i2, int i3, int i4) {
        this.f5223h = i4;
        this.e = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f5221f = z;
        this.f5222g = !z ? this.e : i2;
    }

    public int b() {
        int i2 = this.f5222g;
        if (i2 != this.e) {
            this.f5222g = this.f5223h + i2;
        } else if (this.f5221f) {
            this.f5221f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.f5221f;
    }
}
