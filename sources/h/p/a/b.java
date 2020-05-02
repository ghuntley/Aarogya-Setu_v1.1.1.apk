package h.p.a;

import h.e.i;
import h.o.a0;
import h.o.b0;
import h.o.c0;
import h.o.l;
import h.o.r;
import h.o.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl */
public class b extends a {
    public final l a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2078b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends r<D> {

        /* renamed from: k  reason: collision with root package name */
        public l f2079k;

        /* renamed from: l  reason: collision with root package name */
        public C0060b<D> f2080l;

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            g.a.a.b.a.a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void a(s<? super D> sVar) {
            super.a(sVar);
            this.f2079k = null;
            this.f2080l = null;
        }

        public void b(D d) {
            super.b(d);
        }
    }

    /* renamed from: h.p.a.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    public static class C0060b<D> implements s<D> {
    }

    /* compiled from: LoaderManagerImpl */
    public static class c extends a0 {
        public static final b0.b d = new a();
        public i<a> c = new i<>(10);

        /* compiled from: LoaderManagerImpl */
        public static class a implements b0.b {
            public <T extends a0> T a(Class<T> cls) {
                return new c();
            }
        }

        public void b() {
            if (this.c.c() <= 0) {
                i<a> iVar = this.c;
                int i2 = iVar.f1574h;
                Object[] objArr = iVar.f1573g;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                iVar.f1574h = 0;
                iVar.e = false;
            } else if (this.c.d(0) != null) {
                throw null;
            } else {
                throw null;
            }
        }
    }

    public b(l lVar, c0 c0Var) {
        a0 a0Var;
        this.a = lVar;
        b0.b bVar = c.d;
        Class cls = c.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String b2 = i.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            a0 a0Var2 = c0Var.a.get(b2);
            if (!cls.isInstance(a0Var2)) {
                if (bVar instanceof b0.c) {
                    a0Var = ((b0.c) bVar).a(b2, cls);
                } else {
                    a0Var = bVar.a(cls);
                }
                a0Var2 = a0Var;
                a0 put = c0Var.a.put(b2, a0Var2);
                if (put != null) {
                    put.b();
                }
            } else if (bVar instanceof b0.e) {
                ((b0.e) bVar).a(a0Var2);
            }
            this.f2078b = (c) a0Var2;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f2078b;
        if (cVar.c.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (cVar.c.c() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.c.b(0));
                printWriter.print(": ");
                printWriter.println(cVar.c.d(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        g.a.a.b.a.a((Object) this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
