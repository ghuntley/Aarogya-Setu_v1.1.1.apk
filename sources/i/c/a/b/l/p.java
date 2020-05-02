package i.c.a.b.l;

import com.google.android.gms.tasks.RuntimeExecutionException;

public final class p implements Runnable {
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f4012f;

    public p(o oVar, g gVar) {
        this.f4012f = oVar;
        this.e = gVar;
    }

    public final void run() {
        try {
            g a = this.f4012f.f4011b.a(this.e);
            if (a == null) {
                o oVar = this.f4012f;
                oVar.c.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.a(i.f4004b, this.f4012f);
            a.a(i.f4004b, (d) this.f4012f);
            a.a(i.f4004b, (b) this.f4012f);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4012f.c.a((Exception) e2.getCause());
            } else {
                this.f4012f.c.a((Exception) e2);
            }
        } catch (Exception e3) {
            this.f4012f.c.a(e3);
        }
    }
}
