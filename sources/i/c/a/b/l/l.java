package i.c.a.b.l;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

public final class l implements k {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f4005b;
    public final d0<Void> c;
    @GuardedBy("mLock")
    public int d;
    @GuardedBy("mLock")
    public int e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public int f4006f;
    @GuardedBy("mLock")

    /* renamed from: g  reason: collision with root package name */
    public Exception f4007g;
    @GuardedBy("mLock")

    /* renamed from: h  reason: collision with root package name */
    public boolean f4008h;

    public l(int i2, d0<Void> d0Var) {
        this.f4005b = i2;
        this.c = d0Var;
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.f4007g = exc;
            b();
        }
    }

    @GuardedBy("mLock")
    public final void b() {
        if (this.d + this.e + this.f4006f != this.f4005b) {
            return;
        }
        if (this.f4007g != null) {
            d0<Void> d0Var = this.c;
            int i2 = this.e;
            int i3 = this.f4005b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i3);
            sb.append(" underlying tasks failed");
            d0Var.a((Exception) new ExecutionException(sb.toString(), this.f4007g));
        } else if (this.f4008h) {
            this.c.e();
        } else {
            this.c.a(null);
        }
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }

    public final void a() {
        synchronized (this.a) {
            this.f4006f++;
            this.f4008h = true;
            b();
        }
    }
}
