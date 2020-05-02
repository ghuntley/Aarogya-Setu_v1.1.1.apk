package i.c.a.b.g.g;

import i.c.a.b.g.g.t0;
import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class s0 extends w3<s0, a> implements g5 {
    public static final s0 zzd;
    public static volatile m5<s0> zze;
    public d4<t0> zzc = s5.f3444h;

    static {
        s0 s0Var = new s0();
        zzd = s0Var;
        w3.zzd.put(s0.class, s0Var);
    }

    public static /* synthetic */ void a(s0 s0Var, t0 t0Var) {
        if (s0Var != null) {
            t0Var.getClass();
            if (!s0Var.zzc.a()) {
                s0Var.zzc = w3.a(s0Var.zzc);
            }
            s0Var.zzc.add(t0Var);
            return;
        }
        throw null;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<s0, a> implements g5 {
        public a() {
            super(s0.zzd);
        }

        public final a a(t0.a aVar) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            s0.a((s0) this.f3512f, (t0) ((w3) aVar.k()));
            return this;
        }

        public /* synthetic */ a(y0 y0Var) {
            super(s0.zzd);
        }
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new s0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", t0.class});
            case 4:
                return zzd;
            case 5:
                m5<s0> m5Var = zze;
                if (m5Var == null) {
                    synchronized (s0.class) {
                        m5Var = zze;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzd);
                            zze = m5Var;
                        }
                    }
                }
                return m5Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
