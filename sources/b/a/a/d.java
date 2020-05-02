package b.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.crashlytics.android.answers.SessionEvent;
import n.m.c.f;
import nic.goi.aarogyasetu.views.SplashActivity;

/* compiled from: AuthForegroundListener.kt */
public final class d implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity == null) {
            f.a(SessionEvent.ACTIVITY_KEY);
            throw null;
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity == null) {
            f.a(SessionEvent.ACTIVITY_KEY);
            throw null;
        }
    }

    public void onActivityPaused(Activity activity) {
        if (activity == null) {
            f.a(SessionEvent.ACTIVITY_KEY);
            throw null;
        }
    }

    public void onActivityResumed(Activity activity) {
        if (activity == null) {
            f.a(SessionEvent.ACTIVITY_KEY);
            throw null;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (activity == null) {
            f.a(SessionEvent.ACTIVITY_KEY);
            throw null;
        } else if (bundle == null) {
            f.a("bundle");
            throw null;
        }
    }

    public void onActivityStarted(Activity activity) {
        if (activity != null) {
            if (f.a((Object) activity.getClass(), (Object) SplashActivity.class)) {
            }
        } else {
            f.a(SessionEvent.ACTIVITY_KEY);
            throw null;
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity == null) {
            f.a(SessionEvent.ACTIVITY_KEY);
            throw null;
        }
    }
}
