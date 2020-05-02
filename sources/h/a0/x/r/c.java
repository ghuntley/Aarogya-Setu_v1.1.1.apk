package h.a0.x.r;

import androidx.work.impl.WorkDatabase;
import h.a0.o;
import h.a0.t;
import h.a0.x.b;
import h.a0.x.d;
import h.a0.x.j;
import h.a0.x.q.q;
import h.a0.x.q.r;
import java.util.LinkedList;

/* compiled from: CancelWorkRunnable */
public abstract class c implements Runnable {
    public final b e = new b();

    public abstract void a();

    public void a(j jVar, String str) {
        WorkDatabase workDatabase = jVar.c;
        q n2 = workDatabase.n();
        h.a0.x.q.b i2 = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            r rVar = (r) n2;
            t a = rVar.a(str2);
            if (!(a == t.SUCCEEDED || a == t.FAILED)) {
                rVar.a(t.CANCELLED, str2);
            }
            linkedList.addAll(((h.a0.x.q.c) i2).a(str2));
        }
        jVar.f959f.d(str);
        for (d a2 : jVar.e) {
            a2.a(str);
        }
    }

    public void run() {
        try {
            a();
            this.e.a(o.a);
        } catch (Throwable th) {
            this.e.a(new o.b.a(th));
        }
    }
}
