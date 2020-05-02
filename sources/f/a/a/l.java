package f.a.a;

import i.a.a.a.a;
import n.m.c.f;

/* compiled from: LockFreeLinkedList.kt */
public final class l {
    public final h a;

    public l(h hVar) {
        if (hVar != null) {
            this.a = hVar;
        } else {
            f.a("ref");
            throw null;
        }
    }

    public String toString() {
        StringBuilder a2 = a.a("Removed[");
        a2.append(this.a);
        a2.append(']');
        return a2.toString();
    }
}
