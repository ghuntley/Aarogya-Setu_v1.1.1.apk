package i.b.a.n.o.h;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry */
public class f {
    public final List<a<?, ?>> a = new ArrayList();

    /* compiled from: TranscoderRegistry */
    public static final class a<Z, R> {
        public final Class<Z> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f2800b;
        public final e<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.a = cls;
            this.f2800b = cls2;
            this.c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2800b);
        }
    }

    public synchronized <Z, R> void a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.a.add(new a(cls, cls2, eVar));
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> a2 : this.a) {
            if (a2.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.a;
        }
        for (a next : this.a) {
            if (next.a(cls, cls2)) {
                return next.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }
}
