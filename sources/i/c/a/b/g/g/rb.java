package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class rb implements sb {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3427b;
    public static final o1<Boolean> c;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.client.sessions.background_sessions_enabled", true);
        o1.a(u1Var, "measurement.client.sessions.immediate_start_enabled_foreground", true);
        f3427b = o1.a(u1Var, "measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c = o1.a(u1Var, "measurement.client.sessions.session_id_enabled", true);
    }

    public final boolean a() {
        return a.b().booleanValue();
    }

    public final boolean b() {
        return f3427b.b().booleanValue();
    }

    public final boolean c() {
        return c.b().booleanValue();
    }
}
