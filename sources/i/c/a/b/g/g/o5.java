package i.c.a.b.g.g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class o5 {
    public static final o5 c = new o5();
    public final v5 a = new s4();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, t5<?>> f3380b = new ConcurrentHashMap();

    public final <T> t5<T> a(Class<T> cls) {
        t5 t5Var;
        t5 j5Var;
        y3.a(cls, "messageType");
        t5<T> t5Var2 = (t5) this.f3380b.get(cls);
        if (t5Var2 != null) {
            return t5Var2;
        }
        s4 s4Var = (s4) this.a;
        if (s4Var != null) {
            Class<w3> cls2 = w3.class;
            u5.a((Class<?>) cls);
            d5 a2 = s4Var.a.a(cls);
            if (a2.b()) {
                if (cls2.isAssignableFrom(cls)) {
                    j5Var = new j5(u5.d, l3.a, a2.c());
                } else {
                    g6<?, ?> g6Var = u5.f3474b;
                    k3<?> k3Var = l3.f3345b;
                    if (k3Var != null) {
                        j5Var = new j5(g6Var, k3Var, a2.c());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                t5Var = j5Var;
            } else {
                boolean isAssignableFrom = cls2.isAssignableFrom(cls);
                boolean z = false;
                if (isAssignableFrom) {
                    if (a2.a() == 1) {
                        z = true;
                    }
                    if (z) {
                        t5Var = h5.a(cls, a2, n5.f3369b, o4.f3379b, u5.d, l3.a, a5.f3207b);
                    } else {
                        t5Var = h5.a(cls, a2, n5.f3369b, o4.f3379b, u5.d, (k3<?>) null, a5.f3207b);
                    }
                } else {
                    if (a2.a() == 1) {
                        z = true;
                    }
                    if (z) {
                        l5 l5Var = n5.a;
                        o4 o4Var = o4.a;
                        g6<?, ?> g6Var2 = u5.f3474b;
                        k3<?> k3Var2 = l3.f3345b;
                        if (k3Var2 != null) {
                            t5Var = h5.a(cls, a2, l5Var, o4Var, g6Var2, k3Var2, a5.a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        t5Var = h5.a(cls, a2, n5.a, o4.a, u5.c, (k3<?>) null, a5.a);
                    }
                }
            }
            y3.a(cls, "messageType");
            y3.a(t5Var, "schema");
            t5<T> putIfAbsent = this.f3380b.putIfAbsent(cls, t5Var);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return t5Var;
        }
        throw null;
    }

    public final <T> t5<T> a(T t) {
        return a(t.getClass());
    }
}
