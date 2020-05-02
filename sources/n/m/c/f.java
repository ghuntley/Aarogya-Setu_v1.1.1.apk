package n.m.c;

import i.a.a.a.a;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics */
public class f {
    public static void a() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        a(kotlinNullPointerException);
        throw kotlinNullPointerException;
    }

    public static void b(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(a.a("lateinit property ", str, " has not been initialized"));
        a(uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a.b(str, " must not be null"));
            a(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        a(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T extends Throwable> T a(T t) {
        String name = f.class.getName();
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (name.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }
}
