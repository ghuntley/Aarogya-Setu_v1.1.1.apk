package p;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: GzipSink */
public final class n implements z {
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final Deflater f5653f;

    /* renamed from: g  reason: collision with root package name */
    public final j f5654g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5655h;

    /* renamed from: i  reason: collision with root package name */
    public final CRC32 f5656i = new CRC32();

    public n(z zVar) {
        if (zVar != null) {
            this.f5653f = new Deflater(-1, true);
            g a = r.a(zVar);
            this.e = a;
            this.f5654g = new j(a, this.f5653f);
            f b2 = this.e.b();
            b2.writeShort(8075);
            b2.writeByte(8);
            b2.writeByte(0);
            b2.writeInt(0);
            b2.writeByte(0);
            b2.writeByte(0);
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public void a(f fVar, long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (i2 != 0) {
            w wVar = fVar.e;
            long j3 = j2;
            while (j3 > 0) {
                int min = (int) Math.min(j3, (long) (wVar.c - wVar.f5672b));
                this.f5656i.update(wVar.a, wVar.f5672b, min);
                j3 -= (long) min;
                wVar = wVar.f5673f;
            }
            this.f5654g.a(fVar, j2);
        }
    }

    public b0 c() {
        return this.e.c();
    }

    public void close() {
        if (!this.f5655h) {
            try {
                j jVar = this.f5654g;
                jVar.f5651f.finish();
                jVar.a(false);
                this.e.a((int) this.f5656i.getValue());
                this.e.a((int) this.f5653f.getBytesRead());
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f5653f.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.e.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f5655h = true;
            if (th != null) {
                c0.a(th);
                throw null;
            }
        }
    }

    public void flush() {
        this.f5654g.flush();
    }
}
