package i.c.d.f;

import i.c.d.i.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class u extends a {
    public final Set<Class<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<?>> f4670b;
    public final Set<Class<?>> c;
    public final Set<Class<?>> d;
    public final Set<Class<?>> e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4671f;

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    public static class a implements c {
        public a(Set<Class<?>> set, c cVar) {
        }
    }

    public u(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (q next : dVar.f4658b) {
            if (next.c == 0) {
                if (next.a()) {
                    hashSet3.add(next.a);
                } else {
                    hashSet.add(next.a);
                }
            } else if (next.a()) {
                hashSet4.add(next.a);
            } else {
                hashSet2.add(next.a);
            }
        }
        if (!dVar.f4659f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.f4670b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = dVar.f4659f;
        this.f4671f = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T a2 = this.f4671f.a(cls);
            if (!cls.equals(c.class)) {
                return a2;
            }
            return new a(this.e, (c) a2);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> i.c.d.l.a<T> b(Class<T> cls) {
        if (this.f4670b.contains(cls)) {
            return this.f4671f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> Set<T> c(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f4671f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> i.c.d.l.a<Set<T>> d(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f4671f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
