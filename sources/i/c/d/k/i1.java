package i.c.d.k;

import android.content.Intent;
import i.c.a.b.d.l.q;
import i.c.a.b.l.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class i1 implements b0 {
    public final ExecutorService a;

    public i1(ExecutorService executorService) {
        this.a = executorService;
    }

    public final g<Integer> a(Intent intent) {
        return q.a((Executor) this.a, new d(intent));
    }
}
