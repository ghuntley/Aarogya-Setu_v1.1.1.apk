package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class ra implements oa {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3426b;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.personalized_ads_signals_collection_enabled", true);
        f3426b = o1.a(u1Var, "measurement.personalized_ads_property_translation_enabled", true);
    }

    public final boolean a() {
        return a.b().booleanValue();
    }

    public final boolean b() {
        return f3426b.b().booleanValue();
    }
}
