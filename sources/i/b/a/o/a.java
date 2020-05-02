package i.b.a.o;

import i.b.a.t.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle */
public class a implements h {
    public final Set<i> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f2801b;
    public boolean c;

    public void a(i iVar) {
        this.a.add(iVar);
        if (this.c) {
            iVar.d();
        } else if (this.f2801b) {
            iVar.c();
        } else {
            iVar.a();
        }
    }

    public void b(i iVar) {
        this.a.remove(iVar);
    }

    public void c() {
        this.f2801b = false;
        Iterator it = ((ArrayList) j.a(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public void b() {
        this.f2801b = true;
        Iterator it = ((ArrayList) j.a(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).c();
        }
    }

    public void a() {
        this.c = true;
        Iterator it = ((ArrayList) j.a(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).d();
        }
    }
}
