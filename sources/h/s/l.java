package h.s;

import h.v.a.f.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement */
public abstract class l {
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final h f2215b;
    public volatile f c;

    public l(h hVar) {
        this.f2215b = hVar;
    }

    public f a() {
        this.f2215b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.f2215b.a(b());
            }
            return this.c;
        }
        return this.f2215b.a(b());
    }

    public abstract String b();

    public void a(f fVar) {
        if (fVar == this.c) {
            this.a.set(false);
        }
    }
}
