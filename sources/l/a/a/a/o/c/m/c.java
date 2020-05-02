package l.a.a.a.o.c.m;

/* compiled from: ExponentialBackoff */
public class c implements a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5146b;

    public c(long j2, int i2) {
        this.a = j2;
        this.f5146b = i2;
    }

    public long getDelayMillis(int i2) {
        return (long) (Math.pow((double) this.f5146b, (double) i2) * ((double) this.a));
    }
}
