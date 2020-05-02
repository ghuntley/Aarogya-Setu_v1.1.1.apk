package i.c.a.b.g.g;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class k8 extends kc {
    public final AtomicReference<Bundle> a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3336b;

    public final void a(Bundle bundle) {
        synchronized (this.a) {
            try {
                this.a.set(bundle);
                this.f3336b = true;
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }

    public final Bundle b(long j2) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.f3336b) {
                try {
                    this.a.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.a.get();
        }
        return bundle;
    }

    public final String a(long j2) {
        return (String) a(b(j2), String.class);
    }

    public static <T> T a(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e);
            throw e;
        }
    }
}
