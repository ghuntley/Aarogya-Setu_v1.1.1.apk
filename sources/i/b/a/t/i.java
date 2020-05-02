package i.b.a.t;

import i.a.a.a.a;

/* compiled from: MultiClassKey */
public class i {
    public Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f2869b;
    public Class<?> c;

    public i() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.f2869b.equals(iVar.f2869b) && j.b(this.c, iVar.c);
    }

    public int hashCode() {
        int hashCode = (this.f2869b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a2 = a.a("MultiClassKey{first=");
        a2.append(this.a);
        a2.append(", second=");
        a2.append(this.f2869b);
        a2.append('}');
        return a2.toString();
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.f2869b = cls2;
        this.c = cls3;
    }
}
