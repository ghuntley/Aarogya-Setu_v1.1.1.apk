package p;

import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout */
public class m extends b0 {
    public b0 e;

    public m(b0 b0Var) {
        if (b0Var != null) {
            this.e = b0Var;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public b0 a(long j2, TimeUnit timeUnit) {
        return this.e.a(j2, timeUnit);
    }

    public b0 b() {
        return this.e.b();
    }

    public long c() {
        return this.e.c();
    }

    public boolean d() {
        return this.e.d();
    }

    public void e() {
        this.e.e();
    }

    public b0 a(long j2) {
        return this.e.a(j2);
    }

    public b0 a() {
        return this.e.a();
    }
}
