package i.c.d.f;

import i.c.a.b.d.l.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class d<T> {
    public final Set<Class<? super T>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<q> f4658b;
    public final int c;
    public final int d;
    public final h<T> e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f4659f;

    public /* synthetic */ d(Set set, Set set2, int i2, int i3, h hVar, Set set3, a aVar) {
        this.a = Collections.unmodifiableSet(set);
        this.f4658b = Collections.unmodifiableSet(set2);
        this.c = i2;
        this.d = i3;
        this.e = hVar;
        this.f4659f = Collections.unmodifiableSet(set3);
    }

    public boolean a() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.f4658b.toArray()) + "}";
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0], (a) null);
    }

    @SafeVarargs
    public static <T> d<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        q.a(cls, "Null interface");
        hashSet.add(cls);
        for (Class<? super T> a2 : clsArr) {
            q.a(a2, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        b bVar = new b(t);
        q.a(bVar, "Null factory");
        if (1 != 0) {
            return new d(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, bVar, hashSet3, (a) null);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    public static class b<T> {
        public final Set<Class<? super T>> a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Set<q> f4660b = new HashSet();
        public int c;
        public int d;
        public h<T> e;

        /* renamed from: f  reason: collision with root package name */
        public Set<Class<?>> f4661f;

        public /* synthetic */ b(Class cls, Class[] clsArr, a aVar) {
            this.c = 0;
            this.d = 0;
            this.f4661f = new HashSet();
            q.a(cls, "Null interface");
            this.a.add(cls);
            for (Class a2 : clsArr) {
                q.a(a2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        public b<T> a(q qVar) {
            q.a(qVar, "Null dependency");
            if (!this.a.contains(qVar.a)) {
                this.f4660b.add(qVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> a(int i2) {
            if (this.c == 0) {
                this.c = i2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }

        public b<T> a(h<T> hVar) {
            q.a(hVar, "Null factory");
            this.e = hVar;
            return this;
        }

        public d<T> a() {
            if (this.e != null) {
                return new d(new HashSet(this.a), new HashSet(this.f4660b), this.c, this.d, this.e, this.f4661f, (a) null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }
    }
}
