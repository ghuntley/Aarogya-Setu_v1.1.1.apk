package i.b.a.n.n;

import com.bumptech.glide.Registry;
import i.b.a.n.g;
import i.b.a.n.n.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory */
public class r {
    public static final c e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final n<Object, Object> f2701f = new a();
    public final List<b<?, ?>> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f2702b;
    public final Set<b<?, ?>> c = new HashSet();
    public final h.h.l.c<List<Throwable>> d;

    /* compiled from: MultiModelLoaderFactory */
    public static class a implements n<Object, Object> {
        public n.a<Object> a(Object obj, int i2, int i3, g gVar) {
            return null;
        }

        public boolean a(Object obj) {
            return false;
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    public static class b<Model, Data> {
        public final Class<Model> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f2703b;
        public final o<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.f2703b = cls2;
            this.c = oVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    public static class c {
    }

    public r(h.h.l.c<List<Throwable>> cVar) {
        c cVar2 = e;
        this.d = cVar;
        this.f2702b = cVar2;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        b bVar = new b(cls, cls2, oVar);
        List<b<?, ?>> list = this.a;
        list.add(list.size(), bVar);
    }

    public synchronized List<Class<?>> b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.a) {
            if (!arrayList.contains(next.f2703b) && next.a.isAssignableFrom(cls)) {
                arrayList.add(next.f2703b);
            }
        }
        return arrayList;
    }

    public synchronized <Model> List<n<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.a) {
                if (!this.c.contains(next)) {
                    if (next.a.isAssignableFrom(cls)) {
                        this.c.add(next);
                        n<? extends Model, ? extends Data> a2 = next.c.a(this);
                        g.a.a.b.a.a(a2, "Argument must not be null");
                        arrayList.add(a2);
                        this.c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized <Model, Data> n<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b next : this.a) {
                if (this.c.contains(next)) {
                    z = true;
                } else {
                    if (next.a.isAssignableFrom(cls) && next.f2703b.isAssignableFrom(cls2)) {
                        this.c.add(next);
                        arrayList.add(a((b<?, ?>) next));
                        this.c.remove(next);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f2702b;
                h.h.l.c<List<Throwable>> cVar2 = this.d;
                if (cVar != null) {
                    return new q(arrayList, cVar2);
                }
                throw null;
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z) {
                return f2701f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final <Model, Data> n<Model, Data> a(b<?, ?> bVar) {
        n<? extends Model, ? extends Data> a2 = bVar.c.a(this);
        g.a.a.b.a.a(a2, "Argument must not be null");
        return a2;
    }
}
