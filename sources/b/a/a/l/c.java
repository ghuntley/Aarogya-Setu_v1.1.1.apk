package b.a.a.l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import n.m.c.f;
import n.m.c.g;
import n.m.c.h;
import n.m.c.i;
import n.m.c.k;
import n.o.e;

/* compiled from: AppExecutors.kt */
public final class c {
    public static final /* synthetic */ e[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final n.b f424b;
    public static final c c = new c();

    /* compiled from: AppExecutors.kt */
    public static final class a implements Executor {
        public final Handler e = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            if (runnable != null) {
                this.e.post(runnable);
            } else {
                f.a("command");
                throw null;
            }
        }
    }

    /* compiled from: AppExecutors.kt */
    public static final class b extends g implements n.m.b.a<a> {
        public static final b e = new b();

        public b() {
            super(0);
        }

        public Object invoke() {
            return new a();
        }
    }

    /* renamed from: b.a.a.l.c$c  reason: collision with other inner class name */
    /* compiled from: AppExecutors.kt */
    public static final class C0010c implements Runnable {
        public final /* synthetic */ n.m.b.a e;

        public C0010c(n.m.b.a aVar) {
            this.e = aVar;
        }

        public final void run() {
            this.e.invoke();
        }
    }

    static {
        i iVar = new i(k.a(c.class), "mainThread", "getMainThread()Lnic/goi/aarogyasetu/utility/AppExecutors$MainThreadExecutor;");
        k.a((h) iVar);
        a = new e[]{iVar};
        n.c cVar = n.c.SYNCHRONIZED;
        b bVar = b.e;
        if (cVar != null) {
            f424b = new n.f(bVar, (Object) null, 2);
        } else {
            f.a("mode");
            throw null;
        }
    }

    public final void a(n.m.b.a<n.h> aVar) {
        if (aVar != null) {
            n.b bVar = f424b;
            e eVar = a[0];
            ((a) bVar.getValue()).execute(new C0010c(aVar));
            return;
        }
        f.a("op");
        throw null;
    }
}
