package i.c.a.b.l;

import com.google.android.gms.tasks.RuntimeExecutionException;

public final class n implements Runnable {
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f4010f;

    public n(m mVar, g gVar) {
        this.f4010f = mVar;
        this.e = gVar;
    }

    public final void run() {
        if (((d0) this.e).d) {
            this.f4010f.c.e();
            return;
        }
        try {
            this.f4010f.c.a(this.f4010f.f4009b.a(this.e));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4010f.c.a((Exception) e2.getCause());
            } else {
                this.f4010f.c.a((Exception) e2);
            }
        } catch (Exception e3) {
            this.f4010f.c.a(e3);
        }
    }
}
