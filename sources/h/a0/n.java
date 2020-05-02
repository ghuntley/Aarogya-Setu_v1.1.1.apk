package h.a0;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import h.a0.v;
import h.a0.x.q.p;

/* compiled from: OneTimeWorkRequest */
public final class n extends v {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends v.a<a, n> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        public v b() {
            if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.f1065j.c) {
                p pVar = this.c;
                if (!pVar.f1072q || Build.VERSION.SDK_INT < 23 || !pVar.f1065j.c) {
                    return new n(this);
                }
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        public v.a c() {
            return this;
        }
    }

    public n(a aVar) {
        super(aVar.f932b, aVar.c, aVar.d);
    }
}
