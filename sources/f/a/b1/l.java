package f.a.b1;

import f.a.a.o;
import i.c.d.p.e;
import java.util.concurrent.TimeUnit;

/* compiled from: Tasks.kt */
public final class l {
    public static final long a = e.a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f840b = e.a("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, (Object) null);
    public static final int c;
    public static final int d;
    public static final long e = TimeUnit.SECONDS.toNanos(e.a("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 0, 0, 12, (Object) null));

    /* renamed from: f  reason: collision with root package name */
    public static m f841f = f.a;

    static {
        e.a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int i2 = o.a;
        c = e.a("kotlinx.coroutines.scheduler.core.pool.size", i2 < 2 ? 2 : i2, 1, 0, 8, (Object) null);
        int i3 = o.a * 128;
        int i4 = c;
        if (i4 <= 2097150) {
            d = e.a("kotlinx.coroutines.scheduler.max.pool.size", i3 < i4 ? i4 : i3 > 2097150 ? 2097150 : i3, 0, 2097150, 4, (Object) null);
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + 2097150 + " is less than minimum " + i4 + '.');
    }
}
