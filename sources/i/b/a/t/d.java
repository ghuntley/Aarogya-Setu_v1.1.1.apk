package i.b.a.t;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionCatchingInputStream */
public class d extends InputStream {

    /* renamed from: g  reason: collision with root package name */
    public static final Queue<d> f2865g = j.a(0);
    public InputStream e;

    /* renamed from: f  reason: collision with root package name */
    public IOException f2866f;

    public static d a(InputStream inputStream) {
        d poll;
        synchronized (f2865g) {
            poll = f2865g.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.e = inputStream;
        return poll;
    }

    public int available() {
        return this.e.available();
    }

    public void close() {
        this.e.close();
    }

    public void mark(int i2) {
        this.e.mark(i2);
    }

    public boolean markSupported() {
        return this.e.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.e.read(bArr);
        } catch (IOException e2) {
            this.f2866f = e2;
            return -1;
        }
    }

    public synchronized void reset() {
        this.e.reset();
    }

    public long skip(long j2) {
        try {
            return this.e.skip(j2);
        } catch (IOException e2) {
            this.f2866f = e2;
            return 0;
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.e.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f2866f = e2;
            return -1;
        }
    }

    public int read() {
        try {
            return this.e.read();
        } catch (IOException e2) {
            this.f2866f = e2;
            return -1;
        }
    }

    public void a() {
        this.f2866f = null;
        this.e = null;
        synchronized (f2865g) {
            f2865g.offer(this);
        }
    }
}
