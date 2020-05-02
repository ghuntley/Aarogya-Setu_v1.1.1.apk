package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class k9 implements Runnable {
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h9 f3740f;

    public k9(h9 h9Var, long j2) {
        this.f3740f = h9Var;
        this.e = j2;
    }

    public final void run() {
        m5 k2 = this.f3740f.f3697b.k();
        j9 j9Var = new j9(this);
        k2.o();
        q.a(j9Var);
        k2.a((q5<?>) new q5(k2, j9Var, "Task exception on worker thread"));
    }
}
