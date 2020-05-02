package f.a.b1;

import i.a.a.a.a;
import i.c.d.p.e;
import n.m.c.f;

/* compiled from: Tasks.kt */
public final class j extends h {

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f837g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        if (runnable == null) {
            f.a("block");
            throw null;
        } else if (iVar != null) {
            this.f837g = runnable;
        } else {
            f.a("taskContext");
            throw null;
        }
    }

    public void run() {
        try {
            this.f837g.run();
        } finally {
            this.f836f.j();
        }
    }

    public String toString() {
        StringBuilder a = a.a("Task[");
        a.append(e.b((Object) this.f837g));
        a.append('@');
        a.append(e.c((Object) this.f837g));
        a.append(", ");
        a.append(this.e);
        a.append(", ");
        a.append(this.f836f);
        a.append(']');
        return a.toString();
    }
}
