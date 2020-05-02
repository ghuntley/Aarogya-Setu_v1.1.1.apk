package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class n0 extends w3<n0, a> implements g5 {
    public static final n0 zzh;
    public static volatile m5<n0> zzi;
    public int zzc;
    public int zzd;
    public v0 zze;
    public v0 zzf;
    public boolean zzg;

    static {
        n0 n0Var = new n0();
        zzh = n0Var;
        w3.zzd.put(n0.class, n0Var);
    }

    public static /* synthetic */ void a(n0 n0Var, v0 v0Var) {
        if (n0Var != null) {
            v0Var.getClass();
            n0Var.zze = v0Var;
            n0Var.zzc |= 2;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(n0 n0Var, v0 v0Var) {
        if (n0Var != null) {
            v0Var.getClass();
            n0Var.zzf = v0Var;
            n0Var.zzc |= 4;
            return;
        }
        throw null;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<n0, a> implements g5 {
        public a() {
            super(n0.zzh);
        }

        public /* synthetic */ a(y0 y0Var) {
            super(n0.zzh);
        }
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new n0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                m5<n0> m5Var = zzi;
                if (m5Var == null) {
                    synchronized (n0.class) {
                        m5Var = zzi;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzh);
                            zzi = m5Var;
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
