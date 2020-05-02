package p;

import javax.annotation.Nullable;

/* compiled from: SegmentPool */
public final class x {
    @Nullable
    public static w a;

    /* renamed from: b  reason: collision with root package name */
    public static long f5675b;

    public static w a() {
        synchronized (x.class) {
            if (a == null) {
                return new w();
            }
            w wVar = a;
            a = wVar.f5673f;
            wVar.f5673f = null;
            f5675b -= 8192;
            return wVar;
        }
    }

    public static void a(w wVar) {
        if (wVar.f5673f != null || wVar.f5674g != null) {
            throw new IllegalArgumentException();
        } else if (!wVar.d) {
            synchronized (x.class) {
                if (f5675b + 8192 <= 65536) {
                    f5675b += 8192;
                    wVar.f5673f = a;
                    wVar.c = 0;
                    wVar.f5672b = 0;
                    a = wVar;
                }
            }
        }
    }
}
