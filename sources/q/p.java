package q;

import f.a.e;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import n.m.c.f;
import retrofit2.HttpException;

/* compiled from: KotlinExtensions.kt */
public final class p implements f<T> {
    public final /* synthetic */ e a;

    public p(e eVar) {
        this.a = eVar;
    }

    public void a(d<T> dVar, d0<T> d0Var) {
        if (dVar == null) {
            f.a("call");
            throw null;
        } else if (d0Var == null) {
            f.a("response");
            throw null;
        } else if (d0Var.a()) {
            T t = d0Var.f5713b;
            if (t == null) {
                Class<m> cls = m.class;
                m cast = cls.cast(dVar.m().e.get(cls));
                if (cast != null) {
                    f.a((Object) cast, "call.request().tag(Invocation::class.java)!!");
                    Method method = cast.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    f.a((Object) method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    f.a((Object) declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    this.a.a(i.c.d.p.e.a((Throwable) new KotlinNullPointerException(sb.toString())));
                    return;
                }
                f.a();
                throw null;
            }
            this.a.a(t);
        } else {
            this.a.a(i.c.d.p.e.a((Throwable) new HttpException(d0Var)));
        }
    }

    public void a(d<T> dVar, Throwable th) {
        if (dVar == null) {
            f.a("call");
            throw null;
        } else if (th != null) {
            this.a.a(i.c.d.p.e.a(th));
        } else {
            f.a("t");
            throw null;
        }
    }
}
