package l.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import l.a.a.a.b;

/* compiled from: ActivityLifecycleManager */
public class a implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ b.C0144b e;

    public a(b.a aVar, b.C0144b bVar) {
        this.e = bVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.e.onActivityCreated(activity, bundle);
    }

    public void onActivityDestroyed(Activity activity) {
        this.e.onActivityDestroyed(activity);
    }

    public void onActivityPaused(Activity activity) {
        this.e.onActivityPaused(activity);
    }

    public void onActivityResumed(Activity activity) {
        this.e.onActivityResumed(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.e.onActivitySaveInstanceState(activity, bundle);
    }

    public void onActivityStarted(Activity activity) {
        this.e.onActivityStarted(activity);
    }

    public void onActivityStopped(Activity activity) {
        this.e.onActivityStopped(activity);
    }
}
