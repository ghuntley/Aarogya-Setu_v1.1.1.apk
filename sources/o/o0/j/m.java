package o.o0.j;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.o0.e;
import o.o0.j.c;
import p.f;
import p.g;

/* compiled from: Http2Writer */
public final class m implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public static final Logger f5584k = Logger.getLogger(d.class.getName());
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5585f;

    /* renamed from: g  reason: collision with root package name */
    public final f f5586g;

    /* renamed from: h  reason: collision with root package name */
    public int f5587h = 16384;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5588i;

    /* renamed from: j  reason: collision with root package name */
    public final c.b f5589j;

    public m(g gVar, boolean z) {
        this.e = gVar;
        this.f5585f = z;
        f fVar = new f();
        this.f5586g = fVar;
        this.f5589j = new c.b(fVar);
    }

    public synchronized void a() {
        if (this.f5588i) {
            throw new IOException("closed");
        } else if (this.f5585f) {
            if (f5584k.isLoggable(Level.FINE)) {
                f5584k.fine(e.a(">> CONNECTION %s", d.a.g()));
            }
            this.e.write(d.a.l());
            this.e.flush();
        }
    }

    public synchronized void b(p pVar) {
        if (!this.f5588i) {
            a(0, Integer.bitCount(pVar.a) * 6, (byte) 4, (byte) 0);
            int i2 = 0;
            while (i2 < 10) {
                boolean z = true;
                if (((1 << i2) & pVar.a) == 0) {
                    z = false;
                }
                if (z) {
                    this.e.writeShort(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.e.writeInt(pVar.f5592b[i2]);
                }
                i2++;
            }
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f5588i = true;
        this.e.close();
    }

    public synchronized void flush() {
        if (!this.f5588i) {
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(p pVar) {
        if (!this.f5588i) {
            int i2 = this.f5587h;
            if ((pVar.a & 32) != 0) {
                i2 = pVar.f5592b[5];
            }
            this.f5587h = i2;
            int i3 = -1;
            if (((pVar.a & 2) != 0 ? pVar.f5592b[1] : -1) != -1) {
                c.b bVar = this.f5589j;
                if ((pVar.a & 2) != 0) {
                    i3 = pVar.f5592b[1];
                }
                if (bVar != null) {
                    int min = Math.min(i3, 16384);
                    int i4 = bVar.e;
                    if (i4 != min) {
                        if (min < i4) {
                            bVar.c = Math.min(bVar.c, min);
                        }
                        bVar.d = true;
                        bVar.e = min;
                        int i5 = bVar.f5500i;
                        if (min < i5) {
                            if (min == 0) {
                                bVar.a();
                            } else {
                                bVar.a(i5 - min);
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void b(int i2, long j2) {
        while (j2 > 0) {
            int min = (int) Math.min((long) this.f5587h, j2);
            long j3 = (long) min;
            j2 -= j3;
            a(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : 0);
            this.e.a(this.f5586g, j3);
        }
    }

    public synchronized void a(int i2, int i3, List<b> list) {
        if (!this.f5588i) {
            this.f5589j.a(list);
            long j2 = this.f5586g.f5646f;
            int min = (int) Math.min((long) (this.f5587h - 4), j2);
            long j3 = (long) min;
            int i4 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            a(i2, min + 4, (byte) 5, i4 == 0 ? (byte) 4 : 0);
            this.e.writeInt(i3 & Integer.MAX_VALUE);
            this.e.a(this.f5586g, j3);
            if (i4 > 0) {
                b(i2, j2 - j3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i2, a aVar) {
        if (this.f5588i) {
            throw new IOException("closed");
        } else if (aVar.e != -1) {
            a(i2, 4, (byte) 3, (byte) 0);
            this.e.writeInt(aVar.e);
            this.e.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void a(boolean z, int i2, f fVar, int i3) {
        if (!this.f5588i) {
            a(i2, i3, (byte) 0, z ? (byte) 1 : 0);
            if (i3 > 0) {
                this.e.a(fVar, (long) i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i2, int i3) {
        if (!this.f5588i) {
            a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.e.writeInt(i2);
            this.e.writeInt(i3);
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i2, a aVar, byte[] bArr) {
        if (this.f5588i) {
            throw new IOException("closed");
        } else if (aVar.e != -1) {
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.e.writeInt(i2);
            this.e.writeInt(aVar.e);
            if (bArr.length > 0) {
                this.e.write(bArr);
            }
            this.e.flush();
        } else {
            d.a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void a(int i2, long j2) {
        if (this.f5588i) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            d.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        } else {
            a(i2, 4, (byte) 8, (byte) 0);
            this.e.writeInt((int) j2);
            this.e.flush();
        }
    }

    public void a(int i2, int i3, byte b2, byte b3) {
        if (f5584k.isLoggable(Level.FINE)) {
            f5584k.fine(d.a(false, i2, i3, b2, b3));
        }
        int i4 = this.f5587h;
        if (i3 > i4) {
            d.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            g gVar = this.e;
            gVar.writeByte((i3 >>> 16) & 255);
            gVar.writeByte((i3 >>> 8) & 255);
            gVar.writeByte(i3 & 255);
            this.e.writeByte(b2 & 255);
            this.e.writeByte(b3 & 255);
            this.e.writeInt(i2 & Integer.MAX_VALUE);
        } else {
            d.a("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public synchronized void a(boolean z, int i2, List<b> list) {
        if (!this.f5588i) {
            this.f5589j.a(list);
            long j2 = this.f5586g.f5646f;
            int min = (int) Math.min((long) this.f5587h, j2);
            long j3 = (long) min;
            int i3 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            byte b2 = i3 == 0 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            a(i2, min, (byte) 1, b2);
            this.e.a(this.f5586g, j3);
            if (i3 > 0) {
                b(i2, j2 - j3);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
