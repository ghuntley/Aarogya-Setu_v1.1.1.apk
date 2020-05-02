package p;

import i.a.a.a.a;
import java.nio.ByteBuffer;

/* compiled from: RealBufferedSink */
public final class u implements g {
    public final f e = new f();

    /* renamed from: f  reason: collision with root package name */
    public final z f5668f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5669g;

    public u(z zVar) {
        if (zVar != null) {
            this.f5668f = zVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public void a(f fVar, long j2) {
        if (!this.f5669g) {
            this.e.a(fVar, j2);
            g();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public f b() {
        return this.e;
    }

    public b0 c() {
        return this.f5668f.c();
    }

    public void close() {
        if (!this.f5669g) {
            try {
                if (this.e.f5646f > 0) {
                    this.f5668f.a(this.e, this.e.f5646f);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f5668f.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f5669g = true;
            if (th != null) {
                c0.a(th);
                throw null;
            }
        }
    }

    public void flush() {
        if (!this.f5669g) {
            f fVar = this.e;
            long j2 = fVar.f5646f;
            if (j2 > 0) {
                this.f5668f.a(fVar, j2);
            }
            this.f5668f.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public g g() {
        if (!this.f5669g) {
            long j2 = this.e.j();
            if (j2 > 0) {
                this.f5668f.a(this.e, j2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g h(long j2) {
        if (!this.f5669g) {
            this.e.h(j2);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f5669g;
    }

    public String toString() {
        StringBuilder a = a.a("buffer(");
        a.append(this.f5668f);
        a.append(")");
        return a.toString();
    }

    public g write(byte[] bArr) {
        if (!this.f5669g) {
            this.e.write(bArr);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g writeByte(int i2) {
        if (!this.f5669g) {
            this.e.writeByte(i2);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g writeInt(int i2) {
        if (!this.f5669g) {
            this.e.writeInt(i2);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g writeShort(int i2) {
        if (!this.f5669g) {
            this.e.writeShort(i2);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g a(i iVar) {
        if (!this.f5669g) {
            this.e.a(iVar);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g write(byte[] bArr, int i2, int i3) {
        if (!this.f5669g) {
            this.e.write(bArr, i2, i3);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g a(String str) {
        if (!this.f5669g) {
            this.e.a(str);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.f5669g) {
            int write = this.e.write(byteBuffer);
            g();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public g a(int i2) {
        if (!this.f5669g) {
            f fVar = this.e;
            if (fVar != null) {
                fVar.writeInt(c0.a(i2));
                g();
                return this;
            }
            throw null;
        }
        throw new IllegalStateException("closed");
    }

    public g a(long j2) {
        if (!this.f5669g) {
            this.e.a(j2);
            g();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
