package i.b.a.n.l;

import i.a.a.a.a;
import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: ExifOrientationStream */
public final class g extends FilterInputStream {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f2507g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f2508h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f2509i;
    public final byte e;

    /* renamed from: f  reason: collision with root package name */
    public int f2510f;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f2507g = bArr;
        int length = bArr.length;
        f2508h = length;
        f2509i = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(a.b("Cannot add invalid orientation: ", i2));
        }
        this.e = (byte) i2;
    }

    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i2;
        int i3;
        int i4 = this.f2510f;
        if (i4 < 2 || i4 > (i3 = f2509i)) {
            i2 = super.read();
        } else if (i4 == i3) {
            i2 = this.e;
        } else {
            i2 = f2507g[i4 - 2] & 255;
        }
        if (i2 != -1) {
            this.f2510f++;
        }
        return i2;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j2) {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.f2510f = (int) (((long) this.f2510f) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = this.f2510f;
        int i6 = f2509i;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.e;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(f2507g, this.f2510f - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f2510f += i4;
        }
        return i4;
    }
}
