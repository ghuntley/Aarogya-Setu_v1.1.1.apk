package i.c.d.k;

import i.c.a.b.l.c;
import i.c.a.b.l.g;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class a1 implements c {
    public final CountDownLatch a;

    public a1(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void a(g gVar) {
        this.a.countDown();
    }
}
