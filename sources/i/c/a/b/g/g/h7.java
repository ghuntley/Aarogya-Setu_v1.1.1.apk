package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class h7 implements e7 {
    public static final o1<Boolean> a;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.androidId.delete_feature", true);
        o1.a(u1Var, "measurement.log_androidId_enabled", false);
    }

    public final boolean a() {
        return a.b().booleanValue();
    }
}
