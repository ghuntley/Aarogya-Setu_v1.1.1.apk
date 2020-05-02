package i.c.a.b.d.k;

import android.os.Looper;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.h.d;
import i.c.a.b.d.k.h.f;
import i.c.a.b.d.k.h.l;
import java.util.Collections;
import java.util.WeakHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class c {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface a extends f {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b extends l {
    }

    static {
        Collections.newSetFromMap(new WeakHashMap());
    }

    public <A extends a.b, R extends f, T extends d<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }
}
