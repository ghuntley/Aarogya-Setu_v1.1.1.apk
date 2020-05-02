package i.c.a.b.g.e;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class j {
    public final ConcurrentHashMap<m, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue<Throwable> f3180b = new ReferenceQueue<>();
}
