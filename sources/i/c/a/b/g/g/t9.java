package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class t9 implements u9 {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3460b;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.collection.efficient_engagement_reporting_enabled_2", false);
        f3460b = o1.a(u1Var, "measurement.collection.redundant_engagement_removal_enabled", false);
        o1.a(u1Var, "measurement.id.collection.efficient_engagement_reporting_enabled_2", 0);
    }

    public final boolean a() {
        return a.b().booleanValue();
    }

    public final boolean b() {
        return f3460b.b().booleanValue();
    }
}
