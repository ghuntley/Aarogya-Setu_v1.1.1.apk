package androidx.work;

import h.a0.e;
import h.a0.q;
import h.a0.w;
import h.a0.x.r.l;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public UUID a;

    /* renamed from: b  reason: collision with root package name */
    public e f369b;
    public Executor c;
    public w d;

    public static class a {
        public a() {
            Collections.emptyList();
            Collections.emptyList();
        }
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i2, Executor executor, h.a0.x.r.p.a aVar2, w wVar, q qVar, l lVar) {
        this.a = uuid;
        this.f369b = eVar;
        new HashSet(collection);
        this.c = executor;
        this.d = wVar;
    }
}
