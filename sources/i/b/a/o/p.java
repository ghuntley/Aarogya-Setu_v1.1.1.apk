package i.b.a.o;

import i.b.a.r.h.h;
import i.b.a.t.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker */
public final class p implements i {
    public final Set<h<?>> e = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        Iterator it = ((ArrayList) j.a(this.e)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    public void c() {
        Iterator it = ((ArrayList) j.a(this.e)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).c();
        }
    }

    public void d() {
        Iterator it = ((ArrayList) j.a(this.e)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).d();
        }
    }
}
