package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class kb implements lb {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3339b;
    public static final o1<Boolean> c;
    public static final o1<Boolean> d;
    public static final o1<Boolean> e;

    /* renamed from: f  reason: collision with root package name */
    public static final o1<Boolean> f3340f;

    /* renamed from: g  reason: collision with root package name */
    public static final o1<Boolean> f3341g;

    /* renamed from: h  reason: collision with root package name */
    public static final o1<Boolean> f3342h;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.service.audience.scoped_filters_v27", true);
        f3339b = o1.a(u1Var, "measurement.service.audience.session_scoped_user_engagement", true);
        c = o1.a(u1Var, "measurement.client.audience.scoped_engagement_removal_when_session_expired", true);
        d = o1.a(u1Var, "measurement.service.audience.scoped_engagement_removal_when_session_expired", true);
        e = o1.a(u1Var, "measurement.service.audience.session_scoped_event_aggregates", true);
        f3340f = o1.a(u1Var, "measurement.service.audience.use_bundle_timestamp_for_property_filters", true);
        o1.a(u1Var, "measurement.id.scoped_audience_filters", 0);
        f3341g = o1.a(u1Var, "measurement.service.audience.fix_prepending_previous_sequence_timestamp", true);
        f3342h = o1.a(u1Var, "measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.b().booleanValue();
    }

    public final boolean c() {
        return f3339b.b().booleanValue();
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
        return f3340f.b().booleanValue();
    }

    public final boolean i() {
        return f3341g.b().booleanValue();
    }

    public final boolean m() {
        return f3342h.b().booleanValue();
    }
}
