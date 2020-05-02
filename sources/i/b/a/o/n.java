package i.b.a.o;

import i.b.a.r.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker */
public class n {
    public final Set<b> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f2813b = new ArrayList();
    public boolean c;

    public boolean a(b bVar) {
        boolean z = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.a.remove(bVar);
        if (!this.f2813b.remove(bVar) && !remove) {
            z = false;
        }
        if (z) {
            bVar.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
