package i.c.e.t;

import i.c.e.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* compiled from: ConstructorConstructor */
public final class g {
    public final Map<Type, f<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final i.c.e.t.z.b f4869b = i.c.e.t.z.b.a;

    /* compiled from: ConstructorConstructor */
    public class a implements s<T> {
        public final /* synthetic */ f a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f4870b;

        public a(g gVar, f fVar, Type type) {
            this.a = fVar;
            this.f4870b = type;
        }

        public T a() {
            return this.a.a(this.f4870b);
        }
    }

    /* compiled from: ConstructorConstructor */
    public class b implements s<T> {
        public final /* synthetic */ f a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f4871b;

        public b(g gVar, f fVar, Type type) {
            this.a = fVar;
            this.f4871b = type;
        }

        public T a() {
            return this.a.a(this.f4871b);
        }
    }

    public g(Map<Type, f<?>> map) {
        this.a = map;
    }

    public <T> s<T> a(i.c.e.u.a<T> aVar) {
        h hVar;
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        f fVar = this.a.get(type);
        if (fVar != null) {
            return new a(this, fVar, type);
        }
        f fVar2 = this.a.get(rawType);
        if (fVar2 != null) {
            return new b(this, fVar2, type);
        }
        s<T> sVar = null;
        try {
            Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f4869b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                sVar = new i(this);
            } else if (EnumSet.class.isAssignableFrom(rawType)) {
                sVar = new j(this, type);
            } else if (Set.class.isAssignableFrom(rawType)) {
                sVar = new k(this);
            } else if (Queue.class.isAssignableFrom(rawType)) {
                sVar = new l(this);
            } else {
                sVar = new m(this);
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                sVar = new n(this);
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                sVar = new b(this);
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                sVar = new c(this);
            } else if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(i.c.e.u.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                sVar = new e(this);
            } else {
                sVar = new d(this);
            }
        }
        if (sVar != null) {
            return sVar;
        }
        return new f(this, rawType, type);
    }

    public String toString() {
        return this.a.toString();
    }
}
