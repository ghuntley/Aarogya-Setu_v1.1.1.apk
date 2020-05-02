package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class u4 implements c5 {
    public c5[] a;

    public u4(c5... c5VarArr) {
        this.a = c5VarArr;
    }

    public final d5 a(Class<?> cls) {
        for (c5 c5Var : this.a) {
            if (c5Var.b(cls)) {
                return c5Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class<?> cls) {
        for (c5 b2 : this.a) {
            if (b2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
