package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import i.c.e.q;
import i.c.e.v.a;
import i.c.e.v.c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class TypeAdapterRuntimeTypeWrapper<T> extends q<T> {
    public final Gson a;

    /* renamed from: b  reason: collision with root package name */
    public final q<T> f746b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, q<T> qVar, Type type) {
        this.a = gson;
        this.f746b = qVar;
        this.c = type;
    }

    public T a(a aVar) {
        return this.f746b.a(aVar);
    }

    public void a(c cVar, T t) {
        q<T> qVar = this.f746b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            qVar = this.a.a(i.c.e.u.a.get(type));
            if (qVar instanceof ReflectiveTypeAdapterFactory.Adapter) {
                q<T> qVar2 = this.f746b;
                if (!(qVar2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    qVar = qVar2;
                }
            }
        }
        qVar.a(cVar, t);
    }
}
