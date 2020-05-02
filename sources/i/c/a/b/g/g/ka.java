package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class ka implements ha {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3338b;
    public static final o1<Boolean> c;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        o1.a(u1Var, "measurement.id.lifecycle.app_in_background_parameter", 0);
        a = o1.a(u1Var, "measurement.lifecycle.app_backgrounded_engagement", false);
        f3338b = o1.a(u1Var, "measurement.lifecycle.app_backgrounded_tracking", true);
        c = o1.a(u1Var, "measurement.lifecycle.app_in_background_parameter", false);
        o1.a(u1Var, "measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean a() {
        return a.b().booleanValue();
    }

    public final boolean b() {
        return f3338b.b().booleanValue();
    }

    public final boolean c() {
        return c.b().booleanValue();
    }
}
