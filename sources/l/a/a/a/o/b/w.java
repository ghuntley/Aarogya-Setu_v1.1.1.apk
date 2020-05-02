package l.a.a.a.o.b;

import android.os.SystemClock;
import android.util.Log;

/* compiled from: TimingMetric */
public class w {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5117b;
    public final boolean c;
    public long d;
    public long e;

    public w(String str, String str2) {
        this.a = str;
        this.f5117b = str2;
        this.c = !Log.isLoggable(str2, 2);
    }

    public synchronized void a() {
        if (!this.c) {
            this.d = SystemClock.elapsedRealtime();
            this.e = 0;
        }
    }

    public synchronized void b() {
        if (!this.c) {
            if (this.e == 0) {
                this.e = SystemClock.elapsedRealtime() - this.d;
                String str = this.f5117b;
                Log.v(str, this.a + ": " + this.e + "ms");
            }
        }
    }
}
