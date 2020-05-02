package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class e0 extends w3<e0, a> implements g5 {
    public static final e0 zzj;
    public static volatile m5<e0> zzk;
    public int zzc;
    public int zzd;
    public String zze = "";
    public c0 zzf;
    public boolean zzg;
    public boolean zzh;
    public boolean zzi;

    static {
        e0 e0Var = new e0();
        zzj = e0Var;
        w3.zzd.put(e0.class, e0Var);
    }

    public final boolean a() {
        return (this.zzc & 1) != 0;
    }

    public final int k() {
        return this.zzd;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<e0, a> implements g5 {
        public a() {
            super(e0.zzj);
        }

        public /* synthetic */ a(g0 g0Var) {
            super(e0.zzj);
        }
    }

    public static /* synthetic */ void a(e0 e0Var, String str) {
        if (e0Var != null) {
            str.getClass();
            e0Var.zzc |= 2;
            e0Var.zze = str;
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (g0.a[i2 - 1]) {
            case 1:
                return new e0();
            case 2:
                return new a((g0) null);
            case 3:
                return new r5(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                m5<e0> m5Var = zzk;
                if (m5Var == null) {
                    synchronized (e0.class) {
                        m5Var = zzk;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzj);
                            zzk = m5Var;
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
