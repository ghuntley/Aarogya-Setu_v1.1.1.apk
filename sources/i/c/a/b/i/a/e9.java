package i.c.a.b.i.a;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class e9 implements Runnable {
    public final /* synthetic */ t9 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f3648f;

    public e9(t9 t9Var, Runnable runnable) {
        this.e = t9Var;
        this.f3648f = runnable;
    }

    public final void run() {
        this.e.o();
        t9 t9Var = this.e;
        Runnable runnable = this.f3648f;
        t9Var.r();
        if (t9Var.f3900m == null) {
            t9Var.f3900m = new ArrayList();
        }
        t9Var.f3900m.add(runnable);
        this.e.m();
    }
}
