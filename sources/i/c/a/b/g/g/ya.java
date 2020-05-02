package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class ya implements za {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Double> f3542b;
    public static final o1<Long> c;
    public static final o1<Long> d;
    public static final o1<String> e;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.test.boolean_flag", false);
        f3542b = o1.a(u1Var, "measurement.test.double_flag");
        c = o1.a(u1Var, "measurement.test.int_flag", -2);
        d = o1.a(u1Var, "measurement.test.long_flag", -1);
        e = o1.a(u1Var, "measurement.test.string_flag", "---");
    }

    public final boolean a() {
        return a.b().booleanValue();
    }

    public final double b() {
        return f3542b.b().doubleValue();
    }

    public final long c() {
        return c.b().longValue();
    }

    public final long d() {
        return d.b().longValue();
    }

    public final String e() {
        return e.b();
    }
}
