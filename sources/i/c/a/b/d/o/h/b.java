package i.c.a.b.d.o.h;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class b implements Runnable {
    public final Runnable e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3163f;

    public b(Runnable runnable, int i2) {
        this.e = runnable;
        this.f3163f = i2;
    }

    public final void run() {
        Process.setThreadPriority(this.f3163f);
        this.e.run();
    }
}
