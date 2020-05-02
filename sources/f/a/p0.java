package f.a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import n.h;
import n.k.e;
import n.m.b.b;

/* compiled from: Job.kt */
public interface p0 extends e.a {
    public static final a d = a.a;

    /* compiled from: Job.kt */
    public static final class a implements e.b<p0> {
        public static final /* synthetic */ a a = new a();

        static {
            CoroutineExceptionHandler.a aVar = CoroutineExceptionHandler.c;
        }
    }

    d0 a(boolean z, boolean z2, b<? super Throwable, h> bVar);

    boolean a();

    CancellationException f();

    boolean start();
}
