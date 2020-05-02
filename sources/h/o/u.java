package h.o;

import android.os.Handler;
import h.o.h;
import h.o.w;

/* compiled from: ProcessLifecycleOwner */
public class u implements l {

    /* renamed from: m  reason: collision with root package name */
    public static final u f2063m = new u();
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2064f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2065g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2066h = true;

    /* renamed from: i  reason: collision with root package name */
    public Handler f2067i;

    /* renamed from: j  reason: collision with root package name */
    public final m f2068j = new m(this);

    /* renamed from: k  reason: collision with root package name */
    public Runnable f2069k = new a();

    /* renamed from: l  reason: collision with root package name */
    public w.a f2070l = new b();

    /* compiled from: ProcessLifecycleOwner */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            u uVar = u.this;
            if (uVar.f2064f == 0) {
                uVar.f2065g = true;
                uVar.f2068j.a(h.a.ON_PAUSE);
            }
            u uVar2 = u.this;
            if (uVar2.e == 0 && uVar2.f2065g) {
                uVar2.f2068j.a(h.a.ON_STOP);
                uVar2.f2066h = true;
            }
        }
    }

    /* compiled from: ProcessLifecycleOwner */
    public class b implements w.a {
        public b() {
        }
    }

    public h a() {
        return this.f2068j;
    }

    public void d() {
        int i2 = this.f2064f + 1;
        this.f2064f = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f2065g) {
            this.f2068j.a(h.a.ON_RESUME);
            this.f2065g = false;
            return;
        }
        this.f2067i.removeCallbacks(this.f2069k);
    }

    public void e() {
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 == 1 && this.f2066h) {
            this.f2068j.a(h.a.ON_START);
            this.f2066h = false;
        }
    }
}
