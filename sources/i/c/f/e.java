package i.c.f;

import i.c.f.f;
import java.util.NoSuchElementException;

/* compiled from: ByteString */
public class e implements f.d {
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f4930f = this.f4931g.size();

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f4931g;

    public e(f fVar) {
        this.f4931g = fVar;
    }

    public boolean hasNext() {
        return this.e < this.f4930f;
    }

    public Object next() {
        try {
            f fVar = this.f4931g;
            int i2 = this.e;
            this.e = i2 + 1;
            return Byte.valueOf(fVar.c(i2));
        } catch (IndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
