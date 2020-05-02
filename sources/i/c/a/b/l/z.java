package i.c.a.b.l;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;

public final class z implements Runnable {
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f4021f;

    public z(y yVar, g gVar) {
        this.f4021f = yVar;
        this.e = gVar;
    }

    public final void run() {
        try {
            g<TContinuationResult> a = this.f4021f.f4020b.a(this.e.b());
            if (a == null) {
                y yVar = this.f4021f;
                yVar.c.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.a(i.f4004b, (e<? super TContinuationResult>) this.f4021f);
            a.a(i.f4004b, (d) this.f4021f);
            a.a(i.f4004b, (b) this.f4021f);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4021f.c.a((Exception) e2.getCause());
                return;
            }
            this.f4021f.c.a((Exception) e2);
        } catch (CancellationException unused) {
            this.f4021f.c.e();
        } catch (Exception e3) {
            this.f4021f.c.a(e3);
        }
    }
}
