package h.h.j;

import android.os.Handler;
import h.h.j.c;
import java.util.concurrent.Callable;

/* compiled from: SelfDestructiveThread */
public class d implements Runnable {
    public final /* synthetic */ Callable e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Handler f1794f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c.C0047c f1795g;

    /* compiled from: SelfDestructiveThread */
    public class a implements Runnable {
        public final /* synthetic */ Object e;

        public a(Object obj) {
            this.e = obj;
        }

        public void run() {
            d.this.f1795g.a(this.e);
        }
    }

    public d(c cVar, Callable callable, Handler handler, c.C0047c cVar2) {
        this.e = callable;
        this.f1794f = handler;
        this.f1795g = cVar2;
    }

    public void run() {
        Object obj;
        try {
            obj = this.e.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f1794f.post(new a(obj));
    }
}
