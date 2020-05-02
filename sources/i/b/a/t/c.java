package i.b.a.t;

import i.a.a.a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream */
public final class c extends FilterInputStream {
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public int f2864f;

    public c(InputStream inputStream, long j2) {
        super(inputStream);
        this.e = j2;
    }

    public synchronized int available() {
        return (int) Math.max(this.e - ((long) this.f2864f), (long) this.in.available());
    }

    public final int b(int i2) {
        if (i2 >= 0) {
            this.f2864f += i2;
        } else if (this.e - ((long) this.f2864f) > 0) {
            StringBuilder a = a.a("Failed to read all expected data, expected: ");
            a.append(this.e);
            a.append(", but read: ");
            a.append(this.f2864f);
            throw new IOException(a.toString());
        }
        return i2;
    }

    public synchronized int read() {
        int read;
        read = super.read();
        b(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i2, int i3) {
        int read;
        read = super.read(bArr, i2, i3);
        b(read);
        return read;
    }
}
