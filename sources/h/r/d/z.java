package h.r.d;

import androidx.recyclerview.widget.RecyclerView;
import h.e.e;
import h.e.h;
import h.h.l.c;
import h.h.l.d;

/* compiled from: ViewInfoStore */
public class z {
    public final h<RecyclerView.d0, a> a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final e<RecyclerView.d0> f2152b = new e<>();

    /* compiled from: ViewInfoStore */
    public interface b {
    }

    public final RecyclerView.l.c a(RecyclerView.d0 d0Var, int i2) {
        a e;
        RecyclerView.l.c cVar;
        int a2 = this.a.a((Object) d0Var);
        if (a2 >= 0 && (e = this.a.e(a2)) != null) {
            int i3 = e.a;
            if ((i3 & i2) != 0) {
                e.a = (~i2) & i3;
                if (i2 == 4) {
                    cVar = e.f2153b;
                } else if (i2 == 8) {
                    cVar = e.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((e.a & 12) == 0) {
                    this.a.d(a2);
                    a.a(e);
                }
                return cVar;
            }
        }
        return null;
    }

    public void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(d0Var, orDefault);
        }
        orDefault.f2153b = cVar;
        orDefault.a |= 4;
    }

    public void c(RecyclerView.d0 d0Var) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault != null) {
            orDefault.a &= -2;
        }
    }

    public void d(RecyclerView.d0 d0Var) {
        int d = this.f2152b.d() - 1;
        while (true) {
            if (d < 0) {
                break;
            } else if (d0Var == this.f2152b.a(d)) {
                e<RecyclerView.d0> eVar = this.f2152b;
                Object[] objArr = eVar.f1552g;
                Object obj = objArr[d];
                Object obj2 = e.f1550i;
                if (obj != obj2) {
                    objArr[d] = obj2;
                    eVar.e = true;
                }
            } else {
                d--;
            }
        }
        a remove = this.a.remove(d0Var);
        if (remove != null) {
            a.a(remove);
        }
    }

    /* compiled from: ViewInfoStore */
    public static class a {
        public static c<a> d = new d(20);
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.l.c f2153b;
        public RecyclerView.l.c c;

        public static a a() {
            a a2 = d.a();
            return a2 == null ? new a() : a2;
        }

        public static void a(a aVar) {
            aVar.a = 0;
            aVar.f2153b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    public boolean b(RecyclerView.d0 d0Var) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault == null || (orDefault.a & 1) == 0) {
            return false;
        }
        return true;
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(d0Var, orDefault);
        }
        orDefault.c = cVar;
        orDefault.a |= 8;
    }

    public void a(RecyclerView.d0 d0Var) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(d0Var, orDefault);
        }
        orDefault.a |= 1;
    }
}
