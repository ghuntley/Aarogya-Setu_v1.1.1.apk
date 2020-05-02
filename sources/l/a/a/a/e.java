package l.a.a.a;

import java.util.concurrent.CountDownLatch;

/* compiled from: Fabric */
public class e implements i {

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f5032b = new CountDownLatch(this.c);
    public final /* synthetic */ int c;
    public final /* synthetic */ f d;

    public e(f fVar, int i2) {
        this.d = fVar;
        this.c = i2;
    }

    public void a(Object obj) {
        this.f5032b.countDown();
        if (this.f5032b.getCount() == 0) {
            this.d.f5039i.set(true);
            f fVar = this.d;
            fVar.d.a(fVar);
        }
    }

    public void a(Exception exc) {
        this.d.d.a(exc);
    }
}
