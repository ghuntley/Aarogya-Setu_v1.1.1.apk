package q;

import i.a.a.a.a;
import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl */
public final class h0 implements g0 {
    public static final g0 a = new h0();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (i0.a(annotationArr, (Class<? extends Annotation>) g0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return g0.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof g0;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder a2 = a.a("@");
        a2.append(g0.class.getName());
        a2.append("()");
        return a2.toString();
    }
}
