package l.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ActivityLifecycleManager */
public class b {
    public final Application a;

    /* renamed from: b  reason: collision with root package name */
    public a f5030b;

    /* compiled from: ActivityLifecycleManager */
    public static class a {
        public final Set<Application.ActivityLifecycleCallbacks> a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Application f5031b;

        public a(Application application) {
            this.f5031b = application;
        }
    }

    /* renamed from: l.a.a.a.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityLifecycleManager */
    public static abstract class C0144b {
        public abstract void onActivityCreated(Activity activity, Bundle bundle);

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public abstract void onActivityResumed(Activity activity);

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public abstract void onActivityStarted(Activity activity);

        public void onActivityStopped(Activity activity) {
        }
    }

    public b(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.a = application;
        this.f5030b = new a(application);
    }

    public boolean a(C0144b bVar) {
        boolean z;
        a aVar = this.f5030b;
        if (aVar != null) {
            if (aVar.f5031b != null) {
                a aVar2 = new a(aVar, bVar);
                aVar.f5031b.registerActivityLifecycleCallbacks(aVar2);
                aVar.a.add(aVar2);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
