package q.j0.a;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.i0;
import o.l0;
import q.e0;
import q.j;

/* compiled from: GsonConverterFactory */
public final class a extends j.a {
    public final Gson a;

    public a(Gson gson) {
        this.a = gson;
    }

    public j<l0, ?> a(Type type, Annotation[] annotationArr, e0 e0Var) {
        return new c(this.a, this.a.a(i.c.e.u.a.get(type)));
    }

    public j<?, i0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, e0 e0Var) {
        return new b(this.a, this.a.a(i.c.e.u.a.get(type)));
    }
}
