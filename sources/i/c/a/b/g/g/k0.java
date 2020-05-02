package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class k0 extends w3<k0, a> implements g5 {
    public static final k0 zzf;
    public static volatile m5<k0> zzg;
    public int zzc;
    public String zzd = "";
    public String zze = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<k0, a> implements g5 {
        public /* synthetic */ a(m0 m0Var) {
            super(k0.zzf);
        }
    }

    static {
        k0 k0Var = new k0();
        zzf = k0Var;
        w3.zzd.put(k0.class, k0Var);
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (m0.a[i2 - 1]) {
            case 1:
                return new k0();
            case 2:
                return new a((m0) null);
            case 3:
                return new r5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                m5<k0> m5Var = zzg;
                if (m5Var == null) {
                    synchronized (k0.class) {
                        m5Var = zzg;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzf);
                            zzg = m5Var;
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
