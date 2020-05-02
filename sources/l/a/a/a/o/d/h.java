package l.a.a.a.o.d;

import android.content.Context;
import l.a.a.a.o.b.i;

/* compiled from: TimeBasedFileRollOverRunnable */
public class h implements Runnable {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final e f5151f;

    public h(Context context, e eVar) {
        this.e = context;
        this.f5151f = eVar;
    }

    public void run() {
        try {
            i.b(this.e, "Performing time based file roll over.");
            if (!this.f5151f.rollFileOver()) {
                this.f5151f.cancelTimeBasedFileRollOver();
            }
        } catch (Exception unused) {
            i.c(this.e, "Failed to roll over file");
        }
    }
}
