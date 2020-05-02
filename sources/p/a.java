package p;

import java.io.IOException;

/* compiled from: AsyncTimeout */
public class a implements z {
    public final /* synthetic */ z e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f5637f;

    public a(c cVar, z zVar) {
        this.f5637f = cVar;
        this.e = zVar;
    }

    public void a(f fVar, long j2) {
        c0.a(fVar.f5646f, 0, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                w wVar = fVar.e;
                while (true) {
                    if (j3 >= 65536) {
                        break;
                    }
                    j3 += (long) (wVar.c - wVar.f5672b);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    }
                    wVar = wVar.f5673f;
                }
                this.f5637f.f();
                try {
                    this.e.a(fVar, j3);
                    j2 -= j3;
                    this.f5637f.a(true);
                } catch (IOException e2) {
                    e = e2;
                    c cVar = this.f5637f;
                    if (cVar.g()) {
                        e = cVar.a(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    this.f5637f.a(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public b0 c() {
        return this.f5637f;
    }

    public void close() {
        this.f5637f.f();
        try {
            this.e.close();
            this.f5637f.a(true);
        } catch (IOException e2) {
            e = e2;
            c cVar = this.f5637f;
            if (cVar.g()) {
                e = cVar.a(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f5637f.a(false);
            throw th;
        }
    }

    public void flush() {
        this.f5637f.f();
        try {
            this.e.flush();
            this.f5637f.a(true);
        } catch (IOException e2) {
            e = e2;
            c cVar = this.f5637f;
            if (cVar.g()) {
                e = cVar.a(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f5637f.a(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder a = i.a.a.a.a.a("AsyncTimeout.sink(");
        a.append(this.e);
        a.append(")");
        return a.toString();
    }
}
