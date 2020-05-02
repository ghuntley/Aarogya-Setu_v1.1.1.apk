package f.a;

import i.c.d.p.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n.m.c.f;

/* compiled from: CompletedExceptionally.kt */
public class m {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f858b = AtomicIntegerFieldUpdater.newUpdater(m.class, "_handled");
    public volatile int _handled;
    public final Throwable a;

    public m(Throwable th, boolean z) {
        if (th != null) {
            this.a = th;
            this._handled = z ? 1 : 0;
            return;
        }
        f.a("cause");
        throw null;
    }

    public String toString() {
        return e.b((Object) this) + '[' + this.a + ']';
    }

    public /* synthetic */ m(Throwable th, boolean z, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        if (th != null) {
            this.a = th;
            this._handled = z ? 1 : 0;
            return;
        }
        f.a("cause");
        throw null;
    }
}
