package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class g8 implements d8 {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3294b;
    public static final o1<Boolean> c;
    public static final o1<Boolean> d;
    public static final o1<Boolean> e;

    /* renamed from: f  reason: collision with root package name */
    public static final o1<Boolean> f3295f;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.gold.enhanced_ecommerce.format_logs", false);
        o1.a(u1Var, "measurement.id.gold.enhanced_ecommerce.service", 0);
        f3294b = o1.a(u1Var, "measurement.gold.enhanced_ecommerce.log_nested_complex_events", false);
        c = o1.a(u1Var, "measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false);
        d = o1.a(u1Var, "measurement.gold.enhanced_ecommerce.updated_schema.client", false);
        e = o1.a(u1Var, "measurement.gold.enhanced_ecommerce.updated_schema.service", false);
        f3295f = o1.a(u1Var, "measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.b().booleanValue();
    }

    public final boolean c() {
        return f3294b.b().booleanValue();
    }

    public final boolean d() {
        return c.b().booleanValue();
    }

    public final boolean e() {
        return d.b().booleanValue();
    }

    public final boolean f() {
        return e.b().booleanValue();
    }

    public final boolean g() {
        return f3295f.b().booleanValue();
    }
}
