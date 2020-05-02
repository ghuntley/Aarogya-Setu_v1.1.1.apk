package f.a;

import n.m.c.f;

/* compiled from: EventLoop.kt */
public final class c extends g0 {

    /* renamed from: j  reason: collision with root package name */
    public final Thread f843j;

    public c(Thread thread) {
        if (thread != null) {
            this.f843j = thread;
        } else {
            f.a("thread");
            throw null;
        }
    }

    public Thread q() {
        return this.f843j;
    }
}
