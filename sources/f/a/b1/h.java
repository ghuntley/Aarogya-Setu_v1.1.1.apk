package f.a.b1;

import n.m.c.f;

/* compiled from: Tasks.kt */
public abstract class h implements Runnable {
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public i f836f;

    public h(long j2, i iVar) {
        if (iVar != null) {
            this.e = j2;
            this.f836f = iVar;
            return;
        }
        f.a("taskContext");
        throw null;
    }

    public final k d() {
        return this.f836f.h();
    }

    public h() {
        g gVar = g.f835f;
        this.e = 0;
        this.f836f = gVar;
    }
}
