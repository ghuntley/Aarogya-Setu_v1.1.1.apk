package f.a;

import i.c.d.p.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import n.m.c.f;
import n.p.a;
import n.p.b;
import n.p.c;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class t {
    public static final List<CoroutineExceptionHandler> a;

    static {
        List list;
        Iterator a2 = a.a();
        f.a((Object) a2, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        b<Object> cVar = new c(a2);
        if (!(cVar instanceof a)) {
            cVar = new a<>(cVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Object add : cVar) {
            arrayList.add(add);
        }
        int size = arrayList.size();
        if (size != 0) {
            list = arrayList;
            if (size == 1) {
                list = e.d(arrayList.get(0));
            }
        } else {
            list = n.i.b.e;
        }
        a = list;
    }

    public static final void a(n.k.e eVar, Throwable th) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (th != null) {
            for (CoroutineExceptionHandler handleException : a) {
                try {
                    handleException.handleException(eVar, th);
                } catch (Throwable th2) {
                    Thread currentThread = Thread.currentThread();
                    f.a((Object) currentThread, "currentThread");
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e.b(th, th2));
                }
            }
            Thread currentThread2 = Thread.currentThread();
            f.a((Object) currentThread2, "currentThread");
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
        } else {
            f.a("exception");
            throw null;
        }
    }
}
