package h.a0.x;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import h.a0.x.r.o.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper */
public class l implements Runnable {
    public final /* synthetic */ c e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f964f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f965g;

    public l(m mVar, c cVar, String str) {
        this.f965g = mVar;
        this.e = cVar;
        this.f964f = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            ListenableWorker.a aVar = (ListenableWorker.a) this.e.get();
            if (aVar == null) {
                h.a0.l.a().b(m.x, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f965g.f969i.c}), new Throwable[0]);
            } else {
                h.a0.l.a().a(m.x, String.format("%s returned a %s result.", new Object[]{this.f965g.f969i.c, aVar}), new Throwable[0]);
                this.f965g.f971k = aVar;
            }
        } catch (CancellationException e2) {
            h.a0.l.a().c(m.x, String.format("%s was cancelled", new Object[]{this.f964f}), e2);
        } catch (InterruptedException | ExecutionException e3) {
            h.a0.l.a().b(m.x, String.format("%s failed because it threw an exception/error", new Object[]{this.f964f}), e3);
        } catch (Throwable th) {
            this.f965g.a();
            throw th;
        }
        this.f965g.a();
    }
}
