package i.c.a.b.i.a;

import i.c.a.b.d.l.q;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class o5 implements Thread.UncaughtExceptionHandler {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m5 f3815b;

    public o5(m5 m5Var, String str) {
        this.f3815b = m5Var;
        q.a(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f3815b.n().f3758f.a(this.a, th);
    }
}
