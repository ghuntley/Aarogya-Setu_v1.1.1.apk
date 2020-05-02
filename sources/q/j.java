package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.i0;
import o.l0;

/* compiled from: Converter */
public interface j<F, T> {

    /* compiled from: Converter */
    public static abstract class a {
        @Nullable
        public j<l0, ?> a(Type type, Annotation[] annotationArr, e0 e0Var) {
            return null;
        }

        @Nullable
        public j<?, i0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, e0 e0Var) {
            return null;
        }
    }

    @Nullable
    T a(F f2);
}
