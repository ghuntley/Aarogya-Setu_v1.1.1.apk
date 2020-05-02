package com.google.gson;

import i.c.e.q;
import i.c.e.v.a;
import i.c.e.v.b;
import i.c.e.v.c;

public class TypeAdapter$1 extends q<T> {
    public final /* synthetic */ q a;

    public TypeAdapter$1(q qVar) {
        this.a = qVar;
    }

    public void a(c cVar, T t) {
        if (t == null) {
            cVar.q();
        } else {
            this.a.a(cVar, t);
        }
    }

    public T a(a aVar) {
        if (aVar.C() != b.NULL) {
            return this.a.a(aVar);
        }
        aVar.z();
        return null;
    }
}
