package i.b.a.t;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream */
public class h extends FilterInputStream {
    public int e = RecyclerView.UNDEFINED_DURATION;

    public h(InputStream inputStream) {
        super(inputStream);
    }

    public int available() {
        int i2 = this.e;
        if (i2 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i2, super.available());
    }

    public final long e(long j2) {
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : (long) i2;
    }

    public final void f(long j2) {
        int i2 = this.e;
        if (i2 != Integer.MIN_VALUE && j2 != -1) {
            this.e = (int) (((long) i2) - j2);
        }
    }

    public synchronized void mark(int i2) {
        super.mark(i2);
        this.e = i2;
    }

    public int read() {
        if (e(1) == -1) {
            return -1;
        }
        int read = super.read();
        f(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.e = RecyclerView.UNDEFINED_DURATION;
    }

    public long skip(long j2) {
        long e2 = e(j2);
        if (e2 == -1) {
            return 0;
        }
        long skip = super.skip(e2);
        f(skip);
        return skip;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int e2 = (int) e((long) i3);
        if (e2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, e2);
        f((long) read);
        return read;
    }
}
