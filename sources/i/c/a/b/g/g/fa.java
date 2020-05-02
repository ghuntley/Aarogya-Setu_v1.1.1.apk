package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class fa implements ga {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3276b;
    public static final o1<Boolean> c;
    public static final o1<Boolean> d;
    public static final o1<Boolean> e;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.sdk.collection.enable_extend_user_property_size", true);
        f3276b = o1.a(u1Var, "measurement.sdk.collection.last_deep_link_referrer2", true);
        c = o1.a(u1Var, "measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = o1.a(u1Var, "measurement.sdk.collection.last_gclid_from_referrer2", false);
        e = o1.a(u1Var, "measurement.sdk.collection.worker_thread_referrer", true);
        o1.a(u1Var, "measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.b().booleanValue();
    }

    public final boolean c() {
        return f3276b.b().booleanValue();
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
}
