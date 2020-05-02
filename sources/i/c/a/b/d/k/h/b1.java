package i.c.a.b.d.k.h;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import h.e.a;
import h.l.d.e;
import i.c.a.b.g.d.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class b1 extends Fragment implements j {
    public static WeakHashMap<e, WeakReference<b1>> d0 = new WeakHashMap<>();
    public Map<String, LifecycleCallback> a0 = new a();
    public int b0 = 0;
    public Bundle c0;

    public final void A() {
        this.I = true;
        this.b0 = 3;
        for (LifecycleCallback lifecycleCallback : this.a0.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void B() {
        this.I = true;
        this.b0 = 2;
        for (LifecycleCallback lifecycleCallback : this.a0.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void C() {
        this.I = true;
        this.b0 = 4;
        for (LifecycleCallback a : this.a0.values()) {
            a.a();
        }
    }

    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.a0.get(str));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.b0 = 1;
        this.c0 = bundle;
        for (Map.Entry next : this.a0.entrySet()) {
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

    public final void d(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry next : this.a0.entrySet()) {
                Bundle bundle2 = new Bundle();
                if (((LifecycleCallback) next.getValue()) != null) {
                    bundle.putBundle((String) next.getKey(), bundle2);
                } else {
                    throw null;
                }
            }
        }
    }

    public final void x() {
        this.I = true;
        this.b0 = 5;
        for (LifecycleCallback lifecycleCallback : this.a0.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.a0.containsKey(str)) {
            this.a0.put(str, lifecycleCallback);
            if (this.b0 > 0) {
                new g(Looper.getMainLooper()).post(new a1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(i.a.a.a.a.a(i.a.a.a.a.a(str, 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final void a(int i2, int i3, Intent intent) {
        for (LifecycleCallback lifecycleCallback : this.a0.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.a0.values()) {
            if (lifecycleCallback == null) {
                throw null;
            }
        }
    }
}
