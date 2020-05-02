package h.o;

import h.o.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache */
public class b {
    public static b c = new b();
    public final Map<Class<?>, a> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2048b = new HashMap();

    /* compiled from: ClassesInfoCache */
    public static class a {
        public final Map<h.a, List<C0059b>> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<C0059b, h.a> f2049b;

        public a(Map<C0059b, h.a> map) {
            this.f2049b = map;
            for (Map.Entry next : map.entrySet()) {
                h.a aVar = (h.a) next.getValue();
                List list = this.a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        public static void a(List<C0059b> list, l lVar, h.a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0059b bVar = list.get(size);
                    if (bVar != null) {
                        try {
                            int i2 = bVar.a;
                            if (i2 == 0) {
                                bVar.f2050b.invoke(obj, new Object[0]);
                            } else if (i2 == 1) {
                                bVar.f2050b.invoke(obj, new Object[]{lVar});
                            } else if (i2 == 2) {
                                bVar.f2050b.invoke(obj, new Object[]{lVar, aVar});
                            }
                            size--;
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException("Failed to call observer method", e.getCause());
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: h.o.b$b  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    public static class C0059b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2050b;

        public C0059b(int i2, Method method) {
            this.a = i2;
            this.f2050b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0059b.class != obj.getClass()) {
                return false;
            }
            C0059b bVar = (C0059b) obj;
            if (this.a != bVar.a || !this.f2050b.getName().equals(bVar.f2050b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f2050b.getName().hashCode() + (this.a * 31);
        }
    }

    public a a(Class<?> cls) {
        a aVar = this.a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    public final void a(Map<C0059b, h.a> map, C0059b bVar, h.a aVar, Class<?> cls) {
        h.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2050b;
            StringBuilder a2 = i.a.a.a.a.a("Method ");
            a2.append(method.getName());
            a2.append(" in ");
            a2.append(cls.getName());
            a2.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a2.append(aVar2);
            a2.append(", new value ");
            a2.append(aVar);
            throw new IllegalArgumentException(a2.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a a2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a2 = a(superclass)) == null)) {
            hashMap.putAll(a2.f2049b);
        }
        for (Class a3 : cls.getInterfaces()) {
            for (Map.Entry next : a(a3).f2049b.entrySet()) {
                a(hashMap, (C0059b) next.getKey(), (h.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            t tVar = (t) method.getAnnotation(t.class);
            if (tVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(l.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                h.a value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(h.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == h.a.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new C0059b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.f2048b.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
