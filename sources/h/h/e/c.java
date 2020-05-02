package h.h.e;

import android.util.Log;

/* compiled from: ActivityRecreator */
public final class c implements Runnable {
    public final /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1713f;

    public c(Object obj, Object obj2) {
        this.e = obj;
        this.f1713f = obj2;
    }

    public void run() {
        try {
            if (b.d != null) {
                b.d.invoke(this.e, new Object[]{this.f1713f, false, "AppCompat recreation"});
                return;
            }
            b.e.invoke(this.e, new Object[]{this.f1713f, false});
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
