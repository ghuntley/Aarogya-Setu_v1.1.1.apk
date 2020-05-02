package i.b.a.t;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* compiled from: LogTime */
public final class f {
    public static final double a = (1.0d / Math.pow(10.0d, 6.0d));

    public static double a(long j2) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j2)) * a;
    }

    @TargetApi(17)
    public static long a() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
