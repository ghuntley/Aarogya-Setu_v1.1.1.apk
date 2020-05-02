package f.a.b1;

import f.a.j0;
import f.a.y;
import java.util.concurrent.RejectedExecutionException;
import n.k.e;
import n.m.c.f;

/* compiled from: Dispatcher.kt */
public class c extends j0 {
    public a e;

    /* renamed from: f  reason: collision with root package name */
    public final int f827f;

    /* renamed from: g  reason: collision with root package name */
    public final int f828g;

    /* renamed from: h  reason: collision with root package name */
    public final long f829h;

    /* renamed from: i  reason: collision with root package name */
    public final String f830i;

    public /* synthetic */ c(int i2, int i3, String str, int i4) {
        i2 = (i4 & 1) != 0 ? l.c : i2;
        i3 = (i4 & 2) != 0 ? l.d : i3;
        str = (i4 & 4) != 0 ? "DefaultDispatcher" : str;
        if (str != null) {
            long j2 = l.e;
            this.f827f = i2;
            this.f828g = i3;
            this.f829h = j2;
            this.f830i = str;
            this.e = new a(this.f827f, this.f828g, this.f829h, this.f830i);
            return;
        }
        f.a("schedulerName");
        throw null;
    }

    public void a(e eVar, Runnable runnable) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (runnable != null) {
            try {
                a.a(this.e, runnable, (i) null, false, 6);
            } catch (RejectedExecutionException unused) {
                y.f867k.a(runnable);
            }
        } else {
            f.a("block");
            throw null;
        }
    }

    public final void a(Runnable runnable, i iVar, boolean z) {
        if (runnable == null) {
            f.a("block");
            throw null;
        } else if (iVar != null) {
            try {
                this.e.a(runnable, iVar, z);
            } catch (RejectedExecutionException unused) {
                y.f867k.a(this.e.a(runnable, iVar));
            }
        } else {
            f.a("context");
            throw null;
        }
    }
}
