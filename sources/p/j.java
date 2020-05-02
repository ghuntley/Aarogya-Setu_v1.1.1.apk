package p;

import i.a.a.a.a;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink */
public final class j implements z {
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final Deflater f5651f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5652g;

    public j(g gVar, Deflater deflater) {
        if (gVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.e = gVar;
            this.f5651f = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public void a(f fVar, long j2) {
        c0.a(fVar.f5646f, 0, j2);
        while (j2 > 0) {
            w wVar = fVar.e;
            int min = (int) Math.min(j2, (long) (wVar.c - wVar.f5672b));
            this.f5651f.setInput(wVar.a, wVar.f5672b, min);
            a(false);
            long j3 = (long) min;
            fVar.f5646f -= j3;
            int i2 = wVar.f5672b + min;
            wVar.f5672b = i2;
            if (i2 == wVar.c) {
                fVar.e = wVar.a();
                x.a(wVar);
            }
            j2 -= j3;
        }
    }

    public b0 c() {
        return this.e.c();
    }

    public void close() {
        if (!this.f5652g) {
            try {
                this.f5651f.finish();
                a(false);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f5651f.end();
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
            this.f5652g = true;
            if (th != null) {
                c0.a(th);
                throw null;
            }
        }
    }

    public void flush() {
        a(true);
        this.e.flush();
    }

    public String toString() {
        StringBuilder a = a.a("DeflaterSink(");
        a.append(this.e);
        a.append(")");
        return a.toString();
    }

    @IgnoreJRERequirement
    public final void a(boolean z) {
        w b2;
        int i2;
        f b3 = this.e.b();
        while (true) {
            b2 = b3.b(1);
            if (z) {
                Deflater deflater = this.f5651f;
                byte[] bArr = b2.a;
                int i3 = b2.c;
                i2 = deflater.deflate(bArr, i3, 8192 - i3, 2);
            } else {
                Deflater deflater2 = this.f5651f;
                byte[] bArr2 = b2.a;
                int i4 = b2.c;
                i2 = deflater2.deflate(bArr2, i4, 8192 - i4);
            }
            if (i2 > 0) {
                b2.c += i2;
                b3.f5646f += (long) i2;
                this.e.g();
            } else if (this.f5651f.needsInput()) {
                break;
            }
        }
        if (b2.f5672b == b2.c) {
            b3.e = b2.a();
            x.a(b2);
        }
    }
}
