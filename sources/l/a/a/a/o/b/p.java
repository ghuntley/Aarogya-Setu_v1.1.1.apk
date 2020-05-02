package l.a.a.a.o.b;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import l.a.a.a.c;
import l.a.a.a.f;

/* compiled from: ExecutorUtils */
public final class p extends h {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f5084f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f5085g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f5086h;

    public p(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        this.e = str;
        this.f5084f = executorService;
        this.f5085g = j2;
        this.f5086h = timeUnit;
    }

    public void onRun() {
        try {
            String str = "Executing shutdown hook for " + this.e;
            if (f.a().a("Fabric", 3)) {
                Log.d("Fabric", str, (Throwable) null);
            }
            this.f5084f.shutdown();
            if (!this.f5084f.awaitTermination(this.f5085g, this.f5086h)) {
                String str2 = this.e + " did not shut down in the allocated time. Requesting immediate shutdown.";
                if (f.a().a("Fabric", 3)) {
                    Log.d("Fabric", str2, (Throwable) null);
                }
                this.f5084f.shutdownNow();
            }
        } catch (InterruptedException unused) {
            c a = f.a();
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.e});
            if (a.a("Fabric", 3)) {
                Log.d("Fabric", format, (Throwable) null);
            }
            this.f5084f.shutdownNow();
        }
    }
}
