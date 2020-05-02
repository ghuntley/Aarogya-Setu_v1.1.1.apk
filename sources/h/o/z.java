package h.o;

import android.os.Handler;
import h.o.h;

/* compiled from: ServiceLifecycleDispatcher */
public class z {
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2075b = new Handler();
    public a c;

    /* compiled from: ServiceLifecycleDispatcher */
    public static class a implements Runnable {
        public final m e;

        /* renamed from: f  reason: collision with root package name */
        public final h.a f2076f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2077g = false;

        public a(m mVar, h.a aVar) {
            this.e = mVar;
            this.f2076f = aVar;
        }

        public void run() {
            if (!this.f2077g) {
                this.e.a(this.f2076f);
                this.f2077g = true;
            }
        }
    }

    public z(l lVar) {
        this.a = new m(lVar);
    }

    public final void a(h.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        this.f2075b.postAtFrontOfQueue(aVar3);
    }
}
