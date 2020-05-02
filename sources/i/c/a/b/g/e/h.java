package i.c.a.b.g.e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class h extends FilterInputStream {
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f3179f = -1;

    public h(InputStream inputStream) {
        super(inputStream);
        if (inputStream != null) {
            this.e = 1048577;
            return;
        }
        throw null;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.e);
    }

    public final synchronized void mark(int i2) {
        this.in.mark(i2);
        this.f3179f = this.e;
    }

    public final int read() {
        if (this.e == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.e--;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f3179f != -1) {
            this.in.reset();
            this.e = this.f3179f;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j2) {
        long skip = this.in.skip(Math.min(j2, this.e));
        this.e -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.e;
        if (j2 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i2, (int) Math.min((long) i3, j2));
        if (read != -1) {
            this.e -= (long) read;
        }
        return read;
    }
}
