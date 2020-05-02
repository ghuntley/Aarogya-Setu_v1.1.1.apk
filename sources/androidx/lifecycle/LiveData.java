package androidx.lifecycle;

import h.o.h;
import h.o.j;
import h.o.l;
import h.o.m;
import h.o.s;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f254j = new Object();
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public h.c.a.b.b<s<? super T>, LiveData<T>.b> f255b;
    public int c;
    public volatile Object d;
    public volatile Object e;

    /* renamed from: f  reason: collision with root package name */
    public int f256f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f257g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f258h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f259i;

    public class LifecycleBoundObserver extends LiveData<T>.b implements j {
        public final l e;

        public LifecycleBoundObserver(l lVar, s<? super T> sVar) {
            super(sVar);
            this.e = lVar;
        }

        public void a(l lVar, h.a aVar) {
            if (((m) this.e.a()).f2058b == h.b.DESTROYED) {
                LiveData.this.a(this.a);
            } else {
                a(((m) this.e.a()).f2058b.a(h.b.STARTED));
            }
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.f254j;
            }
            LiveData.this.b(obj);
        }
    }

    public abstract class b {
        public final s<? super T> a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f261b;
        public int c = -1;

        public b(s<? super T> sVar) {
            this.a = sVar;
        }

        public void a(boolean z) {
            if (z != this.f261b) {
                this.f261b = z;
                int i2 = 1;
                boolean z2 = LiveData.this.c == 0;
                LiveData liveData = LiveData.this;
                int i3 = liveData.c;
                if (!this.f261b) {
                    i2 = -1;
                }
                liveData.c = i3 + i2;
                if (z2 && this.f261b) {
                    LiveData.this.a();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.c == 0 && !this.f261b) {
                    liveData2.b();
                }
                if (this.f261b) {
                    LiveData.this.b((LiveData<T>.b) this);
                }
            }
        }
    }

    public LiveData(T t) {
        this.a = new Object();
        this.f255b = new h.c.a.b.b<>();
        this.c = 0;
        this.e = f254j;
        this.f259i = new a();
        this.d = t;
        this.f256f = 0;
    }

    public void a() {
    }

    public final void a(LiveData<T>.b bVar) {
        if (bVar.f261b) {
            if (!((m) ((LifecycleBoundObserver) bVar).e.a()).f2058b.a(h.b.STARTED)) {
                bVar.a(false);
                return;
            }
            int i2 = bVar.c;
            int i3 = this.f256f;
            if (i2 < i3) {
                bVar.c = i3;
                bVar.a.a(this.d);
            }
        }
    }

    public void b() {
    }

    public void b(LiveData<T>.b bVar) {
        if (this.f257g) {
            this.f258h = true;
            return;
        }
        this.f257g = true;
        do {
            this.f258h = false;
            if (bVar == null) {
                h.c.a.b.b<K, V>.d c2 = this.f255b.c();
                while (c2.hasNext()) {
                    a((LiveData<T>.b) (b) ((Map.Entry) c2.next()).getValue());
                    if (this.f258h) {
                        break;
                    }
                }
            } else {
                a(bVar);
                bVar = null;
            }
        } while (this.f258h);
        this.f257g = false;
    }

    public abstract void b(T t);

    public LiveData() {
        this.a = new Object();
        this.f255b = new h.c.a.b.b<>();
        this.c = 0;
        this.e = f254j;
        this.f259i = new a();
        this.d = f254j;
        this.f256f = -1;
    }

    public void a(l lVar, s<? super T> sVar) {
        a("observe");
        if (((m) lVar.a()).f2058b != h.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lVar, sVar);
            b b2 = this.f255b.b(sVar, lifecycleBoundObserver);
            if (b2 != null) {
                if (!(((LifecycleBoundObserver) b2).e == lVar)) {
                    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                }
            }
            if (b2 == null) {
                lVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(s<? super T> sVar) {
        a("removeObserver");
        b remove = this.f255b.remove(sVar);
        if (remove != null) {
            LifecycleBoundObserver lifecycleBoundObserver = (LifecycleBoundObserver) remove;
            ((m) lifecycleBoundObserver.e.a()).a.remove(lifecycleBoundObserver);
            remove.a(false);
        }
    }

    public void a(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.e == f254j;
            this.e = t;
        }
        if (z) {
            h.c.a.a.a.b().a.b(this.f259i);
        }
    }

    public static void a(String str) {
        if (!h.c.a.a.a.b().a.a()) {
            throw new IllegalStateException(i.a.a.a.a.a("Cannot invoke ", str, " on a background thread"));
        }
    }
}
