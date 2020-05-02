package n.m.c;

/* compiled from: Lambda.kt */
public abstract class g<R> implements Object<R> {
    public g(int i2) {
    }

    public String toString() {
        if (k.a != null) {
            String obj = getClass().getGenericInterfaces()[0].toString();
            if (obj.startsWith("kotlin.jvm.functions.")) {
                obj = obj.substring(21);
            }
            f.a((Object) obj, "Reflection.renderLambdaToString(this)");
            return obj;
        }
        throw null;
    }
}
