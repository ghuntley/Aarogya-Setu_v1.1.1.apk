package kotlinx.coroutines;

import n.k.e;

/* compiled from: CoroutineExceptionHandler.kt */
public interface CoroutineExceptionHandler extends e.a {
    public static final a c = a.a;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a implements e.b<CoroutineExceptionHandler> {
        public static final /* synthetic */ a a = new a();
    }

    void handleException(e eVar, Throwable th);
}
