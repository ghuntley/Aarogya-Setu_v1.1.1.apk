package i.c.a.b.d.k.h;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import h.e.a;
import i.c.a.b.g.d.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class y0 extends Fragment implements j {

    /* renamed from: h  reason: collision with root package name */
    public static WeakHashMap<Activity, WeakReference<y0>> f3083h = new WeakHashMap<>();
    public Map<String, LifecycleCallback> e = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f3084f = 0;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f3085g;

    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.e.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.e.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback lifecycleCallback : this.e.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3084f = 1;
        this.f3085g = bundle;
        for (Map.Entry next : this.e.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) next.getValue();
            if (bundle != null) {
                bundle.getBundle((String) next.getKey());
                continue;
            }
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3084f = 5;
        for (LifecycleCallback lifecycleCallback : this.e.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void onResume() {
        super.onResume();
        this.f3084f = 3;
        for (LifecycleCallback lifecycleCallback : this.e.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.e.entrySet()) {
                Bundle bundle2 = new Bundle();
                if (((LifecycleCallback) next.getValue()) != null) {
                    bundle.putBundle((String) next.getKey(), bundle2);
                } else {
                    throw null;
                }
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f3084f = 2;
        for (LifecycleCallback lifecycleCallback : this.e.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f3084f = 4;
        for (LifecycleCallback a : this.e.values()) {
            a.a();
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.e.containsKey(str)) {
            this.e.put(str, lifecycleCallback);
            if (this.f3084f > 0) {
                new g(Looper.getMainLooper()).post(new z0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(i.a.a.a.a.a(i.a.a.a.a.a(str, 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
    }
}
