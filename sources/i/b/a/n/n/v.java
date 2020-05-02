package i.b.a.n.n;

import i.b.a.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;

/* compiled from: UnitModelLoader */
public class v<Model> implements n<Model, Model> {
    public static final v<?> a = new v<>();

    /* compiled from: UnitModelLoader */
    public static class a<Model> implements o<Model, Model> {
        public static final a<?> a = new a<>();

        public n<Model, Model> a(r rVar) {
            return v.a;
        }
    }

    /* compiled from: UnitModelLoader */
    public static class b<Model> implements d<Model> {
        public final Model e;

        public b(Model model) {
            this.e = model;
        }

        public void a(g gVar, d.a<? super Model> aVar) {
            aVar.a(this.e);
        }

        public void b() {
        }

        public i.b.a.n.a c() {
            return i.b.a.n.a.LOCAL;
        }

        public void cancel() {
        }

        public Class<Model> a() {
            return this.e.getClass();
        }
    }

    public n.a<Model> a(Model model, int i2, int i3, i.b.a.n.g gVar) {
        return new n.a<>(new i.b.a.s.d(model), new b(model));
    }

    public boolean a(Model model) {
        return true;
    }
}
