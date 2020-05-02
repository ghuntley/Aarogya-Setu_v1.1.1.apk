package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import i.b.a.n.n.n;
import i.b.a.n.n.p;
import i.b.a.q.a;
import i.b.a.q.b;
import i.b.a.q.c;
import i.b.a.q.d;
import i.b.a.q.e;
import i.b.a.q.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final a f443b;
    public final e c;
    public final f d;
    public final i.b.a.n.l.f e;

    /* renamed from: f  reason: collision with root package name */
    public final i.b.a.n.o.h.f f444f;

    /* renamed from: g  reason: collision with root package name */
    public final b f445g;

    /* renamed from: h  reason: collision with root package name */
    public final d f446h = new d();

    /* renamed from: i  reason: collision with root package name */
    public final c f447i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final h.h.l.c<List<Throwable>> f448j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        public <M> NoModelLoaderAvailableException(M m2, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        h.h.l.c<List<Throwable>> a2 = i.b.a.t.k.a.a();
        this.f448j = a2;
        this.a = new p(a2);
        this.f443b = new a();
        this.c = new e();
        this.d = new f();
        this.e = new i.b.a.n.l.f();
        this.f444f = new i.b.a.n.o.h.f();
        this.f445g = new b();
        List asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.c.a((List<String>) arrayList);
    }

    public <Model> List<n<Model, ?>> a(Model model) {
        p pVar = this.a;
        if (pVar != null) {
            List<n<A, ?>> b2 = pVar.b(model.getClass());
            if (!b2.isEmpty()) {
                int size = b2.size();
                List<n<Model, ?>> emptyList = Collections.emptyList();
                boolean z = true;
                for (int i2 = 0; i2 < size; i2++) {
                    n nVar = b2.get(i2);
                    if (nVar.a(model)) {
                        if (z) {
                            emptyList = new ArrayList<>(size - i2);
                            z = false;
                        }
                        emptyList.add(nVar);
                    }
                }
                if (!emptyList.isEmpty()) {
                    return emptyList;
                }
                throw new NoModelLoaderAvailableException(model, b2);
            }
            throw new NoModelLoaderAvailableException(model);
        }
        throw null;
    }

    public List<ImageHeaderParser> a() {
        List<ImageHeaderParser> a2 = this.f445g.a();
        if (!a2.isEmpty()) {
            return a2;
        }
        throw new NoImageHeaderParserException();
    }
}
