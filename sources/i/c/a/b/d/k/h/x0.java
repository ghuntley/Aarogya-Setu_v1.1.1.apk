package i.c.a.b.d.k.h;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i.c.a.b.l.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class x0 {
    public final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map<h<?>, Boolean> f3082b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.f3082b) {
            hashMap2 = new HashMap(this.f3082b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).a(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((h) entry2.getKey()).a.b((Exception) new ApiException(status));
            }
        }
    }
}
