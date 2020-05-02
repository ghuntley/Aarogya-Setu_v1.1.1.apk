package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: CallAdapter */
public interface e<R, T> {

    /* compiled from: CallAdapter */
    public static abstract class a {
        @Nullable
        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, e0 e0Var);
    }

    T a(d<R> dVar);

    Type a();
}
