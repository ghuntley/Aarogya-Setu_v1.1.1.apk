package androidx.lifecycle;

import h.o.e;
import h.o.h;
import h.o.j;
import h.o.l;
import h.o.q;

public class CompositeGeneratedAdaptersObserver implements j {
    public final e[] a;

    public CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.a = eVarArr;
    }

    public void a(l lVar, h.a aVar) {
        q qVar = new q();
        for (e a2 : this.a) {
            a2.a(lVar, aVar, false, qVar);
        }
        for (e a3 : this.a) {
            a3.a(lVar, aVar, true, qVar);
        }
    }
}
