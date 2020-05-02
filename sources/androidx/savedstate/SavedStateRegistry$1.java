package androidx.savedstate;

import h.o.f;
import h.o.h;
import h.o.l;
import h.t.a;

public class SavedStateRegistry$1 implements f {
    public final /* synthetic */ a a;

    public SavedStateRegistry$1(a aVar) {
        this.a = aVar;
    }

    public void a(l lVar, h.a aVar) {
        if (aVar == h.a.ON_START) {
            this.a.e = true;
        } else if (aVar == h.a.ON_STOP) {
            this.a.e = false;
        }
    }
}
