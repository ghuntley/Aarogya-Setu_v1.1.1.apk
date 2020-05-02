package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class b8 implements c8 {
    public static final o1<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Boolean> f3226b;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        a = o1.a(u1Var, "measurement.sdk.dynamite.allow_remote_dynamite", false);
        o1.a(u1Var, "measurement.collection.init_params_control_enabled", true);
        f3226b = o1.a(u1Var, "measurement.sdk.dynamite.use_dynamite3", false);
        o1.a(u1Var, "measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean a() {
        return a.b().booleanValue();
    }

    public final boolean b() {
        return f3226b.b().booleanValue();
    }
}
