package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class la implements na {
    public static final o1<Long> a;

    static {
        u1 u1Var = new u1(p1.a("com.google.android.gms.measurement"));
        o1.a(u1Var, "measurement.id.max_bundles_per_iteration", 0);
        a = o1.a(u1Var, "measurement.max_bundles_per_iteration", 1);
    }

    public final boolean a() {
        return true;
    }

    public final long b() {
        return a.b().longValue();
    }
}
