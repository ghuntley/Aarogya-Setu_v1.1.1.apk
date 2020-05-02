package f.a.b1;

import f.a.a.o;
import f.a.s;
import i.a.a.a.a;
import i.c.d.p.e;

/* compiled from: Dispatcher.kt */
public final class b extends c {

    /* renamed from: j  reason: collision with root package name */
    public static final s f825j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f826k;

    static {
        b bVar = new b();
        f826k = bVar;
        int i2 = o.a;
        int a = e.a("kotlinx.coroutines.io.parallelism", 64 < i2 ? i2 : 64, 0, 0, 12, (Object) null);
        if (a > 0) {
            f825j = new e(bVar, a, k.PROBABLY_BLOCKING);
            return;
        }
        throw new IllegalArgumentException(a.b("Expected positive parallelism level, but have ", a).toString());
    }

    public b() {
        super(0, 0, (String) null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}
