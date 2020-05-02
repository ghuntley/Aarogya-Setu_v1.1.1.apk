package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import o.l0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import q.j;

@IgnoreJRERequirement
/* compiled from: OptionalConverterFactory */
public final class w extends j.a {
    public static final j.a a = new w();

    @IgnoreJRERequirement
    /* compiled from: OptionalConverterFactory */
    public static final class a<T> implements j<l0, Optional<T>> {
        public final j<l0, T> a;

        public a(j<l0, T> jVar) {
            this.a = jVar;
        }

        public Object a(Object obj) {
            return Optional.ofNullable(this.a.a((l0) obj));
        }
    }

    @Nullable
    public j<l0, ?> a(Type type, Annotation[] annotationArr, e0 e0Var) {
        if (i0.b(type) != Optional.class) {
            return null;
        }
        return new a(e0Var.b(i0.a(0, (ParameterizedType) type), annotationArr));
    }
}
