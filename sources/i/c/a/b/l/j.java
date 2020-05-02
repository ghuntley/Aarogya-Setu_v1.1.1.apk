package i.c.a.b.l;

import java.util.concurrent.CountDownLatch;

public final class j implements k {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ j(e0 e0Var) {
    }

    public final void a(Object obj) {
        this.a.countDown();
    }

    public final void a(Exception exc) {
        this.a.countDown();
    }

    public final void a() {
        this.a.countDown();
    }
}
