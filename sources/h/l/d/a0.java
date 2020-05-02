package h.l.d;

import androidx.fragment.app.Fragment;
import h.o.h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction */
public abstract class a0 {
    public ArrayList<a> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f1915b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1916f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1917g;

    /* renamed from: h  reason: collision with root package name */
    public String f1918h;

    /* renamed from: i  reason: collision with root package name */
    public int f1919i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1920j;

    /* renamed from: k  reason: collision with root package name */
    public int f1921k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1922l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<String> f1923m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f1924n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1925o = false;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<Runnable> f1926p;

    /* compiled from: FragmentTransaction */
    public static final class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f1927b;
        public int c;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1928f;

        /* renamed from: g  reason: collision with root package name */
        public h.b f1929g;

        /* renamed from: h  reason: collision with root package name */
        public h.b f1930h;

        public a() {
        }

        public a(int i2, Fragment fragment) {
            this.a = i2;
            this.f1927b = fragment;
            h.b bVar = h.b.RESUMED;
            this.f1929g = bVar;
            this.f1930h = bVar;
        }

        public a(int i2, Fragment fragment, h.b bVar) {
            this.a = i2;
            this.f1927b = fragment;
            this.f1929g = fragment.T;
            this.f1930h = bVar;
        }
    }

    public a0(n nVar, ClassLoader classLoader) {
    }

    public abstract int a();

    public void a(a aVar) {
        this.a.add(aVar);
        aVar.c = this.f1915b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f1928f = this.e;
    }

    public abstract void b();

    public void a(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder a2 = i.a.a.a.a.a("Fragment ");
            a2.append(cls.getCanonicalName());
            a2.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(a2.toString());
        }
        if (str != null) {
            String str2 = fragment.B;
            if (str2 == null || str.equals(str2)) {
                fragment.B = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.B + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.z;
                if (i4 == 0 || i4 == i2) {
                    fragment.z = i2;
                    fragment.A = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.z + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        a(new a(i3, fragment));
    }

    public a0 a(Fragment fragment) {
        a(new a(3, fragment));
        return this;
    }

    public a0 a(Fragment fragment, h.b bVar) {
        a(new a(10, fragment, bVar));
        return this;
    }
}
