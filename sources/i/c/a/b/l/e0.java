package i.c.a.b.l;

import java.util.concurrent.Callable;

public final class e0 implements Runnable {
    public final /* synthetic */ d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Callable f4003f;

    public e0(d0 d0Var, Callable callable) {
        this.e = d0Var;
        this.f4003f = callable;
    }

    public final void run() {
        try {
            this.e.a(this.f4003f.call());
        } catch (Exception e2) {
            this.e.a(e2);
        }
    }
}
