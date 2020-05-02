package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class t8 implements q8 {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3459b;
    public static final o1<Boolean> c;
    public static final o1<Boolean> d;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f3459b = o1.a(u1Var, "measurement.audience.refresh_event_count_filters_timestamp", false);
        c = o1.a(u1Var, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = o1.a(u1Var, "measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.b().booleanValue();
    }

    public final boolean c() {
        return f3459b.b().booleanValue();
    }

    public final boolean d() {
        return c.b().booleanValue();
    }

    public final boolean e() {
        return d.b().booleanValue();
    }
}
