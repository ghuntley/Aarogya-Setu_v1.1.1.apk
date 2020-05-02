package i.b.a.n.m.b0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool */
public final class i implements b {
    public final g<a, Object> a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f2536b = new b();
    public final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    public final Map<Class<?>, a<?>> d = new HashMap();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2537f;

    /* compiled from: LruArrayPool */
    public static final class a implements l {
        public final b a;

        /* renamed from: b  reason: collision with root package name */
        public int f2538b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.a.a(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2538b == aVar.f2538b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i2 = this.f2538b * 31;
            Class<?> cls = this.c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("Key{size=");
            a2.append(this.f2538b);
            a2.append("array=");
            a2.append(this.c);
            a2.append('}');
            return a2.toString();
        }
    }

    public i(int i2) {
        this.e = i2;
    }

    public synchronized <T> T a(int i2, Class<T> cls) {
        a aVar;
        aVar = (a) this.f2536b.b();
        aVar.f2538b = i2;
        aVar.c = cls;
        return a(aVar, cls);
    }

    public synchronized <T> T b(int i2, Class<T> cls) {
        a aVar;
        boolean z;
        Integer ceilingKey = b((Class<?>) cls).ceilingKey(Integer.valueOf(i2));
        boolean z2 = false;
        if (ceilingKey != null) {
            int i3 = this.f2537f;
            if (i3 != 0) {
                if (this.e / i3 < 2) {
                    z = false;
                    if (z || ceilingKey.intValue() <= i2 * 8) {
                        z2 = true;
                    }
                }
            }
            z = true;
            z2 = true;
        }
        if (z2) {
            aVar = this.f2536b.a(ceilingKey.intValue(), cls);
        } else {
            a aVar2 = (a) this.f2536b.b();
            aVar2.f2538b = i2;
            aVar2.c = cls;
            aVar = aVar2;
        }
        return a(aVar, cls);
    }

    public final void c(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> b2 = b(cls);
        Integer num = (Integer) b2.get(Integer.valueOf(i2));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
        } else if (num.intValue() == 1) {
            b2.remove(Integer.valueOf(i2));
        } else {
            b2.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
        }
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        a<?> a2 = a(cls);
        int a3 = a2.a(t);
        int b2 = a2.b() * a3;
        int i2 = 1;
        if (b2 <= this.e / 2) {
            a a4 = this.f2536b.a(a3, cls);
            this.a.a(a4, t);
            NavigableMap<Integer, Integer> b3 = b(cls);
            Integer num = (Integer) b3.get(Integer.valueOf(a4.f2538b));
            Integer valueOf = Integer.valueOf(a4.f2538b);
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            b3.put(valueOf, Integer.valueOf(i2));
            this.f2537f += b2;
            b(this.e);
        }
    }

    /* compiled from: LruArrayPool */
    public static final class b extends c<a> {
        public a a(int i2, Class<?> cls) {
            a aVar = (a) b();
            aVar.f2538b = i2;
            aVar.c = cls;
            return aVar;
        }

        public l a() {
            return new a(this);
        }
    }

    public final <T> T a(a aVar, Class<T> cls) {
        a<T> a2 = a(cls);
        T a3 = this.a.a(aVar);
        if (a3 != null) {
            this.f2537f -= a2.b() * a2.a(a3);
            c(a2.a(a3), cls);
        }
        if (a3 != null) {
            return a3;
        }
        if (Log.isLoggable(a2.a(), 2)) {
            String a4 = a2.a();
            StringBuilder a5 = i.a.a.a.a.a("Allocated ");
            a5.append(aVar.f2538b);
            a5.append(" bytes");
            Log.v(a4, a5.toString());
        }
        return a2.newArray(aVar.f2538b);
    }

    public final void b(int i2) {
        while (this.f2537f > i2) {
            Object a2 = this.a.a();
            g.a.a.b.a.a(a2, "Argument must not be null");
            a<?> a3 = a(a2.getClass());
            this.f2537f -= a3.b() * a3.a(a2);
            c(a3.a(a2), a2.getClass());
            if (Log.isLoggable(a3.a(), 2)) {
                String a4 = a3.a();
                StringBuilder a5 = i.a.a.a.a.a("evicted: ");
                a5.append(a3.a(a2));
                Log.v(a4, a5.toString());
            }
        }
    }

    public synchronized void a() {
        b(0);
    }

    public synchronized void a(int i2) {
        if (i2 >= 40) {
            try {
                a();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i2 >= 20 || i2 == 15) {
            b(this.e / 2);
        }
    }

    public final <T> a<T> a(Class<T> cls) {
        a<T> aVar = this.d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                StringBuilder a2 = i.a.a.a.a.a("No array pool found for: ");
                a2.append(cls.getSimpleName());
                throw new IllegalArgumentException(a2.toString());
            }
            this.d.put(cls, aVar);
        }
        return aVar;
    }

    public final NavigableMap<Integer, Integer> b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }
}
