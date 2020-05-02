package p;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource */
public final class p implements a0 {
    public final h e;

    /* renamed from: f  reason: collision with root package name */
    public final Inflater f5661f;

    /* renamed from: g  reason: collision with root package name */
    public int f5662g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5663h;

    public p(h hVar, Inflater inflater) {
        if (hVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.e = hVar;
            this.f5661f = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final void a() {
        int i2 = this.f5662g;
        if (i2 != 0) {
            int remaining = i2 - this.f5661f.getRemaining();
            this.f5662g -= remaining;
            this.e.skip((long) remaining);
        }
    }

    public long b(f fVar, long j2) {
        w b2;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (this.f5663h) {
            throw new IllegalStateException("closed");
        } else if (i2 == 0) {
            return 0;
        } else {
            while (true) {
                boolean z = false;
                if (this.f5661f.needsInput()) {
                    a();
                    if (this.f5661f.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.e.l()) {
                        z = true;
                    } else {
                        w wVar = this.e.b().e;
                        int i3 = wVar.c;
                        int i4 = wVar.f5672b;
                        int i5 = i3 - i4;
                        this.f5662g = i5;
                        this.f5661f.setInput(wVar.a, i4, i5);
                    }
                }
                try {
                    b2 = fVar.b(1);
                    int inflate = this.f5661f.inflate(b2.a, b2.c, (int) Math.min(j2, (long) (8192 - b2.c)));
                    if (inflate > 0) {
                        b2.c += inflate;
                        long j3 = (long) inflate;
                        fVar.f5646f += j3;
                        return j3;
                    } else if (this.f5661f.finished()) {
                        break;
                    } else if (this.f5661f.needsDictionary()) {
                        break;
                    } else if (z) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            a();
            if (b2.f5672b != b2.c) {
                return -1;
            }
            fVar.e = b2.a();
            x.a(b2);
            return -1;
        }
    }

    public b0 c() {
        return this.e.c();
    }

    public void close() {
        if (!this.f5663h) {
            this.f5661f.end();
            this.f5663h = true;
            this.e.close();
        }
    }
}
