package i.c.a.b.d.k.h;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    public static final c f3035i = new c();
    public final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f3036f = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<a> f3037g = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: h  reason: collision with root package name */
    public boolean f3038h = false;

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface a {
        void a(boolean z);
    }

    public static void a(Application application) {
        synchronized (f3035i) {
            if (!f3035i.f3038h) {
                application.registerActivityLifecycleCallbacks(f3035i);
                application.registerComponentCallbacks(f3035i);
                f3035i.f3038h = true;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.e.compareAndSet(true, false);
        this.f3036f.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.e.compareAndSet(true, false);
        this.f3036f.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.e.compareAndSet(false, true)) {
            this.f3036f.set(true);
            a(true);
        }
    }

    public final void a(a aVar) {
        synchronized (f3035i) {
            this.f3037g.add(aVar);
        }
    }

    public final void a(boolean z) {
        synchronized (f3035i) {
            ArrayList<a> arrayList = this.f3037g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                a aVar = arrayList.get(i2);
                i2++;
                aVar.a(z);
            }
        }
    }
}
