package p;

import i.a.a.a.a;
import java.io.OutputStream;

/* compiled from: Okio */
public final class q implements z {
    public final /* synthetic */ b0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ OutputStream f5664f;

    public q(b0 b0Var, OutputStream outputStream) {
        this.e = b0Var;
        this.f5664f = outputStream;
    }

    public void a(f fVar, long j2) {
        c0.a(fVar.f5646f, 0, j2);
        while (j2 > 0) {
            this.e.e();
            w wVar = fVar.e;
            int min = (int) Math.min(j2, (long) (wVar.c - wVar.f5672b));
            this.f5664f.write(wVar.a, wVar.f5672b, min);
            int i2 = wVar.f5672b + min;
            wVar.f5672b = i2;
            long j3 = (long) min;
            j2 -= j3;
            fVar.f5646f -= j3;
            if (i2 == wVar.c) {
                fVar.e = wVar.a();
                x.a(wVar);
            }
        }
    }

    public b0 c() {
        return this.e;
    }

    public void close() {
        this.f5664f.close();
    }

    public void flush() {
        this.f5664f.flush();
    }

    public String toString() {
        StringBuilder a = a.a("sink(");
        a.append(this.f5664f);
        a.append(")");
        return a.toString();
    }
}
