package androidx.lifecycle;

import h.o.a0;
import h.o.c0;
import h.o.d0;
import h.o.h;
import h.o.j;
import h.o.l;
import h.o.m;
import h.o.x;
import h.t.a;
import h.t.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class SavedStateHandleController implements j {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f263b = false;
    public final x c;

    public static final class a implements a.C0067a {
        public void a(c cVar) {
            if (cVar instanceof d0) {
                c0 h2 = ((d0) cVar).h();
                h.t.a c = cVar.c();
                if (h2 != null) {
                    Iterator it = new HashSet(h2.a.keySet()).iterator();
                    while (it.hasNext()) {
                        HashMap<String, a0> hashMap = h2.a;
                        h a = cVar.a();
                        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) hashMap.get((String) it.next()).a("androidx.lifecycle.savedstate.vm.tag");
                        if (savedStateHandleController != null && !savedStateHandleController.f263b) {
                            savedStateHandleController.a(c, a);
                            SavedStateHandleController.b(c, a);
                        }
                    }
                    if (!new HashSet(h2.a.keySet()).isEmpty()) {
                        c.a((Class<? extends a.C0067a>) a.class);
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, x xVar) {
        this.a = str;
        this.c = xVar;
    }

    public static void b(final h.t.a aVar, final h hVar) {
        h.b bVar = ((m) hVar).f2058b;
        if (bVar == h.b.INITIALIZED || bVar.a(h.b.STARTED)) {
            aVar.a((Class<? extends a.C0067a>) a.class);
        } else {
            hVar.a(new j() {
                public void a(l lVar, h.a aVar) {
                    if (aVar == h.a.ON_START) {
                        ((m) hVar).a.remove(this);
                        aVar.a((Class<? extends a.C0067a>) a.class);
                    }
                }
            });
        }
    }

    public void a(h.t.a aVar, h hVar) {
        if (!this.f263b) {
            this.f263b = true;
            hVar.a(this);
            if (aVar.a.b(this.a, this.c.f2071b) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public void a(l lVar, h.a aVar) {
        if (aVar == h.a.ON_DESTROY) {
            this.f263b = false;
            ((m) lVar.a()).a.remove(this);
        }
    }
}
