package n.m.c;

import n.o.a;
import n.o.e;

/* compiled from: PropertyReference */
public abstract class j extends a implements e {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            i iVar = (i) this;
            i iVar2 = (i) jVar;
            if (!iVar.f5216h.equals(iVar2.f5216h) || !iVar.f5217i.equals(iVar2.f5217i) || !iVar.f5218j.equals(iVar2.f5218j) || !f.a(this.f5215f, jVar.f5215f)) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        i iVar = (i) this;
        int hashCode = iVar.f5217i.hashCode();
        return iVar.f5218j.hashCode() + ((hashCode + (iVar.f5216h.hashCode() * 31)) * 31);
    }

    public String toString() {
        a a = a();
        if (a != this) {
            return a.toString();
        }
        return i.a.a.a.a.a(i.a.a.a.a.a("property "), ((i) this).f5217i, " (Kotlin reflection is not available)");
    }
}
