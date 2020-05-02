package h.a0;

import android.os.Build;
import androidx.work.ListenableWorker;
import h.a0.v;
import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicWorkRequest */
public final class p extends v {

    /* compiled from: PeriodicWorkRequest */
    public static final class a extends v.a<a, p> {
        public a(Class<? extends ListenableWorker> cls, long j2, TimeUnit timeUnit) {
            super(cls);
            h.a0.x.q.p pVar = this.c;
            long millis = timeUnit.toMillis(j2);
            if (pVar != null) {
                long j3 = 900000;
                if (millis < 900000) {
                    l.a().d(h.a0.x.q.p.r, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
                    millis = 900000;
                }
                if (millis < 900000) {
                    l.a().d(h.a0.x.q.p.r, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
                } else {
                    j3 = millis;
                }
                if (millis < 300000) {
                    l.a().d(h.a0.x.q.p.r, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L}), new Throwable[0]);
                    millis = 300000;
                }
                if (millis > j3) {
                    l.a().d(h.a0.x.q.p.r, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j3)}), new Throwable[0]);
                    millis = j3;
                }
                pVar.f1063h = j3;
                pVar.f1064i = millis;
                return;
            }
            throw null;
        }

        public v b() {
            if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.f1065j.c) {
                h.a0.x.q.p pVar = this.c;
                if (!pVar.f1072q || Build.VERSION.SDK_INT < 23 || !pVar.f1065j.c) {
                    return new p(this);
                }
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        public v.a c() {
            return this;
        }
    }

    public p(a aVar) {
        super(aVar.f932b, aVar.c, aVar.d);
    }
}
