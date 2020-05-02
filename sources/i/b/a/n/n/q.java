package i.b.a.n.n;

import com.bumptech.glide.load.engine.GlideException;
import h.h.l.c;
import i.b.a.n.e;
import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: MultiModelLoader */
public class q<Model, Data> implements n<Model, Data> {
    public final List<n<Model, Data>> a;

    /* renamed from: b  reason: collision with root package name */
    public final c<List<Throwable>> f2694b;

    public q(List<n<Model, Data>> list, c<List<Throwable>> cVar) {
        this.a = list;
        this.f2694b = cVar;
    }

    public n.a<Data> a(Model model, int i2, int i3, g gVar) {
        n.a a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        e eVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = this.a.get(i4);
            if (nVar.a(model) && (a2 = nVar.a(model, i2, i3, gVar)) != null) {
                eVar = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a<>(eVar, new a(arrayList, this.f2694b));
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("MultiModelLoader{modelLoaders=");
        a2.append(Arrays.toString(this.a.toArray()));
        a2.append('}');
        return a2.toString();
    }

    /* compiled from: MultiModelLoader */
    public static class a<Data> implements d<Data>, d.a<Data> {
        public final List<d<Data>> e;

        /* renamed from: f  reason: collision with root package name */
        public final c<List<Throwable>> f2695f;

        /* renamed from: g  reason: collision with root package name */
        public int f2696g;

        /* renamed from: h  reason: collision with root package name */
        public i.b.a.g f2697h;

        /* renamed from: i  reason: collision with root package name */
        public d.a<? super Data> f2698i;

        /* renamed from: j  reason: collision with root package name */
        public List<Throwable> f2699j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2700k;

        public a(List<d<Data>> list, c<List<Throwable>> cVar) {
            this.f2695f = cVar;
            if (!list.isEmpty()) {
                this.e = list;
                this.f2696g = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public void a(i.b.a.g gVar, d.a<? super Data> aVar) {
            this.f2697h = gVar;
            this.f2698i = aVar;
            this.f2699j = this.f2695f.a();
            this.e.get(this.f2696g).a(gVar, this);
            if (this.f2700k) {
                cancel();
            }
        }

        public void b() {
            List<Throwable> list = this.f2699j;
            if (list != null) {
                this.f2695f.a(list);
            }
            this.f2699j = null;
            for (d<Data> b2 : this.e) {
                b2.b();
            }
        }

        public i.b.a.n.a c() {
            return this.e.get(0).c();
        }

        public void cancel() {
            this.f2700k = true;
            for (d<Data> cancel : this.e) {
                cancel.cancel();
            }
        }

        public final void d() {
            if (!this.f2700k) {
                if (this.f2696g < this.e.size() - 1) {
                    this.f2696g++;
                    a(this.f2697h, this.f2698i);
                    return;
                }
                g.a.a.b.a.a(this.f2699j, "Argument must not be null");
                this.f2698i.a((Exception) new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f2699j)));
            }
        }

        public Class<Data> a() {
            return this.e.get(0).a();
        }

        public void a(Data data) {
            if (data != null) {
                this.f2698i.a(data);
            } else {
                d();
            }
        }

        public void a(Exception exc) {
            List<Throwable> list = this.f2699j;
            g.a.a.b.a.a(list, "Argument must not be null");
            list.add(exc);
            d();
        }
    }

    public boolean a(Model model) {
        for (n<Model, Data> a2 : this.a) {
            if (a2.a(model)) {
                return true;
            }
        }
        return false;
    }
}
