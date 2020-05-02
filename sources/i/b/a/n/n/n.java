package i.b.a.n.n;

import i.b.a.n.e;
import i.b.a.n.g;
import i.b.a.n.l.d;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader */
public interface n<Model, Data> {

    /* compiled from: ModelLoader */
    public static class a<Data> {
        public final e a;

        /* renamed from: b  reason: collision with root package name */
        public final List<e> f2692b;
        public final d<Data> c;

        public a(e eVar, d<Data> dVar) {
            List<e> emptyList = Collections.emptyList();
            g.a.a.b.a.a(eVar, "Argument must not be null");
            this.a = eVar;
            g.a.a.b.a.a(emptyList, "Argument must not be null");
            this.f2692b = emptyList;
            g.a.a.b.a.a(dVar, "Argument must not be null");
            this.c = dVar;
        }
    }

    a<Data> a(Model model, int i2, int i3, g gVar);

    boolean a(Model model);
}
