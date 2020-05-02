package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class a0 extends w3<a0, a> implements g5 {
    public static final a0 zzi;
    public static volatile m5<a0> zzj;
    public int zzc;
    public int zzd;
    public d4<e0> zze;
    public d4<b0> zzf;
    public boolean zzg;
    public boolean zzh;

    static {
        a0 a0Var = new a0();
        zzi = a0Var;
        w3.zzd.put(a0.class, a0Var);
    }

    public a0() {
        s5<Object> s5Var = s5.f3444h;
        this.zze = s5Var;
        this.zzf = s5Var;
    }

    public static /* synthetic */ void a(a0 a0Var, int i2, e0 e0Var) {
        if (a0Var != null) {
            e0Var.getClass();
            if (!a0Var.zze.a()) {
                a0Var.zze = w3.a(a0Var.zze);
            }
            a0Var.zze.set(i2, e0Var);
            return;
        }
        throw null;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<a0, a> implements g5 {
        public a() {
            super(a0.zzi);
        }

        public /* synthetic */ a(g0 g0Var) {
            super(a0.zzi);
        }
    }

    public static /* synthetic */ void a(a0 a0Var, int i2, b0 b0Var) {
        if (a0Var != null) {
            b0Var.getClass();
            if (!a0Var.zzf.a()) {
                a0Var.zzf = w3.a(a0Var.zzf);
            }
            a0Var.zzf.set(i2, b0Var);
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (g0.a[i2 - 1]) {
            case 1:
                return new a0();
            case 2:
                return new a((g0) null);
            case 3:
                return new r5(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", e0.class, "zzf", b0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                m5<a0> m5Var = zzj;
                if (m5Var == null) {
                    synchronized (a0.class) {
                        m5Var = zzj;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzi);
                            zzj = m5Var;
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
