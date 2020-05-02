package h.a0;

import h.a0.x.f;
import h.a0.x.j;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager */
public abstract class u {
    public final o a(v vVar) {
        List singletonList = Collections.singletonList(vVar);
        j jVar = (j) this;
        if (!singletonList.isEmpty()) {
            return new f(jVar, (String) null, g.KEEP, singletonList, (List<f>) null).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
}
