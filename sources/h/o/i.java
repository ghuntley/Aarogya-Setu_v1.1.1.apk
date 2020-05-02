package h.o;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher */
public class i {
    public static AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher */
    public static class a extends c {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            w.b(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}
