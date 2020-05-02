package h.o;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import h.o.h;

/* compiled from: ReportFragment */
public class w extends Fragment {
    public a e;

    /* compiled from: ReportFragment */
    public interface a {
    }

    /* compiled from: ReportFragment */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            w.a(activity, h.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            w.a(activity, h.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            w.a(activity, h.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            w.a(activity, h.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            w.a(activity, h.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            w.a(activity, h.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, h.a aVar) {
        if (activity instanceof n) {
            ((n) activity).a().a(aVar);
        } else if (activity instanceof l) {
            h a2 = ((l) activity).a();
            if (a2 instanceof m) {
                ((m) a2).a(aVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(h.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(h.a.ON_DESTROY);
        this.e = null;
    }

    public void onPause() {
        super.onPause();
        a(h.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        a aVar = this.e;
        if (aVar != null) {
            u.this.d();
        }
        a(h.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        a aVar = this.e;
        if (aVar != null) {
            u.this.e();
        }
        a(h.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(h.a.ON_STOP);
    }

    public static w a(Activity activity) {
        return (w) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public final void a(h.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }
}
