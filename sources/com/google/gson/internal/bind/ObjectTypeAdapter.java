package com.google.gson.internal.bind;

import com.google.gson.Gson;
import i.c.e.q;
import i.c.e.r;
import i.c.e.u.a;
import i.c.e.v.c;
import java.util.ArrayList;

public final class ObjectTypeAdapter extends q<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f734b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };
    public final Gson a;

    public ObjectTypeAdapter(Gson gson) {
        this.a = gson;
    }

    public Object a(i.c.e.v.a aVar) {
        int ordinal = aVar.C().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.s()) {
                arrayList.add(a(aVar));
            }
            aVar.m();
            return arrayList;
        } else if (ordinal == 2) {
            i.c.e.t.r rVar = new i.c.e.t.r();
            aVar.f();
            while (aVar.s()) {
                rVar.put(aVar.y(), a(aVar));
            }
            aVar.o();
            return rVar;
        } else if (ordinal == 5) {
            return aVar.A();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.v());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.u());
            }
            if (ordinal == 8) {
                aVar.z();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public void a(c cVar, Object obj) {
        if (obj == null) {
            cVar.q();
            return;
        }
        Gson gson = this.a;
        Class<?> cls = obj.getClass();
        if (gson != null) {
            q<?> a2 = gson.a(a.get(cls));
            if (a2 instanceof ObjectTypeAdapter) {
                cVar.h();
                cVar.m();
                return;
            }
            a2.a(cVar, obj);
            return;
        }
        throw null;
    }
}
