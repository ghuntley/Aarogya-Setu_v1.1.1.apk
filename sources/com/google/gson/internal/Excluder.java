package com.google.gson.internal;

import com.google.gson.Gson;
import i.c.e.a;
import i.c.e.q;
import i.c.e.r;
import i.c.e.s.d;
import i.c.e.v.c;
import java.util.Collections;
import java.util.List;

public final class Excluder implements r, Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final Excluder f722j = new Excluder();
    public double e = -1.0d;

    /* renamed from: f  reason: collision with root package name */
    public int f723f = 136;

    /* renamed from: g  reason: collision with root package name */
    public boolean f724g = true;

    /* renamed from: h  reason: collision with root package name */
    public List<a> f725h = Collections.emptyList();

    /* renamed from: i  reason: collision with root package name */
    public List<a> f726i = Collections.emptyList();

    public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean a = a(rawType);
        final boolean z = a || a((Class<?>) rawType, true);
        final boolean z2 = a || a((Class<?>) rawType, false);
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final i.c.e.u.a<T> aVar2 = aVar;
        return new q<T>() {
            public q<T> a;

            public T a(i.c.e.v.a aVar) {
                if (z2) {
                    aVar.F();
                    return null;
                }
                q<T> qVar = this.a;
                if (qVar == null) {
                    qVar = gson2.a((r) Excluder.this, aVar2);
                    this.a = qVar;
                }
                return qVar.a(aVar);
            }

            public void a(c cVar, T t) {
                if (z) {
                    cVar.q();
                    return;
                }
                q<T> qVar = this.a;
                if (qVar == null) {
                    qVar = gson2.a((r) Excluder.this, aVar2);
                    this.a = qVar;
                }
                qVar.a(cVar, t);
            }
        };
    }

    public final boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean c(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean a(Class<?> cls) {
        if (this.e != -1.0d && !a((i.c.e.s.c) cls.getAnnotation(i.c.e.s.c.class), (d) cls.getAnnotation(d.class))) {
            return true;
        }
        if ((this.f724g || !c(cls)) && !b(cls)) {
            return false;
        }
        return true;
    }

    public final boolean a(Class<?> cls, boolean z) {
        for (a a : z ? this.f725h : this.f726i) {
            if (a.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(i.c.e.s.c cVar, d dVar) {
        if (!(cVar == null || cVar.value() <= this.e)) {
            return false;
        }
        if (dVar == null || dVar.value() > this.e) {
            return true;
        }
        return false;
    }
}
