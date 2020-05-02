package h.o;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import h.o.h;

/* compiled from: ProcessLifecycleOwner */
public class v extends c {
    public final /* synthetic */ u this$0;

    /* compiled from: ProcessLifecycleOwner */
    public class a extends c {
        public a() {
        }

        public void onActivityPostResumed(Activity activity) {
            v.this.this$0.d();
        }

        public void onActivityPostStarted(Activity activity) {
            v.this.this$0.e();
        }
    }

    public v(u uVar) {
        this.this$0 = uVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            w.a(activity).e = this.this$0.f2070l;
        }
    }

    public void onActivityPaused(Activity activity) {
        u uVar = this.this$0;
        int i2 = uVar.f2064f - 1;
        uVar.f2064f = i2;
        if (i2 == 0) {
            uVar.f2067i.postDelayed(uVar.f2069k, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    public void onActivityStopped(Activity activity) {
        u uVar = this.this$0;
        int i2 = uVar.e - 1;
        uVar.e = i2;
        if (i2 == 0 && uVar.f2065g) {
            uVar.f2068j.a(h.a.ON_STOP);
            uVar.f2066h = true;
        }
    }
}
