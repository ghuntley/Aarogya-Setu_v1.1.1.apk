package p;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource */
public final class o implements a0 {
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final h f5657f;

    /* renamed from: g  reason: collision with root package name */
    public final Inflater f5658g;

    /* renamed from: h  reason: collision with root package name */
    public final p f5659h;

    /* renamed from: i  reason: collision with root package name */
    public final CRC32 f5660i = new CRC32();

    public o(a0 a0Var) {
        if (a0Var != null) {
            this.f5658g = new Inflater(true);
            h a = r.a(a0Var);
            this.f5657f = a;
            this.f5659h = new p(a, this.f5658g);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void a(f fVar, long j2, long j3) {
        w wVar = fVar.e;
        while (true) {
            int i2 = wVar.c;
            int i3 = wVar.f5672b;
            if (j2 < ((long) (i2 - i3))) {
                break;
            }
            j2 -= (long) (i2 - i3);
            wVar = wVar.f5673f;
        }
        while (j3 > 0) {
            int i4 = (int) (((long) wVar.f5672b) + j2);
            int min = (int) Math.min((long) (wVar.c - i4), j3);
            this.f5660i.update(wVar.a, i4, min);
            j3 -= (long) min;
            wVar = wVar.f5673f;
            j2 = 0;
        }
    }

    public long b(f fVar, long j2) {
        long j3;
        f fVar2 = fVar;
        long j4 = j2;
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j4);
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.e == 0) {
                this.f5657f.g(10);
                byte e2 = this.f5657f.b().e(3);
                boolean z = ((e2 >> 1) & 1) == 1;
                if (z) {
                    a(this.f5657f.b(), 0, 10);
                }
                a("ID1ID2", 8075, (int) this.f5657f.readShort());
                this.f5657f.skip(8);
                if (((e2 >> 2) & 1) == 1) {
                    this.f5657f.g(2);
                    if (z) {
                        a(this.f5657f.b(), 0, 2);
                    }
                    long e3 = (long) this.f5657f.b().e();
                    this.f5657f.g(e3);
                    if (z) {
                        j3 = e3;
                        a(this.f5657f.b(), 0, e3);
                    } else {
                        j3 = e3;
                    }
                    this.f5657f.skip(j3);
                }
                if (((e2 >> 3) & 1) == 1) {
                    long a = this.f5657f.a((byte) 0);
                    if (a != -1) {
                        if (z) {
                            a(this.f5657f.b(), 0, a + 1);
                        }
                        this.f5657f.skip(a + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((e2 >> 4) & 1) == 1) {
                    long a2 = this.f5657f.a((byte) 0);
                    if (a2 != -1) {
                        if (z) {
                            a(this.f5657f.b(), 0, a2 + 1);
                        }
                        this.f5657f.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    a("FHCRC", (int) this.f5657f.e(), (int) (short) ((int) this.f5660i.getValue()));
                    this.f5660i.reset();
                }
                this.e = 1;
            }
            if (this.e == 1) {
                long j5 = fVar2.f5646f;
                long b2 = this.f5659h.b(fVar2, j4);
                if (b2 != -1) {
                    a(fVar, j5, b2);
                    return b2;
                }
                this.e = 2;
            }
            if (this.e == 2) {
                a("CRC", this.f5657f.k(), (int) this.f5660i.getValue());
                a("ISIZE", this.f5657f.k(), (int) this.f5658g.getBytesWritten());
                this.e = 3;
                if (!this.f5657f.l()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public b0 c() {
        return this.f5657f.c();
    }

    public void close() {
        this.f5659h.close();
    }

    public final void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
    }
}
