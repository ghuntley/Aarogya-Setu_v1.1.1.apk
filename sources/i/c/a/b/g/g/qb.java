package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class qb implements mb {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3410b;
    public static final o1<Boolean> c;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.service.sessions.remove_disabled_session_number", true);
        f3410b = o1.a(u1Var, "measurement.service.sessions.session_number_enabled", true);
        c = o1.a(u1Var, "measurement.service.sessions.session_number_backfill_enabled", true);
    }

    public final boolean a() {
        return a.b().booleanValue();
    }

    public final boolean b() {
        return f3410b.b().booleanValue();
    }

    public final boolean c() {
        return c.b().booleanValue();
    }
}
