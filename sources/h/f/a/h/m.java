package h.f.a.h;

import h.f.a.h.c;
import java.util.ArrayList;

/* compiled from: Snapshot */
public class m {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f1674b;
    public int c;
    public int d;
    public ArrayList<a> e = new ArrayList<>();

    /* compiled from: Snapshot */
    public static class a {
        public c a;

        /* renamed from: b  reason: collision with root package name */
        public c f1675b;
        public int c;
        public c.b d;
        public int e;

        public a(c cVar) {
            this.a = cVar;
            this.f1675b = cVar.d;
            this.c = cVar.a();
            this.d = cVar.f1624g;
            this.e = cVar.f1625h;
        }
    }

    public m(d dVar) {
        this.a = dVar.I;
        this.f1674b = dVar.J;
        this.c = dVar.i();
        this.d = dVar.d();
        ArrayList<c> b2 = dVar.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.e.add(new a(b2.get(i2)));
        }
    }
}
