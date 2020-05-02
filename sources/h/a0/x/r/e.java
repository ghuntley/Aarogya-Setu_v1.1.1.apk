package h.a0.x.r;

import androidx.work.impl.WorkDatabase;
import h.a0.x.q.d;
import h.a0.x.q.f;

/* compiled from: IdGenerator */
public class e {
    public final WorkDatabase a;

    public e(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public int a(int i2, int i3) {
        synchronized (e.class) {
            int a2 = a("next_job_scheduler_id");
            if (a2 >= i2) {
                if (a2 <= i3) {
                    i2 = a2;
                }
            }
            ((f) this.a.j()).a(new d("next_job_scheduler_id", (long) (i2 + 1)));
        }
        return i2;
    }

    public int a() {
        int a2;
        synchronized (e.class) {
            a2 = a("next_alarm_manager_id");
        }
        return a2;
    }

    public final int a(String str) {
        this.a.c();
        try {
            Long a2 = ((f) this.a.j()).a(str);
            int i2 = 0;
            int intValue = a2 != null ? a2.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i2 = intValue + 1;
            }
            ((f) this.a.j()).a(new d(str, (long) i2));
            this.a.h();
            return intValue;
        } finally {
            this.a.e();
        }
    }
}
