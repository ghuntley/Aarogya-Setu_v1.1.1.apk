package com.google.gson.internal.bind;

import com.google.gson.Gson;
import i.c.e.q;
import i.c.e.r;
import i.c.e.t.g;
import i.c.e.t.s;
import i.c.e.u.a;
import i.c.e.v.b;
import i.c.e.v.c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements r {
    public final g e;

    public CollectionTypeAdapterFactory(g gVar) {
        this.e = gVar;
    }

    public <T> q<T> a(Gson gson, a<T> aVar) {
        Type type;
        Type type2 = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type b2 = i.c.e.t.a.b(type2, rawType, Collection.class);
        if (b2 instanceof WildcardType) {
            b2 = ((WildcardType) b2).getUpperBounds()[0];
        }
        if (b2 instanceof ParameterizedType) {
            type = ((ParameterizedType) b2).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new Adapter(gson, type, gson.a(a.get(type)), this.e.a(aVar));
    }

    public static final class Adapter<E> extends q<Collection<E>> {
        public final q<E> a;

        /* renamed from: b  reason: collision with root package name */
        public final s<? extends Collection<E>> f730b;

        public Adapter(Gson gson, Type type, q<E> qVar, s<? extends Collection<E>> sVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, qVar, type);
            this.f730b = sVar;
        }

        public void a(c cVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.q();
                return;
            }
            cVar.f();
            for (Object a2 : collection) {
                this.a.a(cVar, a2);
            }
            cVar.j();
        }

        public Object a(i.c.e.v.a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            Collection collection = (Collection) this.f730b.a();
            aVar.a();
            while (aVar.s()) {
                collection.add(this.a.a(aVar));
            }
            aVar.m();
            return collection;
        }
    }
}
