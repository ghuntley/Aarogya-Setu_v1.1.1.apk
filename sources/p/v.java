package p;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource */
public final class v implements h {
    public final f e = new f();

    /* renamed from: f  reason: collision with root package name */
    public final a0 f5670f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5671g;

    public v(a0 a0Var) {
        if (a0Var != null) {
            this.f5670f = a0Var;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public int a(t tVar) {
        if (!this.f5671g) {
            do {
                int a2 = this.e.a(tVar, true);
                if (a2 == -1) {
                    return -1;
                }
                if (a2 != -2) {
                    this.e.skip((long) tVar.e[a2].h());
                    return a2;
                }
            } while (this.f5670f.b(this.e, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public f b() {
        return this.e;
    }

    public String c(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j2 + 1;
            long a2 = a((byte) 10, 0, j3);
            if (a2 != -1) {
                return this.e.f(a2);
            }
            if (j3 < RecyclerView.FOREVER_NS && d(j3) && this.e.e(j3 - 1) == 13 && d(1 + j3) && this.e.e(j3) == 10) {
                return this.e.f(j3);
            }
            f fVar = new f();
            f fVar2 = this.e;
            fVar2.a(fVar, 0, Math.min(32, fVar2.f5646f));
            StringBuilder a3 = i.a.a.a.a.a("\\n not found: limit=");
            a3.append(Math.min(this.e.f5646f, j2));
            a3.append(" content=");
            a3.append(fVar.q().g());
            a3.append(8230);
            throw new EOFException(a3.toString());
        }
        throw new IllegalArgumentException("limit < 0: " + j2);
    }

    public void close() {
        if (!this.f5671g) {
            this.f5671g = true;
            this.f5670f.close();
            this.e.h();
        }
    }

    public boolean d(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f5671g) {
            do {
                fVar = this.e;
                if (fVar.f5646f >= j2) {
                    return true;
                }
            } while (this.f5670f.b(fVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public short e() {
        g(2);
        return this.e.e();
    }

    public void g(long j2) {
        if (!d(j2)) {
            throw new EOFException();
        }
    }

    public f getBuffer() {
        return this.e;
    }

    public byte[] i(long j2) {
        if (d(j2)) {
            return this.e.i(j2);
        }
        throw new EOFException();
    }

    public boolean isOpen() {
        return !this.f5671g;
    }

    public int k() {
        g(4);
        return this.e.k();
    }

    public boolean l() {
        if (!this.f5671g) {
            return this.e.l() && this.f5670f.b(this.e, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public long n() {
        g(1);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!d((long) i3)) {
                break;
            }
            byte e2 = this.e.e((long) i2);
            if ((e2 >= 48 && e2 <= 57) || ((e2 >= 97 && e2 <= 102) || (e2 >= 65 && e2 <= 70))) {
                i2 = i3;
            } else if (i2 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(e2)}));
            }
        }
        return this.e.n();
    }

    public InputStream p() {
        return new a();
    }

    public int read(ByteBuffer byteBuffer) {
        f fVar = this.e;
        if (fVar.f5646f == 0 && this.f5670f.b(fVar, 8192) == -1) {
            return -1;
        }
        return this.e.read(byteBuffer);
    }

    public byte readByte() {
        g(1);
        return this.e.readByte();
    }

    public int readInt() {
        g(4);
        return this.e.readInt();
    }

    public short readShort() {
        g(2);
        return this.e.readShort();
    }

    public void skip(long j2) {
        if (!this.f5671g) {
            while (j2 > 0) {
                f fVar = this.e;
                if (fVar.f5646f == 0 && this.f5670f.b(fVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.e.f5646f);
                this.e.skip(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("buffer(");
        a2.append(this.f5670f);
        a2.append(")");
        return a2.toString();
    }

    public long b(f fVar, long j2) {
        if (fVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f5671g) {
            f fVar2 = this.e;
            if (fVar2.f5646f == 0 && this.f5670f.b(fVar2, 8192) == -1) {
                return -1;
            }
            return this.e.b(fVar, Math.min(j2, this.e.f5646f));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String i() {
        return c(RecyclerView.FOREVER_NS);
    }

    /* compiled from: RealBufferedSource */
    public class a extends InputStream {
        public a() {
        }

        public int available() {
            v vVar = v.this;
            if (!vVar.f5671g) {
                return (int) Math.min(vVar.e.f5646f, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() {
            v.this.close();
        }

        public int read() {
            v vVar = v.this;
            if (!vVar.f5671g) {
                f fVar = vVar.e;
                if (fVar.f5646f == 0 && vVar.f5670f.b(fVar, 8192) == -1) {
                    return -1;
                }
                return v.this.e.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return v.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i2, int i3) {
            if (!v.this.f5671g) {
                c0.a((long) bArr.length, (long) i2, (long) i3);
                v vVar = v.this;
                f fVar = vVar.e;
                if (fVar.f5646f == 0 && vVar.f5670f.b(fVar, 8192) == -1) {
                    return -1;
                }
                return v.this.e.a(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }

    public void a(byte[] bArr) {
        try {
            g((long) bArr.length);
            this.e.a(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                f fVar = this.e;
                long j2 = fVar.f5646f;
                if (j2 > 0) {
                    int a2 = fVar.a(bArr, i2, (int) j2);
                    if (a2 != -1) {
                        i2 += a2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    public i b(long j2) {
        if (d(j2)) {
            return this.e.b(j2);
        }
        throw new EOFException();
    }

    public long a(z zVar) {
        if (zVar != null) {
            long j2 = 0;
            while (this.f5670f.b(this.e, 8192) != -1) {
                long j3 = this.e.j();
                if (j3 > 0) {
                    j2 += j3;
                    zVar.a(this.e, j3);
                }
            }
            f fVar = this.e;
            long j4 = fVar.f5646f;
            if (j4 <= 0) {
                return j2;
            }
            long j5 = j2 + j4;
            zVar.a(fVar, j4);
            return j5;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public b0 c() {
        return this.f5670f.c();
    }

    public String a(Charset charset) {
        if (charset != null) {
            this.e.a(this.f5670f);
            return this.e.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public long a(byte b2) {
        return a(b2, 0, RecyclerView.FOREVER_NS);
    }

    public long a(byte b2, long j2, long j3) {
        if (this.f5671g) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
        } else {
            while (j2 < j3) {
                long a2 = this.e.a(b2, j2, j3);
                if (a2 == -1) {
                    f fVar = this.e;
                    long j4 = fVar.f5646f;
                    if (j4 >= j3 || this.f5670f.b(fVar, 8192) == -1) {
                        break;
                    }
                    j2 = Math.max(j2, j4);
                } else {
                    return a2;
                }
            }
            return -1;
        }
    }
}
