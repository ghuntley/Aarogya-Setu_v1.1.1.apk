package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class s9 implements p9 {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3449b;
    public static final o1<Boolean> c;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.client.sessions.check_on_reset_and_enable", false);
        f3449b = o1.a(u1Var, "measurement.client.sessions.check_on_startup", true);
        c = o1.a(u1Var, "measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.b().booleanValue();
    }

    public final boolean c() {
        return f3449b.b().booleanValue();
    }

    public final boolean d() {
        return c.b().booleanValue();
    }
}
