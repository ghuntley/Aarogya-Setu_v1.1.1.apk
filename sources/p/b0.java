package p;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout */
public class b0 {
    public static final b0 d = new a();
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public long f5639b;
    public long c;

    /* compiled from: Timeout */
    public class a extends b0 {
        public b0 a(long j2) {
            return this;
        }

        public b0 a(long j2, TimeUnit timeUnit) {
            return this;
        }

        public void e() {
        }
    }

    public b0 a(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        } else if (timeUnit != null) {
            this.c = timeUnit.toNanos(j2);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public b0 b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.f5639b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.a;
    }

    public void e() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.f5639b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public b0 a(long j2) {
        this.a = true;
        this.f5639b = j2;
        return this;
    }

    public b0 a() {
        this.a = false;
        return this;
    }
}
