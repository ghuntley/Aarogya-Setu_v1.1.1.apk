package h.a0.x.r;

import androidx.work.impl.WorkDatabase;
import h.a0.x.q.d;
import h.a0.x.q.f;

/* compiled from: PreferenceUtils */
public class g {
    public final WorkDatabase a;

    public g(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public void a(boolean z) {
        ((f) this.a.j()).a(new d("reschedule_needed", z));
    }
}
