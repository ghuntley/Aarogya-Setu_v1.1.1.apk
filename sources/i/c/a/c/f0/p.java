package i.c.a.c.f0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
public class p {
    public static p e;
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4112b = new Handler(Looper.getMainLooper(), new a());
    public c c;
    public c d;

    /* compiled from: SnackbarManager */
    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            p.this.a((c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager */
    public interface b {
        void a();

        void a(int i2);
    }

    /* compiled from: SnackbarManager */
    public static class c {
        public final WeakReference<b> a;

        /* renamed from: b  reason: collision with root package name */
        public int f4113b;
        public boolean c;

        public c(int i2, b bVar) {
            this.a = new WeakReference<>(bVar);
            this.f4113b = i2;
        }
    }

    public static p b() {
        if (e == null) {
            e = new p();
        }
        return e;
    }

    public void a(int i2, b bVar) {
        synchronized (this.a) {
            if (b(bVar)) {
                this.c.f4113b = i2;
                this.f4112b.removeCallbacksAndMessages(this.c);
                b(this.c);
                return;
            }
            if (c(bVar)) {
                this.d.f4113b = i2;
            } else {
                this.d = new c(i2, bVar);
            }
            if (this.c == null || !a(this.c, 4)) {
                this.c = null;
                a();
            }
        }
    }

    public final boolean c(b bVar) {
        c cVar = this.d;
        if (cVar == null) {
            return false;
        }
        if (bVar != null && cVar.a.get() == bVar) {
            return true;
        }
        return false;
    }

    public void d(b bVar) {
        synchronized (this.a) {
            if (b(bVar)) {
                this.c = null;
                if (this.d != null) {
                    a();
                }
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.a) {
            if (b(bVar)) {
                b(this.c);
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.a) {
            if (b(bVar) && !this.c.c) {
                this.c.c = true;
                this.f4112b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public void g(b bVar) {
        synchronized (this.a) {
            if (b(bVar) && this.c.c) {
                this.c.c = false;
                b(this.c);
            }
        }
    }

    public final boolean b(b bVar) {
        c cVar = this.c;
        if (cVar == null) {
            return false;
        }
        if (bVar != null && cVar.a.get() == bVar) {
            return true;
        }
        return false;
    }

    public final void b(c cVar) {
        int i2 = cVar.f4113b;
        if (i2 != -2) {
            if (i2 <= 0) {
                i2 = i2 == -1 ? 1500 : 2750;
            }
            this.f4112b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f4112b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i2);
        }
    }

    public void a(b bVar, int i2) {
        synchronized (this.a) {
            if (b(bVar)) {
                a(this.c, i2);
            } else if (c(bVar)) {
                a(this.d, i2);
            }
        }
    }

    public boolean a(b bVar) {
        boolean z;
        synchronized (this.a) {
            if (!b(bVar)) {
                if (!c(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final void a() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = (b) cVar.a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.c = null;
            }
        }
    }

    public final boolean a(c cVar, int i2) {
        b bVar = (b) cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.f4112b.removeCallbacksAndMessages(cVar);
        bVar.a(i2);
        return true;
    }

    public void a(c cVar) {
        synchronized (this.a) {
            if (this.c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }
}
