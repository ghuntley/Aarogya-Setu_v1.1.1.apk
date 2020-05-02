package i.b.a.l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader */
public class b implements Closeable {
    public final InputStream e;

    /* renamed from: f  reason: collision with root package name */
    public final Charset f2452f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f2453g;

    /* renamed from: h  reason: collision with root package name */
    public int f2454h;

    /* renamed from: i  reason: collision with root package name */
    public int f2455i;

    /* compiled from: StrictLineReader */
    public class a extends ByteArrayOutputStream {
        public a(int i2) {
            super(i2);
        }

        public String toString() {
            int i2 = this.count;
            try {
                return new String(this.buf, 0, (i2 <= 0 || this.buf[i2 + -1] != 13) ? this.count : i2 - 1, b.this.f2452f.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(c.a)) {
            this.e = inputStream;
            this.f2452f = charset;
            this.f2453g = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void a() {
        InputStream inputStream = this.e;
        byte[] bArr = this.f2453g;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f2454h = 0;
            this.f2455i = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.e) {
            if (this.f2453g != null) {
                this.f2453g = null;
                this.e.close();
            }
        }
    }

    public String f() {
        int i2;
        int i3;
        synchronized (this.e) {
            if (this.f2453g != null) {
                if (this.f2454h >= this.f2455i) {
                    a();
                }
                for (int i4 = this.f2454h; i4 != this.f2455i; i4++) {
                    if (this.f2453g[i4] == 10) {
                        if (i4 != this.f2454h) {
                            i3 = i4 - 1;
                            if (this.f2453g[i3] == 13) {
                                String str = new String(this.f2453g, this.f2454h, i3 - this.f2454h, this.f2452f.name());
                                this.f2454h = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        String str2 = new String(this.f2453g, this.f2454h, i3 - this.f2454h, this.f2452f.name());
                        this.f2454h = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f2455i - this.f2454h) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f2453g, this.f2454h, this.f2455i - this.f2454h);
                    this.f2455i = -1;
                    a();
                    i2 = this.f2454h;
                    while (true) {
                        if (i2 != this.f2455i) {
                            if (this.f2453g[i2] == 10) {
                                break loop1;
                            }
                            i2++;
                        }
                    }
                }
                if (i2 != this.f2454h) {
                    aVar.write(this.f2453g, this.f2454h, i2 - this.f2454h);
                }
                this.f2454h = i2 + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
