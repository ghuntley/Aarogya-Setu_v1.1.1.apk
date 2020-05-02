package h.a0;

import androidx.work.ListenableWorker;
import h.a0.x.q.p;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkRequest */
public abstract class v {
    public UUID a;

    /* renamed from: b  reason: collision with root package name */
    public p f931b;
    public Set<String> c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a<?, ?>, W extends v> {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public UUID f932b = UUID.randomUUID();
        public p c;
        public Set<String> d = new HashSet();

        public a(Class<? extends ListenableWorker> cls) {
            this.c = new p(this.f932b.toString(), cls.getName());
            this.d.add(cls.getName());
            c();
        }

        public final W a() {
            W b2 = b();
            this.f932b = UUID.randomUUID();
            p pVar = new p(this.c);
            this.c = pVar;
            pVar.a = this.f932b.toString();
            return b2;
        }

        public abstract W b();

        public abstract B c();
    }

    public v(UUID uuid, p pVar, Set<String> set) {
        this.a = uuid;
        this.f931b = pVar;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }
}
