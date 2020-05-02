package com.google.gson.internal.bind;

import com.google.gson.Gson;
import i.c.e.q;
import i.c.e.r;
import i.c.e.u.a;
import i.c.e.v.b;
import i.c.e.v.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends q<Object> {
    public static final r c = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            Type type;
            Type type2 = aVar.getType();
            boolean z = type2 instanceof GenericArrayType;
            if (!z && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                return null;
            }
            if (z) {
                type = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                type = ((Class) type2).getComponentType();
            }
            return new ArrayTypeAdapter(gson, gson.a(a.get(type)), i.c.e.t.a.c(type));
        }
    };
    public final Class<E> a;

    /* renamed from: b  reason: collision with root package name */
    public final q<E> f729b;

    public ArrayTypeAdapter(Gson gson, q<E> qVar, Class<E> cls) {
        this.f729b = new TypeAdapterRuntimeTypeWrapper(gson, qVar, cls);
        this.a = cls;
    }

    public Object a(i.c.e.v.a aVar) {
        if (aVar.C() == b.NULL) {
            aVar.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.s()) {
            arrayList.add(this.f729b.a(aVar));
        }
        aVar.m();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void a(c cVar, Object obj) {
        if (obj == null) {
            cVar.q();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f729b.a(cVar, Array.get(obj, i2));
        }
        cVar.j();
    }
}
