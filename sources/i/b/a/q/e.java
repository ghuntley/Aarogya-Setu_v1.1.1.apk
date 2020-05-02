package i.b.a.q;

import i.b.a.n.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry */
public class e {
    public final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f2817b = new HashMap();

    /* compiled from: ResourceDecoderRegistry */
    public static class a<T, R> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f2818b;
        public final i<T, R> c;

        public a(Class<T> cls, Class<R> cls2, i<T, R> iVar) {
            this.a = cls;
            this.f2818b = cls2;
            this.c = iVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2818b);
        }
    }

    public synchronized void a(List<String> list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        for (String add : list) {
            this.a.add(add);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a> list = this.f2817b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f2818b)) {
                        arrayList.add(aVar.f2818b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<i<T, R>> a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a> list = this.f2817b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void a(String str, i<T, R> iVar, Class<T> cls, Class<R> cls2) {
        a(str).add(new a(cls, cls2, iVar));
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.f2817b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f2817b.put(str, list);
        }
        return list;
    }
}
